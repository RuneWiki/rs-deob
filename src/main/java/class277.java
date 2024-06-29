import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class277 {

    @OriginalMember(owner = "client!io", name = "m", descriptor = "Lhu;")
    private class76 field3668 = new class76(64);

    @OriginalMember(owner = "client!io", name = "s", descriptor = "Lhu;")
    public class76 field3674 = new class76(50);

    @OriginalMember(owner = "client!io", name = "t", descriptor = "Lhs;")
    public class196 field3675 = new class196(250);

    @OriginalMember(owner = "client!io", name = "u", descriptor = "Ldt;")
    private class145 field3676 = new class145();

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Lr;")
    public class110 field3660;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Lbe;")
    private class28 field3680;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "Lr;")
    private class110 field3673;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "Z")
    private boolean field3670;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field3677;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field3679;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "Lh;")
    public static class434 field3671 = new class434(87, -2);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public int field3678;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V", line = 16)
    public final void method1555(int arg0, int arg1) {
        field3666++;
        class76 var3 = this.field3668;
        synchronized (this.field3668) {
            this.field3668.method496(arg0, arg1 ^ 0x2A);
        }
        class76 var4 = this.field3674;
        synchronized (this.field3674) {
            this.field3674.method496(arg0, arg1 - 39);
        }
        class196 var5 = this.field3675;
        synchronized (this.field3675) {
            this.field3675.method1124(arg0, 11);
            if (arg1 != -1) {
                this.method1561(108);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIILjo;Lwm;III)Ljd;", line = 35)
    public final class139 method1556(int arg0, int arg1, int arg2, class202 arg3, class364 arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 64) {
            field3671 = null;
        }
        this.field3676.field2088 = arg3 != null;
        this.field3676.field2090 = arg7;
        this.field3676.field2089 = arg2;
        this.field3676.field2083 = arg4.field4999;
        this.field3676.field2084 = arg5;
        this.field3676.field2086 = arg6;
        field3657++;
        this.field3676.field2085 = arg1;
        return (class139) this.field3675.method1131(this.field3676, 0);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)Lqf;", line = 55)
    public final class443 method1557(int arg0, int arg1) {
        field3663++;
        class76 var3 = this.field3668;
        class443 var4;
        synchronized (this.field3668) {
            var4 = (class443) this.field3668.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == 21992) {
            byte[] var5 = this.field3673.method702((byte) 123, class313.method1713((byte) -94, arg0), class245.method1372(arg0, 107));
            class443 var6 = new class443();
            var6.field6025 = arg0;
            var6.field5993 = this;
            var6.field5970 = new String[] { null, null, class323.field4308.method1176(this.field3661, (byte) -98), null, null };
            var6.field6011 = new String[] { null, null, null, null, class263.field3499.method1176(this.field3661, (byte) -100) };
            if (var5 != null) {
                var6.method2588(true, new class32(var5));
            }
            var6.method2594((byte) -18);
            if (var6.field6029 != -1) {
                var6.method2597(arg1 - 21993, this.method1557(var6.field5956, 21992), this.method1557(var6.field6029, arg1));
            }
            if (var6.field6003 != -1) {
                var6.method2601(this.method1557(var6.field6003, 21992), this.method1557(var6.field6015, 21992), 0);
            }
            if (!this.field3670 && var6.field5991) {
                var6.field5996 = class330.field4380.method1176(this.field3661, (byte) -115);
                var6.field6011 = this.field3679;
                var6.field5960 = null;
                var6.field6028 = 0;
                var6.field5971 = false;
                var6.field5970 = this.field3677;
                if (var6.field6027 != null) {
                    boolean var7 = false;
                    for (class445 var8 = var6.field6027.method1518((byte) -75); var8 != null; var8 = var6.field6027.method1517(arg1 - 52934)) {
                        class112 var9 = this.field3680.method164(arg1 ^ 0x55F3, (int) var8.field6047);
                        if (var9.field1700) {
                            var8.method2614((byte) -82);
                        } else {
                            var7 = true;
                        }
                    }
                    if (!var7) {
                        var6.field6027 = null;
                    }
                }
            }
            class76 var10 = this.field3668;
            synchronized (this.field3668) {
                this.field3668.method505((long) arg0, var6, 115);
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 132)
    public final void method1558(int arg0) {
        field3667++;
        class196 var2 = this.field3675;
        synchronized (this.field3675) {
            this.field3675.method1119(-37);
            if (arg0 > -62) {
                this.method1556(31, -83, 16, (class202) null, (class364) null, 5, 93, -61);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 146)
    public final void method1559(boolean arg0) {
        field3669++;
        if (!arg0) {
            this.method1567(-97, (class345) null, -30, (class364) null, true, -85, false, (class202) null, -103, (class364) null, -78, (byte) -31);
        }
        class76 var2 = this.field3668;
        synchronized (this.field3668) {
            this.field3668.method495(-72);
        }
        class76 var3 = this.field3674;
        synchronized (this.field3674) {
            this.field3674.method495(-101);
        }
        class196 var4 = this.field3675;
        synchronized (this.field3675) {
            this.field3675.method1119(-78);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZB)V", line = 166)
    public final void method1560(boolean arg0, byte arg1) {
        field3665++;
        if (this.field3670 != arg0 && arg1 < 0) {
            this.field3670 = arg0;
            this.method1559(true);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 185)
    public final void method1561(int arg0) {
        field3662++;
        class76 var2 = this.field3668;
        synchronized (this.field3668) {
            this.field3668.method502(0);
        }
        class76 var3 = this.field3674;
        synchronized (this.field3674) {
            this.field3674.method502(0);
        }
        if (arg0 > 100) {
            class196 var4 = this.field3675;
            synchronized (this.field3675) {
                this.field3675.method1125((byte) 95);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZ)Z", line = 204)
    public static boolean method1562(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(II)V", line = 212)
    public final void method1563(int arg0, int arg1) {
        field3672++;
        this.field3678 = arg1;
        class76 var3 = this.field3674;
        synchronized (this.field3674) {
            this.field3674.method495(-112);
            int var4 = 35 / ((11 - arg0) / 38);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 230)
    public static void method1564(byte arg0) {
        if (arg0 < -101) {
            field3671 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 243)
    public final void method1565(byte arg0) {
        class76 var2 = this.field3674;
        synchronized (this.field3674) {
            this.field3674.method495(-114);
        }
        if (arg0 <= 103) {
            method1566(91, (class110) null);
        }
        field3659++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILr;)V", line = 256)
    public static final void method1566(int arg0, class110 arg1) {
        int var2 = -56 / ((31 - arg0) / 60);
        field3664++;
        class486.field6725 = arg1;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILur;ILwm;ZIZLjo;ILwm;IB)Ljd;", line = 267)
    public final class139 method1567(int arg0, class345 arg1, int arg2, class364 arg3, boolean arg4, int arg5, boolean arg6, class202 arg7, int arg8, class364 arg9, int arg10, byte arg11) {
        if (arg11 != 10) {
            this.field3661 = -37;
        }
        field3656++;
        class139 var13 = this.method1556(64, arg8, arg0, arg7, arg3, arg5, arg10, arg2);
        if (var13 != null) {
            return var13;
        }
        class443 var14 = this.method1557(arg0, arg11 + 21982);
        if (arg2 > 1 && var14.field5988 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg2 >= var14.field5990[var16] && var14.field5990[var16] != 0) {
                    var15 = var14.field5988[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1557(var15, 21992);
            }
        }
        int[] var17 = var14.method2598(arg1, arg7, (byte) -99, arg3, arg5, arg9, arg8, arg10, arg2, arg6);
        if (var17 == null) {
            return null;
        }
        class139 var18;
        if (arg4) {
            var18 = arg9.method1982(var17, 0, 36, 36, 32);
        } else {
            var18 = arg3.method1982(var17, 0, 36, 36, 32);
        }
        if (!arg4) {
            class145 var19 = new class145();
            var19.field2083 = arg3.field4999;
            var19.field2088 = arg7 != null;
            var19.field2085 = arg8;
            var19.field2090 = arg2;
            var19.field2084 = arg5;
            var19.field2086 = arg10;
            var19.field2089 = arg0;
            this.field3675.method1118(-23059, var19, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ldn;IZLbe;Lr;Lr;)V", line = 349)
    public class277(class329 arg0, int arg1, boolean arg2, class28 arg3, class110 arg4, class110 arg5) {
        this.field3660 = arg5;
        this.field3661 = arg1;
        this.field3680 = arg3;
        this.field3673 = arg4;
        this.field3670 = arg2;
        if (this.field3673 == null) {
            this.field3658 = 0;
        } else {
            int var7 = this.field3673.method705((byte) -103) - 1;
            this.field3658 = var7 * 256 + this.field3673.method694(var7, (byte) 119);
        }
        this.field3677 = new String[] { null, null, class323.field4308.method1176(this.field3661, (byte) -100), null, null };
        this.field3679 = new String[] { null, null, null, null, class263.field3499.method1176(this.field3661, (byte) -88) };
    }
}
