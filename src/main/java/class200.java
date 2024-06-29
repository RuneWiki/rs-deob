import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class200 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field2986 = -1;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Z")
    public boolean field2996 = false;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "[I")
    private int[] field3005 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Lpg;")
    public static class320 field3001 = new class320(16);

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3003 = "Checking for updates - ";

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Ll;")
    public static class133 field3004;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Ll;")
    public static class133 field3006;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
    private int[] field2988;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "[Lwj;")
    public static class270[] field3002;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[S")
    private short[] field2989;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[S")
    private short[] field2993;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
    private short[] field2995;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[S")
    private short[] field2999;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z", line = 11)
    public final boolean method1418(int arg0) {
        field2985++;
        if (this.field2988 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 > -113) {
            return false;
        }
        while (var3 < this.field2988.length) {
            if (!class71.field1174.method949(0, this.field2988[var3], -17264)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Ld;", line = 40)
    public final class42 method1419(int arg0) {
        class42[] var2 = new class42[5];
        field2994++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3005[var4] != -1) {
                var2[var3++] = class42.method337(class71.field1174, this.field3005[var4], 0);
            }
        }
        class42 var5 = new class42(var2, var3);
        if (arg0 != -6) {
            return (class42) null;
        }
        if (this.field2989 != null) {
            for (int var6 = 0; var6 < this.field2989.length; var6++) {
                var5.method353(this.field2989[var6], this.field2995[var6]);
            }
        }
        if (this.field2993 != null) {
            for (int var7 = 0; var7 < this.field2993.length; var7++) {
                var5.method356(this.field2993[var7], this.field2999[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLkh;)V", line = 103)
    private final void method1420(int arg0, byte arg1, class166 arg2) {
        if (arg0 == 1) {
            this.field2986 = arg2.method1178(arg1 ^ 0xFFFFFFD7);
        } else if (arg0 == 2) {
            int var8 = arg2.method1178(0);
            this.field2988 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2988[var9] = arg2.method1151(-89);
            }
        } else if (arg0 == 3) {
            this.field2996 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method1178(arg1 ^ 0xFFFFFFD7);
            this.field2989 = new short[var6];
            this.field2995 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2989[var7] = (short) arg2.method1151(arg1 - 47);
                this.field2995[var7] = (short) arg2.method1151(arg1 - 74);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method1178(0);
            this.field2999 = new short[var4];
            this.field2993 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2993[var5] = (short) arg2.method1151(-88);
                this.field2999[var5] = (short) arg2.method1151(class81.method583(arg1, 104));
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field3005[arg0 - 60] = arg2.method1151(-105);
        }
        if (arg1 != -41) {
            method1421(106, 36, (class33) null, (byte) 104);
        }
        field3000++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILqh;B)V", line = 181)
    public static final void method1421(int arg0, int arg1, class33 arg2, byte arg3) {
        if (arg2.field1912 == arg0 && arg0 != -1) {
            class281 var4 = class133.method948(arg0, (byte) 33);
            int var5 = var4.field4330;
            if (var5 == 1) {
                arg2.field1952 = 0;
                arg2.field1926 = 1;
                arg2.field1880 = 0;
                arg2.field1946 = 0;
                arg2.field1881 = arg1;
                class170.method1231(class98.field1566 == arg2, arg2.field1905, arg2.field1868, arg2.field1952, var4, -24255);
            }
            if (var5 == 2) {
                arg2.field1946 = 0;
            }
        } else if (arg0 == -1 || arg2.field1912 == -1 || class133.method948(arg0, (byte) 33).field4344 >= class133.method948(arg2.field1912, (byte) 33).field4344) {
            arg2.field1912 = arg0;
            arg2.field1913 = arg2.field1918;
            arg2.field1952 = 0;
            arg2.field1880 = 0;
            arg2.field1881 = arg1;
            arg2.field1946 = 0;
            arg2.field1926 = 1;
            if (arg2.field1912 != -1) {
                class170.method1231(class98.field1566 == arg2, arg2.field1905, arg2.field1868, arg2.field1952, class133.method948(arg2.field1912, (byte) 33), -24255);
            }
        }
        field2987++;
        if (arg3 < 21) {
            field3003 = (String) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Z", line = 232)
    public final boolean method1422(int arg0) {
        field2990++;
        boolean var2 = true;
        if (arg0 != -61) {
            return false;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3005[var3] != -1 && !class71.field1174.method949(0, this.field3005[var3], -17264)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[IJI)Ljava/lang/String;", line = 257)
    public static final String method1423(int arg0, int[] arg1, long arg2, int arg3) {
        field2991++;
        if (class326.field5082 != null) {
            String var5 = class326.field5082.method988(arg1, arg3, arg2, 0);
            if (var5 != null) {
                return var5;
            }
        }
        return arg0 == -16430 ? Long.toString(arg2) : (String) null;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Ld;", line = 278)
    public final class42 method1424(int arg0) {
        field2997++;
        if (this.field2988 == null) {
            return null;
        }
        class42[] var2 = new class42[this.field2988.length];
        for (int var3 = 0; var3 < this.field2988.length; var3++) {
            var2[var3] = class42.method337(class71.field1174, this.field2988[var3], 0);
        }
        class42 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class42(var2, var2.length);
        }
        if (this.field2989 != null) {
            for (int var5 = 0; var5 < this.field2989.length; var5++) {
                var4.method353(this.field2989[var5], this.field2995[var5]);
            }
        }
        if (this.field2993 != null) {
            for (int var6 = 0; var6 < this.field2993.length; var6++) {
                var4.method356(this.field2993[var6], this.field2999[var6]);
            }
        }
        if (arg0 != -13969) {
            field3006 = (class133) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLkh;)V", line = 340)
    public final void method1425(byte arg0, class166 arg1) {
        field2992++;
        if (arg0 > -36) {
            return;
        }
        while (true) {
            int var3 = arg1.method1178(0);
            if (var3 == 0) {
                return;
            }
            this.method1420(var3, (byte) -41, arg1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[[[BIBII)V", line = 360)
    public static final void method1426(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class331.field5159++;
        class23.field378 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class133.field2132; var12 < class273.field4226; var12++) {
            class142[][] var13 = class256.field4013[var12];
            for (int var14 = class304.field4751; var14 < class46.field757; var14++) {
                for (int var15 = class259.field4061; var15 < class18.field249; var15++) {
                    class142 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class149.field2256[var14 + class73.field1197 - class106.field1637][var15 + class73.field1197 - class219.field3330] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field2202 = true;
                            var16.field2207 = true;
                            if (var16.field2204 > 0) {
                                var16.field2205 = true;
                            } else {
                                var16.field2205 = false;
                            }
                            class23.field378++;
                        } else {
                            var16.field2202 = false;
                            var16.field2207 = false;
                            var16.field2214 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2213 != null) {
                                    class103 var17 = var16.field2213;
                                    var17.field1598.method71(0, var12, var17.field1608, var17.field1604, var17.field1601);
                                    if (var17.field1600 != null) {
                                        var17.field1600.method71(0, var12, var17.field1608, var17.field1604, var17.field1601);
                                    }
                                }
                                if (var16.field2194 != null) {
                                    class228 var18 = var16.field2194;
                                    var18.field3623.method71(var18.field3632, var12, var18.field3630, var18.field3621, var18.field3634);
                                    if (var18.field3628 != null) {
                                        var18.field3628.method71(var18.field3632, var12, var18.field3630, var18.field3621, var18.field3634);
                                    }
                                }
                                if (var16.field2196 != null) {
                                    class279 var19 = var16.field2196;
                                    var19.field4297.method71(0, var12, var19.field4294, var19.field4295, var19.field4293);
                                }
                                if (var16.field2197 != null) {
                                    for (int var20 = 0; var20 < var16.field2204; var20++) {
                                        class26 var21 = var16.field2197[var20];
                                        var21.field406.method71(var21.field401, var12, var21.field408, var21.field407, var21.field395);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class218.field3321 == class119.field1816;
        if (class94.field1516) {
            GL var23 = class94.field1473;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class290.method1989();
                class37.method313(-1, 3, 0);
                class174.field2641 = true;
                class100.method734();
                class273.field4235 = -1;
                class229.field3648 = -1;
                for (int var24 = 0; var24 < class84.field1307[0].length; var24++) {
                    class127 var25 = class84.field1307[0][var24];
                    float var26 = 251.5F - (var25.field1972 ? 1.0F : 0.5F);
                    if (class273.field4235 != var25.field1982) {
                        class273.field4235 = var25.field1982;
                        class307.method2099(var25.field1982, (byte) 49);
                        class250.method1733(class62.method483(8713));
                    }
                    var25.method919(class256.field4013, var26, false);
                }
                class100.method737();
            } else {
                int var27 = class133.field2132;
                while (true) {
                    if (var27 >= class273.field4226) {
                        class183.method1308(class106.field1637, class219.field3330, class256.field4013);
                        break;
                    }
                    for (int var28 = 0; var28 < class84.field1307[var27].length; var28++) {
                        class127 var29 = class84.field1307[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field1972 ? 1.0F : 0.5F);
                        if (var29.field1981 != -1 && class89.method646((byte) -57, class15.field207.method2079((byte) 42, var29.field1981)) && class300.field4691) {
                            class307.method2099(var29.field1982, (byte) 49);
                        }
                        var29.method919(class256.field4013, var30, false);
                    }
                    if (var27 == 0 && class289.field4509 > 0) {
                        class94.method671(101.5F);
                        class6.method50(class106.field1637, class219.field3330, class73.field1197, arg1, class149.field2256, class218.field3321[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class133.field2132; var31 < class273.field4226; var31++) {
            class142[][] var32 = class256.field4013[var31];
            for (int var33 = -class73.field1197; var33 <= 0; var33++) {
                int var34 = class106.field1637 + var33;
                int var35 = class106.field1637 - var33;
                if (var34 >= class304.field4751 || var35 < class46.field757) {
                    for (int var36 = -class73.field1197; var36 <= 0; var36++) {
                        int var37 = class219.field3330 + var36;
                        int var38 = class219.field3330 - var36;
                        if (var34 >= class304.field4751) {
                            if (var37 >= class259.field4061) {
                                class142 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2202) {
                                    class63.method486(var39, true);
                                }
                            }
                            if (var38 < class18.field249) {
                                class142 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2202) {
                                    class63.method486(var40, true);
                                }
                            }
                        }
                        if (var35 < class46.field757) {
                            if (var37 >= class259.field4061) {
                                class142 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2202) {
                                    class63.method486(var41, true);
                                }
                            }
                            if (var38 < class18.field249) {
                                class142 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2202) {
                                    class63.method486(var42, true);
                                }
                            }
                        }
                        if (class23.field378 == 0) {
                            if (!var22) {
                                class174.field2639 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class133.field2132; var43 < class273.field4226; var43++) {
            class142[][] var44 = class256.field4013[var43];
            for (int var45 = -class73.field1197; var45 <= 0; var45++) {
                int var46 = class106.field1637 + var45;
                int var47 = class106.field1637 - var45;
                if (var46 >= class304.field4751 || var47 < class46.field757) {
                    for (int var48 = -class73.field1197; var48 <= 0; var48++) {
                        int var49 = class219.field3330 + var48;
                        int var50 = class219.field3330 - var48;
                        if (var46 >= class304.field4751) {
                            if (var49 >= class259.field4061) {
                                class142 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2202) {
                                    class63.method486(var51, false);
                                }
                            }
                            if (var50 < class18.field249) {
                                class142 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2202) {
                                    class63.method486(var52, false);
                                }
                            }
                        }
                        if (var47 < class46.field757) {
                            if (var49 >= class259.field4061) {
                                class142 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2202) {
                                    class63.method486(var53, false);
                                }
                            }
                            if (var50 < class18.field249) {
                                class142 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2202) {
                                    class63.method486(var54, false);
                                }
                            }
                        }
                        if (class23.field378 == 0) {
                            if (!var22) {
                                class174.field2639 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class174.field2639 = false;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I", line = 732)
    public static final int method1427(int arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = -5 / ((arg0 + 39) / 38);
        int var5 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        field2998++;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V", line = 755)
    public static void method1428(int arg0) {
        field3003 = null;
        field3006 = null;
        field3001 = null;
        if (arg0 <= 108) {
            field3003 = (String) null;
        }
        field3004 = null;
        field3002 = null;
    }
}
