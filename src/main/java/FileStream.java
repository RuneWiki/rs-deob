import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class FileStream {

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private int field844 = 37801;

    @OriginalMember(owner = "vb", name = "f", descriptor = "I")
    public int field849 = 65000;

    @OriginalMember(owner = "vb", name = "e", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field846;

    @OriginalMember(owner = "vb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field847;

    @OriginalMember(owner = "vb", name = "b", descriptor = "[B")
    public static byte[] field845 = new byte[520];

    @OriginalMember(owner = "vb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;II)V")
    public FileStream(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, int arg4) {
        this.field848 = arg3;
        this.field846 = arg2;
        if (arg4 != 0) {
            throw new NullPointerException();
        }
        this.field847 = arg1;
        this.field849 = arg0;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method286(int arg0, int arg1) {
        if (arg1 != -32477) {
            throw new NullPointerException();
        }
        try {
            this.method289(arg0 * 6, this.field847, true);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field847.read(field845, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field845[2] & 0xFF) + ((field845[0] & 0xFF) << 16) + ((field845[1] & 0xFF) << 8);
            int var6 = (field845[5] & 0xFF) + ((field845[3] & 0xFF) << 16) + ((field845[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field849) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field846.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method289(var6 * 520, this.field846, true);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field846.read(field845, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field845[0] & 0xFF) << 8) + (field845[1] & 0xFF);
                    int var14 = ((field845[2] & 0xFF) << 8) + (field845[3] & 0xFF);
                    int var15 = (field845[6] & 0xFF) + ((field845[4] & 0xFF) << 16) + ((field845[5] & 0xFF) << 8);
                    int var16 = field845[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field848 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field846.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field845[var17 + 8];
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "([BIII)Z")
    public synchronized boolean method287(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var5 = this.method288(arg2, arg0, arg1, true, 230);
        int var6 = 25 / arg3;
        if (!var5) {
            var5 = this.method288(arg2, arg0, arg1, false, 230);
        }
        return var5;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(I[BIZI)Z")
    private synchronized boolean method288(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        int var6 = 26 / arg4;
        try {
            int var9;
            if (arg3) {
                this.method289(arg2 * 6, this.field847, true);
                int var8;
                for (int var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.field847.read(field845, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var9 = (field845[5] & 0xFF) + ((field845[3] & 0xFF) << 16) + ((field845[4] & 0xFF) << 8);
                if (var9 <= 0 || (long) var9 > this.field846.length() / 520L) {
                    return false;
                }
            } else {
                var9 = (int) ((this.field846.length() + 519L) / 520L);
                if (var9 == 0) {
                    var9 = 1;
                }
            }
            field845[0] = (byte) (arg0 >> 16);
            field845[1] = (byte) (arg0 >> 8);
            field845[2] = (byte) arg0;
            field845[3] = (byte) (var9 >> 16);
            field845[4] = (byte) (var9 >> 8);
            field845[5] = (byte) var9;
            this.method289(arg2 * 6, this.field847, true);
            this.field847.write(field845, 0, 6);
            int var10 = 0;
            int var11 = 0;
            while (var10 < arg0) {
                int var12 = 0;
                if (arg3) {
                    this.method289(var9 * 520, this.field846, true);
                    int var13;
                    int var14;
                    for (var13 = 0; var13 < 8; var13 += var14) {
                        var14 = this.field846.read(field845, var13, 8 - var13);
                        if (var14 == -1) {
                            break;
                        }
                    }
                    if (var13 == 8) {
                        label108: {
                            int var15 = ((field845[0] & 0xFF) << 8) + (field845[1] & 0xFF);
                            int var16 = ((field845[2] & 0xFF) << 8) + (field845[3] & 0xFF);
                            var12 = (field845[6] & 0xFF) + ((field845[4] & 0xFF) << 16) + ((field845[5] & 0xFF) << 8);
                            int var17 = field845[7] & 0xFF;
                            if (arg2 == var15 && var11 == var16 && this.field848 == var17) {
                                if (var12 >= 0 && (long) var12 <= this.field846.length() / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var12 == 0) {
                    arg3 = false;
                    var12 = (int) ((this.field846.length() + 519L) / 520L);
                    if (var12 == 0) {
                        var12++;
                    }
                    if (var9 == var12) {
                        var12++;
                    }
                }
                if (arg0 - var10 <= 512) {
                    var12 = 0;
                }
                field845[0] = (byte) (arg2 >> 8);
                field845[1] = (byte) arg2;
                field845[2] = (byte) (var11 >> 8);
                field845[3] = (byte) var11;
                field845[4] = (byte) (var12 >> 16);
                field845[5] = (byte) (var12 >> 8);
                field845[6] = (byte) var12;
                field845[7] = (byte) this.field848;
                this.method289(var9 * 520, this.field846, true);
                this.field846.write(field845, 0, 8);
                int var18 = arg0 - var10;
                if (var18 > 512) {
                    var18 = 512;
                }
                this.field846.write(arg1, var10, var18);
                var10 += var18;
                var9 = var12;
                var11++;
            }
            return true;
        } catch (IOException var19) {
            return false;
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ILjava/io/RandomAccessFile;Z)V")
    public synchronized void method289(int arg0, RandomAccessFile arg1, boolean arg2) throws IOException {
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg0);
        if (!arg2) {
            this.field844 = 31;
        }
    }
}
