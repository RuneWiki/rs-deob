import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class338 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field4821 = 0;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "J")
    public static long field4823 = 0L;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field4819;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static final void method2190(byte arg0) {
        field4820++;
        if (class379.method2404(0) != 2) {
            return;
        }
        byte var1 = (byte) (class49.field794 - 4 & 0xFF);
        int var2 = class49.field794 % class183.field2703;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class66.field1056; var16++) {
                class141.field2232[var3][var2][var16] = var1;
            }
        }
        if (class367.field5213 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class91.field1443[var4] = -1000000;
            class372.field5286[var4] = 1000000;
            class326.field4699[var4] = 0;
            class202.field2940[var4] = 1000000;
            class345.field4870[var4] = 0;
        }
        if (arg0 != 89) {
            field4823 = 51L;
        }
        if (class322.field4643 != 1) {
            int var15 = class109.method957(class286.field4288, class265.field3985, class367.field5213, arg0 + 20574);
            if ((var15 - class437.field6364) >= 800 || (class278.field4176[class367.field5213][class265.field3985 >> 7][class286.field4288 >> 7] & 0x4) == 0) {
                return;
            }
            class152.method1168(class265.field3985 >> 7, class286.field4288 >> 7, class443.field6447, false, 1, (byte) -51);
            return;
        }
        if ((class278.field4176[class367.field5213][class86.field1394.field6520 >> 7][class86.field1394.field6519 >> 7] & 0x4) != 0) {
            class152.method1168(class86.field1394.field6520 >> 7, class86.field1394.field6519 >> 7, class443.field6447, false, 0, (byte) -51);
        }
        if (class40.field623 >= 2560) {
            return;
        }
        int var5 = class265.field3985 >> 7;
        int var6 = class286.field4288 >> 7;
        int var7 = class86.field1394.field6520 >> 7;
        int var8 = class86.field1394.field6519 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && (-class183.field2703) < var9 && var9 < class183.field2703 && var10 > -class66.field1056 && class66.field1056 > var10) {
            if (var9 > var10) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class278.field4176[class367.field5213][var5][var6] & 0x4) != 0) {
                        class152.method1168(var5, var6, class443.field6447, false, 1, (byte) -51);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var6 < var8) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        var12 -= 65536;
                        if ((class278.field4176[class367.field5213][var5][var6] & 0x4) != 0) {
                            class152.method1168(var5, var6, class443.field6447, false, 1, (byte) -51);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class278.field4176[class367.field5213][var5][var6] & 0x4) != 0) {
                    class152.method1168(var5, var6, class443.field6447, false, 1, (byte) -51);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var7 > var5) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class278.field4176[class367.field5213][var5][var6] & 0x4) != 0) {
                        class152.method1168(var5, var6, class443.field6447, false, 1, (byte) -51);
                        return;
                    }
                }
            }
            return;
        }
        class282.method2003("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class379.field5384 + "," + class294.field4362, -24830, (Throwable) null);
        return;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lbr;IIIII)V")
    public static final void method2191(class348 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4927 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field4925[var6] != null) {
                arg0.field4927++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field4927; var7++) {
            int var8 = class450.field6537[arg1][arg2][arg3];
            while (var8 != 0) {
                class420 var12 = class115.field1834[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field4925[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class450.field6537[arg1][arg4][arg5];
            while (var9 != 0) {
                class420 var11 = class115.field1834[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field4925[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field4927 - 1; var10++) {
                arg0.field4925[var10] = arg0.field4925[var10 + 1];
            }
            arg0.field4927--;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method2192(int arg0) {
        field4819 = null;
        if (arg0 != -785208729) {
            field4819 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method2193(Component arg0, int arg1) {
        field4822++;
        arg0.removeMouseListener(class23.field350);
        arg0.removeMouseMotionListener(class23.field350);
        arg0.removeFocusListener(class23.field350);
        class439.field6381 = arg1;
    }
}
