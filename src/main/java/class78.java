import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class78 {

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1444 = 0;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lcc;")
    private static class209 field1440 = class95.method669(103, "Allocated memory");

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lcc;")
    public static class209 field1443 = field1440;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Z")
    public static boolean field1447 = false;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V")
    public static final void method543() {
        class153.field2772 = 0;
        label191: for (int var0 = 0; var0 < class117.field2358; var0++) {
            class53 var1 = class124.field2420[var0];
            if (class52.field1023 != null) {
                for (int var2 = 0; var2 < class52.field1023.length; var2++) {
                    if (class52.field1023[var2] != -1000000 && (var1.field1048 <= class52.field1023[var2] || var1.field1036 <= class52.field1023[var2]) && (var1.field1058 <= class45.field894[var2] || var1.field1052 <= class45.field894[var2]) && (var1.field1058 >= class266.field4787[var2] || var1.field1052 >= class266.field4787[var2]) && (var1.field1042 <= class28.field499[var2] || var1.field1038 <= class28.field499[var2]) && (var1.field1042 >= class214.field3866[var2] || var1.field1038 >= class214.field3866[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field1057 == 1) {
                int var3 = var1.field1059 + class11.field222 - class20.field390;
                if (var3 >= 0 && var3 <= class11.field222 + class11.field222) {
                    int var4 = var1.field1037 + class11.field222 - class126.field2442;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1050 + class11.field222 - class126.field2442;
                    if (var5 > class11.field222 + class11.field222) {
                        var5 = class11.field222 + class11.field222;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class160.field2909[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class272.field4824 - var1.field1058;
                        if (var7 > 32) {
                            var1.field1053 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1053 = 2;
                            var7 = -var7;
                        }
                        var1.field1049 = (var1.field1042 - class87.field1732 << 8) / var7;
                        var1.field1046 = (var1.field1038 - class87.field1732 << 8) / var7;
                        var1.field1055 = (var1.field1048 - class215.field3878 << 8) / var7;
                        var1.field1043 = (var1.field1036 - class215.field3878 << 8) / var7;
                        class251.field4512[class153.field2772++] = var1;
                    }
                }
            } else if (var1.field1057 == 2) {
                int var8 = var1.field1037 + class11.field222 - class126.field2442;
                if (var8 >= 0 && var8 <= class11.field222 + class11.field222) {
                    int var9 = var1.field1059 + class11.field222 - class20.field390;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1051 + class11.field222 - class20.field390;
                    if (var10 > class11.field222 + class11.field222) {
                        var10 = class11.field222 + class11.field222;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class160.field2909[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class87.field1732 - var1.field1042;
                        if (var12 > 32) {
                            var1.field1053 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1053 = 4;
                            var12 = -var12;
                        }
                        var1.field1044 = (var1.field1058 - class272.field4824 << 8) / var12;
                        var1.field1054 = (var1.field1052 - class272.field4824 << 8) / var12;
                        var1.field1055 = (var1.field1048 - class215.field3878 << 8) / var12;
                        var1.field1043 = (var1.field1036 - class215.field3878 << 8) / var12;
                        class251.field4512[class153.field2772++] = var1;
                    }
                }
            } else if (var1.field1057 == 4) {
                int var13 = var1.field1048 - class215.field3878;
                if (var13 > 128) {
                    int var14 = var1.field1037 + class11.field222 - class126.field2442;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1050 + class11.field222 - class126.field2442;
                    if (var15 > class11.field222 + class11.field222) {
                        var15 = class11.field222 + class11.field222;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1059 + class11.field222 - class20.field390;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1051 + class11.field222 - class20.field390;
                        if (var17 > class11.field222 + class11.field222) {
                            var17 = class11.field222 + class11.field222;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class160.field2909[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1053 = 5;
                            var1.field1044 = (var1.field1058 - class272.field4824 << 8) / var13;
                            var1.field1054 = (var1.field1052 - class272.field4824 << 8) / var13;
                            var1.field1049 = (var1.field1042 - class87.field1732 << 8) / var13;
                            var1.field1046 = (var1.field1038 - class87.field1732 << 8) / var13;
                            class251.field4512[class153.field2772++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public static final void method544(int arg0, int arg1) {
        field1445++;
        if (arg0 == -19338) {
            class108.field2184.method662(arg0 ^ 0xFFFF3476, arg1);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method545(byte arg0) {
        field1440 = null;
        int var1 = -66 % ((-arg0 - 75) / 41);
        field1443 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[Lcc;[S)V")
    public static final void method546(int arg0, class209[] arg1, short[] arg2) {
        class54.method401(arg1, false, arg0, arg2, arg1.length - 1);
        field1442++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Lbf;")
    public static final class199 method547(int arg0, int arg1) {
        field1438++;
        class199 var2 = (class199) class108.field2184.method670((byte) -80, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field1236.method353(arg0, arg1 ^ 0xFFFFFFD8, arg1);
        class199 var4 = new class199();
        if (var3 != null) {
            var4.method1363(new class106(var3), (byte) -85);
        }
        class108.field2184.method673((long) arg0, -5087, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method548(byte arg0, String arg1, Throwable arg2) {
        field1439++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class229.method1606(arg2, -17337);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class171.field3130.field2638 != null) {
                if (arg0 != -17) {
                    field1447 = true;
                }
                class203 var8 = class171.field3130.method1001(new URL(class171.field3130.field2638.getCodeBase(), "clienterror.ws?c=" + class237.field4301 + "&u=" + class265.field4761 + "&v1=" + class143.field2643 + "&v2=" + class143.field2637 + "&e=" + var7), 0);
                while (var8.field3646 == 0) {
                    class174.method1196((byte) 89, 1L);
                }
                if (var8.field3646 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3642;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)Ld;")
    public static final class237 method549(int arg0, int arg1) {
        field1441++;
        class237 var2 = (class237) class285.field5025.method670((byte) -67, (long) arg1);
        if (arg0 < 66) {
            method545((byte) 95);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class284.field5003.method353(class185.method1262(arg1, (byte) 119), -30, class132.method931(10500, arg1));
        class237 var4 = new class237();
        var4.field4255 = arg1;
        if (var3 != null) {
            var4.method1642((byte) 90, new class106(var3));
        }
        var4.method1647(114);
        class285.field5025.method673((long) arg1, -5087, var4);
        return var4;
    }
}
