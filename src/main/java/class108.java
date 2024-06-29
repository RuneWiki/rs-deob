import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class108 {

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "Lgda;")
    public class55 field1438 = new class55();

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "[I")
    public static int[] field1428 = new int[32];

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "D")
    public static double field1437 = -1.0D;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "Ltg;")
    public static class233 field1427;

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "Lgda;")
    private class55 field1442;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V", line = 3)
    public static void method721(boolean arg0) {
        field1427 = null;
        field1428 = null;
        if (arg0) {
            method721(false);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)Lgda;", line = 16)
    public final class55 method722(byte arg0) {
        int var2 = -103 % ((arg0 + 66) / 47);
        field1430++;
        class55 var3 = this.field1442;
        if (this.field1438 == var3) {
            this.field1442 = null;
            return null;
        } else {
            this.field1442 = var3.field557;
            return var3;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Lgda;", line = 39)
    public final class55 method723(int arg0) {
        if (arg0 <= 87) {
            this.method731(null, -43);
        }
        field1425++;
        class55 var2 = this.field1442;
        if (this.field1438 == var2) {
            this.field1442 = null;
            return null;
        } else {
            this.field1442 = var2.field564;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)Lgda;", line = 63)
    public final class55 method724(int arg0) {
        field1429++;
        if (arg0 != 32) {
            return null;
        }
        class55 var2 = this.field1438.field564;
        if (this.field1438 == var2) {
            this.field1442 = null;
            return null;
        } else {
            this.field1442 = var2.field564;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lgda;I)V", line = 85)
    public final void method725(class55 arg0, int arg1) {
        if (arg0.field557 != null) {
            arg0.method315(71);
        }
        field1433++;
        arg0.field557 = this.field1438.field557;
        arg0.field564 = this.field1438;
        arg0.field557.field564 = arg0;
        arg0.field564.field557 = arg0;
        if (arg1 != -20911) {
            this.field1438 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)Z", line = 103)
    public final boolean method726(int arg0) {
        if (arg0 > -123) {
            field1428 = null;
        }
        field1431++;
        return this.field1438.field564 == this.field1438;
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)Lgda;", line = 115)
    public final class55 method727(int arg0) {
        field1436++;
        class55 var2 = this.field1438.field564;
        if (this.field1438 == var2) {
            return null;
        }
        var2.method315(90);
        if (arg0 != 6494) {
            this.field1442 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)V", line = 134)
    public final void method728(byte arg0) {
        field1434++;
        while (true) {
            class55 var2 = this.field1438.field564;
            if (this.field1438 == var2) {
                this.field1442 = null;
                if (arg0 == 47) {
                    return;
                } else {
                    method735(-56, -39);
                    return;
                }
            }
            var2.method315(87);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILgda;)V", line = 172)
    public final void method729(int arg0, class55 arg1) {
        if (arg1.field557 != null) {
            arg1.method315(100);
        }
        field1424++;
        arg1.field557 = this.field1438;
        arg1.field564 = this.field1438.field564;
        arg1.field557.field564 = arg1;
        arg1.field564.field557 = arg1;
        if (arg0 != -2) {
            this.method733(100);
        }
    }

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "(I)I", line = 192)
    public final int method730(int arg0) {
        field1432++;
        int var2 = arg0;
        for (class55 var3 = this.field1438.field564; var3 != this.field1438; var3 = var3.field564) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lkba;I)V", line = 210)
    public final void method731(class108 arg0, int arg1) {
        int var3 = -55 % ((11 - arg1) / 57);
        field1435++;
        this.method732(arg0, this.field1438.field564, (byte) -123);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lkba;Lgda;B)V", line = 221)
    private final void method732(class108 arg0, class55 arg1, byte arg2) {
        if (arg2 > -57) {
            this.method727(-21);
        }
        field1426++;
        class55 var4 = this.field1438.field557;
        this.field1438.field557 = arg1.field557;
        arg1.field557.field564 = this.field1438;
        if (this.field1438 != arg1) {
            arg1.field557 = arg0.field1438.field557;
            arg1.field557.field564 = arg1;
            arg0.field1438.field557 = var4;
            var4.field564 = arg0.field1438;
        }
    }

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "(I)Lgda;", line = 243)
    public final class55 method733(int arg0) {
        field1441++;
        if (arg0 > -39) {
            return null;
        }
        class55 var2 = this.field1438.field557;
        if (this.field1438 == var2) {
            this.field1442 = null;
            return null;
        } else {
            this.field1442 = var2.field557;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lov;ZI)V", line = 263)
    public static final void method734(class189 arg0, boolean arg1, int arg2) {
        if (arg2 != 15697) {
            field1427 = null;
        }
        field1440++;
        if (arg0.field2281) {
            if (arg0.field2276 < 0 || class315.method1886(arg0.field2272, arg0.field2276, false)) {
                if (arg1) {
                    class607.method3351(null, arg0.field2270, arg0.field2273, arg0.field2269, arg0.field2275, 6093);
                } else {
                    class445.method2495(arg0.field2276, arg0.field2270, arg0.field2275, arg0.field2278, arg0.field2273, arg2 ^ 0xFFFFC2AF, arg0.field2269, -1, arg0.field2272);
                }
                arg0.method315(109);
            }
        } else if (arg0.field2280 && arg0.field2269 >= 1 && arg0.field2270 >= 1 && class272.field3589 - 2 >= arg0.field2269 && (class3.field26 - 2) >= arg0.field2270) {
            if (arg0.field2271 >= 0 && !class315.method1886(arg0.field2279, arg0.field2271, false)) {
                return;
            }
            if (arg1) {
                class607.method3351(arg0.field2282, arg0.field2270, arg0.field2273, arg0.field2269, arg0.field2275, 6093);
            } else {
                class445.method2495(arg0.field2271, arg0.field2270, arg0.field2275, arg0.field2277, arg0.field2273, -2, arg0.field2269, -1, arg0.field2279);
            }
            arg0.field2280 = false;
            if (!arg1 && arg0.field2276 == arg0.field2271 && arg0.field2276 == -1) {
                arg0.method315(45);
                return;
            }
            if (!arg1 && arg0.field2276 == arg0.field2271 && arg0.field2278 == arg0.field2277 && arg0.field2279 == arg0.field2272) {
                arg0.method315(86);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V", line = 313)
    public static final void method735(int arg0, int arg1) {
        class125.field1630 = arg1;
        field1439++;
        class322.field4321.method1563(119);
        int var2 = -38 % ((57 - arg0) / 35);
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V", line = 337)
    public class108() {
        this.field1438.field557 = this.field1438;
        this.field1438.field564 = this.field1438;
    }
}
