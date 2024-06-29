import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class278 extends class223 {

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public int field4072;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public int field4077;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "[I")
    public static int[] field4082 = new int[8];

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "Lbg;")
    public static class324 field4081 = new class324(93, 8);

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    public static int field4085 = 0;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1781(int arg0) {
        field4083++;
        if (arg0 != 16457) {
            this.method1789(-20);
        }
        return (this.field4072 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)Z", line = 14)
    public final boolean method1782(int arg0) {
        field4078++;
        if (arg0 < 47) {
            field4085 = 21;
        }
        return ((this.field4072 & 0x34886E) >> 21) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Z", line = 25)
    public final boolean method1783(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method1788(104);
        }
        field4080++;
        return (this.field4072 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z", line = 37)
    public final boolean method1784(int arg0) {
        if (arg0 != 1) {
            field4085 = 43;
        }
        field4076++;
        return (this.field4072 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 53)
    public static final String method1785(int arg0, boolean arg1, int arg2) {
        field4084++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else {
            if (!arg1) {
                method1785(-1, false, -117);
            }
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lya;BLaq;Lnf;II)Z", line = 97)
    public static final boolean method1786(class38 arg0, byte arg1, class111 arg2, class405 arg3, int arg4, int arg5) {
        field4075++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field6020 != null) {
            var7 = class399.field5909 + ((arg2.field1566 + arg3.field6025 - class399.field5917) * (class399.field5925 - class399.field5909) / (class399.field5921 - class399.field5917));
            var9 = class399.field5924 - ((arg3.field6001 - (class399.field5916 - arg2.field1560)) * (class399.field5924 - class399.field5918) / (class399.field5908 - class399.field5916));
            var6 = (arg3.field6031 + arg2.field1566 - class399.field5917) * (class399.field5925 - class399.field5909) / (class399.field5921 - class399.field5917) + class399.field5909;
            var8 = class399.field5924 - ((arg2.field1560 + arg3.field6014 - class399.field5916) * (class399.field5924 - class399.field5918) / (class399.field5908 - class399.field5916));
        }
        class16 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg3.field6019 != -1) {
            if (arg2.field1561 && arg3.field5998 != -1) {
                var10 = arg3.method2488(arg0, true, (byte) 69);
            } else {
                var10 = arg3.method2488(arg0, false, (byte) 107);
            }
            if (var10 != null) {
                var11 = arg2.field1569 - (var10.method125() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg2.field1569 + (var10.method125() + 1 >> 1);
                var13 = arg2.field1564 - (var10.method117() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg2.field1564 + (var10.method117() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class191 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field5991 != null) {
            var15 = class347.method2100(arg3.field5987, (byte) -117);
            if (var15 != null) {
                var16 = class59.field685.method1968(null, null, (byte) -78, class193.field2808, arg3.field5991);
                int var23 = arg2.field1564;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1344() / 2;
                } else {
                    var17 = var23 - ((var10.method117() >> 1) + (var15.method1341() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class193.field2808[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1343(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg2.field1569 + arg5 - (var18 / 2);
                var20 = var18 / 2 + arg2.field1569 + arg5;
                if (var19 < var6) {
                    var6 = var19;
                }
                var21 = arg4 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                var22 = arg4 + var17 + var16 * var15.method1341();
                if (var21 < var8) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class399.field5909 > var7 || var6 > class399.field5925 || class399.field5918 > var9 || class399.field5924 < var8) {
            return true;
        }
        if (arg1 != -83) {
            field4082 = null;
        }
        if (arg3.field6020 != null) {
            int[] var27 = new int[arg3.field6020.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg3.field6020[var28 * 2] + arg2.field1566;
                int var31 = arg3.field6020[var28 * 2 + 1] + arg2.field1560;
                var27[var28 * 2] = (class399.field5925 - class399.field5909) * (var30 - class399.field5917) / (class399.field5921 - class399.field5917) + class399.field5909;
                var27[var28 * 2 + 1] = class399.field5924 - ((class399.field5924 - class399.field5918) * (var31 - class399.field5916) / (class399.field5908 - class399.field5916));
            }
            class271.method1744(arg0, var27, arg3.field6016);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg0.method371(var27[var29 * 2 + 1], arg3.field5993, var27[var29 * 2], var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 2], arg1 + 87);
            }
            arg0.method371(var27[var27.length - 1], arg3.field5993, var27[var27.length - 2], var27[1], var27[0], 4);
        }
        if (var10 != null) {
            if (class509.field7504 > 0 && (class496.field7277 != -1 && class496.field7277 == arg2.field1567 || class392.field5773 != -1 && class392.field5773 == arg3.field6007)) {
                int var32;
                if (class417.field6164 <= 50) {
                    var32 = class417.field6164 * 2;
                } else {
                    var32 = (100 - class417.field6164) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg0.method384((byte) 76, arg2.field1564, var10.method110() / 2 + 7, arg2.field1569, var33);
                arg0.method384((byte) 76, arg2.field1564, var10.method110() / 2 + 5, arg2.field1569, var33);
                arg0.method384((byte) 76, arg2.field1564, var10.method110() / 2 + 3, arg2.field1569, var33);
                arg0.method384((byte) 76, arg2.field1564, var10.method110() / 2 + 1, arg2.field1569, var33);
                arg0.method384((byte) 76, arg2.field1564, var10.method110() / 2, arg2.field1569, var33);
            }
            var10.method111(arg2.field1569 - (var10.method125() >> 1), arg2.field1564 - (var10.method117() >> 1));
        }
        if (arg3.field5991 != null && var15 != null) {
            class112.method909(var16, (byte) 124, arg2, var18, var17, var15, arg3, arg0);
        }
        if (arg3.field6019 != -1 || arg3.field5991 != null) {
            class504 var34 = new class504(arg2);
            var34.field7471 = var14;
            var34.field7477 = var20;
            var34.field7468 = var12;
            var34.field7467 = var11;
            var34.field7469 = var22;
            var34.field7470 = var19;
            var34.field7473 = var13;
            var34.field7472 = var21;
            class274.field4042.method1015(false, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V", line = 313)
    public static void method1787(int arg0) {
        field4082 = null;
        if (arg0 != 0) {
            method1785(125, true, -26);
        }
        field4081 = null;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(II)V", line = 323)
    public class278(int arg0, int arg1) {
        this.field4072 = arg0;
        this.field4077 = arg1;
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)I", line = 332)
    public final int method1788(int arg0) {
        if (arg0 != 1861624) {
            method1787(-84);
        }
        field4074++;
        return (this.field4072 & 0x1C67F8) >> 18;
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)I", line = 343)
    public final int method1789(int arg0) {
        field4079++;
        if (arg0 != 16693) {
            field4081 = null;
        }
        return class140.method1047(9921, this.field4072);
    }
}
