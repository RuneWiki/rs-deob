import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class33 extends class154 {

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "Z")
    private boolean field482 = true;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    private int field479 = 4096;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "Leg;")
    private static class37 field480 = class174.method1167("Select", -55);

    @OriginalMember(owner = "client!rf", name = "gb", descriptor = "Leg;")
    public static class37 field487 = class174.method1167("RuneScape wird geladen )2 bitte warten)3)3)3", -37);

    @OriginalMember(owner = "client!rf", name = "hb", descriptor = "Leg;")
    public static class37 field488 = field480;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "Leg;")
    public static class37 field486 = class174.method1167("Eingabeprozedur geladen)3", -68);

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Lkl;")
    public static class32 field478;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lpe;III)V")
    public static final void method192(class237 arg0, int arg1, int arg2, int arg3) {
        ++field483;
        if (class276.field4891 == null && !class152.field2556) {
            if (arg0 != null && class282.method1888(arg0, (byte) 70) != null) {
                class276.field4891 = arg0;
                class247.field4432 = class282.method1888(arg0, (byte) 33);
                if (arg2 != 4096) {
                    method195(-55);
                }
                class233.field4018 = false;
                class222.field3822 = arg3;
                class51.field800 = 0;
                class242.field4361 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class33() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field482 = arg0.method1268(255) == 1;
            }
        } else {
            this.field479 = arg0.method1244(false);
        }
        ++field481;
        if (arg1 != -14015) {
            method192((class237) null, 7, 72, -93);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        if (arg0 != 115) {
            field487 = null;
        }
        ++field484;
        int[][] var3 = super.field2585.method1532(arg1, -49);
        if (super.field2585.field3761) {
            int[] var4 = this.method1052(0, class239.field4260 & arg1 + -1, (byte) -95);
            int[] var5 = this.method1052(0, arg1, (byte) -35);
            int[] var6 = this.method1052(0, class239.field4260 & arg1 + 1, (byte) -126);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            for (int var10 = 0; class227.field3898 > var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field479;
                int var12 = (var5[var10 + 1 & class109.field1786] + -var5[class109.field1786 & var10 - 1]) * this.field479;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field482) {
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                }
                var9[var10] = var18;
                var8[var10] = var20;
                var7[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljl;[Lrk;B[Lni;[Lrk;[Lrk;[Lrk;)V")
    public static final void method194(class101 arg0, class14[] arg1, byte arg2, class195[] arg3, class14[] arg4, class14[] arg5, class14[] arg6) {
        class48.field767 = arg6;
        class279.field4932 = arg5;
        ++field485;
        class121.field2041 = arg1;
        class190.field3263 = arg0;
        class247.field4436 = arg3;
        class126.field2120 = arg4;
        class201.field3422 = new boolean[class247.field4436.length];
        class78.field1212.method1573(121);
        int var7 = class190.field3263.method652(class146.field2490, 121);
        int[] var8 = class190.field3263.method671(var7, (byte) 49);
        for (int var9 = 0; ~var8.length < ~var9; ++var9) {
            class78.field1212.method1574(class189.method1310(-1, new class187(class190.field3263.method666(var8[var9], var7, (byte) -51))), 0);
        }
        int var10 = -7 / ((-56 - arg2) / 34);
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static void method195(int arg0) {
        field480 = null;
        field478 = null;
        field486 = null;
        field488 = null;
        if (arg0 < 121) {
            field480 = null;
        }
        field487 = null;
    }
}
