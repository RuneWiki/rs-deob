import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class519 extends class435 {

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Z")
    public boolean field7652 = false;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public int field7646 = -1;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "Lcb;")
    public static class363 field7654 = new class363(8);

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "F")
    public static float field7649;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public int field7645;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public int field7647;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public int field7648;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public int field7650;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public int field7651;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lza;Ljk;III)V", line = 8)
    public static final void method3101(class287 arg0, class450 arg1, int arg2, int arg3, int arg4) {
        field7653++;
        class144 var5 = arg1.method2787(arg0, (byte) 90);
        if (var5 == null) {
            return;
        }
        if (arg2 != 5) {
            method3102(107, null, null, -108);
        }
        arg0.method1182(arg3, arg4, arg3 + arg1.field6612, arg1.field6573 + arg4);
        if (class111.field1481 == 2 || class111.field1481 == 5 || class6.field75 == null) {
            arg0.method1220(-16777216, var5, arg3, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class47.field491 == 4) {
            var8 = 4096;
            var6 = (int) (-class143.field1907) & 0x3FFF;
            var9 = class200.field2665;
            var7 = class299.field3936;
        } else {
            var6 = (int) (-class143.field1907) + class299.field3928 & 0x3FFF;
            var7 = class96.field1170.field3694;
            var8 = 4096 - class420.field6099 * 16;
            var9 = class96.field1170.field3704;
        }
        int var10 = var9 / 32 + 48 - (class308.field4128 + -104) * 2;
        int var11 = class426.field6200 * 4 + 48 + 208 - (var7 / 32) - (class426.field6200 * 2);
        class6.field75.method148((float) arg1.field6612 / 2.0F + (float) arg3, (float) arg1.field6573 / 2.0F + (float) arg4, (float) var10, (float) var11, var8, var6 << 2, var5, arg3, arg4);
        for (class488 var12 = (class488) class351.field4683.method970(arg2 ^ 0x9); var12 != null; var12 = (class488) class351.field4683.method976((byte) 15)) {
            int var54 = var12.field7162;
            int var55 = (class212.field2884.field5039[var54] >> 14 & 0x3FFF) - class357.field4867;
            int var56 = (class212.field2884.field5039[var54] & 0x3FFF) - class418.field6074;
            int var57 = var55 * 4 + 2 - (var9 / 32);
            int var58 = var56 * 4 + 2 - (var7 / 32);
            class518.method3096(class212.field2884.field5035[var54], arg0, arg1, arg4, arg3, var5, var58, var57, (byte) 124);
        }
        for (int var13 = 0; var13 < class175.field2258; var13++) {
            int var51 = class190.field2456[var13] * 4 + 2 - (var9 / 32);
            int var52 = class374.field5077[var13] * 4 + 2 - (var7 / 32);
            class70 var53 = class123.field1593.method2920(class447.field6512[var13], 19219);
            if (var53.field848 != null) {
                var53 = var53.method403(-1, class52.field606);
                if (var53 == null || var53.field862 == -1) {
                    continue;
                }
            }
            class518.method3096(var53.field862, arg0, arg1, arg4, arg3, var5, var52, var51, (byte) 66);
        }
        for (class166 var14 = (class166) class243.field3208.method300((byte) -102); var14 != null; var14 = (class166) class243.field3208.method301(-117)) {
            int var48 = (int) (var14.field6348 >> 28 & 0x3L);
            if (class102.field1392 == var48) {
                int var49 = (int) (var14.field6348 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                int var50 = (int) (var14.field6348 >> 14 & 0x3FFFL) * 4 + 2 - (var7 / 32);
                class522.method3111(arg3, var5, arg4, var50, arg1, var49, class377.field5277[0], (byte) 39);
            }
        }
        for (int var15 = 0; var15 < class401.field5813; var15++) {
            class22 var44 = class339.field4484[class337.field4465[var15]];
            if (var44 != null && var44.method128((byte) -65) && class96.field1170.field3695 == var44.field3695) {
                class212 var45 = var44.field220;
                if (var45 != null && var45.field2903 != null) {
                    var45 = var45.method1350(class52.field606, -1);
                }
                if (var45 != null && var45.field2875 && var45.field2847) {
                    int var46 = var44.field3704 / 32 - var9 / 32;
                    int var47 = var44.field3694 / 32 - (var7 / 32);
                    if (var45.field2895 == -1) {
                        class522.method3111(arg3, var5, arg4, var47, arg1, var46, class377.field5277[1], (byte) 39);
                    } else {
                        class518.method3096(var45.field2895, arg0, arg1, arg4, arg3, var5, var47, var46, (byte) 114);
                    }
                }
            }
        }
        int var16 = class461.field6877;
        int[] var17 = class342.field4589;
        for (int var18 = 0; var18 < var16; var18++) {
            class531 var36 = class29.field272[var17[var18]];
            if (var36 != null && var36.method3153((byte) -65) && class96.field1170 != var36 && class96.field1170.field3695 == var36.field3695) {
                int var37 = var36.field3704 / 32 - (var9 / 32);
                int var38 = var36.field3694 / 32 - (var7 / 32);
                boolean var39 = false;
                for (int var40 = 0; var40 < class85.field1014; var40++) {
                    if (var36.field7783.equals(class52.field611[var40]) && class91.field1090[var40] != 0) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                for (int var42 = 0; var42 < class198.field2557; var42++) {
                    if (var36.field7783.equals(class54.field623[var42].field6796)) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                if (class96.field1170.field7808 != 0 && var36.field7808 != 0 && class96.field1170.field7808 == var36.field7808) {
                    var43 = true;
                }
                if (var36.field7803) {
                    class522.method3111(arg3, var5, arg4, var38, arg1, var37, class377.field5277[6], (byte) 39);
                } else if (var39) {
                    class522.method3111(arg3, var5, arg4, var38, arg1, var37, class377.field5277[3], (byte) 39);
                } else if (var41) {
                    class522.method3111(arg3, var5, arg4, var38, arg1, var37, class377.field5277[5], (byte) 39);
                } else if (var43) {
                    class522.method3111(arg3, var5, arg4, var38, arg1, var37, class377.field5277[4], (byte) 39);
                } else {
                    class522.method3111(arg3, var5, arg4, var38, arg1, var37, class377.field5277[2], (byte) 39);
                }
            }
        }
        class523[] var19 = class497.field7241;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class523 var23 = var19[var20];
            if (var23 != null && var23.field7698 != 0 && (class532.field7836 % 20) < 10) {
                if (var23.field7698 == 1 && var23.field7691 >= 0 && var23.field7691 < class339.field4484.length) {
                    class22 var24 = class339.field4484[var23.field7691];
                    if (var24 != null) {
                        int var25 = var24.field3704 / 32 - var9 / 32;
                        int var26 = var24.field3694 / 32 - (var7 / 32);
                        class252.method1564(360000L, var23.field7689, arg4, var5, arg1, arg3, var26, var25, arg2 ^ 0x75);
                    }
                }
                if (var23.field7698 == 2) {
                    int var27 = var23.field7692 / 32 - (var9 / 32);
                    int var28 = var23.field7687 / 32 - (var7 / 32);
                    long var29 = (long) (var23.field7699 << 5);
                    long var31 = var29 * var29;
                    class252.method1564(var31, var23.field7689, arg4, var5, arg1, arg3, var28, var27, 63);
                }
                if (var23.field7698 == 10 && var23.field7691 >= 0 && var23.field7691 < class29.field272.length) {
                    class531 var33 = class29.field272[var23.field7691];
                    if (var33 != null) {
                        int var34 = var33.field3704 / 32 - (var9 / 32);
                        int var35 = var33.field3694 / 32 - (var7 / 32);
                        class252.method1564(360000L, var23.field7689, arg4, var5, arg1, arg3, var35, var34, 87);
                    }
                }
            }
        }
        if (class47.field491 == 4) {
            return;
        }
        if (class234.field3122 != 0) {
            int var21 = class234.field3122 * 4 + 2 - (var9 / 32 + -((class96.field1170.method546(24273) - 1) * 2));
            int var22 = class417.field6028 * 4 + class96.field1170.method546(24273) * 2 + 2 - (var7 / 32) - 2;
            class522.method3111(arg3, var5, arg4, var22, arg1, var21, class29.field286[class20.field180 ? 1 : 0], (byte) 39);
        }
        arg0.method1717(3, arg1.field6612 / 2 + arg3 - 1, 3, -1, arg2 - 22799, arg4 + -1 - -(arg1.field6573 / 2));
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 309)
    public static final void method3102(int arg0, String arg1, String arg2, int arg3) {
        class47.field493 = arg0;
        if (arg3 != -211) {
            field7649 = -2.3012886F;
        }
        field7655++;
        class48.field505 = 2;
        class481.method2942(-3, arg1, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 322)
    public static void method3103(byte arg0) {
        field7654 = null;
        if (arg0 >= -121) {
            field7654 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I)V", line = 344)
    public class519(int arg0) {
        this.field7646 = arg0;
    }
}
