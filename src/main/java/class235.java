import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class class235 {

    @OriginalMember(owner = "client!av", name = "a", descriptor = "Lhi;")
    public static class45 field3256 = new class45(16, 3);

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lsn;")
    public static class205 field3261 = new class205(6, 3);

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BZ)V", line = 3)
    public static final void method1432(byte arg0, boolean arg1) {
        if (arg1 && class472.field6807 != null) {
            class246.field3357 = class472.field6807.field6714;
        } else {
            class246.field3357 = -1;
        }
        field3257++;
        class472.field6807 = null;
        class387.field5556 = null;
        class377.field5430 = null;
        class1.field16 = 0;
        class472.method2744();
        class472.field6811.method3143(true);
        class414.field5894 = null;
        class54.field780 = null;
        class281.field3828 = -1;
        class28.field405 = null;
        class470.field6776 = -1;
        class472.field6814 = null;
        class411.field5831 = null;
        class490.field7080 = null;
        class390.field5634 = null;
        class187.field2761 = null;
        class77.field1090 = null;
        class298.field4088 = null;
        class472.field6803.method1658(-11711);
        class472.field6805.method1499(64, 64, 32);
        class472.field6803.method1654(64, true, 128);
        int var2 = 28 / ((77 - arg0) / 44);
        class472.field6808.method606(500, 64);
        class296.field3994.method1315(0, 64);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)Z", line = 41)
    public static final boolean method1434(int arg0, byte arg1) {
        int var2 = 102 / ((arg1 + 55) / 40);
        field3259++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(IB)V", line = 54)
    public static final void method1436(int arg0, byte arg1) {
        if (arg1 < 22) {
            field3256 = null;
        }
        field3260++;
        for (class476 var2 = class120.field1866.method1588(62); var2 != null; var2 = class120.field1866.method1582(-114)) {
            if ((long) arg0 == (var2.field6883 >> 48 & 0xFFFFL)) {
                var2.method2791((byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZ)V", line = 84)
    public static final void method1438(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1438(-54, 11, false);
        }
        field3258++;
        if ((class472.field6812 < class472.field6810)) {
            class472.field6812 = (float) ((double) class472.field6812 / 30.0D + (double) class472.field6812);
            if (class472.field6812 > class472.field6810) {
                class472.field6812 = class472.field6810;
            }
            class409.method2400((byte) 2);
            class472.field6809 = (int) class472.field6812 >> 1;
            class472.field6815 = class95.method770(class472.field6809, arg2);
        } else if (class472.field6812 > class472.field6810) {
            class472.field6812 = (float) ((double) class472.field6812 - (double) class472.field6812 / 30.0D);
            if (class472.field6812 < class472.field6810) {
                class472.field6812 = class472.field6810;
            }
            class409.method2400((byte) 2);
            class472.field6809 = (int) class472.field6812 >> 1;
            class472.field6815 = class95.method770(class472.field6809, arg2);
        }
        if (class470.field6776 != -1 && class281.field3828 != -1) {
            int var3 = class470.field6776 - class336.field4899;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class281.field3828 - class321.field4414;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class336.field4899 -= -var3;
            if (var3 == 0 && var4 == 0) {
                class470.field6776 = -1;
                class281.field3828 = -1;
            }
            class321.field4414 += var4;
            class409.method2400((byte) 2);
        }
        if (class149.field2304 <= 0) {
            class65.field944 = -1;
            class437.field6306 = -1;
        } else {
            class203.field2940--;
            if (class203.field2940 == 0) {
                class203.field2940 = 100;
                class149.field2304--;
            }
        }
        if (!class300.field4108 || class377.field5430 == null) {
            return;
        }
        for (class191 var5 = (class191) class377.field5430.method3137(0); var5 != null; var5 = (class191) class377.field5430.method3132(0)) {
            class92 var6 = class472.field6803.method1655(var5.field2786.field3280, (byte) -116);
            if (var5.method1266(arg1, 98, arg0)) {
                if (var6.field1466 != null) {
                    if (var6.field1466[4] != null) {
                        class193.method1274(var6.field1502, var6.field1466[4], true, -1, var6.field1469, -1, 0, 1008, false, !arg2, (long) var5.field2786.field3280);
                    }
                    if (var6.field1466[3] != null) {
                        class193.method1274(var6.field1502, var6.field1466[3], true, -1, var6.field1469, -1, 0, 1010, false, !arg2, (long) var5.field2786.field3280);
                    }
                    if (var6.field1466[2] != null) {
                        class193.method1274(var6.field1502, var6.field1466[2], true, -1, var6.field1469, -1, 0, 1004, false, !arg2, (long) var5.field2786.field3280);
                    }
                    if (var6.field1466[1] != null) {
                        class193.method1274(var6.field1502, var6.field1466[1], true, -1, var6.field1469, -1, 0, 1003, false, true, (long) var5.field2786.field3280);
                    }
                    if (var6.field1466[0] != null) {
                        class193.method1274(var6.field1502, var6.field1466[0], true, -1, var6.field1469, -1, 0, 1012, false, true, (long) var5.field2786.field3280);
                    }
                }
                if (!var5.field2786.field3282) {
                    var5.field2786.field3282 = true;
                    class47.method310(class249.field3397, var5.field2786.field3280, var6.field1502);
                }
                if (var5.field2786.field3282) {
                    class47.method310(class221.field3125, var5.field2786.field3280, var6.field1502);
                }
            } else if (var5.field2786.field3282) {
                var5.field2786.field3282 = false;
                class47.method310(class39.field585, var5.field2786.field3280, var6.field1502);
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V", line = 223)
    public static void method1440(boolean arg0) {
        if (arg0) {
            field3256 = null;
            field3261 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)J")
    public abstract long method1433(int arg0);

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)C")
    public abstract char method1435(int arg0);

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)I")
    public abstract int method1437(int arg0);

    @OriginalMember(owner = "client!av", name = "d", descriptor = "(I)I")
    public abstract int method1439(int arg0);

    @OriginalMember(owner = "client!av", name = "e", descriptor = "(I)Z")
    public abstract boolean method1441(int arg0);
}
