import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class475 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Ld;")
    public class103 field6447;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field6448;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[I")
    public static int[] field6454;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V", line = 4)
    public final void method2765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method436(arg4, arg0, arg5, arg1, arg3, 1);
        field6460++;
        if (arg2 <= 82) {
            this.field6448 = 78;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;IZ)V", line = 37)
    public final void method2766(Rectangle[] arg0, int arg1, boolean arg2) throws class684 {
        field6452++;
        if (!arg2) {
            this.field6447 = null;
        }
        this.method86(arg0, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZII)V", line = 51)
    public final void method2767(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            this.field6448 = 74;
        }
        field6453++;
        this.method502(arg3, arg1, arg0, arg4, 1);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIII)V", line = 85)
    public static final void method2768(int arg0, int arg1, int arg2, int arg3) {
        class172 var4 = class514.field7096[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class427 var5 = var4.field2591;
        class427 var6 = var4.field2598;
        if (var5 != null) {
            var5.field5923 = (short) (var5.field5923 * arg3 / (0x10 << class679.field9600 - 7));
            var5.field5927 = (short) (var5.field5927 * arg3 / (0x10 << class679.field9600 - 7));
        }
        if (var6 != null) {
            var6.field5923 = (short) (var6.field5923 * arg3 / (0x10 << class679.field9600 - 7));
            var6.field5927 = (short) (var6.field5927 * arg3 / (0x10 << class679.field9600 - 7));
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V", line = 117)
    public final void method2769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method453(arg0, arg4, arg2, arg3, arg1, 1);
        field6456++;
        if (arg5 != 7166) {
            this.field6447 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 133)
    public final void method2770(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method521(arg2, arg0, arg1, arg4, arg3);
        field6459++;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V", line = 153)
    public final void method2771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 90) {
            field6454 = null;
        }
        field6451++;
        this.method447(arg1, arg4, arg5, arg0, arg2, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmq;B)V", line = 164)
    public final void method2772(class85 arg0, byte arg1) {
        this.method120(this.method53(arg0, this.method88(arg0.method16(), arg0.method5())));
        field6458++;
        if (arg1 != -85) {
            this.field6448 = -116;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[IIII)Lmq;", line = 187)
    public final class85 method2773(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 1) {
            this.method471(83, -66, 53, -84, 21, -13, -71);
        }
        field6449++;
        return this.method460(arg2, arg3, arg5, arg1, arg4, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIII)V", line = 203)
    public final void method2774(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            field6450++;
            this.method468(arg2, arg4, arg0, arg3, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)Z", line = 229)
    public static final boolean method2775(boolean arg0) {
        field6445++;
        try {
            if (class582.field8375 == 2) {
                if (class271.field3808 == null) {
                    class271.field3808 = class428.method2505(class348.field4945, class229.field3357, class144.field2337);
                    if (class271.field3808 == null) {
                        return false;
                    }
                }
                if (class646.field9182 == null) {
                    class646.field9182 = new class23(class470.field6407, class300.field4324);
                }
                class477 var1 = class233.field3384;
                if (class542.field7503 != null) {
                    var1 = class542.field7503;
                }
                if (var1.method2816(class646.field9182, 22050, class271.field3808, class781.field10715, -10962)) {
                    class233.field3384 = var1;
                    class233.field3384.method2793(-105);
                    if (class522.field7314 > 0) {
                        class582.field8375 = 3;
                        class233.field3384.method2799(class406.field5591 < class522.field7314 ? class406.field5591 : class522.field7314, -1100700020);
                        for (int var2 = 0; var2 < field6454.length; var2++) {
                            class233.field3384.method2803(field6454[var2], var2, -121);
                            field6454[var2] = 255;
                        }
                    } else {
                        class582.field8375 = 0;
                        class233.field3384.method2799(class406.field5591, -1100700020);
                        for (int var3 = 0; var3 < field6454.length; var3++) {
                            class233.field3384.method2803(field6454[var3], var3, -101);
                            field6454[var3] = 255;
                        }
                    }
                    if (class542.field7503 == null) {
                        if (class308.field4390 <= 0L) {
                            class233.field3384.method2805(8483, class271.field3808, class430.field5951);
                        } else {
                            class233.field3384.method2813(true, class308.field4390, class271.field3808, class430.field5951, (byte) -124);
                        }
                    }
                    if (class771.field10639 != null) {
                        class771.field10639.method3615((byte) 126, class233.field3384);
                    }
                    class646.field9182 = null;
                    class271.field3808 = null;
                    class542.field7503 = null;
                    class348.field4945 = null;
                    class308.field4390 = 0L;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class233.field3384.method2830(128);
            class542.field7503 = null;
            class348.field4945 = null;
            class271.field3808 = null;
            class646.field9182 = null;
            class582.field8375 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 368)
    protected void finalize() {
        field6457++;
        this.method2779((byte) 32);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBILjava/awt/Canvas;Ld;Lgga;I)Lha;", line = 378)
    public static final synchronized class475 method2776(int arg0, int arg1, byte arg2, int arg3, Canvas arg4, class103 arg5, class513 arg6, int arg7) {
        field6446++;
        if (arg0 == 0) {
            return class240.method1608(arg4, 126, arg5, arg7, arg1);
        } else if (arg0 == 2) {
            return class445.method2639(arg4, arg1, arg7, arg5, (byte) 105);
        } else if (arg0 == 1) {
            return class398.method2367(arg5, arg4, (byte) -72, arg3);
        } else if (arg0 == 5) {
            return class203.method1425(arg3, arg4, arg6, (byte) 31, arg5);
        } else {
            if (arg2 != -105) {
                field6454 = null;
            }
            if (arg0 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class159.method1223(arg5, arg4, arg3, arg6, false);
        }
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V", line = 418)
    public final void method2777(int arg0) throws class684 {
        field6455++;
        this.method109(0, 0);
        if (arg0 != -16679) {
            this.method462();
        }
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V", line = 433)
    public static void method2778(int arg0) {
        field6454 = null;
        if (arg0 <= 56) {
            field6454 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 444)
    public class475(class103 arg0) {
        this.field6447 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class191.field2866[var3]) {
                class191.field2866[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field6448 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 472)
    public final void method2779(byte arg0) {
        class191.field2866[this.field6448] = false;
        field6444++;
        int var2 = -81 / ((-arg0 - 19) / 43);
        this.method142();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method430(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lde;Z)Lmq;")
    public abstract class85 method487(class418 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lida;IIII)Lka;")
    public abstract class233 method514(class678 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method512();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgka;)V")
    public abstract void method455(class667 arg0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method473();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public abstract void method490();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldm;)V")
    public abstract void method498(class765 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvr;)V")
    public abstract void method458(class458 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method57(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method83();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvr;Lvr;FLvr;)Lvr;")
    public abstract class458 method94(class458 arg0, class458 arg1, float arg2, class458 arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method115();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method492(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method482(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method127(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lmq;")
    public abstract class85 method503(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method521(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lmq;")
    public abstract class85 method423(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method456(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public abstract void method109(int arg0, int arg1) throws class684;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method511(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method91();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method425(class731 arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method497(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Llf;")
    public abstract class567 method76(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method488(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Ldm;")
    public abstract class765 method457();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method479();

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method440(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class419 method508(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method499(int arg0);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method509(int arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Lev;")
    public abstract class165 method108();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method432(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method515();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method137(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lmfa;)V")
    public abstract void method504(int arg0, class217[] arg1);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    public abstract int method426(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class88 method431(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method461(int arg0);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method462();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Lza;")
    public abstract class731 method496(int arg0);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method60();

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method97(int arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method99();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method435();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lmq;")
    public abstract class85 method460(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method467(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
    public abstract void method121();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lrs;)V")
    public abstract void method120(class730 arg0);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()I")
    public abstract int method472();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method446();

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method517(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method464(int arg0, class88 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method502(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Ldm;")
    public abstract class765 method489();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method424();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgka;I)V")
    public abstract void method429(class667 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method119();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method75(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method443();

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method449(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method74(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method437(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method485(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method484(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public abstract void method466(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method470(int arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method477();

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()V")
    public abstract void method142();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
    public abstract void method87();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method459();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lmfa;")
    public abstract class217 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method474();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
    public abstract boolean method475();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method468(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
    public abstract void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method422(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method518(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method82(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(IIIIII)Lvr;")
    public abstract class458 method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Llf;Ljk;)Lrs;")
    public abstract class730 method53(class567 arg0, class788 arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method433();

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method445();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method500();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
    public abstract boolean method454();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method79(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method421();

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method483(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method513(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method516(float arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Ljk;")
    public abstract class788 method88(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Ldm;")
    public abstract class765 method463();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method86(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class684;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method428(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lrt;[Lde;Z)Lda;")
    public abstract class443 method491(class470 arg0, class418[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
    public abstract void method138();

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method476(int arg0, int arg1, int arg2, int arg3);
}
