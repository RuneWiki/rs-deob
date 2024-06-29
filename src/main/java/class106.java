import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class106 extends class312 {

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Lil;")
    public class122 field1630;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "J")
    public static volatile long field1621 = 0L;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1624 = 0;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1622 = "Allocated memory";

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "[Lmb;")
    public static class196[] field1623 = new class196[6];

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1628 = "K";

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lkn;")
    public static class52 field1629 = new class52(64);

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field1632 = 0;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILte;)V", line = 28)
    public static final void method718(int arg0, class38 arg1) {
        arg1.field542 = false;
        field1626++;
        if (arg1.field474 != -1) {
            class222 var2 = class118.method809((byte) 93, arg1.field474);
            if (var2 == null || var2.field3529 == null) {
                arg1.field474 = -1;
            } else {
                arg1.field462++;
                if (var2.field3529.length > arg1.field492 && arg1.field462 > var2.field3522[arg1.field492]) {
                    arg1.field462 = 1;
                    arg1.field465++;
                    arg1.field492++;
                    class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var2, arg1.field492);
                }
                if (var2.field3529.length <= arg1.field492) {
                    arg1.field462 = 0;
                    arg1.field492 = 0;
                    class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var2, arg1.field492);
                }
                arg1.field465 = arg1.field492 + 1;
                if (var2.field3529.length <= arg1.field465) {
                    arg1.field465 = 0;
                }
            }
        }
        if (arg1.field530 != -1 && arg1.field477 <= class343.field5341) {
            class148 var3 = class63.method428(false, arg1.field530);
            int var4 = var3.field2355;
            if (var4 == -1) {
                arg1.field530 = -1;
            } else {
                label311: {
                    class222 var5 = class118.method809((byte) 119, var4);
                    if (var3.field2344) {
                        if (var5.field3527 == 3) {
                            if (arg1.field504 > 0 && class343.field5341 >= arg1.field553 && arg1.field466 < class343.field5341) {
                                arg1.field530 = -1;
                                break label311;
                            }
                        } else if (var5.field3527 == 1 && arg1.field504 > 0 && arg1.field553 <= class343.field5341 && arg1.field466 < class343.field5341) {
                            arg1.field477 = class343.field5341 + 1;
                            break label311;
                        }
                    }
                    if (var5 == null || var5.field3529 == null) {
                        arg1.field530 = -1;
                    } else {
                        if (arg1.field534 < 0) {
                            arg1.field534 = 0;
                            class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var5, 0);
                        }
                        arg1.field506++;
                        if (var5.field3529.length > arg1.field534 && arg1.field506 > var5.field3522[arg1.field534]) {
                            arg1.field534++;
                            arg1.field506 = 1;
                            class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var5, arg1.field534);
                        }
                        if (arg1.field534 >= var5.field3529.length) {
                            if (var3.field2344) {
                                arg1.field544++;
                                arg1.field534 -= var5.field3540;
                                if (arg1.field544 >= var5.field3535) {
                                    arg1.field530 = -1;
                                } else if (arg1.field534 >= 0 && arg1.field534 < var5.field3529.length) {
                                    class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var5, arg1.field534);
                                } else {
                                    arg1.field530 = -1;
                                }
                            } else {
                                arg1.field530 = -1;
                            }
                        }
                        arg1.field496 = arg1.field534 + 1;
                        if (var5.field3529.length <= arg1.field496) {
                            if (var3.field2344) {
                                arg1.field496 -= var5.field3540;
                                if ((arg1.field544 + 1) >= var5.field3535) {
                                    arg1.field496 = -1;
                                } else if (arg1.field496 < 0 || arg1.field496 >= var5.field3529.length) {
                                    arg1.field496 = -1;
                                }
                            } else {
                                arg1.field496 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field507 != -1 && arg1.field558 <= 1) {
            class222 var6 = class118.method809((byte) 119, arg1.field507);
            if (var6.field3527 == 3) {
                if (arg1.field504 > 0 && class343.field5341 >= arg1.field553 && arg1.field466 < class343.field5341) {
                    arg1.field507 = -1;
                }
            } else if (var6.field3527 == 1 && arg1.field504 > 0 && arg1.field553 <= class343.field5341 && class343.field5341 > arg1.field466) {
                arg1.field558 = 1;
            }
        }
        if (arg1.field507 != -1 && arg1.field558 == 0) {
            class222 var7 = class118.method809((byte) 70, arg1.field507);
            if (var7 == null || var7.field3529 == null) {
                arg1.field507 = -1;
            } else {
                arg1.field495++;
                if (var7.field3529.length > arg1.field557 && arg1.field495 > var7.field3522[arg1.field557]) {
                    arg1.field495 = 1;
                    arg1.field557++;
                    class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var7, arg1.field557);
                }
                if (arg1.field557 >= var7.field3529.length) {
                    arg1.field478++;
                    arg1.field557 -= var7.field3540;
                    if (arg1.field478 >= var7.field3535) {
                        arg1.field507 = -1;
                    } else if (arg1.field557 >= 0 && arg1.field557 < var7.field3529.length) {
                        class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var7, arg1.field557);
                    } else {
                        arg1.field507 = -1;
                    }
                }
                arg1.field546 = arg1.field557 + 1;
                if (var7.field3529.length <= arg1.field546) {
                    arg1.field546 -= var7.field3540;
                    if (var7.field3535 <= (arg1.field478 + 1)) {
                        arg1.field546 = -1;
                    } else if (arg1.field546 < 0 || var7.field3529.length <= arg1.field546) {
                        arg1.field546 = -1;
                    }
                }
                arg1.field542 = var7.field3553;
            }
        }
        if (arg1.field558 > 0) {
            arg1.field558--;
        }
        int var8 = 0;
        if (arg0 <= 89) {
            return;
        }
        while (arg1.field523.length > var8) {
            class262 var9 = arg1.field523[var8];
            if (var9 != null) {
                if (var9.field4058 > 0) {
                    var9.field4058--;
                } else {
                    class222 var10 = class118.method809((byte) 99, var9.field4057);
                    if (var10 == null || var10.field3529 == null) {
                        arg1.field523[var8] = null;
                    } else {
                        var9.field4048++;
                        if (var10.field3529.length > var9.field4054 && var10.field3522[var9.field4054] < var9.field4048) {
                            var9.field4054++;
                            var9.field4048 = 1;
                            class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var10, var9.field4054);
                        }
                        if (var10.field3529.length <= var9.field4054) {
                            var9.field4054 -= var10.field3540;
                            var9.field4056++;
                            if (var10.field3535 <= var9.field4056) {
                                arg1.field523[var8] = null;
                            } else if (var9.field4054 >= 0 && var10.field3529.length > var9.field4054) {
                                class229.method1571(arg1.field537, class79.field1173 == arg1, (byte) -110, arg1.field519, var10, var9.field4054);
                            } else {
                                arg1.field523[var8] = null;
                            }
                        }
                        var9.field4053 = var9.field4054 + 1;
                        if (var10.field3529.length <= var9.field4053) {
                            var9.field4053 -= var10.field3540;
                            if (var9.field4056 + 1 >= var10.field3535) {
                                var9.field4053 = -1;
                            } else if (var9.field4053 < 0 || var9.field4053 >= var10.field3529.length) {
                                var9.field4053 = -1;
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 330)
    public static void method719(int arg0) {
        field1628 = null;
        field1622 = null;
        field1623 = null;
        field1629 = null;
        if (arg0 < 93) {
            method719(45);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lil;)V", line = 352)
    public class106(class122 arg0) {
        this.field1630 = arg0;
    }
}
