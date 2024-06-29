import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class692 extends class58 implements class531 {

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Z")
    private boolean field9743 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lbq;")
    private class289 field9740 = new class289();

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    private int field9751 = 4096;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private int field9750 = 4096;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Lpfa;")
    private class295 field9755 = new class295(4);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Z")
    private boolean field9760 = false;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Ldfa;")
    private class165 field9748;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
    private static int[] field9741 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[B")
    private static byte[] field9747 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private static int[] field9752 = field9741;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[I")
    private static int[] field9749 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[S")
    private static short[] field9757 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    public static int[] field9753 = field9741;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
    private static int[] field9746 = field9741;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[I")
    public static int[] field9758 = new int[6];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[F")
    private static float[] field9745 = new float[20];

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[F")
    private static float[] field9754 = field9745;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    private static int[] field9744 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public int field9762;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Ldfa;")
    private class165 field9759;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lp;")
    private class218 field9756;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lya;")
    private class51 field9742;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "[La;")
    private class617[] field9761;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method401(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method432(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method382(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method378(int arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method360(float arg0);

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method436(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method3899();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class617 method3900() {
        for (int var1 = 0; var1 < this.field9762; ++var1) {
            if (this.field9761[var1].field8843 == Thread.currentThread()) {
                return this.field9761[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
    public final boolean method376() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method438(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method398(int arg0);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method363(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public final boolean method421() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class485 method345(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class45(this, this.field9742, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method427(Canvas arg0, int arg1, int arg2) {
        class218 var4 = (class218) this.field9755.method1754(false, (long) arg0.hashCode());
        var4.method1275(arg0, arg1, arg2);
        if (arg0 != null && this.field9756.field2528 == arg0) {
            this.method417(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljj;)V")
    public final void method357(class118 arg0) {
        class609 var2 = (class609) arg0;
        this.method3902(var2.field8643.nativeid, var2.field8644.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method386(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Lhu;")
    public final class131 method324(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class539(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method3901() {
        return new class386(this);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method407(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()V")
    public final void method426() {
        this.method417(this.field9756.field2528);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method375(Canvas arg0) {
        if (this.field9756.field2528 == arg0) {
            this.method417((Canvas) null);
        }
        class218 var2 = (class218) this.field9755.method1754(false, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method864(12983);
            var2.method1274();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lkm;")
    public final class353 method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public final void method415(int arg0) {
        class684.method3875((byte) -124);
        this.method3907(arg0);
        for (class51 var2 = (class51) this.field9740.method1719(65280); var2 != null; var2 = (class51) this.field9740.method1723(-20665)) {
            var2.method295();
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method417(Canvas arg0) {
        if (arg0 != null) {
            class218 var2 = (class218) this.field9755.method1754(false, (long) arg0.hashCode());
            this.field9756 = var2;
            this.method3906(var2);
        } else {
            this.field9756 = null;
            this.method3906((class218) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method3902(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
    public final void method384() {
    }

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method319();

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class692(Canvas arg0, class150 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class79.method555(33, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class684.method3872(false);
                this.method3909(super.field578, 0, 0);
                class246.method1492(false, true, (byte) 122);
                this.field9760 = true;
                this.field9748 = new class276();
                this.method339(new class276());
                this.method390(1);
                this.method392(0);
                if (arg0 != null) {
                    this.method369(arg0, arg2, arg3);
                    this.method417(arg0);
                }
            }
        } catch (Throwable var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method389(int arg0, class485 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method381(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)I")
    public final int method418(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method406();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()I")
    public final int method350() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method3903() {
        System.gc();
        System.runFinalization();
        class684.method3875((byte) -124);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Liaa;")
    public final class493 method337(int arg0, int arg1) {
        return new class500(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lur;[Lg;Z)Lda;")
    public final class59 method373(class535 arg0, class155[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field1708;
            var5[var7] = arg1[var7].field1706;
            if (arg1[var7].field1707 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class662(this, this.field9742, arg0, arg1, (class131[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class17(this, this.field9742, arg0, arg1, (class131[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Luk;IIII)Lka;")
    public final class470 method383(class260 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class39(this, this.field9742, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8) {
        this.method3908(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public final boolean method359() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public final void method351() {
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
    public final boolean method420() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public final boolean method413() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
    public final void method322() {
        if (!this.field9743) {
            this.field9761 = null;
            this.field9756 = null;
            this.field9742 = null;
            this.field9748 = null;
            this.field9755.method1758(124);
            for (class51 var1 = (class51) this.field9740.method1719(65280); var1 != null; var1 = (class51) this.field9740.method1723(-20665)) {
                var1.method296();
            }
            this.field9740.method1728(29632);
            this.method3899();
            if (this.field9760) {
                class125.method797(false, false, true);
                this.field9760 = false;
            }
            this.method3903();
            class684.method3873(-1);
            this.field9743 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method323(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkm;)V")
    public final void method348(class353 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method3904(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method3905(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method3906(class218 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpca;)V")
    public final void method391(class713 arg0) {
        if (arg0.field10032.method1075(1) != 0) {
            this.method3910(arg0, false);
            this.method3900().method3508(this, field9746, field9749, field9744, field9757, arg0.field10032.method1075(1));
        }
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
    public final void method362() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkm;Lkm;FLkm;)Lkm;")
    public final class353 method341(class353 arg0, class353 arg1, float arg2, class353 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method435();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method385(class413 arg0) {
        this.field9742 = (class51) arg0;
        this.method3915(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
    public final void method331() {
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method365(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method355(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lada;)V")
    public final void method321(int arg0, class163[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field9752[var3++] = arg1[var4].method1012((byte) 127);
            field9752[var3++] = arg1[var4].method1006(31079);
            field9752[var3++] = arg1[var4].method1013(9179409);
            field9752[var3++] = arg1[var4].method1007(53);
            field9754[var4] = arg1[var4].method1011(24617);
            field9752[var3++] = arg1[var4].method1010(-5636);
        }
        this.method3913(arg0, field9752, field9754);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method347(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3911(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lg;Z)Lhu;")
    public final class131 method434(class155 arg0, boolean arg1) {
        class539 var3 = new class539(this, arg0.field1710, arg0.field1702, arg0.field1707, 0, arg0.field1708, arg0.field1708, arg0.field1706);
        var3.method511(arg0.field1709, arg0.field1703, arg0.field1704, arg0.field1705);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)V")
    public final void method429(int arg0, int arg1) throws class266 {
        if (this.field9756 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9756.method1273(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method392(int arg0) {
        this.field9761[arg0].method3517();
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method3907(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkv;Liaa;)Ljj;")
    public final class118 method423(class268 arg0, class493 arg1) {
        return new class609(this, (class539) arg0, (class500) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method393();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method372(int[] arg0) {
        Dimension var2 = this.field9756.field2528.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Ldfa;")
    public final class165 method352() {
        return new class276();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method358() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public final boolean method326() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3900().method3521(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public final void method334() {
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public final boolean method328() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method364(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method342(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method3908(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method318();

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method356(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public final boolean method431() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method377(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
    public final boolean method440() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method439(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method333(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public final int method404(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method411() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method3909(class150 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
    public final void method433(int arg0) {
        this.field9761[arg0].method3515();
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)Lza;")
    public final class413 method408(int arg0) {
        class51 var2 = new class51(this, arg0);
        this.field9740.method1721((byte) -86, var2);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpca;Z)V")
    private final void method3910(class713 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class676 var8 = (class676) arg0.field10032.method1071(0); var8 != null; var8 = (class676) arg0.field10032.method1074(false)) {
            field9746[var3++] = var8.field9573;
            field9746[var3++] = var8.field9578;
            field9746[var3++] = var8.field9571;
            field9749[var4++] = var8.field9576;
            field9757[var6++] = (short) var8.field9569;
            field9744[var5++] = var8.field9566;
            if (arg1) {
                field9747[var7++] = var8.field9568;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Ldfa;")
    public final class165 method422() {
        return this.field9748;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method403(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method327();

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method3911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method366(int arg0) {
        this.field9750 = this.field9751 = arg0;
        if (this.field9762 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method390(this.field9762);
            this.method392(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpca;I)V")
    public final void method402(class713 arg0, int arg1) {
        this.method3910(arg0, false);
        this.method3900().method3508(this, field9746, field9749, field9744, field9757, arg0.field10032.method1075(1));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class278 method424(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class666(this, this.field9742, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        this.field9762 = arg0;
        this.field9761 = new class617[this.field9762];
        for (int var2 = 0; var2 < this.field9762; ++var2) {
            this.field9761[var2] = new class617(this, this.field9750, this.field9751);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lhu;")
    public final class131 method396(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class539(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method3912(long arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
    public final boolean method353() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Ldfa;")
    public final class165 method414() {
        return this.field9759;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lada;")
    public final class163 method368(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class364(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method346();

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method3913(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method369(Canvas arg0, int arg1, int arg2) {
        class218 var4 = (class218) this.field9755.method1754(false, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class218 var7 = new class218(this, arg0, arg1, arg2);
            this.field9755.method1751(var7, 3970, (long) arg0.hashCode());
        } else {
            if (var4.field2531 != arg1 || var4.field2530 != arg2) {
                var4.method1275(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldfa;)V")
    public final void method339(class165 arg0) {
        this.field9759 = arg0;
        this.method3912(((class276) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Loba;")
    public final class261 method395() {
        return new class261(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method320();

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method3914(short arg0) {
        class150 var2 = super.field578;
        synchronized (super.field578) {
            if (!super.field578.method929(15715, arg0)) {
                return false;
            } else {
                class298 var4 = super.field578.method931(arg0, true);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field3698 != 2) {
                        var6 = super.field578.method930(true, 86, 128, arg0, 0.7F, 128);
                    } else {
                        var6 = super.field578.method932(0.7F, 128, arg0, true, -20255, 128);
                    }
                    this.method3905(arg0, var6, var4.field3706, var4.field3698, var4.field3702, var4.field3695, var4.field3712, var4.field3711, var4.field3696, var4.field3709, var4.field3704, var4.field3699, var4.field3694, var4.field3710, var4.field3707, var4.field3716, var4.field3700, var4.field3701, var4.field3714, var4.field3703, var4.field3705);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Lkv;")
    public final class268 method425(int arg0, int arg1) {
        return this.method332(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method340(arg0, arg1, arg2, arg4, arg5);
        this.method340(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method377(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method377(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method3915(class413 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lhu;")
    public final class131 method332(int arg0, int arg1, boolean arg2) {
        return new class539(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method336(-66);
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method83(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class266 {
        if (this.field9756 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field9756.method1279(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public final boolean method394() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method354(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method3916(short arg0) {
        synchronized (this) {
            class298 var3 = super.field578.method931(arg0, true);
            if (var3 == null) {
                return false;
            } else {
                this.method3904(arg0, var3.field3706, var3.field3698, var3.field3702, var3.field3695, var3.field3712, var3.field3711, var3.field3696, var3.field3709, var3.field3704, var3.field3699, var3.field3694, var3.field3710, var3.field3707, var3.field3716, var3.field3700, var3.field3701, var3.field3714, var3.field3703, var3.field3705);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method400(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method419();

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method340(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method325(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);
}
