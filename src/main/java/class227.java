import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class227 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Ll;")
    public class80 field3719 = new class80();

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lph;")
    public static class229 field3722 = class266.method1858("hint_mapedge", 0);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Ll;")
    private class80 field3726;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1572(int arg0) {
        field3715++;
        int var1 = class255.method1779(14838);
        if (var1 == 0) {
            class142.field2301 = (byte[][][]) null;
            class252.method1767(arg0 + 14, 0);
        } else if (var1 == 1) {
            class326.method2234(-5, (byte) 0);
            class252.method1767(-55, 512);
            class290.method1982((byte) -126);
        } else {
            class326.method2234(arg0 ^ 0xFFFFFFDB, (byte) (class188.field3055 - 4 & 0xFF));
            class252.method1767(-50, 2);
        }
        if (arg0 != 32) {
            method1576((byte) 31);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 44)
    public final void method1573(byte arg0) {
        while (true) {
            class80 var2 = this.field3719.field1317;
            if (this.field3719 == var2) {
                if (arg0 != -48) {
                    field3716 = -86;
                }
                field3727++;
                this.field3726 = null;
                return;
            }
            var2.method598(20);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Ll;", line = 68)
    public final class80 method1574(int arg0) {
        class80 var2 = this.field3719.field1317;
        field3723++;
        int var3 = -53 / ((81 - arg0) / 35);
        if (this.field3719 == var2) {
            return null;
        } else {
            var2.method598(117);
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)Ll;", line = 85)
    public final class80 method1575(int arg0) {
        field3728++;
        class80 var2 = this.field3719.field1318;
        if (arg0 >= -9) {
            method1583(27, (class301) null, (byte) 88, 57, -3);
        }
        if (this.field3719 == var2) {
            this.field3726 = null;
            return null;
        } else {
            this.field3726 = var2.field1318;
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 109)
    public static void method1576(byte arg0) {
        field3722 = null;
        if (arg0 != 67) {
            field3722 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Ll;", line = 125)
    public final class80 method1577(boolean arg0) {
        field3725++;
        if (!arg0) {
            return (class80) null;
        }
        class80 var2 = this.field3726;
        if (this.field3719 == var2) {
            this.field3726 = null;
            return null;
        } else {
            this.field3726 = var2.field1318;
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILl;)V", line = 149)
    public final void method1578(int arg0, class80 arg1) {
        if (arg0 != 0) {
            this.field3726 = (class80) null;
        }
        field3729++;
        if (arg1.field1318 != null) {
            arg1.method598(32);
        }
        arg1.field1317 = this.field3719.field1317;
        arg1.field1318 = this.field3719;
        arg1.field1318.field1317 = arg1;
        arg1.field1317.field1318 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)Ll;", line = 169)
    public final class80 method1579(byte arg0) {
        class80 var2 = this.field3726;
        field3730++;
        if (this.field3719 == var2) {
            this.field3726 = null;
            return null;
        }
        this.field3726 = var2.field1317;
        if (arg0 != 28) {
            this.field3726 = (class80) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 639)
    public class227() {
        this.field3719.field1317 = this.field3719;
        this.field3719.field1318 = this.field3719;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)Ll;", line = 204)
    public final class80 method1580(byte arg0) {
        field3724++;
        if (arg0 != -39) {
            method1581(false);
        }
        class80 var2 = this.field3719.field1317;
        if (this.field3719 == var2) {
            this.field3726 = null;
            return null;
        } else {
            this.field3726 = var2.field1317;
            return var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V", line = 226)
    public static final void method1581(boolean arg0) {
        field3721++;
        class208.field3428.method1414(98);
        class70.field1112.method1414(89);
        if (arg0) {
            method1583(56, (class301) null, (byte) -97, -17, -20);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ll;I)V", line = 240)
    public final void method1582(class80 arg0, int arg1) {
        field3718++;
        if (arg0.field1318 != null) {
            arg0.method598(98);
        }
        arg0.field1318 = this.field3719.field1318;
        if (arg1 != 4) {
            this.field3719 = (class80) null;
        }
        arg0.field1317 = this.field3719;
        arg0.field1318.field1317 = arg0;
        arg0.field1317.field1318 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILri;BII)V", line = 263)
    public static final void method1583(int arg0, class301 arg1, byte arg2, int arg3, int arg4) {
        field3720++;
        class53.method364(14874);
        if (class99.field1675) {
            class212.method1502(arg0, arg4, arg1.field4923 + arg0, arg1.field4882 + arg4);
        } else {
            class210.method1472(arg0, arg4, arg1.field4923 + arg0, arg1.field4882 + arg4);
        }
        if (class7.field97 != 2 && class7.field97 != 5 && class238.field3941 != null) {
            int var5 = class249.field4134 + class147.field2379 & 0x7FF;
            int var6 = 464 - class230.field3820.field5168 / 32;
            int var7 = class230.field3820.field5147 / 32 + 48;
            if (class99.field1675) {
                ((class87) class238.field3941).method643(arg0, arg4, arg1.field4923, arg1.field4882, var7, var6, var5, class260.field4341 + 256, (class87) arg1.method2032((byte) 5, false));
            } else {
                ((class327) class238.field3941).method1957(arg0, arg4, arg1.field4923, arg1.field4882, var7, var6, var5, class260.field4341 + 256, arg1.field4886, arg1.field4974);
            }
            if (class84.field1441 != null) {
                for (int var8 = 0; var8 < class84.field1441.field882; var8++) {
                    if (class84.field1441.method416(var8, (byte) 116)) {
                        int var9 = (class84.field1441.field868[var8] - class1.field1) * 4 + 2 - (class230.field3820.field5168 / 32);
                        int var10 = class310.field5199[var5];
                        int var11 = var10 * 256 / (class260.field4341 + 256);
                        int var12 = (class84.field1441.field879[var8] - class1.field9) * 4 + 2 - (class230.field3820.field5147 / 32);
                        int var13 = class310.field5197[var5];
                        class31 var14 = class325.field5552;
                        int var15 = var13 * 256 / (class260.field4341 + 256);
                        if (class84.field1441.method411((byte) 81, var8) == 1) {
                            var14 = class237.field3905;
                        }
                        int var16 = var9 * var15 - (var11 * var12) >> 16;
                        int var17 = var9 * var11 + var12 * var15 >> 16;
                        if (class84.field1441.method411((byte) 122, var8) == 2) {
                            var14 = class213.field3517;
                        }
                        int var18 = var14.method238(class84.field1441.field872[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= (-arg1.field4923) && var19 <= arg1.field4923 && var16 >= (-arg1.field4882) && arg1.field4882 >= var16) {
                            int var20 = 16777215;
                            if (class84.field1441.field869[var8] != -1) {
                                var20 = class84.field1441.field869[var8];
                            }
                            if (class99.field1675) {
                                class212.method1493((class87) arg1.method2032((byte) 5, false));
                            } else {
                                class210.method1462(arg1.field4886, arg1.field4974);
                            }
                            var14.method243(class84.field1441.field872[var8], arg1.field4923 / 2 + arg0 + var19, arg1.field4882 / 2 + -var16 + arg4, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class99.field1675) {
                                class212.method1495();
                            } else {
                                class210.method1464();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class328.field5583; var21++) {
                int var22 = class266.field4482[var21] * 4 + 2 - (class230.field3820.field5147 / 32);
                int var23 = class306.field5141[var21] * 4 + 2 - (class230.field3820.field5168 / 32);
                class83 var24 = class260.method1807(false, class248.field4128[var21]);
                if (var24.field1373 != null) {
                    var24 = var24.method613((byte) -60);
                    if (var24 == null || var24.field1392 == -1) {
                        continue;
                    }
                }
                class226.method1571(class217.field3558[var24.field1392], (byte) -87, var22, arg1, var23, arg0, arg4);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class227 var27 = class8.field108[class298.field4849][var25][var26];
                    if (var27 != null) {
                        int var28 = var26 * 4 + 2 - (class230.field3820.field5168 / 32);
                        int var29 = var25 * 4 + 2 - class230.field3820.field5147 / 32;
                        class226.method1571(class243.field4014[0], (byte) -87, var29, arg1, var28, arg0, arg4);
                    }
                }
            }
            for (int var30 = 0; var30 < class253.field4233; var30++) {
                class217 var31 = class187.field3035[class162.field2620[var30]];
                if (var31 != null && var31.method1459(0)) {
                    class313 var32 = var31.field3559;
                    if (var32 != null && var32.field5262 != null) {
                        var32 = var32.method2118(0);
                    }
                    if (var32 != null && var32.field5328 && var32.field5298) {
                        int var33 = var31.field5147 / 32 - (class230.field3820.field5147 / 32);
                        int var34 = var31.field5168 / 32 - class230.field3820.field5168 / 32;
                        if (var32.field5287 == -1) {
                            class226.method1571(class243.field4014[1], (byte) -87, var33, arg1, var34, arg0, arg4);
                        } else {
                            class226.method1571(class217.field3558[var32.field5287], (byte) -87, var33, arg1, var34, arg0, arg4);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class139.field2248; var35++) {
                class209 var36 = class114.field1931[class166.field2708[var35]];
                if (var36 != null && var36.method1459(0)) {
                    int var37 = var36.field5147 / 32 - (class230.field3820.field5147 / 32);
                    int var38 = var36.field5168 / 32 - (class230.field3820.field5168 / 32);
                    long var39 = var36.field3463.method1634(false);
                    boolean var41 = false;
                    for (int var42 = 0; var42 < class103.field1752; var42++) {
                        if (class98.field1658[var42] == var39 && class70.field1162[var42] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class317.field5378; var44++) {
                        if (class30.field484[var44].field1325 == var39) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class230.field3820.field3438 != 0 && var36.field3438 != 0 && class230.field3820.field3438 == var36.field3438) {
                        var45 = true;
                    }
                    if (var41) {
                        class226.method1571(class243.field4014[3], (byte) -87, var37, arg1, var38, arg0, arg4);
                    } else if (var43) {
                        class226.method1571(class243.field4014[5], (byte) -87, var37, arg1, var38, arg0, arg4);
                    } else if (var45) {
                        class226.method1571(class243.field4014[4], (byte) -87, var37, arg1, var38, arg0, arg4);
                    } else {
                        class226.method1571(class243.field4014[2], (byte) -87, var37, arg1, var38, arg0, arg4);
                    }
                }
            }
            class240[] var46 = class162.field2606;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class240 var48 = var46[var47];
                if (var48 != null && var48.field3977 != 0 && (class319.field5393 % 20) < 10) {
                    if (var48.field3977 == 1 && var48.field3979 >= 0 && var48.field3979 < class187.field3035.length) {
                        class217 var49 = class187.field3035[var48.field3979];
                        if (var49 != null) {
                            int var50 = var49.field5147 / 32 - (class230.field3820.field5147 / 32);
                            int var51 = var49.field5168 / 32 - (class230.field3820.field5168 / 32);
                            class303.method2043(arg4, arg1, var48.field3969, var51, arg0, (byte) -38, var50);
                        }
                    }
                    if (var48.field3977 == 2) {
                        int var52 = (var48.field3964 - class1.field1) * 4 + 2 - (class230.field3820.field5168 / 32);
                        int var53 = (var48.field3978 - class1.field9) * 4 + 2 - (class230.field3820.field5147 / 32);
                        class303.method2043(arg4, arg1, var48.field3969, var52, arg0, (byte) -38, var53);
                    }
                    if (var48.field3977 == 10 && var48.field3979 >= 0 && class114.field1931.length > var48.field3979) {
                        class209 var54 = class114.field1931[var48.field3979];
                        if (var54 != null) {
                            int var55 = var54.field5147 / 32 - class230.field3820.field5147 / 32;
                            int var56 = var54.field5168 / 32 - (class230.field3820.field5168 / 32);
                            class303.method2043(arg4, arg1, var48.field3969, var56, arg0, (byte) -38, var55);
                        }
                    }
                }
            }
            if (class68.field1086 != 0) {
                int var57 = class133.field2155 * 4 + 2 - (class230.field3820.field5168 / 32);
                int var58 = class68.field1086 * 4 + 2 - (class230.field3820.field5147 / 32);
                class226.method1571(class239.field3954, (byte) -87, var58, arg1, var57, arg0, arg4);
            }
            if (class99.field1675) {
                class212.method1494(arg1.field4923 / 2 + arg0 - 1, arg1.field4882 / 2 + arg4 + -1, 3, 3, 16777215);
            } else {
                class210.method1465(arg1.field4923 / 2 + arg0 - 1, arg4 - -(arg1.field4882 / 2) - 1, 3, 3, 16777215);
            }
        } else if (class99.field1675) {
            class293 var59 = arg1.method2032((byte) 5, false);
            if (var59 != null) {
                var59.method653(arg0, arg4);
            }
        } else {
            class210.method1469(arg0, arg4, 0, arg1.field4886, arg1.field4974);
        }
        class189.field3067[arg3] = true;
        if (arg2 >= -50) {
            field3716 = 34;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 612)
    public static final void method1584(int arg0, int arg1) {
        field3717++;
        class285 var2 = (class285) class243.field4004.method713(3365, (long) arg1);
        if (var2 != null && arg0 < -39) {
            for (int var3 = 0; var3 < var2.field4696.length; var3++) {
                var2.field4696[var3] = -1;
                var2.field4707[var3] = 0;
            }
        }
    }
}
