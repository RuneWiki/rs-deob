import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class167 {

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Ln;")
    public class473 field2114;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2109 = -1;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[B")
    public static byte[] field2111 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lpaa;")
    public static class317 field2117 = new class317(14, 4);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "[I")
    public static int[] field2120 = new int[5];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Lra;")
    public static class262 field2119;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILjava/awt/Canvas;ZLkr;Ln;)Lqa;")
    public static final synchronized class167 method904(int arg0, int arg1, Canvas arg2, boolean arg3, class329 arg4, class473 arg5) {
        if (!arg3) {
            method942((byte) -48, null);
        }
        field2112++;
        if (arg0 == 0) {
            return class292.method1795(arg5, arg2, false, 0);
        } else if (arg0 == 2) {
            return class615.method3527(-104, arg5, arg2);
        } else if (arg0 == 4) {
            return class292.method1795(arg5, arg2, true, 0);
        } else if (arg0 == 1) {
            return class262.method1622(arg5, -1698792760, arg1, arg2);
        } else if (arg0 == 5) {
            return class126.method678(arg5, 8, arg4, arg2, arg1);
        } else if (arg0 == 3) {
            return class417.method2477(false, arg5, arg4, arg1, arg2);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
    public abstract void method905(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
    public final void method906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2106++;
        this.method935(arg2, arg5, arg0, arg3, arg4, arg1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method907(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method203(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method908(byte arg0) {
        field2119 = null;
        field2120 = null;
        if (arg0 > -30) {
            field2119 = null;
        }
        field2111 = null;
        field2117 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIII)V")
    public final void method909(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0) {
            this.field2114 = null;
        }
        field2105++;
        this.method952(arg3, arg4, arg1, arg2, 1);
    }

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
    public abstract void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public abstract void method911();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
    public abstract boolean method912();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method913(Rectangle[] arg0, int arg1) throws class487;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
    public abstract int method914();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
    public abstract boolean method915();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class544 method200(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lig;Z)Lha;")
    public abstract class116 method916(class295 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
    public abstract boolean method917();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method918(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBII)V")
    public final void method919(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        this.method995(arg0, arg5, arg2, arg1, arg4, 1);
        if (arg3 != 0) {
            this.field2114 = null;
        }
        field2108++;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public final void method920(int arg0) {
        class568.field7952[this.field2115] = false;
        int var2 = -11 / ((-arg0 - 85) / 33);
        field2113++;
        this.method945();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method921(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method201(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Lrn;")
    public abstract class307 method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
    public abstract void method923(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
    public abstract boolean method924();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V")
    public abstract void method925(class425 arg0);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
    public abstract void method926(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lrn;)V")
    public abstract void method927(class307 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILpa;II)V")
    public abstract void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
    public abstract int method929();

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILpa;II)V")
    public abstract void method930(int arg0, class594 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method198(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lrn;Lrn;FLrn;)Lrn;")
    public abstract class307 method931(class307 arg0, class307 arg1, float arg2, class307 arg3);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public abstract void method932(int arg0);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
    public abstract void method933();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
    public abstract void method934() throws class487;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
    public abstract void method936();

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public abstract void method194(int arg0);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
    public abstract boolean method937();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method938(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
    public abstract void method939(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
    public abstract void method940(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method941();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method942(byte arg0, String arg1) {
        if (arg0 < 39) {
            method904(58, -45, null, false, null, null);
        }
        System.exit(1);
        field2110++;
    }

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
    public abstract void method943(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
    public abstract boolean method944();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()V")
    public abstract void method945();

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public abstract int method946();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lr;Lkw;Lm;Leca;I)V")
    public abstract void method947(class521 arg0, class174 arg1, class105 arg2, class378 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
    public abstract void method948();

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
    public abstract void method949(int arg0);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
    public abstract int[] method950(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method951();

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method920(-119);
        field2104++;
    }

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
    public abstract void method952(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
    public abstract void method953(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
    public abstract int method954();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lww;")
    public abstract class592 method955(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lm;)V")
    public abstract void method956(class105 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkw;)V")
    public abstract void method957(class174 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
    public abstract int method958();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method959(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public abstract boolean method960();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
    public abstract void method961(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
    public abstract void method962();

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
    public abstract boolean method963();

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Lm;")
    public abstract class105 method964();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lr;Lm;[Leca;I)V")
    public abstract void method202(class521[] arg0, class105 arg1, class378[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
    public abstract int method965();

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method966();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
    public final void method967(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method943(arg3, arg0, arg4, arg1, 1);
        field2118++;
        int var6 = -54 / ((-arg2 - 41) / 50);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method968(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lha;")
    public abstract class116 method969(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
    public abstract boolean method970();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Lu;")
    public abstract class425 method971(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lww;)V")
    public abstract void method972(int arg0, class592[] arg1);

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
    public abstract void method973(int arg0);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
    public final void method974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method997(arg3, arg5, arg4, arg2, arg0, arg1);
        field2116++;
    }

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
    public abstract boolean method975();

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
    public abstract boolean method195();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lha;")
    public abstract class116 method976(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
    public abstract void method977(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()V")
    public abstract void method978();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
    public abstract void method979(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
    public abstract void method980(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
    public abstract void method981(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpe;[Lig;Z)Lra;")
    public abstract class262 method982(class157 arg0, class295[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method983(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method984(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lpa;")
    public abstract class594 method985(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method986(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Lm;")
    public abstract class105 method987();

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Lqf;")
    public abstract class183 method988();

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ln;)V")
    public class167(class473 arg0) {
        this.field2114 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class568.field7952[var3]) {
                class568.field7952[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field2115 = var2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method989(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method187(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method990();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfp;IIII)Lr;")
    public abstract class521 method197(class528 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
    public abstract void method991(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
    public abstract boolean method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
    public abstract void method993(float arg0);

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
    public abstract void method994();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
    public abstract void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lr;Lkw;Lm;[Leca;I)V")
    public abstract void method193(class521[] arg0, class174 arg1, class105 arg2, class378[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "()V")
    public abstract void method996();

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
    public abstract void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2107++;
        this.method979(arg3, arg4, arg2, arg0, 1);
        if (arg1 != -32192) {
            this.method926(-1.9180268F, 0.021899614F);
        }
    }
}
