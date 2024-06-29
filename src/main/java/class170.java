import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class170 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Z")
    public static boolean field2979 = false;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lpj;")
    public static class237 field2985 = class33.method353("Verbindung abgebrochen)3", 22);

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lpj;")
    public static class237 field2978 = class33.method353(":", 102);

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field2986 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lfa;")
    public static class239 field2981;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2982;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1176(byte arg0) {
        field2981 = null;
        field2978 = null;
        field2985 = null;
        if (arg0 != -74) {
            field2982 = null;
        }
        field2982 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILhi;Z)V")
    public static final void method1177(int arg0, int arg1, class210 arg2, boolean arg3) {
        if (arg3) {
            return;
        }
        field2983++;
        if (arg2.field3722 == arg1 && arg1 != -1) {
            class256 var4 = class256.method1732(arg1, true);
            int var5 = var4.field4388;
            if (var5 == 1) {
                arg2.field3688 = arg0;
                arg2.field3737 = 0;
                arg2.field3673 = 0;
                arg2.field3684 = 0;
                class95.method706(arg2.field3700, false, arg2.field3673, (byte) 112, arg2.field3710, var4);
            }
            if (var5 == 2) {
                arg2.field3737 = 0;
            }
        } else if (arg1 == -1 || arg2.field3722 == -1 || class256.method1732(arg1, true).field4405 >= class256.method1732(arg2.field3722, true).field4405) {
            arg2.field3673 = 0;
            arg2.field3737 = 0;
            arg2.field3684 = 0;
            arg2.field3722 = arg1;
            arg2.field3688 = arg0;
            arg2.field3703 = arg2.field3740;
            if (arg2.field3722 == -1) {
                return;
            }
            class95.method706(arg2.field3700, false, arg2.field3673, (byte) 127, arg2.field3710, class256.method1732(arg2.field3722, true));
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
    public static final void method1178(byte arg0) {
        class63.field1261++;
        class223.field3830.method368(-122, 218);
        int var1 = -2 % ((-arg0 - 80) / 33);
        class223.field3830.method350((byte) 19, class8.field160);
        field2989++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method1179(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2984++;
        if (arg6 == arg8 && arg4 == arg9 && arg0 == arg7 && arg2 == arg3) {
            class26.method239(arg7, arg6, arg3, arg5, -23175, arg4);
        } else {
            int var10 = arg6;
            int var11 = arg6 * 3;
            int var12 = arg4;
            int var13 = arg4 * 3;
            int var14 = arg8 * 3;
            int var15 = arg0 * 3;
            int var16 = arg2 * 3;
            int var17 = arg9 * 3;
            int var18 = arg7 + var14 - arg6 - var15;
            int var19 = arg3 + var17 - var16 - arg4;
            int var20 = var15 + var11 - var14 - var14;
            int var21 = var16 + var13 - var17 - var17;
            int var22 = var14 - var11;
            int var23 = var17 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var20 * var25;
                int var27 = var21 * var25;
                int var28 = var22 * var24;
                int var29 = var24 * var25 >> 12;
                int var30 = var18 * var29;
                int var31 = var19 * var29;
                int var32 = var23 * var24;
                int var33 = (var30 + var26 + var28 >> 12) + arg6;
                int var34 = (var27 + var31 + var32 >> 12) + arg4;
                class26.method239(var33, var10, var34, arg5, -23175, var12);
                var12 = var34;
                var10 = var33;
            }
        }
        if (!arg1) {
            method1178((byte) -93);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V")
    public static final void method1180(boolean arg0, byte arg1) {
        field2990++;
        if (class181.field3173 == arg0) {
            return;
        }
        class181.field3173 = arg0;
        if (arg1 != -64) {
            method1179(-24, true, 76, 22, 97, -1, 96, -125, 8, -84);
        }
        class127.method897(0);
    }
}
