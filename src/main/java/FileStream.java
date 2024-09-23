import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class FileStream {

    @OriginalMember(owner = "wb", name = "a", descriptor = "I")
    private int field847 = 880;

    @OriginalMember(owner = "wb", name = "b", descriptor = "I")
    private int field848 = -96;

    @OriginalMember(owner = "wb", name = "c", descriptor = "Z")
    private boolean field849 = true;

    @OriginalMember(owner = "wb", name = "d", descriptor = "Z")
    private boolean field850 = false;

    @OriginalMember(owner = "wb", name = "i", descriptor = "I")
    public int field855 = 65000;

    @OriginalMember(owner = "wb", name = "h", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "wb", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field852;

    @OriginalMember(owner = "wb", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field853;

    @OriginalMember(owner = "wb", name = "e", descriptor = "[B")
    public static byte[] field851 = new byte[520];

    @OriginalMember(owner = "wb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
    public FileStream(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field854 = arg4;
        if (arg0 != 34035) {
            throw new NullPointerException();
        }
        this.field852 = arg2;
        this.field853 = arg1;
        this.field855 = arg3;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method301(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field849 = !this.field849;
        }
        try {
            this.method304(this.field853, this.field847, arg1 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field853.read(field851, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field851[2] & 0xFF) + ((field851[0] & 0xFF) << 16) + ((field851[1] & 0xFF) << 8);
            int var6 = (field851[5] & 0xFF) + ((field851[3] & 0xFF) << 16) + ((field851[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field855) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field852.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method304(this.field852, this.field847, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field852.read(field851, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field851[0] & 0xFF) << 8) + (field851[1] & 0xFF);
                    int var14 = ((field851[2] & 0xFF) << 8) + (field851[3] & 0xFF);
                    int var15 = (field851[6] & 0xFF) + ((field851[4] & 0xFF) << 16) + ((field851[5] & 0xFF) << 8);
                    int var16 = field851[7] & 0xFF;
                    if (arg1 == var13 && var9 == var14 && this.field854 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field852.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field851[var17 + 8];
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

    @OriginalMember(owner = "wb", name = "a", descriptor = "([BZII)Z")
    public synchronized boolean method302(byte[] arg0, boolean arg1, int arg2, int arg3) {
        boolean var5 = this.method303(true, arg2, 0, arg3, arg0);
        if (!arg1) {
            this.field849 = !this.field849;
        }
        if (!var5) {
            var5 = this.method303(false, arg2, 0, arg3, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(ZIII[B)Z")
    private synchronized boolean method303(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        if (arg2 != 0) {
            this.field848 = 39;
        }
        try {
            int var8;
            if (arg0) {
                this.method304(this.field853, this.field847, arg1 * 6);
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
            field851[0] = (byte) (arg3 >> 16);
            field851[1] = (byte) (arg3 >> 8);
            field851[2] = (byte) arg3;
            field851[3] = (byte) (var8 >> 16);
            field851[4] = (byte) (var8 >> 8);
            field851[5] = (byte) var8;
            this.method304(this.field853, this.field847, arg1 * 6);
            this.field853.write(field851, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg3) {
                int var11 = 0;
                if (arg0) {
                    this.method304(this.field852, this.field847, var8 * 520);
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
                            if (arg1 == var14 && var10 == var15 && this.field854 == var16) {
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
                    arg0 = false;
                    var11 = (int) ((this.field852.length() + 519L) / 520L);
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
                field851[0] = (byte) (arg1 >> 8);
                field851[1] = (byte) arg1;
                field851[2] = (byte) (var10 >> 8);
                field851[3] = (byte) var10;
                field851[4] = (byte) (var11 >> 16);
                field851[5] = (byte) (var11 >> 8);
                field851[6] = (byte) var11;
                field851[7] = (byte) this.field854;
                this.method304(this.field852, this.field847, var8 * 520);
                this.field852.write(field851, 0, 8);
                int var17 = arg3 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field852.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void method304(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg1 <= 0) {
            this.field850 = !this.field850;
        }
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg2);
    }
}
