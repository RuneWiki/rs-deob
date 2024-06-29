import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class548 {

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Ld;")
    public class270 field7623;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public int field7611;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "[I")
    public static int[] field7613 = new int[64];

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lww;")
    public static class288 field7624 = new class288(9, 2);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
    public static int[] field7627 = new int[5];

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Lkr;")
    public static class602 field7628 = new class602(41, -2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lfd;")
    public static class298 field7626;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIIII)V", line = 5)
    public final void method3242(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1434(arg4, arg3, arg2, arg0, arg5, 1);
        field7625++;
        int var7 = 65 % ((-arg1 - 22) / 62);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V", line = 41)
    public final void method3243(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -27) {
            field7627 = null;
        }
        field7609++;
        this.method1487(arg0, arg2, arg4, arg3, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[IBIII)Lfd;", line = 59)
    public final class298 method3244(int arg0, int[] arg1, byte arg2, int arg3, int arg4, int arg5) {
        field7621++;
        if (arg2 >= -54) {
            field7626 = null;
        }
        return this.method1549(arg1, arg4, arg5, arg3, arg0, true);
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 75)
    protected void finalize() {
        this.method3248((byte) -88);
        field7614++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILha;Z)Lda;", line = 84)
    public static final class402 method3245(int arg0, int arg1, class548 arg2, boolean arg3) {
        field7620++;
        int var4 = 125 / ((arg0 + 66) / 50);
        class685 var5 = class38.method205(arg1, 0, arg3, arg2);
        return var5 == null ? null : var5.field9519;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILfd;)V", line = 105)
    public final void method3246(int arg0, class298 arg1) {
        this.method325(this.method311(arg1, this.method317(arg1.method1955(), arg1.method1952())));
        field7612++;
        if (arg0 != 0) {
            this.method325(null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V", line = 129)
    public final void method3247(Rectangle[] arg0, int arg1, int arg2) throws class692 {
        this.method282(arg0, arg2, 0, 0);
        if (arg1 >= -103) {
            field7628 = null;
        }
        field7618++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 156)
    public final void method3248(byte arg0) {
        class733.field10177[this.field7611] = false;
        field7610++;
        this.method312();
        if (arg0 != -88) {
            this.method1461(-17, -108, null, null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V", line = 169)
    public final void method3249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = -43 / ((91 - arg1) / 32);
        field7616++;
        this.method1412(arg0, arg5, arg3, arg2, arg4, 1);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V", line = 183)
    public final void method3250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 29600) {
            field7628 = null;
        }
        this.method1534(arg2, arg4, arg3, arg1, arg5, 1);
        field7617++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 210)
    public static void method3251(byte arg0) {
        field7626 = null;
        field7613 = null;
        field7627 = null;
        if (arg0 == -77) {
            field7628 = null;
            field7624 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 236)
    public final void method3252(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1439(arg3, arg1, arg0, arg4, 1);
        if (arg2 != -21650) {
            this.method1421(6, -92, 23, 32);
        }
        field7606++;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V", line = 247)
    public final void method3253(byte arg0) throws class692 {
        if (arg0 == -3) {
            field7608++;
            this.method262(0, 0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIZ)V", line = 259)
    public final void method3254(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field7619 = 52;
        }
        this.method1427(arg3, arg2, arg0, arg1, 1);
        field7615++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Canvas;Luu;IIIILd;)Lha;", line = 305)
    public static final synchronized class548 method3255(int arg0, Canvas arg1, class237 arg2, int arg3, int arg4, int arg5, int arg6, class270 arg7) {
        field7622++;
        if (arg0 == 0) {
            return class571.method3349(arg3, arg6, arg1, arg7, false);
        } else if (arg0 == arg4) {
            return class731.method4076(arg3, arg7, 46, arg6, arg1);
        } else if (arg0 == 1) {
            return class735.method4095(arg7, (byte) 48, arg1, arg5);
        } else if (arg0 == 5) {
            return class747.method4155(arg2, arg1, arg5, (byte) -71, arg7);
        } else if (arg0 == 3) {
            return class660.method3667((byte) 38, arg5, arg7, arg2, arg1);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 363)
    public class548(class270 arg0) {
        this.field7623 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class733.field10177[var3]) {
                class733.field10177[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field7611 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method308(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method1540(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1451(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ltj;)V")
    public abstract void method1532(int arg0, class687[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method1395();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method306(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method289();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method1472();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public abstract int method1484(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loia;Z)Lfd;")
    public abstract class298 method1496(class52 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lik;I)V")
    public abstract void method1479(class100 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method1509();

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method1399(int arg0);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method1457(float arg0);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method1501(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method1486(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method272(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method1488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lfd;")
    public abstract class298 method1471(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method1490();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method1387();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method1511(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method1439(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method1407();

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method1454(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
    public abstract void method1513();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Ler;")
    public abstract class299 method263();

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method1482();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method1447();

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method273(int arg0);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
    public abstract void method312();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method1423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method1437();

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method1531();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method1535(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method1498(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method1415(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method1487(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Lih;")
    public abstract class744 method1404();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Ltj;")
    public abstract class687 method1476(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lej;[Loia;Z)Lda;")
    public abstract class402 method1392(class179 arg0, class52[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method1545(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method1469();

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method1504();

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
    public abstract void method315();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()I")
    public abstract int method1481();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method1424(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method310(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method1445(int arg0);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method268(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
    public abstract boolean method1446();

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method1529(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method264(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method346();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)Lza;")
    public abstract class257 method1539(int arg0);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method1475(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class341 method1542(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method1474(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1510(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldi;)V")
    public abstract void method325(class5 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpw;Llh;)Ldi;")
    public abstract class5 method311(class106 arg0, class208 arg1);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method1544(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lfd;")
    public abstract class298 method1514(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhe;)V")
    public abstract void method1391(class577 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class573 method1461(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method282(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class692;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method1533(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhe;Lhe;FLhe;)Lhe;")
    public abstract class577 method260(class577 arg0, class577 arg1, float arg2, class577 arg3);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
    public abstract void method281();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method1398(int arg0);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method1411(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method1421(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method277();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method1483(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()V")
    public abstract void method290();

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method1389();

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method1492(int arg0);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method1427(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lih;)V")
    public abstract void method1444(class744 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lik;)V")
    public abstract void method1413(class100 arg0);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
    public abstract void method278();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lpw;")
    public abstract class106 method299(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method1521(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
    public abstract void method262(int arg0, int arg1) throws class692;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method302();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)Lhe;")
    public abstract class577 method1547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    public abstract int method1390(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Lih;")
    public abstract class744 method1495();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method1441();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method1523(class257 arg0);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Lih;")
    public abstract class744 method1385();

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method1430();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method1426();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvo;IIII)Lka;")
    public abstract class284 method1463(class133 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method283();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method284(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
    public abstract void method1534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lfd;")
    public abstract class298 method1549(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Llh;")
    public abstract class208 method317(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method1419();

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method1548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method1402(int arg0, class573 arg1, int arg2, int arg3);
}
