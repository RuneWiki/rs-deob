import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class255 {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lcd;")
    private static class64 field4430 = class44.method335((byte) 71, "Loading)3)3)3");

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4436 = -1;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[I")
    public static int[] field4426 = new int[200];

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4432 = 0;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lcd;")
    private static class64 field4434 = class44.method335((byte) 71, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lcd;")
    public static class64 field4435 = class44.method335((byte) 71, "(R");

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lcd;")
    private static class64 field4439 = class44.method335((byte) 71, " has logged out)3");

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lcd;")
    public static class64 field4431 = field4430;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lcd;")
    public static class64 field4427 = field4434;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lcd;")
    public static class64 field4437 = field4439;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lli;")
    public static class209 field4429;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLqm;Lqm;)V", line = 11)
    public static final void method1818(byte arg0, class222 arg1, class222 arg2) {
        if (arg0 != 36) {
            method1821(false, (byte) -46);
        }
        class235.field3971 = arg1;
        field4438++;
        class63.field1222 = arg2;
        class53.field877 = class63.field1222.method1600(3, (byte) -36);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 48)
    public static final void method1819(int arg0) {
        class80.field1491 = 0;
        field4440++;
        class104.field1926 = false;
        class131.field2333 = 1;
        class55.field926 = 0;
        if (arg0 != 16234) {
            method1822((byte) 23);
        }
        class125.field2260 = -3;
        class17.field355 = 0;
        class229.field3883 = -1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 77)
    public static void method1820(boolean arg0) {
        field4437 = null;
        field4427 = null;
        field4429 = null;
        field4426 = null;
        field4439 = null;
        field4431 = null;
        field4434 = null;
        if (arg0) {
            field4430 = null;
            field4435 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZB)V", line = 98)
    public static final void method1821(boolean arg0, byte arg1) {
        class246.method1778(5);
        field4441++;
        if (class128.field2277 != 30 && class128.field2277 != 25) {
            return;
        }
        class266.field4578++;
        if (class266.field4578 < 50 && !arg0) {
            return;
        }
        class266.field4578 = 0;
        int var2 = 121 % ((-arg1 - 31) / 60);
        if (!class104.field1926 && class216.field3626 != null) {
            class85.field1572++;
            class17.field353.method1214(-62, 118);
            try {
                class216.field3626.method227(class17.field353.field254, 0, 3, class17.field353.field281);
                class17.field353.field281 = 0;
            } catch (IOException var4) {
                class104.field1926 = true;
            }
        }
        class246.method1778(5);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z", line = 153)
    public static final boolean method1822(byte arg0) {
        if (arg0 < 81) {
            method1820(true);
        }
        field4428++;
        try {
            if ((++class260.field4478) <= 1500) {
                if (class48.field794 == 0) {
                    if (class154.method1114(true) - 5000L < class163.field2871) {
                        return true;
                    } else {
                        class163.field2871 = class154.method1114(true);
                        class283.field4873 = class228.field3876.method1948(class309.field5258, class157.field2768, (byte) -16);
                        class48.field794 = 1;
                        return false;
                    }
                } else if (class48.field794 == 1) {
                    if (class283.field4873.field375 == 2) {
                        throw new IOException();
                    } else if (class283.field4873.field375 == 1) {
                        int var5 = 0;
                        class216.field3626 = new class24((Socket) class283.field4873.field377, class228.field3876);
                        class17.field353.field281 = 0;
                        class283.field4873 = null;
                        if (class272.field4674) {
                            var5 = class17.field348;
                        }
                        class17.field353.method130(-1, 125);
                        class17.field353.method128((byte) 108, var5);
                        class216.field3626.method227(class17.field353.field254, 0, 3, class17.field353.field281);
                        if (class94.field1747 != null) {
                            class94.field1747.method1055(2000);
                        }
                        if (class315.field5334 != null) {
                            class315.field5334.method1055(2000);
                        }
                        class283.field4867 = class216.field3626.method223((byte) 116);
                        if (class94.field1747 != null) {
                            class94.field1747.method1055(2000);
                        }
                        if (class315.field5334 != null) {
                            class315.field5334.method1055(2000);
                        }
                        class48.field794 = 2;
                        return false;
                    } else {
                        return false;
                    }
                } else if (class48.field794 != 2) {
                    int var1 = class216.field3626.method219(0);
                    if (var1 < 1) {
                        return false;
                    }
                    class216.field3626.method221(class10.field206, class249.field4333, -126, var1);
                    class249.field4333 += var1;
                    if (class283.field4867 > class249.field4333) {
                        return false;
                    }
                    int var2 = 0;
                    class213.method1505(false, class10.field206);
                    class297.field5122 = new class9[class72.field1398];
                    for (int var3 = class113.field2086; var3 <= class61.field1196; var3++) {
                        class9 var4 = class83.method643(var3, -24383);
                        if (var4 != null) {
                            class297.field5122[var2++] = var4;
                        }
                    }
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                    class126.method909(2);
                    return true;
                } else if (class216.field3626.method219(0) >= 1) {
                    class283.field4867 <<= 0x8;
                    class283.field4867 += class216.field3626.method223((byte) 116);
                    class48.field794 = 3;
                    class10.field206 = new byte[class283.field4867];
                    class10.field206[1] = (byte) class224.method1614(255, class283.field4867);
                    class10.field206[0] = (byte) (class283.field4867 >> 8);
                    return false;
                } else {
                    return false;
                }
            } else if (class216.field3626 != null) {
                class216.field3626.method225(1);
                class216.field3626 = null;
                class126.method909(2);
                return true;
            } else if (class120.field2169 < 1) {
                class260.field4478 = 0;
                class120.field2169++;
                class48.field794 = 0;
                if (class62.field1206 == class309.field5258) {
                    class309.field5258 = class197.field3359;
                } else {
                    class309.field5258 = class62.field1206;
                }
                return false;
            } else {
                class126.method909(2);
                return true;
            }
        } catch (IOException var7) {
            if (class216.field3626 != null) {
                class216.field3626.method225(1);
                class216.field3626 = null;
            }
            if (class120.field2169 >= 1) {
                class126.method909(2);
                return true;
            }
            class48.field794 = 0;
            class120.field2169++;
            class260.field4478 = 0;
            if (class62.field1206 == class309.field5258) {
                class309.field5258 = class197.field3359;
            } else {
                class309.field5258 = class62.field1206;
            }
            return false;
        }
    }
}
