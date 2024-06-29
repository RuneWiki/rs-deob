import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class239 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lkq;")
    private class594 field3117;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    private int field3121;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Llf;")
    public static class239 field3118 = new class239(0, 3, class594.field8281);

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Llf;")
    public static class239 field3123 = new class239(1, 3, class594.field8281);

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Llf;")
    public static class239 field3124 = new class239(2, 4, class594.field8277);

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Llf;")
    public static class239 field3125 = new class239(3, 1, class594.field8281);

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Llf;")
    public static class239 field3127 = new class239(4, 2, class594.field8281);

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Llf;")
    public static class239 field3128 = new class239(5, 3, class594.field8281);

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Llf;")
    public static class239 field3129 = new class239(6, 4, class594.field8281);

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field3130 = class185.method1043(16, (byte) 31);

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field3131 = 2;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field3133 = -1;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field3132 = -1;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3122++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIB)V")
    public static final void method1443(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3119++;
        if (arg4 <= 101) {
            return;
        }
        for (class101 var5 = (class101) class197.field2353.method724(32); var5 != null; var5 = (class101) class197.field2353.method723(107)) {
            class268.method1606(arg2, 256, arg1, arg3, arg0, var5);
        }
        for (class101 var6 = (class101) class315.field4251.method724(32); var6 != null; var6 = (class101) class315.field4251.method723(123)) {
            byte var12 = 1;
            class351 var13 = var6.field1328.method548(1);
            if (var6.field1328.field837 == -1 || var6.field1328.field803) {
                var12 = 0;
            } else if (var6.field1328.field837 == var13.field4682 || var6.field1328.field837 == var13.field4650 || var6.field1328.field837 == var13.field4697 || var6.field1328.field837 == var13.field4645) {
                var12 = 2;
            } else if (var6.field1328.field837 == var13.field4657 || var6.field1328.field837 == var13.field4689 || var6.field1328.field837 == var13.field4698 || var6.field1328.field837 == var13.field4667) {
                var12 = 3;
            }
            if (var6.field1349 != var12) {
                int var14 = class201.method1115(120, var6.field1328);
                class274 var15 = var6.field1328.field2589;
                if (var15.field3616 != null) {
                    var15 = var15.method1637(class386.field5455, (byte) 29);
                }
                if (var15 == null || var14 == -1) {
                    var6.field1349 = var12;
                    var6.field1329 = -1;
                    var6.field1334 = false;
                } else if (var6.field1329 == var14 && var6.field1334 == var15.field3598) {
                    var6.field1358 = var15.field3672;
                    var6.field1349 = var12;
                } else {
                    boolean var16 = false;
                    if (var6.field1354 == null) {
                        var16 = true;
                    } else {
                        var6.field1358 -= 512;
                        if (var6.field1358 <= 0) {
                            class143.field1851.method2542(var6.field1354);
                            var6.field1354 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field1333 = null;
                        var6.field1358 = var15.field3672;
                        var6.field1334 = var15.field3598;
                        var6.field1349 = var12;
                        var6.field1332 = null;
                        var6.field1329 = var14;
                    }
                }
            }
            var6.field1351 = var6.field1328.field2170;
            var6.field1345 = var6.field1328.field2170 + (var6.field1328.method543(0) << 8);
            var6.field1347 = var6.field1328.field2165;
            var6.field1335 = var6.field1328.field2165 + (var6.field1328.method543(0) << 8);
            class268.method1606(arg2, 256, arg1, arg3, arg0, var6);
        }
        for (class101 var7 = (class101) class374.field5207.method2560(107); var7 != null; var7 = (class101) class374.field5207.method2557(-1)) {
            byte var8 = 1;
            class351 var9 = var7.field1325.method548(1);
            if (var7.field1325.field837 == -1 || var7.field1325.field803) {
                var8 = 0;
            } else if (var7.field1325.field837 == var9.field4682 || var7.field1325.field837 == var9.field4650 || var7.field1325.field837 == var9.field4697 || var7.field1325.field837 == var9.field4645) {
                var8 = 2;
            } else if (var7.field1325.field837 == var9.field4657 || var7.field1325.field837 == var9.field4689 || var7.field1325.field837 == var9.field4698 || var7.field1325.field837 == var9.field4667) {
                var8 = 3;
            }
            if (var7.field1349 != var8) {
                int var10 = class439.method2484(var7.field1325, true);
                if (var7.field1329 == var10 && var7.field1334 == var7.field1325.field1131) {
                    var7.field1349 = var8;
                    var7.field1358 = var7.field1325.field1114;
                } else {
                    boolean var11 = false;
                    if (var7.field1354 == null) {
                        var11 = true;
                    } else {
                        var7.field1358 -= 512;
                        if (var7.field1358 <= 0) {
                            class143.field1851.method2542(var7.field1354);
                            var7.field1354 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field1329 = var10;
                        var7.field1333 = null;
                        var7.field1332 = null;
                        var7.field1358 = var7.field1325.field1114;
                        var7.field1349 = var8;
                        var7.field1334 = var7.field1325.field1131;
                    }
                }
            }
            var7.field1351 = var7.field1325.field2170;
            var7.field1345 = var7.field1325.field2170 + (var7.field1325.method543(0) << 8);
            var7.field1347 = var7.field1325.field2165;
            var7.field1335 = var7.field1325.field2165 + (var7.field1325.method543(0) << 8);
            class268.method1606(arg2, 256, arg1, arg3, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method1444(int arg0) {
        field3118 = null;
        field3124 = null;
        field3128 = null;
        field3125 = null;
        if (arg0 > -111) {
            field3123 = null;
        }
        field3127 = null;
        field3129 = null;
        field3123 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)Llf;")
    public static final class239 method1445(int arg0, byte arg1) {
        field3116++;
        if (arg0 == 0) {
            return field3118;
        } else if (arg0 == 1) {
            return field3123;
        } else if (arg0 == 2) {
            return field3124;
        } else if (arg0 == 3) {
            return field3125;
        } else if (arg0 == 4) {
            return field3127;
        } else if (arg0 == 5) {
            return field3128;
        } else if (arg0 == 6) {
            return field3129;
        } else {
            if (arg1 < 5) {
                field3124 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IILkq;)V")
    private class239(int arg0, int arg1, class594 arg2) {
        this.field3117 = arg2;
        this.field3121 = arg1;
        this.field3126 = arg0;
        this.field3120 = this.field3117.field8274 * this.field3121;
        if (this.field3126 >= 16) {
            throw new RuntimeException();
        }
    }
}
