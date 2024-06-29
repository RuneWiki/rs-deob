import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class58 {

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    private int field699 = 0;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    private int field697 = -1;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "Lro;")
    private class2 field696 = new class2();

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Z")
    public boolean field704 = false;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "[Lmt;")
    private class401[] field695;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "[[I")
    private int[][] field701;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "Lcda;")
    public static class173 field703 = new class173();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZ)[I", line = 3)
    public final int[] method382(int arg0, boolean arg1) {
        if (!arg1) {
            this.field693 = -7;
        }
        field700++;
        if (this.field693 == this.field691) {
            this.field704 = this.field695[arg0] == null;
            this.field695[arg0] = class434.field5974;
            return this.field701[arg0];
        } else if (this.field693 == 1) {
            this.field704 = this.field697 != arg0;
            this.field697 = arg0;
            return this.field701[0];
        } else {
            class401 var3 = this.field695[arg0];
            if (var3 == null) {
                this.field704 = true;
                if (this.field693 <= this.field699) {
                    class401 var4 = (class401) this.field696.method12(0);
                    var3 = new class401(arg0, var4.field5599);
                    this.field695[var4.field5597] = null;
                    var4.method3564(true);
                } else {
                    var3 = new class401(arg0, this.field699);
                    this.field699++;
                }
                this.field695[arg0] = var3;
            } else {
                this.field704 = false;
            }
            this.field696.method13(var3, 593);
            return this.field701[var3.field5599];
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)[[I", line = 72)
    public final int[][] method383(byte arg0) {
        int var2 = -46 % ((arg0 - 42) / 35);
        field698++;
        if (this.field693 != this.field691) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field693; var3++) {
            this.field695[var3] = class434.field5974;
        }
        return this.field701;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V", line = 92)
    public final void method384(byte arg0) {
        for (int var2 = 0; var2 < this.field693; var2++) {
            this.field701[var2] = null;
        }
        field692++;
        this.field695 = null;
        this.field701 = null;
        this.field696.method23(10);
        this.field696 = null;
        int var3 = -102 / ((arg0 - 38) / 44);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lha;B)V", line = 116)
    public static final void method385(class59 arg0, byte arg1) {
        field690++;
        int var2 = 0;
        if (arg1 > -31) {
            return;
        }
        int var3 = 0;
        if (class24.field412) {
            var2 = class367.method2167(-2);
            var3 = class672.method3717((byte) -119);
        }
        int var4 = -10660793;
        class520.method2890(class733.field10151 + var3, class575.field7554, -16777216, var4, class141.field2261, class477.field6534 + var2, false, arg0);
        class64.field785.method527(true, var2 + class477.field6534 + 3, class517.field6864.method2877(class713.field9854, (byte) -108), class733.field10151 + var3 + 14, -1, var4);
        int var5 = var2 + class569.field7492.method780((byte) -90);
        int var6 = var3 + class569.field7492.method772(102);
        if (class163.field2471) {
            int var7 = 0;
            for (class236 var8 = (class236) class592.field7703.method4051(896); var8 != null; var8 = (class236) class592.field7703.method4049(true)) {
                int var12 = var7 * 16 + class733.field10151 + var3 + 31;
                var7++;
                if (var8.field3323 == 1) {
                    class490.method2775(class141.field2261, var12, class477.field6534 + var2, arg0, -1, -256, (byte) 96, (class433) var8.field3322.field10032.field5748, var6, class575.field7554, var5, class733.field10151 + var3);
                } else {
                    class577.method3166(-256, class575.field7554, arg0, class141.field2261, class733.field10151 + var3, -1, var12, var5, var6, var8, 13, class477.field6534 + var2);
                }
            }
            if (class21.field392 != null) {
                class520.method2890(class214.field3121, class366.field5133, -16777216, var4, class274.field3814, class267.field3716, false, arg0);
                int var9 = 0;
                class64.field785.method527(true, class267.field3716 + 3, class21.field392.field3320, class214.field3121 + 14, -1, var4);
                for (class433 var10 = (class433) class21.field392.field3322.method4051(896); var10 != null; var10 = (class433) class21.field392.field3322.method4049(true)) {
                    int var11 = var9 * 16 + class214.field3121 + 31;
                    var9++;
                    class490.method2775(class274.field3814, var11, class267.field3716, arg0, -1, -256, (byte) 24, var10, var6, class366.field5133, var5, class214.field3121);
                }
                class256.method1555(class214.field3121, class267.field3716, class366.field5133, false, class274.field3814);
            }
        } else {
            int var13 = 0;
            for (class433 var14 = (class433) class446.field6126.method21(2); var14 != null; var14 = (class433) class446.field6126.method9(-127)) {
                int var15 = (class181.field2730 - var13 - 1) * 16 + class733.field10151 + var3 + 31;
                var13++;
                class490.method2775(class141.field2261, var15, class477.field6534 + var2, arg0, -1, -256, (byte) 80, var14, var6, class575.field7554, var5, class733.field10151 + var3);
            }
        }
        class256.method1555(class733.field10151 + var3, class477.field6534 + var2, class575.field7554, false, class141.field2261);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lee;I)Lml;", line = 204)
    public static final class392 method386(class677 arg0, int arg1) {
        if (arg1 != 28053) {
            field705 = 34;
        }
        field702++;
        class735 var2 = class556.method3090(arg0, true);
        int var3 = arg0.method3771((byte) -10);
        return new class392(var2.field6522, var2.field6523, var2.field6521, var2.field6528, var2.field6529, var2.field6531, var2.field6526, var2.field6530, var2.field6524, var2.field10168, var2.field10170, var2.field10164, var2.field10171, var2.field10162, var2.field10161, var3);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "()V", line = 221)
    public static final void method387() {
        for (int var0 = class375.field5197; var0 < class225.field3201; var0++) {
            for (int var1 = 0; var1 < class735.field10163; var1++) {
                for (int var2 = 0; var2 < class143.field2290; var2++) {
                    class701 var3 = class660.field8718[var0][var1][var2];
                    if (var3 != null) {
                        class649 var4 = var3.field9729;
                        class649 var5 = var3.field9739;
                        if (var4 != null && var4.method798(-38)) {
                            class384.method2274(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method798(-31)) {
                                class384.method2274(var5, var0, var1, var2, 1, 1);
                                var5.method807(var4, class184.field2781, 0, 117, 0, false, 0);
                                var5.method803(131072);
                            }
                            var4.method803(131072);
                        }
                        for (class10 var6 = var3.field9742; var6 != null; var6 = var6.field174) {
                            class675 var8 = var6.field170;
                            if (var8 != null && var8.method798(103)) {
                                class384.method2274(var8, var0, var1, var2, var8.field9361 + 1 - var8.field9367, var8.field9360 - var8.field9354 + 1);
                                var8.method803(131072);
                            }
                        }
                        class552 var7 = var3.field9738;
                        if (var7 != null && var7.method798(119)) {
                            class372.method2184(var7, var0, var1, var2);
                            var7.method803(131072);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLee;)Lbv;", line = 297)
    public static final class310 method388(byte arg0, class677 arg1) {
        int var2 = -29 / ((42 - arg0) / 40);
        field694++;
        return new class310(arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3771((byte) -10), arg1.method3833(255), arg1.method3833(255), arg1.method3821((byte) 115));
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(III)V", line = 343)
    public class58(int arg0, int arg1, int arg2) {
        this.field693 = arg0;
        this.field691 = arg1;
        this.field695 = new class401[this.field691];
        this.field701 = new int[this.field693][arg2];
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 317)
    public static void method389(int arg0) {
        field703 = null;
        int var1 = 19 / ((40 - arg0) / 43);
    }
}
