import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class156 extends class68 {

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Z")
    private boolean field2167 = true;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "Z")
    private boolean field2170 = true;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2168 = "Loaded title screen";

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "[I")
    public static int[] field2174 = new int[14];

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static volatile int field2178 = -1;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Lhg;")
    public static class182 field2163;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2177;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "[Lq;")
    public static class128[] field2176;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 >= -118) {
            this.field2170 = false;
        }
        ++field2175;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, !this.field2167 ? arg0 : -arg0 + class17.field184);
            if (this.field2170) {
                for (int var5 = 0; var5 < class89.field1248; ++var5) {
                    var3[var5] = var4[-var5 + class173.field2411];
                }
            } else {
                class115.method780(var4, 0, var3, 0, class89.field1248);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
    public static void method1033(int arg0) {
        field2177 = null;
        field2163 = null;
        field2176 = null;
        int var1 = -35 / ((-31 - arg0) / 59);
        field2174 = null;
        field2168 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B[B)Lgf;")
    public static final class126 method1034(byte arg0, byte[] arg1) {
        ++field2179;
        if (arg0 <= 24) {
            method1037(54);
        }
        if (arg1 == null) {
            return null;
        } else {
            class182 var2 = new class182(arg1, class273.field4208, class198.field2749, class50.field729, class39.field576, class140.field1956);
            class15.method88(-15971);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class156() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field2162;
        int var3 = 60 / ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int[][] var5 = this.method429(0, this.field2167 ? -arg0 + class17.field184 : arg0, 2);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            if (this.field2170) {
                for (int var12 = 0; ~class89.field1248 < ~var12; ++var12) {
                    var10[var12] = var7[-var12 + class173.field2411];
                    var9[var12] = var6[-var12 + class173.field2411];
                    var11[var12] = var8[class173.field2411 - var12];
                }
            } else {
                for (int var13 = 0; var13 < class89.field1248; ++var13) {
                    var10[var13] = var7[var13];
                    var9[var13] = var6[var13];
                    var11[var13] = var8[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2165;
        int var8 = class148.method996(class273.field4228, arg1, 7585, class127.field1782);
        if (arg3 > -55) {
            field2169 = 8;
        }
        int var9 = class148.method996(class273.field4228, arg0, 7585, class127.field1782);
        int var10 = class148.method996(class93.field1294, arg5, 7585, class296.field4668);
        int var11 = class148.method996(class93.field1294, arg4, 7585, class296.field4668);
        int var12 = class148.method996(class273.field4228, arg1 + arg7, 7585, class127.field1782);
        int var13 = class148.method996(class273.field4228, -arg7 + arg0, 7585, class127.field1782);
        for (int var14 = var8; ~var14 > ~var12; ++var14) {
            class154.method1028(-353, class216.field3264[var14], arg6, var10, var11);
        }
        for (int var15 = var9; var13 < var15; --var15) {
            class154.method1028(-353, class216.field3264[var15], arg6, var10, var11);
        }
        int var16 = class148.method996(class93.field1294, arg5 + arg7, 7585, class296.field4668);
        int var17 = class148.method996(class93.field1294, -arg7 + arg4, 7585, class296.field4668);
        for (int var18 = var12; var18 <= var13; ++var18) {
            int[] var19 = class216.field3264[var18];
            class154.method1028(-353, var19, arg6, var10, var16);
            class154.method1028(-353, var19, arg2, var16, var17);
            class154.method1028(-353, var19, arg6, var17, var11);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method1036(int arg0, String arg1, byte arg2) {
        class281.field4359.method1864(250, (byte) -69);
        if (arg2 >= -127) {
            field2174 = null;
        }
        class281.field4359.method1476(-96, class73.method465((byte) -88, arg1));
        ++field2166;
        ++class105.field1463;
        class281.field4359.method1448((byte) 98, arg0);
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
    public static final void method1037(int arg0) {
        class242.field3711 = 0;
        ++field2171;
        class293.field4601 = 0;
        class39.method262(arg0 + 890);
        if (arg0 != -893) {
            method1037(-8);
        }
        class181.method1179(110);
        class47.method309((byte) 127);
        for (int var1 = 0; ~class293.field4601 < ~var1; ++var1) {
            int var3 = class74.field1041[var1];
            if (class52.field740 != class119.field1679[var3].field4090) {
                if (class119.field1679[var3].field1946.method1904((byte) 49)) {
                    class88.method559(class119.field1679[var3], -1);
                }
                class119.field1679[var3].method946((class284) null, arg0 + 892);
                class119.field1679[var3] = null;
            }
        }
        if (class105.field1460 != class233.field3518.field3402) {
            throw new RuntimeException("gnp1 pos:" + class233.field3518.field3402 + " psize:" + class105.field1460);
        } else {
            for (int var2 = 0; ~class92.field1283 < ~var2; ++var2) {
                if (class119.field1679[class194.field2688[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class92.field1283);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method1038(boolean arg0) {
        if (!arg0) {
            if (class234.field3537 != null) {
                class234.field3537.method850(72);
            }
            if (class139.field1933 != null) {
                class139.field1933.method850(-122);
            }
            ++field2173;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        super.field926 = arg0.method1453((byte) -128) == 1;
                    }
                } else {
                    this.field2167 = arg0.method1453((byte) -127) == 1;
                }
            } else {
                this.field2170 = arg0.method1453((byte) -127) == 1;
            }
            ++field2164;
        }
    }
}
