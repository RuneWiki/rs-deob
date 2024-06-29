import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class434 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[[I")
    public static int[][] field6137 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "F")
    public static float field6138;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Lrg;")
    public static class588 field6141;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method2493(byte arg0) {
        field6141 = null;
        field6137 = null;
        if (arg0 != 85) {
            field6138 = -0.3794095F;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZILfaa;I)V")
    public static final void method2494(int arg0, boolean arg1, int arg2, class140 arg3, int arg4) {
        field6140++;
        if (arg0 < 7) {
            method2495((byte) 111, null);
        }
        int var5 = arg3.field2121;
        int var6 = arg3.field2082;
        if (arg3.field2011 == 0) {
            arg3.field2121 = arg3.field1981;
        } else if (arg3.field2011 == 1) {
            arg3.field2121 = arg2 - arg3.field1981;
        } else if (arg3.field2011 == 2) {
            arg3.field2121 = arg3.field1981 * arg2 >> 14;
        }
        if (arg3.field2098 == 0) {
            arg3.field2082 = arg3.field2037;
        } else if (arg3.field2098 == 1) {
            arg3.field2082 = arg4 - arg3.field2037;
        } else if (arg3.field2098 == 2) {
            arg3.field2082 = arg3.field2037 * arg4 >> 14;
        }
        if (arg3.field2011 == 4) {
            arg3.field2121 = arg3.field2082 * arg3.field2074 / arg3.field2004;
        }
        if (arg3.field2098 == 4) {
            arg3.field2082 = arg3.field2121 * arg3.field2004 / arg3.field2074;
        }
        if (class203.field2973 && (client.method1655(arg3).field7010 != 0 || arg3.field2023 == 0)) {
            if (arg3.field2082 < 5 && arg3.field2121 < 5) {
                arg3.field2121 = 5;
                arg3.field2082 = 5;
            } else {
                if (arg3.field2082 <= 0) {
                    arg3.field2082 = 5;
                }
                if (arg3.field2121 <= 0) {
                    arg3.field2121 = 5;
                }
            }
        }
        if (class219.field3170 == arg3.field1998) {
            class548.field7417 = arg3;
        }
        if (arg1 && arg3.field2036 != null && arg3.field2121 != var5 || arg3.field2082 != var6) {
            class388 var7 = new class388();
            var7.field5443 = arg3;
            var7.field5451 = arg3.field2036;
            class1.field3.method1273(var7, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2495(byte arg0, String arg1) {
        if (class371.field5278 == null) {
            class10.method48(false);
        }
        field6139++;
        String[] var2 = class533.method2945(-19028, arg1, '\n');
        int var3 = 0;
        if (arg0 != 27) {
            return;
        }
        while (var2.length > var3) {
            for (int var4 = class603.field8372; var4 > 0; var4--) {
                class371.field5278[var4] = class371.field5278[var4 - 1];
            }
            class371.field5278[0] = var2[var3];
            if (class371.field5278.length - 1 > class603.field8372) {
                class603.field8372++;
                if (class182.field2680 > 0) {
                    class182.field2680++;
                }
            }
            var3++;
        }
    }
}
