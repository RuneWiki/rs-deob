import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class168 {

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Leh;")
    public class362 field2642 = new class362();

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "Leh;")
    private class362 field2650;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lda;")
    public static class60 field2634;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lin;")
    public static class91 field2631;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field2639;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[[Lbp;")
    public static class387[][] field2643;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Luh;B)V")
    public final void method1262(class168 arg0, byte arg1) {
        if (arg1 != -115) {
            this.method1269(-53);
        }
        this.method1263(this.field2642.field5207, false, arg0);
        field2648++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Leh;ZLuh;)V")
    private final void method1263(class362 arg0, boolean arg1, class168 arg2) {
        field2633++;
        class362 var4 = this.field2642.field5208;
        this.field2642.field5208 = arg0.field5208;
        arg0.field5208.field5207 = this.field2642;
        if (this.field2642 != arg0) {
            arg0.field5208 = arg2.field2642.field5208;
            arg0.field5208.field5207 = arg0;
            arg2.field2642.field5208 = var4;
            var4.field5207 = arg2.field2642;
        }
        if (arg1) {
            field2631 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Leh;")
    public final class362 method1264(byte arg0) {
        field2637++;
        if (arg0 < 29) {
            this.field2650 = null;
        }
        class362 var2 = this.field2650;
        if (this.field2642 == var2) {
            this.field2650 = null;
            return null;
        } else {
            this.field2650 = var2.field5207;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(FF[FIIZIIIIF[FII)V")
    public static final void method1265(float arg0, float arg1, float[] arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, float arg10, float[] arg11, int arg12, int arg13) {
        field2646++;
        int var14 = arg8 - arg7;
        int var15 = arg3 - arg4;
        int var16 = arg9 - arg12;
        float var17 = arg2[2] * (float) var15 + arg2[1] * (float) var16 + arg2[0] * (float) var14;
        float var18 = arg2[5] * (float) var15 + arg2[3] * (float) var14 + arg2[4] * (float) var16;
        float var19 = arg2[8] * (float) var15 + arg2[6] * (float) var14 + arg2[7] * (float) var16;
        float var20;
        float var21;
        if (arg13 == 0) {
            var21 = arg1 + var17 + 0.5F;
            var20 = arg0 + 0.5F - var19;
        } else if (arg13 == 1) {
            var20 = arg0 + var19 + 0.5F;
            var21 = arg1 + var17 + 0.5F;
        } else if (arg13 == 2) {
            var21 = arg1 + 0.5F - var17;
            var20 = arg10 + 0.5F - var18;
        } else if (arg13 == 3) {
            var20 = arg10 + 0.5F - var18;
            var21 = arg1 + var17 + 0.5F;
        } else if (arg13 == 4) {
            var21 = arg0 + var19 + 0.5F;
            var20 = arg10 + 0.5F - var18;
        } else {
            var21 = arg0 + 0.5F - var19;
            var20 = arg10 + 0.5F - var18;
        }
        if (arg6 == 1) {
            float var22 = var21;
            var21 = -var20;
            var20 = var22;
        } else if (arg6 == 2) {
            var20 = -var20;
            var21 = -var21;
        } else if (arg6 == 3) {
            float var23 = var21;
            var21 = var20;
            var20 = -var23;
        }
        arg11[1] = var20;
        arg11[0] = var21;
        if (arg5) {
            method1265(0.31271333F, 1.5829445F, null, -17, 88, true, -70, -107, 8, 5, -0.347415F, null, -24, -19);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lga;III)V")
    public static final void method1266(class404 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class434.field6208) {
            class384 var4 = class649.field8928[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5573 != null && var4.field5573.method35(-107)) {
                arg0.method33(class44.field982, 0, true, var4.field5573, 0, (byte) -116, class1.field3);
            }
        }
        if (arg3 < class434.field6208) {
            class384 var5 = class649.field8928[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5573 != null && var5.field5573.method35(-92)) {
                arg0.method33(class44.field982, 0, true, var5.field5573, class1.field3, (byte) -128, 0);
            }
        }
        if (arg2 < class434.field6208 && arg3 < class432.field6185) {
            class384 var6 = class649.field8928[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5573 != null && var6.field5573.method35(-107)) {
                arg0.method33(class44.field982, 0, true, var6.field5573, class1.field3, (byte) -117, class1.field3);
            }
        }
        if (arg2 < class434.field6208 && arg3 > 0) {
            class384 var7 = class649.field8928[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5573 != null && var7.field5573.method35(-90)) {
                arg0.method33(class44.field982, 0, true, var7.field5573, -class1.field3, (byte) -116, class1.field3);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Leh;")
    public final class362 method1267(int arg0) {
        field2644++;
        class362 var2 = this.field2642.field5208;
        if (this.field2642 == var2) {
            this.field2650 = null;
            return null;
        }
        this.field2650 = var2.field5208;
        if (arg0 > -65) {
            this.method1267(67);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static void method1268(int arg0) {
        field2643 = null;
        field2639 = null;
        if (arg0 != -13722) {
            method1274(-104, 106, null, null);
        }
        field2631 = null;
        field2634 = null;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Leh;")
    public final class362 method1269(int arg0) {
        if (arg0 != 4) {
            this.method1275(null, -30);
        }
        field2640++;
        class362 var2 = this.field2642.field5207;
        if (this.field2642 == var2) {
            this.field2650 = null;
            return null;
        } else {
            this.field2650 = var2.field5207;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public final void method1270(int arg0) {
        if (arg0 <= 97) {
            return;
        }
        field2647++;
        while (true) {
            class362 var2 = this.field2642.field5207;
            if (this.field2642 == var2) {
                this.field2650 = null;
                return;
            }
            var2.method2314((byte) 24);
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)Leh;")
    public final class362 method1271(int arg0) {
        field2649++;
        if (arg0 != 8) {
            field2643 = null;
        }
        class362 var2 = this.field2642.field5207;
        if (this.field2642 == var2) {
            return null;
        } else {
            var2.method2314((byte) 114);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)I")
    public final int method1272(int arg0) {
        field2641++;
        int var2 = arg0;
        class362 var3 = this.field2642.field5207;
        while (this.field2642 != var3) {
            var3 = var3.field5207;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Leh;I)V")
    public final void method1273(class362 arg0, int arg1) {
        if (arg0.field5208 != null) {
            arg0.method2314((byte) 91);
        }
        field2636++;
        arg0.field5207 = this.field2642;
        arg0.field5208 = this.field2642.field5208;
        arg0.field5208.field5207 = arg0;
        if (arg1 != -20180) {
            this.method1275(null, -94);
        }
        arg0.field5207.field5208 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILjava/awt/Canvas;Ld;)Lha;")
    public static final class59 method1274(int arg0, int arg1, Canvas arg2, class152 arg3) {
        field2632++;
        if (arg0 != 3) {
            method1266(null, -40, 69, -1);
        }
        return new class22(arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Leh;I)V")
    public final void method1275(class362 arg0, int arg1) {
        field2638++;
        if (arg0.field5208 != null) {
            arg0.method2314((byte) 63);
        }
        arg0.field5208 = this.field2642;
        arg0.field5207 = this.field2642.field5207;
        if (arg1 > -89) {
            field2634 = null;
        }
        arg0.field5208.field5207 = arg0;
        arg0.field5207.field5208 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)Z")
    public final boolean method1276(byte arg0) {
        if (arg0 != 18) {
            field2643 = null;
        }
        field2635++;
        return this.field2642.field5207 == this.field2642;
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)Leh;")
    public final class362 method1277(int arg0) {
        field2645++;
        class362 var2 = this.field2650;
        if (this.field2642 == var2) {
            this.field2650 = null;
            return null;
        } else {
            int var3 = -111 / ((arg0 + 88) / 38);
            this.field2650 = var2.field5208;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class168() {
        this.field2642.field5208 = this.field2642;
        this.field2642.field5207 = this.field2642;
    }
}
