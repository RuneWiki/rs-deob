import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class127 {

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    private int field1755 = 0;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    private int field1751 = 0;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
    private int field1761 = 0;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "Lkw;")
    private class346 field1756;

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "Lrb;")
    private class401 field1764;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "[Ltfa;")
    private class283[] field1753;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "Lmea;")
    public class671 field1750;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
    public static int field1757 = 0;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "Lkda;")
    public static class64 field1759;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIZIZI)V")
    public final void method895(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 > -42) {
            this.field1753 = null;
        }
        field1763++;
        boolean var7 = arg2 & this.field1756.method296();
        if (!var7 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (arg3 == 4) {
                arg1 = arg5;
            }
            arg3 = 2;
        }
        if (arg3 != 0 && arg4) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field1751 != arg3) {
            if (this.field1751 != 0) {
                this.field1753[Integer.MAX_VALUE & this.field1751].method74((byte) 85);
            }
            if (arg3 != 0) {
                this.field1753[arg3 & Integer.MAX_VALUE].method76(-938, arg4);
                this.field1753[arg3 & Integer.MAX_VALUE].method73(arg4, 2);
                this.field1753[arg3 & Integer.MAX_VALUE].method79(true, arg1, arg5);
            }
            this.field1761 = arg5;
            this.field1751 = arg3;
            this.field1755 = arg1;
        } else if (this.field1751 != 0) {
            this.field1753[Integer.MAX_VALUE & this.field1751].method73(arg4, 2);
            if (this.field1761 != arg5 || this.field1755 != arg1) {
                this.field1753[Integer.MAX_VALUE & this.field1751].method79(true, arg1, arg5);
                this.field1761 = arg5;
                this.field1755 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(II)Z")
    public final boolean method896(int arg0, int arg1) {
        field1760++;
        return arg0 == 1 ? this.field1753[arg1].method77(108) : false;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method897(String arg0, byte arg1) {
        field1752++;
        if (arg0 == null) {
            return;
        }
        if (!(class386.field5583 < 200 || class297.field4063) || class386.field5583 >= 200) {
            class758.method4212(4, 2, class608.field8630.method3543(arg1 - 24460, class45.field748));
            String var2 = class608.field8631.method3543(-24350, class45.field748);
            if (var2 != null) {
                class758.method4212(4, 2, var2);
            }
            return;
        }
        String var3 = class136.method973(10149, arg0);
        if (var3 == null) {
            return;
        }
        if (arg1 != 110) {
            method901(-0.9880489F, 0.36715785F, -1.7458216F, (byte) -56);
        }
        for (int var4 = 0; var4 < class386.field5583; var4++) {
            String var9 = class136.method973(10149, class196.field2860[var4]);
            if (var9 != null && var9.equals(var3)) {
                class758.method4212(4, arg1 - 108, arg0 + class608.field8658.method3543(arg1 ^ 0xFFFFA08C, class45.field748));
                return;
            }
            if (class519.field7483[var4] != null) {
                String var10 = class136.method973(10149, class519.field7483[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class758.method4212(4, 2, arg0 + class608.field8658.method3543(-24350, class45.field748));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class365.field5352; var5++) {
            String var7 = class136.method973(10149, class716.field10113[var5]);
            if (var7 != null && var7.equals(var3)) {
                class758.method4212(4, 2, class608.field8663.method3543(-24350, class45.field748) + arg0 + class608.field8664.method3543(-24350, class45.field748));
                return;
            }
            if (class751.field10462[var5] != null) {
                String var8 = class136.method973(10149, class751.field10462[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class758.method4212(4, 2, class608.field8663.method3543(arg1 - 24460, class45.field748) + arg0 + class608.field8664.method3543(-24350, class45.field748));
                    return;
                }
            }
        }
        if (class136.method973(10149, class108.field1536.field9056).equals(var3)) {
            class758.method4212(4, 2, class608.field8661.method3543(-24350, class45.field748));
            return;
        }
        class71.field1079++;
        class88 var6 = class448.method2741((byte) 56, class598.field8493, class583.field8319);
        var6.field1260.method2881(class231.method1605((byte) 44, arg0), (byte) 119);
        var6.field1260.method2902(arg0, false);
        class523.method3183(var6, (byte) 31);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lou;II)Z")
    public final boolean method898(class158 arg0, int arg1, int arg2) {
        field1754++;
        if (this.field1751 == 0) {
            return false;
        } else {
            this.field1753[arg2 & this.field1751].method75(arg0, 2, arg1);
            return true;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
    public static void method899(byte arg0) {
        if (arg0 > 124) {
            field1759 = null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "([Ljava/lang/Object;I[JIB)V")
    public static final void method900(Object[] arg0, int arg1, long[] arg2, int arg3, byte arg4) {
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg1; var11++) {
                if (arg2[var11] < (long) (var10 & var11) + var7) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method900(arg0, var6 - 1, arg2, arg3, (byte) 59);
            method900(arg0, arg1, arg2, var6 + 1, (byte) 59);
        }
        field1762++;
        if (arg4 != 59) {
            method897(null, (byte) -17);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(FFFB)I")
    public static final int method901(float arg0, float arg1, float arg2, byte arg3) {
        field1758++;
        if (arg3 < 54) {
            method897(null, (byte) -48);
        }
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var5 > var4 && var5 > var6) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg0 > 0.0F ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lkw;)V")
    public class127(class346 arg0) {
        this.field1756 = arg0;
        this.field1764 = new class401(arg0);
        this.field1753 = new class283[10];
        this.field1753[1] = new class253(arg0);
        this.field1753[2] = new class743(arg0, this.field1764);
        this.field1753[4] = new class295(arg0, this.field1764);
        this.field1753[5] = new class497(arg0, this.field1764);
        this.field1753[6] = new class165(arg0);
        this.field1753[7] = new class558(arg0);
        this.field1753[3] = this.field1750 = new class671(arg0);
        this.field1753[8] = new class15(arg0, this.field1764);
        this.field1753[9] = new class356(arg0, this.field1764);
        if (!this.field1753[8].method77(99)) {
            this.field1753[8] = this.field1753[4];
        }
        if (!this.field1753[9].method77(119)) {
            this.field1753[9] = this.field1753[8];
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "([SIZ)[S")
    public static final short[] method902(short[] arg0, int arg1, boolean arg2) {
        field1765++;
        if (arg2) {
            short[] var3 = new short[arg1];
            class85.method682(arg0, 0, var3, 0, arg1);
            return var3;
        } else {
            return null;
        }
    }
}
