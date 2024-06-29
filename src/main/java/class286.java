import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class286 {

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public int field4454 = -1;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "Ljp;")
    public static class55 field4464 = new class55(25, 10);

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
    public static int field4470 = 0;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    private int field4460;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "J")
    private long field4456;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "J")
    private long field4462;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Z")
    public boolean field4450;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "[I")
    public int[] field4452;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "[I")
    private int[] field4463;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "[I")
    public static int[] field4465;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "[[I")
    private int[][] field4459;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static final void method1919(int arg0) {
        field4458++;
        if (arg0 == 0) {
            class282.field4404.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    private final void method1920(int arg0) {
        field4455++;
        long[] var2 = class472.field6936;
        this.field4456 = -1L;
        this.field4456 = var2[(int) ((this.field4456 ^ (long) (this.field4460 >> 8)) & 0xFFL)] ^ this.field4456 >>> 8;
        this.field4456 = this.field4456 >>> 8 ^ var2[(int) ((this.field4456 ^ (long) this.field4460) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4456 = var2[(int) (((long) (this.field4463[var3] >> 24) ^ this.field4456) & 0xFFL)] ^ this.field4456 >>> 8;
            this.field4456 = var2[(int) (((long) (this.field4463[var3] >> 16) ^ this.field4456) & 0xFFL)] ^ this.field4456 >>> 8;
            this.field4456 = this.field4456 >>> 8 ^ var2[(int) (((long) (this.field4463[var3] >> 8) ^ this.field4456) & 0xFFL)];
            this.field4456 = var2[(int) (((long) this.field4463[var3] ^ this.field4456) & 0xFFL)] ^ this.field4456 >>> 8;
        }
        if (arg0 < 59) {
            method1921((byte) -116);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field4456 = this.field4456 >>> 8 ^ var2[(int) (((long) this.field4452[var4] ^ this.field4456) & 0xFFL)];
        }
        this.field4456 = var2[(int) ((this.field4456 ^ (long) (this.field4450 ? 1 : 0)) & 0xFFL)] ^ this.field4456 >>> 8;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method1921(byte arg0) {
        if (arg0 != -35) {
            method1919(73);
        }
        field4464 = null;
        field4465 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZZ)V")
    public final void method1922(boolean arg0, boolean arg1) {
        this.field4450 = arg1;
        field4449++;
        if (!arg0) {
            this.method1928(null, 36, 110, 32, null, true);
        }
        this.method1920(114);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lsb;IIILza;ILiv;IIIILkt;)Le;")
    public final class289 method1923(class222 arg0, int arg1, int arg2, int arg3, class299 arg4, int arg5, class292 arg6, int arg7, int arg8, int arg9, int arg10, class61 arg11) {
        field4467++;
        int var13 = arg3;
        if (arg11 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg11.field976[arg5];
            var13 = arg3 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class313 var25 = arg0.method1542(0, var23);
            if (var25 != null) {
                var15 |= var25.method2077(var24, (byte) -78);
                var14 |= var25.method2075(var24, -110);
                var17 |= var25.method2074(255, var24);
                var16 |= arg11.field948;
            }
            if ((arg11.field968 || class29.field324) && arg8 != -1 && arg11.field976.length > arg8) {
                int var26 = arg11.field976[arg8];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class313 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg0.method1542(0, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method2077(var28, (byte) 104);
                    var14 |= var29.method2075(var28, -105);
                    var17 |= var29.method2074(255, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg2 < 34) {
            return null;
        }
        long var30 = (long) arg1 << 32 | (long) (arg9 << 16) | (long) arg10;
        class242 var32 = class162.field2439;
        class289 var33;
        synchronized (class162.field2439) {
            var33 = (class289) class162.field2439.method1634(var30, 64);
        }
        if (var33 == null || arg4.method589(var33.method679(), var13) != 0) {
            if (var33 != null) {
                var13 = arg4.method557(var13, var33.method679());
            }
            class153[] var35 = new class153[3];
            int var36 = 0;
            if (!arg6.method1953(16249, arg10).method2450(0) || !arg6.method1953(16249, arg9).method2450(0) || !arg6.method1953(16249, arg1).method2450(0)) {
                return null;
            }
            class153 var37 = arg6.method1953(16249, arg10).method2449((byte) -59);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class153 var38 = arg6.method1953(16249, arg9).method2449((byte) -72);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class153 var39 = arg6.method1953(16249, arg1).method2449((byte) -94);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class153 var41 = new class153(var35, var36);
            var33 = arg4.method554(var41, var40, class414.field6095, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class61.field960[var42].length > this.field4452[var42]) {
                    var33.method632(class43.field683[var42], class61.field960[var42][this.field4452[var42]]);
                }
                if (class306.field4689[var42].length > this.field4452[var42]) {
                    var33.method632(class115.field1769[var42], class306.field4689[var42][this.field4452[var42]]);
                }
            }
            var33.method662(var13);
            class242 var43 = class162.field2439;
            synchronized (class162.field2439) {
                class162.field2439.method1623(var30, 17621, var33);
            }
        }
        if (arg11 == null) {
            return var33;
        } else {
            class289 var44 = var33.method669((byte) 4, var13, true);
            return arg11.method403(var44, (byte) 59, arg3, arg8, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
    public final void method1924(int arg0, int arg1, int arg2) {
        this.field4452[arg0] = arg2;
        field4469++;
        this.method1920(arg1 + 108);
        if (arg1 != 8) {
            this.method1924(107, 123, 19);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lza;Lfi;IIB)V")
    public static final void method1925(class299 arg0, class38 arg1, int arg2, int arg3, byte arg4) {
        field4453++;
        class340 var5 = arg1.method260(91, arg0);
        if (var5 == null) {
            return;
        }
        arg0.method571(arg2, arg3, arg1.field629 + arg2, arg3 - -arg1.field591);
        if (class378.field5573 == 2 || class378.field5573 == 5 || class361.field5323 == null) {
            arg0.method604(-16777216, var5, arg2, arg3);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class33.field401 == 4) {
                var6 = (int) (-class434.field6466) & 0x3FFF;
                var7 = class447.field6641;
                var9 = class2.field28;
                var8 = 4096;
            } else {
                var6 = (int) (-class434.field6466) + class484.field7096 & 0x3FFF;
                var7 = class116.field1781.field1279;
                var8 = 4096 - (class195.field3064 * 16);
                var9 = class116.field1781.field1275;
            }
            int var10 = (var9 / 32) + 48 - ((class338.field5076 - 104) * 2);
            int var11 = class250.field4077 * 4 + 208 + 48 - (class250.field4077 * 2) - (var7 / 32);
            class361.field5323.method2323((float) arg1.field629 / 2.0F + (float) arg2, (float) arg1.field591 / 2.0F + (float) arg3, (float) var10, (float) var11, var8, var6 << 2, var5, arg2, arg3);
            for (class50 var12 = (class50) class215.field3255.method295((byte) 115); var12 != null; var12 = (class50) class215.field3255.method296(true)) {
                int var58 = var12.field771;
                int var59 = ((class293.field4530.field74[var58] & 0xFFFDB2C) >> 14) - class422.field6201;
                int var60 = (class293.field4530.field74[var58] & 0x3FFF) - class23.field273;
                int var61 = var59 * 4 + 2 - (var9 / 32);
                int var62 = var60 * 4 + 2 - (var7 / 32);
                class451.method2767(class293.field4530.field81[var58], var61, arg2, arg3, arg0, arg1, false, var62, var5);
            }
            for (int var13 = 0; var13 < class387.field5690; var13++) {
                int var55 = class192.field2953[var13] * 4 + 2 - (var9 / 32);
                int var56 = class38.field624[var13] * 4 + 2 - (var7 / 32);
                class395 var57 = class247.field3693.method2281(class284.field4429[var13], -9380);
                if (var57.field5825 != null) {
                    var57 = var57.method2485(class288.field4476, 117);
                    if (var57 == null || var57.field5774 == -1) {
                        continue;
                    }
                }
                class451.method2767(var57.field5774, var55, arg2, arg3, arg0, arg1, false, var56, var5);
            }
            for (class192 var14 = (class192) class249.field3827.method359(true); var14 != null; var14 = (class192) class249.field3827.method365(arg4 ^ 0xFFFFFFC6)) {
                int var50 = (int) (var14.field1932 >> 28 & 0x3L);
                if (class1.field4 == var50) {
                    int var51 = (int) (var14.field1932 & 0x3FFFL) - class422.field6201;
                    int var52 = (int) (var14.field1932 >> 14 & 0x3FFFL) - class23.field273;
                    int var53 = var51 * 4 + 2 - (var9 / 32);
                    int var54 = var52 * 4 + 2 - (var7 / 32);
                    class408.method2574(var5, var53, -32068, arg3, class483.field7076[0], arg2, arg1, var54);
                }
            }
            for (int var15 = 0; var15 < class231.field3482; var15++) {
                class5 var45 = (class5) class366.field5398.method358((byte) 9, (long) class234.field3513[var15]);
                if (var45 != null) {
                    class46 var46 = var45.field65;
                    if (var46.method311(false) && class116.field1781.field1274 == var46.field1274) {
                        class171 var47 = var46.field718;
                        if (var47 != null && var47.field2611 != null) {
                            var47 = var47.method1221(class288.field4476, 0);
                        }
                        if (var47 != null && var47.field2578 && var47.field2612) {
                            int var48 = var46.field1275 / 32 - (var9 / 32);
                            int var49 = var46.field1279 / 32 - (var7 / 32);
                            if (var47.field2641 == -1) {
                                class408.method2574(var5, var48, -32068, arg3, class483.field7076[1], arg2, arg1, var49);
                            } else {
                                class451.method2767(var47.field2641, var48, arg2, arg3, arg0, arg1, false, var49, var5);
                            }
                        }
                    }
                }
            }
            int var16 = class422.field6205;
            int[] var17 = class506.field7363;
            for (int var18 = 0; var18 < var16; var18++) {
                class511 var37 = class530.field7747[var17[var18]];
                if (var37 != null && var37.method3047(false) && class116.field1781 != var37 && class116.field1781.field1274 == var37.field1274) {
                    int var38 = var37.field1275 / 32 - (var9 / 32);
                    int var39 = var37.field1279 / 32 - (var7 / 32);
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class6.field80; var41++) {
                        if (var37.field7437.equals(class265.field4229[var41]) && class23.field269[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class94.field1505; var43++) {
                        if (var37.field7437.equals(class433.field6436[var43].field4103)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class116.field1781.field7458 != 0 && var37.field7458 != 0 && class116.field1781.field7458 == var37.field7458) {
                        var44 = true;
                    }
                    if (var37.field7448) {
                        class408.method2574(var5, var38, arg4 - 32191, arg3, class483.field7076[6], arg2, arg1, var39);
                    } else if (var40) {
                        class408.method2574(var5, var38, -32068, arg3, class483.field7076[3], arg2, arg1, var39);
                    } else if (var42) {
                        class408.method2574(var5, var38, -32068, arg3, class483.field7076[5], arg2, arg1, var39);
                    } else if (var44) {
                        class408.method2574(var5, var38, arg4 ^ 0xFFFF82C7, arg3, class483.field7076[4], arg2, arg1, var39);
                    } else {
                        class408.method2574(var5, var38, arg4 ^ 0xFFFF82C7, arg3, class483.field7076[2], arg2, arg1, var39);
                    }
                }
            }
            class417[] var19 = class292.field4519;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class417 var23 = var19[var20];
                if (var23 != null && var23.field6122 != 0 && (class446.field6625 % 20) < 10) {
                    if (var23.field6122 == 1) {
                        class5 var24 = (class5) class366.field5398.method358((byte) -118, (long) var23.field6121);
                        if (var24 != null) {
                            class46 var25 = var24.field65;
                            int var26 = var25.field1275 / 32 - (var9 / 32);
                            int var27 = var25.field1279 / 32 - (var7 / 32);
                            class228.method1553(var26, var23.field6128, var27, 360000L, arg3, 7270, var5, arg1, arg2);
                        }
                    }
                    if (var23.field6122 == 2) {
                        int var28 = var23.field6126 / 32 - (var9 / 32);
                        int var29 = var23.field6129 / 32 - var7 / 32;
                        long var30 = (long) (var23.field6123 << 5);
                        long var32 = var30 * var30;
                        class228.method1553(var28, var23.field6128, var29, var32, arg3, 7270, var5, arg1, arg2);
                    }
                    if (var23.field6122 == 10 && var23.field6121 >= 0 && var23.field6121 < class530.field7747.length) {
                        class511 var34 = class530.field7747[var23.field6121];
                        if (var34 != null) {
                            int var35 = var34.field1275 / 32 - (var9 / 32);
                            int var36 = var34.field1279 / 32 - (var7 / 32);
                            class228.method1553(var35, var23.field6128, var36, 360000L, arg3, arg4 ^ 0x1C1D, var5, arg1, arg2);
                        }
                    }
                }
            }
            if (class33.field401 != 4) {
                if (class521.field7646 != 0) {
                    int var21 = class521.field7646 * 4 + (class116.field1781.method3045(0) * 2) - (var9 / 32);
                    int var22 = class488.field7136 * 4 + (((class116.field1781.method3045(0) + -1) * 2) + 2 - var7 / 32);
                    class408.method2574(var5, var21, -32068, arg3, class36.field444[class339.field5081 ? 1 : 0], arg2, arg1, var22);
                }
                arg0.method1991(arg1.field591 / 2 + arg3 - 1, -1, 3, 3, 55, arg1.field629 / 2 + arg2 - 1);
            }
        }
        if (arg4 != 123) {
            field4465 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Liv;Lkt;IILza;ILsb;ILmc;Lep;ILoi;)Le;")
    public final class289 method1926(class292 arg0, class61 arg1, int arg2, int arg3, class299 arg4, int arg5, class222 arg6, int arg7, class318 arg8, class314 arg9, int arg10, class172 arg11) {
        field4451++;
        if (this.field4454 != -1) {
            return arg11.method1229(-21382, this.field4454).method1227(arg5, 104, arg6, arg1, arg8, arg4, arg3, arg7, arg10);
        }
        int var13 = arg7;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg1.field976[arg5];
            Object var22 = null;
            var13 = arg7 | 0x20;
            int var23 = var21 >>> 16;
            class313 var24 = arg6.method1542(0, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2077(var25, (byte) 107);
                var14 |= var24.method2075(var25, -109);
                var17 |= var24.method2074(255, var25);
                var16 |= arg1.field948;
            }
            if ((arg1.field968 || class29.field324) && arg10 != -1 && arg10 < arg1.field976.length) {
                int var26 = arg1.field976[arg10];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class313 var29 = var23 == var27 ? var24 : arg6.method1542(0, var27);
                if (var29 != null) {
                    var15 |= var29.method2077(var28, (byte) -114);
                    var14 |= var29.method2075(var28, -109);
                    var17 |= var29.method2074(255, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg2 != -1776845713) {
            return null;
        }
        class242 var30 = class162.field2439;
        class289 var31;
        synchronized (class162.field2439) {
            var31 = (class289) class162.field2439.method1634(this.field4456, arg2 ^ 0x96177C2F);
        }
        if (var31 == null || arg4.method589(var31.method679(), var13) != 0) {
            if (var31 != null) {
                var13 = arg4.method557(var13, var31.method679());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field4463[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg0.method1953(arg2 ^ 0x96174316, var35 & 0x3FFFFFFF).method2450(0)) {
                        var33 = true;
                    }
                } else if (!arg9.method2088(var35 & 0x3FFFFFFF, 126).method1518(this.field4450, (byte) -72)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class153[] var36 = new class153[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field4463[var38];
                if ((var39 & 0x40000000) != 0) {
                    class153 var40 = arg9.method2088(var39 & 0x3FFFFFFF, arg2 ^ 0x96177C07).method1515((byte) 121, this.field4450);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class153 var41 = arg0.method1953(16249, var39 & 0x3FFFFFFF).method2449((byte) -37);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class153 var42 = new class153(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg4.method554(var42, var43, class414.field6095, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field4452[var44] < class61.field960[var44].length) {
                    var31.method632(class43.field683[var44], class61.field960[var44][this.field4452[var44]]);
                }
                if (class306.field4689[var44].length > this.field4452[var44]) {
                    var31.method632(class115.field1769[var44], class306.field4689[var44][this.field4452[var44]]);
                }
            }
            var31.method662(var13);
            class242 var45 = class162.field2439;
            synchronized (class162.field2439) {
                class162.field2439.method1623(this.field4456, 17621, var31);
            }
        }
        if (arg1 == null) {
            return var31;
        } else {
            var31.method669((byte) 4, var13, true);
            return arg1.method403(var31, (byte) 106, arg7, arg10, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lep;[Los;Lsb;IILlg;ILiv;Lza;ILkt;ILkt;IILoi;IZLmc;)Le;")
    public final class289 method1927(class314 arg0, class390[] arg1, class222 arg2, int arg3, int arg4, class25 arg5, int arg6, class292 arg7, class299 arg8, int arg9, class61 arg10, int arg11, class61 arg12, int arg13, int arg14, class172 arg15, int arg16, boolean arg17, class318 arg18) {
        field4457++;
        if (this.field4454 != -1) {
            return arg15.method1229(-21382, this.field4454).method1220(arg10, arg14, arg12, arg9, arg5, arg16, arg2, arg3, arg1, true, arg8, arg13, arg6, arg18, arg11);
        }
        int var20 = arg11;
        long var21 = this.field4456;
        int[] var23 = this.field4463;
        if (arg10 != null && (arg10.field965 >= 0 || arg10.field970 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field4463[var24];
            }
            if (arg10.field965 >= 0) {
                if (arg10.field965 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class19.method118(arg10.field965, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg10.field970 >= 0) {
                if (arg10.field970 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class19.method118(1073741824, arg10.field970);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg10 != null || arg12 != null;
        int var29 = arg1 == null ? 0 : arg1.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class20.field218[var30] = null;
            if (arg1[var30] != null) {
                class61 var31 = arg2.method1538(-4031, arg1[var30].field5716);
                if (var31.field976 != null) {
                    var28 = true;
                    class320.field4852[var30] = var31;
                    int var32 = arg1[var30].field5711;
                    int var33 = arg1[var30].field5707;
                    int var34 = var31.field976[var32];
                    class20.field218[var30] = arg2.method1542(0, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class242.field3625[var30] = var35;
                    if (class20.field218[var30] != null) {
                        var26 |= class20.field218[var30].method2077(var35, (byte) -120);
                        var25 |= class20.field218[var30].method2075(var35, -117);
                        var27 |= class20.field218[var30].method2074(255, var35);
                    }
                    if ((var31.field968 || class29.field324) && var33 != -1 && var33 < var31.field976.length) {
                        class462.field6850[var30] = var31.field962[var32];
                        class182.field2786[var30] = arg1[var30].field5710;
                        int var36 = var31.field976[var33];
                        class541.field7915[var30] = arg2.method1542(0, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class433.field6437[var30] = var37;
                        if (class541.field7915[var30] != null) {
                            var26 |= class541.field7915[var30].method2077(var37, (byte) 76);
                            var25 |= class541.field7915[var30].method2075(var37, -113);
                            var27 |= class541.field7915[var30].method2074(255, var37);
                        }
                    } else {
                        class462.field6850[var30] = 0;
                        class182.field2786[var30] = 0;
                        class541.field7915[var30] = null;
                        class433.field6437[var30] = -1;
                    }
                }
            }
        }
        if (arg4 <= 52) {
            return null;
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class313 var41 = null;
        class313 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class313 var46 = null;
        class313 var47 = null;
        if (var28) {
            var20 = arg11 | 0x20;
            if (arg10 != null) {
                int var48 = arg10.field976[arg6];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg2.method1542(0, var49);
                if (var41 != null) {
                    var26 |= var41.method2077(var38, (byte) -128);
                    var25 |= var41.method2075(var38, -123);
                    var27 |= var41.method2074(255, var38);
                }
                if ((arg10.field968 || class29.field324) && arg9 != -1 && arg9 < arg10.field976.length) {
                    int var50 = arg10.field976[arg9];
                    var40 = arg10.field962[arg6];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg2.method1542(0, var51);
                    if (var42 != null) {
                        var26 |= var42.method2077(var39, (byte) -71);
                        var25 |= var42.method2075(var39, -113);
                        var27 |= var42.method2074(255, var39);
                    }
                }
            }
            if (arg12 != null) {
                int var52 = arg12.field976[arg13];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg2.method1542(0, var53);
                if (var46 != null) {
                    var26 |= var46.method2077(var43, (byte) 115);
                    var25 |= var46.method2075(var43, -109);
                    var27 |= var46.method2074(255, var43);
                }
                if ((arg12.field968 || class29.field324) && arg14 != -1 && arg14 < arg12.field976.length) {
                    var45 = arg12.field962[arg13];
                    int var54 = arg12.field976[arg14];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg2.method1542(0, var55);
                    if (var47 != null) {
                        var26 |= var47.method2077(var44, (byte) -69);
                        var25 |= var47.method2075(var44, -127);
                        var27 |= var47.method2074(255, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class242 var56 = class98.field1525;
        class289 var57;
        synchronized (class98.field1525) {
            var57 = (class289) class98.field1525.method1634(var21, 64);
        }
        class477 var58 = null;
        if (this.field4460 != -1) {
            var58 = arg5.method154((byte) 21, this.field4460);
        }
        if (var57 == null || arg8.method589(var57.method679(), var20) != 0 || var58 != null && var58.field6995 != null && this.field4459 == null) {
            if (var57 != null) {
                var20 = arg8.method557(var20, var57.method679());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg7.method1953(16249, var62 & 0x3FFFFFFF).method2445(111)) {
                        var60 = true;
                    }
                } else if (!arg0.method2088(var62 & 0x3FFFFFFF, 120).method1526(0, this.field4450)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field4462 != -1L) {
                    class242 var63 = class98.field1525;
                    synchronized (class98.field1525) {
                        var57 = (class289) class98.field1525.method1634(this.field4462, 64);
                    }
                }
                if (var57 == null || arg8.method589(var57.method679(), var20) != 0 || var58 != null && var58.field6995 != null && this.field4459 == null) {
                    return null;
                }
            } else {
                class153[] var64 = new class153[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class153 var68 = arg0.method2088(var66 & 0x3FFFFFFF, 116).method1529(-1, this.field4450);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    } else if ((Integer.MIN_VALUE & var66) != 0) {
                        class153 var67 = arg7.method1953(16249, var66 & 0x3FFFFFFF).method2443((byte) 68);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field6995 != null) {
                    for (int var69 = 0; var69 < var58.field6995.length; var69++) {
                        if (var58.field6995[var69] != null && var64[var69] != null) {
                            int var70 = var58.field6995[var69][0];
                            int var71 = var58.field6995[var69][1];
                            int var72 = var58.field6995[var69][2];
                            int var73 = var58.field6995[var69][3] << 3;
                            int var74 = var58.field6995[var69][4] << 3;
                            int var75 = var58.field6995[var69][5] << 3;
                            if (this.field4459 == null) {
                                this.field4459 = new int[var58.field6995.length][];
                            }
                            if (this.field4459[var69] == null) {
                                int[] var76 = this.field4459[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[14] = -var72;
                                    var76[12] = -var70;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[13] = -var71;
                                } else {
                                    int var77 = class58.field889[var73];
                                    int var78 = class58.field891[var73];
                                    int var79 = class58.field889[var74];
                                    int var80 = class58.field891[var74];
                                    int var81 = class58.field889[var75];
                                    int var82 = class58.field891[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + (var79 * var83) + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[1] = -var82 * var79 + (var80 * var83) + 16384 >> 15;
                                    var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                    var76[12] = var76[6] * -var72 + (var76[0] * -var70 + (var76[3] * -var71)) + 16384 >> 15;
                                    var76[14] = var76[8] * -var72 + var76[2] * -var70 + var76[5] * -var71 + 16384 >> 15;
                                    var76[13] = var76[4] * -var71 + var76[1] * -var70 + var76[7] * -var72 + 16384 >> 15;
                                }
                                var76[10] = var71;
                                var76[11] = var72;
                                var76[9] = var70;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method1103(127, var73, var74, var75);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method1110(var72, var71, var70, 98);
                            }
                        }
                    }
                }
                int var85 = var20 | 0x4000;
                class153 var86 = new class153(var64, var64.length);
                var57 = arg8.method554(var86, var85, class414.field6095, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (this.field4452[var87] < class61.field960[var87].length) {
                        var57.method632(class43.field683[var87], class61.field960[var87][this.field4452[var87]]);
                    }
                    if (class306.field4689[var87].length > this.field4452[var87]) {
                        var57.method632(class115.field1769[var87], class306.field4689[var87][this.field4452[var87]]);
                    }
                }
                if (arg17) {
                    var57.method662(var20);
                    class242 var88 = class98.field1525;
                    synchronized (class98.field1525) {
                        class98.field1525.method1623(var21, 17621, var57);
                    }
                    this.field4462 = var21;
                }
            }
        }
        class289 var89 = var57.method669((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class20.field218[var90] != null) {
                var89.method1936(class182.field2786[var90] - 1, class20.field218[var90], class462.field6850[var90], 18421, class242.field3625[var90], class541.field7915[var90], false, class433.field6437[var90], var91, this.field4459 == null ? null : this.field4459[var90], 0);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method1938(var38, var43, arg10.field952, arg3 - 1, var45, var46, false, arg16 - 1, var42, var40, var47, var44, var41, var39, 0);
        } else if (var41 != null) {
            var89.method1937(var42, false, var41, arg3 - 1, var40, var39, var38, (byte) -75, 0);
        } else if (var46 != null) {
            var89.method1937(var47, false, var46, arg16 - 1, var45, var44, var43, (byte) 45, 0);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class20.field218[var92] = null;
            class541.field7915[var92] = null;
            class320.field4852[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "([IIII[IZ)V")
    public final void method1928(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        this.field4450 = arg5;
        this.field4452 = arg0;
        field4461++;
        this.field4463 = arg4;
        if (arg3 != 0) {
            this.method1920(119);
        }
        this.field4454 = arg2;
        if (this.field4460 != arg1) {
            this.field4459 = null;
            this.field4460 = arg1;
        }
        this.method1920(107);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILiv;I)V")
    public final void method1929(int arg0, int arg1, class292 arg2, int arg3) {
        field4466++;
        int var5 = class307.field4696[arg0];
        if (this.field4463[var5] != 0 && arg2.method1953(16249, arg1) != null) {
            this.field4463[var5] = class19.method118(arg1, Integer.MIN_VALUE);
            int var6 = 31 / ((arg3 + 55) / 53);
            this.method1920(107);
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)V")
    public static final void method1930(int arg0) {
        field4448++;
        class344.method2219(4095);
        if (arg0 != -1571) {
            method1921((byte) 106);
        }
        class425.method2644(27576);
    }
}
