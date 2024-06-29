import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class337 extends class303 {

    @OriginalMember(owner = "client!ql", name = "kc", descriptor = "I")
    public int field5247 = -1;

    @OriginalMember(owner = "client!ql", name = "nc", descriptor = "I")
    public int field5250 = -1;

    @OriginalMember(owner = "client!ql", name = "oc", descriptor = "I")
    public int field5251 = -1;

    @OriginalMember(owner = "client!ql", name = "zc", descriptor = "I")
    public int field5262 = 0;

    @OriginalMember(owner = "client!ql", name = "wc", descriptor = "I")
    public int field5259 = 0;

    @OriginalMember(owner = "client!ql", name = "Dc", descriptor = "I")
    public int field5266 = 0;

    @OriginalMember(owner = "client!ql", name = "Gc", descriptor = "I")
    public int field5269 = -1;

    @OriginalMember(owner = "client!ql", name = "Ec", descriptor = "I")
    public int field5267 = 255;

    @OriginalMember(owner = "client!ql", name = "Cc", descriptor = "I")
    public int field5265 = 0;

    @OriginalMember(owner = "client!ql", name = "jc", descriptor = "I")
    public int field5246 = 0;

    @OriginalMember(owner = "client!ql", name = "Qc", descriptor = "B")
    private byte field5279 = 0;

    @OriginalMember(owner = "client!ql", name = "Hc", descriptor = "I")
    public int field5270 = -1;

    @OriginalMember(owner = "client!ql", name = "Ic", descriptor = "I")
    public int field5271 = -1;

    @OriginalMember(owner = "client!ql", name = "Lc", descriptor = "I")
    public int field5274 = -1;

    @OriginalMember(owner = "client!ql", name = "Jc", descriptor = "Z")
    public boolean field5272 = false;

    @OriginalMember(owner = "client!ql", name = "uc", descriptor = "Z")
    public static boolean field5257 = false;

    @OriginalMember(owner = "client!ql", name = "vc", descriptor = "I")
    public static int field5258 = -1;

    @OriginalMember(owner = "client!ql", name = "rc", descriptor = "Z")
    public static boolean field5254 = false;

    @OriginalMember(owner = "client!ql", name = "Pc", descriptor = "Ljava/lang/String;")
    public static String field5278 = null;

    @OriginalMember(owner = "client!ql", name = "Sc", descriptor = "I")
    public static int field5281 = 0;

    @OriginalMember(owner = "client!ql", name = "ic", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ql", name = "lc", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ql", name = "mc", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!ql", name = "pc", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ql", name = "qc", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ql", name = "sc", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ql", name = "tc", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ql", name = "xc", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ql", name = "yc", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ql", name = "Ac", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ql", name = "Fc", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ql", name = "Kc", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ql", name = "Mc", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ql", name = "Nc", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ql", name = "Rc", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!ql", name = "Tc", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ql", name = "Bc", descriptor = "Lmc;")
    public class55 field5264;

    @OriginalMember(owner = "client!ql", name = "Oc", descriptor = "Ljava/lang/String;")
    public String field5277;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)Z", line = 7)
    public final boolean method1546(byte arg0) {
        field5260++;
        if (this.field5264 == null) {
            return false;
        } else {
            if (arg0 != 96) {
                method2340(-113, 100, -52, -50, -106, -25);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(B)Ljava/lang/String;", line = 22)
    public final String method2335(byte arg0) {
        if (arg0 <= 93) {
            this.finalize();
        }
        String var2 = this.field5277;
        field5275++;
        if (class254.field4027 != null) {
            var2 = class254.field4027[this.field5279] + var2;
        }
        if (class2.field20 != null) {
            var2 = var2 + class2.field20[this.field5279];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)Ldc;", line = 46)
    public static final class1 method2336(int arg0, int arg1) {
        class1 var2 = (class1) class62.field913.method1351((long) arg0, 63);
        field5248++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field1770.method1813(arg0, 16, true);
        class1 var4 = new class1();
        if (var3 != null) {
            var4.method2(new class6(var3), (byte) 70);
        }
        class62.field913.method1347(var4, (long) arg0, (byte) -64);
        if (arg1 != -1) {
            field5278 = (String) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILvl;)V", line = 78)
    public final void method2337(int arg0, class6 arg1) {
        field5249++;
        arg1.field111 = 0;
        int var3 = arg1.method58(-288140008);
        int var4 = -1;
        boolean var5 = (var3 & 0x4) != 0;
        int[] var6 = new int[12];
        int var7 = super.method2099((byte) 123);
        int var8 = var3 & 0x1;
        this.method2098(((var3 & 0x3E) >> 3) + 1, (byte) 43);
        this.field5279 = (byte) (var3 >> 6 & 0x3);
        this.field4698 += (this.method2099((byte) 123) - var7) * 64;
        this.field4731 += (this.method2099((byte) 123) - var7) * 64;
        this.field5270 = arg1.method83((byte) -105);
        this.field5269 = arg1.method83((byte) -95);
        this.field5246 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method58(-288140008);
            if (var10 == 0) {
                var6[var9] = 0;
            } else {
                int var11 = arg1.method58(-288140008);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var4 = arg1.method39((byte) 65);
                    this.field5246 = arg1.method58(-288140008);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class146.field2305[var12 - 32768];
                    var6[var9] = class214.method1562(var13, 1073741824);
                    int var14 = class149.method1092((byte) -104, var13).field4984;
                    if (var14 != 0) {
                        this.field5246 = var14;
                    }
                } else {
                    var6[var9] = class214.method1562(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method58(-288140008);
            if (var17 < 0 || var17 >= class48.field626[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        if (arg0 < 83) {
            return;
        }
        this.field4684 = arg1.method39((byte) 94);
        long var18 = arg1.method37(-1513731168);
        this.field5277 = class154.method1118(115, var18);
        this.field5259 = arg1.method58(-288140008);
        if (var5) {
            this.field5265 = arg1.method39((byte) 56);
            this.field5247 = -1;
            this.field5266 = this.field5259;
        } else {
            this.field5265 = 0;
            this.field5266 = arg1.method58(-288140008);
            this.field5247 = arg1.method58(-288140008);
            if (this.field5247 == 255) {
                this.field5247 = -1;
            }
        }
        int var20 = this.field5262;
        this.field5262 = arg1.method58(-288140008);
        if (this.field5262 == 0) {
            class157.method1139(8, this);
        } else {
            int var21 = this.field5271;
            int var22 = this.field5250;
            int var23 = this.field5251;
            int var24 = this.field5274;
            int var25 = this.field5267;
            this.field5271 = arg1.method39((byte) 87);
            this.field5274 = arg1.method39((byte) 39);
            this.field5250 = arg1.method39((byte) 104);
            this.field5251 = arg1.method39((byte) 118);
            this.field5267 = arg1.method58(-288140008);
            if (this.field5262 != var20 || this.field5271 != var21 || this.field5274 != var24 || this.field5250 != var22 || this.field5251 != var23 || this.field5267 != var25) {
                class46.method358(-85, this);
            }
        }
        if (this.field5264 == null) {
            this.field5264 = new class55();
        }
        int var26 = this.field5264.field750;
        this.field5264.method432(var4, var15, (byte) -21, var6, var8 == 1, this.field4684);
        if (var4 != var26) {
            this.field4698 = this.field4708[0] * 128 + this.method2099((byte) 123) * 64;
            this.field4731 = this.field4675[0] * 128 + (this.method2099((byte) 123) * 64);
        }
        if (this.field4668 != null) {
            this.field4668.method1102();
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)I", line = 235)
    public final int method2099(byte arg0) {
        field5282++;
        if (arg0 != 123) {
            method2338(-95, -57);
        }
        return this.field5264 == null || this.field5264.field750 == -1 ? super.method2099((byte) 123) : class41.method339(70, this.field5264.field750).field2555;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIJILtk;)V", line = 253)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class151 arg10) {
        field5276++;
        if (this.field5264 == null) {
            return;
        }
        class281 var13 = this.field4653 != -1 && this.field4739 == 0 ? class295.method2064(0, this.field4653) : null;
        class281 var14 = this.field4724 == -1 || this.field5272 || this.field4724 == this.method2100(2000117776).field1451 && var13 != null ? null : class295.method2064(0, this.field4724);
        class89 var15 = this.field5264.method440(this.field4725, this.field4651, this.field4719, var13, this.field4723, true, var14, this.field4648, this.field4705, this.field4655, (byte) -115);
        int var16 = class311.method2159(84);
        if (class109.field1458 && class234.field3641 < 96 && var16 > 50) {
            class341.method2360(-27453);
        }
        if (class107.field1430 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class211.field3335) {
                class311.field4868[class211.field3335] = new byte[102400];
                class211.field3335++;
            }
            while (var17 < class211.field3335) {
                class211.field3335--;
                class311.field4868[class211.field3335] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field4656 = var15.method397();
        if (class95.field1259 && (this.field5264.field750 == -1 || class41.method339(28, this.field5264.field750).field2553)) {
            class89 var18 = class243.method1744(0, 240, this.field4731, arg0, this.field4686, 103, 1, var15, var14 == null ? var13 : var14, this.field4698, 160, this.field4747, 0, var14 == null ? this.field4648 : this.field4725);
            if (class109.field1458) {
                float var19 = class109.method781();
                float var20 = class109.method772();
                class109.method768();
                class109.method760(var19, var20 - 150.0F);
                var18.method410(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class151) null);
                class109.method776();
                class109.method760(var19, var20);
            } else {
                var18.method410(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class151) null);
            }
        }
        if (class146.field2310 == this) {
            for (int var21 = class287.field4436.length - 1; var21 >= 0; var21--) {
                class182 var22 = class287.field4436[var21];
                if (var22 != null && var22.field2961 != -1) {
                    if (var22.field2954 == 1 && var22.field2951 >= 0 && var22.field2951 < class59.field870.length) {
                        class212 var23 = class59.field870[var22.field2951];
                        if (var23 != null) {
                            int var24 = var23.field4731 / 32 - (class146.field2310.field4731 / 32);
                            int var25 = var23.field4698 / 32 - (class146.field2310.field4698 / 32);
                            this.method2341(arg6, var15, arg1, var24, (class151) null, arg7, arg2, arg5, arg3, arg4, 360000, arg9, var22.field2961, var25, (byte) 127, arg0);
                        }
                    }
                    if (var22.field2954 == 2) {
                        int var26 = (var22.field2953 - class326.field5108) * 4 + 2 - (class146.field2310.field4698 / 32);
                        int var27 = (var22.field2949 - class198.field3168) * 4 + 2 - (class146.field2310.field4731 / 32);
                        int var28 = var22.field2950 * 4;
                        int var29 = var28 * var28;
                        this.method2341(arg6, var15, arg1, var27, (class151) null, arg7, arg2, arg5, arg3, arg4, var29, arg9, var22.field2961, var26, (byte) 127, arg0);
                    }
                    if (var22.field2954 == 10 && var22.field2951 >= 0 && var22.field2951 < class284.field4403.length) {
                        class337 var30 = class284.field4403[var22.field2951];
                        if (var30 != null) {
                            int var31 = var30.field4731 / 32 - (class146.field2310.field4731 / 32);
                            int var32 = var30.field4698 / 32 - class146.field2310.field4698 / 32;
                            this.method2341(arg6, var15, arg1, var31, (class151) null, arg7, arg2, arg5, arg3, arg4, 360000, arg9, var22.field2961, var32, (byte) 127, arg0);
                        }
                    }
                }
            }
        }
        this.method2096(var15, -1);
        class89 var33 = null;
        this.method2092(-2, var15, arg0);
        if (!this.field5272 && this.field4703 != -1 && this.field4679 != -1) {
            class234 var34 = class9.method124(this.field4703, 1431655765);
            var33 = var34.method1683(19687, this.field4704, this.field4712, this.field4679);
            if (var33 != null) {
                var33.method407(0, -this.field4685, 0);
                if (var34.field3642) {
                    if (class287.field4429 != 0) {
                        var33.method391(class287.field4429);
                    }
                    if (class41.field565 != 0) {
                        var33.method386(class41.field565);
                    }
                    if (class57.field806 != 0) {
                        var33.method407(0, class57.field806, 0);
                    }
                }
            }
        }
        class89 var35 = null;
        if (!this.field5272 && this.field4666 != null) {
            if (class229.field3595 >= this.field4649) {
                this.field4666 = null;
            }
            if (class229.field3595 >= this.field4737 && this.field4649 > class229.field3595) {
                if ((this.field4666 instanceof class128)) {
                    var35 = (class89) ((class128) this.field4666).method942((byte) 64);
                } else {
                    var35 = (class89) this.field4666;
                }
                var35.method407(this.field4720 - this.field4698, this.field4742 - this.field4747, this.field4740 - this.field4731);
                if (this.field4674 == 512) {
                    var35.method412();
                } else if (this.field4674 == 1024) {
                    var35.method406();
                } else if (this.field4674 == 1536) {
                    var35.method419();
                }
            }
        }
        if (class109.field1458) {
            var15.field1204 = true;
            var15.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4668);
            if (var33 != null) {
                var33.field1204 = true;
                var33.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4668);
            }
        } else {
            if (var33 != null) {
                var15 = ((class53) var15).method400(var33);
            }
            if (var35 != null) {
                var15 = ((class53) var15).method400(var35);
            }
            var15.field1204 = true;
            var15.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4668);
        }
        if (var35 == null) {
            return;
        }
        if (this.field4674 == 512) {
            var35.method419();
        } else if (this.field4674 == 1024) {
            var35.method406();
        } else if (this.field4674 == 1536) {
            var35.method412();
        }
        var35.method407(this.field4698 - this.field4720, this.field4747 - this.field4742, this.field4731 - this.field4740);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)I", line = 506)
    public final int method1544(byte arg0) {
        field5261++;
        int var2 = 84 / ((arg0 - 42) / 56);
        return this.field4684;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()I", line = 541)
    public final int method397() {
        field5268++;
        return this.field4656;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(II)V", line = 550)
    public static final void method2338(int arg0, int arg1) {
        class34 var2 = class91.method656(arg0, -2, 7);
        field5256++;
        var2.method306(13);
        if (arg1 != 32) {
            field5258 = 22;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZZI)V", line = 585)
    public final void method2339(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (arg1) {
            super.method2102(arg3, this.method2099((byte) 123), arg0, (byte) -94, arg2);
            field5245++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIII)V", line = 596)
    public static final void method2340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 >= class291.field4490 && arg5 <= class210.field3309 && arg2 >= class42.field579 && arg4 <= class334.field5205) {
            class342.method2370(arg4, arg2, (byte) 99, arg1, arg5, arg3);
        } else {
            class192.method1417(arg5, (byte) -90, arg4, arg2, arg1, arg3);
        }
        field5263++;
        if (arg0 != -256) {
            method2343(-13);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjf;IILtk;IIIIIIIIIBI)V", line = 618)
    private final void method2341(int arg0, class89 arg1, int arg2, int arg3, class151 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, byte arg14, int arg15) {
        field5280++;
        int var17 = arg13 * arg13 + (arg3 * arg3);
        if (arg14 != 127) {
            this.method1544((byte) 92);
        }
        if (var17 < 16 || arg10 < var17) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg13, (double) arg3) * 325.949D) & 0x7FF;
        class89 var19 = class210.method1535(this.field4698, 0, this.field4747, arg12, var18, this.field4731, arg1);
        if (var19 == null) {
            return;
        }
        if (!class109.field1458) {
            var19.method410(0, arg2, arg6, arg8, arg9, arg7, arg0, arg5, -1L, arg11, arg4);
            return;
        }
        float var20 = class109.method781();
        float var21 = class109.method772();
        class109.method768();
        class109.method760(var20, var21 - 150.0F);
        var19.method410(0, arg2, arg6, arg8, arg9, arg7, arg0, arg5, -1L, arg11, arg4);
        class109.method776();
        class109.method760(var20, var21);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V", line = 660)
    public static final void method2342(int arg0) {
        field5253++;
        if (class146.field2310 != null && (class146.field2310.field4698 - ((class146.field2310.method2099((byte) 123) - 1) * 64) >> 7) == class121.field1751 && class146.field2310.field4731 + 64 - class146.field2310.method2099((byte) 123) * 64 >> 7 == class18.field292) {
            class121.field1751 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class235.field3675[var1][var2] = 0;
            }
        }
        int var3 = 0;
        int var4 = 21 / ((-arg0 - 79) / 32);
        while (class232.field3631 > var3) {
            class337 var5 = class284.field4403[class81.field1116[var3]];
            if (var5 != null) {
                var5.field4717 = false;
            }
            var3++;
        }
        for (int var6 = 0; var6 < class79.field1083; var6++) {
            class212 var7 = class59.field870[class85.field1157[var6]];
            if (var7 != null) {
                var7.field4717 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V", line = 728)
    public final void method595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5252++;
    }

    @OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V", line = 744)
    protected final void finalize() {
        field5255++;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V", line = 763)
    public static void method2343(int arg0) {
        if (arg0 != 0) {
            method2340(-107, -125, 124, 41, -45, 90);
        }
        field5278 = null;
    }
}
