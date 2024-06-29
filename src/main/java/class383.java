import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class383 extends class431 {

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Ltr;")
    public static class195 field5770 = new class195(2, 14);

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public int field5753;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field5754;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public int field5755;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public int field5756;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field5758;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public int field5759;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public int field5761;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public int field5762;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public int field5763;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public int field5764;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public int field5765;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public int field5767;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public int field5769;

    // $FF: synthetic field
    @OriginalMember(owner = "client!md", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5771;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Component;)Lqb;")
    public static final class152 method2393(int arg0, Component arg1) {
        field5760++;
        if (arg0 > -122) {
            method2394(101);
        }
        return new class479(arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method2394(int arg0) {
        field5770 = null;
        if (arg0 > -90) {
            field5770 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLya;I)Lt;")
    public final class475 method2395(byte arg0, class38 arg1, int arg2) {
        field5757++;
        int var4 = class514.field7472[this.field5753];
        if (arg0 <= 11) {
            method2394(-67);
        }
        if (var4 == 0) {
            class312 var11 = class85.method713(this.field5768, this.field5754, this.field5756);
            if (var11 instanceof class261) {
                class261 var12 = (class261) var11;
                if (var12.field4003 != null) {
                    return ((class164) var12.field4003).method615(arg1, false, arg2);
                }
            }
        } else if (var4 == 1) {
            class168 var5 = class188.method1263(this.field5768, this.field5754, this.field5756);
            if (var5 instanceof class165) {
                class165 var6 = (class165) var5;
                if (var6.field2426 != null) {
                    return ((class164) var6.field2426).method615(arg1, false, arg2);
                }
            }
        } else if (var4 == 2) {
            class389 var7 = class154.method1057(this.field5768, this.field5754, this.field5756, field5771 == null ? (field5771 = method2396("ig")) : field5771);
            if (var7 instanceof class132) {
                class132 var8 = (class132) var7;
                if (var8.field2028 != null) {
                    return ((class164) var8.field2028).method615(arg1, false, arg2);
                }
            }
        } else if (var4 == 3) {
            class171 var9 = class446.method2736(this.field5768, this.field5754, this.field5756);
            if (var9 instanceof class202) {
                class202 var10 = (class202) var9;
                if (var10.field3355 != null) {
                    return ((class164) var10.field3355).method615(arg1, false, arg2);
                }
            }
        }
        return null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2396(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
