import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class352 extends class241 {

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public int field4807 = -1;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public int field4804 = -1;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "[C")
    public static char[] field4813 = new char[128];

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4808 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field4817 = 0;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public int field4806;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)Z", line = 3)
    public static final boolean method2228(boolean arg0, int arg1) {
        ++field4805;
        if (arg1 != 38 && arg1 != 33 && ~arg1 != -3 && arg1 != 19 && ~arg1 != -1011) {
            if (!arg0) {
                field4813 = null;
            }
            return ~arg1 == -29 || ~arg1 == -60 || arg1 == 1009;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lpe;B)Lca;", line = 23)
    public final class415 method572(class391 arg0, byte arg1) {
        ++field4810;
        class156 var3 = arg0.method226();
        var3.method308(super.field3338, super.field3331, super.field3328);
        class415 var4 = class340.method2159(24579, 3);
        if (this.field4807 != -1) {
            class73 var5 = class234.method1569(2142, this.field4807).method2812(70, (class24) null, (class209) null, 1024, this.field4806, 0, arg0, 0, -1);
            if (var5 != null) {
                var5.method478(var3, var4.field5799[2], 0);
            }
        }
        if (this.field4804 != -1) {
            class73 var6 = class234.method1569(2142, this.field4804).method2812(77, (class24) null, (class209) null, 1024, this.field4812, 0, arg0, 0, -1);
            if (var6 != null) {
                var6.method478(var3, var4.field5799[1], 0);
            }
        }
        class73 var7 = class234.method1569(2142, this.field4811).method2812(48, (class24) null, (class209) null, 1024, this.field4809, 0, arg0, 0, -1);
        if (arg1 > -45) {
            return null;
        } else {
            if (var7 != null) {
                var7.method478(var3, var4.field5799[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILpe;)V", line = 69)
    public final void method581(int arg0, class391 arg1) {
        ++field4815;
        if (arg0 != 0) {
            this.field4809 = 82;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 89)
    public static void method2229(int arg0) {
        field4813 = null;
        if (arg0 != 1024) {
            method2229(-37);
        }
        field4808 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILpe;I)Z", line = 101)
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field4814;
        class156 var5 = arg2.method226();
        var5.method308(super.field3338, super.field3331, super.field3328);
        class73 var6 = class234.method1569(2142, this.field4811).method2812(88, (class24) null, (class209) null, arg3, this.field4809, 0, arg2, 0, -1);
        if (var6 != null && var6.method455(arg1, arg0, var5, true)) {
            return true;
        } else {
            if (this.field4804 != -1) {
                class73 var7 = class234.method1569(2142, this.field4804).method2812(57, (class24) null, (class209) null, 65536, this.field4812, 0, arg2, 0, -1);
                if (var7 != null && var7.method455(arg1, arg0, var5, true)) {
                    return true;
                }
            }
            if (this.field4807 != -1) {
                class73 var8 = class234.method1569(2142, this.field4807).method2812(75, (class24) null, (class209) null, 65536, this.field4806, 0, arg2, 0, -1);
                if (var8 != null && var8.method455(arg1, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }
}
