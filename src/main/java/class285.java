import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class285 extends class247 {

    @OriginalMember(owner = "client!em", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field4302;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field4298 = 0;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "Lph;")
    public static class361 field4301;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "[Lin;")
    public static class177[] field4299;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILgj;)V", line = 9)
    public static final void method2061(int arg0, class333 arg1) {
        field4296++;
        int var2 = -85 / ((arg0 + 7) / 53);
        class15 var3 = arg1.method2355(true);
        arg1.field5096 = var3.field262;
        if (arg1.field5113 == 0) {
            arg1.field5158 = 0;
            return;
        }
        if (arg1.field5190 != -1 && arg1.field5177 == 0) {
            class248 var4 = class119.method893(arg1.field5190, (byte) -41);
            if (arg1.field5122 > 0 && var4.field3676 == 0) {
                arg1.field5158++;
                return;
            }
            if (arg1.field5122 <= 0 && var4.field3668 == 0) {
                arg1.field5158++;
                return;
            }
        }
        if (arg1.field5090 != -1 && class304.field4560 >= arg1.field5107) {
            class107 var5 = class81.method669(32, arg1.field5090);
            if (var5.field1543 && var5.field1540 != -1) {
                class248 var6 = class119.method893(var5.field1540, (byte) -41);
                if (arg1.field5122 > 0 && var6.field3676 == 0) {
                    arg1.field5158++;
                    return;
                }
                if (arg1.field5122 <= 0 && var6.field3668 == 0) {
                    arg1.field5158++;
                    return;
                }
            }
        }
        int var7 = arg1.field5165;
        int var8 = arg1.field5137;
        int var9 = arg1.field5186[arg1.field5113 - 1] * 128 + (arg1.method1700(-117) * 64);
        int var10 = arg1.field5162[arg1.field5113 - 1] * 128 + arg1.method1700(-104) * 64;
        if (var9 - var8 > 256 || (var9 - var8) < -256 || var10 - var7 > 256 || var10 - var7 < -256) {
            arg1.field5165 = var10;
            arg1.field5137 = var9;
            return;
        }
        if (var8 < var9) {
            if (var7 < var10) {
                arg1.field5089 = 1280;
            } else if (var7 > var10) {
                arg1.field5089 = 1792;
            } else {
                arg1.field5089 = 1536;
            }
        } else if (var8 <= var9) {
            if (var7 < var10) {
                arg1.field5089 = 1024;
            } else if (var10 < var7) {
                arg1.field5089 = 0;
            }
        } else if (var10 > var7) {
            arg1.field5089 = 768;
        } else if (var10 < var7) {
            arg1.field5089 = 256;
        } else {
            arg1.field5089 = 512;
        }
        int var11 = arg1.field5089 - arg1.field5199 & 0x7FF;
        int var12 = var3.field251;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 >= -256 && var11 <= 256) {
            var12 = var3.field229;
        } else if (var11 >= 256 && var11 < 768) {
            var12 = var3.field228;
        } else if (var11 >= -768 && var11 <= -256) {
            var12 = var3.field218;
        }
        if (var12 == -1) {
            var12 = var3.field229;
        }
        boolean var13 = true;
        int var14 = 4;
        byte var15 = 1;
        arg1.field5096 = var12;
        if (arg1 instanceof class181) {
            var13 = ((class181) arg1).field2609.field3106;
        }
        if (var13) {
            if (arg1.field5199 != arg1.field5089 && arg1.field5183 == -1 && arg1.field5149 != 0) {
                var14 = 2;
            }
            if (arg1.field5113 > 2) {
                var14 = 6;
            }
            if (arg1.field5113 > 3) {
                var14 = 8;
            }
            if (arg1.field5158 > 0 && arg1.field5113 > 1) {
                arg1.field5158--;
                var14 = 8;
            }
        } else {
            if (arg1.field5113 > 1) {
                var14 = 6;
            }
            if (arg1.field5113 > 2) {
                var14 = 8;
            }
            if (arg1.field5158 > 0 && arg1.field5113 > 1) {
                var14 = 8;
                arg1.field5158--;
            }
        }
        if (arg1.field5133[arg1.field5113 - 1] == 2) {
            var14 <<= 0x1;
            var15 = 2;
        } else if (arg1.field5133[arg1.field5113 - 1] == 0) {
            var15 = 0;
            var14 >>= 0x1;
        }
        if (var14 < 8 || var3.field232 == -1) {
            if (var3.field241 != -1 && var15 == 0) {
                if (arg1.field5096 == var3.field251 && var3.field238 != -1) {
                    arg1.field5096 = var3.field238;
                } else if (arg1.field5096 == var3.field218 && var3.field252 != -1) {
                    arg1.field5096 = var3.field252;
                } else if (arg1.field5096 == var3.field228 && var3.field257 != -1) {
                    arg1.field5096 = var3.field257;
                } else {
                    arg1.field5096 = var3.field241;
                }
            }
        } else if (arg1.field5096 == var3.field251 && var3.field253 != -1) {
            arg1.field5096 = var3.field253;
        } else if (arg1.field5096 == var3.field218 && var3.field220 != -1) {
            arg1.field5096 = var3.field220;
        } else if (arg1.field5096 == var3.field228 && var3.field240 != -1) {
            arg1.field5096 = var3.field240;
        } else {
            arg1.field5096 = var3.field232;
        }
        if (var3.field242 != -1) {
            int var16 = var14 << 7;
            if (arg1.field5113 == 1) {
                int var17 = arg1.field5170 * arg1.field5170;
                int var18 = (arg1.field5137 <= var9 ? var9 - arg1.field5137 : -var9 + arg1.field5137) << 7;
                int var19 = (arg1.field5165 > var10 ? arg1.field5165 - var10 : var10 - arg1.field5165) << 7;
                int var20 = var18 > var19 ? var18 : var19;
                int var21 = var20 * 2 * var3.field242;
                if (var17 > var21) {
                    arg1.field5170 /= 2;
                } else if (var20 < var17 / 2) {
                    arg1.field5170 -= var3.field242;
                    if (arg1.field5170 < 0) {
                        arg1.field5170 = 0;
                    }
                } else if (var16 > arg1.field5170) {
                    arg1.field5170 += var3.field242;
                    if (var16 < arg1.field5170) {
                        arg1.field5170 = var16;
                    }
                }
            } else if (arg1.field5170 < var16) {
                arg1.field5170 += var3.field242;
                if (arg1.field5170 > var16) {
                    arg1.field5170 = var16;
                }
            } else if (arg1.field5170 > 0) {
                arg1.field5170 -= var3.field242;
                if (arg1.field5170 < 0) {
                    arg1.field5170 = 0;
                }
            }
            var14 = arg1.field5170 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var8 < var9) {
            arg1.field5137 += var14;
            if (arg1.field5137 > var9) {
                arg1.field5137 = var9;
            }
        } else if (var8 > var9) {
            arg1.field5137 -= var14;
            if (var9 > arg1.field5137) {
                arg1.field5137 = var9;
            }
        }
        if (var10 > var7) {
            arg1.field5165 += var14;
            if (var10 < arg1.field5165) {
                arg1.field5165 = var10;
            }
        } else if (var7 > var10) {
            arg1.field5165 -= var14;
            if (arg1.field5165 < var10) {
                arg1.field5165 = var10;
            }
        }
        if (arg1.field5137 == var9 && arg1.field5165 == var10) {
            arg1.field5113--;
            if (arg1.field5122 > 0) {
                arg1.field5122--;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(B)Z", line = 360)
    public final boolean method715(byte arg0) {
        field4295++;
        return arg0 == -29 ? false : false;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 372)
    public class285(Object arg0) {
        this.field4302 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "i", descriptor = "(I)V", line = 386)
    public static void method2062(int arg0) {
        if (arg0 != -257) {
            field4301 = (class361) null;
        }
        field4301 = null;
        field4299 = null;
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 397)
    public final Object method716(int arg0) {
        if (arg0 != -25180) {
            this.method716(-92);
        }
        field4297++;
        return this.field4302;
    }
}
