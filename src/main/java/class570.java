import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class570 {

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Ld;")
    public class284 field7199;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public int field7205;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field7200 = 0;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "[F")
    public static float[] field7210 = new float[4];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)V", line = 7)
    public final void method3065(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 17) {
            this.method900();
        }
        field7211++;
        this.method936(arg4, arg0, arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIB)V", line = 18)
    public final void method3066(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field7213++;
        if (arg5 >= 119) {
            this.method973(arg2, arg4, arg3, arg1, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLmc;)Laea;", line = 31)
    public static final class275 method3067(byte arg0, class234 arg1) {
        field7203++;
        if (arg0 != -13) {
            field7200 = -68;
        }
        return new class275(arg1.method1542(27067), arg1.method1542(arg0 ^ 0xFFFF9648), arg1.method1542(27067), arg1.method1542(27067), arg1.method1500((byte) -88), arg1.method1500((byte) -66), arg1.method1509(true));
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 44)
    protected void finalize() {
        this.method3072(5);
        field7215++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIIIII)V", line = 93)
    public final void method3068(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7202++;
        this.method921(arg1, arg2, arg3, arg5, arg4, 1);
        if (arg0) {
            field7210 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 104)
    public static void method3069(int arg0) {
        if (arg0 == 0) {
            field7210 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IFIIII[FIII[F)V", line = 121)
    public static final void method3070(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, int arg8, int arg9, float[] arg10) {
        int var11 = arg9 - arg3;
        field7201++;
        int var12 = arg5 - arg4;
        int var13 = arg7 - arg8;
        float var14 = arg10[2] * (float) var12 + arg10[0] * (float) var13 + arg10[1] * (float) var11;
        float var15 = arg10[5] * (float) var12 + arg10[3] * (float) var13 + arg10[4] * (float) var11;
        float var16 = arg10[8] * (float) var12 + arg10[7] * (float) var11 + arg10[6] * (float) var13;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg2 != -13411) {
            return;
        }
        float var19 = arg1 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg0 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg0 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg0 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg6[1] = var19;
        arg6[0] = var18;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;Z)V", line = 216)
    public final void method3071(int arg0, Rectangle[] arg1, boolean arg2) throws class15 {
        this.method931(arg1, arg0, 0, 0);
        field7198++;
        if (!arg2) {
            this.method962();
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 232)
    public final void method3072(int arg0) {
        field7197++;
        if (arg0 != 5) {
            this.method3065(-68, 10, 62, (byte) 113, 41);
        }
        class81.field1151[this.field7205] = false;
        this.method919();
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V", line = 246)
    public final void method3073(int arg0) throws class15 {
        this.method925(arg0, 0);
        field7207++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 272)
    public final void method3074(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 118) {
            field7200 = -95;
        }
        field7209++;
        this.method998(arg0, arg3, arg2, arg4, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBII)V", line = 292)
    public final void method3075(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field7208++;
        if (arg3 != 85) {
            field7195 = 106;
        }
        this.method911(arg0, arg4, arg1, arg2, arg5, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZII)V", line = 311)
    public final void method3076(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            this.method896(arg1, arg4, arg0, arg3, 1);
            field7212++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpu;I)V", line = 328)
    public final void method3077(class772 arg0, int arg1) {
        this.method905(this.method878(arg0, this.method938(arg0.method620(), arg0.method612())));
        if (arg1 != 25183) {
            this.method890(-24, -42, null, null, 107, 57, 28);
        }
        field7196++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII[III)Lpu;", line = 339)
    public final class772 method3078(byte arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field7214++;
        if (arg0 != 71) {
            this.method936(52, -84, 8, -39, -85);
        }
        return this.method885(arg3, arg4, arg5, arg2, arg1, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZILd;IILwm;Ljava/awt/Canvas;)Lha;", line = 365)
    public static final synchronized class570 method3079(int arg0, boolean arg1, int arg2, class284 arg3, int arg4, int arg5, class30 arg6, Canvas arg7) {
        field7206++;
        if (arg4 == 0) {
            return class44.method267(!arg1, arg3, arg5, arg7, arg2);
        } else if (arg4 == 2) {
            return class332.method1919(arg2, arg5, 192, arg3, arg7);
        } else if (arg4 == 1) {
            return class210.method1409(arg0, arg3, arg7, (byte) -65);
        } else if (arg4 == 5) {
            return class628.method3359(arg7, arg0, arg3, arg6, 123);
        } else {
            if (arg1) {
                field7195 = -84;
            }
            if (arg4 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class658.method3585(arg0, arg6, arg7, -10357, arg3);
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 402)
    public class570(class284 arg0) {
        this.field7199 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class81.field1151[var3]) {
                var2 = var3;
                class81.field1151[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field7205 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmd;)V")
    public abstract void method905(class649 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Lfga;")
    public abstract class291 method927();

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method967(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method884(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public abstract int method886(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method906();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method993();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method941(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lne;[Lvi;Z)Lda;")
    public abstract class420 method1002(class166 arg0, class388[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method879();

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method916();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method898(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method987(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method917();

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method946(float arg0);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method907(int arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Loha;")
    public abstract class465 method880();

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method957();

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method997(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loha;)V")
    public abstract void method991(class465 arg0);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()I")
    public abstract int method893();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)Ltea;")
    public abstract class589 method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method985();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lod;")
    public abstract class539 method1001(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method965();

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method949();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lwq;I)V")
    public abstract void method980(class705 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvi;Z)Lpu;")
    public abstract class772 method977(class388 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method924(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lwq;)V")
    public abstract void method912(class705 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method983(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Loha;")
    public abstract class465 method948();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()V")
    public abstract void method919();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltea;)V")
    public abstract void method910(class589 arg0);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method981();

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lpu;")
    public abstract class772 method990(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method883(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method915(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method960();

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
    public abstract void method970();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method943();

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method918();

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method968(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method989(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method931(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class15;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method944(int arg0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method896(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method892(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method984(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method894(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
    public abstract void method925(int arg0, int arg1) throws class15;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
    public abstract boolean method900();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method963(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lgu;")
    public abstract class757 method913(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method937();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method940(int arg0, class596 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method971(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method998(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method929(class270 arg0);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method988(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lgu;)V")
    public abstract void method908(int arg0, class757[] arg1);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method901(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method903();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method889(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method976(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method926();

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method992();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method939(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lpu;")
    public abstract class772 method885(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method899();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lpu;")
    public abstract class772 method955(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class358 method890(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method936(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Lic;")
    public abstract class537 method938(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method950();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method999();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method979(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method923(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method928(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lod;Lic;)Lmd;")
    public abstract class649 method878(class539 arg0, class537 arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method934(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method942(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method888(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method953();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;")
    public abstract class589 method920(class589 arg0, class589 arg1, float arg2, class589 arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method881(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method914();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)Lza;")
    public abstract class270 method975(int arg0);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Loha;")
    public abstract class465 method994();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public abstract void method995(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class596 method947(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
    public abstract void method982(int arg0);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()V")
    public abstract void method962();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
    public abstract void method891();

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method952(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method951();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
    public abstract void method909();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsu;IIII)Lka;")
    public abstract class299 method930(class615 arg0, int arg1, int arg2, int arg3, int arg4);
}
