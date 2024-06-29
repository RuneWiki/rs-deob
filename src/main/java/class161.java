import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class161 extends class89 {

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    private int field2834 = 4096;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "I")
    private int field2844 = 16;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
    private int field2842 = 0;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "I")
    private int field2847 = 2000;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "I")
    private int field2845 = 0;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "Lha;")
    public static class46 field2838 = class271.method1828("<img=1>", -46);

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "I")
    public static int field2848 = 0;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "[J")
    public static long[] field2846 = new long[256];

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!nk", name = "jb", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "Lgi;")
    public static class256 field2840;

    @OriginalMember(owner = "client!nk", name = "kb", descriptor = "Ljava/awt/Frame;")
    public static Frame field2851;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "[[[I")
    public static int[][][] field2839;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZII)V")
    public static final void method1174(boolean arg0, int arg1, int arg2) {
        class234.field4064[arg1] = arg2;
        if (!arg0) {
            method1178((byte) -109);
        }
        ++field2837;
        class152 var3 = (class152) class15.field226.method1601(126, (long) arg1);
        if (var3 == null) {
            class152 var4 = new class152(4611686018427387905L);
            class15.field226.method1597((long) arg1, (byte) -126, var4);
        } else if (~var3.field2699 != -4611686018427387906L) {
            var3.field2699 = 500L + class223.method1537(-26619) | 4611686018427387904L;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
    public static final void method1175(int arg0) {
        ++field2836;
        if (~class255.field4471 != 0 && class113.field2150 != -1) {
            int var1 = ((-class214.field3799 + class76.field1413) * class50.field859 >> 16) + class214.field3799;
            class50.field859 += var1;
            if (~class50.field859 <= -65536) {
                if (!client.field4700) {
                    class17.field252 = true;
                } else {
                    class17.field252 = false;
                }
                class50.field859 = 65535;
                client.field4700 = true;
            } else {
                client.field4700 = false;
                class17.field252 = false;
            }
            float var2 = (float) class50.field859 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class102.field1862 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class197.field3536[class255.field4471][var4 + 1][var5] * 3;
                int var22 = class197.field3536[class255.field4471][var4][var5] * 3;
                int var23 = (class197.field3536[class255.field4471][var4 + 2][var5] - class197.field3536[class255.field4471][var4 + 3][var5] + class197.field3536[class255.field4471][var4 - -2][var5]) * 3;
                int var24 = var21 - var22;
                int var25 = var22 - -var23 + -(var21 * 2);
                int var26 = class197.field3536[class255.field4471][var4][var5];
                int var27 = class197.field3536[class255.field4471][var4 + 2][var5] - var26 + -var23 + var21;
                var3[var5] = (((float) var27 * var2 + (float) var25) * var2 + (float) var24) * var2 + (float) var26;
            }
            class134.field2425 = (int) var3[2] - class77.field1432 * 128;
            field2849 = (int) var3[0] + -(class29.field567 * 128);
            float[] var6 = new float[3];
            int var7 = class4.field72 * 2;
            class26.field513 = (int) var3[1] * -1;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class197.field3536[class113.field2150][var7][var8] * 3;
                int var15 = class197.field3536[class113.field2150][var7 - -1][var8] * 3;
                int var16 = (class197.field3536[class113.field2150][var7 + 2][var8] - (class197.field3536[class113.field2150][var7 + 3][var8] - class197.field3536[class113.field2150][var7 + 2][var8])) * 3;
                int var17 = class197.field3536[class113.field2150][var7][var8];
                int var18 = -var14 + var15;
                int var19 = var14 - -var16 + -(var15 * 2);
                int var20 = class197.field3536[class113.field2150][var7 + 2][var8] + -var16 - (-var15 + var17);
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] - var3[0];
            float var10 = var6[2] - var3[2];
            float var11 = (var6[1] + -var3[1]) * -1.0F;
            double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
            class16.field234 = (float) Math.atan2((double) var11, var12);
            class245.field4353 = -((float) Math.atan2((double) var9, (double) var10));
            class10.field178 = (int) ((double) class245.field4353 * 325.949D) & 2047;
            class57.field958 = 2047 & (int) ((double) class16.field234 * 325.949D);
            if (arg0 < 97) {
                field2838 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        ++field2833;
        if (!arg0) {
            method1178((byte) -88);
        }
        class49.method365((byte) 122);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int[] var3 = super.field1688.method936(1, arg0);
        ++field2832;
        int var4 = 97 / ((arg1 - 51) / 44);
        if (super.field1688.field2200) {
            int var5 = this.field2834 >> 1;
            int[][] var6 = super.field1688.method934(26428);
            Random var7 = new Random((long) this.field2842);
            for (int var8 = 0; var8 < this.field2847; ++var8) {
                int var9 = this.field2834 <= 0 ? this.field2845 : this.field2845 - (-class98.method761(var7, false, this.field2834) + var5);
                int var10 = 255 & var9 >> 4;
                int var11 = class98.method761(var7, false, class241.field4284);
                int var12 = class98.method761(var7, false, class113.field2149);
                int var13 = var11 - -(class142.field2594[var10] * this.field2844 >> 12);
                int var14 = (class260.field4541[var10] * this.field2844 >> 12) + var12;
                int var15 = -var11 + var13;
                int var16 = -var12 + var14;
                if (var15 != 0 || ~var16 != -1) {
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var17 = var16 > var15;
                    if (var17) {
                        int var18 = var11;
                        var11 = var12;
                        var12 = var18;
                        int var19 = var13;
                        var13 = var14;
                        var14 = var19;
                    }
                    if (~var13 > ~var11) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var12 = var14;
                        var13 = var20;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = -var12 + var14;
                    int var24 = var13 - var11;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var25 = -var24 / 2;
                    int var26 = 1024 - (class98.method761(var7, false, 4096) >> 2);
                    int var27 = 2048 / var24;
                    int var28 = ~var12 > ~var14 ? 1 : -1;
                    for (int var29 = var11; ~var13 < ~var29; ++var29) {
                        int var30 = var26 - -((var29 - var11) * var27) + 1024;
                        var25 += var23;
                        int var31 = var22 & class231.field4015;
                        int var32 = class115.field2177 & var29;
                        if (var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        if (var25 > 0) {
                            var22 += var28;
                            var25 -= var24;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILl;)V")
    public static final void method1176(int arg0, class65 arg1) {
        ++field2835;
        long var2 = 0L;
        int var4 = -1;
        if (arg1.field1103 == 0) {
            var2 = class264.method1779(arg1.field1109, arg1.field1094, arg1.field1096);
        }
        int var5 = 0;
        if (~arg1.field1103 == -2) {
            var2 = class142.method1073(arg1.field1109, arg1.field1094, arg1.field1096);
        }
        if (arg1.field1103 == 2) {
            var2 = class99.method765(arg1.field1109, arg1.field1094, arg1.field1096);
        }
        int var6 = -20 / ((35 - arg0) / 59);
        int var7 = 0;
        if (arg1.field1103 == 3) {
            var2 = class57.method397(arg1.field1109, arg1.field1094, arg1.field1096);
        }
        if (~var2 != -1L) {
            var5 = (int) var2 >> 20 & 3;
            var7 = ((int) var2 & 518196) >> 14;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg1.field1091 = var4;
        arg1.field1092 = var5;
        arg1.field1112 = var7;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)I")
    public static final int method1177(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 38 / ((-17 - arg3) / 60);
        ++field2841;
        int var5 = arg0 & 3;
        if (~var5 == -1) {
            return arg2;
        } else if (var5 == 1) {
            return arg1;
        } else {
            return ~var5 == -3 ? 7 - arg2 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V")
    public static void method1178(byte arg0) {
        field2838 = null;
        field2840 = null;
        field2851 = null;
        field2846 = null;
        field2839 = null;
        if (arg0 != 50) {
            field2849 = -47;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field2834 = arg0.method545((byte) 53);
                        }
                    } else {
                        this.field2845 = arg0.method545((byte) 58);
                    }
                } else {
                    this.field2844 = arg0.method558(arg1 + 641641493);
                }
            } else {
                this.field2847 = arg0.method545((byte) -60);
            }
        } else {
            this.field2842 = arg0.method558(1);
        }
        ++field2843;
        if (arg1 != -641641492) {
            this.method8(true);
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(1L & var1) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                }
            }
            field2846[var0] = var1;
        }
    }
}
