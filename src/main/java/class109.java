import java.io.InputStream;
import java.util.Random;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class109 extends InputStream {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field1913 = 0;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[S")
    public static short[] field1914 = new short[] { 4, 26, 15, 51, 9, 57, 41, 29 };

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 5)
    public static final int method792(int arg0, Random arg1, int arg2) {
        field1910++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class36.method249(arg2, 32768)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            if (arg0 != -11163) {
                method792(-36, (Random) null, -103);
            }
            return class317.method2202((byte) 63, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 35)
    public static void method793(int arg0) {
        if (arg0 != 3) {
            method795((int[][]) ((int[][]) null), 9);
        }
        field1914 = null;
    }

    @OriginalMember(owner = "client!dc", name = "read", descriptor = "()I", line = 48)
    public final int read() {
        field1917++;
        class83.method556(30000L, 127);
        return -1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lje;Z)V", line = 61)
    public static final void method794(class74 arg0, boolean arg1) {
        class186.field3416.method5(arg0, (byte) 30);
        while (true) {
            class74 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class74[][] var7;
            class74 var118;
            do {
                class74 var117;
                do {
                    class74 var116;
                    do {
                        class74 var115;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class74) class186.field3416.method12(94);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1138);
                                            var3 = var2.field1116;
                                            var4 = var2.field1126;
                                            var5 = var2.field1131;
                                            var6 = var2.field1121;
                                            var7 = class99.field1759[var5];
                                            float var8 = 0.0F;
                                            if (class231.field4051) {
                                                if (class278.field4883 == class105.field1819) {
                                                    int var9 = class182.field3355[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class169.field3036 != var10) {
                                                        class169.field3036 = var10;
                                                        class221.method1517(var10, -122);
                                                        class217.method1493(class288.method2059(0));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class304.field5291 != var11) {
                                                        class304.field5291 = var11;
                                                        class35.method244(var11, -1);
                                                    }
                                                    int var12 = class104.field1809[0][var3 + 1][var4] + class104.field1809[0][var3][var4] + class104.field1809[0][var3][var4 + 1] + class104.field1809[0][var3 + 1][var4 + 1] >> 2;
                                                    class59.method403(-var12, (byte) -105, 3);
                                                    var8 = 201.5F;
                                                    class231.method1581(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class231.method1581(var8);
                                                }
                                            }
                                            if (!var2.field1114) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class74 var13 = class99.field1759[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field1138) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class209.field3730 && var3 > class269.field4719) {
                                                    class74 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field1138 && (var14.field1114 || (var2.field1142 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class209.field3730 && var3 < class64.field1024 - 1) {
                                                    class74 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field1138 && (var15.field1114 || (var2.field1142 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class131.field2237 && var4 > class62.field992) {
                                                    class74 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field1138 && (var16.field1114 || (var2.field1142 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class131.field2237 && var4 < class14.field188 - 1) {
                                                    class74 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field1138 && (var17.field1114 || (var2.field1142 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1114 = false;
                                            if (var2.field1120 != null) {
                                                class74 var18 = var2.field1120;
                                                if (class231.field4051) {
                                                    class231.method1581(201.5F - (float) (var18.field1121 + 1) * 50.0F);
                                                }
                                                if (var18.field1122 == null) {
                                                    if (var18.field1144 != null) {
                                                        if (class84.method576(0, var3, var4)) {
                                                            class209.method1450(var18.field1144, field1912, class273.field4803, class195.field3522, class61.field980, var3, var4, true);
                                                        } else {
                                                            class209.method1450(var18.field1144, field1912, class273.field4803, class195.field3522, class61.field980, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class84.method576(0, var3, var4)) {
                                                    class215.method1475(var18.field1122, 0, field1912, class273.field4803, class195.field3522, class61.field980, var3, var4, true);
                                                } else {
                                                    class215.method1475(var18.field1122, 0, field1912, class273.field4803, class195.field3522, class61.field980, var3, var4, false);
                                                }
                                                class174 var19 = var18.field1117;
                                                if (var19 != null) {
                                                    if (class231.field4051) {
                                                        if ((var19.field3178 & var2.field1123) == 0) {
                                                            class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                        } else {
                                                            class267.method1926(var19.field3178, class1.field10, class260.field4592, class311.field5381, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field3183.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var19.field3181 - class1.field10, var19.field3189 - class260.field4592, var19.field3187 - class311.field5381, var19.field3184, var5, (class165) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field1119; var20++) {
                                                    class326 var21 = var18.field1118[var20];
                                                    if (var21 != null) {
                                                        if (class231.field4051) {
                                                            class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                        }
                                                        var21.field5570.method98(var21.field5566, field1912, class273.field4803, class195.field3522, class61.field980, var21.field5560 - class1.field10, var21.field5550 - class260.field4592, var21.field5549 - class311.field5381, var21.field5563, var5, (class165) null);
                                                    }
                                                }
                                                if (class231.field4051) {
                                                    class231.method1581(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field1122 == null) {
                                                if (var2.field1144 != null) {
                                                    if (class84.method576(var6, var3, var4)) {
                                                        class209.method1450(var2.field1144, field1912, class273.field4803, class195.field3522, class61.field980, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class209.method1450(var2.field1144, field1912, class273.field4803, class195.field3522, class61.field980, var3, var4, false);
                                                    }
                                                }
                                            } else if (class84.method576(var6, var3, var4)) {
                                                class215.method1475(var2.field1122, var6, field1912, class273.field4803, class195.field3522, class61.field980, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field1122.field2467 != 12345678 || class1.field7 && var5 <= class199.field3578) {
                                                    class215.method1475(var2.field1122, var6, field1912, class273.field4803, class195.field3522, class61.field980, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class258 var23 = var2.field1141;
                                                if (var23 != null && (var23.field4560 & 0x80000000L) != 0L) {
                                                    if (class231.field4051 && var23.field4561) {
                                                        class231.method1581(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class231.field4051) {
                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                    }
                                                    var23.field4557.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var23.field4563 - class1.field10, var23.field4553 - class260.field4592, var23.field4559 - class311.field5381, var23.field4560, var5, (class165) null);
                                                    if (class231.field4051 && var23.field4561) {
                                                        class231.method1581(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class174 var26 = var2.field1117;
                                            class36 var27 = var2.field1140;
                                            if (var26 != null || var27 != null) {
                                                if (class209.field3730 == var3) {
                                                    var24++;
                                                } else if (class209.field3730 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class131.field2237 == var4) {
                                                    var24 += 3;
                                                } else if (class131.field2237 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class187.field3437[var24];
                                                var2.field1123 = class83.field1287[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field3178 & class216.field3848[var24]) == 0) {
                                                    var2.field1132 = 0;
                                                } else if (var26.field3178 == 16) {
                                                    var2.field1132 = 3;
                                                    var2.field1137 = class317.field5449[var24];
                                                    var2.field1127 = 3 - var2.field1137;
                                                } else if (var26.field3178 == 32) {
                                                    var2.field1132 = 6;
                                                    var2.field1137 = class158.field2849[var24];
                                                    var2.field1127 = 6 - var2.field1137;
                                                } else if (var26.field3178 == 64) {
                                                    var2.field1132 = 12;
                                                    var2.field1137 = class93.field1485[var24];
                                                    var2.field1127 = 12 - var2.field1137;
                                                } else {
                                                    var2.field1132 = 9;
                                                    var2.field1137 = class271.field4733[var24];
                                                    var2.field1127 = 9 - var2.field1137;
                                                }
                                                if ((var26.field3178 & var25) != 0 && !class216.method1484(var6, var3, var4, var26.field3178)) {
                                                    if (class231.field4051) {
                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                    }
                                                    var26.field3183.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var26.field3181 - class1.field10, var26.field3189 - class260.field4592, var26.field3187 - class311.field5381, var26.field3184, var5, (class165) null);
                                                }
                                                if ((var26.field3175 & var25) != 0 && !class216.method1484(var6, var3, var4, var26.field3175)) {
                                                    if (class231.field4051) {
                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                    }
                                                    var26.field3173.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var26.field3181 - class1.field10, var26.field3189 - class260.field4592, var26.field3187 - class311.field5381, var26.field3184, var5, (class165) null);
                                                }
                                            }
                                            if (var27 != null && !class216.method1480(var6, var3, var4, var27.field513.method95())) {
                                                if (class231.field4051) {
                                                    class231.method1581(var8 - 0.5F);
                                                }
                                                if ((var27.field495 & var25) != 0) {
                                                    if (class231.field4051) {
                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                    }
                                                    var27.field513.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var27.field496 + var27.field497 - class1.field10, var27.field498 - class260.field4592, var27.field501 + var27.field507 - class311.field5381, var27.field502, var5, (class165) null);
                                                } else if (var27.field495 == 256) {
                                                    int var28 = var27.field496 - class1.field10;
                                                    int var29 = var27.field498 - class260.field4592;
                                                    int var30 = var27.field501 - class311.field5381;
                                                    int var31 = var27.field503;
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
                                                        if (class231.field4051) {
                                                            class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                        }
                                                        var27.field513.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var27.field497 + var28, var29, var27.field507 + var30, var27.field502, var5, (class165) null);
                                                    } else if (var27.field510 != null) {
                                                        if (class231.field4051) {
                                                            class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                        }
                                                        var27.field510.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var28, var29, var30, var27.field502, var5, (class165) null);
                                                    }
                                                }
                                                if (class231.field4051) {
                                                    class231.method1581(var8);
                                                }
                                            }
                                            if (var22) {
                                                class258 var34 = var2.field1141;
                                                if (var34 != null && (var34.field4560 & 0x80000000L) == 0L) {
                                                    if (class231.field4051 && var34.field4561) {
                                                        class231.method1581(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class231.field4051) {
                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                    }
                                                    var34.field4557.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var34.field4563 - class1.field10, var34.field4553 - class260.field4592, var34.field4559 - class311.field5381, var34.field4560, var5, (class165) null);
                                                    if (class231.field4051 && var34.field4561) {
                                                        class231.method1581(var8);
                                                    }
                                                }
                                                class220 var35 = var2.field1124;
                                                if (var35 != null && var35.field3912 == 0) {
                                                    if (class231.field4051) {
                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                    }
                                                    if (var35.field3918 != null) {
                                                        var35.field3918.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var35.field3907 - class1.field10, var35.field3909 - class260.field4592, var35.field3920 - class311.field5381, var35.field3922, var5, (class165) null);
                                                    }
                                                    if (var35.field3914 != null) {
                                                        var35.field3914.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var35.field3907 - class1.field10, var35.field3909 - class260.field4592, var35.field3920 - class311.field5381, var35.field3922, var5, (class165) null);
                                                    }
                                                    if (var35.field3908 != null) {
                                                        var35.field3908.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var35.field3907 - class1.field10, var35.field3909 - class260.field4592, var35.field3920 - class311.field5381, var35.field3922, var5, (class165) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field1142;
                                            if (var36 != 0) {
                                                if (var3 < class209.field3730 && (var36 & 0x4) != 0) {
                                                    class74 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field1138) {
                                                        class186.field3416.method5(var37, (byte) -116);
                                                    }
                                                }
                                                if (var4 < class131.field2237 && (var36 & 0x2) != 0) {
                                                    class74 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field1138) {
                                                        class186.field3416.method5(var38, (byte) 100);
                                                    }
                                                }
                                                if (var3 > class209.field3730 && (var36 & 0x1) != 0) {
                                                    class74 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field1138) {
                                                        class186.field3416.method5(var39, (byte) 19);
                                                    }
                                                }
                                                if (var4 > class131.field2237 && (var36 & 0x8) != 0) {
                                                    class74 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field1138) {
                                                        class186.field3416.method5(var40, (byte) 110);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1132 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field1119; var42++) {
                                                if (class60.field960 != var2.field1118[var42].field5572 && (var2.field1133[var42] & var2.field1132) == var2.field1137) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class174 var43 = var2.field1117;
                                                if (!class216.method1484(var6, var3, var4, var43.field3178)) {
                                                    if (class231.field4051) {
                                                        label1026: {
                                                            if ((var43.field3184 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3181 - class1.field10;
                                                                int var45 = var43.field3187 - class311.field5381;
                                                                int var46 = (int) (var43.field3184 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class325.field5535 - 1) {
                                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3 - 1, var4 + 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class320.field5489 - 1 && var4 < class325.field5535 - 1) {
                                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3 + 1, var4 + 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class320.field5489 - 1 && var4 > 0) {
                                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3 + 1, var4 - 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3 - 1, var4 - 1);
                                                                        break label1026;
                                                                    }
                                                                }
                                                            }
                                                            class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field3183.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var43.field3181 - class1.field10, var43.field3189 - class260.field4592, var43.field3187 - class311.field5381, var43.field3184, var5, (class165) null);
                                                }
                                                var2.field1132 = 0;
                                            }
                                        }
                                        if (!var2.field1145) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field1119;
                                            var2.field1145 = false;
                                            int var48 = 0;
                                            label832: for (int var49 = 0; var49 < var47; var49++) {
                                                class326 var50 = var2.field1118[var49];
                                                if (class60.field960 != var50.field5572) {
                                                    for (int var51 = var50.field5575; var51 <= var50.field5568; var51++) {
                                                        for (int var52 = var50.field5576; var52 <= var50.field5561; var52++) {
                                                            class74 var53 = var7[var51][var52];
                                                            if (var53.field1114) {
                                                                var2.field1145 = true;
                                                                continue label832;
                                                            }
                                                            if (var53.field1132 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field5575) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field5568) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field5576) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field5561) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field1132) == var2.field1127) {
                                                                    var2.field1145 = true;
                                                                    continue label832;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class72.field1098[var48++] = var50;
                                                    int var55 = class209.field3730 - var50.field5575;
                                                    int var56 = var50.field5568 - class209.field3730;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class131.field2237 - var50.field5576;
                                                    int var58 = var50.field5561 - class131.field2237;
                                                    if (var58 > var57) {
                                                        var50.field5552 = var55 + var58;
                                                    } else {
                                                        var50.field5552 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class326 var62 = class72.field1098[var61];
                                                    if (class60.field960 != var62.field5572) {
                                                        if (var62.field5552 > var59) {
                                                            var59 = var62.field5552;
                                                            var60 = var61;
                                                        } else if (var62.field5552 == var59) {
                                                            int var63 = var62.field5560 - class1.field10;
                                                            int var64 = var62.field5549 - class311.field5381;
                                                            int var65 = class72.field1098[var60].field5560 - class1.field10;
                                                            int var66 = class72.field1098[var60].field5549 - class311.field5381;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class326 var67 = class72.field1098[var60];
                                                var67.field5572 = class60.field960;
                                                if (!class277.method1996(var6, var67.field5575, var67.field5568, var67.field5576, var67.field5561, var67.field5570.method95())) {
                                                    if (class231.field4051) {
                                                        if ((var67.field5563 & 0xFC000L) == 147456L) {
                                                            class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                                                            int var68 = var67.field5560 - class1.field10;
                                                            int var69 = var67.field5549 - class311.field5381;
                                                            int var70 = (int) (var67.field5563 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class267.method1932(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class267.method1932(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class267.method1932(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class267.method1932(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class267.method1934(class1.field10, class260.field4592, class311.field5381, var5, var67.field5575, var67.field5576, var67.field5568, var67.field5561);
                                                        }
                                                    }
                                                    var67.field5570.method98(var67.field5566, field1912, class273.field4803, class195.field3522, class61.field980, var67.field5560 - class1.field10, var67.field5550 - class260.field4592, var67.field5549 - class311.field5381, var67.field5563, var5, (class165) null);
                                                }
                                                for (int var71 = var67.field5575; var71 <= var67.field5568; var71++) {
                                                    for (int var72 = var67.field5576; var72 <= var67.field5561; var72++) {
                                                        class74 var73 = var7[var71][var72];
                                                        if (var73.field1132 != 0) {
                                                            class186.field3416.method5(var73, (byte) 17);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field1138) {
                                                            class186.field3416.method5(var73, (byte) -121);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1145) {
                                                break;
                                            }
                                        } catch (Exception var133) {
                                            var2.field1145 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field1129 != null) {
                                        if (class231.field4051) {
                                            GL var75 = class231.field4052;
                                            class165.method1159(class1.field10, class260.field4592, class311.field5381);
                                            int var76 = var2.field1116 * 128 + 64 - class1.field10;
                                            int var77 = class278.field4883[var5][var2.field1116][var2.field1126] - class260.field4592;
                                            int var78 = var2.field1126 * 128 + 64 - class311.field5381;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class278.field4883[var5][var2.field1116][var2.field1126] - class278.field4883[var5 + 1][var2.field1116][var2.field1126];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class61.field980 * var78 - class195.field3522 * var76 >> 16;
                                            int var81 = class273.field4803 * var80 + field1912 * var77 >> 16;
                                            int var82 = (class273.field4803 * 92 + field1912 * 0 >> 16) + var81;
                                            int var83 = (class273.field4803 * -92 - field1912 * var79 >> 16) + var81;
                                            int var84 = var82 + 2 - var83;
                                            class226 var85 = null;
                                            class126 var86 = null;
                                            int var87 = -1;
                                            class226 var88 = (class226) var2.field1129.method1844(true);
                                            while (true) {
                                                label1042: {
                                                    if (var88 != null) {
                                                        if (var88.field3980 == null || var88.field3980.field2112.field2946) {
                                                            var88.method268(17450);
                                                            break label1042;
                                                        }
                                                        if ((byte) ((int) (var88.field3980.field2112.field2933 & 0xFFL)) != var2.field1134) {
                                                            var2.field1129 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field3980;
                                                            var87 = var86.field2127.field3324;
                                                            break label1042;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field3980 != var86 || var88.field3980.field2127.field3324 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class165.field2978[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class165.field2954[var90] = 0;
                                                        }
                                                        class165.field2953 = 0;
                                                        for (class226 var91 = var85; var91 != var88; var91 = (class226) var91.field3926) {
                                                            if (var91.field3980 != null) {
                                                                int var92 = (var91.field3969 >> 12) - class1.field10;
                                                                int var93 = (var91.field3975 >> 12) - class260.field4592;
                                                                int var94 = (var91.field3971 >> 12) - class311.field5381;
                                                                int var95 = class61.field980 * var94 - class195.field3522 * var92 >> 16;
                                                                int var96 = (class273.field4803 * var95 + field1912 * var93 >> 16) - var83;
                                                                if (class165.field2978[var96] < 32) {
                                                                    class165.field2955[var96][class165.field2978[var96]++] = var91.field3968;
                                                                } else {
                                                                    if (class165.field2978[var96] == 32) {
                                                                        if (class165.field2953 == 32) {
                                                                            if (class165.field2943) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class165.field2978[var96] += class165.field2953++ + 1;
                                                                    }
                                                                    int var97 = class165.field2954[class165.field2978[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class165.field2972[class165.field2978[var96] - 32 - 1];
                                                                        int var10002 = class165.field2978[var96] - 32 - 1;
                                                                        int var10004 = class165.field2954[class165.field2978[var96] - 32 - 1];
                                                                        class165.field2954[var10002] = class165.field2954[class165.field2978[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field3968;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field1129.field4580 == var91.field3926) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class165.field2935 && var86.field2127.field3297 != -1) {
                                                            class263.field4661.method583(22259, var86.field2127.field3297);
                                                            var98 = true;
                                                        } else {
                                                            class231.method1597(-1);
                                                        }
                                                        var75.glPointSize((float) var87);
                                                        var86.field2112.method1144(var75, var84, var98, var86.field2127.field3261);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field3980;
                                                            var87 = var88.field3980.field2127.field3324;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class226) var2.field1129.method1843(0);
                                            }
                                            class165.method1153();
                                        } else {
                                            int var99 = class263.field4658 + class165.field2945;
                                            int var100 = class263.field4662 + class165.field2939;
                                            class221 var101 = var2.field1129.field4580;
                                            for (class221 var102 = var101.field3926; var102 != var101; var102 = var102.field3926) {
                                                class226 var103 = (class226) var102;
                                                if (var103.field3980 != null && !var103.field3980.field2112.field2946) {
                                                    if ((byte) ((int) (var103.field3980.field2112.field2933 & 0xFFL)) != var2.field1134) {
                                                        var2.field1129 = null;
                                                        break;
                                                    }
                                                    int var104 = (var103.field3969 >> 12) - class1.field10;
                                                    int var105 = (var103.field3975 >> 12) - class260.field4592;
                                                    int var106 = (var103.field3971 >> 12) - class311.field5381;
                                                    int var107 = class61.field980 * var104 + class195.field3522 * var106 >> 16;
                                                    int var108 = class61.field980 * var106 - class195.field3522 * var104 >> 16;
                                                    int var110 = class273.field4803 * var105 - field1912 * var108 >> 16;
                                                    int var111 = class273.field4803 * var108 + field1912 * var105 >> 16;
                                                    if (var111 >= 50) {
                                                        int var113 = (var107 << 9) / var111 + var99;
                                                        int var114 = (var110 << 9) / var111 + var100;
                                                        class28.method199(var113, var114, var103.field3980.field2127.field3324 >> 2, var103.field3973, var103.field3973 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field1138);
                            } while (var2.field1132 != 0);
                            if (var3 > class209.field3730 || var3 <= class269.field4719) {
                                break;
                            }
                            var115 = var7[var3 - 1][var4];
                        } while (var115 != null && var115.field1138);
                        if (var3 < class209.field3730 || var3 >= class64.field1024 - 1) {
                            break;
                        }
                        var116 = var7[var3 + 1][var4];
                    } while (var116 != null && var116.field1138);
                    if (var4 > class131.field2237 || var4 <= class62.field992) {
                        break;
                    }
                    var117 = var7[var3][var4 - 1];
                } while (var117 != null && var117.field1138);
                if (var4 < class131.field2237 || var4 >= class14.field188 - 1) {
                    break;
                }
                var118 = var7[var3][var4 + 1];
            } while (var118 != null && var118.field1138);
            var2.field1138 = false;
            class103.field1804--;
            class220 var119 = var2.field1124;
            if (var119 != null && var119.field3912 != 0) {
                if (class231.field4051) {
                    class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                }
                if (var119.field3918 != null) {
                    var119.field3918.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var119.field3907 - class1.field10, var119.field3909 - class260.field4592 - var119.field3912, var119.field3920 - class311.field5381, var119.field3922, var5, (class165) null);
                }
                if (var119.field3914 != null) {
                    var119.field3914.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var119.field3907 - class1.field10, var119.field3909 - class260.field4592 - var119.field3912, var119.field3920 - class311.field5381, var119.field3922, var5, (class165) null);
                }
                if (var119.field3908 != null) {
                    var119.field3908.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var119.field3907 - class1.field10, var119.field3909 - class260.field4592 - var119.field3912, var119.field3920 - class311.field5381, var119.field3922, var5, (class165) null);
                }
            }
            if (var2.field1123 != 0) {
                class36 var120 = var2.field1140;
                if (var120 != null && !class216.method1480(var6, var3, var4, var120.field513.method95())) {
                    if ((var120.field495 & var2.field1123) != 0) {
                        if (class231.field4051) {
                            class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                        }
                        var120.field513.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var120.field496 + var120.field497 - class1.field10, var120.field498 - class260.field4592, var120.field501 + var120.field507 - class311.field5381, var120.field502, var5, (class165) null);
                    } else if (var120.field495 == 256) {
                        int var121 = var120.field496 - class1.field10;
                        int var122 = var120.field498 - class260.field4592;
                        int var123 = var120.field501 - class311.field5381;
                        int var124 = var120.field503;
                        int var125;
                        if (var124 == 1 || var124 == 2) {
                            var125 = -var121;
                        } else {
                            var125 = var121;
                        }
                        int var126;
                        if (var124 == 2 || var124 == 3) {
                            var126 = -var123;
                        } else {
                            var126 = var123;
                        }
                        if (var126 >= var125) {
                            if (class231.field4051) {
                                class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                            }
                            var120.field513.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var120.field497 + var121, var122, var120.field507 + var123, var120.field502, var5, (class165) null);
                        } else if (var120.field510 != null) {
                            if (class231.field4051) {
                                class267.method1927(class1.field10, class260.field4592, class311.field5381, var5, var3, var4);
                            }
                            var120.field510.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var121, var122, var123, var120.field502, var5, (class165) null);
                        }
                    }
                }
                class174 var127 = var2.field1117;
                if (var127 != null) {
                    if ((var127.field3175 & var2.field1123) != 0 && !class216.method1484(var6, var3, var4, var127.field3175)) {
                        if (class231.field4051) {
                            class267.method1926(var127.field3175, class1.field10, class260.field4592, class311.field5381, var6, var3, var4);
                        }
                        var127.field3173.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var127.field3181 - class1.field10, var127.field3189 - class260.field4592, var127.field3187 - class311.field5381, var127.field3184, var5, (class165) null);
                    }
                    if ((var127.field3178 & var2.field1123) != 0 && !class216.method1484(var6, var3, var4, var127.field3178)) {
                        if (class231.field4051) {
                            class267.method1926(var127.field3178, class1.field10, class260.field4592, class311.field5381, var6, var3, var4);
                        }
                        var127.field3183.method98(0, field1912, class273.field4803, class195.field3522, class61.field980, var127.field3181 - class1.field10, var127.field3189 - class260.field4592, var127.field3187 - class311.field5381, var127.field3184, var5, (class165) null);
                    }
                }
            }
            if (var5 < class60.field893 - 1) {
                class74 var128 = class99.field1759[var5 + 1][var3][var4];
                if (var128 != null && var128.field1138) {
                    class186.field3416.method5(var128, (byte) 115);
                }
            }
            if (var3 < class209.field3730) {
                class74 var129 = var7[var3 + 1][var4];
                if (var129 != null && var129.field1138) {
                    class186.field3416.method5(var129, (byte) -121);
                }
            }
            if (var4 < class131.field2237) {
                class74 var130 = var7[var3][var4 + 1];
                if (var130 != null && var130.field1138) {
                    class186.field3416.method5(var130, (byte) -117);
                }
            }
            if (var3 > class209.field3730) {
                class74 var131 = var7[var3 - 1][var4];
                if (var131 != null && var131.field1138) {
                    class186.field3416.method5(var131, (byte) 124);
                }
            }
            if (var4 > class131.field2237) {
                class74 var132 = var7[var3][var4 - 1];
                if (var132 != null && var132.field1138) {
                    class186.field3416.method5(var132, (byte) 39);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([[II)V", line = 1287)
    public static final void method795(int[][] arg0, int arg1) {
        class106.field1839 = arg0;
        field1911++;
        if (arg1 < 37) {
            method792(64, (Random) null, 122);
        }
    }
}
