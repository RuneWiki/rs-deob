import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class281 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public int field3847 = -1;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lh;")
    public static class396 field3848 = null;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 10)
    public static void method1727(byte arg0) {
        field3848 = null;
        if (arg0 <= 111) {
            field3863 = 38;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I", line = 23)
    public static final int method1730(int arg0, int arg1, int arg2, int arg3) {
        field3862++;
        int var4 = 255 - arg1;
        int var5 = ((arg3 & 0xFF00) * arg1 & 0xFF0000 | (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        if (arg2 != 1) {
            method1730(-126, -108, 70, -64);
        }
        return (((arg0 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg0 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lgp;Lgp;IIZIZ)I", line = 40)
    public static final int method1734(class31 arg0, class31 arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field3861++;
        int var7 = class15.method82(arg1, arg2, arg6, (byte) -24, arg0);
        if (arg5 != var7) {
            return arg6 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class15.method82(arg1, arg3, arg4, (byte) -24, arg0);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)V", line = 74)
    public final void method1739(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1771(arg3, arg2, arg4, arg0, arg1);
        field3852++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIBIII)V", line = 102)
    public final void method1754(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -74) {
            this.method1759();
        }
        field3858++;
        this.method1748(arg4, arg1, arg3, arg5, arg0, 1);
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(IIIIII)V", line = 122)
    public final void method1762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -1) {
            this.method1798(93);
        }
        this.method1785(arg2, arg0, arg4, arg1, arg3, 1);
        field3855++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZIIIIII)V", line = 146)
    public static final void method1768(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3859++;
        int var8 = arg6 - arg2;
        int var9 = arg4 + arg2;
        for (int var10 = arg4; var10 < var9; var10++) {
            class73.method486(arg0, class84.field1286[var10], arg3, 2, arg7);
        }
        int var11 = arg7 - arg2;
        int var12 = arg0 + arg2;
        for (int var13 = arg6; var13 > var8; var13--) {
            class73.method486(arg0, class84.field1286[var13], arg3, -122, arg7);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class84.field1286[var14];
            class73.method486(arg0, var15, arg3, -107, var12);
            class73.method486(var12, var15, arg5, 80, var11);
            class73.method486(var11, var15, arg3, 107, arg7);
        }
        if (!arg1) {
            method1786(55, -94, (Canvas) null, (class351) null, (byte) 117, (class136) null);
        }
    }

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V", line = 197)
    protected final void finalize() {
        field3857++;
        this.method1809((byte) 79);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILqj;Lqj;)V", line = 207)
    public static final void method1775(int arg0, class296 arg1, class296 arg2) {
        class374.field5342 = arg2;
        class176.field2489 = arg1;
        field3854++;
        class176.field2489.method1911(0, 36);
        if (arg0 != 3827) {
            method1788(110, (int[]) null, (long[]) null, 23, 55);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(IIIII)V", line = 231)
    public final void method1782(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -896242968) {
            this.method1825();
        }
        field3853++;
        this.method1824(arg2, arg0, arg4, arg1, 1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILjava/awt/Canvas;Lkq;BLsr;)Laa;", line = 246)
    public static final synchronized class281 method1786(int arg0, int arg1, Canvas arg2, class351 arg3, byte arg4, class136 arg5) {
        field3849++;
        if (arg4 != 62) {
            method1775(103, (class296) null, (class296) null);
        }
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class361.field5070[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class281 var9;
        if (arg1 == 0) {
            var9 = class258.method1595(arg2, var6, arg5, arg4 ^ 0x36);
        } else if (arg1 == 1) {
            var9 = class91.method623(arg3, var6, arg5, arg2, arg0, 7);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class361.field5070[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[I[JII)V", line = 288)
    public static final void method1788(int arg0, int[] arg1, long[] arg2, int arg3, int arg4) {
        field3856++;
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if ((long) (var10 & 0x1) + var7 > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method1788(105, arg1, arg2, arg3, var6 - 1);
            method1788(113, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0 <= 95) {
            method1727((byte) -97);
        }
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(IIIIII)V", line = 349)
    public final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3860++;
        this.method1752(arg3, arg2, arg5, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 377)
    public final void method1809(byte arg0) {
        field3850++;
        if (arg0 < 5) {
            this.field3847 = 33;
        }
        class361.field5070[this.field3847] = false;
        this.method1815();
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(IIIII)V", line = 401)
    public final void method1820(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3851++;
        this.method1810(arg1, arg3, arg2, arg4, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lhc;Lqd;Lci;Lbd;I)V")
    public abstract void method1721(class75 arg0, class260 arg1, class261 arg2, class38 arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()Z")
    public abstract boolean method1722();

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "()Z")
    public abstract boolean method1723();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lci;)V")
    public abstract void method1724(class261 arg0);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "()Z")
    public abstract boolean method1725();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public abstract void method1726(int arg0);

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "()Z")
    public abstract boolean method1728();

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "()Z")
    public abstract boolean method1729();

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)V")
    public abstract void method1731(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    public abstract int method1732(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFF)V")
    public abstract void method1733(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(IIII)V")
    public abstract void method1735(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lap;IIII)Lhc;")
    public abstract class75 method1736(class279 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lqd;)V")
    public abstract void method1737(class260 arg0);

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "()I")
    public abstract int method1738();

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "()Z")
    public abstract boolean method1740();

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "()V")
    public abstract void method1741();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III[I)V")
    public abstract void method1742(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIII)Z")
    public abstract boolean method1743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(IIII)[I")
    public abstract int[] method1744(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[Lvb;)V")
    public abstract void method1745(int arg0, class107[] arg1);

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "()Z")
    public abstract boolean method1746();

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "()I")
    public abstract int method1747();

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIIIII)V")
    public abstract void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "()V")
    public abstract void method1749();

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "()I")
    public abstract int method1750();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZ)Llf;")
    public abstract class130 method1751(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method1752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "()Z")
    public abstract boolean method1753();

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "()Z")
    public abstract boolean method1755();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lvm;)V")
    public abstract void method1756(class407 arg0);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public abstract void method1757(int arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "()Z")
    public abstract boolean method1759();

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)Ler;")
    public abstract class55 method1760(int arg0);

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "()V")
    public abstract void method1761();

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(IIII)V")
    public abstract void method1763(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public abstract void method1764(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
    public abstract void method1765(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
    public abstract void method1766(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "()F")
    public abstract float method1767();

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "()Lci;")
    public abstract class261 method1769();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lhc;Lci;[Lbd;I)V")
    public abstract void method1770(class75[] arg0, class261 arg1, class38[] arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIIII)V")
    public abstract void method1771(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1772(Canvas arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([IIIII)Llf;")
    public abstract class130 method1773(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "()Z")
    public abstract boolean method1774();

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(IIII)V")
    public abstract void method1776(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)I")
    public abstract int method1777(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "()Z")
    public abstract boolean method1778();

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "()V")
    public abstract void method1779();

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "()Z")
    public abstract boolean method1780();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIILtm;II)V")
    public abstract void method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class220 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "()Lci;")
    public abstract class261 method1783();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[I[I)Ltm;")
    public abstract class220 method1784(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(IIIIII)V")
    public abstract void method1785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(II)V")
    public abstract void method1787(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public abstract void method1789(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "()Z")
    public abstract boolean method1790();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ldi;[Lnc;Z)Lrj;")
    public abstract class352 method1791(class65 arg0, class18[] arg1, boolean arg2);

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "()I")
    public abstract int method1792();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method1793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public abstract void method1794(int arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([I)V")
    public abstract void method1796(int[] arg0);

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "()I")
    public abstract int method1797();

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
    public abstract void method1798(int arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1799(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
    public abstract void method1801(int arg0);

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "()F")
    public abstract float method1802();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lhc;Lqd;Lci;[Lbd;I)V")
    public abstract void method1803(class75[] arg0, class260 arg1, class261 arg2, class38[] arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "()V")
    public abstract void method1804();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FF)V")
    public abstract void method1805(float arg0, float arg1);

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "()Z")
    public abstract boolean method1806();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lnc;Z)Llf;")
    public abstract class130 method1807(class18 arg0, boolean arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;")
    public abstract class407 method1808(class407 arg0, class407 arg1, float arg2, class407 arg3);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(IIIII)V")
    public abstract void method1810(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "()V")
    public abstract void method1811();

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "()V")
    public abstract void method1812();

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "()V")
    public abstract void method1813();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method1814(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "()V")
    public abstract void method1815();

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "()V")
    public abstract void method1816();

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)V")
    public abstract void method1817(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(IIIIII)Lvm;")
    public abstract class407 method1818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILtm;II)V")
    public abstract void method1819(int arg0, class220 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[[I[[IIII)Lsm;")
    public abstract class156 method1821(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)V")
    public abstract void method1822(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ler;)V")
    public abstract void method1823(class55 arg0);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(IIIII)V")
    public abstract void method1824(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "()I")
    public abstract int method1825();

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(F)V")
    public abstract void method1826(float arg0);
}
