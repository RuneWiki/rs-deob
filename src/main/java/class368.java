import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class368 {

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "Lqc;")
    public class740 field5148 = new class740();

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "Lpu;")
    public static class559 field5150 = new class559(13, 3);

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "Lqaa;")
    public static class27 field5158 = new class27(54, 7);

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
    public static int field5159 = 1;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!bfa", name = "h", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!bfa", name = "i", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!bfa", name = "k", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!bfa", name = "j", descriptor = "Lqc;")
    private class740 field5155;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2297(int arg0, int arg1, int arg2) {
        if (arg1 >= -103) {
            field5159 = -91;
        }
        field5151++;
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lgs;)V", line = 18)
    public static final void method2298(class43 arg0) {
        class497.field7089.method592(arg0.field644, arg0.field651 + (arg0.method404(65535) >> 1), arg0.field648, class756.field10527);
        arg0.field655 = class756.field10527[0];
        arg0.field652 = class756.field10527[1];
        arg0.field647 = class756.field10527[2];
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)Lqc;", line = 24)
    public final class740 method2299(int arg0) {
        if (arg0 < 58) {
            this.field5148 = null;
        }
        field5154++;
        class740 var2 = this.field5148.field10390;
        if (this.field5148 == var2) {
            this.field5155 = null;
            return null;
        } else {
            this.field5155 = var2.field10390;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V", line = 289)
    public class368() {
        this.field5148.field10390 = this.field5148;
        this.field5148.field10388 = this.field5148;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)V", line = 48)
    public final void method2300(boolean arg0) {
        field5147++;
        while (true) {
            class740 var2 = this.field5148.field10390;
            if (this.field5148 == var2) {
                this.field5155 = null;
                if (!arg0) {
                    method2297(66, 76, -4);
                    return;
                }
                return;
            }
            var2.method4122(!arg0);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ldm;I)V", line = 72)
    public static final void method2301(class50 arg0, int arg1) {
        field5152++;
        if (!class737.field10375) {
            return;
        }
        if (arg0.field818 != null) {
            class50 var2 = class434.method2624(class31.field415, class40.field590, (byte) -88);
            if (var2 != null) {
                class604 var3 = new class604();
                var3.field8782 = arg0;
                var3.field8774 = var2;
                var3.field8773 = arg0.field818;
                class357.method2223(var3);
            }
        }
        class612.field8862++;
        if (arg1 != -3371) {
            method2307(18);
        }
        class135 var4 = class273.method1801(class459.field6629, class204.field2919, 2);
        var4.field2109.method233(arg0.field792, -23162);
        var4.field2109.method226((byte) -119, class54.field1033);
        var4.field2109.method256((byte) -119, class31.field415);
        var4.field2109.method285(arg1 + 3243, arg0.field807);
        var4.field2109.method285(-128, class40.field590);
        var4.field2109.method269(10543, arg0.field861);
        class539.method3178(var4, arg1 - 15554);
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Z)V", line = 113)
    public static final void method2302(boolean arg0) {
        field5146++;
        if (!class277.field3913) {
            class277.field3913 = true;
            class15.field190 += (-12.0F - class15.field190) / 2.0F;
            class674.field9471 = arg0;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)I", line = 133)
    public final int method2303(int arg0) {
        field5149++;
        int var2 = 0;
        int var3 = 68 / ((arg0 - 58) / 54);
        class740 var4 = this.field5148.field10390;
        while (this.field5148 != var4) {
            var4 = var4.field10390;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Lqc;B)V", line = 153)
    public final void method2304(class740 arg0, byte arg1) {
        if (arg0.field10388 != null) {
            arg0.method4122(false);
        }
        field5156++;
        arg0.field10388 = this.field5148.field10388;
        arg0.field10390 = this.field5148;
        arg0.field10388.field10390 = arg0;
        int var3 = 49 / ((1 - arg1) / 40);
        arg0.field10390.field10388 = arg0;
    }

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "(I)Lqc;", line = 176)
    public final class740 method2305(int arg0) {
        field5153++;
        class740 var2 = this.field5155;
        if (this.field5148 == var2) {
            this.field5155 = null;
            return null;
        }
        this.field5155 = var2.field10390;
        if (arg0 >= -36) {
            this.method2303(-126);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZIIIII)V", line = 197)
    public static final void method2306(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field5157++;
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class630.field9042 - class385.field5380) * var6 / 100 + class385.field5380;
        if (class687.field9682 > var7) {
            var7 = class687.field9682;
        } else if (class540.field7593 < var7) {
            var7 = class540.field7593;
        }
        if (arg4 != 2821) {
            method2308((byte) -23);
        }
        int var8 = var7 * 512 * arg1 / (arg3 * 334);
        if (class42.field641 > var8) {
            short var12 = class42.field641;
            var7 = arg3 * 334 * var12 / (arg1 * 512);
            if (class540.field7593 < var7) {
                var7 = class540.field7593;
                int var13 = var7 * 512 * arg1 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg0) {
                    class359.field5046.method601();
                    class359.field5046.method542(arg1, var14, arg4 + 1033, -16777216, arg2, arg5);
                    class359.field5046.method542(arg1, var14, arg4 ^ 0x40B, -16777216, arg2, arg3 + arg5 - var14);
                }
                arg3 -= var14 * 2;
                arg5 += var14;
            }
        } else if (class647.field9162 < var8) {
            short var9 = class647.field9162;
            var7 = var9 * 334 * arg3 / (arg1 * 512);
            if (class687.field9682 > var7) {
                var7 = class687.field9682;
                int var10 = arg3 * var9 * 334 / (var7 * 512);
                int var11 = (arg1 - var10) / 2;
                if (arg0) {
                    class359.field5046.method601();
                    class359.field5046.method542(var11, arg3, 3854, -16777216, arg2, arg5);
                    class359.field5046.method542(var11, arg3, 3854, -16777216, arg1 + arg2 - var11, arg5);
                }
                arg2 += var11;
                arg1 -= var11 * 2;
            }
        }
        class589.field8278 = arg2;
        class652.field9194 = arg5;
        class515.field7338 = (short) arg3;
        class498.field7096 = (short) arg1;
        class142.field2184 = arg1 * var7 / 334;
    }

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "(I)V", line = 301)
    public static void method2307(int arg0) {
        int var1 = 72 % ((-arg0 - 4) / 49);
        field5150 = null;
        field5158 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 316)
    public static final void method2308(byte arg0) {
        field5160++;
        if (arg0 >= -58) {
            field5150 = null;
        }
        int var1 = class435.field6080 * 512 + 256;
        int var2 = class268.field3874 * 512 + 256;
        int var3 = class534.method3136(1, class312.field4409, var1, var2) - class432.field6036;
        if (class460.field6635 < 100) {
            if (var1 > class685.field9660) {
                class685.field9660 += (var1 - class685.field9660) * class460.field6635 / 1000 + class208.field2974;
                if (class685.field9660 > var1) {
                    class685.field9660 = var1;
                }
            }
            if (class685.field9660 > var1) {
                class685.field9660 -= (class685.field9660 - var1) * class460.field6635 / 1000 + class208.field2974;
                if (var1 > class685.field9660) {
                    class685.field9660 = var1;
                }
            }
            if (class136.field2118 < var3) {
                class136.field2118 += (var3 - class136.field2118) * class460.field6635 / 1000 + class208.field2974;
                if (var3 < class136.field2118) {
                    class136.field2118 = var3;
                }
            }
            if (class136.field2118 > var3) {
                class136.field2118 -= (class136.field2118 - var3) * class460.field6635 / 1000 + class208.field2974;
                if (var3 > class136.field2118) {
                    class136.field2118 = var3;
                }
            }
            if (var2 > class260.field3810) {
                class260.field3810 += class208.field2974 + ((var2 - class260.field3810) * class460.field6635 / 1000);
                if (var2 < class260.field3810) {
                    class260.field3810 = var2;
                }
            }
            if (var2 < class260.field3810) {
                class260.field3810 -= (class260.field3810 - var2) * class460.field6635 / 1000 + class208.field2974;
                if (var2 > class260.field3810) {
                    class260.field3810 = var2;
                }
            }
        } else {
            class260.field3810 = class268.field3874 * 512 + 256;
            class685.field9660 = class435.field6080 * 512 + 256;
            class136.field2118 = class534.method3136(1, class312.field4409, class685.field9660, class260.field3810) - class432.field6036;
        }
        int var4 = class668.field9370 * 512 + 256;
        int var5 = class348.field4891 * 512 + 256;
        int var6 = class534.method3136(1, class312.field4409, var5, var4) - class78.field1464;
        int var7 = var5 - class685.field9660;
        int var8 = var6 - class136.field2118;
        int var9 = var4 - class260.field3810;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class694.field9754) {
            class694.field9754 += class399.field5586 + ((var11 - class694.field9754 >> 3) * class505.field7211 / 1000) << 3;
            if (var11 < class694.field9754) {
                class694.field9754 = var11;
            }
        }
        if (class694.field9754 > var11) {
            class694.field9754 -= (class694.field9754 - var11 >> 3) * class505.field7211 / 1000 + class399.field5586 << 3;
            if (var11 > class694.field9754) {
                class694.field9754 = var11;
            }
        }
        int var13 = var12 - class239.field3371;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class239.field3371 += class505.field7211 * var14 / 1000 + class399.field5586 << 3;
            class239.field3371 &= 0x3FFF;
        }
        if (var14 < 0) {
            class239.field3371 -= -var14 * class505.field7211 / 1000 + class399.field5586 << 3;
            class239.field3371 &= 0x3FFF;
        }
        int var15 = var12 - class239.field3371;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class239.field3371 = var12;
        }
        class717.field10039 = 0;
    }
}
