import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class159 implements Runnable {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Ljg;")
    private class177 field2504 = new class177();

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public int field2517 = 0;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Z")
    private boolean field2520 = false;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field2519;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2516 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "[I")
    public static int[] field2515 = new int[3];

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[I")
    public static int[] field2503;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[BLnh;I)Lom;")
    public final class89 method1052(int arg0, byte[] arg1, class55 arg2, int arg3) {
        field2508++;
        class89 var5 = new class89();
        var5.field1376 = arg2;
        var5.field2552 = (long) arg0;
        var5.field1370 = arg3;
        var5.field1377 = arg1;
        var5.field337 = false;
        this.method1053(false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLom;)V")
    private final void method1053(boolean arg0, class89 arg1) {
        class177 var3 = this.field2504;
        synchronized (this.field2504) {
            this.field2504.method1190(8217, arg1);
            this.field2517++;
            this.field2504.notifyAll();
            if (arg0) {
                field2511 = 68;
            }
        }
        field2507++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class194.method1344(arg2, arg3 + arg5, arg1 + arg4);
        field2512++;
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = (int) var8 >> 14 & 0x1F;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class74 var13 = class216.method1510(arg0 ^ 0xFFFFFFFC, var12);
            if (var13.field1089 == -1) {
                int var14 = arg7;
                if (var8 > 0L) {
                    var14 = arg6;
                }
                int[] var15 = class62.field932;
                int var16 = arg5 * 4 + ((103 - arg1) * 2048) + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
            } else if (!class152.method1004(arg5, var10, arg3, arg4, arg1, arg0 ^ 0xFFFFFFCC, var13)) {
                return false;
            }
        }
        long var17 = class186.method1268(arg2, arg3 + arg5, arg1 + arg4);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x7FE7C) >> 14;
            int var20 = (int) var17 >> 20 & 0x3;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class74 var22 = class216.method1510(0, var21);
            if (var22.field1089 == -1) {
                if (var19 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class62.field932;
                    int var25 = (103 - arg1) * 512 * 4 + arg5 * 4 + 24624;
                    if (var20 == 0 || var20 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1025] = var23;
                        var24[var25 + 514] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 1026] = var23;
                        var24[var25 + 1539] = var23;
                    }
                }
            } else if (!class152.method1004(arg5, var20, arg3, arg4, arg1, arg0 + 52, var22)) {
                return false;
            }
        }
        long var26 = class9.method48(arg2, arg3 + arg5, arg1 - -arg4);
        if (arg0 != -4) {
            return true;
        }
        if (var26 != 0L) {
            int var28 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            int var29 = (int) var26 >> 20 & 0x3;
            class74 var30 = class216.method1510(arg0 ^ 0xFFFFFFFC, var28);
            if (var30.field1089 != -1 && !class152.method1004(arg5, var29, arg3, arg4, arg1, arg0 + 52, var30)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1055(String arg0, int arg1, Throwable arg2) {
        field2506++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class216.method1513(0, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            if (arg1 != -17731) {
                method1055((String) null, -105, (Throwable) null);
            }
            class297.method2064(var3, arg1 + 17788);
            String var4 = class248.method1729(-83, ":", var3, "%3a");
            String var5 = class248.method1729(arg1 + 17684, "@", var4, "%40");
            String var6 = class248.method1729(-76, "&", var5, "%26");
            String var7 = class248.method1729(arg1 ^ 0x452A, "#", var6, "%23");
            if (class231.field3702.field4211 != null) {
                class54 var8 = class231.field3702.method1768(101, new URL(class231.field3702.field4211.getCodeBase(), "clienterror.ws?c=" + class283.field4739 + "&u=" + class313.field5039 + "&v1=" + class255.field4208 + "&v2=" + class255.field4215 + "&e=" + var7));
                while (var8.field725 == 0) {
                    class96.method614(0, 1L);
                }
                if (var8.field725 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field723;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static final void method1056(boolean arg0) {
        class77.method505((long) class4.field32);
        if (class160.field2523 != -1) {
            class105.method676(class160.field2523, -101);
        }
        field2505++;
        if (arg0) {
            method1055((String) null, -22, (Throwable) null);
        }
        for (int var1 = 0; var1 < class249.field3967; var1++) {
            if (class283.field4731[var1]) {
                class241.field3799[var1] = true;
            }
            class169.field2640[var1] = class283.field4731[var1];
            class283.field4731[var1] = false;
        }
        class90.field1387 = class4.field32;
        class128.field1971 = -1;
        class218.field3480 = null;
        class256.field4228 = -1;
        if (class160.field2523 != -1) {
            class249.field3967 = 0;
            class160.method1062((byte) 42);
        }
        class62.method387();
        class247.field3938 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2520) {
            class177 var1 = this.field2504;
            class89 var2;
            synchronized (this.field2504) {
                var2 = (class89) this.field2504.method1185(-8241);
                if (var2 == null) {
                    try {
                        this.field2504.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2517--;
            }
            try {
                if (var2.field1370 == 2) {
                    var2.field1376.method331(var2.field1377.length, var2.field1377, (int) var2.field2552, true);
                } else if (var2.field1370 == 3) {
                    var2.field1377 = var2.field1376.method326((int) var2.field2552, -108);
                }
            } catch (Exception var6) {
                method1055((String) null, -17731, var6);
            }
            var2.field338 = false;
        }
        field2518++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method1057(int arg0) {
        field2503 = null;
        field2515 = null;
        field2516 = null;
        if (arg0 != -58) {
            field2516 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lnh;II)Lom;")
    public final class89 method1058(class55 arg0, int arg1, int arg2) {
        field2509++;
        class89 var4 = new class89();
        var4.field1370 = 1;
        class177 var5 = this.field2504;
        synchronized (this.field2504) {
            if (arg2 < 117) {
                this.field2517 = -110;
            }
            class89 var6 = (class89) this.field2504.method1187((byte) 127);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field2552 && var6.field1376 == arg0 && var6.field1370 == 2) {
                    var4.field1377 = var6.field1377;
                    var4.field338 = false;
                    return var4;
                }
                var6 = (class89) this.field2504.method1186(true);
            }
        }
        var4.field1377 = arg0.method326(arg1, -118);
        var4.field337 = true;
        var4.field338 = false;
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public final void method1059(int arg0) {
        field2510++;
        if (arg0 != 25310) {
            method1056(false);
        }
        this.field2520 = true;
        class177 var2 = this.field2504;
        synchronized (this.field2504) {
            this.field2504.notifyAll();
        }
        try {
            this.field2519.join();
        } catch (InterruptedException var3) {
        }
        this.field2519 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBLnh;)Lom;")
    public final class89 method1060(int arg0, byte arg1, class55 arg2) {
        field2513++;
        class89 var4 = new class89();
        var4.field2552 = (long) arg0;
        var4.field1376 = arg2;
        var4.field1370 = 3;
        var4.field337 = false;
        if (arg1 != -128) {
            this.field2504 = null;
        }
        this.method1053(false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class159() {
        class54 var1 = class259.field4254.method1777(5, this, 2);
        while (var1.field725 == 0) {
            class96.method614(0, 10L);
        }
        if (var1.field725 == 2) {
            throw new RuntimeException();
        }
        this.field2519 = (Thread) var1.field723;
    }
}
