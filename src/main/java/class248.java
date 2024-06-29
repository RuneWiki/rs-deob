import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class248 extends class406 {

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public int field3541 = 0;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public int field3543 = -1;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field3548 = -1;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "Liq;")
    public static class362 field3544 = new class362("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public int field3536;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public int field3538;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "Lrs;")
    public static class392 field3550;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V")
    public static void method1689(int arg0) {
        int var1 = -27 / ((6 - arg0) / 32);
        field3544 = null;
        field3550 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ltq;ZII)Ltr;")
    public static final class160 method1690(class376 arg0, boolean arg1, int arg2, int arg3) {
        field3547++;
        byte[] var4 = arg0.method2431((byte) 111, arg3, arg2);
        if (arg1) {
            return var4 == null ? null : new class160(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lae;Z)V")
    public static final void method1691(class134 arg0, boolean arg1) {
        field3546++;
        if (arg1) {
            field3548 = -16;
        }
        if (!(class208.field2958 >= 2 || class279.field3951) || class225.field3144 != null) {
            return;
        }
        String var2;
        if (class279.field3951 && class208.field2958 < 2) {
            var2 = class154.field1907 + class214.field3028.method2331(25, class271.field3836) + class253.field3613 + " ->";
        } else if (class247.field3530 && class441.field6334.method2208(arg1, 81) && class208.field2958 > 2) {
            var2 = class359.method2309(0, (class302) class393.field5547.field1104.field5854.field5854);
        } else {
            class302 var3 = (class302) class393.field5547.field1104.field5854;
            var2 = class359.method2309(0, var3);
            int[] var4 = null;
            if (class174.method1191(var3.field4247, (byte) -110)) {
                var4 = class50.method288(0, (int) var3.field4250).field2295;
            } else if (class422.method2666(var3.field4247, -8164)) {
                class77 var5 = class167.field2335[(int) var3.field4250];
                if (var5 != null) {
                    var4 = var5.field912.field1639;
                }
            } else if (class327.method2117(var3.field4247, 19)) {
                if (var3.field4247 == 1009) {
                    var4 = class374.method2382((int) var3.field4250, false).field1051;
                } else {
                    var4 = class374.method2382((int) (var3.field4250 >>> 32 & 0x7FFFFFFFL), false).field1051;
                }
            }
            if (var4 != null) {
                var2 = var2 + class309.method2047(0, var4);
            }
        }
        if (class208.field2958 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class208.field2958 - 2) + class396.field5654.method2331(25, class271.field3836);
        }
        if (class148.field1821 != null) {
            class266 var7 = class148.field1821.method1237((byte) -45, arg0);
            if (var7 == null) {
                var7 = class174.field2391;
            }
            var7.method1769(class148.field1821.field2516, class215.field3046, class148.field1821.field2618, class211.field3004, class170.field2351, class148.field1821.field2659, class204.field2932, class148.field1821.field2546, class148.field1821.field2643, 3, class222.field3112, var2, class148.field1821.field2612, class23.field300, class379.field5338);
            class186.method1280(0, class215.field3046[3], class215.field3046[0], class215.field3046[1], class215.field3046[2]);
        } else if (class62.field721 != null && class384.field5425 == 0) {
            int var6 = class174.field2391.method1762(class250.field3561 + 16, class23.field300, 16777215, class379.field5338, 0, class170.field2351, class143.field1756 + 4, -45, var2, class222.field3112);
            class186.method1280(0, 16, class143.field1756 + 4, class250.field3561, class371.field5232.method2264(var2, 6) + var6);
            return;
        }
    }
}
