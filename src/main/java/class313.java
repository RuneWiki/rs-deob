import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class313 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[Lvt;")
    public static class759[] field4712 = new class759[8];

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lov;)V", line = 4)
    public static final void method2060(class668 arg0) {
        class478.field6933.method337(arg0.field9477, arg0.field9474 + (arg0.method100((byte) -60) >> 1), arg0.field9475, class364.field5570);
        arg0.field9481 = class364.field5570[0];
        arg0.field9479 = class364.field5570[1];
        arg0.field9480 = class364.field5570[2];
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lpe;I)V", line = 10)
    public static final void method2061(class109 arg0, int arg1) {
        if (arg0.field1679 != -1) {
            class82 var2 = class83.field1219.method2358((byte) 62, arg0.field1679);
            if (var2 == null || var2.field1197 == null) {
                arg0.field1679 = -1;
                arg0.field1598 = false;
            } else {
                label360: {
                    arg0.field1629++;
                    if (var2.field1197.length > arg0.field1607 && arg0.field1629 > var2.field1211[arg0.field1607]) {
                        arg0.field1629 = 1;
                        arg0.field1690++;
                        arg0.field1607++;
                        if (!arg0.field1630) {
                            class262.method1747(arg0, arg0.field1607, var2, -26868);
                        }
                    }
                    if (var2.field1197.length <= arg0.field1607) {
                        arg0.field1607 = 0;
                        arg0.field1629 = 0;
                        if (arg0.field1598) {
                            arg0.field1679 = arg0.method885(3).method1596(26);
                            if (arg0.field1679 == -1) {
                                arg0.field1598 = false;
                                break label360;
                            }
                            var2 = class83.field1219.method2358((byte) -128, arg0.field1679);
                        }
                        if (!arg0.field1630) {
                            class262.method1747(arg0, arg0.field1607, var2, -26868);
                        }
                    }
                    arg0.field1690 = arg0.field1607 + 1;
                    if (var2.field1197 == null) {
                        arg0.field1598 = false;
                        arg0.field1679 = -1;
                    } else if (var2.field1197.length <= arg0.field1690) {
                        arg0.field1690 = 0;
                    }
                }
            }
        }
        field4711++;
        if (arg0.field1595 != -1 && arg0.field1669 <= class199.field3403) {
            class417 var3 = class41.field718.method1529((byte) 38, arg0.field1595);
            int var4 = var3.field6136;
            if (var4 == -1) {
                arg0.field1595 = -1;
            } else {
                label361: {
                    class82 var5 = class83.field1219.method2358((byte) -74, var4);
                    if (var3.field6123) {
                        if (var5.field1183 == 3) {
                            if (arg0.field1707 > 0 && class199.field3403 >= arg0.field1645 && arg0.field1660 < class199.field3403) {
                                arg0.field1595 = -1;
                                break label361;
                            }
                        } else if (var5.field1183 == 1 && arg0.field1707 > 0 && class199.field3403 >= arg0.field1645 && arg0.field1660 < class199.field3403) {
                            arg0.field1669 = class199.field3403 + 1;
                            break label361;
                        }
                    }
                    if (var5 == null || var5.field1197 == null) {
                        arg0.field1595 = -1;
                    } else {
                        if (arg0.field1662 < 0) {
                            arg0.field1662 = 0;
                            if (!arg0.field1630) {
                                class262.method1747(arg0, 0, var5, -26868);
                            }
                        }
                        arg0.field1684++;
                        if (var5.field1197.length > arg0.field1662 && arg0.field1684 > var5.field1211[arg0.field1662]) {
                            arg0.field1662++;
                            arg0.field1684 = 1;
                            if (!arg0.field1630) {
                                class262.method1747(arg0, arg0.field1662, var5, -26868);
                            }
                        }
                        if (arg0.field1662 >= var5.field1197.length) {
                            if (var3.field6123) {
                                arg0.field1662 -= var5.field1179;
                                arg0.field1617++;
                                if (arg0.field1617 >= var5.field1189) {
                                    arg0.field1595 = -1;
                                } else if (arg0.field1662 < 0 || arg0.field1662 >= var5.field1197.length) {
                                    arg0.field1595 = -1;
                                } else if (!arg0.field1630) {
                                    class262.method1747(arg0, arg0.field1662, var5, -26868);
                                }
                            } else {
                                arg0.field1595 = -1;
                            }
                        }
                        arg0.field1601 = arg0.field1662 + 1;
                        if (var5.field1197.length <= arg0.field1601) {
                            if (var3.field6123) {
                                arg0.field1601 -= var5.field1179;
                                if (var5.field1189 <= arg0.field1617 + 1) {
                                    arg0.field1601 = -1;
                                } else if (arg0.field1601 < 0 || arg0.field1601 >= var5.field1197.length) {
                                    arg0.field1601 = -1;
                                }
                            } else {
                                arg0.field1601 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1693 != -1 && arg0.field1648 <= class199.field3403) {
            class417 var6 = class41.field718.method1529((byte) 14, arg0.field1693);
            int var7 = var6.field6136;
            if (var7 == -1) {
                arg0.field1693 = -1;
            } else {
                label364: {
                    class82 var8 = class83.field1219.method2358((byte) -124, var7);
                    if (var6.field6123) {
                        if (var8.field1183 == 3) {
                            if (arg0.field1707 > 0 && arg0.field1645 <= class199.field3403 && class199.field3403 > arg0.field1660) {
                                arg0.field1693 = -1;
                                break label364;
                            }
                        } else if (var8.field1183 == 1 && arg0.field1707 > 0 && class199.field3403 >= arg0.field1645 && arg0.field1660 < class199.field3403) {
                            arg0.field1648 = class199.field3403 + 1;
                            break label364;
                        }
                    }
                    if (var8 == null || var8.field1197 == null) {
                        arg0.field1693 = -1;
                    } else {
                        if (arg0.field1632 < 0) {
                            arg0.field1632 = 0;
                            if (!arg0.field1630) {
                                class262.method1747(arg0, 0, var8, -26868);
                            }
                        }
                        arg0.field1673++;
                        if (arg0.field1632 < var8.field1197.length && arg0.field1673 > var8.field1211[arg0.field1632]) {
                            arg0.field1673 = 1;
                            arg0.field1632++;
                            if (!arg0.field1630) {
                                class262.method1747(arg0, arg0.field1632, var8, -26868);
                            }
                        }
                        if (var8.field1197.length <= arg0.field1632) {
                            if (var6.field6123) {
                                arg0.field1632 -= var8.field1179;
                                arg0.field1634++;
                                if (var8.field1189 <= arg0.field1634) {
                                    arg0.field1693 = -1;
                                } else if (arg0.field1632 < 0 || arg0.field1632 >= var8.field1197.length) {
                                    arg0.field1693 = -1;
                                } else if (!arg0.field1630) {
                                    class262.method1747(arg0, arg0.field1632, var8, -26868);
                                }
                            } else {
                                arg0.field1693 = -1;
                            }
                        }
                        arg0.field1625 = arg0.field1632 + 1;
                        if (var8.field1197.length <= arg0.field1625) {
                            if (var6.field6123) {
                                arg0.field1625 -= var8.field1179;
                                if (var8.field1189 <= arg0.field1634 + 1) {
                                    arg0.field1625 = -1;
                                } else if (arg0.field1625 < 0 || arg0.field1625 >= var8.field1197.length) {
                                    arg0.field1625 = -1;
                                }
                            } else {
                                arg0.field1625 = -1;
                            }
                        }
                    }
                }
            }
        }
        int var9 = 94 % ((-arg1 - 57) / 51);
        if (arg0.field1695 != -1 && arg0.field1686 <= 1) {
            class82 var10 = class83.field1219.method2358((byte) -57, arg0.field1695);
            if (var10.field1183 == 3) {
                if (arg0.field1707 > 0 && class199.field3403 >= arg0.field1645 && class199.field3403 > arg0.field1660) {
                    arg0.field1695 = -1;
                    arg0.field1591 = null;
                }
            } else if (var10.field1183 == 1 && arg0.field1707 > 0 && class199.field3403 >= arg0.field1645 && arg0.field1660 < class199.field3403) {
                arg0.field1686 = 2;
            }
        }
        if (arg0.field1695 != -1 && arg0.field1686 == 0) {
            class82 var11 = class83.field1219.method2358((byte) 88, arg0.field1695);
            if (var11 == null || var11.field1197 == null) {
                arg0.field1591 = null;
                arg0.field1695 = -1;
            } else {
                arg0.field1600++;
                if (var11.field1197.length > arg0.field1626 && var11.field1211[arg0.field1626] < arg0.field1600) {
                    arg0.field1600 = 1;
                    arg0.field1626++;
                    if (!arg0.field1630) {
                        class262.method1747(arg0, arg0.field1626, var11, -26868);
                    }
                }
                if (var11.field1197.length <= arg0.field1626) {
                    arg0.field1624++;
                    arg0.field1626 -= var11.field1179;
                    if (var11.field1189 <= arg0.field1624) {
                        arg0.field1591 = null;
                        arg0.field1695 = -1;
                    } else if (arg0.field1626 < 0 || arg0.field1626 >= var11.field1197.length) {
                        arg0.field1591 = null;
                        arg0.field1695 = -1;
                    } else if (!arg0.field1630) {
                        class262.method1747(arg0, arg0.field1626, var11, -26868);
                    }
                }
                arg0.field1611 = arg0.field1626 + 1;
                if (var11.field1197.length <= arg0.field1611) {
                    arg0.field1611 -= var11.field1179;
                    if (arg0.field1624 + 1 >= var11.field1189) {
                        arg0.field1611 = -1;
                    } else if (arg0.field1611 < 0 || var11.field1197.length <= arg0.field1611) {
                        arg0.field1611 = -1;
                    }
                }
            }
        }
        if (arg0.field1686 > 0) {
            arg0.field1686--;
        }
        for (int var12 = 0; var12 < arg0.field1640.length; var12++) {
            class253 var13 = arg0.field1640[var12];
            if (var13 != null) {
                if (var13.field4011 > 0) {
                    var13.field4011--;
                } else {
                    class82 var14 = class83.field1219.method2358((byte) 121, var13.field4013);
                    if (var14 == null || var14.field1197 == null) {
                        arg0.field1640[var12] = null;
                    } else {
                        var13.field4019++;
                        if (var13.field4018 < var14.field1197.length && var14.field1211[var13.field4018] < var13.field4019) {
                            var13.field4019 = 1;
                            var13.field4018++;
                            if (!arg0.field1630) {
                                class262.method1747(arg0, var13.field4018, var14, -26868);
                            }
                        }
                        if (var14.field1197.length <= var13.field4018) {
                            var13.field4018 -= var14.field1179;
                            var13.field4016++;
                            if (var14.field1189 <= var13.field4016) {
                                arg0.field1640[var12] = null;
                            } else if (var13.field4018 < 0 || var14.field1197.length <= var13.field4018) {
                                arg0.field1640[var12] = null;
                            } else if (!arg0.field1630) {
                                class262.method1747(arg0, var13.field4018, var14, -26868);
                            }
                        }
                        var13.field4017 = var13.field4018 + 1;
                        if (var13.field4017 >= var14.field1197.length) {
                            var13.field4017 -= var14.field1179;
                            if (var14.field1189 <= var13.field4016 + 1) {
                                var13.field4017 = -1;
                            } else if (var13.field4017 < 0 || var13.field4017 >= var14.field1197.length) {
                                var13.field4017 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZB)V", line = 497)
    public static final void method2062(boolean arg0, byte arg1) {
        field4713++;
        for (class447 var2 = (class447) class19.field197.method3463((byte) -50); var2 != null; var2 = (class447) class19.field197.method3469((byte) 107)) {
            if (var2.field6518 != null) {
                class324.field4793.method2223(var2.field6518);
                var2.field6518 = null;
            }
            if (var2.field6509 != null) {
                class324.field4793.method2223(var2.field6509);
                var2.field6509 = null;
            }
            var2.method636((byte) 97);
        }
        if (arg0) {
            for (class447 var3 = (class447) class680.field9612.method3463((byte) -50); var3 != null; var3 = (class447) class680.field9612.method3469((byte) 107)) {
                if (var3.field6518 != null) {
                    class324.field4793.method2223(var3.field6518);
                    var3.field6518 = null;
                }
                var3.method636((byte) 97);
            }
            for (class447 var4 = (class447) class261.field4063.method3508((byte) -60); var4 != null; var4 = (class447) class261.field4063.method3520(arg1 - 44)) {
                if (var4.field6518 != null) {
                    class324.field4793.method2223(var4.field6518);
                    var4.field6518 = null;
                }
                var4.method636((byte) 97);
            }
        }
        if (arg1 != 43) {
            method2064(-120, 65);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 562)
    public static void method2063(int arg0) {
        if (arg0 == -1) {
            field4712 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Z", line = 572)
    public static final boolean method2064(int arg0, int arg1) {
        int var2 = -92 / ((32 - arg0) / 39);
        field4710++;
        if (arg1 == 47 || arg1 == 13 || arg1 == 57 || arg1 == 18 || arg1 == 11) {
            return true;
        } else {
            return arg1 == 48 || arg1 == 1011;
        }
    }
}
