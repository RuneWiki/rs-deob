import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class149 extends class317 {

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lwm;")
    public static class152 field2311 = class157.method1048("Benutzeroberfl-=che geladen)3", 117);

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Lwm;")
    private static class152 field2320 = class157.method1048(" from your ignore list first)3", 124);

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "[S")
    public static short[] field2312 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Lwm;")
    public static class152 field2313 = field2320;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "[S")
    public static short[] field2318 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Lne;")
    public static class235 field2315 = new class235(200);

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Lwm;")
    public static class152 field2321 = class157.method1048(" autres options", 106);

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field2323 = 0;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Lwm;")
    public static class152 field2322 = class157.method1048("::tween", 103);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Lej;")
    public static class158 field2316;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V", line = 6)
    public static void method937(int arg0) {
        field2312 = null;
        field2311 = null;
        field2322 = null;
        field2320 = null;
        if (arg0 != 0) {
            method941(53, -97, 119, (byte) -3);
        }
        field2318 = null;
        field2315 = null;
        field2316 = null;
        field2321 = null;
        field2313 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[B)Z", line = 38)
    public static final boolean method938(int arg0, byte[] arg1) {
        field2309++;
        class291 var2 = new class291(arg1);
        int var3 = var2.method2011(-121);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method2011(-116) == 1;
        if (arg0 >= -91) {
            field2321 = (class152) null;
        }
        if (var4) {
            class290.method1954(var2, Integer.MAX_VALUE);
        }
        class17.method108(false, var2);
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V", line = 68)
    public static final void method939(int arg0, byte arg1) {
        field2317++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class205.field3356 += arg0 * 128;
        if (class238.field3904.length < class205.field3356) {
            class205.field3356 -= class238.field3904.length;
            int var3 = (int) (Math.random() * 12.0D);
            class262.method1806(class55.field868[var3], (byte) 54);
        }
        int var4 = arg0 * 128;
        int var5 = 0;
        int var6 = (var2 - arg0) * 128;
        if (arg1 != -26) {
            method938(108, (byte[]) null);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class241.field3938[var4 + var5] - (class238.field3904[class205.field3356 + var5 & class238.field3904.length + -1] * arg0 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class241.field3938[var5++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class241.field3938[var10 + var11] = 255;
                } else {
                    class241.field3938[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class245.field4108[var13] = class245.field4108[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class245.field4108[var14] = (int) (Math.sin((double) class248.field4158 / 14.0D) * 16.0D + Math.sin((double) class248.field4158 / 15.0D) * 14.0D + Math.sin((double) class248.field4158 / 16.0D) * 12.0D);
            class248.field4158++;
        }
        class225.field3660 += arg0;
        int var15 = ((class142.field2187 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class225.field3660; var16++) {
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (int) (Math.random() * 124.0D) + 2;
            class241.field3938[(var17 << 7) + var18] = 192;
        }
        class225.field3660 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var21 += class241.field3938[var15 + var22 + var20];
                }
                if (var22 - var15 - 1 >= 0) {
                    var21 -= class241.field3938[var22 + var20 - var15 - 1];
                }
                if (var22 >= 0) {
                    class324.field5653[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var2) {
                    var24 += class324.field5653[var23 + var26 + (var15 * 128)];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class324.field5653[var23 + var26 - (var15 * 128) - 128];
                }
                if (var25 >= 0) {
                    class241.field3938[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()V", line = 241)
    public static final void method940() {
        class245.field4079 = 0;
        label194: for (int var0 = 0; var0 < class30.field518; var0++) {
            class30 var1 = class139.field2121[var0];
            if (class230.field3749 != null) {
                for (int var2 = 0; var2 < class230.field3749.length; var2++) {
                    if (class230.field3749[var2] != -1000000 && (var1.field508 <= class230.field3749[var2] || var1.field512 <= class230.field3749[var2]) && (var1.field492 <= class205.field3349[var2] || var1.field503 <= class205.field3349[var2]) && (var1.field492 >= class140.field2134[var2] || var1.field503 >= class140.field2134[var2]) && (var1.field510 <= class310.field5300[var2] || var1.field511 <= class310.field5300[var2]) && (var1.field510 >= client.field4360[var2] || var1.field511 >= client.field4360[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field498 == 1) {
                int var3 = var1.field490 + class245.field4087 - class84.field1162;
                if (var3 >= 0 && var3 <= class245.field4087 + class245.field4087) {
                    int var4 = var1.field501 + class245.field4087 - class202.field3259;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field499 + class245.field4087 - class202.field3259;
                    if (var5 > class245.field4087 + class245.field4087) {
                        var5 = class245.field4087 + class245.field4087;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class142.field2188[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class27.field460 - var1.field492;
                        if (var7 > 32) {
                            var1.field500 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field500 = 2;
                            var7 = -var7;
                        }
                        var1.field513 = (var1.field510 - class239.field3916 << 8) / var7;
                        var1.field502 = (var1.field511 - class239.field3916 << 8) / var7;
                        var1.field494 = (var1.field508 - class3.field54 << 8) / var7;
                        var1.field516 = (var1.field512 - class3.field54 << 8) / var7;
                        class169.field2640[class245.field4079++] = var1;
                    }
                }
            } else if (var1.field498 == 2) {
                int var8 = var1.field501 + class245.field4087 - class202.field3259;
                if (var8 >= 0 && var8 <= class245.field4087 + class245.field4087) {
                    int var9 = var1.field490 + class245.field4087 - class84.field1162;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field504 + class245.field4087 - class84.field1162;
                    if (var10 > class245.field4087 + class245.field4087) {
                        var10 = class245.field4087 + class245.field4087;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class142.field2188[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class239.field3916 - var1.field510;
                        if (var12 > 32) {
                            var1.field500 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field500 = 4;
                            var12 = -var12;
                        }
                        var1.field489 = (var1.field492 - class27.field460 << 8) / var12;
                        var1.field496 = (var1.field503 - class27.field460 << 8) / var12;
                        var1.field494 = (var1.field508 - class3.field54 << 8) / var12;
                        var1.field516 = (var1.field512 - class3.field54 << 8) / var12;
                        class169.field2640[class245.field4079++] = var1;
                    }
                }
            } else if (var1.field498 == 4) {
                int var13 = var1.field508 - class3.field54;
                if (var13 > 128) {
                    int var14 = var1.field501 + class245.field4087 - class202.field3259;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field499 + class245.field4087 - class202.field3259;
                    if (var15 > class245.field4087 + class245.field4087) {
                        var15 = class245.field4087 + class245.field4087;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field490 + class245.field4087 - class84.field1162;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field504 + class245.field4087 - class84.field1162;
                        if (var17 > class245.field4087 + class245.field4087) {
                            var17 = class245.field4087 + class245.field4087;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class142.field2188[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field500 = 5;
                            var1.field489 = (var1.field492 - class27.field460 << 8) / var13;
                            var1.field496 = (var1.field503 - class27.field460 << 8) / var13;
                            var1.field513 = (var1.field510 - class239.field3916 << 8) / var13;
                            var1.field502 = (var1.field511 - class239.field3916 << 8) / var13;
                            class169.field2640[class245.field4079++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIB)I", line = 476)
    public static final int method941(int arg0, int arg1, int arg2, byte arg3) {
        field2314++;
        if ((class70.field1026[arg2][arg1][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class70.field1026[1][arg1][arg0] & 0x2) == 0) {
            return arg3 <= 4 ? -6 : arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZIZB)Lah;", line = 508)
    public static final class205 method942(boolean arg0, boolean arg1, int arg2, boolean arg3, byte arg4) {
        field2310++;
        class27 var5 = null;
        if (class297.field5072 != null) {
            var5 = new class27(arg2, class297.field5072, class111.field1563[arg2], 1000000);
        }
        int var6 = 11 % ((arg4 + 46) / 34);
        class45.field711[arg2] = class2.field39.method663(class268.field4528, (byte) 0, var5, arg2);
        if (arg0) {
            class45.field711[arg2].method1423((byte) 127);
        }
        return new class205(class45.field711[arg2], arg1, arg3);
    }
}
