import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class58 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Ld;")
    public class150 field578;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lpt;")
    public static class529 field582 = new class529();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lsn;")
    public static class629 field592 = new class629("WTRC", 1);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field594 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method382(arg3, arg4, arg2, arg1, 1);
        if (arg0 <= -27) {
            field576++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method318();

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method319();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method320();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lada;)V")
    public abstract void method321(int arg0, class163[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public abstract void method322();

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method323(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lhu;")
    public abstract class131 method324(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method325(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method326();

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method327();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method328();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
    public abstract void method331();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lhu;")
    public abstract class131 method332(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method333(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
    public abstract void method334();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLhu;)V")
    public final void method335(byte arg0, class131 arg1) {
        this.method357(this.method423(arg1, this.method337(arg1.method503(), arg1.method509())));
        if (arg0 >= -127) {
            this.field581 = -77;
        }
        field589++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public final void method336(int arg0) {
        field575++;
        if (arg0 > -65) {
            this.method323(-104, -113, 90, -13);
        }
        class298.field3713[this.field581] = false;
        this.method322();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Liaa;")
    public abstract class493 method337(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILoh;Ld;IIILjava/awt/Canvas;)Lha;")
    public static final synchronized class58 method338(int arg0, int arg1, class404 arg2, class150 arg3, int arg4, int arg5, int arg6, Canvas arg7) {
        field577++;
        if (arg5 == 0) {
            return class392.method2413(0, arg4, arg6, arg3, arg7);
        } else if (arg5 == 2) {
            return class562.method3277(arg6, false, arg4, arg3, arg7);
        } else {
            if (arg1 >= -22) {
                method379(-108, -75, 44);
            }
            if (arg5 == 1) {
                return class366.method2130(-72, arg3, arg7, arg0);
            } else if (arg5 == 5) {
                return class503.method2984(arg0, arg7, false, arg2, arg3);
            } else if (arg5 == 3) {
                return class433.method2713(arg0, arg7, arg2, 25454, arg3);
            } else {
                throw new IllegalArgumentException("UM");
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldfa;)V")
    public abstract void method339(class165 arg0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method340(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkm;Lkm;FLkm;)Lkm;")
    public abstract class353 method341(class353 arg0, class353 arg1, float arg2, class353 arg3);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method342(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)Lkm;")
    public abstract class353 method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method344(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class266;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class485 method345(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method346();

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method336(-113);
        field588++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method347(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkm;)V")
    public abstract void method348(class353 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method349(String arg0, boolean arg1) {
        field585++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        int var4 = 0;
        if (arg1) {
            return null;
        }
        while (var3 > var4) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var4 + 2 < var3) {
                label93: {
                    char var6 = arg0.charAt(var4 + 1);
                    boolean var7 = false;
                    int var8;
                    if (var6 >= '0' && var6 <= '9') {
                        var8 = var6 - 48;
                    } else if (var6 >= 'a' && var6 <= 'f') {
                        var8 = var6 - 87;
                    } else {
                        if (var6 < 'A' || var6 > 'F') {
                            var2.append('%');
                            break label93;
                        }
                        var8 = var6 - 55;
                    }
                    char var9 = arg0.charAt(var4 + 2);
                    int var10 = var8 * 16;
                    int var11;
                    if (var9 >= '0' && var9 <= '9') {
                        var11 = var9 + var10 - 48;
                    } else if (var9 >= 'a' && var9 <= 'f') {
                        var11 = var9 + var10 + 10 - 97;
                    } else {
                        if (var9 < 'A' || var9 > 'F') {
                            var2.append('%');
                            break label93;
                        }
                        var11 = var9 + var10 + '\n' - 65;
                    }
                    if (var11 != 0 && class27.method134((byte) var11, 61)) {
                        var2.append(class169.method1054((byte) var11, -161));
                    }
                    var4 += 2;
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()I")
    public abstract int method350();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method351();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Ldfa;")
    public abstract class165 method352();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method353();

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method354(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method355(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method356(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljj;)V")
    public abstract void method357(class118 arg0);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method358();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method359();

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method360(float arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
    public abstract void method362();

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method363(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method364(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method365(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method366(int arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lada;")
    public abstract class163 method368(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method369(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public final void method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field586++;
        this.method399(arg0, arg1, arg5, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method372(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lur;[Lg;Z)Lda;")
    public abstract class59 method373(class535 arg0, class155[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
    public final void method374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method340(arg2, arg3, arg1, arg4, 1);
        if (arg0 <= 118) {
            this.field578 = null;
        }
        field584++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method375(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method376();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method377(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method378(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public static final void method379(int arg0, int arg1, int arg2) {
        field591++;
        if (arg2 > 37) {
            class47 var3 = class258.method1546(16, arg1, (byte) 121);
            var3.method271((byte) 124);
            var3.field507 = arg0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method381(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method382(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Luk;IIII)Lka;")
    public abstract class470 method383(class260 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method384();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method385(class413 arg0);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method386(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;IZ)V")
    public final void method387(Rectangle[] arg0, int arg1, boolean arg2) throws class266 {
        this.method344(arg0, arg1, 0, 0);
        field587++;
        if (!arg2) {
            this.method359();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public final void method388(byte arg0) throws class266 {
        this.method429(0, 0);
        if (arg0 > -109) {
            this.method353();
        }
        field580++;
    }

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method389(int arg0, class485 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method390(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpca;)V")
    public abstract void method391(class713 arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method392(int arg0);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method393();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method394();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Loba;")
    public abstract class261 method395();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lhu;")
    public abstract class131 method396(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIIII)V")
    public final void method397(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 15 / ((arg1 + 85) / 39);
        this.method380(arg0, arg3, arg5, arg2, arg4, 1);
        field590++;
    }

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method398(int arg0);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public abstract void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method400(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method401(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpca;I)V")
    public abstract void method402(class713 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method403(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method404(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method406();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method407(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)Lza;")
    public abstract class413 method408(int arg0);

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class58(class150 arg0) {
        this.field578 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class298.field3713[var3]) {
                var2 = var3;
                class298.field3713[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field581 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class485 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 102 / ((arg3 - 19) / 49);
        field579++;
        this.method370(arg1, arg4, arg5, arg2, arg0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method411();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIII)V")
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field583++;
        if (arg3 != 19154) {
            this.method333(92, 61, 8, null);
        }
        this.method377(arg0, arg1, arg4, arg2, 1);
    }

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method413();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Ldfa;")
    public abstract class165 method414();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method415(int arg0);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method417(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method418(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method419();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method420();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method421();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Ldfa;")
    public abstract class165 method422();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkv;Liaa;)Ljj;")
    public abstract class118 method423(class268 arg0, class493 arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class278 method424(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lkv;")
    public abstract class268 method425(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()V")
    public abstract void method426();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method427(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public static void method428(int arg0) {
        field592 = null;
        if (arg0 == -71) {
            field582 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)V")
    public abstract void method429(int arg0, int arg1) throws class266;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[IIII)Lhu;")
    public final class131 method430(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        field593++;
        return arg1 >= -56 ? null : this.method324(arg2, arg5, arg3, arg4, arg0, true);
    }

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method431();

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method432(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public abstract void method433(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lg;Z)Lhu;")
    public abstract class131 method434(class155 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method435();

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method436(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method438(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method439(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method440();
}
