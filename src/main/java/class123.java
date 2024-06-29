import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class123 {

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Z")
    public static boolean field1707 = false;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "[I")
    public static int[] field1702 = new int[50];

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Lem;")
    public class123 field1711;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Lnq;")
    public static class268 field1706;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lkr;")
    public class447 field1709;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 11)
    public static final void method829(int arg0) {
        if (arg0 != 662) {
            return;
        }
        for (int var1 = 0; var1 < class438.field6171; var1++) {
            int var2 = class314.field4301[var1];
            class198 var3 = class98.field1358[var2];
            int var4 = class333.field4591.method172((byte) 52);
            if ((var4 & 0x20) != 0) {
                var4 += class333.field4591.method172((byte) 52) << 8;
            }
            if ((var4 & 0x400) != 0) {
                var3.field5281 = class333.field4591.method166(false);
                var3.field5258 = class333.field4591.method174(arg0 ^ 0x269);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field2737.method2102(-4092)) {
                    class285.method1862(1, var3);
                }
                var3.method1290((byte) 114, class412.method2584(class333.field4591.method166(false), true));
                var3.method2383(var3.field2737.field4488, (byte) 1);
                var3.field5313 = var3.field2737.field4478 << 3;
                if (var3.field2737.method2102(-4092)) {
                    class369.method2373(1, var3.field5332[0], (class134) null, 0, var3, var3.field5326[0], (class64) null, class142.field2034);
                }
            }
            if ((var4 & 0x200) != 0) {
                int var5 = class333.field4591.method174(arg0 - 407);
                var3.field5282 = class333.field4591.method206(arg0 - 653);
                var3.field5272 = class333.field4591.method187(-19097);
                var3.field5311 = var5 & 0x7FFF;
                var3.field5322 = (var5 & 0x8000) != 0;
                var3.field5271 = class276.field3837 + var3.field5282 + var3.field5311;
            }
            if ((var4 & 0x10) != 0) {
                int var6 = class333.field4591.method188(-128);
                int var7 = class333.field4591.method194(30339);
                if (var6 == 65535) {
                    var6 = -1;
                }
                boolean var8 = true;
                if (var6 != -1 && var3.field5300 != -1) {
                    if (var3.field5300 == var6) {
                        class80 var9 = class393.method2484(var6, -76);
                        if (var9.field1144 && var9.field1125 != -1) {
                            class411 var10 = class108.method761((byte) -82, var9.field1125);
                            int var11 = var10.field5832;
                            if (var11 == 0) {
                                var8 = false;
                            } else if (var11 == 1) {
                                var8 = true;
                            } else if (var11 == 2) {
                                var8 = false;
                                var3.field5250 = 0;
                            }
                        }
                    } else {
                        class80 var12 = class393.method2484(var6, arg0 - 568);
                        class80 var13 = class393.method2484(var3.field5300, arg0 ^ 0x2DE);
                        if (var12.field1125 != -1 && var13.field1125 != -1) {
                            class411 var14 = class108.method761((byte) -82, var12.field1125);
                            class411 var15 = class108.method761((byte) -82, var13.field1125);
                            if (var15.field5825 > var14.field5825) {
                                var8 = false;
                            }
                        }
                    }
                }
                if (var8) {
                    var3.field5288 = var7 >> 16;
                    var3.field5316 = 1;
                    var3.field5320 = (var7 & 0xFFFF) + class276.field3837;
                    var3.field5257 = 0;
                    var3.field5300 = var6;
                    var3.field5295 = 0;
                    if (class276.field3837 < var3.field5320) {
                        var3.field5295 = -1;
                    }
                    if (var3.field5300 != -1 && class276.field3837 == var3.field5320) {
                        int var16 = class393.method2484(var3.field5300, -101).field1125;
                        if (var16 != -1) {
                            class411 var17 = class108.method761((byte) -82, var16);
                            if (var17 != null && var17.field5824 != null) {
                                class431.method2721(var3.field6266, var3.field6262, var17, 122, false, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                int var18 = class333.field4591.method174(255);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class333.field4591.method172((byte) 52);
                class248.method1668(var18, var19, var3, -1);
            }
            if ((var4 & 0x80) != 0) {
                var3.field5292 = class333.field4591.method171(-9265);
                var3.field5245 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var20 = class333.field4591.method175(255);
                int var21 = class333.field4591.method187(arg0 ^ 0xFFFFB7F1);
                var3.method2393(class276.field3837, (byte) 34, var20, var21);
            }
            if ((var4 & 0x2) != 0) {
                int var22 = class333.field4591.method175(255);
                int var23 = class333.field4591.method206(65);
                var3.method2393(class276.field3837, (byte) 34, var22, var23);
                var3.field5299 = class276.field3837 + 300;
                var3.field5248 = class333.field4591.method172((byte) 52);
            }
            if ((var4 & 0x100) != 0) {
                int var24 = class333.field4591.method172((byte) 52);
                int[] var25 = new int[var24];
                int[] var26 = new int[var24];
                int[] var27 = new int[var24];
                for (int var28 = 0; var28 < var24; var28++) {
                    int var29 = class333.field4591.method166(false);
                    if (var29 == 65535) {
                        var29 = -1;
                    }
                    var25[var28] = var29;
                    var26[var28] = class333.field4591.method187(-19097);
                    var27[var28] = class333.field4591.method166(false);
                }
                class397.method2509(var25, false, var27, var3, var26);
            }
            if ((var4 & 0x1) != 0) {
                var3.field5275 = class333.field4591.method188(-128);
                if (var3.field5275 == 65535) {
                    var3.field5275 = -1;
                }
            }
        }
        field1703++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 258)
    public static void method830(byte arg0) {
        field1706 = null;
        field1702 = null;
        if (arg0 != 92) {
            method832(24, -75);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)V", line = 270)
    public static final void method831(byte arg0, int arg1) {
        if (arg0 < 90) {
            field1702 = null;
        }
        if (arg1 == 37) {
            class354.field4838 = 3.0F;
        } else if (arg1 == 50) {
            class354.field4838 = 4.0F;
        } else if (arg1 == 75) {
            class354.field4838 = 6.0F;
        } else if (arg1 == 100) {
            class354.field4838 = 8.0F;
        } else if (arg1 == 200) {
            class354.field4838 = 16.0F;
        }
        field1712++;
        class192.field2649 = -1;
        class192.field2649 = -1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V", line = 301)
    public static final void method832(int arg0, int arg1) {
        if (arg0 < 121) {
            method834(-16, -125, true);
        }
        class125.field1747.method901(arg1, 12223);
        field1705++;
        class50.field699.method901(arg1, 12223);
        class19.field353.method901(arg1, 12223);
        class440.field6187.method901(arg1, 12223);
        class155.field2181.method901(arg1, 12223);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 320)
    public final void method833(int arg0) {
        field1704++;
        if (arg0 <= class69.field1022) {
            return;
        }
        this.field1708 = 0;
        this.field1711 = class183.field2498;
        this.field1709 = null;
        class69.field1022++;
        class183.field2498 = this;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZ)I", line = 336)
    public static final int method834(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return -38;
        }
        field1701++;
        int var3 = arg0 >>> 24;
        int var4 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - var3;
        return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }
}
