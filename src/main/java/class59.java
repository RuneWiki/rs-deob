import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class59 {

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    private int field608 = 65000;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Lul;")
    private class523 field613 = null;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Lul;")
    private class523 field607 = null;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Lpr;")
    public static class407 field611 = new class407(78, 8);

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field619 = 0;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 4)
    public static void method395(byte arg0) {
        field611 = null;
        if (arg0 >= -61) {
            method395((byte) 33);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[BI)Z", line = 15)
    public final boolean method396(int arg0, int arg1, byte[] arg2, int arg3) {
        field616++;
        class523 var5 = this.field607;
        synchronized (this.field607) {
            if (arg3 > arg0 || this.field608 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method398(true, arg2, (byte) 5, arg1, arg0);
            if (!var6) {
                var6 = this.method398(false, arg2, (byte) 5, arg1, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIIII)V", line = 43)
    public static final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field620++;
        for (class411 var7 = (class411) class224.field2837.method93((byte) 122); var7 != null; var7 = (class411) class224.field2837.method92(0)) {
            if (var7.field5457 <= class469.field6549) {
                var7.method1374((byte) -117);
            } else {
                class73.method464(var7.field5453, arg3, arg4 >> 1, (var7.field5456 << 9) + 256, var7.field5448 * 2, arg2 >> 1, arg6, (byte) 67, (var7.field5455 << 9) + 256);
                class211.field2561.method1128(215, class377.field4913[0] + arg1, class377.field4913[1] + arg0, var7.field5454, var7.field5449 | 0xFF000000, 0);
            }
        }
        int var8 = -100 % ((-arg5 - 47) / 62);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z[BBII)Z", line = 69)
    private final boolean method398(boolean arg0, byte[] arg1, byte arg2, int arg3, int arg4) {
        field615++;
        class523 var6 = this.field607;
        synchronized (this.field607) {
            try {
                int var8;
                if (arg0) {
                    if (((long) (arg3 * 6 + 6)) > this.field613.method2984(true)) {
                        return false;
                    }
                    this.field613.method2985((long) (arg3 * 6), -126);
                    this.field613.method2979(class260.field3310, 6, (byte) 91, 0);
                    var8 = (class260.field3310[5] & 0xFF) + ((class260.field3310[4] & 0xFF) << 8) + ((class260.field3310[3] & 0xFF) << 16);
                    if (var8 <= 0 || (long) var8 > this.field607.method2984(true) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field607.method2984(true) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class260.field3310[0] = (byte) (arg4 >> 16);
                class260.field3310[5] = (byte) var8;
                class260.field3310[3] = (byte) (var8 >> 16);
                class260.field3310[4] = (byte) (var8 >> 8);
                class260.field3310[1] = (byte) (arg4 >> 8);
                class260.field3310[2] = (byte) arg4;
                this.field613.method2985((long) (arg3 * 6), -125);
                this.field613.method2987(6, class260.field3310, -1, 0);
                if (arg2 != 5) {
                    this.field607 = null;
                }
                int var10 = 0;
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label108: {
                            this.field607.method2985((long) (var8 * 520), -125);
                            try {
                                this.field607.method2979(class260.field3310, 8, (byte) 91, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class260.field3310[0] & 0xFF) << 8) + (class260.field3310[1] & 0xFF);
                            var12 = (class260.field3310[6] & 0xFF) + ((class260.field3310[5] & 0xFF) << 8) + ((class260.field3310[4] & 0xFF) << 16);
                            int var14 = (class260.field3310[2] & 0xFF << 8) + (class260.field3310[3] & 0xFF);
                            int var15 = class260.field3310[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field617 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field607.method2984(true) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field607.method2984(true) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class260.field3310[0] = (byte) (arg3 >> 8);
                    class260.field3310[3] = (byte) var11;
                    class260.field3310[2] = (byte) (var11 >> 8);
                    class260.field3310[1] = (byte) arg3;
                    class260.field3310[6] = (byte) var12;
                    class260.field3310[7] = (byte) this.field617;
                    class260.field3310[4] = (byte) (var12 >> 16);
                    class260.field3310[5] = (byte) (var12 >> 8);
                    this.field607.method2985((long) (var8 * 520), -126);
                    this.field607.method2987(8, class260.field3310, -1, 0);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field607.method2987(var18, arg1, -1, var10);
                    var8 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(ILul;Lul;I)V", line = 363)
    public class59(int arg0, class523 arg1, class523 arg2, int arg3) {
        this.field607 = arg1;
        this.field608 = arg3;
        this.field613 = arg2;
        this.field617 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)[B", line = 193)
    public final byte[] method399(int arg0, byte arg1) {
        field614++;
        class523 var3 = this.field607;
        synchronized (this.field607) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field613.method2984(true)) {
                    return null;
                }
                this.field613.method2985((long) (arg0 * 6), -124);
                this.field613.method2979(class260.field3310, 6, (byte) 91, 0);
                int var5 = ((class260.field3310[1] & 0xFF) << 8) + (class260.field3310[0] & 0xFF << 16) + (class260.field3310[2] & 0xFF);
                int var6 = (class260.field3310[4] & 0xFF << 8) + (class260.field3310[3] & 0xFF << 16) + (class260.field3310[5] & 0xFF);
                if (var5 < 0 || this.field608 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field607.method2984(true) / 520L) {
                    int var9 = 58 % ((-arg1 - 7) / 61);
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field607.method2985((long) (var6 * 520), -125);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field607.method2979(class260.field3310, var14 + 8, (byte) 91, 0);
                        int var15 = (class260.field3310[0] & 0xFF << 8) + (class260.field3310[1] & 0xFF);
                        int var16 = (class260.field3310[2] & 0xFF << 8) + (class260.field3310[3] & 0xFF);
                        int var17 = (class260.field3310[4] & 0xFF << 16) - (-(class260.field3310[5] & 0xFF << 8) - (class260.field3310[6] & 0xFF));
                        int var18 = class260.field3310[7] & 0xFF;
                        if (arg0 == var15 && var12 == var16 && this.field617 == var18) {
                            if (var17 >= 0 && this.field607.method2984(true) / 520L >= (long) var17) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class260.field3310[var21 + 8];
                                }
                                var12++;
                                var6 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I", line = 274)
    public static final int method400(int arg0, int arg1) {
        int var2 = -111 % ((62 - arg1) / 63);
        field618++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lag;I)I", line = 288)
    public static final int method401(class625 arg0, int arg1) {
        field609++;
        class23 var2 = arg0.field8855;
        if (var2.field229 != null) {
            var2 = var2.method108(0, class491.field7127);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field247;
        class468 var4 = arg0.method1653(1);
        if (arg1 < 30) {
            field611 = null;
        }
        if (arg0.field3779) {
            var3 = var2.field225;
        } else if (arg0.field3782 == var4.field6507 || arg0.field3782 == var4.field6504 || arg0.field3782 == var4.field6489 || arg0.field3782 == var4.field6520) {
            var3 = var2.field245;
        } else if (arg0.field3782 == var4.field6486 || arg0.field3782 == var4.field6485 || arg0.field3782 == var4.field6491 || arg0.field3782 == var4.field6523) {
            var3 = var2.field249;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "toString", descriptor = "()Ljava/lang/String;", line = 338)
    public final String toString() {
        field610++;
        return "Cache:" + this.field617;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([SIB)[S", line = 346)
    public static final short[] method402(short[] arg0, int arg1, byte arg2) {
        if (arg2 > -103) {
            field619 = 96;
        }
        field612++;
        short[] var3 = new short[arg1];
        class652.method3675(arg0, 0, var3, 0, arg1);
        return var3;
    }
}
