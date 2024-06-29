import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class340 extends class172 {

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "[I")
    private int[] field5423;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "[I")
    private int[] field5416;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "La;")
    private class310 field5419;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "La;")
    private class310 field5441;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "La;")
    private class310 field5424;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "[La;")
    private class310[] field5417;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "[I")
    public static int[] field5431 = new int[1000];

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field5436 = 0;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field5429 = new String[1000];

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field5432 = 0;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
    public static int field5442 = 0;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "Lja;")
    public static class302 field5430;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lth;")
    public static class57 field5425;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lth;")
    public static class57 field5440;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "[I")
    public static int[] field5434;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILfc;IIIBLkc;Ljh;I)V", line = 12)
    public static final void method2386(int arg0, class288 arg1, int arg2, int arg3, int arg4, byte arg5, class29 arg6, class258 arg7, int arg8) {
        int var9 = -10 / ((21 - arg5) / 49);
        class170 var10 = new class170();
        var10.field2711 = arg4 * 128;
        var10.field2695 = arg8 * 128;
        var10.field2710 = arg3;
        if (arg6 != null) {
            var10.field2704 = arg6.field386 * 128;
            var10.field2696 = arg6.field334;
            var10.field2700 = arg6;
            int var12 = arg6.field414;
            var10.field2712 = arg6.field352;
            var10.field2714 = arg6.field404;
            var10.field2699 = arg6.field406;
            var10.field2709 = arg6.field385;
            int var13 = arg6.field342;
            if (arg0 == 1 || arg0 == 3) {
                var13 = arg6.field414;
                var12 = arg6.field342;
            }
            var10.field2705 = (arg4 + var12) * 128;
            var10.field2716 = (arg8 + var13) * 128;
            if (arg6.field418 != null) {
                var10.field2701 = true;
                var10.method1321(true);
            }
            if (var10.field2699 != null) {
                var10.field2707 = var10.field2712 + (int) ((double) (var10.field2709 - var10.field2712) * Math.random());
            }
            class314.field4984.method2302((byte) -75, var10);
        } else if (arg1 != null) {
            var10.field2706 = arg1;
            class121 var11 = arg1.field4692;
            if (var11.field2066 != null) {
                var10.field2701 = true;
                var11 = var11.method958((byte) -115);
            }
            if (var11 != null) {
                var10.field2705 = (var11.field2025 + arg4) * 128;
                var10.field2716 = (var11.field2025 + arg8) * 128;
                var10.field2714 = class123.method967((byte) -45, arg1);
                var10.field2704 = var11.field2027 * 128;
                var10.field2696 = var11.field2075;
            }
            class103.field1673.method2302((byte) -108, var10);
        } else if (arg7 != null) {
            var10.field2715 = arg7;
            var10.field2705 = (arg4 + arg7.method1634(-1)) * 128;
            var10.field2716 = (arg7.method1634(-1) + arg8) * 128;
            var10.field2714 = class239.method1822(arg7, -58);
            var10.field2696 = arg7.field4352;
            var10.field2704 = arg7.field4351 * 128;
            class243.field3995.method1273(1, (long) arg2, var10);
        }
        field5433++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lth;I)V", line = 99)
    public static final void method2387(class57 arg0, int arg1) {
        field5421++;
        if (arg1 == 0) {
            class301.field4842 = arg0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILna;IBLjava/awt/Component;)Lhn;", line = 113)
    public static final class196 method2388(int arg0, class145 arg1, int arg2, byte arg3, Component arg4) {
        field5422++;
        if (class227.field3788 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class196 var5 = (class196) Class.forName("fd").getDeclaredConstructor().newInstance();
                var5.field3142 = arg2;
                var5.field3134 = new int[(class232.field3855 ? 2 : 1) * 256];
                var5.method743(arg4);
                var5.field3147 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field3147 > 16384) {
                    var5.field3147 = 16384;
                }
                var5.method739(var5.field3147);
                if (class89.field1503 > 0 && class229.field3811 == null) {
                    class229.field3811 = new class143();
                    class229.field3811.field2341 = arg1;
                    arg1.method1114((byte) 97, class89.field1503, class229.field3811);
                }
                if (class229.field3811 != null) {
                    if (class229.field3811.field2330[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class229.field3811.field2330[arg0] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class95 var7 = new class95(arg1, arg0);
                    if (arg3 != -87) {
                        field5425 = (class57) null;
                    }
                    var7.field3142 = arg2;
                    var7.field3134 = new int[(class232.field3855 ? 2 : 1) * 256];
                    var7.method743(arg4);
                    var7.field3147 = 16384;
                    var7.method739(var7.field3147);
                    if (class89.field1503 > 0 && class229.field3811 == null) {
                        class229.field3811 = new class143();
                        class229.field3811.field2341 = arg1;
                        arg1.method1114((byte) 97, class89.field1503, class229.field3811);
                    }
                    if (class229.field3811 != null) {
                        if (class229.field3811.field2330[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class229.field3811.field2330[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class196();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lla;IZIDZLth;B)[I", line = 205)
    public final int[] method2389(class203 arg0, int arg1, boolean arg2, int arg3, double arg4, boolean arg5, class57 arg6, byte arg7) {
        int[] var10 = new int[arg1 * arg3];
        class238.method1817((byte) 94, arg4);
        class345.field5494 = arg6;
        class138.field2279 = arg0;
        field5426++;
        if (arg7 != 63) {
            this.method2393(true, (class203) null, (byte) 14, -42, -49, 1.1093940460597782D, (class57) null);
        }
        class57.method464(0, arg1, arg3);
        for (int var11 = 0; var11 < this.field5417.length; var11++) {
            this.field5417[var11].method2197(arg1, arg3, 51);
        }
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var12 = arg1 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg1;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field5441.field4940) {
                int[] var21 = this.field5441.method77(var16, -13093);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field5441.method391(var16, true);
                var18 = var17[0];
                var19 = var17[2];
                var20 = var17[1];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class238.field3933[var23];
                int var25 = var19[var22] >> 4;
                int var26 = var18[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class238.field3933[var26];
                int var28 = class238.field3933[var25];
                var10[var15++] = (var24 << 8) + (var27 << 16) + var28;
                if (arg2) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field5417.length; var29++) {
            this.field5417[var29].method1388(-97);
        }
        return var10;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(DLth;IZILla;I)[I", line = 336)
    public final int[] method2390(double arg0, class57 arg1, int arg2, boolean arg3, int arg4, class203 arg5, int arg6) {
        field5439++;
        class238.method1817((byte) 76, arg0);
        class138.field2279 = arg5;
        class345.field5494 = arg1;
        int[] var9 = new int[arg4 * arg6 * 4];
        class57.method464(arg2 ^ arg2, arg4, arg6);
        for (int var10 = 0; var10 < this.field5417.length; var10++) {
            this.field5417[var10].method2197(arg4, arg6, 25);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5441.field4940) {
                int[] var17 = this.field5441.method77(var12, arg2 + 5417);
                var14 = var17;
                var16 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field5441.method391(var12, true);
                var14 = var13[2];
                var15 = var13[1];
                var16 = var13[0];
            }
            if (arg3) {
                var11 = var12;
            }
            int[] var18;
            if (this.field5424.field4940) {
                var18 = this.field5424.method77(var12, -13093);
            } else {
                var18 = this.field5424.method391(var12, true)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var14[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = class238.field3933[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class238.field3933[var22];
                int var25 = class238.field3933[var21];
                int var26;
                if (var25 == 0 && var23 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var23 << 8) + (var26 << 24) + (var25 << 16) + var24;
                if (arg3) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field5417.length; var27++) {
            this.field5417[var27].method1388(112);
        }
        return var9;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V", line = 468)
    public static final void method2391(boolean arg0) {
        field5427++;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class104.field1683 - 1); var2++) {
                if (class51.field810[var2] < 1000 && class51.field810[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class200.field3193[var2];
                    class200.field3193[var2] = class200.field3193[var2 + 1];
                    class200.field3193[var2 + 1] = var3;
                    String var4 = class22.field249[var2];
                    class22.field249[var2] = class22.field249[var2 + 1];
                    class22.field249[var2 + 1] = var4;
                    int var5 = class252.field4258[var2];
                    class252.field4258[var2] = class252.field4258[var2 + 1];
                    class252.field4258[var2 + 1] = var5;
                    int var6 = class230.field3819[var2];
                    class230.field3819[var2] = class230.field3819[var2 + 1];
                    class230.field3819[var2 + 1] = var6;
                    int var7 = class149.field2379[var2];
                    class149.field2379[var2] = class149.field2379[var2 + 1];
                    class149.field2379[var2 + 1] = var7;
                    short var8 = class51.field810[var2];
                    class51.field810[var2] = class51.field810[var2 + 1];
                    class51.field810[var2 + 1] = var8;
                    long var9 = class13.field144[var2];
                    class13.field144[var2] = class13.field144[var2 + 1];
                    class13.field144[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZILla;IIDLth;)Lsi;", line = 524)
    public final class351 method2392(boolean arg0, int arg1, class203 arg2, int arg3, int arg4, double arg5, class57 arg6) {
        class238.method1817((byte) 87, arg5);
        class345.field5494 = arg6;
        field5438++;
        class138.field2279 = arg2;
        class57.method464(0, arg3, arg1);
        class351 var9 = new class351(arg3, arg1);
        for (int var10 = 0; var10 < this.field5417.length; var10++) {
            this.field5417[var10].method2197(arg3, arg1, 18);
        }
        int var11 = 0;
        if (arg4 > -33) {
            this.method2392(true, -49, (class203) null, 93, -87, -0.5252318085152826D, (class57) null);
        }
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg0) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5441.field4940) {
                int[] var13 = this.field5441.method77(var12, -13093);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field5441.method391(var12, true);
                var15 = var17[2];
                var14 = var17[1];
                var16 = var17[0];
            }
            for (int var18 = arg3 - 1; var18 >= 0; var18--) {
                int var19 = var16[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var20 = var14[var18] >> 4;
                int var21 = var15[var18] >> 4;
                int var22 = class238.field3933[var19];
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var23 = class238.field3933[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class238.field3933[var21];
                var9.field5571[var11++] = (var22 << 16) + (var23 << 8) + var24;
                if (arg0) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field5417.length; var25++) {
            this.field5417[var25].method1388(103);
        }
        return var9;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLla;BIIDLth;)Luc;", line = 641)
    public final class120 method2393(boolean arg0, class203 arg1, byte arg2, int arg3, int arg4, double arg5, class57 arg6) {
        if (arg2 != -62) {
            this.field5423 = (int[]) null;
        }
        field5418++;
        class238.method1817((byte) 96, arg5);
        class138.field2279 = arg1;
        class345.field5494 = arg6;
        class57.method464(arg2 ^ 0xFFFFFFC2, arg3, arg4);
        class120 var9 = new class120(arg3, arg4);
        for (int var10 = 0; var10 < this.field5417.length; var10++) {
            this.field5417[var10].method2197(arg3, arg4, 85);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            if (arg0) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5441.field4940) {
                int[] var13 = this.field5441.method77(var12, -13093);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field5441.method391(var12, true);
                var15 = var17[2];
                var16 = var17[1];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field5424.field4940) {
                var18 = this.field5424.method77(var12, -13093);
            } else {
                var18 = this.field5424.method391(var12, true)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                int var21 = var16[var19] >> 4;
                int var22 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var23 = class238.field3933[var20];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class238.field3933[var22];
                int var25 = class238.field3933[var21];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field5571[var11++] = (var25 << 8) + (var23 << 16) + (var26 << 24) + var24;
                if (arg0) {
                    var11 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field5417.length; var27++) {
            this.field5417[var27].method1388(111);
        }
        return var9;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILth;ILla;ZI)[F", line = 787)
    public final float[] method2394(int arg0, class57 arg1, int arg2, class203 arg3, boolean arg4, int arg5) {
        float[] var7 = new float[arg5 * 4 * arg2];
        field5428++;
        class345.field5494 = arg1;
        class138.field2279 = arg3;
        class57.method464(0, arg5, arg2);
        for (int var8 = 0; var8 < this.field5417.length; var8++) {
            this.field5417[var8].method2197(arg5, arg2, 85);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            if (arg4) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field5441.field4940) {
                int[] var11 = this.field5441.method77(var10, -13093);
                var12 = var11;
                var13 = var11;
                var14 = var11;
            } else {
                int[][] var15 = this.field5441.method391(var10, true);
                var12 = var15[1];
                var14 = var15[2];
                var13 = var15[0];
            }
            int[] var16;
            if (this.field5424.field4940) {
                var16 = this.field5424.method77(var10, -13093);
            } else {
                var16 = this.field5424.method391(var10, true)[0];
            }
            int[] var17;
            if (this.field5419.field4940) {
                var17 = this.field5419.method77(var10, -13093);
            } else {
                var17 = this.field5419.method391(var10, true)[0];
            }
            for (int var18 = arg5 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = var19;
                if (arg4) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field5417.length; var21++) {
            this.field5417[var21].method1388(123);
        }
        if (arg0 > -17) {
            method2395(-59);
        }
        return var7;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V", line = 908)
    public static final void method2395(int arg0) {
        class118.field1998.method2326(-4);
        class101.field1657.method2326(-4);
        class362.field5740.method2326(-4);
        if (arg0 == -18581) {
            field5435++;
            class230.field3831.method2326(-4);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLla;Lth;)Z", line = 925)
    public final boolean method2396(byte arg0, class203 arg1, class57 arg2) {
        field5420++;
        if (arg0 != -74) {
            this.method2392(false, 57, (class203) null, 92, 122, 0.8304342436923671D, (class57) null);
        }
        if (class297.field4769 > 0) {
            for (int var4 = 0; var4 < this.field5416.length; var4++) {
                if (!arg2.method486(class297.field4769, this.field5416[var4], -90)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5416.length; var5++) {
                if (!arg2.method452(this.field5416[var5], (byte) -38)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field5423.length; var6++) {
            if (!arg1.method1558(0, this.field5423[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V", line = 978)
    public static void method2397(int arg0) {
        field5429 = null;
        field5434 = null;
        field5425 = null;
        field5430 = null;
        field5431 = null;
        if (arg0 == 255) {
            field5440 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V", line = 1001)
    public static final void method2398(boolean arg0, int arg1) {
        int var2 = 58 / ((-arg1 - 9) / 35);
        field5437++;
        byte[][] var3;
        if (class42.field607 && arg0) {
            var3 = class352.field5584;
        } else {
            var3 = class16.field190;
        }
        int var4 = class227.field3786.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var3[var5];
            if (var6 != null) {
                int var7 = (class121.field2079[var5] & 0xFF) * 64 - class275.field4546;
                int var8 = (class121.field2079[var5] >> 8) * 64 - class93.field1562;
                class195.method1506(false);
                class311.method2213(arg0, var7, class32.field459, var6, var8, true);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 1039)
    public class340() {
        this.field5423 = new int[0];
        this.field5416 = new int[0];
        this.field5419 = new class32(0);
        this.field5419.field4948 = 1;
        this.field5441 = new class32();
        this.field5441.field4948 = 1;
        this.field5424 = new class32();
        this.field5424.field4948 = 1;
        this.field5417 = new class310[] { this.field5441, this.field5424, this.field5419 };
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lqm;)V", line = 1054)
    public class340(class227 arg0) {
        int var2 = arg0.method1720((byte) -127);
        int var3 = 0;
        this.field5417 = new class310[var2];
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class310 var7 = class77.method637((byte) 117, arg0);
            if (var7.method1383(21076) >= 0) {
                var3++;
            }
            if (var7.method2089(true) >= 0) {
                var5++;
            }
            int var8 = var7.field4941.length;
            var4[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var4[var6][var9] = arg0.method1720((byte) -65);
            }
            this.field5417[var6] = var7;
        }
        this.field5423 = new int[var5];
        this.field5416 = new int[var3];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class310 var13 = this.field5417[var12];
            int var14 = var13.field4941.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4941[var15] = this.field5417[var4[var12][var15]];
            }
            int var16 = var13.method1383(21076);
            int var17 = var13.method2089(true);
            if (var16 > 0) {
                this.field5416[var10++] = var16;
            }
            if (var17 > 0) {
                this.field5423[var11++] = var17;
            }
            var4[var12] = null;
        }
        this.field5441 = this.field5417[arg0.method1720((byte) -51)];
        int[][] var18 = (int[][]) null;
        this.field5424 = this.field5417[arg0.method1720((byte) -22)];
        this.field5419 = this.field5417[arg0.method1720((byte) -118)];
    }
}
