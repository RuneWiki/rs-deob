import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class234 extends class288 {

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    private int field3723 = 4;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    private int field3726 = 4;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "[[B")
    public static byte[][] field3727;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BZ)C")
    public static final char method1543(byte arg0, boolean arg1) {
        ++field3729;
        if (!arg1) {
            return (char) 65437;
        } else {
            int var2 = 255 & arg0;
            if (var2 == 0) {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
            } else {
                if (var2 >= 128 && var2 < 160) {
                    char var3 = class208.field3402[var2 + -128];
                    if (~var3 == -1) {
                        var3 = '?';
                    }
                    var2 = var3;
                }
                return (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        ++field3724;
        int[][] var3 = super.field4598.method812(arg1, arg0 ^ 65534);
        if (arg0 != 1) {
            this.field3723 = -44;
        }
        if (super.field4598.field1954) {
            int var4 = class186.field2986 / this.field3726;
            int var5 = class205.field3296 / this.field3723;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1930(0, class205.field3296 * var6 / var5, (byte) -100);
            } else {
                var7 = this.method1930(0, 0, (byte) -123);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[0];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class186.field2986; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class186.field2986 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var9[var16];
                var12[var14] = var8[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class234() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field3723 = 123;
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = class186.field2986 / this.field3726;
            int var5 = class205.field3296 / this.field3723;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1931((byte) -126, 0, class205.field3296 * var6 / var5);
            } else {
                var7 = this.method1931((byte) -125, 0, 0);
            }
            for (int var8 = 0; var8 < class186.field2986; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class186.field2986 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        ++field3722;
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1544(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        ++field3725;
        if (arg0 != 25657) {
            field3727 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)V")
    public static void method1545(byte arg0) {
        if (arg0 > -49) {
            field3727 = null;
        }
        field3727 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1546(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field3728;
        if (arg4 > 31) {
            if (~arg1 == ~arg3) {
                class194.method1308(arg5, arg2, -2, arg3, arg0);
            } else if (~class58.field817 >= ~(-arg3 + arg0) && arg0 + arg3 <= class121.field2042 && class156.field2507 <= -arg1 + arg5 && ~(arg1 + arg5) >= ~client.field3617) {
                class41.method319(arg2, arg1, arg3, arg0, arg5, (byte) 33);
            } else {
                class144.method975(arg3, arg1, arg0, arg2, 91, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field3721;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field3723 = arg0.method1779(-83);
            }
        } else {
            this.field3726 = arg0.method1779(-120);
        }
        if (arg1 != -19) {
            this.field3723 = -109;
        }
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
    public static final void method1547(int arg0) {
        class235.field3751.method1831(-99);
        int var1 = -6 / ((-32 - arg0) / 39);
        ++field3720;
    }
}
