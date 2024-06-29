import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class319 {

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    private int field4632 = -1;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Z")
    private boolean field4637 = true;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    private int field4638;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    private int field4633;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    private int field4635;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "[Lfq;")
    private class130[] field4648;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    private int field4630;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[Lfq;")
    private class130[] field4639;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lfq;")
    private class130 field4631;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "[I")
    public static int[] field4640 = new int[1000];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    private int field4641;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field4642;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lf;")
    private class256 field4643;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lrs;")
    public static class649 field4628;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field4649;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "[[B")
    public static byte[][] field4644;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1979(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 5)
    public static void method1972(int arg0) {
        if (arg0 >= -87) {
            field4644 = null;
        }
        field4628 = null;
        field4644 = null;
        field4640 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V", line = 17)
    public static final void method1973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 1000) {
            return;
        }
        field4636++;
        if (arg6 < 0 || arg2 < 0 || (class72.field1144 - 1) <= arg6 || arg2 >= class668.field9444 - 1) {
            return;
        }
        if (class603.field8695 == null) {
            return;
        }
        if (arg3 != 0) {
            if (arg3 == 1) {
                class83 var8 = (class83) class374.method2304(arg0, arg6, arg2);
                if (var8 != null) {
                    if (!(var8 instanceof class202)) {
                        int var9 = var8.method277((byte) 95);
                        if (arg7 != 4 && arg7 != 5) {
                            if (arg7 != 6) {
                                if (arg7 == 7) {
                                    class345.method2143(arg2, -2, 4, (arg1 + 2 & 0x3) + 4, arg4, var9, arg3, arg6, arg0);
                                } else if (arg7 == 8) {
                                    class345.method2143(arg2, -2, 4, arg1 + 4, arg4, var9, arg3, arg6, arg0);
                                    class345.method2143(arg2, -2, 4, (arg1 + 2 & 0x3) + 4, arg4, var9, arg3, arg6, arg0);
                                    return;
                                }
                                return;
                            }
                            class345.method2143(arg2, -2, 4, arg1 + 4, arg4, var9, arg3, arg6, arg0);
                            return;
                        }
                        class345.method2143(arg2, -2, 4, arg1, arg4, var9, arg3, arg6, arg0);
                        return;
                    }
                    ((class202) var8).field2753.method1111(arg4, -1);
                    return;
                }
            } else if (arg3 == 2) {
                class83 var11 = (class83) class434.method2583(arg0, arg6, arg2, field4649 == null ? (field4649 = method1979("je")) : field4649);
                if (var11 == null) {
                    return;
                }
                if (arg7 == 11) {
                    arg7 = 10;
                }
                if (!(var11 instanceof class685)) {
                    class345.method2143(arg2, -2, arg7, arg1, arg4, var11.method277((byte) 95), arg3, arg6, arg0);
                    return;
                }
                ((class685) var11).field9687.method1111(arg4, -1);
            } else if (arg3 == 3) {
                class83 var10 = (class83) class566.method3261(arg0, arg6, arg2);
                if (var10 != null) {
                    if (!(var10 instanceof class77)) {
                        class345.method2143(arg2, arg5 ^ 0xFFFFFC16, arg7, arg1, arg4, var10.method277((byte) 95), arg3, arg6, arg0);
                        return;
                    }
                    ((class77) var10).field1259.method1111(arg4, -1);
                    return;
                }
            }
            return;
        }
        class83 var12 = (class83) class386.method2381(arg0, arg6, arg2);
        class83 var13 = (class83) class183.method1227(arg0, arg6, arg2);
        if (var12 != null && arg7 != 2) {
            if ((var12 instanceof class135)) {
                ((class135) var12).field1958.method1111(arg4, -1);
            } else {
                class345.method2143(arg2, -2, arg7, arg1, arg4, var12.method277((byte) 95), arg3, arg6, arg0);
            }
        }
        if (var13 == null) {
            return;
        }
        if (!(var13 instanceof class135)) {
            class345.method2143(arg2, -2, arg7, arg1, arg4, var13.method277((byte) 95), arg3, arg6, arg0);
            return;
        }
        ((class135) var13).field1958.method1111(arg4, arg5 ^ 0xFFFFFC17);
        return;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 142)
    public final void method1974(int arg0) {
        if (arg0 != 0) {
            method1972(-7);
        }
        field4646++;
        if (this.field4648 != null) {
            for (int var2 = 0; var2 < this.field4648.length; var2++) {
                this.field4648[var2].method922();
            }
        }
        this.field4643 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I[Lfq;IIII)V", line = 432)
    public class319(int arg0, class130[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4638 = arg4;
        this.field4633 = arg5;
        this.field4635 = arg0;
        this.field4648 = arg1;
        this.field4630 = arg3;
        if (arg1 == null) {
            this.field4639 = null;
            this.field4631 = null;
        } else {
            this.field4639 = new class130[arg1.length];
            this.field4631 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V", line = 177)
    public static final void method1975(int arg0) {
        field4647++;
        int var1 = class416.field6150;
        int[] var2 = class35.field554;
        for (int var3 = 0; var3 < var1; var3++) {
            class71 var9 = class35.field551[var2[var3]];
            if (var9 != null && var9.field7386 > 0) {
                var9.field7386--;
                if (var9.field7386 == 0) {
                    var9.field7362 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class155.field2213; var4++) {
            long var5 = (long) class523.field7379[var4];
            class177 var7 = (class177) class271.field3550.method2002((byte) -108, var5);
            if (var7 != null) {
                class53 var8 = var7.field2476;
                if (var8.field7386 > 0) {
                    var8.field7386--;
                    if (var8.field7386 == 0) {
                        var8.field7362 = null;
                    }
                }
            }
        }
        if (arg0 != -10636) {
            method1972(-124);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZBLps;)V", line = 238)
    public static final void method1976(boolean arg0, byte arg1, class5 arg2) {
        field4634++;
        if (arg1 != 79) {
            field4628 = null;
        }
        int var3 = arg2.field152 == 0 ? arg2.field202 : arg2.field152;
        int var4 = arg2.field120 == 0 ? arg2.field76 : arg2.field120;
        class366.method2242(-45, arg2.field65, class220.field2917[arg2.field65 >> 16], var3, var4, arg0);
        if (arg2.field109 != null) {
            class366.method2242(126, arg2.field65, arg2.field109, var3, var4, arg0);
        }
        class200 var5 = (class200) class318.field4623.method2002((byte) -110, (long) arg2.field65);
        if (var5 != null) {
            class353.method2193(var3, 17068, var5.field2716, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BILr;)Z", line = 262)
    public final boolean method1977(byte arg0, int arg1, class98 arg2) {
        field4629++;
        if (this.field4632 != arg1) {
            this.field4632 = arg1;
            int var4 = class334.method2048(arg1, (byte) -103);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field4641 != var4) {
                this.field4641 = var4;
                this.field4643 = null;
            }
            if (this.field4648 != null) {
                this.field4642 = 0;
                int[] var5 = new int[this.field4648.length];
                for (int var6 = 0; var6 < this.field4648.length; var6++) {
                    class130 var7 = this.field4648[var6];
                    if (var7.method927(this.field4630, this.field4638, this.field4633, this.field4632)) {
                        var5[this.field4642] = var7.field1874;
                        this.field4639[this.field4642++] = var7;
                    }
                }
                class390.method2417(0, this.field4639, this.field4642 - 1, var5, 41);
            }
            this.field4637 = true;
        }
        boolean var8 = false;
        if (this.field4637) {
            this.field4637 = false;
            for (int var9 = this.field4642 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4639[var9].method925(arg2, this.field4631);
                var8 |= var10;
                this.field4637 |= !var10;
            }
        }
        if (arg0 < 56) {
            method1973(94, 121, -93, -113, 81, -88, -16, -79);
        }
        return var8;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIILr;III)V", line = 354)
    public final void method1978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class98 arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 8414) {
            this.method1974(-20);
        }
        int var11 = arg0 + arg2 & 0x3FFF;
        field4645++;
        if (this.field4635 == -1 || this.field4641 == 0) {
            arg6.method700(arg1, arg7, arg3, arg4, arg5, 0);
        } else {
            class457 var12 = class537.field7891.method955(arg9 ^ 0xFFFFDA10, this.field4635);
            if (this.field4643 == null && class537.field7891.method956(this.field4635, 15925)) {
                int[] var13 = var12.field6594 ? class537.field7891.method957(this.field4641, arg9 - 10640, this.field4641, false, 0.7F, this.field4635) : class537.field7891.method958(0.7F, this.field4641, arg9 - 26200, false, this.field4641, this.field4635);
                this.field4643 = arg6.method704(var13, 0, this.field4641, this.field4641, this.field4641);
            }
            if (var12.field6594) {
                arg6.method700(arg1, arg7, arg3, arg4, arg5, 0);
            }
            if (this.field4643 != null) {
                int var14 = var12.field6594 ? 1 : 0;
                int var15 = arg4 * arg8 / -4096;
                int var16;
                for (var16 = arg4 * var11 / 4096 + (arg3 - arg4) / 2; var16 > arg4; var16 -= arg4) {
                }
                while (var16 < 0) {
                    var16 += arg4;
                }
                while (var15 > arg4) {
                    var15 -= arg4;
                }
                while (var15 < 0) {
                    var15 += arg4;
                }
                for (int var17 = var16 - arg4; var17 < arg3; var17 += arg4) {
                    for (int var18 = var15 - arg4; var18 < arg4; var18 += arg4) {
                        this.field4643.method1532(arg1 + var17, arg7 + var18, arg4, arg4, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4642 - 1; var19 >= 0; var19--) {
            this.field4639[var19].method923(arg6, arg1, arg7, arg3, arg4, arg8, var11);
        }
    }
}
