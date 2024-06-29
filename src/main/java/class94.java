import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 {

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[I")
    private int[] field2173;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2162 = 0;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lec;")
    public static class32 field2163 = class73.method594("Art", true);

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lec;")
    private static class32 field2164 = class73.method594(" from your friend list first", true);

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Z")
    public static boolean field2166 = false;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lec;")
    public static class32 field2180 = field2164;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lec;")
    private static class32 field2182 = class73.method594("red:", true);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lec;")
    public static class32 field2165 = field2182;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Lec;")
    public static class32 field2179 = field2182;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lec;")
    public static class32 field2174 = class73.method594("Bitte warten Sie)3)3)3", true);

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lja;")
    public static class63 field2172 = new class63(64);

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lec;")
    public static class32 field2184 = class73.method594("<col=ffff00>", true);

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lec;")
    public static class32 field2185 = class73.method594(":assistreq:", true);

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[I")
    public static int[] field2171;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILea;I)[Lh;")
    public static final class49[] method741(byte arg0, int arg1, class30 arg2, int arg3) {
        field2175++;
        if (class28.method193(arg3, arg2, -308039560, arg1)) {
            if (arg0 <= 30) {
                method747((byte) 3);
            }
            return class1.method1(9590);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
    public static final void method742(int arg0, boolean arg1) {
        field2181++;
        if (class4.field81 == null) {
            return;
        }
        try {
            class66 var2 = new class66(4);
            var2.method515((byte) 100, arg1 ? 2 : 3);
            var2.method551(-31368, arg0);
            class4.field81.method49(var2.field1587, 4, 0, (byte) 127);
        } catch (IOException var4) {
            try {
                class4.field81.method52(-79);
            } catch (Exception var3) {
            }
            class4.field81 = null;
            class61.field1356++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Lhb;")
    public static final class51 method743(int arg0) {
        field2178++;
        class51 var1 = new class51();
        var1.field1167 = class31.field616;
        var1.field1171 = class70.field1639[arg0];
        var1.field1165 = class147.field3346[0];
        var1.field1169 = class128.field2967;
        var1.field1170 = class152.field3508;
        var1.field1172 = class34.field720[0];
        var1.field1166 = class74.field1747[0];
        var1.field1168 = class126.field2927[0];
        class70.method580((byte) 29);
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Z")
    public static final boolean method744(int arg0, byte arg1) {
        if (arg1 >= -90) {
            method747((byte) 96);
        }
        field2170++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)I")
    public final int method745(byte arg0, int arg1) {
        field2177++;
        if (arg0 != 46) {
            return 117;
        }
        int var3 = this.field2173.length - 2;
        int var4 = arg1 << 1 & var3;
        while (true) {
            int var5 = this.field2173[var4];
            if (arg1 == var5) {
                return this.field2173[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILec;B)V")
    public static final void method746(int arg0, class32 arg1, byte arg2) {
        class44.field1027.method357(205, -89);
        if (arg2 >= 62) {
            class44.field1027.method548(arg0, (byte) -121);
            field2169++;
            class82.field1911++;
            class44.field1027.method513(32, arg1.method259(0));
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method747(byte arg0) {
        field2167++;
        if (arg0 == -96) {
            class32.field656 = null;
            class112.field2633 = null;
            class102.field2397 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([I)V")
    public class94(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field2173 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2173[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2173[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2173[var5 + var5] = arg0[var4];
            this.field2173[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public static final void method748(int arg0) {
        class158.field3614.method352(arg0 ^ 0xB);
        int var1 = class158.field3614.method353(8, (byte) 69);
        field2183++;
        if (var1 < class102.field2399) {
            for (int var2 = var1; var2 < class102.field2399; var2++) {
                class27.field495[class102.field2393++] = class15.field313[var2];
            }
        }
        if (class102.field2399 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class102.field2399 = 0;
        if (arg0 != 3) {
            field2176 = -113;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class15.field313[var3];
            class111 var5 = class14.field230[var4];
            int var6 = class158.field3614.method353(1, (byte) 69);
            if (var6 == 0) {
                class15.field313[class102.field2399++] = var4;
                var5.field2715 = class140.field3219;
            } else {
                int var7 = class158.field3614.method353(2, (byte) 69);
                if (var7 == 0) {
                    class15.field313[class102.field2399++] = var4;
                    var5.field2715 = class140.field3219;
                    class62.field1419[class61.field1353++] = var4;
                } else if (var7 == 1) {
                    class15.field313[class102.field2399++] = var4;
                    var5.field2715 = class140.field3219;
                    int var8 = class158.field3614.method353(3, (byte) 69);
                    var5.method902(var8, false, 0);
                    int var9 = class158.field3614.method353(1, (byte) 69);
                    if (var9 == 1) {
                        class62.field1419[class61.field1353++] = var4;
                    }
                } else if (var7 == 2) {
                    class15.field313[class102.field2399++] = var4;
                    var5.field2715 = class140.field3219;
                    int var10 = class158.field3614.method353(3, (byte) 69);
                    var5.method902(var10, true, 0);
                    int var11 = class158.field3614.method353(3, (byte) 69);
                    var5.method902(var11, true, arg0 - 3);
                    int var12 = class158.field3614.method353(1, (byte) 69);
                    if (var12 == 1) {
                        class62.field1419[class61.field1353++] = var4;
                    }
                } else if (var7 == 3) {
                    class27.field495[class102.field2393++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method749(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2168++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class100.field2319[var12][var36] = 0;
                class53.field1240[var12][var36] = 99999999;
            }
        }
        class100.field2319[arg7][arg2] = 99;
        class53.field1240[arg7][arg2] = 0;
        int var13 = arg7;
        int var14 = arg2;
        int var15 = 0;
        byte var16 = 0;
        class68.field1601[var16] = arg7;
        boolean var17 = false;
        int var37 = var16 + 1;
        class75.field1760[var16] = arg2;
        int var18 = class68.field1601.length;
        int[][] var19 = class105.field2484[class43.field990].field2813;
        while (var15 != var37) {
            var14 = class75.field1760[var15];
            var13 = class68.field1601[var15];
            var15 = (var15 + 1) % var18;
            if (arg6 == var13 && arg9 == var14) {
                var17 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class105.field2484[class43.field990].method932(arg1, -4573, arg9, var14, arg6, arg4 - 1, var13)) {
                    var17 = true;
                    break;
                }
                if (arg4 < 10 && class105.field2484[class43.field990].method917(-92, arg6, arg4 - 1, arg1, var13, var14, arg9)) {
                    var17 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg5 != 0 && class105.field2484[class43.field990].method921(var14, arg10, arg5, var13, arg9, arg6, arg8, (byte) 5)) {
                var17 = true;
                break;
            }
            int var35 = class53.field1240[var13][var14] + 1;
            if (var13 > 0 && class100.field2319[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class68.field1601[var37] = var13 - 1;
                class75.field1760[var37] = var14;
                var37 = (var37 + 1) % var18;
                class100.field2319[var13 - 1][var14] = 2;
                class53.field1240[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class100.field2319[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class68.field1601[var37] = var13 + 1;
                class75.field1760[var37] = var14;
                var37 = (var37 + 1) % var18;
                class100.field2319[var13 + 1][var14] = 8;
                class53.field1240[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class100.field2319[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class68.field1601[var37] = var13;
                class75.field1760[var37] = var14 - 1;
                class100.field2319[var13][var14 - 1] = 1;
                class53.field1240[var13][var14 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 < 103 && class100.field2319[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class68.field1601[var37] = var13;
                class75.field1760[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class100.field2319[var13][var14 + 1] = 4;
                class53.field1240[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class100.field2319[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class68.field1601[var37] = var13 - 1;
                class75.field1760[var37] = var14 - 1;
                class100.field2319[var13 - 1][var14 - 1] = 3;
                var37 = (var37 + 1) % var18;
                class53.field1240[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class100.field2319[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class68.field1601[var37] = var13 + 1;
                class75.field1760[var37] = var14 - 1;
                class100.field2319[var13 + 1][var14 - 1] = 9;
                class53.field1240[var13 + 1][var14 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var14 < 103 && class100.field2319[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class68.field1601[var37] = var13 - 1;
                class75.field1760[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class100.field2319[var13 - 1][var14 + 1] = 6;
                class53.field1240[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class100.field2319[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class68.field1601[var37] = var13 + 1;
                class75.field1760[var37] = var14 + 1;
                class100.field2319[var13 + 1][var14 + 1] = 12;
                var37 = (var37 + 1) % var18;
                class53.field1240[var13 + 1][var14 + 1] = var35;
            }
        }
        class57.field1328 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg6 - var22; var23 <= arg6 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class53.field1240[var23][var24] < 100) {
                        int var25 = 0;
                        if (var24 < arg9) {
                            var25 = arg9 - var24;
                        } else if (var24 > arg5 + arg9 - 1) {
                            var25 = var24 + 1 - arg5 - arg9;
                        }
                        int var26 = 0;
                        if (var23 < arg6) {
                            var26 = arg6 - var23;
                        } else if (var23 > arg6 + arg10 - 1) {
                            var26 = var23 + 1 - arg10 - arg6;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class53.field1240[var23][var24]) {
                            var13 = var23;
                            var14 = var24;
                            var20 = var27;
                            var21 = class53.field1240[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg7 == var13 && arg2 == var14) {
                return false;
            }
            class57.field1328 = 1;
        }
        byte var28 = 0;
        if (arg3 != -1) {
            field2185 = null;
        }
        class68.field1601[var28] = var13;
        int var38 = var28 + 1;
        class75.field1760[var28] = var14;
        int var29;
        int var30 = var29 = class100.field2319[var13][var14];
        while (arg7 != var13 || arg2 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class68.field1601[var38] = var13;
                class75.field1760[var38++] = var14;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class100.field2319[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class75.field1760[var38];
            int var33 = class68.field1601[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            if (arg11 == 0) {
                class15.field305++;
                class44.field1027.method357(184, -127);
                class44.field1027.method515((byte) 103, var31 + var31 + 3);
            }
            if (arg11 == 1) {
                class134.field3113++;
                class44.field1027.method357(24, arg3 ^ 0x4F);
                class44.field1027.method515((byte) 90, var31 + var31 + 17);
            }
            if (arg11 == 2) {
                class44.field1027.method357(110, -128);
                class17.field349++;
                class44.field1027.method515((byte) 103, var31 + var31 + 3);
            }
            class44.field1027.method505(-2144754000, var33 + class72.field1701);
            class45.field1067 = class68.field1601[0];
            class31.field615 = class75.field1760[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class44.field1027.method534(class68.field1601[var38] - var33, false);
                class44.field1027.method507((byte) -15, class75.field1760[var38] - var32);
            }
            class44.field1027.method534(class107.field2542[82] ? 1 : 0, false);
            class44.field1027.method514(var32 + class118.field2838, (byte) -76);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public static void method750(byte arg0) {
        field2171 = null;
        field2185 = null;
        field2172 = null;
        field2164 = null;
        if (arg0 != 0) {
            method746(8, null, (byte) -110);
        }
        field2184 = null;
        field2163 = null;
        field2165 = null;
        field2180 = null;
        field2182 = null;
        field2174 = null;
        field2179 = null;
    }
}
