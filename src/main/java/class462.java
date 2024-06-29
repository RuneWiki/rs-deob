import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class462 extends class82 {

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    private int field6374 = -1;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "[I")
    public static int[] field6375 = new int[2];

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "[F")
    public static float[] field6371 = new float[16384];

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "[F")
    public static float[] field6380 = new float[16384];

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public int field6377;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "[I")
    public int[] field6376;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)I")
    public final int method492(int arg0) {
        ++field6373;
        return arg0 != -1 ? 42 : this.field6374;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public final void method485(int arg0) {
        ++field6383;
        if (arg0 < -63) {
            super.method485(-112);
            this.field6376 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class462() {
        super(0, false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JB)V")
    public static final void method2688(long arg0, byte arg1) {
        ++field6379;
        if (~arg0 < -1L) {
            if (arg1 == 110) {
                if (~(arg0 % 10L) != -1L) {
                    class252.method1431(arg0, (byte) 6);
                } else {
                    class252.method1431(arg0 + -1L, (byte) 6);
                    class252.method1431(1L, (byte) 6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)V")
    public static void method2689(int arg0) {
        if (arg0 != 1742436164) {
            field6375 = null;
        }
        field6371 = null;
        field6375 = null;
        field6380 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[[I")
    public int[][] method481(int arg0, int arg1) {
        ++field6372;
        if (arg0 != 1000) {
            this.field6374 = 82;
        }
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962 && this.method2690((byte) -98)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class347.field4469 != ~this.field6377 ? this.field6377 * arg1 / class347.field4469 : arg1) * this.field6382;
            if (class629.field9033 != this.field6382) {
                for (int var8 = 0; class629.field9033 > var8; ++var8) {
                    int var9 = this.field6382 * var8 / class629.field9033;
                    int var10 = this.field6376[var7 + var9];
                    var6[var8] = class288.method1624(255, var10) << 4;
                    var5[var8] = class288.method1624(var10 >> 4, 4080);
                    var4[var8] = class288.method1624(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class629.field9033; ++var11) {
                    int var12 = this.field6376[var7++];
                    var6[var11] = class288.method1624(255, var12) << 4;
                    var5[var11] = class288.method1624(65280, var12) >> 4;
                    var4[var11] = class288.method1624(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
    public final boolean method2690(byte arg0) {
        ++field6381;
        int var2 = -26 % ((-14 - arg0) / 52);
        if (this.field6376 != null) {
            return true;
        } else if (~this.field6374 <= -1) {
            class3 var3 = ~class585.field8494 > -1 ? class3.method17(class41.field327, this.field6374) : class3.method18(class41.field327, class585.field8494, this.field6374);
            var3.method11();
            this.field6376 = var3.method22();
            this.field6382 = var3.field15;
            this.field6377 = var3.field14;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (~arg0 == -1) {
            this.field6374 = arg2.method2136(false);
        }
        ++field6378;
        int var4 = 0 / ((arg1 - -69) / 42);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6380[var2] = (float) Math.sin((double) var2 * var0);
            field6371[var2] = (float) Math.cos((double) var2 * var0);
        }
        field6384 = -50;
    }
}
