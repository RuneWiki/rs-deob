import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class71 {

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    private int field877 = 0;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lrh;")
    private class31 field873 = null;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    private int field879 = 0;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    private int field876 = 0;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lgk;")
    private class463 field872;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lwl;")
    private class511 field871;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "[Lre;")
    private class477[] field875;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Ldi;")
    public class177 field866;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[Liu;")
    public static class424[] field874 = new class424[14];

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lpb;")
    public static class296 field878 = new class296("", 10);

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[[Z")
    public static boolean[][] field882 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lf;")
    public static class404 field881;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZLgf;)V", line = 4)
    public static final void method401(int arg0, boolean arg1, class395 arg2) {
        field870++;
        class371 var3 = arg2.method2347((byte) -121);
        if (arg2.field5244 == 0) {
            class345.field4396 = 0;
            class289.field3698 = -1;
            arg2.field5245 = 0;
            return;
        }
        if (arg2.field5191 != -1 && arg2.field5177 == 0) {
            class44 var4 = class403.field5429.method1962(arg2.field5191, false);
            if (arg2.field5252 > 0 && var4.field654 == 0) {
                arg2.field5245++;
                class345.field4396 = 0;
                class289.field3698 = -1;
                return;
            }
            if (arg2.field5252 <= 0 && var4.field649 == 0) {
                arg2.field5245++;
                class289.field3698 = -1;
                class345.field4396 = 0;
                return;
            }
        }
        if (arg2.field5204 != -1 && class264.field3353 >= arg2.field5155) {
            class76 var5 = class472.field6897.method1495((byte) 62, arg2.field5204);
            if (var5.field964 && var5.field969 != -1) {
                class44 var6 = class403.field5429.method1962(var5.field969, false);
                if (arg2.field5252 > 0 && var6.field654 == 0) {
                    arg2.field5245++;
                    class345.field4396 = 0;
                    class289.field3698 = -1;
                    return;
                }
                if (arg2.field5252 <= 0 && var6.field649 == 0) {
                    class345.field4396 = 0;
                    class289.field3698 = -1;
                    arg2.field5245++;
                    return;
                }
            }
        }
        if (arg2.field5204 != -1 && arg2.field5155 <= class264.field3353) {
            class76 var7 = class472.field6897.method1495((byte) 62, arg2.field5204);
            if (var7.field964 && var7.field969 != -1) {
                class44 var8 = class403.field5429.method1962(var7.field969, false);
                if (arg2.field5252 > 0 && var8.field654 == 0) {
                    arg2.field5245++;
                    class345.field4396 = 0;
                    class289.field3698 = -1;
                    return;
                }
                if (arg2.field5252 <= 0 && var8.field649 == 0) {
                    arg2.field5245++;
                    class345.field4396 = 0;
                    class289.field3698 = -1;
                    return;
                }
            }
        }
        int var9 = arg2.field6239;
        int var10 = arg2.field6241;
        int var11 = arg2.field5246[arg2.field5244 - 1] * 128 + arg2.method2342(10804) * 64;
        int var12 = arg2.field5251[arg2.field5244 - 1] * 128 + (arg2.method2342(10804) * 64);
        if (var11 > var9) {
            if (var12 > var10) {
                arg2.method2341(true, 10240);
            } else if (var10 > var12) {
                arg2.method2341(true, 14336);
            } else {
                arg2.method2341(true, 12288);
            }
        } else if (var11 < var9) {
            if (var12 > var10) {
                arg2.method2341(true, 6144);
            } else if (var12 >= var10) {
                arg2.method2341(true, 4096);
            } else {
                arg2.method2341(true, 2048);
            }
        } else if (var10 < var12) {
            arg2.method2341(true, 8192);
        } else if (var10 > var12) {
            arg2.method2341(true, 0);
        }
        byte var13 = arg2.field5248[arg2.field5244 - 1];
        if (arg0 != 6) {
            field881 = null;
        }
        if (!arg1 && ((var11 - var9) > 256 || var11 - var9 < -256 || (var12 - var10) > 256 || (var12 - var10) < -256)) {
            arg2.field6241 = var12;
            arg2.field6239 = var11;
            arg2.method2344(arg2.field5234, arg0 ^ 0xFFFFB66E);
            class289.field3698 = -1;
            class345.field4396 = 0;
            if (arg2.field5252 > 0) {
                arg2.field5252--;
            }
            arg2.field5244--;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg2 instanceof class295) {
            var15 = ((class295) arg2).field3831.field105;
        }
        if (var15) {
            int var16 = arg2.field5234 - arg2.field5209.field775;
            if (var16 != 0 && arg2.field5202 == -1 && arg2.field5200 != 0) {
                var14 = 2;
            }
            if (!arg1 && arg2.field5244 > 2) {
                var14 = 6;
            }
            if (!arg1 && arg2.field5244 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg1 && arg2.field5244 > 1) {
                var14 = 6;
            }
            if (!arg1 && arg2.field5244 > 2) {
                var14 = 8;
            }
        }
        if (arg2.field5245 > 0 && arg2.field5244 > 1) {
            arg2.field5245--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field4810 != -1) {
            int var17 = var14 << 7;
            if (arg2.field5244 == 1) {
                int var18 = arg2.field5247 * arg2.field5247;
                int var19 = (var11 < arg2.field6239 ? arg2.field6239 - var11 : -arg2.field6239 + var11) << 7;
                int var20 = (var12 >= arg2.field6241 ? var12 - arg2.field6241 : -var12 + arg2.field6241) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field4810 * var21 * 2;
                if (var22 < var18) {
                    arg2.field5247 /= 2;
                } else if (var18 / 2 > var21) {
                    arg2.field5247 -= var3.field4810;
                    if (arg2.field5247 < 0) {
                        arg2.field5247 = 0;
                    }
                } else if (var17 > arg2.field5247) {
                    arg2.field5247 += var3.field4810;
                    if (arg2.field5247 > var17) {
                        arg2.field5247 = var17;
                    }
                }
            } else if (var17 > arg2.field5247) {
                arg2.field5247 += var3.field4810;
                if (var17 < arg2.field5247) {
                    arg2.field5247 = var17;
                }
            } else if (arg2.field5247 > 0) {
                arg2.field5247 -= var3.field4810;
                if (arg2.field5247 < 0) {
                    arg2.field5247 = 0;
                }
            }
            var14 = arg2.field5247 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class345.field4396 = 0;
        if (var11 > var9) {
            arg2.field6239 += var14;
            class345.field4396 |= 0x4;
            if (var11 < arg2.field6239) {
                arg2.field6239 = var11;
            }
        } else if (var9 > var11) {
            arg2.field6239 -= var14;
            class345.field4396 |= 0x8;
            if (var11 > arg2.field6239) {
                arg2.field6239 = var11;
            }
        }
        if (var12 > var10) {
            class345.field4396 |= 0x1;
            arg2.field6241 += var14;
            if (var12 < arg2.field6241) {
                arg2.field6241 = var12;
            }
        } else if (var12 < var10) {
            class345.field4396 |= 0x2;
            arg2.field6241 -= var14;
            if (var12 > arg2.field6241) {
                arg2.field6241 = var12;
            }
        }
        if (var14 < 8) {
            class289.field3698 = var13;
        } else {
            class289.field3698 = 2;
        }
        if (arg2.field6239 == var11 && arg2.field6241 == var12) {
            if (arg2.field5252 > 0) {
                arg2.field5252--;
            }
            arg2.field5244--;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI)V", line = 343)
    public final void method402(int arg0, byte arg1, int arg2) {
        field864++;
        if (arg1 <= 51) {
            this.field866 = null;
        }
        if (this.field877 != 0 & (this.field879 != arg0 | this.field876 != arg2)) {
            this.field875[Integer.MAX_VALUE & this.field877].method272((byte) 43, arg0, arg2);
            this.field876 = arg2;
            this.field879 = arg0;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lrh;BI)Z", line = 362)
    public final boolean method403(class31 arg0, byte arg1, int arg2) {
        field867++;
        int var4 = 39 % ((arg1 - 32) / 57);
        if (this.field877 == 0) {
            return false;
        }
        if (this.field873 != arg0) {
            this.field875[Integer.MAX_VALUE & this.field877].method266(arg0, -11, arg2);
            this.field873 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IBI)Z", line = 385)
    public static final boolean method404(int arg0, byte arg1, int arg2) {
        if (arg1 < 86) {
            return true;
        } else {
            field869++;
            return (class34.method223(arg0, 7350, arg2) | class257.method1611(arg0, arg2, -1) | class250.method1566(arg2, arg0, -1)) & class142.method987(arg0, false, arg2);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZII)V", line = 400)
    public final void method405(boolean arg0, boolean arg1, int arg2, int arg3) {
        boolean var5 = arg0 & this.field872.method898();
        field865++;
        if (!var5 && (arg2 == 4 || arg2 == 8)) {
            arg2 = 2;
        }
        if (arg3 != 28092) {
            field882 = null;
        }
        if (arg2 != 0 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field877 != arg2) {
            if (this.field877 != 0) {
                this.field875[Integer.MAX_VALUE & this.field877].method269((byte) 126);
            }
            if (arg2 != 0) {
                this.field875[Integer.MAX_VALUE & arg2].method270(true, arg1);
                this.field875[arg2 & Integer.MAX_VALUE].method271(arg1, -13);
            }
            this.field876 = Integer.MIN_VALUE;
            this.field873 = null;
            this.field877 = arg2;
            this.field879 = Integer.MIN_VALUE;
        } else if (this.field877 != 0) {
            this.field875[this.field877 & Integer.MAX_VALUE].method271(arg1, -13);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z[[BLbi;)V", line = 441)
    public static final void method406(boolean arg0, byte[][] arg1, class381 arg2) {
        field880++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field2838; var4++) {
            class100.method679(16384);
            for (int var5 = 0; var5 < class200.field2594 >> 3; var5++) {
                for (int var6 = 0; var6 < class118.field1647 >> 3; var6++) {
                    boolean var7 = false;
                    int var8 = class46.field674[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg2.field2825 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var8 & 0x3FFC) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class194.field2507.length; var14++) {
                                if (class194.field2507[var14] == var13 && arg1[var14] != null) {
                                    class88 var15 = new class88(arg1[var14]);
                                    arg2.method1405(var6 * 8, var5 * 8, var11, var15, var10, -5978, var12, var9, class171.field2215, var4);
                                    arg2.method2218(-9377, var15, class512.field7538, var10, var4, var9, var6 * 8, var11, var5 * 8, var12, var3[0] == -1 ? var3 : null);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg2.method1414(var6 * 8, 8, 1, 8, var4, var5 * 8);
                    }
                }
            }
        }
        if (!arg0) {
            method406(false, null, null);
        }
        if (var3[0] != -1) {
            class11.field190 = class264.field3355.method430(class261.field3316, var3[3], var3[2], 0, var3[0], var3[1]);
            class103.field1418 = var3[4];
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lgk;)V", line = 572)
    public class71(class463 arg0) {
        this.field872 = arg0;
        this.field871 = new class511(arg0);
        this.field875 = new class477[10];
        this.field875[1] = new class514(arg0);
        this.field875[2] = new class42(arg0, this.field871);
        this.field875[4] = new class97(arg0, this.field871);
        this.field875[5] = new class430(arg0, this.field871);
        this.field875[6] = new class335(arg0);
        this.field875[7] = new class99(arg0);
        this.field875[3] = this.field866 = new class177(arg0);
        this.field875[8] = new class334(arg0, this.field871);
        this.field875[9] = new class489(arg0, this.field871);
        if (!this.field875[8].method264((byte) 79)) {
            this.field875[8] = this.field875[4];
        }
        if (!this.field875[9].method264((byte) 51)) {
            this.field875[9] = this.field875[8];
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)Z", line = 541)
    public final boolean method407(byte arg0, int arg1) {
        int var3 = 115 / ((19 - arg0) / 46);
        field868++;
        return this.field875[arg1].method264((byte) 127);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 551)
    public static void method408(boolean arg0) {
        if (arg0) {
            field882 = null;
            field874 = null;
            field881 = null;
            field878 = null;
        }
    }
}
