import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class751 {

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    private int field10924 = 0;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    private int field10928 = -1;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Lef;")
    private class513 field10914 = new class513();

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "Z")
    public boolean field10931 = false;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    private int field10919;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    private int field10921;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "[Ltl;")
    private class645[] field10925;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[[[I")
    private int[][][] field10920;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10934 = new String[] { method5465(method5464("\"4\u0000G_")), method5465(method5464("\"4\u0000C_")), method5465(method5464("\"4\u0000=\u001e>1Z?_")), method5465(method5464("\"4\u0000E_")), method5465(method5464("+v\u0000/\n")), method5465(method5464(">-Bm")), method5465(method5464("\"4\u0000D_")), method5465(method5464("\u00139@!\u0018>4W!\u00055,\\h\u0012&=\u000e`W6-BmW95Of\u0012p;Ob\u001f5")), method5465(method5464("\"4\u0000B_")) };

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[F")
    public static float[] field10917 = new float[16384];

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
    public static int[] field10918 = new int[64];

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "[F")
    public static float[] field10927 = new float[16384];

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[Z")
    public static boolean[] field10932;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "[[I")
    public static int[][] field10933;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field10916;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field10923;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field10926;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field10929;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Lwd;")
    public static class287 field10930;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Lkp;")
    public static class514 field10922;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "[Liga;")
    public static class481[] field10915;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field10927[var2] = (float) Math.sin((double) var2 * var0);
            field10917[var2] = (float) Math.cos((double) var2 * var0);
        }
        field10932 = new boolean[200];
        field10933 = new int[128][128];
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 9)
    public static final void method5458() {
        for (int var0 = 0; var0 < class272.field4124; var0++) {
            class343 var1 = class400.field5975[var0];
            class766.method5533(var1, true);
            class400.field5975[var0] = null;
        }
        class272.field4124 = 0;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)[[[I", line = 23)
    public final int[][][] method5459(byte arg0) {
        try {
            field10929++;
            if (this.field10921 != this.field10919) {
                throw new RuntimeException(field10934[7]);
            }
            if (arg0 != -34) {
                this.field10921 = 28;
            }
            for (int var2 = 0; var2 < this.field10919; var2++) {
                this.field10925[var2] = class130.field1523;
            }
            return this.field10920;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10934[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 47)
    public static void method5460(int arg0) {
        try {
            field10932 = null;
            field10927 = null;
            field10930 = null;
            if (arg0 == 0) {
                field10915 = null;
                field10918 = null;
                field10917 = null;
                field10922 = null;
                field10933 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10934[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 79)
    public final void method5461(byte arg0) {
        try {
            for (int var2 = 0; var2 < this.field10919; var2++) {
                this.field10920[var2][0] = null;
                this.field10920[var2][1] = null;
                this.field10920[var2][2] = null;
                this.field10920[var2] = null;
            }
            field10923++;
            this.field10920 = null;
            this.field10925 = null;
            if (arg0 != 57) {
                method5458();
            }
            this.field10914.method3879(121);
            this.field10914 = null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10934[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lec;B)V", line = 105)
    public static final void method5462(class247 arg0, byte arg1) {
        try {
            field10916++;
            if (arg0.field3822 != null || arg0.field3816 != null) {
                boolean var2 = true;
                if (arg1 >= -109) {
                    method5458();
                }
                for (int var3 = 0; var3 < arg0.field3822.length; var3++) {
                    int var4 = -1;
                    if (arg0.field3822 != null) {
                        var4 = arg0.field3822[var3];
                    }
                    if (var4 != -1) {
                        var2 = false;
                        boolean var5 = false;
                        boolean var6 = false;
                        int var10;
                        int var11;
                        if ((var4 & 0xC0000000) == -1073741824) {
                            int var7 = var4 & 0xFFFFFFF;
                            int var8 = var7 >> 14;
                            int var9 = var7 & 0x3FFF;
                            var10 = arg0.field6197 - (-class494.field7101 + var8) * 512 - 256;
                            var11 = arg0.field6211 - ((var9 - class281.field4219) * 512) - 256;
                        } else if ((var4 & 0x8000) == 0) {
                            class383 var12 = (class383) class207.field3184.method977((long) var4, 1);
                            if (var12 == null) {
                                arg0.method2110(-1, 0, var3);
                                continue;
                            }
                            class612 var13 = var12.field5799;
                            var11 = arg0.field6211 - var13.field6211;
                            var10 = arg0.field6197 - var13.field6197;
                        } else {
                            int var14 = var4 & 0x7FFF;
                            class726 var15 = class197.field2685[var14];
                            if (var15 == null) {
                                arg0.method2110(-1, 0, var3);
                                continue;
                            }
                            var11 = arg0.field6211 - var15.field6211;
                            var10 = arg0.field6197 - var15.field6197;
                        }
                        if (var10 != 0 || var11 != 0) {
                            arg0.method2110((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF, 0, var3);
                        }
                    } else if (!arg0.method2110(-1, 0, var3)) {
                        var2 = false;
                    }
                }
                if (var2) {
                    arg0.field3822 = null;
                    arg0.field3816 = null;
                }
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field10934[6] + (arg0 == null ? field10934[5] : field10934[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(III)V", line = 317)
    public class751(int arg0, int arg1, int arg2) {
        try {
            this.field10919 = arg0;
            this.field10921 = arg1;
            this.field10925 = new class645[this.field10921];
            this.field10920 = new int[this.field10919][3][arg2];
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10934[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)[[I", line = 213)
    public final int[][] method5463(byte arg0, int arg1) {
        try {
            if (arg0 != -8) {
                this.method5463((byte) 127, -42);
            }
            field10926++;
            if (this.field10921 == this.field10919) {
                this.field10931 = this.field10925[arg1] == null;
                this.field10925[arg1] = class130.field1523;
                return this.field10920[arg1];
            } else if (this.field10919 == 1) {
                this.field10931 = this.field10928 != arg1;
                this.field10928 = arg1;
                return this.field10920[0];
            } else {
                class645 var3 = this.field10925[arg1];
                if (var3 == null) {
                    this.field10931 = true;
                    if (this.field10924 >= this.field10919) {
                        class645 var4 = (class645) this.field10914.method3871(true);
                        var3 = new class645(arg1, var4.field9345);
                        this.field10925[var4.field9346] = null;
                        var4.method1824(1);
                    } else {
                        var3 = new class645(arg1, this.field10924);
                        this.field10924++;
                    }
                    this.field10925[arg1] = var3;
                } else {
                    this.field10931 = false;
                }
                this.field10914.method3876(false, var3);
                return this.field10920[var3.field9345];
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10934[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5464(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5465(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
