import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class635 {

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "[I")
    public static int[] field9111 = new int[2];

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Ljk;")
    public static class585 field9112 = new class585(66, -1);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)I")
    public static final int method3628(int arg0, int arg1) {
        if (arg1 != 1) {
            field9112 = null;
        }
        field9110++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3629(int arg0, String arg1) {
        field9114++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class399.method2414(arg1, false);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != 1) {
            return;
        }
        while (var3 < class700.field9897) {
            String var4 = class529.field7730[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class399.method2414(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class700.field9897--;
                for (int var6 = var3; var6 < class700.field9897; var6++) {
                    class529.field7730[var6] = class529.field7730[var6 + 1];
                    class173.field2125[var6] = class173.field2125[var6 + 1];
                    class318.field4208[var6] = class318.field4208[var6 + 1];
                    class310.field4102[var6] = class310.field4102[var6 + 1];
                    class290.field3941[var6] = class290.field3941[var6 + 1];
                    class574.field8410[var6] = class574.field8410[var6 + 1];
                }
                class698.field9879 = class59.field926;
                class232.field3037++;
                class543 var7 = class299.method1780(class84.field1196, class155.field1896, 99);
                var7.field7872.method2281((byte) 58, class251.method1534(arg1, (byte) 124));
                var7.field7872.method2269(arg1, -112);
                class511.method3028(7482, var7);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3630(String arg0, int arg1) {
        field9113++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        if (arg1 > -95) {
            return null;
        } else if (var2 == null) {
            return arg0;
        } else {
            return var2 + arg0;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
    public static void method3631(byte arg0) {
        field9112 = null;
        field9111 = null;
        if (arg0 != -100) {
            field9111 = null;
        }
    }
}
