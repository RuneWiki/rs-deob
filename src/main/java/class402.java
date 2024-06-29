import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class402 extends class426 {

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "Z")
    public boolean field5987 = true;

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "Lpf;")
    public static class425 field5989 = new class425(77, 0);

    @OriginalMember(owner = "client!ht", name = "eb", descriptor = "[[[I")
    public static int[][][] field6005 = new int[2][][];

    @OriginalMember(owner = "client!ht", name = "db", descriptor = "I")
    public static int field6004 = 0;

    @OriginalMember(owner = "client!ht", name = "cb", descriptor = "Lik;")
    public static class463 field6003 = new class463("", 13);

    @OriginalMember(owner = "client!ht", name = "jb", descriptor = "[[I")
    public static int[][] field6010 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ht", name = "kb", descriptor = "Lfh;")
    public static class170 field6011 = null;

    @OriginalMember(owner = "client!ht", name = "ib", descriptor = "Lwl;")
    public static class452 field6009 = new class452(28, 6);

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!ht", name = "N", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!ht", name = "Q", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!ht", name = "S", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!ht", name = "U", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!ht", name = "V", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ht", name = "W", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!ht", name = "X", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ht", name = "Y", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!ht", name = "Z", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!ht", name = "ab", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ht", name = "bb", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!ht", name = "fb", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!ht", name = "gb", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ht", name = "P", descriptor = "[I")
    private int[] field5990;

    @OriginalMember(owner = "client!ht", name = "R", descriptor = "[I")
    public int[] field5992;

    @OriginalMember(owner = "client!ht", name = "hb", descriptor = "[Lkr;")
    public static class234[] field6008;

    @OriginalMember(owner = "client!ht", name = "T", descriptor = "[Ljava/lang/String;")
    private String[] field5994;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "[[I")
    private int[][] field5986;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIII)V")
    public static final void method2524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5998++;
        int var6 = arg2 - arg1;
        int var7 = arg0 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class110.method676(arg1, arg5, 32768, arg2, arg3);
            }
        } else if (var6 == 0) {
            class388.method2398(arg0, arg3, arg5, arg1, 0);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                arg5 = arg1;
                int var10 = arg0;
                arg0 = arg2;
                arg1 = var9;
                arg2 = var10;
            }
            if (arg5 > arg0) {
                int var11 = arg5;
                arg5 = arg0;
                int var12 = arg1;
                arg0 = var11;
                arg1 = arg2;
                arg2 = var12;
            }
            int var13 = arg1;
            int var14 = arg0 - arg5;
            int var15 = arg2 - arg1;
            int var16 = -(var14 >> 1);
            int var17 = arg1 < arg2 ? 1 : -1;
            if (var15 < arg4) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg5; var19 <= arg0; var19++) {
                    class292.field4448[var19][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg5; var18 <= arg0; var18++) {
                    class292.field4448[var13][var18] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)I")
    public final int method2525(int arg0, int arg1, int arg2) {
        field5995++;
        if (arg0 <= 101) {
            this.method2535((int[]) null, (byte) -34, (class385) null);
        }
        if (this.field5990 == null || arg2 < 0 || arg2 > this.field5990.length) {
            return -1;
        } else if (this.field5986[arg2] == null || arg1 < 0 || this.field5986[arg2].length < arg1) {
            return -1;
        } else {
            return this.field5986[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZLef;)V")
    public final void method2526(boolean arg0, class385 arg1) {
        while (true) {
            int var3 = arg1.method2343(255);
            if (var3 == 0) {
                if (arg0) {
                    return;
                }
                field5991++;
                return;
            }
            this.method2527(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILef;I)V")
    private final void method2527(int arg0, class385 arg1, int arg2) {
        if (arg2 != 0) {
            method2528(110, -32, (byte) 68, 73, -104, (String) null, -123, 33);
        }
        field5997++;
        if (arg0 == 1) {
            this.field5994 = class110.method677('<', arg1.method2332(77), (byte) -112);
        } else if (arg0 == 2) {
            int var4 = arg1.method2343(255);
            this.field5992 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5992[var5] = arg1.method2323(-32);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method2343(255);
            this.field5986 = new int[var6][];
            this.field5990 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method2323(arg2 - 49);
                this.field5990[var7] = var8;
                this.field5986[var7] = new int[class26.field339[var8]];
                for (int var9 = 0; var9 < class26.field339[var8]; var9++) {
                    this.field5986[var7][var9] = arg1.method2323(-96);
                }
            }
        } else if (arg0 == 4) {
            this.field5987 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIBIILjava/lang/String;II)V")
    public static final void method2528(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field6006++;
        class54 var8 = new class54();
        var8.field726 = arg6;
        var8.field722 = arg4;
        var8.field728 = arg3;
        var8.field732 = arg0;
        var8.field724 = class26.field332 + arg7;
        var8.field721 = arg1;
        var8.field725 = arg5;
        if (arg2 == -37) {
            class168.field2405.method2125(var8, -29983);
        }
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(B)I")
    public final int method2529(byte arg0) {
        if (arg0 == -37) {
            field5985++;
            return this.field5990 == null ? 0 : this.field5990.length;
        } else {
            return 117;
        }
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)V")
    public final void method2530(int arg0) {
        field5999++;
        if (arg0 != -1) {
            this.method2535((int[]) null, (byte) -114, (class385) null);
        }
        if (this.field5992 != null) {
            for (int var2 = 0; var2 < this.field5992.length; var2++) {
                this.field5992[var2] = class276.method1712(this.field5992[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)I")
    public static final int method2531(int arg0, int arg1) {
        field6002++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg1 >= ~arg0) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(ZLef;)Ljava/lang/String;")
    public final String method2532(boolean arg0, class385 arg1) {
        if (!arg0) {
            field5989 = null;
        }
        field5993++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5990 != null) {
            for (int var4 = 0; var4 < this.field5990.length; var4++) {
                var3.append(this.field5994[var4]);
                var3.append(class196.method1171(this.field5990[var4], this.field5986[var4], (byte) 89, arg1.method2369(class67.field864[this.field5990[var4]], (byte) 41)));
            }
        }
        var3.append(this.field5994[this.field5994.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "(I)V")
    public static void method2533(int arg0) {
        field5989 = null;
        field6003 = null;
        field6011 = null;
        field6005 = null;
        field6008 = null;
        if (arg0 != 4) {
            field6011 = null;
        }
        field6009 = null;
        field6010 = null;
    }

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method2534(int arg0) {
        field6000++;
        StringBuffer var2 = new StringBuffer(arg0);
        if (this.field5994 == null) {
            return "";
        }
        var2.append(this.field5994[0]);
        for (int var3 = 1; var3 < this.field5994.length; var3++) {
            var2.append("...");
            var2.append(this.field5994[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([IBLef;)V")
    public final void method2535(int[] arg0, byte arg1, class385 arg2) {
        field5988++;
        if (this.field5990 == null) {
            return;
        }
        for (int var4 = 0; this.field5990.length > var4 && arg0.length > var4; var4++) {
            int var5 = class415.field6171[this.method2537(var4, 0)];
            if (var5 > 0) {
                arg2.method2333(var5, (byte) 116, (long) arg0[var4]);
            }
        }
        if (arg1 != -63) {
            this.method2534(-84);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIB)V")
    public static final void method2536(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6001++;
        float var5 = (float) class223.field3403 / (float) class223.field3402;
        if (arg4 != -42) {
            field6007 = -56;
        }
        int var6 = arg0;
        int var7 = arg3;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg1 - (arg0 - var6) / 2;
        int var9 = arg2 - (arg3 - var7) / 2;
        class217.field3305 = class223.field3403 - (class223.field3403 * var9 / var7);
        class191.field2843 = -1;
        class318.field4811 = -1;
        class295.field4480 = class223.field3402 * var8 / var6;
        class353.method2116(false);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)I")
    public final int method2537(int arg0, int arg1) {
        if (arg1 == 0) {
            field5996++;
            return this.field5990 == null || arg0 < 0 || this.field5990.length < arg0 ? -1 : this.field5990[arg0];
        } else {
            return 123;
        }
    }
}
