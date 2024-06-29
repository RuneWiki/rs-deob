import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class256 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public int field4389 = -1;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public int field4388 = 2;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public int field4392 = -1;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public int field4393 = -1;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field4387 = -1;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Z")
    public boolean field4398 = false;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public int field4405 = 5;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Z")
    private boolean field4413 = false;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public int field4410 = -1;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public int field4415 = 99;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "Lpj;")
    private static class237 field4409 = class33.method353("Connected to update server", 35);

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lpj;")
    public static class237 field4400 = field4409;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Lpj;")
    public static class237 field4411 = class33.method353("runes", 15);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Lme;")
    public static class214 field4407;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Z")
    public static boolean field4395;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    public int[] field4383;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
    private int[] field4385;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "[I")
    private int[] field4399;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "[I")
    public int[] field4416;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[[I")
    public int[][] field4402;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
    private static final int method1725(int arg0, int arg1) {
        field4406++;
        if (arg0 <= 94) {
            field4395 = false;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILqk;ILjb;)Lqk;")
    public final class201 method1726(int arg0, int arg1, class201 arg2, int arg3, class256 arg4) {
        field4386++;
        int var6 = this.field4416[arg3];
        class160 var7 = class209.method1398(var6 >> 16, arg0 ^ 0xFFFFFFE1);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method1733((byte) -107, arg1, arg2);
        }
        int var9 = arg4.field4416[arg1];
        if (arg0 != 1) {
            this.field4405 = 62;
        }
        class160 var10 = class209.method1398(var9 >> 16, -32);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class201 var12 = arg2.method166(!var7.method1131(arg0 - 1, var8), !this.field4413);
            var12.method170(var7, var8, this.field4413);
            return var12;
        } else {
            class201 var13 = arg2.method166(!var7.method1131(0, var8) & !var10.method1131(0, var11), !this.field4413 & !arg4.field4413);
            var13.method177(var7, var8, var10, var11, this.field4399, arg4.field4413 | this.field4413);
            return var13;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILqk;I)Lqk;")
    public final class201 method1727(int arg0, class201 arg1, int arg2) {
        int var4 = this.field4416[arg0];
        field4391++;
        class160 var5 = class209.method1398(var4 >> 16, arg2 - 10642);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method182(true, true);
        } else {
            class201 var7 = arg1.method182(!var5.method1131(arg2 ^ arg2, var6), !this.field4413);
            var7.method170(var5, var6, this.field4413);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILsb;B)V")
    public static final void method1728(int arg0, class215 arg1, byte arg2) {
        field4390++;
        if (class241.field4246 < arg1.field3729) {
            class166.method1163(100, arg1);
        } else if (arg1.field3714 < class241.field4246) {
            class213.method1427(121, arg1);
        } else {
            class27.method245(arg1, 128);
        }
        if (arg1.field3710 < 128 || arg1.field3700 < 128 || arg1.field3710 >= 13184 || arg1.field3700 >= 13184) {
            arg1.field3722 = -1;
            arg1.field3714 = 0;
            arg1.field3734 = -1;
            arg1.field3729 = 0;
            arg1.field3710 = arg1.field3715[0] * 128 + arg1.method1441((byte) 85) * 64;
            arg1.field3700 = arg1.field3743[0] * 128 + arg1.method1441((byte) 93) * 64;
            arg1.method1445(123);
        }
        if (class229.field3911 == arg1 && (arg1.field3710 < 1536 || arg1.field3700 < 1536 || arg1.field3710 >= 11776 || arg1.field3700 >= 11776)) {
            arg1.field3734 = -1;
            arg1.field3714 = 0;
            arg1.field3722 = -1;
            arg1.field3729 = 0;
            arg1.field3710 = arg1.field3715[0] * 128 + arg1.method1441((byte) 73) * 64;
            arg1.field3700 = arg1.field3743[0] * 128 + arg1.method1441((byte) 63) * 64;
            arg1.method1445(119);
        }
        if (arg2 < 29) {
            method1730(84);
        }
        class151.method1032(-1, arg1);
        class240.method1669(-1, arg1);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLie;I)V")
    private final void method1729(byte arg0, class32 arg1, int arg2) {
        if (arg0 != 9) {
            field4409 = null;
        }
        field4408++;
        if (arg2 == 1) {
            int var4 = arg1.method339(-16777216);
            this.field4383 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4383[var5] = arg1.method339(-16777216);
            }
            this.field4416 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4416[var6] = arg1.method339(-16777216);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4416[var7] = (arg1.method339(-16777216) << 16) + this.field4416[var7];
            }
        } else if (arg2 == 2) {
            this.field4393 = arg1.method339(-16777216);
        } else if (arg2 == 3) {
            int var8 = arg1.method316((byte) -3);
            this.field4399 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4399[var9] = arg1.method316((byte) -84);
            }
            this.field4399[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field4398 = true;
        } else if (arg2 == 5) {
            this.field4405 = arg1.method316((byte) 105);
        } else if (arg2 == 6) {
            this.field4389 = arg1.method339(-16777216);
        } else if (arg2 == 7) {
            this.field4410 = arg1.method339(-16777216);
        } else if (arg2 == 8) {
            this.field4415 = arg1.method316((byte) -6);
        } else if (arg2 == 9) {
            this.field4392 = arg1.method316((byte) -69);
        } else if (arg2 == 10) {
            this.field4387 = arg1.method316((byte) -21);
        } else if (arg2 == 11) {
            this.field4388 = arg1.method316((byte) 122);
        } else if (arg2 == 12) {
            int var14 = arg1.method316((byte) 106);
            this.field4385 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field4385[var15] = arg1.method339(class38.method384(arg0, -16777207));
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field4385[var16] = (arg1.method339(-16777216) << 16) + this.field4385[var16];
            }
        } else if (arg2 == 13) {
            int var10 = arg1.method339(arg0 - 16777225);
            this.field4402 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg1.method316((byte) -88);
                if (var12 > 0) {
                    this.field4402[var11] = new int[var12];
                    this.field4402[var11][0] = arg1.method313((byte) -80);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field4402[var11][var13] = arg1.method339(arg0 - 16777225);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4413 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1730(int arg0) {
        field4400 = null;
        field4411 = null;
        field4407 = null;
        if (arg0 >= -43) {
            method1725(63, -54);
        }
        field4409 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    private final void method1731(boolean arg0) {
        if (this.field4392 == -1) {
            if (this.field4399 == null) {
                this.field4392 = 0;
            } else {
                this.field4392 = 2;
            }
        }
        field4404++;
        if (this.field4387 == -1) {
            if (this.field4399 == null) {
                this.field4387 = 0;
            } else {
                this.field4387 = 2;
            }
        }
        if (!arg0) {
            method1725(41, 107);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Ljb;")
    public static final class256 method1732(int arg0, boolean arg1) {
        field4384++;
        class256 var2 = (class256) class131.field2298.method940((long) arg0, 10);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class33.field714.method1645(arg1, method1725(101, arg0), class36.method373(arg0, false));
        class256 var4 = new class256();
        if (var3 != null) {
            var4.method1736(-1, new class32(var3));
        }
        var4.method1731(true);
        class131.field2298.method937(-122, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BILqk;)Lqk;")
    public final class201 method1733(byte arg0, int arg1, class201 arg2) {
        int var4 = this.field4416[arg1];
        field4397++;
        class160 var5 = class209.method1398(var4 >> 16, -32);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method166(true, true);
        } else {
            int var7 = -41 % ((74 - arg0) / 51);
            class201 var8 = arg2.method166(!var5.method1131(0, var6), !this.field4413);
            var8.method170(var5, var6, this.field4413);
            return var8;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lqk;III)Lqk;")
    public final class201 method1734(class201 arg0, int arg1, int arg2, int arg3) {
        field4394++;
        int var5 = this.field4416[arg3];
        class160 var6 = class209.method1398(var5 >> 16, -32);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method166(true, true);
        }
        int var8 = arg1 & 0x3;
        class201 var9 = arg0.method166(!var6.method1131(0, var7), !this.field4413);
        if (arg2 == var8) {
            var9.method185();
        } else if (var8 == 2) {
            var9.method173();
        } else if (var8 == 3) {
            var9.method168();
        }
        var9.method170(var6, var7, this.field4413);
        if (var8 == 1) {
            var9.method168();
        } else if (var8 == 2) {
            var9.method173();
        } else if (var8 == 3) {
            var9.method185();
        }
        return var9;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(ILqk;I)Lqk;")
    public final class201 method1735(int arg0, class201 arg1, int arg2) {
        field4414++;
        int var4 = this.field4416[arg0];
        class160 var5 = class209.method1398(var4 >> 16, -32);
        int var6 = var4 & arg2;
        if (var5 == null) {
            return arg1.method166(true, true);
        }
        class160 var7 = null;
        int var8 = 0;
        if (this.field4385 != null && this.field4385.length > arg0) {
            int var9 = this.field4385[arg0];
            var7 = class209.method1398(var9 >> 16, -32);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class201 var11 = arg1.method166(!var5.method1131(0, var6), !this.field4413);
            var11.method170(var5, var6, this.field4413);
            return var11;
        } else {
            class201 var10 = arg1.method166(!var5.method1131(arg2 - 65535, var6) & !var7.method1131(arg2 - 65535, var8), !this.field4413);
            var10.method170(var5, var6, this.field4413);
            var10.method170(var7, var8, this.field4413);
            return var10;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILie;)V")
    private final void method1736(int arg0, class32 arg1) {
        if (arg0 != -1) {
            return;
        }
        field4396++;
        while (true) {
            int var3 = arg1.method316((byte) 103);
            if (var3 == 0) {
                return;
            }
            this.method1729((byte) 9, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static final void method1737(int arg0) {
        int var1 = class129.field2255;
        field4412++;
        int var2 = class245.field4296;
        int var3 = class231.field3976 - class119.field2087 - var2;
        int var4 = class170.field2976 - var1 - class142.field2585;
        if (var1 > 0 || var4 > 0 || var2 > 0 || var3 > 0) {
            try {
                Container var5;
                if (class24.field433 != null) {
                    var5 = class24.field433;
                } else if (class43.field946 == null) {
                    var5 = class268.field4572.field1306;
                } else {
                    var5 = class43.field946;
                }
                int var6 = 0;
                int var7 = 0;
                if (class43.field946 == var5) {
                    Insets var8 = class43.field946.getInsets();
                    var6 = var8.left;
                    var7 = var8.top;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var6, var7, var1, class231.field3976);
                }
                if (var2 > 0) {
                    var9.fillRect(var6, var7, class170.field2976, var2);
                }
                if (var4 > 0) {
                    var9.fillRect(class170.field2976 + var6 - var4, var7, var4, class231.field3976);
                }
                if (var3 > 0) {
                    var9.fillRect(var6, var7 + class231.field3976 - var3, class170.field2976, var3);
                }
            } catch (Exception var10) {
            }
        }
        if (arg0 != 15375) {
            method1737(72);
        }
    }
}
