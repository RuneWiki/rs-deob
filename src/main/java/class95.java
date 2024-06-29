import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class95 implements class292 {

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[F")
    public float[] field1243;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lbja;")
    public static class34 field1241 = new class34(4, 1, 1, 1);

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Lnj;")
    public static class260 field1247;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V", line = 3)
    public static final void method829(int arg0, int arg1) {
        class288 var2 = class374.field4698;
        synchronized (class374.field4698) {
            class374.field4698.method1694(arg0, -29);
        }
        if (arg1 == -1) {
            field1246++;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILha;)V", line = 17)
    public static final void method830(int arg0, class66 arg1) {
        if (class672.field9218) {
            class680.method3824(arg1, (byte) 92);
        } else {
            class3.method97(14325, arg1);
        }
        if (arg0 >= -6) {
            method832(18, null, 60, null);
        }
        field1240++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IJ)V", line = 38)
    public static final void method831(int arg0, long arg1) {
        field1244++;
        int var3 = class467.field6528;
        if (class713.field10000 != var3) {
            int var4 = var3 - class713.field10000;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class713.field10000 += var5;
        }
        int var6 = class93.field1229;
        if (class353.field4390 != var6) {
            int var7 = var6 - class353.field4390;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class353.field4390 += var8;
        }
        class47.field626 += (float) arg1 * class687.field9377 / 40.0F * 8.0F;
        if (arg0 == 1) {
            class229.field2718 += (float) arg1 * class174.field2108 / 40.0F * 8.0F;
            class434.method2569(arg0 ^ 0xFFFFFFDD);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[IILvk;)V", line = 119)
    public static final void method832(int arg0, int[] arg1, int arg2, class388 arg3) {
        if (arg3.field3430 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field3430.length; var5++) {
                if (arg3.field3430[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field3420 != -1) {
                class582 var6 = class362.field4504.method3600(arg2 ^ 0xFFFFFFD2, arg3.field3420);
                int var7 = var6.field7941;
                if (var7 == 1) {
                    arg3.field3423 = 0;
                    arg3.field3359 = arg0;
                    arg3.field3368 = 0;
                    arg3.field3376 = 1;
                    arg3.field3392 = 0;
                    if (!arg3.field3363) {
                        class60.method520(arg3.field3392, (byte) -97, arg3, var6);
                    }
                }
                if (var7 == 2) {
                    arg3.field3423 = 0;
                }
            }
        }
        field1245++;
        boolean var8 = true;
        for (int var9 = arg2; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg3.field3430 == null || arg3.field3430[var9] == -1 || class362.field4504.method3600(arg2 - 56, arg1[var9]).field7947 >= class362.field4504.method3600(-90, arg3.field3430[var9]).field7947) {
                arg3.field3456 = arg3.field3458;
                arg3.field3359 = arg0;
                arg3.field3430 = arg1;
            }
        }
        if (var8) {
            arg3.field3456 = arg3.field3458;
            arg3.field3430 = arg1;
            arg3.field3359 = arg0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(II)V", line = 203)
    public class95(int arg0, int arg1) {
        this.field1243 = new float[arg0 * arg1];
        this.field1242 = arg0;
        this.field1239 = arg1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 213)
    public static void method833(int arg0) {
        field1247 = null;
        field1241 = null;
        if (arg0 != 320) {
            field1241 = null;
        }
    }
}
