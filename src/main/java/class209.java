import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class209 extends class326 {

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    private int field2829 = 4096;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    private int field2830 = 0;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    private int field2824 = 0;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    private int field2827 = 16;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    private int field2819 = 2000;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "Lhu;")
    public static class76 field2828 = new class76(8);

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "Ljava/util/Random;")
    public static Random field2831 = new Random();

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "Lr;")
    public static class110 field2833;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "Lr;")
    public static class110 field2834;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field2832;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 5)
    public class209() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)[I", line = 9)
    public final int[] method30(byte arg0, int arg1) {
        ++field2822;
        int[] var3 = super.field4344.method130(arg1, -95);
        if (arg0 > -6) {
            this.method30((byte) -54, -32);
        }
        if (super.field4344.field286) {
            int var4 = this.field2829 >> 1;
            int[][] var5 = super.field4344.method132(0);
            Random var6 = new Random((long) this.field2830);
            for (int var7 = 0; ~this.field2819 < ~var7; ++var7) {
                int var8 = this.field2829 <= 0 ? this.field2824 : this.field2824 - -class257.method1447(20094, this.field2829, var6) - var4;
                int var9 = (4092 & var8) >> 4;
                int var10 = class257.method1447(20094, class181.field2495, var6);
                int var11 = class257.method1447(20094, class27.field359, var6);
                int var12 = var10 - -(class461.field6247[var9] * this.field2827 >> 12);
                int var13 = var11 - -(class7.field90[var9] * this.field2827 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class257.method1447(20094, 4096, var6) >> 2);
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class459.field6226;
                        int var31 = class266.field3509 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 -= -var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 145)
    public static final void method1189(String arg0, int arg1) {
        ++field2823;
        if (arg0 != null) {
            if ((~class90.field1317 > -101 || class164.field2275) && ~class90.field1317 > -201) {
                String var2 = class92.method589(arg1 ^ -27599, arg0);
                if (var2 != null) {
                    for (int var3 = 0; ~class90.field1317 < ~var3; ++var3) {
                        String var7 = class92.method589(33, class233.field3106[var3]);
                        if (var7 != null && var7.equals(var2)) {
                            class78.method514(0, arg0 + class177.field2406.method1176(class110.field1676, (byte) -88));
                            return;
                        }
                        if (class405.field5554[var3] != null) {
                            String var8 = class92.method589(arg1 ^ -27645, class405.field5554[var3]);
                            if (var8 != null && var8.equals(var2)) {
                                class78.method514(0, arg0 + class177.field2406.method1176(class110.field1676, (byte) -96));
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; ~var4 > ~class65.field865; ++var4) {
                        String var5 = class92.method589(35, class34.field524[var4]);
                        if (var5 != null && var5.equals(var2)) {
                            class78.method514(0, class7.field91.method1176(class110.field1676, (byte) -115) + arg0 + class370.field5066.method1176(class110.field1676, (byte) -118));
                            return;
                        }
                        if (class31.field424[var4] != null) {
                            String var6 = class92.method589(121, class31.field424[var4]);
                            if (var6 != null && var6.equals(var2)) {
                                class78.method514(0, class7.field91.method1176(class110.field1676, (byte) -125) + arg0 + class370.field5066.method1176(class110.field1676, (byte) -98));
                                return;
                            }
                        }
                    }
                    if (class92.method589(87, class233.field3103.field6742).equals(var2)) {
                        class78.method514(0, class434.field5907.method1176(class110.field1676, (byte) -111));
                    } else {
                        class491.method2861(class266.field3510, arg1 + 27553);
                        if (arg1 != -27552) {
                            field2834 = null;
                        }
                        ++class78.field1048;
                        class203.field2751.method228(class231.method1292((byte) 3, arg0), 32);
                        class203.field2751.method208(arg0, -115);
                    }
                }
            } else {
                class78.method514(0, class107.field1608.method1176(class110.field1676, (byte) -122));
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 243)
    public static void method1190(byte arg0) {
        field2828 = null;
        field2832 = null;
        field2833 = null;
        if (arg0 != -101) {
            field2833 = null;
        }
        field2834 = null;
        field2831 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILbt;I)V", line = 258)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field2825;
        if (arg2 > -3) {
            method1191((byte) 19, (long[]) null, -110, (int[]) null, -46);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field2829 = arg1.method215((byte) 120);
                        }
                    } else {
                        this.field2824 = arg1.method215((byte) 124);
                    }
                } else {
                    this.field2827 = arg1.method201((byte) -122);
                }
            } else {
                this.field2819 = arg1.method215((byte) 102);
            }
        } else {
            this.field2830 = arg1.method201((byte) -118);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B[JI[II)V", line = 318)
    public static final void method1191(byte arg0, long[] arg1, int arg2, int[] arg3, int arg4) {
        if (~arg4 > ~arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            for (int var10 = arg4; ~var10 > ~arg2; ++var10) {
                if (var7 - -((long) (1 & var10)) > arg1[var10]) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method1191((byte) -125, arg1, var6 + -1, arg3, arg4);
            method1191((byte) -86, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 > -69) {
            field2831 = null;
        }
        ++field2820;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBLr;)Lvj;", line = 375)
    public static final class281 method1192(int arg0, int arg1, byte arg2, class110 arg3) {
        ++field2826;
        class32 var4 = new class32(arg3.method702((byte) -92, arg0, arg1));
        if (arg2 != -26) {
            return null;
        } else {
            class281 var5 = new class281(arg0, var4.method195(-112), var4.method195(arg2 ^ -98), var4.method222(1024), var4.method222(1024), ~var4.method201((byte) -112) == -2, var4.method201((byte) -107), var4.method201((byte) -119));
            int var6 = var4.method201((byte) -118);
            for (int var7 = 0; var6 > var7; ++var7) {
                var5.field3773.method641(new class417(var4.method201((byte) -112), var4.method215((byte) 98), var4.method215((byte) 97), var4.method215((byte) 110), var4.method215((byte) 125), var4.method215((byte) 127), var4.method215((byte) 119), var4.method215((byte) 93), var4.method215((byte) 94)), (byte) -93);
            }
            var5.method1592(arg2 ^ 54);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V", line = 403)
    public static final void method1193(byte arg0) {
        ++field2821;
        int var1 = 0;
        if (arg0 == -112) {
            while (var1 < class202.field2734) {
                int var2 = class412.field5638[var1];
                class121 var3 = class221.field2941[var2];
                if (var3 != null) {
                    class369.method2278(var3, -921600, var3.field1780.field5857);
                }
                ++var1;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V", line = 431)
    public final void method65(int arg0) {
        ++field2818;
        if (arg0 <= -100) {
            class66.method437(false);
        }
    }
}
