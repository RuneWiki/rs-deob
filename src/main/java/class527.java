import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class527 {

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    private int field7438 = -1;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Z")
    public boolean field7435 = true;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    private int field7424;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    private int field7439;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lmj;")
    private class344 field7430;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lws;")
    private class580 field7433;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    private int field7432;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    private int field7436;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lmda;")
    private class17 field7429;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public int field7425;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Lpm;")
    private class134 field7437;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lcj;")
    public static class178 field7428;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Z")
    public static boolean field7431;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lmda;BI)V")
    public final void method2967(class17 arg0, byte arg1, int arg2) {
        field7426++;
        int var4 = 107 / ((-arg1 - 28) / 58);
        if (arg2 > 0) {
            this.method2969(-90);
            this.field7430.method1997(126, this.field7437);
            this.field7430.method1276(0, arg2, this.field7432 + 1 - this.field7436, false, class538.field7582, arg0, this.field7436);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static final void method2968(byte arg0) {
        class421.field5610 = -1;
        class256.field3204 = null;
        field7440++;
        if (arg0 != -26) {
            field7428 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    private final void method2969(int arg0) {
        field7427++;
        if (!this.field7435) {
            return;
        }
        this.field7435 = false;
        byte[] var2 = this.field7433.field8194;
        int var3 = 0;
        int var4 = this.field7433.field8202;
        int var5 = this.field7433.field8202 * this.field7424 + this.field7439;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field7437 != null && this.field7438 == var3) {
            this.field7435 = false;
            return;
        }
        this.field7438 = var3;
        int var7 = 0;
        if (arg0 >= -38) {
            this.field7435 = false;
        }
        int var8 = this.field7424 * var4 + this.field7439;
        if (!this.field7430.method1334(1, class179.field2008, class274.field3431)) {
            if (class204.field2405 == null) {
                class204.field2405 = new int[16384];
            }
            int[] var13 = class204.field2405;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field7433.field8202 - 128;
            }
            if (this.field7437 == null) {
                this.field7437 = this.field7430.method1983(false, (byte) 113, 128, 128, class204.field2405);
                this.field7437.method759(false, -19314, false);
            } else {
                this.field7437.method753(128, 128, 0, 0, class204.field2405, (byte) -121, 128, 0);
            }
            return;
        }
        if (class652.field9155 == null) {
            class652.field9155 = new byte[16384];
        }
        byte[] var9 = class652.field9155;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field7433.field8202 - 128;
        }
        if (this.field7437 == null) {
            this.field7437 = this.field7430.method2046(128, class652.field9155, (byte) 109, 128, class274.field3431, false);
            this.field7437.method759(false, -19314, false);
        } else {
            this.field7437.method757(0, 128, class652.field9155, 0, 128, 0, 128, class274.field3431, 13031);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public static void method2970(int arg0) {
        field7428 = null;
        if (arg0 != -17019) {
            method2968((byte) 20);
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
    public final void method2971(int arg0) {
        this.method2967(this.field7429, (byte) -107, this.field7425);
        if (arg0 != -1) {
            this.field7432 = 30;
        }
        field7434++;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lmj;Lws;Lbh;IIIII)V")
    public class527(class344 arg0, class580 arg1, class547 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7424 = arg7;
        this.field7439 = arg6;
        this.field7430 = arg0;
        this.field7433 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3428 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7809[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field7425 = 0;
            this.field7437 = null;
        } else {
            this.field7432 = Integer.MIN_VALUE;
            this.field7436 = Integer.MAX_VALUE;
            this.field7429 = this.field7430.method1326(-86, false);
            this.field7429.method73(var10, (byte) -55);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field7429.method75(true, 21281);
                if (var15 != null) {
                    Stream var16 = this.field7430.method1980((byte) -74, var15);
                    if (Stream.method3480()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3428 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7809[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field7432 < var28) {
                                            this.field7432 = var28;
                                        }
                                        if (var28 < this.field7436) {
                                            this.field7436 = var28;
                                        }
                                        var16.method3468(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3428 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7809[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field7436 > var22) {
                                            this.field7436 = var22;
                                        }
                                        if (var22 > this.field7432) {
                                            this.field7432 = var22;
                                        }
                                        var16.method3478(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3472();
                    if (this.field7429.method71(-26305)) {
                        break;
                    }
                }
            }
            this.field7425 = var10 / 3;
        }
    }
}
