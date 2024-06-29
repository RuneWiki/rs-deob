import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
    public boolean field126 = true;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    private int field137 = -1;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lkd;")
    private class188 field121;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Ler;")
    private class70 field125;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lfo;")
    private class361 field133;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lpl;")
    private class463 field122;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lfj;")
    private class469 field124;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    private final void method64(int arg0) {
        field131++;
        if (!this.field126) {
            return;
        }
        this.field126 = false;
        byte[] var2 = this.field125.field997;
        byte[] var3 = this.field121.field3170;
        int var4 = 0;
        int var5 = 67 / ((-arg0 - 4) / 50);
        int var6 = this.field125.field990;
        int var7 = this.field125.field990 * this.field127 + this.field132;
        for (int var8 = -128; var8 < 0; var8++) {
            var4 = (var4 << 8) - var4;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var2[var7++] != 0) {
                    var4++;
                }
            }
            var7 += var6 - 128;
        }
        if (this.field133 != null && this.field137 == var4) {
            this.field126 = false;
            return;
        }
        this.field137 = var4;
        int var9 = this.field127 * var6 + this.field132;
        int var10 = 0;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var9] == 0) {
                    int var13 = 0;
                    if (var2[var9 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 - var6] != 0) {
                        var13++;
                    }
                    if (var2[var6 + var9] != 0) {
                        var13++;
                    }
                    var3[var10++] = (byte) (var13 * 17);
                } else {
                    var3[var10++] = 68;
                }
                var9++;
            }
            var9 += this.field125.field990 - 128;
        }
        if (this.field133 == null) {
            this.field133 = new class361(this.field121, 3553, 6406, 128, 128, false, this.field121.field3170, 6406, false);
            this.field133.method2270(false, false, 10243);
            this.field133.method2757(true, -52);
        } else {
            this.field133.method2265(this.field121.field3170, 0, 0, false, 0, 0, 128, 6406, 128, -103);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public final void method65(int arg0) {
        this.method68(this.field122, -128, this.field130);
        field135++;
        if (arg0 != 0) {
            this.field137 = 106;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III[B)V")
    public final void method66(int arg0, int arg1, int arg2, byte[] arg3) {
        this.field124.method153(arg0 * this.field121.method1311(arg1, (byte) -67), arg1, (byte) -68, arg3);
        field129++;
        this.method68(this.field124, 44, arg0);
        if (arg2 != 0) {
            method69(109);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static final void method67(int arg0) {
        field128++;
        if (!class193.field3258.method938(class96.field1384, -36) && class61.field726 != class154.field2286) {
            class366.method2290(class136.field2073, false, class517.field7520, 10, 8);
        } else if (arg0 == -1) {
            class244.method1663((byte) 27, class377.field5692);
            if (class271.field4154 != class154.field2286) {
                class211.method1465(true);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lpl;II)V")
    private final void method68(class463 arg0, int arg1, int arg2) {
        field136++;
        if (arg2 != 0) {
            this.method64(96);
            this.field121.method1289(-19391, this.field133);
            this.field121.method1270(arg0, arg2, 0, 4, -2);
            int var4 = 115 % ((-arg1 - 44) / 52);
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public static final void method69(int arg0) {
        field123++;
        class265.field4073 = class238.field3819.method1523(3643);
        int var1 = class238.field3819.method1549(-2);
        int var2 = class238.field3819.method1511(115);
        int var3 = class238.field3819.method1523(arg0 ^ 0xE3B);
        boolean var4 = class238.field3819.method1532((byte) -7) == 1;
        class282.method1834(var3, arg0 ^ 0x4);
        class238.field3819.method1756(arg0 ^ 0xFFFFFF89);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class69.field976 >> 3); var20++) {
                for (int var21 = 0; var21 < (class285.field4328 >> 3); var21++) {
                    int var22 = class238.field3819.method1760(1, true);
                    if (var22 == 1) {
                        class294.field4484[var5][var20][var21] = class238.field3819.method1760(26, true);
                    } else {
                        class294.field4484[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class238.field3819.method1757(arg0 - 120);
        int var6 = (class142.field2164 - class238.field3819.field3556) / 16;
        class487.field7011 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class487.field7011[var7][var19] = class238.field3819.method1556(107);
            }
        }
        class349.field5163 = new byte[var6][];
        class258.field3971 = new int[var6];
        class464.field6723 = new int[var6];
        class60.field719 = new byte[var6][];
        class155.field2311 = new byte[var6][];
        class505.field7380 = new int[var6];
        class286.field4337 = null;
        class301.field4569 = new byte[var6][];
        class485.field6975 = new int[var6];
        class71.field1021 = null;
        class147.field2229 = new int[var6];
        int var8 = 0;
        for (int var9 = arg0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class69.field976 >> 3); var10++) {
                for (int var11 = 0; var11 < (class285.field4328 >> 3); var11++) {
                    int var12 = class294.field4484[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FFA) >> 3;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class505.field7380[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class505.field7380[var8] = var15;
                            int var17 = (var15 & 0xFF82) >> 8;
                            int var18 = var15 & 0xFF;
                            class464.field6723[var8] = class430.field6378.method2537("m" + var17 + "_" + var18, -45);
                            class485.field6975[var8] = class430.field6378.method2537("l" + var17 + "_" + var18, -91);
                            class258.field3971[var8] = class430.field6378.method2537("um" + var17 + "_" + var18, 90);
                            class147.field2229[var8] = class430.field6378.method2537("ul" + var17 + "_" + var18, -60);
                            var8++;
                        }
                    }
                }
            }
        }
        class366.method2290(var1, var4, var2, 10, 8);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lkd;Ler;Llk;IIIII)V")
    public class9(class188 arg0, class70 arg1, class417 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field127 = arg7;
        this.field121 = arg0;
        this.field125 = arg1;
        this.field132 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2207 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field6228[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field130 = var10;
        if (var10 <= 0) {
            this.field133 = null;
        } else {
            class217 var14 = new class217(var10 * 2);
            if (this.field121.field3141) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2207 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field6228[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1542(var18[var19] & 0xFFFF, -2756);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2207 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field6228[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1504((byte) 104, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field122 = this.field121.method1321(5123, var14.field3572, false, var14.field3556, true);
            this.field124 = new class469(this.field121, 5123, null, 1);
        }
    }
}
