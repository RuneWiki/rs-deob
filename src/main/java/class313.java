import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class313 extends class551 {

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "Z")
    public boolean field4703 = true;

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "[[F")
    public static float[][] field4711 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "[I")
    public static int[] field4695 = new int[256];

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "Lwv;")
    public static class387 field4713;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "Ldw;")
    public class122 field4706;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "Ljava/lang/Object;")
    public static Object field4699;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "Z")
    public static boolean field4712;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "[I")
    private int[] field4696;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "[I")
    public int[] field4710;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field4697;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "[[I")
    private int[][] field4705;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z")
    public static final boolean method1924(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class147.field1905; var3++) {
            class272 var4 = class295.field4326[var3];
            if (var4.field4026 == 1) {
                int var5 = var4.field4020 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4027 * var5 >> 8) + var4.field4031;
                    int var7 = (var4.field4022 * var5 >> 8) + var4.field4032;
                    int var8 = (var4.field4013 * var5 >> 8) + var4.field4018;
                    int var9 = (var4.field4029 * var5 >> 8) + var4.field4028;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4026 == 2) {
                int var10 = arg0 - var4.field4020;
                if (var10 > 0) {
                    int var11 = (var4.field4027 * var10 >> 8) + var4.field4031;
                    int var12 = (var4.field4022 * var10 >> 8) + var4.field4032;
                    int var13 = (var4.field4013 * var10 >> 8) + var4.field4018;
                    int var14 = (var4.field4029 * var10 >> 8) + var4.field4028;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4026 == 3) {
                int var15 = var4.field4031 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4016 * var15 >> 8) + var4.field4020;
                    int var17 = (var4.field4017 * var15 >> 8) + var4.field4023;
                    int var18 = (var4.field4013 * var15 >> 8) + var4.field4018;
                    int var19 = (var4.field4029 * var15 >> 8) + var4.field4028;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4026 == 4) {
                int var20 = arg2 - var4.field4031;
                if (var20 > 0) {
                    int var21 = (var4.field4016 * var20 >> 8) + var4.field4020;
                    int var22 = (var4.field4017 * var20 >> 8) + var4.field4023;
                    int var23 = (var4.field4013 * var20 >> 8) + var4.field4018;
                    int var24 = (var4.field4029 * var20 >> 8) + var4.field4028;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4026 == 5) {
                int var25 = arg1 - var4.field4018;
                if (var25 > 0) {
                    int var26 = (var4.field4016 * var25 >> 8) + var4.field4020;
                    int var27 = (var4.field4017 * var25 >> 8) + var4.field4023;
                    int var28 = (var4.field4027 * var25 >> 8) + var4.field4031;
                    int var29 = (var4.field4022 * var25 >> 8) + var4.field4032;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILps;)V")
    public final void method1925(int arg0, class428 arg1) {
        int var3 = -5 / ((-arg0 - 47) / 63);
        while (true) {
            int var4 = arg1.method2561((byte) -58);
            if (var4 == 0) {
                field4708++;
                return;
            }
            this.method1934(arg1, var4, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I")
    public static int method1926(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "(I)V")
    public final void method1927(int arg0) {
        if (arg0 != 0) {
            this.method1929(19, -74);
        }
        field4707++;
        if (this.field4710 != null) {
            for (int var2 = 0; var2 < this.field4710.length; var2++) {
                this.field4710[var2] = method1926(this.field4710[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lps;I)Ljava/lang/String;")
    public final String method1928(class428 arg0, int arg1) {
        field4700++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4696 != null) {
            for (int var4 = 0; var4 < this.field4696.length; var4++) {
                var3.append(this.field4697[var4]);
                var3.append(this.field4706.method739(this.field4705[var4], this.method1929(var4, 22), arg0.method2614(arg1 - 17373, class258.method1629(124, this.field4696[var4]).field5123), (byte) -53));
            }
        }
        var3.append(this.field4697[this.field4697.length - 1]);
        if (arg1 != 0) {
            this.method1928(null, 94);
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)Lrb;")
    public final class352 method1929(int arg0, int arg1) {
        int var3 = -110 / ((-arg1 - 53) / 58);
        field4704++;
        return this.field4696 == null || arg0 < 0 || arg0 > this.field4696.length ? null : class258.method1629(-54, this.field4696[arg0]);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([IZLps;)V")
    public final void method1930(int[] arg0, boolean arg1, class428 arg2) {
        field4709++;
        if (this.field4696 == null) {
            return;
        }
        if (!arg1) {
            this.field4697 = null;
        }
        for (int var4 = 0; var4 < this.field4696.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method1929(var4, -124).field5120;
            if (var5 > 0) {
                arg2.method2618(var5, (byte) 99, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)I")
    public final int method1931(byte arg0, int arg1, int arg2) {
        field4698++;
        if (this.field4696 == null || arg1 < 0 || this.field4696.length < arg1) {
            return -1;
        } else if (this.field4705[arg1] == null || arg2 < 0 || this.field4705[arg1].length < arg2) {
            return -1;
        } else {
            int var4 = -76 % ((arg0 - 78) / 36);
            return this.field4705[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZ)V")
    public static final void method1932(int arg0, boolean arg1) {
        if (arg1) {
            field4713 = null;
        }
        if (class322.field4782 == 1) {
            class155.field1983 = arg0;
        } else if (class322.field4782 == 2 || class322.field4782 == 3) {
            class308.field4490 = arg0;
        }
        field4693++;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lft;I)V")
    public static final void method1933(class514 arg0, int arg1) {
        field4701++;
        if (arg1 != 0) {
            field4713 = null;
        }
        arg0.field7615 = false;
        if (arg0.field7616 != null) {
            arg0.field7616.field4450 = 0;
        }
        for (class514 var2 = arg0.method1437(); var2 != null; var2 = arg0.method1397()) {
            method1933(var2, 0);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lps;IB)V")
    private final void method1934(class428 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field4697 = class317.method1994(8, '<', arg0.method2585(-101));
        } else if (arg1 == 2) {
            int var9 = arg0.method2561((byte) 109);
            this.field4710 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field4710[var10] = arg0.method2620(83);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2561((byte) -57);
            this.field4696 = new int[var4];
            this.field4705 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2620(125);
                class352 var7 = class258.method1629(-100, var6);
                if (var7 != null) {
                    this.field4696[var5] = var6;
                    this.field4705[var5] = new int[var7.field5121];
                    for (int var8 = 0; var8 < var7.field5121; var8++) {
                        this.field4705[var5][var8] = arg0.method2620(114);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field4703 = false;
        }
        field4692++;
        if (arg2 != -30) {
            this.field4696 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)V")
    public static void method1935(int arg0) {
        field4699 = null;
        field4711 = null;
        field4713 = null;
        field4695 = null;
        if (arg0 != 5200) {
            field4712 = true;
        }
    }

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method1936(int arg0) {
        field4694++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4697 == null) {
            return "";
        }
        var2.append(this.field4697[arg0]);
        for (int var3 = 1; var3 < this.field4697.length; var3++) {
            var2.append("...");
            var2.append(this.field4697[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)I")
    public final int method1937(byte arg0) {
        field4702++;
        if (arg0 != -114) {
            method1932(72, true);
        }
        return this.field4696 == null ? 0 : this.field4696.length;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4695[var0] = var1;
        }
        field4713 = null;
    }
}
