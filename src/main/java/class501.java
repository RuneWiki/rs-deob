import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class501 extends class766 {

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Ltm;")
    private class412 field6913 = new class412();

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    private int field6930 = 0;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    private int field6933 = 256;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    private int field6931 = 256;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    private int field6928;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "[[Z")
    public static boolean[][] field6917 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    private int field6934;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "Z")
    private boolean field6929;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "Z")
    private boolean field6932;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IDI)Lqg;")
    public final class490 method2891(int arg0, double arg1, int arg2) {
        field6912++;
        long var5 = (long) (arg2 | this.field6928 << 0);
        if (arg0 != 12398) {
            return null;
        }
        class490 var7 = (class490) class545.field7383.method713(var5, 82);
        if (var7 == null) {
            var7 = new class490(new short[this.field6928][arg2], arg1);
        } else {
            var7.field6798 = arg1;
            class545.field7383.method716(var5, arg0 - 12398);
        }
        return var7;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()I")
    public final int method591() {
        field6927++;
        return 1;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()Lsia;")
    public final class766 method592() {
        field6916++;
        return null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V")
    public final void method2892(int arg0, byte arg1) {
        field6924++;
        this.field6933 = arg0;
        if (arg1 < -3) {
            this.field6931 = arg0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public final synchronized void method596(int arg0) {
        field6920++;
        if (this.field6932) {
            return;
        }
        while (true) {
            class490 var2 = this.method2901(-16087);
            if (var2 == null) {
                if (this.field6929) {
                    this.method792((byte) -115);
                    class545.field7383.method718((byte) 123);
                }
                return;
            }
            if (arg0 < var2.field6802[0].length - this.field6934) {
                this.field6934 += arg0;
                return;
            }
            arg0 -= var2.field6802[0].length - this.field6934;
            this.method2903(1);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I")
    public final synchronized int method2893(byte arg0) {
        field6914++;
        return arg0 > -82 ? -95 : this.field6930;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([III)V")
    public final synchronized void method593(int[] arg0, int arg1, int arg2) {
        field6915++;
        if (this.field6932) {
            return;
        }
        if (this.method2901(-16087) != null) {
            int var4 = arg1 + arg2;
            if (class418.field6010) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field6928 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class490 var7 = this.method2901(-16087);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field6802;
                while (arg1 < var4 && var8[0].length > this.field6934) {
                    if (class418.field6010) {
                        arg0[arg1++] = var8[var5][this.field6934] * this.field6931;
                        arg0[arg1++] = var8[var6][this.field6934] * this.field6933;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field6934] * this.field6931 + (var8[var6][this.field6934] * this.field6933);
                    }
                    this.field6934++;
                }
                if (this.field6934 >= var8[0].length) {
                    this.method2903(1);
                }
            }
        } else if (this.field6929) {
            this.method792((byte) -103);
            class545.field7383.method718((byte) 126);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
    public final synchronized void method2894(int arg0) {
        this.field6929 = true;
        if (arg0 == -15521) {
            field6919++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)Ljd;")
    public static final class243 method2895(int arg0, int arg1, int arg2) {
        if (class626.field8501[arg0][arg1][arg2] == null) {
            boolean var3 = class626.field8501[0][arg1][arg2] != null && class626.field8501[0][arg1][arg2].field3281 != null;
            if (var3 && arg0 >= class315.field4541 - 1) {
                return null;
            }
            class712.method3981(arg0, arg1, arg2);
        }
        return class626.field8501[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)V")
    public static void method2896(byte arg0) {
        field6917 = null;
        if (arg0 < 30) {
            method2896((byte) 32);
        }
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(B)V")
    public static final void method2897(byte arg0) {
        class561.field7542 = new class252(8);
        if (arg0 != 50) {
            field6917 = null;
        }
        field6921++;
        class274.field4068 = 0;
        for (class663 var1 = (class663) class270.field3980.method109(0); var1 != null; var1 = (class663) class270.field3980.method115((byte) 22)) {
            var1.method3665();
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILqg;)V")
    public final synchronized void method2898(int arg0, class490 arg1) {
        while (this.field6930 >= 100) {
            this.field6913.method2543(-15114);
            this.field6930--;
        }
        if (arg0 < -83) {
            field6910++;
            this.field6913.method2545(-128, arg1);
            this.field6930++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)D")
    public final synchronized double method2899(int arg0) {
        field6923++;
        if (this.field6930 < 1) {
            return -1.0D;
        }
        class490 var2 = (class490) this.field6913.method2551((byte) -108);
        if (arg0 == 0) {
            return var2 == null ? -1.0D : var2.field6798 - (double) ((float) var2.field6802[0].length / (float) class386.field5629);
        } else {
            return -0.4574878406902042D;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()Lsia;")
    public final class766 method595() {
        field6911++;
        return null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BC)Z")
    public static final boolean method2900(byte arg0, char arg1) {
        if (arg0 <= 107) {
            method2897((byte) 16);
        }
        field6918++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)Lqg;")
    private final synchronized class490 method2901(int arg0) {
        field6926++;
        return arg0 == -16087 ? (class490) this.field6913.method2551((byte) -108) : null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V")
    public final synchronized void method2902(boolean arg0, int arg1) {
        field6925++;
        this.field6932 = arg0;
        if (arg1 <= 107) {
            this.field6929 = true;
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
    private final synchronized void method2903(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field6922++;
        class490 var2 = this.method2901(-16087);
        if (var2 != null) {
            var2.method792((byte) -110);
            this.field6934 = 0;
            this.field6930--;
            class545.field7383.method717(var2, 104, var2.method2849(-78));
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(I)V")
    public class501(int arg0) {
        this.field6928 = arg0;
    }
}
