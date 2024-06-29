import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class542 extends class306 implements class394 {

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "Z")
    private boolean field7970;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "B")
    private byte field7960;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "S")
    private short field7972;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "Z")
    private boolean field7965;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "B")
    private byte field7978;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "Z")
    private boolean field7959;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "Lda;")
    private class397 field7974;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "Lha;")
    private class427 field7963;

    @OriginalMember(owner = "client!gk", name = "gb", descriptor = "Z")
    public static boolean field7984 = false;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!gk", name = "eb", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!gk", name = "fb", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!gk", name = "hb", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "Leh;")
    private class203 field7964;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "Z")
    public static boolean field7956;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)Z", line = 3)
    public final boolean method630(int arg0) {
        int var2 = 61 % ((-59 - arg0) / 44);
        ++field7957;
        return this.field7974 == null ? false : this.field7974.method449();
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(Z)V", line = 17)
    public static final void method3189(boolean arg0) {
        ++field7958;
        for (int var1 = 0; ~var1 > ~class550.field8070; ++var1) {
            int var2 = class694.field9858[var1];
            class88 var3 = ((class6) class314.field4359.method2818(-22803, (long) var2)).field49;
            int var4 = class376.field5209.method2705(-92);
            if (~(2 & var4) != -1) {
                var4 += class376.field5209.method2705(-64) << 8;
            }
            if ((1 & var4) != 0) {
                int[] var5 = new int[4];
                for (int var6 = 0; var6 < 4; ++var6) {
                    var5[var6] = class376.field5209.method2736(false);
                    if (~var5[var6] == -65536) {
                        var5[var6] = -1;
                    }
                }
                int var7 = class376.field5209.method2688(128);
                class458.method2661(var7, var5, var3, -1);
            }
            if ((var4 & 2048) != 0) {
                int var8 = class376.field5209.method2705(-127);
                int[] var9 = new int[var8];
                int[] var10 = new int[var8];
                for (int var11 = 0; var8 > var11; ++var11) {
                    int var12 = class376.field5209.method2711(-66);
                    if (~(var12 & 49152) == -49153) {
                        int var13 = class376.field5209.method2696(-1605640280);
                        var9[var11] = class460.method2676(var13, var12 << 16);
                    } else {
                        var9[var11] = var12;
                    }
                    var10[var11] = class376.field5209.method2755((byte) -111);
                }
                var3.method1102(var10, -1, var9);
            }
            if (~(16384 & var4) != -1) {
                int var14 = class376.field5209.method2688(128);
                int[] var15 = new int[var14];
                int[] var16 = new int[var14];
                int[] var17 = new int[var14];
                for (int var18 = 0; ~var18 > ~var14; ++var18) {
                    int var19 = class376.field5209.method2711(-97);
                    if (var19 == 65535) {
                        var19 = -1;
                    }
                    var15[var18] = var19;
                    var16[var18] = class376.field5209.method2706((byte) 97);
                    var17[var18] = class376.field5209.method2736(false);
                }
                class88.method652(-10861, var17, var3, var16, var15);
            }
            if (~(var4 & 1024) != -1) {
                int var20 = class376.field5209.method2711(-72);
                var3.field2406 = class376.field5209.method2705(-64);
                var3.field2370 = class376.field5209.method2688(128);
                var3.field2387 = var20 & 32767;
                var3.field2411 = (32768 & var20) != 0;
                var3.field2396 = class148.field2508 - (-var3.field2387 - var3.field2406);
            }
            if ((var4 & 8192) != 0) {
                int var21 = class376.field5209.method2720(-125);
                int var22 = class376.field5209.method2688(128);
                var3.method1101(class148.field2508, var22, 70, var21);
            }
            if (~(var4 & 128) != -1) {
                int var23 = class376.field5209.method2711(-114);
                int var24 = class376.field5209.method2694((byte) -76);
                if (~var23 == -65536) {
                    var23 = -1;
                }
                int var25 = class376.field5209.method2710((byte) 107);
                var3.method1105((byte) -80, var25, false, var24, var23);
            }
            if (~(var4 & 32) != -1) {
                var3.field2434 = class376.field5209.method2755((byte) -91);
                if (~var3.field2434 == -65536) {
                    var3.field2434 = -1;
                }
            }
            if ((var4 & 256) != 0) {
                var3.field2355 = class376.field5209.method2708((byte) -121);
                var3.field2446 = class376.field5209.method2708((byte) -121);
                var3.field2373 = class376.field5209.method2708((byte) -128);
                var3.field2379 = (byte) class376.field5209.method2706((byte) 97);
                var3.field2445 = class148.field2508 + class376.field5209.method2736(false);
                var3.field2383 = class148.field2508 + class376.field5209.method2755((byte) -49);
            }
            if ((var4 & 64) != 0) {
                var3.field1317 = class376.field5209.method2736(false);
                var3.field1313 = class376.field5209.method2736(false);
            }
            if ((8 & var4) != 0) {
                if (var3.field1309.method3113((byte) -82)) {
                    class295.method1808(var3, -24290);
                }
                var3.method661(true, class564.field8259.method3743(class376.field5209.method2696(-1605640280), true));
                var3.method1103(730377038, var3.field1309.field7726);
                var3.field2426 = var3.field1309.field7771 << 3;
                if (var3.field1309.method3113((byte) -88)) {
                    class531.method3125(var3, (class270) null, var3.field3158, 2, var3.field2459[0], var3.field2454[0], 0, (class119) null);
                }
            }
            if (~(4096 & var4) != -1) {
                var3.field2408 = class376.field5209.method2712(-91);
                var3.field2447 = class376.field5209.method2746((byte) 125);
                var3.field2394 = class376.field5209.method2709(128);
                var3.field2430 = class376.field5209.method2712(-108);
                var3.field2413 = class376.field5209.method2755((byte) -108) - -class148.field2508;
                var3.field2376 = class376.field5209.method2736(!arg0) + class148.field2508;
                var3.field2380 = class376.field5209.method2705(-63);
                var3.field2430 += var3.field2459[0];
                var3.field2408 += var3.field2454[0];
                var3.field2462 = 0;
                var3.field2452 = 1;
                var3.field2447 += var3.field2459[0];
                var3.field2394 += var3.field2454[0];
            }
            if (~(16 & var4) != -1) {
                int var26 = class376.field5209.method2720(-126);
                int var27 = class376.field5209.method2706((byte) 97);
                var3.method1101(class148.field2508, var27, 70, var26);
                var3.field2435 = class148.field2508 + 300;
                var3.field2449 = class376.field5209.method2706((byte) 97);
            }
            if (~(var4 & 512) != -1) {
                int var28 = class376.field5209.method2755((byte) -43);
                int var29 = class376.field5209.method2747((byte) -119);
                if (~var28 == -65536) {
                    var28 = -1;
                }
                int var30 = class376.field5209.method2706((byte) 97);
                var3.method1105((byte) -122, var30, true, var29, var28);
            }
            if ((4 & var4) != 0) {
                var3.field2350 = class376.field5209.method2717(arg0);
                var3.field2409 = 100;
            }
        }
        if (!arg0) {
            field7984 = true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I", line = 263)
    public final int method904(int arg0) {
        ++field7981;
        if (arg0 != -15140) {
            this.method902(1);
        }
        return this.field7960;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIZII)V", line = 279)
    public static final void method3190(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (class525.field7713.field5973 != 0 && arg4 != 0 && ~class222.field3314 > -51 && ~arg5 != 0) {
            class428.field6114[class222.field3314++] = new class105((byte) 1, arg5, arg4, arg2, arg1, 0, arg0, (class204) null);
        }
        ++field7973;
        if (!arg3) {
            field7968 = 104;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I", line = 297)
    public final int method903(int arg0) {
        if (arg0 <= 76) {
            return -51;
        } else {
            ++field7977;
            return this.field7972 & 65535;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lr;B)V", line = 309)
    public final void method911(class98 arg0, byte arg1) {
        ++field7982;
        Object var3 = null;
        class427 var5;
        if (this.field7963 == null && this.field7959) {
            class75 var4 = this.method3192(true, arg0, 262144, false);
            var5 = var4 == null ? null : var4.field1178;
        } else {
            var5 = this.field7963;
            this.field7963 = null;
        }
        if (var5 != null) {
            class123.method986(var5, super.field3163, super.field3155, super.field3154, (boolean[]) null);
        }
        if (arg1 != 31) {
            method3190(121, 16, 65, false, -120, 53);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILr;I)Lda;", line = 336)
    private final class397 method3191(int arg0, class98 arg1, int arg2) {
        ++field7975;
        if (this.field7974 != null && arg1.method754(this.field7974.method468(), arg2) == 0) {
            return this.field7974;
        } else {
            if (arg0 != -1) {
                this.method631(-118, (class98) null);
            }
            class75 var4 = this.method3192(false, arg1, arg2, false);
            return var4 != null ? var4.field1179 : null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 359)
    public final void method902(int arg0) {
        if (this.field7974 != null) {
            this.field7974.method444();
        }
        ++field7971;
        if (arg0 != 27906) {
            this.method3191(25, (class98) null, -5);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)Z", line = 375)
    public final boolean method908(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field7980;
            return this.field7959;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)I", line = 388)
    public final int method907(boolean arg0) {
        if (arg0) {
            this.method903(76);
        }
        ++field7962;
        return this.field7978;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)Z", line = 399)
    public final boolean method633(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field7969;
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILr;B)Z", line = 410)
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field7966;
        class397 var5 = this.method3191(-1, arg2, 131072);
        int var6 = 39 % ((arg3 - -75) / 40);
        if (var5 != null) {
            class152 var7 = arg2.method777();
            var7.method166(super.field3155, super.field3160, super.field3154);
            return !class372.field5162 ? var5.method469(arg0, arg1, var7, false) : var5.method482(arg0, arg1, var7, false, class450.field6494);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(ILr;)V", line = 434)
    public final void method625(int arg0, class98 arg1) {
        ++field7983;
        if (arg0 <= 67) {
            this.field7970 = true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lr;I)Lej;", line = 448)
    public final class690 method627(class98 arg0, int arg1) {
        ++field7955;
        if (this.field7974 == null) {
            return null;
        } else if (arg1 != -7927) {
            return null;
        } else {
            class152 var3 = arg0.method777();
            var3.method166(super.field3155 - -super.field4270, super.field3160, super.field3154 - -super.field4269);
            class690 var4 = null;
            if (this.field7970) {
                var4 = class101.method849(-76, 1);
            }
            if (!class372.field5162) {
                this.field7974.method460(var3, var4 != null ? var4.field9788[0] : null, 0);
            } else {
                this.field7974.method448(var3, var4 != null ? var4.field9788[0] : null, class450.field6494, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(ILr;)Leh;", line = 479)
    public final class203 method631(int arg0, class98 arg1) {
        if (this.field7964 == null) {
            this.field7964 = class420.method2486(super.field3155, super.field3160, super.field3154, this.method3191(-1, arg1, 0), 22672);
        }
        ++field7985;
        if (arg0 != 1) {
            this.method903(74);
        }
        return this.field7964;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZLr;IZ)Lfj;", line = 498)
    private final class75 method3192(boolean arg0, class98 arg1, int arg2, boolean arg3) {
        ++field7976;
        if (arg3) {
            this.field7974 = null;
        }
        class119 var5 = class14.field224.method2834(0, this.field7972 & 65535);
        class682 var6;
        class682 var7;
        if (!this.field7965) {
            if (super.field3163 < 3) {
                var6 = class621.field8841[super.field3163 + 1];
            } else {
                var6 = null;
            }
            var7 = class621.field8841[super.field3163];
        } else {
            var6 = class621.field8841[0];
            var7 = class340.field4723[super.field3163];
        }
        return var5.method960(-123, var6, super.field3160, this.field7960, arg1, this.field7978, super.field3155, var7, arg2, arg0, super.field3154);
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)I", line = 528)
    public final int method626(int arg0) {
        ++field7967;
        if (arg0 != -32768) {
            this.field7970 = true;
        }
        return this.field7974 != null ? this.field7974.method478() : 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILr;)V", line = 539)
    public final void method912(int arg0, class98 arg1) {
        ++field7979;
        Object var3 = null;
        if (arg0 == 20280) {
            class427 var5;
            if (this.field7963 == null && this.field7959) {
                class75 var4 = this.method3192(true, arg1, 262144, false);
                var5 = var4 == null ? null : var4.field1178;
            } else {
                var5 = this.field7963;
                this.field7963 = null;
            }
            if (var5 != null) {
                class68.method564(var5, super.field3163, super.field3155, super.field3154, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)I", line = 567)
    public final int method634(byte arg0) {
        ++field7961;
        if (arg0 >= -102) {
            this.method903(-73);
        }
        return this.field7974 != null ? this.field7974.method434() : 0;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lr;Lnf;IIIIIZIIII)V", line = 578)
    public class542(class98 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field7970 = ~arg1.field1903 != -1 && !arg7;
        this.field7960 = (byte) arg11;
        this.field7972 = (short) arg1.field1953;
        super.field3154 = arg6;
        this.field7965 = arg7;
        super.field3155 = arg4;
        this.field7978 = (byte) arg10;
        this.field7959 = arg0.method742() && arg1.field1964 && !this.field7965 && class525.field7713.method2484(class76.field1182, false) != 0;
        class75 var13 = this.method3192(this.field7959, arg0, 2048, false);
        if (var13 != null) {
            this.field7974 = var13.field1179;
            this.field7963 = var13.field1178;
        }
    }
}
