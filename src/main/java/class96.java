import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class96 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Z")
    private boolean field1394 = true;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    private int field1395 = -1;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "[Luja;")
    private class35[] field1409;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "[Luja;")
    private class35[] field1406;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Luja;")
    private class35 field1398;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1413 = new String[] { method931(method930("*[CE\u0001-\\\u0019G@")), method931(method930("8\u001bCW\u0015")), method931(method930("-@\u0001\u0015")), method931(method930("*[C8@")), method931(method930("*[C=@")), method931(method930("*[C:@")), method931(method930("*[C<@")), method931(method930("*[C;@")) };

    @OriginalMember(owner = "client!in", name = "s", descriptor = "J")
    public static long field1400 = 0L;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Lqr;")
    public static class69 field1407 = new class69(64);

    @OriginalMember(owner = "client!in", name = "f", descriptor = "[I")
    public static int[] field1412 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "Lhk;")
    private class107 field1401;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZLha;)Z")
    public final boolean method925(int arg0, boolean arg1, class63 arg2) {
        try {
            if (this.field1395 != arg0) {
                this.field1395 = arg0;
                int var4 = class663.method4812(!arg1, arg0);
                if (var4 > 512) {
                    var4 = 512;
                }
                if (var4 <= 0) {
                    var4 = 1;
                }
                if (this.field1408 != var4) {
                    this.field1408 = var4;
                    this.field1401 = null;
                }
                if (this.field1409 != null) {
                    this.field1405 = 0;
                    int[] var5 = new int[this.field1409.length];
                    for (int var6 = 0; var6 < this.field1409.length; var6++) {
                        class35 var7 = this.field1409[var6];
                        if (var7.method356(this.field1411, this.field1410, this.field1399, this.field1395)) {
                            var5[this.field1405] = var7.field404;
                            this.field1406[this.field1405++] = var7;
                        }
                    }
                    class206.method1861(this.field1406, 0, this.field1405 - 1, var5, 4602);
                }
                this.field1394 = true;
            }
            field1402++;
            if (!arg1) {
                this.field1406 = null;
            }
            boolean var8 = false;
            if (this.field1394) {
                this.field1394 = false;
                for (int var9 = this.field1405 - 1; var9 >= 0; var9--) {
                    boolean var10 = this.field1406[var9].method353(arg2, this.field1398);
                    var8 |= var10;
                    this.field1394 |= !var10;
                }
            }
            return var8;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field1413[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1413[2] : field1413[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
    public final void method926(boolean arg0) {
        try {
            field1397++;
            if (arg0) {
                this.field1404 = 123;
            }
            if (this.field1409 != null) {
                for (int var2 = 0; var2 < this.field1409.length; var2++) {
                    this.field1409[var2].method352();
                }
            }
            this.field1401 = null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1413[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(JJ)J")
    public static long method927(long arg0, long arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1413[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IILha;IIIIIII)V")
    public final void method928(int arg0, int arg1, class63 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field1396++;
            if (arg0 == 0) {
                int var21 = arg6 + arg8 & 0x3FFF;
                if (this.field1404 == -1 || this.field1408 == 0) {
                    arg2.method242(arg9, arg5, arg7, arg1, arg4, 0);
                } else {
                    class304 var11 = class418.field6601.method1419(this.field1404, arg0 ^ 0xFFFFFF8F);
                    if (this.field1401 == null && class418.field6601.method1417((byte) -66, this.field1404)) {
                        int[] var12 = var11.field4892 == 2 ? class418.field6601.method1415(this.field1404, 0.7F, this.field1408, this.field1408, arg0 ^ 0x6D87, false) : class418.field6601.method1420(this.field1408, false, this.field1408, this.field1404, 0.7F, arg0 ^ 0xFFFFE327);
                        this.field1401 = arg2.method665(this.field1408, this.field1408, arg0 ^ 0x79, 0, var12, this.field1408);
                    }
                    if (var11.field4892 == 2) {
                        arg2.method242(arg9, arg5, arg7, arg1, arg4, 0);
                    }
                    if (this.field1401 != null) {
                        int var13 = var11.field4892 == 2 ? 1 : 0;
                        int var14 = arg1 * arg3 / -4096;
                        int var15;
                        for (var15 = (arg7 - arg1) / 2 + (arg1 * var21 / 4096); var15 > arg1; var15 -= arg1) {
                        }
                        while (var15 < 0) {
                            var15 += arg1;
                        }
                        while (var14 > arg1) {
                            var14 -= arg1;
                        }
                        while (var14 < 0) {
                            var14 += arg1;
                        }
                        for (int var16 = var15 - arg1; var16 < arg7; var16 += arg1) {
                            for (int var17 = var14 - arg1; var17 < arg1; var17 += arg1) {
                                this.field1401.method999(arg9 + var16, arg5 + var17, arg1, arg1, 1, 0, var13);
                            }
                        }
                    }
                }
                for (int var18 = this.field1405 - 1; var18 >= 0; var18--) {
                    this.field1406[var18].method350(arg2, arg9, arg5, arg7, arg1, arg3, var21);
                }
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field1413[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1413[2] : field1413[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I[Luja;IIII)V")
    public class96(int arg0, class35[] arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field1411 = arg3;
            this.field1409 = arg1;
            this.field1410 = arg4;
            this.field1404 = arg0;
            this.field1399 = arg5;
            if (arg1 == null) {
                this.field1406 = null;
                this.field1398 = null;
            } else {
                this.field1406 = new class35[arg1.length];
                this.field1398 = arg2 >= 0 ? arg1[arg2] : null;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1413[0] + arg0 + ',' + (arg1 == null ? field1413[2] : field1413[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static void method929(int arg0) {
        try {
            if (arg0 < 26) {
                method929(98);
            }
            field1407 = null;
            field1412 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1413[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!in", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method930(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!in", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method931(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
