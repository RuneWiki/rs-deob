import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class90 {

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public int field1431 = -1;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "[I")
    public static int[] field1419 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1424 = "";

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[[I")
    public static int[][] field1420 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1425 = 2;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1421 = 2;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "[I")
    public static int[] field1433 = new int[13];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Ldp;")
    public static class174 field1435;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[I")
    public static int[] field1430;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 4)
    public static final String method669(int arg0, boolean arg1, int arg2) {
        field1434++;
        if (arg1 && arg0 >= 0) {
            int var3 = -80 % ((-arg2 - 80) / 36);
            return class273.method1955(arg0, arg1, (byte) 79, 10);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() {
        this.method685((byte) -31);
        field1432++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 49)
    public final void method685(byte arg0) {
        class175.field2610[this.field1431] = false;
        if (arg0 == -31) {
            field1429++;
            this.method688();
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIII)V", line = 70)
    public final void method692(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method675(arg1, arg0, arg3, arg4, arg2);
        field1428++;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIIII)V", line = 116)
    public final void method718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1426++;
        if (arg1 != 6) {
            field1421 = -5;
        }
        this.method729(arg3, arg2, arg0, arg4, 1);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 129)
    public static void method720(int arg0) {
        field1420 = null;
        field1433 = null;
        field1424 = null;
        field1430 = null;
        field1435 = null;
        if (arg0 != 18675) {
            method669(-117, true, 103);
        }
        field1419 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIBI)V", line = 144)
    public final void method721(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method711(arg2, arg0, arg3, arg5, arg1, 1);
        if (arg4 != -69) {
            field1419 = null;
        }
        field1427++;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(IIIIII)V", line = 156)
    public final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1423++;
        if (arg0 == 15281) {
            this.method762(arg3, arg2, arg4, arg1, arg5, 1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(IIIII)V", line = 187)
    public final void method733(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1418++;
        this.method750(arg3, arg0, arg2, arg4, 1);
        if (arg1 != 4805) {
            field1420 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBIIII)V", line = 201)
    public final void method736(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1422++;
        this.method681(arg4, arg5, arg3, arg0, arg2, 1);
        if (arg1 != -40) {
            this.method723(-60, 82, 119, -122, -36, 60);
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()Z")
    public abstract boolean method668();

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "()Z")
    public abstract boolean method670();

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "()I")
    public abstract int method671();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V")
    public abstract void method672(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lpo;)V")
    public abstract void method673(class202 arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[I[I)Lrn;")
    public abstract class134 method674(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
    public abstract void method675(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public abstract void method676(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
    public abstract int method677(int arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lqi;)V")
    public abstract void method678(class207 arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIII)V")
    public abstract void method680(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public abstract void method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "()V")
    public abstract void method682();

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "()Z")
    public abstract boolean method683();

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "()V")
    public abstract void method684();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZ)Lof;")
    public abstract class421 method686(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIIII)Lqi;")
    public abstract class207 method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "()V")
    public abstract void method688();

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "()F")
    public abstract float method689();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([Lrc;Lhe;Lpo;[Ltc;I)V")
    public abstract void method690(class100[] arg0, class30 arg1, class202 arg2, class290[] arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIIIII)Z")
    public abstract boolean method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FF)V")
    public abstract void method693(float arg0, float arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "()Z")
    public abstract boolean method694();

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIII)[I")
    public abstract int[] method695(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "()Z")
    public abstract boolean method697();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lrc;Lhe;Lpo;Ltc;I)V")
    public abstract void method698(class100 arg0, class30 arg1, class202 arg2, class290 arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(F)V")
    public abstract void method699(float arg0);

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "()Z")
    public abstract boolean method700();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public abstract void method701(int arg0);

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "()I")
    public abstract int method702();

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Loe;")
    public abstract class229 method703(int arg0);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIII)V")
    public abstract void method704(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "()Z")
    public abstract boolean method705();

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public abstract void method706(int arg0);

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "()Z")
    public abstract boolean method707();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public abstract void method708(int[] arg0);

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "()Lpo;")
    public abstract class202 method709();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lqi;Lqi;FLqi;)Lqi;")
    public abstract class207 method710(class207 arg0, class207 arg1, float arg2, class207 arg3);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIIIII)V")
    public abstract void method711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method712(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)I")
    public abstract int method713(int arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
    public abstract void method714(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([IIIII)Lof;")
    public abstract class421 method715(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "()Z")
    public abstract boolean method716();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public abstract void method717(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIILrn;II)V")
    public abstract void method719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "()V")
    public abstract void method722();

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "()Z")
    public abstract boolean method724();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method725(Canvas arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFF)V")
    public abstract void method726(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[[I[[IIII)Lnc;")
    public abstract class126 method727(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method728(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIIII)V")
    public abstract void method729(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "()Z")
    public abstract boolean method730();

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)V")
    public abstract void method731(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public abstract void method732(int arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lhb;Z)Lof;")
    public abstract class421 method734(class344 arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Leb;IIII)Lrc;")
    public abstract class100 method735(class382 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "()I")
    public abstract int method737();

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)V")
    public abstract void method738(int arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "()I")
    public abstract int method740();

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "()V")
    public abstract void method741();

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "()V")
    public abstract void method742();

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "()Z")
    public abstract boolean method743();

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "()I")
    public abstract int method744();

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public abstract void method745(int arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public abstract void method746(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "()Z")
    public abstract boolean method747();

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "()Lpo;")
    public abstract class202 method748();

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "()V")
    public abstract void method749();

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(IIIII)V")
    public abstract void method750(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "()V")
    public abstract void method751();

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(IIII)V")
    public abstract void method752(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lhe;)V")
    public abstract void method753(class30 arg0);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(II)V")
    public abstract void method754(int arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[Luc;)V")
    public abstract void method755(int arg0, class59[] arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([Lrc;Lpo;[Ltc;I)V")
    public abstract void method756(class100[] arg0, class202 arg1, class290[] arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "()I")
    public abstract int method757();

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public abstract void method758(int arg0);

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "()F")
    public abstract float method759();

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "()Z")
    public abstract boolean method760();

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "()V")
    public abstract void method761();

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(IIIIII)V")
    public abstract void method762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "()Z")
    public abstract boolean method763();

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "()V")
    public abstract void method764();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lbs;[Lhb;Z)Lpi;")
    public abstract class220 method765(class186 arg0, class344[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILrn;II)V")
    public abstract void method766(int arg0, class134 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Loe;)V")
    public abstract void method767(class229 arg0);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public abstract void method768(int arg0, int arg1, int arg2);
}
