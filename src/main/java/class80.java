import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class80 extends class254 {

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1238 = "Loaded title screen";

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "Z")
    public static boolean field1244 = false;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1233 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "B")
    public byte field1245;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient;")
    public static client field1237;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1247;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Ljava/lang/String;")
    public String field1236;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Ljava/lang/String;")
    public String field1240;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[Lwi;")
    public static class229[] field1243;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)I")
    public static final int method533(byte arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0xD5555555);
        field1242++;
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 < 73) {
            field1243 = null;
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method534(byte arg0) {
        field1247 = null;
        field1237 = null;
        field1243 = null;
        field1238 = null;
        if (arg0 > -84) {
            method533((byte) 120, 91);
        }
        field1233 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 15) {
            field1243 = null;
        }
        field1246++;
        if (arg0 == arg4 && arg1 == arg6 && arg7 == arg9 && arg2 == arg8) {
            class225.method1472(arg0, arg3, (byte) 113, arg9, arg6, arg2);
            return;
        }
        int var10 = arg0;
        int var11 = arg6;
        int var12 = arg0 * 3;
        int var13 = arg6 * 3;
        int var14 = arg4 * 3;
        int var15 = arg1 * 3;
        int var16 = arg7 * 3;
        int var17 = var14 + arg9 - var16 - arg0;
        int var18 = arg8 * 3;
        int var19 = var15 + arg2 - var18 - arg6;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var14 - var12;
        int var22 = var13 + var18 - var15 - var15;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var17 * var26;
            int var29 = var22 * var25;
            int var30 = var23 * var24;
            int var31 = var21 * var24;
            int var32 = (var27 + var29 + var30 >> 12) + arg6;
            int var33 = var20 * var25;
            int var34 = (var28 + var33 + var31 >> 12) + arg0;
            class225.method1472(var10, arg3, (byte) 116, var34, var11, var32);
            var10 = var34;
            var11 = var32;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IZI)Z")
    public static final boolean method536(String arg0, int arg1, boolean arg2, int arg3) {
        field1239++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        if (arg1 <= 60) {
            method535(115, -2, 29, -17, 78, (byte) -42, 95, -15, 79, -106);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
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
            if (arg3 <= var11) {
                return false;
            }
            if (var5) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                return false;
            }
            var6 = var10;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lha;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method537(class267 arg0, int arg1, String arg2) {
        if (arg2.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class93.field1419 != null) {
                                                            if (class93.field1419.field3585 == null) {
                                                                var9 = class32.method230(true, class93.field1419.field3584);
                                                            } else {
                                                                var9 = (String) class93.field1419.field3585;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class22.method162(-99, class227.method1483(true, 4, arg0)) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class22.method162(-127, class227.method1483(true, 3, arg0)) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class22.method162(-108, class227.method1483(true, 2, arg0)) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class22.method162(-119, class227.method1483(true, 1, arg0)) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class22.method162(-107, class227.method1483(true, 0, arg0)) + arg2.substring(var3 + 2);
            }
        }
        field1241++;
        if (arg1 >= -23) {
            method533((byte) 89, 103);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZZ)I")
    public static final int method538(int arg0, int arg1, boolean arg2, boolean arg3) {
        field1234++;
        class255 var4 = (class255) class168.field2428.method1218((long) arg1, -33);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field3867.length; var6++) {
            if (var4.field3867[var6] >= 0 && class31.field460 > var4.field3867[var6]) {
                class273 var7 = class259.method1735(var4.field3867[var6], -14667);
                if (var7.field4349 != null) {
                    class64 var8 = (class64) var7.field4349.method1218((long) arg0, -101);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field3871[var6] * var8.field1015;
                        } else {
                            var5 += var8.field1015;
                        }
                    }
                }
            }
        }
        if (arg2) {
            field1233 = null;
        }
        return var5;
    }
}
