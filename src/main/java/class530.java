import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class530 extends class279 {

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    private int field7757 = 0;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    private int field7760 = 0;

    @OriginalMember(owner = "client!mo", name = "db", descriptor = "I")
    private int field7777 = -32768;

    @OriginalMember(owner = "client!mo", name = "eb", descriptor = "Z")
    public boolean field7778 = false;

    @OriginalMember(owner = "client!mo", name = "hb", descriptor = "I")
    private int field7781 = 0;

    @OriginalMember(owner = "client!mo", name = "ab", descriptor = "I")
    private int field7774 = -1;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public int field7762;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
    private int field7769;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
    private int field7770;

    @OriginalMember(owner = "client!mo", name = "bb", descriptor = "Loj;")
    private class260 field7775;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "[[I")
    public static int[][] field7767 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field7766 = 0;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!mo", name = "Z", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!mo", name = "cb", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!mo", name = "fb", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!mo", name = "ib", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!mo", name = "Y", descriptor = "Ljk;")
    public static class450 field7772;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "Ldl;")
    private class46 field7756;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)V")
    public final void method42(byte arg0) {
        ++field7761;
        if (arg0 != 92) {
            this.method3145((class287) null, (class373) null, 122);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILza;BI)Z")
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        if (arg2 >= -64) {
            return true;
        } else {
            ++field7765;
            return false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method3139(int arg0) {
        field7767 = null;
        field7772 = null;
        if (arg0 != 23580) {
            method3139(110);
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(Z)V")
    public static final void method3140(boolean arg0) {
        ++field7771;
        for (int var1 = 0; class275.field3658 > var1; ++var1) {
            int var2 = class298.field3923[var1];
            class22 var3 = class339.field4484[var2];
            int var4 = class334.field4414.method2388((byte) -119);
            if (~(4 & var4) != -1) {
                var4 += class334.field4414.method2388((byte) -116) << 8;
            }
            if ((8192 & var4) != 0) {
                var3.field1239 = class334.field4414.method2428(1797);
                var3.field1185 = class334.field4414.method2418(124);
                var3.field1164 = class334.field4414.method2442((byte) 102);
                var3.field1167 = (byte) class334.field4414.method2388((byte) -112);
                var3.field1173 = class532.field7836 + class334.field4414.method2426((byte) 107);
                var3.field1238 = class532.field7836 - -class334.field4414.method2426((byte) 124);
            }
            if (~(1 & var4) != -1) {
                int var5 = class334.field4414.method2386(-23648);
                if (~var5 == -65536) {
                    var5 = -1;
                }
                int var6 = class334.field4414.method2388((byte) -121);
                class525.method3125(-57, var5, var3, var6);
            }
            if ((var4 & 2048) != 0) {
                int var7 = class334.field4414.method2392(arg0);
                var3.field1154 = class334.field4414.method2441(-25006);
                var3.field1177 = class334.field4414.method2441(-25006);
                var3.field1157 = ~(var7 & 32768) != -1;
                var3.field1165 = var7 & 32767;
                var3.field1241 = var3.field1165 + var3.field1154 + class532.field7836;
            }
            if ((var4 & 512) != 0) {
                int var8 = class334.field4414.method2392(false);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class334.field4414.method2412(-2131405832);
                int var10 = class334.field4414.method2414(true);
                var3.method538(var9, var8, var10, 101, true);
            }
            if ((var4 & 2) != 0) {
                int var11 = class334.field4414.method2443(20);
                int var12 = class334.field4414.method2388((byte) -121);
                var3.method540((byte) -103, var11, class532.field7836, var12);
                var3.field1246 = class532.field7836 + 300;
                var3.field1189 = class334.field4414.method2447(4339);
            }
            if ((128 & var4) != 0) {
                int var13 = class334.field4414.method2387((byte) 125);
                int var14 = class334.field4414.method2409(-4);
                if (~var13 == -65536) {
                    var13 = -1;
                }
                int var15 = class334.field4414.method2441(-25006);
                var3.method538(var14, var13, var15, 126, false);
            }
            if ((8 & var4) != 0) {
                int var16 = class334.field4414.method2443(120);
                int var17 = class334.field4414.method2447(4339);
                var3.method540((byte) -103, var16, class532.field7836, var17);
            }
            if ((var4 & 32) != 0) {
                var3.field1156 = class334.field4414.method2387((byte) 125);
                if (var3.field1156 == 65535) {
                    var3.field1156 = -1;
                }
            }
            if ((4096 & var4) != 0) {
                var3.field225 = class334.field4414.method2387((byte) 125);
                var3.field206 = class334.field4414.method2386(-23648);
            }
            if (~(var4 & 1024) != -1) {
                var3.field1215 = class334.field4414.method2418(-115);
                var3.field1209 = class334.field4414.method2404((byte) -97);
                var3.field1219 = class334.field4414.method2404((byte) -97);
                var3.field1222 = class334.field4414.method2404((byte) -97);
                var3.field1213 = class334.field4414.method2387((byte) 125) + class532.field7836;
                var3.field1163 = class334.field4414.method2426((byte) 98) + class532.field7836;
                var3.field1199 = class334.field4414.method2414(true);
                var3.field1257 = 0;
                var3.field1254 = 1;
                var3.field1222 += var3.field1251[0];
                var3.field1209 += var3.field1251[0];
                var3.field1215 += var3.field1249[0];
                var3.field1219 += var3.field1249[0];
            }
            if (~(var4 & 256) != -1) {
                int var18 = class334.field4414.method2441(-25006);
                int[] var19 = new int[var18];
                int[] var20 = new int[var18];
                int[] var21 = new int[var18];
                for (int var22 = 0; var22 < var18; ++var22) {
                    int var23 = class334.field4414.method2392(arg0);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    var19[var22] = var23;
                    var20[var22] = class334.field4414.method2388((byte) -113);
                    var21[var22] = class334.field4414.method2386(-23648);
                }
                class125.method758(var3, var21, var20, (byte) -120, var19);
            }
            if ((var4 & 64) != 0) {
                var3.field1151 = class334.field4414.method2432((byte) 125);
                var3.field1221 = 100;
            }
            if (~(16 & var4) != -1) {
                if (var3.field220.method1357(true)) {
                    class355.method2083((byte) 78, var3);
                }
                var3.method124(!arg0, class87.field1032.method1670((byte) -100, class334.field4414.method2426((byte) 120)));
                var3.method550((byte) 15, var3.field220.field2904);
                var3.field1200 = var3.field220.field2860 << 3;
                if (var3.field220.method1357(true)) {
                    class471.method2875(var3.field3695, 0, (byte) -84, var3.field1251[0], (class70) null, var3, var3.field1249[0], (class531) null);
                }
            }
        }
        if (arg0) {
            method3140(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(Z)V")
    public static final void method3141(boolean arg0) {
        if (arg0) {
            class186.field2421 = class95.field1140;
            class152.field1993 = class378.field5470;
        } else {
            class186.field2421 = class484.field7131;
            class152.field1993 = class14.field152;
        }
        class478.field7065 = class186.field2421.length;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(BLza;)Luc;")
    public final class23 method50(byte arg0, class287 arg1) {
        ++field7782;
        class373 var3 = this.method3144((~this.field7760 != -1 ? 5 : 0) | 2048, this.field7769, arg1, (byte) -63);
        if (var3 == null) {
            return null;
        } else {
            if (this.field7760 != 0) {
                var3.method2014(this.field7760 * 2048);
            }
            if (arg0 != -112) {
                this.field7757 = 113;
            }
            class124 var4 = arg1.method1183();
            var4.method743(super.field3704, super.field3700, super.field3694);
            if (this.field7756 != null) {
                class336 var5 = this.field7756.method257();
                arg1.method1203(var3, var5, var4, (class82) null, 0);
            } else {
                var3.method2051(var4, (class82) null, 0);
            }
            this.field7777 = var3.method2041();
            this.method3145(arg1, var3, 32733);
            return null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)I")
    public final int method132(int arg0) {
        ++field7758;
        return arg0 >= -103 ? 11 : this.field7777;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        ++field7755;
        if (arg0 != -62) {
            this.field7762 = 59;
        }
        return false;
    }

    @OriginalMember(owner = "client!mo", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field7756 != null) {
            this.field7756.method261();
        }
        ++field7776;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3142(byte arg0, String arg1) {
        ++field7773;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 <= 94) {
            field7772 = null;
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = arg1.charAt(var4);
            if (~var5 < -128) {
                if (~var5 < -2048) {
                    var3 += 3;
                } else {
                    var3 += 2;
                }
            } else {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
    public final void method3143(int arg0, int arg1) {
        ++field7754;
        if (!this.field7778) {
            this.field7757 += arg0;
            while (this.field7775.field3489[this.field7781] < this.field7757) {
                this.field7757 -= this.field7775.field3489[this.field7781];
                ++this.field7781;
                if (~this.field7775.field3474.length >= ~this.field7781) {
                    this.field7778 = true;
                    break;
                }
            }
            if (arg1 > 91) {
                if (!this.field7778) {
                    class276.method1678(this.field7775, super.field3695, super.field3704, (byte) 113, super.field3694, false, this.field7781);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(BLza;)V")
    public final void method36(byte arg0, class287 arg1) {
        ++field7779;
        if (arg0 > -120) {
            method3140(true);
        }
        class373 var3 = this.method3144(0, this.field7769, arg1, (byte) -94);
        if (var3 != null) {
            this.method3145(arg1, var3, 32733);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIZILot;Lza;)V")
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        ++field7763;
        int var8 = -105 / ((arg0 - 61) / 47);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILza;B)Le;")
    private final class373 method3144(int arg0, int arg1, class287 arg2, byte arg3) {
        ++field7764;
        if (arg3 >= -4) {
            method3139(-93);
        }
        class88 var5 = class71.field914.method1608((byte) 82, arg1);
        class38 var6 = class14.field152[super.field3695];
        class38 var7 = ~this.field7770 <= -4 ? null : class14.field152[this.field7770 + 1];
        return this.field7778 ? var5.method482((byte) 84, var6, -1, arg2, super.field3700, true, 0, arg0, class7.field97, var7, super.field3704, super.field3694, -1) : var5.method482((byte) 113, var6, this.field7774, arg2, super.field3700, true, this.field7757, arg0, class7.field97, var7, super.field3704, super.field3694, this.field7781);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lza;Le;I)V")
    private final void method3145(class287 arg0, class373 arg1, int arg2) {
        ++field7759;
        class142[] var4 = arg1.method2009();
        class127[] var5 = arg1.method2015();
        if ((this.field7756 == null || this.field7756.field477) && (var4 != null || var5 != null)) {
            this.field7756 = new class46(class532.field7836);
        }
        if (arg2 != 32733) {
            this.method132(-125);
        }
        if (this.field7756 != null) {
            this.field7756.method259(arg0, (long) class532.field7836, var4, var5, false);
            this.field7756.method253(super.field3695, super.field3698, super.field3697, super.field3688, super.field3691);
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7762 = arg1 + arg2;
        this.field7769 = arg0;
        this.field7770 = arg4;
        this.field7760 = arg12;
        class88 var14 = class71.field914.method1608((byte) 82, this.field7769);
        int var15 = var14.field1047;
        if (var15 == -1) {
            this.field7778 = true;
        } else {
            this.field7775 = class7.field97.method2951(var15, -13765);
            this.field7778 = false;
        }
        if (this.field7762 == arg2) {
            class276.method1678(this.field7775, super.field3695, super.field3704, (byte) 74, super.field3694, false, this.field7781);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
    public final void method3146(int arg0) {
        ++field7768;
        if (arg0 == -16470) {
            if (this.field7756 != null) {
                this.field7756.method261();
            }
        }
    }
}
