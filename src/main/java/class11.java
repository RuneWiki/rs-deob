import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class11 {

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "Lga;")
    public class243 field101;

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "Ldp;")
    public static class347 field102 = new class347("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "[I")
    public static int[] field108 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "Laa;")
    public static class76 field109;

    @OriginalMember(owner = "client!ya", name = "q", descriptor = "Lfr;")
    public static class497 field113;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "F")
    public static float field98;

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ya", name = "o", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ya", name = "s", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "Lnk;")
    public static class309 field114;

    static {
        new class347("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field109 = new class76(16, 18);
        field113 = new class497();
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)V", line = 20)
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field106++;
        this.method162(arg3, arg5, arg1, arg4, arg2, 1);
        if (arg0 <= 64) {
            this.method122(28, -0.22598483F, 0.9235784F, -0.012972241F, -1.0988737F, -0.60956573F);
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(ILga;ILjava/awt/Canvas;Lec;I)Lya;", line = 45)
    public static final synchronized class11 method76(int arg0, class243 arg1, int arg2, Canvas arg3, class109 arg4, int arg5) {
        field115++;
        int var6 = -1;
        if (arg2 != 8) {
            method127(-51);
        }
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class307.field4615[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class11 var9;
        if (arg0 == 0) {
            var9 = class254.method1511(arg3, var6, 1024, arg1);
        } else if (arg0 == 1) {
            var9 = class83.method659(arg3, var6, arg4, arg5, true, arg1);
        } else if (arg0 == 2) {
            var9 = class464.method2691(arg3, (byte) 45, arg1, arg4, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class307.field4615[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIB)V", line = 105)
    public final void method89(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field99++;
        this.method131(arg0, arg3, arg1, arg2, 1);
        if (arg4 != -97) {
            field114 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIZ)V", line = 120)
    public final void method93(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method71(arg1, arg2, arg0, arg4, arg3, 1);
        field103++;
        if (arg5) {
            this.method70(80, 63, null, null, 12, -108, 98);
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)Z", line = 150)
    public static final boolean method106(int arg0, int arg1) {
        if (arg1 > -69) {
            method127(-10);
        }
        field112++;
        return arg0 == 6 || arg0 == 7 || arg0 == 8;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIBII)V", line = 161)
    public final void method107(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.method60(arg0, arg3, arg4, arg1, 1);
        field100++;
        if (arg2 != -90) {
            this.method136(-72, -60, -55, 120, -44, -1.3554254F);
        }
    }

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(I)V", line = 178)
    public final void method111(int arg0) {
        field97++;
        class307.field4615[this.field104] = false;
        if (arg0 == 1) {
            this.method139();
        }
    }

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 206)
    protected void finalize() {
        this.method111(1);
        field107++;
    }

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIBII)V", line = 215)
    public final void method121(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 6) {
            this.field101 = null;
        }
        this.method91(arg4, arg0, arg1, arg3, 1);
        field110++;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IZIIII)V", line = 228)
    public final void method123(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method69(arg5, arg0, arg3, arg4, arg2, 1);
        if (arg1) {
            this.method147(null, -97);
        }
        field111++;
    }

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(I)V", line = 242)
    public static void method127(int arg0) {
        field108 = null;
        field114 = null;
        if (arg0 == -30049) {
            field102 = null;
            field109 = null;
            field113 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(ZI)V", line = 264)
    public static final void method133(boolean arg0, int arg1) {
        field105++;
        if (class250.method1495(arg0, arg1)) {
            class339.method2071(class174.field2549[arg1], 3747, -1);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILga;)V", line = 278)
    public class11(int arg0, class243 arg1) {
        this.field101 = arg1;
        this.field104 = arg0;
    }

    @OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lc;)V")
    public abstract void method55(class511 arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "()V")
    public abstract void method56();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
    public abstract void method57(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
    public abstract void method59(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
    public abstract void method60(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ldu;[Lul;Z)Lla;")
    public abstract class307 method61(class443 arg0, class319[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
    public abstract void method62();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
    public abstract void method63(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "()V")
    public abstract void method64();

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "()Z")
    public abstract boolean method65();

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "()Lc;")
    public abstract class511 method66();

    @OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
    public abstract void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)V")
    public abstract void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public abstract class337 method70(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)V")
    public abstract void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "()I")
    public abstract int method72();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lt;Lpv;Lc;Lqb;I)V")
    public abstract void method73(class398 arg0, class46 arg1, class511 arg2, class518 arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "()V")
    public abstract void method74();

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "()Lc;")
    public abstract class511 method75();

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "()Z")
    public abstract boolean method77();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lma;")
    public abstract class249 method78(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
    public abstract int method80();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method81(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
    public abstract float method82();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
    public abstract void method83(int arg0);

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
    public abstract void method84(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
    public abstract void method85(int arg0);

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "()V")
    public abstract void method86();

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "()Z")
    public abstract boolean method87();

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "()V")
    public abstract void method88();

    @OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
    public abstract void method90(float arg0);

    @OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
    public abstract void method91(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
    public abstract void method92(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
    public abstract void method94();

    @OriginalMember(owner = "client!ya", name = "o", descriptor = "()Z")
    public abstract boolean method95();

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
    public abstract void method96(int arg0);

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
    public abstract boolean method97();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lul;Z)Ll;")
    public abstract class127 method98(class319 arg0, boolean arg1);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method99(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
    public abstract int method100();

    @OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
    public abstract boolean method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
    public abstract int[] method102(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Ll;")
    public abstract class127 method103(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
    public abstract void method104(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lpv;)V")
    public abstract void method105(class46 arg0);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method108(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
    public abstract void method109(int[] arg0);

    @OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
    public abstract int method110();

    @OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
    public abstract boolean method112();

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()Z")
    public abstract boolean method113();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lwr;)V")
    public abstract void method114(int arg0, class531[] arg1);

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
    public abstract int method115();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
    public abstract void method116(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lqs;Lqs;FLqs;)Lqs;")
    public abstract class50 method117(class50 arg0, class50 arg1, float arg2, class50 arg3);

    @OriginalMember(owner = "client!ya", name = "s", descriptor = "()Z")
    public abstract boolean method118();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lt;Lpv;Lc;[Lqb;I)V")
    public abstract void method119(class398[] arg0, class46 arg1, class511 arg2, class518[] arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
    public abstract int method120(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
    public abstract void method122(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ya", name = "t", descriptor = "()Z")
    public abstract boolean method124();

    @OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
    public abstract boolean method125();

    @OriginalMember(owner = "client!ya", name = "v", descriptor = "()Z")
    public abstract boolean method126();

    @OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
    public abstract int method128();

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method129(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
    public abstract void method130(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
    public abstract void method131(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILma;II)V")
    public abstract void method132(int arg0, class249 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
    public abstract void method134(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lt;Lc;[Lqb;I)V")
    public abstract void method135(class398[] arg0, class511 arg1, class518[] arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lwr;")
    public abstract class531 method136(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lu;)V")
    public abstract void method137(class346 arg0);

    @OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
    public abstract boolean method138();

    @OriginalMember(owner = "client!ya", name = "y", descriptor = "()V")
    public abstract void method139();

    @OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
    public abstract void method140(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
    public abstract void method141(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILma;II)V")
    public abstract void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class249 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
    public abstract void method143(int arg0);

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
    public abstract void method144(int arg0);

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)V")
    public abstract void method145(int arg0);

    @OriginalMember(owner = "client!ya", name = "z", descriptor = "()Z")
    public abstract boolean method146();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method147(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lqs;)V")
    public abstract void method148(class50 arg0);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lio;IIII)Lt;")
    public abstract class398 method150(class118 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "(I)Lu;")
    public abstract class346 method151(int arg0);

    @OriginalMember(owner = "client!ya", name = "A", descriptor = "()Z")
    public abstract boolean method152();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Ll;")
    public abstract class127 method153(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
    public abstract void method154(float arg0, float arg1);

    @OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
    public abstract void method155(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "B", descriptor = "()Z")
    public abstract boolean method156();

    @OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
    public abstract float method157();

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)Lqs;")
    public abstract class50 method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
    public abstract void method159(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(II)I")
    public abstract int method160(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "C", descriptor = "()V")
    public abstract void method161();

    @OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
    public abstract void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
