import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class109 extends class51 {

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public int field1942 = 0;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
    public int field1946 = -1;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public int field1948 = 12800;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public int field1947 = 0;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public int field1957 = 12800;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "Z")
    public boolean field1956 = true;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lhi;")
    public class82 field1955;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Lhi;")
    public class82 field1940;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Lam;")
    public class277 field1938;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "Lhi;")
    public static class82 field1941 = class95.method664((byte) -38, "details");

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field1949 = -1;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)I", line = 13)
    public static final int method743(int arg0, int arg1, byte arg2) {
        int var3 = 7 / ((-arg2 - 65) / 39);
        field1945++;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 13 ^ var4;
        int var6 = Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589;
        return (var6 & 0x7FBD3D5) >> 19;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)I", line = 36)
    public static final int method744(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1944++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else if (arg1 == 107) {
            return 7 - arg3;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)Z", line = 57)
    public final boolean method745(byte arg0, int arg1, int arg2) {
        field1950++;
        if (arg1 < this.field1957 || this.field1942 < arg1 || this.field1948 > arg2 || this.field1947 < arg2) {
            return false;
        }
        for (class235 var4 = (class235) this.field1938.method1936(16173); var4 != null; var4 = (class235) this.field1938.method1926((byte) 90)) {
            if (var4.method1671(arg1, arg2, 0)) {
                return true;
            }
        }
        if (arg0 != 16) {
            method748(78);
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lhi;Lhi;IIIZ)V", line = 689)
    public class109(class82 arg0, class82 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1955 = arg0;
        this.field1940 = arg1;
        this.field1956 = arg5;
        this.field1939 = arg2;
        this.field1936 = arg3;
        this.field1946 = arg4;
        this.field1938 = new class277();
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V", line = 90)
    public static void method746(int arg0) {
        field1941 = null;
        if (arg0 != -4) {
            method744(108, (byte) 20, -60, -21);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIII)V", line = 104)
    public static final void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1943++;
        int var9 = arg8 - arg6;
        int var10 = arg2 - arg1;
        int var11 = (arg7 - arg0 << 16) / var9;
        int var12 = (arg3 - arg5 << 16) / var10;
        class143.method972(arg5, arg4, arg1, arg2, var11, 0, (byte) -61, var12, arg6, arg0, arg8);
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V", line = 131)
    public static final void method748(int arg0) {
        if (class226.field3915 < 128) {
            class226.field3915 = 128;
        }
        class219.field3804 &= 0x7FF;
        int var1 = class142.field2434 >> 7;
        if (class226.field3915 > 383) {
            class226.field3915 = 383;
        }
        int var2 = class114.field2046 >> 7;
        if (arg0 < 34) {
            method743(48, 102, (byte) -64);
        }
        field1954++;
        int var3 = class21.method145(class142.field2434, class114.field2046, class297.field5058, (byte) -110);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class297.field5058;
                    if (var7 < 3 && (class204.field3567[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class153.field2608[var7][var5][var6] & 0xFF) * 8 + var3 - class245.field4255[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class285.field4794 < var9) {
            class285.field4794 += (var9 - class285.field4794) / 24;
        } else if (class285.field4794 > var9) {
            class285.field4794 += (var9 - class285.field4794) / 80;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V", line = 209)
    public static final void method749(byte arg0) {
        field1937++;
        if (class264.method1877(arg0 ^ 0x4E) != 2) {
            return;
        }
        byte var1 = (byte) (class47.field789 - 4 & 0xFF);
        int var2 = class47.field789 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class138.field2376[var3][var2][var4] = var1;
            }
        }
        if (class297.field5058 == 3) {
            return;
        }
        if (arg0 != 79) {
            method747(7, 67, 107, -63, -117, -101, -15, 114, 4);
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class291.field4883[var5] = -1000000;
            class44.field761[var5] = 1000000;
            class224.field3892[var5] = 0;
            class98.field1775[var5] = 1000000;
            class28.field388[var5] = 0;
        }
        if (class273.field4602 != 1) {
            int var6 = class21.method145(class219.field3792, class4.field32, class297.field5058, (byte) 45);
            if (var6 - class134.field2322 < 800 && (class204.field3567[class297.field5058][class219.field3792 >> 7][class4.field32 >> 7] & 0x4) != 0) {
                class286.method1987(class219.field3792 >> 7, class15.field120, 0, class4.field32 >> 7, 1, false);
            }
            return;
        }
        if ((class204.field3567[class297.field5058][class168.field2932.field1685 >> 7][class168.field2932.field1689 >> 7] & 0x4) != 0) {
            class286.method1987(class168.field2932.field1685 >> 7, class15.field120, 0, class168.field2932.field1689 >> 7, 0, false);
        }
        if (class197.field3380 >= 310) {
            return;
        }
        int var7 = class219.field3792 >> 7;
        int var8 = class4.field32 >> 7;
        int var9 = class168.field2932.field1685 >> 7;
        int var10 = class168.field2932.field1689 >> 7;
        int var11;
        if (var7 >= var9) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        int var12;
        if (var8 < var10) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        if (var12 < var11) {
            int var15 = var12 * 65536 / var11;
            int var16 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class204.field3567[class297.field5058][var7][var8] & 0x4) != 0) {
                    class286.method1987(var7, class15.field120, 0, var8, 1, false);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    var16 -= 65536;
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    if ((class204.field3567[class297.field5058][var7][var8] & 0x4) != 0) {
                        class286.method1987(var7, class15.field120, 0, var8, 1, false);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var11 * 65536 / var12;
        int var14 = 32768;
        while (var8 != var10) {
            if (var10 > var8) {
                var8++;
            } else if (var8 > var10) {
                var8--;
            }
            if ((class204.field3567[class297.field5058][var7][var8] & 0x4) != 0) {
                class286.method1987(var7, class15.field120, 0, var8, 1, false);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var9 > var7) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                var14 -= 65536;
                if ((class204.field3567[class297.field5058][var7][var8] & 0x4) != 0) {
                    class286.method1987(var7, class15.field120, 0, var8, 1, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V", line = 394)
    public static final void method750(int arg0, boolean arg1) {
        class182.field3115 = arg1;
        field1953++;
        if (class182.field3115) {
            int var2 = class35.field545.method1068(-13190);
            int var3 = class35.field545.method1090(false);
            int var4 = class35.field545.method1076(-42);
            int var5 = class35.field545.method1100(-32768);
            int var6 = class35.field545.method1078(false);
            class35.field545.method1495(-92);
            for (int var7 = 0; var7 < 4; var7++) {
                for (int var8 = 0; var8 < 13; var8++) {
                    for (int var9 = 0; var9 < 13; var9++) {
                        int var10 = class35.field545.method1499((byte) -125, 1);
                        if (var10 == 1) {
                            class89.field1600[var7][var8][var9] = class35.field545.method1499((byte) -51, 26);
                        } else {
                            class89.field1600[var7][var8][var9] = -1;
                        }
                    }
                }
            }
            class35.field545.method1506(-37);
            int var11 = (class199.field3421 - class35.field545.field2611) / 16;
            class160.field2793 = new int[var11][4];
            for (int var12 = 0; var12 < var11; var12++) {
                for (int var13 = 0; var13 < 4; var13++) {
                    class160.field2793[var12][var13] = class35.field545.method1097((byte) -90);
                }
            }
            class56.field914 = new int[var11];
            class149.field2526 = null;
            class107.field1902 = (byte[][]) null;
            class199.field3424 = new int[var11];
            class123.field2147 = new byte[var11][];
            class36.field590 = new byte[var11][];
            class71.field1094 = new byte[var11][];
            class104.field1838 = new int[var11];
            class129.field2242 = new int[var11];
            class287.field4830 = new byte[var11][];
            class93.field1664 = new int[var11];
            int var14 = 0;
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class89.field1600[var15][var16][var17];
                        if (var18 != -1) {
                            int var19 = var18 >> 14 & 0x3FF;
                            int var20 = (var18 & 0x3FF8) >> 3;
                            int var21 = (var19 / 8 << 8) + var20 / 8;
                            for (int var22 = 0; var22 < var14; var22++) {
                                if (class93.field1664[var22] == var21) {
                                    var21 = -1;
                                    break;
                                }
                            }
                            if (var21 != -1) {
                                int var23 = var21 >> 8 & 0xFF;
                                class93.field1664[var14] = var21;
                                int var24 = var21 & 0xFF;
                                class56.field914[var14] = class184.field3134.method1594(class29.method182(class143.method974(arg0, 27411), new class82[] { class260.field4464, class327.method2240((byte) -74, var23), class311.field5315, class327.method2240((byte) -74, var24) }), -64);
                                class129.field2242[var14] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class298.field5068, class327.method2240((byte) -74, var23), class311.field5315, class327.method2240((byte) -74, var24) }), arg0 + 31803);
                                class199.field3424[var14] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class124.field2165, class327.method2240((byte) -74, var23), class311.field5315, class327.method2240((byte) -74, var24) }), arg0 + 31786);
                                class104.field1838[var14] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class149.field2543, class327.method2240((byte) -74, var23), class311.field5315, class327.method2240((byte) -74, var24) }), class143.method974(arg0, 31998));
                                var14++;
                            }
                        }
                    }
                }
            }
            class192.method1336(var4, -123, var5, var2, false, var3, var6);
        } else {
            int var25 = (class199.field3421 - class35.field545.field2611) / 16;
            class160.field2793 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var27 = 0; var27 < 4; var27++) {
                    class160.field2793[var26][var27] = class35.field545.method1077(-98);
                }
            }
            int var28 = class35.field545.method1100(-32768);
            int var29 = class35.field545.method1090(false);
            int var30 = class35.field545.method1090(false);
            int var31 = class35.field545.method1078(false);
            int var32 = class35.field545.method1105((byte) -20);
            class149.field2526 = null;
            class129.field2242 = new int[var25];
            class107.field1902 = (byte[][]) null;
            class36.field590 = new byte[var25][];
            class56.field914 = new int[var25];
            class287.field4830 = new byte[var25][];
            boolean var33 = false;
            class93.field1664 = new int[var25];
            if ((var31 / 8 == 48 || (var31 / 8) == 49) && var30 / 8 == 48) {
                var33 = true;
            }
            class104.field1838 = new int[var25];
            if ((var31 / 8) == 48 && var30 / 8 == 148) {
                var33 = true;
            }
            class123.field2147 = new byte[var25][];
            class71.field1094 = new byte[var25][];
            class199.field3424 = new int[var25];
            int var34 = 0;
            for (int var35 = (var31 - 6) / 8; var35 <= (var31 + 6) / 8; var35++) {
                for (int var36 = (var30 - 6) / 8; var36 <= (var30 + 6) / 8; var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var33 && (var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || var35 == 49 && var36 == 47)) {
                        class93.field1664[var34] = var37;
                        class56.field914[var34] = -1;
                        class129.field2242[var34] = -1;
                        class199.field3424[var34] = -1;
                        class104.field1838[var34] = -1;
                    } else {
                        class93.field1664[var34] = var37;
                        class56.field914[var34] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class260.field4464, class327.method2240((byte) -74, var35), class311.field5315, class327.method2240((byte) -74, var36) }), arg0 + 31796);
                        class129.field2242[var34] = class184.field3134.method1594(class29.method182(arg0 + 25839, new class82[] { class298.field5068, class327.method2240((byte) -74, var35), class311.field5315, class327.method2240((byte) -74, var36) }), arg0 + 31854);
                        class199.field3424[var34] = class184.field3134.method1594(class29.method182(class143.method974(arg0, 27411), new class82[] { class124.field2165, class327.method2240((byte) -74, var35), class311.field5315, class327.method2240((byte) -74, var36) }), -97);
                        class104.field1838[var34] = class184.field3134.method1594(class29.method182(-6039, new class82[] { class149.field2543, class327.method2240((byte) -74, var35), class311.field5315, class327.method2240((byte) -74, var36) }), -46);
                    }
                    var34++;
                }
            }
            class192.method1336(var29, -126, var31, var32, false, var28, var30);
        }
        if (arg0 != -31878) {
            field1949 = -36;
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V", line = 639)
    public final void method751(int arg0) {
        this.field1957 = arg0;
        this.field1947 = 0;
        field1952++;
        this.field1942 = 0;
        this.field1948 = 12800;
        for (class235 var2 = (class235) this.field1938.method1936(arg0 ^ 0xD2D); var2 != null; var2 = (class235) this.field1938.method1926((byte) 90)) {
            if (this.field1957 > var2.field4096) {
                this.field1957 = var2.field4096;
            }
            if (this.field1942 < var2.field4098) {
                this.field1942 = var2.field4098;
            }
            if (var2.field4092 > this.field1947) {
                this.field1947 = var2.field4092;
            }
            if (this.field1948 > var2.field4099) {
                this.field1948 = var2.field4099;
            }
        }
    }
}
