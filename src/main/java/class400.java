import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class400 extends class176 {

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field6091 = 0;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Z")
    public static volatile boolean field6095 = false;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field6096 = -1;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "[I")
    public static int[] field6082 = new int[2];

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public int field6083;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public int field6087;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public int field6092;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public int field6093;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public int field6097;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Lqa;")
    public static class165 field6090;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Ljava/lang/String;")
    public String field6089;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ldq;Ll;IIILjava/awt/Canvas;)Lqa;")
    public static final class165 method2473(class500 arg0, class15 arg1, int arg2, int arg3, int arg4, Canvas arg5) {
        if (arg2 == 32) {
            field6084++;
            return new class325(arg3, arg5, arg1, arg4, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIZIZB)V")
    public static final void method2474(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, byte arg6) {
        field6098++;
        if (arg6 != -106) {
            method2475(108, null, null, 38, 98);
        }
        if (arg2 <= arg1) {
            return;
        }
        int var7 = (arg1 + arg2) / 2;
        int var8 = arg1;
        class412 var9 = class4.field22[var7];
        class4.field22[var7] = class4.field22[arg2];
        class4.field22[arg2] = var9;
        for (int var10 = arg1; var10 < arg2; var10++) {
            if (class393.method2448(class4.field22[var10], var9, -1, arg0, arg3, arg4, arg5) <= 0) {
                class412 var11 = class4.field22[var10];
                class4.field22[var10] = class4.field22[var8];
                class4.field22[var8++] = var11;
            }
        }
        class4.field22[arg2] = class4.field22[var8];
        class4.field22[var8] = var9;
        method2474(arg0, arg1, var8 - 1, arg3, arg4, arg5, (byte) -106);
        method2474(arg0, var8 + 1, arg2, arg3, arg4, arg5, (byte) -106);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILga;Lqa;II)V")
    public static final void method2475(int arg0, class282 arg1, class165 arg2, int arg3, int arg4) {
        field6088++;
        class30 var5 = arg1.method1812((byte) 122, arg2);
        if (arg0 != 0) {
            field6091 = 84;
        }
        if (var5 == null) {
            return;
        }
        arg2.method739(arg4, arg3, arg1.field3991 + arg4, arg1.field4043 + arg3);
        if (class207.field2819 == 2 || class207.field2819 == 5 || class430.field6552 == null) {
            arg2.method779(-16777216, var5, arg4, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class340.field5269 == 4) {
            var7 = class21.field320;
            var6 = class62.field883;
            var8 = (int) (-class53.field744) & 0x3FFF;
            var9 = 4096;
        } else {
            var6 = class56.field800.field1867;
            var7 = class56.field800.field1862;
            var8 = (int) (-class53.field744) + class303.field4433 & 0x3FFF;
            var9 = 4096 - (class514.field7549 * 16);
        }
        int var10 = (var6 / 32) + 48 - (class398.field6071 - 104) * 2;
        int var11 = class528.field7734 * 4 + 48 - var7 / 32 - (class528.field7734 - 104) * 2;
        class430.field6552.method2207((float) arg1.field3991 / 2.0F + (float) arg4, (float) arg1.field4043 / 2.0F + (float) arg3, (float) var10, (float) var11, var9, var8 << 2, var5, arg4, arg3);
        for (class160 var12 = (class160) class48.field683.method445(33); var12 != null; var12 = (class160) class48.field683.method451(false)) {
            int var58 = var12.field2088;
            int var59 = ((class401.field6112.field1942[var58] & 0xFFFD6A0) >> 14) - class331.field5162;
            int var60 = (class401.field6112.field1942[var58] & 0x3FFF) - class328.field5099;
            int var61 = var59 * 4 + 2 - (var6 / 32);
            int var62 = var60 * 4 + 2 - var7 / 32;
            class159.method1032(var61, var5, class401.field6112.field1935[var58], arg4, arg1, var62, (byte) -113, arg2, arg3);
        }
        for (int var13 = 0; var13 < class116.field1600; var13++) {
            int var55 = class412.field6265[var13] * 4 + 2 - (var6 / 32);
            int var56 = class390.field5957[var13] * 4 - (var7 / 32 - 2);
            class209 var57 = class432.field6575.method1872(class414.field6320[var13], false);
            if (var57.field2934 != null) {
                var57 = var57.method1435(-1, class288.field4208);
                if (var57 == null || var57.field2945 == -1) {
                    continue;
                }
            }
            class159.method1032(var55, var5, var57.field2945, arg4, arg1, var56, (byte) -120, arg2, arg3);
        }
        for (class247 var14 = (class247) class392.field6005.method1743(false); var14 != null; var14 = (class247) class392.field6005.method1742(arg0 ^ 0x7D)) {
            int var50 = (int) (var14.field35 >> 28 & 0x3L);
            if (class77.field1118 == var50) {
                int var51 = (int) (var14.field35 & 0x3FFFL) - class331.field5162;
                int var52 = (int) (var14.field35 >> 14 & 0x3FFFL) - class328.field5099;
                int var53 = var51 * 4 + 2 - (var6 / 32);
                int var54 = var52 * 4 + 2 - (var7 / 32);
                class429.method2619(var54, arg1, var53, class383.field5827[0], var5, arg4, arg3, -109);
            }
        }
        for (int var15 = 0; var15 < class333.field5187; var15++) {
            class24 var45 = (class24) class406.field6158.method1747((long) class224.field3114[var15], false);
            if (var45 != null) {
                class17 var46 = var45.field348;
                if (var46.method172(22386) && class56.field800.field1866 == var46.field1866) {
                    class258 var47 = var46.field274;
                    if (var47 != null && var47.field3627 != null) {
                        var47 = var47.method1660(class288.field4208, (byte) 74);
                    }
                    if (var47 != null && var47.field3617 && var47.field3596) {
                        int var48 = var46.field1867 / 32 - var6 / 32;
                        int var49 = var46.field1862 / 32 - (var7 / 32);
                        if (var47.field3582 == -1) {
                            class429.method2619(var49, arg1, var48, class383.field5827[1], var5, arg4, arg3, arg0 ^ 0xFFFFFF90);
                        } else {
                            class159.method1032(var48, var5, var47.field3582, arg4, arg1, var49, (byte) -64, arg2, arg3);
                        }
                    }
                }
            }
        }
        int var16 = class20.field310;
        int[] var17 = class55.field778;
        for (int var18 = 0; var18 < var16; var18++) {
            class96 var37 = class241.field3398[var17[var18]];
            if (var37 != null && var37.method634(22386) && class56.field800 != var37 && class56.field800.field1866 == var37.field1866) {
                int var38 = var37.field1867 / 32 - var6 / 32;
                int var39 = var37.field1862 / 32 - (var7 / 32);
                boolean var40 = false;
                for (int var41 = 0; var41 < class454.field6834; var41++) {
                    if (var37.field1393.equals(class466.field6946[var41]) && class241.field3394[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < field6094; var43++) {
                    if (var37.field1393.equals(class5.field41[var43].field7071)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class56.field800.field1396 != 0 && var37.field1396 != 0 && class56.field800.field1396 == var37.field1396) {
                    var44 = true;
                }
                if (var37.field1388) {
                    class429.method2619(var39, arg1, var38, class383.field5827[6], var5, arg4, arg3, -110);
                } else if (var40) {
                    class429.method2619(var39, arg1, var38, class383.field5827[3], var5, arg4, arg3, -112);
                } else if (var42) {
                    class429.method2619(var39, arg1, var38, class383.field5827[5], var5, arg4, arg3, arg0 - 126);
                } else if (var44) {
                    class429.method2619(var39, arg1, var38, class383.field5827[4], var5, arg4, arg3, -116);
                } else {
                    class429.method2619(var39, arg1, var38, class383.field5827[2], var5, arg4, arg3, -126);
                }
            }
        }
        class519[] var19 = class361.field5531;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class519 var23 = var19[var20];
            if (var23 != null && var23.field7630 != 0 && class393.field6017 % 20 < 10) {
                if (var23.field7630 == 1) {
                    class24 var24 = (class24) class406.field6158.method1747((long) var23.field7629, false);
                    if (var24 != null) {
                        class17 var25 = var24.field348;
                        int var26 = var25.field1867 / 32 - (var6 / 32);
                        int var27 = var25.field1862 / 32 - (var7 / 32);
                        class267.method1706(arg0 ^ 0xFFFFFFA4, var23.field7626, var5, arg4, arg3, 360000L, arg1, var26, var27);
                    }
                }
                if (var23.field7630 == 2) {
                    int var28 = var23.field7627 / 32 - (var6 / 32);
                    int var29 = var23.field7634 / 32 - (var7 / 32);
                    long var30 = (long) (var23.field7623 << 5);
                    long var32 = var30 * var30;
                    class267.method1706(-79, var23.field7626, var5, arg4, arg3, var32, arg1, var28, var29);
                }
                if (var23.field7630 == 10 && var23.field7629 >= 0 && var23.field7629 < class241.field3398.length) {
                    class96 var34 = class241.field3398[var23.field7629];
                    if (var34 != null) {
                        int var35 = var34.field1867 / 32 - (var6 / 32);
                        int var36 = var34.field1862 / 32 - (var7 / 32);
                        class267.method1706(83, var23.field7626, var5, arg4, arg3, 360000L, arg1, var35, var36);
                    }
                }
            }
        }
        if (class340.field5269 == 4) {
            return;
        }
        if (class75.field1103 != 0) {
            int var21 = class75.field1103 * 4 + (2 - (-(class56.field800.method637((byte) -7) * 2) + 2)) - (var6 / 32);
            int var22 = class309.field4501 * 4 + (class56.field800.method637((byte) -99) + -1) * 2 + 2 - (var7 / 32);
            class429.method2619(var22, arg1, var21, class116.field1599[class176.field2357 ? 1 : 0], var5, arg4, arg3, -128);
        }
        arg2.method1117(3, arg1.field4043 / 2 + arg3 - 1, -1, arg4 - (1 - (arg1.field3991 / 2)), 3, (byte) 73);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lqw;I)Ljava/lang/String;")
    public static final String method2476(class54 arg0, int arg1) {
        field6086++;
        if (arg1 == 32) {
            return arg0.field752 == null || arg0.field752.length() <= 0 ? arg0.field763 : arg0.field763 + client.field2675.method2705((byte) 69, class257.field3556) + arg0.field752;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method2477(byte arg0) {
        if (arg0 != -31) {
            field6095 = true;
        }
        field6090 = null;
        field6082 = null;
    }
}
