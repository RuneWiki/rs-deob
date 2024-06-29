import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class60 {

    @OriginalMember(owner = "client!ib", name = "ub", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client!ib", name = "tb", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client!ib", name = "Tb", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!ib", name = "Gb", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!ib", name = "vb", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client!ib", name = "Bb", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!ib", name = "sb", descriptor = "Lgd;")
    private class46 field1598;

    @OriginalMember(owner = "client!ib", name = "rb", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client!ib", name = "yb", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client!ib", name = "Ib", descriptor = "Lrd;")
    private static class117 field1614 = class95.method812("Unexpected server response", (byte) 8);

    @OriginalMember(owner = "client!ib", name = "Mb", descriptor = "Lrd;")
    private static class117 field1618 = class95.method812("Click to continue", (byte) 8);

    @OriginalMember(owner = "client!ib", name = "Lb", descriptor = "Z")
    public static boolean field1617 = false;

    @OriginalMember(owner = "client!ib", name = "Ab", descriptor = "Lrd;")
    public static class117 field1606 = class95.method812(":  ", (byte) 8);

    @OriginalMember(owner = "client!ib", name = "xb", descriptor = "Lrd;")
    public static class117 field1603 = field1614;

    @OriginalMember(owner = "client!ib", name = "Kb", descriptor = "Lrd;")
    public static class117 field1616 = class95.method812("(Z", (byte) 8);

    @OriginalMember(owner = "client!ib", name = "Cb", descriptor = "Lrd;")
    public static class117 field1608 = field1618;

    @OriginalMember(owner = "client!ib", name = "Rb", descriptor = "I")
    public static int field1623 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ib", name = "Qb", descriptor = "Lrd;")
    private static class117 field1622 = class95.method812("Error loading your profile)3", (byte) 8);

    @OriginalMember(owner = "client!ib", name = "wb", descriptor = "Lrd;")
    public static class117 field1602 = field1622;

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "Lmb;")
    public static class85 field1596 = new class85(100);

    @OriginalMember(owner = "client!ib", name = "Vb", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!ib", name = "Wb", descriptor = "Lmb;")
    public static class85 field1628 = new class85(128);

    @OriginalMember(owner = "client!ib", name = "Xb", descriptor = "Lrd;")
    public static class117 field1629 = class95.method812("Untersuchen", (byte) 8);

    @OriginalMember(owner = "client!ib", name = "zb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ib", name = "Db", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ib", name = "Eb", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ib", name = "Fb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ib", name = "Hb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ib", name = "Jb", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ib", name = "Nb", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ib", name = "Ob", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ib", name = "Pb", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ib", name = "Ub", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "Lbf;")
    public static class14 field1595;

    @OriginalMember(owner = "client!ib", name = "Sb", descriptor = "Laf;")
    public static class7 field1624;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1629 = null;
        field1624 = null;
        field1603 = null;
        field1595 = null;
        field1628 = null;
        field1608 = null;
        if (arg0 != 128) {
            method602(false);
        }
        field1622 = null;
        field1614 = null;
        field1602 = null;
        field1616 = null;
        field1618 = null;
        field1606 = null;
        field1596 = null;
    }

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)V")
    public static final void method600(int arg0) {
        field1615++;
        if (~class21.field604 > arg0 && class32.field955 == 0 && !class46.field1292) {
            return;
        }
        class117 var1;
        if (class32.field955 == 1 && class21.field604 < 2) {
            var1 = class18.method193(new class117[] { class21.field583, class37.field1070, class1.field29, class99.field2465 }, arg0 + 23);
        } else if (class46.field1292 && class21.field604 < 2) {
            var1 = class18.method193(new class117[] { class37.field1085, class37.field1070, class57.field1589, class99.field2465 }, 45);
        } else {
            var1 = class35.field1051[class21.field604 - 1];
        }
        if (class21.field604 > 2) {
            var1 = class18.method193(new class117[] { var1, class53.field1513, class142.method1131(class21.field604 - 2, true), class22.field640 }, 123);
        }
        class137.field3305.method200(var1, 4, 15, 16777215, true, class85.field2236 / 1000);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)Z")
    public static final boolean method601(int arg0, int arg1, int arg2) {
        field1626++;
        if (arg2 == 0 && class96.field2420 == arg0) {
            return true;
        } else if (arg2 == 1 && class124.field2993 == arg0) {
            return true;
        } else if ((arg2 == 2 || arg2 == 3) && class33.field991 == arg0) {
            return true;
        } else {
            int var3 = -124 % ((arg1 + 31) / 46);
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    public static final void method602(boolean arg0) {
        field1609++;
        if (class35.field1041 != null) {
            class71 var1 = class35.field1041;
            synchronized (class35.field1041) {
                class35.field1041 = null;
            }
        }
        if (!arg0) {
            method605(true);
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Ldf;")
    public final class28 method448(int arg0) {
        if (this.field1598 != null) {
            int var2 = class85.field2236 - this.field1597;
            if (var2 > 100 && this.field1598.field1290 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field1598.field1282[this.field1604]) {
                            break label42;
                        }
                        var2 -= this.field1598.field1282[this.field1604];
                        this.field1604++;
                    } while (this.field1604 < this.field1598.field1309.length);
                    this.field1604 -= this.field1598.field1290;
                } while (this.field1604 >= 0 && this.field1598.field1309.length > this.field1604);
                this.field1598 = null;
            }
            this.field1597 = class85.field2236 - var2;
        }
        if (arg0 != -16777217) {
            method600(-3);
        }
        field1605++;
        class62 var3 = class147.method1191((byte) 67, this.field1600);
        if (var3.field1791 != null) {
            var3 = var3.method635(-18710);
        }
        return var3 == null ? null : var3.method637(this.field1598, this.field1612, (byte) 104, this.field1599, this.field1607, this.field1604, this.field1601, this.field1625, this.field1594);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)Z")
    public static final boolean method603(boolean arg0, int arg1) {
        field1621++;
        if (arg0) {
            field1595 = null;
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[Lwa;IIIIIII)V")
    public static final void method604(int arg0, int arg1, class144[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 >= -107) {
            method605(false);
        }
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class144 var11 = arg2[var10];
            if (var11 != null && (var11.field3533 == 0 || var11.field3462) && var11 != null && var11.field3509 == arg8 && !class61.method621(false, var11)) {
                int var12 = var11.field3423 + arg0 - arg3;
                int var13 = var11.field3536 + arg5 - arg6;
                int var14 = var11.field3490 + var12;
                int var15 = var11.field3437 + var13;
                int var16 = var13 <= arg5 ? arg5 : var13;
                int var17 = var12 <= arg0 ? arg0 : var12;
                int var18 = arg9 <= var15 ? arg9 : var15;
                int var19 = arg7 > var14 ? var14 : arg7;
                if (var11.field3533 == 0) {
                    method604(var17, arg1, arg2, var17 + var11.field3543 - var12, -128, var16, var16 + var11.field3457 - var13, var19, var11.field3441, var18);
                    if (var11.field3448 != null) {
                        method604(var17, arg1, var11.field3448, var11.field3543 + var17 - var12, -118, var16, var16 + var11.field3457 - var13, var19, var11.field3441, var18);
                    }
                }
                if (var11.field3462) {
                    boolean var20;
                    if (var16 <= class121.field2961 && class66.field1878 >= var17 && class121.field2961 < var18 && class66.field1878 < var19) {
                        var20 = true;
                    } else {
                        var20 = false;
                    }
                    boolean var21 = false;
                    if (class53.field1515 == 1 && var20) {
                        var21 = true;
                    }
                    boolean var22 = false;
                    if (client.field624 == 1 && var16 <= class66.field1873 && var17 <= class68.field1909 && var18 > class66.field1873 && class68.field1909 < var19) {
                        var22 = true;
                    }
                    if (var22 && class21.field603 == null && (arg1 & 0x200) != 0 && !class15.field354 && class56.method594(103, var11) != null) {
                        class44.field1252 = class66.field1878;
                        class119.field2934 = 0;
                        class21.field603 = var11;
                        class110.field2761 = false;
                        class94.field2357 = class121.field2961;
                    }
                    if (class21.field603 != null || class15.field354) {
                        var20 = false;
                        var21 = false;
                        var22 = false;
                    }
                    if (!var11.field3440 && var22 && (arg1 & 0x1) != 0) {
                        var11.field3440 = true;
                        if (var11.field3508 != null) {
                            class118.method980((byte) 115, var11.field3508, var11, 0, class68.field1909 - var12, null, class66.field1873 - var13);
                        }
                    }
                    if (var11.field3440 && var21 && (arg1 & 0x4) != 0 && var11.field3514 != null) {
                        class118.method980((byte) 127, var11.field3514, var11, 0, class66.field1878 - var12, null, class121.field2961 - var13);
                    }
                    if (var11.field3440 && !var21 && (arg1 & 0x2) != 0) {
                        var11.field3440 = false;
                        if (var11.field3488 != null) {
                            class118.method980((byte) 86, var11.field3488, var11, 0, class66.field1878 - var12, null, class121.field2961 - var13);
                        }
                    }
                    if (var21 && (arg1 & 0x8) != 0 && var11.field3461 != null) {
                        class118.method980((byte) 86, var11.field3461, var11, 0, class66.field1878 - var12, null, class121.field2961 - var13);
                    }
                    if (!var11.field3520 && var20 && (arg1 & 0x10) != 0) {
                        var11.field3520 = true;
                        if (var11.field3470 != null) {
                            class118.method980((byte) 98, var11.field3470, var11, 0, class66.field1878 - var12, null, class121.field2961 - var13);
                        }
                    }
                    if (var11.field3520 && var20 && (arg1 & 0x40) != 0 && var11.field3477 != null) {
                        class118.method980((byte) 80, var11.field3477, var11, 0, class66.field1878 - var12, null, class121.field2961 - var13);
                    }
                    if (var11.field3520 && !var20 && (arg1 & 0x20) != 0) {
                        var11.field3520 = false;
                        if (var11.field3422 != null) {
                            class118.method980((byte) 88, var11.field3422, var11, 0, class66.field1878 - var12, null, class121.field2961 - var13);
                        }
                    }
                    if (var11.field3483 != null && (arg1 & 0x80) != 0) {
                        class118.method980((byte) 82, var11.field3483, var11, 0, 0, null, 0);
                    }
                    if (var20 && class39.field1133 != 0 && var11.field3426 != null && (arg1 & 0x400) != 0) {
                        class118.method980((byte) 100, var11.field3426, var11, 0, class39.field1133, null, 0);
                    }
                    if ((arg1 & 0x100) != 0) {
                        if (class84.field2198 > var11.field3468 && var11.field3442 != null) {
                            class118.method980((byte) 101, var11.field3442, var11, 0, 0, null, 0);
                        }
                        if (class99.field2463 > var11.field3468 && var11.field3513 != null) {
                            class118.method980((byte) 126, var11.field3513, var11, 0, 0, null, 0);
                        }
                        if (var11.field3468 < class25.field760 && var11.field3501 != null) {
                            class118.method980((byte) 98, var11.field3501, var11, 0, 0, null, 0);
                        }
                        var11.field3468 = class85.field2236;
                    }
                }
            }
        }
        field1620++;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
    public static final void method605(boolean arg0) {
        if (arg0) {
            method604(-20, 90, null, 95, 16, 0, -28, -83, 7, -112);
        }
        field1619++;
        for (int var1 = 0; var1 < class27.field803; var1++) {
            int var10002 = class77.field2088[var1]--;
            if (class77.field2088[var1] >= -10) {
                class113 var3 = class18.field454[var1];
                if (var3 == null) {
                    var3 = class113.method921(class101.field2503, class14.field298[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class77.field2088[var1] += var3.method920();
                    class18.field454[var1] = var3;
                }
                if (class77.field2088[var1] < 0) {
                    int var10;
                    if (class100.field2492[var1] == 0) {
                        var10 = class72.field2024;
                    } else {
                        int var4 = (class100.field2492[var1] & 0xFF) * 128;
                        int var5 = class100.field2492[var1] >> 8 & 0xFF;
                        int var6 = class100.field2492[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class144.field3516.field717;
                        int var8 = var5 * 128 + 64 - class144.field3516.field751;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var9 > var4) {
                            class77.field2088[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class63.field1813 / var4;
                    }
                    if (var10 > 0) {
                        class126 var11 = var3.method919().method1005(class79.field2117);
                        class34 var12 = class34.method410(var11, 100, var10);
                        var12.method423(class115.field2818[var1] - 1);
                        class61.field1702.method877(var12);
                    }
                    class77.field2088[var1] = -100;
                }
            } else {
                class27.field803--;
                for (int var2 = var1; var2 < class27.field803; var2++) {
                    class14.field298[var2] = class14.field298[var2 + 1];
                    class18.field454[var2] = class18.field454[var2 + 1];
                    class115.field2818[var2] = class115.field2818[var2 + 1];
                    class77.field2088[var2] = class77.field2088[var2 + 1];
                    class100.field2492[var2] = class100.field2492[var2 + 1];
                }
                var1--;
            }
        }
        if (class71.field1984 && !class138.method1120((byte) -28)) {
            if (class16.field383 != 0 && class63.field1814 != -1) {
                class53.method584(class71.field1980, class63.field1814, 0, 10000, false, class16.field383);
            }
            class71.field1984 = false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIIIIZLid;)V")
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class60 arg9) {
        this.field1600 = arg0;
        this.field1599 = arg5;
        this.field1594 = arg4;
        this.field1625 = arg3;
        this.field1612 = arg6;
        this.field1601 = arg1;
        this.field1607 = arg2;
        if (arg7 != -1) {
            this.field1598 = class33.method387(arg7, 7455);
            this.field1597 = class85.field2236 - 1;
            this.field1604 = 0;
            if (this.field1598.field1279 == 0 && arg9 != null && arg9 instanceof class58) {
                class58 var11 = (class58) arg9;
                if (this.field1598 == var11.field1598) {
                    this.field1597 = var11.field1597;
                    this.field1604 = var11.field1604;
                    return;
                }
            }
            if (arg8 && this.field1598.field1290 != -1) {
                this.field1604 = (int) ((double) this.field1598.field1309.length * Math.random());
                this.field1597 -= (int) ((double) this.field1598.field1282[this.field1604] * Math.random());
                return;
            }
        }
    }
}
