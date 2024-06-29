import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class400 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public int field6179 = 0;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lie;I)V")
    public final void method2572(class6 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method70(-9059);
            if (var3 == 0) {
                field6182++;
                return;
            }
            this.method2574(-78, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lpca;I)V")
    public static final void method2573(class665 arg0, int arg1) {
        field6180++;
        if (!class145.field2450) {
            return;
        }
        if (arg0.field9369 != null) {
            class665 var2 = class626.method3656(28613, class198.field3243, class517.field7498);
            if (var2 != null) {
                class438 var3 = new class438();
                var3.field6676 = var2;
                var3.field6684 = arg0.field9369;
                var3.field6677 = arg0;
                class142.method1201(var3);
            }
        }
        class452.field6796++;
        class165 var4 = class271.method1917(class420.field6424, (byte) -87, class564.field8101);
        var4.field2776.method82(false, arg0.field9400);
        var4.field2776.method51(31557, arg0.field9354);
        var4.field2776.method25(true, class219.field3577);
        if (arg1 == 32) {
            var4.field2776.method25(true, class517.field7498);
            var4.field2776.method59((byte) -65, class198.field3243);
            var4.field2776.method56(arg0.field9380, true);
            class642.method3726(-684096285, var4);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILie;)V")
    private final void method2574(int arg0, int arg1, class6 arg2) {
        if (arg1 == 5) {
            this.field6179 = arg2.method67(12021);
        }
        if (arg0 >= -48) {
            this.field6179 = 105;
        }
        field6181++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILiq;I)Z")
    public static final boolean method2575(int arg0, int arg1, int arg2, class563 arg3, int arg4) {
        field6178++;
        if (!class185.field3114) {
            return false;
        } else if (class504.field7375 < 100) {
            return false;
        } else if (class640.method3715(72, arg4, arg2, arg1)) {
            int var5 = arg4 << class439.field6699;
            int var6 = arg2 << class439.field6699;
            int var7 = class587.field8346[arg1].method479(arg2, arg4, 26) - 1;
            int var8 = var7 + arg3.method393(arg0 ^ arg0);
            if (arg3.field8092 == 1) {
                if (!class705.method3975(var8, var8, var5, class134.field2203 + var6, (byte) -127, var5, var6, var6, var5, var7)) {
                    return false;
                } else if (class705.method3975(var8, var7, var5, class134.field2203 + var6, (byte) -128, var5, class134.field2203 + var6, var6, var5, var7)) {
                    class233.field3699++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8092 == 2) {
                if (!class705.method3975(var8, var8, var5, class134.field2203 + var6, (byte) -126, var5, class134.field2203 + var6, class134.field2203 + var6, class134.field2203 + var5, var7)) {
                    return false;
                } else if (class705.method3975(var7, var8, var5, class134.field2203 + var6, (byte) -125, var5 + class134.field2203, var6 - -class134.field2203, var6 + class134.field2203, class134.field2203 + var5, var7)) {
                    class233.field3699++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8092 == 4) {
                if (!class705.method3975(var8, var8, var5 + class134.field2203, class134.field2203 + var6, (byte) -125, class134.field2203 + var5, var6, var6, var5 + class134.field2203, var7)) {
                    return false;
                } else if (class705.method3975(var8, var7, var5 + class134.field2203, var6 - -class134.field2203, (byte) -126, class134.field2203 + var5, class134.field2203 + var6, var6, class134.field2203 + var5, var7)) {
                    class233.field3699++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8092 == 8) {
                if (!class705.method3975(var8, var8, var5, var6, (byte) -125, var5, var6, var6, class134.field2203 + var5, var7)) {
                    return false;
                } else if (class705.method3975(var7, var8, var5, var6, (byte) -127, class134.field2203 + var5, var6, var6, var5 + class134.field2203, var7)) {
                    class233.field3699++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8092 == 16) {
                if (class332.method2247(class459.field6867, class459.field6867, var5, class459.field6867 + var6, -13766, var7, var8)) {
                    class233.field3699++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8092 == 32) {
                if (class332.method2247(class459.field6867, class459.field6867, class459.field6867 + var5, class459.field6867 + var6, arg0 - 25097, var7, var8)) {
                    class233.field3699++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8092 == 64) {
                if (class332.method2247(class459.field6867, class459.field6867, class459.field6867 + var5, var6, -13766, var7, var8)) {
                    class233.field3699++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8092 != 128) {
                return true;
            } else if (class332.method2247(class459.field6867, class459.field6867, var5, var6, -13766, var7, var8)) {
                class233.field3699++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
