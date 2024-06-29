import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class46 {

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    private int field21 = -1;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    private int field12 = 0;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "Lmb;")
    public static class132 field13 = class166.method1092("::clientdrop", 121);

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "Lmb;")
    public static class132 field15 = class166.method1092("(Udns", 113);

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Lmb;")
    public static class132 field28 = class166.method1092("::qa_op_test", 123);

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "[I")
    public static int[] field32 = new int[100];

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "[I")
    public static int[] field35;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "[S")
    public static short[] field19;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)I")
    public static final int method2(int arg0, int arg1) {
        field16++;
        if (arg0 != 255) {
            field29 = 39;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)V")
    private final void method3(int arg0, int arg1) {
        if (arg0 != -1725891576) {
            return;
        }
        field36++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        double var11 = var3;
        if (var5 < var3) {
            var7 = var5;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (-var7 + var11) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (-var7 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        double var19 = var13 / 6.0D;
        this.field23 = (int) (var15 * 256.0D);
        this.field14 = (int) (var17 * 256.0D);
        if (this.field23 < 0) {
            this.field23 = 0;
        } else if (this.field23 > 255) {
            this.field23 = 255;
        }
        if (this.field14 < 0) {
            this.field14 = 0;
        } else if (this.field14 > 255) {
            this.field14 = 255;
        }
        if (var17 > 0.5D) {
            this.field34 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field34 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field34 < 1) {
            this.field34 = 1;
        }
        this.field26 = (int) ((double) this.field34 * var19);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILkd;)V")
    public final void method4(int arg0, int arg1, class112 arg2) {
        field20++;
        if (arg0 != 13791) {
            field19 = null;
        }
        while (true) {
            int var4 = arg2.method716(-1308);
            if (var4 == 0) {
                return;
            }
            this.method7(arg1, var4, arg2, false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V")
    public static void method5(byte arg0) {
        field32 = null;
        field35 = null;
        field19 = null;
        field28 = null;
        field13 = null;
        field15 = null;
        if (arg0 != 115) {
            field28 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V")
    public static final void method6(int arg0, byte arg1) {
        field27++;
        if (class95.field1666 == arg0) {
            return;
        }
        if (class95.field1666 == 0) {
            class31.method224((byte) 30);
        }
        if (arg0 == 20 || arg0 == 40) {
            class74.field1232 = 0;
            class17.field255 = 0;
            class184.field3384 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class57.field970 != null) {
            class57.field970.method423(true);
            class57.field970 = null;
        }
        int var2 = -27 / ((-arg1 - 88) / 33);
        if (class95.field1666 == 25) {
            class123.field2313 = 1;
            class97.field1862 = 0;
            class46.field790 = 0;
            class37.field613 = 0;
            class132.field2438 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class137.method932(class154.field2814, class65.field1068, class62.field1043, 64);
        } else {
            class33.method233((byte) 27);
        }
        class95.field1666 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILkd;Z)V")
    private final void method7(int arg0, int arg1, class112 arg2, boolean arg3) {
        field24++;
        if (arg3) {
            field15 = null;
        }
        if (arg1 == 1) {
            this.field12 = arg2.method718(false);
            this.method3(-1725891576, this.field12);
        } else if (arg1 == 2) {
            this.field21 = arg2.method739(127);
            if (this.field21 == 65535) {
                this.field21 = -1;
                return;
            }
        } else if (arg1 == 3) {
            arg2.method739(15);
            return;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(II)Lge;")
    public static final class71 method8(int arg0, int arg1) {
        field17++;
        class71 var2 = (class71) class95.field1660.method777(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field1250.method1079(3, 125, arg0);
        class71 var4 = new class71();
        if (var3 != null) {
            var4.method435(-9437, new class112(var3));
        }
        if (arg1 != -5828) {
            field19 = null;
        }
        class95.field1660.method774((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)I")
    public static final int method9(int arg0, boolean arg1) {
        field25++;
        if (!arg1) {
            method10(35, true);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IZ)I")
    public static final int method10(int arg0, boolean arg1) {
        if (arg1) {
            method8(-52, -50);
        }
        field18++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lrd;Z)V")
    public static final void method11(class188 arg0, boolean arg1) {
        for (int var2 = 0; var2 < class63.field1047.length; var2++) {
            class63.field1047[var2] = 0;
        }
        field31++;
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class63.field1047[var16] = (int) (Math.random() * 256.0D);
        }
        if (!arg1) {
            return;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class189.field3493[var15] = (class63.field1047[var15 - 128] + class63.field1047[var15 - 1] + class63.field1047[var15 + 1] + class63.field1047[var15 - -128]) / 4;
                }
            }
            int[] var13 = class63.field1047;
            class63.field1047 = class189.field3493;
            class189.field3493 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field1480; var7++) {
            for (int var8 = 0; var8 < arg0.field1484; var8++) {
                if (arg0.field3477[var6++] != 0) {
                    int var9 = arg0.field1487 + var8 + 16;
                    int var10 = var7 + arg0.field1483 + 16;
                    int var11 = (var10 << 7) + var9;
                    class63.field1047[var11] = 0;
                }
            }
        }
    }
}
