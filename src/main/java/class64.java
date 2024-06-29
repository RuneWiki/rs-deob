import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 {

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public int field1557 = 0;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public int field1559 = 0;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lva;")
    public static class121 field1544 = null;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Z")
    public static boolean field1554 = true;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "[I")
    public static int[] field1558 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lva;")
    public static class121 field1563 = class107.method797("(Y", -10983);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[Lbc;")
    public static class10[] field1549 = new class10[1000];

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lva;")
    public static class121 field1546 = class107.method797("null", -10983);

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lva;")
    private static class121 field1566 = class107.method797("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\u001c1(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", -10983);

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lva;")
    public static class121 field1548 = field1566;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Li;")
    public static class48 field1551 = new class48(64);

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static volatile int field1571 = 0;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lva;")
    private static class121 field1572 = class107.method797("Examine", -10983);

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lva;")
    public static class121 field1570 = field1572;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Loa;")
    public class85 field1543;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Z")
    public static boolean field1562;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
    public static int[] field1547;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method457(boolean arg0, int arg1) {
        field1560++;
        if (!arg0 || class5.field89 == null) {
            return;
        }
        if (class97.field2164 != 0) {
            if (class48.field1162 == null) {
                return;
            }
            class95.field2110 = arg1;
        } else if (class66.field1594 >= 0) {
            class66.field1594 = arg1;
            class5.field89.method143(arg1, 0, (byte) 110);
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 37)
    public static final void method458(boolean arg0) {
        field1545++;
        while (true) {
            label298: do {
                while (class96.method648(arg0)) {
                    if (class26.field659 != -1 && class47.field1123 == class26.field659) {
                        if (class43.field991 == 85 && class18.field383.method942(36) > 0) {
                            class18.field383 = class18.field383.method957(class18.field383.method942(36) - 1, true, 0);
                        }
                        continue label298;
                    }
                    if (class40.field902) {
                        if (class43.field991 == 85 && class18.field402.method942(36) > 0) {
                            class18.field402 = class18.field402.method957(class18.field402.method942(36) - 1, true, 0);
                            class9.field140 = true;
                        }
                        if (class90.method615(class120.field2769, 8159) && class18.field402.method942(36) < 80) {
                            class18.field402 = class18.field402.method958(38, class120.field2769);
                            class9.field140 = true;
                        }
                        if (class43.field991 == 84) {
                            class40.field902 = false;
                            class9.field140 = true;
                            if (class13.field239 == 1) {
                                long var1 = class18.field402.method932(122);
                                class95.method645(-115, var1);
                            }
                            if (class13.field239 == 2 && class8.field119 > 0) {
                                long var3 = class18.field402.method932(118);
                                class80.method553(var3, -19259);
                            }
                            if (class13.field239 == 3 && class18.field402.method942(36) > 0) {
                                class90.field2050++;
                                class60.field1437.method622(125, true);
                                class60.field1437.method836(0, 0);
                                int var5 = class60.field1437.field2507;
                                class60.field1437.method835(!arg0, class108.field2460);
                                class19.method168(class18.field402, class60.field1437, 0);
                                class60.field1437.method857(-1, class60.field1437.field2507 - var5);
                                if (class19.field492 == 2) {
                                    class19.field492 = 1;
                                    class48.field1143++;
                                    class91.field2070 = true;
                                    class60.field1437.method622(251, true);
                                    class60.field1437.method836(0, class63.field1526);
                                    class60.field1437.method836(0, class19.field492);
                                    class60.field1437.method836(0, class4.field69);
                                }
                            }
                            if (class13.field239 == 4 && class97.field2169 < 100) {
                                long var6 = class18.field402.method932(117);
                                class62.method449(var6, 7159);
                            }
                            if (class13.field239 == 5 && class97.field2169 > 0) {
                                long var8 = class18.field402.method932(120);
                                class125.method981(22793, var8);
                            }
                        }
                    } else if (class1.field16 == 1) {
                        if (class43.field991 == 85 && class18.field370.method942(36) > 0) {
                            class18.field370 = class18.field370.method957(class18.field370.method942(36) - 1, true, 0);
                            class9.field140 = true;
                        }
                        if (class128.method1001(-1104831966, class120.field2769) && class18.field370.method942(36) < 10) {
                            class18.field370 = class18.field370.method958(38, class120.field2769);
                            class9.field140 = true;
                        }
                        if (class43.field991 == 84) {
                            if (class18.field370.method942(36) > 0) {
                                class42.field973++;
                                int var10 = 0;
                                if (class18.field370.method967(-61)) {
                                    var10 = class18.field370.method968(-107);
                                }
                                class60.field1437.method622(119, true);
                                class60.field1437.method867((byte) -66, var10);
                            }
                            class9.field140 = true;
                            class1.field16 = 0;
                        }
                    } else if (class1.field16 == 2) {
                        if (class43.field991 == 85 && class18.field370.method942(36) > 0) {
                            class18.field370 = class18.field370.method957(class18.field370.method942(36) - 1, true, 0);
                            class9.field140 = true;
                        }
                        if ((class50.method358(class120.field2769, true) || class120.field2769 == 32) && class18.field370.method942(36) < 12) {
                            class18.field370 = class18.field370.method958(38, class120.field2769);
                            class9.field140 = true;
                        }
                        if (class43.field991 == 84) {
                            if (class18.field370.method942(36) > 0) {
                                class60.field1437.method622(238, true);
                                class60.field1437.method835(!arg0, class18.field370.method932(112));
                                class16.field353++;
                            }
                            class1.field16 = 0;
                            class9.field140 = true;
                        }
                    } else if (class1.field16 == 3) {
                        if (class43.field991 == 85 && class18.field370.method942(36) > 0) {
                            class18.field370 = class18.field370.method957(class18.field370.method942(36) - 1, true, 0);
                            class9.field140 = true;
                        }
                        if (class90.method615(class120.field2769, 8159) && class18.field370.method942(36) < 40) {
                            class18.field370 = class18.field370.method958(38, class120.field2769);
                            class9.field140 = true;
                        }
                    } else if (class90.field2038 == -1 && class63.field1525 == -1) {
                        if (class43.field991 == 85 && class18.field411.method942(36) > 0) {
                            class18.field411 = class18.field411.method957(class18.field411.method942(36) - 1, true, 0);
                            class9.field140 = true;
                        }
                        if (class90.method615(class120.field2769, 8159) && class18.field411.method942(36) < 80) {
                            class18.field411 = class18.field411.method958(38, class120.field2769);
                            class9.field140 = true;
                        }
                        if (class43.field991 == 84 && class18.field411.method942(36) > 0) {
                            if (class54.field1257 == 2) {
                                if (class18.field411.method954(class97.field2191, 17706)) {
                                    class21.method184(21254);
                                }
                                if (class18.field411.method954(class23.field615, 17706)) {
                                    class84.field1952 = true;
                                }
                                if (class18.field411.method954(class18.field361, 17706)) {
                                    class84.field1952 = false;
                                }
                                if (class18.field411.method954(class14.field268, 17706)) {
                                    for (int var11 = 0; var11 < 4; var11++) {
                                        for (int var12 = 1; var12 < 103; var12++) {
                                            for (int var13 = 1; var13 < 103; var13++) {
                                                class18.field385[var11].field276[var12][var13] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class18.field411.method954(class127.field2894, 17706) && class37.field874 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class18.field411.method954(class56.field1287, 17706)) {
                                    class71.field1679 = true;
                                }
                            }
                            if (class18.field411.method948(class127.field2900, 0)) {
                                client.field439++;
                                class60.field1437.method622(55, true);
                                class60.field1437.method836(0, class18.field411.method942(36) - 1);
                                class60.field1437.method826(class18.field411.method965(63, 2), (byte) -120);
                            } else {
                                class121 var14 = class18.field411.method959((byte) -124);
                                class69.field1638++;
                                byte var15 = 0;
                                if (var14.method948(class54.field1245, 0)) {
                                    var15 = 0;
                                    class18.field411 = class18.field411.method965(63, class54.field1245.method942(36));
                                } else if (var14.method948(class50.field1193, 0)) {
                                    var15 = 1;
                                    class18.field411 = class18.field411.method965(63, class50.field1193.method942(36));
                                } else if (var14.method948(class44.field1025, 0)) {
                                    var15 = 2;
                                    class18.field411 = class18.field411.method965(63, class44.field1025.method942(36));
                                } else if (var14.method948(class61.field1453, 0)) {
                                    var15 = 3;
                                    class18.field411 = class18.field411.method965(63, class61.field1453.method942(36));
                                } else if (var14.method948(class54.field1252, 0)) {
                                    var15 = 4;
                                    class18.field411 = class18.field411.method965(63, class54.field1252.method942(36));
                                } else if (var14.method948(class57.field1332, 0)) {
                                    class18.field411 = class18.field411.method965(63, class57.field1332.method942(36));
                                    var15 = 5;
                                } else if (var14.method948(class114.field2575, 0)) {
                                    class18.field411 = class18.field411.method965(63, class114.field2575.method942(36));
                                    var15 = 6;
                                } else if (var14.method948(class4.field72, 0)) {
                                    var15 = 7;
                                    class18.field411 = class18.field411.method965(63, class4.field72.method942(36));
                                } else if (var14.method948(class29.field744, 0)) {
                                    class18.field411 = class18.field411.method965(63, class29.field744.method942(36));
                                    var15 = 8;
                                } else if (var14.method948(class69.field1664, 0)) {
                                    var15 = 9;
                                    class18.field411 = class18.field411.method965(63, class69.field1664.method942(36));
                                } else if (var14.method948(class21.field567, 0)) {
                                    var15 = 10;
                                    class18.field411 = class18.field411.method965(63, class21.field567.method942(36));
                                } else if (var14.method948(class125.field2846, 0)) {
                                    var15 = 11;
                                    class18.field411 = class18.field411.method965(63, class125.field2846.method942(36));
                                }
                                class121 var16 = class18.field411.method959((byte) -116);
                                byte var17 = 0;
                                if (var16.method948(class50.field1195, 0)) {
                                    var17 = 1;
                                    class18.field411 = class18.field411.method965(63, class50.field1195.method942(36));
                                } else if (var16.method948(class85.field1960, 0)) {
                                    class18.field411 = class18.field411.method965(63, class85.field1960.method942(36));
                                    var17 = 2;
                                } else if (var16.method948(class4.field56, 0)) {
                                    var17 = 3;
                                    class18.field411 = class18.field411.method965(63, class4.field56.method942(36));
                                } else if (var16.method948(class97.field2186, 0)) {
                                    class18.field411 = class18.field411.method965(63, class97.field2186.method942(36));
                                    var17 = 4;
                                } else if (var16.method948(class50.field1185, 0)) {
                                    var17 = 5;
                                    class18.field411 = class18.field411.method965(63, class50.field1185.method942(36));
                                }
                                class60.field1437.method622(103, true);
                                class60.field1437.method836(0, 0);
                                int var18 = class60.field1437.field2507;
                                class60.field1437.method836(0, var15);
                                class60.field1437.method836(0, var17);
                                class19.method168(class18.field411, class60.field1437, 0);
                                class60.field1437.method857(-1, class60.field1437.field2507 - var18);
                                if (class63.field1526 == 2) {
                                    class48.field1143++;
                                    class91.field2070 = true;
                                    class63.field1526 = 3;
                                    class60.field1437.method622(251, arg0);
                                    class60.field1437.method836(0, class63.field1526);
                                    class60.field1437.method836(0, class19.field492);
                                    class60.field1437.method836(0, class4.field69);
                                }
                            }
                            class9.field140 = true;
                            class18.field411 = class18.field415;
                        }
                    }
                }
                if (!arg0) {
                    field1566 = null;
                    return;
                }
                return;
            } while (!class50.method358(class120.field2769, true) && class120.field2769 != 32);
            if (class18.field383.method942(36) < 12) {
                class18.field383 = class18.field383.method958(38, class120.field2769);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lva;", line = 581)
    public static final class121 method459(int arg0, int arg1) {
        field1568++;
        if (arg0 < 100000) {
            return class35.method242(arg0, 10);
        } else if (arg0 < 10000000) {
            return class113.method866((byte) -50, new class121[] { class35.method242(arg0 / 1000, 10), class62.field1516 });
        } else {
            if (arg1 < 28) {
                field1563 = null;
            }
            return class113.method866((byte) -56, new class121[] { class35.method242(arg0 / 1000000, 10), class45.field1051 });
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 598)
    public static void method460(int arg0) {
        int var1 = 69 % ((arg0 - 63) / 38);
        field1563 = null;
        field1558 = null;
        field1544 = null;
        field1572 = null;
        field1566 = null;
        field1548 = null;
        field1570 = null;
        field1546 = null;
        field1547 = null;
        field1551 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lhe;Lhe;ILhe;)V", line = 618)
    public static final void method461(class47 arg0, class47 arg1, int arg2, class47 arg3) {
        class85.field1955 = arg3;
        field1556++;
        class53.field1223 = arg0;
        class113.field2555 = arg1;
        if (arg2 != 2) {
            method461(null, null, -64, null);
        }
    }
}
