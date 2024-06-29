import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class278 {

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4184 = new String[] { method2289(method2288("5bpE\u001d")), method2289(method2288("5bpF\u001d")), method2289(method2288("<$p*H")), method2289(method2288("5bpG\u001d")), method2289(method2288(")\u007f2h")), method2289(method2288("5bp@\u001d")) };

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lel;")
    public static class573 field4179 = new class573(36, -1);

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lef;")
    public static class513 field4182 = new class513();

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Ld;")
    public static class160 field4183;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 4)
    public static void method2284(byte arg0) {
        try {
            field4182 = null;
            if (arg0 <= 11) {
                method2287(-28, 46, 122, 56, 85, 78, 106);
            }
            field4179 = null;
            field4183 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4184[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2285(int arg0) {
        try {
            int var1 = -74 % ((arg0 - 57) / 55);
            field4178++;
            for (class329 var2 = (class329) class112.field1301.method3863((byte) 64); var2 != null; var2 = (class329) class112.field1301.method3862(-353)) {
                class464 var3 = var2.field5183;
                if (var3.field6775) {
                    var2.method1824(1);
                    var3.method3526(-116);
                } else if (var3.field6764 <= class375.field5711) {
                    var3.method3529((byte) 117, class327.field5158);
                    if (var3.field6775) {
                        var2.method1824(1);
                    } else {
                        class712.method5190(var3, true);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4184[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIB[I)Z", line = 54)
    public static final boolean method2286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int[] arg7) {
        try {
            field4180++;
            if (class756.field10986 < arg2) {
                arg2 = class756.field10986;
            }
            if (arg3 < 0) {
                arg3 = 0;
            }
            if (arg3 >= arg2) {
                return true;
            }
            int var12 = arg2 - arg3 >> 2;
            if (arg6 <= 117) {
                method2284((byte) 41);
            }
            arg1 += arg3 - 1;
            arg0 += arg3 * arg4;
            int var10;
            int var11;
            int var10000;
            if (class394.field5911 == 1) {
                class73.field850 += var12;
                while (true) {
                    var12--;
                    if (var12 < 0) {
                        var12 = arg2 - arg3 & 0x3;
                        while (true) {
                            var12--;
                            if (var12 < 0) {
                                return true;
                            }
                            arg1++;
                            if (arg7[arg1] > arg0) {
                                arg7[arg1] = arg0;
                            }
                            arg0 += arg4;
                        }
                    }
                    var11 = arg1 + 1;
                    if (arg7[var11] > arg0) {
                        arg7[var11] = arg0;
                    }
                    var10 = arg0 + arg4;
                    var11++;
                    if (var10 < arg7[var11]) {
                        arg7[var11] = var10;
                    }
                    var10 += arg4;
                    var10000 = ~var10;
                    var11++;
                    if (var10000 > ~arg7[var11]) {
                        arg7[var11] = var10;
                    }
                    var10 += arg4;
                    arg1 = var11 + 1;
                    if (var10 < arg7[arg1]) {
                        arg7[arg1] = var10;
                    }
                    arg0 = var10 + arg4;
                }
            } else {
                arg0 -= 38400;
                while (true) {
                    var12--;
                    if (var12 < 0) {
                        var12 = arg2 - arg3 & 0x3;
                        while (true) {
                            var12--;
                            if (var12 < 0) {
                                return true;
                            }
                            arg1++;
                            if (arg0 < arg7[arg1]) {
                                return false;
                            }
                            arg0 += arg4;
                        }
                    }
                    var11 = arg1 + 1;
                    if (arg7[var11] > arg0) {
                        return false;
                    }
                    var10 = arg0 + arg4;
                    var10000 = ~var10;
                    var11++;
                    if (var10000 > ~arg7[var11]) {
                        return false;
                    }
                    var10 += arg4;
                    var11++;
                    if (var10 < arg7[var11]) {
                        return false;
                    }
                    var10 += arg4;
                    var10000 = ~var10;
                    arg1 = var11 + 1;
                    if (var10000 > ~arg7[arg1]) {
                        return false;
                    }
                    arg0 = var10 + arg4;
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4184[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field4184[4] : field4184[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V", line = 152)
    public static final void method2287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field4181++;
            if (arg3 < 70) {
                field4179 = null;
            }
            if (arg6 != 8 && arg6 != 16) {
                class96 var19 = class734.field10683[arg0][arg1][arg2];
                if (var19 == null) {
                    var19 = new class96(arg0);
                }
                if (arg6 == 1) {
                    var19.field1086 = (short) arg5;
                    var19.field1087 = (short) arg4;
                } else if (arg6 == 2) {
                    var19.field1078 = (short) arg4;
                    var19.field1084 = (short) arg5;
                }
                if (class216.field3282) {
                    class385.method3079(15611);
                }
            } else if (arg6 == 8) {
                int var7 = arg1 << class602.field8828;
                int var8 = var7 + class358.field5488;
                int var9 = arg2 << class602.field8828;
                int var10 = class358.field5488 + var9;
                int var11 = class184.field2541[arg0].method2407(arg2, arg1, 55);
                int var12 = class184.field2541[arg0].method2407(arg2 + 1, arg1 + 1, 27);
                class107.field1235[class241.field3642++] = new class367(arg6, arg0, var7, var8, var8, var7, var11, var12, var12 - arg4, -arg4 + var11, var9, var10, var10, var9);
            } else {
                int var13 = (arg1 << class602.field8828) + class358.field5488;
                int var14 = var13 - class358.field5488;
                int var15 = arg2 << class602.field8828;
                int var16 = class358.field5488 + var15;
                int var17 = class184.field2541[arg0].method2407(arg2, arg1 + 1, 50);
                int var18 = class184.field2541[arg0].method2407(arg2 + 1, arg1, -123);
                class107.field1235[class241.field3642++] = new class367(arg6, arg0, var13, var14, var14, var13, var17, var18, var18 - arg4, -arg4 + var17, var15, var16, var16, var15);
            }
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field4184[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2288(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2289(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
