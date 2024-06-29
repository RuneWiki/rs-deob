import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ARIAIPRE")
public class class3 {

    @OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "I")
    private int field16 = 358;

    @OriginalMember(owner = "client!ARIAIPRE", name = "b", descriptor = "Z")
    private boolean field17 = false;

    @OriginalMember(owner = "client!ARIAIPRE", name = "c", descriptor = "B")
    private byte field18 = -9;

    @OriginalMember(owner = "client!ARIAIPRE", name = "e", descriptor = "Z")
    private boolean field20 = false;

    @OriginalMember(owner = "client!ARIAIPRE", name = "j", descriptor = "I")
    public int field25 = 65000;

    @OriginalMember(owner = "client!ARIAIPRE", name = "i", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!ARIAIPRE", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field22;

    @OriginalMember(owner = "client!ARIAIPRE", name = "h", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile field23;

    @OriginalMember(owner = "client!ARIAIPRE", name = "f", descriptor = "[B")
    public static byte[] field21 = new byte[520];

    @OriginalMember(owner = "client!ARIAIPRE", name = "d", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "client!ARIAIPRE", name = "<init>", descriptor = "(ZILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;I)V")
    public class3(boolean arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3, int arg4) {
        this.field24 = arg1;
        this.field22 = arg2;
        this.field23 = arg3;
        if (arg0) {
            throw new NullPointerException();
        }
        this.field25 = arg4;
    }

    @OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "(II)[B")
    public synchronized byte[] method8(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field20 = !this.field20;
        }
        try {
            this.method11(arg0 * 6, this.field23, 0);
            int var4;
            for (int var3 = 0; var3 < 6; var3 += var4) {
                var4 = this.field23.read(field21, var3, 6 - var3);
                if (var4 == -1) {
                    return null;
                }
            }
            int var5 = (field21[2] & 0xFF) + ((field21[0] & 0xFF) << 16) + ((field21[1] & 0xFF) << 8);
            int var6 = (field21[5] & 0xFF) + ((field21[3] & 0xFF) << 16) + ((field21[4] & 0xFF) << 8);
            if (var5 < 0 || var5 > this.field25) {
                return null;
            } else if (var6 > 0 && (long) var6 <= this.field22.length() / 520L) {
                byte[] var7 = new byte[var5];
                int var8 = 0;
                int var9 = 0;
                while (var8 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.method11(var6 * 520, this.field22, 0);
                    int var10 = 0;
                    int var11 = var5 - var8;
                    if (var11 > 512) {
                        var11 = 512;
                    }
                    while (var10 < var11 + 8) {
                        int var12 = this.field22.read(field21, var10, var11 + 8 - var10);
                        if (var12 == -1) {
                            return null;
                        }
                        var10 += var12;
                    }
                    int var13 = ((field21[0] & 0xFF) << 8) + (field21[1] & 0xFF);
                    int var14 = ((field21[2] & 0xFF) << 8) + (field21[3] & 0xFF);
                    int var15 = (field21[6] & 0xFF) + ((field21[4] & 0xFF) << 16) + ((field21[5] & 0xFF) << 8);
                    int var16 = field21[7] & 0xFF;
                    if (arg0 == var13 && var9 == var14 && this.field24 == var16) {
                        if (var15 >= 0 && (long) var15 <= this.field22.length() / 520L) {
                            for (int var17 = 0; var17 < var11; var17++) {
                                var7[var8++] = field21[var17 + 8];
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

    @OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "(B[BII)Z")
    public synchronized boolean method9(byte arg0, byte[] arg1, int arg2, int arg3) {
        boolean var5 = this.method10(arg1, true, arg3, this.field16, arg2);
        if (this.field18 != arg0) {
            throw new NullPointerException();
        }
        if (!var5) {
            var5 = this.method10(arg1, false, arg3, this.field16, arg2);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "([BZIII)Z")
    private synchronized boolean method10(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 0) {
            this.field17 = !this.field17;
        }
        try {
            int var8;
            if (arg1) {
                this.method11(arg2 * 6, this.field23, 0);
                int var7;
                for (int var6 = 0; var6 < 6; var6 += var7) {
                    var7 = this.field23.read(field21, var6, 6 - var6);
                    if (var7 == -1) {
                        return false;
                    }
                }
                var8 = (field21[5] & 0xFF) + ((field21[3] & 0xFF) << 16) + ((field21[4] & 0xFF) << 8);
                if (var8 <= 0 || (long) var8 > this.field22.length() / 520L) {
                    return false;
                }
            } else {
                var8 = (int) ((this.field22.length() + 519L) / 520L);
                if (var8 == 0) {
                    var8 = 1;
                }
            }
            field21[0] = (byte) (arg4 >> 16);
            field21[1] = (byte) (arg4 >> 8);
            field21[2] = (byte) arg4;
            field21[3] = (byte) (var8 >> 16);
            field21[4] = (byte) (var8 >> 8);
            field21[5] = (byte) var8;
            this.method11(arg2 * 6, this.field23, 0);
            this.field23.write(field21, 0, 6);
            int var9 = 0;
            int var10 = 0;
            while (var9 < arg4) {
                int var11 = 0;
                if (arg1) {
                    this.method11(var8 * 520, this.field22, 0);
                    int var12;
                    int var13;
                    for (var12 = 0; var12 < 8; var12 += var13) {
                        var13 = this.field22.read(field21, var12, 8 - var12);
                        if (var13 == -1) {
                            break;
                        }
                    }
                    if (var12 == 8) {
                        label117: {
                            int var14 = ((field21[0] & 0xFF) << 8) + (field21[1] & 0xFF);
                            int var15 = ((field21[2] & 0xFF) << 8) + (field21[3] & 0xFF);
                            var11 = (field21[6] & 0xFF) + ((field21[4] & 0xFF) << 16) + ((field21[5] & 0xFF) << 8);
                            int var16 = field21[7] & 0xFF;
                            if (arg2 == var14 && var10 == var15 && this.field24 == var16) {
                                if (var11 >= 0 && (long) var11 <= this.field22.length() / 520L) {
                                    break label117;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var11 == 0) {
                    arg1 = false;
                    var11 = (int) ((this.field22.length() + 519L) / 520L);
                    if (var11 == 0) {
                        var11++;
                    }
                    if (var8 == var11) {
                        var11++;
                    }
                }
                if (arg4 - var9 <= 512) {
                    var11 = 0;
                }
                field21[0] = (byte) (arg2 >> 8);
                field21[1] = (byte) arg2;
                field21[2] = (byte) (var10 >> 8);
                field21[3] = (byte) var10;
                field21[4] = (byte) (var11 >> 16);
                field21[5] = (byte) (var11 >> 8);
                field21[6] = (byte) var11;
                field21[7] = (byte) this.field24;
                this.method11(var8 * 520, this.field22, 0);
                this.field22.write(field21, 0, 8);
                int var17 = arg4 - var9;
                if (var17 > 512) {
                    var17 = 512;
                }
                this.field22.write(arg0, var9, var17);
                var9 += var17;
                var8 = var11;
                var10++;
            }
            return true;
        } catch (IOException var18) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ARIAIPRE", name = "a", descriptor = "(ILjava/io/RandomAccessFile;I)V")
    public synchronized void method11(int arg0, RandomAccessFile arg1, int arg2) throws IOException {
        if (arg2 != 0) {
            this.field19 = 356;
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
