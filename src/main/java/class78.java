import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 {

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Ls;")
    public class125 field1629 = new class125();

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    public static int[] field1623 = new int[200];

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[Z")
    public static boolean[] field1626 = new boolean[100];

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lod;")
    private static class101 field1630 = class46.method335(100, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lod;")
    public static class101 field1620 = class46.method335(-75, "0(U");

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lod;")
    public static class101 field1631 = field1630;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Lod;")
    public static class101 field1643 = field1630;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lod;")
    public static class101 field1640 = class46.method335(116, ":assistreq:");

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lod;")
    private static class101 field1624 = class46.method335(-66, "cyan:");

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lod;")
    public static class101 field1622 = field1624;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lod;")
    public static class101 field1625 = field1624;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "[I")
    public static int[] field1647 = new int[500];

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lod;")
    public static class101 field1648 = class46.method335(-105, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Ls;")
    private class125 field1641;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lc;")
    public static class15 field1644;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method522(int arg0) {
        class93.field2002.method135(0);
        field1634++;
        if (arg0 != 4) {
            field1626 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Ls;")
    public final class125 method523(boolean arg0) {
        class125 var2 = this.field1629.field2731;
        if (arg0) {
            field1630 = null;
        }
        field1633++;
        if (this.field1629 == var2) {
            this.field1641 = null;
            return null;
        } else {
            this.field1641 = var2.field2731;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ls;BLs;)V")
    public final void method524(class125 arg0, byte arg1, class125 arg2) {
        if (arg0.field2724 != null) {
            arg0.method959(11835);
        }
        arg0.field2724 = arg2.field2724;
        arg0.field2731 = arg2;
        field1621++;
        arg0.field2724.field2731 = arg0;
        arg0.field2731.field2724 = arg0;
        if (arg1 > -56) {
            this.method529(null, 76);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public final void method525(boolean arg0) {
        field1646++;
        if (!arg0) {
            field1647 = null;
        }
        while (true) {
            class125 var2 = this.field1629.field2731;
            if (this.field1629 == var2) {
                return;
            }
            var2.method959(11835);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Ls;")
    public final class125 method526(int arg0) {
        class125 var2 = this.field1629.field2724;
        field1649++;
        if (this.field1629 == var2) {
            this.field1641 = null;
            return null;
        }
        this.field1641 = var2.field2724;
        if (arg0 != 1580) {
            this.field1641 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)Ls;")
    public final class125 method527(boolean arg0) {
        field1627++;
        if (!arg0) {
            field1640 = null;
        }
        class125 var2 = this.field1641;
        if (this.field1629 == var2) {
            this.field1641 = null;
            return null;
        } else {
            this.field1641 = var2.field2731;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(Z)V")
    public static void method528(boolean arg0) {
        field1648 = null;
        if (!arg0) {
            return;
        }
        field1647 = null;
        field1620 = null;
        field1631 = null;
        field1630 = null;
        field1624 = null;
        field1626 = null;
        field1622 = null;
        field1644 = null;
        field1623 = null;
        field1643 = null;
        field1640 = null;
        field1625 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ls;I)V")
    public final void method529(class125 arg0, int arg1) {
        field1645++;
        if (arg1 != 19002) {
            return;
        }
        if (arg0.field2724 != null) {
            arg0.method959(11835);
        }
        arg0.field2724 = this.field1629.field2724;
        arg0.field2731 = this.field1629;
        arg0.field2724.field2731 = arg0;
        arg0.field2731.field2724 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Ls;")
    public final class125 method530(int arg0) {
        field1642++;
        class125 var2 = this.field1641;
        if (this.field1629 == var2) {
            this.field1641 = null;
            return null;
        } else if (arg0 == -15571) {
            this.field1641 = var2.field2724;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILs;)V")
    public final void method531(int arg0, class125 arg1) {
        field1639++;
        if (arg1.field2724 != null) {
            arg1.method959(arg0 ^ 0xFFFFD1C4);
        }
        if (arg0 == -1) {
            arg1.field2731 = this.field1629.field2731;
            arg1.field2724 = this.field1629;
            arg1.field2724.field2731 = arg1;
            arg1.field2731.field2724 = arg1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lsa;")
    public static final class126 method532(int arg0, int arg1) {
        field1637++;
        int var2 = arg1 & 0xFFFF;
        if (arg0 != 0) {
            method533(-39);
        }
        int var3 = arg1 >> 16;
        if (class100.field2161[var3] == null || class100.field2161[var3][var2] == null) {
            boolean var4 = class143.method1139(38, var3);
            if (!var4) {
                return null;
            }
        }
        return class100.field2161[var3][var2];
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I")
    public static final int method533(int arg0) {
        field1635++;
        int var1 = 3;
        if (class26.field677 < 310) {
            int var2 = class133.field3048 >> 7;
            int var3 = class120.field2637 >> 7;
            if ((class86.field1905[class95.field2040][var3][var2] & 0x4) != 0) {
                var1 = class95.field2040;
            }
            int var4 = class82.field1778.field1298 >> 7;
            int var5;
            if (var2 < var4) {
                var5 = var4 - var2;
            } else {
                var5 = var2 - var4;
            }
            int var6 = class82.field1778.field1341 >> 7;
            int var7;
            if (var3 >= var6) {
                var7 = var3 - var6;
            } else {
                var7 = var6 - var3;
            }
            if (var7 > var5) {
                int var8 = 32768;
                int var9 = var5 * 65536 / var7;
                while (var3 != var6) {
                    if (var3 < var6) {
                        var3++;
                    } else if (var6 < var3) {
                        var3--;
                    }
                    var8 += var9;
                    if ((class86.field1905[class95.field2040][var3][var2] & 0x4) != 0) {
                        var1 = class95.field2040;
                    }
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class86.field1905[class95.field2040][var3][var2] & 0x4) != 0) {
                            var1 = class95.field2040;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var5;
                int var11 = 32768;
                while (var2 != var4) {
                    if (var4 > var2) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class86.field1905[class95.field2040][var3][var2] & 0x4) != 0) {
                        var1 = class95.field2040;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var6 > var3) {
                            var3++;
                        } else if (var3 > var6) {
                            var3--;
                        }
                        if ((class86.field1905[class95.field2040][var3][var2] & 0x4) != 0) {
                            var1 = class95.field2040;
                        }
                    }
                }
            }
        }
        if ((class86.field1905[class95.field2040][class82.field1778.field1341 >> 7][class82.field1778.field1298 >> 7] & 0x4) != 0) {
            var1 = class95.field2040;
        }
        if (arg0 != 2) {
            field1626 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)Ls;")
    public final class125 method534(int arg0) {
        class125 var2 = this.field1629.field2724;
        field1628++;
        if (this.field1629 == var2) {
            return null;
        }
        if (arg0 >= -80) {
            method528(false);
        }
        var2.method959(11835);
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lge;IIIIILle;I[BI)V")
    public static final void method535(int arg0, class47[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class81 arg7, int arg8, byte[] arg9, int arg10) {
        field1632++;
        class138 var11 = new class138(arg9);
        int var12 = arg6;
        while (true) {
            int var13 = var11.method1052(-108);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method1052(-109);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 & 0x3F;
                int var19 = var11.method1055(109);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg3 == var17 && var16 >= arg0 && arg0 + 8 > var16 && arg8 <= var18 && var18 < arg8 + 8) {
                    class24 var22 = class94.method652(var12, 0);
                    int var23 = arg10 + class65.method448(arg4, var16 & 0x7, 23, var20, var22.field613, var22.field599, var18 & 0x7);
                    int var24 = arg5 + class142.method1133(var22.field613, var22.field599, arg4, var18 & 0x7, var20, var16 & 0x7, 1);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg2;
                        class47 var26 = null;
                        if ((class86.field1905[1][var23][var24] & 0x2) == 2) {
                            var25 = arg2 - 1;
                        }
                        if (var25 >= 0) {
                            var26 = arg1[var25];
                        }
                        class86.method623(var26, arg2, arg4 + var20 & 0x3, var12, var24, var23, arg7, 0, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)Ls;")
    public final class125 method536(int arg0) {
        field1636++;
        class125 var2 = this.field1629.field2731;
        if (arg0 != -8898) {
            field1647 = null;
        }
        if (this.field1629 == var2) {
            return null;
        } else {
            var2.method959(11835);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class78() {
        this.field1629.field2731 = this.field1629;
        this.field1629.field2724 = this.field1629;
    }
}
