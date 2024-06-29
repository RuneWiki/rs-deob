import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class387 extends class348 {

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lkg;Z)I")
    public static final int method2266(class287 arg0, boolean arg1) {
        field4975++;
        if (arg0.field3413 == 0) {
            return 0;
        }
        if (arg0.field3377 != -1) {
            class287 var2 = null;
            if (arg0.field3377 < 32768) {
                class273 var3 = (class273) class30.field444.method2121(61, (long) arg0.field3377);
                if (var3 != null) {
                    var2 = var3.field3210;
                }
            } else if (arg0.field3377 >= 32768) {
                var2 = class61.field825[arg0.field3377 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field823 - var2.field823;
                int var5 = arg0.field813 - var2.field813;
                if (var4 != 0 || var5 != 0) {
                    arg0.method1675((byte) -8, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0 instanceof class521) {
            class521 var6 = (class521) arg0;
            if (var6.field7392 != -1 && (var6.field3458 == 0 || var6.field3457 > 0)) {
                var6.method1675((byte) -8, var6.field7392);
                var6.field7392 = -1;
            }
        } else if (arg0 instanceof class388) {
            class388 var7 = (class388) arg0;
            if (var7.field4989 != -1 && (var7.field3458 == 0 || var7.field3457 > 0)) {
                int var8 = var7.field823 - (var7.field4989 - (class632.field8626 + class632.field8626)) * 256;
                int var9 = var7.field813 - ((var7.field4978 - class620.field8435 - class620.field8435) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method1675((byte) -8, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field4989 = -1;
            }
        }
        if (arg1) {
            method2266(null, true);
        }
        return arg0.method1663(-1);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
    public static final void method2267(boolean arg0) {
        field4976++;
        if (!arg0) {
            return;
        }
        for (class88 var1 = (class88) class83.field1126.method2725(37); var1 != null; var1 = (class88) class83.field1126.method2726(-116)) {
            class515.method3087(var1, false, -29861);
        }
        for (class88 var2 = (class88) class651.field8995.method2725(37); var2 != null; var2 = (class88) class651.field8995.method2726(-119)) {
            class515.method3087(var2, true, -29861);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
    public static final void method2268(byte arg0) {
        field4977++;
        client var1 = class90.field1195;
        synchronized (class90.field1195) {
            if (class260.field3075 == null && arg0 > 32) {
                Container var2;
                if (class645.field8790 != null) {
                    var2 = class645.field8790;
                } else if (class345.field4331 == null) {
                    var2 = class672.field9220;
                } else {
                    var2 = class345.field4331;
                }
                class484.field6751 = var2.getSize().width;
                class39.field570 = var2.getSize().height;
                if (class645.field8790 == var2) {
                    Insets var3 = class645.field8790.getInsets();
                    class39.field570 -= var3.top + var3.bottom;
                    class484.field6751 -= var3.left + var3.right;
                }
                if (class397.method2331(3) == 1) {
                    class449.field6100 = (class484.field6751 - class243.field2870) / 2;
                    class269.field3181 = 0;
                    class705.field9921 = class412.field5381;
                    class701.field9880 = class243.field2870;
                } else {
                    class445.method2619(800);
                }
                if (class737.field10285 != class446.field6003) {
                    boolean var10000;
                    if (class701.field9880 < 1024 && class705.field9921 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class109.field1370.setSize(class701.field9880, class705.field9921);
                if (class363.field4526 != null) {
                    if (class769.field10572) {
                        class5.method104(-9626, class109.field1370);
                    } else {
                        class363.field4526.method595(class109.field1370, class701.field9880, class705.field9921);
                    }
                }
                if (class645.field8790 == var2) {
                    Insets var4 = class645.field8790.getInsets();
                    class109.field1370.setLocation(class449.field6100 + var4.left, var4.top - -class269.field3181);
                } else {
                    class109.field1370.setLocation(class449.field6100, class269.field3181);
                }
                if (class131.field1615 != -1) {
                    class413.method2462(true, 19674);
                }
                class419.method2502(-16315);
            }
        }
    }
}
