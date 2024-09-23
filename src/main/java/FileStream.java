import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class FileStream {

    @OriginalMember(owner = "wb", name = "a", descriptor = "Z")
    private boolean field834 = true;

    @OriginalMember(owner = "wb", name = "f", descriptor = "I")
    public int field839 = 65000;

    @OriginalMember(owner = "wb", name = "e", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "wb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field836;

    @OriginalMember(owner = "wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field837;

    @OriginalMember(owner = "wb", name = "b", descriptor = "[B")
    public static byte[] field835 = new byte[520];

    @OriginalMember(owner = "wb", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;ILjava/io/RandomAccessFile;B)V")
    public FileStream(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3, byte arg4) {
        this.field838 = arg2;
        this.field836 = arg1;
        this.field837 = arg3;
        if (arg4 != 4) {
            this.field834 = !this.field834;
        }
        this.field839 = arg0;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method291(int arg0, int arg1) {
        if (arg0 != 3251) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            this.method294(this.field837, false, arg1 * 6);
            int var5;
            for (int var4 = 0; var4 < 6; var4 += var5) {
                var5 = this.field837.read(field835, var4, 6 - var4);
                if (var5 == -1) {
                    return null;
                }
            }
            int var6 = (field835[2] & 0xFF) + ((field835[0] & 0xFF) << 16) + ((field835[1] & 0xFF) << 8);
            int var7 = (field835[5] & 0xFF) + ((field835[3] & 0xFF) << 16) + ((field835[4] & 0xFF) << 8);
            if (var6 < 0 || var6 > this.field839) {
                return null;
            } else if (var7 > 0 && (long) var7 <= this.field836.length() / 520L) {
                byte[] var8 = new byte[var6];
                int var9 = 0;
                int var10 = 0;
                while (var9 < var6) {
                    if (var7 == 0) {
                        return null;
                    }
                    this.method294(this.field836, false, var7 * 520);
                    int var11 = 0;
                    int var12 = var6 - var9;
                    if (var12 > 512) {
                        var12 = 512;
                    }
                    while (var11 < var12 + 8) {
                        int var13 = this.field836.read(field835, var11, var12 + 8 - var11);
                        if (var13 == -1) {
                            return null;
                        }
                        var11 += var13;
                    }
                    int var14 = ((field835[0] & 0xFF) << 8) + (field835[1] & 0xFF);
                    int var15 = ((field835[2] & 0xFF) << 8) + (field835[3] & 0xFF);
                    int var16 = (field835[6] & 0xFF) + ((field835[4] & 0xFF) << 16) + ((field835[5] & 0xFF) << 8);
                    int var17 = field835[7] & 0xFF;
                    if (arg1 == var14 && var10 == var15 && this.field838 == var17) {
                        if (var16 >= 0 && (long) var16 <= this.field836.length() / 520L) {
                            for (int var18 = 0; var18 < var12; var18++) {
                                var8[var9++] = field835[var18 + 8];
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

    @OriginalMember(owner = "wb", name = "a", descriptor = "(II[BB)Z")
    public synchronized boolean method292(int arg0, int arg1, byte[] arg2, byte arg3) {
        boolean var5 = this.method293(true, arg2, arg1, arg0, 0);
        if (arg3 != -83) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method293(false, arg2, arg1, arg0, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Z[BIII)Z")
    private synchronized boolean method293(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg0) {
                this.method294(this.field837, false, arg3 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field837.read(field835, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field835[5] & 0xFF) + ((field835[3] & 0xFF) << 16) + ((field835[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field836.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field836.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field835[0] = (byte) (arg2 >> 16);
            field835[1] = (byte) (arg2 >> 8);
            field835[2] = (byte) arg2;
            field835[3] = (byte) (var8 >> 16);
            field835[4] = (byte) (var8 >> 8);
            field835[5] = (byte) var8;
            this.method294(this.field837, false, arg3 * 6);
            this.field837.write(field835, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg2) {
                int var11 = 0;
                if (arg0) {
                    this.method294(this.field836, false, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field836.read(field835, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field835[0] & 0xFF) << 8) + (field835[1] & 0xFF);
                            int var15 = ((field835[2] & 0xFF) << 8) + (field835[3] & 0xFF);
                            var11 = (field835[6] & 0xFF) + ((field835[4] & 0xFF) << 16) + ((field835[5] & 0xFF) << 8);
                            int var16 = field835[7] & 0xFF;
                            if (arg3 == var14 && var10 == var15 && this.field838 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field836.length() / 520L) {
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
                    var11 = (int) ((this.field836.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg2 - var9 <= 512) {
                    var11 = 0;
                }
                field835[0] = (byte) (arg3 >> 8);
                field835[1] = (byte) arg3;
                field835[2] = (byte) (var10 >> 8);
                field835[3] = (byte) var10;
                field835[4] = (byte) (var11 >> 16);
                field835[5] = (byte) (var11 >> 8);
                field835[6] = (byte) var11;
                field835[7] = (byte) this.field838;
                this.method294(this.field836, false, var8 * 520);
                this.field836.write(field835, 0, 8);
                int var17 = arg2 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field836.write(arg1, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;ZI)V")
    public synchronized void method294(RandomAccessFile arg0, boolean arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg0.seek((long) arg2);
        if (!arg1) {
            ;
        }
    }
}
