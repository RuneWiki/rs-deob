import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class170 {

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "Ldl;")
    public static class48 field2468 = new class48(1);

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field2470 = -1;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field2473 = 0;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "Lwi;")
    public static class340 field2469 = new class340(0, 2, 2, 1);

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "Lhh;")
    public static class125 field2472;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "Lf;")
    public static class191 field2471;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static void method1195(int arg0) {
        if (arg0 == 1876) {
            field2471 = null;
            field2468 = null;
            field2469 = null;
            field2472 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)Z")
    public static final boolean method1196(int arg0, int arg1, int arg2) {
        field2464++;
        if (class253.method1649(arg2, (byte) 103, arg0)) {
            return (arg1 & arg0) != 0 | class408.method2490(arg0, (byte) -94, arg2) | class81.method524(arg2, arg1 ^ 0xFFFF4F81, arg0) ? true : (class172.method1208(arg0, arg2, arg1 - 51174) | class42.method332((byte) -116, arg2, arg0)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(III)V")
    public static final void method1197(int arg0, int arg1, int arg2) {
        if (class316.field4838 != arg0) {
            class197.field2791 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class197.field2791[var3] = (var3 << 12) / arg0;
            }
            class316.field4838 = arg0;
            class331.field5121 = arg0 * 32;
            class320.field4897 = arg0 - 1;
        }
        field2467++;
        if (arg1 != -1072879284 || class150.field2159 == arg2) {
            return;
        }
        if (class316.field4838 == arg2) {
            class185.field2613 = class197.field2791;
        } else {
            class185.field2613 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class185.field2613[var4] = (var4 << 12) / arg2;
            }
        }
        class51.field694 = arg2 - 1;
        class150.field2159 = arg2;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIILjb;)V")
    public static final void method1198(int arg0, int arg1, int arg2, class499 arg3) {
        if (class500.field7455) {
            class109 var4 = class57.field764 == -1 ? null : class209.field2960.method3083(class57.field764, 83);
            if (client.method450(arg3).method2397(107) && (class303.field4468 & 0x20) != 0 && (var4 == null || arg3.method2974((byte) -109, class57.field764, var4.field1532) != var4.field1532)) {
                class294.method1898(-1, arg3.field7304, 0L, false, class261.field3635, true, class266.field3714, class509.field7572 + " -> " + arg3.field7307, arg3.field7312, arg3.field7310, 9);
                class267.field3716++;
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class263.method1696(arg3, var5, true);
                if (var9 != null) {
                    class294.method1898(-1, arg3.field7304, (long) (var5 + 1), false, class216.method1469(var5, arg3, (byte) 25), true, var9, arg3.field7307, arg3.field7312, arg3.field7310, 1008);
                    class249.field3458++;
                }
            }
            String var6 = class263.method1694(arg3, -85);
            if (var6 != null) {
                class452.field6645++;
                class294.method1898(-1, arg3.field7304, 0L, false, arg3.field7433, true, var6, arg3.field7307, arg3.field7312, arg3.field7310, 46);
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class263.method1696(arg3, var7, true);
                if (var8 != null) {
                    class294.method1898(-1, arg3.field7304, (long) (var7 + 1), false, class216.method1469(var7, arg3, (byte) 25), true, var8, arg3.field7307, arg3.field7312, arg3.field7310, 2);
                    class249.field3458++;
                }
            }
            if (client.method450(arg3).method2396(21565)) {
                if (arg3.field7363 == null) {
                    class294.method1898(-1, arg3.field7304, 0L, false, -1, true, class100.field1435.method2335((byte) -100, class288.field4292), "", arg3.field7312, arg3.field7310, 45);
                } else {
                    class294.method1898(-1, arg3.field7304, 0L, false, -1, true, arg3.field7363, "", arg3.field7312, arg3.field7310, 45);
                }
                class87.field1191++;
            }
        }
        field2466++;
        if (arg1 > -42) {
            method1196(-128, -40, -52);
        }
    }
}
