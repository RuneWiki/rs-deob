import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class157 extends class122 {

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Lqd;")
    public static class40 field2627 = class147.method1106("<img=0>", (byte) -82);

    @OriginalMember(owner = "client!df", name = "V", descriptor = "Lqd;")
    private static class40 field2634 = class147.method1106(" more options", (byte) -76);

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Lqd;")
    public static class40 field2636 = field2634;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "Lo;")
    private class199 field2631;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lqh;")
    public static class289 field2637;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBI)Lbd;", line = 8)
    public static final class297 method1209(int arg0, int arg1, byte arg2, int arg3) {
        class297 var4 = new class297();
        int var5 = -126 % ((arg2 + 13) / 42);
        field2630++;
        var4.field4959 = arg3;
        var4.field4963 = arg1;
        class165.field2731.method1396(-19928, (long) arg0, var4);
        class119.method895(arg3, 0);
        class213 var6 = class314.method2172((byte) -115, arg0);
        if (var6 != null) {
            class25.method188(0, var6);
        }
        if (class41.field792 != null) {
            class25.method188(0, class41.field792);
            class41.field792 = null;
        }
        int var7 = class255.field4252;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class60.method505(class288.field4832[var8], 11173)) {
                class68.method533(8422, var8);
            }
        }
        if (class255.field4252 == 1) {
            class27.field518 = false;
            class129.method958(class27.field550, class178.field2934, class160.field2681, 126, class250.field4138);
        } else {
            class129.method958(class27.field550, class178.field2934, class160.field2681, 104, class250.field4138);
            int var9 = class230.field3789.method1830(class98.field1756);
            for (int var10 = 0; var10 < class255.field4252; var10++) {
                int var11 = class230.field3789.method1830(class108.method819(var10, (byte) 122));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class250.field4138 = var9 + 8;
            class178.field2934 = class255.field4252 * 15 + 22;
        }
        if (var6 != null) {
            class299.method2041(false, (byte) -95, var6);
        }
        class227.method1590(arg3, 47);
        if (class148.field2499 != -1) {
            class168.method1253(-11892, 1, class148.field2499);
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)[Lcm;", line = 84)
    public static final class185[] method1210(byte arg0) {
        if (arg0 != -77) {
            field2634 = (class40) null;
        }
        field2635++;
        class185[] var1 = new class185[class121.field2108];
        for (int var2 = 0; var2 < class121.field2108; var2++) {
            int var3 = class210.field3356[var2] * class102.field1802[var2];
            byte[] var4 = class22.field387[var2];
            if (class51.field979[var2]) {
                byte[] var7 = class50.field964[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class11.method71(class276.method1923(-16777216, var7[var9] << 24), class171.field2797[class276.method1923(var4[var9], 255)]);
                }
                if (class21.field350) {
                    var1[var2] = new class167(class102.field1799, class169.field2787, class12.field208[var2], class256.field4265[var2], class102.field1802[var2], class210.field3356[var2], var8);
                } else {
                    var1[var2] = new class281(class102.field1799, class169.field2787, class12.field208[var2], class256.field4265[var2], class102.field1802[var2], class210.field3356[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class171.field2797[class276.method1923(255, var4[var6])];
                }
                if (class21.field350) {
                    var1[var2] = new class100(class102.field1799, class169.field2787, class12.field208[var2], class256.field4265[var2], class102.field1802[var2], class210.field3356[var2], var5);
                } else {
                    var1[var2] = new class99(class102.field1799, class169.field2787, class12.field208[var2], class256.field4265[var2], class102.field1802[var2], class210.field3356[var2], var5);
                }
            }
        }
        class181.method1324(112);
        return var1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)I", line = 148)
    public final int method1211(byte arg0, int arg1, int arg2) {
        if (arg0 > -46) {
            return -46;
        }
        field2628++;
        if (this.field2631 == null) {
            return arg2;
        } else {
            class270 var4 = (class270) this.field2631.method1405((byte) 115, (long) arg1);
            return var4 == null ? arg2 : var4.field4483;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 178)
    public static final void method1212(byte arg0) {
        if (class251.field4162[96]) {
            class2.field21 += (-class2.field21 - 24) / 2;
        } else if (class251.field4162[97]) {
            class2.field21 += (24 - class2.field21) / 2;
        } else {
            class2.field21 /= 2;
        }
        field2629++;
        if (class251.field4162[98]) {
            class93.field1691 += (12 - class93.field1691) / 2;
        } else if (class251.field4162[99]) {
            class93.field1691 += (-class93.field1691 - 12) / 2;
        } else {
            class93.field1691 /= 2;
        }
        class298.field4977 += class93.field1691 / 2;
        int var1 = class25.field440 + class255.field4233.field1497;
        class108.field1893 += class2.field21 / 2;
        int var2 = class271.field4493 + class255.field4233.field1531;
        if (class206.field3288 - var2 < -500 || (class206.field3288 - var2) > 500 || (class109.field1909 - var1) < -500 || (class109.field1909 - var1) > 500) {
            class206.field3288 = var2;
            class109.field1909 = var1;
        }
        if (arg0 > -33) {
            method1212((byte) 79);
        }
        if (class206.field3288 != var2) {
            class206.field3288 += (var2 - class206.field3288) / 16;
        }
        if (class109.field1909 != var1) {
            class109.field1909 += (var1 - class109.field1909) / 16;
        }
        class120.method907(127);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lqd;ZI)Lqd;", line = 231)
    public final class40 method1213(class40 arg0, boolean arg1, int arg2) {
        field2626++;
        if (this.field2631 == null) {
            return arg0;
        } else if (arg1) {
            return (class40) null;
        } else {
            class60 var4 = (class60) this.field2631.method1405((byte) 115, (long) arg2);
            return var4 == null ? arg0 : var4.field1144;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILsd;)V", line = 260)
    public final void method1214(int arg0, class26 arg1) {
        if (arg0 != 0) {
            return;
        }
        field2638++;
        while (true) {
            int var3 = arg1.method226(arg0 + 255);
            if (var3 == 0) {
                return;
            }
            this.method1215(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZLsd;)V", line = 281)
    private final void method1215(int arg0, boolean arg1, class26 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method226(255);
            if (this.field2631 == null) {
                int var5 = class151.method1130(75, var4);
                this.field2631 = new class199(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method226(255) == 1;
                int var8 = arg2.method244(-26711);
                class307 var9;
                if (var7) {
                    var9 = new class60(arg2.method251((byte) 77));
                } else {
                    var9 = new class270(arg2.method203(-22066));
                }
                this.field2631.method1396(-19928, (long) var8, var9);
            }
        }
        if (arg1) {
            this.method1215(-48, true, (class26) null);
        }
        field2633++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 337)
    public static void method1216(boolean arg0) {
        field2636 = null;
        field2627 = null;
        field2637 = null;
        field2634 = null;
        if (!arg0) {
            field2627 = (class40) null;
        }
    }
}
