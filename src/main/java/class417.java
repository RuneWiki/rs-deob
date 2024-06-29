import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class417 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[Lkk;")
    public static class372[] field6209 = new class372[29];

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[[I")
    public static int[][] field6216 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field6214 = 1;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "[I")
    public static int[] field6218 = new int[5];

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field6220 = 0;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Z")
    public static boolean field6217;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[Lqa;")
    public static class243[] field6208;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIII)V", line = 6)
    public static final void method2689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 88 % ((-arg8 - 11) / 53);
        field6212++;
        if (arg5 < 1 || arg2 < 1 || class324.field4652 - 2 < arg5 || arg2 > (class336.field4964 - 2)) {
            return;
        }
        if (!class116.method810((byte) -41) && !class226.method1404(arg5, true, arg2, arg0, class431.field6368)) {
            return;
        }
        if (class343.field5032 == null) {
            return;
        }
        int var10 = arg0;
        if (arg0 < 3 && class161.method1010(arg2, (byte) 72, arg5)) {
            var10 = arg0 + 1;
        }
        class179.method1103(arg1, arg5, arg0, (byte) -113, class35.field574, var10, class119.field1605[arg0], arg2);
        if (arg6 < 0) {
            return;
        }
        boolean var11 = class258.field3768;
        class258.field3768 = true;
        class391.method2560(false, arg6, class35.field574, (byte) -91, var10, class119.field1605[arg0], arg7, arg0, arg5, arg4, arg2, arg3, false);
        class258.field3768 = var11;
        return;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZJZII)Ljava/lang/String;", line = 50)
    public static final String method2690(boolean arg0, long arg1, boolean arg2, int arg3, int arg4) {
        field6210++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = arg2;
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg1 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 131)
    public static final void method2691(int arg0) {
        class24 var1 = class104.field1396;
        synchronized (class104.field1396) {
            class104.field1396.method204((byte) 56);
        }
        field6211++;
        int var2 = 31 / ((61 - arg0) / 39);
        class24 var3 = class197.field2822;
        synchronized (class197.field2822) {
            class197.field2822.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLqj;)V", line = 146)
    public static final void method2692(boolean arg0, class238 arg1) {
        if (!arg0) {
            field6218 = null;
        }
        field6213++;
        class59.field857 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 157)
    public static void method2693(byte arg0) {
        int var1 = 116 / ((-arg0 - 32) / 63);
        field6218 = null;
        field6208 = null;
        field6209 = null;
        field6216 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V", line = 169)
    public static final void method2694(int arg0, boolean arg1) {
        for (class166 var2 = (class166) class70.field965.method2649(arg0 - 4); var2 != null; var2 = (class166) class70.field965.method2656(0)) {
            if (var2.field2162 != null) {
                class405.field6092.method166(var2.field2162);
                var2.field2162 = null;
            }
            if (var2.field2160 != null) {
                class405.field6092.method166(var2.field2160);
                var2.field2160 = null;
            }
            var2.method2574((byte) 120);
        }
        field6219++;
        if (arg0 != 4) {
            method2690(false, 55L, false, -37, -79);
        }
        if (!arg1) {
            return;
        }
        for (class166 var3 = (class166) class54.field805.method2649(0); var3 != null; var3 = (class166) class54.field805.method2656(0)) {
            if (var3.field2162 != null) {
                class405.field6092.method166(var3.field2162);
                var3.field2162 = null;
            }
            var3.method2574((byte) 117);
        }
        for (class166 var4 = (class166) class84.field1175.method953(0); var4 != null; var4 = (class166) class84.field1175.method951(0)) {
            if (var4.field2162 != null) {
                class405.field6092.method166(var4.field2162);
                var4.field2162 = null;
            }
            var4.method2574((byte) 120);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Los;", line = 240)
    public static final class378 method2695(int arg0, int arg1) {
        field6215++;
        if (arg1 == 0) {
            if ((double) class76.field1027 == 3.0D) {
                return class319.field4569;
            }
            if ((double) class76.field1027 == 4.0D) {
                return class50.field696;
            }
            if ((double) class76.field1027 == 6.0D) {
                return class339.field4990;
            }
            if ((double) class76.field1027 >= 8.0D) {
                return class124.field1655;
            }
        } else if (arg1 == 1) {
            if ((double) class76.field1027 == 3.0D) {
                return class339.field4990;
            }
            if ((double) class76.field1027 == 4.0D) {
                return class124.field1655;
            }
            if ((double) class76.field1027 == 6.0D) {
                return class106.field1418;
            }
            if ((double) class76.field1027 >= 8.0D) {
                return class1.field8;
            }
        } else if (arg1 == 2) {
            if ((double) class76.field1027 == 3.0D) {
                return class106.field1418;
            }
            if ((double) class76.field1027 == 4.0D) {
                return class1.field8;
            }
            if ((double) class76.field1027 == 6.0D) {
                return class437.field6421;
            }
            if ((double) class76.field1027 >= 8.0D) {
                return class312.field4473;
            }
        }
        return arg0 >= -64 ? null : null;
    }
}
