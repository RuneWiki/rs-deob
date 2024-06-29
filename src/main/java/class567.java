import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class567 {

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Z")
    public boolean field7449 = true;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    private int field7461 = -1;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    private int field7450;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    private int field7453;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lqw;")
    private class77 field7448;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lrv;")
    private class111 field7454;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    private int field7447;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    private int field7452;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Lrh;")
    private class268 field7463;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public int field7460;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Ltr;")
    private class297 field7451;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7455 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field7457 = 0;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[Lkf;")
    public static class256[] field7462;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    private final void method3129(int arg0) {
        field7446++;
        if (!this.field7449) {
            return;
        }
        this.field7449 = false;
        byte[] var2 = this.field7448.field940;
        int var3 = arg0;
        int var4 = this.field7448.field933;
        int var5 = this.field7448.field933 * this.field7453 + this.field7450;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field7451 != null && this.field7461 == var3) {
            this.field7449 = false;
            return;
        }
        this.field7461 = var3;
        int var7 = 0;
        int var8 = this.field7453 * var4 + this.field7450;
        if (!this.field7454.method827(arg0 - 3119, class408.field5668, class155.field2358)) {
            if (class374.field5194 == null) {
                class374.field5194 = new int[16384];
            }
            int[] var13 = class374.field5194;
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
                var8 += this.field7448.field933 - 128;
            }
            if (this.field7451 == null) {
                this.field7451 = this.field7454.method927(128, class374.field5194, (byte) -34, false, 128);
                this.field7451.method595(1645, false, false);
            } else {
                this.field7451.method596(0, 128, 0, 0, 128, class374.field5194, 128, (byte) 81);
            }
            return;
        }
        if (class608.field8084 == null) {
            class608.field8084 = new byte[16384];
        }
        byte[] var9 = class608.field8084;
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
            var8 += this.field7448.field933 - 128;
        }
        if (this.field7451 == null) {
            this.field7451 = this.field7454.method866(class608.field8084, 0, 128, class155.field2358, 128, false);
            this.field7451.method595(arg0 + 1645, false, false);
        } else {
            this.field7451.method593(128, class155.field2358, 128, (byte) -125, 0, 0, 128, 0, class608.field8084);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method3130(byte arg0) {
        field7462 = null;
        field7455 = null;
        int var1 = -40 / ((arg0 - 63) / 62);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lrh;II)V")
    public final void method3131(class268 arg0, int arg1, int arg2) {
        if (arg1 > arg2) {
            this.method3129(0);
            this.field7454.method823(this.field7451, -8423);
            this.field7454.method900(arg0, class322.field4583, arg1, 0, this.field7452 + 1 - this.field7447, this.field7447, arg2 ^ 0xFFFFFF1B);
        }
        field7456++;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public final void method3132(byte arg0) {
        int var2 = -60 / ((arg0 - 10) / 41);
        this.method3131(this.field7463, this.field7460, 0);
        field7459++;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lrv;Lqw;Lvia;IIIII)V")
    public class567(class111 arg0, class77 arg1, class564 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7450 = arg6;
        this.field7453 = arg7;
        this.field7448 = arg1;
        this.field7454 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3992 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7388[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field7451 = null;
            this.field7460 = 0;
        } else {
            this.field7447 = Integer.MAX_VALUE;
            this.field7452 = Integer.MIN_VALUE;
            this.field7463 = this.field7454.method818(-23469, false);
            this.field7463.method585(var10, (byte) 102);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field7463.method587(30907, true);
                if (var15 != null) {
                    Stream var16 = this.field7454.method820((byte) -20, var15);
                    if (Stream.method3739()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3992 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7388[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field7452) {
                                            this.field7452 = var28;
                                        }
                                        if (this.field7447 > var28) {
                                            this.field7447 = var28;
                                        }
                                        var16.method3735(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3992 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7388[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field7447) {
                                            this.field7447 = var22;
                                        }
                                        if (this.field7452 < var22) {
                                            this.field7452 = var22;
                                        }
                                        var16.method3737(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3734();
                    if (this.field7463.method586(-17694)) {
                        break;
                    }
                }
            }
            this.field7460 = var10 / 3;
        }
    }
}
