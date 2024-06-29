import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class318 extends class182 {

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5191 = new String[] { method2732(method2731("<4\u0017MVw")), method2732(method2731("<4\u0017MUw")) };

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field5182 = 1;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "Lhl;")
    public static class556 field5190 = new class556(9, -1);

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public int field5185;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    public int field5186;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public int field5187;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public int field5188;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "Lsca;")
    public static class47 field5184;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "Loi;")
    public class77 field5183;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static final void method2729(int arg0) {
        try {
            field5189++;
            if (class501.field7499) {
                class683 var1 = class454.method3528(arg0 - 22906, class671.field9527, class626.field9017);
                if (var1 != null && var1.field9790 != null) {
                    class730 var2 = new class730();
                    var2.field10693 = var1;
                    var2.field10692 = var1.field9790;
                    class598.method4378(var2);
                }
                class501.field7499 = false;
                class561.field8156 = -1;
                class167.field2708 = -1;
                if (var1 != null) {
                    class454.method3525((byte) 27, var1);
                }
                if (arg0 != 22906) {
                    method2729(-81);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5191[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public static void method2730(int arg0) {
        try {
            field5184 = null;
            field5190 = null;
            if (arg0 != 9) {
                field5182 = -75;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5191[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2731(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2732(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 95;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
