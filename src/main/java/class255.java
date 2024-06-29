import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class255 extends class254 {

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "Lfc;")
    public class121 field4608;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Llj;")
    public static class25 field4610 = new class25(8);

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "Lcf;")
    public static class93 field4612 = class147.method1066("Weiter", -48);

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "Lcf;")
    public static class93 field4616 = class147.method1066("null", -48);

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field4611 = -1;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "Lcf;")
    public static class93 field4613 = class147.method1066("Untersuchen", -48);

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "[Ldh;")
    public static class120[] field4615;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "[[B")
    public static byte[][] field4614;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public static final void method1732(int arg0) {
        if (arg0 <= 61) {
            field4611 = -100;
        }
        if (class7.field91 == 2) {
            if (class32.field508 == class110.field1884 && class77.field1441 == class178.field3145) {
                class7.field91 = 0;
                if (class108.field1851 && class176.field3048[81] && class253.field4549 > 2) {
                    class275.method1842(class253.field4549 - 2, 17404);
                } else {
                    class275.method1842(class253.field4549 - 1, 17404);
                }
            }
        } else if (class32.field508 == class193.field3527 && class58.field992 == class178.field3145) {
            class7.field91 = 0;
            if (class108.field1851 && class176.field3048[81] && class253.field4549 > 2) {
                class275.method1842(class253.field4549 - 2, 17404);
            } else {
                class275.method1842(class253.field4549 - 1, 17404);
            }
        } else {
            class77.field1441 = class58.field992;
            class110.field1884 = class193.field3527;
            class7.field91 = 2;
        }
        field4607++;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)Lhb;")
    public static final class216 method1733(int arg0, int arg1) {
        class216 var2 = (class216) class241.field4359.method1852((long) arg1, (byte) -105);
        field4609++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field773.method1271(arg1, -2154, 0);
        if (var3 == null) {
            return null;
        }
        class216 var4 = new class216();
        class280 var5 = new class280(var3);
        var5.field5027 = var5.field5011.length - 2;
        int var6 = var5.method1891(-122);
        int var7 = var5.field5011.length + arg0 - var6 - 12;
        var5.field5027 = var7;
        int var8 = var5.method1872(122);
        var4.field3928 = var5.method1891(-121);
        var4.field3935 = var5.method1891(-123);
        var4.field3940 = var5.method1891(arg0 - 124);
        var4.field3932 = var5.method1891(-119);
        int var9 = var5.method1907(arg0 + 16834);
        if (var9 > 0) {
            var4.field3936 = new class25[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1891(arg0 ^ 0x7E);
                class25 var12 = new class25(class152.method1094(-2085166256, var11));
                var4.field3936[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1872(125);
                    int var14 = var5.method1872(127);
                    var12.method137((long) var13, new class236(var14), -1);
                }
            }
        }
        var5.field5027 = 0;
        int var15 = 0;
        var4.field3939 = var5.method1919((byte) 125);
        var4.field3933 = new int[var8];
        var4.field3929 = new int[var8];
        var4.field3927 = new class93[var8];
        while (var7 > var5.field5027) {
            int var16 = var5.method1891(arg0 ^ 0x7C);
            if (var16 == 3) {
                var4.field3927[var15] = var5.method1889((byte) -67);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3933[var15] = var5.method1907(16832);
            } else {
                var4.field3933[var15] = var5.method1872(arg0 + 112);
            }
            var4.field3929[var15++] = var16;
        }
        class241.field4359.method1847(var4, arg0 + 94, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lfc;)V")
    public class255(class121 arg0) {
        this.field4608 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static void method1734(boolean arg0) {
        field4610 = null;
        field4613 = null;
        field4615 = null;
        if (arg0) {
            field4612 = null;
            field4614 = null;
            field4616 = null;
        }
    }
}
