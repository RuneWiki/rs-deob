import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class224 {

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "Lfea;")
    public static class678 field3414 = new class678("LIVE", "", "", 0);

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "[I")
    public static int[] field3415 = new int[256];

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "Lvq;")
    public static class500 field3416;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "Ldaa;")
    public static class453 field3417;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "B")
    public static byte field3410;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lgga;I)Ljava/lang/String;")
    public static final String method1511(class511 arg0, int arg1) {
        field3412++;
        return arg1 < 91 ? null : class284.method1874(32767, arg0, (byte) -112);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIII)V")
    public static final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class571 var5 = (class571) class566.field7987.method1041(1048832); var5 != null; var5 = (class571) class566.field7987.method1033(arg1 ^ 0xFFFFFFFD)) {
            class87.method650(arg4, var5, 16384, arg2, arg3, arg0);
        }
        if (arg1 != 2) {
            field3416 = null;
        }
        field3408++;
        for (class571 var6 = (class571) class536.field7419.method1041(1048832); var6 != null; var6 = (class571) class536.field7419.method1033(-1)) {
            byte var12 = 1;
            class148 var13 = var6.field8034.method3736((byte) 127);
            if (var6.field8034.field9198 == -1 || var6.field8034.field9207) {
                var12 = 0;
            } else if (var6.field8034.field9198 == var13.field1915 || var6.field8034.field9198 == var13.field1930 || var6.field8034.field9198 == var13.field1920 || var6.field8034.field9198 == var13.field1886) {
                var12 = 2;
            } else if (var6.field8034.field9198 == var13.field1916 || var6.field8034.field9198 == var13.field1896 || var6.field8034.field9198 == var13.field1938 || var6.field8034.field9198 == var13.field1931) {
                var12 = 3;
            }
            if (var6.field8027 != var12) {
                int var14 = class342.method2169((byte) -115, var6.field8034);
                class636 var15 = var6.field8034.field5172;
                if (var15.field8872 != null) {
                    var15 = var15.method3650(class173.field2192, (byte) 55);
                }
                if (var15 == null || var14 == -1) {
                    var6.field8024 = false;
                    var6.field8027 = var12;
                    var6.field8037 = -1;
                } else if (var6.field8037 == var14 && var6.field8024 == var15.field8946) {
                    var6.field8027 = var12;
                    var6.field8030 = var15.field8947;
                } else {
                    boolean var16 = false;
                    if (var6.field8026 == null) {
                        var16 = true;
                    } else {
                        var6.field8030 -= 512;
                        if (var6.field8030 <= 0) {
                            class44.field468.method2512(var6.field8026);
                            var6.field8026 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field8037 = var14;
                        var6.field8027 = var12;
                        var6.field8030 = var15.field8947;
                        var6.field8043 = null;
                        var6.field8024 = var15.field8946;
                        var6.field8047 = null;
                    }
                }
            }
            var6.field8036 = var6.field8034.field3470;
            var6.field8054 = var6.field8034.field3470 + (var6.field8034.method3744(1) << 8);
            var6.field8033 = var6.field8034.field3460;
            var6.field8053 = var6.field8034.field3460 + (var6.field8034.method3744(arg1 - 1) << 8);
            class87.method650(arg4, var6, arg1 ^ 0x4002, arg2, arg3, arg0);
        }
        for (class571 var7 = (class571) class12.field74.method3668(114); var7 != null; var7 = (class571) class12.field74.method3667((byte) 125)) {
            byte var8 = 1;
            class148 var9 = var7.field8035.method3736((byte) 118);
            if (var7.field8035.field9198 == -1 || var7.field8035.field9207) {
                var8 = 0;
            } else if (var7.field8035.field9198 == var9.field1915 || var7.field8035.field9198 == var9.field1930 || var7.field8035.field9198 == var9.field1920 || var7.field8035.field9198 == var9.field1886) {
                var8 = 2;
            } else if (var7.field8035.field9198 == var9.field1916 || var7.field8035.field9198 == var9.field1896 || var7.field8035.field9198 == var9.field1938 || var7.field8035.field9198 == var9.field1931) {
                var8 = 3;
            }
            if (var7.field8027 != var8) {
                int var10 = class107.method761((byte) 26, var7.field8035);
                if (var7.field8037 == var10 && var7.field8035.field9981 == var7.field8024) {
                    var7.field8030 = var7.field8035.field9970;
                    var7.field8027 = var8;
                } else {
                    boolean var11 = false;
                    if (var7.field8026 == null) {
                        var11 = true;
                    } else {
                        var7.field8030 -= 512;
                        if (var7.field8030 <= 0) {
                            class44.field468.method2512(var7.field8026);
                            var11 = true;
                            var7.field8026 = null;
                        }
                    }
                    if (var11) {
                        var7.field8024 = var7.field8035.field9981;
                        var7.field8027 = var8;
                        var7.field8047 = null;
                        var7.field8030 = var7.field8035.field9970;
                        var7.field8037 = var10;
                        var7.field8043 = null;
                    }
                }
            }
            var7.field8036 = var7.field8035.field3470;
            var7.field8054 = var7.field8035.field3470 + (var7.field8035.method3744(arg1 - 1) << 8);
            var7.field8033 = var7.field8035.field3460;
            var7.field8053 = var7.field8035.field3460 + (var7.field8035.method3744(1) << 8);
            class87.method650(arg4, var7, 16384, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static void method1513(byte arg0) {
        field3416 = null;
        if (arg0 > -69) {
            method1514((byte) -16, -53, 84);
        }
        field3417 = null;
        field3415 = null;
        field3414 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BII)V")
    public static final void method1514(byte arg0, int arg1, int arg2) {
        field3411++;
        if (class46.field494 > class46.field489) {
            class46.field489 = (float) ((double) class46.field489 / 30.0D + (double) class46.field489);
            if (class46.field489 > class46.field494) {
                class46.field489 = class46.field494;
            }
            class418.method2528(arg0 - 17);
            class46.field486 = (int) class46.field489 >> 1;
            class46.field492 = class474.method2828(75, class46.field486);
        } else if (class46.field494 < class46.field489) {
            class46.field489 = (float) ((double) class46.field489 - (double) class46.field489 / 30.0D);
            if (class46.field489 < class46.field494) {
                class46.field489 = class46.field494;
            }
            class418.method2528(0);
            class46.field486 = (int) class46.field489 >> 1;
            class46.field492 = class474.method2828(123, class46.field486);
        }
        if (class759.field10432 != -1 && class83.field1004 != -1) {
            int var3 = class759.field10432 - class612.field8623;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class83.field1004 - class744.field10276;
            class612.field8623 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class83.field1004 = -1;
                class759.field10432 = -1;
            }
            class744.field10276 -= -var4;
            class418.method2528(0);
        }
        if (arg0 != 17) {
            return;
        }
        if (class202.field2840 <= 0) {
            class457.field6394 = -1;
            class95.field1108 = -1;
        } else {
            class160.field2064--;
            if (class160.field2064 == 0) {
                class160.field2064 = 100;
                class202.field2840--;
            }
        }
        if (!class436.field6053 || class94.field1093 == null) {
            return;
        }
        for (class361 var5 = (class361) class94.field1093.method1041(1048832); var5 != null; var5 = (class361) class94.field1093.method1033(-1)) {
            class547 var6 = class46.field485.method514(var5.field5200.field3433, (byte) 87);
            if (var5.method2274(arg1, arg2, 23265)) {
                if (var6.field7619 != null) {
                    if (var6.field7619[4] != null) {
                        class86.method647((long) var5.field5200.field3433, var6.field7619[4], 0, false, (long) var5.field5200.field3433, var6.field7632, 1006, -1, -1, 73, true, var6.field7604, false);
                    }
                    if (var6.field7619[3] != null) {
                        class86.method647((long) var5.field5200.field3433, var6.field7619[3], 0, false, (long) var5.field5200.field3433, var6.field7632, 1009, -1, -1, 97, true, var6.field7604, false);
                    }
                    if (var6.field7619[2] != null) {
                        class86.method647((long) var5.field5200.field3433, var6.field7619[2], 0, false, (long) var5.field5200.field3433, var6.field7632, 1007, -1, -1, 105, true, var6.field7604, false);
                    }
                    if (var6.field7619[1] != null) {
                        class86.method647((long) var5.field5200.field3433, var6.field7619[1], 0, false, (long) var5.field5200.field3433, var6.field7632, 1002, -1, -1, 101, true, var6.field7604, false);
                    }
                    if (var6.field7619[0] != null) {
                        class86.method647((long) var5.field5200.field3433, var6.field7619[0], 0, false, (long) var5.field5200.field3433, var6.field7632, 1012, -1, -1, arg0 + 27, true, var6.field7604, false);
                    }
                }
                if (!var5.field5200.field3426) {
                    var5.field5200.field3426 = true;
                    class700.method3958(class253.field3760, var5.field5200.field3433, var6.field7604);
                }
                if (var5.field5200.field3426) {
                    class700.method3958(class708.field9831, var5.field5200.field3433, var6.field7604);
                }
            } else if (var5.field5200.field3426) {
                var5.field5200.field3426 = false;
                class700.method3958(class423.field5877, var5.field5200.field3433, var6.field7604);
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(FFBF)F")
    public static final float method1515(float arg0, float arg1, byte arg2, float arg3) {
        field3409++;
        if (arg2 != 119) {
            method1516(null, 93);
        }
        return (arg1 - arg3) * arg0 + arg3;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1516(String arg0, int arg1) {
        field3413++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg1 <= 124) {
            field3415 = null;
        }
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3415[var0] = var1;
        }
        field3416 = new class500();
        field3417 = new class453();
    }
}
