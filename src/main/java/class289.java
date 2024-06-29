import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class289 {

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "Lmc;")
    public class134 field3563 = new class134();

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Luw;")
    public static class416 field3554 = new class416("RC", 1);

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "Lgt;")
    public static class454 field3569 = new class454();

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "Lgt;")
    public static class454 field3572 = new class454();

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "Lmc;")
    private class134 field3570;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "Loca;")
    public static class263 field3557;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "Loh;")
    public static class404 field3568;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "Luw;")
    public static class416 field3567;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Lgh;")
    public static class546 field3549;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lpia;ILub;)Lkw;")
    public static final class249 method1715(class94 arg0, int arg1, class20 arg2) {
        field3560++;
        class249 var3 = class744.method4139(true);
        var3.field3020 = arg0.field990;
        if (arg1 < 46) {
            return null;
        }
        var3.field3014 = arg0;
        if (var3.field3020 == -1) {
            var3.field3016 = new class179(260);
        } else if (var3.field3020 == -2) {
            var3.field3016 = new class179(10000);
        } else if (var3.field3020 <= 18) {
            var3.field3016 = new class179(20);
        } else if (var3.field3020 > 98) {
            var3.field3016 = new class179(260);
        } else {
            var3.field3016 = new class179(100);
        }
        var3.field3016.method1104(arg2, (byte) -63);
        var3.field3016.method1107(0, var3.field3014.method635(-3073));
        var3.field3015 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
    public static final void method1716(byte arg0) {
        int var1 = -84 / ((32 - arg0) / 44);
        if (class149.field1657 >= 0) {
            long var2 = class652.method3700(-1);
            class149.field1657 = (int) ((long) class149.field1657 - (var2 - class368.field4705));
            if (class149.field1657 <= 0) {
                class501.field7036 = class673.field9545.field749;
                class716.field10051 = class673.field9545.field753;
                class253.field3046 = class673.field9545.field745;
                class591.field8336 = class673.field9545.field744;
                class30.field338 = class673.field9545.field743;
                class294.field3624 = class673.field9545.field747;
                class28.field313 = class673.field9545.field754;
                class674.field9559 = class673.field9545.field757;
                class149.field1657 = -1;
                class287.field3518 = class673.field9545.field762;
                class135.field1531 = class673.field9545.field751;
            } else {
                int var4 = (class149.field1657 << 8) / class468.field6699;
                int var5 = 255 - var4;
                float var6 = (float) var4 / 255.0F;
                class287.field3518 = ((class608.field8636 & 0xFF00) * var4 + (class673.field9545.field762 & 0xFF00) * var5 & 0xFF0000) + ((class608.field8636 & 0xFF00FF) * var4 + (class673.field9545.field762 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8;
                float var7 = 1.0F - var6;
                class253.field3046 = (class673.field9545.field745 - class615.field8829) * var7 + class615.field8829;
                class674.field9559 = (class673.field9545.field757 - class547.field7869) * var7 + class547.field7869;
                class501.field7036 = ((class402.field5489 & 0xFF00FF) * var4 + (class673.field9545.field749 & 0xFF00FF) * var5 & 0xFF00FF00) + ((class402.field5489 & 0xFF00) * var4 + (class673.field9545.field749 & 0xFF00) * var5 & 0xFF0000) >>> 8;
                class28.field313 = (class673.field9545.field754 - class472.field6755) * var7 + class472.field6755;
                class135.field1531 = (class673.field9545.field751 - class156.field1721) * var7 + class156.field1721;
                class716.field10051 = (class673.field9545.field753 - class151.field1665) * var7 + class151.field1665;
                class294.field3624 = class229.field2672 * var4 + class673.field9545.field747 * var5 >> 8;
                class30.field338 = (class673.field9545.field743 - class701.field9883) * var7 + class701.field9883;
                if (class697.field9811 != class673.field9545.field744) {
                    class591.field8336 = class82.field858.method341(class697.field9811, class673.field9545.field744, var7, class591.field8336);
                }
            }
            class368.field4705 = var2;
        }
        field3553++;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)Z")
    public final boolean method1717(byte arg0) {
        field3564++;
        if (arg0 == 28) {
            return this.field3563.field1521 == this.field3563;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Lmc;")
    public final class134 method1718(int arg0) {
        field3566++;
        if (arg0 != 184887176) {
            return null;
        }
        class134 var2 = this.field3563.field1520;
        if (this.field3563 == var2) {
            this.field3570 = null;
            return null;
        } else {
            this.field3570 = var2.field1520;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Lmc;")
    public final class134 method1719(int arg0) {
        field3561++;
        class134 var2 = this.field3563.field1521;
        if (this.field3563 == var2) {
            this.field3570 = null;
            return null;
        }
        if (arg0 != 65280) {
            method1716((byte) 122);
        }
        this.field3570 = var2.field1521;
        return var2;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILwi;Lha;)V")
    public static final void method1720(int arg0, int arg1, class464 arg2, class58 arg3) {
        field3559++;
        if (class614.field8797 != null && arg1 <= arg2.field6623) {
            for (int var4 = 0; var4 < class614.field8797.length; var4++) {
                if (class614.field8797[var4] != -1000000 && (class614.field8797[var4] >= arg2.field6625[0] || class614.field8797[var4] >= arg2.field6625[1] || arg2.field6625[2] <= class614.field8797[var4] || arg2.field6625[3] <= class614.field8797[var4]) && (arg2.field6627[0] <= class208.field2450[var4] || class208.field2450[var4] >= arg2.field6627[1] || arg2.field6627[2] <= class208.field2450[var4] || arg2.field6627[3] <= class208.field2450[var4]) && (arg2.field6627[0] >= class502.field7051[var4] || arg2.field6627[1] >= class502.field7051[var4] || class502.field7051[var4] <= arg2.field6627[2] || arg2.field6627[3] >= class502.field7051[var4]) && (class104.field1086[var4] >= arg2.field6635[0] || arg2.field6635[1] <= class104.field1086[var4] || class104.field1086[var4] >= arg2.field6635[2] || arg2.field6635[3] <= class104.field1086[var4]) && (arg2.field6635[0] >= class334.field4312[var4] || arg2.field6635[1] >= class334.field4312[var4] || arg2.field6635[2] >= class334.field4312[var4] || arg2.field6635[3] >= class334.field4312[var4])) {
                    return;
                }
            }
        }
        if (arg2.field6629 == 1) {
            int var5 = class626.field8992 + arg2.field6636 - class440.field6387;
            if (var5 >= 0 && var5 <= (class626.field8992 + class626.field8992)) {
                int var6 = arg2.field6633 + class626.field8992 - class444.field6433;
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > class626.field8992 + class626.field8992) {
                    return;
                }
                int var7 = arg2.field6630 + class626.field8992 - class444.field6433;
                if (var7 > class626.field8992 + class626.field8992) {
                    var7 = class626.field8992 + class626.field8992;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class233.field2770[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class259.field3164 - arg2.field6627[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class634.field9111) && class47.method268(67108863, 0, arg2) && class47.method268(67108863, 1, arg2) && class47.method268(67108863, 2, arg2) && class47.method268(67108863, 3, arg2)) {
                        class228.field2600[class738.field10311++] = arg2;
                    }
                }
            }
        } else if (arg2.field6629 == 2) {
            int var10 = arg2.field6633 + class626.field8992 - class444.field6433;
            if (var10 >= 0 && class626.field8992 + class626.field8992 >= var10) {
                int var11 = class626.field8992 + arg2.field6636 - class440.field6387;
                if (var11 < 0) {
                    var11 = 0;
                } else if (class626.field8992 + class626.field8992 < var11) {
                    return;
                }
                int var12 = arg2.field6634 + class626.field8992 - class440.field6387;
                if (var12 > class626.field8992 + class626.field8992) {
                    var12 = class626.field8992 + class626.field8992;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class233.field2770[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class681.field9642 - arg2.field6635[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class634.field9111) && class47.method268(67108863, 0, arg2) && class47.method268(67108863, 1, arg2) && class47.method268(67108863, 2, arg2) && class47.method268(67108863, 3, arg2)) {
                        class228.field2600[class738.field10311++] = arg2;
                    }
                }
            }
        } else if (arg2.field6629 == 16 || arg2.field6629 == 8) {
            int var23 = class626.field8992 + arg2.field6636 - class440.field6387;
            if (var23 >= 0 && var23 <= (class626.field8992 + class626.field8992)) {
                int var24 = arg2.field6633 + class626.field8992 - class444.field6433;
                if (var24 >= 0 && (class626.field8992 + class626.field8992) >= var24 && class233.field2770[var23][var24]) {
                    float var25 = (float) (class259.field3164 - arg2.field6627[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class681.field9642 - arg2.field6635[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!(var25 < (float) class634.field9111) || !(var26 < (float) class634.field9111) && class47.method268(67108863, 0, arg2) && class47.method268(67108863, 1, arg2) && class47.method268(67108863, 2, arg2) && class47.method268(67108863, 3, arg2)) {
                        class228.field2600[class738.field10311++] = arg2;
                    }
                }
            }
        } else {
            if (arg0 < 37) {
                method1726(-101);
            }
            if (arg2.field6629 == 4) {
                float var15 = (float) (arg2.field6625[0] - class28.field312);
                if (!(var15 <= (float) class494.field7001)) {
                    int var16 = arg2.field6633 + class626.field8992 - class444.field6433;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > (class626.field8992 + class626.field8992)) {
                        return;
                    }
                    int var17 = arg2.field6630 + class626.field8992 - class444.field6433;
                    if (var17 > class626.field8992 + class626.field8992) {
                        var17 = class626.field8992 + class626.field8992;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = class626.field8992 + arg2.field6636 - class440.field6387;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > class626.field8992 + class626.field8992) {
                        return;
                    }
                    int var19 = arg2.field6634 + class626.field8992 - class440.field6387;
                    if (var19 > class626.field8992 + class626.field8992) {
                        var19 = class626.field8992 + class626.field8992;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label296: for (int var21 = var18; var21 <= var19; var21++) {
                        for (int var22 = var16; var22 <= var17; var22++) {
                            if (class233.field2770[var21][var22]) {
                                var20 = true;
                                break label296;
                            }
                        }
                    }
                    if (var20 && class47.method268(67108863, 0, arg2) && class47.method268(67108863, 1, arg2) && class47.method268(67108863, 2, arg2) && class47.method268(67108863, 3, arg2)) {
                        class228.field2600[class738.field10311++] = arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLmc;)V")
    public final void method1721(byte arg0, class134 arg1) {
        int var3 = -57 / ((34 - arg0) / 58);
        field3562++;
        if (arg1.field1520 != null) {
            arg1.method864(12983);
        }
        arg1.field1520 = this.field3563.field1520;
        arg1.field1521 = this.field3563;
        arg1.field1520.field1521 = arg1;
        arg1.field1521.field1520 = arg1;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1722(int arg0, byte arg1, int arg2) {
        field3547++;
        if (arg1 != -6) {
            field3567 = null;
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)Lmc;")
    public final class134 method1723(int arg0) {
        if (arg0 != -20665) {
            field3557 = null;
        }
        field3565++;
        class134 var2 = this.field3570;
        if (this.field3563 == var2) {
            this.field3570 = null;
            return null;
        } else {
            this.field3570 = var2.field1521;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lbq;I)V")
    public final void method1724(class289 arg0, int arg1) {
        this.method1725(arg0, 260, this.field3563.field1521);
        if (arg1 != 3) {
            this.field3563 = null;
        }
        field3548++;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lbq;ILmc;)V")
    private final void method1725(class289 arg0, int arg1, class134 arg2) {
        if (arg1 != 260) {
            return;
        }
        field3555++;
        class134 var4 = this.field3563.field1520;
        this.field3563.field1520 = arg2.field1520;
        arg2.field1520.field1521 = this.field3563;
        if (this.field3563 != arg2) {
            arg2.field1520 = arg0.field3563.field1520;
            arg2.field1520.field1521 = arg2;
            var4.field1521 = arg0.field3563;
            arg0.field3563.field1520 = var4;
        }
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(I)V")
    public static void method1726(int arg0) {
        if (arg0 != -9806) {
            method1722(33, (byte) 1, 5);
        }
        field3557 = null;
        field3549 = null;
        field3569 = null;
        field3568 = null;
        field3554 = null;
        field3572 = null;
        field3567 = null;
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)I")
    public final int method1727(int arg0) {
        field3556++;
        int var2 = 0;
        class134 var3 = this.field3563.field1521;
        while (this.field3563 != var3) {
            var3 = var3.field1521;
            var2++;
        }
        int var4 = 126 / ((63 - arg0) / 44);
        return var2;
    }

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)V")
    public final void method1728(int arg0) {
        while (true) {
            class134 var2 = this.field3563.field1521;
            if (this.field3563 == var2) {
                if (arg0 != 29632) {
                    method1726(91);
                }
                field3551++;
                this.field3570 = null;
                return;
            }
            var2.method864(12983);
        }
    }

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "(I)Lmc;")
    public final class134 method1729(int arg0) {
        field3558++;
        if (arg0 != 662) {
            this.field3563 = null;
        }
        class134 var2 = this.field3563.field1521;
        if (this.field3563 == var2) {
            return null;
        } else {
            var2.method864(12983);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)Lmc;")
    public final class134 method1730(int arg0) {
        field3550++;
        class134 var2 = this.field3570;
        if (this.field3563 == var2) {
            this.field3570 = null;
            return null;
        } else {
            this.field3570 = var2.field1520;
            return arg0 == -1024 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
    public class289() {
        this.field3563.field1520 = this.field3563;
        this.field3563.field1521 = this.field3563;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lmc;B)V")
    public final void method1731(class134 arg0, byte arg1) {
        field3552++;
        if (arg0.field1520 != null) {
            arg0.method864(12983);
        }
        arg0.field1521 = this.field3563.field1521;
        arg0.field1520 = this.field3563;
        arg0.field1520.field1521 = arg0;
        arg0.field1521.field1520 = arg0;
        int var3 = -89 / ((69 - arg1) / 35);
    }
}
