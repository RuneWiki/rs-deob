import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class98 extends class86 {

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "Lma;")
    public static class5 field1472 = class12.method119("Untersuchen", (byte) 113);

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "[Lbd;")
    public static class27[] field1471 = new class27[27];

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field1474 = 0;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lma;")
    public static class5 field1468 = class12.method119("p11_full", (byte) 68);

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "F")
    public static float field1473;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lii;I)Lpl;", line = 23)
    public static final class264 method629(class221 arg0, int arg1) {
        arg0.method1509(true);
        field1469++;
        int var2 = arg0.method1509(true);
        class264 var3 = class155.method993(2514, var2);
        var3.field4528 = arg0.method1509(true);
        int var4 = arg0.method1509(true);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1509(true);
            var3.method4(var6, -50, arg0);
        }
        var3.method111(-114);
        return arg1 == -4097 ? var3 : (class264) null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 65)
    public static final void method630(String arg0, int arg1, Throwable arg2) {
        field1475++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class92.method603((byte) 120, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            if (arg1 > -75) {
                method631((byte) -123);
            }
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class230.field3813.field2262 == null) {
                return;
            }
            class32 var8 = class230.field3813.method981((byte) -13, new URL(class230.field3813.field2262.getCodeBase(), "clienterror.ws?c=" + class230.field3823 + "&u=" + class47.field729 + "&v1=" + class154.field2280 + "&v2=" + class154.field2271 + "&e=" + var7));
            while (var8.field497 == 0) {
                class116.method759(-1, 1L);
            }
            if (var8.field497 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field496;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V", line = 117)
    public static void method631(byte arg0) {
        field1471 = null;
        field1472 = null;
        field1468 = null;
        if (arg0 != 60) {
            method632(22, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[B)V", line = 166)
    public static final void method632(int arg0, byte[] arg1) {
        field1470++;
        class221 var2 = new class221(arg1);
        if (arg0 != -4096) {
            field1468 = (class5) null;
        }
        var2.field3610 = arg1.length - 2;
        class79.field1221 = var2.method1524((byte) 115);
        class112.field1665 = new int[class79.field1221];
        class179.field2718 = new int[class79.field1221];
        class37.field590 = new byte[class79.field1221][];
        class70.field1115 = new boolean[class79.field1221];
        class287.field4836 = new int[class79.field1221];
        class67.field1047 = new byte[class79.field1221][];
        class88.field1315 = new int[class79.field1221];
        var2.field3610 = arg1.length - (class79.field1221 * 8) - 7;
        class282.field4786 = var2.method1524((byte) 67);
        class281.field4765 = var2.method1524((byte) 119);
        int var3 = (var2.method1509(true) & 0xFF) + 1;
        for (int var4 = 0; var4 < class79.field1221; var4++) {
            class88.field1315[var4] = var2.method1524((byte) 115);
        }
        for (int var5 = 0; var5 < class79.field1221; var5++) {
            class287.field4836[var5] = var2.method1524((byte) 39);
        }
        for (int var6 = 0; var6 < class79.field1221; var6++) {
            class112.field1665[var6] = var2.method1524((byte) 100);
        }
        for (int var7 = 0; var7 < class79.field1221; var7++) {
            class179.field2718[var7] = var2.method1524((byte) 79);
        }
        var2.field3610 = arg1.length + 3 - class79.field1221 * 8 - (var3 * 3) - 7;
        class268.field4610 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class268.field4610[var8] = var2.method1497(3610);
            if (class268.field4610[var8] == 0) {
                class268.field4610[var8] = 1;
            }
        }
        var2.field3610 = 0;
        for (int var9 = 0; var9 < class79.field1221; var9++) {
            int var10 = class179.field2718[var9];
            int var11 = class112.field1665[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class37.field590[var9] = var13;
            class67.field1047[var9] = var15;
            int var16 = var2.method1509(true);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1543(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var15[var23] = var2.method1543(false);
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label91: while (true) {
                    if (var17 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var11) {
                                break label91;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var15[var11 * var20 + var19] = var2.method1543(false);
                                var14 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var13[var11 * var18 + var17] = var2.method1543(false);
                    }
                    var17++;
                }
            }
            class70.field1115[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Lng;", line = 330)
    public static final class133 method633(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class133 var4 = var3.field3144;
            var3.field3144 = null;
            return var4;
        }
    }
}
