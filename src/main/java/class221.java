import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class221 extends class678 {

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "Laq;")
    public class146 field3338;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "Lgaa;")
    public class272 field3345;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public int field3342;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "[[B")
    public static byte[][] field3340;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBILng;I)V")
    public static final void method1526(int arg0, byte arg1, int arg2, class315 arg3, int arg4) {
        field3341++;
        long var5 = (long) (arg0 << 14 | arg2 << 28 | arg4);
        class38 var7 = (class38) class409.field5924.method2596(var5, 61);
        if (var7 == null) {
            class38 var8 = new class38();
            class409.field5924.method2598(var8, var5, (byte) 8);
            var8.field1053.method1229(arg3, (byte) 120);
            return;
        }
        if (arg1 < 41) {
            method1528((byte) 18);
        }
        class110 var9 = class268.field3985.method258(arg3.field4652, (byte) -67);
        int var10 = var9.field1985;
        if (var9.field1934 == 1) {
            var10 = (arg3.field4649 + 1) * var10;
        }
        for (class315 var11 = (class315) var7.field1053.method1224(-2); var11 != null; var11 = (class315) var7.field1053.method1232(-2)) {
            class110 var12 = class268.field3985.method258(var11.field4652, (byte) -67);
            int var13 = var12.field1985;
            if (var12.field1934 == 1) {
                var13 = (var11.field4649 + 1) * var13;
            }
            if (var10 > var13) {
                class184.method1345(false, arg3, var11);
                return;
            }
        }
        var7.field1053.method1229(arg3, (byte) 120);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IFII[FIIIBI)V")
    public static final void method1527(int arg0, float arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field3339++;
        int var10 = arg0 - arg6;
        int var11 = arg2 - arg7;
        int var12 = arg9 - arg3;
        float var13 = arg4[2] * (float) var12 + arg4[0] * (float) var10 + arg4[1] * (float) var11;
        float var14 = arg4[5] * (float) var12 + arg4[4] * (float) var11 + arg4[3] * (float) var10;
        float var15 = arg4[8] * (float) var12 + arg4[7] * (float) var11 + arg4[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg1 + 0.5F;
        if (arg5 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg5 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg5 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class703.field9875 = var18;
        class514.field7264 = var17;
        if (arg8 <= 34) {
            field3340 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V")
    public static void method1528(byte arg0) {
        int var1 = -25 % ((arg0 - 58) / 57);
        field3340 = null;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V")
    public final void method1529(boolean arg0) {
        this.field3347 = this.field3338.field2529;
        field3346++;
        this.field3343 = this.field3338.field2544;
        this.field3344 = this.field3338.field2533;
        if (arg0) {
            this.field3342 = -3;
        }
        if (this.field3338.field2537 != null) {
            this.field3338.field2537.method899(this.field3345.field4080, this.field3345.field4086, this.field3345.field4076, class445.field6402);
        }
        this.field3342 = class445.field6402[2];
        this.field3337 = class445.field6402[0];
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Laq;Lgp;)V")
    public class221(class146 arg0, class45 arg1) {
        this.field3338 = arg0;
        this.field3345 = this.field3338.method1167(true);
        this.method1529(false);
    }
}
