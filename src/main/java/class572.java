import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class572 {

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field8285;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lml;")
    private class194 field8286;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8294 = new String[] { method4262(method4261("\u000b+'nW")), method4262(method4261("\u0006+Mh")), method4262(method4261("\u001epe,")), method4262(method4261("\u0006+Jh")), method4262(method4261("\u0006+Kh")), method4262(method4261("\u0006+o)D\u0011i`:OX")), method4262(method4261("\u0006+Hh")), method4262(method4261("\u0006+Lh")), method4262(method4261("\u0006+5)D\u0019q7h")) };

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lsb;")
    public static class261 field8282 = new class261(139, 12);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static volatile int field8291 = -1;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Ldfa;")
    public static class477 field8289 = new class477(16);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lqa;")
    public static class104 field8293;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient;")
    public static client field8287;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 4)
    public static void method4256(int arg0) {
        try {
            field8289 = null;
            field8282 = null;
            field8293 = null;
            field8287 = null;
            if (arg0 > -45) {
                field8291 = -62;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8294[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() throws Throwable {
        try {
            field8288++;
            this.field8286.method1664(this.field8285, 0);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8294[5] + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZBLlq;ILlq;)I", line = 31)
    public static final int method4257(boolean arg0, byte arg1, class728 arg2, int arg3, class728 arg4) {
        try {
            field8290++;
            if (arg3 == 1) {
                int var5 = arg4.field4969;
                int var6 = arg2.field4969;
                if (!arg0) {
                    if (var6 == -1) {
                        var6 = 2001;
                    }
                    if (var5 == -1) {
                        var5 = 2001;
                    }
                }
                return var5 - var6;
            } else if (arg3 == 2) {
                return class669.method4816(class405.field5883, arg4.method5299(31419).field1418, (byte) 126, arg2.method5299(31419).field1418);
            } else if (arg3 == 3) {
                if (arg4.field10435.equals("-")) {
                    if (arg2.field10435.equals("-")) {
                        return 0;
                    } else if (arg0) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (arg2.field10435.equals("-")) {
                    return arg0 ? 1 : -1;
                } else {
                    return class669.method4816(class405.field5883, arg4.field10435, (byte) 127, arg2.field10435);
                }
            } else if (arg3 == 4) {
                if (arg4.method2738((byte) -96)) {
                    return arg2.method2738((byte) -35) ? 0 : 1;
                } else if (arg2.method2738((byte) -109)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 5) {
                if (arg4.method2739(false)) {
                    return arg2.method2739(false) ? 0 : 1;
                } else if (arg2.method2739(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 6) {
                if (arg4.method2743(513)) {
                    return arg2.method2743(513) ? 0 : 1;
                } else if (arg2.method2743(513)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 7) {
                if (arg4.method2741((byte) -112)) {
                    return arg2.method2741((byte) -28) ? 0 : 1;
                } else if (arg2.method2741((byte) -71)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var7 = arg4.field10432;
                int var8 = arg2.field10432;
                if (arg0) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                if (arg1 > -99) {
                    field8293 = null;
                }
                return arg4.field10431 - arg2.field10431;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8294[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8294[2] : field8294[0]) + ',' + arg3 + ',' + (arg4 == null ? field8294[2] : field8294[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Z", line = 136)
    public static final boolean method4258(byte arg0, int arg1) {
        try {
            field8283++;
            if (arg0 >= -40) {
                return false;
            } else if (arg1 == 50 || arg1 == 12 || arg1 == 9 || arg1 == 51 || arg1 == 1002 || arg1 == 1009) {
                return true;
            } else {
                return arg1 == 3;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8294[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZII)V", line = 153)
    public static final void method4259(boolean arg0, int arg1, int arg2) {
        try {
            field8292++;
            class375 var3 = class279.method2276(arg0, 0, arg1);
            if (var3 != null) {
                if (arg2 > -98) {
                    field8282 = null;
                }
                for (int var4 = 0; var4 < var3.field5476.length; var4++) {
                    var3.field5476[var4] = -1;
                    var3.field5472[var4] = 0;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8294[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lml;II)V", line = 178)
    public class572(class194 arg0, int arg1, int arg2) {
        try {
            this.field8285 = arg2;
            this.field8286 = arg0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8294[8] + (arg0 == null ? field8294[2] : field8294[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V", line = 190)
    public static final void method4260(int arg0, int arg1, int arg2, int arg3) {
        try {
            field8284++;
            class277 var4 = class387.field5654[arg1][arg3];
            class728.method5300(arg0, -9970, var4 == null ? class164.field2121 : var4);
            int var5 = 72 / ((14 - arg2) / 63);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8294[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4261(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!v", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4262(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
