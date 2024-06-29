import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class90 extends class349 {

    @OriginalMember(owner = "client!gv", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field1026;

    @OriginalMember(owner = "client!gv", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field1037 = new String[] { method775(method774("Lh\\pP")), method775(method774("Y3\u001e2")), method775(method774("P0\\\u0012\u0005")), method775(method774("P0\\\u0015\u0005")), method775(method774("P0\\\u0018\u0005")), method775(method774("P0\\\u0010\u0005")), method775(method774("P0\\\u0013\u0005")), method775(method774("P0\\bDY/\u0006`\u0005")), method775(method774("P0\\\u0019\u0005")) };

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "Z")
    public static boolean field1027 = false;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "Z")
    public static boolean field1028 = false;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "Lwia;")
    public static class790 field1029 = new class790(55, -1);

    @OriginalMember(owner = "client!gv", name = "G", descriptor = "I")
    public static int field1034 = 0;

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "Lel;")
    public static class573 field1035 = new class573(110, 12);

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!gv", name = "L", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!gv", name = "F", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gv", name = "K", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!gv", name = "J", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!gv", name = "E", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "Lla;")
    public static class476 field1036;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lcja;ILcja;)V", line = 4)
    public static final void method770(class46 arg0, int arg1, class46 arg2) {
        try {
            field1031++;
            if (arg2.field527 != null) {
                arg2.method362((byte) 72);
            }
            arg2.field529 = arg0.field529;
            arg2.field527 = arg0;
            arg2.field527.field529 = arg2;
            arg2.field529.field527 = arg2;
            if (arg1 != 0) {
                field1036 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1037[2] + (arg0 == null ? field1037[1] : field1037[0]) + ',' + arg1 + ',' + (arg2 == null ? field1037[1] : field1037[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)V", line = 23)
    public static final void method771(int arg0) {
        try {
            class289.field4305.method655(17, 1, class289.field4305.field824);
            field1025++;
            class289.field4305.method655(arg0 ^ 0xFFFFB0F8, 1, class289.field4305.field825);
            class289.field4305.method655(17, 2, class289.field4305.field798);
            class289.field4305.method655(17, 2, class289.field4305.field808);
            class289.field4305.method655(arg0 + 20264, 1, class289.field4305.field845);
            class289.field4305.method655(17, 1, class289.field4305.field806);
            class289.field4305.method655(arg0 ^ 0xFFFFB0F8, 1, class289.field4305.field833);
            class289.field4305.method655(arg0 ^ 0xFFFFB0F8, 1, class289.field4305.field822);
            class289.field4305.method655(17, 1, class289.field4305.field811);
            class289.field4305.method655(17, 1, class289.field4305.field835);
            class289.field4305.method655(17, 2, class289.field4305.field810);
            class289.field4305.method655(17, 1, class289.field4305.field801);
            if (arg0 != -20247) {
                field1022 = -51;
            }
            class289.field4305.method655(17, 2, class289.field4305.field799);
            class289.field4305.method655(17, 1, class289.field4305.field827);
            class289.field4305.method655(17, 0, class289.field4305.field848);
            class289.field4305.method655(arg0 + 20264, 0, class289.field4305.field826);
            class289.field4305.method655(17, 2, class289.field4305.field823);
            class289.field4305.method655(17, 0, class289.field4305.field818);
            class289.field4305.method655(17, 0, class289.field4305.field832);
            class287.method2330(4);
            class289.field4305.method655(17, 0, class289.field4305.field842);
            class289.field4305.method655(17, 4, class289.field4305.field814);
            class735.method5364(arg0 + 20249);
            class745.method5429(-6124);
            class431.field6338 = true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1037[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(Z)V", line = 60)
    public static void method772(boolean arg0) {
        try {
            field1029 = null;
            field1036 = null;
            if (arg0) {
                field1036 = null;
            }
            field1035 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1037[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 78)
    public class90(Object arg0, int arg1) {
        super(arg1);
        try {
            this.field1026 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1037[7] + (arg0 == null ? field1037[1] : field1037[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lib;I)Lcf;", line = 88)
    public static final class630 method773(class163 arg0, int arg1) {
        try {
            field1024++;
            class145 var2 = class452.method3466(126, arg0);
            int var3 = arg0.method1437((byte) 85);
            if (arg1 != 1) {
                method771(48);
            }
            return new class630(var2.field1783, var2.field1789, var2.field1781, var2.field1785, var2.field1782, var3);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1037[6] + (arg0 == null ? field1037[1] : field1037[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)Z", line = 103)
    public final boolean method390(boolean arg0) {
        try {
            field1032++;
            if (arg0) {
                field1033 = 20;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1037[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 114)
    public final Object method389(boolean arg0) {
        try {
            field1023++;
            return arg0 ? null : this.field1026;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1037[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method774(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method775(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
