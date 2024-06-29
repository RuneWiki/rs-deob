import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class276 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lp;")
    public static class280 field4783 = class18.method140((byte) -123, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4785 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lp;")
    public static class280 field4786 = class18.method140((byte) -127, "www)2wtqa");

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lp;")
    public static class280 field4788 = class18.method140((byte) -122, "loc");

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lua;")
    public static class113 field4784;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[Lti;")
    public static class5[] field4781;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[[B")
    public static byte[][] field4782;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method1832(byte arg0) {
        field4781 = null;
        field4782 = null;
        field4784 = null;
        field4786 = null;
        field4783 = null;
        int var1 = -127 % ((9 - arg0) / 59);
        field4788 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ltg;ILp;)Lda;")
    public static final class184 method1833(class180 arg0, int arg1, class280 arg2) {
        field4787++;
        int var3 = arg0.method1234((byte) -88, arg2);
        if (var3 == -1) {
            return new class184(0);
        }
        int[] var4 = arg0.method1237(var3, -1);
        class184 var5 = new class184(var4.length);
        int var6 = 0;
        int var7 = 118 % ((arg1 - 49) / 60);
        while (var5.field3241 > var6) {
            class25 var8 = new class25(arg0.method1258(var3, var4[var6], (byte) 115));
            var5.field3238[var6] = var8.method198(false);
            var5.field3231[var6] = var8.method200(32768);
            var5.field3237[var6] = (short) var8.method193((byte) 77);
            var5.field3247[var6] = (short) var8.method193((byte) 77);
            var5.field3249[var6] = var8.method199((byte) -85);
            var6++;
        }
        return var5;
    }
}
