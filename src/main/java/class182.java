import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class182 extends class365 implements class366 {

    @OriginalMember(owner = "client!vda", name = "H", descriptor = "Lon;")
    public static class337 field2799 = class519.method3060(0);

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "B")
    private byte field2797;

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!vda", name = "I", descriptor = "Lpga;")
    public static class536 field2800;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1283(byte arg0, boolean arg1) {
        if (arg0 <= 19) {
            field2800 = null;
        }
        ++field2793;
        return super.method2257(arg1, (byte) -54, super.field5262.field9914);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)V")
    public final void method1284(boolean arg0) {
        ++field2794;
        super.method1284(arg0);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method1285(int arg0, Source arg1, int arg2, int arg3) {
        this.field2797 = (byte) arg0;
        ++field2788;
        if (arg3 != 6265) {
            return true;
        } else {
            super.method2258(arg2, arg1, -118);
            return true;
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)I")
    public final int method1286(byte arg0) {
        if (arg0 != 9) {
            return -118;
        } else {
            ++field2791;
            return this.field2797;
        }
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "(B)V")
    public static final void method1287(byte arg0) {
        ++field2798;
        int var1 = 92 / ((arg0 - 15) / 42);
        class372.field5334.method800(93);
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field2799 = null;
        if (arg0 == -128) {
            field2800 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Z")
    public final boolean method1289(byte arg0) {
        ++field2789;
        if (arg0 < 13) {
            field2799 = null;
        }
        return super.method2263(super.field5262.field9914, true);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)Z")
    public final boolean method1290(int arg0, int arg1, int arg2) {
        ++field2792;
        this.field2797 = (byte) arg1;
        if (arg0 >= -105) {
            return false;
        } else {
            super.method1458((byte) 91, arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
    public static final void method1291(int arg0, int arg1) {
        ++field2796;
        int var2 = -class95.field1352 + class357.field5189;
        if (~var2 <= -101) {
            class264.field3784 = 1;
            class67.field967 = -1;
            class656.field9191 = -1;
        } else {
            int var3 = (int) class418.field6261;
            if (~(class521.field7455 >> 8) < ~var3) {
                var3 = class521.field7455 >> 8;
            }
            if (arg0 == -1902766269) {
                if (class251.field3626[4] && ~(class357.field5192[4] - -128) < ~var3) {
                    var3 = class357.field5192[4] + 128;
                }
                int var4 = 16383 & (int) class255.field3659 + class378.field5721;
                class455.method2786(var4, var3, -200 + class384.method2468(true, class130.field1749.field8423, class341.field4946, class130.field1749.field8428), class383.field5783, class398.field5951, (byte) -101, arg1, 600 - -((var3 >> 3) * 3) << 2);
                float var5 = 1.0F - (float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
                class259.field3700 = (int) ((float) (-class289.field4123 + class259.field3700) * var5 + (float) class289.field4123);
                class364.field5254 = (int) ((float) (class364.field5254 - class423.field6297) * var5 + (float) class423.field6297);
                class460.field6783 = (int) ((float) (class460.field6783 - class531.field7565) * var5 + (float) class531.field7565);
                class120.field1650 = (int) ((float) (-class241.field3506 + class120.field1650) * var5 + (float) class241.field3506);
                int var6 = -class74.field1027 + class660.field9234;
                if (var6 > 8192) {
                    var6 -= 16384;
                } else if (~var6 > 8191) {
                    var6 += 16384;
                }
                class660.field9234 = (int) ((float) var6 * var5 + (float) class74.field1027);
                class660.field9234 &= 16383;
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lno;Z)V")
    public class182(class704 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)I")
    public final int method1292(int arg0) {
        if (arg0 != 128) {
            return -12;
        } else {
            ++field2790;
            return super.method1292(128);
        }
    }
}
