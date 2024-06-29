import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class202 extends class262 {

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "[[B")
    private byte[][] field3021 = new byte[10][];

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "Lee;")
    private class677 field3023 = new class677(null);

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "Lee;")
    private class677 field3035 = new class677(null);

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    private int field3031;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "Lwu;")
    private class376 field3034;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "[F")
    public static float[] field3027 = new float[16384];

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "[F")
    public static float[] field3029 = new float[16384];

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "Lsda;")
    public static class261 field3032;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Leu;")
    public static class483 field3024;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "Lfi;")
    public static class557 field3033;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
    private int[] field3028;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLha;)V")
    public static final void method1356(boolean arg0, class59 arg1) {
        field3026++;
        int var2 = 0;
        int var3 = 0;
        if (class24.field412) {
            var2 = class367.method2167(-2);
            var3 = class672.method3717((byte) -20);
        }
        if (arg0) {
            method1356(false, null);
        }
        int var4 = class477.field6534 + var2;
        int var5 = class733.field10151 + var3;
        int var6 = class575.field7554;
        int var7 = class141.field2261 - 3;
        byte var8 = 20;
        class77.method618(arg1, var8, class575.field7554, class477.field6534 + var2, class517.field6864.method2877(class713.field9854, (byte) -108), true, class141.field2261, class733.field10151 + var3);
        int var9 = var2 + class569.field7492.method780((byte) -89);
        int var10 = var3 + class569.field7492.method772(97);
        if (class163.field2471) {
            int var14 = 0;
            for (class236 var15 = (class236) class592.field7703.method4051(896); var15 != null; var15 = (class236) class592.field7703.method4049(true)) {
                int var28 = var5 + var8 - (-13 - var14 * 16);
                var14++;
                if (class477.field6534 + var2 < var9 && var9 < class575.field7554 + class477.field6534 + var2 && var10 > (var28 - 13) && var28 + 4 > var10 && (var15.field3323 > 1 || ((class433) var15.field3322.field10032.field5748).field5969)) {
                    arg1.method504(class477.field6534 + var2, var28 - 12, class575.field7554, 16, class186.field2819 | 255 - class29.field476 << 24, 1);
                }
            }
            if (class21.field392 != null) {
                class77.method618(arg1, var8, class366.field5133, class267.field3716, class21.field392.field3320, !arg0, class274.field3814, class214.field3121);
                int var16 = 0;
                for (class433 var17 = (class433) class21.field392.field3322.method4051(896); var17 != null; var17 = (class433) class21.field392.field3322.method4049(!arg0)) {
                    int var18 = var16 * 16 + class214.field3121 + var8 + 13;
                    if (class267.field3716 < var9 && var9 < (class366.field5133 + class267.field3716) && var10 > (var18 - 13) && var10 < var18 + 4 && var17.field5969) {
                        arg1.method504(class267.field3716, var18 - 12, class366.field5133, 16, class186.field2819 | 255 - class29.field476 << 24, 1);
                    }
                    var16++;
                }
                class722.method4065((byte) 85, arg1, class214.field3121, class366.field5133, var8, class274.field3814, class267.field3716);
            }
        } else {
            int var11 = 0;
            for (class433 var12 = (class433) class446.field6126.method21(2); var12 != null; var12 = (class433) class446.field6126.method9(-127)) {
                int var13 = (class181.field2730 - var11 - 1) * 16 + var8 + var5 + 13;
                if ((class477.field6534 + var2) < var9 && var9 < class477.field6534 + var2 + class575.field7554 && (var13 - 13) < var10 && var10 < (var13 + 4) && var12.field5969) {
                    arg1.method504(class477.field6534 + var2, var13 - 12, class575.field7554, 16, class186.field2819 | 255 - class29.field476 << 24, 1);
                }
                var11++;
            }
        }
        class722.method4065((byte) 85, arg1, class733.field10151 + var3, class575.field7554, var8, class141.field2261, class477.field6534 + var2);
        if (class163.field2471) {
            int var19 = 0;
            for (class236 var20 = (class236) class592.field7703.method4051(896); var20 != null; var20 = (class236) class592.field7703.method4049(true)) {
                int var24 = var19 * 16 + (class733.field10151 + var3 + var8 + 13);
                if (var20.field3323 == 1) {
                    class490.method2775(class141.field2261, var24, class477.field6534 + var2, arg1, class117.field1893 | 0xFF000000, class117.field1888 | 0xFF000000, (byte) 102, (class433) var20.field3322.field10032.field5748, var10, class575.field7554, var9, class733.field10151 + var3);
                } else {
                    class577.method3166(class117.field1888 | 0xFF000000, class575.field7554, arg1, class141.field2261, class733.field10151 + var3, class117.field1893 | 0xFF000000, var24, var9, var10, var20, 13, class477.field6534 + var2);
                }
                var19++;
            }
            if (class21.field392 != null) {
                int var21 = 0;
                for (class433 var22 = (class433) class21.field392.field3322.method4051(896); var22 != null; var22 = (class433) class21.field392.field3322.method4049(true)) {
                    int var23 = var21 * 16 + class214.field3121 + var8 + 13;
                    var21++;
                    class490.method2775(class274.field3814, var23, class267.field3716, arg1, class117.field1893 | 0xFF000000, class117.field1888 | 0xFF000000, (byte) 60, var22, var10, class366.field5133, var9, class214.field3121);
                }
                class256.method1555(class214.field3121, class267.field3716, class366.field5133, arg0, class274.field3814);
            }
        } else {
            int var25 = 0;
            for (class433 var26 = (class433) class446.field6126.method21(2); var26 != null; var26 = (class433) class446.field6126.method9(-128)) {
                int var27 = (class181.field2730 - var25 - 1) * 16 + var5 + var8 + 13;
                class490.method2775(var7, var27, var4, arg1, class117.field1893 | 0xFF000000, class117.field1888 | 0xFF000000, (byte) 65, var26, var10, var6, var9, var5);
                var25++;
            }
        }
        class256.method1555(class733.field10151 + var3, class477.field6534 + var2, class575.field7554, arg0, class141.field2261);
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
    public static void method1357(int arg0) {
        field3027 = null;
        field3029 = null;
        field3033 = null;
        field3032 = null;
        field3024 = null;
        if (arg0 != 0) {
            method1357(9);
        }
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
    public final void method1358(int arg0) {
        field3025++;
        if (this.field3028 == null) {
            return;
        }
        if (arg0 != 24719) {
            this.method1358(86);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if ((this.field3020 + var2) >= this.field3028.length) {
                return;
            }
            if (this.field3021[var2] == null && this.field3034.method2211(arg0 - 24630, 0, this.field3028[this.field3020 + var2])) {
                this.field3021[var2] = this.field3034.method2218((byte) 126, this.field3028[this.field3020 + var2], 0);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(ILwu;I)V")
    public class202(int arg0, class376 arg1, int arg2) {
        super(arg0);
        this.field3031 = arg2;
        this.field3034 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V")
    public static final void method1359(int arg0) {
        class107.field1456 = null;
        if (arg0 != 0) {
            method1357(-42);
        }
        class305.field4390 = null;
        class132.field2149 = null;
        class93.field1122 = null;
        class739.field10204 = null;
        class339.field4795 = false;
        field3022++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BI)I")
    public final int method1360(byte[] arg0, int arg1) throws IOException {
        field3030++;
        if (this.field3028 == null) {
            if (!this.field3034.method2211(arg1 + 75, 0, this.field3031)) {
                return 0;
            }
            byte[] var3 = this.field3034.method2218((byte) 110, this.field3031, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field3035.field9419 = 0;
            this.field3035.field9399 = var3;
            int var4 = var3.length >> 1;
            this.field3028 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3028[var5] = this.field3035.method3807(arg1 - 3);
            }
        }
        if (arg1 != 2) {
            method1359(35);
        }
        if (this.field3028.length <= this.field3020) {
            return -1;
        }
        this.method1358(24719);
        this.field3035.field9399 = arg0;
        this.field3035.field9419 = 0;
        do {
            if (this.field3035.field9419 >= this.field3035.field9399.length) {
                this.field3035.field9399 = null;
                return arg0.length;
            }
            if (this.field3023.field9399 == null) {
                if (this.field3021[0] == null) {
                    this.field3035.field9399 = null;
                    return this.field3035.field9419;
                }
                this.field3023.field9399 = this.field3021[0];
            }
            int var6 = this.field3035.field9399.length - this.field3035.field9419;
            int var7 = this.field3023.field9399.length - this.field3023.field9419;
            if (var6 < var7) {
                this.field3023.method3801(this.field3035.field9399, this.field3035.field9419, var6, 79);
                this.field3035.field9399 = null;
                return arg0.length;
            }
            this.field3035.method3827(this.field3023.field9419, (byte) -32, this.field3023.field9399, var7);
            this.field3023.field9399 = null;
            this.field3023.field9419 = 0;
            this.field3020++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field3021[var8] = this.field3021[var8 + 1];
            }
            this.field3021[9] = null;
        } while (this.field3028.length > this.field3020);
        this.field3035.field9399 = null;
        return this.field3035.field9419;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3029[var2] = (float) Math.sin((double) var2 * var0);
            field3027[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
