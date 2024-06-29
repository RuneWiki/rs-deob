import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class656 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field9155 = 104;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field9156 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lnj;")
    public static class415 field9159 = new class415(34, 7);

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field9161 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZIIII)V", line = 13)
    public static final void method3611(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class265.field3552 = arg2;
        class641.field8924 = arg1;
        field9157++;
        class99.field1309 = arg4;
        class165.field2061 = arg3;
        if (!arg0) {
            field9160 = 20;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIJIIIILtc;Lfa;)V", line = 28)
    public static final void method3612(int arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, class477 arg7, class619 arg8) {
        field9158++;
        int var10 = arg4 * arg4 + arg6 * arg6;
        if (((long) var10) > arg2) {
            return;
        }
        int var11 = Math.min(arg7.field6372 / 2, arg7.field6224 / 2);
        if (var11 * var11 >= var10) {
            class60.method508(class611.field8251[arg0], arg5, arg8, arg4, arg7, arg6, arg3, -3468);
        } else {
            var11 -= 10;
            int var12;
            if (class704.field9810 == 4) {
                var12 = (int) class141.field1859 & 0x3FFF;
            } else {
                var12 = (int) class141.field1859 + class7.field56 & 0x3FFF;
            }
            int var13 = class237.field3193[var12];
            int var14 = class237.field3196[var12];
            if (class704.field9810 != 4) {
                var13 = var13 * 256 / (class279.field3653 + 256);
                var14 = var14 * 256 / (class279.field3653 + 256);
            }
            int var15 = arg4 * var13 + arg6 * var14 >> 14;
            int var16 = arg4 * var14 - arg6 * var13 >> 14;
            double var17 = Math.atan2((double) var15, (double) var16);
            int var19 = (int) ((double) var11 * Math.sin(var17));
            int var20 = (int) ((double) var11 * Math.cos(var17));
            class499.field6554[arg0].method2750((float) arg7.field6372 / 2.0F + (float) arg3 + (float) var19, (float) arg7.field6224 / 2.0F + (float) arg5 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
        }
        if (arg1 >= -78) {
            method3612(64, 19, 126L, 24, 62, 114, 17, null, null);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 84)
    public static void method3613(int arg0) {
        field9159 = null;
        if (arg0 != -1221262642) {
            method3613(-111);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
    public abstract boolean method3168(int arg0, int arg1);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lvr;")
    public abstract class409 method3177(byte arg0);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public abstract void method3171(int arg0);

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public abstract void method3174(int arg0);
}
