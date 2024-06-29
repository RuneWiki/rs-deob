import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class184 {

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Lkb;")
    private class315 field2984 = new class315();

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Lqf;")
    private class311 field2987;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Z")
    public static boolean field2982 = true;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field2991 = 2;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field2976;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)I", line = 5)
    public static final int method1346(int arg0, int arg1, int arg2) {
        field2993++;
        class111 var3 = (class111) class267.field4161.method2168((long) arg2, (byte) -76);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg1 < 26) {
                method1357((byte) 64, (int[]) null, (int[]) null, -47, 25);
            }
            for (int var5 = 0; var5 < var3.field1552.length; var5++) {
                if (var3.field1547[var5] == arg0) {
                    var4 += var3.field1552[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 39)
    public final void method1347(Object arg0, long arg1, byte arg2) {
        field2977++;
        this.method1354(arg1, false);
        if (arg2 >= -48) {
            field2981 = -35;
        }
        if (this.field2996 == 0) {
            class320 var5 = (class320) this.field2984.method2196((byte) -36);
            var5.method2028(13329);
            var5.method1960(-27621);
        } else {
            this.field2996--;
        }
        class134 var6 = new class134(arg0);
        this.field2987.method2161(var6, arg1, -1);
        this.field2984.method2197((byte) -105, var6);
        var6.field4294 = 0L;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V", line = 83)
    public static final void method1348(int arg0, byte arg1) {
        field2980++;
        if (arg1 > -64) {
            method1357((byte) 96, (int[]) null, (int[]) null, 120, 13);
        }
        class194.field3088.method1353(-1, arg0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 100)
    public static final byte[] method1349(int arg0, String arg1) {
        int var2 = arg1.length();
        field2989++;
        byte[] var3 = new byte[var2];
        if (arg0 <= 103) {
            return (byte[]) null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 238)
    public static void method1350(byte arg0) {
        int var1 = -5 / ((arg0 + 47) / 58);
        field2976 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 246)
    public final Object method1351(long arg0, int arg1) {
        if (arg1 != 63) {
            this.method1347((Object) null, 65L, (byte) -95);
        }
        field2979++;
        class320 var4 = (class320) this.field2987.method2168(arg0, (byte) -95);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method334(16349);
        if (var5 == null) {
            var4.method2028(13329);
            var4.method1960(-27621);
            this.field2996++;
            return null;
        }
        if (var4.method335(98)) {
            class134 var6 = new class134(var5);
            this.field2987.method2161(var6, var4.field4430, arg1 - 64);
            this.field2984.method2197((byte) -105, var6);
            var6.field4294 = 0L;
            var4.method2028(13329);
            var4.method1960(-27621);
        } else {
            this.field2984.method2197((byte) -105, var4);
            var4.field4294 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I", line = 292)
    public final int method1352(int arg0) {
        field2978++;
        int var2 = arg0;
        for (class320 var3 = (class320) this.field2984.method2198(200); var3 != null; var3 = (class320) this.field2984.method2192((byte) -99)) {
            if (!var3.method335(98)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V", line = 315)
    public final void method1353(int arg0, int arg1) {
        if (arg0 != -1) {
            method1357((byte) 112, (int[]) null, (int[]) null, 64, -96);
        }
        field2990++;
        if (class66.field939 == null) {
            return;
        }
        for (class320 var3 = (class320) this.field2984.method2198(200); var3 != null; var3 = (class320) this.field2984.method2192((byte) -108)) {
            if (var3.method335(117)) {
                if (var3.method334(16349) == null) {
                    var3.method2028(arg0 ^ 0xFFFFCBEE);
                    var3.method1960(-27621);
                    this.field2996++;
                }
            } else if (((long) arg1) < (++var3.field4294)) {
                class320 var4 = class66.field939.method2067(160, var3);
                this.field2987.method2161(var4, var3.field4430, -1);
                class308.method2130(var3, (byte) 109, var4);
                var3.method2028(13329);
                var3.method1960(-27621);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(JZ)V", line = 364)
    public final void method1354(long arg0, boolean arg1) {
        if (arg1) {
            this.field2987 = (class311) null;
        }
        field2983++;
        class320 var4 = (class320) this.field2987.method2168(arg0, (byte) -121);
        if (var4 != null) {
            var4.method2028(13329);
            var4.method1960(-27621);
            this.field2996++;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 385)
    public final void method1355(boolean arg0) {
        if (arg0) {
            method1346(84, 20, 115);
        }
        field2995++;
        for (class320 var2 = (class320) this.field2984.method2198(200); var2 != null; var2 = (class320) this.field2984.method2192((byte) -122)) {
            if (var2.method335(77)) {
                var2.method2028(13329);
                var2.method1960(-27621);
                this.field2996++;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V", line = 412)
    public static final void method1356(boolean arg0) {
        class271.field4200.method1355(arg0);
        field2994++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B[I[III)V", line = 420)
    public static final void method1357(byte arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg4; var9 < arg3; var9++) {
                if ((var9 & 0x1) + var7 < arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method1357((byte) 37, arg1, arg2, var6 - 1, arg4);
            method1357((byte) 37, arg1, arg2, arg3, var6 + 1);
        }
        field2988++;
        if (arg0 != 37) {
            field2982 = true;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIZIIIIIIII)V", line = 475)
    public static final void method1358(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2986++;
        int var12 = arg8 - arg2;
        int var13 = arg6 - arg10;
        int var14 = -1;
        if (arg1 != -932450224) {
            return;
        }
        int var15 = 983040 / arg7;
        int var16 = 983040 / arg11;
        if (class56.field779 > 0) {
            if (class1.field4 <= 10) {
                var14 = class1.field4 * 5;
            } else {
                var14 = 50 + 50 - (class1.field4 * 5);
            }
        }
        for (int var17 = -var15; var17 < var13 + var15; var17++) {
            int var18 = arg7 * var17 + arg4 >> 16;
            int var19 = (var17 + 1) * arg7 + arg4 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg5 + var18;
                int var10000 = arg5 + var19;
                int var23 = var17 + arg10 >> 6;
                if (var23 >= 0 && class265.field4147.length - 1 >= var23) {
                    int[][] var24 = class265.field4147[var23];
                    for (int var25 = -var16; var25 < var12 + var16; var25++) {
                        int var26 = (var25 + 1) * arg11 + arg9 >> 16;
                        int var27 = arg11 * var25 + arg9 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            int var29 = arg0 + var27;
                            var10000 = arg0 + var26;
                            int var31 = arg2 + var25 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = (arg2 + var25 & 0x3F << 6) + (arg10 + var17 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class121 var34 = class249.method1790(74, var33 - 1);
                                    if (!class342.field5320[var34.field1699]) {
                                        if (var14 != -1 && class105.field1392 == var34.field1699) {
                                            class144 var35 = new class144();
                                            var35.field2280 = var29;
                                            var35.field2274 = var34.field1699;
                                            var35.field2281 = var21;
                                            class121.field1725.method19(var35, -1058);
                                        } else {
                                            class248.field3908[var34.field1699].method1273(var21 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class144 var36 = (class144) class121.field1725.method22((byte) 127); var36 != null; var36 = (class144) class121.field1725.method26((byte) -126)) {
            class280.method1964(var36.field2281, var36.field2280, 15, 16776960, var14);
            class280.method1964(var36.field2281, var36.field2280, 13, 16776960, var14);
            class280.method1964(var36.field2281, var36.field2280, 11, 16776960, var14);
            class280.method1964(var36.field2281, var36.field2280, 9, 16776960, var14);
            class248.field3908[var36.field2274].method1273(var36.field2281 - 7, var36.field2280 + -7);
        }
        class121.field1725.method27((byte) 89);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 604)
    public final void method1359(int arg0) {
        this.field2984.method2199(-2288);
        this.field2987.method2165((byte) -103);
        if (arg0 <= 62) {
            method1350((byte) 81);
        }
        field2985++;
        this.field2996 = this.field2992;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V", line = 627)
    public class184(int arg0) {
        this.field2996 = arg0;
        this.field2992 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2987 = new class311(var2);
    }
}
