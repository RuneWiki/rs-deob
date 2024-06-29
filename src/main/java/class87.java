import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class87 extends class129 {

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field1696 = 10;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "Lrd;")
    public static class173 field1688 = class133.method843("", 125);

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "Lrd;")
    public static class173 field1698 = field1688;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "Lrd;")
    public static class173 field1699 = field1688;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "Lrd;")
    public static class173 field1693 = field1688;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "Lrd;")
    public static class173 field1686 = field1688;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "Lrd;")
    public static class173 field1694 = field1688;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "Lrd;")
    public static class173 field1703 = field1688;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "Lof;")
    public static class145 field1685 = new class145();

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field1707 = -1;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "Lrd;")
    public static class173 field1706 = class133.method843("Standort", -122);

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "Lrd;")
    public static class173 field1709 = class133.method843(" loggt sich aus)3", -70);

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "Lrd;")
    public static class173 field1708 = class133.method843("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -95);

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "Log;")
    public class146 field1704;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "Log;")
    public class146 field1705;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "Lac;")
    public class4 field1691;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "[I")
    public int[] field1697;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V")
    public static final void method558(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class51.method350(arg1 - arg0, arg3, (byte) -121, class107.field1998[arg4], arg1 + arg0);
        field1684++;
        int var5 = 0;
        int var6 = -arg0;
        int var7 = arg0;
        int var8 = -1;
        if (arg2 != 17959) {
            method558(56, -80, 4, -101, -99);
        }
        while (var7 > var5) {
            var8 += 2;
            var6 += var8;
            var5++;
            if (var6 >= 0) {
                var7--;
                int[] var9 = class107.field1998[arg4 + var7];
                int var10 = arg1 + var5;
                var6 -= var7 << 1;
                int var11 = arg1 - var5;
                int[] var12 = class107.field1998[arg4 - var7];
                class51.method350(var11, arg3, (byte) -125, var9, var10);
                class51.method350(var11, arg3, (byte) -126, var12, var10);
            }
            int var13 = arg1 + var7;
            int var14 = arg1 - var7;
            int[] var15 = class107.field1998[arg4 - var5];
            int[] var16 = class107.field1998[arg4 + var5];
            class51.method350(var14, arg3, (byte) -119, var16, var13);
            class51.method350(var14, arg3, (byte) -128, var15, var13);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILbc;Lbc;)V")
    public static final void method559(int arg0, class14 arg1, class14 arg2) {
        class189.field3705 = arg2;
        field1682++;
        int var3 = -109 % ((-arg0 - 31) / 38);
        class145.field2731 = arg1;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
    public final void method560(int arg0) {
        if (arg0 != 128) {
            field1688 = null;
        }
        field1692++;
        int var2 = this.field1680;
        class4 var3 = this.field1691.method37(false);
        if (var3 == null) {
            this.field1697 = null;
            this.field1680 = -1;
            this.field1681 = 0;
            this.field1679 = 0;
            this.field1702 = 0;
        } else {
            this.field1680 = var3.field55;
            this.field1697 = var3.field101;
            this.field1702 = var3.field64;
            this.field1681 = var3.field75;
            this.field1679 = var3.field39 * 128;
        }
        if (this.field1680 != var2 && this.field1704 != null) {
            class171.field3308.method686(this.field1704);
            this.field1704 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbf;")
    public static final class17 method561(Throwable arg0, String arg1) {
        field1690++;
        class17 var2;
        if (arg0 instanceof class17) {
            var2 = (class17) arg0;
            var2.field369 = var2.field369 + ' ' + arg1;
        } else {
            var2 = new class17(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
    public static void method562(byte arg0) {
        if (arg0 >= -9) {
            return;
        }
        field1694 = null;
        field1685 = null;
        field1693 = null;
        field1709 = null;
        field1703 = null;
        field1698 = null;
        field1688 = null;
        field1699 = null;
        field1706 = null;
        field1686 = null;
        field1708 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[B)Lqc;")
    public static final class162 method563(int arg0, byte[] arg1) {
        field1695++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 3611) {
            method561(null, null);
        }
        class162 var2 = new class162(arg1, class55.field1099, class20.field458, class97.field1775, class30.field622, class112.field2074, class188.field3676);
        class184.method1246((byte) 31);
        return var2;
    }
}
