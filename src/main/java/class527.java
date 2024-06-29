import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public abstract class class527 {

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field7531 = 0;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field7532 = 765;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Lgea;")
    public static class80 field7529;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method3176(int arg0, int arg1, int arg2, int arg3) {
        field7534++;
        if (arg3 != -2) {
            field7529 = null;
        }
        if (arg0 < arg2) {
            return arg2;
        } else if (arg0 > arg1) {
            return arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V", line = 18)
    public static void method3177(byte arg0) {
        if (arg0 > -35) {
            field7532 = -56;
        }
        field7529 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)V", line = 38)
    public static final void method3179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -4) {
            field7532 = -68;
        }
        field7533++;
        float var5 = (float) class117.field1803 / (float) class117.field1816;
        int var6 = arg1;
        int var7 = arg4;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg3 - (arg1 - var6) / 2;
        int var9 = arg0 - (arg4 - var7) / 2;
        class752.field10398 = class117.field1803 - (class117.field1803 * var9 / var7);
        class671.field9338 = class117.field1816 * var8 / var6;
        class138.field2063 = -1;
        class67.field823 = -1;
        class665.method3789(52);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V", line = 69)
    public static final void method3182(int arg0) {
        class564.method3329(class265.field3871, 8195);
        field7530++;
        class720.field9972++;
        if (class559.field7950 && class394.field5429) {
            int var1 = 0;
            int var2 = 0;
            if (arg0 != 11942) {
                field7532 = -30;
            }
            if (class195.field2997) {
                var1 = class493.method2933((byte) -49);
                var2 = class242.method1613(8220);
            }
            int var3 = class152.field2154.method2646(arg0 - 11933) + var1;
            int var4 = var2 + class152.field2154.method2650((byte) -49);
            int var5 = var3 - class180.field2796;
            int var6 = var4 - class603.field8441;
            if (var5 < class422.field5782) {
                var5 = class422.field5782;
            }
            if (var6 < class157.field2527) {
                var6 = class157.field2527;
            }
            if (class265.field3871.field6290 + var5 > class422.field5782 - -class226.field3479.field6290) {
                var5 = class422.field5782 + class226.field3479.field6290 - class265.field3871.field6290;
            }
            if (class157.field2527 + class226.field3479.field6288 < class265.field3871.field6288 + var6) {
                var6 = class157.field2527 + class226.field3479.field6288 - class265.field3871.field6288;
            }
            int var7 = var5 + class226.field3479.field6292 - class422.field5782;
            int var8 = var6 + class226.field3479.field6173 - class157.field2527;
            if (class152.field2154.method3486(9)) {
                if (class720.field9972 > class265.field3871.field6224) {
                    int var9 = var5 - class343.field4790;
                    int var10 = var6 - class41.field539;
                    if (var9 > class265.field3871.field6219 || -class265.field3871.field6219 > var9 || class265.field3871.field6219 < var10 || var10 < (-class265.field3871.field6219)) {
                        class556.field7933 = true;
                    }
                }
                if (class265.field3871.field6277 != null && class556.field7933) {
                    class166 var11 = new class166();
                    var11.field2616 = var8;
                    var11.field2627 = class265.field3871;
                    var11.field2614 = var7;
                    var11.field2619 = class265.field3871.field6277;
                    class379.method2349(var11);
                    return;
                }
            } else {
                if (class556.field7933) {
                    class337.method2136(-161);
                    if (class265.field3871.field6263 != null) {
                        class166 var12 = new class166();
                        var12.field2616 = var8;
                        var12.field2619 = class265.field3871.field6263;
                        var12.field2623 = class439.field5918;
                        var12.field2614 = var7;
                        var12.field2627 = class265.field3871;
                        class379.method2349(var12);
                    }
                    if (class439.field5918 != null && client.method2045(class265.field3871) != null) {
                        class212.method1462(15157, class265.field3871, class439.field5918);
                    }
                } else if ((class16.field303 == 1 || class296.method1929(2000)) && class618.field8644 > 2) {
                    class66.method574(class603.field8441 + class41.field539, 16777215, class180.field2796 + class343.field4790);
                } else if (class12.method131(true)) {
                    class66.method574(class603.field8441 + class41.field539, 16777215, class343.field4790 + class180.field2796);
                }
                class265.field3871 = null;
            }
        } else if (class720.field9972 > 1) {
            class265.field3871 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
    public abstract int method3178(int arg0, int arg1);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Lel;")
    public abstract class572 method3180(int arg0);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZ)[B")
    public abstract byte[] method3181(int arg0, boolean arg1);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)V")
    public abstract void method3183(int arg0, byte arg1);
}
