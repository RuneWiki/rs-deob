import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class82 extends class38 {

    @OriginalMember(owner = "client!um", name = "hc", descriptor = "I")
    public int field1209 = -1;

    @OriginalMember(owner = "client!um", name = "vc", descriptor = "I")
    public int field1223 = 0;

    @OriginalMember(owner = "client!um", name = "sc", descriptor = "I")
    public int field1220 = 255;

    @OriginalMember(owner = "client!um", name = "lc", descriptor = "I")
    public int field1213 = -1;

    @OriginalMember(owner = "client!um", name = "Dc", descriptor = "I")
    public int field1231 = -1;

    @OriginalMember(owner = "client!um", name = "tc", descriptor = "Z")
    public boolean field1221 = false;

    @OriginalMember(owner = "client!um", name = "Jc", descriptor = "I")
    public int field1237 = 0;

    @OriginalMember(owner = "client!um", name = "Ac", descriptor = "I")
    public int field1228 = -1;

    @OriginalMember(owner = "client!um", name = "Mc", descriptor = "I")
    public int field1240 = -1;

    @OriginalMember(owner = "client!um", name = "uc", descriptor = "I")
    public int field1222 = 0;

    @OriginalMember(owner = "client!um", name = "jc", descriptor = "B")
    private byte field1211 = 0;

    @OriginalMember(owner = "client!um", name = "Ic", descriptor = "I")
    public int field1236 = 0;

    @OriginalMember(owner = "client!um", name = "Nc", descriptor = "I")
    public int field1241 = -1;

    @OriginalMember(owner = "client!um", name = "Pc", descriptor = "I")
    public int field1243 = -1;

    @OriginalMember(owner = "client!um", name = "Uc", descriptor = "I")
    public int field1248 = 0;

    @OriginalMember(owner = "client!um", name = "pc", descriptor = "Ljava/lang/String;")
    public static String field1217 = "Use";

    @OriginalMember(owner = "client!um", name = "wc", descriptor = "Ljava/lang/String;")
    public static String field1224 = "Choose Option";

    @OriginalMember(owner = "client!um", name = "yc", descriptor = "Z")
    public static boolean field1226 = true;

    @OriginalMember(owner = "client!um", name = "Fc", descriptor = "[I")
    public static int[] field1233 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!um", name = "Qc", descriptor = "Ljava/lang/String;")
    public static String field1244 = "Loading wordpack - ";

    @OriginalMember(owner = "client!um", name = "ic", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!um", name = "kc", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!um", name = "mc", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!um", name = "nc", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!um", name = "oc", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!um", name = "rc", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!um", name = "xc", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!um", name = "Cc", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!um", name = "Ec", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!um", name = "Gc", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!um", name = "Hc", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!um", name = "Kc", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!um", name = "Lc", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!um", name = "Oc", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!um", name = "Rc", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!um", name = "Sc", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!um", name = "Tc", descriptor = "Lpk;")
    public class172 field1247;

    @OriginalMember(owner = "client!um", name = "zc", descriptor = "Lwf;")
    public static class306 field1227;

    @OriginalMember(owner = "client!um", name = "qc", descriptor = "Ljava/lang/String;")
    public String field1218;

    @OriginalMember(owner = "client!um", name = "Bc", descriptor = "Ljava/lang/String;")
    public static String field1229;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(III)Z", line = 6)
    public static final boolean method561(int arg0, int arg1, int arg2) {
        if (arg2 >= -67) {
            method561(-123, -98, -103);
        }
        class17 var3 = class277.method1819((byte) 126, arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        field1234++;
        return var3.method132(-29762, arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)I", line = 40)
    public final int method271(byte arg0) {
        field1238++;
        if (arg0 <= 41) {
            this.field1243 = -40;
        }
        return this.field1247 == null || this.field1247.field2612 == -1 ? super.method271((byte) 101) : class71.method511(this.field1247.field2612, 10).field4609;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIIIILg;IIILcj;I)V", line = 55)
    private final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class295 arg10, int arg11, int arg12, int arg13, class243 arg14, int arg15) {
        field1230++;
        int var17 = arg0 * arg0 + arg1 * arg1;
        if (var17 < 16 || var17 > arg4) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg1, (double) arg0) * 325.949D) & 0x7FF;
        class295 var19 = class334.method2326(arg11, var18, this.field493, this.field537, arg10, (byte) -88, this.field519);
        if (arg15 != 0 || var19 == null) {
            return;
        }
        if (!class333.field5166) {
            var19.method111(0, arg6, arg13, arg12, arg8, arg5, arg9, arg3, -1L, arg7, arg14);
            return;
        }
        float var20 = class333.method2286();
        float var21 = class333.method2294();
        class333.method2290();
        class333.method2321(var20, var21 - 150.0F);
        var19.method111(0, arg6, arg13, arg12, arg8, arg5, arg9, arg3, -1L, arg7, arg14);
        class333.method2301();
        class333.method2321(var20, var21);
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V", line = 97)
    public static void method563(int arg0) {
        field1233 = null;
        if (arg0 != -20062) {
            field1217 = (String) null;
        }
        field1224 = null;
        field1229 = null;
        field1227 = null;
        field1217 = null;
        field1244 = null;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(III)Lqm;", line = 118)
    public static final class152 method564(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2650;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)I", line = 126)
    public final int method282(int arg0) {
        if (arg0 != -580) {
            this.field1222 = 41;
        }
        field1232++;
        return this.field522;
    }

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(I)Ljava/lang/String;", line = 137)
    public final String method565(int arg0) {
        if (arg0 != 18548) {
            this.field1248 = -4;
        }
        field1210++;
        String var2 = this.field1218;
        if (class132.field2086 != null) {
            var2 = class132.field2086[this.field1211] + var2;
        }
        if (class27.field343 != null) {
            var2 = var2 + class27.field343[this.field1211];
        }
        return var2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIIJILcj;)V", line = 160)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10) {
        field1215++;
        if (this.field1247 == null) {
            return;
        }
        class222 var13 = this.field507 != -1 && this.field558 == 0 ? class118.method809((byte) 83, this.field507) : null;
        class222 var14 = this.field474 == -1 || this.field1221 || this.field474 == this.method280(-110).field4876 && var13 != null ? null : class118.method809((byte) 94, this.field474);
        class295 var15 = this.field1247.method1163(this.field462, this.field557, this.field495, (byte) -92, var13, var14, this.field546, this.field465, this.field523, this.field492, true);
        int var16 = class29.method224(-116);
        if (class333.field5166 && class109.field1676 < 96 && var16 > 50) {
            class294.method1928(30392);
        }
        if (class165.field2534 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class222.field3548) {
                class117.field1814[class222.field3548] = new byte[102400];
                class222.field3548++;
            }
            while (var17 < class222.field3548) {
                class222.field3548--;
                class117.field1814[class222.field3548] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field515 = var15.method112();
        if (class155.field2434 && (this.field1247.field2612 == -1 || class71.method511(this.field1247.field2612, 10).field4584)) {
            class295 var18 = class7.method40(this.field519, 160, 240, 0, this.field537, 1, 21881, 0, var15, var14 == null ? var13 : var14, this.field493, var14 == null ? this.field557 : this.field492, arg0, this.field542);
            if (class333.field5166) {
                float var19 = class333.method2286();
                float var20 = class333.method2294();
                class333.method2290();
                class333.method2321(var19, var20 - 150.0F);
                var18.method111(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class243) null);
                class333.method2301();
                class333.method2321(var19, var20);
            } else {
                var18.method111(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class243) null);
            }
        }
        if (class79.field1173 == this) {
            for (int var21 = class81.field1204.length - 1; var21 >= 0; var21--) {
                class68 var22 = class81.field1204[var21];
                if (var22 != null && var22.field1024 != -1) {
                    if (var22.field1013 == 1 && var22.field1022 >= 0 && class208.field3313.length > var22.field1022) {
                        class80 var23 = class208.field3313[var22.field1022];
                        if (var23 != null) {
                            int var24 = var23.field537 / 32 - class79.field1173.field537 / 32;
                            int var25 = var23.field519 / 32 - (class79.field1173.field519 / 32);
                            this.method562(var25, var24, arg0, arg7, 360000, arg5, arg1, arg9, arg4, arg6, var15, var22.field1024, arg3, arg2, (class243) null, 0);
                        }
                    }
                    if (var22.field1013 == 2) {
                        int var26 = (var22.field1007 - class30.field374) * 4 + 2 - (class79.field1173.field537 / 32);
                        int var27 = var22.field1025 * 4;
                        int var28 = (var22.field1008 - class294.field4535) * 4 + 2 - (class79.field1173.field519 / 32);
                        int var29 = var27 * var27;
                        this.method562(var28, var26, arg0, arg7, var29, arg5, arg1, arg9, arg4, arg6, var15, var22.field1024, arg3, arg2, (class243) null, 0);
                    }
                    if (var22.field1013 == 10 && var22.field1022 >= 0 && var22.field1022 < class64.field966.length) {
                        class82 var30 = class64.field966[var22.field1022];
                        if (var30 != null) {
                            int var31 = var30.field519 / 32 - (class79.field1173.field519 / 32);
                            int var32 = var30.field537 / 32 - (class79.field1173.field537 / 32);
                            this.method562(var31, var32, arg0, arg7, 360000, arg5, arg1, arg9, arg4, arg6, var15, var22.field1024, arg3, arg2, (class243) null, 0);
                        }
                    }
                }
            }
        }
        this.method283((byte) -65, var15);
        this.method267(arg0, var15, -53);
        class295 var33 = null;
        if (!this.field1221 && this.field530 != -1 && this.field534 != -1) {
            class148 var34 = class63.method428(false, this.field530);
            var33 = var34.method1047(-112, this.field506, this.field496, this.field534);
            if (var33 != null) {
                var33.method983(0, -this.field501, 0);
                if (var34.field2345) {
                    if (class199.field2988 != 0) {
                        var33.method956(class199.field2988);
                    }
                    if (class52.field744 != 0) {
                        var33.method988(class52.field744);
                    }
                    if (class78.field1163 != 0) {
                        var33.method983(0, class78.field1163, 0);
                    }
                }
            }
        }
        class295 var35 = null;
        if (!this.field1221 && this.field463 != null) {
            if (this.field532 <= class343.field5341) {
                this.field463 = null;
            }
            if (this.field514 <= class343.field5341 && this.field532 > class343.field5341) {
                if (this.field463 instanceof class218) {
                    var35 = (class295) ((class218) this.field463).method1463((byte) -94);
                } else {
                    var35 = (class295) this.field463;
                }
                var35.method983(this.field484 - this.field537, -this.field493 + this.field547, this.field516 - this.field519);
                if (this.field520 == 512) {
                    var35.method955();
                } else if (this.field520 == 1024) {
                    var35.method982();
                } else if (this.field520 == 1536) {
                    var35.method961();
                }
            }
        }
        if (class333.field5166) {
            var15.field4545 = true;
            var15.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field521);
            if (var33 != null) {
                var33.field4545 = true;
                var33.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field521);
            }
        } else {
            if (var33 != null) {
                var15 = ((class141) var15).method978(var33);
            }
            if (var35 != null) {
                var15 = ((class141) var15).method978(var35);
            }
            var15.field4545 = true;
            var15.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field521);
        }
        if (var35 == null) {
            return;
        }
        if (this.field520 == 512) {
            var35.method961();
        } else if (this.field520 == 1024) {
            var35.method982();
        } else if (this.field520 == 1536) {
            var35.method955();
        }
        var35.method983(this.field537 - this.field484, -this.field547 + this.field493, this.field519 - this.field516);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lgn;I)V", line = 411)
    public final void method566(class303 arg0, int arg1) {
        field1235++;
        arg0.field4679 = 0;
        int[] var3 = new int[12];
        int var4 = -1;
        int var5 = arg0.method2043((byte) -116);
        int var6 = var5 & 0x1;
        int var7 = super.method271((byte) 117);
        this.method279(((var5 & 0x3C) >> 3) + 1, 17);
        this.field1211 = (byte) ((var5 & 0xF8) >> 6);
        this.field537 += (this.method271((byte) 116) - var7) * 64;
        boolean var8 = (var5 & 0x4) != 0;
        this.field519 += (this.method271((byte) 116) - var7) * 64;
        this.field1228 = arg0.method2001(-3);
        this.field1243 = arg0.method2001(-3);
        this.field1223 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method2043((byte) -106);
            if (var10 == 0) {
                var3[var9] = 0;
            } else {
                int var11 = arg0.method2043((byte) -126);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var4 = arg0.method1994(false);
                    this.field1223 = arg0.method2043((byte) -116);
                    break;
                }
                if (var12 < 32768) {
                    var3[var9] = class276.method1810(Integer.MIN_VALUE, var12 - 256);
                } else {
                    int var13 = class92.field1421[var12 - 32768];
                    var3[var9] = class276.method1810(1073741824, var13);
                    int var14 = class160.method1106(var13, -75).field4451;
                    if (var14 != 0) {
                        this.field1223 = var14;
                    }
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method2043((byte) -111);
            if (var17 < 0 || class84.field1282[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field522 = arg0.method1994(false);
        long var18 = arg0.method2047((byte) -84);
        this.field1218 = class305.method2073(false, var18);
        this.field1236 = arg0.method2043((byte) -108);
        if (var8) {
            this.field1237 = arg0.method1994(false);
            this.field1213 = -1;
            this.field1222 = this.field1236;
        } else {
            this.field1237 = 0;
            this.field1222 = arg0.method2043((byte) -110);
            this.field1213 = arg0.method2043((byte) -123);
            if (this.field1213 == 255) {
                this.field1213 = -1;
            }
        }
        int var20 = this.field1248;
        this.field1248 = arg0.method2043((byte) -128);
        if (~this.field1248 == arg1) {
            class262.method1741(-106, this);
        } else {
            int var21 = this.field1240;
            int var22 = this.field1241;
            int var23 = this.field1220;
            int var24 = this.field1209;
            int var25 = this.field1231;
            this.field1240 = arg0.method1994(false);
            this.field1231 = arg0.method1994(false);
            this.field1241 = arg0.method1994(false);
            this.field1209 = arg0.method1994(false);
            this.field1220 = arg0.method2043((byte) -120);
            if (this.field1248 != var20 || this.field1240 != var21 || this.field1231 != var25 || this.field1241 != var22 || this.field1209 != var24 || this.field1220 != var23) {
                client.method885(-9490, this);
            }
        }
        if (this.field1247 == null) {
            this.field1247 = new class172();
        }
        int var26 = this.field1247.field2612;
        this.field1247.method1165(arg1 + 90, var4, this.field522, var3, var6 == 1, var15);
        if (var4 != var26) {
            this.field537 = this.field476[0] * 128 + (this.method271((byte) 110) * 64);
            this.field519 = this.field505[0] * 128 + (this.method271((byte) 120) * 64);
        }
        if (this.field521 != null) {
            this.field521.method1655();
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIII)V", line = 566)
    public final void method567(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -25545) {
            this.method111(118, 102, 39, 120, 0, 117, 117, 55, -40L, 36, (class243) null);
        }
        field1245++;
        super.method269(arg0, arg3, -128, arg2, this.method271((byte) 102));
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()I", line = 577)
    public final int method112() {
        field1246++;
        return this.field515;
    }

    @OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V", line = 589)
    protected final void finalize() {
        field1239++;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(II)Ljava/lang/String;", line = 598)
    public static final String method568(int arg0, int arg1) {
        field1216++;
        return arg1 > arg0 ? Integer.toString(arg0) : "*";
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Z", line = 610)
    public final boolean method281(int arg0) {
        field1242++;
        if (arg0 != 0) {
            method568(69, 96);
        }
        return this.field1247 != null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V", line = 632)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1214++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 645)
    public static final void method569(boolean arg0, String arg1) {
        field1225++;
        int var2 = class339.method2347(arg1, (byte) -50);
        if (var2 == -1) {
            return;
        }
        if (!arg0) {
            field1229 = (String) null;
        }
        int[] var3 = class205.field3110.method1352((byte) 88, (class23.field293.field1874[var2] & 0xFFFD121) >> 14, class23.field293.field1874[var2] >> 28 & 0x3, class23.field293.field1874[var2] & 0x3FFF);
        class310.method2126(var3[2], (byte) -128, var3[1]);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V", line = 701)
    public static final void method570(byte arg0) {
        field1212++;
        class115.field1790.method1298((byte) 110);
        if (arg0 != -122) {
            field1227 = (class306) null;
        }
    }
}
