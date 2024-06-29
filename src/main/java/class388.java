import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class388 {

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lbu;")
    public class18 field5411 = new class18();

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[Lee;")
    public static class677[] field5407 = new class677[2048];

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field5409 = -1;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field5413;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field5414;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZLjava/io/File;)V")
    public static final void method2298(int arg0, boolean arg1, File arg2) {
        if (arg0 != 0) {
            field5408 = 105;
        }
        field5412++;
        if (class239.field3373 == null) {
            class285.method1765(6143);
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field5414 == null ? (field5414 = method2302("java.lang.String")) : field5414, Boolean.TYPE);
            var4.invoke(class239.field3373, arg2.getAbsolutePath(), Boolean.valueOf(arg1));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method2299(byte arg0) {
        if (arg0 <= -28) {
            field5407 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lnt;II)V")
    public static final void method2300(class224 arg0, int arg1, int arg2) {
        field5406++;
        if (class416.field5742) {
            class416.field5742 = false;
            arg2 = 0;
        }
        if (class625.field8301 == null || !class625.field8301.method1430(2, arg0)) {
            class625.field8301 = arg0;
            class563.field7376 = class375.method2193(116);
            class696.field9701 = arg2;
            class573.field7522 = arg2;
            if (class573.field7522 == 0) {
                class265.method1604(true);
            } else {
                class511.field6788 = class473.field6490;
                class417.field5760 = class444.field6112;
                class350.field4930 = class580.field7602;
                class28.field444 = class399.field5564;
                class114.field1870 = class326.field4662;
                class286.field4047 = class635.field8453;
                class603.field7926 = class329.field4694;
                class204.field3060 = class389.field5447;
                class178.field2688 = class193.field2912;
                class256.field3518 = class532.field7034;
            }
        }
        if (arg1 != 0) {
            method2299((byte) -13);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILkn;Z)V")
    public static final void method2301(int arg0, class742 arg1, boolean arg2) {
        field5413++;
        class98 var3 = arg1.method4141(arg0 ^ arg0);
        if (arg1.field10316 == 0) {
            class204.field3050 = -1;
            arg1.field10313 = 0;
            class353.field4963 = 0;
            return;
        }
        if (arg1.field10257 != -1 && arg1.field10237 == 0) {
            class456 var4 = class509.field6780.method663((byte) -90, arg1.field10257);
            if (arg1.field10318 > 0 && var4.field6219 == 0) {
                arg1.field10313++;
                class353.field4963 = 0;
                class204.field3050 = -1;
                return;
            }
            if (arg1.field10318 <= 0 && var4.field6217 == 0) {
                class353.field4963 = 0;
                arg1.field10313++;
                class204.field3050 = -1;
                return;
            }
        }
        for (int var5 = 0; var5 < arg1.field10254.length; var5++) {
            if (arg1.field10254[var5].field6361 != -1 && class29.field474 >= arg1.field10254[var5].field6362) {
                class94 var20 = class226.field3216.method3929(arg1.field10254[var5].field6361, -1);
                if (var20.field1132 && var20.field1140 != -1) {
                    class456 var21 = class509.field6780.method663((byte) -90, var20.field1140);
                    if (arg1.field10318 > 0 && var21.field6219 == 0) {
                        arg1.field10313++;
                        class204.field3050 = -1;
                        class353.field4963 = 0;
                        return;
                    }
                    if (arg1.field10318 <= 0 && var21.field6217 == 0) {
                        class353.field4963 = 0;
                        arg1.field10313++;
                        class204.field3050 = -1;
                        return;
                    }
                }
            }
        }
        int var6 = arg1.field3505;
        int var7 = arg1.field3502;
        int var8 = arg1.field10322[arg1.field10316 - 1] * 512 + arg1.method2256(-1) * 256;
        int var9 = arg1.field10321[arg1.field10316 - 1] * 512 + (arg1.method2256(-1) * 256);
        if (var6 < var8) {
            if (var9 > var7) {
                arg1.method4132(false, 10240);
            } else if (var7 <= var9) {
                arg1.method4132(false, 12288);
            } else {
                arg1.method4132(false, 14336);
            }
        } else if (var8 < var6) {
            if (var9 > var7) {
                arg1.method4132(false, 6144);
            } else if (var7 > var9) {
                arg1.method4132(false, 2048);
            } else {
                arg1.method4132(false, 4096);
            }
        } else if (var9 > var7) {
            arg1.method4132(false, 8192);
        } else if (var9 < var7) {
            arg1.method4132(false, 0);
        }
        byte var10 = arg1.field10312[arg1.field10316 - 1];
        if (!arg2 && var8 - var6 > 1024 || (var8 - var6) < -1024 || (var9 - var7) > 1024 || var9 - var7 < -1024) {
            arg1.field3502 = var9;
            arg1.field3505 = var8;
            arg1.method4143((byte) -17, arg1.field10240, false);
            class204.field3050 = -1;
            class353.field4963 = 0;
            if (arg1.field10318 > 0) {
                arg1.field10318--;
            }
            arg1.field10316--;
            return;
        }
        int var11 = 16;
        boolean var12 = true;
        if (arg1 instanceof class556) {
            var12 = ((class556) arg1).field7328.field2502;
        }
        if (var12) {
            int var13 = arg1.field10240 - arg1.field10284.field4928;
            if (var13 != 0 && arg1.field10287 == -1 && arg1.field10293 != 0) {
                var11 = 8;
            }
            if (!arg2 && arg1.field10316 > 2) {
                var11 = 24;
            }
            if (!arg2 && arg1.field10316 > 3) {
                var11 = 32;
            }
        } else {
            if (!arg2 && arg1.field10316 > 1) {
                var11 = 24;
            }
            if (!arg2 && arg1.field10316 > 2) {
                var11 = 32;
            }
        }
        if (arg1.field10313 > 0 && arg1.field10316 > 1) {
            arg1.field10313--;
            var11 = 32;
        }
        if (var10 == 2) {
            var11 <<= 0x1;
        } else if (var10 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field1229 != -1) {
            int var14 = var11 << 9;
            if (arg1.field10316 == 1) {
                int var15 = arg1.field10320 * arg1.field10320;
                int var16 = (arg1.field3505 <= var8 ? var8 - arg1.field3505 : -var8 + arg1.field3505) << 9;
                int var17 = (arg1.field3502 <= var9 ? var9 - arg1.field3502 : arg1.field3502 - var9) << 9;
                int var18 = var17 >= var16 ? var17 : var16;
                int var19 = var3.field1229 * 2 * var18;
                if (var15 > var19) {
                    arg1.field10320 /= 2;
                } else if (var18 < (var15 / 2)) {
                    arg1.field10320 -= var3.field1229;
                    if (arg1.field10320 < 0) {
                        arg1.field10320 = 0;
                    }
                } else if (arg1.field10320 < var14) {
                    arg1.field10320 += var3.field1229;
                    if (arg1.field10320 > var14) {
                        arg1.field10320 = var14;
                    }
                }
            } else if (var14 > arg1.field10320) {
                arg1.field10320 += var3.field1229;
                if (var14 < arg1.field10320) {
                    arg1.field10320 = var14;
                }
            } else if (arg1.field10320 > 0) {
                arg1.field10320 -= var3.field1229;
                if (arg1.field10320 < 0) {
                    arg1.field10320 = 0;
                }
            }
            var11 = arg1.field10320 >> 9;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        class353.field4963 = 0;
        if (var6 == var8 && var7 == var9) {
            class204.field3050 = -1;
        } else {
            if (var8 > var6) {
                arg1.field3505 += var11;
                class353.field4963 |= 0x4;
                if (arg1.field3505 > var8) {
                    arg1.field3505 = var8;
                }
            } else if (var6 > var8) {
                arg1.field3505 -= var11;
                class353.field4963 |= 0x8;
                if (var8 > arg1.field3505) {
                    arg1.field3505 = var8;
                }
            }
            if (var7 < var9) {
                class353.field4963 |= 0x1;
                arg1.field3502 += var11;
                if (arg1.field3502 > var9) {
                    arg1.field3502 = var9;
                }
            } else if (var7 > var9) {
                class353.field4963 |= 0x2;
                arg1.field3502 -= var11;
                if (var9 > arg1.field3502) {
                    arg1.field3502 = var9;
                }
            }
            if (var11 >= 32) {
                class204.field3050 = 2;
            } else {
                class204.field3050 = var10;
            }
        }
        if (arg1.field3505 != var8 || arg1.field3502 != var9) {
            return;
        }
        arg1.field10316--;
        if (arg1.field10318 > 0) {
            arg1.field10318--;
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2302(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
