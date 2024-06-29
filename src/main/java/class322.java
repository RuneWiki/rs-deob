import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class322 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Lcr;")
    public static class292 field4757 = new class292("stellardawn", 1);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4762++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 11)
    public static void method2087(int arg0) {
        field4757 = null;
        if (arg0 != 0) {
            field4757 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)I", line = 23)
    public final int method2088(int arg0, byte arg1, int arg2) {
        field4760++;
        int var4 = arg2 >= class412.field6066 ? arg2 : class412.field6066;
        if (arg1 > -96) {
            return 119;
        } else if (class443.field6431 == this) {
            return 0;
        } else if (class592.field8329 == this) {
            return var4 - arg0;
        } else if (class758.field10564 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIII)V", line = 49)
    public static final void method2089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 8 && arg1 != 16) {
            class114 var7 = class488.field7062[arg4][arg2][arg6];
            if (var7 == null) {
                var7 = new class114(arg4);
            }
            if (arg1 == 1) {
                var7.field1765 = (short) arg3;
                var7.field1760 = (short) arg5;
            } else if (arg1 == 2) {
                var7.field1773 = (short) arg3;
                var7.field1770 = (short) arg5;
            }
            if (class118.field1810) {
                class344.method2205(-3639);
            }
        } else if (arg1 == 8) {
            int var8 = arg2 << class662.field9425;
            int var9 = var8 + class382.field5732;
            int var10 = arg6 << class662.field9425;
            int var11 = class382.field5732 + var10;
            int var12 = class121.field1867[arg4].method2160(-88, arg6, arg2);
            int var13 = class121.field1867[arg4].method2160(-127, arg6 + 1, arg2 + 1);
            class258.field4045[class304.field4624++] = new class328(arg1, arg4, var8, var9, var9, var8, var12, var13, var13 - arg3, var12 - arg3, var10, var11, var11, var10);
        } else {
            int var14 = (arg2 << class662.field9425) + class382.field5732;
            int var15 = var14 - class382.field5732;
            int var16 = arg6 << class662.field9425;
            int var17 = class382.field5732 + var16;
            int var18 = class121.field1867[arg4].method2160(arg0 ^ 0x151A, arg6, arg2 + 1);
            int var19 = class121.field1867[arg4].method2160(-87, arg6 + 1, arg2);
            class258.field4045[class304.field4624++] = new class328(arg1, arg4, var14, var15, var15, var14, var18, var19, var19 - arg3, var18 - arg3, var16, var17, var17, var16);
        }
        field4761++;
        if (arg0 != -5474) {
            field4757 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 127)
    public static final void method2090(int arg0) {
        class580.method3350(3);
        field4759++;
        class582.method3359((byte) -126, class654.field9289.field5451.method1749(3) == 1, 2, 22050);
        class109.field1694 = class490.method2974(class706.field9962, class400.field5941, arg0 ^ 0xFFFFFFBE, 0, 22050);
        class378.method2386(arg0, true, class411.method2533(105, null));
        class159.field2473 = class490.method2974(class706.field9962, class400.field5941, -104, 1, 2048);
        class159.field2473.method868(false, class324.field4793);
    }
}
