import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class211 {

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    private int field3635 = 0;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    private int field3640 = -1;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lmb;")
    public static class96 field3628 = class243.method1708("<col=ffffff>", (byte) 97);

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[Lmb;")
    public static class96[] field3634 = new class96[1000];

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field3639 = 0;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lmb;")
    public static class96 field3629 = class243.method1708("::tele ", (byte) 121);

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
    public static int[] field3631 = new int[4096];

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field3642;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public int field3645;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Ljk;")
    public static class236 field3638;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lrg;II)V")
    public final void method1464(class239 arg0, int arg1, int arg2) {
        field3644++;
        if (arg1 != -24736) {
            method1468(-59);
        }
        while (true) {
            int var4 = arg0.method1651(4139);
            if (var4 == 0) {
                return;
            }
            this.method1470(arg0, 9709, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static final void method1465(int arg0) {
        class272.field4733 = null;
        class48.field857 = null;
        class247.field4276 = null;
        class162.field2889 = null;
        class233.field4003 = null;
        class169.field2969 = null;
        class27.field462 = null;
        class214.field3688 = null;
        class10.field175 = null;
        field3637++;
        if (arg0 == -3) {
            class54.field939 = null;
            class154.field2713 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Z")
    public static final boolean method1466(int arg0) {
        field3647++;
        if (class134.field2412) {
            try {
                if ((Boolean) class253.field4379.method692(class234.field4017.field2277, Integer.MAX_VALUE)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 16741706) {
            method1466(58);
        }
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method1467(byte arg0) {
        field3631 = null;
        field3628 = null;
        field3629 = null;
        field3638 = null;
        if (arg0 < 119) {
            method1469(true);
        }
        field3634 = null;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public static final void method1468(int arg0) {
        if (arg0 != -10681) {
            field3646 = -23;
        }
        field3649++;
        for (class251 var1 = (class251) class175.field3048.method1811(2); var1 != null; var1 = (class251) class175.field3048.method1810(false)) {
            if (var1.field4353 == -1) {
                var1.field4354 = 0;
                class75.method548(false, var1);
            } else {
                var1.method1743((byte) 72);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static final void method1469(boolean arg0) {
        class17.field252 = new class262();
        field3632++;
        if (!arg0) {
            method1466(66);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lrg;III)V")
    private final void method1470(class239 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 9709) {
            return;
        }
        field3636++;
        if (arg2 == 1) {
            this.field3635 = arg0.method1660(-335289648);
            this.method1471(255, this.field3635);
        } else if (arg2 == 2) {
            this.field3640 = arg0.method1663((byte) 104);
            if (this.field3640 == 65535) {
                this.field3640 = -1;
                return;
            }
        } else if (arg2 == 3) {
            arg0.method1663((byte) -119);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
    private final void method1471(int arg0, int arg1) {
        double var3 = (double) ((arg1 & 0xFF754A) >> 16) / 256.0D;
        double var5 = (double) (arg0 & arg1 >> 8) / 256.0D;
        field3630++;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = var3;
        if (var5 > var3) {
            var13 = var5;
        }
        if (var13 < var7) {
            var13 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var17 < 0.5D) {
                var15 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var9) / (2.0D - var13 - var9);
            }
            if (var3 == var13) {
                var11 = (var5 - var7) / (var13 - var9);
            } else if (var5 == var13) {
                var11 = (var7 - var3) / (var13 - var9) + 2.0D;
            } else if (var7 == var13) {
                var11 = (var3 - var5) / (var13 - var9) + 4.0D;
            }
        }
        this.field3642 = (int) (var15 * 256.0D);
        double var19 = var11 / 6.0D;
        if (this.field3642 < 0) {
            this.field3642 = 0;
        } else if (this.field3642 > 255) {
            this.field3642 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3648 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3648 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3648 < 1) {
            this.field3648 = 1;
        }
        this.field3645 = (int) ((double) this.field3648 * var19);
        this.field3633 = (int) (var17 * 256.0D);
        if (this.field3633 < 0) {
            this.field3633 = 0;
        } else if (this.field3633 > 255) {
            this.field3633 = 255;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3631[var0] = class21.method151(var0, 1880702124);
        }
    }
}
