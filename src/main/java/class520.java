import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class520 implements class498 {

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "Lffa;")
    private class174 field6575 = new class174(256);

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "Lpfa;")
    private class275 field6562;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "Lpfa;")
    private class275 field6567;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
    private int field6565;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "[Ltba;")
    private class152[] field6563;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "Lhg;")
    public static class647 field6561 = new class647(2);

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IB)Ltba;")
    public final class152 method2718(int arg0, byte arg1) {
        if (arg1 == 72) {
            field6566++;
            return this.field6563[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLjava/awt/Component;Lqj;II)Laj;")
    public static final class292 method2815(byte arg0, Component arg1, class476 arg2, int arg3, int arg4) {
        field6573++;
        if (class278.field3535 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class292 var5 = (class292) Class.forName("mt").getDeclaredConstructor().newInstance();
                var5.field3701 = new int[(class487.field6095 ? 2 : 1) * 256];
                var5.field3722 = arg3;
                var5.method1759(arg1);
                var5.field3718 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3718 > 16384) {
                    var5.field3718 = 16384;
                }
                int var6 = -29 / ((arg0 + 2) / 39);
                var5.method1763(var5.field3718);
                if (class364.field4667 > 0 && class8.field80 == null) {
                    class8.field80 = new class599();
                    class8.field80.field8040 = arg2;
                    arg2.method2592(class364.field4667, class8.field80, (byte) 104);
                }
                if (class8.field80 != null) {
                    if (class8.field80.field8039[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class8.field80.field8039[arg4] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class328 var7 = new class328(arg2, arg4);
                    var7.field3701 = new int[(class487.field6095 ? 2 : 1) * 256];
                    var7.field3722 = arg3;
                    var7.method1759(arg1);
                    var7.field3718 = 16384;
                    var7.method1763(var7.field3718);
                    if (class364.field4667 > 0 && class8.field80 == null) {
                        class8.field80 = new class599();
                        class8.field80.field8040 = arg2;
                        arg2.method2592(class364.field4667, class8.field80, (byte) 104);
                    }
                    if (class8.field80 != null) {
                        if (class8.field80.field8039[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class8.field80.field8039[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class292();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(FIIIZI)[I")
    public final int[] method2714(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 != 19991) {
            this.field6567 = null;
        }
        field6570++;
        return this.method2817((byte) -90, arg1).method2193(arg4, arg2, (byte) 75, this, (double) arg0, this.field6567, arg5, this.field6563[arg1].field1804);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZ)Z")
    public final boolean method2717(int arg0, boolean arg1) {
        field6572++;
        if (arg1) {
            this.method2817((byte) -41, 54);
        }
        class381 var3 = this.method2817((byte) 53, arg0);
        return var3 != null && var3.method2191(this.field6567, this, -124);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I")
    public final int method2719(byte arg0) {
        field6574++;
        return arg0 < 118 ? 36 : this.field6565;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)V")
    public static void method2816(boolean arg0) {
        field6561 = null;
        if (arg0) {
            method2818(89);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IFIIZI)[F")
    public final float[] method2716(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 == -1898) {
            field6564++;
            return this.method2817((byte) -75, arg3).method2192(4, arg2, this.field6567, arg0, this.field6563[arg3].field1804, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIFZZ)[I")
    public final int[] method2715(int arg0, int arg1, int arg2, float arg3, boolean arg4, boolean arg5) {
        if (!arg5) {
            this.method2718(127, (byte) -73);
        }
        field6569++;
        return this.method2817((byte) -118, arg2).method2189(this.field6563[arg2].field1804, this.field6567, this, (double) arg3, arg1, arg0, 113);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BI)Lrm;")
    private final class381 method2817(byte arg0, int arg1) {
        field6571++;
        class363 var3 = this.field6575.method1046(100, (long) arg1);
        if (var3 != null) {
            return (class381) var3;
        }
        byte[] var4 = this.field6562.method1648(3, arg1);
        if (var4 == null) {
            return null;
        } else {
            int var5 = 71 / ((-arg0 - 5) / 36);
            class381 var6 = new class381(new class572(var4));
            this.field6575.method1042((long) arg1, var6, true);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
    public static final void method2818(int arg0) {
        if (arg0 > -55) {
            field6561 = null;
        }
        field6568++;
        class175.method1049((byte) 2);
        class428.method2354(-6331);
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lpfa;Lpfa;Lpfa;)V")
    public class520(class275 arg0, class275 arg1, class275 arg2) {
        this.field6562 = arg1;
        this.field6567 = arg2;
        class572 var4 = new class572(arg0.method1659(-103, 0, 0));
        this.field6565 = var4.method3031(-1);
        this.field6563 = new class152[this.field6565];
        for (int var5 = 0; var5 < this.field6565; var5++) {
            if (var4.method3097((byte) 12) == 1) {
                this.field6563[var5] = new class152();
            }
        }
        for (int var6 = 0; var6 < this.field6565; var6++) {
            if (this.field6563[var6] != null) {
                this.field6563[var6].field1818 = var4.method3097((byte) 12) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field6565; var7++) {
            if (this.field6563[var7] != null) {
                this.field6563[var7].field1811 = var4.method3097((byte) 12) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field6565; var8++) {
            if (this.field6563[var8] != null) {
                this.field6563[var8].field1826 = var4.method3097((byte) 12) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field6565; var9++) {
            if (this.field6563[var9] != null) {
                this.field6563[var9].field1817 = var4.method3097((byte) 12) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field6565; var10++) {
            if (this.field6563[var10] != null) {
                this.field6563[var10].field1816 = var4.method3083(255);
            }
        }
        for (int var11 = 0; var11 < this.field6565; var11++) {
            if (this.field6563[var11] != null) {
                this.field6563[var11].field1820 = var4.method3083(255);
            }
        }
        for (int var12 = 0; var12 < this.field6565; var12++) {
            if (this.field6563[var12] != null) {
                this.field6563[var12].field1809 = var4.method3083(255);
            }
        }
        for (int var13 = 0; var13 < this.field6565; var13++) {
            if (this.field6563[var13] != null) {
                this.field6563[var13].field1815 = var4.method3083(255);
            }
        }
        for (int var14 = 0; var14 < this.field6565; var14++) {
            if (this.field6563[var14] != null) {
                this.field6563[var14].field1825 = (short) var4.method3031(-1);
            }
        }
        for (int var15 = 0; var15 < this.field6565; var15++) {
            if (this.field6563[var15] != null) {
                this.field6563[var15].field1806 = var4.method3083(255);
            }
        }
        for (int var16 = 0; var16 < this.field6565; var16++) {
            if (this.field6563[var16] != null) {
                this.field6563[var16].field1821 = var4.method3083(255);
            }
        }
        for (int var17 = 0; var17 < this.field6565; var17++) {
            if (this.field6563[var17] != null) {
                this.field6563[var17].field1819 = var4.method3097((byte) 12) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field6565; var18++) {
            if (this.field6563[var18] != null) {
                this.field6563[var18].field1804 = var4.method3097((byte) 12) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field6565; var19++) {
            if (this.field6563[var19] != null) {
                this.field6563[var19].field1828 = var4.method3083(255);
            }
        }
        for (int var20 = 0; var20 < this.field6565; var20++) {
            if (this.field6563[var20] != null) {
                this.field6563[var20].field1808 = var4.method3097((byte) 12) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field6565; var21++) {
            if (this.field6563[var21] != null) {
                this.field6563[var21].field1812 = var4.method3097((byte) 12) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field6565; var22++) {
            if (this.field6563[var22] != null) {
                this.field6563[var22].field1807 = var4.method3097((byte) 12) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field6565; var23++) {
            if (this.field6563[var23] != null) {
                this.field6563[var23].field1805 = var4.method3097((byte) 12);
            }
        }
        for (int var24 = 0; var24 < this.field6565; var24++) {
            if (this.field6563[var24] != null) {
                this.field6563[var24].field1822 = var4.method3064(-2031091464);
            }
        }
        for (int var25 = 0; var25 < this.field6565; var25++) {
            if (this.field6563[var25] != null) {
                this.field6563[var25].field1829 = var4.method3097((byte) 12) == 1;
            }
        }
    }
}
