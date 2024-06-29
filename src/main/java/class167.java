import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class167 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lfa;")
    public class214 field2768;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lqfa;")
    public static class85 field2774 = new class85(6, -1);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lsb;")
    public static class266 field2786 = new class266(18, 4);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    public static int[] field2770;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public abstract void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILfa;ILom;Ljava/awt/Canvas;)Lr;")
    public static final synchronized class167 method1260(int arg0, int arg1, class214 arg2, int arg3, class344 arg4, Canvas arg5) {
        field2776++;
        if (arg3 == 0) {
            return class336.method2166(arg2, arg1 + 25863, arg5);
        } else if (arg3 == 2) {
            return class9.method271(arg5, arg2, (byte) 104);
        } else {
            if (arg1 != 0) {
                method1269(-37, 33, (byte) 21);
            }
            if (arg3 == 1) {
                return class485.method2927(arg5, -581, arg2, arg0);
            } else if (arg3 == 5) {
                return class136.method1119(arg2, arg0, arg1 + 8, arg5, arg4);
            } else if (arg3 == 3) {
                return class671.method3789(-19759, arg5, arg0, arg2, arg4);
            } else {
                throw new IllegalArgumentException("UM");
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ldaa;[Lvw;Z)Lla;")
    public abstract class421 method160(class11 arg0, class279[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Lq;")
    public abstract class396 method169();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public abstract void method134(int arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Lq;")
    public abstract class396 method53();

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method66();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class702 method186(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method27(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
    public final void method1261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2784++;
        if (arg1 != 25552) {
            field2770 = null;
        }
        this.method108(arg4, arg5, arg3, arg0, arg2, 1);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
    public abstract boolean method173();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
    public abstract boolean method159();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljs;)V")
    public abstract void method165(class304 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lff;)V")
    public abstract void method75(int arg0, class9[] arg1);

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method28();

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method114();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2772++;
        if (arg0 <= 54) {
            field2786 = null;
        }
        this.method85(arg1, arg3, arg4, arg2, 1);
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
    public abstract void method111();

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method144(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method50(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
    public abstract boolean method127();

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()V")
    public abstract void method2();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method146(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method119(int[] arg0);

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method116();

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()I")
    public abstract int method151();

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()Lq;")
    public abstract class396 method168();

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
    public abstract boolean method98();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()Z")
    public abstract boolean method171();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method185(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lff;")
    public abstract class9 method139(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()V")
    public abstract void method40();

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
    public abstract boolean method17();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljs;Ljs;FLjs;)Ljs;")
    public abstract class304 method89(class304 arg0, class304 arg1, float arg2, class304 arg3);

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method131(int[] arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class619 method158(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public abstract int method35(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
    public abstract void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()V")
    public abstract void method94();

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
    public abstract boolean method12();

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method107();

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method59();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method69(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method62(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method120(int arg0, class619 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
    public abstract boolean method147();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
    public final void method1263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2781++;
        this.method41(arg4, arg3, arg0, arg2, arg5, 1);
        if (arg1 != 256) {
            this.method142(13, 104, 49, 116);
        }
    }

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method102();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;I)V")
    public final void method1264(class702 arg0, int arg1) {
        if (arg1 != 0) {
            this.field2768 = null;
        }
        field2779++;
        this.method132(arg0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfi;I)V")
    public abstract void method72(class518 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method180(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
    public abstract void method106();

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method48(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lnda;IIII)Lda;")
    public abstract class55 method37(class519 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public final void method1265(byte arg0) {
        field2775++;
        class403.field5830[this.field2783] = false;
        this.method40();
        if (arg0 != -67) {
            this.method64(38);
        }
    }

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
    public abstract boolean method181();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static void method1266(int arg0) {
        field2770 = null;
        field2774 = null;
        field2786 = null;
        if (arg0 != -1) {
            field2774 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method11(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method64(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method23(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method86();

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method1265((byte) -67);
        field2778++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class702 method182(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
    public final void method1267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2771++;
        this.method4(arg4, arg0, arg3, arg1, arg5, arg2);
    }

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()Lmp;")
    public abstract class706 method19();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method145(class396 arg0);

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method42(int arg0);

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method93(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
    public static final boolean method1268(int arg0, int arg1, int arg2) {
        if (arg2 <= 18) {
            method1260(59, -8, null, 85, null, null);
        }
        field2777++;
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method39(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfi;)V")
    public abstract void method123(class518 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method132(class702 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method81(boolean arg0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public abstract void method177(int arg0);

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()Z")
    public abstract boolean method74();

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)Le;")
    public abstract class495 method32(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method163(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1269(int arg0, int arg1, byte arg2) {
        if (arg2 >= -43) {
            method1260(41, -21, null, 63, null, null);
        }
        field2769++;
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method95(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method109();

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
    public abstract void method63() throws class105;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class702 method54(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method46(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method126(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBI)V")
    public final void method1270(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -32) {
            this.field2768 = null;
        }
        field2782++;
        this.method126(arg0, arg4, arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method178(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method84(class495 arg0);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()V")
    public abstract void method103();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method34(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()V")
    public abstract void method174();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvw;Z)Lf;")
    public abstract class702 method170(class279 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public abstract void method52(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method29(Rectangle[] arg0, int arg1) throws class105;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(IIIIII)Ljs;")
    public abstract class304 method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method44(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class37 method113(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()Z")
    public abstract boolean method25();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        client.field4115 = arg4;
        class704.field9911 = arg3;
        class309.field4556 = arg2;
        if (arg0 == 0) {
            field2780++;
            class379.field5612 = arg1;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method149();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIII)V")
    public final void method1272(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 18) {
            field2774 = null;
        }
        this.method69(arg1, arg4, arg2, arg3, 1);
        field2773++;
    }

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method143(float arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method140(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method152(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method122(int arg0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method85(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
    public abstract boolean method162();

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
    public abstract boolean method31();

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V")
    public class167(class214 arg0) {
        this.field2768 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class403.field5830[var3]) {
                var2 = var3;
                class403.field5830[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field2783 = var2;
    }

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method142(int arg0, int arg1, int arg2, int arg3);
}
