import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "a", descriptor = "Z")
    private boolean field846 = false;

    @OriginalMember(owner = "vb", name = "c", descriptor = "I")
    private int field848 = 887;

    @OriginalMember(owner = "vb", name = "h", descriptor = "I")
    public int field853 = 65000;

    @OriginalMember(owner = "vb", name = "g", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "vb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field850;

    @OriginalMember(owner = "vb", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field851;

    @OriginalMember(owner = "vb", name = "d", descriptor = "[B")
    public static byte[] field849 = new byte[520];

    @OriginalMember(owner = "vb", name = "b", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;IB)V")
    public FileStream(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3, byte arg4) {
        this.field852 = arg3;
        if (arg4 == 4) {
            boolean var6 = false;
        } else {
            this.field848 = -21;
        }
        this.field850 = arg0;
        this.field851 = arg2;
        this.field853 = arg1;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZI)[B")
    public synchronized byte[] method289(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        try {
            this.method292(this.field851, arg1 * 6, 0);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field851.read(field849, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field849[2] & 0xFF) + ((field849[0] & 0xFF) << 16) + ((field849[1] & 0xFF) << 8);
            int var6 = (field849[5] & 0xFF) + ((field849[3] & 0xFF) << 16) + ((field849[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field853) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field850.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method292(this.field850, var6 * 520, 0);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field850.read(field849, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field849[0] & 0xFF) << 8) + (field849[1] & 0xFF);
                    int var14 = ((field849[2] & 0xFF) << 8) + (field849[3] & 0xFF);
                    int var15 = (field849[6] & 0xFF) + ((field849[4] & 0xFF) << 16) + ((field849[5] & 0xFF) << 8);
                    int var16 = field849[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field852 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field850.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field849[var17 + 8];
                            }
                            var6 = var15;
                            var9++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var7;
            } else {
                return null;
            }
        } catch (IOException var18) {
            return null;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BBII)Z")
    public synchronized boolean method290(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 4) {
            this.field848 = 436;
        }
        boolean var5 = this.method291(true, arg2, this.field847, arg3, arg0);
        if (!var5) {
            var5 = this.method291(false, arg2, this.field847, arg3, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZIII[B)Z")
    private synchronized boolean method291(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        if (arg2 != 0) {
            this.field846 = !this.field846;
        }
        try {
            int var8;
            if (arg0) {
                this.method292(this.field851, arg3 * 6, 0);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field851.read(field849, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field849[5] & 0xFF) + ((field849[3] & 0xFF) << 16) + ((field849[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field850.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field850.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field849[0] = (byte) (arg1 >> 16);
            field849[1] = (byte) (arg1 >> 8);
            field849[2] = (byte) arg1;
            field849[3] = (byte) (var8 >> 16);
            field849[4] = (byte) (var8 >> 8);
            field849[5] = (byte) var8;
            this.method292(this.field851, arg3 * 6, 0);
            this.field851.write(field849, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg0) {
                    this.method292(this.field850, var8 * 520, 0);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field850.read(field849, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field849[0] & 0xFF) << 8) + (field849[1] & 0xFF);
                            int var15 = ((field849[2] & 0xFF) << 8) + (field849[3] & 0xFF);
                            var11 = (field849[6] & 0xFF) + ((field849[4] & 0xFF) << 16) + ((field849[5] & 0xFF) << 8);
                            int var16 = field849[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field852 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field850.length() / 520L) {
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
                    var11 = (int) ((this.field850.length() + 519L) / 520L);
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
                field849[0] = (byte) (arg3 >> 8);
                field849[1] = (byte) arg3;
                field849[2] = (byte) (var10 >> 8);
                field849[3] = (byte) var10;
                field849[4] = (byte) (var11 >> 16);
                field849[5] = (byte) (var11 >> 8);
                field849[6] = (byte) var11;
                field849[7] = (byte) this.field852;
                this.method292(this.field850, var8 * 520, 0);
                this.field850.write(field849, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field850.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method292(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg2 != 0) {
            this.field846 = !this.field846;
        }
        if (arg1 < 0 || arg1 > 62914560) {
            System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
            arg1 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg1);
    }
}
