import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class306 {

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "Lbaa;")
    public static class130 field4307 = new class130(32);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "[I")
    public static int[] field4308;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZIZI)V")
    public static final void method2006(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field4304++;
        if (class178.field2452 != null && (arg1 != 3 || class326.field4500 != arg5 || class47.field688 != arg3)) {
            class235.method1567(class178.field2452, (byte) 92, class159.field2227);
            class178.field2452 = null;
        }
        if (arg1 == 3 && class178.field2452 == null) {
            class178.field2452 = class60.method433(arg5, 0, class159.field2227, 0, 0, arg3);
            if (class178.field2452 != null) {
                class326.field4500 = arg5;
                class47.field688 = arg3;
                class263.method1802(-2);
            }
        }
        if (arg1 == 3 && class178.field2452 == null) {
            method2006(arg0, class332.field4707.field4801.method2799(0), true, -1, true, -1);
            return;
        }
        Container var7;
        if (class178.field2452 != null) {
            var7 = class178.field2452;
            class374.field5260 = arg5;
            class648.field8690 = arg3;
        } else if (class553.field7717 == null) {
            if (class320.field4445 == null) {
                var7 = class109.field1462;
            } else {
                var7 = class320.field4445;
            }
            class374.field5260 = var7.getSize().width;
            class648.field8690 = var7.getSize().height;
        } else {
            Insets var6 = class553.field7717.getInsets();
            int var10001 = var6.right + var6.left;
            class374.field5260 = class553.field7717.getSize().width - var10001;
            int var10 = var6.top + var6.bottom;
            class648.field8690 = class553.field7717.getSize().height - var10;
            var7 = class553.field7717;
        }
        if (arg1 == 1) {
            class555.field7740 = (class374.field5260 - class732.field10164) / 2;
            class118.field1561 = class732.field10164;
            class553.field7716 = class84.field1195;
            class320.field4452 = 0;
        } else {
            class362.method2302(30428);
        }
        if (class341.field4815 != class172.field2390) {
            boolean var10000;
            if (class118.field1561 < 1024 && class553.field7716 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class368.method2321(100);
        } else {
            class570.field7875.setSize(class118.field1561, class553.field7716);
            if (class222.field3009) {
                class252.method1725(class570.field7875, 2228);
            } else {
                class129.field1802.method1533(class570.field7875, class118.field1561, class553.field7716);
            }
            if (class553.field7717 == var7) {
                Insets var8 = class553.field7717.getInsets();
                class570.field7875.setLocation(class555.field7740 + var8.left, class320.field4452 + var8.top);
            } else {
                class570.field7875.setLocation(class555.field7740, class320.field4452);
            }
        }
        if (arg1 >= 2) {
            class355.field5106 = true;
        } else {
            class355.field5106 = false;
        }
        if (class544.field7545 != -1) {
            class304.method2002(true, 24615);
        }
        if (class713.field9960 != null && class379.method2379(-127, class102.field1401)) {
            class122.method755(-75);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class669.field9236[var9] = true;
        }
        class256.field3725 = arg2;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static final void method2007(int arg0) {
        if (class601.field8136 != null) {
            for (int var1 = 0; var1 < class601.field8136.length; var1++) {
                for (int var2 = 0; var2 < class601.field8136[var1].length; var2++) {
                    class601.field8136[var1][var2] = class483.field6736;
                }
            }
        }
        field4302++;
        if (arg0 != 0) {
            field4307 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILha;Lhw;I)V")
    public static final void method2008(int arg0, class548 arg1, class616 arg2, int arg3) {
        field4306++;
        if (class431.field6024 != null && arg2.field8286 >= arg0) {
            for (int var4 = 0; var4 < class431.field6024.length; var4++) {
                if (class431.field6024[var4] != -1000000 && (arg2.field8293[0] <= class431.field6024[var4] || arg2.field8293[1] <= class431.field6024[var4] || class431.field6024[var4] >= arg2.field8293[2] || class431.field6024[var4] >= arg2.field8293[3]) && (class562.field7807[var4] >= arg2.field8283[0] || class562.field7807[var4] >= arg2.field8283[1] || class562.field7807[var4] >= arg2.field8283[2] || arg2.field8283[3] <= class562.field7807[var4]) && (class571.field7883[var4] <= arg2.field8283[0] || arg2.field8283[1] >= class571.field7883[var4] || class571.field7883[var4] <= arg2.field8283[2] || class571.field7883[var4] <= arg2.field8283[3]) && (arg2.field8281[0] <= class240.field3582[var4] || class240.field3582[var4] >= arg2.field8281[1] || class240.field3582[var4] >= arg2.field8281[2] || class240.field3582[var4] >= arg2.field8281[3]) && (arg2.field8281[0] >= class356.field5119[var4] || class356.field5119[var4] <= arg2.field8281[1] || class356.field5119[var4] <= arg2.field8281[2] || class356.field5119[var4] <= arg2.field8281[3])) {
                    return;
                }
            }
        }
        if (arg3 != -28546) {
            method2009((byte) 69);
        }
        if (arg2.field8290 == 1) {
            int var5 = arg2.field8282 + class218.field2854 - class103.field1410;
            if (var5 >= 0 && var5 <= (class218.field2854 + class218.field2854)) {
                int var6 = arg2.field8291 + class218.field2854 - class307.field4314;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > class218.field2854 + class218.field2854) {
                    return;
                }
                int var7 = arg2.field8288 + class218.field2854 - class307.field4314;
                if (var7 > (class218.field2854 + class218.field2854)) {
                    var7 = class218.field2854 + class218.field2854;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var7 >= var6) {
                    if (class417.field5900[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class49.field730 - arg2.field8283[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class233.field3469) && class146.method946(0, false, arg2) && class146.method946(1, false, arg2) && class146.method946(2, false, arg2) && class146.method946(3, false, arg2)) {
                        class77.field1127[class723.field10045++] = arg2;
                    }
                }
            }
        } else if (arg2.field8290 == 2) {
            int var10 = class218.field2854 + arg2.field8291 - class307.field4314;
            if (var10 >= 0 && class218.field2854 + class218.field2854 >= var10) {
                int var11 = arg2.field8282 + class218.field2854 - class103.field1410;
                if (var11 < 0) {
                    var11 = 0;
                } else if (class218.field2854 + class218.field2854 < var11) {
                    return;
                }
                int var12 = arg2.field8285 + class218.field2854 - class103.field1410;
                if (var12 > class218.field2854 + class218.field2854) {
                    var12 = class218.field2854 + class218.field2854;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class417.field5900[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class76.field1113 - arg2.field8281[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class233.field3469 > var14) && class146.method946(0, false, arg2) && class146.method946(1, false, arg2) && class146.method946(2, false, arg2) && class146.method946(3, false, arg2)) {
                        class77.field1127[class723.field10045++] = arg2;
                    }
                }
            }
        } else if (arg2.field8290 == 16 || arg2.field8290 == 8) {
            int var23 = class218.field2854 + arg2.field8282 - class103.field1410;
            if (var23 >= 0 && (class218.field2854 + class218.field2854) >= var23) {
                int var24 = class218.field2854 + arg2.field8291 - class307.field4314;
                if (var24 >= 0 && class218.field2854 + class218.field2854 >= var24 && class417.field5900[var23][var24]) {
                    float var25 = (float) (class49.field730 - arg2.field8283[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class76.field1113 - arg2.field8281[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!((float) class233.field3469 > var25) || !((float) class233.field3469 > var26) && class146.method946(0, false, arg2) && class146.method946(1, false, arg2) && class146.method946(2, false, arg2) && class146.method946(3, false, arg2)) {
                        class77.field1127[class723.field10045++] = arg2;
                    }
                }
            }
        } else if (arg2.field8290 == 4) {
            float var15 = (float) (arg2.field8293[0] - class552.field7672);
            if (!(var15 <= (float) class428.field5984)) {
                int var16 = arg2.field8291 + class218.field2854 - class307.field4314;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > (class218.field2854 + class218.field2854)) {
                    return;
                }
                int var17 = arg2.field8288 + class218.field2854 - class307.field4314;
                if (var17 > (class218.field2854 + class218.field2854)) {
                    var17 = class218.field2854 + class218.field2854;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = arg2.field8282 + class218.field2854 - class103.field1410;
                if (var18 < 0) {
                    var18 = 0;
                } else if (class218.field2854 + class218.field2854 < var18) {
                    return;
                }
                int var19 = arg2.field8285 + class218.field2854 - class103.field1410;
                if (class218.field2854 + class218.field2854 < var19) {
                    var19 = class218.field2854 + class218.field2854;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label296: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class417.field5900[var21][var22]) {
                            var20 = true;
                            break label296;
                        }
                    }
                }
                if (var20 && class146.method946(0, false, arg2) && class146.method946(1, false, arg2) && class146.method946(2, false, arg2) && class146.method946(3, false, arg2)) {
                    class77.field1127[class723.field10045++] = arg2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4303++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method2009(byte arg0) {
        field4307 = null;
        field4308 = null;
        int var1 = -76 / ((69 - arg0) / 49);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V")
    public static final void method2010(boolean arg0, int arg1) {
        class690 var2 = class63.field980;
        synchronized (class63.field980) {
            class63.field980.method3896(1, arg1);
            if (arg0) {
                field4308 = null;
            }
        }
        field4305++;
    }
}
