import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class61 extends class223 {

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    private int field962 = 585;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field966 = new String[100];

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "[I")
    public static int[] field960;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
    public static void method494(byte arg0) {
        field960 = null;
        field966 = null;
        if (arg0 != -23) {
            field960 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 <= 14) {
            return null;
        } else {
            ++field967;
            int[] var3 = super.field3588.method1611(0, arg1);
            if (super.field3588.field3722) {
                int var4 = class307.field4925[arg1];
                for (int var5 = 0; var5 < class250.field4008; ++var5) {
                    int var6 = class106.field1662[var5];
                    if (~var6 < ~this.field962 && ~var6 > ~(-this.field962 + 4096) && 2048 - this.field962 < var4 && ~(this.field962 + 2048) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 < 0 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field962 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (-this.field962 + 2048 < var6 && var6 < 2048 - -this.field962) {
                        int var11 = var4 - 2048;
                        int var12 = ~var11 <= -1 ? var11 : -var11;
                        int var13 = var12 - this.field962;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (2048 - this.field962);
                    } else if (this.field962 <= var4 && var4 <= 4096 - this.field962) {
                        if (~var6 <= ~this.field962 && ~var6 >= ~(-this.field962 + 4096)) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 >= 0 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field962 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = ~var19 > -1 ? -var19 : var19;
                        int var21 = var20 - this.field962;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field962 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
    public static final void method495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class80 var5 = (class80) class58.field922.method6(-116); var5 != null; var5 = (class80) class58.field922.method11((byte) 41)) {
            class301.method2021(arg2, false, arg4, var5, arg0, arg3);
        }
        for (class80 var6 = (class80) class121.field1832.method6(-125); var6 != null; var6 = (class80) class121.field1832.method11((byte) 47)) {
            byte var12 = 1;
            class241 var13 = var6.field1218.method1982((byte) 113);
            if (~var6.field1218.field4736 != ~var13.field3872) {
                if (var6.field1218.field4736 != var13.field3844 && ~var6.field1218.field4736 != ~var13.field3855 && ~var6.field1218.field4736 != ~var13.field3843 && ~var6.field1218.field4736 != ~var13.field3842) {
                    if (var6.field1218.field4736 == var13.field3835 || var6.field1218.field4736 == var13.field3840 || var6.field1218.field4736 == var13.field3837 || var6.field1218.field4736 == var13.field3834) {
                        var12 = 3;
                    }
                } else {
                    var12 = 2;
                }
            } else {
                var12 = 0;
            }
            if (~var6.field1215 != ~var12) {
                int var14 = class298.method2002(var6.field1218, (byte) 99);
                if (var6.field1231 != var14) {
                    if (var6.field1220 != null) {
                        class83.field1251.method243(var6.field1220);
                        var6.field1220 = null;
                    }
                    var6.field1231 = var14;
                }
                var6.field1215 = var12;
            }
            var6.field1222 = var6.field1218.field4725;
            var6.field1221 = var6.field1218.field4725 + var6.field1218.method1013(0) * 64;
            var6.field1233 = var6.field1218.field4709;
            var6.field1224 = var6.field1218.field4709 - -(64 * var6.field1218.method1013(0));
            class301.method2021(arg2, false, arg4, var6, arg0, arg3);
        }
        ++field963;
        int var7 = 101 / ((arg1 - -16) / 53);
        for (class80 var8 = (class80) class193.field3023.method2049(0); var8 != null; var8 = (class80) class193.field3023.method2047(-119)) {
            byte var9 = 1;
            class241 var10 = var8.field1234.method1982((byte) 127);
            if (var8.field1234.field4736 == var10.field3872) {
                var9 = 0;
            } else if (var8.field1234.field4736 != var10.field3844 && ~var8.field1234.field4736 != ~var10.field3855 && var8.field1234.field4736 != var10.field3843 && ~var8.field1234.field4736 != ~var10.field3842) {
                if (var8.field1234.field4736 == var10.field3835 || ~var8.field1234.field4736 == ~var10.field3840 || ~var8.field1234.field4736 == ~var10.field3837 || var8.field1234.field4736 == var10.field3834) {
                    var9 = 3;
                }
            } else {
                var9 = 2;
            }
            if (var8.field1215 != var9) {
                int var11 = class91.method691(21272, var8.field1234);
                if (~var8.field1231 != ~var11) {
                    if (var8.field1220 != null) {
                        class83.field1251.method243(var8.field1220);
                        var8.field1220 = null;
                    }
                    var8.field1231 = var11;
                }
                var8.field1215 = var9;
            }
            var8.field1222 = var8.field1234.field4725;
            var8.field1221 = var8.field1234.field4725 + var8.field1234.method1013(0) * 64;
            var8.field1233 = var8.field1234.field4709;
            var8.field1224 = var8.field1234.field4709 - -(var8.field1234.method1013(0) * 64);
            class301.method2021(arg2, false, arg4, var8, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            method495(0, 7, -33, -127, -127);
        }
        ++field964;
        if (~arg1 == -1) {
            this.field962 = arg0.method260((byte) -67);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(III)V")
    public static final void method496(int arg0, int arg1, int arg2) {
        class232.field3674 = -class147.field2165 + arg0;
        class254.field4063 = class141.field2107 - arg1 + class92.field1475 + -1;
        if (arg2 <= -35) {
            ++field961;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Llm;")
    public static final class231 method497(int arg0, int arg1) {
        ++field965;
        if (arg1 != 7324) {
            return null;
        } else {
            class231 var2 = (class231) class219.field3342.method1361((byte) -95, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class27.field462.method721((byte) -117, class76.method601(-71, arg0), class250.method1699(arg0, false));
                class231 var4 = new class231();
                if (var3 != null) {
                    var4.method1585(new class31(var3), 5370);
                }
                class219.field3342.method1365((long) arg0, (byte) 13, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class61() {
        super(0, true);
    }
}
