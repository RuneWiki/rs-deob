import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class316 {

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field4953 = 0;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4954 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[[B")
    public static byte[][] field4951;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V", line = 21)
    public static final void method2228() {
        for (int var0 = 0; var0 < class214.field3253; var0++) {
            class44 var1 = class342.field5422[var0];
            class156.method1139(var1);
            class342.field5422[var0] = null;
        }
        class214.field3253 = 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIILhi;)V", line = 35)
    public static final void method2229(int arg0, int arg1, int arg2, int arg3, class323 arg4) {
        class108.method698(-114);
        if (class272.field4317) {
            class239.method1668(arg0, arg2, arg0 + arg4.field5169, arg2 - -arg4.field5174);
        } else {
            class343.method2368(arg0, arg2, arg4.field5169 + arg0, arg4.field5174 + arg2);
        }
        field4955++;
        if (class355.field5641 != 2 && class355.field5641 != 5 && class69.field860 != null) {
            int var5 = (int) class190.field2855 + class132.field1912 & 0x7FF;
            int var6 = 48 - (-(class11.field113.field3767 / 32));
            int var7 = 464 - (class11.field113.field3763 / 32);
            if (class272.field4317) {
                ((class200) class69.field860).method1389(arg0, arg2, arg4.field5169, arg4.field5174, var6, var7, var5, class67.field831 + 256, (class200) arg4.method2249(68, false));
            } else {
                ((class158) class69.field860).method1134(arg0, arg2, arg4.field5169, arg4.field5174, var6, var7, var5, class67.field831 + 256, arg4.field5175, arg4.field5093);
            }
            if (class117.field1639 != null) {
                for (int var8 = 0; var8 < class117.field1639.field4701; var8++) {
                    if (class117.field1639.field4697[var8] != null && (class117.field1639.field4693[var8] >> 28) == class219.field3290) {
                        int var9 = ((class117.field1639.field4693[var8] & 0xFFFF314) >> 14) - class322.field4999;
                        int var10 = (class117.field1639.field4693[var8] & 0x3FFF) - class16.field160;
                        if (var9 >= 0 && var9 < 104 && var10 >= 0 && var10 < 104) {
                            int var11 = var10 * 4 + 2 - (class11.field113.field3763 / 32);
                            int var12 = var9 * 4 + 2 - class11.field113.field3767 / 32;
                            class205.method1435(var11, arg4, arg3 + 8366, var12, class117.field1639.field4697[var8].field2735, arg2, arg0);
                        }
                    }
                }
            }
            for (int var13 = 0; var13 < class52.field604; var13++) {
                int var14 = class261.field4131[var13] * 4 + 2 - (class11.field113.field3763 / 32);
                int var15 = class353.field5624[var13] * 4 + 2 - (class11.field113.field3767 / 32);
                class234 var16 = class123.method795(0, class86.field1138[var13]);
                if (var16.field3588 != null) {
                    var16 = var16.method1624(true);
                    if (var16 == null || var16.field3547 == -1) {
                        continue;
                    }
                }
                class205.method1435(var14, arg4, 8370, var15, var16.field3547, arg2, arg0);
            }
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class257 var19 = class345.field5472[class219.field3290][var17][var18];
                    if (var19 != null) {
                        int var20 = var17 * 4 + 2 - (class11.field113.field3767 / 32);
                        int var21 = var18 * 4 + 2 - (class11.field113.field3763 / 32);
                        class105.method683(arg2, arg0, arg4, var21, class213.field3238[0], -91, var20);
                    }
                }
            }
            for (int var22 = 0; var22 < class296.field4667; var22++) {
                class231 var23 = class251.field3974[class225.field3392[var22]];
                if (var23 != null && var23.method414((byte) -62)) {
                    class140 var24 = var23.field3503;
                    if (var24 != null && var24.field2101 != null) {
                        var24 = var24.method961(-127);
                    }
                    if (var24 != null && var24.field2108 && var24.field2144) {
                        int var25 = var23.field3767 / 32 - (class11.field113.field3767 / 32);
                        int var26 = var23.field3763 / 32 - (class11.field113.field3763 / 32);
                        if (var24.field2103 == -1) {
                            class105.method683(arg2, arg0, arg4, var26, class213.field3238[1], arg3 ^ 0xFFFFFFC3, var25);
                        } else {
                            class205.method1435(var26, arg4, arg3 + 8366, var25, var24.field2103, arg2, arg0);
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < class302.field4704; var27++) {
                class67 var28 = class105.field1443[class80.field1067[var27]];
                if (var28 != null && var28.method414((byte) -121)) {
                    int var29 = var28.field3767 / 32 - (class11.field113.field3767 / 32);
                    int var30 = var28.field3763 / 32 - class11.field113.field3763 / 32;
                    boolean var31 = false;
                    long var32 = class294.method2093((byte) 100, var28.field848);
                    for (int var34 = 0; var34 < class95.field1313; var34++) {
                        if (class229.field3477[var34] == var32 && class210.field3167[var34] != 0) {
                            var31 = true;
                            break;
                        }
                    }
                    boolean var35 = false;
                    for (int var36 = 0; var36 < class41.field454; var36++) {
                        if (class77.field1008[var36].field2834 == var32) {
                            var35 = true;
                            break;
                        }
                    }
                    boolean var37 = false;
                    if (class11.field113.field836 != 0 && var28.field836 != 0 && class11.field113.field836 == var28.field836) {
                        var37 = true;
                    }
                    if (var31) {
                        class105.method683(arg2, arg0, arg4, var30, class213.field3238[3], -45, var29);
                    } else if (var35) {
                        class105.method683(arg2, arg0, arg4, var30, class213.field3238[5], arg3 ^ 0xFFFFFFBB, var29);
                    } else if (var37) {
                        class105.method683(arg2, arg0, arg4, var30, class213.field3238[4], -86, var29);
                    } else {
                        class105.method683(arg2, arg0, arg4, var30, class213.field3238[2], arg3 ^ 0x67, var29);
                    }
                }
            }
            class89[] var38 = class106.field1471;
            for (int var39 = 0; var39 < var38.length; var39++) {
                class89 var40 = var38[var39];
                if (var40 != null && var40.field1170 != 0 && class102.field1381 % 20 < 10) {
                    if (var40.field1170 == 1 && var40.field1174 >= 0 && var40.field1174 < class251.field3974.length) {
                        class231 var41 = class251.field3974[var40.field1174];
                        if (var41 != null) {
                            int var42 = var41.field3763 / 32 - (class11.field113.field3763 / 32);
                            int var43 = var41.field3767 / 32 - (class11.field113.field3767 / 32);
                            class238.method1651(arg2, var42, arg4, arg0, (byte) 94, var40.field1182, var43, 360000);
                        }
                    }
                    if (var40.field1170 == 2) {
                        int var44 = (var40.field1175 - class322.field4999) * 4 + 2 - (class11.field113.field3767 / 32);
                        int var45 = (var40.field1169 - class16.field160) * 4 + 2 - (class11.field113.field3763 / 32);
                        int var46 = var40.field1176 * 4;
                        int var47 = var46 * var46;
                        class238.method1651(arg2, var45, arg4, arg0, (byte) 85, var40.field1182, var44, var47);
                    }
                    if (var40.field1170 == 10 && var40.field1174 >= 0 && var40.field1174 < class105.field1443.length) {
                        class67 var48 = class105.field1443[var40.field1174];
                        if (var48 != null) {
                            int var49 = var48.field3763 / 32 - (class11.field113.field3763 / 32);
                            int var50 = var48.field3767 / 32 - (class11.field113.field3767 / 32);
                            class238.method1651(arg2, var49, arg4, arg0, (byte) 114, var40.field1182, var50, 360000);
                        }
                    }
                }
            }
            if (class309.field4795 != 0) {
                int var51 = (class309.field4795 * 4 + ((class11.field113.method412((byte) 112) + -1) * 2) + 2) - (class11.field113.field3767 / 32);
                int var52 = class5.field57 * 4 + 2 - (class11.field113.field3763 / 32 - class11.field113.method412((byte) 96) * 2) - 2;
                class105.method683(arg2, arg0, arg4, var52, class256.field4057[class237.field3650 ? 1 : 0], 93, var51);
            }
            if (class272.field4317) {
                class239.method1659(arg4.field5169 / 2 + arg0 - 1, arg4.field5174 / 2 + arg2 + -1, 3, 3, 16777215);
            } else {
                class343.method2352(arg0 - (1 - (arg4.field5169 / 2)), arg4.field5174 / 2 + -1 + arg2, 3, 3, 16777215);
            }
        } else if (class272.field4317) {
            class2 var53 = arg4.method2249(-53, false);
            if (var53 != null) {
                var53.method11(arg0, arg2);
            }
        } else {
            class343.method2354(arg0, arg2, 0, arg4.field5175, arg4.field5093);
        }
        class135.field2012[arg1] = true;
        if (arg3 != 4) {
            field4951 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 345)
    public static void method2230(int arg0) {
        field4951 = (byte[][]) null;
        field4954 = null;
        if (arg0 < 104) {
            method2230(24);
        }
    }
}
