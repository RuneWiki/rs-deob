import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class498 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[J")
    public static long[] field7478 = new long[256];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[I")
    public static int[] field7477 = new int[6];

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lmh;")
    public static class145 field7481;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Lrk;")
    public static class419 field7482;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static final void method3002(int arg0) {
        field7479++;
        if (arg0 <= -27) {
            class621 var1 = class442.method2691(0, 15, true);
            var1.method3598(255);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZLlk;)V")
    public static final void method3003(byte arg0, boolean arg1, class383 arg2) {
        field7480++;
        if (class487.field7385 >= 400) {
            return;
        }
        class429 var3 = arg2.field5601;
        if (arg0 != -106) {
            return;
        }
        if (var3.field6238 != null) {
            var3 = var3.method2629(class406.field5823, (byte) 100);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field6296) {
            return;
        }
        String var4 = var3.field6245;
        if (var3.field6290 != 0) {
            String var5 = class461.field6666 == class181.field2783 ? class349.field5060.method2953(3181, class77.field889) : class55.field680.method2953(arg0 + 3287, class77.field889);
            var4 = var4 + class528.method3121(true, var3.field6290, class239.field3493.field2717) + " (" + var5 + var3.field6290 + ")";
        }
        if (!class369.field5337) {
            if (!arg1) {
                String[] var7 = var3.field6271;
                if (class180.field2773) {
                    var7 = class133.method815((byte) 48, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (var3.field6297 == 0 || !var7[var8].equalsIgnoreCase(class63.field738.method2953(arg0 ^ 0xFFFFF3FB, class77.field889)))) {
                            byte var9 = 0;
                            if (var8 == 0) {
                                var9 = 59;
                            }
                            int var10 = class417.field5998;
                            if (var8 == 1) {
                                var9 = 6;
                            }
                            if (var8 == 2) {
                                var9 = 44;
                            }
                            if (var8 == 3) {
                                var9 = 12;
                            }
                            if (var8 == 4) {
                                var9 = 16;
                            }
                            if (var3.field6286 == var8) {
                                var10 = var3.field6257;
                            }
                            if (var3.field6269 == var8) {
                                var10 = var3.field6279;
                            }
                            class78.field910++;
                            class436.method2670((long) arg2.field1053, -1, var9, 0, true, (byte) -5, var7[var8], 0, "<col=ffff00>" + var4, var7[var8].equalsIgnoreCase(class63.field738.method2953(3181, class77.field889)) ? var3.field6240 : var10, false);
                        }
                    }
                }
                if (var3.field6297 == 1 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class63.field738.method2953(3181, class77.field889))) {
                            short var12 = 0;
                            if (var3.field6290 > class239.field3493.field2717) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 59;
                            }
                            if (var11 == 1) {
                                var13 = 6;
                            }
                            if (var11 == 2) {
                                var13 = 44;
                            }
                            if (var11 == 3) {
                                var13 = 12;
                            }
                            if (var11 == 4) {
                                var13 = 16;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class327.field4832++;
                            class436.method2670((long) arg2.field1053, -1, var13, 0, true, (byte) -5, var7[var11], 0, "<col=ffff00>" + var4, var3.field6240, false);
                        }
                    }
                }
            }
            class180.field2763++;
            class436.method2670((long) arg2.field1053, -1, 1011, 0, true, (byte) -5, class153.field1954.method2953(3181, class77.field889), 0, "<col=ffff00>" + var4, class293.field4305, arg1);
        } else if (!arg1) {
            class173 var6 = class437.field6433 == -1 ? null : class8.field74.method3290(class437.field6433, 30883);
            if ((class270.field4003 & 0x2) != 0) {
                if (var6 == null || var3.method2635(var6.field2339, class437.field6433, (byte) 125) != var6.field2339) {
                    class523.field7749++;
                    class436.method2670((long) arg2.field1053, -1, 21, 0, true, (byte) -5, class479.field7270, 0, class323.field4798 + " -> <col=ffff00>" + var4, class425.field6074, false);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static void method3004(int arg0) {
        int var1 = 12 / ((-arg0 - 66) / 50);
        field7482 = null;
        field7481 = null;
        field7478 = null;
        field7477 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7478[var0] = var1;
        }
        field7481 = new class145("", 10);
        field7482 = new class419();
    }
}
