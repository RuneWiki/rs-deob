import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class69 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "J")
    public static long field1156 = 0L;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[I")
    public static int[] field1155 = new int[4096];

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "Z")
    public static boolean field1163 = false;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)Lqf;")
    public static final class86 method471(int arg0, byte arg1) {
        class86 var2 = (class86) class168.field2718.method252((long) arg0, false);
        field1158++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class29.field493.method1149(11, (byte) 83, arg0);
        class86 var4 = new class86();
        if (arg1 != 28) {
            return null;
        }
        if (var3 != null) {
            var4.method608(new class249(var3), 0);
        }
        class168.field2718.method247(var4, (long) arg0, -87);
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method472(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1157++;
        int var8 = class243.method1742(class55.field972, 0, class240.field4053, arg5);
        int var9 = class243.method1742(class55.field972, 0, class240.field4053, arg3);
        int var10 = class243.method1742(class23.field423, 0, class272.field4552, arg6);
        int var11 = class243.method1742(class23.field423, 0, class272.field4552, arg2);
        int var12 = class243.method1742(class55.field972, 0, class240.field4053, arg0 + arg5);
        int var13 = class243.method1742(class55.field972, 0, class240.field4053, arg3 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class134.method996(0, var11, var10, arg7, class41.field630[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class134.method996(0, var11, var10, arg7, class41.field630[var15]);
        }
        int var16 = class243.method1742(class23.field423, 0, class272.field4552, arg0 + arg6);
        int var17 = class243.method1742(class23.field423, 0, class272.field4552, arg2 - arg0);
        int var18 = var12;
        if (arg1) {
            field1163 = true;
        }
        while (var13 >= var18) {
            int[] var19 = class41.field630[var18];
            class134.method996(0, var16, var10, arg7, var19);
            class134.method996(0, var17, var16, arg4, var19);
            class134.method996(0, var11, var17, arg7, var19);
            var18++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Laj;B)V")
    public static final void method473(class151 arg0, byte arg1) {
        if (arg1 != 81) {
            field1163 = true;
        }
        field1160++;
        class218.field3688 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZIIII)V")
    public static final void method474(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class253.field4282 = -1;
        field1159++;
        int var5 = arg2;
        float var6 = (float) class148.field2434 / (float) class148.field2436;
        int var7 = arg1;
        if (var6 < 1.0F) {
            var7 = (int) ((float) arg2 * var6);
        } else {
            var5 = (int) ((float) arg1 / var6);
        }
        class306.field4951 = -1;
        if (arg0) {
            field1163 = false;
        }
        int var8 = arg4 - (arg2 - var5) / 2;
        class122.field2044 = class148.field2436 * var8 / var5;
        int var9 = arg3 - (arg1 - var7) / 2;
        class219.field3701 = class148.field2434 * var9 / var7;
        class245.method1753(12627);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static void method475(byte arg0) {
        if (arg0 > -59) {
            method475((byte) -57);
        }
        field1155 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
    public static final boolean method476(int arg0) {
        field1161++;
        class297 var1 = class32.field523;
        synchronized (class32.field523) {
            if (class36.field561 == class274.field4579) {
                return false;
            } else {
                class155.field2565 = class36.field575[class36.field561];
                class272.field4542 = class293.field4810[class36.field561];
                class36.field561 = class36.field561 + 1 & 0x7F;
                return arg0 == -16689 ? true : true;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    public static final void method477(int arg0, int arg1) {
        class9.field171.method98(1, arg0);
        field1162++;
        if (arg1 != 3206) {
            field1156 = -123L;
        }
        class171.field2761.method98(arg1 - 3205, arg0);
    }
}
