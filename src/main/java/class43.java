import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class43 extends class12 {

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "[B")
    public byte[] field954;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Lvf;")
    public static class265 field953 = class87.method582(-46, "::mm");

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Lvf;")
    private static class265 field955 = class87.method582(-46, "Unable to find ");

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lvf;")
    public static class265 field952 = field955;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Ldg;")
    public static class276 field957 = new class276(64);

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field959 = 127;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "J")
    public static long field960 = 0L;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "Z")
    public static boolean field964 = false;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Loe;")
    public static class108 field949;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
    public static int[] field963;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "[Lcg;")
    public static class34[] field961;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lvf;IIBI)V")
    public static final void method360(class265 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field947++;
        class6 var5 = class12.method98(arg1, arg4, (byte) -124);
        if (var5 == null) {
            return;
        }
        if (var5.field166 != null) {
            class277 var6 = new class277();
            var6.field4882 = arg2;
            var6.field4902 = arg0;
            var6.field4883 = var5.field166;
            var6.field4901 = var5;
            class192.method1318(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field146 > 0) {
            var7 = class257.method1683(arg3 + 19295, var5);
        }
        if (!var7 || !class236.method1577(66, arg2 - 1, client.method1474(var5))) {
            return;
        }
        if (arg2 == 1) {
            class55.field1133.method1863(true, 192);
            class15.field451++;
            class55.field1133.method898((byte) 122, arg1);
            class55.field1133.method921(114, arg4);
        }
        if (arg2 == 2) {
            class55.field1133.method1863(true, 35);
            class55.field1133.method898((byte) 99, arg1);
            class55.field1133.method921(arg3 ^ 0x17, arg4);
            class179.field3191++;
        }
        if (arg2 == 3) {
            class55.field1133.method1863(true, 3);
            class55.field1133.method898((byte) 85, arg1);
            class55.field1133.method921(126, arg4);
            class236.field4124++;
        }
        if (arg2 == 4) {
            class87.field1586++;
            class55.field1133.method1863(true, 124);
            class55.field1133.method898((byte) 109, arg1);
            class55.field1133.method921(97, arg4);
        }
        if (arg3 != 123) {
            method362(46, 8);
        }
        if (arg2 == 5) {
            class91.field1609++;
            class55.field1133.method1863(true, 155);
            class55.field1133.method898((byte) 50, arg1);
            class55.field1133.method921(arg3 ^ 0xE, arg4);
        }
        if (arg2 == 6) {
            class55.field1133.method1863(true, 45);
            class55.field1133.method898((byte) 66, arg1);
            class55.field1133.method921(arg3 ^ 0x18, arg4);
            class1.field3++;
        }
        if (arg2 == 7) {
            class142.field2646++;
            class55.field1133.method1863(true, 144);
            class55.field1133.method898((byte) 64, arg1);
            class55.field1133.method921(114, arg4);
        }
        if (arg2 == 8) {
            class199.field3557++;
            class55.field1133.method1863(true, 169);
            class55.field1133.method898((byte) 100, arg1);
            class55.field1133.method921(arg3 ^ 0x5, arg4);
        }
        if (arg2 == 9) {
            class55.field1133.method1863(true, 251);
            class55.field1133.method898((byte) 62, arg1);
            class174.field3127++;
            class55.field1133.method921(arg3 - 12, arg4);
        }
        if (arg2 == 10) {
            class55.field1133.method1863(true, 208);
            class55.field1133.method898((byte) 54, arg1);
            class55.field1133.method921(arg3 - 4, arg4);
            class203.field3642++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Lee;")
    public static final class239 method361(int arg0, boolean arg1) {
        class239 var2 = (class239) class117.field2070.method1424((long) arg0, (byte) 98);
        field956++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class197.field3518.method1332(true, arg0, 5);
        class239 var4 = new class239();
        if (var3 != null) {
            var4.method1602(0, new class135(var3));
        }
        if (!arg1) {
            method361(127, false);
        }
        class117.field2070.method1419(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
    public static final void method362(int arg0, int arg1) {
        class120.field2129--;
        field950++;
        if (class120.field2129 == arg1) {
            return;
        }
        class194.method1343(class206.field3717, arg1 + 1, class206.field3717, arg1, class120.field2129 - arg1);
        class194.method1343(class40.field924, arg1 + 1, class40.field924, arg1, class120.field2129 - arg1);
        class194.method1340(class206.field3714, arg1 + 1, class206.field3714, arg1, class120.field2129 - arg1);
        class194.method1345(class118.field2079, arg1 + 1, class118.field2079, arg1, class120.field2129 - arg1);
        class194.method1344(class101.field1795, arg1 + 1, class101.field1795, arg1, class120.field2129 - arg1);
        class194.method1340(class1.field4, arg1 + 1, class1.field4, arg1, class120.field2129 - arg1);
        if (arg0 <= -90) {
            class194.method1340(class170.field3070, arg1 + 1, class170.field3070, arg1, class120.field2129 - arg1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)[Loe;")
    public static final class108[] method363(byte arg0) {
        field951++;
        if (arg0 != 23) {
            return null;
        }
        class108[] var1 = new class108[field958];
        for (int var2 = 0; var2 < field958; var2++) {
            byte[] var3 = class6.field230[var2];
            int var4 = class6.field127[var2] * class190.field3417[var2];
            if (class102.field1812[var2]) {
                byte[] var5 = class54.field1116[var2];
                int[] var6 = new int[var4];
                for (int var7 = 0; var7 < var4; var7++) {
                    var6[var7] = class144.method992(class268.field4715[class203.method1395(var3[var7], 255)], class203.method1395(255, var5[var7]) << 24);
                }
                var1[var2] = new class215(class203.field3643, class14.field429, class207.field3737[var2], class269.field4810[var2], class190.field3417[var2], class6.field127[var2], var6);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class268.field4715[class203.method1395(var3[var9], 255)];
                }
                var1[var2] = new class88(class203.field3643, class14.field429, class207.field3737[var2], class269.field4810[var2], class190.field3417[var2], class6.field127[var2], var8);
            }
        }
        class261.method1739(26);
        return var1;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
    public static void method364(int arg0) {
        field957 = null;
        if (arg0 != -23474) {
            return;
        }
        field955 = null;
        field952 = null;
        field953 = null;
        field963 = null;
        field961 = null;
        field949 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B)V")
    public class43(byte[] arg0) {
        this.field954 = arg0;
    }
}
