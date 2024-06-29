import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class218 extends class86 {

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Ljava/lang/String;")
    private String field3425 = "null";

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field3427 = 0;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3435 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!h", name = "y", descriptor = "C")
    public char field3430;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "C")
    public char field3437;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Lhj;")
    public class29 field3429;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Lhj;")
    private class29 field3439;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 8)
    public final String method1556(boolean arg0, int arg1) {
        field3426++;
        if (this.field3429 == null) {
            return this.field3425;
        }
        if (arg0) {
            this.field3430 = '`';
        }
        class255 var3 = (class255) this.field3429.method203(1710, (long) arg1);
        return var3 == null ? this.field3425 : var3.field3809;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 28)
    private final void method1557(int arg0) {
        field3434++;
        this.field3439 = new class29(this.field3429.method206(255));
        if (arg0 != -1) {
            method1566((byte) 40);
        }
        for (class181 var2 = (class181) this.field3429.method200(0); var2 != null; var2 = (class181) this.field3429.method202((byte) -61)) {
            class181 var3 = new class181((int) var2.field3418);
            this.field3439.method208(var3, (long) var2.field2713, 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 51)
    public final int method1558(int arg0, int arg1) {
        field3436++;
        if (this.field3429 == null) {
            return this.field3433;
        } else if (arg0 == -5) {
            class181 var3 = (class181) this.field3429.method203(1710, (long) arg1);
            return var3 == null ? this.field3433 : var3.field2713;
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILhb;)V", line = 73)
    public final void method1559(int arg0, class35 arg1) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method273(65280);
            if (var3 == 0) {
                field3444++;
                return;
            }
            this.method1565(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 94)
    public final boolean method1560(String arg0, int arg1) {
        field3431++;
        if (this.field3429 == null) {
            return false;
        }
        if (arg1 != 37) {
            this.method1556(true, 58);
        }
        if (this.field3439 == null) {
            this.method1564((byte) 119);
        }
        for (class124 var3 = (class124) this.field3439.method203(arg1 + 1673, class268.method1863(arg0, (byte) -109)); var3 != null; var3 = (class124) this.field3439.method198(44)) {
            if (var3.field1960.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IS)Z", line = 125)
    public static final boolean method1561(int arg0, short arg1) {
        field3442++;
        if (arg1 == 36 || arg1 == 37 || arg1 == 8 || arg1 == 45 || arg1 == 29 || arg1 == 48 || arg1 == 25 || arg1 == 20) {
            return true;
        }
        if (arg0 <= 100) {
            field3435 = (String) null;
        }
        if (arg1 == 12 || arg1 == 47 || arg1 == 1007 || arg1 == 1002) {
            return true;
        } else if (arg1 == 13 || arg1 == 57 || arg1 == 15 || arg1 == 26 || arg1 == 10) {
            return true;
        } else {
            return arg1 == 4 || arg1 == 34 || arg1 == 6 || arg1 == 16 || arg1 == 14 || arg1 == 58;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Loa;Z)V", line = 151)
    public static final void method1562(class288 arg0, boolean arg1) {
        field3440++;
        arg0.field4459 = arg1;
        if (arg0.field4527 != -1) {
            class162 var2 = class173.method1259((byte) 119, arg0.field4527);
            if (var2 == null || var2.field2401 == null) {
                arg0.field4527 = -1;
            } else {
                arg0.field4537++;
                if (var2.field2401.length > arg0.field4436 && var2.field2423[arg0.field4436] < arg0.field4537) {
                    arg0.field4436++;
                    arg0.field4460++;
                    arg0.field4537 = 1;
                    class158.method1143(arg0.field4496, 103, arg0.field4507, var2, class235.field3602 == arg0, arg0.field4436);
                }
                if (var2.field2401.length <= arg0.field4436) {
                    arg0.field4436 = 0;
                    arg0.field4537 = 0;
                    class158.method1143(arg0.field4496, 115, arg0.field4507, var2, class235.field3602 == arg0, arg0.field4436);
                }
                arg0.field4460 = arg0.field4436 + 1;
                if (arg0.field4460 >= var2.field2401.length) {
                    arg0.field4460 = 0;
                }
            }
        }
        if (arg0.field4526 != -1 && arg0.field4466 <= class312.field4852) {
            int var3 = class99.method778(20951, arg0.field4526).field4050;
            if (var3 == -1) {
                arg0.field4526 = -1;
            } else {
                class162 var4 = class173.method1259((byte) 119, var3);
                if (var4 == null || var4.field2401 == null) {
                    arg0.field4526 = -1;
                } else {
                    if (arg0.field4482 < 0) {
                        arg0.field4482 = 0;
                        class158.method1143(arg0.field4496, 100, arg0.field4507, var4, class235.field3602 == arg0, 0);
                    }
                    arg0.field4533++;
                    if (arg0.field4482 < var4.field2401.length && arg0.field4533 > var4.field2423[arg0.field4482]) {
                        arg0.field4482++;
                        arg0.field4533 = 1;
                        class158.method1143(arg0.field4496, 121, arg0.field4507, var4, class235.field3602 == arg0, arg0.field4482);
                    }
                    if (arg0.field4482 >= var4.field2401.length) {
                        arg0.field4526 = -1;
                    }
                    arg0.field4480 = arg0.field4482 + 1;
                    if (arg0.field4480 >= var4.field2401.length) {
                        arg0.field4480 = -1;
                    }
                }
            }
        }
        if (arg0.field4439 != -1 && arg0.field4437 <= 1) {
            class162 var5 = class173.method1259((byte) 119, arg0.field4439);
            if (var5.field2426 == 1 && arg0.field4528 > 0 && arg0.field4521 <= class312.field4852 && arg0.field4474 < class312.field4852) {
                arg0.field4437 = 1;
                return;
            }
        }
        if (arg0.field4439 != -1 && arg0.field4437 == 0) {
            class162 var6 = class173.method1259((byte) 119, arg0.field4439);
            if (var6 == null || var6.field2401 == null) {
                arg0.field4439 = -1;
            } else {
                arg0.field4508++;
                if (var6.field2401.length > arg0.field4536 && var6.field2423[arg0.field4536] < arg0.field4508) {
                    arg0.field4536++;
                    arg0.field4508 = 1;
                    class158.method1143(arg0.field4496, 109, arg0.field4507, var6, class235.field3602 == arg0, arg0.field4536);
                }
                if (arg0.field4536 >= var6.field2401.length) {
                    arg0.field4522++;
                    arg0.field4536 -= var6.field2407;
                    if (arg0.field4522 >= var6.field2425) {
                        arg0.field4439 = -1;
                    } else if (arg0.field4536 >= 0 && arg0.field4536 < var6.field2401.length) {
                        class158.method1143(arg0.field4496, 113, arg0.field4507, var6, class235.field3602 == arg0, arg0.field4536);
                    } else {
                        arg0.field4439 = -1;
                    }
                }
                arg0.field4504 = arg0.field4536 + 1;
                if (arg0.field4504 >= var6.field2401.length) {
                    arg0.field4504 -= var6.field2407;
                    if (arg0.field4522 + 1 >= var6.field2425) {
                        arg0.field4504 = -1;
                    } else if (arg0.field4504 < 0 || arg0.field4504 >= var6.field2401.length) {
                        arg0.field4504 = -1;
                    }
                }
                arg0.field4459 = var6.field2421;
            }
        }
        if (arg0.field4437 > 0) {
            arg0.field4437--;
        }
        for (int var7 = 0; var7 < arg0.field4449.length; var7++) {
            class47 var8 = arg0.field4449[var7];
            if (var8 != null) {
                if (var8.field725 > 0) {
                    var8.field725--;
                } else {
                    class162 var9 = class173.method1259((byte) 119, var8.field720);
                    if (var9 == null || var9.field2401 == null) {
                        arg0.field4449[var7] = null;
                    } else {
                        var8.field724++;
                        if (var8.field730 < var9.field2401.length && var9.field2423[var8.field730] < var8.field724) {
                            var8.field730++;
                            var8.field724 = 1;
                            class158.method1143(arg0.field4496, 93, arg0.field4507, var9, class235.field3602 == arg0, var8.field730);
                        }
                        if (var8.field730 >= var9.field2401.length) {
                            var8.field730 -= var9.field2407;
                            var8.field719++;
                            if (var8.field719 >= var9.field2425) {
                                arg0.field4449[var7] = null;
                            } else if (var8.field730 >= 0 && var9.field2401.length > var8.field730) {
                                class158.method1143(arg0.field4496, 120, arg0.field4507, var9, class235.field3602 == arg0, var8.field730);
                            } else {
                                arg0.field4449[var7] = null;
                            }
                        }
                        var8.field726 = var8.field730 + 1;
                        if (var9.field2401.length <= var8.field726) {
                            var8.field726 -= var9.field2407;
                            if (var9.field2425 <= (var8.field719 + 1)) {
                                var8.field726 = -1;
                            } else if (var8.field726 < 0 || var9.field2401.length <= var8.field726) {
                                var8.field726 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)Z", line = 384)
    public final boolean method1563(int arg0, int arg1) {
        field3441++;
        if (this.field3429 == null) {
            return false;
        }
        if (this.field3439 == null) {
            this.method1557(-1);
        }
        class181 var3 = (class181) this.field3439.method203(1710, (long) arg0);
        if (arg1 != 25646) {
            this.field3429 = (class29) null;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V", line = 409)
    private final void method1564(byte arg0) {
        this.field3439 = new class29(this.field3429.method206(255));
        field3432++;
        for (class255 var2 = (class255) this.field3429.method200(0); var2 != null; var2 = (class255) this.field3429.method202((byte) 97)) {
            class124 var3 = new class124(var2.field3809, (int) var2.field3418);
            this.field3439.method208(var3, class268.method1863(var2.field3809, (byte) -108), 0);
        }
        if (arg0 != 119) {
            field3443 = 74;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILhb;)V", line = 433)
    private final void method1565(int arg0, int arg1, class35 arg2) {
        if (arg0 != 0) {
            this.field3429 = (class29) null;
        }
        if (arg1 == 1) {
            this.field3437 = class253.method1759(arg0 - 1, arg2.method242((byte) -93));
        } else if (arg1 == 2) {
            this.field3430 = class253.method1759(~arg0, arg2.method242((byte) -93));
        } else if (arg1 == 3) {
            this.field3425 = arg2.method279(arg0 ^ 0x3B);
        } else if (arg1 == 4) {
            this.field3433 = arg2.method299(arg0 - 109);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method300(-1394191632);
            this.field3429 = new class29(class230.method1638((byte) 81, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method299(arg0 - 127);
                class217 var7;
                if (arg1 == 5) {
                    var7 = new class255(arg2.method279(69));
                } else {
                    var7 = new class181(arg2.method299(arg0 ^ 0xFFFFFFB3));
                }
                this.field3429.method208(var7, (long) var6, 0);
            }
        }
        field3438++;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(B)V", line = 502)
    public static final void method1566(byte arg0) {
        int var1 = -77 % ((arg0 - 64) / 42);
        field3428++;
        int var2 = 0;
        int[] var3 = new int[class291.field4576];
        for (int var4 = 0; var4 < class291.field4576; var4++) {
            class274 var5 = class225.method1603(var4, 0);
            if (var5.field4150 >= 0 || var5.field4183 >= 0) {
                var3[var2++] = var4;
            }
        }
        class292.field4590 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class292.field4590[var6] = var3[var6];
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 538)
    public static void method1567(int arg0) {
        field3435 = null;
        if (arg0 != -24946) {
            method1562((class288) null, false);
        }
    }
}
