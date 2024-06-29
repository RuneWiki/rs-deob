import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class144 extends class195 {

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    private int field2287 = 4096;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    private int field2289 = 409;

    @OriginalMember(owner = "client!hf", name = "gb", descriptor = "I")
    private int field2299 = 4096;

    @OriginalMember(owner = "client!hf", name = "hb", descriptor = "[I")
    private int[] field2300 = new int[3];

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    private int field2290 = 4096;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "Lck;")
    public static class119 field2291 = class298.method1987((byte) 66, "(U2");

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
    public static int field2295 = -1;

    @OriginalMember(owner = "client!hf", name = "jb", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!hf", name = "ib", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!hf", name = "kb", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "[[[B")
    public static byte[][][] field2294;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 163)
    public class144() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;I)Lck;", line = 15)
    public static final class119 method943(String arg0, int arg1) {
        field2292++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class119 var4 = new class119();
        var4.field1825 = 0;
        var4.field1838 = var2;
        if (arg1 != -6236) {
            return (class119) null;
        }
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field1825++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[[I", line = 60)
    public final int[][] method9(byte arg0, int arg1) {
        field2303++;
        if (arg0 != 3) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3126.method603(arg1, -127);
        if (this.field3126.field1372) {
            int[][] var4 = this.method1256(arg1, 0, arg0 - 10075);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class157.field2504; var11++) {
                int var12 = var7[var11];
                int var13 = var12 - this.field2300[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field2289 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var5[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field2300[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field2289 >= var15) {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field2300[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field2289) {
                            var8[var11] = this.field2299 * var12 >> 12;
                            var9[var11] = this.field2287 * var14 >> 12;
                            var10[var11] = this.field2290 * var16 >> 12;
                        } else {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        }
                    } else {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var5[var11];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V", line = 167)
    public static void method944(byte arg0) {
        field2291 = null;
        field2294 = (byte[][][]) null;
        int var1 = -61 / ((arg0 - 2) / 59);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V", line = 179)
    public static final void method945(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= (arg0 + arg5); var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class289.field4752[arg2][var7][var6] = 127;
                }
            }
        }
        if (arg3 != -1) {
            return;
        }
        for (int var8 = arg5; var8 < (arg0 + arg5); var8++) {
            for (int var9 = arg1; var9 < (arg1 + arg4); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class57.field926[arg2][var9][var8] = arg2 > 0 ? class57.field926[arg2 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var10 = arg5 + 1; var10 < (arg0 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class57.field926[arg2][arg1][var10] = class57.field926[arg2][arg1 - 1][var10];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var11 = arg1 + 1; var11 < arg1 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class57.field926[arg2][var11][arg5] = class57.field926[arg2][var11][arg5 - 1];
                }
            }
        }
        if (arg1 >= 0 && arg5 >= 0 && arg1 < 104 && arg5 < 104) {
            if (arg2 == 0) {
                if (arg1 > 0 && class57.field926[arg2][arg1 - 1][arg5] != 0) {
                    class57.field926[arg2][arg1][arg5] = class57.field926[arg2][arg1 - 1][arg5];
                } else if (arg5 > 0 && class57.field926[arg2][arg1][arg5 - 1] != 0) {
                    class57.field926[arg2][arg1][arg5] = class57.field926[arg2][arg1][arg5 - 1];
                } else if (arg1 > 0 && arg5 > 0 && class57.field926[arg2][arg1 - 1][arg5 - 1] != 0) {
                    class57.field926[arg2][arg1][arg5] = class57.field926[arg2][arg1 - 1][arg5 - 1];
                }
            } else if (arg1 > 0 && class57.field926[arg2 - 1][arg1 - 1][arg5] != class57.field926[arg2][arg1 - 1][arg5]) {
                class57.field926[arg2][arg1][arg5] = class57.field926[arg2][arg1 - 1][arg5];
            } else if (arg5 > 0 && class57.field926[arg2][arg1][arg5 - 1] != class57.field926[arg2 - 1][arg1][arg5 - 1]) {
                class57.field926[arg2][arg1][arg5] = class57.field926[arg2][arg1][arg5 - 1];
            } else if (arg1 > 0 && arg5 > 0 && class57.field926[arg2 - 1][arg1 - 1][arg5 - 1] != class57.field926[arg2][arg1 - 1][arg5 - 1]) {
                class57.field926[arg2][arg1][arg5] = class57.field926[arg2][arg1 - 1][arg5 - 1];
            }
        }
        field2297++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lfj;II)V", line = 315)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2289 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field2290 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field2287 = arg0.method63((byte) 1);
        } else if (arg2 == 3) {
            this.field2299 = arg0.method63((byte) 1);
        } else if (arg2 == 4) {
            int var5 = arg0.method48(64);
            this.field2300[0] = class19.method151(267386880, var5 << 4);
            this.field2300[1] = class19.method151(4080, var5 >> 4);
            this.field2300[2] = class19.method151(var5, 255) >> 12;
        }
        if (arg1 > -117) {
            method946((byte) -68, 77);
        }
        field2298++;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(BI)Z", line = 369)
    public static final boolean method946(byte arg0, int arg1) {
        if (arg0 != -84) {
            method944((byte) 118);
        }
        field2301++;
        return (arg1 & 0x1) != 0;
    }
}
