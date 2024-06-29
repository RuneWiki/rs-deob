import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class125 implements Runnable {

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Z")
    private boolean field2302 = false;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Z")
    private boolean field2312 = false;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    private int field2317 = 0;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    private int field2323 = 0;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field2295;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "Ltj;")
    private class262 field2309;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Ljava/io/InputStream;")
    private InputStream field2307;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2315;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Z")
    public static boolean field2306 = false;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
    public static volatile boolean field2292 = true;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "[I")
    public static int[] field2318 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "Loh;")
    private static class263 field2319 = class253.method1681(-121, "Connection lost)3");

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "Z")
    public static boolean field2322 = true;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "Loh;")
    public static class263 field2310 = field2319;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "Lqf;")
    private class235 field2320;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "[B")
    private byte[] field2324;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public final void method798(int arg0) {
        field2298++;
        if (this.field2312) {
            return;
        }
        this.field2307 = new class189();
        this.field2315 = new class268();
        if (arg0 != 2061376624) {
            this.method798(-118);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLue;Lue;)V")
    public static final void method799(byte arg0, class86 arg1, class86 arg2) {
        field2305++;
        if (arg0 != -118) {
            method799((byte) -68, (class86) null, (class86) null);
        }
        class134.field2452 = arg1;
        class251.field4365 = arg2;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)I")
    public final int method800(byte arg0) throws IOException {
        if (arg0 != -126) {
            this.field2315 = null;
        }
        field2300++;
        return this.field2312 ? 0 : this.field2307.read();
    }

    @OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method809((byte) 73);
        field2313++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public static final void method801(int arg0) {
        field2293++;
        class122.field2258.method825(0);
        if (arg0 >= -88) {
            method804(-17, 42, 36, 99, 91);
        }
        class93.field1835.method825(0);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Loh;IZ)V")
    public static final void method802(class263 arg0, int arg1, boolean arg2) {
        if (arg2) {
            try {
                class234.field4108.getAppletContext().showDocument(arg0.method1758(class234.field4108.getCodeBase(), (byte) 126), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class234.field4108.getAppletContext().showDocument(arg0.method1758(class234.field4108.getCodeBase(), (byte) 126), "_top");
            } catch (Exception var3) {
            }
        }
        if (arg1 >= -51) {
            method812(-69);
        }
        field2291++;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)I")
    public final int method803(int arg0) throws IOException {
        field2299++;
        if (arg0 > -87) {
            field2310 = null;
        }
        return this.field2312 ? 0 : this.field2307.available();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V")
    public static final void method804(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2296++;
        class103 var5 = (class103) class184.field3327.method31(-32665, (long) arg1);
        if (var5 == null) {
            var5 = new class103();
            class184.field3327.method33(var5, (long) arg1, -108);
        }
        if (arg2 != -1) {
            field2306 = false;
        }
        if (var5.field1964.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field1964.length; var8++) {
                var6[var8] = var5.field1964[var8];
                var7[var8] = var5.field1951[var8];
            }
            for (int var9 = var5.field1964.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1964 = var6;
            var5.field1951 = var7;
        }
        var5.field1964[arg4] = arg0;
        var5.field1951[arg4] = arg3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILpc;III)V")
    public static final void method805(int arg0, class21 arg1, int arg2, int arg3, int arg4) {
        field2294++;
        class61.method371((byte) 77);
        class133.method881(arg2, arg3, arg2 + arg1.field539, arg1.field479 + arg3);
        if (class159.field2900 == 2 || class159.field2900 == 5 || class157.field2836 == null) {
            class133.method879(arg2, arg3, 0, arg1.field543, arg1.field512);
        } else {
            int var5 = class241.field4230 + class201.field3625 & 0x7FF;
            int var6 = class229.field4018.field4688 / 32 + 48;
            int var7 = 464 - class229.field4018.field4705 / 32;
            ((class140) class157.field2836).method920(arg2, arg3, arg1.field539, arg1.field479, var6, var7, var5, class121.field2255 + 256, arg1.field543, arg1.field512);
            if (class27.field714 != null) {
                for (int var8 = 0; var8 < class27.field714.field358; var8++) {
                    if (class27.field714.method110(var8, (byte) -53)) {
                        int var9 = (class27.field714.field356[var8] - class93.field1844) * 4 - ((class229.field4018.field4688 / 32) - 2);
                        int var10 = (class27.field714.field364[var8] - class142.field2596) * 4 + 2 - (class229.field4018.field4705 / 32);
                        int var11 = class270.field4762[var5];
                        int var12 = var11 * 256 / (class121.field2255 + 256);
                        int var13 = class270.field4769[var5];
                        class65 var14 = class11.field243;
                        int var15 = var13 * 256 / (class121.field2255 + 256);
                        int var16 = var10 * var12 - (var9 * var15) >> 16;
                        if (class27.field714.method108(var8, 3) == 1) {
                            var14 = class151.field2733;
                        }
                        if (class27.field714.method108(var8, 3) == 2) {
                            var14 = class107.field2026;
                        }
                        int var17 = var9 * var12 + var10 * var15 >> 16;
                        int var18 = var14.method402(class27.field714.field357[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg1.field539 && var19 <= arg1.field539 && -arg1.field479 <= var16 && arg1.field479 >= var16) {
                            int var20 = 16777215;
                            if (class27.field714.field352[var8] != -1) {
                                var20 = class27.field714.field352[var8];
                            }
                            class133.method859(arg1.field543, arg1.field512);
                            var14.method407(class27.field714.field357[var8], arg1.field539 / 2 + arg2 + var19, arg1.field479 / 2 + -var16 + arg3, var18, 50, var20, 0, 256, 1, 0, 0);
                            class133.method875();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class165.field3004; var21++) {
                int var56 = class234.field4100[var21] * 4 + 2 - (class229.field4018.field4688 / 32);
                int var57 = class116.field2170[var21] * 4 + 2 - (class229.field4018.field4705 / 32);
                class12 var58 = class117.method763(class165.field3006[var21], (byte) -125);
                if (var58.field328 != null) {
                    var58 = var58.method97(110);
                    if (var58 == null || var58.field271 == -1) {
                        continue;
                    }
                }
                class272.method1850(class24.field684[var58.field271], arg1, arg2, var56, var57, arg3, true);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class277 var53 = class107.field2020[class12.field321][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class229.field4018.field4688 / 32);
                        int var55 = var52 * 4 + 2 - (class229.field4018.field4705 / 32);
                        class272.method1850(class176.field3180[0], arg1, arg2, var54, var55, arg3, true);
                    }
                }
            }
            for (int var23 = 0; var23 < class13.field345; var23++) {
                class90 var48 = class31.field774[class117.field2191[var23]];
                if (var48 != null && var48.method633((byte) 109)) {
                    class204 var49 = var48.field1787;
                    if (var49 != null && var49.field3691 != null) {
                        var49 = var49.method1407((byte) -31);
                    }
                    if (var49 != null && var49.field3710 && var49.field3708) {
                        int var50 = var48.field4705 / 32 - (class229.field4018.field4705 / 32);
                        int var51 = var48.field4688 / 32 - (class229.field4018.field4688 / 32);
                        class272.method1850(class176.field3180[1], arg1, arg2, var51, var50, arg3, true);
                    }
                }
            }
            for (int var24 = 0; var24 < class41.field911; var24++) {
                class137 var38 = class151.field2725[class249.field4354[var24]];
                if (var38 != null && var38.method633((byte) 115)) {
                    int var39 = var38.field4688 / 32 - (class229.field4018.field4688 / 32);
                    boolean var40 = false;
                    int var41 = var38.field4705 / 32 - (class229.field4018.field4705 / 32);
                    long var42 = var38.field2508.method1755(1);
                    for (int var44 = 0; var44 < class100.field1908; var44++) {
                        if (class38.field871[var44] == var42 && class92.field1812[var44] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class196.field3545; var46++) {
                        if (class225.field3970[var46].field4226 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class229.field4018.field2541 != 0 && var38.field2541 != 0 && class229.field4018.field2541 == var38.field2541) {
                        var47 = true;
                    }
                    if (var40) {
                        class272.method1850(class176.field3180[3], arg1, arg2, var39, var41, arg3, true);
                    } else if (var45) {
                        class272.method1850(class176.field3180[5], arg1, arg2, var39, var41, arg3, true);
                    } else if (var47) {
                        class272.method1850(class176.field3180[4], arg1, arg2, var39, var41, arg3, true);
                    } else {
                        class272.method1850(class176.field3180[2], arg1, arg2, var39, var41, arg3, true);
                    }
                }
            }
            int var25 = 0;
            class50[] var26 = class1.field17;
            while (var26.length > var25) {
                class50 var29 = var26[var25];
                if (var29 != null && var29.field1079 != 0 && (class228.field4012 % 20) < 10) {
                    if (var29.field1079 == 1 && var29.field1072 >= 0 && class31.field774.length > var29.field1072) {
                        class90 var30 = class31.field774[var29.field1072];
                        if (var30 != null) {
                            int var31 = var30.field4688 / 32 - (class229.field4018.field4688 / 32);
                            int var32 = var30.field4705 / 32 - class229.field4018.field4705 / 32;
                            class164.method1078(arg1, arg2, var29.field1080, var32, arg3, var31, arg4 - 108);
                        }
                    }
                    if (var29.field1079 == 2) {
                        int var33 = (var29.field1076 - class93.field1844) * 4 + 2 - (class229.field4018.field4688 / 32);
                        int var34 = (var29.field1081 - class142.field2596) * 4 + 2 - (class229.field4018.field4705 / 32);
                        class164.method1078(arg1, arg2, var29.field1080, var34, arg3, var33, -121);
                    }
                    if (var29.field1079 == 10 && var29.field1072 >= 0 && var29.field1072 < class151.field2725.length) {
                        class137 var35 = class151.field2725[var29.field1072];
                        if (var35 != null) {
                            int var36 = var35.field4688 / 32 - (class229.field4018.field4688 / 32);
                            int var37 = var35.field4705 / 32 - (class229.field4018.field4705 / 32);
                            class164.method1078(arg1, arg2, var29.field1080, var37, arg3, var36, -126);
                        }
                    }
                }
                var25++;
            }
            if (class105.field1988 != 0) {
                int var27 = class194.field3465 * 4 + 2 - (class229.field4018.field4705 / 32);
                int var28 = class105.field1988 * 4 + 2 - class229.field4018.field4688 / 32;
                class272.method1850(class181.field3287, arg1, arg2, var28, var27, arg3, true);
            }
            class133.method865(arg1.field539 / 2 + arg2 - 1, arg3 - -(arg1.field479 / 2) + -1, 3, 3, 16777215);
        }
        if (arg4 == 1) {
            class183.field3317[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[BI)V")
    public final void method806(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2303++;
        if (this.field2312) {
            return;
        }
        if (this.field2302) {
            this.field2302 = false;
            throw new IOException();
        }
        if (this.field2324 == null) {
            this.field2324 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field2324[this.field2317] = arg2[arg0 + var6];
                this.field2317 = (this.field2317 + 1) % 5000;
                if ((this.field2323 + 4900) % 5000 == this.field2317) {
                    throw new IOException();
                }
            }
            if (arg3 >= -98) {
                this.method798(87);
            }
            if (this.field2320 == null) {
                this.field2320 = this.field2309.method1724((byte) 118, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIZIIIIIIIIII)Z")
    public static final boolean method807(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class176.field3173[var13][var40] = 0;
                class178.field3266[var13][var40] = 99999999;
            }
        }
        class176.field3173[arg4][arg9] = 99;
        class178.field3266[arg4][arg9] = 0;
        field2297++;
        if (arg8 < 92) {
            method799((byte) 110, (class86) null, (class86) null);
        }
        int var14 = arg9;
        int var15 = arg4;
        int var16 = 0;
        boolean var17 = false;
        byte var18 = 0;
        class251.field4364[var18] = arg4;
        int var41 = var18 + 1;
        class212.field3789[var18] = arg9;
        int[][] var19 = class103.field1954[class12.field321].field1527;
        label372: while (var16 != var41) {
            var15 = class251.field4364[var16];
            var14 = class212.field3789[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg10 == var15 && arg1 == var14) {
                var17 = true;
                break;
            }
            if (arg12 != 0) {
                if ((arg12 < 5 || arg12 == 10) && class103.field1954[class12.field321].method483(arg10, arg6, var15, arg1, arg7, 65536, arg12 - 1, var14)) {
                    var17 = true;
                    break;
                }
                if (arg12 < 10 && class103.field1954[class12.field321].method485(var15, arg6, arg10, arg12 - 1, arg7, arg1, -119, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg0 != 0 && class103.field1954[class12.field321].method486(var14, arg6, arg3, arg0, arg1, arg5, var15, arg10, (byte) 121)) {
                var17 = true;
                break;
            }
            int var31 = class178.field3266[var15][var14] + 1;
            if (var15 > 0 && class176.field3173[var15 - 1][var14] == 0 && (var19[var15 - 1][var14] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + arg6 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg6 - 1) {
                        class251.field4364[var41] = var15 - 1;
                        class212.field3789[var41] = var14;
                        var41 = var41 + 1 & 0xFFF;
                        class176.field3173[var15 - 1][var14] = 2;
                        class178.field3266[var15 - 1][var14] = var31;
                        break;
                    }
                    if ((var19[var15 - 1][var14 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var15 < 102 && class176.field3173[var15 + 1][var14] == 0 && (var19[arg6 + var15][var14] & 0x12C0183) == 0 && (var19[var15 + arg6][arg6 + var14 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg6 - 1) {
                        class251.field4364[var41] = var15 + 1;
                        class212.field3789[var41] = var14;
                        var41 = var41 + 1 & 0xFFF;
                        class176.field3173[var15 + 1][var14] = 8;
                        class178.field3266[var15 + 1][var14] = var31;
                        break;
                    }
                    if ((var19[var15 + arg6][var14 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var14 > 0 && class176.field3173[var15][var14 - 1] == 0 && (var19[var15][var14 - 1] & 0x12C010E) == 0 && (var19[arg6 + var15 - 1][var14 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg6 - 1 <= var34) {
                        class251.field4364[var41] = var15;
                        class212.field3789[var41] = var14 - 1;
                        class176.field3173[var15][var14 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class178.field3266[var15][var14 - 1] = var31;
                        break;
                    }
                    if ((var19[var15 + var34][var14 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var14 < 102 && class176.field3173[var15][var14 + 1] == 0 && (var19[var15][arg6 + var14] & 0x12C0138) == 0 && (var19[arg6 + var15 - 1][var14 + arg6] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (arg6 - 1 <= var35) {
                        class251.field4364[var41] = var15;
                        class212.field3789[var41] = var14 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class176.field3173[var15][var14 + 1] = 4;
                        class178.field3266[var15][var14 + 1] = var31;
                        break;
                    }
                    if ((var19[var15 + var35][arg6 + var14] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var15 > 0 && var14 > 0 && class176.field3173[var15 - 1][var14 - 1] == 0 && (var19[var15 - 1][var14 + arg6 - 1 - 1] & 0x12C0138) == 0 && (var19[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + arg6 - 1 - 1][var14 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (arg6 - 1 <= var36) {
                        class251.field4364[var41] = var15 - 1;
                        class212.field3789[var41] = var14 - 1;
                        class176.field3173[var15 - 1][var14 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class178.field3266[var15 - 1][var14 - 1] = var31;
                        break;
                    }
                    if ((var19[var15 - 1][var14 + var36 - 1] & 0x12C013E) != 0 || (var19[var15 + var36 - 1][var14 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var15 < 102 && var14 > 0 && class176.field3173[var15 + 1][var14 - 1] == 0 && (var19[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var19[arg6 + var15][var14 - 1] & 0x12C0183) == 0 && (var19[var15 + arg6][arg6 + var14 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= arg6 - 1) {
                        class251.field4364[var41] = var15 + 1;
                        class212.field3789[var41] = var14 - 1;
                        class176.field3173[var15 + 1][var14 - 1] = 9;
                        class178.field3266[var15 + 1][var14 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg6 + var15][var37 + var14 - 1] & 0x12C01E3) != 0 || (var19[var15 + var37 + 1][var14 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var15 > 0 && var14 < 102 && class176.field3173[var15 - 1][var14 + 1] == 0 && (var19[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + arg6] & 0x12C0138) == 0 && (var19[var15][arg6 + var14] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg6 - 1) {
                        class251.field4364[var41] = var15 - 1;
                        class212.field3789[var41] = var14 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class176.field3173[var15 - 1][var14 + 1] = 6;
                        class178.field3266[var15 - 1][var14 + 1] = var31;
                        break;
                    }
                    if ((var19[var15 - 1][var14 + var38 + 1] & 0x12C013E) != 0 || (var19[var15 + var38 - 1][var14 + arg6] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var15 < 102 && var14 < 102 && class176.field3173[var15 + 1][var14 + 1] == 0 && (var19[var15 + 1][var14 + arg6] & 0x12C0138) == 0 && (var19[arg6 + var15][var14 + arg6] & 0x12C01E0) == 0 && (var19[arg6 + var15][var14 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg6 - 1); var39++) {
                    if ((var19[var15 + var39 + 1][arg6 + var14] & 0x12C01F8) != 0 || (var19[var15 + arg6][var14 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class251.field4364[var41] = var15 + 1;
                class212.field3789[var41] = var14 + 1;
                class176.field3173[var15 + 1][var14 + 1] = 12;
                class178.field3266[var15 + 1][var14 + 1] = var31;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class209.field3774 = 0;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg10 - var22; var23 <= arg10 + var22; var23++) {
                for (int var24 = arg1 - var22; var24 <= arg1 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class178.field3266[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg10 > var23) {
                            var25 = arg10 - var23;
                        } else if (var23 > arg3 + arg10 - 1) {
                            var25 = 1 - arg10 - (arg3 - var23);
                        }
                        int var26 = 0;
                        if (arg1 > var24) {
                            var26 = arg1 - var24;
                        } else if (var24 > (arg0 + arg1 - 1)) {
                            var26 = var24 + 1 - arg1 - arg0;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class178.field3266[var23][var24]) {
                            var21 = class178.field3266[var23][var24];
                            var15 = var23;
                            var20 = var27;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg4 == var15 && arg9 == var14) {
                return false;
            }
            class209.field3774 = 1;
        }
        byte var28 = 0;
        class251.field4364[var28] = var15;
        int var42 = var28 + 1;
        class212.field3789[var28] = var14;
        int var29;
        int var30 = var29 = class176.field3173[var15][var14];
        while (arg4 != var15 || arg9 != var14) {
            if (var29 != var30) {
                class251.field4364[var42] = var15;
                class212.field3789[var42++] = var14;
                var29 = var30;
            }
            if ((var30 & 0x2) != 0) {
                var15++;
            } else if ((var30 & 0x8) != 0) {
                var15--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class176.field3173[var15][var14];
        }
        if (var42 > 0) {
            class269.method1818(-97, var42, arg11);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
    public static final void method808(int arg0) {
        for (int var1 = 0; var1 < class13.field345; var1++) {
            int var2 = class117.field2191[var1];
            class90 var3 = class31.field774[var2];
            if (var3 != null) {
                class48.method311(var3.field1787.field3694, var3, 64);
            }
        }
        field2301++;
        if (arg0 != -397) {
            field2322 = false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public final void method809(byte arg0) {
        field2321++;
        if (this.field2312) {
            return;
        }
        synchronized (this) {
            this.field2312 = true;
            this.notifyAll();
        }
        if (arg0 <= 61) {
            this.field2312 = false;
        }
        if (this.field2320 != null) {
            while (this.field2320.field4114 == 0) {
                class215.method1457(1L, (byte) 109);
            }
            if (this.field2320.field4114 == 1) {
                try {
                    ((Thread) this.field2320.field4117).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2320 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III[B)V")
    public final void method810(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2304++;
        if (this.field2312 || arg1 != -1) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field2307.read(arg3, arg0, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
    public final void method811(int arg0) throws IOException {
        field2316++;
        if (arg0 < 54) {
            method807(48, 44, false, 1, 0, 60, 119, 1, -91, 28, 18, -66, -100);
        }
        if (!this.field2312 && this.field2302) {
            this.field2302 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
    public static void method812(int arg0) {
        field2310 = null;
        field2319 = null;
        field2318 = null;
        if (arg0 != 0) {
            method799((byte) -91, (class86) null, (class86) null);
        }
    }

    @OriginalMember(owner = "client!nk", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2323 == this.field2317) {
                            if (this.field2312) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field2317 >= this.field2323) {
                            var2 = this.field2317 - this.field2323;
                        } else {
                            var2 = 5000 - this.field2323;
                        }
                        var3 = this.field2323;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field2315.write(this.field2324, var3, var2);
                    } catch (IOException var9) {
                        this.field2302 = true;
                    }
                    this.field2323 = (this.field2323 + var2) % 5000;
                    try {
                        if (this.field2323 == this.field2317) {
                            this.field2315.flush();
                        }
                    } catch (IOException var8) {
                        this.field2302 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2307 != null) {
                        this.field2307.close();
                    }
                    if (this.field2315 != null) {
                        this.field2315.close();
                    }
                    if (this.field2295 != null) {
                        this.field2295.close();
                    }
                } catch (IOException var7) {
                }
                this.field2324 = null;
                break;
            }
        } catch (Exception var12) {
            class137.method899(var12, (String) null, 46);
        }
        field2314++;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/net/Socket;Ltj;)V")
    public class125(Socket arg0, class262 arg1) throws IOException {
        this.field2295 = arg0;
        this.field2309 = arg1;
        this.field2295.setSoTimeout(30000);
        this.field2295.setTcpNoDelay(true);
        this.field2307 = this.field2295.getInputStream();
        this.field2315 = this.field2295.getOutputStream();
    }
}
