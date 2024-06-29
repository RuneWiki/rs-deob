import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class561 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    private int field7007 = 0;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    private int field7012 = 0;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    private int field7000 = -1;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    private int field7005 = 0;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field7016 = -1;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    private int field7010 = 128;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "B")
    public byte field7021 = 0;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Z")
    public boolean field7006 = false;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    private int field7009 = 128;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field7018 = 0;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "[I")
    public static int[] field7023 = new int[32];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field6999;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    private int field7020;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Ldf;")
    public class372 field7013;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[S")
    private short[] field7001;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[S")
    private short[] field7002;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[S")
    private short[] field7004;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[S")
    private short[] field7017;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/lang/String;Lji;)I", line = 4)
    public static final int method2980(byte arg0, String arg1, class572 arg2) {
        field7024++;
        int var3 = arg2.field7313;
        byte[] var4 = class7.method26(-128, arg1);
        arg2.method3037(var4.length, -54);
        arg2.field7313 += class2.field12.method3750(var4.length, arg2.field7318, 0, var4, arg2.field7313, (byte) 107);
        if (arg0 != -7) {
            field7023 = null;
        }
        return arg2.field7313 - var3;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIBILd;Lsa;IILd;Loa;Z)Lba;", line = 31)
    private final class359 method2981(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class140 arg7, class193 arg8, int arg9, int arg10, class140 arg11, class650 arg12, boolean arg13) {
        field7011++;
        if (arg0 != -7) {
            method2985(-71);
        }
        int var15 = arg1;
        class207 var16 = this.field7016 == -1 || arg2 == -1 ? null : arg8.method1141(this.field7016, (byte) 115);
        boolean var17 = arg13 & this.field7021 != 0;
        if (var16 != null) {
            var15 = arg1 | var16.method1209(arg10, false, -37, arg2);
        }
        if (var17) {
            var15 |= this.field7021 == 3 ? 7 : 2;
        }
        if (this.field7009 != 128) {
            var15 |= 0x2;
        }
        if (this.field7010 != 128 || this.field7007 != 0) {
            var15 |= 0x5;
        }
        class208 var18 = this.field7013.field4804;
        class359 var19;
        synchronized (this.field7013.field4804) {
            var19 = (class359) this.field7013.field4804.method1221((long) (this.field6999 |= arg12.field8780 << 29), true);
        }
        if (var19 == null || arg12.method493(var19.method2075(), var15) != 0) {
            if (var19 != null) {
                var15 = arg12.method469(var15, var19.method2075());
            }
            int var20 = var15;
            if (this.field7004 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field7001 != null) {
                var20 |= 0x8000;
            }
            class229 var21 = class167.method1013((byte) -28, this.field7020, this.field7013.field4794, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field2998 < 13) {
                var21.method1380(2, -1);
            }
            var19 = arg12.method408(var21, var20, this.field7013.field4805, this.field7005 + 64, this.field7012 + 850);
            if (this.field7004 != null) {
                for (int var22 = 0; var22 < this.field7004.length; var22++) {
                    var19.method2080(this.field7004[var22], this.field7002[var22]);
                }
            }
            if (this.field7001 != null) {
                for (int var23 = 0; var23 < this.field7001.length; var23++) {
                    var19.method2079(this.field7001[var23], this.field7017[var23]);
                }
            }
            var19.method2069(var15);
            class208 var24 = this.field7013.field4804;
            synchronized (this.field7013.field4804) {
                this.field7013.field4804.method1230((byte) -123, (long) (this.field6999 |= arg12.field8780 << 29), var19);
            }
        }
        class359 var25 = var16 == null ? var19.method951(arg5, var15, true) : var16.method1212(arg10, arg2, 0, arg9, (byte) -36, var15, var19, arg5);
        if (this.field7010 != 128 || this.field7009 != 128) {
            var25.method2088(this.field7010, this.field7009, this.field7010);
        }
        if (this.field7007 != 0) {
            if (this.field7007 == 90) {
                var25.method2053(4096);
            }
            if (this.field7007 == 180) {
                var25.method2053(8192);
            }
            if (this.field7007 == 270) {
                var25.method2053(12288);
            }
        }
        if (var17) {
            var25.method2086(this.field7021, this.field7000, arg11, arg7, arg3, arg6, arg4);
        }
        var25.method2069(arg1);
        return var25;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBILd;IILsa;Ld;IIZLoa;)Lba;", line = 151)
    public final class359 method2982(int arg0, int arg1, byte arg2, int arg3, class140 arg4, int arg5, int arg6, class193 arg7, class140 arg8, int arg9, int arg10, boolean arg11, class650 arg12) {
        if (arg2 != 2) {
            method2985(8);
        }
        field7019++;
        return this.method2981(-7, arg6, arg1, arg3, arg5, (byte) 2, arg9, arg4, arg7, arg0, arg10, arg8, arg12, arg11);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZLji;)V", line = 163)
    private final void method2983(int arg0, boolean arg1, class572 arg2) {
        field7003++;
        if (arg0 == 1) {
            this.field7020 = arg2.method3031(-1);
        } else if (arg0 == 2) {
            this.field7016 = arg2.method3031(-1);
        } else if (arg0 == 4) {
            this.field7010 = arg2.method3031(-1);
        } else if (arg0 == 5) {
            this.field7009 = arg2.method3031(-1);
        } else if (arg0 == 6) {
            this.field7007 = arg2.method3031(-1);
        } else if (arg0 == 7) {
            this.field7005 = arg2.method3097((byte) 12);
        } else if (arg0 == 8) {
            this.field7012 = arg2.method3097((byte) 12);
        } else if (arg0 == 9) {
            this.field7021 = 3;
            this.field7000 = 8224;
        } else if (arg0 == 10) {
            this.field7006 = true;
        } else if (arg0 == 11) {
            this.field7021 = 1;
        } else if (arg0 == 12) {
            this.field7021 = 4;
        } else if (arg0 == 13) {
            this.field7021 = 5;
        } else if (arg0 == 14) {
            this.field7021 = 2;
            this.field7000 = arg2.method3097((byte) 12) * 256;
        } else if (arg0 == 15) {
            this.field7021 = 3;
            this.field7000 = arg2.method3031(-1);
        } else if (arg0 == 16) {
            this.field7021 = 3;
            this.field7000 = arg2.method3064(-2031091464);
        } else if (arg0 == 40) {
            int var4 = arg2.method3097((byte) 12);
            this.field7004 = new short[var4];
            this.field7002 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7004[var5] = (short) arg2.method3031(-1);
                this.field7002[var5] = (short) arg2.method3031(-1);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method3097((byte) 12);
            this.field7017 = new short[var6];
            this.field7001 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7001[var7] = (short) arg2.method3031(-1);
                this.field7017[var7] = (short) arg2.method3031(-1);
            }
        }
        if (arg1) {
            this.field7020 = 18;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 285)
    public static final void method2984(int arg0) {
        field7014++;
        int var1 = class27.field314 * 512 + 256;
        int var2 = class633.field8590 * 512 + 256;
        int var3 = class514.method2798(var2, var1, class675.field9219, (byte) 31) - class71.field907;
        if (class243.field3149 < 100) {
            if (class238.field3071 < var1) {
                class238.field3071 += (var1 - class238.field3071) * class243.field3149 / 1000 + class167.field1966;
                if (var1 < class238.field3071) {
                    class238.field3071 = var1;
                }
            }
            if (class238.field3071 > var1) {
                class238.field3071 -= class167.field1966 + ((class238.field3071 - var1) * class243.field3149 / 1000);
                if (var1 > class238.field3071) {
                    class238.field3071 = var1;
                }
            }
            if (class455.field5688 < var3) {
                class455.field5688 += (var3 - class455.field5688) * class243.field3149 / 1000 + class167.field1966;
                if (var3 < class455.field5688) {
                    class455.field5688 = var3;
                }
            }
            if (class710.field9924 < var2) {
                class710.field9924 += (var2 - class710.field9924) * class243.field3149 / 1000 + class167.field1966;
                if (var2 < class710.field9924) {
                    class710.field9924 = var2;
                }
            }
            if (var3 < class455.field5688) {
                class455.field5688 -= (class455.field5688 - var3) * class243.field3149 / 1000 + class167.field1966;
                if (var3 > class455.field5688) {
                    class455.field5688 = var3;
                }
            }
            if (class710.field9924 > var2) {
                class710.field9924 -= (class710.field9924 - var2) * class243.field3149 / 1000 + class167.field1966;
                if (var2 > class710.field9924) {
                    class710.field9924 = var2;
                }
            }
        } else {
            class238.field3071 = class27.field314 * 512 + 256;
            class710.field9924 = class633.field8590 * 512 + 256;
            class455.field5688 = class514.method2798(class710.field9924, class238.field3071, class675.field9219, (byte) 103) - class71.field907;
        }
        int var4 = 3 % ((-arg0 - 65) / 56);
        int var5 = class102.field1309 * 512 + 256;
        int var6 = class92.field1186 * 512 + 256;
        int var7 = class514.method2798(var5, var6, class675.field9219, (byte) 77) - class19.field201;
        int var8 = var6 - class238.field3071;
        int var9 = var7 - class455.field5688;
        int var10 = var5 - class710.field9924;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        if (var12 < 1024) {
            var12 = 1024;
        }
        int var13 = (int) (-2607.5945876176133D * Math.atan2((double) var8, (double) var10)) & 0x3FFF;
        if (var12 > 3072) {
            var12 = 3072;
        }
        if (var12 > client.field3568) {
            client.field3568 += (var12 - client.field3568 >> 3) * class465.field5772 / 1000 + class699.field9682 << 3;
            if (var12 < client.field3568) {
                client.field3568 = var12;
            }
        }
        if (var12 < client.field3568) {
            client.field3568 -= (client.field3568 - var12 >> 3) * class465.field5772 / 1000 + class699.field9682 << 3;
            if (client.field3568 < var12) {
                client.field3568 = var12;
            }
        }
        int var14 = var13 - class177.field2068;
        if (var14 > 8192) {
            var14 -= 16384;
        }
        if (var14 < -8192) {
            var14 += 16384;
        }
        int var15 = var14 >> 3;
        if (var15 > 0) {
            class177.field2068 += class465.field5772 * var15 / 1000 + class699.field9682 << 3;
            class177.field2068 &= 0x3FFF;
        }
        if (var15 < 0) {
            class177.field2068 -= -var15 * class465.field5772 / 1000 + class699.field9682 << 3;
            class177.field2068 &= 0x3FFF;
        }
        int var16 = var13 - class177.field2068;
        if (var16 > 8192) {
            var16 -= 16384;
        }
        if (var16 < -8192) {
            var16 += 16384;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            class177.field2068 = var13;
        }
        class613.field8340 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V", line = 443)
    public static void method2985(int arg0) {
        field7023 = null;
        int var1 = -51 % ((arg0 + 11) / 61);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIILsa;Loa;I)Lba;", line = 468)
    public final class359 method2986(int arg0, int arg1, int arg2, int arg3, class193 arg4, class650 arg5, int arg6) {
        if (arg6 != 0) {
            method2984(104);
        }
        field7022++;
        return this.method2981(-7, arg0, arg1, 0, 0, (byte) 5, 0, null, arg4, arg3, arg2, null, arg5, false);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lji;B)V", line = 487)
    public final void method2987(class572 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                if (arg1 != -36) {
                    return;
                }
                field7008++;
                return;
            }
            this.method2983(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILsa;IILoa;B)Lba;", line = 514)
    public final class359 method2988(int arg0, int arg1, class193 arg2, int arg3, int arg4, class650 arg5, byte arg6) {
        if (arg6 > -97) {
            this.field7009 = -89;
        }
        field7015++;
        return this.method2981(-7, arg0, arg4, 0, 0, (byte) 2, 0, null, arg2, arg1, arg3, null, arg5, false);
    }
}
