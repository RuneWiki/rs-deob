import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class63 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Ld;")
    public class158 field864;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field871 = new String[] { method670(method669("\u0019\u001f9\u0007iY")), method670(method669("\u001f\u000b{*")), method670(method669("\nP9hV")), method670(method669("\u0019\u001f9\fiY")), method670(method669("\u0019\u001f9\u0005hY")), method670(method669("\u0019\u001f9\f\u0003")), method670(method669("\u0019\u001f9\u0015hY")), method670(method669("\u0019\u001f9\u0002iY")), method670(method669("\u0019\u001f9\u0011iY")), method670(method669("\u0019\u001f9\nhY")), method670(method669("\u0019\u001f9\u0002hY")), method670(method669("\u0019\u001f9zB\u001f\u0017cx\u0003")), method670(method669("?8C\u000f")), method670(method669("\u0019\u001f9\u0001iY")), method670(method669("\u0019\u001f9 B\u001f\u001f{/Q\u0014V")), method670(method669("\u0019\u001f9\u000eiY")), method670(method669("\u0019\u001f9\u0010iY")), method670(method669("\u0019\u001f9\u0010hY")), method670(method669("$3")), method670(method669("\u0019\u001f9\fhY")) };

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lhl;")
    public static class556 field853 = new class556(23, 8);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class514 method258(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
    public abstract void method171(int arg0, int arg1) throws class146;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method256(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class146;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Llia;Llia;FLlia;)Llia;")
    public abstract class505 method249(class505 arg0, class505 arg1, float arg2, class505 arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgda;IILjava/awt/Canvas;Ld;III)Lha;")
    public static final synchronized class63 method655(class58 arg0, int arg1, int arg2, Canvas arg3, class158 arg4, int arg5, int arg6, int arg7) {
        try {
            field857++;
            if (arg6 == 0) {
                return class714.method5176(arg4, (byte) 29, arg7, arg3, arg1);
            } else if (arg6 == 2) {
                return class586.method4305(arg3, arg7, arg4, arg1, -108);
            } else if (arg6 == 1) {
                return class270.method2334(arg5, arg4, arg3, 123);
            } else if (arg6 == 5) {
                return class102.method968((byte) -126, arg0, arg3, arg4, arg5);
            } else {
                if (arg2 >= -91) {
                    method663(true);
                }
                if (arg6 != 3) {
                    throw new IllegalArgumentException(field871[18]);
                }
                return class701.method5083(arg3, arg4, arg0, -15414, arg5);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field871[17] + (arg0 == null ? field871[1] : field871[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field871[1] : field871[2]) + ',' + (arg4 == null ? field871[1] : field871[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsn;)V")
    public abstract void method191(class659 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class293 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method227();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkc;IIII)Lka;")
    public abstract class499 method192(class141 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
    public final void method656(int arg0, int arg1, Rectangle[] arg2) throws class146 {
        try {
            field863++;
            this.method256(arg2, arg1, 0, 0);
            int var4 = 21 % ((arg0 - 12) / 33);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field871[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field871[1] : field871[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsj;)V")
    public abstract void method254(class486 arg0);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method180(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method262(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method159(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsia;)V")
    public abstract void method248(class769 arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lsj;")
    public abstract class486 method271();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method203();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
    public final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.method267(arg0, arg5, arg1, arg2, arg3, arg4);
            field870++;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field871[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method150(int arg0);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method201(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method198();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)V")
    public abstract void method178(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method170(int arg0, class514 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method152();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
    public abstract void method233();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Lwaa;")
    public abstract class734 method240();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method164(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method157(class437 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method237(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method234(int arg0);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method265(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lih;)V")
    public abstract void method218(int arg0, class731[] arg1);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method259(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Lsj;")
    public abstract class486 method251();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method269();

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkaa;[Luh;Z)Lda;")
    public abstract class64 method184(class49 arg0, class174[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method231(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method232(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
    public final void method658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field856++;
            this.method250(arg2, arg3, arg0, arg4, 1);
            if (arg1 != 27174) {
                this.field865 = -29;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field871[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method214(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method250(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()V")
    public abstract void method215();

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method174(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field858++;
            this.method174(arg1, arg4, arg3, arg2, arg0);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field871[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsn;I)V")
    public abstract void method172(class659 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method155();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public final void method660(boolean arg0) throws class146 {
        try {
            field860++;
            if (!arg0) {
                this.method171(0, 0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field871[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public final void method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg3 <= 36) {
                this.method251();
            }
            field855++;
            this.method208(arg4, arg0, arg2, arg5, arg1, 1);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field871[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
    public final void method662(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            this.method262(arg3, arg4, arg2, arg0, 1);
            field859++;
            if (arg1 <= 50) {
                this.field864 = null;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field871[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method219();

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method212();

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method221(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        try {
            this.method668(-4369);
            field869++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field871[14] + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method207(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method161(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Lsj;")
    public abstract class486 method257();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method158();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method199(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method156(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lih;")
    public abstract class731 method195(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method268(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method189(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method151(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method193();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lel;")
    public abstract class575 method209(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
    public abstract void method194();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method148();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method160();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)[Lwh;")
    public static final class155[] method663(boolean arg0) {
        try {
            if (!arg0) {
                field853 = null;
            }
            field861++;
            return new class155[] { class504.field7539, class201.field3178, class197.field3129, class484.field7347, class365.field5944, class39.field443, class663.field9444, class623.field8992, class265.field4302, class198.field3140 };
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field871[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method260(int arg0);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()I")
    public abstract int method177();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lhk;")
    public abstract class107 method266(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method239(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Llia;)V")
    public abstract void method253(class505 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Luh;Z)Lhk;")
    public abstract class107 method213(class174 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method176();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Ltq;")
    public abstract class657 method223(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lhk;")
    public abstract class107 method211(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIZ)V")
    public final void method664(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            this.method242(arg3, arg0, arg2, arg4, arg1, 1);
            if (arg5) {
                field867++;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field871[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII[II)Lhk;")
    public final class107 method665(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        try {
            int var7 = -70 / ((arg2 - 52) / 57);
            field862++;
            return this.method266(arg4, arg3, arg0, arg1, arg5, true);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field871[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field871[1] : field871[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method166(float arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method210(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method196();

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lhk;")
    public abstract class107 method179(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
    public abstract void method222();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method220(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method263();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public abstract void method246(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method666(byte arg0) {
        try {
            if (arg0 < -26) {
                field853 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field871[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
    public abstract void method202();

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method243(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()V")
    public abstract void method225();

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method162(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class63(class158 arg0) {
        try {
            this.field864 = arg0;
            int var2 = -1;
            for (int var3 = 0; var3 < 8; var3++) {
                if (!class120.field1732[var3]) {
                    var2 = var3;
                    class120.field1732[var3] = true;
                    break;
                }
            }
            if (var2 == -1) {
                throw new IllegalStateException(field871[12]);
            }
            this.field865 = var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field871[11] + (arg0 == null ? field871[1] : field871[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method238();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method167();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
    public abstract boolean method245();

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method187();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method229(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)Llia;")
    public abstract class505 method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method181();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Lza;")
    public abstract class437 method228(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLhk;)V")
    public final void method667(byte arg0, class107 arg1) {
        try {
            int var3 = 29 / ((arg0 - 31) / 50);
            this.method248(this.method217(arg1, this.method223(arg1.method7(), arg1.method13())));
            field868++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field871[0] + arg0 + ',' + (arg1 == null ? field871[1] : field871[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method154();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method241();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method216();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lel;Ltq;)Lsia;")
    public abstract class769 method217(class575 arg0, class657 arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method169(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method247(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public final void method668(int arg0) {
        try {
            field854++;
            if (arg0 == -4369) {
                class120.field1732[this.field865] = false;
                this.method202();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field871[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method669(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method670(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
