import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class16 {

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
    public static boolean field185 = false;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field186 = 0;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lta;")
    public static class300 field181 = new class300(16);

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "Lta;")
    public static class300 field192 = new class300(64);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
    public static boolean field184;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "[I")
    public static int[] field191;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "[[B")
    public static byte[][] field190;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 4)
    public static void method85(int arg0) {
        field191 = null;
        field190 = (byte[][]) null;
        field181 = null;
        int var1 = -41 % ((-arg0 - 71) / 44);
        field192 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljn;IILmf;I)V", line = 27)
    public static final void method86(class59 arg0, int arg1, int arg2, class213 arg3, int arg4) {
        field187++;
        if (arg2 != 1011) {
            return;
        }
        if (arg3.field3395 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg3.field3395.length];
            for (int var7 = 0; var7 < var6.length / 2; var7++) {
                int var8 = arg3.field3395[var7 * 2] + arg0.field1015;
                int var9 = arg0.field1008 - arg3.field3395[var7 * 2 + 1];
                int var10 = var6[var7 * 2] = class174.field2785 + ((class174.field2793 - class174.field2785) * (var8 - class174.field2783) / (class174.field2788 - class174.field2783));
                int var11 = var6[var7 * 2 + 1] = (class174.field2797 - class174.field2794) * (var9 - class174.field2796) / (class174.field2790 - class174.field2796) + class174.field2794;
                if (var10 > class174.field2785 && var10 < class174.field2793 && class174.field2794 < var11 && var11 < class174.field2797) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class154.method1207(var6, arg3.field3422, arg3.field3422 >>> 24);
            for (int var12 = 0; var12 < (var6.length / 2 - 1); var12++) {
                class246.method1892(var6[var12 * 2], var6[var12 * 2 + 1], var6[var12 * 2 + 2], var6[var12 * 2 + 3], arg3.field3389, arg3.field3389 >>> 24);
            }
            class246.method1892(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg3.field3389, arg3.field3389 >>> 24);
        } else if (arg0.field1013) {
            return;
        }
        class267 var13 = new class267(arg0);
        class341 var14 = null;
        if (arg3.field3413 != -1) {
            if (arg0.field1021 && arg3.field3425 != -1) {
                var14 = (class341) arg3.method1605(arg2 - 1034, true, true);
            } else {
                var14 = (class341) arg3.method1605(-23, false, true);
            }
            if (var14 != null) {
                if (class248.field4048 > 0 && (class255.field4296 != -1 && class255.field4296 == arg0.field1011 || class74.field1256 != -1 && class74.field1256 == arg3.field3421)) {
                    int var15;
                    if (class226.field3727 <= 50) {
                        var15 = class226.field3727 * 3;
                    } else {
                        var15 = 300 - (class226.field3727 * 3);
                    }
                    class246.method1890(arg0.field1014, arg0.field1017, var14.field4652 / 2 + 7, 16776960, var15);
                    class246.method1890(arg0.field1014, arg0.field1017, var14.field4652 / 2 + 5, 16776960, var15);
                    class246.method1890(arg0.field1014, arg0.field1017, var14.field4652 / 2 + 3, 16776960, var15);
                    class246.method1890(arg0.field1014, arg0.field1017, var14.field4652 / 2 + 1, 16776960, var15);
                    class246.method1890(arg0.field1014, arg0.field1017, var14.field4652 / 2, 16776960, var15);
                }
                var14.method2015(arg0.field1014 - (var14.field4652 >> 1), arg0.field1017 - (var14.field4649 >> 1));
                var13.field4475 = arg4 + arg0.field1014 - (var14.field4652 >> 1);
                var13.field4473 = (var14.field4652 >> 1) + arg0.field1014 + arg4;
                var13.field4474 = arg0.field1017 + arg1 - (var14.field4649 >> 1);
                var13.field4465 = (var14.field4649 >> 1) + arg1 + arg0.field1017;
            }
        }
        if (arg3.field3401 != null) {
            if (var14 == null) {
                class239.method1824(arg0, var13, true, arg1, arg4, arg3, (byte) 65, 0);
            } else {
                class239.method1824(arg0, var13, false, arg1, arg4, arg3, (byte) 38, (var14.field4649 >> 1) + 5);
            }
        }
        if (var13.method2025((byte) -119, class333.field5275, class77.field1343) && arg3.field3408 != null) {
            if (arg3.field3408[4] != null) {
                class55.method434(0, -1, false, (long) arg0.field1011, arg3.field3406, arg3.field3421, arg3.field3408[4], (short) 1011);
            }
            if (arg3.field3408[3] != null) {
                class55.method434(0, -1, false, (long) arg0.field1011, arg3.field3406, arg3.field3421, arg3.field3408[3], (short) 1012);
            }
            if (arg3.field3408[2] != null) {
                class55.method434(0, -1, false, (long) arg0.field1011, arg3.field3406, arg3.field3421, arg3.field3408[2], (short) 1007);
            }
            if (arg3.field3408[1] != null) {
                class55.method434(0, -1, false, (long) arg0.field1011, arg3.field3406, arg3.field3421, arg3.field3408[1], (short) 1006);
            }
            if (arg3.field3408[0] != null) {
                class55.method434(0, -1, false, (long) arg0.field1011, arg3.field3406, arg3.field3421, arg3.field3408[0], (short) 1002);
            }
        }
        class206.field3260.method2302((byte) -99, var13);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lna;B)V", line = 168)
    public static final void method87(class145 arg0, byte arg1) {
        field193++;
        class18 var2 = null;
        try {
            class192 var3 = arg0.method1134(123, "runescape");
            while (var3.field3064 == 0) {
                class283.method2076((byte) 35, 1L);
            }
            if (var3.field3064 == 1) {
                var2 = (class18) var3.field3066;
                class227 var4 = class300.method2146(29513);
                var2.method104((byte) 41, var4.field3760, var4.field3793, 0);
            }
            if (arg1 != -64) {
                field192 = (class300) null;
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method101(false);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 216)
    public static final Class method88(byte arg0, String arg1) throws ClassNotFoundException {
        field189++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0 >= -81) {
                field191 = (int[]) null;
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }
}
