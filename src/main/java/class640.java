import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class640 extends class289 {

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public static int field9070 = 0;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "Leda;")
    public static class116 field9069 = new class116(32, 11);

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "Ljava/lang/String;")
    public static String field9072 = null;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(FB)V", line = 3)
    public final void method1778(float arg0, byte arg1) {
        super.field4062 = arg0;
        if (arg1 < 91) {
            method3602(-12);
        }
        ++field9066;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIF)V", line = 16)
    public class640(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILod;)I", line = 19)
    public static final int method3599(int arg0, class673 arg1) {
        ++field9071;
        String var2 = class115.method931(0, arg1);
        int[] var3 = null;
        if (class586.method3382(arg1.field9544, (byte) 45)) {
            var3 = class430.field6132.method42((int) arg1.field9543, false).field6159;
        } else if (arg1.field9550 == -1) {
            if (!class642.method3609((byte) 120, arg1.field9544)) {
                if (class140.method1092(arg1.field9544, arg0 ^ 991)) {
                    Object var4 = null;
                    class119 var5;
                    if (~arg1.field9544 == -1009) {
                        var5 = class14.field224.method2834(0, (int) arg1.field9543);
                    } else {
                        var5 = class14.field224.method2834(arg0 + 1009, (int) (arg1.field9543 >>> 32 & 2147483647L));
                    }
                    if (var5.field1924 != null) {
                        var5 = var5.method969(class230.field3404, 92);
                    }
                    if (var5 != null) {
                        var3 = var5.field1948;
                    }
                }
            } else {
                class6 var6 = (class6) class314.field4359.method2818(-22803, (long) ((int) arg1.field9543));
                if (var6 != null) {
                    class88 var7 = var6.field49;
                    class528 var8 = var7.field1309;
                    if (var8.field7758 != null) {
                        var8 = var8.method3110(class230.field3404, false);
                    }
                    if (var8 != null) {
                        var3 = var8.field7763;
                    }
                }
            }
        } else {
            var3 = class430.field6132.method42(arg1.field9550, false).field6159;
        }
        if (var3 != null) {
            var2 = var2 + class192.method1356(var3, (byte) 117);
        }
        int var9 = class246.field3584.method2873(arg0 + 1121, var2, class252.field3646);
        if (arg1.field9539) {
            var9 += 4 + class160.field2601.method12();
        }
        return arg0 != -1009 ? -62 : var9;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZC)Z", line = 91)
    public static final boolean method3600(boolean arg0, char arg1) {
        ++field9065;
        if (!arg0) {
            return false;
        } else if ((arg1 <= 0 || ~arg1 <= -129) && (~arg1 > -161 || arg1 > 255)) {
            if (arg1 != 0) {
                char[] var2 = class516.field7644;
                for (int var3 = 0; var2.length > var3; ++var3) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BIII)V", line = 132)
    public final void method1770(byte arg0, int arg1, int arg2, int arg3) {
        ++field9067;
        super.field4066 = arg2;
        int var5 = -30 / ((arg0 - 35) / 54);
        super.field4064 = arg3;
        super.field4054 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 150)
    public static void method3601(int arg0) {
        field9069 = null;
        field9072 = null;
        if (arg0 != 0) {
            field9069 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)I", line = 161)
    public static final int method3602(int arg0) {
        if (arg0 != 0) {
            field9070 = -64;
        }
        ++field9068;
        return class406.field5827.method250((byte) -118);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lr;I)V", line = 173)
    public static final void method3603(class98 arg0, int arg1) {
        ++field9073;
        if (~class252.field3643.method3890(arg1) != -1) {
            if (~class76.field1182 == -1) {
                for (class297 var2 = (class297) class252.field3643.method3905(-123); var2 != null; var2 = (class297) class252.field3643.method3899(0)) {
                    class430.field6132.method47(var2.field4192, var2.field4193, var2.field4196, arg1, false, var2.field4195, false, var2.field4194, arg0, !var2.field4197 ? null : class103.field1708.field3841, class424.field6054, arg0);
                    var2.method2549((byte) 44);
                }
                class498.method2983(arg1 + -118);
            } else {
                if (class623.field8870 == null) {
                    Canvas var3 = new Canvas();
                    var3.setSize(36, 32);
                    class623.field8870 = class98.method761((byte) -117, 0, class450.field6495, var3, 0, class703.field9939);
                    class171.field2775 = class623.field8870.method804(class128.method1014(class399.field5771, arg1 + -1, 0, class515.field7635), class628.method3544(class468.field6754, class515.field7635, 0), true);
                }
                for (class297 var4 = (class297) class252.field3643.method3905(-128); var4 != null; var4 = (class297) class252.field3643.method3899(0)) {
                    class430.field6132.method47(var4.field4192, var4.field4193, var4.field4196, 0, false, var4.field4195, false, var4.field4194, arg0, var4.field4197 ? class103.field1708.field3841 : null, class171.field2775, class623.field8870);
                    var4.method2549((byte) -69);
                }
            }
        }
    }
}
