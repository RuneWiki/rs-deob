import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class715 extends class682 implements class484 {

    @OriginalMember(owner = "client!bs", name = "Z", descriptor = "Z")
    private boolean field9922 = false;

    @OriginalMember(owner = "client!bs", name = "V", descriptor = "Lnia;")
    public class671 field9918;

    @OriginalMember(owner = "client!bs", name = "gb", descriptor = "Z")
    private boolean field9929;

    @OriginalMember(owner = "client!bs", name = "fb", descriptor = "Lbu;")
    public static class21 field9928 = new class21(96, -1);

    @OriginalMember(owner = "client!bs", name = "lb", descriptor = "I")
    public static int field9934 = 2;

    @OriginalMember(owner = "client!bs", name = "kb", descriptor = "Lbu;")
    public static class21 field9933 = new class21(84, -1);

    @OriginalMember(owner = "client!bs", name = "nb", descriptor = "I")
    public static int field9936 = 0;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!bs", name = "W", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!bs", name = "X", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!bs", name = "ab", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!bs", name = "bb", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!bs", name = "cb", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!bs", name = "db", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!bs", name = "eb", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!bs", name = "hb", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!bs", name = "ib", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!bs", name = "jb", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!bs", name = "mb", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!bs", name = "Y", descriptor = "Lrn;")
    private class281 field9921;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)Z")
    public final boolean method906(int arg0) {
        ++field9935;
        int var2 = -41 / ((11 - arg0) / 35);
        return this.field9922;
    }

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "(I)Z")
    public static final boolean method4014(int arg0) {
        ++field9923;
        try {
            return arg0 > -19 ? true : class115.method863(1);
        } catch (IOException var4) {
            class174.method1265(13);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class197.field3014 == null ? -1 : class197.field3014.method219(1)) + "," + (class518.field7312 == null ? -1 : class518.field7312.method219(1)) + "," + (class467.field6559 == null ? -1 : class467.field6559.method219(1)) + " - " + class15.field293 + "," + (class210.field3250.field4670[0] + class124.field1922) + "," + (class210.field3250.field4672[0] + class88.field999) + " - ";
            for (int var3 = 0; var3 < class15.field293 && var3 < 50; ++var3) {
                var2 = var2 + class110.field1640.field7050[var3] + ",";
            }
            class678.method3848(var2, var5, false);
            class195.method1354((byte) -61, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLha;)V")
    public final void method1479(byte arg0, class65 arg1) {
        int var3 = 67 / ((arg0 - -19) / 48);
        ++field9919;
        this.field9918.method3817(arg1, false);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILha;)V")
    public final void method1487(int arg0, class65 arg1) {
        int var3 = 32 / ((4 - arg0) / 39);
        this.field9918.method3810(arg1, (byte) -4);
        ++field9910;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        ++field9926;
        if (arg0) {
            this.method909(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "(I)V")
    public static void method4015(int arg0) {
        if (arg0 == 18383) {
            field9933 = null;
            field9928 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)I")
    public final int method1478(byte arg0) {
        ++field9925;
        return arg0 < 108 ? -75 : this.field9918.field9334;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lha;I)Lmaa;")
    public final class495 method918(class65 arg0, int arg1) {
        ++field9930;
        class496 var3 = this.field9918.method3815(-779, 2048, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            class326 var4 = arg0.method514();
            var4.method1869(super.field9454 + super.field5742, super.field5741, super.field9459 + super.field5746);
            class495 var5 = class86.method652(this.field9929, arg1 ^ arg1, 1);
            int var6 = super.field5742 >> 9;
            int var7 = super.field5746 >> 9;
            this.field9918.method3818(var7, var3, var7, var6, var6, 0, true, var4, arg0);
            if (!class576.field8120) {
                var3.method88(var4, var5.field7067[0], 0);
            } else {
                var3.method106(var4, var5.field7067[0], class740.field10205, 0);
            }
            if (this.field9918.field9352 != null) {
                class296 var8 = this.field9918.field9352.method3450();
                if (class576.field8120) {
                    arg0.method541(var8, class740.field10205);
                } else {
                    arg0.method504(var8);
                }
            }
            this.field9922 = var3.method121() || this.field9918.field9352 != null;
            if (this.field9921 != null) {
                class546.method3268(var3, super.field5742, this.field9921, -92, super.field5746, super.field5741);
            } else {
                this.field9921 = class490.method2922((byte) 117, super.field5742, var3, super.field5746, super.field5741);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)I")
    public final int method916(boolean arg0) {
        ++field9909;
        return !arg0 ? 125 : this.field9918.method3811((byte) 110);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lha;Lkv;IIIIIZIIIII)V")
    public class715(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field9918 = new class671(arg0, arg1, arg10, arg11, super.field5755, arg3, this, arg7, arg12);
        this.field9929 = arg1.field4149 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lal;Lal;B)V")
    public static final void method4016(class107 arg0, class107 arg1, byte arg2) {
        if (arg2 != -128) {
            method4017((class100) null, 86, -121, (int[]) null);
        }
        if (arg1.field1598 != null) {
            arg1.method827(3);
        }
        ++field9917;
        arg1.field1598 = arg0;
        arg1.field1600 = arg0.field1600;
        arg1.field1598.field1600 = arg1;
        arg1.field1600.field1598 = arg1;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Lha;I)Lrn;")
    public final class281 method901(class65 arg0, int arg1) {
        ++field9931;
        if (arg1 < 50) {
            this.field9929 = false;
        }
        return this.field9921;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ldba;II[I)Luu;")
    public static final class301 method4017(class100 arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 != 3) {
            return null;
        } else {
            ++field9932;
            int[] var4 = null;
            int[] var5 = null;
            int[] var6 = null;
            float[][] var7 = null;
            if (arg0.field1174 != null) {
                int var8 = arg0.field1140;
                int[] var9 = new int[var8];
                int[] var10 = new int[var8];
                int[] var11 = new int[var8];
                int[] var12 = new int[var8];
                int[] var13 = new int[var8];
                int[] var14 = new int[var8];
                for (int var15 = 0; ~var15 > ~var8; ++var15) {
                    var9[var15] = Integer.MAX_VALUE;
                    var10[var15] = -2147483647;
                    var11[var15] = Integer.MAX_VALUE;
                    var12[var15] = -2147483647;
                    var13[var15] = Integer.MAX_VALUE;
                    var14[var15] = -2147483647;
                }
                for (int var16 = 0; ~var16 > ~arg1; ++var16) {
                    int var23 = arg3[var16];
                    if (arg0.field1174[var23] != -1) {
                        int var24 = arg0.field1174[var23] & 255;
                        for (int var25 = 0; var25 < 3; ++var25) {
                            short var26;
                            if (var25 == 0) {
                                var26 = arg0.field1175[var23];
                            } else if (~var25 == -2) {
                                var26 = arg0.field1152[var23];
                            } else {
                                var26 = arg0.field1158[var23];
                            }
                            int var27 = arg0.field1165[var26];
                            int var28 = arg0.field1164[var26];
                            int var29 = arg0.field1168[var26];
                            if (var27 < var9[var24]) {
                                var9[var24] = var27;
                            }
                            if (~var27 < ~var10[var24]) {
                                var10[var24] = var27;
                            }
                            if (var28 < var11[var24]) {
                                var11[var24] = var28;
                            }
                            if (var28 > var12[var24]) {
                                var12[var24] = var28;
                            }
                            if (~var29 > ~var13[var24]) {
                                var13[var24] = var29;
                            }
                            if (~var29 < ~var14[var24]) {
                                var14[var24] = var29;
                            }
                        }
                    }
                }
                var6 = new int[var8];
                var5 = new int[var8];
                var7 = new float[var8][];
                var4 = new int[var8];
                for (int var17 = 0; ~var8 < ~var17; ++var17) {
                    byte var18 = arg0.field1163[var17];
                    if (var18 > 0) {
                        var4[var17] = (var9[var17] + var10[var17]) / 2;
                        var5[var17] = (var11[var17] - -var12[var17]) / 2;
                        var6[var17] = (var13[var17] + var14[var17]) / 2;
                        float var19;
                        float var20;
                        float var21;
                        if (~var18 != -2) {
                            if (var18 != 2) {
                                var19 = (float) arg0.field1128[var17] / 1024.0F;
                                var20 = (float) arg0.field1151[var17] / 1024.0F;
                                var21 = (float) arg0.field1144[var17] / 1024.0F;
                            } else {
                                var20 = 64.0F / (float) arg0.field1151[var17];
                                var21 = 64.0F / (float) arg0.field1144[var17];
                                var19 = 64.0F / (float) arg0.field1128[var17];
                            }
                        } else {
                            int var22 = arg0.field1128[var17];
                            if (var22 != 0) {
                                if (var22 <= 0) {
                                    var19 = (float) (-var22) / 1024.0F;
                                    var20 = 1.0F;
                                } else {
                                    var19 = 1.0F;
                                    var20 = (float) var22 / 1024.0F;
                                }
                            } else {
                                var20 = 1.0F;
                                var19 = 1.0F;
                            }
                            var21 = 64.0F / (float) arg0.field1144[var17];
                        }
                        var7[var17] = class150.method1041(var19, arg0.field1131[var17], arg0.field1170[var17], 0, arg0.field1156[var17], var20, class702.method3977(255, arg0.field1129[var17]), var21);
                    }
                }
            }
            return new class301(var4, var5, var6, var7);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLmi;)V")
    public final void method4018(byte arg0, class520 arg1) {
        if (arg0 > 96) {
            ++field9920;
            this.field9918.method3819(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I")
    public final int method1483(int arg0) {
        ++field9924;
        if (arg0 != 24853) {
            field9911 = 112;
        }
        return this.field9918.field9332;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
    public final void method1484(int arg0) {
        if (arg0 >= -107) {
            this.method4018((byte) 14, (class520) null);
        }
        ++field9915;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field9914;
        class496 var5 = this.field9918.method3815(-779, 131072, arg3, false, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != -17458) {
                field9933 = null;
            }
            class326 var6 = arg3.method514();
            var6.method1869(super.field9454 + super.field5742, super.field5741, super.field9459 + super.field5746);
            return class576.field8120 ? var5.method77(arg0, arg2, var6, false, 0, class740.field10205) : var5.method95(arg0, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Z")
    public final boolean method1488(byte arg0) {
        ++field9912;
        int var2 = 39 % ((arg0 - -7) / 60);
        return this.field9918.method3820((byte) 107);
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)I")
    public final int method917(int arg0) {
        if (arg0 != -1760267218) {
            this.method902(-3, -74, 90, (class65) null);
        }
        ++field9916;
        return this.field9918.method3821(1);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)I")
    public final int method1482(boolean arg0) {
        ++field9913;
        if (!arg0) {
            method4015(121);
        }
        return this.field9918.field9341;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(ILha;)V")
    public final void method912(int arg0, class65 arg1) {
        ++field9927;
        class496 var3 = this.field9918.method3815(-779, 262144, arg1, true, false);
        if (var3 != null) {
            int var4 = super.field5742 >> 9;
            int var5 = super.field5746 >> 9;
            class326 var6 = arg1.method514();
            var6.method1869(super.field5742, super.field5741, super.field5746);
            this.field9918.method3818(var5, var3, var5, var4, var4, 0, false, var6, arg1);
        }
        if (arg0 < 52) {
            this.method1479((byte) 111, (class65) null);
        }
    }
}
