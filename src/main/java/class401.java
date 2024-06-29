import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class401 {

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "F")
    public static float field5582 = 0.0F;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field5575;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public int field5576;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public int field5586;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILlh;B)V")
    private final void method2322(int arg0, class365 arg1, byte arg2) {
        int var4 = -48 % ((arg2 - 85) / 40);
        field5580++;
        if (arg0 == 1) {
            this.field5586 = arg1.method2062((byte) 14);
            this.field5576 = arg1.method2099(255);
            this.field5575 = arg1.method2099(255);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
    public static final void method2323(boolean arg0, int arg1) {
        if (arg0) {
            if (class319.field4419 != -1) {
                class495.method2926(class319.field4419, (byte) 118);
            }
            for (class14 var2 = (class14) class269.field3690.method981(0); var2 != null; var2 = (class14) class269.field3690.method989(0)) {
                if (!var2.method2944((byte) 119)) {
                    var2 = (class14) class269.field3690.method981(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class114.method733((byte) -90, true, var2, false);
            }
            class319.field4419 = -1;
            class269.field3690 = new class159(8);
            class20.method145((byte) 71);
            class319.field4419 = class474.field6923;
            class302.method1720(false, 66);
            class242.method1428((byte) 57);
            class475.method2787(class319.field4419);
        }
        field5584++;
        class129.method847((byte) -97);
        class287.field3858 = -1;
        class528.method3101(-78, class367.field5160);
        class75.field1089 = new class192();
        if (arg1 != -4630) {
            return;
        }
        class75.field1089.field372[0] = class442.field6435 / 2;
        class75.field1089.field461 = class232.field3217 * 128 / 2;
        class75.field1089.field466 = class442.field6435 * 128 / 2;
        class310.field4240 = 0;
        class132.field1901 = 0;
        class75.field1089.field362[0] = class232.field3217 / 2;
        if (class128.field1742 == 2) {
            class310.field4240 = class34.field485 << 7;
            class132.field1901 = class350.field4790 << 7;
        } else {
            class102.method678(false);
        }
        class348.method1929((byte) -14);
        if (class132.field1901 == 0 || class310.field4240 == 0) {
            class26.method186(10, arg1 ^ 0xFFFFEDE2);
        } else {
            class480.method2820(arg1 + 4629);
            class26.method186(28, 8);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)I")
    public static final int method2324(byte arg0, int arg1) {
        if (arg0 < 102) {
            method2325(50, 71);
        }
        field5587++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lof;")
    public static final class438 method2325(int arg0, int arg1) {
        field5583++;
        class438[] var2 = class278.method1572(2);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class438 var4 = var2[var3];
            if (var4.field6389 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method2326(int arg0) {
        field5581++;
        class387.field5435.method2597(121);
        if (arg0 > -49) {
            field5585 = 66;
        }
        int var1 = class387.field5435.method2599((byte) 98, 8);
        if (class166.field2352 > var1) {
            for (int var2 = var1; var2 < class166.field2352; var2++) {
                class23.field380[class33.field465++] = class54.field750[var2];
            }
        }
        if (var1 > class166.field2352) {
            throw new RuntimeException("gnpov1");
        }
        class166.field2352 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class54.field750[var3];
            class405 var5 = class179.field2534[var4];
            int var6 = class387.field5435.method2599((byte) 98, 1);
            if (var6 == 0) {
                class54.field750[class166.field2352++] = var4;
                var5.field298 = class393.field5484;
            } else {
                int var7 = class387.field5435.method2599((byte) 98, 2);
                if (var7 == 0) {
                    class54.field750[class166.field2352++] = var4;
                    var5.field298 = class393.field5484;
                    class59.field795[class44.field614++] = var4;
                } else if (var7 == 1) {
                    class54.field750[class166.field2352++] = var4;
                    var5.field298 = class393.field5484;
                    int var8 = class387.field5435.method2599((byte) 98, 3);
                    var5.method2345((byte) -11, var8, 1);
                    int var9 = class387.field5435.method2599((byte) 98, 1);
                    if (var9 == 1) {
                        class59.field795[class44.field614++] = var4;
                    }
                } else if (var7 == 2) {
                    class54.field750[class166.field2352++] = var4;
                    var5.field298 = class393.field5484;
                    if (class387.field5435.method2599((byte) 98, 1) == 1) {
                        int var11 = class387.field5435.method2599((byte) 98, 3);
                        var5.method2345((byte) 121, var11, 2);
                        int var12 = class387.field5435.method2599((byte) 98, 3);
                        var5.method2345((byte) 123, var12, 2);
                    } else {
                        int var10 = class387.field5435.method2599((byte) 98, 3);
                        var5.method2345((byte) -104, var10, 0);
                    }
                    int var13 = class387.field5435.method2599((byte) 98, 1);
                    if (var13 == 1) {
                        class59.field795[class44.field614++] = var4;
                    }
                } else if (var7 == 3) {
                    class23.field380[class33.field465++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Llh;I)V")
    public final void method2327(class365 arg0, int arg1) {
        field5579++;
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method2328(null, 54);
                    return;
                }
            }
            this.method2322(var3, arg0, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Llh;I)V")
    public static final void method2328(class365 arg0, int arg1) {
        if (arg1 <= 72) {
            method2324((byte) -88, 2);
        }
        field5577++;
        if ((arg0.field5073.length - arg0.field5069) < 1) {
            return;
        }
        int var2 = arg0.method2099(255);
        if (var2 < 0 || var2 > 1 || arg0.field5073.length - arg0.field5069 < 2) {
            return;
        }
        int var3 = arg0.method2062((byte) 14);
        if (var3 * 6 != arg0.field5073.length - arg0.field5069) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field5069 >= arg0.field5073.length) {
                            return;
                        }
                        var4 = arg0.method2062((byte) 14);
                        var5 = arg0.method2056((byte) 99);
                    } while (class505.field7432.length <= var4);
                } while (!class326.field4473[var4]);
            } while (class97.field1339.method36(var4, true).field6078 == '1' && (var5 < -1 || var5 > 1));
            class505.field7432[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method2329(int arg0, int arg1) {
        field5578++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class162.field2305.method590(class105.field1434, -22602) + " (" + var2 + ")</col>";
        } else {
            if (arg1 != -880) {
                method2323(true, 27);
            }
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class93.field1249.method590(class105.field1434, -22602) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }
}
