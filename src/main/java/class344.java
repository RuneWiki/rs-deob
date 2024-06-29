import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class344 extends InputStream {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5347 = "Members object";

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    public static int[] field5346 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lwf;")
    public static class333 field5351 = null;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Z")
    public static boolean field5344;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 5)
    public static final int method2388(String arg0, boolean arg1) {
        if (arg1) {
            return 23;
        }
        field5352++;
        for (int var2 = 0; var2 < class299.field4390.length; var2++) {
            if (class299.field4390[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method2389(boolean arg0) {
        field5349++;
        if (class265.field3848 != null) {
            class265.field3848.method526(-19055);
            class265.field3848 = null;
        }
        class195.method1408(-7603);
        class56.method423();
        for (int var1 = 0; var1 < 4; var1++) {
            class231.field3312[var1].method56(11736);
        }
        class40.method281(false, (byte) -93);
        System.gc();
        class67.method489(5, 2);
        class84.field1082 = -1;
        class297.field4314 = false;
        class291.method1996(true, 14713);
        class355.field5556 = 0;
        class253.field3699 = 0;
        class289.field4179 = 0;
        class48.field644 = false;
        class331.field4867 = 0;
        for (int var2 = 0; var2 < class102.field1326.length; var2++) {
            class102.field1326[var2] = null;
        }
        class257.field3747 = 0;
        class112.field1441 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class311.field4574[var3] = null;
            class29.field334[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class251.field3688[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class20.field221[var5][var6][var7] = null;
                }
            }
        }
        class15.method108((byte) 120);
        class107.field1386 = 0;
        class293.method2005((byte) -5);
        class249.method1742(arg0, 2);
        try {
            class200.method1469(class157.field2216.field883, -18278, "loggedout");
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!ia", name = "read", descriptor = "()I", line = 127)
    public final int read() {
        field5345++;
        class177.method1299((byte) 64, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V", line = 137)
    public static void method2390(boolean arg0) {
        field5351 = null;
        if (!arg0) {
            field5346 = null;
            field5347 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lwf;ILjava/lang/String;)Ljava/lang/String;", line = 159)
    public static final String method2391(class333 arg0, int arg1, String arg2) {
        field5348++;
        if (arg1 != 2) {
            return (String) null;
        } else if (arg2.indexOf("%") == -1) {
            return arg2;
        } else {
            while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            return arg2;
                                                        }
                                                        String var9 = "";
                                                        if (class345.field5355 != null) {
                                                            if (class345.field5355.field2606 == null) {
                                                                var9 = class356.method2474((byte) 39, class345.field5355.field2605);
                                                            } else {
                                                                var9 = (String) class345.field5355.field2606;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class287.method1965(class219.method1600(4, (byte) -107, arg0), 999999999) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class287.method1965(class219.method1600(3, (byte) -59, arg0), 999999999) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class287.method1965(class219.method1600(2, (byte) -37, arg0), arg1 ^ 0x3B9AC9FD) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class287.method1965(class219.method1600(1, (byte) -86, arg0), 999999999) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class287.method1965(class219.method1600(0, (byte) -31, arg0), 999999999) + arg2.substring(var3 + 2);
            }
        }
    }
}
