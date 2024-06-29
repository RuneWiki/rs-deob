import java.awt.Canvas;
import java.awt.Color;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class162 {

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lm;")
    public class126 field2449;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
    public static int[] field2448 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Z")
    public static boolean field2453 = false;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2446 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lf;")
    public static class528 field2440;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 36)
    public final void method1169(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2451++;
        if (arg0 == -29109) {
            this.method461(arg3, arg4, arg2, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIBII)V", line = 48)
    public final void method1170(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 == 111) {
            field2445++;
            this.method441(arg3, arg0, arg4, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltn;ZI)V", line = 61)
    public static final void method1171(class58 arg0, boolean arg1, int arg2) {
        field2450++;
        int var3 = arg0.field895 == 0 ? arg0.field925 : arg0.field895;
        int var4 = arg0.field879 == 0 ? arg0.field896 : arg0.field879;
        class417.method2564(var3, arg1, (byte) -48, var4, arg0.field955, class416.field6157[arg0.field955 >> 16]);
        if (arg0.field910 != null) {
            class417.method2564(var3, arg1, (byte) -95, var4, arg0.field955, arg0.field910);
        }
        class183 var5 = (class183) class466.field6844.method2485(110, (long) arg0.field955);
        if (var5 != null) {
            class420.method2576(var3, var5.field2753, 31027, arg1, var4);
        }
        if (arg2 >= -120) {
            field2448 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 85)
    public static void method1172(byte arg0) {
        field2446 = null;
        field2448 = null;
        if (arg0 > 0) {
            field2446 = null;
        }
        field2440 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V", line = 107)
    public final void method1173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2442++;
        this.method530(arg1, arg4, arg3, arg2, 1);
        if (arg0 > -114) {
            field2453 = false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 128)
    public final void method1174(int arg0) {
        class248.field3578[this.field2452] = false;
        field2454++;
        this.method427();
        if (arg0 != -1) {
            field2440 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V", line = 142)
    public final void method1175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2444++;
        if (arg1 != 8) {
            this.method501();
        }
        this.method471(arg2, arg5, arg0, arg4, arg3, 1);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V", line = 153)
    public final void method1176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method516(arg1, arg5, arg3, arg0, arg4, arg2);
        field2441++;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 175)
    protected void finalize() {
        this.method1174(-1);
        field2447++;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V", line = 221)
    public static final void method1177(int arg0) {
        field2456++;
        int var1 = (int) ((double) class237.field3436 * 34.46D);
        int var2 = var1 << 0;
        if (class394.field5821.method446()) {
            var2 += 128;
        }
        if (arg0 != 1) {
            method1179(null, 58, 56, -30, null, null);
        }
        class394.field5821.method511(50, var2);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILm;)V", line = 242)
    public class162(int arg0, class126 arg1) {
        this.field2449 = arg1;
        this.field2452 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZI)V", line = 256)
    public final void method1178(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2455++;
        if (arg4) {
            this.method499(null, -113, -80, 101, 69);
        }
        this.method470(arg0, arg1, arg2, arg3, arg5, 1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;IIILci;Lm;)Lqa;", line = 283)
    public static final synchronized class162 method1179(Canvas arg0, int arg1, int arg2, int arg3, class312 arg4, class126 arg5) {
        field2443++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class248.field3578[var7]) {
                var6 = var7;
                break;
            }
        }
        if (arg1 > 0) {
            method1179(null, -107, 103, -67, null, null);
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class162 var9;
        if (arg2 == 0) {
            var9 = class246.method1571((byte) -123, var6, arg5, arg0);
        } else if (arg2 == 1) {
            var9 = class24.method200(var6, -1237636220, arg5, arg3, arg4, arg0);
        } else if (arg2 == 2) {
            var9 = class94.method756(71, arg5, arg4, var6, arg0);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class248.field3578[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
    public abstract void method461(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public abstract void method444();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method475(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
    public abstract void method458(float arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()I")
    public abstract int method488();

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
    public abstract void method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
    public abstract void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
    public abstract float method487();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lc;Lgn;Lia;Lsf;I)V")
    public abstract void method531(class121 arg0, class492 arg1, class413 arg2, class361 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
    public abstract int method489();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class528 method527(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
    public abstract boolean method525();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method465(int arg0);

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
    public abstract void method530(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public abstract void method427();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method457(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public abstract class35 method478(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
    public abstract boolean method442();

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
    public abstract boolean method446();

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
    public abstract void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lia;[Lsf;I)V")
    public abstract void method438(class121[] arg0, class413 arg1, class361[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
    public abstract int method462();

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
    public abstract void method536(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Lia;")
    public abstract class413 method439();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldt;Z)Lf;")
    public abstract class528 method517(class158 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method435(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Ltj;)V")
    public abstract void method464(int arg0, class131[] arg1);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Lia;")
    public abstract class413 method428();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lgn;Lia;[Lsf;I)V")
    public abstract void method495(class121[] arg0, class492 arg1, class413 arg2, class361[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lea;")
    public abstract class381 method431(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method494(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public abstract void method502(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
    public abstract void method509(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmd;)V")
    public abstract void method455(class379 arg0);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
    public abstract void method514(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method466(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
    public abstract void method521();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILea;II)V")
    public abstract void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
    public abstract boolean method513();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method473();

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
    public abstract boolean method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method429(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
    public abstract void method479(int arg0);

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
    public abstract void method480(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
    public abstract boolean method482();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method468(int arg0);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public abstract boolean method484();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lds;[Ldt;Z)Loa;")
    public abstract class488 method453(class12 arg0, class158[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method529();

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILea;II)V")
    public abstract void method434(int arg0, class381 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public abstract void method485(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lgn;)V")
    public abstract void method467(class492 arg0);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Ll;")
    public abstract class16 method452(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method450(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Llo;IIII)Lc;")
    public abstract class121 method499(class527 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ll;)V")
    public abstract void method449(class16 arg0);

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
    public abstract void method511(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
    public abstract void method436(int arg0);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
    public abstract void method448();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method523(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
    public abstract void method506();

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
    public abstract boolean method474();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lmd;")
    public abstract class379 method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
    public abstract int method445();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method433(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method500(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method524();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class528 method532(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method533(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
    public abstract boolean method493();

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public abstract void method510();

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
    public abstract int[] method508(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public abstract void method454(int arg0);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
    public abstract void method503();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method518(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public abstract boolean method469();

    @OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
    public abstract void method492();

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
    public abstract void method441(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
    public abstract int method459();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmd;Lmd;FLmd;)Lmd;")
    public abstract class379 method440(class379 arg0, class379 arg1, float arg2, class379 arg3);

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method481();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
    public abstract void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method519();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Ltj;")
    public abstract class131 method483(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
    public abstract void method535(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
    public abstract void method501();

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public abstract void method507(int arg0);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
    public abstract int method512();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method472(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
    public abstract void method505(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lia;)V")
    public abstract void method497(class413 arg0);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
    public abstract float method477();

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
    public abstract void method463(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
    public abstract boolean method522();
}
