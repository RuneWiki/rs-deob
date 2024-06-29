import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class158 extends class21 {

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    private int field2575 = 0;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
    private int field2579 = 12288;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    private int field2576 = 2048;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    private int field2587 = 0;

    @OriginalMember(owner = "client!hl", name = "hb", descriptor = "I")
    private int field2592 = 4096;

    @OriginalMember(owner = "client!hl", name = "gb", descriptor = "I")
    private int field2591 = 2048;

    @OriginalMember(owner = "client!hl", name = "kb", descriptor = "I")
    private int field2595 = 8192;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "I")
    public static int field2580 = -1;

    @OriginalMember(owner = "client!hl", name = "eb", descriptor = "I")
    public static int field2589 = 0;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "F")
    public static float field2578;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!hl", name = "fb", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!hl", name = "jb", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "Lnj;")
    public static class204 field2585;

    @OriginalMember(owner = "client!hl", name = "db", descriptor = "Lbm;")
    public static class307 field2588;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Z")
    public static boolean field2573;

    @OriginalMember(owner = "client!hl", name = "ib", descriptor = "[Loj;")
    public static class283[] field2593;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field2574;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 7)
    public static final void method1019(int arg0) {
        field2581++;
        class87.field1651 = true;
        if (arg0 != -4096) {
            method1023((byte) 74, (class307) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(Z)V", line = 19)
    public static void method1020(boolean arg0) {
        field2588 = null;
        field2585 = null;
        field2574 = null;
        if (!arg0) {
            method1020(false);
        }
        field2593 = null;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 222)
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[I", line = 49)
    public final int[] method177(int arg0, int arg1) {
        int[] var3 = this.field443.method1040(arg1, false);
        int var4 = 94 / ((33 - arg0) / 36);
        if (this.field443.field2637) {
            int var5 = class330.field5058[arg1] - 2048;
            for (int var6 = 0; var6 < class294.field4489; var6++) {
                int var7 = class51.field1027[var6] - 2048;
                int var8 = this.field2591 + var7;
                int var9 = var5 + this.field2575;
                int var10 = var9 < -2048 ? var9 + 4096 : var9;
                int var11 = var8 >= -2048 ? var8 : var8 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = var10 > 2048 ? var10 - 4096 : var10;
                int var14 = this.field2576 + var5;
                int var15 = this.field2587 + var7;
                int var16 = var15 < -2048 ? var15 + 4096 : var15;
                int var17 = var16 > 2048 ? var16 - 4096 : var16;
                int var18 = var14 >= -2048 ? var14 : var14 + 4096;
                int var19 = var18 <= 2048 ? var18 : var18 - 4096;
                var3[var6] = this.method1021(96, var13, var12) || this.method1022(var17, (byte) -108, var19) ? 4096 : 0;
            }
        }
        field2590++;
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)Z", line = 104)
    private final boolean method1021(int arg0, int arg1, int arg2) {
        field2582++;
        int var4 = (arg1 - arg2) * this.field2579 >> 12;
        int var5 = class122.field2117[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2579;
        if (arg0 < 88) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field2595;
            int var8 = this.field2592 * var7 >> 12;
            return var8 > arg1 + arg2 && -var8 < arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IBI)Z", line = 121)
    private final boolean method1022(int arg0, byte arg1, int arg2) {
        field2584++;
        int var4 = (arg0 + arg2) * this.field2579 >> 12;
        if (arg1 >= -33) {
            this.method178(33, -51, (class202) null);
        }
        int var5 = class122.field2117[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2579;
        int var7 = (var6 << 12) / this.field2595;
        int var8 = this.field2592 * var7 >> 12;
        return var8 > arg2 - arg0 && -var8 < arg2 - arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILag;)V", line = 160)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg1 == 0) {
            this.field2591 = arg2.method1315(arg0 + 14607);
        } else if (arg1 == 1) {
            this.field2575 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field2587 = arg2.method1315(14289);
        } else if (arg1 == 3) {
            this.field2576 = arg2.method1315(14289);
        } else if (arg1 == 4) {
            this.field2579 = arg2.method1315(14289);
        } else if (arg1 == 5) {
            this.field2592 = arg2.method1315(14289);
        } else if (arg1 == 6) {
            this.field2595 = arg2.method1315(14289);
        }
        field2577++;
        if (arg0 != -318) {
            method1020(true);
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(B)V", line = 234)
    public final void method183(byte arg0) {
        class233.method1546(17431);
        field2583++;
        if (arg0 < 82) {
            field2588 = (class307) null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLbm;)Z", line = 262)
    public static final boolean method1023(byte arg0, class307 arg1) {
        field2586++;
        if (arg1.method2051(-126, class118.field2054)) {
            return true;
        } else if (arg0 <= 89) {
            return false;
        } else {
            return false;
        }
    }
}
