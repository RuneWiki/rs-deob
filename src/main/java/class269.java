import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class269 extends class137 {

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "Z")
    public boolean field4331 = false;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public int field4333 = -1;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "Z")
    public boolean field4326 = false;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "[Lal;")
    public static class133[] field4325 = new class133[6];

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field4332 = 0;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "Loa;")
    public static class101 field4338 = new class101(64);

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field4341 = new String[100];

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field4343 = new String[500];

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field4344 = 0;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "Z")
    public static boolean field4345 = false;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "Ldk;")
    public static class251 field4342;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method1806(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 == arg8 && arg2 == arg3 && arg0 == arg9 && arg4 == arg6) {
            class12.method61(arg6, 69, arg8, arg3, arg5, arg9);
        } else {
            int var10 = arg8;
            int var11 = arg3;
            int var12 = arg8 * 3;
            int var13 = arg3 * 3;
            int var14 = arg2 * 3;
            int var15 = arg7 * 3;
            int var16 = arg0 * 3;
            int var17 = arg4 * 3;
            int var18 = arg9 + var15 - var16 - arg8;
            int var19 = var14 + arg6 - var17 - arg3;
            int var20 = var16 + var12 - var15 - var15;
            int var21 = var13 + var17 - var14 - var14;
            int var22 = var15 - var12;
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var22 * var24;
                int var30 = var21 * var25;
                int var31 = var20 * var25;
                int var32 = (var28 - (-var31 - var29) >> 12) + arg8;
                int var33 = var23 * var24;
                int var34 = (var27 + var33 + var30 >> 12) + arg3;
                class12.method61(var34, -94, var10, var11, arg5, var32);
                var11 = var34;
                var10 = var32;
            }
        }
        field4340++;
        if (arg1 != 52) {
            field4343 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILwd;)Lck;")
    public static final class1 method1807(int arg0, class162 arg1) {
        field4330++;
        int var2 = 63 % ((10 - arg0) / 57);
        return new class1(arg1.method1146(2), arg1.method1146(2), arg1.method1146(2), arg1.method1146(2), arg1.method1137(31155), arg1.method1133((byte) 53));
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ldk;I)V")
    public static final void method1808(class251 arg0, int arg1) {
        field4329++;
        if (arg1 == 29203) {
            class199.field3199 = arg0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1809(String arg0, int arg1, int arg2) {
        field4339++;
        boolean var3 = false;
        int var4 = 0;
        int var5 = -26 / ((arg2 + 68) / 57);
        while (var4 < class13.field145) {
            class299 var6 = class270.field4355[class259.field4176[var4]];
            if (var6 != null && var6.field4778 != null && var6.field4778.equalsIgnoreCase(arg0)) {
                var3 = true;
                if (arg1 == 1) {
                    class314.field5061.method828(116, 177);
                    class223.field3633++;
                    class314.field5061.method1165(class259.field4176[var4], (byte) 84);
                    class314.field5061.method1117(208526064, 0);
                } else if (arg1 == 4) {
                    class314.field5061.method828(123, 169);
                    class314.field5061.method1122(class259.field4176[var4], 1162032584);
                    class314.field5061.method1161(4, 0);
                    class207.field3295++;
                } else if (arg1 == 5) {
                    class314.field5061.method828(102, 186);
                    class314.field5061.method1161(4, 0);
                    class65.field1082++;
                    class314.field5061.method1122(class259.field4176[var4], 1162032584);
                } else if (arg1 == 6) {
                    class314.field5061.method828(127, 157);
                    class90.field1461++;
                    class314.field5061.method1122(class259.field4176[var4], 1162032584);
                    class314.field5061.method1117(208526064, 0);
                } else if (arg1 == 7) {
                    class14.field154++;
                    class314.field5061.method828(107, 59);
                    class314.field5061.method1120(class259.field4176[var4], true);
                    class314.field5061.method1108(0, true);
                }
                break;
            }
            var4++;
        }
        if (!var3) {
            class99.method673(true, class270.field4351 + arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1810(byte arg0) {
        field4325 = null;
        field4343 = null;
        field4341 = null;
        if (arg0 != 50) {
            method1809((String) null, 13, 118);
        }
        field4342 = null;
        field4338 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)I")
    public static final int method1811(byte arg0, int arg1) {
        if (arg0 != -77) {
            field4338 = null;
        }
        field4336++;
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
