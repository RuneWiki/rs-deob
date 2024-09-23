import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private int field848 = 284;

    @OriginalMember(owner = "vb", name = "b", descriptor = "Z")
    private boolean field849 = true;

    @OriginalMember(owner = "vb", name = "g", descriptor = "I")
    public int field854 = 65000;

    @OriginalMember(owner = "vb", name = "f", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field851;

    @OriginalMember(owner = "vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field852;

    @OriginalMember(owner = "vb", name = "c", descriptor = "[B")
    public static byte[] field850 = new byte[520];

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(IILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;)V")
    public FileStream(int arg0, int arg1, RandomAccessFile arg2, int arg3, RandomAccessFile arg4) {
        this.field853 = arg3;
        this.field851 = arg4;
        this.field852 = arg2;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        this.field854 = arg1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IB)[B")
    public synchronized byte[] method287(int arg0, byte arg1) {
        if (arg1 != 81) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method290(115, this.field852, arg0 * 6);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field852.read(field850, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field850[2] & 0xFF) + ((field850[0] & 0xFF) << 16) + ((field850[1] & 0xFF) << 8);
            int var7 = (field850[5] & 0xFF) + ((field850[3] & 0xFF) << 16) + ((field850[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field854) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field851.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method290(115, this.field851, var7 * 520);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field851.read(field850, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field850[0] & 0xFF) << 8) + (field850[1] & 0xFF);
                    int var15 = ((field850[2] & 0xFF) << 8) + (field850[3] & 0xFF);
                    int var16 = (field850[6] & 0xFF) + ((field850[4] & 0xFF) << 16) + ((field850[5] & 0xFF) << 8);
                    int var17 = field850[7] & 0xFF;
                    if (arg0 == var14 && var10 == var15 && this.field853 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field851.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field850[var18 + 8];
                            }
                            var7 = var16;
                            var10++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var8;
            } else {
                return null;
            }
        } catch (IOException var19) {
            return null;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method288(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        boolean var5 = this.method289(true, false, arg2, arg3, arg0);
        if (!var5) {
            var5 = this.method289(false, false, arg2, arg3, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZZII[B)Z")
    private synchronized boolean method289(boolean arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        if (arg1) {
            this.field849 = !this.field849;
        }
        try {
            int var8;
            if (arg0) {
                this.method290(115, this.field852, arg2 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field852.read(field850, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field850[5] & 0xFF) + ((field850[3] & 0xFF) << 16) + ((field850[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field851.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field851.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field850[0] = (byte) (arg3 >> 16);
            field850[1] = (byte) (arg3 >> 8);
            field850[2] = (byte) arg3;
            field850[3] = (byte) (var8 >> 16);
            field850[4] = (byte) (var8 >> 8);
            field850[5] = (byte) var8;
            this.method290(115, this.field852, arg2 * 6);
            this.field852.write(field850, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg3) {
                int var11 = 0;
                if (arg0) {
                    this.method290(115, this.field851, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field851.read(field850, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field850[0] & 0xFF) << 8) + (field850[1] & 0xFF);
                            int var15 = ((field850[2] & 0xFF) << 8) + (field850[3] & 0xFF);
                            var11 = (field850[6] & 0xFF) + ((field850[4] & 0xFF) << 16) + ((field850[5] & 0xFF) << 8);
                            int var16 = field850[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field853 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field851.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg0 = false;
                    var11 = (int) ((this.field851.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg3 - var9 <= 512) {
                    var11 = 0;
                }
                field850[0] = (byte) (arg2 >> 8);
                field850[1] = (byte) arg2;
                field850[2] = (byte) (var10 >> 8);
                field850[3] = (byte) var10;
                field850[4] = (byte) (var11 >> 16);
                field850[5] = (byte) (var11 >> 8);
                field850[6] = (byte) var11;
                field850[7] = (byte) this.field853;
                this.method290(115, this.field851, var8 * 520);
                this.field851.write(field850, 0, 8);
                int var17 = arg3 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field851.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
    public synchronized void method290(int arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg1.seek((long) arg2);
    }
}
