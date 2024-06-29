import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class322 {

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Llga;")
    private class47 field4396;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[[I")
    private int[][] field4385;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    private int field4384;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "[Z")
    private boolean[] field4400;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4401 = new String[] { method2555(method2554("s{T8\u0005")), method2555(method2554("s{T9\u0005")), method2555(method2554("zh\u0016\u0010")), method2555(method2554("o3TRP")), method2555(method2554("s{T;\u0005")), method2555(method2554("s{T@Dzt\u000eB\u0005")), method2555(method2554("s{T:\u0005")), method2555(method2554("s{T>\u0005")), method2555(method2554("s{T=\u0005")), method2555(method2554("s{T?\u0005")) };

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lofa;")
    public static class139 field4394;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4383;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[[B")
    public static byte[][] field4395;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)[I")
    public final int[] method2547(boolean arg0, int arg1) {
        try {
            field4391++;
            if (arg1 < 0 || this.field4385.length <= arg1) {
                return this.field4384 == -1 ? new int[0] : new int[] { this.field4384 };
            } else if (this.field4400[arg1] && this.field4385[arg1].length > 1) {
                int var3 = this.field4384 == -1 ? 0 : 1;
                if (arg0) {
                    field4383 = null;
                }
                Random var4 = new Random();
                int[] var5 = new int[this.field4385[arg1].length];
                class569.method4248(this.field4385[arg1], 0, var5, 0, var5.length);
                for (int var6 = var3; var6 < var5.length; var6++) {
                    int var7 = var3 + class70.method723(var4, var5.length - var3, (byte) 58);
                    int var8 = var5[var6];
                    var5[var6] = var5[var7];
                    var5[var7] = var8;
                }
                return var5;
            } else {
                return this.field4385[arg1];
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4401[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
    public static final boolean method2548(int arg0, int arg1, int arg2) {
        try {
            if (arg2 != -1) {
                field4397 = 75;
            }
            field4392++;
            return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4401[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Z")
    public final boolean method2549(int arg0) {
        try {
            field4399++;
            if (arg0 <= 61) {
                method2551(-113, 7);
            }
            return this.field4384 != -1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4401[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method2550(int arg0) {
        try {
            field4394 = null;
            field4383 = null;
            field4395 = null;
            if (arg0 != 1) {
                field4383 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4401[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Z")
    public static final boolean method2551(int arg0, int arg1) {
        try {
            int var2 = -7 / ((arg1 + 80) / 44);
            field4398++;
            return arg0 == 7 || arg0 == 8 || arg0 == 9 || arg0 == 10;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4401[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Llga;Llga;IZ)V")
    public static final void method2552(class47 arg0, class47 arg1, int arg2, boolean arg3) {
        try {
            field4390++;
            if (!arg3) {
                method2552(null, null, 111, false);
            }
            class347.field5042 = arg1;
            class717.field10209 = arg0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4401[1] + (arg0 == null ? field4401[2] : field4401[3]) + ',' + (arg1 == null ? field4401[2] : field4401[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Ldq;")
    public final class4 method2553(int arg0, int arg1) {
        try {
            field4387++;
            if (arg1 != 11646) {
                this.method2547(false, -41);
            }
            byte[] var3 = this.field4396.method512(arg0, 1, (byte) -42);
            class4 var4 = new class4();
            var4.method27(-1, new class711(var3));
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4401[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class322(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field4396 = arg2;
            this.field4396.method509(true, 1);
            class711 var4 = new class711(this.field4396.method512(0, 0, (byte) -50));
            int var5 = var4.method5128(0);
            if (var5 > 3) {
                this.field4385 = new int[0][];
                this.field4384 = -1;
                this.field4400 = new boolean[0];
            } else {
                int var6 = var4.method5128(0);
                class240[] var7 = class680.method4885(-89);
                boolean var8 = true;
                if (var7.length == var6) {
                    for (int var9 = 0; var9 < var7.length; var9++) {
                        int var10 = var4.method5128(0);
                        if (var7[var9].field3459 != var10) {
                            var8 = false;
                            break;
                        }
                    }
                } else {
                    var8 = false;
                }
                if (var8) {
                    int var11 = var4.method5128(0);
                    int var12 = var4.method5128(0);
                    if (var5 > 2) {
                        this.field4384 = var4.method5087((byte) -26);
                    } else {
                        this.field4384 = -1;
                    }
                    this.field4400 = new boolean[var12 + 1];
                    this.field4385 = new int[var12 + 1][];
                    for (int var13 = 0; var13 < var11; var13++) {
                        int var14 = var4.method5128(0);
                        this.field4400[var14] = var4.method5128(0) == 1;
                        int var15 = var4.method5116((byte) -107);
                        if (this.field4384 == -1) {
                            this.field4385[var14] = new int[var15];
                            for (int var17 = 0; var17 < var15; var17++) {
                                this.field4385[var14][var17] = var4.method5116((byte) -111);
                            }
                        } else {
                            this.field4385[var14] = new int[var15 + 1];
                            this.field4385[var14][0] = this.field4384;
                            for (int var16 = 0; var16 < var15; var16++) {
                                this.field4385[var14][var16 + 1] = var4.method5116((byte) -127);
                            }
                        }
                    }
                    for (int var18 = 0; var18 < var12 + 1; var18++) {
                        if (this.field4385[var18] == null) {
                            if (this.field4384 == -1) {
                                this.field4385[var18] = new int[0];
                            } else {
                                this.field4385[var18] = new int[] { this.field4384 };
                            }
                        }
                    }
                } else {
                    this.field4385 = new int[0][];
                    this.field4400 = new boolean[0];
                    this.field4384 = -1;
                }
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field4401[5] + (arg0 == null ? field4401[2] : field4401[3]) + ',' + arg1 + ',' + (arg2 == null ? field4401[2] : field4401[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2554(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2555(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 122;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
