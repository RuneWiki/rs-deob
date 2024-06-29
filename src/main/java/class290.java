import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class290 {

    @OriginalMember(owner = "client!za", name = "n", descriptor = "Ll;")
    public class16 field4246;

    @OriginalMember(owner = "client!za", name = "e", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!za", name = "h", descriptor = "Lkn;")
    public static class530 field4240 = new class530("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!za", name = "q", descriptor = "[I")
    public static int[] field4249 = new int[32];

    @OriginalMember(owner = "client!za", name = "a", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!za", name = "b", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!za", name = "c", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!za", name = "d", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!za", name = "f", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!za", name = "g", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!za", name = "r", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "Loi;")
    public static class53 field4248;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
    public abstract boolean method363();

    @OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
    public abstract float method386();

    @OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
    public abstract void method390(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V")
    public final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method376(arg1, arg4, arg2, arg3, arg0);
        field4241++;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public abstract class38 method314(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIII)V")
    public final void method1793(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method387(arg0, arg4, arg3, arg2, 1);
        field4236++;
        if (arg1 != -29535) {
            this.method334(null);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Le;Lsj;Lc;Lwp;I)V")
    public abstract void method345(class377 arg0, class324 arg1, class125 arg2, class122 arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ln;)V")
    public abstract void method356(class15 arg0);

    @OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
    public abstract int method309();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lud;)V")
    public abstract void method311(class27 arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
    public abstract boolean method337();

    @OriginalMember(owner = "client!za", name = "c", descriptor = "()V")
    public abstract void method342();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V")
    public final void method1794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method325(arg5, arg1, arg0, arg3, arg2, 1);
        if (arg4 < 81) {
            this.method1797(true, 41, 43, 95, -41, 112);
        }
        field4242++;
    }

    @OriginalMember(owner = "client!za", name = "d", descriptor = "()V")
    public abstract void method341();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIIII)V")
    public final void method1795(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method288(arg5, arg0, arg2, arg3, arg4, 1);
        field4235++;
        if (arg1 != -77) {
            field4240 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "e", descriptor = "()Z")
    public abstract boolean method364();

    @OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
    public abstract void method305(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IBILfu;ILza;)V")
    public static final void method1796(int arg0, byte arg1, int arg2, class270 arg3, int arg4, class290 arg5) {
        field4239++;
        class326 var6 = class412.field5829.method1856((byte) 117, arg3.field3985);
        if (var6.field4761 == -1) {
            return;
        }
        int var7;
        if (arg3.field3993) {
            int var8 = arg3.field3978 + arg2;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class24 var9 = var6.method1965(arg3.field3990, 874, arg5, var7);
        if (var9 == null) {
            return;
        }
        if (arg1 != 125) {
            field4240 = null;
        }
        int var10 = arg3.field3937;
        int var11 = arg3.field4012;
        if ((var7 & 0x1) == 1) {
            var10 = arg3.field4012;
            var11 = arg3.field3937;
        }
        int var12 = var9.method145();
        int var13 = var9.method157();
        if (var6.field4762) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field4759 == 0) {
            var9.method150(arg0, arg4 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method162(arg0, arg4 - ((var11 - 1) * 4), var12, var13, 0, var6.field4759 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
    public abstract void method328(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
    public abstract void method335(int arg0);

    @OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
    public abstract int method357();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
    public abstract void method294(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!za", name = "f", descriptor = "()V")
    public abstract void method303();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Lsj;Lc;[Lwp;I)V")
    public abstract void method310(class377[] arg0, class324 arg1, class125 arg2, class122[] arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public abstract void method385(boolean arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ZIIIII)V")
    public final void method1797(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method340(arg2, arg3, arg4, arg1, arg5, 1);
        field4234++;
        if (!arg0) {
            this.method285(null);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILta;II)V")
    public abstract void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
    public abstract void method297(boolean arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lld;IIII)Le;")
    public abstract class377 method293(class117 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "g", descriptor = "()V")
    public abstract void method292();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lul;[Ldd;Z)Lla;")
    public abstract class319 method313(class411 arg0, class506[] arg1, boolean arg2);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(III)Z")
    public static final boolean method1798(int arg0, int arg1, int arg2) {
        if (arg1 == -15605) {
            field4247++;
            return (arg0 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
    public abstract void method333(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIBII)V")
    public final void method1799(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4233++;
        int var6 = 127 / ((66 - arg2) / 40);
        this.method328(arg3, arg1, arg4, arg0, 1);
    }

    @OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
    public abstract void method343(int[] arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method370(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
    public abstract void method389(int arg0);

    @OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
    public abstract int method392();

    @OriginalMember(owner = "client!za", name = "h", descriptor = "()Lc;")
    public abstract class125 method368();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method289(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
    public abstract void method299(float arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
    public abstract void method366(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method285(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
    public abstract void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "i", descriptor = "()Z")
    public abstract boolean method317();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)V")
    public abstract void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
    public abstract void method318(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
    public abstract boolean method339();

    @OriginalMember(owner = "client!za", name = "k", descriptor = "()Z")
    public abstract boolean method322();

    @OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
    public abstract void method376(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lls;)V")
    public abstract void method352(int arg0, class95[] arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method373(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(III)Z")
    public static final boolean method1800(int arg0, int arg1, int arg2) {
        field4244++;
        if (arg2 != 4016) {
            field4249 = null;
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
    public abstract int method302(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILta;II)V")
    public abstract void method300(int arg0, class145 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
    public abstract boolean method362();

    @OriginalMember(owner = "client!za", name = "m", descriptor = "()V")
    public abstract void method377();

    @OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
    public abstract void method355(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lsj;)V")
    public abstract void method359(class324 arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lo;")
    public abstract class24 method344(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(I)V")
    public final void method1801(int arg0) {
        field4250++;
        class345.field5005[this.field4237] = false;
        if (arg0 == 0) {
            this.method342();
        }
    }

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
    public abstract void method349(boolean arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method334(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
    public abstract void method353(int arg0);

    @OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
    public abstract void method387(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
    public abstract int method304();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIZ)I")
    public static final int method1802(int arg0, int arg1, boolean arg2) {
        field4245++;
        if (arg2) {
            return 0;
        }
        class167 var3 = class119.method803(arg2, arg1, 0);
        if (var3 == null) {
            return class146.field1952.method1676(arg1, 3312).field5336;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field2432.length; var5++) {
            if (var3.field2432[var5] == -1) {
                var4++;
            }
        }
        if (arg0 != 23138) {
            method1804(-72, null, -104, null, null, -11);
        }
        return var4 + (class146.field1952.method1676(arg1, 3312).field5336 - var3.field2432.length);
    }

    @OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
    public abstract boolean method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "o", descriptor = "()Z")
    public abstract boolean method369();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ldd;Z)Lo;")
    public abstract class24 method312(class506 arg0, boolean arg1);

    @OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V")
    public static void method1803(int arg0) {
        field4240 = null;
        if (arg0 != 6708) {
            method1796(73, (byte) -112, -11, null, -85, null);
        }
        field4249 = null;
        field4248 = null;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lo;")
    public abstract class24 method307(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!za", name = "q", descriptor = "()I")
    public abstract int method371();

    @OriginalMember(owner = "client!za", name = "s", descriptor = "()Z")
    public abstract boolean method360();

    @OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
    public abstract boolean method372();

    @OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!za", name = "u", descriptor = "()Z")
    public abstract boolean method327();

    @OriginalMember(owner = "client!za", name = "v", descriptor = "()Z")
    public abstract boolean method326();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ILjava/awt/Canvas;ILl;Lnt;I)Lza;")
    public static final synchronized class290 method1804(int arg0, Canvas arg1, int arg2, class16 arg3, class151 arg4, int arg5) {
        field4243++;
        if (arg5 != 4) {
            return null;
        }
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class345.field5005[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class290 var9;
        if (arg2 == 0) {
            var9 = class165.method1043(arg1, arg5 - 4, var6, arg3);
        } else if (arg2 == 1) {
            var9 = class153.method980(arg3, (byte) -109, var6, arg1, arg4, arg0);
        } else if (arg2 == 2) {
            var9 = class284.method1761(-2, arg3, var6, arg4, arg1);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class345.field5005[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method1801(0);
        field4238++;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lta;")
    public abstract class145 method332(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
    public abstract void method320();

    @OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
    public abstract void method361(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
    public abstract void method325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "w", descriptor = "()Lc;")
    public abstract class125 method358();

    @OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
    public abstract void method306(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lls;")
    public abstract class95 method380(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lud;Lud;FLud;)Lud;")
    public abstract class27 method351(class27 arg0, class27 arg1, float arg2, class27 arg3);

    @OriginalMember(owner = "client!za", name = "x", descriptor = "()Z")
    public abstract boolean method284();

    @OriginalMember(owner = "client!za", name = "g", descriptor = "(I)V")
    public abstract void method375(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Lc;[Lwp;I)V")
    public abstract void method298(class377[] arg0, class125 arg1, class122[] arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
    public abstract void method301(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)Lud;")
    public abstract class27 method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "y", descriptor = "()Z")
    public abstract boolean method308();

    @OriginalMember(owner = "client!za", name = "h", descriptor = "(I)Ln;")
    public abstract class15 method379(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!za", name = "z", descriptor = "()Z")
    public abstract boolean method323();

    @OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
    public abstract int method378();

    @OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
    public abstract void method295();

    @OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lc;)V")
    public abstract void method367(class125 arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
    public abstract void method348(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
    public abstract void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "A", descriptor = "()V")
    public abstract void method374();

    @OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
    public abstract void method346(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
    public abstract float method388();

    @OriginalMember(owner = "client!za", name = "B", descriptor = "()V")
    public abstract void method354();

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILl;)V")
    public class290(int arg0, class16 arg1) {
        this.field4246 = arg1;
        this.field4237 = arg0;
    }

    @OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
    public abstract int[] method321(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
    public abstract void method286(int arg0);

    @OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
    public abstract void method365(float arg0, float arg1);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
    public abstract int method324(int arg0, int arg1);
}
