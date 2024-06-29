import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class76 extends class62 {

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "Z")
    public static boolean field1205 = false;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "Lhl;")
    public static class139 field1207 = new class139(200);

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "Luj;")
    public static class225 field1214 = new class225(5000);

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1215 = "Loaded wordpack";

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method604(int arg0, Throwable arg1) throws IOException {
        field1211++;
        String var3;
        if (arg1 instanceof class18) {
            class18 var2 = (class18) arg1;
            arg1 = var2.field328;
            var3 = var2.field321 + " | ";
        } else {
            var3 = "";
        }
        if (arg0 != -5) {
            field1214 = null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Z")
    public static final boolean method605(byte arg0, int arg1) {
        field1213++;
        if (class202.field3050 == arg1) {
            return false;
        }
        if (arg0 != -77) {
            field1205 = true;
        }
        class273.field4231 = new int[104][104];
        class195.field2952 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class243.field3763[var2] = new class78(104, 104);
        }
        class202.field3050 = arg1;
        class247.field3844 = new byte[4][104][104];
        class235.field3614 = new class284[4][104][104];
        class50.field813 = new byte[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public static void method606(int arg0) {
        if (arg0 != 0) {
            field1215 = null;
        }
        field1207 = null;
        field1215 = null;
        field1214 = null;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)I")
    public static final int method607(int arg0) {
        field1210++;
        try {
            if (class261.field4019 == 0) {
                if (class1.field31 > class257.method1736(14361) - 5000L) {
                    return 0;
                }
                class106.field1564 = class217.field3338.method187(class113.field1737, class110.field1662, -19);
                class153.field2240 = class257.method1736(14361);
                class261.field4019 = 1;
            }
            if (class153.field2240 + 30000L < class257.method1736(14361)) {
                return class64.method519(1000, (byte) -37);
            }
            if (class261.field4019 == 1) {
                if (class106.field1564.field713 == 2) {
                    return class64.method519(1001, (byte) -37);
                }
                if (class106.field1564.field713 != 1) {
                    return -1;
                }
                class22.field369 = new class253((Socket) class106.field1564.field709, class217.field3338);
                class59.field964.field887 = 0;
                class106.field1564 = null;
                int var1 = 0;
                if (class49.field807) {
                    var1 = class159.field2318;
                }
                class59.field964.method437(true, 23);
                class59.field964.method453((byte) 127, var1);
                class22.field369.method1715(class59.field964.field848, 124, 0, class59.field964.field887);
                if (class182.field2648 != null) {
                    class182.field2648.method799(false);
                }
                if (class258.field3961 != null) {
                    class258.field3961.method799(false);
                }
                int var2 = class22.field369.method1726((byte) 126);
                if (class182.field2648 != null) {
                    class182.field2648.method799(false);
                }
                if (class258.field3961 != null) {
                    class258.field3961.method799(false);
                }
                if (var2 != 0) {
                    return class64.method519(var2, (byte) -37);
                }
                class261.field4019 = 2;
            }
            if (class261.field4019 == 2) {
                if (class22.field369.method1725(0) < 2) {
                    return -1;
                }
                class172.field2519 = class22.field369.method1726((byte) 127);
                class172.field2519 <<= 0x8;
                class172.field2519 += class22.field369.method1726((byte) 126);
                class224.field3490 = new byte[class172.field2519];
                class100.field1458 = 0;
                class261.field4019 = 3;
            }
            int var3 = 110 % ((arg0 + 64) / 59);
            if (class261.field4019 != 3) {
                return -1;
            }
            int var4 = class22.field369.method1725(0);
            if (var4 < 1) {
                return -1;
            }
            if (var4 > (class172.field2519 - class100.field1458)) {
                var4 = class172.field2519 - class100.field1458;
            }
            class22.field369.method1723(var4, class224.field3490, class100.field1458, (byte) -110);
            class100.field1458 += var4;
            if (class172.field2519 > class100.field1458) {
                return -1;
            } else if (class151.method1025((byte) 127, class224.field3490)) {
                int var5 = 0;
                class101.field1471 = new class293[class66.field1095];
                for (int var6 = class136.field1987; var6 <= class172.field2523; var6++) {
                    class293 var7 = class149.method1013(var6, true);
                    if (var7 != null) {
                        class101.field1471[var5++] = var7;
                    }
                }
                class22.field369.method1718(-17492);
                class164.field2394 = 0;
                class22.field369 = null;
                class261.field4019 = 0;
                class224.field3490 = null;
                class1.field31 = class257.method1736(14361);
                return 0;
            } else {
                return class64.method519(1002, (byte) -37);
            }
        } catch (IOException var8) {
            return class64.method519(1003, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILpk;)V")
    public static final void method608(int arg0, class237 arg1) {
        field1206++;
        if (arg0 < 114) {
            method606(36);
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public static final void method609(int arg0) {
        field1208++;
        class173.field2543.method1541((byte) 71);
        int var1 = class173.field2543.method1544(arg0 - 32393, 8);
        if (class207.field3093 > var1) {
            for (int var2 = var1; var2 < class207.field3093; var2++) {
                class83.field1279[class213.field3277++] = class285.field4379[var2];
            }
        }
        if (arg0 != 32310) {
            return;
        }
        if (class207.field3093 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class207.field3093 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class285.field4379[var3];
            class87 var5 = class243.field3762[var4];
            int var6 = class173.field2543.method1544(75, 1);
            if (var6 == 0) {
                class285.field4379[class207.field3093++] = var4;
                var5.field486 = class120.field1794;
            } else {
                int var7 = class173.field2543.method1544(74, 2);
                if (var7 == 0) {
                    class285.field4379[class207.field3093++] = var4;
                    var5.field486 = class120.field1794;
                    class148.field2149[class165.field2426++] = var4;
                } else if (var7 == 1) {
                    class285.field4379[class207.field3093++] = var4;
                    var5.field486 = class120.field1794;
                    int var8 = class173.field2543.method1544(arg0 ^ 0x7E71, 3);
                    var5.method164(1, 18524, var8);
                    int var9 = class173.field2543.method1544(arg0 - 32209, 1);
                    if (var9 == 1) {
                        class148.field2149[class165.field2426++] = var4;
                    }
                } else if (var7 == 2) {
                    class285.field4379[class207.field3093++] = var4;
                    var5.field486 = class120.field1794;
                    if (class173.field2543.method1544(arg0 ^ 0xFFFF81F7, 1) == 1) {
                        int var10 = class173.field2543.method1544(arg0 - 32192, 3);
                        var5.method164(2, 18524, var10);
                        int var11 = class173.field2543.method1544(85, 3);
                        var5.method164(2, 18524, var11);
                    } else {
                        int var12 = class173.field2543.method1544(arg0 - 32420, 3);
                        var5.method164(0, 18524, var12);
                    }
                    int var13 = class173.field2543.method1544(-116, 1);
                    if (var13 == 1) {
                        class148.field2149[class165.field2426++] = var4;
                    }
                } else if (var7 == 3) {
                    class83.field1279[class213.field3277++] = var4;
                }
            }
        }
    }
}
