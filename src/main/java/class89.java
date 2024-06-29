import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class89 {

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Ltq;")
    public class248 field1250;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field1266 = -1;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lap;")
    public static class310 field1263 = new class310(39, 3);

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Z")
    public static boolean field1269 = true;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field1270 = 0;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Lhq;")
    public static class30 field1271 = new class30("", 11);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
    public final void method742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1254++;
        if (arg0 != 11) {
            this.field1262 = -82;
        }
        this.method438(arg5, arg1, arg3, arg2, arg4, 1);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()V")
    public abstract void method345();

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "()Z")
    public abstract boolean method455();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBII)V")
    public final void method743(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -127) {
            field1271 = null;
        }
        this.method374(arg3, arg1, arg0, arg4, 1);
        field1256++;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIII)V")
    public abstract void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "()V")
    public abstract void method294();

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "()Z")
    public abstract boolean method307();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V")
    public abstract void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(F)V")
    public abstract void method415(float arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public abstract void method387(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lde;)V")
    public abstract void method454(class257 arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([I)V")
    public abstract void method409(int[] arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIILoj;II)V")
    public abstract void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class405 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Canvas;Ltq;IILis;I)Lvc;")
    public static final synchronized class89 method744(Canvas arg0, class248 arg1, int arg2, int arg3, class65 arg4, int arg5) {
        field1265++;
        int var6 = -1;
        int var7 = 0;
        if (arg3 <= 73) {
            method756(5, 111, -76, 56, -44, 96, 112);
        }
        while (var7 < 8) {
            if (!class371.field5111[var7]) {
                var6 = var7;
                break;
            }
            var7++;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class89 var9;
        if (arg2 == 0) {
            var9 = class18.method116(-7869, arg1, var6, arg0);
        } else if (arg2 == 1) {
            var9 = class450.method2722(arg4, arg0, arg5, 76, arg1, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class371.field5111[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "()Z")
    public abstract boolean method299();

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "()V")
    public abstract void method360();

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "()V")
    public abstract void method351();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([Ln;Lpa;Lde;[Lr;I)V")
    public abstract void method326(class468[] arg0, class404 arg1, class257 arg2, class63[] arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
    public static final void method745(int arg0, boolean arg1) {
        if (arg1 && class330.field4570 != null) {
            class61.field887 = class330.field4570.field968;
        } else {
            class61.field887 = -1;
        }
        field1252++;
        class135.field1887 = null;
        class125.field1697 = null;
        class330.field4570 = null;
        class4.field33 = 0;
        class330.method2077();
        class330.field4572.method773(-1568);
        class475.field6709 = null;
        class314.field4429 = null;
        class76.field1134 = null;
        class92.field1298 = null;
        class333.field4634 = null;
        class430.field6008 = -1;
        class466.field6571 = -1;
        class330.field4571 = null;
        class56.field828 = null;
        class205.field3001 = null;
        class145.field2005 = null;
        class382.field5241 = null;
        class330.field4569.method2315(0);
        class330.field4568.method848(64, false, 64);
        class330.field4569.method2320(128, 51, 64);
        if (arg0 <= 7) {
            field1270 = -25;
        }
        class330.field4567.method505(64, 68);
        class97.field1365.method2328(12623, 64);
    }

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "()Z")
    public abstract boolean method340();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[[I[[IIII)Lij;")
    public abstract class241 method456(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lpa;)V")
    public abstract void method329(class404 arg0);

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "()Z")
    public abstract boolean method379();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method746(int arg0) {
        if (arg0 != 0) {
            field1270 = -18;
        }
        field1263 = null;
        field1271 = null;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(IIIIII)V")
    public abstract void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILoj;II)V")
    public abstract void method366(int arg0, class405 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIII)V")
    public abstract void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "()Z")
    public abstract boolean method330();

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "()V")
    public abstract void method331();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method393(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(IIIIII)V")
    public abstract void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(IIIIII)Z")
    public abstract boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
    public abstract void method296(int arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(IIIIII)V")
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method321(arg4, arg1, arg5, arg2, arg3, arg0);
        field1267++;
    }

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "()Z")
    public abstract boolean method431();

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "()I")
    public abstract int method300();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFF)V")
    public abstract void method363(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lrp;)V")
    public abstract void method446(class419 arg0);

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "()I")
    public abstract int method403();

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public abstract void method295(int arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public abstract void method389(boolean arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method435(Canvas arg0);

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "()Z")
    public abstract boolean method377();

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "()Lde;")
    public abstract class257 method328();

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "()Z")
    public abstract boolean method445();

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
    public abstract void method292(boolean arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqi;IIII)Ln;")
    public abstract class468 method327(class430 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBIII)V")
    public final void method748(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -57) {
            this.field1250 = null;
        }
        field1268++;
        this.method387(arg4, arg3, arg0, arg2, 1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lgm;Z)Lrn;")
    public abstract class417 method302(class355 arg0, boolean arg1);

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "()V")
    public abstract void method323();

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "()F")
    public abstract float method404();

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "()I")
    public abstract int method369();

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public abstract void method357(int arg0);

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "()Z")
    public abstract boolean method419();

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(IIII)V")
    public abstract void method448(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([Ln;Lde;[Lr;I)V")
    public abstract void method437(class468[] arg0, class257 arg1, class63[] arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(IIII)V")
    public abstract void method443(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(IIII)V")
    public abstract void method423(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(IIII)[I")
    public abstract int[] method383(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[Lnq;)V")
    public abstract void method439(int arg0, class104[] arg1);

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "()Z")
    public abstract boolean method375();

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "()Z")
    public abstract boolean method432();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lhb;)V")
    public abstract void method376(class349 arg0);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIII)V")
    public abstract void method374(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lrp;Lrp;FLrp;)Lrp;")
    public abstract class419 method410(class419 arg0, class419 arg1, float arg2, class419 arg3);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[I[I)Loj;")
    public abstract class405 method402(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1261++;
        this.method755(-108);
    }

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "()I")
    public abstract int method322();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
    public static final void method749(int arg0, int arg1, int arg2) {
        field1251++;
        class334 var3 = class352.method2172(arg2, 13, arg0 ^ 0xFF00BF);
        var3.method2104(0);
        var3.field4648 = arg1;
        if (arg0 != 64) {
            method749(43, -35, 29);
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public abstract void method373(int arg0);

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "()V")
    public abstract void method450();

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "()V")
    public abstract void method298();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "()Lde;")
    public abstract class257 method306();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)I")
    public static final int method750(int arg0, byte arg1) {
        if (arg1 != 68) {
            field1270 = -77;
        }
        field1258++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(IIIII)V")
    public abstract void method352(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(IIIIII)V")
    public final void method751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1257++;
        this.method348(arg2, arg5, arg0, arg1, arg3, 1);
        if (arg4 <= 44) {
            this.field1262 = -97;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)V")
    public static final void method752(int arg0, long arg1) {
        if (arg0 != 0) {
            return;
        }
        field1264++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class263.method1777((byte) -26, arg1 - 1L);
            class263.method1777((byte) -26, 1L);
        } else {
            class263.method1777((byte) -26, arg1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIII)Lrn;")
    public abstract class417 method342(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FF)V")
    public abstract void method378(float arg0, float arg1);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
    public abstract int method355(int arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "()Z")
    public abstract boolean method452();

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(IIIIII)Lrp;")
    public abstract class419 method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lkg;[Lgm;Z)Lam;")
    public abstract class199 method367(class194 arg0, class355[] arg1, boolean arg2);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[I)V")
    public abstract void method316(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "()Z")
    public abstract boolean method291();

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Lhb;")
    public abstract class349 method444(int arg0);

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILtq;)V")
    public class89(int arg0, class248 arg1) {
        this.field1262 = arg0;
        this.field1250 = arg1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method420(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "()I")
    public abstract int method334();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "()V")
    public abstract void method417();

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    public abstract void method391(int arg0);

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "()I")
    public abstract int method332();

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public abstract void method314(int arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lic;I)V")
    public static final void method753(class27 arg0, int arg1) {
        field1253++;
        if (arg1 <= 58) {
            field1269 = true;
        }
        arg0.field289 = null;
        if (class138.field1920 < 20) {
            class132.field1810.method1765(119, arg0);
            class138.field1920++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIZ)Lrn;")
    public abstract class417 method429(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
    public abstract void method350(int arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(IIIII)V")
    public final void method754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            method756(0, -40, 79, -1, -128, 10, 61);
        }
        field1260++;
        this.method352(arg3, arg0, arg4, arg2, 1);
    }

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "()V")
    public abstract void method343();

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
    public final void method755(int arg0) {
        int var2 = -96 / ((-arg0 - 18) / 35);
        class371.field5111[this.field1262] = false;
        field1255++;
        this.method331();
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(II)I")
    public abstract int method362(int arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V")
    public static final void method756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1259++;
        int var7 = arg2 - arg5;
        int var8 = arg4 + arg5;
        for (int var9 = arg4; var9 < var8; var9++) {
            class61.method558(arg0, -10647, class373.field5141[var9], arg1, arg6);
        }
        int var10 = arg2;
        int var11 = 74 / ((-arg3 - 69) / 37);
        while (var10 > var7) {
            class61.method558(arg0, -10647, class373.field5141[var10], arg1, arg6);
            var10--;
        }
        int var12 = arg1 + arg5;
        int var13 = arg0 - arg5;
        for (int var14 = var8; var14 <= var7; var14++) {
            int[] var15 = class373.field5141[var14];
            class61.method558(var12, -10647, var15, arg1, arg6);
            class61.method558(arg0, -10647, var15, var13, arg6);
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(Z)V")
    public abstract void method308(boolean arg0);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(IIII)V")
    public abstract void method382(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ln;Lpa;Lde;Lr;I)V")
    public abstract void method384(class468 arg0, class404 arg1, class257 arg2, class63 arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "()F")
    public abstract float method414();

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "()Z")
    public abstract boolean method390();
}
