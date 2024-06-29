import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class454 {

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "Lvg;")
    private class49 field6816 = new class49(64);

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "Lvg;")
    public class49 field6829 = new class49(50);

    @OriginalMember(owner = "client!hca", name = "x", descriptor = "Lmj;")
    public class607 field6832 = new class607(250);

    @OriginalMember(owner = "client!hca", name = "y", descriptor = "Loa;")
    private class645 field6833 = new class645();

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public int field6827;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "Z")
    private boolean field6821;

    @OriginalMember(owner = "client!hca", name = "C", descriptor = "Lbca;")
    private class613 field6837;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "Lri;")
    public class97 field6820;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "Lri;")
    private class97 field6824;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public int field6809;

    @OriginalMember(owner = "client!hca", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field6835;

    @OriginalMember(owner = "client!hca", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field6836;

    @OriginalMember(owner = "client!hca", name = "w", descriptor = "I")
    public static int field6831 = 0;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "I")
    public int field6834;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "Z")
    public static boolean field6813;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "[[[Lup;")
    public static class252[][][] field6818;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[FB)[F", line = 12)
    public static final float[] method2847(int arg0, float[] arg1, byte arg2) {
        field6817++;
        float[] var3 = new float[arg0];
        class398.method2563(arg1, 0, var3, 0, arg0);
        int var4 = -75 % ((arg2 + 30) / 52);
        return var3;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 26)
    public final void method2848(int arg0) {
        field6830++;
        if (arg0 != -18043) {
            this.method2858(34, (byte) 118);
        }
        class49 var2 = this.field6816;
        synchronized (this.field6816) {
            this.field6816.method563(0);
        }
        class49 var3 = this.field6829;
        synchronized (this.field6829) {
            this.field6829.method563(arg0 + 18043);
        }
        class607 var4 = this.field6832;
        synchronized (this.field6832) {
            this.field6832.method3535((byte) 74);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BZ)V", line = 46)
    public final void method2849(byte arg0, boolean arg1) {
        field6822++;
        if (this.field6821 != arg1) {
            this.field6821 = arg1;
            if (arg0 == 48) {
                this.method2856(1);
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V", line = 61)
    public final void method2850(byte arg0) {
        if (arg0 > -113) {
            this.field6835 = null;
        }
        class49 var2 = this.field6829;
        synchronized (this.field6829) {
            this.field6829.method569(0);
        }
        field6811++;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILr;ZLhq;Lr;Lla;ZIIIII)Lf;", line = 76)
    public final class702 method2851(int arg0, class167 arg1, boolean arg2, class144 arg3, class167 arg4, class418 arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field6815++;
        class702 var13 = this.method2860(-126, arg10, arg7, arg8, arg4, arg3, arg0, arg9);
        if (arg11 >= -114) {
            this.method2848(-74);
        }
        if (var13 != null) {
            return var13;
        }
        class117 var14 = this.method2859(arg7, (byte) 123);
        if (arg0 > 1 && var14.field1881 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field1887[var16] <= arg0 && var14.field1887[var16] != 0) {
                    var15 = var14.field1881[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2859(var15, (byte) 124);
            }
        }
        int[] var17 = var14.method1048(arg0, arg4, -129, arg5, arg3, arg10, arg6, arg9, arg8, arg1);
        if (var17 == null) {
            return null;
        }
        class702 var18;
        if (arg2) {
            var18 = arg1.method306(var17, 0, 36, 36, 32);
        } else {
            var18 = arg4.method306(var17, 0, 36, 36, 32);
        }
        if (!arg2) {
            class645 var19 = new class645();
            var19.field9065 = arg9;
            var19.field9062 = arg7;
            var19.field9068 = arg0;
            var19.field9064 = arg4.field2804;
            var19.field9060 = arg8;
            var19.field9072 = arg10;
            var19.field9070 = arg3 != null;
            this.field6832.method3532(var18, var19, 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V", line = 142)
    public static final void method2852(int arg0) {
        field6814++;
        if (class145.field2447) {
            return;
        }
        if (arg0 != 1) {
            method2847(-125, null, (byte) -63);
        }
        class271.method1912(class500.field7343, (byte) -41);
        if (class524.field7645 != null) {
            class271.method1912(class524.field7645, (byte) 120);
        }
        class145.field2447 = true;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZJLjava/lang/String;)V", line = 167)
    public static final void method2853(int arg0, boolean arg1, long arg2, String arg3) {
        field6810++;
        if (arg1) {
            class202.method1569(120);
            if (class650.field9102.equals("")) {
                class205.field3403 = 39;
                return;
            }
        }
        class6 var5 = new class6(576);
        var5.method65(10, -77);
        var5.method25(true, (int) (Math.random() * 65535.0D));
        var5.method38(arg2, -18631);
        var5.method25(true, arg1 ? class665.field9428 : class611.field8698);
        if (arg0 > -38) {
            field6818 = null;
        }
        var5.method28(arg3, 0);
        var5.method38(arg1 ? class572.field8176 : class73.field920, -18631);
        if (arg1) {
            var5.method38(class595.method3477(31485, class650.field9102), -18631);
            try {
                var5.method38(Long.parseLong(class129.field2116), -18631);
            } catch (Exception var9) {
                class205.field3403 = 39;
                return;
            }
        } else {
            var5.method82(false, (int) (Math.random() * 9.9999999E7D));
            var5.method82(false, (int) (Math.random() * 9.9999999E7D));
            var5.method82(false, (int) (Math.random() * 9.9999999E7D));
            var5.method82(false, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method82(false, (int) (Math.random() * 9.9999999E7D));
        var5.method91(class293.field4612, (byte) 105, class63.field814);
        class165 var6 = class641.method3717(8592);
        var6.field2776.method65(arg1 ? class434.field6610.field7155 : class434.field6607.field7155, -77);
        int var7 = 1;
        if (class154.field2630 != null) {
            var7 += class154.field2630.length() + 1;
        }
        var6.field2776.method25(true, var7 + var5.field57 + 28);
        var6.field2776.method25(true, 625);
        var6.field2776.method65(class135.field2206, -77);
        var6.field2776.method65(class99.field1647.field2742, -77);
        class218.method1627(3, var6.field2776);
        String var8 = arg1 ? class348.field5576 : class154.field2630;
        var6.field2776.method65(var8 == null ? 0 : 1, -77);
        if (var8 != null) {
            var6.field2776.method28(var8, 0);
        }
        var6.field2776.method80(255, var5.field96, var5.field57, 0);
        class642.method3726(-684096285, var6);
        class166.field2784 = 0;
        class125.field2054 = 1;
        class528.field7708 = 0;
        class205.field3403 = -3;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V", line = 243)
    public static void method2854(byte arg0) {
        field6818 = null;
        int var1 = 119 % ((67 - arg0) / 52);
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V", line = 255)
    public final void method2855(byte arg0) {
        class607 var2 = this.field6832;
        synchronized (this.field6832) {
            this.field6832.method3542((byte) -107);
        }
        if (arg0 != 123) {
            this.method2850((byte) -68);
        }
        field6828++;
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)V", line = 268)
    public final void method2856(int arg0) {
        class49 var2 = this.field6816;
        synchronized (this.field6816) {
            this.field6816.method569(arg0 ^ arg0);
        }
        field6825++;
        class49 var3 = this.field6829;
        synchronized (this.field6829) {
            this.field6829.method569(arg0 - 1);
        }
        class607 var4 = this.field6832;
        synchronized (this.field6832) {
            this.field6832.method3542((byte) -90);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)V", line = 286)
    public final void method2857(int arg0, int arg1) {
        if (arg1 != 99999999) {
            return;
        }
        this.field6834 = arg0;
        field6812++;
        class49 var3 = this.field6829;
        synchronized (this.field6829) {
            this.field6829.method569(0);
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lei;IZLbca;Lri;Lri;)V", line = 443)
    public class454(class162 arg0, int arg1, boolean arg2, class613 arg3, class97 arg4, class97 arg5) {
        this.field6827 = arg1;
        this.field6821 = arg2;
        this.field6837 = arg3;
        this.field6820 = arg5;
        this.field6824 = arg4;
        if (this.field6824 == null) {
            this.field6809 = 0;
        } else {
            int var7 = this.field6824.method917(true) - 1;
            this.field6809 = var7 * 256 + this.field6824.method949(var7, 0);
        }
        this.field6835 = new String[] { null, null, class122.field1979.method1091(this.field6827, 1), null, null };
        this.field6836 = new String[] { null, null, null, null, class122.field1980.method1091(this.field6827, 1) };
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V", line = 309)
    public final void method2858(int arg0, byte arg1) {
        field6819++;
        if (arg1 <= 112) {
            this.method2848(-115);
        }
        class49 var3 = this.field6816;
        synchronized (this.field6816) {
            this.field6816.method573((byte) 123, arg0);
        }
        class49 var4 = this.field6829;
        synchronized (this.field6829) {
            this.field6829.method573((byte) 121, arg0);
        }
        class607 var5 = this.field6832;
        synchronized (this.field6832) {
            this.field6832.method3541(-20818, arg0);
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(IB)Lhu;", line = 329)
    public final class117 method2859(int arg0, byte arg1) {
        field6826++;
        if (arg1 <= 120) {
            this.method2855((byte) 81);
        }
        class49 var3 = this.field6816;
        class117 var4;
        synchronized (this.field6816) {
            var4 = (class117) this.field6816.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field6824;
        byte[] var6;
        synchronized (this.field6824) {
            var6 = this.field6824.method926(class654.method3766((byte) -72, arg0), -127, class97.method937(arg0, 9138));
        }
        class117 var7 = new class117();
        var7.field1836 = this;
        var7.field1854 = arg0;
        var7.field1811 = new String[] { null, null, class122.field1979.method1091(this.field6827, 1), null, null };
        var7.field1822 = new String[] { null, null, null, null, class122.field1980.method1091(this.field6827, 1) };
        if (var6 != null) {
            var7.method1051(new class6(var6), (byte) 111);
        }
        var7.method1057((byte) 108);
        if (var7.field1815 != -1) {
            var7.method1061(this.method2859(var7.field1815, (byte) 125), this.method2859(var7.field1862, (byte) 121), (byte) -118);
        }
        if (var7.field1879 != -1) {
            var7.method1052(this.method2859(var7.field1879, (byte) 125), true, this.method2859(var7.field1888, (byte) 127));
        }
        if (!this.field6821 && var7.field1872) {
            var7.field1869 = class122.field1977.method1091(this.field6827, 1);
            var7.field1822 = this.field6836;
            var7.field1817 = 0;
            var7.field1824 = false;
            var7.field1838 = null;
            var7.field1811 = this.field6835;
            if (var7.field1883 != null) {
                boolean var8 = false;
                for (class66 var9 = var7.field1883.method1556(95); var9 != null; var9 = var7.field1883.method1559(127)) {
                    class638 var10 = this.field6837.method3566((int) var9.field844, -14724);
                    if (var10.field8954) {
                        var9.method707((byte) -88);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field1883 = null;
                }
            }
        }
        class49 var11 = this.field6816;
        synchronized (this.field6816) {
            this.field6816.method559(var7, (long) arg0, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIILr;Lhq;II)Lf;", line = 412)
    public final class702 method2860(int arg0, int arg1, int arg2, int arg3, class167 arg4, class144 arg5, int arg6, int arg7) {
        if (arg0 > -39) {
            return null;
        }
        this.field6833.field9062 = arg2;
        field6823++;
        this.field6833.field9065 = arg7;
        this.field6833.field9060 = arg3;
        this.field6833.field9072 = arg1;
        this.field6833.field9070 = arg5 != null;
        this.field6833.field9064 = arg4.field2804;
        this.field6833.field9068 = arg6;
        return (class702) this.field6832.method3533(this.field6833, (byte) -120);
    }
}
