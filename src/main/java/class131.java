import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class131 {

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "Lhd;")
    private class694 field1592 = new class694(256);

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "Lhd;")
    private class694 field1596 = new class694(256);

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "Lpfa;")
    private class275 field1589;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "Lpfa;")
    private class275 field1584;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "Lhm;")
    public static class208 field1588 = new class208(10);

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "Lkba;")
    public static class95 field1587;

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "[Lxa;")
    public static class468[] field1595;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
    public static void method844(int arg0) {
        field1588 = null;
        if (arg0 != 0) {
            method849(-115, -43, 90, -50, true, 34);
        }
        field1595 = null;
        field1587 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z[III)Lft;")
    private final class4 method845(boolean arg0, int[] arg1, int arg2, int arg3) {
        field1586++;
        int var5 = (arg2 >>> 12 | arg2 << 4 & 0xFFFD) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        if (arg0) {
            return null;
        }
        class4 var9 = (class4) this.field1596.method3828(var7, (byte) -91);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class547 var10 = class547.method2930(this.field1589, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class4 var11 = var10.method2932();
            this.field1596.method3832(var11, var7, 109);
            if (arg1 != null) {
                arg1[0] -= var11.field30.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method846(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class632.method3546(arg6, arg1, 0, arg0, arg4, 12673, arg5, arg7, arg8, arg2);
        field1585++;
        if (arg3 <= 123) {
            method846(103, 31, -98, (byte) -9, -1, -56, -91, -25, -99);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "([III)Lft;")
    public final class4 method847(int[] arg0, int arg1, int arg2) {
        if (arg1 < 53) {
            this.field1592 = null;
        }
        field1593++;
        if (this.field1584.method1642(99) == 1) {
            return this.method850(arg2, arg0, 0, (byte) 78);
        } else if (this.field1584.method1655(arg2, (byte) -82) == 1) {
            return this.method850(0, arg0, arg2, (byte) 78);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BI[I)Lft;")
    public final class4 method848(byte arg0, int arg1, int[] arg2) {
        field1590++;
        if (this.field1589.method1642(-70) == 1) {
            return this.method845(false, arg2, 0, arg1);
        } else if (this.field1589.method1655(arg1, (byte) -82) == 1) {
            return this.method845(false, arg2, arg1, 0);
        } else {
            if (arg0 >= -72) {
                this.field1592 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIZI)V")
    public static final void method849(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field1594++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class581.field7823 - class466.field5783) * var6 / 100 + class466.field5783;
        if (var7 < class89.field1153) {
            var7 = class89.field1153;
        } else if (var7 > class161.field1899) {
            var7 = class161.field1899;
        }
        int var8 = arg2 * 512 * var7 / (arg0 * 334);
        if (class68.field880 > var8) {
            short var9 = class68.field880;
            var7 = arg0 * var9 * 334 / (arg2 * 512);
            if (var7 > class161.field1899) {
                var7 = class161.field1899;
                int var10 = arg2 * var7 * 512 / (var9 * 334);
                int var11 = (arg0 - var10) / 2;
                if (arg4) {
                    class309.field3898.method410();
                    class309.field3898.method3630((byte) -104, var11, arg5, arg1, -16777216, arg2);
                    class309.field3898.method3630((byte) 95, var11, arg5, arg1 + arg0 - var11, -16777216, arg2);
                }
                arg0 -= var11 * 2;
                arg1 += var11;
            }
        } else if (class657.field8939 < var8) {
            short var12 = class657.field8939;
            var7 = arg0 * 334 * var12 / (arg2 * 512);
            if (class89.field1153 > var7) {
                var7 = class89.field1153;
                int var13 = arg0 * var12 * 334 / (var7 * 512);
                int var14 = (arg2 - var13) / 2;
                if (arg4) {
                    class309.field3898.method410();
                    class309.field3898.method3630((byte) 30, arg0, arg5, arg1, -16777216, var14);
                    class309.field3898.method3630((byte) -126, arg0, arg2 + arg5 - var14, arg1, -16777216, var14);
                }
                arg2 -= var14 * 2;
                arg5 += var14;
            }
        }
        if (arg3 != 29967) {
            field1587 = null;
        }
        class469.field5799 = (short) arg0;
        class356.field4595 = (short) arg2;
        class556.field6955 = arg5;
        class100.field1293 = arg2 * var7 / 334;
        class509.field6376 = arg1;
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lpfa;Lpfa;)V")
    public class131(class275 arg0, class275 arg1) {
        this.field1589 = arg0;
        this.field1584 = arg1;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I[IIB)Lft;")
    private final class4 method850(int arg0, int[] arg1, int arg2, byte arg3) {
        field1591++;
        int var5 = ((arg2 & 0x60000FFF) << 4 | arg2 >>> 12) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class4 var9 = (class4) this.field1596.method3828(var7, (byte) -91);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class494 var10 = (class494) this.field1592.method3828(var7, (byte) -91);
            if (var10 == null) {
                var10 = class494.method2678(this.field1584, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1592.method3832(var10, var7, 18);
            }
            class4 var11 = var10.method2675(arg1);
            if (var11 == null) {
                return null;
            }
            var10.method1566(-109);
            this.field1596.method3832(var11, var7, arg3 ^ 0x5E);
            if (arg3 != 78) {
                this.field1584 = null;
            }
            return var11;
        } else {
            return null;
        }
    }
}
