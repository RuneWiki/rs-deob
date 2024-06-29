import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class58 {

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lek;")
    public static class183 field888 = new class183();

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lwm;")
    public static class152 field891 = class157.method1048("Jeter", 106);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Z")
    public static boolean field890 = false;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lwm;")
    public static class152 field893 = class157.method1048("(U0a )2 non)2existant gosub script)2num: ", 124);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lka;")
    public static class188 field884;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V", line = 7)
    public static final void method379(boolean arg0, int arg1) {
        if (!arg0) {
            method384();
        }
        field892++;
        class303 var2 = class90.method589(false, arg1, 9);
        var2.method2114((byte) 103);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZZIIII)V", line = 22)
    public static final void method380(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 > -6) {
            return;
        }
        field883++;
        if (arg0 >= arg5) {
            return;
        }
        int var7 = (arg0 + arg5) / 2;
        int var8 = arg0;
        class295 var9 = class262.field4456[var7];
        class262.field4456[var7] = class262.field4456[arg5];
        class262.field4456[arg5] = var9;
        for (int var10 = arg0; var10 < arg5; var10++) {
            if (class17.method113(arg1, arg2, arg6, -128, class262.field4456[var10], var9, arg3) <= 0) {
                class295 var11 = class262.field4456[var10];
                class262.field4456[var10] = class262.field4456[var8];
                class262.field4456[var8++] = var11;
            }
        }
        class262.field4456[arg5] = class262.field4456[var8];
        class262.field4456[var8] = var9;
        method380(arg0, arg1, arg2, arg3, -128, var8 - 1, arg6);
        method380(var8 + 1, arg1, arg2, arg3, -15, arg5, arg6);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 67)
    public static final void method381(int arg0, int arg1) {
        if (arg0 != 4004) {
            method387(56, -46);
        }
        class270.field4603.method1617(arg1, 50);
        field886++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)J", line = 82)
    public static final long method382(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        return var3 == null || var3.field554 == null ? 0L : var3.field554.field4717;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)Lrf;", line = 101)
    public static final class275 method383(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        return var3 == null ? null : var3.field554;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V", line = 110)
    public static final void method384() {
        if (class202.field3271 != null) {
            for (int var0 = 0; var0 < class202.field3271.length; var0++) {
                for (int var1 = 0; var1 < class112.field1595; var1++) {
                    for (int var2 = 0; var2 < class97.field1394; var2++) {
                        class202.field3271[var0][var1][var2] = null;
                    }
                }
            }
        }
        class27.field472 = (class1[][]) null;
        if (class194.field3102 != null) {
            for (int var3 = 0; var3 < class194.field3102.length; var3++) {
                for (int var4 = 0; var4 < class112.field1595; var4++) {
                    for (int var5 = 0; var5 < class97.field1394; var5++) {
                        class194.field3102[var3][var4][var5] = null;
                    }
                }
            }
        }
        class137.field2103 = (class1[][]) null;
        class30.field518 = 0;
        if (class139.field2121 != null) {
            for (int var6 = 0; var6 < class30.field518; var6++) {
                class139.field2121[var6] = null;
            }
        }
        if (class237.field3881 != null) {
            for (int var7 = 0; var7 < class213.field3474; var7++) {
                class237.field3881[var7] = null;
            }
            class213.field3474 = 0;
        }
        if (class163.field2579 != null) {
            for (int var8 = 0; var8 < class163.field2579.length; var8++) {
                class163.field2579[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ldd;I)V", line = 214)
    public static final void method385(class249 arg0, int arg1) {
        field887++;
        if (arg1 != 0) {
            method385((class249) null, -109);
        }
        class251 var2 = arg0.method1706((byte) 113);
        arg0.field4224 = var2.field4310;
        if (arg0.field4180 == 0) {
            arg0.field4210 = 0;
            return;
        }
        if (arg0.field4240 != -1 && arg0.field4216 == 0) {
            class141 var3 = class133.method851(arg0.field4240, -124);
            if (arg0.field4262 > 0 && var3.field2175 == 0) {
                arg0.field4210++;
                return;
            }
            if (arg0.field4262 <= 0 && var3.field2145 == 0) {
                arg0.field4210++;
                return;
            }
        }
        int var4 = arg0.field4162;
        int var5 = arg0.field4231;
        int var6 = arg0.field4188[arg0.field4180 - 1] * 128 + arg0.method67(-4391) * 64;
        int var7 = arg0.field4245[arg0.field4180 - 1] * 128 + (arg0.method67(-4391) * 64);
        if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
            arg0.field4162 = var6;
            arg0.field4231 = var7;
            return;
        }
        if (var4 < var6) {
            if (var5 < var7) {
                arg0.field4209 = 1280;
            } else if (var5 > var7) {
                arg0.field4209 = 1792;
            } else {
                arg0.field4209 = 1536;
            }
        } else if (var4 > var6) {
            if (var5 < var7) {
                arg0.field4209 = 768;
            } else if (var5 > var7) {
                arg0.field4209 = 256;
            } else {
                arg0.field4209 = 512;
            }
        } else if (var5 < var7) {
            arg0.field4209 = 1024;
        } else if (var7 < var5) {
            arg0.field4209 = 0;
        }
        int var8 = arg0.field4209 - arg0.field4161 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var9 = 4;
        int var10 = var2.field4308;
        if (var8 >= -256 && var8 <= 256) {
            var10 = var2.field4317;
        } else if (var8 >= 256 && var8 < 768) {
            var10 = var2.field4281;
        } else if (var8 >= -768 && var8 <= -256) {
            var10 = var2.field4305;
        }
        boolean var11 = true;
        if (var10 == -1) {
            var10 = var2.field4317;
        }
        arg0.field4224 = var10;
        if (arg0 instanceof class4) {
            var11 = ((class4) arg0).field72.field3954;
        }
        if (var11) {
            if (arg0.field4209 != arg0.field4161 && arg0.field4179 == -1 && arg0.field4190 != 0) {
                var9 = 2;
            }
            if (arg0.field4180 > 2) {
                var9 = 6;
            }
            if (arg0.field4180 > 3) {
                var9 = 8;
            }
            if (arg0.field4210 > 0 && arg0.field4180 > 1) {
                var9 = 8;
                arg0.field4210--;
            }
        } else {
            if (arg0.field4180 > 1) {
                var9 = 6;
            }
            if (arg0.field4180 > 2) {
                var9 = 8;
            }
            if (arg0.field4210 > 0 && arg0.field4180 > 1) {
                arg0.field4210--;
                var9 = 8;
            }
        }
        byte var12 = 1;
        if (arg0.field4213[arg0.field4180 - 1] == 2) {
            var12 = 2;
            var9 <<= 0x1;
        } else if (arg0.field4213[arg0.field4180 - 1] == 0) {
            var9 >>= 0x1;
            var12 = 0;
        }
        if (var9 < 8 || var2.field4286 == -1) {
            if (var2.field4280 != -1 && var12 == 0) {
                if (arg0.field4224 == var2.field4308 && var2.field4307 != -1) {
                    arg0.field4224 = var2.field4307;
                } else if (arg0.field4224 == var2.field4305 && var2.field4318 != -1) {
                    arg0.field4224 = var2.field4318;
                } else if (arg0.field4224 == var2.field4281 && var2.field4282 != -1) {
                    arg0.field4224 = var2.field4282;
                } else {
                    arg0.field4224 = var2.field4280;
                }
            }
        } else if (arg0.field4224 == var2.field4308 && var2.field4301 != -1) {
            arg0.field4224 = var2.field4301;
        } else if (arg0.field4224 == var2.field4305 && var2.field4303 != -1) {
            arg0.field4224 = var2.field4303;
        } else if (arg0.field4224 == var2.field4281 && var2.field4296 != -1) {
            arg0.field4224 = var2.field4296;
        } else {
            arg0.field4224 = var2.field4286;
        }
        if (var2.field4313 != -1) {
            int var13 = var9 << 7;
            if (arg0.field4180 == 1) {
                int var14 = (arg0.field4231 > var7 ? arg0.field4231 - var7 : -arg0.field4231 + var7) << 7;
                int var15 = (var6 < arg0.field4162 ? arg0.field4162 - var6 : -arg0.field4162 + var6) << 7;
                int var16 = var15 > var14 ? var15 : var14;
                int var17 = arg0.field4187 * arg0.field4187;
                int var18 = var16 * 2 * var2.field4313;
                if (var17 > var18) {
                    arg0.field4187 /= 2;
                } else if (var16 < var17 / 2) {
                    arg0.field4187 -= var2.field4313;
                    if (arg0.field4187 < 0) {
                        arg0.field4187 = 0;
                    }
                } else if (var13 > arg0.field4187) {
                    arg0.field4187 += var2.field4313;
                    if (arg0.field4187 > var13) {
                        arg0.field4187 = var13;
                    }
                }
            } else if (var13 > arg0.field4187) {
                arg0.field4187 += var2.field4313;
                if (arg0.field4187 > var13) {
                    arg0.field4187 = var13;
                }
            } else if (arg0.field4187 > 0) {
                arg0.field4187 -= var2.field4313;
                if (arg0.field4187 < 0) {
                    arg0.field4187 = 0;
                }
            }
            var9 = arg0.field4187 >> 7;
            if (var9 < 1) {
                var9 = 1;
            }
        }
        if (var4 < var6) {
            arg0.field4162 += var9;
            if (arg0.field4162 > var6) {
                arg0.field4162 = var6;
            }
        } else if (var4 > var6) {
            arg0.field4162 -= var9;
            if (var6 > arg0.field4162) {
                arg0.field4162 = var6;
            }
        }
        if (var5 < var7) {
            arg0.field4231 += var9;
            if (var7 < arg0.field4231) {
                arg0.field4231 = var7;
            }
        } else if (var7 < var5) {
            arg0.field4231 -= var9;
            if (var7 > arg0.field4231) {
                arg0.field4231 = var7;
            }
        }
        if (arg0.field4162 == var6 && arg0.field4231 == var7) {
            arg0.field4180--;
            if (arg0.field4262 > 0) {
                arg0.field4262--;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 538)
    public static void method386(int arg0) {
        if (arg0 != 0) {
            field891 = (class152) null;
        }
        field893 = null;
        field888 = null;
        field891 = null;
        field884 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V", line = 556)
    public static final void method387(int arg0, int arg1) {
        if (arg0 > 66) {
            field885++;
            class41.field665 = 20;
            class302.field5206 = 3;
            class197.field3154 = arg1;
        }
    }
}
