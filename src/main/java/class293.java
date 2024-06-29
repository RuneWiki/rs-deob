import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class293 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lhi;")
    private static class82 field4907 = class95.method664((byte) -60, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lhi;")
    public static class82 field4909 = class95.method664((byte) -44, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Z")
    public static boolean field4905 = false;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[S")
    public static short[] field4913 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lhi;")
    public static class82 field4912 = class95.method664((byte) -55, "M");

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lhi;")
    public static class82 field4910 = class95.method664((byte) -82, "Stufe: ");

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lhi;")
    public static class82 field4919 = class95.method664((byte) -114, "null");

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lhi;")
    public static class82 field4921 = field4907;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lme;")
    public static class75 field4917;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
    public static boolean field4918;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I", line = 7)
    public static final int method2015(int arg0, int arg1, int arg2) {
        field4911++;
        class164 var3 = (class164) class67.field1038.method507((long) arg2, 602425312);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            if (arg0 <= 66) {
                field4905 = true;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2864.length; var5++) {
                if (var3.field2870[var5] == arg1) {
                    var4 += var3.field2864[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILum;Lum;Lsc;)V", line = 46)
    public static final void method2016(boolean arg0, int arg1, class222 arg2, class222 arg3, class145 arg4) {
        field4915++;
        class269.field4549 = arg2;
        class126.field2225 = arg3;
        class144.field2455 = arg0;
        int var5 = class269.field4549.method1597(-1) - 1;
        if (arg1 >= -43) {
            method2017(75, -111, -87, 26);
        }
        class183.field3125 = class269.field4549.method1568(1673, var5) + var5 * 256;
        class242.field4205 = arg4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)I", line = 89)
    public static final int method2017(int arg0, int arg1, int arg2, int arg3) {
        field4908++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else if (arg3 == -30911) {
            return arg0;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 115)
    public static void method2018(int arg0) {
        field4912 = null;
        field4913 = null;
        field4921 = null;
        field4909 = null;
        field4910 = null;
        field4917 = null;
        field4919 = null;
        field4907 = null;
        if (arg0 <= 71) {
            method2016(false, 88, (class222) null, (class222) null, (class145) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 177)
    public static final void method2019(int arg0) {
        field4906++;
        if (!class256.field4406 || arg0 != 98) {
            return;
        }
        class75 var1 = class257.method1840(false, class65.field1016, class15.field133);
        if (var1 != null && var1.field1287 != null) {
            class331 var2 = new class331();
            var2.field5635 = var1.field1287;
            var2.field5649 = var1;
            class15.method92(var2, -65);
        }
        class256.field4406 = false;
        class138.method937(var1, 16);
    }
}
