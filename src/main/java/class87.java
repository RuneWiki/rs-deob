import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class87 extends class268 {

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIII)V", line = 3)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1246 = arg0;
        this.field1241 = arg3;
        this.field1250 = arg2;
        this.field1251 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lvb;Z)V", line = 18)
    public static final void method644(class79 arg0, boolean arg1) {
        class75.field1088.method1952(arg0, -22);
        while (true) {
            class79 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class79[][] var7;
            class79 var78;
            do {
                class79 var77;
                do {
                    class79 var76;
                    do {
                        class79 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class79) class75.field1088.method1944(123);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1177);
                                            var3 = var2.field1173;
                                            var4 = var2.field1168;
                                            var5 = var2.field1174;
                                            var6 = var2.field1172;
                                            var7 = class213.field3262[var5];
                                            float var8 = 0.0F;
                                            if (class73.field1058) {
                                                if (class71.field1024 == class203.field3111) {
                                                    int var9 = class78.field1137[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class268.field4164 != var10) {
                                                        class268.field4164 = var10;
                                                        class332.method2326(var10, 1);
                                                        class179.method1344(class322.method2234(22313));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class64.field893 != var11) {
                                                        class64.field893 = var11;
                                                        class171.method1291(var11, 3);
                                                    }
                                                    int var12 = class79.field1151[0][var3 + 1][var4] + class79.field1151[0][var3][var4] + class79.field1151[0][var3][var4 + 1] + class79.field1151[0][var3 + 1][var4 + 1] >> 2;
                                                    class241.method1672(-var12, -123, 3);
                                                    var8 = 201.5F;
                                                    class73.method522(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class73.method522(var8);
                                                }
                                            }
                                            if (!var2.field1163) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class79 var13 = class213.field3262[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field1177) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class237.field3609 && var3 > class162.field2629) {
                                                    class79 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field1177 && (var14.field1163 || (var2.field1162 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class237.field3609 && var3 < class30.field361 - 1) {
                                                    class79 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field1177 && (var15.field1163 || (var2.field1162 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class193.field3014 && var4 > class75.field1087) {
                                                    class79 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field1177 && (var16.field1163 || (var2.field1162 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class193.field3014 && var4 < class29.field345 - 1) {
                                                    class79 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field1177 && (var17.field1163 || (var2.field1162 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1163 = false;
                                            if (var2.field1176 != null) {
                                                class79 var18 = var2.field1176;
                                                if (class73.field1058) {
                                                    class73.method522(201.5F - (float) (var18.field1172 + 1) * 50.0F);
                                                }
                                                if (var18.field1156 == null) {
                                                    if (var18.field1158 != null) {
                                                        if (class257.method1812(0, var3, var4)) {
                                                            class302.method2076(var18.field1158, class28.field340, class157.field2384, class75.field1090, class176.field2819, var3, var4, true);
                                                        } else {
                                                            class302.method2076(var18.field1158, class28.field340, class157.field2384, class75.field1090, class176.field2819, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class257.method1812(0, var3, var4)) {
                                                    class63.method430(var18.field1156, 0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var3, var4, true);
                                                } else {
                                                    class63.method430(var18.field1156, 0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var3, var4, false);
                                                }
                                                class35 var19 = var18.field1161;
                                                if (var19 != null) {
                                                    if (class73.field1058) {
                                                        if ((var19.field503 & var2.field1160) == 0) {
                                                            class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                        } else {
                                                            class315.method2163(var19.field503, class336.field5227, class295.field4557, class262.field4035, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field511.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var19.field506 - class336.field5227, var19.field502 - class295.field4557, var19.field516 - class262.field4035, var19.field512, var5, (class249) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field1169; var20++) {
                                                    class228 var21 = var18.field1157[var20];
                                                    if (var21 != null) {
                                                        if (class73.field1058) {
                                                            class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                        }
                                                        var21.field3480.method576(var21.field3476, class28.field340, class157.field2384, class75.field1090, class176.field2819, var21.field3483 - class336.field5227, var21.field3485 - class295.field4557, var21.field3477 - class262.field4035, var21.field3482, var5, (class249) null);
                                                    }
                                                }
                                                if (class73.field1058) {
                                                    class73.method522(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field1156 == null) {
                                                if (var2.field1158 != null) {
                                                    if (class257.method1812(var6, var3, var4)) {
                                                        class302.method2076(var2.field1158, class28.field340, class157.field2384, class75.field1090, class176.field2819, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class302.method2076(var2.field1158, class28.field340, class157.field2384, class75.field1090, class176.field2819, var3, var4, false);
                                                    }
                                                }
                                            } else if (class257.method1812(var6, var3, var4)) {
                                                class63.method430(var2.field1156, var6, class28.field340, class157.field2384, class75.field1090, class176.field2819, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field1156.field2054 != 12345678 || class95.field1368 && var5 <= class168.field2724) {
                                                    class63.method430(var2.field1156, var6, class28.field340, class157.field2384, class75.field1090, class176.field2819, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class341 var23 = var2.field1179;
                                                if (var23 != null && (var23.field5292 & 0x80000000L) != 0L) {
                                                    if (class73.field1058 && var23.field5291) {
                                                        class73.method522(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class73.field1058) {
                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                    }
                                                    var23.field5305.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var23.field5304 - class336.field5227, var23.field5295 - class295.field4557, var23.field5302 - class262.field4035, var23.field5292, var5, (class249) null);
                                                    if (class73.field1058 && var23.field5291) {
                                                        class73.method522(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class35 var26 = var2.field1161;
                                            class158 var27 = var2.field1175;
                                            if (var26 != null || var27 != null) {
                                                if (class237.field3609 == var3) {
                                                    var24++;
                                                } else if (class237.field3609 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class193.field3014 == var4) {
                                                    var24 += 3;
                                                } else if (class193.field3014 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class78.field1146[var24];
                                                var2.field1160 = class319.field4930[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field503 & class281.field4368[var24]) == 0) {
                                                    var2.field1165 = 0;
                                                } else if (var26.field503 == 16) {
                                                    var2.field1165 = 3;
                                                    var2.field1171 = class335.field5210[var24];
                                                    var2.field1167 = 3 - var2.field1171;
                                                } else if (var26.field503 == 32) {
                                                    var2.field1165 = 6;
                                                    var2.field1171 = class32.field421[var24];
                                                    var2.field1167 = 6 - var2.field1171;
                                                } else if (var26.field503 == 64) {
                                                    var2.field1165 = 12;
                                                    var2.field1171 = class108.field1642[var24];
                                                    var2.field1167 = 12 - var2.field1171;
                                                } else {
                                                    var2.field1165 = 9;
                                                    var2.field1171 = class101.field1466[var24];
                                                    var2.field1167 = 9 - var2.field1171;
                                                }
                                                if ((var26.field503 & var25) != 0 && !class154.method1159(var6, var3, var4, var26.field503)) {
                                                    if (class73.field1058) {
                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                    }
                                                    var26.field511.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var26.field506 - class336.field5227, var26.field502 - class295.field4557, var26.field516 - class262.field4035, var26.field512, var5, (class249) null);
                                                }
                                                if ((var26.field513 & var25) != 0 && !class154.method1159(var6, var3, var4, var26.field513)) {
                                                    if (class73.field1058) {
                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                    }
                                                    var26.field508.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var26.field506 - class336.field5227, var26.field502 - class295.field4557, var26.field516 - class262.field4035, var26.field512, var5, (class249) null);
                                                }
                                            }
                                            if (var27 != null && !class165.method1253(var6, var3, var4, var27.field2402.method565())) {
                                                if (class73.field1058) {
                                                    class73.method522(var8 - 0.5F);
                                                }
                                                if ((var27.field2407 & var25) != 0) {
                                                    if (class73.field1058) {
                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                    }
                                                    var27.field2402.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var27.field2394 + var27.field2401 - class336.field5227, var27.field2410 - class295.field4557, var27.field2409 + var27.field2396 - class262.field4035, var27.field2400, var5, (class249) null);
                                                } else if (var27.field2407 == 256) {
                                                    int var28 = var27.field2394 - class336.field5227;
                                                    int var29 = var27.field2410 - class295.field4557;
                                                    int var30 = var27.field2409 - class262.field4035;
                                                    int var31 = var27.field2406;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class73.field1058) {
                                                            class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                        }
                                                        var27.field2402.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var27.field2401 + var28, var29, var27.field2396 + var30, var27.field2400, var5, (class249) null);
                                                    } else if (var27.field2398 != null) {
                                                        if (class73.field1058) {
                                                            class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                        }
                                                        var27.field2398.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var28, var29, var30, var27.field2400, var5, (class249) null);
                                                    }
                                                }
                                                if (class73.field1058) {
                                                    class73.method522(var8);
                                                }
                                            }
                                            if (var22) {
                                                class341 var34 = var2.field1179;
                                                if (var34 != null && (var34.field5292 & 0x80000000L) == 0L) {
                                                    if (class73.field1058 && var34.field5291) {
                                                        class73.method522(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class73.field1058) {
                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                    }
                                                    var34.field5305.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var34.field5304 - class336.field5227, var34.field5295 - class295.field4557, var34.field5302 - class262.field4035, var34.field5292, var5, (class249) null);
                                                    if (class73.field1058 && var34.field5291) {
                                                        class73.method522(var8);
                                                    }
                                                }
                                                class91 var35 = var2.field1154;
                                                if (var35 != null && var35.field1320 == 0) {
                                                    if (class73.field1058) {
                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                    }
                                                    if (var35.field1322 != null) {
                                                        var35.field1322.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var35.field1324 - class336.field5227, var35.field1317 - class295.field4557, var35.field1316 - class262.field4035, var35.field1318, var5, (class249) null);
                                                    }
                                                    if (var35.field1315 != null) {
                                                        var35.field1315.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var35.field1324 - class336.field5227, var35.field1317 - class295.field4557, var35.field1316 - class262.field4035, var35.field1318, var5, (class249) null);
                                                    }
                                                    if (var35.field1319 != null) {
                                                        var35.field1319.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var35.field1324 - class336.field5227, var35.field1317 - class295.field4557, var35.field1316 - class262.field4035, var35.field1318, var5, (class249) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field1162;
                                            if (var36 != 0) {
                                                if (var3 < class237.field3609 && (var36 & 0x4) != 0) {
                                                    class79 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field1177) {
                                                        class75.field1088.method1952(var37, 120);
                                                    }
                                                }
                                                if (var4 < class193.field3014 && (var36 & 0x2) != 0) {
                                                    class79 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field1177) {
                                                        class75.field1088.method1952(var38, -123);
                                                    }
                                                }
                                                if (var3 > class237.field3609 && (var36 & 0x1) != 0) {
                                                    class79 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field1177) {
                                                        class75.field1088.method1952(var39, 120);
                                                    }
                                                }
                                                if (var4 > class193.field3014 && (var36 & 0x8) != 0) {
                                                    class79 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field1177) {
                                                        class75.field1088.method1952(var40, 44);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1165 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field1169; var42++) {
                                                if (class318.field4916 != var2.field1157[var42].field3478 && (var2.field1180[var42] & var2.field1165) == var2.field1171) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class35 var43 = var2.field1161;
                                                if (!class154.method1159(var6, var3, var4, var43.field503)) {
                                                    if (class73.field1058) {
                                                        label882: {
                                                            if ((var43.field512 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field506 - class336.field5227;
                                                                int var45 = var43.field516 - class262.field4035;
                                                                int var46 = (int) (var43.field512 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class115.field1818 - 1) {
                                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class75.field1091 - 1 && var4 < class115.field1818 - 1) {
                                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class75.field1091 - 1 && var4 > 0) {
                                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field511.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var43.field506 - class336.field5227, var43.field502 - class295.field4557, var43.field516 - class262.field4035, var43.field512, var5, (class249) null);
                                                }
                                                var2.field1165 = 0;
                                            }
                                        }
                                        if (!var2.field1153) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field1169;
                                            var2.field1153 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class228 var50 = var2.field1157[var49];
                                                if (class318.field4916 != var50.field3478) {
                                                    for (int var51 = var50.field3472; var51 <= var50.field3474; var51++) {
                                                        for (int var52 = var50.field3475; var52 <= var50.field3484; var52++) {
                                                            class79 var53 = var7[var51][var52];
                                                            if (var53.field1163) {
                                                                var2.field1153 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field1165 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field3472) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field3474) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field3475) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field3484) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field1165) == var2.field1167) {
                                                                    var2.field1153 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class146.field2226[var48++] = var50;
                                                    int var55 = class237.field3609 - var50.field3472;
                                                    int var56 = var50.field3474 - class237.field3609;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class193.field3014 - var50.field3475;
                                                    int var58 = var50.field3484 - class193.field3014;
                                                    if (var58 > var57) {
                                                        var50.field3473 = var55 + var58;
                                                    } else {
                                                        var50.field3473 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class228 var62 = class146.field2226[var61];
                                                    if (class318.field4916 != var62.field3478) {
                                                        if (var62.field3473 > var59) {
                                                            var59 = var62.field3473;
                                                            var60 = var61;
                                                        } else if (var62.field3473 == var59) {
                                                            int var63 = var62.field3483 - class336.field5227;
                                                            int var64 = var62.field3477 - class262.field4035;
                                                            int var65 = class146.field2226[var60].field3483 - class336.field5227;
                                                            int var66 = class146.field2226[var60].field3477 - class262.field4035;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class228 var67 = class146.field2226[var60];
                                                var67.field3478 = class318.field4916;
                                                if (!class132.method1021(var6, var67.field3472, var67.field3474, var67.field3475, var67.field3484, var67.field3480.method565())) {
                                                    if (class73.field1058) {
                                                        if ((var67.field3482 & 0xFC000L) == 147456L) {
                                                            class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                                                            int var68 = var67.field3483 - class336.field5227;
                                                            int var69 = var67.field3477 - class262.field4035;
                                                            int var70 = (int) (var67.field3482 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class315.method2160(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class315.method2160(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class315.method2160(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class315.method2160(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class315.method2162(class336.field5227, class295.field4557, class262.field4035, var5, var67.field3472, var67.field3475, var67.field3474, var67.field3484);
                                                        }
                                                    }
                                                    var67.field3480.method576(var67.field3476, class28.field340, class157.field2384, class75.field1090, class176.field2819, var67.field3483 - class336.field5227, var67.field3485 - class295.field4557, var67.field3477 - class262.field4035, var67.field3482, var5, (class249) null);
                                                }
                                                for (int var71 = var67.field3472; var71 <= var67.field3474; var71++) {
                                                    for (int var72 = var67.field3475; var72 <= var67.field3484; var72++) {
                                                        class79 var73 = var7[var71][var72];
                                                        if (var73.field1165 != 0) {
                                                            class75.field1088.method1952(var73, -116);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field1177) {
                                                            class75.field1088.method1952(var73, 113);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1153) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field1153 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1177);
                            } while (var2.field1165 != 0);
                            if (var3 > class237.field3609 || var3 <= class162.field2629) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field1177);
                        if (var3 < class237.field3609 || var3 >= class30.field361 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field1177);
                    if (var4 > class193.field3014 || var4 <= class75.field1087) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field1177);
                if (var4 < class193.field3014 || var4 >= class29.field345 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field1177);
            var2.field1177 = false;
            class89.field1271--;
            class91 var79 = var2.field1154;
            if (var79 != null && var79.field1320 != 0) {
                if (class73.field1058) {
                    class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                }
                if (var79.field1322 != null) {
                    var79.field1322.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var79.field1324 - class336.field5227, var79.field1317 - class295.field4557 - var79.field1320, var79.field1316 - class262.field4035, var79.field1318, var5, (class249) null);
                }
                if (var79.field1315 != null) {
                    var79.field1315.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var79.field1324 - class336.field5227, var79.field1317 - class295.field4557 - var79.field1320, var79.field1316 - class262.field4035, var79.field1318, var5, (class249) null);
                }
                if (var79.field1319 != null) {
                    var79.field1319.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var79.field1324 - class336.field5227, var79.field1317 - class295.field4557 - var79.field1320, var79.field1316 - class262.field4035, var79.field1318, var5, (class249) null);
                }
            }
            if (var2.field1160 != 0) {
                class158 var80 = var2.field1175;
                if (var80 != null && !class165.method1253(var6, var3, var4, var80.field2402.method565())) {
                    if ((var80.field2407 & var2.field1160) != 0) {
                        if (class73.field1058) {
                            class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                        }
                        var80.field2402.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var80.field2394 + var80.field2401 - class336.field5227, var80.field2410 - class295.field4557, var80.field2409 + var80.field2396 - class262.field4035, var80.field2400, var5, (class249) null);
                    } else if (var80.field2407 == 256) {
                        int var81 = var80.field2394 - class336.field5227;
                        int var82 = var80.field2410 - class295.field4557;
                        int var83 = var80.field2409 - class262.field4035;
                        int var84 = var80.field2406;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class73.field1058) {
                                class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                            }
                            var80.field2402.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var80.field2401 + var81, var82, var80.field2396 + var83, var80.field2400, var5, (class249) null);
                        } else if (var80.field2398 != null) {
                            if (class73.field1058) {
                                class315.method2159(class336.field5227, class295.field4557, class262.field4035, var5, var3, var4);
                            }
                            var80.field2398.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var81, var82, var83, var80.field2400, var5, (class249) null);
                        }
                    }
                }
                class35 var87 = var2.field1161;
                if (var87 != null) {
                    if ((var87.field513 & var2.field1160) != 0 && !class154.method1159(var6, var3, var4, var87.field513)) {
                        if (class73.field1058) {
                            class315.method2163(var87.field513, class336.field5227, class295.field4557, class262.field4035, var6, var3, var4);
                        }
                        var87.field508.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var87.field506 - class336.field5227, var87.field502 - class295.field4557, var87.field516 - class262.field4035, var87.field512, var5, (class249) null);
                    }
                    if ((var87.field503 & var2.field1160) != 0 && !class154.method1159(var6, var3, var4, var87.field503)) {
                        if (class73.field1058) {
                            class315.method2163(var87.field503, class336.field5227, class295.field4557, class262.field4035, var6, var3, var4);
                        }
                        var87.field511.method576(0, class28.field340, class157.field2384, class75.field1090, class176.field2819, var87.field506 - class336.field5227, var87.field502 - class295.field4557, var87.field516 - class262.field4035, var87.field512, var5, (class249) null);
                    }
                }
            }
            if (var5 < class139.field2088 - 1) {
                class79 var88 = class213.field3262[var5 + 1][var3][var4];
                if (var88 != null && var88.field1177) {
                    class75.field1088.method1952(var88, -48);
                }
            }
            if (var3 < class237.field3609) {
                class79 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field1177) {
                    class75.field1088.method1952(var89, -111);
                }
            }
            if (var4 < class193.field3014) {
                class79 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field1177) {
                    class75.field1088.method1952(var90, 2);
                }
            }
            if (var3 > class237.field3609) {
                class79 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field1177) {
                    class75.field1088.method1952(var91, 124);
                }
            }
            if (var4 > class193.field3014) {
                class79 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field1177) {
                    class75.field1088.method1952(var92, 120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BI)Z", line = 1006)
    public static final boolean method645(byte[] arg0, int arg1) {
        field1245++;
        if (arg1 >= -43) {
            field1242 = 26;
        }
        class254 var2 = new class254(arg0);
        int var3 = var2.method1774((byte) -94);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1774((byte) -108) == 1;
        if (var4) {
            class165.method1257(var2, 120);
        }
        class258.method1823(var2, (byte) -124);
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 1034)
    public static final void method646(boolean arg0, String arg1, byte arg2) {
        if (arg2 <= 89) {
            method646(false, (String) null, (byte) -20);
        }
        field1248++;
        if (!arg0) {
            try {
                class199.method1445(-127, "loggedout", class330.field5074.field95);
            } catch (Throwable var9) {
            }
            try {
                class214.field3283.getAppletContext().showDocument(new URL(class214.field3283.getCodeBase(), arg1), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class73.field1058 && class5.field80) {
            try {
                class199.method1443(new Object[] { (new URL(class214.field3283.getCodeBase(), arg1)).toString() }, class330.field5074.field95, "openjs", 21329);
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class214.field3283.getAppletContext().showDocument(new URL(class214.field3283.getCodeBase(), arg1), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V", line = 1092)
    public final void method400(int arg0, int arg1, int arg2) {
        field1240++;
        int var4 = this.field1246 * arg0 >> 12;
        int var5 = -97 % ((-arg1 - 74) / 43);
        int var6 = this.field1250 * arg0 >> 12;
        int var7 = this.field1241 * arg2 >> 12;
        int var8 = this.field1251 * arg2 >> 12;
        class111.method847(this.field4170, var6, 23655, var4, var7, var8);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILth;)I", line = 1111)
    public static final int method647(int arg0, class270 arg1) {
        field1244++;
        if (arg0 != 1) {
            return -10;
        }
        int var2 = arg1.field4215;
        class258 var3 = arg1.method2099(110);
        if (arg1.field4765 == var3.field3988) {
            var2 = arg1.field4210;
        } else if (arg1.field4765 == var3.field3956 || arg1.field4765 == var3.field3977 || arg1.field4765 == var3.field3952 || arg1.field4765 == var3.field3967) {
            var2 = arg1.field4213;
        } else if (arg1.field4765 == var3.field3957 || arg1.field4765 == var3.field3974 || arg1.field4765 == var3.field3953 || arg1.field4765 == var3.field3986) {
            var2 = arg1.field4201;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 1139)
    public final void method406(int arg0, int arg1, int arg2) {
        if (arg1 != 219) {
            this.method405(101, -125, -118);
        }
        field1249++;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V", line = 1152)
    public final void method405(int arg0, int arg1, int arg2) {
        int var4 = this.field1250 * arg1 >> 12;
        field1243++;
        if (arg2 > 63) {
            int var5 = this.field1246 * arg1 >> 12;
            int var6 = this.field1251 * arg0 >> 12;
            int var7 = this.field1241 * arg0 >> 12;
            class103.method783(var7, this.field4173, var6, this.field4162, var4, var5, 99, this.field4170);
        }
    }
}
