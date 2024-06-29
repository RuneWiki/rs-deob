import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class115 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[F")
    private float[] field1819 = new float[16];

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Lel;")
    private class382 field1824 = new class382(786336);

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    private int field1830 = class211.method1408(true, 1600);

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    private int field1833 = 0;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[I")
    private int[] field1835 = new int[64];

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[I")
    private int[] field1838 = new int[8191];

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "[[Lke;")
    private class421[][] field1836 = new class421[1600][64];

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "[I")
    private int[] field1837 = new int[1600];

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "[[Lke;")
    private class421[][] field1832 = new class421[64][768];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lwt;")
    private class202 field1825;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lwt;")
    private class202 field1826;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lwt;")
    private class202 field1828;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Luv;")
    private class243 field1829;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLgn;Lqg;)V")
    public final void method846(byte arg0, class492 arg1, class321 arg2) {
        field1822++;
        if (arg2.field4919 == null) {
            return;
        }
        this.method851(arg2, false);
        float var4 = arg2.field4919.field6021;
        float var5 = arg2.field4919.field6000;
        float var6 = arg2.field4919.field6015;
        if (arg0 >= -84) {
            this.field1826 = null;
        }
        float var7 = arg2.field4919.field6011;
        try {
            if (arg1.field7189) {
                int var8 = arg1.field7185 - arg1.field7183;
                int var9;
                if ((var8 + 2) <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class211.method1408(true, var8) + 1 - this.field1830;
                    var8 = (var8 >> var9) + 2;
                }
                class347 var10 = arg1.field7181.field3238;
                class347 var11 = var10.field5262;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field1833 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field1837[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field1835[var16] = 0;
                    }
                    while (var10 != var11) {
                        class421 var17 = (class421) var11;
                        if (var14) {
                            var13 = var17.field6198;
                            var12 = var17.field6194;
                            var14 = false;
                        } else if (var17.field6194 != var12 || var17.field6198 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field6185 >> class80.field1328) * var6 + (float) (var17.field6196 >> class80.field1328) * var4 + (float) (var17.field6188 >> class80.field1328) * var5 + var7) - arg1.field7183 >> var9;
                        if (var18 < 1600) {
                            if (this.field1837[var18] >= 64) {
                                label196: {
                                    if (this.field1837[var18] == 64) {
                                        if (this.field1833 == 64) {
                                            break label196;
                                        }
                                        this.field1837[var18] += (this.field1833++) + 1;
                                    }
                                    class421[] var10000 = this.field1832[this.field1837[var18] - 64 - 1];
                                    int var10002 = this.field1837[var18] - 65;
                                    int var10004 = this.field1835[this.field1837[var18] - 65];
                                    this.field1835[var10002] = this.field1835[this.field1837[var18] - 65] + 1;
                                    var10000[var10004] = var17;
                                }
                            } else {
                                this.field1836[var18][this.field1837[var18]++] = var17;
                            }
                        }
                        var11 = var11.field5262;
                    }
                    if (var12 >= 0) {
                        arg2.method2042(arg2.field4773.method2838(var12, -16681), 0);
                        arg2.method2068(arg2.field2449.method935(var12, -8037).field3100, 13134);
                    } else {
                        arg2.method2042(null, 0);
                    }
                    if (var13 && class516.field7582 != arg2.field4875) {
                        arg2.method458(class516.field7582);
                    } else if (arg2.field4875 != 1.0F) {
                        arg2.method458(1.0F);
                    }
                    this.method850(var8, (byte) 50, arg2);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class347 var22 = arg1.field7181.field3238;
                for (class347 var23 = var22.field5262; var23 != var22; var23 = var23.field5262) {
                    class421 var24 = (class421) var23;
                    int var25 = (int) ((float) (var24.field6185 >> class80.field1328) * var6 + (float) (var24.field6196 >> class80.field1328) * var4 + (float) (var24.field6188 >> class80.field1328) * var5 + var7);
                    if (var20 > var25) {
                        var20 = var25;
                    }
                    this.field1838[var19++] = var25;
                    if (var25 > var21) {
                        var21 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class211.method1408(true, var26) + 1 - this.field1830;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                int var28 = 0;
                class347 var29 = var22.field5262;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field1833 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field1837[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field1835[var34] = 0;
                    }
                    while (var22 != var29) {
                        class421 var35 = (class421) var29;
                        if (var32) {
                            var30 = var35.field6194;
                            var31 = var35.field6198;
                            var32 = false;
                        }
                        if (var28 > 0 && (var35.field6194 != var30 || var31 != var35.field6198)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field1838[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field1837[var36] >= 64) {
                                label146: {
                                    if (this.field1837[var36] == 64) {
                                        if (this.field1833 == 64) {
                                            break label146;
                                        }
                                        this.field1837[var36] += (this.field1833++) + 1;
                                    }
                                    this.field1832[this.field1837[var36] - 64 - 1][this.field1835[this.field1837[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field1836[var36][this.field1837[var36]++] = var35;
                            }
                        }
                        var29 = var29.field5262;
                    }
                    if (var30 < 0) {
                        arg2.method2042(null, 0);
                    } else {
                        arg2.method2042(arg2.field4773.method2838(var30, -16681), 0);
                        arg2.method2068(arg2.field2449.method935(var30, -8037).field3100, 13134);
                    }
                    if (var31 && class516.field7582 != arg2.field4875) {
                        arg2.method458(class516.field7582);
                    } else if (arg2.field4875 != 1.0F) {
                        arg2.method458(1.0F);
                    }
                    this.method850(var26, (byte) -127, arg2);
                }
            }
        } catch (Exception var37) {
        }
        this.method849(arg2, -11226);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLqg;)V")
    public final void method847(boolean arg0, class321 arg1) {
        this.field1829 = arg1.method2013((byte) 61, null, arg0, 24, 196584);
        field1820++;
        this.field1825 = new class202(this.field1829, 5126, 2, 0);
        this.field1826 = new class202(this.field1829, 5126, 3, 8);
        this.field1828 = new class202(this.field1829, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method848(boolean arg0, int arg1) {
        field1831++;
        if (arg1 != 4729) {
            field1834 = 20;
        }
        boolean var2 = class394.field5821.method529();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class394.field5821.method448();
        } else if (!class394.field5821.method493()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class397.field5830.field130 = arg0;
            class397.field5830.method1299((byte) 116, class112.field1785);
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lqg;I)V")
    private final void method849(class321 arg0, int arg1) {
        field1827++;
        arg0.method2052((byte) 68, true);
        if (arg1 != -11226) {
            this.method849(null, 67);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class516.field7582 != arg0.field4875) {
            arg0.method458(class516.field7582);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLqg;)V")
    private final void method850(int arg0, byte arg1, class321 arg2) {
        OpenGL.glGetFloatv(2982, this.field1819, 0);
        field1821++;
        float var4 = this.field1819[0];
        float var5 = this.field1819[4];
        float var6 = this.field1819[8];
        float var7 = this.field1819[1];
        float var8 = this.field1819[5];
        float var9 = this.field1819[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        int var12 = 122 / ((arg1 + 40) / 60);
        float var13 = var6 + var9;
        float var14 = var4 - var7;
        float var15 = var5 - var8;
        float var16 = var6 - var9;
        float var17 = var7 - var4;
        float var18 = var8 - var5;
        this.field1824.field4333 = 0;
        float var19 = var9 - var6;
        if (arg2.field4850) {
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = this.field1837[var20] <= 64 ? this.field1837[var20] : 64;
                if (var21 > 0) {
                    for (int var22 = var21 - 1; var22 >= 0; var22--) {
                        class421 var35 = this.field1836[var20][var22];
                        int var36 = var35.field6186;
                        byte var37 = (byte) (var36 >> 16);
                        byte var38 = (byte) (var36 >> 8);
                        byte var39 = (byte) var36;
                        byte var40 = (byte) (var36 >>> 24);
                        float var41 = (float) (var35.field6196 >> class80.field1328);
                        float var42 = (float) (var35.field6188 >> class80.field1328);
                        float var43 = (float) (var35.field6185 >> class80.field1328);
                        int var44 = var35.field6191 >> class80.field1328;
                        this.field1824.method2421(25785, 0.0F);
                        this.field1824.method2421(25785, 0.0F);
                        this.field1824.method2421(25785, (float) (-var44) * var10 + var41);
                        this.field1824.method2421(25785, (float) (-var44) * var11 + var42);
                        this.field1824.method2421(25785, (float) (-var44) * var13 + var43);
                        this.field1824.method1923((byte) 62, var37);
                        this.field1824.method1923((byte) 62, var38);
                        this.field1824.method1923((byte) 62, var39);
                        this.field1824.method1923((byte) 62, var40);
                        this.field1824.method2421(25785, 1.0F);
                        this.field1824.method2421(25785, 0.0F);
                        this.field1824.method2421(25785, (float) var44 * var14 + var41);
                        this.field1824.method2421(25785, (float) var44 * var15 + var42);
                        this.field1824.method2421(25785, (float) var44 * var16 + var43);
                        this.field1824.method1923((byte) 62, var37);
                        this.field1824.method1923((byte) 62, var38);
                        this.field1824.method1923((byte) 62, var39);
                        this.field1824.method1923((byte) 62, var40);
                        this.field1824.method2421(25785, 1.0F);
                        this.field1824.method2421(25785, 1.0F);
                        this.field1824.method2421(25785, (float) var44 * var10 + var41);
                        this.field1824.method2421(25785, (float) var44 * var11 + var42);
                        this.field1824.method2421(25785, (float) var44 * var13 + var43);
                        this.field1824.method1923((byte) 62, var37);
                        this.field1824.method1923((byte) 62, var38);
                        this.field1824.method1923((byte) 62, var39);
                        this.field1824.method1923((byte) 62, var40);
                        this.field1824.method2421(25785, 0.0F);
                        this.field1824.method2421(25785, 1.0F);
                        this.field1824.method2421(25785, (float) var44 * var17 + var41);
                        this.field1824.method2421(25785, (float) var44 * var18 + var42);
                        this.field1824.method2421(25785, (float) var44 * var19 + var43);
                        this.field1824.method1923((byte) 62, var37);
                        this.field1824.method1923((byte) 62, var38);
                        this.field1824.method1923((byte) 62, var39);
                        this.field1824.method1923((byte) 62, var40);
                    }
                    if (this.field1837[var20] > 64) {
                        int var23 = this.field1837[var20] - 1 - 64;
                        for (int var24 = this.field1835[var23] - 1; var24 >= 0; var24--) {
                            class421 var25 = this.field1832[var23][var24];
                            int var26 = var25.field6186;
                            byte var27 = (byte) (var26 >> 16);
                            byte var28 = (byte) (var26 >> 8);
                            byte var29 = (byte) var26;
                            byte var30 = (byte) (var26 >>> 24);
                            float var31 = (float) (var25.field6196 >> class80.field1328);
                            float var32 = (float) (var25.field6188 >> class80.field1328);
                            float var33 = (float) (var25.field6185 >> class80.field1328);
                            int var34 = var25.field6191 >> class80.field1328;
                            this.field1824.method2421(25785, 0.0F);
                            this.field1824.method2421(25785, 0.0F);
                            this.field1824.method2421(25785, (float) (-var34) * var10 + var31);
                            this.field1824.method2421(25785, (float) (-var34) * var11 + var32);
                            this.field1824.method2421(25785, (float) (-var34) * var13 + var33);
                            this.field1824.method1923((byte) 62, var27);
                            this.field1824.method1923((byte) 62, var28);
                            this.field1824.method1923((byte) 62, var29);
                            this.field1824.method1923((byte) 62, var30);
                            this.field1824.method2421(25785, 1.0F);
                            this.field1824.method2421(25785, 0.0F);
                            this.field1824.method2421(25785, (float) var34 * var14 + var31);
                            this.field1824.method2421(25785, (float) var34 * var15 + var32);
                            this.field1824.method2421(25785, (float) var34 * var16 + var33);
                            this.field1824.method1923((byte) 62, var27);
                            this.field1824.method1923((byte) 62, var28);
                            this.field1824.method1923((byte) 62, var29);
                            this.field1824.method1923((byte) 62, var30);
                            this.field1824.method2421(25785, 1.0F);
                            this.field1824.method2421(25785, 1.0F);
                            this.field1824.method2421(25785, (float) var34 * var10 + var31);
                            this.field1824.method2421(25785, (float) var34 * var11 + var32);
                            this.field1824.method2421(25785, (float) var34 * var13 + var33);
                            this.field1824.method1923((byte) 62, var27);
                            this.field1824.method1923((byte) 62, var28);
                            this.field1824.method1923((byte) 62, var29);
                            this.field1824.method1923((byte) 62, var30);
                            this.field1824.method2421(25785, 0.0F);
                            this.field1824.method2421(25785, 1.0F);
                            this.field1824.method2421(25785, (float) var34 * var17 + var31);
                            this.field1824.method2421(25785, (float) var34 * var18 + var32);
                            this.field1824.method2421(25785, (float) var34 * var19 + var33);
                            this.field1824.method1923((byte) 62, var27);
                            this.field1824.method1923((byte) 62, var28);
                            this.field1824.method1923((byte) 62, var29);
                            this.field1824.method1923((byte) 62, var30);
                        }
                    }
                }
            }
        } else {
            for (int var45 = arg0 - 1; var45 >= 0; var45--) {
                int var46 = this.field1837[var45] > 64 ? 64 : this.field1837[var45];
                if (var46 > 0) {
                    for (int var47 = var46 - 1; var47 >= 0; var47--) {
                        class421 var60 = this.field1836[var45][var47];
                        int var61 = var60.field6186;
                        byte var62 = (byte) (var61 >> 16);
                        byte var63 = (byte) (var61 >> 8);
                        byte var64 = (byte) var61;
                        byte var65 = (byte) (var61 >>> 24);
                        float var66 = (float) (var60.field6196 >> class80.field1328);
                        float var67 = (float) (var60.field6188 >> class80.field1328);
                        float var68 = (float) (var60.field6185 >> class80.field1328);
                        int var69 = var60.field6191 >> class80.field1328;
                        this.field1824.method2420(0.0F, (byte) 4);
                        this.field1824.method2420(0.0F, (byte) 4);
                        this.field1824.method2420((float) (-var69) * var10 + var66, (byte) 4);
                        this.field1824.method2420((float) (-var69) * var11 + var67, (byte) 4);
                        this.field1824.method2420((float) (-var69) * var13 + var68, (byte) 4);
                        this.field1824.method1923((byte) 62, var62);
                        this.field1824.method1923((byte) 62, var63);
                        this.field1824.method1923((byte) 62, var64);
                        this.field1824.method1923((byte) 62, var65);
                        this.field1824.method2420(1.0F, (byte) 4);
                        this.field1824.method2420(0.0F, (byte) 4);
                        this.field1824.method2420((float) var69 * var14 + var66, (byte) 4);
                        this.field1824.method2420((float) var69 * var15 + var67, (byte) 4);
                        this.field1824.method2420((float) var69 * var16 + var68, (byte) 4);
                        this.field1824.method1923((byte) 62, var62);
                        this.field1824.method1923((byte) 62, var63);
                        this.field1824.method1923((byte) 62, var64);
                        this.field1824.method1923((byte) 62, var65);
                        this.field1824.method2420(1.0F, (byte) 4);
                        this.field1824.method2420(1.0F, (byte) 4);
                        this.field1824.method2420((float) var69 * var10 + var66, (byte) 4);
                        this.field1824.method2420((float) var69 * var11 + var67, (byte) 4);
                        this.field1824.method2420((float) var69 * var13 + var68, (byte) 4);
                        this.field1824.method1923((byte) 62, var62);
                        this.field1824.method1923((byte) 62, var63);
                        this.field1824.method1923((byte) 62, var64);
                        this.field1824.method1923((byte) 62, var65);
                        this.field1824.method2420(0.0F, (byte) 4);
                        this.field1824.method2420(1.0F, (byte) 4);
                        this.field1824.method2420((float) var69 * var17 + var66, (byte) 4);
                        this.field1824.method2420((float) var69 * var18 + var67, (byte) 4);
                        this.field1824.method2420((float) var69 * var19 + var68, (byte) 4);
                        this.field1824.method1923((byte) 62, var62);
                        this.field1824.method1923((byte) 62, var63);
                        this.field1824.method1923((byte) 62, var64);
                        this.field1824.method1923((byte) 62, var65);
                    }
                    if (this.field1837[var45] > 64) {
                        int var48 = this.field1837[var45] - 65;
                        for (int var49 = this.field1835[var48] - 1; var49 >= 0; var49--) {
                            class421 var50 = this.field1832[var48][var49];
                            int var51 = var50.field6186;
                            byte var52 = (byte) (var51 >> 16);
                            byte var53 = (byte) (var51 >> 8);
                            byte var54 = (byte) var51;
                            byte var55 = (byte) (var51 >>> 24);
                            float var56 = (float) (var50.field6196 >> class80.field1328);
                            float var57 = (float) (var50.field6188 >> class80.field1328);
                            float var58 = (float) (var50.field6185 >> class80.field1328);
                            int var59 = var50.field6191 >> class80.field1328;
                            this.field1824.method2420(0.0F, (byte) 4);
                            this.field1824.method2420(0.0F, (byte) 4);
                            this.field1824.method2420((float) (-var59) * var10 + var56, (byte) 4);
                            this.field1824.method2420((float) (-var59) * var11 + var57, (byte) 4);
                            this.field1824.method2420((float) (-var59) * var13 + var58, (byte) 4);
                            this.field1824.method1923((byte) 62, var52);
                            this.field1824.method1923((byte) 62, var53);
                            this.field1824.method1923((byte) 62, var54);
                            this.field1824.method1923((byte) 62, var55);
                            this.field1824.method2420(1.0F, (byte) 4);
                            this.field1824.method2420(0.0F, (byte) 4);
                            this.field1824.method2420((float) var59 * var14 + var56, (byte) 4);
                            this.field1824.method2420((float) var59 * var15 + var57, (byte) 4);
                            this.field1824.method2420((float) var59 * var16 + var58, (byte) 4);
                            this.field1824.method1923((byte) 62, var52);
                            this.field1824.method1923((byte) 62, var53);
                            this.field1824.method1923((byte) 62, var54);
                            this.field1824.method1923((byte) 62, var55);
                            this.field1824.method2420(1.0F, (byte) 4);
                            this.field1824.method2420(1.0F, (byte) 4);
                            this.field1824.method2420((float) var59 * var10 + var56, (byte) 4);
                            this.field1824.method2420((float) var59 * var11 + var57, (byte) 4);
                            this.field1824.method2420((float) var59 * var13 + var58, (byte) 4);
                            this.field1824.method1923((byte) 62, var52);
                            this.field1824.method1923((byte) 62, var53);
                            this.field1824.method1923((byte) 62, var54);
                            this.field1824.method1923((byte) 62, var55);
                            this.field1824.method2420(0.0F, (byte) 4);
                            this.field1824.method2420(1.0F, (byte) 4);
                            this.field1824.method2420((float) var59 * var17 + var56, (byte) 4);
                            this.field1824.method2420((float) var59 * var18 + var57, (byte) 4);
                            this.field1824.method2420((float) var59 * var19 + var58, (byte) 4);
                            this.field1824.method1923((byte) 62, var52);
                            this.field1824.method1923((byte) 62, var53);
                            this.field1824.method1923((byte) 62, var54);
                            this.field1824.method1923((byte) 62, var55);
                        }
                    }
                }
            }
        }
        if (this.field1824.field4333 != 0) {
            this.field1829.method1567(this.field1824.field4326, this.field1824.field4333, 24, 9813);
            arg2.method2085(this.field1826, null, this.field1825, -29066, this.field1828);
            arg2.method2048(117, this.field1824.field4333 / 24, 0, 7);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lqg;Z)V")
    private final void method851(class321 arg0, boolean arg1) {
        class516.field7582 = arg0.field4875;
        field1823++;
        arg0.method2027(-26);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2052((byte) 64, arg1);
        arg0.method2008(-2, 848);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([Ltn;BI)V")
    public static final void method852(class58[] arg0, byte arg1, int arg2) {
        field1818++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class58 var4 = arg0[var3];
            if (var4 != null && var4.field876 == arg2 && !client.method1334(var4)) {
                if (var4.field843 == 0) {
                    method852(arg0, (byte) 97, var4.field955);
                    if (var4.field910 != null) {
                        method852(var4.field910, (byte) 106, var4.field955);
                    }
                    class183 var5 = (class183) class466.field6844.method2485(84, (long) var4.field955);
                    if (var5 != null) {
                        class471.method2809((byte) -109, var5.field2753);
                    }
                }
                if (var4.field843 == 6 && var4.field909 != -1) {
                    class357 var6 = class311.field4455.method1233(true, var4.field909);
                    if (var6 != null) {
                        var4.field944 += class228.field3343;
                        while (var4.field944 > var6.field5408[var4.field866]) {
                            var4.field944 -= var6.field5408[var4.field866];
                            var4.field866++;
                            if (var4.field866 >= var6.field5395.length) {
                                var4.field866 -= var6.field5402;
                                if (var4.field866 < 0 || var4.field866 >= var6.field5395.length) {
                                    var4.field866 = 0;
                                }
                            }
                            var4.field901 = var4.field866 + 1;
                            if (var6.field5395.length <= var4.field901) {
                                var4.field901 -= var6.field5402;
                                if (var4.field901 < 0 || var4.field901 >= var6.field5395.length) {
                                    var4.field901 = -1;
                                }
                            }
                            class139.method1027(var4, false);
                        }
                    }
                }
            }
        }
        if (arg1 <= 93) {
            method852(null, (byte) 66, -92);
        }
    }

    static {
        new class180("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }
}
