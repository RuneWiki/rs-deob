import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class297 {

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "Lc;")
    private class70 field5154 = new class70();

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    private int field5135;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    private int field5142;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "Lrj;")
    private class254 field5155;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Lke;")
    private static class256 field5144 = class316.method2202("Connection lost)3", 27626);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lke;")
    public static class256 field5134 = class316.method2202("Mem:", 27626);

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field5148 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "[I")
    public static int[] field5145 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "S")
    public static short field5150 = 32767;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "Lke;")
    public static class256 field5147 = field5144;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "Lvm;")
    public static class297 field5156 = new class297(64);

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "Lke;")
    private static class256 field5158 = class316.method2202("shake:", 27626);

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "Lke;")
    public static class256 field5157 = field5158;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "Lke;")
    public static class256 field5159 = field5158;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Lng;")
    public static class138 field5141;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 6)
    public final void method2074(Object arg0, long arg1, int arg2) {
        field5149++;
        this.method2082(arg1, (byte) -128);
        if (~this.field5135 == arg2) {
            class22 var5 = (class22) this.field5154.method538(-116);
            var5.method1199(21966);
            var5.method235(107);
        } else {
            this.field5135--;
        }
        class140 var6 = new class140(arg0);
        this.field5155.method1749(true, var6, arg1);
        this.field5154.method537(var6, arg2);
        var6.field539 = 0L;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V", line = 36)
    public final void method2075(int arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        if (class15.field205 != null) {
            for (class22 var3 = (class22) this.field5154.method534(122); var3 != null; var3 = (class22) this.field5154.method536((byte) -51)) {
                if (var3.method146(true)) {
                    if (var3.method141(-15111) == null) {
                        var3.method1199(21966);
                        var3.method235(64);
                        this.field5135++;
                    }
                } else if ((long) arg0 < ++var3.field539) {
                    class22 var4 = class15.field205.method766(var3, 2048);
                    this.field5155.method1749(true, var4, var3.field2895);
                    class80.method598(var3, 40, var4);
                    var3.method1199(21966);
                    var3.method235(-55);
                }
            }
        }
        field5139++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 97)
    public final void method2076(int arg0) {
        this.field5154.method531(-1);
        if (arg0 > 90) {
            field5152++;
            this.field5155.method1748(0);
            this.field5135 = this.field5142;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 124)
    public final Object method2077(int arg0, long arg1) {
        field5138++;
        if (arg0 != -13408) {
            return (Object) null;
        }
        class22 var4 = (class22) this.field5155.method1744((byte) 123, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method141(-15111);
        if (var5 == null) {
            var4.method1199(21966);
            var4.method235(-57);
            this.field5135++;
            return null;
        }
        if (var4.method146(true)) {
            class140 var6 = new class140(var5);
            this.field5155.method1749(true, var6, var4.field2895);
            this.field5154.method537(var6, -1);
            var6.field539 = 0L;
            var4.method1199(21966);
            var4.method235(-105);
        } else {
            this.field5154.method537(var4, -1);
            var4.field539 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I", line = 167)
    public final int method2078(int arg0) {
        int var2 = 0;
        if (arg0 >= -38) {
            method2080(-37, -29, 114, -1);
        }
        for (class22 var3 = (class22) this.field5154.method534(106); var3 != null; var3 = (class22) this.field5154.method536((byte) -76)) {
            if (!var3.method146(true)) {
                var2++;
            }
        }
        field5153++;
        return var2;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([Lla;IBZII)V", line = 191)
    public static final void method2079(class188[] arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 > -107) {
            method2080(82, 121, 7, -73);
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class188 var7 = arg0[var6];
            if (var7 != null && var7.field3468 == arg5) {
                class199.method1428(arg4, arg3, var7, arg1, -2);
                class100.method724(arg1, var7, (byte) 74, arg4);
                if (var7.field3393 - var7.field3343 < var7.field3463) {
                    var7.field3463 = var7.field3393 - var7.field3343;
                }
                if (var7.field3442 > (var7.field3407 - var7.field3391)) {
                    var7.field3442 = var7.field3407 - var7.field3391;
                }
                if (var7.field3442 < 0) {
                    var7.field3442 = 0;
                }
                if (var7.field3463 < 0) {
                    var7.field3463 = 0;
                }
                if (var7.field3467 == 0) {
                    class90.method675(arg3, var7, -1);
                }
            }
        }
        field5136++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)I", line = 242)
    public static final int method2080(int arg0, int arg1, int arg2, int arg3) {
        field5146++;
        if (class118.field2090 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        if (arg1 <= 99) {
            method2079((class188[]) null, -117, (byte) 51, false, 103, -69);
        }
        int var6 = arg2;
        if (arg2 < 3 && (class308.field5296[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg0 & 0x7F;
        int var8 = arg3 & 0x7F;
        int var9 = (128 - var7) * class118.field2090[var6][var4][var5 + 1] + class118.field2090[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class118.field2090[var6][var4][var5] + class118.field2090[var6][var4 + 1][var5] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V", line = 279)
    public static void method2081(int arg0) {
        field5157 = null;
        field5159 = null;
        field5134 = null;
        field5141 = null;
        field5144 = null;
        field5158 = null;
        field5145 = null;
        field5147 = null;
        if (arg0 >= -23) {
            method2079((class188[]) null, 34, (byte) 100, false, 16, -126);
        }
        field5156 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(JB)V", line = 302)
    public final void method2082(long arg0, byte arg1) {
        if (arg1 > -13) {
            return;
        }
        field5151++;
        class22 var4 = (class22) this.field5155.method1744((byte) 124, arg0);
        if (var4 != null) {
            var4.method1199(21966);
            var4.method235(63);
            this.field5135++;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(I)V", line = 327)
    public class297(int arg0) {
        this.field5135 = arg0;
        this.field5142 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field5155 = new class254(var2);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V", line = 343)
    public static final void method2083(boolean arg0) {
        if (class311.field5360 < 0) {
            class311.field5360 = 0;
            class91.field1665 = -1;
            class185.field3257 = -1;
        }
        if (class311.field5360 > class40.field731) {
            class185.field3257 = -1;
            class311.field5360 = class40.field731;
            class91.field1665 = -1;
        }
        field5140++;
        if (class271.field4645 < 0) {
            class185.field3257 = -1;
            class91.field1665 = -1;
            class271.field4645 = 0;
        }
        if (class271.field4645 > class154.field2753) {
            class91.field1665 = -1;
            class271.field4645 = class154.field2753;
            class185.field3257 = -1;
        }
        if (arg0) {
            method2079((class188[]) null, 66, (byte) -94, true, 36, -102);
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V", line = 391)
    public final void method2084(int arg0) {
        int var2 = -45 / ((62 - arg0) / 49);
        field5137++;
        for (class22 var3 = (class22) this.field5154.method534(111); var3 != null; var3 = (class22) this.field5154.method536((byte) -14)) {
            if (var3.method146(true)) {
                var3.method1199(21966);
                var3.method235(-64);
                this.field5135++;
            }
        }
    }
}
