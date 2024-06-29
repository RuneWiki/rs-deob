import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class189 {

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "B")
    public byte field2251;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljava/lang/String;")
    public String field2247;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ljava/lang/String;")
    public String field2248;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljava/lang/String;")
    public String field2252;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Ljava/lang/String;")
    public String field2254;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[[[J")
    public static long[][][] field2250;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILpp;Z)V", line = 15)
    public static final void method1123(int arg0, class365 arg1, boolean arg2) {
        field2246++;
        if (class638.field8648 >= 400) {
            return;
        }
        if (class67.field815 != arg1) {
            String var9;
            if (arg1.field4690 == 0) {
                boolean var3 = true;
                if (class67.field815.field4696 != -1 && arg1.field4696 != -1) {
                    int var4 = arg1.field4674 < class67.field815.field4674 ? class67.field815.field4674 : arg1.field4674;
                    int var5 = class67.field815.field4696 < arg1.field4696 ? class67.field815.field4696 : arg1.field4696;
                    int var6 = var5 + (var4 * 10 / 100) + 5;
                    int var7 = class67.field815.field4674 - arg1.field4674;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class341.field4353 == class237.field3061 ? class671.field9144.method3726((byte) 123, class71.field912) : class671.field9142.method3726((byte) 94, class71.field912);
                if (arg1.field4675 <= arg1.field4674) {
                    var9 = arg1.method2129(46, true) + (var3 ? class243.method1460(2551, arg1.field4674, class67.field815.field4674) : "<col=ffffff>") + " (" + var8 + arg1.field4674 + ")";
                } else {
                    var9 = arg1.method2129(85, true) + (var3 ? class243.method1460(2551, arg1.field4674, class67.field815.field4674) : "<col=ffffff>") + " (" + var8 + arg1.field4674 + "+" + (arg1.field4675 - arg1.field4674) + ")";
                }
            } else if (arg1.field4690 == -1) {
                var9 = arg1.method2129(92, true);
            } else {
                var9 = arg1.method2129(89, true) + " (" + class671.field9143.method3726((byte) 92, class71.field912) + arg1.field4690 + ")";
            }
            if (class37.field542 && !arg2 && (class458.field5709 & 0x8) != 0) {
                class116.field1438++;
                class688.method3802(false, true, -1, 57, 0, class467.field5794, (long) arg1.field495, class351.field4540 + " -> <col=ffffff>" + var9, 0, class7.field74, 0);
            }
            if (arg0 > -55) {
                field2245 = 102;
            }
            if (arg2) {
                class688.method3802(true, false, 0, -1, 0, "<col=cccccc>" + var9, 0L, "", 0, -1, 0);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class112.field1402[var10] != null) {
                        short var11 = 0;
                        if (class540.field6812 == class341.field4353 && class112.field1402[var10].equalsIgnoreCase(class671.field9137.method3726((byte) 93, class71.field912))) {
                            if (class67.field815.field4674 < arg1.field4674) {
                                var11 = 2000;
                            }
                            if (class67.field815.field4670 != 0 && arg1.field4670 != 0) {
                                if (class67.field815.field4670 == arg1.field4670) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class187.field2213[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class689.field9566[var10] + var11);
                        int var13 = class688.field9472[var10] == -1 ? class428.field5404 : class688.field9472[var10];
                        class168.field1971++;
                        class688.method3802(false, true, -1, var12, 0, class112.field1402[var10], (long) arg1.field495, "<col=ffffff>" + var9, 0, var13, 0);
                    }
                }
            }
            if (!arg2) {
                for (class501 var14 = (class501) class345.field4438.method1909(true); var14 != null; var14 = (class501) class345.field4438.method1916((byte) 95)) {
                    if (var14.field6242 == 9) {
                        var14.field6243 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class37.field542 && (class458.field5709 & 0x10) != 0) {
            class8.field85++;
            class688.method3802(false, true, -1, 5, 0, class467.field5794, 0L, class351.field4540 + " -> <col=ffffff>" + class671.field9151.method3726((byte) 46, class71.field912), 0, class7.field74, 0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILrr;I)I", line = 173)
    public static final int method1124(int arg0, class337 arg1, int arg2) {
        int var3 = -59 % ((-arg2 - 26) / 40);
        field2255++;
        if (!client.method1693(arg1).method2041(arg0, 0) && arg1.field4164 == null) {
            return -1;
        } else if (arg1.field4235 == null || arg1.field4235.length <= arg0) {
            return -1;
        } else {
            return arg1.field4235[arg0];
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 189)
    public static void method1125(int arg0) {
        field2250 = null;
        if (arg0 != -10) {
            field2244 = 81;
        }
    }
}
