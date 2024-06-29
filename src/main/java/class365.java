import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class365 {

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    private int field5291 = 0;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "Z")
    private boolean field5301 = false;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
    private int field5307 = -1;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "Z")
    private boolean field5313 = false;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "Z")
    private boolean field5287 = false;

    @OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
    private int field5317 = 0;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "B")
    private byte field5316;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "Lrfa;")
    private class202 field5294;

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "B")
    private byte field5314;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Z")
    private boolean field5311;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Lqu;")
    private class84 field5286;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field5320 = new String[] { method2914(method2913("n7F9-m#\u00046>fj")), method2914(method2913("xlFq9")), method2914(method2913("n7F\u0012l")), method2914(method2913("m7\u00043")), method2914(method2913("n7F\u0016l")), method2914(method2913("n7F\u001cl")), method2914(method2913("n7F\u0015l")), method2914(method2913("n7Fc-m+\u001cal")), method2914(method2913("n7F\u0013l")), method2914(method2913("M-\u0006\u007f'ssZjv#!\u0000>6b!\u001c:6#r\u0010")), method2914(method2913("n7F\u0018l")), method2914(method2913("#2\u001a02j&\r;")), method2914(method2913("n7F\u001el")), method2914(method2913("n7F\u001al")), method2914(method2913("n7F\u001bl")), method2914(method2913("n7F\u0014l")), method2914(method2913("n7F\u001dl")), method2914(method2913("n7F\u0017l")), method2914(method2913("n7F\u0019l")) };

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    private int field5295;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Lr;")
    private class412 field5298;

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "Lit;")
    public class464 field5312;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Lo;")
    public static class484 field5292;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "Lao;")
    private class626 field5309;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "Lka;")
    private class761 field5306;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "[Z")
    private boolean[] field5308;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILao;)V")
    public final void method2900(int arg0, class626 arg1) {
        try {
            this.field5306 = null;
            if (arg0 < -104) {
                this.field5309 = arg1;
                field5315++;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5320[2] + arg0 + ',' + (arg1 == null ? field5320[3] : field5320[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BB)C")
    public static final char method2901(byte arg0, byte arg1) {
        try {
            if (arg0 <= 86) {
                method2912(78);
            }
            field5303++;
            int var2 = arg1 & 0xFF;
            if (var2 == 0) {
                throw new IllegalArgumentException(field5320[9] + Integer.toString(var2, 16) + field5320[11]);
            }
            if (var2 >= 128 && var2 < 160) {
                char var3 = class615.field8785[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5320[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)Z")
    public final boolean method2902(byte arg0) {
        try {
            if (arg0 != 86) {
                this.method2903(69, null, true, false, (byte) 29);
            }
            field5288++;
            return this.field5311;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5320[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILha;ZZB)Lka;")
    public final class761 method2903(int arg0, class18 arg1, boolean arg2, boolean arg3, byte arg4) {
        try {
            field5296++;
            class789 var6 = class101.field1359.method2832(120, this.field5310);
            if (var6.field11465 != null) {
                var6 = var6.method5688(65, class734.field10459);
            }
            if (var6 == null) {
                this.method2908(4, arg1);
                this.field5307 = -1;
                return null;
            }
            if (!this.field5287 && this.field5307 != var6.field11478) {
                this.method2906(0, 1, true, -1);
                this.field5306 = null;
                this.field5301 = false;
            }
            this.method2910((byte) -91, this.field5294);
            if (arg3) {
                arg3 &= !this.field5301 & this.field5311 & class451.field6612.field9113.method1072(3) != 0;
            }
            if (arg2 && !arg3) {
                this.field5307 = var6.field11478;
                return null;
            }
            if (arg3) {
                class779.method5602(this.field5298, this.field5314, this.field5294.field2969, this.field5294.field2984, this.field5308);
                this.field5301 = false;
            }
            class751 var7 = class107.field1413[this.field5314];
            class751 var8;
            if (this.field5313) {
                var8 = class213.field3124[0];
            } else {
                var8 = this.field5314 >= 3 ? null : class107.field1413[this.field5314 + 1];
            }
            if (arg4 >= -52) {
                this.field5317 = -24;
            }
            class761 var9 = null;
            if (this.field5286.method835(false)) {
                if (arg3) {
                    arg0 |= 0x40000;
                }
                var9 = var6.method5681(this.field5294.field2969, 3, this.field5318 == 11 ? 10 : this.field5318, var7.method5440((byte) 15, this.field5294.field2969, this.field5294.field2984), arg1, this.field5294.field2984, this.field5318 == 11 ? this.field5290 + 4 : this.field5290, this.field5309, arg0, var7, this.field5286, var8);
                if (var9 == null) {
                    this.field5308 = null;
                    this.field5298 = null;
                    this.field5317 = 0;
                    this.field5291 = 0;
                } else {
                    if (arg3) {
                        if (this.field5308 == null) {
                            this.field5308 = new boolean[4];
                        }
                        this.field5298 = var9.method406(this.field5298);
                        class164.method1396(this.field5298, this.field5314, this.field5294.field2969, this.field5294.field2984, this.field5308);
                        this.field5301 = true;
                    }
                    this.field5291 = var9.method432();
                    this.field5317 = var9.method423();
                }
                this.field5306 = null;
            } else if (this.field5306 != null && arg0 == (arg0 & this.field5306.method395()) && this.field5307 == var6.field11478) {
                var9 = this.field5306;
            } else {
                if (this.field5306 != null) {
                    arg0 |= this.field5306.method395();
                }
                class795 var10 = var6.method5692(this.field5318 == 11 ? 10 : this.field5318, arg1, arg3, var7, this.field5318 == 11 ? this.field5290 + 4 : this.field5290, -27447, this.field5294.field2969, this.field5309, var7.method5440((byte) 15, this.field5294.field2969, this.field5294.field2984), var8, this.field5294.field2984, arg0);
                if (var10 == null) {
                    this.field5306 = null;
                    this.field5317 = 0;
                    this.field5308 = null;
                    this.field5291 = 0;
                    this.field5298 = null;
                } else {
                    var9 = var10.field11559;
                    this.field5306 = var10.field11559;
                    if (arg3) {
                        this.field5308 = null;
                        this.field5298 = var10.field11564;
                        class164.method1396(this.field5298, this.field5314, this.field5294.field2969, this.field5294.field2984, null);
                        this.field5301 = true;
                    }
                    this.field5291 = var9.method432();
                    this.field5317 = var9.method423();
                }
            }
            this.field5307 = var6.field11478;
            return var9;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field5320[8] + arg0 + ',' + (arg1 == null ? field5320[3] : field5320[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)V")
    public final void method2904(boolean arg0, int arg1) {
        try {
            this.field5287 = true;
            field5289++;
            this.method2906(1, 1, arg0, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5320[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
    public final int method2905(int arg0) {
        try {
            field5299++;
            if (arg0 <= 92) {
                this.method2907(-1, null);
            }
            return this.field5317;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5320[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIZI)V")
    private final void method2906(int arg0, int arg1, boolean arg2, int arg3) {
        try {
            field5293++;
            int var5 = arg3;
            if (arg1 != 1) {
                this.field5307 = 71;
            }
            boolean var6 = false;
            if (arg3 == -1) {
                class789 var7 = class101.field1359.method2832(127, this.field5310);
                class789 var8 = var7;
                if (var7.field11465 != null) {
                    var7 = var7.method5688(-112, class734.field10459);
                }
                if (var7 == null) {
                    return;
                }
                if (var7 == var8) {
                    var8 = null;
                }
                if (var7.method5691(-99)) {
                    if (arg2 && this.field5286.method835(false) && var7.method5694(this.field5286.method837(112), -124)) {
                        return;
                    }
                    if (this.field5307 != var7.field11478) {
                        var6 = var7.field11447;
                    }
                    var5 = var7.method5678((byte) -125);
                    if (var7.method5684((byte) -108)) {
                        arg0 = 0;
                    } else {
                        arg0 = 1;
                    }
                } else if (var8 != null && var8.method5691(-103)) {
                    if (arg2 && this.field5286.method835(false) && var8.method5694(this.field5286.method837(arg1 ^ 0x72), arg1 - 119)) {
                        return;
                    }
                    if (this.field5307 != var7.field11478) {
                        var6 = var8.field11447;
                    }
                    var5 = var8.method5678((byte) -97);
                    if (var8.method5684((byte) -100)) {
                        arg0 = 0;
                    } else {
                        arg0 = 1;
                    }
                }
            }
            if (var5 == -1) {
                this.field5286.method845(arg1 + 126, -1, false);
            } else {
                this.field5286.method847(var5, arg0, var6, 0, (byte) -19);
                this.field5301 = false;
                this.field5295 = class694.field9700;
                this.field5306 = null;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field5320[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(ILha;)V")
    public final void method2907(int arg0, class18 arg1) {
        try {
            this.method2903(arg0, arg1, true, true, (byte) -118);
            field5297++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5320[15] + arg0 + ',' + (arg1 == null ? field5320[3] : field5320[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILha;)V")
    public final void method2908(int arg0, class18 arg1) {
        try {
            field5305++;
            if (this.field5298 != null) {
                class779.method5602(this.field5298, this.field5314, this.field5294.field2969, this.field5294.field2984, this.field5308);
                this.field5308 = null;
                this.field5298 = null;
            }
            if (arg0 != 4) {
                this.field5294 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5320[5] + arg0 + ',' + (arg1 == null ? field5320[3] : field5320[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILka;IIILha;ZILqa;)V")
    public final void method2909(int arg0, class761 arg1, int arg2, int arg3, int arg4, class18 arg5, boolean arg6, int arg7, class104 arg8) {
        try {
            field5300++;
            class510[] var10 = arg1.method426();
            class264[] var11 = arg1.method413();
            if ((this.field5312 == null || this.field5312.field6762) && (var10 != null || var11 != null)) {
                class789 var12 = class101.field1359.method2832(126, this.field5310);
                if (var12.field11465 != null) {
                    var12 = var12.method5688(-96, class734.field10459);
                }
                if (var12 != null) {
                    this.field5312 = class464.method3574(class694.field9700, true);
                }
            }
            if (this.field5312 != null) {
                arg1.method402(arg8);
                if (arg6) {
                    this.field5312.method3569(arg5, (long) class694.field9700, var10, var11, false);
                } else {
                    this.field5312.method3567((long) class694.field9700);
                }
                this.field5312.method3568(this.field5316, arg3, arg0, arg7, arg4);
            }
            if (arg2 != 0) {
                this.field5311 = true;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field5320[6] + arg0 + ',' + (arg1 == null ? field5320[3] : field5320[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field5320[3] : field5320[1]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field5320[3] : field5320[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLrfa;)V")
    private final void method2910(byte arg0, class202 arg1) {
        try {
            field5319++;
            if (!this.field5286.method835(false)) {
                this.method2906(0, 1, false, -1);
            } else if (this.field5286.method844(class694.field9700 - this.field5295, 57)) {
                if (class451.field6612.field9113.method1072(arg0 ^ 0xFFFFFFA6) == 2) {
                    this.field5301 = false;
                }
                if (this.field5286.method843((byte) -128)) {
                    this.field5286.method840(-1, false);
                    this.field5287 = false;
                    this.method2906(0, 1, false, -1);
                }
            }
            if (arg0 == -91) {
                this.field5295 = class694.field9700;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5320[16] + arg0 + ',' + (arg1 == null ? field5320[3] : field5320[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)I")
    public final int method2911(int arg0) {
        try {
            field5304++;
            int var2 = 111 % ((45 - arg0) / 44);
            return this.field5291;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5320[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
    public static void method2912(int arg0) {
        try {
            if (arg0 != 0) {
                field5292 = null;
            }
            field5292 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5320[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        try {
            field5302++;
            if (this.field5312 != null) {
                this.field5312.method3564();
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5320[0] + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lha;Lfw;IIIILrfa;ZI)V")
    public class365(class18 arg0, class789 arg1, int arg2, int arg3, int arg4, int arg5, class202 arg6, boolean arg7, int arg8) {
        try {
            this.field5310 = arg1.field11478;
            this.field5290 = arg3;
            this.field5287 = arg8 != -1;
            this.field5313 = arg7;
            this.field5316 = (byte) arg4;
            this.field5294 = arg6;
            this.field5314 = (byte) arg5;
            this.field5318 = arg2;
            this.field5311 = arg0.method158() && arg1.field11415 && !this.field5313;
            this.field5286 = new class689(arg6, false);
            this.method2906(1, 1, false, arg8);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5320[7] + (arg0 == null ? field5320[3] : field5320[1]) + ',' + (arg1 == null ? field5320[3] : field5320[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field5320[3] : field5320[1]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2913(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2914(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 95;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
