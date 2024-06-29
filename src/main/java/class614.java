import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class614 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Lwf;")
    private class117 field9075 = new class117(64);

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "Lwf;")
    public class117 field9096 = new class117(50);

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "Lwb;")
    public class276 field9097 = new class276(250);

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "Lqv;")
    private class380 field9098 = new class380();

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public int field9076;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
    private boolean field9085;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "Lgb;")
    private class183 field9101;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "Lkda;")
    public class328 field9084;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Lkda;")
    private class328 field9083;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public int field9095;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field9100;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field9102;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "J")
    public static long field9094 = 0L;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
    public int field9099;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIILqa;IZLqa;ZLra;BLrs;I)Lha;", line = 7)
    public final class53 method3593(int arg0, int arg1, int arg2, class208 arg3, int arg4, boolean arg5, class208 arg6, boolean arg7, class92 arg8, byte arg9, class560 arg10, int arg11) {
        field9092++;
        class53 var13 = this.method3597(arg1, arg10, arg6, arg11, arg2, arg0, true, arg4);
        if (var13 != null) {
            return var13;
        }
        class540 var14 = this.method3606((byte) -13, arg0);
        if (arg1 > 1 && var14.field8044 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg1 >= var14.field8030[var16] && var14.field8030[var16] != 0) {
                    var15 = var14.field8044[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3606((byte) 9, var15);
            }
        }
        int[] var17 = var14.method3278(arg8, arg3, arg4, arg2, arg6, 64, arg1, arg10, arg7, arg11);
        if (var17 == null) {
            return null;
        }
        class53 var18;
        if (arg5) {
            var18 = arg3.method466(var17, 0, 36, 36, 32);
        } else {
            var18 = arg6.method466(var17, 0, 36, 36, 32);
        }
        if (arg9 != 25) {
            return null;
        }
        if (!arg5) {
            class380 var19 = new class380();
            var19.field5230 = arg11;
            var19.field5239 = arg4;
            var19.field5240 = arg1;
            var19.field5236 = arg0;
            var19.field5232 = arg2;
            var19.field5231 = arg10 != null;
            var19.field5234 = arg6.field3090;
            this.field9097.method1727(var19, false, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[SB)[S", line = 74)
    public static final short[] method3594(int arg0, short[] arg1, byte arg2) {
        int var3 = -82 / ((-arg2 - 50) / 59);
        field9088++;
        short[] var4 = new short[arg0];
        class648.method3733(arg1, 0, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 90)
    public final void method3595(boolean arg0) {
        field9078++;
        class117 var2 = this.field9075;
        synchronized (this.field9075) {
            this.field9075.method846(0);
        }
        class117 var3 = this.field9096;
        synchronized (this.field9096) {
            this.field9096.method846(0);
        }
        class276 var4 = this.field9097;
        synchronized (this.field9097) {
            if (!arg0) {
                this.field9097.method1729(-44);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 109)
    public final void method3596(byte arg0) {
        class117 var2 = this.field9075;
        synchronized (this.field9075) {
            this.field9075.method837(126);
        }
        field9086++;
        class117 var3 = this.field9096;
        synchronized (this.field9096) {
            this.field9096.method837(126);
        }
        class276 var4 = this.field9097;
        synchronized (this.field9097) {
            this.field9097.method1732(false);
            int var5 = 106 / ((-arg0 - 17) / 43);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILrs;Lqa;IIIZI)Lha;", line = 128)
    public final class53 method3597(int arg0, class560 arg1, class208 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (!arg6) {
            return null;
        }
        this.field9098.field5234 = arg2.field3090;
        this.field9098.field5239 = arg7;
        this.field9098.field5230 = arg3;
        this.field9098.field5236 = arg5;
        this.field9098.field5231 = arg1 != null;
        field9081++;
        this.field9098.field5232 = arg4;
        this.field9098.field5240 = arg0;
        return (class53) this.field9097.method1723(this.field9098, (byte) -127);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V", line = 146)
    public final void method3598(boolean arg0) {
        class276 var2 = this.field9097;
        synchronized (this.field9097) {
            if (!arg0) {
                method3602(65, -48);
            }
            this.field9097.method1732(false);
        }
        field9091++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)V", line = 162)
    public final void method3599(boolean arg0, int arg1) {
        field9093++;
        if (this.field9085 != arg0) {
            this.field9085 = arg0;
            int var3 = 60 / ((-arg1 - 68) / 35);
            this.method3596((byte) 27);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 177)
    public final void method3600(int arg0) {
        field9082++;
        class117 var2 = this.field9096;
        synchronized (this.field9096) {
            this.field9096.method837(125);
        }
        if (arg0 >= -53) {
            method3603(false);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V", line = 190)
    public final void method3601(int arg0, byte arg1) {
        class117 var3 = this.field9075;
        synchronized (this.field9075) {
            this.field9075.method834(arg0, 0);
        }
        field9077++;
        class117 var4 = this.field9096;
        synchronized (this.field9096) {
            this.field9096.method834(arg0, 0);
        }
        class276 var5 = this.field9097;
        synchronized (this.field9097) {
            this.field9097.method1734(28382, arg0);
        }
        int var6 = -27 % ((arg1 + 84) / 36);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 211)
    public static final void method3602(int arg0, int arg1) {
        class117 var2 = class348.field4770;
        synchronized (class348.field4770) {
            if (arg1 != -16168) {
                method3602(38, -17);
            }
            class348.field4770.method834(arg0, arg1 + 16168);
        }
        field9079++;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(Z)V", line = 230)
    public static final void method3603(boolean arg0) {
        class335.field4629.method2800(0);
        field9090++;
        class596.field8821.method2800(0);
        if (!arg0) {
            field9094 = 35L;
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(Z)Ljj;", line = 247)
    public static final class101 method3604(boolean arg0) {
        field9080++;
        if (class339.field4681 == null || class52.field605 == null) {
            return null;
        }
        class52.field605.method1737(class339.field4681, -1803);
        if (arg0) {
            method3602(-56, 55);
        }
        class101 var1 = (class101) class52.field605.method1738(true);
        if (var1 == null) {
            return null;
        } else {
            class308 var2 = class339.field4665.method3058(var1.field1463, 0);
            return var2 != null && var2.field4260 && var2.method1876(class339.field4663, (byte) -56) ? var1 : class111.method813((byte) 118);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)V", line = 274)
    public final void method3605(int arg0, int arg1) {
        this.field9099 = arg1;
        field9087++;
        class117 var3 = this.field9096;
        synchronized (this.field9096) {
            if (arg0 != 36) {
                this.field9099 = 83;
            }
            this.field9096.method837(125);
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lbt;IZLgb;Lkda;Lkda;)V", line = 383)
    public class614(class39 arg0, int arg1, boolean arg2, class183 arg3, class328 arg4, class328 arg5) {
        this.field9076 = arg1;
        this.field9085 = arg2;
        this.field9101 = arg3;
        this.field9084 = arg5;
        this.field9083 = arg4;
        if (this.field9083 == null) {
            this.field9095 = 0;
        } else {
            int var7 = this.field9083.method1974(-8588) - 1;
            this.field9095 = this.field9083.method1975(38, var7) + var7 * 256;
        }
        this.field9100 = new String[] { null, null, class398.field5472.method3408(102, this.field9076), null, null };
        this.field9102 = new String[] { null, null, null, null, class11.field108.method3408(98, this.field9076) };
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)Lmh;", line = 292)
    public final class540 method3606(byte arg0, int arg1) {
        field9089++;
        class117 var3 = this.field9075;
        class540 var4;
        synchronized (this.field9075) {
            var4 = (class540) this.field9075.method842(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field9083;
        byte[] var6;
        synchronized (this.field9083) {
            var6 = this.field9083.method1966(class246.method1562(arg1, (byte) 79), class9.method42(arg1, true), true);
        }
        class540 var7 = new class540();
        var7.field8046 = this;
        var7.field8090 = arg1;
        var7.field8078 = new String[] { null, null, class398.field5472.method3408(89, this.field9076), null, null };
        var7.field8048 = new String[] { null, null, null, null, class11.field108.method3408(85, this.field9076) };
        if (var6 != null) {
            var7.method3276(new class148(var6), -17875);
        }
        var7.method3269((byte) -105);
        int var8 = 110 % ((arg0 + 63) / 34);
        if (var7.field8101 != -1) {
            var7.method3277(2, this.method3606((byte) -25, var7.field8072), this.method3606((byte) -119, var7.field8101));
        }
        if (var7.field8059 != -1) {
            var7.method3270((byte) 47, this.method3606((byte) -126, var7.field8062), this.method3606((byte) -103, var7.field8059));
        }
        if (!this.field9085 && var7.field8047) {
            var7.field8105 = class503.field7134.method3408(113, this.field9076);
            var7.field8039 = 0;
            var7.field8048 = this.field9102;
            var7.field8051 = null;
            var7.field8078 = this.field9100;
            var7.field8096 = false;
            if (var7.field8076 != null) {
                boolean var9 = false;
                for (class417 var10 = var7.field8076.method2798((byte) -104); var10 != null; var10 = var7.field8076.method2806(true)) {
                    class178 var11 = this.field9101.method1274(88, (int) var10.field5651);
                    if (var11.field2715) {
                        var10.method2457(-8422);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var7.field8076 = null;
                }
            }
        }
        class117 var12 = this.field9075;
        synchronized (this.field9075) {
            this.field9075.method835((byte) 126, (long) arg1, var7);
            return var7;
        }
    }
}
