import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class67 extends class24 {

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field878 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Luf;")
    public static class168 field879 = class148.method1019(-1720, "Standort");

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field890 = -1;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field888 = 1;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Luf;")
    public static class168 field887 = class148.method1019(-1720, "<col=00ffff>");

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[[B")
    public static byte[][] field881 = new byte[50][];

    @OriginalMember(owner = "client!af", name = "D", descriptor = "Luf;")
    public static class168 field893 = class148.method1019(-1720, "scrollbar");

    @OriginalMember(owner = "client!af", name = "u", descriptor = "[I")
    public static int[] field884 = new int[128];

    @OriginalMember(owner = "client!af", name = "B", descriptor = "B")
    public byte field891;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Luf;")
    public class168 field886;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Luf;")
    public class168 field889;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIBIIIIII)V", line = 13)
    public static final void method376(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg7 && arg0 == arg8 && arg2 == arg6 && arg1 == arg9) {
            class244.method1684(arg4, arg1, arg7, arg2, -9045, arg0);
        } else {
            int var10 = arg7;
            int var11 = arg0;
            int var12 = arg7 * 3;
            int var13 = arg0 * 3;
            int var14 = arg5 * 3;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg8 * 3;
            int var18 = arg2 + var14 - var15 - arg7;
            int var19 = var17 + arg1 - arg0 - var16;
            int var20 = var12 + var15 - var14 - var14;
            int var21 = var14 - var12;
            int var22 = var13 + var16 - var17 - var17;
            int var23 = var17 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var22 * var25;
                int var31 = var21 * var24;
                int var32 = arg7 + (var27 + var29 + var31 >> 12);
                int var33 = var23 * var24;
                int var34 = (var28 + var30 + var33 >> 12) + arg0;
                class244.method1684(arg4, var34, var10, var32, -9045, var11);
                var11 = var34;
                var10 = var32;
            }
        }
        int var35 = 15 % ((63 - arg3) / 54);
        field877++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V", line = 87)
    public static void method377(boolean arg0) {
        field881 = (byte[][]) null;
        if (!arg0) {
            method377(true);
        }
        field887 = null;
        field893 = null;
        field879 = null;
        field884 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLwh;I)V", line = 101)
    public static final void method378(boolean arg0, class240 arg1, int arg2) {
        field885++;
        int var3 = arg1.field3898;
        int var4 = (int) arg1.field292;
        arg1.method124((byte) 86);
        if (arg0) {
            class31.method153(var3, arg2 ^ 0xFFFFFF8F);
        }
        class241.method1654((byte) 41, var3);
        class242 var5 = class130.method910((byte) -101, var4);
        if (var5 != null) {
            client.method2011((byte) -59, var5);
        }
        class121.field1888 = false;
        class22.field275 = 0;
        class127.method901(class20.field242, (byte) 112, class110.field1727, class131.field2031, class79.field1124);
        if (~class19.field221 != arg2) {
            class28.method149(class19.field221, 1, true);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ldk;ZLdk;Ldk;Lbd;)Z", line = 132)
    public static final boolean method379(class241 arg0, boolean arg1, class241 arg2, class241 arg3, class82 arg4) {
        class153.field2364 = arg2;
        class253.field4326 = arg0;
        if (!arg1) {
            field881 = (byte[][]) ((byte[][]) null);
        }
        class284.field4813 = arg3;
        field882++;
        class92.field1414 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ldk;Ldk;IBI)Lw;", line = 156)
    public static final class37 method380(class241 arg0, class241 arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -53) {
            method380((class241) null, (class241) null, 3, (byte) 81, -46);
        }
        field883++;
        return class28.method148(arg4, arg1, arg2, -38) ? class52.method288(102, arg0.method1647(arg4, (byte) 123, arg2)) : null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I", line = 206)
    public static final int method381(int arg0, int arg1) {
        int var2 = arg1 & 0x3F;
        field880++;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg0 < 82 ? -23 : 0;
    }
}
