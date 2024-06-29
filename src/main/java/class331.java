import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class331 extends class429 {

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field4577;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Lkn;")
    public static class442 field4576;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "[B")
    public static byte[] field4581;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field4580;

    static {
        new class442("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field4577 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        field4576 = new class442("glow1:", "leuchten1:", "brillant1:", "brilho1:");
        field4579 = 0;
        field4578 = 0;
        field4581 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 3)
    public static final void method2132(byte arg0) {
        field4573++;
        class194 var1 = (class194) class375.field5353.method646(48);
        if (arg0 != 8) {
            return;
        }
        while (var1 != null) {
            if (var1.field2676) {
                var1.method1254((byte) 5);
            }
            var1 = (class194) class375.field5353.method641(false);
        }
        for (class194 var2 = (class194) class447.field6276.method646(arg0 + 40); var2 != null; var2 = (class194) class447.field6276.method641(false)) {
            if (var2.field2676) {
                var2.method1254((byte) -48);
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V", line = 38)
    public static void method2133(int arg0) {
        field4576 = null;
        field4577 = null;
        if (arg0 != 0) {
            method2132((byte) -119);
        }
        field4581 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lnq;Lnq;Luo;I)V", line = 51)
    public static final void method2134(class268 arg0, class268 arg1, class345 arg2, int arg3) {
        class1.field14 = class282.method1837(arg1, class403.field5721, (byte) 124, 0);
        field4575++;
        class51.field711 = arg2.method76(class1.field14, class238.method1617(arg0, class403.field5721, 0), true);
        class293.field4104 = class282.method1837(arg1, class157.field2215, (byte) 121, 0);
        if (arg3 != -3560) {
            method2135(57, -44);
        }
        class159.field2234 = arg2.method76(class293.field4104, class238.method1617(arg0, class157.field2215, 0), true);
        class95.field1313 = class282.method1837(arg1, class403.field5717, (byte) 124, 0);
        class279.field3915 = arg2.method76(class95.field1313, class238.method1617(arg0, class403.field5717, 0), true);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)I", line = 71)
    public static final int method2135(int arg0, int arg1) {
        if (arg0 <= 39) {
            field4576 = null;
        }
        field4574++;
        return arg1 >>> 8;
    }
}
