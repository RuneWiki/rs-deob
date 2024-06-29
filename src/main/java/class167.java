import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class167 {

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ln;")
    public class472 field2262;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2265 = 1;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lqp;")
    public static class586 field2259 = new class586(80, 2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1000(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method351(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lrr;")
    public abstract class374 method287();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
    public abstract void method1008(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
    public abstract void method1015(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
    public abstract void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method307(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
    public abstract void method985();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lbt;IIII)Lr;")
    public abstract class520 method954(class114 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
    public abstract void method972(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method1043(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
    public abstract boolean method988();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
    public abstract boolean method1030();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lm;)V")
    public abstract void method999(class105 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method280(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lpa;")
    public abstract class594 method1028(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
    public abstract int[] method327(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
    public abstract void method1016(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
    public abstract void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
    public abstract int method1018();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqr;Z)Lha;")
    public abstract class116 method961(class610 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
    public abstract int method960();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
    public abstract void method966(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public abstract int method311();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Loaa;)V")
    public abstract void method989(class510 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lr;Loaa;Lm;Lgr;I)V")
    public abstract void method1005(class520 arg0, class510 arg1, class105 arg2, class525 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public final void method1061(int arg0) {
        field2258++;
        class449.field6575[this.field2264] = false;
        this.method298();
        if (arg0 <= 92) {
            field2265 = -112;
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()Lm;")
    public abstract class105 method1038();

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
    public abstract void method1003(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
    public abstract void method1037(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
    public abstract void method1017();

    @OriginalMember(owner = "client!qa", name = "ra", descriptor = "()F")
    public abstract float method1041();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
    public abstract boolean method1012();

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
    public abstract boolean method278();

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
    public abstract boolean method984();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method970(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method978(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
    public abstract void method1034();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILjava/awt/Canvas;Ldda;Ln;I)Lqa;")
    public static final synchronized class167 method1062(int arg0, int arg1, Canvas arg2, class597 arg3, class472 arg4, int arg5) {
        field2269++;
        if (arg5 == 0) {
            return class3.method15(arg2, -127, false, arg4);
        } else if (arg5 == 2) {
            return class639.method3700(arg4, arg0, arg2);
        } else if (arg5 == 4) {
            return class3.method15(arg2, 64, true, arg4);
        } else if (arg5 == 1) {
            return class102.method591((byte) 94, arg1, arg2, arg4);
        } else if (arg5 == 5) {
            return class259.method1634((byte) -77, arg3, arg1, arg2, arg4);
        } else if (arg5 == 3) {
            return class12.method59(-13650, arg2, arg3, arg4, arg1);
        } else {
            if (arg0 != 0) {
                field2259 = null;
            }
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lr;Loaa;Lm;[Lgr;I)V")
    public abstract void method958(class520[] arg0, class510 arg1, class105 arg2, class525[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()V")
    public abstract void method313();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILpa;II)V")
    public abstract void method996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lu;")
    public abstract class425 method1013(int arg0);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
    public abstract void method288() throws class477;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()Lm;")
    public abstract class105 method1020();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method976();

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public abstract boolean method955();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method968(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;IILos;)Lku;")
    public static final class494 method1063(String arg0, int arg1, int arg2, class468 arg3) {
        field2263++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramStringARB(arg1, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class489.field7403, 0);
        if (class489.field7403[0] != -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
        OpenGL.glBindProgramARB(arg1, 0);
        if (arg2 < 17) {
            field2259 = null;
        }
        return new class494(arg3, arg1, var4);
    }

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
    public abstract boolean method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Llh;")
    public abstract class125 method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
    public abstract void method303();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method1064(byte arg0) {
        field2259 = null;
        if (arg0 != -50) {
            method1063(null, 6, 17, null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
    public abstract void method993(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public abstract boolean method345();

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
    public abstract void method987(float arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method953(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
    public abstract void method1009(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Llh;Llh;FLlh;)Llh;")
    public abstract class125 method332(class125 arg0, class125 arg1, float arg2, class125 arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lr;Lm;[Lgr;I)V")
    public abstract void method967(class520[] arg0, class105 arg1, class525[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public abstract void method981(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
    public final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 62 % ((arg3 + 49) / 48);
        field2267++;
        this.method983(arg4, arg5, arg1, arg0, arg2, 1);
    }

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
    public abstract int method1024();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lha;")
    public abstract class116 method982(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V")
    public abstract void method971(class425 arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method964(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIIIII)V")
    public final void method1066(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 44) {
            this.field2264 = 57;
        }
        field2260++;
        this.method980(arg3, arg1, arg5, arg4, arg2, 1);
    }

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()I")
    public abstract int method994();

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
    public abstract boolean method1031();

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()V")
    public abstract void method298();

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method1061(114);
        field2271++;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ln;)V")
    public class167(class472 arg0) {
        this.field2262 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class449.field6575[var3]) {
                class449.field6575[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field2264 = var2;
    }

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
    public abstract void method322();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1023(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method992(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Llh;)V")
    public abstract void method962(class125 arg0);

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
    public abstract void method321(int arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIII)V")
    public final void method1067(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1032(arg5, arg4, arg0, arg3, arg2, 1);
        field2270++;
        if (arg1 != -55) {
            this.method985();
        }
    }

    @OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
    public abstract void method1021(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public abstract void method286();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lat;)V")
    public abstract void method1045(int arg0, class535[] arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method354(Rectangle[] arg0, int arg1) throws class477;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
    public abstract boolean method1007();

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public abstract boolean method977();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
    public final void method1068(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2268++;
        this.method1015(arg3, arg2, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "()F")
    public abstract float method957();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
    public abstract int method1029();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method347(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method1026(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final void method1069(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2266++;
        this.method966(arg3, arg2, arg0, arg1, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lha;")
    public abstract class116 method1040(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method973();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public abstract void method1044(int arg0);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
    public abstract boolean method1002();

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
    public abstract void method1022(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()V")
    public abstract void method341();

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILpa;II)V")
    public abstract void method956(int arg0, class594 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lat;")
    public abstract class535 method995(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
    public abstract void method974(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldd;[Lqr;Z)Lra;")
    public abstract class262 method998(class166 arg0, class610[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V")
    public final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2261++;
        this.method1003(arg3, arg2, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
    public abstract boolean method986();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class543 method965(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "()Z")
    public abstract boolean method1006();

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
    public abstract void method1019(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
    public abstract void method979(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
    public abstract void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
    public abstract void method1025(int[] arg0);
}
