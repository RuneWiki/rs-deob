import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class121 extends class96 {

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public int field1684 = 4;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "[B")
    private byte[] field1687 = new byte[512];

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public int field1678 = 4;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public int field1679 = 4;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public int field1693 = 0;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    public int field1695 = 1638;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "Z")
    public boolean field1694 = true;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "[Ldl;")
    public static class86[] field1683;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "[S")
    private short[] field1688;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "[S")
    private short[] field1698;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "[[B")
    public static byte[][] field1696;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V")
    public static void method768(int arg0) {
        field1696 = null;
        if (arg0 < -32) {
            field1683 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        this.field1687 = class486.method2904(this.field1693, false);
        ++field1690;
        this.method773(false);
        int var2 = this.field1679 + -1;
        if (arg0 > 15) {
            while (var2 >= 1) {
                short var3 = this.field1688[var2];
                if (var3 > 8 || var3 < -8) {
                    return;
                }
                --this.field1679;
                --var2;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[IB)V")
    public final void method769(int arg0, int[] arg1, byte arg2) {
        ++field1681;
        int var4 = class74.field933[arg0] * this.field1678;
        if (arg2 > -85) {
            method774(false, (class129) null);
        }
        if (~this.field1679 != -2) {
            short var5 = this.field1688[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field1698[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field1684 * var6 >> 12;
                int var9 = this.field1678 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                if (var9 <= var11) {
                    var11 = 0;
                }
                int var12 = var7 & 4095;
                int var13 = this.field1687[255 & var11] & 255;
                int var14 = class92.field1283[var12];
                int var15 = this.field1687[var10 & 255] & 255;
                for (int var16 = 0; ~var16 > ~class269.field3403; ++var16) {
                    int var36 = class510.field7476[var16] * this.field1684;
                    int var37 = this.method770(16, var6 * var36 >> 12, var8, var14, var13, var12, var15);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field1679; ++var17) {
                short var18 = this.field1688[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field1698[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field1684 * var19 >> 12;
                    int var22 = this.field1678 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var20 & 4095;
                    if (var22 <= var24) {
                        var24 = 0;
                    }
                    int var26 = class92.field1283[var25];
                    int var27 = 255 & this.field1687[var23 & 255];
                    int var28 = 255 & this.field1687[var24 & 255];
                    if (this.field1694 && this.field1679 + -1 == var17) {
                        for (int var29 = 0; ~var29 > ~class269.field3403; ++var29) {
                            int var30 = class510.field7476[var29] * this.field1684;
                            int var31 = this.method770(-24, var19 * var30 >> 12, var21, var26, var28, var25, var27);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class269.field3403; ++var33) {
                            int var34 = class510.field7476[var33] * this.field1684;
                            int var35 = this.method770(39, var19 * var34 >> 12, var21, var26, var28, var25, var27);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field1698[0] << 12;
            short var39 = this.field1688[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field1684 * var38 >> 12;
            int var42 = this.field1678 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 4095;
            if (~var42 >= ~var44) {
                var44 = 0;
            }
            int var46 = class92.field1283[var45];
            int var47 = 255 & this.field1687[var44 & 255];
            int var48 = this.field1687[var43 & 255] & 255;
            if (!this.field1694) {
                for (int var49 = 0; ~class269.field3403 < ~var49; ++var49) {
                    int var50 = class510.field7476[var49] * this.field1684;
                    int var51 = this.method770(79, var38 * var50 >> 12, var41, var46, var47, var45, var48);
                    arg1[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~class269.field3403 < ~var52; ++var52) {
                    int var53 = class510.field7476[var52] * this.field1684;
                    int var54 = this.method770(-128, var38 * var53 >> 12, var41, var46, var47, var45, var48);
                    int var55 = var39 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)I")
    private final int method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1689;
        int var8 = arg1 >> 12;
        int var9 = var8 - -1;
        int var10 = var8 & 255;
        if (var9 >= arg2) {
            var9 = 0;
        }
        int var11 = arg1 & 4095;
        int var12 = arg5 + -4096;
        int var13 = var9 & 255;
        int var14 = var11 + -4096;
        int var15 = class92.field1283[var11];
        int var16 = 3 & this.field1687[arg6 + var10];
        int var17;
        if (var16 > 1) {
            var17 = ~var16 == -3 ? -arg5 + var11 : -arg5 + -var11;
        } else {
            var17 = var16 != 0 ? -var11 + arg5 : arg5 + var11;
        }
        int var18 = -68 / ((-76 - arg0) / 42);
        int var19 = this.field1687[var13 - -arg6] & 3;
        int var20;
        if (~var19 < -2) {
            var20 = ~var19 == -3 ? -arg5 + var14 : -arg5 + -var14;
        } else {
            var20 = ~var19 != -1 ? arg5 - var14 : var14 - -arg5;
        }
        int var21 = ((-var17 + var20) * var15 >> 12) + var17;
        int var22 = 3 & this.field1687[var10 - -arg4];
        int var23;
        if (~var22 >= -2) {
            var23 = ~var22 == -1 ? var11 - -var12 : var12 - var11;
        } else {
            var23 = var22 != 2 ? -var11 + -var12 : -var12 + var11;
        }
        int var24 = this.field1687[var13 - -arg4] & 3;
        int var25;
        if (var24 > 1) {
            var25 = ~var24 == -3 ? -var12 + var14 : -var12 + -var14;
        } else {
            var25 = var24 == 0 ? var12 + var14 : -var14 + var12;
        }
        int var26 = ((-var23 + var25) * var15 >> 12) + var23;
        return var21 - -((-var21 + var26) * arg3 >> 12);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
    public static final void method771(byte arg0) {
        if (arg0 != -95) {
            method772(33, (Canvas) null);
        }
        class63.field807 = true;
        ++field1697;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Canvas;)Lrm;")
    public static final class78 method772(int arg0, Canvas arg1) {
        ++field1680;
        try {
            if (arg0 != 24429) {
                field1696 = null;
            }
            Class var2 = Class.forName("wa");
            class78 var3 = (class78) var2.newInstance();
            var3.method454(2, arg1);
            return var3;
        } catch (Throwable var5) {
            class492 var4 = new class492();
            var4.method454(2, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
    private final void method773(boolean arg0) {
        if (arg0) {
            this.method773(false);
        }
        ++field1691;
        if (this.field1695 <= 0) {
            if (this.field1688 != null && ~this.field1688.length == ~this.field1679) {
                this.field1698 = new short[this.field1679];
                for (int var2 = 0; ~this.field1679 < ~var2; ++var2) {
                    this.field1698[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field1688 = new short[this.field1679];
            this.field1698 = new short[this.field1679];
            for (int var3 = 0; this.field1679 > var3; ++var3) {
                this.field1688[var3] = (short) ((int) (Math.pow((double) ((float) this.field1695 / 4096.0F), (double) var3) * 4096.0D));
                this.field1698[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field1682;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field1678 = arg2.method617(arg1 ^ -3);
                                }
                            } else {
                                this.field1684 = arg2.method617(2);
                            }
                        } else {
                            this.field1693 = arg2.method617(2);
                        }
                    } else {
                        this.field1684 = this.field1678 = arg2.method617(2);
                    }
                } else {
                    this.field1695 = arg2.method603((byte) -110);
                    if (~this.field1695 > -1) {
                        this.field1688 = new short[this.field1679];
                        for (int var5 = 0; this.field1679 > var5; ++var5) {
                            this.field1688[var5] = (short) arg2.method603((byte) -128);
                        }
                    }
                }
            } else {
                this.field1679 = arg2.method617(2);
            }
        } else {
            this.field1694 = arg2.method617(2) == 1;
        }
        if (arg1 != -1) {
            this.method390(43);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field1686;
        if (arg1 != 255) {
            method774(true, (class129) null);
        }
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            this.method769(arg0, var3, (byte) -105);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLqa;)V")
    public static final void method774(boolean arg0, class129 arg1) {
        ++field1692;
        int var2 = class115.field1574;
        int var3 = class44.field642;
        int var4 = class98.field1374;
        int var5 = class129.field1756 + -3;
        byte var6 = 20;
        if (class457.field6377 == null || class269.field3417 == null) {
            if (class391.field5121.method1294(class122.field1703, (byte) -115) && class391.field5121.method1294(class477.field6970, (byte) -123)) {
                class457.field6377 = arg1.method851(class136.method945(class391.field5121, class122.field1703, 0), true);
                class136 var7 = class136.method945(class391.field5121, class477.field6970, 0);
                class269.field3417 = arg1.method851(var7, true);
                var7.method953();
                class349.field4462 = arg1.method851(var7, true);
            } else {
                arg1.method861(var2, var3, var4, var6, class210.field2710 | 255 - class99.field1382 << 24, 1);
            }
        }
        if (class457.field6377 != null && class269.field3417 != null) {
            int var8 = (var4 + -(class269.field3417.method375() * 2)) / class457.field6377.method375();
            for (int var9 = 0; var8 > var9; ++var9) {
                class457.field6377.method2406(var2 + class269.field3417.method375() + class457.field6377.method375() * var9, var3);
            }
            class269.field3417.method2406(var2, var3);
            class349.field4462.method2406(var2 + var4 + -class349.field4462.method375(), var3);
        }
        class200.field2590.method1118(var3 + 14, var2 + 3, -1, -16777216 | class26.field445, -8634, class457.field6383.method1127(class379.field4920, arg0));
        arg1.method861(var2, var3 + var6, var4, var5 - var6, 255 - class99.field1382 << 24 | class210.field2710, 1);
        int var10 = class268.field3397.method717((byte) 82);
        int var11 = class268.field3397.method721((byte) 74);
        int var12 = 0;
        for (class502 var13 = (class502) class103.field1421.method49(-108); var13 != null; var13 = (class502) class103.field1421.method46((byte) 121)) {
            int var30 = (class271.field3433 + -1 - var12) * 16 + 13 + var3 + var6;
            if (var2 < var10 && var2 - -var4 > var10 && ~(var30 + -13) > ~var11 && ~var11 > ~(var30 - -4) && var13.field7382) {
                arg1.method861(var2, var30 - 12, var4, 16, -class216.field2773 + 255 << 24 | class393.field5142, 1);
            }
            ++var12;
        }
        if ((class42.field615 == null || class302.field3915 == null || class302.field3913 == null) && class391.field5121.method1294(class99.field1385, (byte) -127) && class391.field5121.method1294(class484.field7045, (byte) -128) && class391.field5121.method1294(class381.field4966, (byte) -122)) {
            class136 var14 = class136.method945(class391.field5121, class484.field7045, 0);
            class302.field3915 = arg1.method851(var14, true);
            var14.method953();
            class311.field4017 = arg1.method851(var14, true);
            class42.field615 = arg1.method851(class136.method945(class391.field5121, class99.field1385, 0), true);
            class136 var15 = class136.method945(class391.field5121, class381.field4966, 0);
            class302.field3913 = arg1.method851(var15, true);
            var15.method953();
            class499.field7336 = arg1.method851(var15, true);
        }
        if (class42.field615 != null && class302.field3915 != null && class302.field3913 != null) {
            int var16 = (var4 + -(class302.field3913.method375() * 2)) / class42.field615.method375();
            for (int var17 = 0; var16 > var17; ++var17) {
                class42.field615.method2406(class302.field3913.method375() + (var2 - -(class42.field615.method375() * var17)), -class42.field615.method378() + var3 + var5);
            }
            int var18 = (-class302.field3913.method378() + var5 + -var6) / class302.field3915.method378();
            for (int var19 = 0; ~var19 > ~var18; ++var19) {
                class302.field3915.method2406(var2, class302.field3915.method378() * var19 + var3 + var6);
                class311.field4017.method2406(var2 - -var4 + -class311.field4017.method375(), class302.field3915.method378() * var19 + var6 + var3);
            }
            class302.field3913.method2406(var2, -class302.field3913.method378() + var3 + var5);
            class499.field7336.method2406(var2 - -var4 + -class302.field3913.method375(), -class302.field3913.method378() + var3 - -var5);
        }
        int var20 = 0;
        for (class502 var21 = (class502) class103.field1421.method49(21); var21 != null; var21 = (class502) class103.field1421.method46((byte) 75)) {
            int var22 = var3 - -var6 - (-13 - (-var20 + class271.field3433 + -1) * 16);
            int var23 = -16777216 | class26.field445;
            if (~var10 < ~var2 && ~(var2 + var4) < ~var10 && var22 + -13 < var11 && ~(var22 + 4) < ~var11 && var21.field7382) {
                var23 = -16777216 | class81.field1018;
            }
            int[] var24 = null;
            if (class5.method27(var21.field7390, (byte) 127)) {
                var24 = class89.field1238.method111((int) var21.field7388, 52).field7288;
            } else if (var21.field7384 != -1) {
                var24 = class89.field1238.method111(var21.field7384, 92).field7288;
            } else if (class138.method962(var21.field7390, 123)) {
                class295 var25 = class527.field7791[(int) var21.field7388];
                if (var25 != null) {
                    class10 var26 = var25.field3831;
                    if (var26.field111 != null) {
                        var26 = var26.method63(arg0, class198.field2555);
                    }
                    if (var26 != null) {
                        var24 = var26.field126;
                    }
                }
            } else if (class215.method1369(var21.field7390, 110)) {
                Object var27 = null;
                class402 var28;
                if (~var21.field7390 != -1005) {
                    var28 = class52.field715.method1164((int) (var21.field7388 >>> 32 & 2147483647L), 0);
                } else {
                    var28 = class52.field715.method1164((int) var21.field7388, 0);
                }
                if (var28.field5419 != null) {
                    var28 = var28.method2393(class198.field2555, (byte) 32);
                }
                if (var28 != null) {
                    var24 = var28.field5375;
                }
            }
            String var29 = class440.method2599(var21, (byte) 98);
            if (var24 != null) {
                var29 = var29 + class158.method1065((byte) -67, var24);
            }
            class200.field2590.method1103(class270.field3427, class374.field4857, true, var2 + 3, 0, var29, var23, var22);
            ++var20;
            if (var21.field7387) {
                class52.field716.method2406(class157.field2070.method1704((byte) 91, var29) + var2 + 5, var22 - 12);
            }
        }
        class188.method1239(class44.field642, (byte) -125, class129.field1756, class98.field1374, class115.field1574);
    }
}
