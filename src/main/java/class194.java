import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class194 {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lw;")
    public static class107 field3347 = null;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lkj;")
    public static class210 field3345 = new class210();

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lmb;")
    public static class96 field3349 = class243.method1708(")1", (byte) 101);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[Lsi;I[BBZ)V")
    private static final void method1351(int arg0, class207[] arg1, int arg2, byte[] arg3, byte arg4, boolean arg5) {
        field3348++;
        class239 var6 = new class239(arg3);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1616((byte) -117);
            if (var8 == 0) {
                if (arg4 <= 63) {
                    method1354(86, -31, 88, -72);
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1666(24348);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFEA) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method1651(4139);
                int var15 = var14 & 0x3;
                int var16 = var14 >> 2;
                int var17 = arg0 + var12;
                int var18 = arg2 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class207 var19 = null;
                    if (!arg5) {
                        int var20 = var13;
                        if ((class132.field2376[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class121.method929(arg5, 4, var13, var15, var13, var7, var19, var17, !arg5, var18, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public static final void method1352() {
        if (class32.field501 != null) {
            for (int var0 = 0; var0 < class32.field501.length; var0++) {
                for (int var1 = 0; var1 < class264.field4614; var1++) {
                    for (int var2 = 0; var2 < class17.field254; var2++) {
                        class32.field501[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class159.field2828 != null) {
            for (int var3 = 0; var3 < class159.field2828.length; var3++) {
                for (int var4 = 0; var4 < class264.field4614; var4++) {
                    for (int var5 = 0; var5 < class17.field254; var5++) {
                        class159.field2828[var3][var4][var5] = null;
                    }
                }
            }
        }
        class250.field4326 = 0;
        if (class50.field879 != null) {
            for (int var6 = 0; var6 < class250.field4326; var6++) {
                class50.field879[var6] = null;
            }
        }
        if (class185.field3222 != null) {
            for (int var7 = 0; var7 < class19.field320; var7++) {
                class185.field3222[var7] = null;
            }
            class19.field320 = 0;
        }
        if (class195.field3351 != null) {
            for (int var8 = 0; var8 < class195.field3351.length; var8++) {
                class195.field3351[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZ)V")
    public static final void method1353(boolean arg0, boolean arg1) {
        field3344++;
        byte[][] var2 = class167.field2951;
        int var3 = class241.field4191.length;
        int var4 = 0;
        if (!arg1) {
            method1355((class196) null, -29, -47, false, -34);
        }
        while (var3 > var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class157.field2741[var4] >> 8) * 64 - class196.field3383;
                int var7 = (class157.field2741[var4] & 0xFF) * 64 - class225.field3832;
                class135.method1009((byte) 3);
                method1351(var6, class62.field1064, var7, var5, (byte) 120, arg0);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1354(int arg0, int arg1, int arg2, int arg3) {
        if (!class153.method1123(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class173.field3022[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class211.field3646) {
                    if (!class272.method1851(var4, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1851(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1851(var4, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1851(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1851(var4, var8, var5)) {
                    return false;
                }
                if (!class272.method1851(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class21.field350) {
                    if (!class272.method1851(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class272.method1851(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1851(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class272.method1851(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1851(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class272.method1851(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class211.field3646) {
                    if (!class272.method1851(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1851(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1851(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1851(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1851(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class272.method1851(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class21.field350) {
                    if (!class272.method1851(var4, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1851(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1851(var4, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1851(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class272.method1851(var4, var8, var5)) {
                    return false;
                }
                if (!class272.method1851(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class272.method1851(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class272.method1851(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class272.method1851(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class272.method1851(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class272.method1851(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lrc;IIZI)V")
    public static final void method1355(class196 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3346++;
        for (class38 var5 = (class38) class217.field3726.method1811(2); var5 != null; var5 = (class38) class217.field3726.method1810(arg3)) {
            if (var5.field661 == arg4 && arg1 * 128 == var5.field647 && arg2 * 128 == var5.field663 && var5.field652.field3367 == arg0.field3367) {
                if (var5.field671 != null) {
                    class120.field2228.method1550(var5.field671);
                    var5.field671 = null;
                }
                if (var5.field667 != null) {
                    class120.field2228.method1550(var5.field667);
                    var5.field667 = null;
                }
                var5.method1743((byte) 117);
                return;
            }
        }
        if (arg3) {
            method1355((class196) null, -93, -68, true, 18);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static void method1356(boolean arg0) {
        field3347 = null;
        field3349 = null;
        field3345 = null;
        if (!arg0) {
            field3347 = null;
        }
    }
}
