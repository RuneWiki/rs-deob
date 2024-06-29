import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class142 extends class659 {

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "Ltca;")
    private class184 field1904;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 4)
    public final String method988(int arg0, int arg1, String arg2) {
        field1898++;
        if (this.field1904 == null) {
            return arg2;
        }
        if (arg0 != 0) {
            method991(null, -121);
        }
        class553 var4 = (class553) this.field1904.method1248(120, (long) arg1);
        return var4 == null ? arg2 : var4.field7630;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIILgi;IIIIILog;)V", line = 28)
    public static final void method989(int arg0, int arg1, int arg2, int arg3, int arg4, class705 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class673 arg11) {
        field1902++;
        class422.field6070 = arg8;
        if (arg9 != -23247) {
            method989(123, 35, -54, 63, 117, null, 120, -5, -74, -4, -60, null);
        }
        class211.field2712 = arg11;
        class315.field4442 = arg10;
        class351.field5124 = null;
        class582.field7911 = arg4;
        class504.field7084 = arg3;
        class738.field10017 = null;
        class224.field2914 = arg1;
        class411.field5838 = null;
        class626.field8487 = arg7;
        class777.field10677 = arg2;
        class478.field6707 = arg5;
        class635.field8579 = arg0;
        class485.field6771 = arg6;
        class174.method1199((byte) 124);
        class517.field7194 = true;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)I", line = 55)
    public final int method990(int arg0, int arg1, int arg2) {
        field1897++;
        if (this.field1904 == null) {
            return arg0;
        }
        class445 var4 = (class445) this.field1904.method1248(99, (long) arg2);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg1 > -79) {
                this.field1904 = null;
            }
            return var4.field6408;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lqba;I)V", line = 75)
    public static final void method991(class425 arg0, int arg1) {
        field1900++;
        if (arg0.field6111 != -1) {
            class317 var2 = class693.field9223.method2388(arg0.field6111, 0);
            if (var2 == null || var2.field4493 == null) {
                arg0.field6111 = -1;
                arg0.field6128 = false;
            } else {
                label284: {
                    arg0.field6155++;
                    if (arg0.field6112 < var2.field4493.length && var2.field4485[arg0.field6112] < arg0.field6155) {
                        arg0.field6155 = 1;
                        arg0.field6112++;
                        arg0.field6121++;
                        if (!arg0.field6135) {
                            class627.method3466(arg0, var2, -29701, arg0.field6112);
                        }
                    }
                    if (arg0.field6112 >= var2.field4493.length) {
                        arg0.field6112 = 0;
                        arg0.field6155 = 0;
                        if (arg0.field6128) {
                            arg0.field6111 = arg0.method2573(-1).method3302(91);
                            if (arg0.field6111 == -1) {
                                arg0.field6128 = false;
                                break label284;
                            }
                            var2 = class693.field9223.method2388(arg0.field6111, arg1 + 24118);
                        }
                        if (!arg0.field6135) {
                            class627.method3466(arg0, var2, -29701, arg0.field6112);
                        }
                    }
                    arg0.field6121 = arg0.field6112 + 1;
                    if (var2.field4493 == null) {
                        arg0.field6111 = -1;
                        arg0.field6128 = false;
                    } else if (arg0.field6121 >= var2.field4493.length) {
                        arg0.field6121 = 0;
                    }
                }
            }
        }
        if (arg1 != -24118) {
            return;
        }
        for (int var3 = 0; var3 < arg0.field6110.length; var3++) {
            if (arg0.field6110[var3].field1549 != -1 && arg0.field6110[var3].field1552 <= class572.field7788) {
                class573 var9 = class641.field8643.method918(arg0.field6110[var3].field1549, 64);
                int var10 = var9.field7819;
                if (var10 == -1) {
                    arg0.field6110[var3].field1549 = -1;
                } else {
                    class317 var11 = class693.field9223.method2388(var10, 0);
                    if (var9.field7801) {
                        if (var11.field4481 == 3) {
                            if (arg0.field6200 > 0 && class572.field7788 >= arg0.field6165 && arg0.field6104 < class572.field7788) {
                                arg0.field6110[var3].field1549 = -1;
                                continue;
                            }
                        } else if (var11.field4481 == 1 && arg0.field6200 > 0 && arg0.field6165 <= class572.field7788 && class572.field7788 > arg0.field6104) {
                            arg0.field6110[var3].field1552 = class572.field7788 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field4493 == null) {
                        arg0.field6110[var3].field1549 = -1;
                    } else {
                        if (arg0.field6110[var3].field1545 < 0) {
                            arg0.field6110[var3].field1545 = 0;
                            if (!arg0.field6135) {
                                class627.method3466(arg0, var11, -29701, 0);
                            }
                        }
                        arg0.field6110[var3].field1551++;
                        if (arg0.field6110[var3].field1545 < var11.field4493.length && var11.field4485[arg0.field6110[var3].field1545] < arg0.field6110[var3].field1551) {
                            arg0.field6110[var3].field1551 = 1;
                            arg0.field6110[var3].field1545++;
                            if (!arg0.field6135) {
                                class627.method3466(arg0, var11, arg1 ^ 0x2A31, arg0.field6110[var3].field1545);
                            }
                        }
                        if (var11.field4493.length <= arg0.field6110[var3].field1545) {
                            if (var9.field7801) {
                                arg0.field6110[var3].field1545 -= var11.field4484;
                                arg0.field6110[var3].field1553++;
                                if (var11.field4473 <= arg0.field6110[var3].field1553) {
                                    arg0.field6110[var3].field1549 = -1;
                                } else if (arg0.field6110[var3].field1545 < 0 || arg0.field6110[var3].field1545 >= var11.field4493.length) {
                                    arg0.field6110[var3].field1549 = -1;
                                } else if (!arg0.field6135) {
                                    class627.method3466(arg0, var11, arg1 ^ 0x2A31, arg0.field6110[var3].field1545);
                                }
                            } else {
                                arg0.field6110[var3].field1549 = -1;
                            }
                        }
                        arg0.field6110[var3].field1555 = arg0.field6110[var3].field1545 + 1;
                        if (var11.field4493.length <= arg0.field6110[var3].field1555) {
                            if (var9.field7801) {
                                arg0.field6110[var3].field1555 -= var11.field4484;
                                if (var11.field4473 <= arg0.field6110[var3].field1553 + 1) {
                                    arg0.field6110[var3].field1555 = -1;
                                } else if (arg0.field6110[var3].field1555 < 0 || var11.field4493.length <= arg0.field6110[var3].field1555) {
                                    arg0.field6110[var3].field1555 = -1;
                                }
                            } else {
                                arg0.field6110[var3].field1555 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field6138 != -1 && arg0.field6183 <= 1) {
            class317 var4 = class693.field9223.method2388(arg0.field6138, 0);
            if (var4.field4481 == 3) {
                if (arg0.field6200 > 0 && arg0.field6165 <= class572.field7788 && arg0.field6104 < class572.field7788) {
                    arg0.field6138 = -1;
                    arg0.field6179 = null;
                }
            } else if (var4.field4481 == 1 && arg0.field6200 > 0 && arg0.field6165 <= class572.field7788 && arg0.field6104 < class572.field7788) {
                arg0.field6183 = 2;
            }
        }
        if (arg0.field6138 != -1 && arg0.field6183 == 0) {
            class317 var5 = class693.field9223.method2388(arg0.field6138, arg1 ^ 0xFFFFA1CA);
            if (var5 == null || var5.field4493 == null) {
                arg0.field6138 = -1;
                arg0.field6179 = null;
            } else {
                arg0.field6157++;
                if (var5.field4493.length > arg0.field6150 && var5.field4485[arg0.field6150] < arg0.field6157) {
                    arg0.field6157 = 1;
                    arg0.field6150++;
                    if (!arg0.field6135) {
                        class627.method3466(arg0, var5, -29701, arg0.field6150);
                    }
                }
                if (var5.field4493.length <= arg0.field6150) {
                    arg0.field6103++;
                    arg0.field6150 -= var5.field4484;
                    if (var5.field4473 <= arg0.field6103) {
                        arg0.field6138 = -1;
                        arg0.field6179 = null;
                    } else if (arg0.field6150 < 0 || arg0.field6150 >= var5.field4493.length) {
                        arg0.field6179 = null;
                        arg0.field6138 = -1;
                    } else if (!arg0.field6135) {
                        class627.method3466(arg0, var5, -29701, arg0.field6150);
                    }
                }
                arg0.field6181 = arg0.field6150 + 1;
                if (arg0.field6181 >= var5.field4493.length) {
                    arg0.field6181 -= var5.field4484;
                    if (var5.field4473 <= arg0.field6103 + 1) {
                        arg0.field6181 = -1;
                    } else if (arg0.field6181 < 0 || arg0.field6181 >= var5.field4493.length) {
                        arg0.field6181 = -1;
                    }
                }
            }
        }
        if (arg0.field6183 > 0) {
            arg0.field6183--;
        }
        for (int var6 = 0; var6 < arg0.field6163.length; var6++) {
            class610 var7 = arg0.field6163[var6];
            if (var7 != null) {
                if (var7.field8253 > 0) {
                    var7.field8253--;
                } else {
                    class317 var8 = class693.field9223.method2388(var7.field8251, arg1 + 24118);
                    if (var8 == null || var8.field4493 == null) {
                        arg0.field6163[var6] = null;
                    } else {
                        var7.field8252++;
                        if (var7.field8249 < var8.field4493.length && var8.field4485[var7.field8249] < var7.field8252) {
                            var7.field8249++;
                            var7.field8252 = 1;
                            if (!arg0.field6135) {
                                class627.method3466(arg0, var8, -29701, var7.field8249);
                            }
                        }
                        if (var7.field8249 >= var8.field4493.length) {
                            var7.field8249 -= var8.field4484;
                            var7.field8250++;
                            if (var7.field8250 >= var8.field4473) {
                                arg0.field6163[var6] = null;
                            } else if (var7.field8249 < 0 || var8.field4493.length <= var7.field8249) {
                                arg0.field6163[var6] = null;
                            } else if (!arg0.field6135) {
                                class627.method3466(arg0, var8, arg1 ^ 0x2A31, var7.field8249);
                            }
                        }
                        var7.field8248 = var7.field8249 + 1;
                        if (var7.field8248 >= var8.field4493.length) {
                            var7.field8248 -= var8.field4484;
                            if ((var7.field8250 + 1) >= var8.field4473) {
                                var7.field8248 = -1;
                            } else if (var7.field8248 < 0 || var8.field4493.length <= var7.field8248) {
                                var7.field8248 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ldt;BI)V", line = 436)
    private final void method992(class254 arg0, byte arg1, int arg2) {
        if (arg1 != -20) {
            this.method993(null, (byte) 76);
        }
        if (arg2 == 249) {
            int var4 = arg0.method1731((byte) 64);
            if (this.field1904 == null) {
                int var5 = class8.method45(23714, var4);
                this.field1904 = new class184(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1731((byte) 64) == 1;
                int var8 = arg0.method1722(false);
                class159 var9;
                if (var7) {
                    var9 = new class553(arg0.method1699(arg1 - 44));
                } else {
                    var9 = new class445(arg0.method1672(arg1 - 16496));
                }
                this.field1904.method1247(4070, (long) var8, var9);
            }
        }
        field1901++;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ldt;B)V", line = 481)
    public final void method993(class254 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                field1903++;
                int var4 = 24 / ((64 - arg1) / 52);
                return;
            }
            this.method992(arg0, (byte) -20, var3);
        }
    }
}
