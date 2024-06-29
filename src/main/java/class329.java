import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class329 implements Runnable {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[Lwm;")
    public volatile class440[] field4497 = new class440[2];

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Z")
    public volatile boolean field4490 = false;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Z")
    public volatile boolean field4495 = false;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4499 = new String[] { method2589(method2588("SFH*=")), method2589(method2588("SFH\u0019`Q\f")), method2589(method2588("SFH)=")), method2589(method2588("UE\u0010\n;SE\b\f;lP\u0014\u0002{X")), method2589(method2588("QQ\n\u0007")), method2589(method2588("wA\u0007\u001bQJI\u0016KpMV\t\u0019/")), method2589(method2588("\\K\u000bEfJJH\u0006tQE\u0001\u000exZJ\u0012E]PP5\u001bzK`\u000f\nrQK\u0015\u001f|\\i>)p^J")), method2589(method2588("SFH(=")), method2589(method2588("D\nHEh")), method2589(method2588("[Q\u000b\u001b]ZE\u0016")) };

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "J")
    public static long field4492;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lft;")
    public class188 field4493;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field4498;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2587(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method2584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (class335.field4844 <= arg1 && class507.field7453 >= arg3 && class557.field8113 <= arg6 && class50.field717 >= arg2) {
                if (arg4 == 1) {
                    class577.method4288(arg1, arg3, arg5, arg2, (byte) 84, arg6);
                } else {
                    class336.method2702(arg2, arg4, arg6, (byte) -121, arg5, arg3, arg1);
                }
            } else if (arg4 == 1) {
                class616.method4541(arg1, arg3, arg5, 3, arg6, arg2);
            } else {
                class211.method1782(arg3, arg2, arg4, 258, arg6, arg1, arg5);
            }
            int var7 = 122 / ((31 - arg0) / 44);
            field4496++;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4499[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V", line = 39)
    public final void run() {
        try {
            this.field4495 = true;
            field4494++;
            try {
                while (!this.field4490) {
                    for (int var1 = 0; var1 < 2; var1++) {
                        class440 var2 = this.field4497[var1];
                        if (var2 != null) {
                            var2.method3423(94);
                        }
                    }
                    class449.method3474(20817, 10L);
                    class320.method2535(null, this.field4493, 256);
                }
            } catch (Exception var11) {
                class162.method1374(var11, null, (byte) -93);
            } finally {
                Object var7 = null;
                this.field4495 = false;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4499[1] + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 77)
    public static final void method2585(int arg0) {
        try {
            if (class179.field2331 > 1) {
                class179.field2331--;
                class190.field2522 = class522.field7612;
            }
            field4489++;
            if (class60.field916.field11101) {
                class60.field916.field11101 = false;
                class177.method1482(-14523);
            } else {
                if (!class86.field1217) {
                    class161.method1360(arg0 - 239);
                }
                for (int var1 = 0; var1 < 100 && class263.method2175(class60.field916, -108); var1++) {
                }
                if (class559.field8139 == 11) {
                    while (class47.method527(arg0)) {
                        class274 var2 = class375.method2969((byte) 1, class301.field4186, class60.field916.field11100);
                        var2.field3885.method5114(255, 0);
                        int var3 = var2.field3885.field9945;
                        class595.method4388(true, var2.field3885);
                        var2.field3885.method5097(var2.field3885.field9945 - var3, 255);
                        class60.field916.method5608(var2, 29867);
                    }
                    if (class299.field4174 == null) {
                        if (class558.field8118 <= class614.method4531(-85)) {
                            class299.field4174 = class703.field9829.method4192((byte) -125, class467.field6812.field11516);
                        }
                    } else if (class299.field4174.field7709 != -1) {
                        class274 var4 = class375.method2969((byte) 1, class603.field8653, class60.field916.field11100);
                        var4.field3885.method5138((byte) -98, class299.field4174.field7709);
                        class60.field916.method5608(var4, 29867);
                        class299.field4174 = null;
                        class558.field8118 = class614.method4531(-125) + 30000L;
                    }
                    class682 var5 = (class682) class530.field7694.method3977((byte) -33);
                    if (var5 != null || (class614.method4531(-78) - 2000L) > class164.field2117) {
                        class274 var6 = null;
                        int var7 = 0;
                        for (class682 var8 = (class682) class263.field3713.method3977((byte) -37); var8 != null && (var6 == null || var6.field3885.field9945 - var7 < 240); var8 = (class682) class263.field3713.method3987(arg0 - 127)) {
                            var8.method4294(0);
                            int var9 = var8.method1088(arg0 ^ 0xFFFFFF85);
                            if (var9 < -1) {
                                var9 = -1;
                            } else if (var9 > 65534) {
                                var9 = 65534;
                            }
                            int var10 = var8.method1086((byte) -17);
                            if (var10 < -1) {
                                var10 = -1;
                            } else if (var10 > 65534) {
                                var10 = 65534;
                            }
                            if (class23.field272 != var10 || class472.field6916 != var9) {
                                if (var6 == null) {
                                    class135.field1748++;
                                    var6 = class375.method2969((byte) 1, class639.field9068, class60.field916.field11100);
                                    var6.field3885.method5114(255, 0);
                                    var7 = var6.field3885.field9945;
                                }
                                int var11 = var10 - class23.field272;
                                class23.field272 = var10;
                                int var12 = var9 - class472.field6916;
                                class472.field6916 = var9;
                                int var13 = (int) ((var8.method1085(-6709) - class164.field2117) / 20L);
                                if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    var6.field3885.method5138((byte) -96, (var11 << 6) + (var13 << 12) + var12);
                                } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                    var12 += 128;
                                    var11 += 128;
                                    var6.field3885.method5114(255, var13 + 128);
                                    var6.field3885.method5138((byte) -122, (var11 << 8) + var12);
                                } else if (var13 < 32) {
                                    var6.field3885.method5114(255, var13 + 192);
                                    if (var10 == 1 || var9 == -1) {
                                        var6.field3885.method5127(Integer.MIN_VALUE, arg0 + 25981);
                                    } else {
                                        var6.field3885.method5127(var10 | var9 << 16, 26108);
                                    }
                                } else {
                                    var6.field3885.method5138((byte) -104, var13 + 57344);
                                    if (var10 == 1 || var9 == -1) {
                                        var6.field3885.method5127(Integer.MIN_VALUE, arg0 ^ 0x6583);
                                    } else {
                                        var6.field3885.method5127(var9 << 16 | var10, 26108);
                                    }
                                }
                                class164.field2117 = var8.method1085(arg0 - 6836);
                            }
                        }
                        if (var6 != null) {
                            var6.field3885.method5097(var6.field3885.field9945 - var7, 255);
                            class60.field916.method5608(var6, 29867);
                        }
                    }
                    if (var5 != null) {
                        long var14 = (var5.method1085(-6709) - class111.field1444) / 50L;
                        class111.field1444 = var5.method1085(arg0 ^ 0xFFFFE5B4);
                        if (var14 > 32767L) {
                            var14 = 32767L;
                        }
                        int var16 = var5.method1088(-6);
                        if (var16 < 0) {
                            var16 = 0;
                        } else if (var16 > 65535) {
                            var16 = 65535;
                        }
                        int var17 = var5.method1086((byte) -50);
                        if (var17 < 0) {
                            var17 = 0;
                        } else if (var17 > 65535) {
                            var17 = 65535;
                        }
                        byte var18 = 0;
                        if (var5.method1084(128) == 2) {
                            var18 = 1;
                        }
                        int var19 = (int) var14;
                        class678.field9500++;
                        class274 var20 = class375.method2969((byte) 1, class607.field8701, class60.field916.field11100);
                        var20.field3885.method5118(var18 << 15 | var19, (byte) -113);
                        var20.field3885.method5127(var16 << 16 | var17, 26108);
                        class60.field916.method5608(var20, 29867);
                    }
                    if (class330.field4506 > 0) {
                        class235.field3391++;
                        class274 var21 = class375.method2969((byte) 1, class331.field4517, class60.field916.field11100);
                        var21.field3885.method5114(255, class330.field4506 * 3);
                        for (int var22 = 0; var22 < class330.field4506; var22++) {
                            class781 var23 = class551.field8047[var22];
                            long var24 = (var23.method3491(false) - class495.field7270) / 50L;
                            if (var24 > 65535L) {
                                var24 = 65535L;
                            }
                            class495.field7270 = var23.method3491(false);
                            var21.field3885.method5114(255, var23.method3485((byte) 98));
                            var21.field3885.method5138((byte) -99, (int) var24);
                        }
                        class60.field916.method5608(var21, arg0 ^ 0x74D4);
                    }
                    if (class367.field5332 > 0) {
                        class367.field5332--;
                    }
                    if (class669.field9440 && class367.field5332 <= 0) {
                        class674.field9464++;
                        class367.field5332 = 20;
                        class669.field9440 = false;
                        class274 var26 = class375.method2969((byte) 1, class231.field3339, class60.field916.field11100);
                        var26.field3885.method5138((byte) -107, (int) class607.field8706 >> 3);
                        var26.field3885.method5118((int) class349.field5057 >> 3, (byte) -77);
                        class60.field916.method5608(var26, 29867);
                    }
                    if (class785.field11339 != class257.field3676) {
                        class573.field8304++;
                        class785.field11339 = class257.field3676;
                        class274 var27 = class375.method2969((byte) 1, class104.field1372, class60.field916.field11100);
                        var27.field3885.method5114(255, class257.field3676 ? 1 : 0);
                        class60.field916.method5608(var27, 29867);
                    }
                    if (!class460.field6709) {
                        class642.field9148++;
                        class274 var28 = class375.method2969((byte) 1, class453.field6632, class60.field916.field11100);
                        var28.field3885.method5114(arg0 ^ 0x80, 0);
                        int var29 = var28.field3885.field9945;
                        class711 var30 = class451.field6612.method4685(-22);
                        var28.field3885.method5086(0, var30.field9996, var30.field9945, -2);
                        var28.field3885.method5097(var28.field3885.field9945 - var29, arg0 ^ 0x80);
                        class60.field916.method5608(var28, arg0 ^ 0x74D4);
                        class460.field6709 = true;
                    }
                    if (class608.field8715 != null) {
                        if (class596.field8579 == 2) {
                            class320.method2538(false);
                        } else if (class596.field8579 == 3) {
                            class738.method5354(-122);
                        }
                    }
                    if (class707.field9885) {
                        class707.field9885 = false;
                    } else {
                        class238.field3441 /= 2.0F;
                    }
                    if (class319.field4359) {
                        class319.field4359 = false;
                    } else {
                        class292.field4112 /= 2.0F;
                    }
                    class260.method2161((byte) 73);
                    if (class559.field8139 == 11) {
                        class162.method1383(-14816);
                        class716.method5196(arg0 ^ 0xFFFFB583);
                        class606.method4477((byte) 120);
                        class60.field916.field11106++;
                        if (class60.field916.field11106 > 750) {
                            class177.method1482(-14523);
                        } else {
                            class294.method2373((byte) -9);
                            class305.method2447(-64);
                            class35.method357(false);
                            for (int var31 = class734.field10459.method3770(28658, true); var31 != -1; var31 = class734.field10459.method3770(28658, false)) {
                                class291.method2358(true, var31);
                                class369.field5341[class434.method3377(class202.field2983++, 31)] = var31;
                            }
                            for (class294 var32 = class357.method2859(arg0 ^ 0x41); var32 != null; var32 = class357.method2859(arg0 ^ 0x27)) {
                                int var33 = var32.method2372(0);
                                long var34 = var32.method2371((byte) 10);
                                if (var33 == 1) {
                                    class247.field3527[(int) var34] = var32.field4133;
                                    class204.field2995 |= class290.field4098[(int) var34];
                                    class49.field709[class434.method3377(31, class686.field9619++)] = (int) var34;
                                } else if (var33 == 2) {
                                    class224.field3257[(int) var34] = var32.field4135;
                                    class18.field241[class434.method3377(31, class785.field11338++)] = (int) var34;
                                } else if (var33 == 3) {
                                    class782 var36 = class435.method3389((int) var34, (byte) -115);
                                    if (!var32.field4135.equals(var36.field11222)) {
                                        var36.field11222 = var32.field4135;
                                        class97.method959(var36, -1);
                                    }
                                } else if (var33 == 4) {
                                    class782 var37 = class435.method3389((int) var34, (byte) -118);
                                    int var38 = var32.field4133;
                                    int var39 = var32.field4136;
                                    int var40 = var32.field4140;
                                    if (var37.field11147 != var38 || var37.field11213 != var39 || var37.field11124 != var40) {
                                        var37.field11124 = var40;
                                        var37.field11147 = var38;
                                        var37.field11213 = var39;
                                        class97.method959(var37, -1);
                                    }
                                } else if (var33 == 5) {
                                    class782 var41 = class435.method3389((int) var34, (byte) -114);
                                    if (var32.field4133 != var41.field11294) {
                                        if (var32.field4133 == -1) {
                                            var41.field11183 = null;
                                        } else {
                                            if (var41.field11183 == null) {
                                                var41.field11183 = new class238();
                                            }
                                            var41.field11183.method840(var32.field4133, false);
                                        }
                                        var41.field11294 = var32.field4133;
                                        class97.method959(var41, -1);
                                    }
                                } else if (var33 == 6) {
                                    int var42 = var32.field4133;
                                    int var43 = var42 >> 10 & 0x1F;
                                    int var44 = var42 >> 5 & 0x1F;
                                    int var45 = var42 & 0x1F;
                                    int var46 = (var43 << 19) + (var44 << 11) + (var45 << 3);
                                    class782 var47 = class435.method3389((int) var34, (byte) -117);
                                    if (var47.field11192 != var46) {
                                        var47.field11192 = var46;
                                        class97.method959(var47, -1);
                                    }
                                } else if (var33 == 7) {
                                    class782 var61 = class435.method3389((int) var34, (byte) -123);
                                    boolean var62 = var32.field4133 == 1;
                                    if (var61.field11215 != var62) {
                                        var61.field11215 = var62;
                                        class97.method959(var61, -1);
                                    }
                                } else if (var33 == 8) {
                                    class782 var48 = class435.method3389((int) var34, (byte) -123);
                                    if (var32.field4133 != var48.field11181 || var32.field4136 != var48.field11266 || var32.field4140 != var48.field11203) {
                                        var48.field11203 = var32.field4140;
                                        var48.field11266 = var32.field4136;
                                        var48.field11181 = var32.field4133;
                                        if (var48.field11276 != -1) {
                                            if (var48.field11165 > 0) {
                                                var48.field11203 = var48.field11203 * 32 / var48.field11165;
                                            } else if (var48.field11167 > 0) {
                                                var48.field11203 = var48.field11203 * 32 / var48.field11167;
                                            }
                                        }
                                        class97.method959(var48, -1);
                                    }
                                } else if (var33 == 9) {
                                    class782 var49 = class435.method3389((int) var34, (byte) -117);
                                    if (var32.field4133 != var49.field11276 || var32.field4136 != var49.field11297) {
                                        var49.field11297 = var32.field4136;
                                        var49.field11276 = var32.field4133;
                                        class97.method959(var49, arg0 ^ 0xFFFFFF80);
                                    }
                                } else if (var33 == 10) {
                                    class782 var50 = class435.method3389((int) var34, (byte) -117);
                                    if (var32.field4133 != var50.field11236 || var32.field4136 != var50.field11199 || var32.field4140 != var50.field11239) {
                                        var50.field11239 = var32.field4140;
                                        var50.field11199 = var32.field4136;
                                        var50.field11236 = var32.field4133;
                                        class97.method959(var50, -1);
                                    }
                                } else if (var33 == 11) {
                                    class782 var51 = class435.method3389((int) var34, (byte) -121);
                                    var51.field11268 = 0;
                                    var51.field11288 = var51.field11251 = var32.field4133;
                                    var51.field11188 = 0;
                                    var51.field11218 = var51.field11264 = var32.field4136;
                                    class97.method959(var51, -1);
                                } else if (var33 == 12) {
                                    class782 var59 = class435.method3389((int) var34, (byte) -116);
                                    int var60 = var32.field4133;
                                    if (var59 != null && var59.field11291 == 0) {
                                        if (var60 > (var59.field11263 - var59.field11244)) {
                                            var60 = var59.field11263 - var59.field11244;
                                        }
                                        if (var60 < 0) {
                                            var60 = 0;
                                        }
                                        if (var59.field11262 != var60) {
                                            var59.field11262 = var60;
                                            class97.method959(var59, -1);
                                        }
                                    }
                                } else if (var33 == 14) {
                                    class782 var52 = class435.method3389((int) var34, (byte) -119);
                                    var52.field11235 = var32.field4133;
                                } else if (var33 == 15) {
                                    class346.field5032 = var32.field4136;
                                    class477.field7028 = var32.field4133;
                                    class369.field5344 = true;
                                } else if (var33 == 16) {
                                    class782 var53 = class435.method3389((int) var34, (byte) -122);
                                    var53.field11139 = var32.field4133;
                                } else if (var33 == 17) {
                                    class782 var58 = class435.method3389((int) var34, (byte) -114);
                                    var58.field11229 = var32.field4133;
                                } else if (var33 == 18) {
                                    class782 var54 = class435.method3389((int) var34, (byte) -120);
                                    int var55 = (int) (var34 >> 32);
                                    var54.method5637((short) var32.field4133, var55, arg0 ^ 0xFFFFFF85, (short) var32.field4136);
                                } else if (var33 == 19) {
                                    class782 var56 = class435.method3389((int) var34, (byte) -122);
                                    int var57 = (int) (var34 >> 32);
                                    var56.method5633(8, (short) var32.field4136, var57, (short) var32.field4133);
                                }
                            }
                            class393.field5721++;
                            if (class737.field10501 != 0) {
                                class544.field7953 += 20;
                                if (class544.field7953 >= 400) {
                                    class737.field10501 = 0;
                                }
                            }
                            if (class635.field9006 != null) {
                                class602.field8628++;
                                if (class602.field8628 >= 15) {
                                    class97.method959(class635.field9006, -1);
                                    class635.field9006 = null;
                                }
                            }
                            class226.field3277 = null;
                            class618.field8817 = false;
                            class260.field3694 = null;
                            class684.field9604 = false;
                            class298.method2391(null, -1, (byte) -86, -1);
                            class281.method2289(null, -1, -112, -1);
                            if (!class351.field5091) {
                                class670.field9445 = -1;
                            }
                            class472.method3637(106);
                            class522.field7612++;
                            if (class99.field1345) {
                                class213.field3128++;
                                class274 var63 = class375.method2969((byte) 1, class510.field7484, class60.field916.field11100);
                                var63.field3885.method5115(class653.field9274 << 14 | class229.field3320 << 28 | class731.field10445, 587134664);
                                class60.field916.method5608(var63, 29867);
                                class99.field1345 = false;
                            }
                            while (true) {
                                class618 var64;
                                class782 var65;
                                class782 var66;
                                do {
                                    var64 = (class618) class733.field10456.method3980(-27119);
                                    if (var64 == null) {
                                        while (true) {
                                            class618 var67;
                                            class782 var68;
                                            class782 var69;
                                            do {
                                                var67 = (class618) class129.field1605.method3980(-27119);
                                                if (var67 == null) {
                                                    while (true) {
                                                        class618 var70;
                                                        class782 var71;
                                                        class782 var72;
                                                        do {
                                                            var70 = (class618) class594.field8536.method3980(arg0 - 27246);
                                                            if (var70 == null) {
                                                                if (class226.field3277 == null) {
                                                                    class577.field8367 = 0;
                                                                }
                                                                if (class543.field7943 != null) {
                                                                    class723.method5231(arg0 ^ 0x7F);
                                                                }
                                                                if (class440.field6485 > 0 && class496.field7286.method2604(82, true) && class496.field7286.method2604(81, true) && class526.field7655 != 0) {
                                                                    int var73 = class203.field2988.field2981 - class526.field7655;
                                                                    if (var73 < 0) {
                                                                        var73 = 0;
                                                                    } else if (var73 > 3) {
                                                                        var73 = 3;
                                                                    }
                                                                    class708.method5070(var73, class203.field2988.field2252[0] + class537.field7895, arg0 ^ 0xFFFFFFE6, class203.field2988.field2256[0] + class655.field9286);
                                                                }
                                                                class504.method3855(73);
                                                                for (int var74 = 0; var74 < 5; var74++) {
                                                                    int var10002 = class312.field4290[var74]++;
                                                                }
                                                                if (class204.field2995 && class291.field4101 < (class614.method4531(arg0 - 162) - 60000L)) {
                                                                    class692.method4937(30908);
                                                                }
                                                                if (arg0 != 127) {
                                                                    return;
                                                                }
                                                                for (class129 var75 = (class129) class107.field1412.method3617(false); var75 != null; var75 = (class129) class107.field1412.method3612(arg0 ^ 0x7C)) {
                                                                    if ((class614.method4531(-31) / 1000L - 5L) > ((long) var75.field1603)) {
                                                                        if (var75.field1606 > 0) {
                                                                            class459.method3533("", (byte) 55, "", "", 0, var75.field1610 + class537.field7849.method4068((byte) -82, class405.field5883), 5);
                                                                        }
                                                                        if (var75.field1606 == 0) {
                                                                            class459.method3533("", (byte) 55, "", "", 0, var75.field1610 + class537.field7850.method4068((byte) -120, class405.field5883), 5);
                                                                        }
                                                                        var75.method4736(0);
                                                                    }
                                                                }
                                                                class447.field6567++;
                                                                if (class447.field6567 > 500) {
                                                                    class447.field6567 = 0;
                                                                    int var76 = (int) (Math.random() * 8.0D);
                                                                    if ((var76 & 0x1) == 1) {
                                                                        class113.field1462 += class289.field4089;
                                                                    }
                                                                    if ((var76 & 0x2) == 2) {
                                                                        class282.field3970 += class36.field464;
                                                                    }
                                                                    if ((var76 & 0x4) == 4) {
                                                                        class113.field1461 += class139.field1813;
                                                                    }
                                                                }
                                                                if (class113.field1462 < -50) {
                                                                    class289.field4089 = 2;
                                                                }
                                                                if (class282.field3970 < -55) {
                                                                    class36.field464 = 2;
                                                                }
                                                                if (class113.field1462 > 50) {
                                                                    class289.field4089 = -2;
                                                                }
                                                                if (class113.field1461 < -40) {
                                                                    class139.field1813 = 1;
                                                                }
                                                                if (class282.field3970 > 55) {
                                                                    class36.field464 = -2;
                                                                }
                                                                class349.field5065++;
                                                                if (class113.field1461 > 40) {
                                                                    class139.field1813 = -1;
                                                                }
                                                                if (class349.field5065 > 500) {
                                                                    class349.field5065 = 0;
                                                                    int var77 = (int) (Math.random() * 8.0D);
                                                                    if ((var77 & 0x2) == 2) {
                                                                        class398.field5794 += class52.field731;
                                                                    }
                                                                    if ((var77 & 0x1) == 1) {
                                                                        class801.field11658 += class678.field9527;
                                                                    }
                                                                }
                                                                if (class801.field11658 < -60) {
                                                                    class678.field9527 = 2;
                                                                }
                                                                if (class801.field11658 > 60) {
                                                                    class678.field9527 = -2;
                                                                }
                                                                if (class398.field5794 < -20) {
                                                                    class52.field731 = 1;
                                                                }
                                                                if (class398.field5794 > 10) {
                                                                    class52.field731 = -1;
                                                                }
                                                                class60.field916.field11107++;
                                                                if (class60.field916.field11107 > 50) {
                                                                    class38.field595++;
                                                                    class274 var78 = class375.method2969((byte) 1, class691.field9664, class60.field916.field11100);
                                                                    class60.field916.method5608(var78, 29867);
                                                                }
                                                                if (class408.field5907) {
                                                                    class646.method4705((byte) -97);
                                                                    class408.field5907 = false;
                                                                }
                                                                try {
                                                                    class60.field916.method5603(0);
                                                                    return;
                                                                } catch (IOException var80) {
                                                                    class177.method1482(arg0 - 14650);
                                                                    return;
                                                                }
                                                            }
                                                            var71 = var70.field8805;
                                                            if (var71.field11206 < 0) {
                                                                break;
                                                            }
                                                            var72 = class435.method3389(var71.field11136, (byte) -117);
                                                        } while (var72 == null || var72.field11148 == null || var72.field11148.length <= var71.field11206 || var72.field11148[var71.field11206] != var71);
                                                        class158.method1334(var70);
                                                    }
                                                }
                                                var68 = var67.field8805;
                                                if (var68.field11206 < 0) {
                                                    break;
                                                }
                                                var69 = class435.method3389(var68.field11136, (byte) -120);
                                            } while (var69 == null || var69.field11148 == null || var68.field11206 >= var69.field11148.length || var69.field11148[var68.field11206] != var68);
                                            class158.method1334(var67);
                                        }
                                    }
                                    var65 = var64.field8805;
                                    if (var65.field11206 < 0) {
                                        break;
                                    }
                                    var66 = class435.method3389(var65.field11136, (byte) -123);
                                } while (var66 == null || var66.field11148 == null || var65.field11206 >= var66.field11148.length || var66.field11148[var65.field11206] != var65);
                                class158.method1334(var64);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var81) {
            throw class665.method4799(var81, field4499[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BZLjava/io/File;)V", line = 981)
    public static final void method2586(byte arg0, boolean arg1, File arg2) {
        try {
            if (class218.field3185 == null) {
                class567.method4233(-127);
            }
            field4491++;
            try {
                Class var3 = Class.forName(field4499[6]);
                Method var4 = var3.getDeclaredMethod(field4499[9], field4498 == null ? (field4498 = method2587(field4499[3])) : field4498, Boolean.TYPE);
                var4.invoke(class218.field3185, arg2.getAbsolutePath(), Boolean.valueOf(arg1));
                if (arg0 >= -102) {
                    method2586((byte) -98, true, null);
                }
            } catch (Exception var7) {
                System.out.println(field4499[5]);
                var7.printStackTrace();
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4499[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4499[4] : field4499[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2588(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2589(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
