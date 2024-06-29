import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class161 extends class69 {

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "Llba;")
    private class223 field2068;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "Laga;")
    private class671 field2079;

    @OriginalMember(owner = "client!jga", name = "y", descriptor = "Lsca;")
    private class251 field2081;

    @OriginalMember(owner = "client!jga", name = "F", descriptor = "I")
    private int field2086;

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "I")
    private int field2080;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!jga", name = "I", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!jga", name = "J", descriptor = "[[F")
    private float[][] field2090;

    @OriginalMember(owner = "client!jga", name = "t", descriptor = "[[F")
    private float[][] field2076;

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "[[F")
    private float[][] field2082;

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "Lpm;")
    private class614 field2072;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "Lfw;")
    private class716 field2067;

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "Llk;")
    private class638 field2069;

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2070;

    @OriginalMember(owner = "client!jga", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2077;

    @OriginalMember(owner = "client!jga", name = "B", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "[I")
    public static int[] field2071 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "Z")
    public static boolean field2078 = false;

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!jga", name = "D", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!jga", name = "G", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!jga", name = "H", descriptor = "I")
    public static int field2088;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jga", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field2091;

    @OriginalMember(owner = "client!jga", name = "E", descriptor = "[Lho;")
    public static class318[] field2085;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1029(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IS)V", line = 16)
    private final void method1024(int arg0, short arg1) {
        if (arg0 < 106) {
            return;
        }
        if (Stream.method2346()) {
            this.field2077.method2339(arg1);
        } else {
            this.field2077.method2343(arg1);
        }
        field2087++;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V", line = 39)
    public static void method1025(int arg0) {
        field2071 = null;
        if (arg0 == 0) {
            field2085 = null;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIIIZI)V", line = 50)
    private final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2075++;
        long var8 = -1L;
        int var10 = (arg4 << this.field2079.field5825) + arg1;
        int var11 = arg2 + (arg6 << this.field2079.field5825);
        int var12 = this.field2079.method2529(var11, var10, (byte) -128);
        if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class69 var13 = this.field2069.method3669(arg5, var8);
            if (var13 != null) {
                this.method1024(125, ((class463) var13).field6465);
                return;
            }
        }
        short var14 = (short) (this.field2083++);
        if (var8 != -1L) {
            this.field2069.method3666((byte) 65, var8, new class463(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg2 == 0) {
            var15 = this.field2082[arg0][arg3];
            var16 = this.field2090[arg0][arg3];
            var17 = this.field2076[arg0][arg3];
        } else if (this.field2079.field5818 == arg1 && arg2 == 0) {
            var15 = this.field2082[arg0 + 1][arg3];
            var17 = this.field2076[arg0 + 1][arg3];
            var16 = this.field2090[arg0 + 1][arg3];
        } else if (this.field2079.field5818 == arg1 && this.field2079.field5818 == arg2) {
            var15 = this.field2082[arg0 + 1][arg3 + 1];
            var16 = this.field2090[arg0 + 1][arg3 + 1];
            var17 = this.field2076[arg0 + 1][arg3 + 1];
        } else if (arg1 == 0 && this.field2079.field5818 == arg2) {
            var16 = this.field2090[arg0][arg3 + 1];
            var17 = this.field2076[arg0][arg3 + 1];
            var15 = this.field2082[arg0][arg3 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field2079.field5818;
            float var19 = (float) arg2 / (float) this.field2079.field5818;
            float var20 = this.field2090[arg0][arg3];
            float var21 = this.field2082[arg0][arg3];
            float var22 = this.field2076[arg0][arg3];
            float var23 = this.field2090[arg0 + 1][arg3];
            float var24 = this.field2082[arg0 + 1][arg3];
            float var25 = (this.field2076[arg0][arg3 + 1] - var22) * var18 + var22;
            float var26 = (this.field2090[arg0 + 1][arg3 + 1] - var23) * var18 + var23;
            float var27 = this.field2076[arg0 + 1][arg3];
            float var28 = (this.field2082[arg0 + 1][arg3 + 1] - var24) * var18 + var24;
            float var29 = (this.field2090[arg0][arg3 + 1] - var20) * var18 + var20;
            float var30 = (this.field2082[arg0][arg3 + 1] - var21) * var18 + var21;
            var15 = (var28 - var30) * var19 + var30;
            var16 = (var26 - var29) * var19 + var29;
            float var31 = (this.field2076[arg0 + 1][arg3 + 1] - var27) * var18 + var27;
            var17 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field2081.method1683(10918) - var10);
        float var33 = (float) (this.field2081.method1687(1110) - var12);
        float var34 = (float) (this.field2081.method1686(arg5) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field2081.method1685(-33);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2081.method1684(-1);
        int var45 = (int) ((float) ((var44 & 0xFF1AAD) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method2346()) {
            this.field2070.method2340((float) var10);
            this.field2070.method2340((float) var12);
            this.field2070.method2340((float) var11);
        } else {
            this.field2070.method2350((float) var10);
            this.field2070.method2350((float) var12);
            this.field2070.method2350((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2068.field3326 == 0) {
            this.field2070.method2345(var47);
            this.field2070.method2345(var46);
            this.field2070.method2345(var45);
        } else {
            this.field2070.method2345(var45);
            this.field2070.method2345(var46);
            this.field2070.method2345(var47);
        }
        this.field2070.method2345(255);
        this.method1024(108, var14);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 228)
    public static final boolean method1027(int arg0, String arg1) {
        if (arg0 < 12) {
            field2085 = null;
        }
        field2088++;
        return class567.method3340(field2091 == null ? (field2091 = method1029("dv")) : field2091, -13930, arg1);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(II[[ZII)V", line = 246)
    public final void method1028(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field2073++;
        if (this.field2072 == null || this.field2086 > arg3 + arg1 || (arg3 - arg1) > this.field2080 || arg4 != 10517 || this.field2066 > arg0 + arg1 || arg0 - arg1 > this.field2089) {
            return;
        }
        for (int var6 = this.field2066; var6 <= this.field2089; var6++) {
            for (int var7 = this.field2086; var7 <= this.field2080; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg0;
                if (var8 > -arg1 && var8 < arg1 && var9 > -arg1 && arg1 > var9 && arg2[arg1 + var8][arg1 + var9]) {
                    this.field2068.method1429((byte) ((int) (this.field2081.method1688(51) * 255.0F)), 1);
                    this.field2068.method1386((byte) -121, this.field2067, 0);
                    this.field2068.method1485(this.field2068.field3396, arg4 - 10485);
                    this.field2068.method1430((byte) -96, 0, class625.field8750, this.field2072, this.field2074 / 3, 0, this.field2083);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Llba;Laga;Lsca;[I)V", line = 301)
    public class161(class223 arg0, class671 arg1, class251 arg2, int[] arg3) {
        this.field2068 = arg0;
        this.field2079 = arg1;
        this.field2081 = arg2;
        int var5 = this.field2081.method1685(-69) - (arg1.field5818 >> 1);
        this.field2086 = this.field2081.method1683(10918) - var5 >> arg1.field5825;
        this.field2080 = this.field2081.method1683(10918) + var5 >> arg1.field5825;
        this.field2066 = this.field2081.method1686(false) - var5 >> arg1.field5825;
        this.field2089 = var5 + this.field2081.method1686(false) >> arg1.field5825;
        int var6 = this.field2080 + 1 - this.field2086;
        int var7 = this.field2089 + 1 - this.field2066;
        this.field2090 = new float[var6 + 1][var7 + 1];
        this.field2076 = new float[var6 + 1][var7 + 1];
        this.field2082 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field2066 + var8;
            if (var27 > 0 && this.field2079.field5826 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field2086 + var28;
                    if (var29 > 0 && this.field2079.field5827 - 1 > var29) {
                        int var30 = arg1.method2525(var29 + 1, var27, (byte) 114) - arg1.method2525(var29 - 1, var27, (byte) 114);
                        int var31 = arg1.method2525(var29, var27 + 1, (byte) 114) - arg1.method2525(var29, var27 - 1, (byte) 114);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field2090[var28][var8] = (float) var30 * var32;
                        this.field2082[var28][var8] = var32 * -256.0F;
                        this.field2076[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field2066; var10 <= this.field2089; var10++) {
            if (var10 >= 0 && arg1.field5826 > var10) {
                for (int var23 = this.field2086; var23 <= this.field2080; var23++) {
                    if (var23 >= 0 && arg1.field5827 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field9400[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field2074 += 3;
                                    }
                                }
                            } else {
                                this.field2074 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field2080 - this.field2086;
            }
        }
        if (this.field2074 <= 0) {
            this.field2072 = null;
            this.field2067 = null;
        } else {
            this.field2069 = new class638(class179.method1142(this.field2074, 69));
            this.field2072 = this.field2068.method1389(9, false);
            this.field2072.method1119(this.field2074, -27671);
            NativeHeapBuffer var11 = this.field2068.method1381(-83, false, this.field2074 * 16);
            this.field2070 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field2072.method1126(true, (byte) 112);
                } while (var12 == null);
                this.field2077 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field2066; var15 <= this.field2089; var15++) {
                    if (var15 >= 0 && arg1.field5826 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field2086; var17 <= this.field2080; var17++) {
                            if (var17 >= 0 && arg1.field5827 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field9400[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field9415[var17][var15];
                                        int[] var21 = arg1.field9391[var17][var15];
                                        int var22 = 0;
                                        label121: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label121;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method1026(var16, var20[var22], var21[var22], var14, var17, false, var15);
                                                    var22++;
                                                    this.method1026(var16, var20[var22], var21[var22], var14, var17, false, var15);
                                                    var22++;
                                                    this.method1026(var16, var20[var22], var21[var22], var14, var17, false, var15);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method1026(var16, 0, 0, var14, var17, false, var15);
                                        this.method1026(var16, arg1.field5818, 0, var14, var17, false, var15);
                                        this.method1026(var16, 0, arg1.field5818, var14, var17, false, var15);
                                    } else if (var18 == 2) {
                                        this.method1026(var16, arg1.field5818, 0, var14, var17, false, var15);
                                        this.method1026(var16, arg1.field5818, arg1.field5818, var14, var17, false, var15);
                                        this.method1026(var16, 0, 0, var14, var17, false, var15);
                                    } else if (var18 == 5) {
                                        this.method1026(var16, arg1.field5818, arg1.field5818, var14, var17, false, var15);
                                        this.method1026(var16, 0, arg1.field5818, var14, var17, false, var15);
                                        this.method1026(var16, arg1.field5818, 0, var14, var17, false, var15);
                                    } else if (var18 == 4) {
                                        this.method1026(var16, 0, arg1.field5818, var14, var17, false, var15);
                                        this.method1026(var16, 0, 0, var14, var17, false, var15);
                                        this.method1026(var16, arg1.field5818, arg1.field5818, var14, var17, false, var15);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field2080 - this.field2086;
                    }
                    var14++;
                }
                this.field2077.method2351();
                if (this.field2072.method1121(3104)) {
                    this.field2070.method2351();
                    this.field2067 = this.field2068.method1421(false, true);
                    this.field2067.method2280((byte) 30, 16, var11, this.field2083 * 16);
                    break;
                }
                this.field2070.method2338(0);
                this.field2069.method3672(0);
            }
        }
        this.field2070 = null;
        this.field2069 = null;
        this.field2090 = this.field2082 = this.field2076 = null;
        this.field2077 = null;
    }
}
