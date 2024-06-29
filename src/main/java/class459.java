import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class459 {

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    private int field6659;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Lqv;")
    public static class316 field6655 = new class316(8, 3);

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "Lci;")
    public static class320 field6656;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BII)Z", line = 7)
    public static final boolean method2725(byte arg0, int arg1, int arg2) {
        int var3 = -123 % ((-arg0 - 22) / 42);
        field6654++;
        return class375.method2293(arg2, (byte) -6, arg1) || class437.method2573(arg2, (byte) -92, arg1);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILtf;ILqa;I)V", line = 18)
    public static final void method2726(int arg0, class198 arg1, int arg2, class167 arg3, int arg4) {
        field6653++;
        class31 var5 = arg1.method1335(arg3, (byte) 57);
        if (var5 == null) {
            return;
        }
        arg3.method345(arg4, arg2, arg1.field3008 + arg4, arg1.field2988 + arg2);
        if (class213.field3219 == 2 || class213.field3219 == 5 || class524.field7654 == null) {
            arg3.method322(-16777216, var5, arg4, arg2);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class294.field4381 == 4) {
                var6 = (int) (-class508.field7354) & 0x3FFF;
                var7 = class385.field5502;
                var9 = 4096;
                var8 = class279.field4147;
            } else {
                var6 = (int) (-class508.field7354) + class78.field1280 & 0x3FFF;
                var7 = class364.field5293.field6961;
                var8 = class364.field5293.field6965;
                var9 = 4096 - (class384.field5495 * 16);
            }
            int var10 = var7 / 32 + 48 - ((class69.field1139 - 104) * 2);
            int var11 = class255.field3763 * 4 + 48 + 208 - (var8 / 32) - (class255.field3763 * 2);
            class524.field7654.method2168((float) arg1.field3008 / 2.0F + (float) arg4, (float) arg1.field2988 / 2.0F + (float) arg2, (float) var10, (float) var11, var9, var6 << 2, var5, arg4, arg2);
            for (class175 var12 = (class175) class13.field142.method863(-1); var12 != null; var12 = (class175) class13.field142.method865(arg0 ^ 0x752F)) {
                int var58 = var12.field2612;
                int var59 = (class136.field2109.field1995[var58] >> 14 & 0x3FFF) - class82.field1315;
                int var60 = (class136.field2109.field1995[var58] & 0x3FFF) - class501.field7240;
                int var61 = var59 * 4 + 2 - var7 / 32;
                int var62 = var60 * 4 + 2 - (var8 / 32);
                class13.method73(arg2, var62, class136.field2109.field1993[var58], arg1, var5, arg3, var61, -124, arg4);
            }
            for (int var13 = 0; var13 < class58.field1051; var13++) {
                int var55 = class80.field1308[var13] * 4 + 2 - (var7 / 32);
                int var56 = class329.field4841[var13] * 4 + 2 - (var8 / 32);
                class261 var57 = class277.field4139.method569((byte) 78, class57.field1017[var13]);
                if (var57.field3926 != null) {
                    var57 = var57.method1679(class84.field1335, 1349439392);
                    if (var57 == null || var57.field3878 == -1) {
                        continue;
                    }
                }
                class13.method73(arg2, var56, var57.field3878, arg1, var5, arg3, var55, -83, arg4);
            }
            for (class203 var14 = (class203) class191.field2787.method2285(arg0 + 30062); var14 != null; var14 = (class203) class191.field2787.method2283((byte) 11)) {
                int var50 = (int) (var14.field863 >> 28 & 0x3L);
                if (class102.field1577 == var50) {
                    int var51 = (int) (var14.field863 & 0x3FFFL) - class82.field1315;
                    int var52 = (int) (var14.field863 >> 14 & 0x3FFFL) - class501.field7240;
                    int var53 = var51 * 4 + 2 - (var7 / 32);
                    int var54 = var52 * 4 - (var8 / 32 - 2);
                    class75.method584(var5, var53, (byte) -122, arg4, var54, arg2, arg1, class279.field4164[0]);
                }
            }
            for (int var15 = 0; var15 < class477.field6952; var15++) {
                class193 var45 = (class193) class390.field5539.method2284(true, (long) class483.field7012[var15]);
                if (var45 != null) {
                    class279 var46 = var45.field2805;
                    if (var46.method1797(arg0 ^ 0x448C) && class364.field5293.field6956 == var46.field6956) {
                        class311 var47 = var46.field4157;
                        if (var47 != null && var47.field4631 != null) {
                            var47 = var47.method1972(class84.field1335, (byte) 120);
                        }
                        if (var47 != null && var47.field4592 && var47.field4576) {
                            int var48 = var46.field6961 / 32 - var7 / 32;
                            int var49 = var46.field6965 / 32 - (var8 / 32);
                            if (var47.field4630 == -1) {
                                class75.method584(var5, var48, (byte) -108, arg4, var49, arg2, arg1, class279.field4164[1]);
                            } else {
                                class13.method73(arg2, var49, var47.field4630, arg1, var5, arg3, var48, arg0 + 29902, arg4);
                            }
                        }
                    }
                }
            }
            int var16 = class452.field6603;
            int[] var17 = class532.field7853;
            for (int var18 = 0; var18 < var16; var18++) {
                class510 var37 = class494.field7143[var17[var18]];
                if (var37 != null && var37.method2968(-12708) && class364.field5293 != var37 && class364.field5293.field6956 == var37.field6956) {
                    int var38 = var37.field6961 / 32 - (var7 / 32);
                    int var39 = var37.field6965 / 32 - (var8 / 32);
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class290.field4314; var41++) {
                        if (var37.field7363.equals(class163.field2463[var41]) && class292.field4344[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class413.field5842; var43++) {
                        if (var37.field7363.equals(class248.field3713[var43].field7039)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class364.field5293.field7398 != 0 && var37.field7398 != 0 && class364.field5293.field7398 == var37.field7398) {
                        var44 = true;
                    }
                    if (var37.field7375) {
                        class75.method584(var5, var38, (byte) -120, arg4, var39, arg2, arg1, class279.field4164[6]);
                    } else if (var40) {
                        class75.method584(var5, var38, (byte) -32, arg4, var39, arg2, arg1, class279.field4164[3]);
                    } else if (var42) {
                        class75.method584(var5, var38, (byte) -114, arg4, var39, arg2, arg1, class279.field4164[5]);
                    } else if (var44) {
                        class75.method584(var5, var38, (byte) -70, arg4, var39, arg2, arg1, class279.field4164[4]);
                    } else {
                        class75.method584(var5, var38, (byte) -97, arg4, var39, arg2, arg1, class279.field4164[2]);
                    }
                }
            }
            class3[] var19 = class356.field5182;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class3 var23 = var19[var20];
                if (var23 != null && var23.field17 != 0 && (class24.field349 % 20) < 10) {
                    if (var23.field17 == 1) {
                        class193 var24 = (class193) class390.field5539.method2284(true, (long) var23.field8);
                        if (var24 != null) {
                            class279 var25 = var24.field2805;
                            int var26 = var25.field6961 / 32 - (var7 / 32);
                            int var27 = var25.field6965 / 32 - (var8 / 32);
                            class539.method3171(arg4, var23.field12, 360000L, var26, 2, arg1, var5, arg2, var27);
                        }
                    }
                    if (var23.field17 == 2) {
                        int var28 = var23.field14 / 32 - (var7 / 32);
                        int var29 = var23.field16 / 32 - (var8 / 32);
                        long var30 = (long) (var23.field6 << 5);
                        long var32 = var30 * var30;
                        class539.method3171(arg4, var23.field12, var32, var28, 2, arg1, var5, arg2, var29);
                    }
                    if (var23.field17 == 10 && var23.field8 >= 0 && var23.field8 < class494.field7143.length) {
                        class510 var34 = class494.field7143[var23.field8];
                        if (var34 != null) {
                            int var35 = var34.field6961 / 32 - (var7 / 32);
                            int var36 = var34.field6965 / 32 - var8 / 32;
                            class539.method3171(arg4, var23.field12, 360000L, var35, 2, arg1, var5, arg2, var36);
                        }
                    }
                }
            }
            if (class294.field4381 != 4) {
                if (class17.field186 != 0) {
                    int var21 = class17.field186 * 4 + (class364.field5293.method135((byte) 72) * 2 - 2) + 2 - (var7 / 32);
                    int var22 = class112.field1651 * 4 + (((class364.field5293.method135((byte) 72) - 1) * 2) + 2 - (var8 / 32));
                    class75.method584(var5, var21, (byte) -111, arg4, var22, arg2, arg1, class197.field2881[class121.field1890 ? 1 : 0]);
                }
                arg3.method1193(1, arg2 + (arg1.field2988 / 2) - 1, arg1.field3008 / 2 + arg4 + -1, 3, 3, -1);
            }
        }
        if (arg0 != -30000) {
            field6656 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "toString", descriptor = "()Ljava/lang/String;", line = 331)
    public final String toString() {
        field6652++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 345)
    public static void method2727(byte arg0) {
        if (arg0 < 67) {
            field6656 = null;
        }
        field6655 = null;
        field6656 = null;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(II)V", line = 356)
    public class459(int arg0, int arg1) {
        this.field6659 = arg0;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)I", line = 366)
    public final int method2728(byte arg0) {
        if (arg0 != 24) {
            method2727((byte) -94);
        }
        field6658++;
        return this.field6659;
    }
}
