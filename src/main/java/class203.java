import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class203 {

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lli;")
    public class208 field3502 = new class208();

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lff;")
    public static class47 field3498 = new class47(16);

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lve;")
    public static class255 field3508 = class87.method607(126, "; Expires=");

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "[Lve;")
    public static class255[] field3509 = new class255[500];

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "[F")
    public static float[] field3510 = new float[4];

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Lli;")
    private class208 field3506;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "[[[I")
    public static int[][][] field3503;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Lli;", line = 8)
    public final class208 method1468(int arg0) {
        field3497++;
        class208 var2 = this.field3502.field3563;
        if (this.field3502 == var2) {
            return null;
        } else {
            int var3 = -14 % ((-arg0 - 49) / 40);
            var2.method1502((byte) -82);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILli;)V", line = 24)
    public final void method1469(int arg0, class208 arg1) {
        if (arg0 < 38) {
            field3510 = (float[]) null;
        }
        field3507++;
        if (arg1.field3566 != null) {
            arg1.method1502((byte) -82);
        }
        arg1.field3563 = this.field3502.field3563;
        arg1.field3566 = this.field3502;
        arg1.field3566.field3563 = arg1;
        arg1.field3563.field3566 = arg1;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Lli;", line = 45)
    public final class208 method1470(int arg0) {
        class208 var2 = this.field3502.field3566;
        field3499++;
        if (arg0 != 28527) {
            this.method1472(false, (class208) null);
        }
        if (this.field3502 == var2) {
            this.field3506 = null;
            return null;
        } else {
            this.field3506 = var2.field3566;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Lli;", line = 69)
    public final class208 method1471(byte arg0) {
        field3500++;
        int var2 = 70 / ((arg0 + 27) / 34);
        class208 var3 = this.field3502.field3563;
        if (this.field3502 == var3) {
            this.field3506 = null;
            return null;
        } else {
            this.field3506 = var3.field3563;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLli;)V", line = 90)
    public final void method1472(boolean arg0, class208 arg1) {
        field3501++;
        if (arg1.field3566 != null) {
            arg1.method1502((byte) -82);
        }
        arg1.field3566 = this.field3502.field3566;
        arg1.field3563 = this.field3502;
        arg1.field3566.field3563 = arg1;
        if (arg0) {
            arg1.field3563.field3566 = arg1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIBLki;)V", line = 118)
    public static final void method1473(int arg0, int arg1, int arg2, int arg3, byte arg4, class152 arg5) {
        field3505++;
        if (arg5.field2569 == -1 && arg5.field2568 == null) {
            return;
        }
        int var6 = 0;
        if (arg2 > arg5.field2565) {
            var6 += arg2 - arg5.field2565;
        } else if (arg5.field2579 > arg2) {
            var6 += arg5.field2579 - arg2;
        }
        if (arg1 > arg5.field2566) {
            var6 += arg1 - arg5.field2566;
        } else if (arg1 < arg5.field2577) {
            var6 += arg5.field2577 - arg1;
        }
        if (arg5.field2581 == 0 || arg5.field2581 < var6 - 64 || class301.field5169 == 0 || arg5.field2583 != arg3) {
            if (arg5.field2567 != null) {
                class230.field3813.method1481(arg5.field2567);
                arg5.field2567 = null;
            }
            if (arg5.field2582 != null) {
                class230.field3813.method1481(arg5.field2582);
                arg5.field2582 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field2581 - var6) * class301.field5169 / arg5.field2581;
        if (arg5.field2567 != null) {
            arg5.field2567.method710(var7);
        } else if (arg5.field2569 >= 0) {
            class140 var8 = class140.method1045(class87.field1422, arg5.field2569, 0);
            if (var8 != null) {
                class257 var9 = var8.method1046().method1799(class32.field517);
                class94 var10 = class94.method716(var9, 100, var7);
                var10.method700(-1);
                class230.field3813.method1484(var10);
                arg5.field2567 = var10;
            }
        }
        if (arg5.field2582 != null) {
            arg5.field2582.method710(var7);
            if (!arg5.field2582.method1501((byte) 93)) {
                arg5.field2582 = null;
            }
        } else if (arg5.field2568 != null && (arg5.field2571 -= arg0) <= 0) {
            int var11 = (int) (Math.random() * (double) arg5.field2568.length);
            class140 var12 = class140.method1045(class87.field1422, arg5.field2568[var11], 0);
            if (var12 != null) {
                class257 var13 = var12.method1046().method1799(class32.field517);
                class94 var14 = class94.method716(var13, 100, var7);
                var14.method700(0);
                class230.field3813.method1484(var14);
                arg5.field2582 = var14;
                arg5.field2571 = arg5.field2574 + ((int) (Math.random() * (double) (arg5.field2578 - arg5.field2574)));
            }
        }
        int var15 = 38 / ((arg4 - 75) / 51);
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 346)
    public class203() {
        this.field3502.field3566 = this.field3502;
        this.field3502.field3563 = this.field3502;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V", line = 249)
    public final void method1474(boolean arg0) {
        field3504++;
        while (true) {
            class208 var2 = this.field3502.field3563;
            if (this.field3502 == var2) {
                this.field3506 = null;
                if (!arg0) {
                    this.field3502 = (class208) null;
                }
                return;
            }
            var2.method1502((byte) -82);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)Lli;", line = 275)
    public final class208 method1475(byte arg0) {
        field3495++;
        class208 var2 = this.field3506;
        if (arg0 != 83) {
            return (class208) null;
        } else if (this.field3502 == var2) {
            this.field3506 = null;
            return null;
        } else {
            this.field3506 = var2.field3563;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V", line = 310)
    public static void method1476(int arg0) {
        field3509 = null;
        field3508 = null;
        field3510 = null;
        field3503 = (int[][][]) null;
        if (arg0 != 64) {
            method1473(-51, 122, -117, -100, (byte) 66, (class152) null);
        }
        field3498 = null;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)Lli;", line = 328)
    public final class208 method1477(int arg0) {
        field3496++;
        class208 var2 = this.field3506;
        if (this.field3502 == var2) {
            this.field3506 = null;
            return null;
        }
        this.field3506 = var2.field3566;
        if (arg0 != 24864) {
            field3510 = (float[]) null;
        }
        return var2;
    }
}
