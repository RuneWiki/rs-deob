import java.awt.Font;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class51 extends class273 {

    @OriginalMember(owner = "client!tk", name = "Z", descriptor = "I")
    private int field1067 = 2000;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    private int field1060 = 0;

    @OriginalMember(owner = "client!tk", name = "cb", descriptor = "I")
    private int field1070 = 4096;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    private int field1061 = 0;

    @OriginalMember(owner = "client!tk", name = "ib", descriptor = "I")
    private int field1076 = 16;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field1062 = 0;

    @OriginalMember(owner = "client!tk", name = "gb", descriptor = "I")
    public static int field1074 = -1;

    @OriginalMember(owner = "client!tk", name = "jb", descriptor = "Ljd;")
    public static class86 field1077 = class122.method868("Fps:", true);

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "Ljd;")
    public static class86 field1066 = class122.method868("(U5", true);

    @OriginalMember(owner = "client!tk", name = "kb", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!tk", name = "bb", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!tk", name = "db", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!tk", name = "hb", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!tk", name = "ab", descriptor = "Ljava/awt/Font;")
    public static Font field1068;

    @OriginalMember(owner = "client!tk", name = "eb", descriptor = "[Lod;")
    public static class90[] field1072;

    @OriginalMember(owner = "client!tk", name = "fb", descriptor = "[[B")
    public static byte[][] field1073;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class51() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    public static final void method387(int arg0) {
        ++field1069;
        class206.field3743.method703((byte) 122);
        if (arg0 <= 54) {
            method387(37);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -7420) {
            method387(-118);
        }
        ++field1063;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int var4 = this.field1070 >> 1;
            int[][] var5 = super.field4800.method1230(-18226);
            Random var6 = new Random((long) this.field1060);
            for (int var7 = 0; var7 < this.field1067; ++var7) {
                int var8 = ~this.field1070 < -1 ? this.field1061 + (class30.method197(123, this.field1070, var6) - var4) : this.field1061;
                int var9 = (4083 & var8) >> 4;
                int var10 = class30.method197(78, class176.field3200, var6);
                int var11 = class30.method197(arg0 + 7541, class96.field1896, var6);
                int var12 = (class205.field3698[var9] * this.field1076 >> 12) + var11;
                int var13 = (class237.field4277[var9] * this.field1076 >> 12) + var10;
                int var14 = -var11 + var12;
                int var15 = -var10 + var13;
                if (var15 != 0 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var13;
                        var10 = var11;
                        var13 = var12;
                        var11 = var17;
                        var12 = var18;
                    }
                    if (var13 < var10) {
                        int var19 = var10;
                        var10 = var13;
                        int var20 = var11;
                        var13 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var13;
                    int var23 = -var11 + var12;
                    int var24 = -var22 / 2;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = -(class30.method197(114, 4096, var6) >> 2) + 1024;
                    int var26 = ~var11 <= ~var12 ? -1 : 1;
                    int var27 = 2048 / var22;
                    for (int var28 = var10; var28 < var13; ++var28) {
                        var24 += var23;
                        int var29 = (-var10 + var28) * var27 + 1024 + var25;
                        int var30 = var28 & class90.field1844;
                        int var31 = class274.field4808 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var21 += var26;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V")
    public static final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1065;
        int var6 = arg5 - arg3;
        int var7 = -arg4 + arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class137.method978(arg4, arg3, arg1, (byte) -115, arg0);
            }
        } else if (~var7 == -1) {
            class133.method945(arg5, arg4, arg3, arg0, 1949);
        } else {
            if (~var7 > -1) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = ~var7 < ~var6;
            if (var8) {
                int var9 = arg3;
                arg3 = arg4;
                arg4 = var9;
                int var10 = arg5;
                arg5 = arg1;
                arg1 = var10;
            }
            if (arg5 < arg3) {
                int var11 = arg3;
                int var12 = arg4;
                arg4 = arg1;
                arg3 = arg5;
                arg1 = var12;
                arg5 = var11;
            }
            int var13 = arg4;
            int var14 = arg5 - arg3;
            int var15 = arg1 - arg4;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (arg2 != -23395) {
                method388(80, 1, -124, -122, 42, 35);
            }
            int var16 = -(var14 >> 1);
            int var17 = ~arg1 < ~arg4 ? 1 : -1;
            if (var8) {
                for (int var18 = arg3; var18 <= arg5; ++var18) {
                    class249.field4420[var18][var13] = arg0;
                    var16 += var15;
                    if (~var16 < -1) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg3; ~arg5 <= ~var19; ++var19) {
                    class249.field4420[var13][var19] = arg0;
                    var16 += var15;
                    if (~var16 < -1) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 != 4095) {
            method388(34, 37, 104, 9, 99, 62);
        }
        class144.method1022((byte) -124);
        ++field1075;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static final void method389(boolean arg0) {
        ++class185.field3277;
        class36.field809.method1356(4, arg0);
        ++field1071;
        for (class1 var1 = (class1) class1.field15.method1709(-121); var1 != null; var1 = (class1) class1.field15.method1704(-88)) {
            if (~var1.field3 == -1) {
                class233.method1616(true, var1, true);
            }
        }
        if (class162.field3045 != null) {
            class62.method441(-29481, class162.field3045);
            class162.field3045 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)V")
    public static void method390(byte arg0) {
        field1073 = null;
        field1077 = null;
        field1068 = null;
        field1072 = null;
        field1066 = null;
        int var1 = -85 % ((arg0 - -66) / 54);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field1064;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field1070 = arg1.method1410(-53);
                        }
                    } else {
                        this.field1061 = arg1.method1410(-73);
                    }
                } else {
                    this.field1076 = arg1.method1408((byte) -17);
                }
            } else {
                this.field1067 = arg1.method1410(-117);
            }
        } else {
            this.field1060 = arg1.method1408((byte) -36);
        }
        if (arg2 >= -16) {
            this.field1067 = 68;
        }
    }
}
