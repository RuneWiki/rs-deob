import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class270 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Z")
    public static boolean field3939 = false;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lbh;")
    public static class234 field3946 = new class234();

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3949 = "Checking for updates - ";

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3948 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Z")
    public static boolean field3940;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1727(int arg0) {
        if (arg0 == 239) {
            field3946 = null;
            field3949 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static final void method1728(int arg0) {
        int var1 = -105 / ((arg0 - 22) / 45);
        for (int var2 = 0; var2 < class272.field3986; var2++) {
            int var3 = class286.field4423[var2];
            class54 var4 = class20.field244[var3];
            int var5 = class163.field2332.method1407(106);
            if ((var5 & 0x20) != 0) {
                var5 += class163.field2332.method1407(119) << 8;
            }
            if ((var5 & 0x40) != 0) {
                int var6 = class163.field2332.method1385(2);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = class163.field2332.method1369((byte) -127);
                class52.method314(0, var7, var6, var4);
            }
            if ((var5 & 0x4) != 0) {
                var4.field4575 = class163.field2332.method1400(false);
                if (var4.field4575 == 65535) {
                    var4.field4575 = -1;
                }
            }
            if ((var5 & 0x10) != 0) {
                if (var4.field636.method1711((byte) -109)) {
                    class61.method378(var4, 14);
                }
                var4.method322(class165.method1084(-34, class163.field2332.method1388(-1)), 93);
                var4.method1939(var4.field636.field3858, -128);
                var4.field4588 = var4.field636.field3860;
                var4.field4505 = var4.field636.field3845;
                if (var4.field636.method1711((byte) -90)) {
                    class287.method1931(0, 128, var4.field4585[0], var4, var4.field4597[0], (class240) null, class199.field2833, (class273) null);
                }
            }
            if ((var5 & 0x2) != 0) {
                int var8 = class163.field2332.method1380(true);
                boolean var9 = true;
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var10 = class163.field2332.method1411(255);
                if (var8 != -1 && var4.field4590 != -1 && class27.method165(class189.method1246(var8, (byte) -118).field1382, (byte) 100).field4071 < class27.method165(class189.method1246(var4.field4590, (byte) -68).field1382, (byte) -127).field4071) {
                    var9 = false;
                }
                if (var9) {
                    var4.field4526 = var10 >> 16;
                    var4.field4542 = 1;
                    var4.field4578 = 0;
                    var4.field4507 = (var10 & 0xFFFF) + class198.field2819;
                    if (class198.field2819 < var4.field4507) {
                        var4.field4578 = -1;
                    }
                    var4.field4556 = 0;
                    var4.field4590 = var8;
                    if (var4.field4590 != -1 && class198.field2819 == var4.field4507) {
                        int var11 = class189.method1246(var4.field4590, (byte) -31).field1382;
                        if (var11 != -1) {
                            class274 var12 = class27.method165(var11, (byte) 56);
                            if (var12 != null && var12.field4072 != null) {
                                method1730(0, var4.field4563, var4.field4553, (byte) -123, var12, false);
                            }
                        }
                    }
                }
            }
            if ((var5 & 0x80) != 0) {
                int var13 = class163.field2332.method1407(114);
                int var14 = class163.field2332.method1362(5);
                var4.method1940(var14, var13, 108, class198.field2819);
            }
            if ((var5 & 0x8) != 0) {
                var4.field4596 = class163.field2332.method1352((byte) -74);
                var4.field4525 = 100;
            }
            if ((var5 & 0x1) != 0) {
                int var15 = class163.field2332.method1362(5);
                int var16 = class163.field2332.method1407(113);
                var4.method1940(var16, var15, 25, class198.field2819);
                var4.field4594 = class198.field2819 + 300;
                var4.field4530 = class163.field2332.method1407(120);
            }
            if ((var5 & 0x200) != 0) {
                var4.field4510 = class163.field2332.method1380(true);
                var4.field4558 = class163.field2332.method1388(-1);
            }
            if ((var5 & 0x100) != 0) {
                int var17 = class163.field2332.method1392(-54);
                int[] var18 = new int[var17];
                int[] var19 = new int[var17];
                int[] var20 = new int[var17];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = class163.field2332.method1388(-1);
                    if (var22 == 65535) {
                        var22 = -1;
                    }
                    var18[var21] = var22;
                    var19[var21] = class163.field2332.method1369((byte) -128);
                    var20[var21] = class163.field2332.method1400(false);
                }
                class217.method1415(var18, var19, var20, var4, true);
            }
        }
        field3942++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public static final void method1729(boolean arg0, int arg1) {
        field3943++;
        if (!arg0) {
            field3947 = -108;
        }
        if (arg1 >= 0 && class24.field290.length > arg1) {
            class24.field290[arg1] = !class24.field290[arg1];
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIBLrj;Z)V")
    public static final void method1730(int arg0, int arg1, int arg2, byte arg3, class274 arg4, boolean arg5) {
        field3945++;
        if (class37.field432 >= 50 || arg4 == null || arg4.field4073 == null || arg4.field4073.length <= arg0 || arg4.field4073[arg0] == null) {
            return;
        }
        int var6 = arg4.field4073[arg0][0];
        int var7 = (var6 & 0xEF) >> 5;
        int var8 = var6 >> 8;
        int var9 = var6 & 0x1F;
        if (arg4.field4073[arg0].length > 1) {
            int var10 = (int) (Math.random() * (double) arg4.field4073[arg0].length);
            if (var10 > 0) {
                var8 = arg4.field4073[arg0][var10];
            }
        }
        if (var9 != 0) {
            int var11 = -36 % ((-arg3 - 59) / 52);
            if (class95.field1277 != 0) {
                int var12 = (arg2 - 64) / 128;
                class243.field3548[class37.field432] = var8;
                int var13 = (arg1 - 64) / 128;
                class223.field3148[class37.field432] = var7;
                class157.field2258[class37.field432] = 0;
                class101.field1397[class37.field432] = null;
                class77.field924[class37.field432] = 255;
                class176.field2501[class37.field432] = (var12 << 8) + (var13 << 16) + var9;
                class37.field432++;
            }
        } else if (arg5) {
            class222.method1442(0, var7, 255, -1, var8);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLjava/lang/String;IZ)Z")
    public static final boolean method1731(boolean arg0, String arg1, int arg2, boolean arg3) {
        field3941++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = arg0;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public static final int method1732(int arg0, int arg1) {
        if (arg0 == -1941949851) {
            field3944++;
            return arg1 == 16711935 ? -1 : class97.method580((byte) 16, arg1);
        } else {
            return 2;
        }
    }
}
