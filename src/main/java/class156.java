import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class156 {

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
    private int field2418 = -1;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "Z")
    public boolean field2421 = true;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "Lpj;")
    private class38 field2410;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    private int field2414;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "Lvda;")
    private class8 field2419;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "Lrm;")
    private class90 field2411;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    private int field2415;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    private int field2425;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "Loq;")
    private class743 field2412;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "Lcb;")
    public static class631 field2424 = new class631(39, 4);

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z")
    public static final boolean method1169(int arg0, int arg1, int arg2) {
        if (arg0 < 37) {
            return false;
        } else {
            field2413++;
            return (arg1 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public final void method1170(int arg0) {
        if (arg0 == 0) {
            this.method1172(arg0 ^ 0xFFFFD856, this.field2416, this.field2412);
            field2420++;
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field2424 = null;
        if (arg0 != -3566) {
            field2424 = null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILoq;)V")
    public final void method1172(int arg0, int arg1, class743 arg2) {
        if (arg0 != -10154) {
            this.method1170(-115);
        }
        if (arg1 > 0) {
            this.method1173((byte) 119);
            this.field2410.method215(8, this.field2411);
            this.field2410.method289(arg1, this.field2415 + 1 - this.field2425, this.field2425, arg2, 0, class386.field5775, 0);
        }
        field2417++;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V")
    private final void method1173(byte arg0) {
        field2423++;
        if (!this.field2421) {
            return;
        }
        this.field2421 = false;
        byte[] var2 = this.field2419.field88;
        int var3 = 0;
        int var4 = this.field2419.field86;
        int var5 = this.field2419.field86 * this.field2414 + this.field2422;
        int var6 = -128;
        if (arg0 != 119) {
            method1171(14);
        }
        while (var6 < 0) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
            var6++;
        }
        if (this.field2411 != null && this.field2418 == var3) {
            this.field2421 = false;
            return;
        }
        this.field2418 = var3;
        int var7 = 0;
        int var8 = this.field2414 * var4 + this.field2422;
        if (!this.field2410.method399(18154, class121.field1859, class215.field3556)) {
            if (class227.field3632 == null) {
                class227.field3632 = new int[16384];
            }
            int[] var13 = class227.field3632;
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
                        if (var2[var8 + var4] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field2419.field86 - 128;
            }
            if (this.field2411 == null) {
                this.field2411 = this.field2410.method265(128, false, 128, class227.field3632, 0);
                this.field2411.method597(-18, false, false);
            } else {
                this.field2411.method587(128, class227.field3632, 0, 128, 17432, 128, 0, 0);
            }
            return;
        }
        if (class417.field6145 == null) {
            class417.field6145 = new byte[16384];
        }
        byte[] var9 = class417.field6145;
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
                    if (var2[var8 + var4] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field2419.field86 - 128;
        }
        if (this.field2411 == null) {
            this.field2411 = this.field2410.method391(class417.field6145, 128, false, class215.field3556, 128, -128);
            this.field2411.method597(arg0 - 246, false, false);
        } else {
            this.field2411.method594(128, class215.field3556, arg0 ^ 0xFFFF8169, 0, 0, 128, 0, 128, class417.field6145);
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lpj;Lvda;Lvha;IIIII)V")
    public class156(class38 arg0, class8 arg1, class63 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2410 = arg0;
        this.field2414 = arg7;
        this.field2422 = arg6;
        this.field2419 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4956 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field1016[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field2416 = 0;
            this.field2411 = null;
        } else {
            this.field2415 = Integer.MIN_VALUE;
            this.field2425 = Integer.MAX_VALUE;
            this.field2412 = this.field2410.method428(-108, false);
            this.field2412.method924((byte) -80, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field2412.method926(true, -29944);
                if (var15 != null) {
                    Stream var16 = this.field2410.method368((byte) -121, var15);
                    if (Stream.method2572()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4956 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field1016[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field2415 < var22) {
                                            this.field2415 = var22;
                                        }
                                        if (this.field2425 > var22) {
                                            this.field2425 = var22;
                                        }
                                        var16.method2585(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4956 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field1016[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field2425 > var28) {
                                            this.field2425 = var28;
                                        }
                                        if (var28 > this.field2415) {
                                            this.field2415 = var28;
                                        }
                                        var16.method2584(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2573();
                    if (this.field2412.method925((byte) 30)) {
                        break;
                    }
                }
            }
            this.field2416 = var10 / 3;
        }
    }
}
