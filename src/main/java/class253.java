import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class253 extends class228 {

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Loa;")
    public static class99 field4371 = class221.method1463(2844, "um");

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field4373 = 0;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "Loa;")
    public static class99 field4376 = class221.method1463(2844, ")4p=");

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "Ljava/awt/Frame;")
    public static Frame field4377;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            return null;
        } else {
            ++field4374;
            int[] var3 = super.field3952.method1262(arg0, 7492);
            if (super.field3952.field3276) {
                int[][] var4 = this.method1502(arg1 + 258, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class234.field4046 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] - -var7[var8] + var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(B)V")
    public static void method1637(byte arg0) {
        field4377 = null;
        field4371 = null;
        int var1 = -35 / ((arg0 - -17) / 50);
        field4376 = null;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(B)V")
    public static final void method1638(byte arg0) {
        ++field4375;
        if (~class94.method635(-45) == -3) {
            byte var1 = (byte) (class55.field904 + -4 & 255);
            int var2 = class55.field904 % 104;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var16 = 0; ~var16 > -105; ++var16) {
                    class228.field3951[var3][var2][var16] = var1;
                }
            }
            if (class255.field4407 != 3) {
                if (arg0 > -120) {
                    field4377 = null;
                }
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class55.field898[var4] = -1000000;
                    class151.field2650[var4] = 1000000;
                    class270.field4762[var4] = 0;
                    class174.field3071[var4] = 1000000;
                    class223.field3875[var4] = 0;
                }
                if (class141.field2481 == 1) {
                    if (~(4 & class230.field3973[class255.field4407][class168.field3006.field1325 >> 7][class168.field3006.field1301 >> 7]) != -1) {
                        class128.method850(class128.field2236, 0, class168.field3006.field1325 >> 7, class168.field3006.field1301 >> 7, false, true);
                    }
                    if (class267.field4709 < 310) {
                        int var5 = class2.field13 >> 7;
                        int var6 = class221.field3850 >> 7;
                        int var7 = class168.field3006.field1325 >> 7;
                        int var8 = class168.field3006.field1301 >> 7;
                        int var9;
                        if (~var7 >= ~var5) {
                            var9 = -var7 + var5;
                        } else {
                            var9 = -var5 + var7;
                        }
                        int var10;
                        if (~var6 > ~var8) {
                            var10 = -var6 + var8;
                        } else {
                            var10 = -var8 + var6;
                        }
                        if (var10 >= var9) {
                            int var11 = var9 * 65536 / var10;
                            int var12 = 32768;
                            while (var6 != var8) {
                                if (var6 >= var8) {
                                    if (var6 > var8) {
                                        --var6;
                                    }
                                } else {
                                    ++var6;
                                }
                                if ((4 & class230.field3973[class255.field4407][var5][var6]) != 0) {
                                    class128.method850(class128.field2236, 1, var5, var6, false, true);
                                    return;
                                }
                                var12 += var11;
                                if (var12 >= 65536) {
                                    if (~var5 <= ~var7) {
                                        if (var7 < var5) {
                                            --var5;
                                        }
                                    } else {
                                        ++var5;
                                    }
                                    var12 -= 65536;
                                    if ((class230.field3973[class255.field4407][var5][var6] & 4) != 0) {
                                        class128.method850(class128.field2236, 1, var5, var6, false, true);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        int var13 = 32768;
                        int var14 = var10 * 65536 / var9;
                        while (var5 != var7) {
                            if (~var7 < ~var5) {
                                ++var5;
                            } else if (var7 < var5) {
                                --var5;
                            }
                            if ((4 & class230.field3973[class255.field4407][var5][var6]) != 0) {
                                class128.method850(class128.field2236, 1, var5, var6, false, true);
                                return;
                            }
                            var13 += var14;
                            if (var13 >= 65536) {
                                var13 -= 65536;
                                if (~var8 < ~var6) {
                                    ++var6;
                                } else if (var8 < var6) {
                                    --var6;
                                }
                                if (~(class230.field3973[class255.field4407][var5][var6] & 4) != -1) {
                                    class128.method850(class128.field2236, 1, var5, var6, false, true);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                } else {
                    int var15 = class115.method777(-1, class221.field3850, class255.field4407, class2.field13);
                    if (~(-class24.field367 + var15) <= -801 || (class230.field3973[class255.field4407][class2.field13 >> 7][class221.field3850 >> 7] & 4) == 0) {
                        return;
                    }
                    class128.method850(class128.field2236, 1, class2.field13 >> 7, class221.field3850 >> 7, false, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class253() {
        super(1, true);
    }
}
