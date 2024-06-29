import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class403 {

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "Lrda;")
    public static class692 field5855;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIILha;)V", line = 5)
    public static final void method2510(int arg0, int arg1, int arg2, class65 arg3) {
        class73.field1031 = new class347[arg0][arg2];
        class66.field937 = arg3;
        field5851++;
        if (class477.field6627 != null) {
            class708.field9928 = class737.method4084(class477.field6627[0], class477.field6627[1], (byte) -128, class477.field6627[3], class477.field6627[2], class477.field6627[5], class477.field6627[4]);
        }
        if (arg1 != 0) {
            method2510(-78, 17, -75, null);
        }
        class452.field6287 = new class347();
        class642.method3565((byte) 127);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIII)V", line = 23)
    public static final void method2511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5856++;
        class94.method750(-13886, arg0);
        int var7 = arg2;
        int var8 = arg0 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class785.field10808[arg3];
        int var16 = arg5 - var8;
        class138.method1069(var15, (byte) 113, arg5 - arg0, var16, arg1);
        int var17 = arg5 + var8;
        class138.method1069(var15, (byte) -67, var16, var17, arg6);
        class138.method1069(var15, (byte) -43, var17, arg0 + arg5, arg1);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class566.field7573[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class785.field10808[arg3 + var9];
                    int[] var19 = class785.field10808[arg3 - var9];
                    int var20 = arg5 + var7;
                    int var21 = arg5 - var7;
                    class138.method1069(var18, (byte) 125, var21, var20, arg1);
                    class138.method1069(var19, (byte) 123, var21, var20, arg1);
                } else {
                    int[] var22 = class785.field10808[arg3 + var9];
                    int[] var23 = class785.field10808[arg3 - var9];
                    int var24 = class566.field7573[var9];
                    int var25 = arg5 + var7;
                    int var26 = arg5 - var7;
                    int var27 = arg5 + var24;
                    int var28 = arg5 - var24;
                    class138.method1069(var22, (byte) -113, var26, var28, arg1);
                    class138.method1069(var22, (byte) -77, var28, var27, arg6);
                    class138.method1069(var22, (byte) 108, var27, var25, arg1);
                    class138.method1069(var23, (byte) 82, var26, var28, arg1);
                    class138.method1069(var23, (byte) 92, var28, var27, arg6);
                    class138.method1069(var23, (byte) 127, var27, var25, arg1);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class785.field10808[arg3 + var7];
            int[] var30 = class785.field10808[arg3 - var7];
            int var31 = arg5 + var9;
            int var32 = arg5 - var9;
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class566.field7573[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class138.method1069(var29, (byte) 79, var32, var35, arg1);
                class138.method1069(var29, (byte) -81, var35, var34, arg6);
                class138.method1069(var29, (byte) 106, var34, var31, arg1);
                class138.method1069(var30, (byte) -42, var32, var35, arg1);
                class138.method1069(var30, (byte) -34, var35, var34, arg6);
                class138.method1069(var30, (byte) 112, var34, var31, arg1);
            } else {
                class138.method1069(var29, (byte) 83, var32, var31, arg1);
                class138.method1069(var30, (byte) 97, var32, var31, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)V", line = 150)
    public static void method2512(byte arg0) {
        field5855 = null;
        if (arg0 != -51) {
            method2514((byte) -16, -106);
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 160)
    public static final String method2513(int arg0, boolean arg1) {
        field5853++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (!arg1) {
            field5855 = null;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class474.field6572.method2780(116, class38.field589) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class474.field6574.method2780(122, class38.field589) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(BI)Z", line = 189)
    public static final boolean method2514(byte arg0, int arg1) {
        if (arg0 != 6) {
            field5854 = -8;
        }
        field5852++;
        if (arg1 == 44 || arg1 == 3 || arg1 == 46 || arg1 == 48 || arg1 == 53) {
            return true;
        } else {
            return arg1 == 10 || arg1 == 1003;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IBI)V", line = 209)
    public static final void method2515(int arg0, byte arg1, int arg2) {
        field5857++;
        if (class86.field1200 == null) {
            return;
        }
        if (arg1 < 79) {
            method2513(-48, true);
        }
        int var3 = class704.field9863;
        int var4 = class40.field637;
        class118.method973(arg0, arg2, 103);
        if (class669.field9399 == 0) {
            class269.field3968 = null;
            class269.field3968 = class86.field1200.method566(class86.field1200.method528(class688.field9675, class756.field10491), class86.field1200.method536(class688.field9675, class756.field10491));
        } else if (class669.field9399 == 1 && (class205.field2686 == null || class704.field9863 != var3 || class40.field637 != var4)) {
            class205.field2686 = new class345[class704.field9863 * class40.field637];
            for (int var5 = 0; var5 < class205.field2686.length; var5++) {
                class205.field2686[var5] = class86.field1200.method566(class86.field1200.method528(class639.field8876, class462.field6403), class86.field1200.method536(class639.field8876, class462.field6403));
            }
            class462.field6396 = new int[class704.field9863 * class40.field637];
            class37.field575 = 1;
        }
        class768.field10591 = true;
    }
}
