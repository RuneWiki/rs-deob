import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "b", descriptor = "Z")
    private boolean field850 = true;

    @OriginalMember(owner = "vb", name = "g", descriptor = "I")
    public int field855 = 65000;

    @OriginalMember(owner = "vb", name = "f", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field852;

    @OriginalMember(owner = "vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field853;

    @OriginalMember(owner = "vb", name = "c", descriptor = "[B")
    public static byte[] field851 = new byte[520];

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IILjava/io/RandomAccessFile;I)V")
    public FileStream(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3, int arg4) {
        this.field854 = arg2;
        if (arg4 != -16770) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field852 = arg0;
        this.field853 = arg3;
        this.field855 = arg1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZI)[B")
    public synchronized byte[] method291(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method294(arg1 * 6, this.field853, this.field850);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field853.read(field851, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field851[2] & 0xFF) + ((field851[0] & 0xFF) << 16) + ((field851[1] & 0xFF) << 8);
            int var7 = (field851[5] & 0xFF) + ((field851[3] & 0xFF) << 16) + ((field851[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field855) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field852.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method294(var7 * 520, this.field852, this.field850);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field852.read(field851, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field851[0] & 0xFF) << 8) + (field851[1] & 0xFF);
                    int var15 = ((field851[2] & 0xFF) << 8) + (field851[3] & 0xFF);
                    int var16 = (field851[6] & 0xFF) + ((field851[4] & 0xFF) << 16) + ((field851[5] & 0xFF) << 8);
                    int var17 = field851[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field854 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field852.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field851[var18 + 8];
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(III[B)Z")
    public synchronized boolean method292(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var5 = this.method293(arg3, arg0, arg1, true, (byte) 5);
        if (arg2 != 0) {
            this.field850 = !this.field850;
        }
        if (!var5) {
            var5 = this.method293(arg3, arg0, arg1, false, (byte) 5);
        }
        return var5;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIIZB)Z")
    private synchronized boolean method293(byte[] arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        if (arg4 != 5) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg3) {
                this.method294(arg2 * 6, this.field853, this.field850);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field853.read(field851, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field851[5] & 0xFF) + ((field851[3] & 0xFF) << 16) + ((field851[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field852.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field852.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field851[0] = (byte) (arg1 >> 16);
            field851[1] = (byte) (arg1 >> 8);
            field851[2] = (byte) arg1;
            field851[3] = (byte) (var8 >> 16);
            field851[4] = (byte) (var8 >> 8);
            field851[5] = (byte) var8;
            this.method294(arg2 * 6, this.field853, this.field850);
            this.field853.write(field851, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg3) {
                    this.method294(var8 * 520, this.field852, this.field850);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field852.read(field851, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field851[0] & 0xFF) << 8) + (field851[1] & 0xFF);
                            int var15 = ((field851[2] & 0xFF) << 8) + (field851[3] & 0xFF);
                            var11 = (field851[6] & 0xFF) + ((field851[4] & 0xFF) << 16) + ((field851[5] & 0xFF) << 8);
                            int var16 = field851[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field854 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field852.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg3 = false;
                    var11 = (int) ((this.field852.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg1 - var9 <= 512) {
                    var11 = 0;
                }
                field851[0] = (byte) (arg2 >> 8);
                field851[1] = (byte) arg2;
                field851[2] = (byte) (var10 >> 8);
                field851[3] = (byte) var10;
                field851[4] = (byte) (var11 >> 16);
                field851[5] = (byte) (var11 >> 8);
                field851[6] = (byte) var11;
                field851[7] = (byte) this.field854;
                this.method294(var8 * 520, this.field852, this.field850);
                this.field852.write(field851, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field852.write(arg0, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
    public synchronized void method294(int arg0, RandomAccessFile arg1, boolean arg2) throws IOException {
        if (!arg2) {
            this.field849 = 426;
        }
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg0);
    }
}
