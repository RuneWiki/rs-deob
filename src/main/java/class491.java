import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class491 {

    @OriginalMember(owner = "client!za", name = "c", descriptor = "I")
    public int field7164;

    @OriginalMember(owner = "client!za", name = "r", descriptor = "Ll;")
    public class196 field7179;

    @OriginalMember(owner = "client!za", name = "h", descriptor = "Lob;")
    public static class269 field7169 = new class269();

    @OriginalMember(owner = "client!za", name = "q", descriptor = "[I")
    public static int[] field7178 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!za", name = "a", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!za", name = "b", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!za", name = "d", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!za", name = "e", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!za", name = "f", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!za", name = "g", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "[I")
    public static int[] field7177;

    static {
        new class306("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V", line = 9)
    public final void method2858(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7173++;
        this.method840(arg4, arg0, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V", line = 27)
    public final void method2859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method915(arg5, arg4, arg0, arg3, arg1, 1);
        field7165++;
        if (arg2 > -8) {
            this.method914(-98, 49, 16, 29, 2, 15);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;Lnv;ILl;II)Lza;", line = 45)
    public static final synchronized class491 method2860(Canvas arg0, class493 arg1, int arg2, class196 arg3, int arg4, int arg5) {
        field7167++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class438.field6536[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class491 var9;
        if (arg4 == arg5) {
            var9 = class295.method1889(-7830, arg3, arg0, var6);
        } else if (arg4 == 1) {
            var9 = class356.method2284(arg1, arg3, var6, arg2, arg0, arg5 ^ 0xFFFFFFDF);
        } else if (arg4 == 2) {
            var9 = class187.method1266((byte) 119, arg1, var6, arg0, arg3);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class438.field6536[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(I)V", line = 105)
    public static void method2861(int arg0) {
        field7177 = null;
        field7178 = null;
        field7169 = null;
        if (arg0 != -31966) {
            field7178 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V", line = 117)
    protected void finalize() {
        field7163++;
        this.method2867((byte) -105);
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIII)V", line = 130)
    public final void method2862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 66) {
            field7177 = null;
        }
        field7174++;
        this.method876(arg1, arg0, arg2, arg3, 1);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(III)V", line = 142)
    public static final void method2863(int arg0, int arg1, int arg2) {
        field7162++;
        class266 var3 = class308.method1961(true, arg2, 14);
        var3.method1781((byte) 95);
        if (arg0 == -2) {
            var3.field4454 = arg1;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIIII)V", line = 161)
    public final void method2864(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field7172++;
        this.method914(arg3, arg0, arg2, arg4, arg5, 1);
        if (arg1 != 13) {
            this.method883();
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIBI)V", line = 187)
    public final void method2865(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.method854(arg2, arg4, arg1, arg0, 1);
        if (arg3 != 87) {
            this.field7179 = null;
        }
        field7166++;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([JIBI[Ljava/lang/Object;)V", line = 228)
    public static final void method2866(long[] arg0, int arg1, byte arg2, int arg3, Object[] arg4) {
        field7168++;
        if (arg2 != 20 || arg1 >= arg3) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if ((long) (var10 & var11) + var7 > arg0[var11]) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                Object var14 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6++] = var14;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg3] = arg4[var6];
        arg4[var6] = var9;
        method2866(arg0, arg1, (byte) 20, var6 - 1, arg4);
        method2866(arg0, var6 + 1, (byte) 20, arg3, arg4);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V", line = 287)
    public final void method2867(byte arg0) {
        if (arg0 <= -70) {
            field7175++;
            class438.field6536[this.field7164] = false;
            this.method884();
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIILjava/lang/Class;)Lol;", line = 317)
    public static final class290 method2868(int arg0, int arg1, int arg2, Class arg3) {
        class465 var4 = class66.field977[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class1 var5 = var4.field6898; var5 != null; var5 = var5.field2) {
            class290 var6 = var5.field9;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4718 == arg1 && var6.field4717 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!za", name = "e", descriptor = "(IIIIII)V", line = 369)
    public final void method2869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == 24207) {
            this.method839(arg5, arg2, arg3, arg4, arg1, 1);
            field7170++;
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILl;)V", line = 387)
    public class491(int arg0, class196 arg1) {
        this.field7164 = arg0;
        this.field7179 = arg1;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()V")
    public abstract void method884();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
    public abstract boolean method896();

    @OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
    public abstract int[] method811(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ld;)V")
    public abstract void method885(class66 arg0);

    @OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILta;II)V")
    public abstract void method825(int arg0, class448 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "()Z")
    public abstract boolean method912();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
    public abstract void method852(int arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "()Z")
    public abstract boolean method827();

    @OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
    public abstract int method905();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
    public abstract int method902(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
    public abstract void method891(int arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
    public abstract void method889(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
    public abstract void method873(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
    public abstract void method908(int[] arg0);

    @OriginalMember(owner = "client!za", name = "e", descriptor = "()Lc;")
    public abstract class202 method820();

    @OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
    public abstract void method858();

    @OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
    public abstract void method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method863(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
    public abstract void method813(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lko;IIII)Le;")
    public abstract class530 method875(class227 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)V")
    public abstract void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lja;")
    public abstract class450 method895(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "f", descriptor = "()Z")
    public abstract boolean method833();

    @OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
    public abstract void method859(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!za", name = "g", descriptor = "()V")
    public abstract void method828();

    @OriginalMember(owner = "client!za", name = "h", descriptor = "()Z")
    public abstract boolean method807();

    @OriginalMember(owner = "client!za", name = "i", descriptor = "()I")
    public abstract int method883();

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)Lug;")
    public abstract class322 method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
    public abstract boolean method841();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lo;")
    public abstract class138 method843(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILta;II)V")
    public abstract void method899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class448 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
    public abstract void method857(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method916(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
    public abstract void method848();

    @OriginalMember(owner = "client!za", name = "k", descriptor = "()V")
    public abstract void method888();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lwh;Z)Lo;")
    public abstract class138 method837(class523 arg0, boolean arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lta;")
    public abstract class448 method887(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(I)Ln;")
    public abstract class511 method874(int arg0);

    @OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
    public abstract int method879();

    @OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
    public abstract void method840(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
    public abstract boolean method815();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Lc;[Ltq;I)V")
    public abstract void method880(class530[] arg0, class202 arg1, class273[] arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
    public abstract float method850();

    @OriginalMember(owner = "client!za", name = "m", descriptor = "()Lc;")
    public abstract class202 method835();

    @OriginalMember(owner = "client!za", name = "o", descriptor = "()Z")
    public abstract boolean method903();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method901(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([Le;Ld;Lc;[Ltq;I)V")
    public abstract void method838(class530[] arg0, class66 arg1, class202 arg2, class273[] arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "q", descriptor = "()Z")
    public abstract boolean method822();

    @OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
    public abstract int method816();

    @OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
    public abstract boolean method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "s", descriptor = "()V")
    public abstract void method913();

    @OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
    public abstract void method866(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Le;Ld;Lc;Ltq;I)V")
    public abstract void method853(class530 arg0, class66 arg1, class202 arg2, class273 arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
    public abstract float method898();

    @OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
    public abstract boolean method861();

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
    public abstract int method878(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
    public abstract void method877(float arg0, float arg1);

    @OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
    public abstract void method854(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public abstract void method886(boolean arg0);

    @OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
    public abstract int method823();

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lja;)V")
    public abstract void method870(int arg0, class450[] arg1);

    @OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
    public abstract void method829(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
    public abstract void method910(float arg0);

    @OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V")
    public abstract void method897(int arg0);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
    public abstract void method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method846(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "u", descriptor = "()Z")
    public abstract boolean method817();

    @OriginalMember(owner = "client!za", name = "v", descriptor = "()V")
    public abstract void method842();

    @OriginalMember(owner = "client!za", name = "w", descriptor = "()Z")
    public abstract boolean method906();

    @OriginalMember(owner = "client!za", name = "x", descriptor = "()V")
    public abstract void method836();

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method890(Canvas arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lug;)V")
    public abstract void method894(class322 arg0);

    @OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
    public abstract void method868(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lqm;[Lwh;Z)Lla;")
    public abstract class296 method892(class331 arg0, class523[] arg1, boolean arg2);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lo;")
    public abstract class138 method834(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
    public abstract void method871(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ln;)V")
    public abstract void method849(class511 arg0);

    @OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
    public abstract void method847(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
    public abstract void method876(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
    public abstract void method810(boolean arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Lug;Lug;FLug;)Lug;")
    public abstract class322 method812(class322 arg0, class322 arg1, float arg2, class322 arg3);

    @OriginalMember(owner = "client!za", name = "y", descriptor = "()Z")
    public abstract boolean method881();

    @OriginalMember(owner = "client!za", name = "z", descriptor = "()Z")
    public abstract boolean method831();

    @OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
    public abstract void method819(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
    public abstract void method864(int arg0);

    @OriginalMember(owner = "client!za", name = "A", descriptor = "()V")
    public abstract void method844();

    @OriginalMember(owner = "client!za", name = "g", descriptor = "(I)V")
    public abstract void method855(int arg0);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
    public abstract void method826(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
    public abstract void method862(int arg0, int arg1);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public abstract class220 method814(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!za", name = "B", descriptor = "()Z")
    public abstract boolean method808();

    @OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
    public abstract int method845();

    @OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
    public abstract void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
    public abstract void method900(boolean arg0);

    @OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lc;)V")
    public abstract void method911(class202 arg0);
}
