import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class629 extends class600 {

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "Lmi;")
    private class496 field8655;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZBI)V", line = 3)
    public final void method2027(int arg0, boolean arg1, byte arg2, int arg3) {
        if (arg2 >= -6) {
            method3598(-4, (class324) null);
        }
        ++field8665;
        class272.field3822.method288(arg0 + -2, arg3, super.field8228.field2325 + 4, super.field8228.field2317 + 2, ((class15) super.field8228).field248, 0);
        class272.field3822.method288(arg0 + -1, arg3 + 1, super.field8228.field2325 + 2, super.field8228.field2317, 0, 0);
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)Llga;", line = 15)
    public static final class710 method3595(int arg0) {
        ++field8658;
        if (class489.field6776 != null && class184.field2779 != null) {
            class184.field2779.method2825(class489.field6776, 75);
            class710 var1 = (class710) class184.field2779.method2824((byte) -53);
            if (var1 == null) {
                return null;
            } else {
                class553 var2 = class489.field6760.method2136(var1.field9629, (byte) 50);
                if (arg0 != 1) {
                    field8659 = -75;
                }
                return var2 != null && var2.field7654 && var2.method3180(class489.field6766, 98) ? var1 : class213.method1464(-1);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z", line = 41)
    public final boolean method1470(byte arg0) {
        int var2 = 2 % ((25 - arg0) / 52);
        ++field8662;
        return !super.method1470((byte) 82) ? false : super.field8225.method874(false, ((class15) super.field8228).field250);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I", line = 57)
    public static final int method3596(int arg0, int arg1) {
        if (arg0 >= -75) {
            return -109;
        } else {
            ++field8666;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lin;Lin;Lkh;)V", line = 74)
    public class629(class91 arg0, class91 arg1, class15 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILjava/lang/String;)V", line = 80)
    public static final void method3597(int arg0, int arg1, String arg2) {
        ++field8661;
        int var3 = class219.field3167;
        int[] var4 = class87.field1561;
        if (arg1 == -7257) {
            boolean var5 = false;
            for (int var6 = 0; var3 > var6; ++var6) {
                class598 var7 = class49.field1040[var4[var6]];
                if (var7 != null && class58.field1147 != var7 && var7.field8189 != null && var7.field8189.equalsIgnoreCase(arg2)) {
                    var5 = true;
                    if (arg0 == 1) {
                        ++class551.field7596;
                        class564 var8 = class227.method1594(class280.field3928, class72.field1320, arg1 + 7158);
                        var8.field7778.method1497(4325, var4[var6]);
                        var8.field7778.method1522((byte) -75, 0);
                        class167.method1260(arg1 ^ 7210, var8);
                    } else if (~arg0 == -5) {
                        ++class708.field9600;
                        class564 var9 = class227.method1594(class684.field9264, class72.field1320, -88);
                        var9.field7778.method1485((byte) 107, var4[var6]);
                        var9.field7778.method1543((byte) -128, 0);
                        class167.method1260(126, var9);
                    } else if (~arg0 == -6) {
                        ++class194.field2867;
                        class564 var10 = class227.method1594(class161.field2577, class72.field1320, -83);
                        var10.field7778.method1483(81, var4[var6]);
                        var10.field7778.method1526(false, 0);
                        class167.method1260(-112, var10);
                    } else if (arg0 != 6) {
                        if (arg0 == 7) {
                            ++class605.field8303;
                            class564 var11 = class227.method1594(class749.field10380, class72.field1320, -116);
                            var11.field7778.method1483(arg1 ^ 7212, var4[var6]);
                            var11.field7778.method1543((byte) 92, 0);
                            class167.method1260(127, var11);
                        }
                    } else {
                        ++class639.field8782;
                        class564 var12 = class227.method1594(class296.field4154, class72.field1320, -83);
                        var12.field7778.method1526(false, 0);
                        var12.field7778.method1483(-119, var4[var6]);
                        class167.method1260(arg1 + 7281, var12);
                    }
                    break;
                }
            }
            if (!var5) {
                class356.method2237(class497.field6912.method2936(class607.field8336, 544) + arg2, false, 4);
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 170)
    public final void method1474(int arg0) {
        ++field8660;
        if (arg0 == 10286) {
            super.method1474(arg0);
            this.field8655 = class392.method2467(((class15) super.field8228).field250, (byte) -96, super.field8225);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZ)V", line = 182)
    public final void method2030(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8656;
        int var5 = this.method3415(48) * super.field8228.field2325 / 10000;
        int[] var6 = new int[4];
        int var7 = -50 % ((-20 - arg0) / 57);
        class272.field3822.method206(var6);
        class272.field3822.method303(arg2, arg1 + 2, arg2 - -var5, arg1 - -super.field8228.field2317);
        this.field8655.method2923(arg2, arg1 + 2, super.field8228.field2325, super.field8228.field2317);
        class272.field3822.method303(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILdb;)V", line = 201)
    public static final void method3598(int arg0, class324 arg1) {
        ++field8664;
        if (arg0 == 6) {
            if (!class311.field4321) {
                arg1.method2314((byte) 111);
                --class192.field2844;
                if (arg1.field4508) {
                    for (class462 var2 = (class462) class631.field8684.method2344(-99); var2 != null; var2 = (class462) class631.field8684.method2336((byte) 110)) {
                        if (var2.field6499.equals(arg1.field4498)) {
                            boolean var3 = false;
                            for (class324 var4 = (class324) var2.field6503.method2344(-58); var4 != null; var4 = (class324) var2.field6503.method2336((byte) 112)) {
                                if (arg1 == var4) {
                                    if (var2.method2731((byte) -123, arg1)) {
                                        class164.method1245((byte) -98, var2);
                                    }
                                    var3 = true;
                                    break;
                                }
                            }
                            if (var3) {
                                return;
                            }
                        }
                    }
                } else {
                    long var5 = arg1.field4497;
                    class462 var7;
                    for (var7 = (class462) class324.field4500.method1465(var5, -6008); var7 != null && !var7.field6499.equals(arg1.field4498); var7 = (class462) class324.field4500.method1461(true)) {
                    }
                    if (var7 != null && var7.method2731((byte) 15, arg1)) {
                        class164.method1245((byte) 120, var7);
                    }
                }
            }
        }
    }
}
