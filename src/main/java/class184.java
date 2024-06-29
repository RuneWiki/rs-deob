import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class184 extends class273 {

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    private int field2825 = 3072;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    private int field2819 = 2048;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    private int field2824 = 1024;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "[S")
    public static short[] field2814 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lrg;")
    public static class70 field2816;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "[[B")
    public static byte[][] field2827;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Lwf;I)V", line = 5)
    public static final void method1267(class306 arg0, int arg1) {
        class15.field160 = arg0;
        if (arg1 != 2) {
            method1268((byte) -44, 35);
        }
        field2815++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V", line = 21)
    public static final void method1268(byte arg0, int arg1) {
        field2822++;
        if (arg0 != 125) {
            method1269(37, (class207) null, -43, -16, 126);
        }
        class71.field1063 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILjh;III)V", line = 32)
    public static final void method1269(int arg0, class207 arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 2) {
            method1269(16, (class207) null, 122, 105, -66);
        }
        if (class333.field5166) {
            class238.method1633(arg3, arg4, arg1.field3169 + arg3, arg1.field3239 + arg4);
        }
        if (class278.field4288 < 3) {
            if (class333.field5166) {
                ((class186) class332.field5133).method1273(arg3, arg4, arg1.field3169, arg1.field3239, class332.field5133.field3847 / 2, class332.field5133.field3844 / 2, (int) class123.field1922, 256, (class186) arg1.method1396(72, false));
            } else {
                ((class178) class332.field5133).method924(arg3, arg4, arg1.field3169, arg1.field3239, class332.field5133.field3847 / 2, class332.field5133.field3844 / 2, (int) class123.field1922, 256, arg1.field3160, arg1.field3281);
            }
        } else if (class333.field5166) {
            class245 var5 = arg1.method1396(109, false);
            if (var5 != null) {
                var5.method921(arg3, arg4);
            }
        } else {
            class57.method378(arg3, arg4, 0, arg1.field3160, arg1.field3281);
        }
        class19.field267[arg2] = true;
        field2828++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I", line = 74)
    public final int[] method331(int arg0, int arg1) {
        field2818++;
        if (arg1 != -14650) {
            method1269(19, (class207) null, -103, -22, -23);
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, arg0, 0);
            for (int var5 = 0; var5 < class27.field346; var5++) {
                var3[var5] = (var4[var5] * this.field2819 >> 12) + this.field2824;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 112)
    public static void method1270(int arg0) {
        field2816 = null;
        field2827 = (byte[][]) null;
        field2814 = null;
        int var1 = -59 % ((-arg0 - 4) / 59);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 126)
    public final void method349(int arg0) {
        field2817++;
        this.field2819 = this.field2825 - this.field2824;
        if (arg0 != 1) {
            method1267((class306) null, -61);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 140)
    public class184() {
        super(1, false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BILgn;)V", line = 147)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field2820++;
        if (arg0 < 27) {
            this.method170(49, (byte) 57);
        }
        if (arg1 == 0) {
            this.field2824 = arg2.method1994(false);
        } else if (arg1 == 1) {
            this.field2825 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field4194 = arg2.method2043((byte) -125) == 1;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)[[I", line = 198)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            field2827 = (byte[][]) ((byte[][]) null);
        }
        field2823++;
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int[][] var4 = this.method1795(arg0, -128, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class27.field346; var11++) {
                var7[var11] = this.field2824 + (var5[var11] * this.field2819 >> 12);
                var6[var11] = (var8[var11] * this.field2819 >> 12) + this.field2824;
                var10[var11] = (var9[var11] * this.field2819 >> 12) + this.field2824;
            }
        }
        return var3;
    }
}
