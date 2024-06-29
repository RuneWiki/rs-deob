import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class12 {

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "Lofa;")
    public static class345 field247 = new class345(4);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "[I")
    public static int[] field248;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLha;)V")
    public static final void method124(byte arg0, class66 arg1) {
        field250++;
        if (!(class543.field7608 >= 2 || class26.field382) || class169.field2433 != null) {
            return;
        }
        String var2;
        if (class26.field382 && class543.field7608 < 2) {
            var2 = class361.field5239 + class674.field9583.method3825((byte) -10, class526.field7494) + class373.field5373 + " ->";
        } else if (class733.field10233 && class311.field4630.method2733(114, 81) && class543.field7608 > 2) {
            var2 = class786.method4305(class50.field723, 67);
        } else {
            class312 var3 = class50.field723;
            if (var3 == null) {
                return;
            }
            var2 = class786.method4305(var3, -39);
            int[] var4 = null;
            if (class134.method950(var3.field4640, -44)) {
                var4 = class526.field7490.method3567((int) var3.field4647, true).field7175;
            } else if (var3.field4638 != -1) {
                var4 = class526.field7490.method3567(var3.field4638, true).field7175;
            } else if (class93.method664((byte) 104, var3.field4640)) {
                class14 var7 = (class14) class543.field7606.method380((byte) -3, (long) ((int) var3.field4647));
                if (var7 != null) {
                    class645 var8 = var7.field262;
                    class279 var9 = var8.field9071;
                    if (var9.field3943 != null) {
                        var9 = var9.method1810((byte) -104, class271.field3796);
                    }
                    if (var9 != null) {
                        var4 = var9.field3895;
                    }
                }
            } else if (class574.method3331(var3.field4640, arg0 - 78)) {
                Object var5 = null;
                class322 var6;
                if (var3.field4640 == 1007) {
                    var6 = class496.field7061.method319(-27, (int) var3.field4647);
                } else {
                    var6 = class496.field7061.method319(-22, (int) (var3.field4647 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field4830 != null) {
                    var6 = var6.method2099(class271.field3796, -121);
                }
                if (var6 != null) {
                    var4 = var6.field4762;
                }
            }
            if (var4 != null) {
                var2 = var2 + class388.method2379((byte) -81, var4);
            }
        }
        if (arg0 != 79) {
            field251 = -114;
        }
        if (class543.field7608 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class543.field7608 - 2) + class674.field9576.method3825((byte) -10, class526.field7494);
        }
        if (class366.field5281 != null) {
            class67 var10 = class366.field5281.method1333((byte) -115, arg1);
            if (var10 == null) {
                var10 = class546.field7704;
            }
            var10.method521(class681.field9660, class366.field5281.field2603, class170.field2438, var2, class67.field906, class366.field5281.field2515, class366.field5281.field2673, class723.field10144, class366.field5281.field2573, class366.field5281.field2664, (byte) 71, class725.field10175, class600.field8465, class366.field5281.field2639, class441.field6298);
            class223.method1546(class67.field906[2], class67.field906[0], (byte) 122, class67.field906[3], class67.field906[1]);
        } else if (class421.field5947 != null && class536.field7555 == class234.field3384) {
            int var11 = class546.field7704.method531(class170.field2438, class681.field9660, var2, 16777215, class472.field6737 + 4, (byte) -87, class600.field8465, 0, class258.field3632 + 16, class725.field10175);
            class223.method1546(var11 + class33.field439.method1728(var2, 120), class472.field6737 - -4, (byte) 124, 16, class258.field3632);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)V")
    public static final void method125(int arg0, int arg1, int arg2) {
        field246++;
        class678 var3 = class630.method3597(29636, arg0, (long) arg2);
        var3.method3834((byte) 30);
        var3.field9649 = arg1;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method126(class192 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class622.field8777 != class311.field4628) {
            int var6 = class750.field10395[arg1].method1977((byte) 126, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class292 var8 = class750.field10395[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1977((byte) -80, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1240(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1247(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public static void method127(int arg0) {
        field248 = null;
        if (arg0 != -1) {
            method127(80);
        }
        field247 = null;
    }
}
