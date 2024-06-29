import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class193 extends class283 {

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field2761;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "[I")
    public static int[] field2758 = new int[1000];

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "Z")
    public static boolean field2760 = true;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "[I")
    public static int[] field2768 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public static int field2766 = 0;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "Z")
    public static boolean field2762 = false;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
    public static int field2774 = -1;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "[I")
    public static int[] field2773 = new int[2];

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "Llc;")
    public static class143 field2775 = null;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "[[[B")
    public static byte[][][] field2759;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method693(byte arg0) {
        if (arg0 != -109) {
            method1236((byte) 112, -78, 60, -22, 109, -88, -44, -16, 63, -68);
        }
        field2772++;
        return this.field2761;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method1236(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2764++;
        if (arg1 == arg2 && arg4 == arg7 && arg3 == arg6 && arg5 == arg9) {
            class129.method893(arg2, arg3, arg7, arg9, (byte) -121, arg8);
        } else {
            int var10 = arg7;
            int var11 = arg2 * 3;
            int var12 = arg2;
            int var13 = arg7 * 3;
            int var14 = arg1 * 3;
            int var15 = arg4 * 3;
            int var16 = arg6 * 3;
            int var17 = arg5 * 3;
            int var18 = arg3 + var14 - var16 - arg2;
            int var19 = var11 + var16 - var14 - var14;
            int var20 = var14 - var11;
            int var21 = var15 - var13;
            int var22 = var13 + var17 - var15 - var15;
            int var23 = arg9 - var17 - (-var15 + arg7);
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var25;
                int var28 = var23 * var26;
                int var29 = var22 * var25;
                int var30 = var18 * var26;
                int var31 = var20 * var24;
                int var32 = var21 * var24;
                int var33 = arg7 + (var28 + var32 + var29 >> 12);
                int var34 = arg2 + (var30 + var31 + var27 >> 12);
                class129.method893(var12, var34, var10, var33, (byte) 60, arg8);
                var12 = var34;
                var10 = var33;
            }
        }
        if (arg0 != -73) {
            method1240((String) null, (byte) -66, -91);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
    public final boolean method694(byte arg0) {
        field2771++;
        return arg0 > -32;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)V")
    public static final void method1237(int arg0, byte arg1, int arg2) {
        field2763++;
        if (arg1 == 59 && class209.field3015 != 0 && arg2 != -1) {
            class159.method1069(class209.field3015, -14698, 0, class211.field3030, arg2, false);
            class200.field2884 = true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V")
    public static void method1238(byte arg0) {
        field2775 = null;
        field2773 = null;
        field2759 = null;
        field2758 = null;
        field2768 = null;
        if (arg0 < 40) {
            field2762 = false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(II)V")
    public static final void method1239(int arg0, int arg1) {
        class138.field1999.method258(arg1, (byte) 85);
        int var2 = -18 % ((arg0 - 63) / 51);
        field2767++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method1240(String arg0, byte arg1, int arg2) {
        field2765++;
        class270 var3 = class190.method1213(25702, arg2, 2);
        var3.method1808((byte) 62);
        var3.field4222 = arg0;
        if (arg1 != -13) {
            field2760 = true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class193(Object arg0) {
        this.field2761 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIZIZIIIII)Z")
    public static final boolean method1241(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2769++;
        if (arg4) {
            return false;
        } else if (class55.field847.method57(0) == 2) {
            return class191.method1226(arg6, arg9, 1644, arg1, arg0, arg2, arg8, arg11, arg5, arg10, arg7, arg3);
        } else if (class55.field847.method57(0) > 2) {
            return class266.method1775(arg6, 25117, arg1, arg3, arg5, class55.field847.method57(0), arg10, arg7, arg9, arg11, arg2, arg0, arg8);
        } else {
            return class134.method911(arg8, arg7, arg6, arg5, arg11, arg0, arg10, arg9, arg2, arg1, 2, arg3);
        }
    }
}
