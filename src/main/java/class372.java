import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class372 extends class73 {

    @OriginalMember(owner = "client!io", name = "z", descriptor = "Lbu;")
    public class19 field5117 = new class19();

    @OriginalMember(owner = "client!io", name = "B", descriptor = "Lsca;")
    public class41 field5119 = new class41();

    @OriginalMember(owner = "client!io", name = "o", descriptor = "Ltca;")
    private class150 field5106;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "[I")
    public static int[] field5108 = new int[200];

    @OriginalMember(owner = "client!io", name = "w", descriptor = "Z")
    public static boolean field5114 = false;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "[S")
    public static short[] field5115;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public final void method263(int arg0) {
        field5113++;
        this.field5119.method263(arg0);
        for (class477 var2 = (class477) this.field5117.method124((byte) 42); var2 != null; var2 = (class477) this.field5117.method120(-111)) {
            if (!this.field5106.method1078(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field6765 >= var3) {
                        this.method2221(var2, var3, 36);
                        var2.field6765 -= var3;
                        break;
                    }
                    this.method2221(var2, var2.field6765, 33);
                    var3 -= var2.field6765;
                } while (!this.field5106.method1076(var3, var2, null, 0, 0));
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lvp;")
    public static final class162 method2217(int arg0, int arg1, int arg2) {
        if (arg1 != 100) {
            field5114 = false;
        }
        field5118++;
        class162 var3 = class153.method1117(arg0, -30170);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field2462 == null || arg2 >= var3.field2462.length) {
            return null;
        } else {
            return var3.field2462[arg2];
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
    public static void method2218(int arg0) {
        int var1 = -75 % ((68 - arg0) / 50);
        field5115 = null;
        field5108 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lfi;IIIZ[I)V")
    private final void method2219(class477 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        if ((this.field5106.field2236[arg0.field6769] & 0x4) != 0 && arg0.field6773 < 0) {
            int var7 = this.field5106.field2231[arg0.field6769] / class270.field3834;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field6755) / var7;
                if (arg1 < var8) {
                    arg0.field6755 += arg1 * var7;
                    break;
                }
                arg0.field6757.method262(arg5, arg3, var8);
                arg0.field6755 += var7 * var8 - 1048576;
                arg1 -= var8;
                arg3 += var8;
                int var9 = class270.field3834 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class91 var11 = arg0.field6757;
                if (this.field5106.field2241[arg0.field6769] == 0) {
                    arg0.field6757 = class91.method691(arg0.field6759, var11.method716(), var11.method680(), var11.method700());
                } else {
                    arg0.field6757 = class91.method691(arg0.field6759, var11.method716(), 0, var11.method700());
                    this.field5106.method1081(arg0.field6752.field3701[arg0.field6758] < 0, -1, arg0);
                    arg0.field6757.method683(var9, var11.method680());
                }
                if (arg0.field6752.field3701[arg0.field6758] < 0) {
                    arg0.field6757.method706(-1);
                }
                var11.method681(var9);
                var11.method262(arg5, arg3, arg2 - arg3);
                if (var11.method715()) {
                    this.field5119.method267(var11);
                }
            }
        }
        field5109++;
        arg0.field6757.method262(arg5, arg3, arg1);
        if (arg4) {
            field5114 = false;
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(II)I")
    public static final int method2220(int arg0, int arg1) {
        field5104++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            if (arg0 <= 51) {
                method2218(16);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()Lkca;")
    public final class73 method257() {
        field5112++;
        class477 var1;
        do {
            var1 = (class477) this.field5117.method120(-76);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6757 == null);
        return var1.field6757;
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "()I")
    public final int method265() {
        field5116++;
        return 0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([III)V")
    public final void method262(int[] arg0, int arg1, int arg2) {
        field5111++;
        this.field5119.method262(arg0, arg1, arg2);
        for (class477 var4 = (class477) this.field5117.method124((byte) 42); var4 != null; var4 = (class477) this.field5117.method120(-126)) {
            if (!this.field5106.method1078(-1, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field6765 >= var6) {
                        this.method2219(var4, var6, var5 + var6, var5, false, arg0);
                        var4.field6765 -= var6;
                        break;
                    }
                    this.method2219(var4, var4.field6765, var5 + var6, var5, false, arg0);
                    var5 += var4.field6765;
                    var6 -= var4.field6765;
                } while (!this.field5106.method1076(var6, var4, arg0, var5, 0));
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lfi;II)V")
    private final void method2221(class477 arg0, int arg1, int arg2) {
        field5110++;
        if ((this.field5106.field2236[arg0.field6769] & 0x4) != 0 && arg0.field6773 < 0) {
            int var4 = this.field5106.field2231[arg0.field6769] / class270.field3834;
            int var5 = (var4 + 1048575 - arg0.field6755) / var4;
            arg0.field6755 = arg1 * var4 + arg0.field6755 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field5106.field2241[arg0.field6769] == 0) {
                    arg0.field6757 = class91.method691(arg0.field6759, arg0.field6757.method716(), arg0.field6757.method680(), arg0.field6757.method700());
                } else {
                    arg0.field6757 = class91.method691(arg0.field6759, arg0.field6757.method716(), 0, arg0.field6757.method700());
                    this.field5106.method1081(arg0.field6752.field3701[arg0.field6758] < 0, -1, arg0);
                }
                if (arg0.field6752.field3701[arg0.field6758] < 0) {
                    arg0.field6757.method706(-1);
                }
                arg1 = arg0.field6755 / var4;
            }
        }
        arg0.field6757.method263(arg1);
        if (arg2 <= 26) {
            method2222(-35);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()Lkca;")
    public final class73 method256() {
        field5107++;
        class477 var1 = (class477) this.field5117.method124((byte) 42);
        if (var1 == null) {
            return null;
        } else if (var1.field6757 == null) {
            return this.method257();
        } else {
            return var1.field6757;
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
    public static final void method2222(int arg0) {
        field5105++;
        int var1 = class92.field1368 * 128 + 64;
        int var2 = class224.field3243 * 128 + 64;
        int var3 = class132.method919(class89.field1339, var2, var1, (byte) -82) - class259.field3708;
        if (class408.field5571 < 100) {
            if (class125.field1760 < var1) {
                class125.field1760 += (var1 - class125.field1760) * class408.field5571 / 1000 + class576.field8493;
                if (class125.field1760 > var1) {
                    class125.field1760 = var1;
                }
            }
            if (var1 < class125.field1760) {
                class125.field1760 -= class576.field8493 + ((class125.field1760 - var1) * class408.field5571 / 1000);
                if (class125.field1760 < var1) {
                    class125.field1760 = var1;
                }
            }
            if (class118.field1665 < var3) {
                class118.field1665 += (var3 - class118.field1665) * class408.field5571 / 1000 + class576.field8493;
                if (class118.field1665 > var3) {
                    class118.field1665 = var3;
                }
            }
            if (class118.field1665 > var3) {
                class118.field1665 -= (class118.field1665 - var3) * class408.field5571 / 1000 + class576.field8493;
                if (var3 > class118.field1665) {
                    class118.field1665 = var3;
                }
            }
            if (class214.field3161 < var2) {
                class214.field3161 += (var2 - class214.field3161) * class408.field5571 / 1000 + class576.field8493;
                if (class214.field3161 > var2) {
                    class214.field3161 = var2;
                }
            }
            if (var2 < class214.field3161) {
                class214.field3161 -= class576.field8493 + ((class214.field3161 - var2) * class408.field5571 / 1000);
                if (class214.field3161 < var2) {
                    class214.field3161 = var2;
                }
            }
        } else {
            class214.field3161 = class224.field3243 * 128 + 64;
            class125.field1760 = class92.field1368 * 128 + 64;
            class118.field1665 = class132.method919(class89.field1339, class214.field3161, class125.field1760, (byte) -82) - class259.field3708;
        }
        int var4 = class606.field9003 * arg0 + 64;
        int var5 = class469.field6617 * 128 + 64;
        int var6 = class132.method919(class89.field1339, var4, var5, (byte) -82) - class83.field1194;
        int var7 = var5 - class125.field1760;
        int var8 = var6 - class118.field1665;
        int var9 = var4 - class214.field3161;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class517.field7371 < var11) {
            class517.field7371 += (var11 - class517.field7371 >> 3) * class613.field9074 / 1000 + class354.field4818 << 3;
            if (var11 < class517.field7371) {
                class517.field7371 = var11;
            }
        }
        if (class517.field7371 > var11) {
            class517.field7371 -= class354.field4818 + ((class517.field7371 - var11 >> 3) * class613.field9074 / 1000) << 3;
            if (var11 > class517.field7371) {
                class517.field7371 = var11;
            }
        }
        int var13 = var12 - class222.field3222;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class222.field3222 += class354.field4818 + (class613.field9074 * var14 / 1000) << 3;
            class222.field3222 &= 0x3FFF;
        }
        if (var14 < 0) {
            class222.field3222 -= -var14 * class613.field9074 / 1000 + class354.field4818 << 3;
            class222.field3222 &= 0x3FFF;
        }
        int var15 = var12 - class222.field3222;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class222.field3222 = var12;
        }
        class234.field3396 = 0;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ltca;)V")
    public class372(class150 arg0) {
        this.field5106 = arg0;
    }
}
