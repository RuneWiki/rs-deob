import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class class405 {

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field6028 = -1;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6016 = "Loading textures - ";

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public abstract void method1649(int arg0);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
    public abstract void method1694();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(FF)V")
    public abstract void method1737(float arg0, float arg1);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public abstract void method1638(boolean arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZIII)V")
    public final void method2608(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6025++;
        if (!arg1) {
            this.method1734();
        }
        this.method1741(arg3, arg0, arg2, arg4, 1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[I)V")
    public abstract void method1783(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public abstract void method1682(int arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
    public abstract void method1666(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lvj;)V")
    public abstract void method1648(class177 arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
    public abstract int method1620(int arg0, int arg1);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()V")
    public abstract void method1670();

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "()Z")
    public abstract boolean method1728();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
    public abstract void method1732(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public static void method2609(int arg0) {
        field6016 = null;
        if (arg0 != 31542) {
            field6019 = 24;
        }
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "()Z")
    public abstract boolean method1625();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Ldc;Lop;Lvj;[Lkd;I)V")
    public abstract void method1692(class375[] arg0, class352 arg1, class177 arg2, class330[] arg3, int arg4);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lhs;Lhs;FLhs;)Lhs;")
    public abstract class420 method1681(class420 arg0, class420 arg1, float arg2, class420 arg3);

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "()F")
    public abstract float method1724();

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)I")
    public abstract int method1643(int arg0, int arg1);

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "()Z")
    public abstract boolean method1695();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZIII)V")
    public final void method2610(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field6020++;
        if (!arg2) {
            this.method1756(-0.6746831F);
        }
        this.method1632(arg4, arg5, arg3, arg0, arg1, 1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
    public abstract void method1746(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "()Z")
    public abstract boolean method1740();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIZ)Lcq;")
    public abstract class67 method1663(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "()V")
    public abstract void method1757();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII)Lhs;")
    public abstract class420 method1774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[[I[[IIII)Lck;")
    public abstract class351 method1688(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "()V")
    public abstract void method1707();

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "()V")
    public abstract void method1652();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ltr;)V")
    public abstract void method1780(class139 arg0);

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "()Z")
    public abstract boolean method1734();

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
    public abstract void method1727(int arg0);

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "()Z")
    public abstract boolean method1640();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lup;Z)Lcq;")
    public abstract class67 method1710(class441 arg0, boolean arg1);

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "()I")
    public abstract int method1771();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lop;)V")
    public abstract void method1700(class352 arg0);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIII)Z")
    public abstract boolean method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[Lwc;)V")
    public abstract void method1626(int arg0, class367[] arg1);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method1752(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILud;II)V")
    public abstract void method1784(int arg0, class2 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "()V")
    public abstract void method1748();

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "()V")
    public abstract void method1697();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/awt/Canvas;Lfh;Lwd;II)Lii;")
    public static final synchronized class405 method2611(int arg0, Canvas arg1, class210 arg2, class36 arg3, int arg4, int arg5) {
        field6018++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class261.field3791[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class405 var9;
        if (arg5 == 0) {
            var9 = class323.method2170(arg2, arg1, var6, 0);
        } else if (arg5 == 1) {
            var9 = class110.method721(50, arg4, var6, arg1, arg2, arg3);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class261.field3791[var6] = true;
        return arg0 == 10402 ? var9 : null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIII)V")
    public final void method2612(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1739(arg0, arg2, arg4, arg1, arg3);
        field6027++;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIIII)V")
    public abstract void method1632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)La;")
    public static final class72 method2613(int arg0, byte arg1) {
        if (arg1 < 117) {
            return null;
        } else {
            field6024++;
            return (class72) class8.field145.method384((long) arg0, true);
        }
    }

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "()Z")
    public abstract boolean method1736();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIZ)V")
    public final void method2614(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1782(arg2, arg1, arg0, arg3, arg4, 1);
        if (arg5) {
            this.method1692((class375[]) null, (class352) null, (class177) null, (class330[]) null, -54);
        }
        field6021++;
    }

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "()Z")
    public abstract boolean method1726();

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "()Z")
    public abstract boolean method1743();

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIII)V")
    public final void method2615(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6023++;
        int var6 = -85 / ((arg4 + 52) / 58);
        this.method1666(arg3, arg2, arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lhs;)V")
    public abstract void method1671(class420 arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIII)Lcq;")
    public abstract class67 method1624(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "()Z")
    public abstract boolean method1720();

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "()Z")
    public abstract boolean method1770();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1719(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIIII)V")
    public abstract void method1741(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V")
    public abstract void method1685(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lcl;[Lup;Z)Lwl;")
    public abstract class273 method1683(class313 arg0, class441[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)V")
    public abstract void method1665(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "()I")
    public abstract int method1678();

    @OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2617(1);
        field6029++;
    }

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "()Lvj;")
    public abstract class177 method1645();

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIII)V")
    public abstract void method1767(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
    public abstract void method1769(boolean arg0);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(IIIII)V")
    public abstract void method1739(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIII)[I")
    public abstract int[] method1729(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "()V")
    public abstract void method1749();

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "()Z")
    public abstract boolean method1730();

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "()Z")
    public abstract boolean method1684();

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIIIII)V")
    public abstract void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ldc;Lop;Lvj;Lkd;I)V")
    public abstract void method1653(class375 arg0, class352 arg1, class177 arg2, class330 arg3, int arg4);

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
    public abstract void method1764(int arg0, int arg1);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIILud;II)V")
    public abstract void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "()I")
    public abstract int method1709();

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V")
    public abstract void method1698(boolean arg0);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(II)V")
    public abstract void method1788(int arg0, int arg1);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(IIII)V")
    public abstract void method1723(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(IIIIII)V")
    public abstract void method1782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "()V")
    public abstract void method1744();

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "()Z")
    public abstract boolean method1773();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(F)V")
    public abstract void method1756(float arg0);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFF)V")
    public abstract void method1702(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "()I")
    public abstract int method1779();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Ldc;Lvj;[Lkd;I)V")
    public abstract void method1679(class375[] arg0, class177 arg1, class330[] arg2, int arg3);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public abstract void method1699(int arg0);

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "()I")
    public abstract int method1787();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([I)V")
    public abstract void method1676(int[] arg0);

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(IIIIII)V")
    public final void method2616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1731(arg2, arg5, arg3, arg0, arg4, arg1);
        field6026++;
    }

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "()F")
    public abstract float method1619();

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
    public abstract void method1686(int arg0);

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "()Z")
    public abstract boolean method1717();

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "()I")
    public abstract int method1647();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1705(Canvas arg0);

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
    public final void method2617(int arg0) {
        field6022++;
        class261.field3791[this.field6028] = false;
        if (arg0 != 1) {
            this.method1693(115);
        }
        this.method1694();
    }

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "()V")
    public abstract void method1751();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwp;IIII)Ldc;")
    public abstract class375 method1715(class245 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method1623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[I[I)Lud;")
    public abstract class2 method1712(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "()Lvj;")
    public abstract class177 method1735();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)Ltr;")
    public abstract class139 method1693(int arg0);
}
