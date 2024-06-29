import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class714 {

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    private int field10057 = -1;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "Z")
    public boolean field10053 = true;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    private int field10059;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "Ljia;")
    private class679 field10046;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "I")
    private int field10064;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "Leq;")
    private class357 field10051;

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "I")
    private int field10063;

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "Lhga;")
    private class185 field10067;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "Ljb;")
    private class719 field10050;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "Ldn;")
    private class584 field10054;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    public static int field10058;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public static int field10061;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "[Lac;")
    public static class712[] field10048;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
    public final void method3955(int arg0) {
        if (arg0 > 44) {
            field10056++;
            this.method3960(this.field10063, this.field10050, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method3956(int arg0, int arg1, int arg2) {
        field10066++;
        int var3 = arg1 - arg0;
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
        } else if (arg2 != 20543) {
            return null;
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI[BZIILeq;)Lmba;")
    public static final class77 method3957(int arg0, byte arg1, int arg2, byte[] arg3, boolean arg4, int arg5, int arg6, class357 arg7) {
        field10060++;
        int var8 = 125 % ((-arg1 - 29) / 36);
        if (!arg7.field5082 && (!class487.method2850((byte) -93, arg6) || !class487.method2850((byte) 99, arg0))) {
            return arg7.field5017 ? new class77(arg7, 34037, arg2, arg6, arg0, arg4, arg3, arg5) : new class77(arg7, arg2, arg6, arg0, class353.method2103(95, arg6), class353.method2103(55, arg0), arg3, arg5);
        } else {
            return new class77(arg7, 3553, arg2, arg6, arg0, arg4, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIBI)V")
    public static final void method3958(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 97) {
            method3965(-83L, false, 108, null, 31, 44, null, 102, 94);
        }
        if (class108.field1334 <= arg3 && class592.field8242 >= arg1 && arg0 >= class112.field1386 && class328.field4190 >= arg5) {
            class408.method2416(arg5, arg1, arg0, arg2, -89, arg3);
        } else {
            class67.method507(arg3, arg4 ^ 0xB, arg1, arg5, arg0, arg2);
        }
        field10065++;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lha;I)V")
    public static final void method3959(class454 arg0, int arg1) {
        class428 var2 = (class428) class173.field2264.method1839(-126);
        if (arg1 != 34037) {
            return;
        }
        while (var2 != null) {
            if (var2.field6081) {
                var2.method2549(arg0);
            }
            var2 = (class428) class173.field2264.method1836((byte) -26);
        }
        field10061++;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILjb;B)V")
    private final void method3960(int arg0, class719 arg1, byte arg2) {
        field10058++;
        if (arg0 != 0) {
            this.method3964(803);
            this.field10051.method2120(-1, this.field10067);
            int var4 = -10 % ((-arg2 - 20) / 60);
            this.field10051.method2183(arg0, 0, -30308, 4, arg1);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[BII)V")
    public final void method3961(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field10054.method2406(arg3, -13184, arg1, this.field10051.method2166((byte) 68, arg3) * arg0);
        field10047++;
        if (arg2 == 20795) {
            this.method3960(arg0, this.field10054, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIII)I")
    public static final int method3962(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        if (arg1 != 2) {
            method3962(59, 117, 91, -23);
        }
        field10049++;
        return (arg2 >> 1) + ((arg0 & 0xFF) >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)V")
    public static void method3963(int arg0) {
        if (arg0 < -3) {
            field10048 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)V")
    private final void method3964(int arg0) {
        field10055++;
        if (!this.field10053) {
            return;
        }
        this.field10053 = false;
        byte[] var2 = this.field10046.field9217;
        byte[] var3 = this.field10051.field5106;
        int var4 = 0;
        int var5 = this.field10046.field9221;
        int var6 = this.field10046.field9221 * this.field10064 + this.field10059;
        if (arg0 != 803) {
            method3958(-108, 60, 63, 50, (byte) 17, -124);
        }
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field10067 != null && this.field10057 == var4) {
            this.field10053 = false;
            return;
        }
        this.field10057 = var4;
        int var8 = 0;
        int var9 = this.field10064 * var5 + this.field10059;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field10046.field9221 - 128;
        }
        if (this.field10067 == null) {
            this.field10067 = new class185(this.field10051, 3553, 6406, 128, 128, false, this.field10051.field5106, 6406, false);
            this.field10067.method1188(arg0 + 9439, false, false);
            this.field10067.method2433(true, -118);
        } else {
            this.field10067.method1187(128, 128, false, this.field10051.field5106, 0, 3317, 6406, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(JZILaa;IILgaa;II)V")
    public static final void method3965(long arg0, boolean arg1, int arg2, class81 arg3, int arg4, int arg5, class460 arg6, int arg7, int arg8) {
        field10052++;
        int var10 = arg5 * arg5 + (arg4 * arg4);
        if ((long) var10 > arg0) {
            return;
        }
        int var11 = Math.min(arg6.field6566 / 2, arg6.field6514 / 2);
        if (var11 * var11 < var10) {
            var11 -= 10;
            int var12;
            if (class276.field3497 == 4) {
                var12 = (int) class748.field10471 & 0x3FFF;
            } else {
                var12 = (int) class748.field10471 + class10.field112 & 0x3FFF;
            }
            int var13 = class138.field1644[var12];
            int var14 = class138.field1645[var12];
            if (class276.field3497 != 4) {
                var14 = var14 * 256 / (class3.field16 + 256);
                var13 = var13 * 256 / (class3.field16 + 256);
            }
            int var15 = arg4 * var13 + arg5 * var14 >> 14;
            int var16 = arg4 * var14 - (arg5 * var13) >> 14;
            double var17 = Math.atan2((double) var15, (double) var16);
            int var19 = (int) (Math.sin(var17) * (double) var11);
            int var20 = (int) (Math.cos(var17) * (double) var11);
            class88.field1115[arg2].method3930((float) arg6.field6566 / 2.0F + (float) arg7 + (float) var19, (float) arg6.field6514 / 2.0F + (float) arg8 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
        } else {
            class469.method2763(arg7, arg5, arg8, arg6, arg4, (byte) 50, arg3, class15.field219[arg2]);
        }
        if (arg1) {
            field10048 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Leq;Ljia;Lqh;IIIII)V")
    public class714(class357 arg0, class679 arg1, class74 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field10059 = arg6;
        this.field10046 = arg1;
        this.field10064 = arg7;
        this.field10051 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field5569 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field983[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field10063 = var10;
        if (var10 <= 0) {
            this.field10067 = null;
        } else {
            class179 var14 = new class179(var10 * 2);
            if (this.field10051.field5025) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field5569 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field983[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1157(var23[var24] & 0xFFFF, (byte) 114);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field5569 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field983[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1098(var18[var19] & 0xFFFF, (byte) -23);
                            }
                        }
                    }
                }
            }
            this.field10050 = this.field10051.method2172(var14.field2325, 5123, -1, false, var14.field2354);
            this.field10054 = new class584(this.field10051, 5123, null, 1);
        }
    }
}
