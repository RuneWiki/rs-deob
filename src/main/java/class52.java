import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class52 {

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "[Lrf;")
    public static class290[] field701;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method353(int arg0, byte arg1) {
        class17 var2 = class334.field5188;
        synchronized (class334.field5188) {
            class101.field1551 = arg0;
            if (arg1 != -86) {
                method357((class192) null, -4);
            }
        }
        field704++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z", line = 25)
    public static final boolean method354(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class183.field2958; var3++) {
            class157 var4 = class295.field4629[var3];
            if (var4.field2411 == 1) {
                int var5 = var4.field2419 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2412 * var5 >> 8) + var4.field2417;
                    int var7 = (var4.field2415 * var5 >> 8) + var4.field2408;
                    int var8 = (var4.field2403 * var5 >> 8) + var4.field2405;
                    int var9 = (var4.field2409 * var5 >> 8) + var4.field2420;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2411 == 2) {
                int var10 = arg0 - var4.field2419;
                if (var10 > 0) {
                    int var11 = (var4.field2412 * var10 >> 8) + var4.field2417;
                    int var12 = (var4.field2415 * var10 >> 8) + var4.field2408;
                    int var13 = (var4.field2403 * var10 >> 8) + var4.field2405;
                    int var14 = (var4.field2409 * var10 >> 8) + var4.field2420;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2411 == 3) {
                int var15 = var4.field2417 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2416 * var15 >> 8) + var4.field2419;
                    int var17 = (var4.field2410 * var15 >> 8) + var4.field2406;
                    int var18 = (var4.field2403 * var15 >> 8) + var4.field2405;
                    int var19 = (var4.field2409 * var15 >> 8) + var4.field2420;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2411 == 4) {
                int var20 = arg2 - var4.field2417;
                if (var20 > 0) {
                    int var21 = (var4.field2416 * var20 >> 8) + var4.field2419;
                    int var22 = (var4.field2410 * var20 >> 8) + var4.field2406;
                    int var23 = (var4.field2403 * var20 >> 8) + var4.field2405;
                    int var24 = (var4.field2409 * var20 >> 8) + var4.field2420;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2411 == 5) {
                int var25 = arg1 - var4.field2405;
                if (var25 > 0) {
                    int var26 = (var4.field2416 * var25 >> 8) + var4.field2419;
                    int var27 = (var4.field2410 * var25 >> 8) + var4.field2406;
                    int var28 = (var4.field2412 * var25 >> 8) + var4.field2417;
                    int var29 = (var4.field2415 * var25 >> 8) + var4.field2408;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 148)
    public static void method355(int arg0) {
        field701 = null;
        if (arg0 != -17151) {
            method354(-92, 124, 81);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILim;)V", line = 158)
    private final void method356(int arg0, int arg1, int arg2, class192 arg3) {
        if (arg1 == 1) {
            this.field707 = arg3.method1396(-91);
        } else if (arg1 == 2) {
            this.field705 = arg3.method1399(-1172389784);
            this.field710 = arg3.method1399(-1172389784);
        }
        field703++;
        if (arg2 != 31) {
            method360(50, 43, 48, 90, -111);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lim;I)V", line = 181)
    public static final void method357(class192 arg0, int arg1) {
        field711++;
        if ((arg0.field3128.length - arg0.field3129) < 1) {
            return;
        }
        int var2 = arg0.method1399(-1172389784);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field3128.length - arg0.field3129 < var3) {
            return;
        }
        class91.field1404 = arg0.method1399(arg1 ^ 0xBA1EC060);
        if (class91.field1404 < 1) {
            class91.field1404 = 1;
        } else if (class91.field1404 > 4) {
            class91.field1404 = 4;
        }
        if (arg1 != 8) {
            method360(-62, -47, 50, 105, 102);
        }
        class127.method870(1404591760, arg0.method1399(-1172389784) == 1);
        class243.field3859 = arg0.method1399(-1172389784) == 1;
        class39.field548 = arg0.method1399(arg1 - 1172389792) == 1;
        class175.field2791 = arg0.method1399(arg1 - 1172389792) == 1;
        class196.field3219 = arg0.method1399(-1172389784) == 1;
        class39.field512 = arg0.method1399(-1172389784) == 1;
        class226.field3598 = arg0.method1399(-1172389784) == 1;
        class202.field3302 = arg0.method1399(-1172389784) == 1;
        class17.field227 = arg0.method1399(arg1 - 1172389792);
        if (class17.field227 > 2) {
            class17.field227 = 2;
        }
        if (var2 >= 2) {
            class269.field4250 = arg0.method1399(-1172389784) == 1;
        } else {
            class269.field4250 = arg0.method1399(arg1 ^ 0xBA1EC060) == 1;
            arg0.method1399(-1172389784);
        }
        class63.field831 = arg0.method1399(-1172389784) == 1;
        class238.field3766 = arg0.method1399(-1172389784) == 1;
        class327.field5098 = arg0.method1399(arg1 - 1172389792);
        if (class327.field5098 > 2) {
            class327.field5098 = 2;
        }
        class330.field5138 = class327.field5098;
        class56.field739 = arg0.method1399(arg1 ^ 0xBA1EC060) == 1;
        class337.field5229 = arg0.method1399(arg1 - 1172389792);
        if (class337.field5229 > 127) {
            class337.field5229 = 127;
        }
        class13.field164 = arg0.method1399(-1172389784);
        class139.field2076 = arg0.method1399(-1172389784);
        if (class139.field2076 > 127) {
            class139.field2076 = 127;
        }
        if (var2 >= 1) {
            class198.field3256 = arg0.method1396(-25);
            class80.field1213 = arg0.method1396(-41);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1399(arg1 - 1172389792);
        }
        if (var2 >= 4) {
            int var4 = arg0.method1399(-1172389784);
            if (class130.field1924 < 96) {
                var4 = 0;
            }
            class167.method1152(var4);
        }
        if (var2 >= 5) {
            class17.field230 = arg0.method1354((byte) 119);
        }
        if (var2 >= 6) {
            class49.field674 = arg0.method1399(-1172389784);
        }
        if (var2 >= 7) {
            class27.field390 = arg0.method1399(arg1 ^ -1172389792) == 1;
        }
        if (var2 >= 8) {
            class325.field5079 = arg0.method1399(-1172389784) == 1;
        }
        if (var2 >= 9) {
            class86.field1304 = arg0.method1399(-1172389784);
        }
        if (var2 >= 10) {
            class263.field4174 = arg0.method1399(-1172389784) != 0;
        }
        if (var2 >= 11) {
            class126.field1885 = arg0.method1399(-1172389784) != 0;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILim;)V", line = 346)
    public final void method358(int arg0, int arg1, class192 arg2) {
        while (true) {
            int var4 = arg2.method1399(arg0 - 1172370460);
            if (var4 == 0) {
                field708++;
                if (arg0 != -19324) {
                    field706 = -10;
                }
                return;
            }
            this.method356(arg1, var4, 31, arg2);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)Ln;", line = 368)
    public final class298 method359(byte arg0) {
        field702++;
        class298 var2 = (class298) class95.field1454.method1619((long) this.field707, 80);
        if (var2 != null) {
            return var2;
        }
        class298 var3 = class310.method2168(0, (byte) 117, this.field707, class49.field671);
        if (arg0 == -52) {
            if (var3 != null) {
                class95.field1454.method1621((long) this.field707, -99, var3);
            }
            return var3;
        } else {
            return (class298) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V", line = 390)
    public static final void method360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field709++;
        if (class233.field3721 <= arg2 && class235.field3735 >= arg2) {
            int var5 = class235.method1685(arg1, class231.field3697, class224.field3575, 126);
            int var6 = class235.method1685(arg4, class231.field3697, class224.field3575, 113);
            class56.method400(var5, var6, arg2, arg3, (byte) -87);
        }
        if (arg0 != 25031) {
            field701 = (class290[]) null;
        }
    }
}
