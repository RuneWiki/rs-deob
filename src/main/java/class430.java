import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class430 {

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Z")
    public boolean field6275 = true;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    private int field6277 = -1;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lnd;")
    private class632 field6267;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    private int field6276;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lhg;")
    private class448 field6266;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    private int field6279;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public int field6263;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Ldea;")
    private class405 field6271;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    private int field6270;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    private int field6265;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lsp;")
    private class620 field6262;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lbv;")
    public static class567 field6272 = new class567("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field6274 = 0;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lha;")
    public static class116 field6278;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILsp;B)V", line = 4)
    public final void method2560(int arg0, class620 arg1, byte arg2) {
        field6273++;
        if (arg0 > 0) {
            this.method2561((byte) -90);
            this.field6267.method3577(this.field6271, true);
            this.field6267.method134(class12.field118, 0, this.field6265 + 1 - this.field6270, arg0, arg1, 10, this.field6270);
        }
        if (arg2 != 118) {
            this.field6267 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 25)
    private final void method2561(byte arg0) {
        field6264++;
        if (!this.field6275) {
            return;
        }
        this.field6275 = false;
        byte[] var2 = this.field6266.field6520;
        int var3 = 0;
        if (arg0 >= -63) {
            field6274 = 97;
        }
        int var4 = this.field6266.field6523;
        int var5 = this.field6276 + (this.field6266.field6523 * this.field6279);
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field6271 != null && this.field6277 == var3) {
            this.field6275 = false;
            return;
        }
        this.field6277 = var3;
        int var7 = this.field6279 * var4 + this.field6276;
        int var8 = 0;
        if (!this.field6267.method144(-99, class343.field4922, class384.field5715)) {
            if (class147.field2250 == null) {
                class147.field2250 = new int[16384];
            }
            int[] var13 = class147.field2250;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var7 + var4] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field6266.field6523 - 128;
            }
            if (this.field6271 == null) {
                this.field6271 = this.field6267.method3587(false, 128, class147.field2250, 128, (byte) -66);
                this.field6271.method1535(false, false, 95);
            } else {
                this.field6271.method1537(0, 128, true, 128, class147.field2250, 0, 0, 128);
            }
            return;
        }
        if (class260.field3784 == null) {
            class260.field3784 = new byte[16384];
        }
        byte[] var9 = class260.field3784;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var7] == 0) {
                    int var12 = 0;
                    if (var2[var7 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var7 + var4] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field6266.field6523 - 128;
        }
        if (this.field6271 == null) {
            this.field6271 = this.field6267.method3596(128, 128, false, 0, class260.field3784, class384.field5715);
            this.field6271.method1535(false, false, 1);
        } else {
            this.field6271.method1534(21145, 128, class384.field5715, 0, 128, 0, class260.field3784, 0, 128);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 197)
    public final void method2562(int arg0) {
        this.method2560(this.field6263, this.field6262, (byte) 118);
        field6268++;
        int var2 = -65 / ((arg0 - 48) / 61);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[[[Lbr;)V", line = 210)
    public static final void method2563(byte arg0, class184[][][] arg1) {
        field6269++;
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class184[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class184 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2662 instanceof class231) {
                            ((class231) var6.field2662).method270(-108);
                        }
                        if (var6.field2672 instanceof class231) {
                            ((class231) var6.field2672).method270(56);
                        }
                        if (var6.field2666 instanceof class231) {
                            ((class231) var6.field2666).method270(110);
                        }
                        if (var6.field2669 instanceof class231) {
                            ((class231) var6.field2669).method270(79);
                        }
                        if (var6.field2653 instanceof class231) {
                            ((class231) var6.field2653).method270(-117);
                        }
                        for (class277 var7 = var6.field2675; var7 != null; var7 = var7.field4045) {
                            class360 var8 = var7.field4044;
                            if (var8 instanceof class231) {
                                ((class231) var8).method270(-91);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 < 113) {
            field6278 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V", line = 288)
    public static void method2564(byte arg0) {
        field6278 = null;
        field6272 = null;
        if (arg0 != 5) {
            method2564((byte) 87);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lnd;Lhg;Lhm;IIIII)V", line = 318)
    public class430(class632 arg0, class448 arg1, class460 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6267 = arg0;
        this.field6276 = arg6;
        this.field6266 = arg1;
        this.field6279 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field7541 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field6650[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field6263 = 0;
            this.field6271 = null;
        } else {
            this.field6270 = Integer.MAX_VALUE;
            this.field6265 = Integer.MIN_VALUE;
            this.field6262 = this.field6267.method98(false, (byte) 14);
            this.field6262.method252(49, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field6262.method251(true, (byte) 60);
                if (var15 != null) {
                    Stream var16 = this.field6267.method3588(var15, (byte) 72);
                    if (Stream.method3248()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field7541 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field6650[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field6270 > var28) {
                                            this.field6270 = var28;
                                        }
                                        if (this.field6265 < var28) {
                                            this.field6265 = var28;
                                        }
                                        var16.method3244(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field7541 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field6650[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field6270 > var22) {
                                            this.field6270 = var22;
                                        }
                                        if (var22 > this.field6265) {
                                            this.field6265 = var22;
                                        }
                                        var16.method3238(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3246();
                    if (this.field6262.method245(-11359)) {
                        break;
                    }
                }
            }
            this.field6263 = var10 / 3;
        }
    }
}
