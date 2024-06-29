import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class429 extends class748 {

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
    private int field5915;

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
    public static int field5912 = 1;

    @OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
    public static int field5920 = -1;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "Ltf;")
    public static class591 field5913 = new class591();

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!aw", name = "L", descriptor = "[[[B")
    public static byte[][][] field5916;

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(I)V", line = 8)
    public class429(int arg0) {
        super(0, true);
        this.field5915 = 4096;
        this.field5915 = arg0;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(B)I", line = 19)
    public static final int method2602(byte arg0) {
        ++field5918;
        class538 var1 = class440.field6036;
        synchronized (class440.field6036) {
            if (arg0 != -100) {
                field5920 = 15;
            }
            return class440.field6036.method3211((byte) 72);
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(Z)V", line = 32)
    public static final void method2603(boolean arg0) {
        if (arg0) {
            method2604(-29);
        }
        for (int var1 = 0; ~class596.field8577 < ~var1; ++var1) {
            class362 var3 = class293.field3830[var1];
            boolean var4 = false;
            if (var3.field4635 == null) {
                --var3.field4636;
                if (~var3.field4636 <= ~(var3.method2040(0) ? -1500 : -10)) {
                    if (var3.field4642 == 1 && var3.field4631 == null) {
                        var3.field4631 = class258.method1605(class264.field3590, var3.field4633, 0);
                        if (var3.field4631 == null) {
                            continue;
                        }
                        var3.field4636 += var3.field4631.method1607();
                    } else if (var3.method2040(0) && (var3.field4638 == null || var3.field4641 == null)) {
                        if (var3.field4638 == null) {
                            var3.field4638 = class110.method743(class445.field6084, var3.field4633);
                        }
                        if (var3.field4638 == null) {
                            continue;
                        }
                        if (var3.field4641 == null) {
                            var3.field4641 = var3.field4638.method737(new int[] { 22050 });
                            if (var3.field4641 == null) {
                                continue;
                            }
                        }
                    }
                    if (~var3.field4636 > -1) {
                        int var5 = 8192;
                        int var6;
                        if (var3.field4645 == 0) {
                            var6 = var3.field4632 * (~var3.field4642 != -4 ? class674.field9500.field5142.method3216(0) : class674.field9500.field5141.method3216(0)) >> 2;
                        } else {
                            int var7 = (62608726 & var3.field4645) >> 24;
                            if (~class473.field6483.field9501 != ~var7) {
                                var6 = 0;
                            } else {
                                int var8 = var3.field4645 << 9 & 130560;
                                int var9 = class473.field6483.method3470(-1) << 8;
                                int var10 = (16770972 & var3.field4645) >> 16;
                                int var11 = (var10 << 9) + 256 + -class473.field6483.field9490 + var9;
                                int var12 = var3.field4645 >> 8 & 255;
                                int var13 = (var12 << 9) + 256 + -class473.field6483.field9489 + var9;
                                int var14 = -512 + Math.abs(var11) + Math.abs(var13);
                                if (var14 > var8) {
                                    var3.field4636 = -99999;
                                    continue;
                                }
                                if (~var14 > -1) {
                                    var14 = 0;
                                }
                                var6 = class674.field9500.field5114.method3216(0) * (-var14 + var8) * var3.field4632 / var8 >> 2;
                                if (var3.field4643 != null && var3.field4643 instanceof class743) {
                                    class743 var15 = (class743) var3.field4643;
                                    short var16 = var15.field10357;
                                    short var17 = var15.field10352;
                                }
                                if (~var11 != -1 || var13 != 0) {
                                    int var18 = -class645.field9148 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) - -4096) & 16383;
                                    if (~var18 < -8193) {
                                        var18 = -var18 + 16384;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (-var14 + 8192) / 4096 + 8192;
                                    }
                                    var5 = (-var19 + 16384 >> 1) + var18 * var19 / 8192;
                                }
                            }
                        }
                        if (var6 > 0) {
                            class25 var20 = null;
                            if (var3.field4642 != 1) {
                                if (var3.method2040(0)) {
                                    var20 = var3.field4641;
                                }
                            } else {
                                var20 = var3.field4631.method1608().method136(class478.field6515);
                            }
                            class194 var21 = var3.field4635 = class194.method1294(var20, var3.field4634, var6, var5);
                            var21.method1301(var3.field4639 - 1);
                            class237.field3299.method3760(var21);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field4635.method3064(10343)) {
                var4 = true;
            }
            if (var4) {
                --class596.field8577;
                for (int var22 = var1; var22 < class596.field8577; ++var22) {
                    class293.field3830[var22] = class293.field3830[var22 + 1];
                }
                --var1;
            }
        }
        ++field5914;
        if (class105.field1538 && !class475.method2820((byte) 52)) {
            if (~class674.field9500.field5121.method3216(0) != -1 && class555.field7841 != -1) {
                if (class306.field3970 == null) {
                    class82.method489(class555.field7841, class76.field1047, false, 0, (byte) -31, class674.field9500.field5121.method3216(0));
                } else {
                    class172.method1075((byte) -12, false, 0, class555.field7841, class674.field9500.field5121.method3216(0), class76.field1047, class306.field3970);
                }
            }
            class306.field3970 = null;
            class105.field1538 = false;
        } else if (~class674.field9500.field5121.method3216(0) != -1 && class555.field7841 != -1 && !class475.method2820((byte) -63)) {
            ++class1.field5;
            class120 var2 = class292.method1716(class608.field8668, true, class439.field6021);
            var2.field1653.method199(true, class555.field7841);
            class471.method2805(106, var2);
            class555.field7841 = -1;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V", line = 251)
    public class429() {
        this(4096);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZLvj;)V", line = 256)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field5919;
        if (~arg0 == -1) {
            this.field5915 = (arg2.method194((byte) 119) << 12) / 255;
        }
        if (arg1) {
            this.method25(82, -107);
        }
    }

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)V", line = 283)
    public static void method2604(int arg0) {
        field5916 = null;
        if (arg0 != 256) {
            field5913 = null;
        }
        field5913 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I", line = 298)
    public final int[] method25(int arg0, int arg1) {
        ++field5917;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (arg1 != 255) {
            this.method25(-97, -49);
        }
        if (super.field10407.field9527) {
            class34.method240(var3, 0, class424.field5889, this.field5915);
        }
        return var3;
    }
}
