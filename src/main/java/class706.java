import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class706 {

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "Llga;")
    private class663 field9980 = new class663(64);

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "Llga;")
    public class663 field9990 = new class663(50);

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "Ldj;")
    public class313 field9991 = new class313(250);

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "Lrb;")
    private class322 field9992 = new class322();

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public int field9971;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Lsea;")
    public class648 field9970;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "Z")
    private boolean field9983;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "Lsea;")
    private class648 field9978;

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "Lpa;")
    private class338 field9994;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public int field9974;

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field9995;

    @OriginalMember(owner = "client!mp", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field9996;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "Llh;")
    public static class487 field9985 = new class487(67, 3);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    public static int field9988;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
    public int field9993;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "J")
    public static long field9973;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "[Z")
    public static boolean[] field9975;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)Z")
    public static final boolean method3948(int arg0, int arg1, int arg2) {
        field9984++;
        if (arg2 != 12724) {
            field9973 = 33L;
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)Lmga;")
    public final class661 method3949(int arg0, int arg1) {
        field9986++;
        class663 var3 = this.field9980;
        class661 var4;
        synchronized (this.field9980) {
            var4 = (class661) this.field9980.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field9978;
        byte[] var6;
        synchronized (this.field9978) {
            var6 = this.field9978.method3654(-15615, class485.method2760(arg1, false), class614.method3436(true, arg1));
        }
        class661 var7 = new class661();
        var7.field9249 = this;
        var7.field9211 = arg1;
        var7.field9220 = new String[] { null, null, class65.field795.method555(this.field9971, true), null, null };
        var7.field9193 = new String[] { null, null, null, null, class65.field796.method555(this.field9971, true) };
        if (var6 != null) {
            var7.method3714(21, new class501(var6));
        }
        var7.method3715(-3087);
        if (~var7.field9190 != arg0) {
            var7.method3712(36, this.method3949(arg0, var7.field9190), this.method3949(0, var7.field9197));
        }
        if (var7.field9232 != -1) {
            var7.method3716(this.method3949(arg0, var7.field9208), false, this.method3949(arg0, var7.field9232));
        }
        if (!this.field9983 && var7.field9265) {
            var7.field9222 = class65.field793.method555(this.field9971, true);
            var7.field9246 = false;
            var7.field9193 = this.field9996;
            var7.field9220 = this.field9995;
            var7.field9200 = null;
            var7.field9195 = 0;
            if (var7.field9215 != null) {
                boolean var8 = false;
                for (class401 var9 = var7.field9215.method977(0); var9 != null; var9 = var7.field9215.method975(~arg0)) {
                    class488 var10 = this.field9994.method1977((byte) 58, (int) var9.field5623);
                    if (var10.field6696) {
                        var9.method2340(-124);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field9215 = null;
                }
            }
        }
        class663 var11 = this.field9980;
        synchronized (this.field9980) {
            this.field9980.method3748((long) arg1, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public final void method3950(int arg0) {
        if (arg0 > -44) {
            this.field9993 = 45;
        }
        class663 var2 = this.field9990;
        synchronized (this.field9990) {
            this.field9990.method3749(7648);
        }
        field9979++;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)V")
    public final void method3951(int arg0, int arg1) {
        if (arg0 <= 58) {
            return;
        }
        this.field9993 = arg1;
        field9988++;
        class663 var3 = this.field9990;
        synchronized (this.field9990) {
            this.field9990.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public final void method3952(byte arg0) {
        class663 var2 = this.field9980;
        synchronized (this.field9980) {
            this.field9980.method3749(7648);
        }
        field9977++;
        class663 var3 = this.field9990;
        synchronized (this.field9990) {
            this.field9990.method3749(7648);
        }
        class313 var4 = this.field9991;
        synchronized (this.field9991) {
            if (arg0 >= -68) {
                field9981 = -33;
            }
            this.field9991.method1903(-1);
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
    public final void method3953(int arg0) {
        class313 var2 = this.field9991;
        synchronized (this.field9991) {
            this.field9991.method1903(-1);
        }
        if (arg0 == -20688) {
            field9987++;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lvv;)V")
    public static final void method3954(class295 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class89.field1287[var1]; var2++) {
                if (class383.field5425[var1][var2] == arg0) {
                    class359.method2052(class383.field5425[var1], var2 + 1, class383.field5425[var1], var2, class89.field1287[var1] - var2 - 1);
                    var10002 = class89.field1287[var1]--;
                    return;
                }
            }
            for (int var3 = 0; var3 < class582.field8197[var1]; var3++) {
                if (class216.field3061[var1][var3] == arg0) {
                    class359.method2052(class216.field3061[var1], var3 + 1, class216.field3061[var1], var3, class582.field8197[var1] - var3 - 1);
                    var10002 = class582.field8197[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class466.field6417[var1]; var4++) {
                if (class420.field5921[var1][var4] == arg0) {
                    class359.method2052(class420.field5921[var1], var4 + 1, class420.field5921[var1], var4, class466.field6417[var1] - var4 - 1);
                    var10002 = class466.field6417[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
    public final void method3955(int arg0) {
        field9982++;
        if (arg0 <= 61) {
            this.method3952((byte) -112);
        }
        class663 var2 = this.field9980;
        synchronized (this.field9980) {
            this.field9980.method3755(19713);
        }
        class663 var3 = this.field9990;
        synchronized (this.field9990) {
            this.field9990.method3755(19713);
        }
        class313 var4 = this.field9991;
        synchronized (this.field9991) {
            this.field9991.method1895(-97);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZIIZILqi;Lr;Lla;ILr;I)Lf;")
    public final class702 method3956(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, class527 arg6, class166 arg7, class417 arg8, int arg9, class166 arg10, int arg11) {
        field9976++;
        if (arg3 >= -28) {
            method3954(null);
        }
        class702 var13 = this.method3960(-21722, arg2, arg5, arg9, arg11, arg7, arg6, arg0);
        if (var13 != null) {
            return var13;
        }
        class661 var14 = this.method3949(0, arg11);
        if (arg2 > 1 && var14.field9203 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg2 >= var14.field9196[var16] && var14.field9196[var16] != 0) {
                    var15 = var14.field9203[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3949(0, var15);
            }
        }
        int[] var17 = var14.method3720(arg5, arg8, arg6, arg2, arg10, arg1, -98, arg0, arg7, arg9);
        if (var17 == null) {
            return null;
        }
        class702 var18;
        if (arg4) {
            var18 = arg10.method175(var17, 0, 36, 36, 32);
        } else {
            var18 = arg7.method175(var17, 0, 36, 36, 32);
        }
        if (!arg4) {
            class322 var19 = new class322();
            var19.field4399 = arg9;
            var19.field4395 = arg11;
            var19.field4396 = arg7.field2427;
            var19.field4387 = arg2;
            var19.field4392 = arg0;
            var19.field4391 = arg5;
            var19.field4390 = arg6 != null;
            this.field9991.method1893(var18, (byte) -128, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)V")
    public static void method3957(int arg0) {
        if (arg0 != 3) {
            field9973 = -100L;
        }
        field9985 = null;
        field9975 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)V")
    public final void method3958(boolean arg0, int arg1) {
        field9989++;
        if (arg0 == this.field9983) {
            return;
        }
        this.field9983 = arg0;
        this.method3952((byte) -127);
        if (arg1 < 42) {
            this.field9978 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BI)V")
    public final void method3959(byte arg0, int arg1) {
        class663 var3 = this.field9980;
        synchronized (this.field9980) {
            this.field9980.method3754(arg1, true);
        }
        field9969++;
        class663 var4 = this.field9990;
        synchronized (this.field9990) {
            this.field9990.method3754(arg1, true);
        }
        class313 var5 = this.field9991;
        synchronized (this.field9991) {
            if (arg0 != -32) {
                method3957(-38);
            }
            this.field9991.method1902((byte) -112, arg1);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIILr;Lqi;I)Lf;")
    public final class702 method3960(int arg0, int arg1, int arg2, int arg3, int arg4, class166 arg5, class527 arg6, int arg7) {
        this.field9992.field4396 = arg5.field2427;
        this.field9992.field4395 = arg4;
        if (arg0 != -21722) {
            return null;
        }
        this.field9992.field4391 = arg2;
        this.field9992.field4399 = arg3;
        field9972++;
        this.field9992.field4390 = arg6 != null;
        this.field9992.field4387 = arg1;
        this.field9992.field4392 = arg7;
        return (class702) this.field9991.method1896(this.field9992, (byte) -126);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lci;IZLpa;Lsea;Lsea;)V")
    public class706(class414 arg0, int arg1, boolean arg2, class338 arg3, class648 arg4, class648 arg5) {
        this.field9971 = arg1;
        this.field9970 = arg5;
        this.field9983 = arg2;
        this.field9978 = arg4;
        this.field9994 = arg3;
        if (this.field9978 == null) {
            this.field9974 = 0;
        } else {
            int var7 = this.field9978.method3649((byte) 112) - 1;
            this.field9974 = var7 * 256 + this.field9978.method3653(var7, true);
        }
        this.field9995 = new String[] { null, null, class65.field795.method555(this.field9971, true), null, null };
        this.field9996 = new String[] { null, null, null, null, class65.field796.method555(this.field9971, true) };
    }
}
