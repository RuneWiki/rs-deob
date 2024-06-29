import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class625 {

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lqr;")
    private class69 field9005 = new class69(256);

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lqr;")
    private class69 field9014 = new class69(256);

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lgda;")
    private class58 field9007;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lgda;")
    private class58 field9009;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9016 = new String[] { method4567(method4566("`\u0003pgn")), method4567(method4566("e\u00132H")), method4567(method4566("pHp\n;")), method4567(method4566("`\u0003pcn")), method4567(method4566("`\u0003pbn")), method4567(method4566("`\u0003pan")), method4567(method4566("`\u0003pen")), method4567(method4566("`\u0003pln")), method4567(method4566("`\u0003p\u0018/e\u000f*\u001an")), method4567(method4566("`\u0003pfn")), method4567(method4566("`\u0003p`n")) };

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Ljava/lang/String;")
    public static String field9015 = null;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lk;")
    public static class592 field9004;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[II)Ljg;")
    public final class357 method4558(byte arg0, int[] arg1, int arg2) {
        try {
            field9011++;
            if (this.field9007.method600(1) == 1) {
                return this.method4562((byte) -103, arg1, 0, arg2);
            } else if (this.field9007.method580(arg0 ^ 0x6D, arg2) == 1) {
                return this.method4562((byte) 100, arg1, arg2, 0);
            } else {
                if (arg0 != 45) {
                    method4563(-0.39769714572306725D, 7);
                }
                throw new RuntimeException();
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9016[5] + arg0 + ',' + (arg1 == null ? field9016[1] : field9016[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([III)Ljg;")
    public final class357 method4559(int[] arg0, int arg1, int arg2) {
        try {
            field9003++;
            if (this.field9009.method600(1) == 1) {
                return this.method4564(2, arg0, 0, arg1);
            } else if (this.field9009.method580(94, arg1) == 1) {
                return this.method4564(2, arg0, arg1, 0);
            } else {
                int var4 = 47 / ((arg2 - 47) / 43);
                throw new RuntimeException();
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9016[3] + (arg0 == null ? field9016[1] : field9016[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZIII)V")
    public static final void method4560(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg0 < 1) {
                arg0 = 1;
            }
            field9013++;
            if (arg4 < 1) {
                arg4 = 1;
            }
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class172.field2752 - class316.field5144) * var6 / arg1 + class316.field5144;
            if (var7 < class313.field5121) {
                var7 = class313.field5121;
            } else if (class761.field11183 < var7) {
                var7 = class761.field11183;
            }
            int var8 = arg4 * var7 * 512 / (arg0 * 334);
            if (var8 < class400.field6322) {
                short var9 = class400.field6322;
                var7 = arg0 * var9 * 334 / (arg4 * 512);
                if (class761.field11183 < var7) {
                    var7 = class761.field11183;
                    int var10 = arg4 * var7 * 512 / (var9 * 334);
                    int var11 = (arg0 - var10) / 2;
                    if (arg2) {
                        class662.field9437.method227();
                        class662.field9437.method664(arg3, -16777216, var11, arg5, arg4, true);
                        class662.field9437.method664(arg3, -16777216, var11, arg5 + arg0 - var11, arg4, true);
                    }
                    arg5 += var11;
                    arg0 -= var11 * 2;
                }
            } else if (class702.field10084 < var8) {
                short var12 = class702.field10084;
                var7 = arg0 * 334 * var12 / (arg4 * 512);
                if (var7 < class313.field5121) {
                    var7 = class313.field5121;
                    int var13 = arg0 * var12 * 334 / (var7 * 512);
                    int var14 = (arg4 - var13) / 2;
                    if (arg2) {
                        class662.field9437.method227();
                        class662.field9437.method664(arg3, -16777216, arg0, arg5, var14, true);
                        class662.field9437.method664(arg4 + arg3 - var14, -16777216, arg0, arg5, var14, true);
                    }
                    arg3 += var14;
                    arg4 -= var14 * 2;
                }
            }
            class129.field1845 = arg4 * var7 / 334;
            class340.field5549 = arg5;
            class361.field5823 = (short) arg0;
            class624.field8999 = arg3;
            class672.field9542 = (short) arg4;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field9016[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method4561(int arg0) {
        try {
            field9015 = null;
            if (arg0 != 1) {
                field9015 = null;
            }
            field9004 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9016[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[III)Ljg;")
    private final class357 method4562(byte arg0, int[] arg1, int arg2, int arg3) {
        try {
            field9010++;
            int var5 = ((arg2 & 0x40000FFF) << 4 | arg2 >>> 12) ^ arg3;
            int var6 = var5 | arg2 << 16;
            long var7 = (long) var6;
            class357 var9 = (class357) this.field9014.method737((byte) -39, var7);
            if (var9 != null) {
                return var9;
            } else if (arg1 == null || arg1[0] > 0) {
                class602 var10 = class602.method4411(this.field9007, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                class357 var11 = var10.method4410();
                this.field9014.method738(var11, var7, -12002);
                if (arg1 != null) {
                    arg1[0] -= var11.field5739.length;
                }
                int var12 = -4 / ((-arg0 - 3) / 61);
                return var11;
            } else {
                return null;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field9016[7] + arg0 + ',' + (arg1 == null ? field9016[1] : field9016[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(DI)V")
    public static final void method4563(double arg0, int arg1) {
        try {
            class135.field1910.method2461(class102.field1499);
            field9008++;
            class135.field1910.method2480(0, 0, (int) arg0);
            if (arg1 > -71) {
                method4560(-117, -33, false, -76, 93, -114);
            }
            class761.field11182.method254(class135.field1910);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9016[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[III)Ljg;")
    private final class357 method4564(int arg0, int[] arg1, int arg2, int arg3) {
        try {
            field9006++;
            if (arg0 != 2) {
                this.field9014 = null;
            }
            int var5 = arg3 ^ (arg2 >>> 12 | (arg2 & 0xF0000FFF) << 4);
            int var6 = var5 | arg2 << 16;
            long var7 = (long) var6 ^ 0x100000000L;
            class357 var9 = (class357) this.field9014.method737((byte) -39, var7);
            if (var9 != null) {
                return var9;
            } else if (arg1 == null || arg1[0] > 0) {
                class306 var10 = (class306) this.field9005.method737((byte) -39, var7);
                if (var10 == null) {
                    var10 = class306.method2630(this.field9009, arg2, arg3);
                    if (var10 == null) {
                        return null;
                    }
                    this.field9005.method738(var10, var7, -12002);
                }
                class357 var11 = var10.method2631(arg1);
                if (var11 == null) {
                    return null;
                } else {
                    var10.method4173(-1);
                    this.field9014.method738(var11, var7, -12002);
                    return var11;
                }
            } else {
                return null;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field9016[9] + arg0 + ',' + (arg1 == null ? field9016[1] : field9016[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
    public static final boolean method4565(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == 22206) {
                field9012++;
                return false;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9016[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lgda;Lgda;)V")
    public class625(class58 arg0, class58 arg1) {
        try {
            this.field9007 = arg0;
            this.field9009 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9016[8] + (arg0 == null ? field9016[1] : field9016[2]) + ',' + (arg1 == null ? field9016[1] : field9016[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4566(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4567(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
