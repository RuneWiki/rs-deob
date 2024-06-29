import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class666 {

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
    private int field9396 = 0;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "Lkea;")
    private class213 field9394;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "Lnea;")
    public static class664 field9400 = new class664(110, 3);

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "Ldg;")
    public static class376 field9403 = new class376(58, 15);

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "Lgda;")
    public static class50 field9402;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "Lpca;")
    private class665 field9392;

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "Z")
    public static boolean field9405;

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "[Lida;")
    public static class211[] field9407;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method3679(boolean arg0) {
        class305.field4532++;
        field9397++;
        class135 var1 = class688.method3794(class487.field6926, class583.field8198, (byte) 38);
        var1.field1978.method3853((byte) 51, class488.method2836(3));
        var1.field1978.method3852(arg0, class487.field6930);
        var1.field1978.method3852(arg0, class31.field494);
        var1.field1978.method3853((byte) 51, class287.field4270.field3706);
        class19.method223(var1, 0);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZLwt;)Ljava/lang/String;", line = 22)
    public static final String method3680(boolean arg0, class279 arg1) {
        if (arg0) {
            method3684(-72);
        }
        field9401++;
        return arg1.field4207 == null || arg1.field4207.length() <= 0 ? arg1.field4210 : arg1.field4210 + class274.field4148.method1804(7175, class512.field7203) + arg1.field4207;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Lpca;", line = 41)
    public final class665 method3681(int arg0) {
        field9404++;
        this.field9396 = arg0;
        return this.method3686(arg0 + 16431);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZBLvq;)V", line = 50)
    public static final void method3682(boolean arg0, byte arg1, class425 arg2) {
        field9406++;
        class87 var3 = arg2.method2544(2);
        if (arg2.field6269 == 0) {
            class132.field1954 = -1;
            arg2.field6264 = 0;
            class369.field5276 = 0;
            return;
        }
        if (arg2.field6218 != -1 && arg2.field6175 == 0) {
            class30 var4 = class188.field2708.method2140(arg2.field6218, 127);
            if (arg2.field6268 > 0 && var4.field465 == 0) {
                arg2.field6264++;
                class132.field1954 = -1;
                class369.field5276 = 0;
                return;
            }
            if (arg2.field6268 <= 0 && var4.field448 == 0) {
                class369.field5276 = 0;
                class132.field1954 = -1;
                arg2.field6264++;
                return;
            }
        }
        if (arg2.field6227 != -1 && arg2.field6188 <= class564.field7962) {
            class309 var5 = class86.field1411.method1475((byte) -74, arg2.field6227);
            if (var5.field4584 && var5.field4566 != -1) {
                class30 var6 = class188.field2708.method2140(var5.field4566, 124);
                if (arg2.field6268 > 0 && var6.field465 == 0) {
                    class132.field1954 = -1;
                    arg2.field6264++;
                    class369.field5276 = 0;
                    return;
                }
                if (arg2.field6268 <= 0 && var6.field448 == 0) {
                    class369.field5276 = 0;
                    class132.field1954 = -1;
                    arg2.field6264++;
                    return;
                }
            }
        }
        if (arg2.field6227 != -1 && class564.field7962 >= arg2.field6188) {
            class309 var7 = class86.field1411.method1475((byte) -74, arg2.field6227);
            if (var7.field4584 && var7.field4566 != -1) {
                class30 var8 = class188.field2708.method2140(var7.field4566, 127);
                if (arg2.field6268 > 0 && var8.field465 == 0) {
                    class132.field1954 = -1;
                    arg2.field6264++;
                    class369.field5276 = 0;
                    return;
                }
                if (arg2.field6268 <= 0 && var8.field448 == 0) {
                    class369.field5276 = 0;
                    arg2.field6264++;
                    class132.field1954 = -1;
                    return;
                }
            }
        }
        int var9 = arg2.field3024;
        int var10 = arg2.field3029;
        int var11 = arg2.field6271[arg2.field6269 - 1] * 512 + arg2.method2553((byte) 72) * 256;
        int var12 = arg2.field6262[arg2.field6269 - 1] * 512 + arg2.method2553((byte) 106) * 256;
        if (var11 > var9) {
            if (var10 < var12) {
                arg2.method2552(-57, 10240);
            } else if (var12 >= var10) {
                arg2.method2552(-104, 12288);
            } else {
                arg2.method2552(-23, 14336);
            }
        } else if (var9 > var11) {
            if (var12 > var10) {
                arg2.method2552(-29, 6144);
            } else if (var10 <= var12) {
                arg2.method2552(-62, 4096);
            } else {
                arg2.method2552(-31, 2048);
            }
        } else if (var10 < var12) {
            arg2.method2552(arg1 + 30, 8192);
        } else if (var12 < var10) {
            arg2.method2552(-117, 0);
        }
        byte var13 = arg2.field6265[arg2.field6269 - 1];
        if (!arg0 && (var11 - var9) > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024) {
            arg2.field3024 = var11;
            arg2.field3029 = var12;
            arg2.method2554(arg2.field6205, (byte) 85, false);
            class132.field1954 = -1;
            class369.field5276 = 0;
            arg2.field6269--;
            if (arg2.field6268 > 0) {
                arg2.field6268--;
            }
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg2 instanceof class577) {
            var15 = ((class577) arg2).field8121.field8321;
        }
        if (var15) {
            int var16 = arg2.field6205 - arg2.field6209.field7276;
            if (var16 != 0 && arg2.field6171 == -1 && arg2.field6195 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg2.field6269 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg2.field6269 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg2.field6269 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg2.field6269 > 2) {
                var14 = 32;
            }
        }
        if (arg2.field6264 > 0 && arg2.field6269 > 1) {
            arg2.field6264--;
            var14 = 32;
        }
        if (arg1 != -66) {
            method3684(63);
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class369.field5276 = 0;
        if (var3.field1417 != -1) {
            int var17 = var14 << 9;
            if (arg2.field6269 == 1) {
                int var18 = arg2.field6267 * arg2.field6267;
                int var19 = (arg2.field3024 <= var11 ? var11 - arg2.field3024 : -var11 + arg2.field3024) << 9;
                int var20 = (arg2.field3029 <= var12 ? var12 - arg2.field3029 : arg2.field3029 - var12) << 9;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field1417 * 2 * var21;
                if (var18 > var22) {
                    arg2.field6267 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg2.field6267 -= var3.field1417;
                    if (arg2.field6267 < 0) {
                        arg2.field6267 = 0;
                    }
                } else if (arg2.field6267 < var17) {
                    arg2.field6267 += var3.field1417;
                    if (var17 < arg2.field6267) {
                        arg2.field6267 = var17;
                    }
                }
            } else if (var17 > arg2.field6267) {
                arg2.field6267 += var3.field1417;
                if (var17 < arg2.field6267) {
                    arg2.field6267 = var17;
                }
            } else if (arg2.field6267 > 0) {
                arg2.field6267 -= var3.field1417;
                if (arg2.field6267 < 0) {
                    arg2.field6267 = 0;
                }
            }
            var14 = arg2.field6267 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class132.field1954 = -1;
        } else {
            if (var11 > var9) {
                arg2.field3024 += var14;
                class369.field5276 |= 0x4;
                if (arg2.field3024 > var11) {
                    arg2.field3024 = var11;
                }
            } else if (var9 > var11) {
                class369.field5276 |= 0x8;
                arg2.field3024 -= var14;
                if (arg2.field3024 < var11) {
                    arg2.field3024 = var11;
                }
            }
            if (var12 > var10) {
                class369.field5276 |= 0x1;
                arg2.field3029 += var14;
                if (var12 < arg2.field3029) {
                    arg2.field3029 = var12;
                }
            } else if (var10 > var12) {
                class369.field5276 |= 0x2;
                arg2.field3029 -= var14;
                if (var12 > arg2.field3029) {
                    arg2.field3029 = var12;
                }
            }
            if (var14 < 32) {
                class132.field1954 = var13;
            } else {
                class132.field1954 = 2;
            }
        }
        if (arg2.field3024 != var11 || arg2.field3029 != var12) {
            return;
        }
        arg2.field6269--;
        if (arg2.field6268 > 0) {
            arg2.field6268--;
            return;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIIIIII)V", line = 399)
    public static final void method3683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9395++;
        int var8 = arg6 - arg0;
        int var9 = arg0 + arg2;
        for (int var10 = arg2; var10 < var9; var10++) {
            class58.method623(arg4, arg3, 23309, class651.field9125[var10], arg7);
        }
        int var11 = -54 / ((arg1 - 32) / 39);
        int var12 = arg7 + arg0;
        int var13 = arg3 - arg0;
        for (int var14 = arg6; var14 > var8; var14--) {
            class58.method623(arg4, arg3, 23309, class651.field9125[var14], arg7);
        }
        for (int var15 = var9; var15 <= var8; var15++) {
            int[] var16 = class651.field9125[var15];
            class58.method623(arg4, var12, 23309, var16, arg7);
            class58.method623(arg5, var13, 23309, var16, var12);
            class58.method623(arg4, arg3, 23309, var16, var13);
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V", line = 444)
    public static final void method3684(int arg0) {
        field9398++;
        class514.method2941(false);
        class523.field7392.field9761 = 0;
        class139.field2017 = null;
        class418.field6098 = 0;
        class500.field7082 = 0;
        class312.field4616 = null;
        class550.field7778 = null;
        class164.field2361 = null;
        class593.field8378 = 0;
        class603.method3402((byte) -94);
        class548.method3099((byte) -44);
        for (int var1 = 0; var1 < 2048; var1++) {
            class141.field2087[var1] = null;
        }
        class648.field9106 = null;
        for (int var2 = 0; var2 < class428.field6288; var2++) {
            class577 var4 = class261.field3968[var2].field174;
            if (var4 != null) {
                var4.field6171 = -1;
            }
        }
        class338.method2128(1);
        field9399 = -1;
        class563.field7927 = -1;
        class43.field700 = 1;
        class112.method868(10, (byte) 67);
        if (arg0 <= 54) {
            return;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            class508.field7177[var3] = true;
        }
        method3679(false);
        class542.field7610 = 0L;
        class303.field4517 = null;
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V", line = 501)
    public static final void method3685(int arg0) {
        field9390++;
        class19.field213.method475(6);
        int var1 = 9 / ((75 - arg0) / 39);
        class597.field8434.method475(6);
        for (class279 var2 = (class279) class663.field9367.method472((byte) -127); var2 != null; var2 = (class279) class663.field9367.method482(-27)) {
            int var19 = var2.field4213;
            if (var19 < 1000) {
                var2.method3678(-1);
                if (var19 == 10 || var19 == 6 || var19 == 25 || var19 == 3 || var19 == 59 || var19 == 22 || var19 == 21) {
                    class597.field8434.method474(var2, 6);
                } else {
                    class19.field213.method474(var2, 6);
                }
            }
        }
        class19.field213.method478(class663.field9367, -51);
        class597.field8434.method478(class663.field9367, -90);
        if (class340.field5002 <= 1) {
            class305.field4531 = null;
        } else if (class671.field9479 && class603.field8514.method1364(true, 81) && class340.field5002 > 2) {
            class305.field4531 = (class279) class663.field9367.field716.field9384.field9384;
        } else {
            class305.field4531 = (class279) class663.field9367.field716.field9384;
        }
        int var3 = -1;
        class356 var4 = (class356) class691.field9713.method472((byte) -109);
        if (var4 != null) {
            var3 = var4.method1030(126);
        }
        if (!class623.field8731) {
            if (var3 == 0 && (class330.field4877 == 1 && class340.field5002 > 2 || class111.method863((byte) 127))) {
                var3 = 2;
            }
            if (var3 == 2 && class340.field5002 > 0 && var4 != null) {
                if (class648.field9107 == null && class83.field1375 == 0) {
                    class622.method3458((byte) -127, var4.method1031((byte) 109), var4.method1032((byte) 15));
                } else {
                    class683.field9630 = 2;
                }
            }
            if (var3 == 0 && class340.field5002 > 0) {
                class410.method2477((byte) -111);
            }
            if (class648.field9107 == null && class83.field1375 == 0) {
                class683.field9630 = 0;
                class75.field1309 = null;
                return;
            }
            return;
        }
        if (var3 == -1) {
            int var5 = class508.field7171.method2090(-7249);
            int var6 = class508.field7171.method2093(22302);
            if (class352.field5079 - 10 > var5 || var5 > class70.field1246 + class352.field5079 + 10 || class101.field1573 - 10 > var6 || var6 > (class101.field1573 + class450.field6490 + 10)) {
                class569.method3243(23509);
            }
        }
        if (var3 != 0) {
            return;
        }
        int var7 = class352.field5079;
        int var8 = class101.field1573;
        int var9 = class70.field1246;
        int var10 = var4.method1031((byte) 104);
        int var11 = var4.method1032((byte) 15);
        int var12 = -1;
        for (int var13 = 0; var13 < class340.field5002; var13++) {
            if (class566.field7979) {
                int var18 = var8 - (-(class340.field5002 - var13 - 1) * 16 - 33);
                if (var10 > var7 && (var7 + var9) > var10 && (var18 - 13) < var11 && var11 < var18 + 4) {
                    var12 = var13;
                }
            } else {
                int var17 = var8 + ((class340.field5002 + -1 + -var13) * 16) + 31;
                if (var7 < var10 && (var7 + var9) > var10 && var17 - 13 < var11 && (var17 + 3) > var11) {
                    var12 = var13;
                }
            }
        }
        if (var12 != -1) {
            int var14 = 0;
            class177 var15 = new class177(class663.field9367);
            for (class279 var16 = (class279) var15.method1202(6); var16 != null; var16 = (class279) var15.method1204(0)) {
                if (var12 == var14) {
                    class224.method1481(var16, var11, var10, false);
                }
                var14++;
            }
        }
        class569.method3243(23509);
    }

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(I)Lpca;", line = 670)
    public final class665 method3686(int arg0) {
        field9393++;
        if (this.field9396 > 0 && this.field9394.field2961[this.field9396 - 1] != this.field9392) {
            class665 var2 = this.field9392;
            this.field9392 = var2.field9382;
            return var2;
        }
        while (this.field9396 < this.field9394.field2967) {
            class665 var3 = this.field9394.field2961[this.field9396++].field9382;
            if (this.field9394.field2961[this.field9396 - 1] != var3) {
                this.field9392 = var3.field9382;
                return var3;
            }
        }
        return arg0 == 16431 ? null : null;
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(Z)V", line = 703)
    public static void method3687(boolean arg0) {
        field9403 = null;
        if (!arg0) {
            method3679(true);
        }
        field9400 = null;
        field9402 = null;
        field9407 = null;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V", line = 725)
    public class666() {
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lkea;)V", line = 727)
    public class666(class213 arg0) {
        this.field9394 = arg0;
    }
}
