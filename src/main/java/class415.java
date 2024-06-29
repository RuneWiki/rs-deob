import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class415 extends class213 {

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lef;")
    private class513 field6112 = new class513();

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    private int field6123 = 256;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    private int field6121 = 0;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    private int field6128 = 256;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    private int field6117;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field6129 = new String[] { method3230(method3229("\n~\u000f$")), method3230(method3229("\u001f%Mfe")), method3230(method3229("\fmM\u00060")), method3230(method3229("\fmM\r0")), method3230(method3229("\fmM\u00020")), method3230(method3229("\fmM\u001b0")), method3230(method3229("\fmM\n0")), method3230(method3229("\fmM\u00010")), method3230(method3229("\fmM\u00190")), method3230(method3229("\fmMtq\nb\u0017v0")), method3230(method3229("\fmM\u00000")), method3230(method3229("\fmM\u00040")), method3230(method3229("\fmM\u00030")), method3230(method3229("\fmM\u00070")), method3230(method3229("\fmM\u000f0")), method3230(method3229("\fmM\u000e0")), method3230(method3229("\fmM\f0")), method3230(method3229("\fmM\u001a0")), method3230(method3229("\fmM\t0")), method3230(method3229("\fmM\u00180")), method3230(method3229("\fmM\u00050")), method3230(method3229("\fmM\u000b0")) };

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lel;")
    public static class573 field6103 = new class573(106, -2);

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    private int field6126;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "Lmc;")
    public static class146 field6114;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Lhaa;")
    public static class89 field6125;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "Z")
    private boolean field6124;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "Z")
    private boolean field6127;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 3)
    private final synchronized void method3215(int arg0) {
        try {
            field6110++;
            class120 var2 = this.method3227(-2);
            if (var2 != null) {
                var2.method1824(1);
                this.field6121--;
                this.field6126 = arg0;
                class198.field3101.method636(var2, 0, var2.method1044(122));
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6129[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljja;I)V", line = 20)
    public final synchronized void method3216(class120 arg0, int arg1) {
        try {
            if (arg1 != -101) {
                this.field6123 = -85;
            }
            while (this.field6121 >= 100) {
                this.field6112.method3875(76);
                this.field6121--;
            }
            field6122++;
            this.field6112.method3868(116, arg0);
            this.field6121++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6129[19] + (arg0 == null ? field6129[0] : field6129[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()Lfq;", line = 39)
    public final class213 method1151() {
        try {
            field6104++;
            return null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6129[6] + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 47)
    public static void method3217(byte arg0) {
        try {
            field6103 = null;
            field6125 = null;
            field6114 = null;
            if (arg0 != 35) {
                method3217((byte) 15);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6129[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 60)
    public final void method3218(int arg0, int arg1) {
        try {
            this.field6128 = arg1;
            this.field6123 = arg1;
            field6113++;
            if (arg0 != 0) {
                this.method3225(-99);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6129[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()Lfq;", line = 76)
    public final class213 method1158() {
        try {
            field6120++;
            return null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6129[3] + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V", line = 85)
    public final synchronized void method3219(int arg0, boolean arg1) {
        try {
            this.field6124 = arg1;
            field6116++;
            if (arg0 != -28252) {
                this.method3221(-31);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6129[16] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)Ltia;", line = 98)
    public static final class280 method3220(int arg0, int arg1, int arg2, int arg3) {
        try {
            field6106++;
            class280 var4 = null;
            if (arg3 == 0) {
                var4 = class610.method4508(class705.field10243, class279.field4190, (byte) 29);
                class776.field11275++;
            }
            if (arg2 == arg3) {
                class389.field5867++;
                var4 = class610.method4508(class256.field3979, class279.field4190, (byte) -106);
            }
            var4.field4197.method1406(class281.field4219 + arg1, arg2 ^ 0x16AB6869);
            var4.field4197.method1418((byte) -126, class494.field7101 + arg0);
            var4.field4197.method1430(false, class597.field8749.method89(false, 82) ? 1 : 0);
            class153.field1893 = arg1;
            class649.field9397 = false;
            class492.field7065 = arg0;
            class204.method1812(0);
            return var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6129[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)I", line = 128)
    public final synchronized int method3221(int arg0) {
        try {
            field6108++;
            return arg0 >= -95 ? -40 : this.field6121;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6129[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(DBI)Ljja;", line = 140)
    public final class120 method3222(double arg0, byte arg1, int arg2) {
        try {
            field6099++;
            long var5 = (long) (arg2 | this.field6117 << 0);
            if (arg1 >= -50) {
                this.field6117 = -64;
            }
            class120 var7 = (class120) class198.field3101.method637((byte) -127, var5);
            if (var7 == null) {
                var7 = new class120(new short[this.field6117][arg2], arg0);
            } else {
                var7.field1425 = arg0;
                class198.field3101.method635(var5, 28121);
            }
            return var7;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6129[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([III)V", line = 163)
    public final synchronized void method1156(int[] arg0, int arg1, int arg2) {
        try {
            field6118++;
            if (!this.field6124) {
                if (this.method3227(-2) != null) {
                    int var4 = arg1 + arg2;
                    if (class247.field3844) {
                        var4 <<= 0x1;
                    }
                    byte var5 = 0;
                    byte var6 = 0;
                    if (this.field6117 == 2) {
                        var6 = 1;
                    }
                    while (var4 > arg1) {
                        class120 var7 = this.method3227(-2);
                        if (var7 == null) {
                            return;
                        }
                        short[][] var8 = var7.field1418;
                        while (arg1 < var4 && this.field6126 < var8[0].length) {
                            if (class247.field3844) {
                                arg0[arg1++] = var8[var5][this.field6126] * this.field6123;
                                arg0[arg1++] = var8[var6][this.field6126] * this.field6128;
                            } else {
                                int var10001 = arg1++;
                                arg0[var10001] += var8[var5][this.field6126] * this.field6123 + var8[var6][this.field6126] * this.field6128;
                            }
                            this.field6126++;
                        }
                        if (var8[0].length <= this.field6126) {
                            this.method3215(0);
                        }
                    }
                } else if (this.field6127) {
                    this.method1824(1);
                    class198.field3101.method638((byte) -112);
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field6129[14] + (arg0 == null ? field6129[0] : field6129[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 228)
    public final synchronized void method3223(byte arg0) {
        try {
            int var2 = -42 / ((arg0 + 24) / 59);
            this.field6127 = true;
            field6111++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6129[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V", line = 238)
    public static final void method3224(byte arg0) {
        try {
            if (!class216.field3297) {
                class514.field7425 = class787.field11487 != -1 && class593.field8707 >= class787.field11487 || ((class369.field5631 ? 26 : 22) + class593.field8707 * 16) > class94.field1062;
            }
            field6100++;
            class694.field10135.method3879(93);
            class434.field6371.method3879(121);
            for (class417 var1 = (class417) class728.field10549.method3863((byte) 64); var1 != null; var1 = (class417) class728.field10549.method3862(-353)) {
                int var2 = var1.field6146;
                if (var2 < 1000) {
                    var1.method1824(arg0 - 118);
                    if (var2 == 11 || var2 == 51 || var2 == 10 || var2 == 30 || var2 == 13 || var2 == 9 || var2 == 17) {
                        class434.field6371.method3868(-46, var1);
                    } else {
                        class694.field10135.method3868(-105, var1);
                    }
                }
            }
            class694.field10135.method3866(-2775, class728.field10549);
            class434.field6371.method3866(-2775, class728.field10549);
            if (class593.field8707 <= 1) {
                class290.field4311 = null;
                class513.field7366 = null;
            } else {
                if (class308.field4836 && class597.field8749.method89(false, 81) && class593.field8707 > 2) {
                    class513.field7366 = (class417) class728.field10549.field7374.field3179.field3179;
                } else {
                    class513.field7366 = (class417) class728.field10549.field7374.field3179;
                }
                class290.field4311 = (class417) class728.field10549.field7374.field3179;
            }
            if (arg0 != 119) {
                method3226(null, (byte) -63, null);
            }
            int var3 = -1;
            class394 var4 = (class394) class417.field6150.method3863((byte) 64);
            if (var4 != null) {
                var3 = var4.method2182((byte) 117);
            }
            if (class216.field3297) {
                if (var3 == -1) {
                    int var5 = class606.field8875.method401(arg0 ^ 0x405B);
                    int var6 = class606.field8875.method391((byte) 94);
                    boolean var7 = false;
                    if (class381.field5783 != null) {
                        if ((class348.field5390 - 10) <= var5 && (class662.field9570 + class348.field5390 + 10) >= var5 && var6 >= class80.field903 - 10 && var6 <= (class80.field903 + class259.field3999 + 10)) {
                            var7 = true;
                        } else {
                            class108.method949((byte) 125);
                        }
                    }
                    if (!var7) {
                        if ((class476.field6905 - 10) > var5 || var5 > class371.field5655 + class476.field6905 + 10 || var6 < class668.field9704 - 10 || var6 > (class387.field5849 + class668.field9704 + 10)) {
                            class1.method5(28);
                        } else if (class514.field7425) {
                            int var8 = -1;
                            int var9 = -1;
                            for (int var10 = 0; var10 < class184.field2547; var10++) {
                                if (class369.field5631) {
                                    int var11 = var10 * 16 + class668.field9704 + 33;
                                    if (var11 - 13 < var6 && (var11 + 4) > var6) {
                                        var8 = var10;
                                        var9 = var11 - 13;
                                        break;
                                    }
                                } else {
                                    int var12 = class668.field9704 + (var10 * 16) + 31;
                                    if (var12 - 13 < var6 && (var12 + 3) > var6) {
                                        var9 = var12 - 13;
                                        var8 = var10;
                                        break;
                                    }
                                }
                            }
                            if (var8 != -1) {
                                int var13 = 0;
                                class774 var14 = new class774(class492.field7058);
                                for (class655 var15 = (class655) var14.method5610(1517); var15 != null; var15 = (class655) var14.method5608(-22019)) {
                                    if (var8 == var13) {
                                        if (var15.field9459 > 1) {
                                            class287.method2334(var9, (byte) 117, var6, var15);
                                        }
                                        break;
                                    }
                                    var13++;
                                }
                            }
                        }
                    }
                }
                if (var3 == 0) {
                    int var16 = var4.method2178(false);
                    int var17 = var4.method2177((byte) 107);
                    if (class381.field5783 != null && var16 >= class348.field5390 && class662.field9570 + class348.field5390 >= var16 && class80.field903 <= var17 && class80.field903 + class259.field3999 >= var17) {
                        int var18 = -1;
                        for (int var19 = 0; var19 < class381.field5783.field9459; var19++) {
                            if (class369.field5631) {
                                int var21 = var19 * 16 + class80.field903 + 33;
                                if (var21 - 13 < var17 && var17 < (var21 + 4)) {
                                    var18 = var19;
                                }
                            } else {
                                int var20 = var19 * 16 + class80.field903 + 31;
                                if (var17 > (var20 - 13) && var20 + 3 > var17) {
                                    var18 = var19;
                                }
                            }
                        }
                        if (var18 != -1) {
                            int var22 = 0;
                            class774 var23 = new class774(class381.field5783.field9457);
                            for (class417 var24 = (class417) var23.method5610(1517); var24 != null; var24 = (class417) var23.method5608(-22019)) {
                                if (var18 == var22) {
                                    class521.method3959(var24, var17, var16, 97);
                                    break;
                                }
                                var22++;
                            }
                        }
                        class1.method5(121);
                        return;
                    }
                    if (class476.field6905 <= var16 && (class476.field6905 + class371.field5655) >= var16 && var17 >= class668.field9704 && class668.field9704 + class387.field5849 >= var17) {
                        if (!class514.field7425) {
                            int var25 = -1;
                            for (int var26 = 0; var26 < class593.field8707; var26++) {
                                if (class369.field5631) {
                                    int var27 = (class593.field8707 - var26 - 1) * 16 + class668.field9704 + 33;
                                    if (var27 - 13 < var17 && var27 + 4 > var17) {
                                        var25 = var26;
                                    }
                                } else {
                                    int var28 = (class593.field8707 - var26 - 1) * 16 + class668.field9704 + 31;
                                    if ((var28 - 13) < var17 && var17 < (var28 + 3)) {
                                        var25 = var26;
                                    }
                                }
                            }
                            if (var25 != -1) {
                                int var29 = 0;
                                class293 var30 = new class293(class728.field10549);
                                for (class417 var31 = (class417) var30.method2397(arg0 - 247); var31 != null; var31 = (class417) var30.method2400((byte) 50)) {
                                    if (var25 == var29) {
                                        class521.method3959(var31, var17, var16, 68);
                                        break;
                                    }
                                    var29++;
                                }
                            }
                            class1.method5(arg0 ^ 0x35);
                            return;
                        }
                        int var32 = -1;
                        for (int var33 = 0; var33 < class184.field2547; var33++) {
                            if (class369.field5631) {
                                int var35 = var33 * 16 + class668.field9704 + 33;
                                if (var17 > (var35 - 13) && var35 + 4 > var17) {
                                    var32 = var33;
                                    break;
                                }
                            } else {
                                int var34 = var33 * 16 + class668.field9704 + 31;
                                if (var34 - 13 < var17 && var17 < (var34 + 3)) {
                                    var32 = var33;
                                    break;
                                }
                            }
                        }
                        if (var32 != -1) {
                            int var36 = 0;
                            class774 var37 = new class774(class492.field7058);
                            for (class655 var38 = (class655) var37.method5610(arg0 ^ 0x59A); var38 != null; var38 = (class655) var37.method5608(-22019)) {
                                if (var32 == var36) {
                                    class521.method3959((class417) var38.field9457.field7916.field529, var17, var16, -125);
                                    class1.method5(28);
                                    return;
                                }
                                var36++;
                            }
                            return;
                        }
                    }
                }
            } else {
                if (var3 == 0 && (class74.field864 == 1 && class593.field8707 > 2 || class370.method2987((byte) -18))) {
                    var3 = 2;
                }
                if (var3 == 2 && class593.field8707 > 0 && var4 != null) {
                    if (class69.field740 == null && class537.field7852 == 0) {
                        class304.method2582((byte) -112, var4.method2178(false), var4.method2177((byte) 107));
                    } else {
                        class445.field6530 = 2;
                    }
                }
                if (var3 == 0) {
                    if (class513.field7366 != null) {
                        class102.method834(-1);
                    } else if (class728.field10555) {
                        class431.method3305(-1);
                    }
                }
                if (class69.field740 != null || class537.field7852 != 0) {
                    return;
                }
                class445.field6530 = 0;
                class725.field10470 = null;
            }
        } catch (RuntimeException var40) {
            throw class759.method5498(var40, field6129[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 632)
    public final synchronized void method1160(int arg0) {
        try {
            field6101++;
            if (!this.field6124) {
                while (true) {
                    class120 var2 = this.method3227(-2);
                    if (var2 == null) {
                        if (this.field6127) {
                            this.method1824(1);
                            class198.field3101.method638((byte) -112);
                        }
                        return;
                    }
                    if (arg0 < var2.field1418[0].length - this.field6126) {
                        this.field6126 += arg0;
                        return;
                    }
                    arg0 -= var2.field1418[0].length - this.field6126;
                    this.method3215(0);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6129[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)D", line = 673)
    public final synchronized double method3225(int arg0) {
        try {
            field6119++;
            if (arg0 != -32285) {
                this.method1160(-16);
            }
            if (this.field6121 < 1) {
                return -1.0D;
            } else {
                class120 var2 = (class120) this.field6112.method3863((byte) 64);
                return var2 == null ? -1.0D : (double) (-((float) var2.field1418[0].length / (float) class598.field8803)) + var2.field1425;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6129[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lha;BLcn;)V", line = 695)
    public static final void method3226(class66 arg0, byte arg1, class541 arg2) {
        try {
            if (arg1 != 16) {
                method3228(null, true, null, false);
            }
            field6105++;
            boolean var3 = class540.field7920.method5001(arg2.field8015 ? class225.field3446.field10513 : null, -73, arg2.field7939 | -16777216, arg2.field8004, arg2.field8080, arg0, arg2.field7969, arg2.field8100) == null;
            if (var3) {
                class141.field1680.method3868(arg1 ^ 0x6C, new class327(arg2.field8100, arg2.field8004, arg2.field7969, arg2.field7939 | 0xFF000000, arg2.field8080, arg2.field8015));
                class115.method1013(true, arg2);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6129[2] + (arg0 == null ? field6129[0] : field6129[1]) + ',' + arg1 + ',' + (arg2 == null ? field6129[0] : field6129[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)Ljja;", line = 714)
    private final synchronized class120 method3227(int arg0) {
        try {
            field6109++;
            if (arg0 != -2) {
                this.field6128 = -80;
            }
            return (class120) this.field6112.method3863((byte) 64);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6129[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V", line = 811)
    public class415(int arg0) {
        try {
            this.field6117 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6129[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()I", line = 739)
    public final int method1152() {
        try {
            field6102++;
            return 1;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6129[18] + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lla;ZLjava/lang/String;Z)Lkda;", line = 767)
    public static final class408 method3228(class476 arg0, boolean arg1, String arg2, boolean arg3) {
        try {
            if (!arg3) {
                method3217((byte) 23);
            }
            field6107++;
            int var4 = arg0.method3627(arg2, -107);
            if (var4 == -1) {
                return new class408(0);
            }
            int[] var5 = arg0.method3620(57, var4);
            class408 var6 = new class408(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var7 < var6.field6047) {
                    class163 var9 = new class163(arg0.method3632(var4, var5[var8++], -122));
                    int var10 = var9.method1453((byte) 122);
                    int var11 = var9.method1445((byte) 104);
                    int var12 = var9.method1455((byte) 62);
                    if (!arg1 && var12 == 1) {
                        var6.field6047--;
                    } else {
                        var6.field6050[var7] = var10;
                        var6.field6049[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field6129[10] + (arg0 == null ? field6129[0] : field6129[1]) + ',' + arg1 + ',' + (arg2 == null ? field6129[0] : field6129[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3229(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3230(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 100;
                    break;
                case 1:
                    var10005 = 11;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
