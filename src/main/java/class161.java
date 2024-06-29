import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class161 implements Runnable {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[Lej;")
    public volatile class55[] field3104 = new class55[2];

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Z")
    public volatile boolean field3108 = false;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Z")
    public volatile boolean field3109 = false;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field3103 = 0;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field3113 = 1;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Li;")
    public static class88 field3110 = class208.method1425(105, "gelb:");

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Li;")
    private static class88 field3112 = class208.method1425(105, "Service unavailable)3");

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Li;")
    public static class88 field3114 = field3112;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lqg;")
    public class181 field3111;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Lbj;")
    public static class22 field3115;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)J")
    public static final long method1084(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        return var3 == null || var3.field956 == null ? 0L : var3.field956.field1158;
    }

    @OriginalMember(owner = "client!oi", name = "run", descriptor = "()V")
    public final void run() {
        field3105++;
        this.field3109 = true;
        try {
            while (!this.field3108) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class55 var2 = this.field3104[var1];
                    if (var2 != null) {
                        var2.method406((byte) -70);
                    }
                }
                class21.method98(10L, (byte) 38);
                class149.method1008(-1, null, this.field3111);
            }
        } catch (Exception var9) {
            class221.method1490((byte) 0, null, var9);
        } finally {
            Object var6 = null;
            this.field3109 = false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method1085(byte arg0) {
        if (arg0 == -73) {
            field3110 = null;
            field3115 = null;
            field3114 = null;
            field3112 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Li;Lq;I)Li;")
    public static final class88 method1086(class88 arg0, class174 arg1, int arg2) {
        if (arg2 != 64) {
            field3103 = -72;
        }
        if (arg0.method617(-53, class149.field2897) != -1) {
            label62: while (true) {
                int var3 = arg0.method617(-73, class115.field2082);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method617(-44, class166.field3191);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method617(-80, class18.field289);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method617(arg2 ^ 0x25, class102.field1850);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method617(101, class134.field2501);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method617(-105, class188.field3648);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class88 var9 = class174.field3455;
                                                        if (class49.field912 != null) {
                                                            var9 = class141.method928(-1, class49.field912.field3134);
                                                            try {
                                                                if (class49.field912.field3131 != null) {
                                                                    byte[] var10 = ((String) class49.field912.field3131).getBytes("ISO-8859-1");
                                                                    var9 = class54.method395(0, (byte) -116, var10, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class166.method1142(new class88[] { arg0.method623(0, (byte) -73, var8), var9, arg0.method635(var8 + 4, arg2 + -383902396) }, -3);
                                                    }
                                                }
                                                arg0 = class166.method1142(new class88[] { arg0.method623(0, (byte) -122, var7), class211.method1444(-114, class110.method763((byte) -125, 4, arg1)), arg0.method635(var7 + 2, -383902332) }, -3);
                                            }
                                        }
                                        arg0 = class166.method1142(new class88[] { arg0.method623(0, (byte) -106, var6), class211.method1444(arg2 ^ 0xFFFFFFEB, class110.method763((byte) -102, 3, arg1)), arg0.method635(var6 + 2, -383902332) }, -3);
                                    }
                                }
                                arg0 = class166.method1142(new class88[] { arg0.method623(0, (byte) -59, var5), class211.method1444(-89, class110.method763((byte) -107, 2, arg1)), arg0.method635(var5 + 2, arg2 + -383902396) }, -3);
                            }
                        }
                        arg0 = class166.method1142(new class88[] { arg0.method623(0, (byte) -7, var4), class211.method1444(arg2 ^ 0xFFFFFFF2, class110.method763((byte) -104, 1, arg1)), arg0.method635(var4 + 2, arg2 ^ 0xE91E1DC4) }, -3);
                    }
                }
                arg0 = class166.method1142(new class88[] { arg0.method623(0, (byte) -71, var3), class211.method1444(-53, class110.method763((byte) -127, 0, arg1)), arg0.method635(var3 + 2, arg2 + -383902396) }, arg2 ^ 0xFFFFFFBD);
            }
        }
        field3102++;
        return arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B)V")
    public static final void method1087(int arg0, byte[] arg1) {
        field3106++;
        int var2 = class218.field4088 >> 2 << 10;
        byte[][] var3 = new byte[class109.field1990][class44.field760];
        int var4 = class70.field1270 >> 1;
        int var5 = 0;
        while (true) {
            while (arg1.length > var5) {
                int var34 = (arg1[var5++] & 0xFF) * 64 - class16.field239;
                int var35 = (arg1[var5++] & 0xFF) * 64 - class119.field2183;
                if (var34 > 0 && var35 > 0 && var34 + 64 < class109.field1990 && var35 + 64 < class44.field760) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        byte[] var37 = var3[var34 + var36];
                        int var38 = class44.field760 - var35 - 1;
                        for (int var39 = -64; var39 < 0; var39++) {
                            var37[var38--] = arg1[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            int var6 = class44.field760;
            int var7 = class109.field1990;
            int[] var8 = new int[var6];
            if (arg0 != -3131) {
                method1084(-75, 34, -96);
            }
            int[] var9 = new int[var6];
            int[] var10 = new int[var6];
            int[] var11 = new int[var6];
            int[] var12 = new int[var6];
            for (int var13 = -5; var13 < var7; var13++) {
                for (int var14 = 0; var14 < var6; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var7 > var28) {
                        int var29 = var3[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class237 var30 = class29.method179(24, var29 - 1);
                            var8[var14] += var30.field4422;
                            var9[var14] += var30.field4412;
                            var12[var14] += var30.field4415;
                            var10[var14] += var30.field4409;
                            var10002 = var11[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var3[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class237 var33 = class29.method179(24, var32 - 1);
                            var8[var14] -= var33.field4422;
                            var9[var14] -= var33.field4412;
                            var12[var14] -= var33.field4415;
                            var10[var14] -= var33.field4409;
                            var10002 = var11[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class105.field1914[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var6; var21++) {
                        int var22 = var21 - 5;
                        int var23 = var21 + 5;
                        if (var23 < var6) {
                            var19 += var10[var23];
                            var20 += var11[var23];
                            var17 += var12[var23];
                            var16 += var9[var23];
                            var18 += var8[var23];
                        }
                        if (var22 >= 0) {
                            var19 -= var10[var22];
                            var16 -= var9[var22];
                            var17 -= var12[var22];
                            var18 -= var8[var22];
                            var20 -= var11[var22];
                        }
                        if (var21 >= 0 && var20 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var19 == 0 ? 0 : class158.method1068(arg0 - 19233, var18 * 256 / var19, var17 / var20, var16 / var20);
                            if (var3[var13][var21] != 0) {
                                if (var15[var24] == null) {
                                    var15[var24] = class105.field1914[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (var25 & 0x7F) + var4;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var25 + var2 & 0xFC00) + ((var25 & 0x380) + var26);
                                var15[var24][class70.method470(4032, var21 << 6) + class70.method470(63, var13)] = class173.field3351[class13.method67(-13465, 96, var27)];
                            } else if (var15[var24] != null) {
                                var15[var24][(class70.method470(63, var21) << 6) + class70.method470(63, var13)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
