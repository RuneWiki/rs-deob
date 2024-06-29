import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class21 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Ldb;")
    public static class102 field301 = new class102(64);

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field306 = -1;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field307 = "cyan:";

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field308 = "skill: ";

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field305 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZII)V", line = 9)
    public static final void method112(boolean arg0, int arg1, int arg2) {
        field302++;
        class344 var3 = class110.method759(1, arg2, arg0);
        var3.method2390((byte) -51);
        var3.field5354 = arg1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 33)
    public static final void method113(int arg0, int arg1) {
        int var2 = class275.field4435;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 >= -14) {
            field301 = (class102) null;
        }
        int var10002;
        while (var3 < var2) {
            class334 var4;
            if (arg1 == 0) {
                var4 = class191.field3129;
            } else {
                var4 = class74.field1049[class160.field2656[var3]];
            }
            if (var4 != null && var4.method1695(29082)) {
                int var5 = var4.method1881(-20395);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field4255 & 0x7F) == 64 && (var4.field4264 & 0x7F) == 64) {
                            int var6 = var4.field4255 >> 7;
                            int var7 = var4.field4264 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class277.field4466[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field4255 & 0x7F) == 0 && (var4.field4264 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field4255 & 0x7F) == 64 && (var4.field4264 & 0x7F) == 64)) {
                        int var8 = var4.field4264 - (var5 * 64) >> 7;
                        int var9 = var4.field4255 - (var5 * 64) >> 7;
                        int var10 = var9 + var4.method1881(-20395);
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        int var11 = var4.method1881(-20395) + var8;
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        for (int var12 = var9; var12 < var10; var12++) {
                            for (int var13 = var8; var13 < var11; var13++) {
                                var10002 = class277.field4466[var12][var13]++;
                            }
                        }
                    }
                }
            }
            var3++;
        }
        field303++;
        label223: for (int var14 = 0; var14 < var2; var14++) {
            long var15;
            class334 var17;
            if (arg1 == 0) {
                var15 = 8791798054912L;
                var17 = class191.field3129;
            } else {
                var15 = (long) class160.field2656[var14] << 32;
                var17 = class74.field1049[class160.field2656[var14]];
            }
            if (var17 != null && var17.method1695(29082)) {
                int var18 = var17.method1881(-20395);
                if (arg1 == 0 || arg1 == var18) {
                    var17.field5227 = false;
                    var17.field4229 = true;
                    if ((class322.field4989 && class275.field4435 > 200 || class275.field4435 > 50) && arg1 != 0 && var17.field4232 == var17.method1876((byte) 125).field200) {
                        var17.field5227 = true;
                    }
                    if (var18 == 1) {
                        if ((var17.field4255 & 0x7F) == 64 && (var17.field4264 & 0x7F) == 64) {
                            int var28 = var17.field4255 >> 7;
                            int var29 = var17.field4264 >> 7;
                            if (var28 < 0 || var28 >= 104 || var29 < 0 || var29 >= 104) {
                                continue;
                            }
                            if (class277.field4466[var28][var29] > 1) {
                                var10002 = class277.field4466[var28][var29]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var17.field4255 & 0x7F) == 0 && (var17.field4264 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var17.field4255 & 0x7F) == 64 && (var17.field4264 & 0x7F) == 0) {
                        int var19 = var17.field4255 - (var18 * 64) >> 7;
                        int var20 = var17.field4264 - (var18 * 64) >> 7;
                        int var21 = var18 + var19;
                        if (var21 > 104) {
                            var21 = 104;
                        }
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        boolean var22 = true;
                        int var23 = var18 + var20;
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        for (int var24 = var19; var24 < var21; var24++) {
                            for (int var25 = var20; var25 < var23; var25++) {
                                if (class277.field4466[var24][var25] <= 1) {
                                    var22 = false;
                                    break;
                                }
                            }
                        }
                        if (var22) {
                            int var26 = var19;
                            while (true) {
                                if (var26 >= var21) {
                                    continue label223;
                                }
                                for (int var27 = var20; var27 < var23; var27++) {
                                    var10002 = class277.field4466[var26][var27]--;
                                }
                                var26++;
                            }
                        }
                    }
                    if (var17.field4189 == null || var17.field4221 > class240.field3818 || class240.field3818 >= var17.field4203) {
                        var17.field4229 = false;
                        var17.field4219 = class123.method889(1, class49.field698, var17.field4255, var17.field4264);
                        class67.method448(class49.field698, var17.field4255, var17.field4264, var17.field4219, (var18 - 1) * 64 + 60, var17, var17.field4196, var15, var17.field4247);
                    } else {
                        var17.field5227 = false;
                        var17.field4229 = false;
                        var17.field4219 = class123.method889(1, class49.field698, var17.field4255, var17.field4264);
                        class247.method1762(class49.field698, var17.field4255, var17.field4264, var17.field4219, var17, var17.field4196, var15, var17.field4249, var17.field4186, var17.field4235, var17.field4227);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)I", line = 294)
    public static final int method114(int arg0, byte arg1, int arg2) {
        field300++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 > -14) {
            method115(-63);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 318)
    public static void method115(int arg0) {
        if (arg0 == -201) {
            field301 = null;
            field308 = null;
            field307 = null;
        }
    }
}
