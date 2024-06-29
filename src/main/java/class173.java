import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class173 {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lpt;")
    public static class451 field2105;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Ldn;")
    public static class438 field2110;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lvs;")
    public static class506 field2108;

    static {
        new class180("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field2105 = new class451(512);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I", line = 3)
    public final int method962(int arg0) {
        if (arg0 > -50) {
            this.method963((byte) -1, 71);
        }
        field2107++;
        return this.field2099 & 0x3FFF;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V", line = 14)
    public final void method963(byte arg0, int arg1) {
        this.field2099 = arg1;
        this.field2097 = 0;
        if (arg0 != -63) {
            this.field2099 = 109;
        }
        field2102++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 39)
    public final void method964(int arg0) {
        field2101++;
        this.field2099 &= 0x3FFF;
        if (arg0 != 4335) {
            field2105 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 52)
    public static void method965(byte arg0) {
        field2105 = null;
        field2110 = null;
        field2108 = null;
        if (arg0 != -124) {
            method968((byte) -112);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIB)Z", line = 66)
    public final boolean method966(int arg0, int arg1, int arg2, byte arg3) {
        field2104++;
        int var5 = this.field2097;
        if (this.field2099 == arg1 && this.field2097 == 0) {
            return false;
        }
        boolean var8;
        if (this.field2097 == 0) {
            if (arg1 > this.field2099 && this.field2099 + arg2 >= arg1 || arg1 < this.field2099 && arg1 >= this.field2099 - arg2) {
                this.field2099 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field2097 > 0 && this.field2099 < arg1) {
            int var6 = this.field2097 * this.field2097 / (arg2 * 2);
            int var7 = this.field2099 + var6;
            if (arg1 > var7 && var7 >= this.field2099) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field2097 < 0 && arg1 < this.field2099) {
            int var9 = this.field2097 * this.field2097 / (arg2 * 2);
            int var10 = this.field2099 - var9;
            if (arg1 < var10 && this.field2099 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field2099 >= arg1) {
                this.field2097 -= arg2;
                if (arg0 != 0 && -arg0 > this.field2097) {
                    this.field2097 = -arg0;
                }
            } else {
                this.field2097 += arg2;
                if (arg0 != 0 && arg0 < this.field2097) {
                    this.field2097 = arg0;
                }
            }
            if (this.field2097 != var5) {
                int var11 = this.field2097 * this.field2097 / (arg2 * 2);
                if (arg1 <= this.field2099) {
                    if (arg1 < this.field2099 && arg1 > (this.field2099 - var11)) {
                        this.field2097 = var5;
                    }
                } else if ((this.field2099 + var11) > arg1) {
                    this.field2097 = var5;
                }
            }
        } else if (this.field2097 > 0) {
            this.field2097 -= arg2;
            if (this.field2097 < 0) {
                this.field2097 = 0;
            }
        } else {
            this.field2097 += arg2;
            if (this.field2097 > 0) {
                this.field2097 = 0;
            }
        }
        this.field2099 += this.field2097 + var5 >> 1;
        if (arg3 < 36) {
            method968((byte) -77);
        }
        return var8;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILmd;BILmd;IIII)V", line = 203)
    public static final void method967(int arg0, int arg1, class463 arg2, byte arg3, int arg4, class463 arg5, int arg6, int arg7, int arg8, int arg9) {
        field2100++;
        int var10 = arg2.method2671(88);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class52 var12 = (class52) class562.field8256.method3682(0, (long) var10);
        if (var12 == null) {
            class3[] var13 = class3.method14(class39.field299, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class210.field2560.method1101(var13[0], true);
            class562.field8256.method3684(var12, 0, (long) var10);
        }
        class632.method3634(arg7 >> 1, arg0 >> 1, arg5.field8660, 0, arg4, arg5.field8661, arg9, arg5.method2694(28146) * 64, arg5.field8652, (byte) 63);
        int var14 = class34.field271[0] + arg1 - 18;
        int var15 = arg6 / 4 * 18 + var14;
        int var16 = class34.field271[1] + arg8 - 16 - 54;
        int var17 = arg6 % 4 * 18 + var16;
        var12.method299(var15, var17);
        if (arg2 == arg5) {
            class210.field2560.method1151(var17 - 1, 18, -256, 18, (byte) 120, var15 - 1);
        }
        class319 var18 = class66.method371(5000);
        var18.field4067 = var15;
        var18.field4063 = var17 + 16;
        var18.field4062 = var17;
        var18.field4069 = var15 + 16;
        var18.field4064 = arg2;
        class364.field4781.method1991(var18, -94);
        int var19 = -74 / ((6 - arg3) / 56);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V", line = 250)
    public static final void method968(byte arg0) {
        field2106++;
        if (class404.field5317 != null) {
            return;
        }
        class404.field5317 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        int var4 = 6 / ((arg0 + 41) / 32);
        for (int var5 = 0; var5 < 512; var5++) {
            float var6 = ((float) (var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var7 = (float) (var5 & 0x7) / 8.0F + 0.0625F;
            for (int var8 = 0; var8 < 128; var8++) {
                float var9 = (float) var8 / 128.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = 0.0F;
                float var13 = var6 / 60.0F;
                int var14 = (int) var13;
                int var15 = var14 % 6;
                float var16 = var13 - (float) var14;
                float var17 = (1.0F - var7) * var9;
                float var18 = (1.0F - (var7 * var16)) * var9;
                float var19 = (1.0F - ((1.0F - var16) * var7)) * var9;
                if (var15 == 0) {
                    var11 = var19;
                    var12 = var17;
                    var10 = var9;
                } else if (var15 == 1) {
                    var10 = var18;
                    var12 = var17;
                    var11 = var9;
                } else if (var15 == 2) {
                    var12 = var19;
                    var11 = var9;
                    var10 = var17;
                } else if (var15 == 3) {
                    var12 = var9;
                    var10 = var17;
                    var11 = var18;
                } else if (var15 == 4) {
                    var11 = var17;
                    var10 = var19;
                    var12 = var9;
                } else if (var15 == 5) {
                    var12 = var18;
                    var11 = var17;
                    var10 = var9;
                }
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                float var22 = (float) Math.pow((double) var12, var1);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (int) (var22 * 256.0F);
                int var26 = (var23 << 16) + (var24 << 8) + var25 - 16777216;
                class404.field5317[var3++] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILfa;)V", line = 374)
    public static final void method969(int arg0, int arg1, int arg2, int arg3, class197 arg4) {
        field2103++;
        long var5 = (long) (arg3 << 28 | arg2 << 14 | arg1);
        class36 var7 = (class36) class150.field1787.method2645(var5, (byte) -101);
        if (var7 == null) {
            class36 var8 = new class36();
            class150.field1787.method2640(1, var5, var8);
            var8.field280.method1040(arg4, -106);
            return;
        }
        class607 var9 = class449.field6217.method2026((byte) -80, arg4.field2386);
        int var10 = var9.field8745;
        if (var9.field8796 == 1) {
            var10 = (arg4.field2384 + 1) * var10;
        }
        if (arg0 <= 7) {
            return;
        }
        for (class197 var11 = (class197) var7.field280.method1050((byte) 73); var11 != null; var11 = (class197) var7.field280.method1047(-7962)) {
            class607 var12 = class449.field6217.method2026((byte) -88, var11.field2386);
            int var13 = var12.field8745;
            if (var12.field8796 == 1) {
                var13 = (var11.field2384 + 1) * var13;
            }
            if (var10 > var13) {
                class530.method3019(arg4, var11, -311981535);
                return;
            }
        }
        var7.field280.method1040(arg4, -107);
    }
}
