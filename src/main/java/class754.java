import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class754 {

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    private int field10447 = -1;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "Z")
    public boolean field10459 = true;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    private int field10457;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "Lwg;")
    private class449 field10453;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "Lvo;")
    private class47 field10454;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    private int field10449;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "Lada;")
    private class175 field10448;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public int field10451;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    private int field10456;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    private int field10455;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Lje;")
    private class422 field10450;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "Lhj;")
    public static class596 field10446 = new class596(123, -2);

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field10460 = -1;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static void method4210(int arg0) {
        if (arg0 > -72) {
            field10446 = null;
        }
        field10446 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
    private final void method4211(boolean arg0) {
        field10445++;
        if (!this.field10459) {
            return;
        }
        this.field10459 = false;
        byte[] var2 = this.field10454.field624;
        int var3 = 0;
        int var4 = this.field10454.field630;
        int var5 = this.field10454.field630 * this.field10449 + this.field10457;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field10448 != null && this.field10447 == var3) {
            this.field10459 = false;
            return;
        }
        this.field10447 = var3;
        if (!arg0) {
            return;
        }
        int var7 = this.field10449 * var4 + this.field10457;
        int var8 = 0;
        if (!this.field10453.method42(class748.field10384, class205.field2451, 107)) {
            if (class271.field3197 == null) {
                class271.field3197 = new int[16384];
            }
            int[] var9 = class271.field3197;
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
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field10454.field630 - 128;
            }
            if (this.field10448 == null) {
                this.field10448 = this.field10453.method2712(false, 128, 128, 0, class271.field3197);
                this.field10448.method1198(false, false, (byte) 0);
            } else {
                this.field10448.method1194(128, 0, 0, 128, class271.field3197, 128, (byte) -96, 0);
            }
            return;
        }
        if (class393.field5092 == null) {
            class393.field5092 = new byte[16384];
        }
        byte[] var13 = class393.field5092;
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
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field10454.field630 - 128;
        }
        if (this.field10448 == null) {
            this.field10448 = this.field10453.method2653(128, -46, false, class393.field5092, class205.field2451, 128);
            this.field10448.method1198(false, false, (byte) 93);
        } else {
            this.field10448.method1195(0, 0, -6201, 0, class393.field5092, 128, class205.field2451, 128, 128);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILje;)V")
    public final void method4212(int arg0, int arg1, class422 arg2) {
        field10458++;
        if (arg1 > 0) {
            this.method4211(true);
            this.field10453.method2643(-2, this.field10448);
            this.field10453.method1(arg2, (byte) 10, this.field10455 + 1 - this.field10456, class67.field920, 0, arg1, this.field10456);
        }
        if (arg0 != 13641) {
            method4210(103);
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(Z)V")
    public final void method4213(boolean arg0) {
        if (arg0) {
            this.field10455 = -49;
        }
        field10452++;
        this.method4212(13641, this.field10451, this.field10450);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lda;)V")
    public static final void method4214(class67 arg0) {
        class301.field3607 = arg0;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lwg;Lvo;Lll;IIIII)V")
    public class754(class449 arg0, class47 arg1, class385 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field10457 = arg6;
        this.field10453 = arg0;
        this.field10454 = arg1;
        this.field10449 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3533 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field4943[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field10448 = null;
            this.field10451 = 0;
        } else {
            this.field10456 = Integer.MAX_VALUE;
            this.field10455 = Integer.MIN_VALUE;
            this.field10450 = this.field10453.method15(false, false);
            this.field10450.method2529(104, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field10450.method2527((byte) -84, true);
                if (var15 != null) {
                    Stream var16 = this.field10453.method2650((byte) -62, var15);
                    if (Stream.method3985()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3533 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field4943[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field10456 > var22) {
                                            this.field10456 = var22;
                                        }
                                        if (this.field10455 < var22) {
                                            this.field10455 = var22;
                                        }
                                        var16.method3991(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3533 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field4943[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field10455) {
                                            this.field10455 = var28;
                                        }
                                        if (var28 < this.field10456) {
                                            this.field10456 = var28;
                                        }
                                        var16.method3988(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3992();
                    if (this.field10450.method2526(1234)) {
                        break;
                    }
                }
            }
            this.field10451 = var10 / 3;
        }
    }
}
