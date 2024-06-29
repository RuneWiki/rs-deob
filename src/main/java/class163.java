import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class163 {

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "[I")
    private int[] field2488;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[I")
    private int[] field2486;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[B")
    private byte[] field2490;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2481 = "Members object";

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[I")
    public static int[] field2487 = new int[2];

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[Lwb;")
    public static class27[] field2482 = new class27[50];

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "[[B")
    public static byte[][] field2479 = new byte[50][];

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static volatile int field2484 = 0;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public static void method1087(byte arg0) {
        field2482 = null;
        field2487 = null;
        field2479 = null;
        field2481 = null;
        if (arg0 != -102) {
            method1089(-17, -116, (String) null, -101, 48, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BIBII[B)I")
    public final int method1088(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5) {
        field2485++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg1 + arg3;
        int var8 = 0;
        int var9 = arg4;
        if (arg2 != 16) {
            method1089(88, 109, (String) null, -33, -98, (byte[]) null);
        }
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2488[var8];
            }
            int var11;
            if ((var11 = this.field2488[var8]) < 0) {
                arg5[arg1++] = (byte) (~var11);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2488[var8];
            }
            int var12;
            if ((var12 = this.field2488[var8]) < 0) {
                arg5[arg1++] = (byte) (~var12);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2488[var8];
            }
            int var13;
            if ((var13 = this.field2488[var8]) < 0) {
                arg5[arg1++] = (byte) (~var13);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2488[var8];
            }
            int var14;
            if ((var14 = this.field2488[var8]) < 0) {
                arg5[arg1++] = (byte) (~var14);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2488[var8];
            }
            int var15;
            if ((var15 = this.field2488[var8]) < 0) {
                arg5[arg1++] = (byte) (~var15);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2488[var8];
            }
            int var16;
            if ((var16 = this.field2488[var8]) < 0) {
                arg5[arg1++] = (byte) (~var16);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2488[var8];
            }
            int var17;
            if ((var17 = this.field2488[var8]) < 0) {
                arg5[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2488[var8];
            }
            int var18;
            if ((var18 = this.field2488[var8]) < 0) {
                arg5[arg1++] = (byte) (~var18);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 - (arg4 - 1);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILjava/lang/String;II[B)I")
    public static final int method1089(int arg0, int arg1, String arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 != -12562) {
            field2479 = null;
        }
        field2480++;
        int var6 = arg4 - arg3;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg1 + var7] = -97;
            } else {
                arg5[arg1 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[B[BIIZ)I")
    public final int method1090(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, boolean arg5) {
        field2491++;
        if (!arg5) {
            this.method1090(110, (byte[]) null, (byte[]) null, 105, -123, false);
        }
        int var7 = arg0 + arg4;
        int var8 = 0;
        int var9 = arg3 << 3;
        while (arg4 < var7) {
            int var10 = arg1[arg4] & 0xFF;
            byte var11 = this.field2490[var10];
            int var12 = this.field2486[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var11;
            int var15 = (var11 + var14 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var8 = class115.method840(var16, var12 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var8 = var12 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var8 = var12 >>> var14);
                    if (var13 < var15) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var8 = var12 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([B)V")
    public class163(byte[] arg0) {
        int var2 = arg0.length;
        this.field2488 = new int[8];
        this.field2486 = new int[var2];
        this.field2490 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2486[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class115.method840(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2488[var14] == 0) {
                            this.field2488[var14] = var4;
                        }
                        var14 = this.field2488[var14];
                    }
                    if (var14 >= this.field2488.length) {
                        int[] var17 = new int[this.field2488.length * 2];
                        for (int var18 = 0; var18 < this.field2488.length; var18++) {
                            var17[var18] = this.field2488[var18];
                        }
                        this.field2488 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field2488[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
