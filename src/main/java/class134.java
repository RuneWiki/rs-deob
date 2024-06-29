import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class134 extends class196 {

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "[Ljk;")
    public class277[] field2053;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field2050 = -1;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2052 = "Loading interfaces - ";

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "Lea;")
    public static class235 field2046;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIBI)V", line = 5)
    public static final void method982(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class213.field3233 == 1) {
            class202.field3029[class292.field4454 / 100].method935(class21.field261 - 8, class55.field688 - 8);
        }
        if (class213.field3233 == 2) {
            class202.field3029[class292.field4454 / 100 + 4].method935(class21.field261 - 8, class55.field688 + -8);
        }
        if (arg3 == -98) {
            field2049++;
            class193.method1332((byte) 101);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 27)
    public static void method983(byte arg0) {
        field2046 = null;
        int var1 = 39 / ((23 - arg0) / 55);
        field2052 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Z", line = 41)
    public final boolean method984(int arg0, byte arg1) {
        int var3 = -75 / ((57 - arg1) / 49);
        field2047++;
        return this.field2053[arg0].field4222;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Z", line = 54)
    public final boolean method985(int arg0, int arg1) {
        if (arg1 == 2) {
            field2045++;
            return this.field2053[arg0].field4211;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILbj;)V", line = 68)
    public static final void method986(int arg0, class98 arg1) {
        field2048++;
        if (arg1.field1475 == 0) {
            return;
        }
        class242 var2 = arg1.method699(arg0 - 19477);
        if (arg1.field1508 != -1 && arg1.field1508 < 32768) {
            class69 var3 = class187.field2788[arg1.field1508];
            if (var3 != null) {
                int var4 = arg1.field1566 - var3.field1566;
                int var5 = arg1.field1505 - var3.field1505;
                if (var4 != 0 || var5 != 0) {
                    arg1.field1474 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1508 >= 32768) {
            int var6 = arg1.field1508 - 32768;
            if (class234.field3516 == var6) {
                var6 = 2047;
            }
            class195 var7 = class241.field3592[var6];
            if (var7 != null) {
                int var8 = arg1.field1505 - var7.field1505;
                int var9 = arg1.field1566 - var7.field1566;
                if (var9 != 0 || var8 != 0) {
                    arg1.field1474 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1499 != 0 || arg1.field1545 != 0) && (arg1.field1483 == 0 || arg1.field1565 > 0)) {
            int var10 = arg1.field1566 - ((arg1.field1499 - class217.field3309 - class217.field3309) * 64);
            int var11 = arg1.field1505 - ((arg1.field1545 - class189.field2807 - class189.field2807) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field1474 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field1499 = 0;
            arg1.field1545 = 0;
        }
        int var12 = arg1.field1474 - arg1.field1470 & 0x7FF;
        if (arg0 != 19477) {
            field2050 = 89;
        }
        if (var12 == 0) {
            arg1.field1492 = 0;
            arg1.field1489 = 0;
        } else if (var2.field3609 == 0) {
            arg1.field1492++;
            if (var12 > 1024) {
                arg1.field1470 -= arg1.field1475;
                boolean var13 = true;
                if (var12 < arg1.field1475 || 2048 - arg1.field1475 < var12) {
                    var13 = false;
                    arg1.field1470 = arg1.field1474;
                }
                if (arg1.field1507 == var2.field3597 && (arg1.field1492 > 25 || var13)) {
                    if (var2.field3596 == -1) {
                        arg1.field1507 = var2.field3625;
                    } else {
                        arg1.field1507 = var2.field3596;
                    }
                }
            } else {
                arg1.field1470 += arg1.field1475;
                boolean var14 = true;
                if (var12 < arg1.field1475 || var12 > (2048 - arg1.field1475)) {
                    var14 = false;
                    arg1.field1470 = arg1.field1474;
                }
                if (arg1.field1507 == var2.field3597 && (arg1.field1492 > 25 || var14)) {
                    if (var2.field3612 == -1) {
                        arg1.field1507 = var2.field3625;
                    } else {
                        arg1.field1507 = var2.field3612;
                    }
                }
            }
            arg1.field1470 &= 0x7FF;
        } else {
            if (arg1.field1507 == var2.field3597 && arg1.field1492 > 25) {
                if (var2.field3612 == -1) {
                    arg1.field1507 = var2.field3625;
                } else {
                    arg1.field1507 = var2.field3612;
                }
            }
            int var15 = arg1.field1474 << 5;
            if (arg1.field1557 != var15) {
                arg1.field1557 = var15;
                arg1.field1562 = 0;
                int var16 = var15 - arg1.field1513 & 0xFFFF;
                int var17 = arg1.field1489 * arg1.field1489 / (var2.field3609 * 2);
                if (arg1.field1489 > 0 && var16 >= var17 && (var16 - var17) < 32768) {
                    arg1.field1540 = var16 / 2;
                    arg1.field1481 = true;
                    int var18 = var2.field3626 * var2.field3626 / (var2.field3609 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (arg1.field1540 > var18) {
                        arg1.field1540 = var16 - var18;
                    }
                } else if (arg1.field1489 < 0 && var17 <= (65536 - var16) && (65536 - var16 - var17) < 32768) {
                    arg1.field1481 = true;
                    int var19 = var2.field3626 * var2.field3626 / (var2.field3609 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    arg1.field1540 = (65536 - var16) / 2;
                    if (arg1.field1540 > var19) {
                        arg1.field1540 = 65536 - var16 - var19;
                    }
                } else {
                    arg1.field1481 = false;
                }
            }
            if (arg1.field1489 == 0) {
                int var20 = arg1.field1557 - arg1.field1513 & 0xFFFF;
                if (var2.field3609 <= var20) {
                    arg1.field1562 = 0;
                    arg1.field1481 = true;
                    int var21 = var2.field3626 * var2.field3626 / (var2.field3609 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg1.field1489 = -var2.field3609;
                        arg1.field1540 = (65536 - var20) / 2;
                        if (arg1.field1540 > var21) {
                            arg1.field1540 = 65536 - var20 - var21;
                        }
                    } else {
                        arg1.field1489 = var2.field3609;
                        arg1.field1540 = var20 / 2;
                        if (arg1.field1540 > var21) {
                            arg1.field1540 = var20 - var21;
                        }
                    }
                } else {
                    arg1.field1513 = arg1.field1557;
                }
            } else if (arg1.field1489 > 0) {
                if (arg1.field1562 >= arg1.field1540) {
                    arg1.field1481 = false;
                }
                if (!arg1.field1481) {
                    arg1.field1489 -= var2.field3609;
                    if (arg1.field1489 < 0) {
                        arg1.field1489 = 0;
                    }
                } else if (var2.field3626 > arg1.field1489) {
                    arg1.field1489 += var2.field3609;
                }
            } else {
                if (arg1.field1562 >= arg1.field1540) {
                    arg1.field1481 = false;
                }
                if (!arg1.field1481) {
                    arg1.field1489 += var2.field3609;
                    if (arg1.field1489 > 0) {
                        arg1.field1489 = 0;
                    }
                } else if ((-var2.field3626) < arg1.field1489) {
                    arg1.field1489 -= var2.field3609;
                }
            }
            if (arg1.field1489 > 0) {
                arg1.field1562 += arg1.field1489;
            } else {
                arg1.field1562 -= arg1.field1489;
            }
            arg1.field1513 += arg1.field1489;
            arg1.field1513 &= 0xFFFF;
            arg1.field1470 = arg1.field1513 >> 5;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Llm;Llm;IZ)V", line = 370)
    public class134(class210 arg0, class210 arg1, int arg2, boolean arg3) {
        class156 var5 = new class156();
        int var6 = arg0.method1464((byte) 14, arg2);
        this.field2053 = new class277[var6];
        int[] var7 = arg0.method1442(arg2, (byte) 104);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1441(var7[var8], (byte) -44, arg2);
            class70 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class70 var12 = (class70) var5.method1109(-128); var12 != null; var12 = (class70) var5.method1115((byte) 74)) {
                if (var12.field928 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1449((byte) -109, var11, 0);
                } else {
                    var13 = arg1.method1449((byte) -80, 0, var11);
                }
                var10 = new class70(var11, var13);
                var5.method1108(var10, 65280);
            }
            this.field2053[var7[var8]] = new class277(var9, var10);
        }
    }
}
