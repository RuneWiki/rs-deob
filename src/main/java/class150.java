import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class150 {

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[I")
    private int[] field2651 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Z")
    public boolean field2652 = false;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field2654 = -1;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lmb;")
    public static class96 field2636 = class243.method1708("blinken1:", (byte) 104);

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field2638 = -1;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field2645 = 0;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lmb;")
    public static class96 field2646 = class243.method1708(":trade:", (byte) 112);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field2633 = 1;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lff;")
    public static class3 field2640;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
    private int[] field2649;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[S")
    private short[] field2639;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[S")
    private short[] field2643;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "[S")
    private short[] field2644;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[S")
    private short[] field2650;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([Lrf;[Lka;Lff;[Lrf;I[Lrf;[Lrf;)V")
    public static final void method1097(class30[] arg0, class174[] arg1, class3 arg2, class30[] arg3, int arg4, class30[] arg5, class30[] arg6) {
        class265.field4638 = arg0;
        class139.field2491 = arg5;
        field2653++;
        class201.field3482 = arg2;
        class207.field3560 = arg1;
        class165.field2918 = arg6;
        class67.field1153 = arg3;
        class239.field4116.method1817(arg4 ^ 0x1);
        int var7 = class201.field3482.method41(class107.field1831, false);
        int[] var8 = class201.field3482.method24(arg4, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class239.field4116.method1814(arg4 + 1, class139.method1039(118, new class239(class201.field3482.method23(var8[var9], 103, var7))));
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Laj;")
    public final class112 method1098(int arg0) {
        field2647++;
        if (this.field2649 == null) {
            return null;
        }
        class112[] var2 = new class112[this.field2649.length];
        for (int var3 = 0; var3 < this.field2649.length; var3++) {
            var2[var3] = class112.method875(class225.field3821, this.field2649[var3], 0);
        }
        class112 var4;
        if (~var2.length == arg0) {
            var4 = var2[0];
        } else {
            var4 = new class112(var2, var2.length);
        }
        if (this.field2643 != null) {
            for (int var5 = 0; var5 < this.field2643.length; var5++) {
                var4.method879(this.field2643[var5], this.field2644[var5]);
            }
        }
        if (this.field2650 != null) {
            for (int var6 = 0; var6 < this.field2650.length; var6++) {
                var4.method863(this.field2650[var6], this.field2639[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Z")
    public final boolean method1099(int arg0) {
        field2634++;
        if (this.field2649 == null) {
            return true;
        } else if (arg0 > -66) {
            return false;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2649.length; var3++) {
                if (!class225.field3821.method29(this.field2649[var3], 0, (byte) -121)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lrf;I)V")
    public static final void method1100(class30 arg0, int arg1) {
        for (int var2 = 0; var2 < class192.field3325.length; var2++) {
            class192.field3325[var2] = 0;
        }
        short var3 = 256;
        field2635++;
        if (arg1 > -19) {
            method1100((class30) null, -37);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class192.field3325[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var3 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class176.field3060[var15] = (class192.field3325[var15 - 1] + class192.field3325[var15 + 1] + class192.field3325[var15 + -128] + class192.field3325[var15 + 128]) / 4;
                }
            }
            int[] var13 = class192.field3325;
            class192.field3325 = class176.field3060;
            class176.field3060 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field1460; var7++) {
            for (int var8 = 0; var8 < arg0.field1464; var8++) {
                if (arg0.field484[var6++] != 0) {
                    int var9 = arg0.field1457 + var8 + 16;
                    int var10 = arg0.field1458 + var7 + 16;
                    int var11 = var9 + (var10 << 7);
                    class192.field3325[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field2640 = null;
        field2646 = null;
        field2636 = null;
        if (arg0 != -25238) {
            field2633 = -17;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILrg;)V")
    public final void method1102(int arg0, class239 arg1) {
        field2648++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1651(4139);
            if (var3 == 0) {
                return;
            }
            this.method1103((byte) 0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLrg;I)V")
    private final void method1103(byte arg0, class239 arg1, int arg2) {
        field2641++;
        if (arg0 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field2654 = arg1.method1651(4139);
        } else if (arg2 == 2) {
            int var8 = arg1.method1651(4139);
            this.field2649 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2649[var9] = arg1.method1663((byte) -118);
            }
        } else if (arg2 == 3) {
            this.field2652 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method1651(4139);
            this.field2643 = new short[var4];
            this.field2644 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2643[var5] = (short) arg1.method1663((byte) 95);
                this.field2644[var5] = (short) arg1.method1663((byte) 106);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1651(4139);
            this.field2650 = new short[var6];
            this.field2639 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2650[var7] = (short) arg1.method1663((byte) 107);
                this.field2639[var7] = (short) arg1.method1663((byte) 74);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2651[arg2 - 60] = arg1.method1663((byte) -54);
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Laj;")
    public final class112 method1104(int arg0) {
        class112[] var2 = new class112[5];
        field2637++;
        int var3 = 0;
        if (arg0 <= 44) {
            this.method1105(-27);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2651[var4] != -1) {
                var2[var3++] = class112.method875(class225.field3821, this.field2651[var4], 0);
            }
        }
        class112 var5 = new class112(var2, var3);
        if (this.field2643 != null) {
            for (int var6 = 0; var6 < this.field2643.length; var6++) {
                var5.method879(this.field2643[var6], this.field2644[var6]);
            }
        }
        if (this.field2650 != null) {
            for (int var7 = 0; var7 < this.field2650.length; var7++) {
                var5.method863(this.field2650[var7], this.field2639[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)Z")
    public final boolean method1105(int arg0) {
        field2642++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2651[var3] != -1 && !class225.field3821.method29(this.field2651[var3], 0, (byte) 119)) {
                var2 = false;
            }
        }
        int var4 = -65 % ((arg0 + 4) / 38);
        return var2;
    }
}
