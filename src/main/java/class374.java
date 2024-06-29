import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class374 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field5635 = 0;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5640 = new String[100];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lep;")
    public static class146 field5634 = new class146();

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lro;")
    public static class249 field5639;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIII)V", line = 3)
    public static final void method2475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5638++;
        if (arg4 < 128 || arg3 < 128 || arg4 > (class324.field4652 * 128 - 256) || arg3 > ((class336.field4964 - 2) * 128)) {
            class82.field1161[0] = class82.field1161[1] = -1;
        } else if (arg1 == 31496) {
            int var9 = class139.method935(arg3, 115, arg4, class193.field2688) - arg7;
            class81.field1136.method802(arg6, 0, 0);
            class35.field574.method2059(class81.field1136);
            class35.field574.method2143(arg4, var9, arg3, class82.field1161);
            class81.field1136.method802(-arg6, 0, 0);
            class35.field574.method2059(class81.field1136);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BI)Loo;", line = 30)
    public static final class384 method2476(byte[] arg0, int arg1) {
        field5637++;
        class384 var2 = new class384();
        class265 var3 = new class265(arg0);
        var3.field3915 = var3.field3879.length - 2;
        int var4 = var3.method1685(8104);
        int var5 = var3.field3879.length + arg1 - var4 - 12;
        var3.field3915 = var5;
        int var6 = var3.method1666(-2);
        var2.field5745 = var3.method1685(8104);
        var2.field5746 = var3.method1685(8104);
        var2.field5750 = var3.method1685(arg1 ^ 0xFFFFE056);
        var2.field5743 = var3.method1685(8104);
        int var7 = var3.method1697(87);
        if (var7 > 0) {
            var2.field5737 = new class143[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1685(8104);
                class143 var10 = new class143(class8.method64(1388313616, var9));
                var2.field5737[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1666(arg1);
                    int var12 = var3.method1666(-2);
                    var10.method956(false, (long) var11, new class231(var12));
                }
            }
        }
        var3.field3915 = 0;
        var2.field5736 = var3.method1721(-22016);
        var2.field5740 = new int[var6];
        var2.field5753 = new int[var6];
        var2.field5742 = new String[var6];
        int var13 = 0;
        while (var3.field3915 < var5) {
            int var14 = var3.method1685(8104);
            if (var14 == 3) {
                var2.field5742[var13] = var3.method1712(false).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field5740[var13] = var3.method1697(class347.method2311(arg1, 76));
            } else {
                var2.field5740[var13] = var3.method1666(-2);
            }
            var2.field5753[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZIII)V", line = 107)
    public static final void method2477(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5641++;
        if (arg0 - arg2 >= class203.field2942 && class297.field4268 >= (arg0 + arg2) && (arg3 - arg2) >= class180.field2375 && arg2 + arg3 <= class50.field695) {
            class372.method2458(arg0, arg3, -26, arg4, arg2);
        } else {
            class144.method965(arg2, -1, arg4, arg0, arg3);
        }
        if (arg1) {
            method2477(-3, false, 19, -57, 99);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 142)
    public static void method2478(byte arg0) {
        field5640 = null;
        field5639 = null;
        field5634 = null;
        if (arg0 != -128) {
            method2478((byte) 71);
        }
    }
}
