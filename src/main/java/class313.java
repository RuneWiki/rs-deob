import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class class313 {

    @OriginalMember(owner = "client!np", name = "n", descriptor = "Lwp;")
    public class109 field4432;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "[I")
    public static int[] field4428 = new int[13];

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "[I")
    public static int[] field4423;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V")
    public abstract void method630(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public abstract void method661(int arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(FFF)V")
    public abstract void method619(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method663(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII)V")
    public abstract void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(FF)V")
    public abstract void method686(float arg0, float arg1);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
    public abstract void method673(boolean arg0);

    @OriginalMember(owner = "client!np", name = "d", descriptor = "()Z")
    public abstract boolean method603();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)C")
    public static final char method1930(int arg0, byte arg1) {
        field4433++;
        int var2 = arg1 & 0xFF;
        if (arg0 == var2) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class304.field4335[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIIII)Lja;")
    public abstract class167 method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!np", name = "e", descriptor = "()Z")
    public abstract boolean method657();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method649(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lcs;)V")
    public abstract void method621(class207 arg0);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
    public abstract void method610(int arg0);

    @OriginalMember(owner = "client!np", name = "f", descriptor = "()V")
    public abstract void method701();

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(IIII)V")
    public abstract void method617(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "g", descriptor = "()I")
    public abstract int method687();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lju;Z)Ltr;")
    public abstract class176 method644(class72 arg0, boolean arg1);

    @OriginalMember(owner = "client!np", name = "h", descriptor = "()I")
    public abstract int method615();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([IIIII)Ltr;")
    public abstract class176 method651(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II[[I[[IIII)Lpl;")
    public abstract class426 method636(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lgf;)V")
    public abstract void method672(class166 arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method683(Canvas arg0);

    @OriginalMember(owner = "client!np", name = "i", descriptor = "()Z")
    public abstract boolean method656();

    @OriginalMember(owner = "client!np", name = "j", descriptor = "()I")
    public abstract int method614();

    @OriginalMember(owner = "client!np", name = "k", descriptor = "()V")
    public abstract void method679();

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(IIII)V")
    public abstract void method613(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIII)V")
    public final void method1931(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 86) {
            method1935((byte) -60);
        }
        field4430++;
        this.method600(arg3, arg2, arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(IIII)V")
    public abstract void method604(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method695(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!np", name = "l", descriptor = "()Z")
    public abstract boolean method655();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILnp;)V")
    public static final void method1932(int arg0, class313 arg1) {
        if (arg0 != 9143) {
            method1937(69, (Canvas) null, (class430) null, (class109) null, 11, -119);
        }
        field4426++;
        if (class103.field1317) {
            class230.method1465(arg1, true);
        } else {
            class230.method1466((byte) -126, arg1);
        }
    }

    @OriginalMember(owner = "client!np", name = "m", descriptor = "()V")
    public abstract void method667();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIBI)V")
    public final void method1933(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 < -90) {
            field4420++;
            this.method641(arg5, arg3, arg2, arg0, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([Lf;Lcs;Los;[Lkt;I)V")
    public abstract void method612(class491[] arg0, class207 arg1, class282 arg2, class98[] arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(IIIIII)Z")
    public abstract boolean method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lqb;[Lju;Z)Loh;")
    public abstract class256 method688(class135 arg0, class72[] arg1, boolean arg2);

    @OriginalMember(owner = "client!np", name = "n", descriptor = "()Z")
    public abstract boolean method684();

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
    public abstract void method664(int arg0);

    @OriginalMember(owner = "client!np", name = "o", descriptor = "()Z")
    public abstract boolean method700();

    @OriginalMember(owner = "client!np", name = "p", descriptor = "()V")
    public abstract void method675();

    @OriginalMember(owner = "client!np", name = "q", descriptor = "()Z")
    public abstract boolean method640();

    @OriginalMember(owner = "client!np", name = "r", descriptor = "()V")
    public abstract void method622();

    @OriginalMember(owner = "client!np", name = "s", descriptor = "()V")
    public abstract void method681();

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(IIIIII)V")
    public abstract void method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(IIIII)V")
    public abstract void method693(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "t", descriptor = "()Z")
    public abstract boolean method666();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(F)V")
    public abstract void method680(float arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIZ)Ltr;")
    public abstract class176 method626(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!np", name = "u", descriptor = "()V")
    public abstract void method691();

    @OriginalMember(owner = "client!np", name = "v", descriptor = "()Z")
    public abstract boolean method652();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Los;)V")
    public abstract void method609(class282 arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lf;Lcs;Los;Lkt;I)V")
    public abstract void method646(class491 arg0, class207 arg1, class282 arg2, class98 arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "w", descriptor = "()I")
    public abstract int method654();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lja;)V")
    public abstract void method685(class167 arg0);

    @OriginalMember(owner = "client!np", name = "x", descriptor = "()Los;")
    public abstract class282 method601();

    @OriginalMember(owner = "client!np", name = "y", descriptor = "()V")
    public abstract void method698();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III[I)V")
    public abstract void method633(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(IIIIII)V")
    public abstract void method699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!np", name = "z", descriptor = "()F")
    public abstract float method677();

    @OriginalMember(owner = "client!np", name = "A", descriptor = "()F")
    public abstract float method694();

    @OriginalMember(owner = "client!np", name = "B", descriptor = "()Z")
    public abstract boolean method639();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
    public abstract void method682(int arg0, int arg1);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIILsm;II)V")
    public abstract void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class171 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
    public abstract void method668(boolean arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILsm;II)V")
    public abstract void method665(int arg0, class171 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II)I")
    public abstract int method653(int arg0, int arg1);

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(II)I")
    public abstract int method647(int arg0, int arg1);

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
    public abstract void method678(int arg0);

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(IIII)V")
    public abstract void method669(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(Z)V")
    public abstract void method618(boolean arg0);

    @OriginalMember(owner = "client!np", name = "C", descriptor = "()Z")
    public abstract boolean method598();

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(IIIII)V")
    public final void method1934(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4434++;
        this.method693(arg3, arg2, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public static void method1935(byte arg0) {
        field4428 = null;
        field4423 = null;
        int var1 = -25 % ((arg0 - 53) / 59);
    }

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(IIII)V")
    public abstract void method631(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "D", descriptor = "()Z")
    public abstract boolean method697();

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
    public final void method1936(byte arg0) {
        class59.field797[this.field4429] = false;
        field4421++;
        this.method701();
        if (arg0 < 98) {
            this.method641(-102, 97, 2, -120, 31, -23);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lvn;IIII)Lf;")
    public abstract class491 method696(class187 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Lgf;")
    public abstract class166 method692(int arg0);

    @OriginalMember(owner = "client!np", name = "E", descriptor = "()I")
    public abstract int method608();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lja;Lja;FLja;)Lja;")
    public abstract class167 method634(class167 arg0, class167 arg1, float arg2, class167 arg3);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILjava/awt/Canvas;Lmj;Lwp;II)Lnp;")
    public static final synchronized class313 method1937(int arg0, Canvas arg1, class430 arg2, class109 arg3, int arg4, int arg5) {
        field4422++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class59.field797[var7]) {
                var6 = var7;
                break;
            }
        }
        if (arg4 != 21954) {
            field4423 = null;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class313 var9;
        if (arg0 == 0) {
            var9 = class61.method383((byte) -74, arg1, var6, arg3);
        } else if (arg0 == 1) {
            var9 = class55.method346(arg2, arg1, 14015, var6, arg3, arg5);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class59.field797[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
    public abstract void method642(int arg0);

    @OriginalMember(owner = "client!np", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1936((byte) 127);
        field4427++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([Lf;Los;[Lkt;I)V")
    public abstract void method627(class491[] arg0, class282 arg1, class98[] arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "F", descriptor = "()Z")
    public abstract boolean method645();

    @OriginalMember(owner = "client!np", name = "G", descriptor = "()V")
    public abstract void method620();

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(II)V")
    public abstract void method625(int arg0, int arg1);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([I)V")
    public abstract void method690(int[] arg0);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIIBI)V")
    public final void method1938(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 == 108) {
            field4435++;
            this.method699(arg5, arg2, arg1, arg0, arg3, 1);
        }
    }

    @OriginalMember(owner = "client!np", name = "H", descriptor = "()I")
    public abstract int method606();

    @OriginalMember(owner = "client!np", name = "g", descriptor = "(IIII)V")
    public abstract void method607(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(ILwp;)V")
    public class313(int arg0, class109 arg1) {
        this.field4432 = arg1;
        this.field4429 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[Leo;)V")
    public abstract void method637(int arg0, class178[] arg1);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II[I[I)Lsm;")
    public abstract class171 method659(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!np", name = "I", descriptor = "()Z")
    public abstract boolean method616();

    @OriginalMember(owner = "client!np", name = "J", descriptor = "()V")
    public abstract void method643();

    @OriginalMember(owner = "client!np", name = "K", descriptor = "()Z")
    public abstract boolean method648();

    @OriginalMember(owner = "client!np", name = "L", descriptor = "()Los;")
    public abstract class282 method632();

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILrp;)V")
    public static final void method1939(int arg0, class276 arg1) {
        for (int var2 = 0; var2 < class353.field5102; var2++) {
            int var3 = arg1.method1712(-1);
            int var4 = arg1.method1729(arg0 - 255);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class125.field1641[var3] != null) {
                class125.field1641[var3].field4618 = var4;
            }
        }
        if (arg0 != 65535) {
            method1939(-59, (class276) null);
        }
        field4431++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIB)V")
    public final void method1940(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4424++;
        this.method630(arg1, arg0, arg3, arg2, 1);
        if (arg4 != -111) {
            this.method611(7, 63, -112, 80, -18, -42, -78);
        }
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(IIIII)V")
    public abstract void method600(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(IIIIII)V")
    public final void method1941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method650(arg4, arg1, arg3, arg0, arg5, arg2);
        field4425++;
    }
}
