import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class207 extends class172 {

    @OriginalMember(owner = "client!wt", name = "Q", descriptor = "Leh;")
    public static class246 field2998 = new class246(57, 12);

    @OriginalMember(owner = "client!wt", name = "R", descriptor = "[B")
    public static byte[] field2999 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!wt", name = "T", descriptor = "F")
    public static float field3001 = 1.0F;

    @OriginalMember(owner = "client!wt", name = "S", descriptor = "Lfc;")
    public static class174 field3000 = new class174(64);

    @OriginalMember(owner = "client!wt", name = "U", descriptor = "Leh;")
    public static class246 field3002 = new class246(66, 0);

    @OriginalMember(owner = "client!wt", name = "V", descriptor = "Z")
    public static boolean field3003 = false;

    @OriginalMember(owner = "client!wt", name = "W", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!wt", name = "O", descriptor = "B")
    public byte field2996;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!wt", name = "K", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!wt", name = "P", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "Lwm;")
    public class403 field2994;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(BZ)V")
    public static final void method1320(byte arg0, boolean arg1) {
        ++field2991;
        if (arg0 != -98) {
            method1321((byte) 30);
        }
        for (class136 var2 = (class136) class26.field317.method2655(15152); var2 != null; var2 = (class136) class26.field317.method2660((byte) 67)) {
            if (var2.field1780 != null) {
                class138.field1810.method2312(var2.field1780);
                var2.field1780 = null;
            }
            if (var2.field1777 != null) {
                class138.field1810.method2312(var2.field1777);
                var2.field1777 = null;
            }
            var2.method2891(-125);
        }
        if (arg1) {
            for (class136 var3 = (class136) class503.field7294.method2655(15152); var3 != null; var3 = (class136) class503.field7294.method2660((byte) 67)) {
                if (var3.field1780 != null) {
                    class138.field1810.method2312(var3.field1780);
                    var3.field1780 = null;
                }
                var3.method2891(7);
            }
            for (class136 var4 = (class136) class542.field7922.method2414((byte) -128); var4 != null; var4 = (class136) class542.field7922.method2410((byte) 92)) {
                if (var4.field1780 != null) {
                    class138.field1810.method2312(var4.field1780);
                    var4.field1780 = null;
                }
                var4.method2891(-121);
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(B)V")
    public static void method1321(byte arg0) {
        field2999 = null;
        int var1 = 72 / ((20 - arg0) / 42);
        field3002 = null;
        field3000 = null;
        field2998 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZIII)V")
    public static final void method1322(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class244.field3536 = 0L;
        ++field2993;
        int var5 = class334.method1996((byte) 74);
        if (arg2 >= -97) {
            field2999 = null;
        }
        if (~arg4 == -4 || var5 == 3) {
            arg1 = true;
        }
        if (!class385.field5414.method364()) {
            arg1 = true;
        }
        class334.method2000(768, arg4, arg0, arg1, arg3, var5);
    }

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)I")
    public final int method1078(int arg0) {
        ++field2992;
        if (arg0 != 100) {
            return 57;
        } else {
            return this.field2994 == null ? 0 : this.field2994.field5665 * 100 / (this.field2994.field5663.length + -this.field2996);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)[B")
    public final byte[] method1073(int arg0) {
        ++field2990;
        if (!super.field2496 && ~this.field2994.field5665 <= ~(this.field2994.field5663.length + -this.field2996)) {
            if (arg0 > -30) {
                this.field2996 = -25;
            }
            return this.field2994.field5663;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IFIIIFI[FFIIII)V")
    public static final void method1323(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float[] arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2995;
        int var13 = arg6 - arg2;
        int var14 = arg12 - arg3;
        int var15 = arg10 - arg4;
        float var16 = arg7[2] * (float) var14 + arg7[0] * (float) var15 + arg7[1] * (float) var13;
        if (arg0 >= -110) {
            field3003 = true;
        }
        float var17 = arg7[5] * (float) var14 + arg7[4] * (float) var13 + arg7[3] * (float) var15;
        float var18 = arg7[8] * (float) var14 + arg7[6] * (float) var15 + arg7[7] * (float) var13;
        float var19;
        float var20;
        if (~arg9 == -1) {
            var19 = -var18 + arg8 + 0.5F;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg9 == 1) {
            var19 = arg8 + var18 + 0.5F;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg9 != 2) {
            if (arg9 == 3) {
                var20 = arg1 + var16 + 0.5F;
                var19 = -var17 + arg5 + 0.5F;
            } else if (arg9 == 4) {
                var20 = arg8 + var18 + 0.5F;
                var19 = -var17 + arg5 + 0.5F;
            } else {
                var20 = -var18 + arg8 + 0.5F;
                var19 = -var17 + arg5 + 0.5F;
            }
        } else {
            var19 = -var17 + arg5 + 0.5F;
            var20 = -var16 + arg1 + 0.5F;
        }
        if (~arg11 == -2) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (~arg11 == -3) {
            var20 = -var20;
            var19 = -var19;
        } else if (~arg11 == -4) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class435.field6119 = var20;
        class270.field3970 = var19;
    }
}
