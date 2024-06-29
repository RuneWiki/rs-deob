import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class130 {

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    private boolean field1654 = true;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    private int field1657 = -1;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[Lbj;")
    private class317[] field1660;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    private int field1659;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[Lbj;")
    private class317[] field1665;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lbj;")
    private class317 field1664;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    private int field1663;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lkr;")
    private class234 field1651;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[[Lfh;")
    public static class170[][] field1650;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public final void method770(int arg0) {
        field1655++;
        if (this.field1660 != null) {
            for (int var2 = 0; var2 < this.field1660.length; var2++) {
                this.field1660[var2].method1936();
            }
        }
        if (arg0 != 2) {
            this.method774(-8, 118, (class261) null);
        }
        this.field1651 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static final void method771(byte arg0) {
        field1662++;
        class189.field2840.field5666 = 0;
        class138.field1870 = 0;
        class44.field547 = 0;
        class85.field1127 = 0;
        class299.field4532 = null;
        class424.field6232.field5666 = 0;
        class261.field3980 = null;
        class463.field6831 = null;
        class288.field4384 = null;
        class238.method1430(0);
        class127.method747(15204);
        for (int var1 = 0; var1 < 2048; var1++) {
            class140.field1883[var1] = null;
        }
        class113.field1500 = null;
        if (arg0 <= 49) {
            field1650 = null;
        }
        for (int var2 = 0; var2 < class170.field2626.length; var2++) {
            class155 var4 = class170.field2626[var2];
            if (var4 != null) {
                var4.field1956 = -1;
            }
        }
        class418.method2599(-115);
        class80.field1054 = 1;
        class316.method1929(false, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class6.field71[var3] = true;
        }
        class364.method2185(17147);
        class174.field2663 = 0L;
        class303.field4580 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIILdr;)V")
    public final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class261 arg9) {
        int var11 = arg0 + arg7 & 0x3FFF;
        field1661++;
        if (~this.field1658 == arg1) {
            arg9.method358(arg2, arg5, arg8, arg6, arg3, 0);
        } else {
            class154 var12 = class145.field1930.method180(this.field1658, -113);
            if (this.field1651 == null && class145.field1930.method178(false, this.field1658)) {
                int[] var13 = var12.field2111 ? class145.field1930.method185(this.field1663, false, this.field1663, 0.7F, arg1 + 17486, this.field1658) : class145.field1930.method183(arg1 ^ 0x759F, 0.7F, this.field1663, this.field1658, false, this.field1663);
                this.field1651 = arg9.method401(var13, 0, this.field1663, this.field1663, this.field1663);
            }
            if (!var12.field2111) {
                arg9.method358(arg2, arg5, arg8, arg6, arg3, 0);
            }
            if (this.field1651 != null) {
                int var14 = var12.field2111 ? 0 : 1;
                int var15 = arg4 * arg6 / -4096;
                int var16;
                for (var16 = (arg8 - arg6) / 2 + (arg6 * var11 / 4096); var16 > arg6; var16 -= arg6) {
                }
                while (arg6 < var15) {
                    var15 -= arg6;
                }
                while (var16 < 0) {
                    var16 += arg6;
                }
                while (var15 < 0) {
                    var15 += arg6;
                }
                for (int var17 = var16 - arg6; var17 < arg8; var17 += arg6) {
                    for (int var18 = var15 - arg6; var18 < arg6; var18 += arg6) {
                        this.field1651.method1222(arg2 + var17, arg5 + var18, arg6, arg6, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field1656 - 1; var19 >= 0; var19--) {
            this.field1665[var19].method1941(arg9, arg2, arg5, arg8, arg6, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method773(int arg0) {
        field1650 = null;
        if (arg0 != 1) {
            method771((byte) 94);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILdr;)Z")
    public final boolean method774(int arg0, int arg1, class261 arg2) {
        field1653++;
        int var4 = -35 / ((-arg0 - 13) / 46);
        if (this.field1657 != arg1) {
            this.field1657 = arg1;
            int var5 = class196.method1174(79, arg1);
            if (var5 > arg1) {
                var5 = class275.method1708(arg1, true);
            }
            if (var5 > 512) {
                var5 = 512;
            }
            if (this.field1663 != var5) {
                this.field1651 = null;
                this.field1663 = var5;
            }
            if (this.field1660 != null) {
                this.field1656 = 0;
                int[] var6 = new int[this.field1660.length];
                for (int var7 = 0; var7 < this.field1660.length; var7++) {
                    class317 var8 = this.field1660[var7];
                    if (var8.method1934(this.field1652, this.field1666, this.field1659, this.field1657)) {
                        var6[this.field1656] = var8.field4797;
                        this.field1665[this.field1656++] = var8;
                    }
                }
                class435.method2674(0, this.field1656 - 1, var6, this.field1665, 2);
            }
            this.field1654 = true;
        }
        boolean var9 = false;
        if (this.field1654) {
            this.field1654 = false;
            for (int var10 = this.field1656 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field1665[var10].method1931(arg2, this.field1664);
                this.field1654 |= !var11;
                var9 |= var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I[Lbj;IIII)V")
    public class130(int arg0, class317[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1658 = arg0;
        this.field1666 = arg4;
        this.field1660 = arg1;
        this.field1659 = arg5;
        this.field1652 = arg3;
        if (arg1 == null) {
            this.field1665 = null;
            this.field1664 = null;
        } else {
            this.field1665 = new class317[arg1.length];
            this.field1664 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
