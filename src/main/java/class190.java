import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class190 extends class273 {

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public int field2882 = 1638;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public int field2885 = 4;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "Z")
    public boolean field2880 = true;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "[B")
    private byte[] field2878 = new byte[512];

    @OriginalMember(owner = "client!kj", name = "hb", descriptor = "I")
    public int field2897 = 4;

    @OriginalMember(owner = "client!kj", name = "ib", descriptor = "I")
    public int field2898 = 0;

    @OriginalMember(owner = "client!kj", name = "kb", descriptor = "I")
    public int field2900 = 4;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "[[B")
    public static byte[][] field2884 = new byte[50][];

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "I")
    public static int field2891 = 0;

    @OriginalMember(owner = "client!kj", name = "gb", descriptor = "I")
    public static volatile int field2896 = 0;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field2892 = " is already on your friend list.";

    @OriginalMember(owner = "client!kj", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field2899 = "red:";

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!kj", name = "fb", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "[I")
    public static int[] field2893;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "[S")
    private short[] field2876;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "[S")
    private short[] field2886;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IC)C", line = 10)
    public static final char method1302(int arg0, char arg1) {
        field2890++;
        if (arg1 == 'µ' || arg1 == 'ƒ') {
            return arg1;
        } else {
            if (arg0 != 512) {
                field2892 = (String) null;
            }
            return Character.toTitleCase(arg1);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 25)
    public final void method349(int arg0) {
        field2881++;
        this.field2878 = class218.method1456(255, this.field2898);
        this.method1307((byte) 11);
        for (int var2 = this.field2897 - arg0; var2 >= 1; var2--) {
            short var3 = this.field2886[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field2897--;
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V", line = 58)
    public static void method1303(int arg0) {
        field2884 = (byte[][]) null;
        field2899 = null;
        field2892 = null;
        if (arg0 != -28066) {
            method1303(86);
        }
        field2893 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 421)
    public class190() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIII)I", line = 83)
    private final int method1304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2887++;
        int var8 = arg3 - 4096;
        if (arg0 != 0) {
            field2892 = (String) null;
        }
        int var9 = arg5 >> 12;
        int var10 = arg5 & 0xFFF;
        int var11 = var9 + 1;
        if (var11 >= arg4) {
            var11 = 0;
        }
        int var12 = class146.field2298[var10];
        int var13 = var11 & 0xFF;
        int var14 = var9 & 0xFF;
        int var15 = var10 - 4096;
        int var16 = this.field2878[arg6 + var14] & 0x3;
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? var10 - arg3 : -var10 - arg3;
        } else {
            var17 = var16 == 0 ? arg3 + var10 : -var10 + arg3;
        }
        int var18 = this.field2878[arg6 + var13] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? var15 + arg3 : -var15 + arg3;
        } else {
            var19 = var18 == 2 ? var15 - arg3 : -arg3 + -var15;
        }
        int var20 = this.field2878[arg1 + var14] & 0x3;
        int var21 = ((var19 - var17) * var12 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var8 + var10 : var8 - var10;
        } else {
            var22 = var20 == 2 ? var10 - var8 : -var10 - var8;
        }
        int var23 = this.field2878[var13 + arg1] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var15 - var8 : -var8 + -var15;
        } else {
            var24 = var23 == 0 ? var8 + var15 : -var15 + var8;
        }
        int var25 = ((var24 - var22) * var12 >> 12) + var22;
        return ((var25 - var21) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BILgn;)V", line = 187)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg1 == 0) {
            this.field2880 = arg2.method2043((byte) -113) == 1;
        } else if (arg1 == 1) {
            this.field2897 = arg2.method2043((byte) -121);
        } else if (arg1 == 2) {
            this.field2882 = arg2.method2042(7);
            if (this.field2882 < 0) {
                this.field2886 = new short[this.field2897];
                for (int var5 = 0; var5 < this.field2897; var5++) {
                    this.field2886[var5] = (short) arg2.method2042(7);
                }
            }
        } else if (arg1 == 3) {
            this.field2900 = this.field2885 = arg2.method2043((byte) -116);
        } else if (arg1 == 4) {
            this.field2898 = arg2.method2043((byte) -120);
        } else if (arg1 == 5) {
            this.field2900 = arg2.method2043((byte) -107);
        } else if (arg1 == 6) {
            this.field2885 = arg2.method2043((byte) -120);
        }
        if (arg0 <= 27) {
            this.method331(126, 23);
        }
        field2875++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([III)V", line = 263)
    public final void method1305(int[] arg0, int arg1, int arg2) {
        field2888++;
        int var4 = class96.field1473[arg1] * this.field2885;
        if (this.field2897 == arg2) {
            short var38 = this.field2886[0];
            int var39 = this.field2876[0] << 12;
            int var40 = this.field2885 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = this.field2900 * var39 >> 12;
            int var43 = var41 >> 12;
            int var44 = var43 + 1;
            int var45 = this.field2878[var43 & 0xFF] & 0xFF;
            if (var44 >= var40) {
                var44 = 0;
            }
            int var46 = var41 & 0xFFF;
            int var47 = this.field2878[var44 & 0xFF] & 0xFF;
            int var48 = class146.field2298[var46];
            if (this.field2880) {
                for (int var49 = 0; var49 < class27.field346; var49++) {
                    int var50 = class151.field2384[var49] * this.field2900;
                    int var51 = this.method1304(0, var47, var48, var46, var42, var39 * var50 >> 12, var45);
                    int var52 = var38 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class27.field346; var53++) {
                    int var54 = class151.field2384[var53] * this.field2900;
                    int var55 = this.method1304(0, var47, var48, var46, var42, var39 * var54 >> 12, var45);
                    arg0[var53] = var38 * var55 >> 12;
                }
            }
            return;
        }
        short var5 = this.field2886[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field2876[0] << 12;
            int var7 = this.field2885 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field2900 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = this.field2878[var10 & 0xFF] & 0xFF;
            int var12 = var10 + 1;
            int var13 = var8 & 0xFFF;
            int var14 = class146.field2298[var13];
            if (var7 <= var12) {
                var12 = 0;
            }
            int var15 = this.field2878[var12 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class27.field346; var16++) {
                int var17 = class151.field2384[var16] * this.field2900;
                int var18 = this.method1304(0, var15, var14, var13, var9, var6 * var17 >> 12, var11);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field2897; var19++) {
            short var20 = this.field2886[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field2876[var19] << 12;
                int var22 = var4 * var21 >> 12;
                int var23 = this.field2900 * var21 >> 12;
                int var24 = this.field2885 * var21 >> 12;
                int var25 = var22 >> 12;
                int var26 = var22 & 0xFFF;
                int var27 = class146.field2298[var26];
                int var28 = var25 + 1;
                int var29 = this.field2878[var25 & 0xFF] & 0xFF;
                if (var24 <= var28) {
                    var28 = 0;
                }
                int var30 = this.field2878[var28 & 0xFF] & 0xFF;
                if (this.field2880 && this.field2897 - 1 == var19) {
                    for (int var31 = 0; var31 < class27.field346; var31++) {
                        int var32 = class151.field2384[var31] * this.field2900;
                        int var33 = this.method1304(0, var30, var27, var26, var23, var21 * var32 >> 12, var29);
                        int var34 = (var20 * var33 >> 12) + arg0[var31];
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class27.field346; var35++) {
                        int var36 = class151.field2384[var35] * this.field2900;
                        int var37 = this.method1304(0, var30, var27, var26, var23, var21 * var36 >> 12, var29);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V", line = 426)
    public static final void method1306(int arg0) {
        field2879++;
        int[] var1 = new int[class298.field4563];
        int var2 = 0;
        for (int var3 = 0; var3 < class298.field4563; var3++) {
            class291 var4 = class160.method1106(var3, 56);
            if (var4.field4457 >= 0 || var4.field4476 >= 0) {
                var1[var2++] = var3;
            }
        }
        class92.field1421 = new int[var2];
        for (int var5 = arg0; var5 < var2; var5++) {
            class92.field1421[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[I", line = 464)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            field2884 = (byte[][]) ((byte[][]) null);
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        field2883++;
        if (this.field4204.field792) {
            this.method1305(var3, arg0, 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V", line = 489)
    private final void method1307(byte arg0) {
        field2895++;
        if (this.field2882 > 0) {
            this.field2886 = new short[this.field2897];
            this.field2876 = new short[this.field2897];
            for (int var2 = 0; var2 < this.field2897; var2++) {
                this.field2886[var2] = (short) ((int) (Math.pow((double) ((float) this.field2882 / 4096.0F), (double) var2) * 4096.0D));
                this.field2876[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2886 != null && this.field2886.length == this.field2897) {
            this.field2876 = new short[this.field2897];
            for (int var3 = 0; var3 < this.field2897; var3++) {
                this.field2876[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        int var4 = -46 / ((-arg0 - 74) / 47);
    }
}
