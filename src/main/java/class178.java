import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class178 {

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "Lgq;")
    private class540 field2470;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    private int field2480;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lqha;")
    private class112 field2479;

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2487 = new String[] { method1572(method1571("+(U\u0000c")), method1572(method1571("'wUa6")), method1572(method1571("2,\u0017#")), method1572(method1571("+(U\u0004c")), method1572(method1571("+(U\nc")), method1572(method1571("+(U\u0002c")), method1572(method1571("+(U\tc")), method1572(method1571("+(U\u000ec")), method1572(method1571("+(U\rc")), method1572(method1571("+(U\bc")), method1572(method1571("+(U\u0006c")), method1572(method1571("+(U\u0001c")), method1572(method1571("+(U\u0005c")), method1572(method1571("+(Us\"20\u000fqc")), method1572(method1571("+(U\fc")), method1572(method1571("+(U\u000bc")), method1572(method1571("+(U\u0003c")), method1572(method1571("/g\u0018<")), method1572(method1571("+(U\u0007c")) };

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "Lqea;")
    public static class139 field2478 = new class139();

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "D")
    public static double field2485;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method1556(long arg0, Object arg1, int arg2) {
        try {
            this.method1565(arg1, arg0, arg2, (byte) 123);
            field2477++;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2487[3] + arg0 + ',' + (arg1 == null ? field2487[2] : field2487[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)V")
    public final void method1557(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                this.field2480 = -48;
            }
            if (class110.field1276 != null) {
                for (class349 var3 = (class349) this.field2470.method4068(false); var3 != null; var3 = (class349) this.field2470.method4072(-49)) {
                    if (var3.method390(false)) {
                        if (var3.method389(false) == null) {
                            var3.method1824(1);
                            var3.method362((byte) 72);
                            this.field2465 += var3.field5391;
                        }
                    } else if (((long) arg0) < (++var3.field533)) {
                        class349 var4 = class110.field1276.method3482(var3, (byte) -127);
                        this.field2479.method968((byte) -111, var3.field3177, var4);
                        class90.method770(var3, 0, var4);
                        var3.method1824(1);
                        var3.method362((byte) 72);
                    }
                }
            }
            field2469++;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2487[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method1558(byte arg0, long arg1) {
        try {
            field2483++;
            class349 var4 = (class349) this.field2479.method977(arg1, 1);
            if (var4 == null) {
                return null;
            }
            if (arg0 != 96) {
                this.field2479 = null;
            }
            Object var5 = var4.method389(false);
            if (var5 == null) {
                var4.method1824(arg0 - 95);
                var4.method362((byte) 72);
                this.field2465 += var4.field5391;
                return null;
            }
            if (var4.method390(false)) {
                class90 var6 = new class90(var5, var4.field5391);
                this.field2479.method968((byte) -111, var4.field3177, var6);
                this.field2470.method4067((byte) 100, var6);
                var6.field533 = 0L;
                var4.method1824(1);
                var4.method362((byte) 72);
            } else {
                this.field2470.method4067((byte) -85, var4);
                var4.field533 = 0L;
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field2487[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public final void method1559(int arg0) {
        try {
            this.field2470.method4069((byte) -92);
            field2467++;
            if (arg0 == 0) {
                this.field2479.method970(-110);
                this.field2465 = this.field2480;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2487[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1560(boolean arg0) {
        try {
            field2476++;
            if (arg0) {
                this.method1556(40L, null, 32);
            }
            class349 var2 = (class349) this.field2479.method971(347);
            while (var2 != null) {
                Object var3 = var2.method389(false);
                if (var3 != null) {
                    return var3;
                }
                class349 var4 = var2;
                var2 = (class349) this.field2479.method973(true);
                var4.method1824(1);
                var4.method362((byte) 72);
                this.field2465 += var4.field5391;
            }
            return null;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2487[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(Z)V")
    public static void method1561(boolean arg0) {
        try {
            if (!arg0) {
                field2478 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2487[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)I")
    public final int method1562(byte arg0) {
        try {
            int var2 = -92 / ((arg0 - 69) / 56);
            field2474++;
            return this.field2480;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2487[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZIIII)V")
    public static final void method1563(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field2471++;
            class176.method1543(-127);
            class223.field3420 = 0L;
            int var5 = class451.method3463(1);
            if (arg4 == 3 || var5 == 3) {
                arg0 = true;
            }
            if (!class610.field8913.method542()) {
                arg0 = true;
            }
            class657.method4825(arg4, var5, arg3, (byte) 30, arg2, arg0);
            int var6 = -89 % ((arg1 + 48) / 52);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field2487[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(Z)I")
    public final int method1564(boolean arg0) {
        try {
            field2473++;
            int var2 = 0;
            for (class349 var3 = (class349) this.field2470.method4068(false); var3 != null; var3 = (class349) this.field2470.method4072(-49)) {
                if (!var3.method390(false)) {
                    var2++;
                }
            }
            if (!arg0) {
                this.field2479 = null;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2487[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
    public class178(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/Object;JIB)V")
    public final void method1565(Object arg0, long arg1, int arg2, byte arg3) {
        try {
            field2472++;
            if (arg2 > this.field2480) {
                throw new IllegalStateException(field2487[17]);
            }
            this.method1566(arg1, true);
            this.field2465 -= arg2;
            while (this.field2465 < 0) {
                class349 var6 = (class349) this.field2470.method4064(-21877);
                this.method1568(var6, -4);
            }
            if (arg3 == 123) {
                class90 var7 = new class90(arg0, arg2);
                this.field2479.method968((byte) -111, arg1, var7);
                this.field2470.method4067((byte) -86, var7);
                var7.field533 = 0L;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2487[18] + (arg0 == null ? field2487[2] : field2487[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(JZ)V")
    private final void method1566(long arg0, boolean arg1) {
        try {
            if (!arg1) {
                field2486 = -18;
            }
            field2468++;
            class349 var4 = (class349) this.field2479.method977(arg0, 1);
            this.method1568(var4, -4);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2487[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
    public final int method1567(byte arg0) {
        try {
            field2475++;
            return arg0 == 58 ? this.field2465 : -78;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2487[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljs;I)V")
    private final void method1568(class349 arg0, int arg1) {
        try {
            field2466++;
            if (arg1 != -4) {
                this.field2480 = 32;
            }
            if (arg0 != null) {
                arg0.method1824(arg1 + 5);
                arg0.method362((byte) 72);
                this.field2465 += arg0.field5391;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2487[6] + (arg0 == null ? field2487[2] : field2487[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
    public final void method1569(int arg0) {
        try {
            field2464++;
            if (arg0 != 10574) {
                field2484 = 29;
            }
            for (class349 var2 = (class349) this.field2470.method4068(false); var2 != null; var2 = (class349) this.field2470.method4072(arg0 - 10628)) {
                if (var2.method390(false)) {
                    var2.method1824(arg0 ^ 0x294F);
                    var2.method362((byte) 72);
                    this.field2465 += var2.field5391;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2487[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1570(byte arg0) {
        try {
            field2482++;
            if (arg0 <= 13) {
                return null;
            }
            class349 var2 = (class349) this.field2479.method973(true);
            while (var2 != null) {
                Object var3 = var2.method389(false);
                if (var3 != null) {
                    return var3;
                }
                class349 var4 = var2;
                var2 = (class349) this.field2479.method973(true);
                var4.method1824(1);
                var4.method362((byte) 72);
                this.field2465 += var4.field5391;
            }
            return null;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2487[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(II)V")
    public class178(int arg0, int arg1) {
        this.field2470 = new class540();
        try {
            this.field2480 = arg0;
            this.field2465 = arg0;
            int var3;
            for (var3 = 1; arg0 > var3 + var3 && arg1 > var3; var3 += var3) {
            }
            this.field2479 = new class112(var3);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2487[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1571(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1572(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
