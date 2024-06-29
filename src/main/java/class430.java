import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class430 extends class371 {

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public int field6060 = -1;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public int field6063 = -1;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Lmt;")
    public static class276 field6059 = new class276(4, 1, 1, 1);

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field6061;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public int field6062;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public int field6065;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public int field6070;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field6071;

    static {
        new class530("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field6068 = 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILza;I)Z", line = 3)
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field6064;
        if (arg0 != 3) {
            return true;
        } else {
            class125 var5 = arg2.method368();
            var5.method825(super.field5283, super.field5282, super.field5290);
            class377 var6 = class344.field5000.method993(this.field6070, true).method2283(-1, this.field6065, arg0 + 847, (class181) null, 0, arg2, (class449) null, 0, 131072);
            if (var6 != null && var6.method1586(arg1, arg3, var5, true)) {
                return true;
            } else {
                if (this.field6060 != -1) {
                    class377 var7 = class344.field5000.method993(this.field6060, true).method2283(-1, this.field6062, arg0 + 847, (class181) null, 0, arg2, (class449) null, 0, 131072);
                    if (var7 != null && var7.method1586(arg1, arg3, var5, true)) {
                        return true;
                    }
                }
                if (~this.field6063 != 0) {
                    class377 var8 = class344.field5000.method993(this.field6063, true).method2283(-1, this.field6061, 850, (class181) null, 0, arg2, (class449) null, 0, 131072);
                    if (var8 != null && var8.method1586(arg1, arg3, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 56)
    public static void method2545(byte arg0) {
        if (arg0 >= 31) {
            field6059 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lza;I)V", line = 66)
    public final void method130(class290 arg0, int arg1) {
        if (arg1 != 0) {
            field6069 = 16;
        }
        ++field6058;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lza;B)Lkf;", line = 84)
    public final class170 method126(class290 arg0, byte arg1) {
        ++field6071;
        class125 var3 = arg0.method368();
        var3.method825(super.field5283, super.field5282, super.field5290);
        class170 var4 = class423.method2509(0, 3);
        if (~this.field6063 != 0) {
            class377 var5 = class344.field5000.method993(this.field6063, true).method2283(-1, this.field6061, 850, (class181) null, 0, arg0, (class449) null, 0, 2048);
            if (var5 != null) {
                var5.method1566(var3, var4.field2475[2], 0);
            }
        }
        if (this.field6060 != -1) {
            class377 var6 = class344.field5000.method993(this.field6060, true).method2283(-1, this.field6062, 850, (class181) null, 0, arg0, (class449) null, 0, 2048);
            if (var6 != null) {
                var6.method1566(var3, var4.field2475[1], 0);
            }
        }
        if (arg1 > -86) {
            return null;
        } else {
            class377 var7 = class344.field5000.method993(this.field6070, true).method2283(-1, this.field6065, 850, (class181) null, 0, arg0, (class449) null, 0, 2048);
            if (var7 != null) {
                var7.method1566(var3, var4.field2475[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)Z", line = 126)
    public static final boolean method2546(boolean arg0, int arg1) {
        if (arg0) {
            method2546(true, 80);
        }
        ++field6066;
        return ~arg1 == -3 || arg1 == 3 || ~arg1 == -5 || arg1 == 5;
    }
}
