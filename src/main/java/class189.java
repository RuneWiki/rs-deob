import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class189 {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public int field2965 = -1;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public int field2974 = -1;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[I")
    public static int[] field2966 = new int[32];

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Lec;")
    public static class99 field2972 = new class99(64);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
    public int[] field2968;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[[[B")
    public static byte[][][] field2970;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;", line = 5)
    public static final String method1395(String arg0, String arg1, String arg2, byte arg3) {
        field2975++;
        if (arg3 < 119) {
            method1401(true, (Throwable) null, (String) null);
        }
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, arg2.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(arg0.length() + var4);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILwm;I)V", line = 35)
    public final void method1396(int arg0, class254 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1774((byte) 66);
            if (var4 == 0) {
                if (arg0 >= -4) {
                    method1398(true);
                }
                field2969++;
                return;
            }
            this.method1397(arg1, var4, 1204696327, arg2);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lwm;III)V", line = 52)
    private final void method1397(class254 arg0, int arg1, int arg2, int arg3) {
        field2963++;
        if (arg2 != 1204696327) {
            this.method1396(-85, (class254) null, 71);
        }
        if (arg1 == 1) {
            this.field2974 = arg0.method1755(false);
        } else if (arg1 == 2) {
            this.field2968 = new int[arg0.method1774((byte) -128)];
            for (int var5 = 0; var5 < this.field2968.length; var5++) {
                this.field2968[var5] = arg0.method1755(false);
            }
        } else if (arg1 == 3) {
            this.field2965 = arg0.method1774((byte) 113);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 89)
    public static void method1398(boolean arg0) {
        field2970 = (byte[][][]) null;
        field2972 = null;
        if (arg0) {
            field2966 = (int[]) null;
        }
        field2966 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLjava/lang/String;IZBIJZILjava/lang/String;I)V", line = 102)
    public static final void method1399(boolean arg0, String arg1, int arg2, boolean arg3, byte arg4, int arg5, long arg6, boolean arg7, int arg8, String arg9, int arg10) {
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        field2971++;
        int var14 = 42 % ((arg4 + 22) / 40);
        class254 var15 = new class254(128);
        var15.method1752(10, -80);
        var15.method1744(true, (arg3 ? 1 : 0) | (arg7 ? 2 : 0) | (arg0 ? 4 : 0));
        var15.method1738((byte) 110, arg6);
        var15.method1773(var12[0], false);
        var15.method1766(0, arg1);
        var15.method1773(var12[1], false);
        var15.method1744(true, class76.field1109);
        var15.method1752(arg10, -115);
        var15.method1752(arg2, -83);
        var15.method1773(var12[2], false);
        var15.method1744(true, arg5);
        var15.method1744(true, arg8);
        var15.method1773(var12[3], false);
        var15.method1781(class177.field2826, 0, class327.field5048);
        class254 var16 = new class254(350);
        var16.method1766(0, arg9);
        int var17 = 8 - (class308.method2108(12146, arg9) % 8);
        for (int var18 = 0; var18 < var17; var18++) {
            var16.method1752((int) (Math.random() * 255.0D), -99);
        }
        var16.method1786(var12, (byte) -110);
        class85.field1236.field3866 = 0;
        class85.field1236.method1752(22, -123);
        class85.field1236.method1744(true, var15.field3866 + var16.field3866 + 2);
        class85.field1236.method1744(true, 543);
        class85.field1236.method1759(-91, var15.field3840, 0, var15.field3866);
        class85.field1236.method1759(-91, var16.field3840, 0, var16.field3866);
        class324.field5004 = 0;
        class338.field5251 = -3;
        class257.field3929 = 0;
        class38.field564 = 1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V", line = 165)
    public static final void method1400(int arg0, int arg1) {
        field2964++;
        int var2 = class234.field3563;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class270 var4;
            if (arg0 == 0) {
                var4 = class39.field575;
            } else {
                var4 = class201.field3096[class291.field4475[var3]];
            }
            if (var4 != null && var4.method598(-31)) {
                int var5 = var4.method1897(8);
                if (arg0 == 0 || arg0 == var5) {
                    if (var5 == 1) {
                        if ((var4.field4713 & 0x7F) == 64 && (var4.field4731 & 0x7F) == 64) {
                            int var12 = var4.field4713 >> 7;
                            int var13 = var4.field4731 >> 7;
                            if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                                var10002 = class112.field1694[var12][var13]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field4713 & 0x7F) == 0 && (var4.field4731 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field4713 & 0x7F) == 64 && (var4.field4731 & 0x7F) == 64)) {
                        int var6 = var4.field4731 - var5 * 64 >> 7;
                        int var7 = var4.field4713 - (var5 * 64) >> 7;
                        int var8 = var7 + var4.method1897(arg1 ^ 0x9);
                        int var9 = var4.method1897(8) + var6;
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        if (var8 > 104) {
                            var8 = 104;
                        }
                        if (var6 < 0) {
                            var6 = 0;
                        }
                        if (var9 > 104) {
                            var9 = 104;
                        }
                        for (int var10 = var7; var10 < var8; var10++) {
                            for (int var11 = var6; var11 < var9; var11++) {
                                var10002 = class112.field1694[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
        label223: for (int var14 = 0; var14 < var2; var14++) {
            class270 var15;
            long var16;
            if (arg0 == 0) {
                var15 = class39.field575;
                var16 = 8791798054912L;
            } else {
                var16 = (long) class291.field4475[var14] << 32;
                var15 = class201.field3096[class291.field4475[var14]];
            }
            if (var15 != null && var15.method598(arg1 ^ 0xFFFFFF99)) {
                int var18 = var15.method1897(8);
                if (arg0 == 0 || arg0 == var18) {
                    var15.field4197 = false;
                    var15.field4680 = true;
                    if ((class267.field4149 && class234.field3563 > 200 || class234.field3563 > 50) && arg0 != 0 && var15.field4765 == var15.method2099(111).field3988) {
                        var15.field4197 = true;
                    }
                    if (var18 == 1) {
                        if ((var15.field4713 & 0x7F) == 64 && (var15.field4731 & 0x7F) == 64) {
                            int var19 = var15.field4713 >> 7;
                            int var20 = var15.field4731 >> 7;
                            if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                                continue;
                            }
                            if (class112.field1694[var19][var20] > 1) {
                                var10002 = class112.field1694[var19][var20]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var15.field4713 & 0x7F) == 0 && (var15.field4731 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field4713 & 0x7F) == 64 && (var15.field4731 & 0x7F) == 0) {
                        int var21 = var15.field4713 - (var18 * 64) >> 7;
                        int var22 = var15.field4731 - (var18 * 64) >> 7;
                        int var23 = var18 + var21;
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        int var24 = var18 + var22;
                        boolean var25 = true;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        for (int var26 = var21; var26 < var23; var26++) {
                            for (int var27 = var22; var27 < var24; var27++) {
                                if (class112.field1694[var26][var27] <= 1) {
                                    var25 = false;
                                    break;
                                }
                            }
                        }
                        if (var25) {
                            int var28 = var21;
                            while (true) {
                                if (var23 <= var28) {
                                    continue label223;
                                }
                                for (int var29 = var22; var29 < var24; var29++) {
                                    var10002 = class112.field1694[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var15.field4729 == null || var15.field4686 > class233.field3542 || var15.field4689 <= class233.field3542) {
                        var15.field4680 = false;
                        var15.field4732 = class328.method2291(class265.field4112, var15.field4731, var15.field4713, 120);
                        class114.method874(class265.field4112, var15.field4713, var15.field4731, var15.field4732, var18 * 64 + 60 - 64, var15, var15.field4682, var16, var15.field4683);
                    } else {
                        var15.field4197 = false;
                        var15.field4680 = false;
                        var15.field4732 = class328.method2291(class265.field4112, var15.field4731, var15.field4713, 109);
                        class154.method1162(class265.field4112, var15.field4713, var15.field4731, var15.field4732, var15, var15.field4682, var16, var15.field4704, var15.field4714, var15.field4721, var15.field4768);
                    }
                }
            }
        }
        if (arg1 != 1) {
            method1401(false, (Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/lang/String;)V", line = 424)
    public static final void method1401(boolean arg0, Throwable arg1, String arg2) {
        field2973++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class78.method610(!arg0, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            if (!arg0) {
                return;
            }
            class120.method908(-119, var3);
            String var4 = method1395(":", var3, "%3a", (byte) 127);
            String var5 = method1395("@", var4, "%40", (byte) 123);
            String var6 = method1395("&", var5, "%26", (byte) 127);
            String var7 = method1395("#", var6, "%23", (byte) 122);
            if (class51.field692.field95 == null) {
                return;
            }
            class208 var8 = class51.field692.method54(8, new URL(class51.field692.field95.getCodeBase(), "clienterror.ws?c=" + class144.field2211 + "&u=" + class273.field4259 + "&v1=" + class6.field90 + "&v2=" + class6.field99 + "&e=" + var7));
            while (var8.field3185 == 0) {
                class324.method2252(-24861, 1L);
            }
            if (var8.field3185 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3186;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIILfc;IJ)Z", line = 479)
    public static final boolean method1402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class110 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class279.method1934(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
