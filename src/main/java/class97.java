import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class97 {

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    private int field1574 = 0;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[Lw;")
    public class104[] field1560;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Le;")
    public static class191 field1563 = class54.method368(":trade:", 2047);

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "[I")
    public static int[] field1570 = new int[100];

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Le;")
    public static class191 field1566 = class54.method368("mapfunction", 2047);

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Le;")
    public static class191 field1562 = class54.method368("_labels", 2047);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "J")
    private long field1572;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lw;")
    private class104 field1571;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lw;")
    private class104 field1575;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lng;")
    public static class121 field1565;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lek;")
    public static class182 field1556;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[Lwa;")
    public static class226[] field1569;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([Le;[SB)V")
    public static final void method601(class191[] arg0, short[] arg1, byte arg2) {
        field1553++;
        class74.method478(arg1, 0, arg0.length - 1, 2086, arg0);
        if (arg2 != 83) {
            method602(-71, (byte) 105, -97);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBI)V")
    public static final void method602(int arg0, byte arg1, int arg2) {
        field1551++;
        if (class64.field1132 != arg2) {
            class257.field4559 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class257.field4559[var3] = (var3 << 12) / arg2;
            }
            class64.field1132 = arg2;
            class8.field82 = arg2 - 1;
            class249.field4430 = arg2 == 64 ? 2048 : 4096;
        }
        if (arg1 != 44) {
            method604(-114, -102, -6, 27, 20, -39, -109, 5, 100, 87, false, 5);
        }
        if (class87.field1423 == arg0) {
            return;
        }
        if (class64.field1132 == arg0) {
            class236.field4202 = class257.field4559;
        } else {
            class236.field4202 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class236.field4202[var4] = (var4 << 12) / arg0;
            }
        }
        class87.field1423 = arg0;
        class181.field3119 = arg0 - 1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1576++;
        if (class127.method858(arg8, -127)) {
            class254.field4503 = null;
            class128.method874(class242.field4325[arg8], arg4, arg0, -1, false, arg5, arg1, arg6, arg7, arg2);
            if (class254.field4503 != null) {
                class128.method874(class254.field4503, arg4, arg0, -1412584499, false, class218.field3833, arg1, class157.field2676, arg7, arg2);
                class254.field4503 = null;
            }
            if (arg3 != 21990) {
                field1550 = -76;
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class189.field3324[var9] = true;
            }
        } else {
            class189.field3324[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field1564++;
        if (arg11 < 81) {
            return false;
        } else if (class175.field2946.method490((byte) -4) == 2) {
            return class169.method1146(arg8, arg3, arg0, arg7, arg1, arg9, arg5, -53, arg10, arg4, arg2, arg6);
        } else if (class175.field2946.method490((byte) -4) > 2) {
            return class158.method1076(arg6, arg3, true, arg8, arg0, arg2, arg7, arg1, arg10, class175.field2946.method490((byte) -4), arg4, arg9, arg5);
        } else {
            return class132.method893(arg9, arg1, arg3, arg5, arg7, arg10, arg8, arg0, arg4, arg2, arg6, 106);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JILw;)V")
    public final void method605(long arg0, int arg1, class104 arg2) {
        field1567++;
        if (arg2.field1724 != null) {
            arg2.method655(63);
        }
        class104 var5 = this.field1560[(int) ((long) (this.field1561 - 1) & arg0)];
        arg2.field1711 = var5;
        arg2.field1724 = var5.field1724;
        if (arg1 == -3) {
            arg2.field1713 = arg0;
            arg2.field1724.field1711 = arg2;
            arg2.field1711.field1724 = arg2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BJ)V")
    public static final void method606(byte arg0, long arg1) {
        field1558++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class270.field4759 < 100 || class180.field3090 == 1) || class270.field4759 >= 200) {
            class47.method320(class234.field4177, class26.field385, 0, -1);
            return;
        }
        class191 var3 = class33.method225(arg1, false).method1345((byte) -18);
        for (int var4 = 0; var4 < class270.field4759; var4++) {
            if (class35.field643[var4] == arg1) {
                class47.method320(class228.method1629(new class191[] { var3, class273.field4819 }, (byte) -31), class26.field385, 0, -1);
                return;
            }
        }
        for (int var5 = 0; var5 < class254.field4506; var5++) {
            if (class207.field3693[var5] == arg1) {
                class47.method320(class228.method1629(new class191[] { class118.field1946, var3, class248.field4412 }, (byte) -50), class26.field385, 0, -1);
                return;
            }
        }
        if (var3.method1317(-27518, class175.field2946.field1315)) {
            class47.method320(class40.field720, class26.field385, 0, -1);
            return;
        }
        class17.field223++;
        class252.field4466[class270.field4759] = var3;
        class35.field643[class270.field4759] = arg1;
        class206.field3650[class270.field4759] = 0;
        class209.field3702[class270.field4759] = class26.field385;
        if (arg0 <= 4) {
            method611((byte) 127);
        }
        class33.field504[class270.field4759] = 0;
        class42.field743[class270.field4759] = false;
        class21.field297 = class110.field1841;
        class270.field4759++;
        class53.field963.method1096(229, 0);
        class53.field963.method1589(arg1, false);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
    public final int method607(int arg0) {
        field1559++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1561; var3++) {
            class104 var4 = this.field1560[var3];
            class104 var5 = var4.field1711;
            while (var4 != var5) {
                var5 = var5.field1711;
                var2++;
            }
        }
        if (arg0 != 4583) {
            this.field1561 = -100;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lw;")
    public final class104 method608(byte arg0) {
        field1552++;
        int var2 = 102 / ((arg0 - 12) / 53);
        if (this.field1571 == null) {
            return null;
        }
        class104 var3 = this.field1560[(int) ((long) (this.field1561 - 1) & this.field1572)];
        while (this.field1571 != var3) {
            if (this.field1571.field1713 == this.field1572) {
                class104 var4 = this.field1571;
                this.field1571 = this.field1571.field1711;
                return var4;
            }
            this.field1571 = this.field1571.field1711;
        }
        this.field1571 = null;
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lw;")
    public final class104 method609(boolean arg0) {
        if (arg0) {
            this.field1560 = null;
        }
        this.field1574 = 0;
        field1568++;
        return this.method610(111);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lw;")
    public final class104 method610(int arg0) {
        field1555++;
        if (this.field1574 > 0 && this.field1560[this.field1574 - 1] != this.field1575) {
            class104 var2 = this.field1575;
            this.field1575 = var2.field1711;
            return var2;
        }
        int var3 = 124 / ((arg0 - 4) / 63);
        while (this.field1574 < this.field1561) {
            class104 var4 = this.field1560[this.field1574++].field1711;
            if (this.field1560[this.field1574 - 1] != var4) {
                this.field1575 = var4.field1711;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static void method611(byte arg0) {
        field1570 = null;
        field1556 = null;
        field1563 = null;
        if (arg0 != 121) {
            field1566 = null;
        }
        field1562 = null;
        field1565 = null;
        field1566 = null;
        field1569 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JZ)Lw;")
    public final class104 method612(long arg0, boolean arg1) {
        field1557++;
        this.field1572 = arg0;
        class104 var4 = this.field1560[(int) ((long) (this.field1561 - 1) & arg0)];
        if (!arg1) {
            this.method612(-104L, true);
        }
        for (this.field1571 = var4.field1711; this.field1571 != var4; this.field1571 = this.field1571.field1711) {
            if (this.field1571.field1713 == arg0) {
                class104 var5 = this.field1571;
                this.field1571 = this.field1571.field1711;
                return var5;
            }
        }
        this.field1571 = null;
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class97(int arg0) {
        this.field1561 = arg0;
        this.field1560 = new class104[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class104 var3 = this.field1560[var2] = new class104();
            var3.field1724 = var3;
            var3.field1711 = var3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public final void method613(int arg0) {
        for (int var2 = arg0; var2 < this.field1561; var2++) {
            class104 var3 = this.field1560[var2];
            while (true) {
                class104 var4 = var3.field1711;
                if (var3 == var4) {
                    break;
                }
                var4.method655(63);
            }
        }
        this.field1571 = null;
        field1573++;
        this.field1575 = null;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)I")
    public final int method614(int arg0) {
        if (arg0 != 0) {
            field1550 = 107;
        }
        field1554++;
        return this.field1561;
    }
}
