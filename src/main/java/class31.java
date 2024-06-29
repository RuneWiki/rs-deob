import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JJRYTWDH")
public class class31 {

    @OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "Z")
    private boolean field959 = true;

    @OriginalMember(owner = "client!JJRYTWDH", name = "b", descriptor = "I")
    private int field960 = -648;

    @OriginalMember(owner = "client!JJRYTWDH", name = "c", descriptor = "Z")
    private boolean field961 = false;

    @OriginalMember(owner = "client!JJRYTWDH", name = "h", descriptor = "I")
    public int field966 = 65000;

    @OriginalMember(owner = "client!JJRYTWDH", name = "g", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!JJRYTWDH", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field963;

    @OriginalMember(owner = "client!JJRYTWDH", name = "f", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field964;

    @OriginalMember(owner = "client!JJRYTWDH", name = "d", descriptor = "[B")
    public static byte[] field962 = new byte[520];

    @OriginalMember(owner = "client!JJRYTWDH", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;ILjava/io/RandomAccessFile;ZI)V")
    public class31(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, boolean arg3, int arg4) {
        if (!arg3) {
            throw new NullPointerException();
        }
        this.field965 = arg4;
        this.field963 = arg2;
        this.field964 = arg0;
        this.field966 = arg1;
    }

    @OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method333(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field960 = -287;
        }
        try {
            this.method336(true, this.field964, arg0 * 6);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field964.read(field962, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field962[2] & 0xFF) + ((field962[0] & 0xFF) << 16) + ((field962[1] & 0xFF) << 8);
            int var6 = (field962[5] & 0xFF) + ((field962[3] & 0xFF) << 16) + ((field962[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field966) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field963.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method336(true, this.field963, var6 * 520);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field963.read(field962, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field962[0] & 0xFF) << 8) + (field962[1] & 0xFF);
                    int var14 = ((field962[2] & 0xFF) << 8) + (field962[3] & 0xFF);
                    int var15 = (field962[6] & 0xFF) + ((field962[4] & 0xFF) << 16) + ((field962[5] & 0xFF) << 8);
                    int var16 = field962[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field965 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field963.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field962[var17 + 8];
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

    @OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "(II[BI)Z")
    public synchronized boolean method334(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        boolean var6 = this.method335(true, arg3, arg0, 3, arg2);
        if (!var6) {
            var6 = this.method335(false, arg3, arg0, 3, arg2);
        }
        return var6;
    }

    @OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "(ZIII[B)Z")
    private synchronized boolean method335(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        if (arg3 != 3) {
            this.field961 = !this.field961;
        }
        try {
            int var8;
            if (arg0) {
                this.method336(true, this.field964, arg2 * 6);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field964.read(field962, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field962[5] & 0xFF) + ((field962[3] & 0xFF) << 16) + ((field962[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field963.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field963.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field962[0] = (byte) (arg1 >> 16);
            field962[1] = (byte) (arg1 >> 8);
            field962[2] = (byte) arg1;
            field962[3] = (byte) (var8 >> 16);
            field962[4] = (byte) (var8 >> 8);
            field962[5] = (byte) var8;
            this.method336(true, this.field964, arg2 * 6);
            this.field964.write(field962, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg1) {
                int var11 = 0;
                if (arg0) {
                    this.method336(true, this.field963, var8 * 520);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field963.read(field962, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field962[0] & 0xFF) << 8) + (field962[1] & 0xFF);
                            int var15 = ((field962[2] & 0xFF) << 8) + (field962[3] & 0xFF);
                            var11 = (field962[6] & 0xFF) + ((field962[4] & 0xFF) << 16) + ((field962[5] & 0xFF) << 8);
                            int var16 = field962[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field965 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field963.length() / 520L) {
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
                    var11 = (int) ((this.field963.length() + 519L) / 520L);
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
                field962[0] = (byte) (arg2 >> 8);
                field962[1] = (byte) arg2;
                field962[2] = (byte) (var10 >> 8);
                field962[3] = (byte) var10;
                field962[4] = (byte) (var11 >> 16);
                field962[5] = (byte) (var11 >> 8);
                field962[6] = (byte) var11;
                field962[7] = (byte) this.field965;
                this.method336(true, this.field963, var8 * 520);
                this.field963.write(field962, 0, 8);
                int var17 = arg1 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field963.write(arg4, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!JJRYTWDH", name = "a", descriptor = "(ZLjava/io/RandomAccessFile;I)V")
    public synchronized void method336(boolean arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg2 < 0 || arg2 > 62914560) {
            System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
            arg2 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var4) {
            }
        }
        arg1.seek((long) arg2);
        if (!arg0) {
            this.field959 = !this.field959;
        }
    }
}
