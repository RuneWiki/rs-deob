import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class139 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Z")
    public boolean field2226 = false;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public int field2234 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public int field2222 = 0;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lck;")
    public static class119 field2223 = class298.method1987((byte) 46, "Standort");

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lfj;")
    public static class3 field2227 = new class3(8);

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lck;")
    public static class119 field2232 = class298.method1987((byte) 87, "gt");

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
    public static int[] field2235 = new int[100];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lwi;")
    public static class23 field2233;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Leh;")
    public class40 field2230;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2221;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Li;Z)V", line = 9)
    public static final void method913(class104 arg0, boolean arg1) {
        class54.field859.method999(arg0, (byte) -108);
        while (true) {
            class104 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class104[][] var7;
            class104 var79;
            do {
                class104 var78;
                do {
                    class104 var77;
                    do {
                        class104 var76;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class104) class54.field859.method991(16771501);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1611);
                                            var3 = var2.field1614;
                                            var4 = var2.field1608;
                                            var5 = var2.field1592;
                                            var6 = var2.field1609;
                                            var7 = class150.field2390[var5];
                                            float var8 = 0.0F;
                                            float var13;
                                            if (class57.field926 == class259.field4144) {
                                                int var9 = class37.field554[var3][var4];
                                                int var10 = var9 & 0xFFFFFF;
                                                if (class93.field1444 != var10) {
                                                    class93.field1444 = var10;
                                                    class176.method1126(var10, (byte) -55);
                                                    class178.method1142(class167.method1054(-23149));
                                                }
                                                int var11 = var9 >>> 24 << 3;
                                                if (class238.field3821 != var11) {
                                                    class238.field3821 = var11;
                                                    class62.method464(var11, -110);
                                                }
                                                int var12 = class128.field1966[0][var3 + 1][var4] + class128.field1966[0][var3][var4] + class128.field1966[0][var3][var4 + 1] + class128.field1966[0][var3 + 1][var4 + 1] >> 2;
                                                class103.method677(-var12, 30359, 3);
                                                var13 = 201.5F;
                                                class264.method1740(var13);
                                            } else {
                                                var13 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                class264.method1740(var13);
                                            }
                                            if (!var2.field1613) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class104 var14 = class150.field2390[var5 - 1][var3][var4];
                                                    if (var14 != null && var14.field1611) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class257.field4121 && var3 > class10.field186) {
                                                    class104 var15 = var7[var3 - 1][var4];
                                                    if (var15 != null && var15.field1611 && (var15.field1613 || (var2.field1601 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class257.field4121 && var3 < class75.field1167 - 1) {
                                                    class104 var16 = var7[var3 + 1][var4];
                                                    if (var16 != null && var16.field1611 && (var16.field1613 || (var2.field1601 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class208.field3327 && var4 > class99.field1511) {
                                                    class104 var17 = var7[var3][var4 - 1];
                                                    if (var17 != null && var17.field1611 && (var17.field1613 || (var2.field1601 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class208.field3327 && var4 < class114.field1724 - 1) {
                                                    class104 var18 = var7[var3][var4 + 1];
                                                    if (var18 != null && var18.field1611 && (var18.field1613 || (var2.field1601 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1613 = false;
                                            if (var2.field1603 != null) {
                                                class104 var19 = var2.field1603;
                                                class264.method1740(201.5F - (float) (var19.field1609 + 1) * 50.0F);
                                                if (var19.field1605 == null) {
                                                    if (var19.field1594 != null) {
                                                        if (class216.method1360(0, var3, var4)) {
                                                            class62.method457(var19.field1594, class191.field3006, class36.field519, class297.field4988, class54.field862, var3, var4, true);
                                                        } else {
                                                            class62.method457(var19.field1594, class191.field3006, class36.field519, class297.field4988, class54.field862, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class216.method1360(0, var3, var4)) {
                                                    class113.method722(var19.field1605, 0, class191.field3006, class36.field519, class297.field4988, class54.field862, var3, var4, true);
                                                } else {
                                                    class113.method722(var19.field1605, 0, class191.field3006, class36.field519, class297.field4988, class54.field862, var3, var4, false);
                                                }
                                                class146 var20 = var19.field1593;
                                                if (var20 != null) {
                                                    if ((var20.field2338 & var2.field1600) == 0) {
                                                        class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                    } else {
                                                        class125.method834(var20.field2338, class89.field1373, class220.field3527, class208.field3314, var6, var3, var4);
                                                    }
                                                    var20.field2348.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var20.field2344 - class89.field1373, var20.field2351 - class220.field3527, var20.field2340 - class208.field3314, var20.field2341);
                                                }
                                                for (int var21 = 0; var21 < var19.field1596; var21++) {
                                                    class196 var22 = var19.field1610[var21];
                                                    if (var22 != null) {
                                                        class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                        var22.field3140.method202(var22.field3148, class191.field3006, class36.field519, class297.field4988, class54.field862, var22.field3149 - class89.field1373, var22.field3143 - class220.field3527, var22.field3129 - class208.field3314, var22.field3130);
                                                    }
                                                }
                                                class264.method1740(var13);
                                            }
                                            boolean var23 = false;
                                            if (var2.field1605 == null) {
                                                if (var2.field1594 != null) {
                                                    if (class216.method1360(var6, var3, var4)) {
                                                        class62.method457(var2.field1594, class191.field3006, class36.field519, class297.field4988, class54.field862, var3, var4, true);
                                                    } else {
                                                        var23 = true;
                                                        class62.method457(var2.field1594, class191.field3006, class36.field519, class297.field4988, class54.field862, var3, var4, false);
                                                    }
                                                }
                                            } else if (class216.method1360(var6, var3, var4)) {
                                                class113.method722(var2.field1605, var6, class191.field3006, class36.field519, class297.field4988, class54.field862, var3, var4, true);
                                            } else {
                                                var23 = true;
                                                if (var2.field1605.field560 != 12345678 || class4.field121 && var5 <= class161.field2556) {
                                                    class113.method722(var2.field1605, var6, class191.field3006, class36.field519, class297.field4988, class54.field862, var3, var4, false);
                                                }
                                            }
                                            if (var23) {
                                                class199 var24 = var2.field1598;
                                                if (var24 != null && (var24.field3175 & 0xFFFFFFFF80000000L) != 0L) {
                                                    if (var24.field3181) {
                                                        class264.method1740(var13 + 50.0F - 1.5F);
                                                    }
                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                    var24.field3178.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var24.field3174 - class89.field1373, var24.field3177 - class220.field3527, var24.field3179 - class208.field3314, var24.field3175);
                                                    if (var24.field3181) {
                                                        class264.method1740(var13);
                                                    }
                                                }
                                            }
                                            int var25 = 0;
                                            int var26 = 0;
                                            class146 var27 = var2.field1593;
                                            class106 var28 = var2.field1590;
                                            if (var27 != null || var28 != null) {
                                                if (class257.field4121 == var3) {
                                                    var25++;
                                                } else if (class257.field4121 < var3) {
                                                    var25 += 2;
                                                }
                                                if (class208.field3327 == var4) {
                                                    var25 += 3;
                                                } else if (class208.field3327 > var4) {
                                                    var25 += 6;
                                                }
                                                var26 = class170.field2688[var25];
                                                var2.field1600 = class71.field1113[var25];
                                            }
                                            if (var27 != null) {
                                                if ((var27.field2338 & class138.field2215[var25]) == 0) {
                                                    var2.field1597 = 0;
                                                } else if (var27.field2338 == 16) {
                                                    var2.field1597 = 3;
                                                    var2.field1607 = class217.field3503[var25];
                                                    var2.field1595 = 3 - var2.field1607;
                                                } else if (var27.field2338 == 32) {
                                                    var2.field1597 = 6;
                                                    var2.field1607 = class35.field484[var25];
                                                    var2.field1595 = 6 - var2.field1607;
                                                } else if (var27.field2338 == 64) {
                                                    var2.field1597 = 12;
                                                    var2.field1607 = class128.field1963[var25];
                                                    var2.field1595 = 12 - var2.field1607;
                                                } else {
                                                    var2.field1597 = 9;
                                                    var2.field1607 = class229.field3711[var25];
                                                    var2.field1595 = 9 - var2.field1607;
                                                }
                                                if ((var27.field2338 & var26) != 0 && !class195.method1251(var6, var3, var4, var27.field2338)) {
                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                    var27.field2348.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var27.field2344 - class89.field1373, var27.field2351 - class220.field3527, var27.field2340 - class208.field3314, var27.field2341);
                                                }
                                                if ((var27.field2345 & var26) != 0 && !class195.method1251(var6, var3, var4, var27.field2345)) {
                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                    var27.field2347.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var27.field2344 - class89.field1373, var27.field2351 - class220.field3527, var27.field2340 - class208.field3314, var27.field2341);
                                                }
                                            }
                                            if (var28 != null && !class273.method1807(var6, var3, var4, var28.field1627.method214())) {
                                                class264.method1740(var13 - 0.5F);
                                                if ((var28.field1635 & var26) != 0) {
                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                    var28.field1627.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var28.field1622 + var28.field1634 - class89.field1373, var28.field1624 - class220.field3527, var28.field1621 + var28.field1628 - class208.field3314, var28.field1617);
                                                } else if (var28.field1635 == 256) {
                                                    int var29 = var28.field1622 - class89.field1373;
                                                    int var30 = var28.field1624 - class220.field3527;
                                                    int var31 = var28.field1621 - class208.field3314;
                                                    int var32 = var28.field1629;
                                                    int var33;
                                                    if (var32 == 1 || var32 == 2) {
                                                        var33 = -var29;
                                                    } else {
                                                        var33 = var29;
                                                    }
                                                    int var34;
                                                    if (var32 == 2 || var32 == 3) {
                                                        var34 = -var31;
                                                    } else {
                                                        var34 = var31;
                                                    }
                                                    if (var34 < var33) {
                                                        class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                        var28.field1627.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var28.field1634 + var29, var30, var28.field1628 + var31, var28.field1617);
                                                    } else if (var28.field1633 != null) {
                                                        class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                        var28.field1633.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var29, var30, var31, var28.field1617);
                                                    }
                                                }
                                                class264.method1740(var13);
                                            }
                                            if (var23) {
                                                class199 var35 = var2.field1598;
                                                if (var35 != null && (var35.field3175 & 0xFFFFFFFF80000000L) == 0L) {
                                                    if (var35.field3181) {
                                                        class264.method1740(var13 + 50.0F - 1.5F);
                                                    }
                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                    var35.field3178.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var35.field3174 - class89.field1373, var35.field3177 - class220.field3527, var35.field3179 - class208.field3314, var35.field3175);
                                                    if (var35.field3181) {
                                                        class264.method1740(var13);
                                                    }
                                                }
                                                class69 var36 = var2.field1602;
                                                if (var36 != null && var36.field1092 == 0) {
                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                    if (var36.field1091 != null) {
                                                        var36.field1091.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var36.field1072 - class89.field1373, var36.field1084 - class220.field3527, var36.field1093 - class208.field3314, var36.field1069);
                                                    }
                                                    if (var36.field1077 != null) {
                                                        var36.field1077.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var36.field1072 - class89.field1373, var36.field1084 - class220.field3527, var36.field1093 - class208.field3314, var36.field1069);
                                                    }
                                                    if (var36.field1076 != null) {
                                                        var36.field1076.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var36.field1072 - class89.field1373, var36.field1084 - class220.field3527, var36.field1093 - class208.field3314, var36.field1069);
                                                    }
                                                }
                                            }
                                            int var37 = var2.field1601;
                                            if (var37 != 0) {
                                                if (var3 < class257.field4121 && (var37 & 0x4) != 0) {
                                                    class104 var38 = var7[var3 + 1][var4];
                                                    if (var38 != null && var38.field1611) {
                                                        class54.field859.method999(var38, (byte) -108);
                                                    }
                                                }
                                                if (var4 < class208.field3327 && (var37 & 0x2) != 0) {
                                                    class104 var39 = var7[var3][var4 + 1];
                                                    if (var39 != null && var39.field1611) {
                                                        class54.field859.method999(var39, (byte) -108);
                                                    }
                                                }
                                                if (var3 > class257.field4121 && (var37 & 0x1) != 0) {
                                                    class104 var40 = var7[var3 - 1][var4];
                                                    if (var40 != null && var40.field1611) {
                                                        class54.field859.method999(var40, (byte) -108);
                                                    }
                                                }
                                                if (var4 > class208.field3327 && (var37 & 0x8) != 0) {
                                                    class104 var41 = var7[var3][var4 - 1];
                                                    if (var41 != null && var41.field1611) {
                                                        class54.field859.method999(var41, (byte) -108);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1597 != 0) {
                                            boolean var42 = true;
                                            for (int var43 = 0; var43 < var2.field1596; var43++) {
                                                if (class64.field1017 != var2.field1610[var43].field3147 && (var2.field1606[var43] & var2.field1597) == var2.field1607) {
                                                    var42 = false;
                                                    break;
                                                }
                                            }
                                            if (var42) {
                                                class146 var44 = var2.field1593;
                                                if (!class195.method1251(var6, var3, var4, var44.field2338)) {
                                                    label593: {
                                                        if ((var44.field2341 & 0xFC000L) == 16384L) {
                                                            int var45 = var44.field2344 - class89.field1373;
                                                            int var46 = var44.field2340 - class208.field3314;
                                                            int var47 = (int) (var44.field2341 >> 20 & 0x3L);
                                                            if (var47 == 0) {
                                                                var45 -= 64;
                                                                var46 += 64;
                                                                if (var46 < var45 && var3 > 0 && var4 < class103.field1569 - 1) {
                                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3 - 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 1) {
                                                                var45 += 64;
                                                                var46 += 64;
                                                                if (var46 < -var45 && var3 < class208.field3328 - 1 && var4 < class103.field1569 - 1) {
                                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3 + 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 2) {
                                                                var45 += 64;
                                                                var46 -= 64;
                                                                if (var46 > var45 && var3 < class208.field3328 - 1 && var4 > 0) {
                                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3 + 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 3) {
                                                                var45 -= 64;
                                                                var46 -= 64;
                                                                if (var46 > -var45 && var3 > 0 && var4 > 0) {
                                                                    class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3 - 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            }
                                                        }
                                                        class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                    }
                                                    var44.field2348.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var44.field2344 - class89.field1373, var44.field2351 - class220.field3527, var44.field2340 - class208.field3314, var44.field2341);
                                                }
                                                var2.field1597 = 0;
                                            }
                                        }
                                        if (!var2.field1616) {
                                            break;
                                        }
                                        try {
                                            int var48 = var2.field1596;
                                            var2.field1616 = false;
                                            int var49 = 0;
                                            label677: for (int var50 = 0; var50 < var48; var50++) {
                                                class196 var51 = var2.field1610[var50];
                                                if (class64.field1017 != var51.field3147) {
                                                    for (int var52 = var51.field3131; var52 <= var51.field3136; var52++) {
                                                        for (int var53 = var51.field3146; var53 <= var51.field3137; var53++) {
                                                            class104 var54 = var7[var52][var53];
                                                            if (var54.field1613) {
                                                                var2.field1616 = true;
                                                                continue label677;
                                                            }
                                                            if (var54.field1597 != 0) {
                                                                int var55 = 0;
                                                                if (var52 > var51.field3131) {
                                                                    var55++;
                                                                }
                                                                if (var52 < var51.field3136) {
                                                                    var55 += 4;
                                                                }
                                                                if (var53 > var51.field3146) {
                                                                    var55 += 8;
                                                                }
                                                                if (var53 < var51.field3137) {
                                                                    var55 += 2;
                                                                }
                                                                if ((var55 & var54.field1597) == var2.field1595) {
                                                                    var2.field1616 = true;
                                                                    continue label677;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class99.field1513[var49++] = var51;
                                                    int var56 = class257.field4121 - var51.field3131;
                                                    int var57 = var51.field3136 - class257.field4121;
                                                    if (var57 > var56) {
                                                        var56 = var57;
                                                    }
                                                    int var58 = class208.field3327 - var51.field3146;
                                                    int var59 = var51.field3137 - class208.field3327;
                                                    if (var59 > var58) {
                                                        var51.field3141 = var56 + var59;
                                                    } else {
                                                        var51.field3141 = var56 + var58;
                                                    }
                                                }
                                            }
                                            while (var49 > 0) {
                                                int var60 = -50;
                                                int var61 = -1;
                                                for (int var62 = 0; var62 < var49; var62++) {
                                                    class196 var63 = class99.field1513[var62];
                                                    if (class64.field1017 != var63.field3147) {
                                                        if (var63.field3141 > var60) {
                                                            var60 = var63.field3141;
                                                            var61 = var62;
                                                        } else if (var63.field3141 == var60) {
                                                            int var64 = var63.field3149 - class89.field1373;
                                                            int var65 = var63.field3129 - class208.field3314;
                                                            int var66 = class99.field1513[var61].field3149 - class89.field1373;
                                                            int var67 = class99.field1513[var61].field3129 - class208.field3314;
                                                            if (var64 * var64 + var65 * var65 > var66 * var66 + var67 * var67) {
                                                                var61 = var62;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var61 == -1) {
                                                    break;
                                                }
                                                class196 var68 = class99.field1513[var61];
                                                var68.field3147 = class64.field1017;
                                                if (!class75.method535(var6, var68.field3131, var68.field3136, var68.field3146, var68.field3137, var68.field3140.method214())) {
                                                    if ((var68.field3130 & 0xFC000L) == 147456L) {
                                                        class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                                                        int var69 = var68.field3149 - class89.field1373;
                                                        int var70 = var68.field3129 - class208.field3314;
                                                        int var71 = (int) (var68.field3130 >> 20 & 0x3L);
                                                        if (var71 == 1 || var71 == 3) {
                                                            if (var70 > -var69) {
                                                                class125.method840(var5, var3, var4 - 1, var3 - 1, var4);
                                                            } else {
                                                                class125.method840(var5, var3, var4 + 1, var3 + 1, var4);
                                                            }
                                                        } else if (var70 > var69) {
                                                            class125.method840(var5, var3, var4 - 1, var3 + 1, var4);
                                                        } else {
                                                            class125.method840(var5, var3, var4 + 1, var3 - 1, var4);
                                                        }
                                                    } else {
                                                        class125.method844(class89.field1373, class220.field3527, class208.field3314, var5, var68.field3131, var68.field3146, var68.field3136, var68.field3137);
                                                    }
                                                    var68.field3140.method202(var68.field3148, class191.field3006, class36.field519, class297.field4988, class54.field862, var68.field3149 - class89.field1373, var68.field3143 - class220.field3527, var68.field3129 - class208.field3314, var68.field3130);
                                                }
                                                for (int var72 = var68.field3131; var72 <= var68.field3136; var72++) {
                                                    for (int var73 = var68.field3146; var73 <= var68.field3137; var73++) {
                                                        class104 var74 = var7[var72][var73];
                                                        if (var74.field1597 != 0) {
                                                            class54.field859.method999(var74, (byte) -108);
                                                        } else if ((var3 != var72 || var4 != var73) && var74.field1611) {
                                                            class54.field859.method999(var74, (byte) -108);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1616) {
                                                break;
                                            }
                                        } catch (Exception var94) {
                                            var2.field1616 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1611);
                            } while (var2.field1597 != 0);
                            if (var3 > class257.field4121 || var3 <= class10.field186) {
                                break;
                            }
                            var76 = var7[var3 - 1][var4];
                        } while (var76 != null && var76.field1611);
                        if (var3 < class257.field4121 || var3 >= class75.field1167 - 1) {
                            break;
                        }
                        var77 = var7[var3 + 1][var4];
                    } while (var77 != null && var77.field1611);
                    if (var4 > class208.field3327 || var4 <= class99.field1511) {
                        break;
                    }
                    var78 = var7[var3][var4 - 1];
                } while (var78 != null && var78.field1611);
                if (var4 < class208.field3327 || var4 >= class114.field1724 - 1) {
                    break;
                }
                var79 = var7[var3][var4 + 1];
            } while (var79 != null && var79.field1611);
            var2.field1611 = false;
            class22.field304--;
            class69 var80 = var2.field1602;
            if (var80 != null && var80.field1092 != 0) {
                class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                if (var80.field1091 != null) {
                    var80.field1091.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var80.field1072 - class89.field1373, var80.field1084 - class220.field3527 - var80.field1092, var80.field1093 - class208.field3314, var80.field1069);
                }
                if (var80.field1077 != null) {
                    var80.field1077.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var80.field1072 - class89.field1373, var80.field1084 - class220.field3527 - var80.field1092, var80.field1093 - class208.field3314, var80.field1069);
                }
                if (var80.field1076 != null) {
                    var80.field1076.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var80.field1072 - class89.field1373, var80.field1084 - class220.field3527 - var80.field1092, var80.field1093 - class208.field3314, var80.field1069);
                }
            }
            if (var2.field1600 != 0) {
                class106 var81 = var2.field1590;
                if (var81 != null && !class273.method1807(var6, var3, var4, var81.field1627.method214())) {
                    if ((var81.field1635 & var2.field1600) != 0) {
                        class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                        var81.field1627.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var81.field1622 + var81.field1634 - class89.field1373, var81.field1624 - class220.field3527, var81.field1621 + var81.field1628 - class208.field3314, var81.field1617);
                    } else if (var81.field1635 == 256) {
                        int var82 = var81.field1622 - class89.field1373;
                        int var83 = var81.field1624 - class220.field3527;
                        int var84 = var81.field1621 - class208.field3314;
                        int var85 = var81.field1629;
                        int var86;
                        if (var85 == 1 || var85 == 2) {
                            var86 = -var82;
                        } else {
                            var86 = var82;
                        }
                        int var87;
                        if (var85 == 2 || var85 == 3) {
                            var87 = -var84;
                        } else {
                            var87 = var84;
                        }
                        if (var87 >= var86) {
                            class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                            var81.field1627.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var81.field1634 + var82, var83, var81.field1628 + var84, var81.field1617);
                        } else if (var81.field1633 != null) {
                            class125.method841(class89.field1373, class220.field3527, class208.field3314, var5, var3, var4);
                            var81.field1633.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var82, var83, var84, var81.field1617);
                        }
                    }
                }
                class146 var88 = var2.field1593;
                if (var88 != null) {
                    if ((var88.field2345 & var2.field1600) != 0 && !class195.method1251(var6, var3, var4, var88.field2345)) {
                        class125.method834(var88.field2345, class89.field1373, class220.field3527, class208.field3314, var6, var3, var4);
                        var88.field2347.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var88.field2344 - class89.field1373, var88.field2351 - class220.field3527, var88.field2340 - class208.field3314, var88.field2341);
                    }
                    if ((var88.field2338 & var2.field1600) != 0 && !class195.method1251(var6, var3, var4, var88.field2338)) {
                        class125.method834(var88.field2338, class89.field1373, class220.field3527, class208.field3314, var6, var3, var4);
                        var88.field2348.method202(0, class191.field3006, class36.field519, class297.field4988, class54.field862, var88.field2344 - class89.field1373, var88.field2351 - class220.field3527, var88.field2340 - class208.field3314, var88.field2341);
                    }
                }
            }
            if (var5 < class35.field481 - 1) {
                class104 var89 = class150.field2390[var5 + 1][var3][var4];
                if (var89 != null && var89.field1611) {
                    class54.field859.method999(var89, (byte) -108);
                }
            }
            if (var3 < class257.field4121) {
                class104 var90 = var7[var3 + 1][var4];
                if (var90 != null && var90.field1611) {
                    class54.field859.method999(var90, (byte) -108);
                }
            }
            if (var4 < class208.field3327) {
                class104 var91 = var7[var3][var4 + 1];
                if (var91 != null && var91.field1611) {
                    class54.field859.method999(var91, (byte) -108);
                }
            }
            if (var3 > class257.field4121) {
                class104 var92 = var7[var3 - 1][var4];
                if (var92 != null && var92.field1611) {
                    class54.field859.method999(var92, (byte) -108);
                }
            }
            if (var4 > class208.field3327) {
                class104 var93 = var7[var3][var4 - 1];
                if (var93 != null && var93.field1611) {
                    class54.field859.method999(var93, (byte) -108);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 1002)
    public static void method914(byte arg0) {
        field2227 = null;
        field2232 = null;
        field2223 = null;
        field2235 = null;
        if (arg0 == -15) {
            field2233 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lml;IZ)V", line = 1034)
    public static final void method915(class134 arg0, int arg1, boolean arg2) {
        int var3 = arg0.field2175 == 0 ? arg0.field2180 : arg0.field2175;
        field2220++;
        int var4 = arg0.field2095 == 0 ? arg0.field2057 : arg0.field2095;
        int var5 = 86 % ((78 - arg1) / 44);
        class243.method1581(arg2, arg0.field2120, (byte) 65, var4, class135.field2189[arg0.field2120 >> 16], var3);
        if (arg0.field2061 != null) {
            class243.method1581(arg2, arg0.field2120, (byte) 65, var4, arg0.field2061, var3);
        }
        class288 var6 = (class288) class206.field3268.method1329((byte) 90, (long) arg0.field2120);
        if (var6 != null) {
            class199.method1272(var6.field4739, (byte) -119, var4, var3, arg2);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 1063)
    public static final void method916(byte arg0) {
        class204.field3237.method486((byte) 93);
        field2229++;
        if (arg0 < 23) {
            method917(-20, false);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)V", line = 1074)
    public static final void method917(int arg0, boolean arg1) {
        class227.field3632.method491(100, arg0);
        if (!arg1) {
            class174.field2787.method491(102, arg0);
            field2225++;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Led;", line = 1093)
    public static final class106 method918(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1590;
    }
}
