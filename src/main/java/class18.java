import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GINAMIRO")
public class class18 {

    @OriginalMember(owner = "GINAMIRO", name = "a", descriptor = "I")
    private int field879 = 791;

    @OriginalMember(owner = "GINAMIRO", name = "f", descriptor = "I")
    public int field884 = 65000;

    @OriginalMember(owner = "GINAMIRO", name = "e", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "GINAMIRO", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field881;

    @OriginalMember(owner = "GINAMIRO", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field882;

    @OriginalMember(owner = "GINAMIRO", name = "b", descriptor = "[B")
    public static byte[] field880 = new byte[520];

    @OriginalMember(owner = "GINAMIRO", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
    public class18(RandomAccessFile arg0, int arg1, int arg2, int arg3, RandomAccessFile arg4) {
        this.field883 = arg3;
        this.field881 = arg0;
        this.field882 = arg4;
        this.field884 = arg2;
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "GINAMIRO", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method310(int arg0, int arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        try {
            this.method313(arg0 * 6, (byte) 7, this.field882);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field882.read(field880, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field880[2] & 0xFF) + ((field880[0] & 0xFF) << 16) + ((field880[1] & 0xFF) << 8);
            int var6 = (field880[5] & 0xFF) + ((field880[3] & 0xFF) << 16) + ((field880[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field884) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field881.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method313(var6 * 520, (byte) 7, this.field881);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field881.read(field880, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field880[0] & 0xFF) << 8) + (field880[1] & 0xFF);
                    int var14 = ((field880[2] & 0xFF) << 8) + (field880[3] & 0xFF);
                    int var15 = (field880[6] & 0xFF) + ((field880[4] & 0xFF) << 16) + ((field880[5] & 0xFF) << 8);
                    int var16 = field880[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field883 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field881.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field880[var17 + 8];
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

    @OriginalMember(owner = "GINAMIRO", name = "a", descriptor = "(BII[B)Z")
    public synchronized boolean method311(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != -39) {
            throw new NullPointerException();
        }
        boolean var5 = this.method312(arg3, this.field879, arg1, arg2, true);
        if (!var5) {
            var5 = this.method312(arg3, this.field879, arg1, arg2, false);
        }
        return var5;
    }

    @OriginalMember(owner = "GINAMIRO", name = "a", descriptor = "([BIIIZ)Z")
    private synchronized boolean method312(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        try {
            int var8;
            if (arg4) {
                this.method313(arg2 * 6, (byte) 7, this.field882);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field882.read(field880, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field880[5] & 0xFF) + ((field880[3] & 0xFF) << 16) + ((field880[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field881.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field881.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field880[0] = (byte) (arg3 >> 16);
            field880[1] = (byte) (arg3 >> 8);
            field880[2] = (byte) arg3;
            field880[3] = (byte) (var8 >> 16);
            field880[4] = (byte) (var8 >> 8);
            field880[5] = (byte) var8;
            this.method313(arg2 * 6, (byte) 7, this.field882);
            this.field882.write(field880, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg3) {
                int var11 = 0;
                if (arg4) {
                    this.method313(var8 * 520, (byte) 7, this.field881);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field881.read(field880, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label110: {
                            int var14 = ((field880[0] & 0xFF) << 8) + (field880[1] & 0xFF);
                            int var15 = ((field880[2] & 0xFF) << 8) + (field880[3] & 0xFF);
                            var11 = (field880[6] & 0xFF) + ((field880[4] & 0xFF) << 16) + ((field880[5] & 0xFF) << 8);
                            int var16 = field880[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field883 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field881.length() / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg4 = false;
                    var11 = (int) ((this.field881.length() + 519L) / 520L);
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
                field880[0] = (byte) (arg2 >> 8);
                field880[1] = (byte) arg2;
                field880[2] = (byte) (var10 >> 8);
                field880[3] = (byte) var10;
                field880[4] = (byte) (var11 >> 16);
                field880[5] = (byte) (var11 >> 8);
                field880[6] = (byte) var11;
                field880[7] = (byte) this.field883;
                this.method313(var8 * 520, (byte) 7, this.field881);
                this.field881.write(field880, 0, 8);
                int var17 = arg3 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field881.write(arg0, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "GINAMIRO", name = "a", descriptor = "(IBLjava/io/RandomAccessFile;)V")
    public synchronized void method313(int arg0, byte arg1, RandomAccessFile arg2) throws IOException {
        if (arg1 != 7) {
            return;
        }
        boolean var4 = false;
        if (arg0 < 0 || arg0 > 62914560) {
            System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
            arg0 = 62914560;
            try {
                Thread.sleep(1000L);
            } catch (Exception var5) {
            }
        }
        arg2.seek((long) arg0);
    }
}
