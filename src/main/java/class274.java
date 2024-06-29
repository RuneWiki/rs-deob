import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class274 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public int field4068 = -1;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public int field4071 = 5;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Z")
    public boolean field4075 = false;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field4070 = 99;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field4078 = -1;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public int field4086 = -1;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Z")
    public boolean field4088 = false;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field4090 = 2;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
    public boolean field4096 = false;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Z")
    public boolean field4094 = false;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public int field4083 = -1;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public int field4097 = -1;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lrc;")
    public static class9 field4074 = new class9(16);

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "F")
    public static float field4085 = 0.0F;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field4101 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field4093 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "J")
    public static volatile long field4098 = 0L;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "[I")
    public static int[] field4102 = new int[200];

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field4103 = -1;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lrc;")
    public static class9 field4099 = new class9(64);

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public int field4077;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Lbc;")
    public static class282 field4089;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Ldi;")
    public static class99 field4100;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[I")
    public int[] field4072;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[I")
    private int[] field4076;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "[I")
    public int[] field4081;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[Z")
    public boolean[] field4079;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[[I")
    public int[][] field4073;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lah;IIII)Lah;")
    public final class106 method1758(class106 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4095++;
        int var6 = this.field4072[arg4];
        int var7 = this.field4081[arg4];
        class58 var8 = class251.method1611(var6 >> 16, (byte) -37);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg0.method641(true, true, true);
        }
        class58 var10 = null;
        class58 var11 = null;
        class58 var12 = null;
        if ((this.field4094 || class228.field3214) && arg1 != -1 && arg1 < this.field4072.length) {
            int var13 = this.field4072[arg1];
            var10 = class251.method1611(var13 >> 16, (byte) 110);
            arg1 = var13 & 0xFFFF;
        }
        int var14 = 0;
        int var15 = 0;
        if (this.field4076 != null) {
            if (this.field4076.length > arg4) {
                var14 = this.field4076[arg4];
                if (var14 != 65535) {
                    var12 = class251.method1611(var14 >> 16, (byte) -67);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field4094 || class228.field3214) && arg1 != -1 && arg1 < this.field4076.length) {
                var15 = this.field4076[arg1];
                if (var15 != 65535) {
                    var11 = class251.method1611(var15 >> 16, (byte) -85);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method357(var9, false);
        boolean var17 = !var8.method358((byte) -78, var9);
        if (var12 != null) {
            var16 &= !var12.method357(var14, false);
            var17 &= !var12.method358((byte) -44, var14);
        }
        if (var10 != null) {
            var16 &= !var10.method357(arg1, false);
            var17 &= !var10.method358((byte) -106, arg1);
        }
        if (var11 != null) {
            var16 &= !var11.method357(var15, false);
            var17 &= !var11.method358((byte) -58, var15);
        }
        class106 var18 = arg0.method641(var16, var17, !this.field4088);
        var18.method647(var8, var9, var10, arg1, arg2 + arg3, var7, this.field4088);
        if (var12 != null) {
            var18.method647(var12, var14, var11, var15, arg3 - 1, var7, this.field4088);
        }
        return var18;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLqi;)V")
    public final void method1759(byte arg0, class216 arg1) {
        while (true) {
            int var3 = arg1.method1407(121);
            if (var3 == 0) {
                field4091++;
                if (arg0 <= 2) {
                    this.method1758((class106) null, -111, 5, 79, -99);
                    return;
                }
                return;
            }
            this.method1764((byte) -116, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIILah;I)Lah;")
    public final class106 method1760(byte arg0, int arg1, int arg2, class106 arg3, int arg4) {
        field4092++;
        int var6 = this.field4081[arg1];
        int var7 = this.field4072[arg1];
        class58 var8 = class251.method1611(var7 >> 16, (byte) -37);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method664(true, true, true);
        }
        class58 var10 = null;
        if ((this.field4094 || class228.field3214) && arg4 != -1 && this.field4072.length > arg4) {
            int var11 = this.field4072[arg4];
            var10 = class251.method1611(var11 >> 16, (byte) 115);
            arg4 = var11 & 0xFFFF;
        }
        if (arg0 != -64) {
            this.field4079 = null;
        }
        class106 var12;
        if (var10 == null) {
            var12 = arg3.method664(!var8.method357(var9, false), !var8.method358((byte) -82, var9), !this.field4088);
        } else {
            var12 = arg3.method664(!var8.method357(var9, false) & !var10.method357(arg4, false), !var8.method358((byte) -125, var9) & !var10.method358((byte) -119, arg4), !this.field4088);
        }
        var12.method647(var8, var9, var10, arg4, arg2 - 1, var6, this.field4088);
        return var12;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public final void method1761(int arg0) {
        if (this.field4083 == -1) {
            if (this.field4079 == null) {
                this.field4083 = 0;
            } else {
                this.field4083 = 2;
            }
        }
        if (arg0 != -29416) {
            this.method1764((byte) 64, (class216) null, 64);
        }
        field4084++;
        if (this.field4078 != -1) {
            return;
        }
        if (this.field4079 == null) {
            this.field4078 = 0;
        } else {
            this.field4078 = 2;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1762(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class99.field1327 * arg3 + class64.field746 * arg0 >> 16;
        int var6 = class64.field746 * arg3 - class99.field1327 * arg0 >> 16;
        int var7 = class238.field3433 * arg1 + class152.field2206 * var6 >> 16;
        int var8 = class152.field2206 * arg1 - class238.field3433 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class238.field3433 * arg2 + class152.field2206 * var6 >> 16;
        int var12 = class152.field2206 * arg2 - class238.field3433 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class167.field2400 && var13 < class167.field2400) {
            return false;
        } else if (var9 > class173.field2479 && var13 > class173.field2479) {
            return false;
        } else if (var10 < class39.field472 && var14 < class39.field472) {
            return false;
        } else {
            return var10 <= class171.field2446 || var14 <= class171.field2446;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIILca;IJZ)Z")
    public static final boolean method1763(int arg0, int arg1, int arg2, int arg3, int arg4, class131 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class44.method282(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLqi;I)V")
    private final void method1764(byte arg0, class216 arg1, int arg2) {
        field4069++;
        if (arg2 == 1) {
            int var4 = arg1.method1380(true);
            this.field4081 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4081[var5] = arg1.method1380(true);
            }
            this.field4072 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4072[var6] = arg1.method1380(true);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4072[var7] = (arg1.method1380(true) << 16) + this.field4072[var7];
            }
        } else if (arg2 == 2) {
            this.field4068 = arg1.method1380(true);
        } else if (arg2 == 3) {
            this.field4079 = new boolean[256];
            int var15 = arg1.method1407(119);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4079[arg1.method1407(119)] = true;
            }
        } else if (arg2 == 4) {
            this.field4096 = true;
        } else if (arg2 == 5) {
            this.field4071 = arg1.method1407(119);
        } else if (arg2 == 6) {
            this.field4097 = arg1.method1380(true);
        } else if (arg2 == 7) {
            this.field4086 = arg1.method1380(true);
        } else if (arg2 == 8) {
            this.field4070 = arg1.method1407(125);
        } else if (arg2 == 9) {
            this.field4078 = arg1.method1407(109);
        } else if (arg2 == 10) {
            this.field4083 = arg1.method1407(116);
        } else if (arg2 == 11) {
            this.field4090 = arg1.method1407(109);
        } else if (arg2 == 12) {
            int var12 = arg1.method1407(119);
            this.field4076 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field4076[var13] = arg1.method1380(true);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field4076[var14] += arg1.method1380(true) << 16;
            }
        } else if (arg2 == 13) {
            int var8 = arg1.method1380(true);
            this.field4073 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg1.method1407(109);
                if (var10 > 0) {
                    this.field4073[var9] = new int[var10];
                    this.field4073[var9][0] = arg1.method1382(-111);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field4073[var9][var11] = arg1.method1380(true);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4088 = true;
        } else if (arg2 == 15) {
            this.field4094 = true;
        } else if (arg2 == 16) {
            this.field4075 = true;
        }
        if (arg0 >= -105) {
            this.method1766(-117, 29, (class106) null, (byte) 87, 30, 80);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public static void method1765(int arg0) {
        field4099 = null;
        field4089 = null;
        field4093 = null;
        field4101 = null;
        field4102 = null;
        field4100 = null;
        field4074 = null;
        if (arg0 != 2) {
            field4103 = 80;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILah;BII)Lah;")
    public final class106 method1766(int arg0, int arg1, class106 arg2, byte arg3, int arg4, int arg5) {
        int var7 = this.field4081[arg4];
        int var8 = this.field4072[arg4];
        field4080++;
        if (arg3 != 125) {
            return null;
        }
        class58 var9 = class251.method1611(var8 >> 16, (byte) -75);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method662(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class58 var12 = null;
        if ((this.field4094 || class228.field3214) && arg0 != -1 && arg0 < this.field4072.length) {
            int var13 = this.field4072[arg0];
            var12 = class251.method1611(var13 >> 16, (byte) 85);
            arg0 = var13 & 0xFFFF;
        }
        class106 var14;
        if (var12 == null) {
            var14 = arg2.method662(!var9.method357(var10, false), !var9.method358((byte) -35, var10), !this.field4088);
        } else {
            var14 = arg2.method662(!var9.method357(var10, false) & !var12.method357(arg0, false), !var9.method358((byte) -50, var10) & !var12.method358((byte) -82, arg0), !this.field4088);
        }
        if (var11 == 1) {
            var14.method668();
        } else if (var11 == 2) {
            var14.method667();
        } else if (var11 == 3) {
            var14.method655();
        }
        var14.method647(var9, var10, var12, arg0, arg5 - 1, var7, this.field4088);
        if (var11 == 1) {
            var14.method655();
        } else if (var11 == 2) {
            var14.method667();
        } else if (var11 == 3) {
            var14.method668();
        }
        return var14;
    }
}
