import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class399 {

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "Lju;")
    private class83 field6051 = new class83();

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    private int field6055;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    private int field6049;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Lmn;")
    private class249 field6047;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)I")
    public final int method2468(byte arg0) {
        field6043++;
        int var2 = 0;
        for (class265 var3 = (class265) this.field6051.method779(1); var3 != null; var3 = (class265) this.field6051.method780((byte) 126)) {
            if (!var3.method1588(14511)) {
                var2++;
            }
        }
        if (arg0 > -15) {
            this.field6055 = -80;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLjava/lang/Object;J)V")
    private final void method2469(int arg0, byte arg1, Object arg2, long arg3) {
        field6050++;
        if (arg0 > this.field6055) {
            throw new IllegalStateException("s>cs");
        }
        this.method2474(255, arg3);
        this.field6049 -= arg0;
        while (this.field6049 < 0) {
            class265 var7 = (class265) this.field6051.method777((byte) -18);
            this.method2473(false, var7);
        }
        class243 var6 = new class243(arg2, arg0);
        this.field6047.method1618(var6, arg3, -1);
        this.field6051.method776(0, var6);
        var6.field3034 = 0L;
        if (arg1 != 39) {
            this.method2478(113, -11L);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
    public final int method2470(int arg0) {
        if (arg0 != -11020) {
            this.field6051 = null;
        }
        field6057++;
        return this.field6049;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
    public final void method2471(byte arg0, int arg1) {
        if (class38.field553 != null) {
            for (class265 var3 = (class265) this.field6051.method779(1); var3 != null; var3 = (class265) this.field6051.method780((byte) 100)) {
                if (var3.method1588(arg0 + 14413)) {
                    if (var3.method1589((byte) -59) == null) {
                        var3.method1676(true);
                        var3.method1289((byte) 81);
                        this.field6049++;
                    }
                } else if ((++var3.field3034) > ((long) arg1)) {
                    class265 var4 = class38.field553.method954(var3, 15);
                    this.field6047.method1618(var4, var3.field3977, -1);
                    class338.method2124(arg0 ^ 0x1B, var4, var3);
                    var3.method1676(true);
                    var3.method1289((byte) -23);
                }
            }
        }
        field6056++;
        if (arg0 != 98) {
            this.field6055 = 125;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/Object;J)V")
    public final void method2472(int arg0, Object arg1, long arg2) {
        int var5 = -65 / ((6 - arg0) / 60);
        this.method2469(1, (byte) 39, arg1, arg2);
        field6045++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLba;)V")
    private final void method2473(boolean arg0, class265 arg1) {
        if (arg1 != null) {
            arg1.method1676(true);
            arg1.method1289((byte) -47);
            this.field6049 += arg1.field4036;
        }
        field6048++;
        if (arg0) {
            this.method2481(-22);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IJ)V")
    private final void method2474(int arg0, long arg1) {
        field6042++;
        if (arg0 != 255) {
            method2476(-6, 24);
        }
        class265 var4 = (class265) this.field6047.method1622(arg1, 121);
        this.method2473(false, var4);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
    public final void method2475(byte arg0) {
        this.field6051.method783((byte) -104);
        field6046++;
        this.field6047.method1614((byte) -24);
        this.field6049 = this.field6055;
        if (arg0 != 67) {
            this.field6047 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
    public static final int method2476(int arg0, int arg1) {
        return class214.field3393 == null ? 0 : class214.field3393[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public final void method2477(int arg0) {
        int var2 = -60 / ((-arg0 - 39) / 59);
        field6053++;
        for (class265 var3 = (class265) this.field6051.method779(1); var3 != null; var3 = (class265) this.field6051.method780((byte) 101)) {
            if (var3.method1588(14511)) {
                var3.method1676(true);
                var3.method1289((byte) -127);
                this.field6049 += var3.field4036;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method2478(int arg0, long arg1) {
        field6052++;
        class265 var4 = (class265) this.field6047.method1622(arg1, 94);
        if (var4 == null) {
            return null;
        } else if (arg0 == 1) {
            Object var5 = var4.method1589((byte) 114);
            if (var5 == null) {
                var4.method1676(true);
                var4.method1289((byte) 99);
                this.field6049 += var4.field4036;
                return null;
            }
            if (var4.method1588(14511)) {
                class243 var6 = new class243(var5, var4.field4036);
                this.field6047.method1618(var6, var4.field3977, arg0 - 2);
                this.field6051.method776(arg0 ^ 0x1, var6);
                var6.field3034 = 0L;
                var4.method1676(true);
                var4.method1289((byte) -124);
            } else {
                this.field6051.method776(0, var4);
                var4.field3034 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method2479(boolean arg0) {
        field6054++;
        class265 var2 = (class265) this.field6047.method1621((byte) 106);
        while (var2 != null) {
            Object var3 = var2.method1589((byte) 116);
            if (var3 != null) {
                return var3;
            }
            class265 var4 = var2;
            var2 = (class265) this.field6047.method1621((byte) 78);
            var4.method1676(true);
            var4.method1289((byte) -24);
            this.field6049 += var2.field4036;
        }
        if (!arg0) {
            this.field6051 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2480(byte arg0) {
        field6058++;
        class265 var2 = (class265) this.field6047.method1615(0);
        while (var2 != null) {
            Object var3 = var2.method1589((byte) -115);
            if (var3 != null) {
                return var3;
            }
            class265 var4 = var2;
            var2 = (class265) this.field6047.method1621((byte) -35);
            var4.method1676(true);
            var4.method1289((byte) -113);
            this.field6049 += var2.field4036;
        }
        if (arg0 > -25) {
            this.field6047 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
    public class399(int arg0) {
        this.field6055 = arg0;
        this.field6049 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field6047 = new class249(var2);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I")
    public final int method2481(int arg0) {
        if (arg0 != 255) {
            this.method2469(89, (byte) 73, null, -33L);
        }
        field6044++;
        return this.field6055;
    }
}
