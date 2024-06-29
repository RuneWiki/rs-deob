import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 extends class34 {

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "[B")
    public byte[] field102;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "Lke;")
    private static class256 field104 = class316.method2202("Continue", 27626);

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "[I")
    public static int[] field103 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "Lke;")
    private static class256 field111 = class316.method2202("You can(Wt add yourself to your own friend list)3", 27626);

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "[Lke;")
    public static class256[] field115 = new class256[1000];

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Lke;")
    public static class256 field105 = field111;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "Lke;")
    public static class256 field117 = field104;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lke;")
    public static class256 field119 = class316.method2202("mapdots", 27626);

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "Lla;")
    public static class188 field112;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([B)V", line = 11)
    public class7(byte[] arg0) {
        this.field102 = arg0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V", line = 30)
    public static final void method48(String arg0, byte arg1, Throwable arg2) {
        field118++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class286.method2002(arg2, 118);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class23.method148(var3, true);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (arg1 < 74) {
                method52((byte) 122, 110, true, -106);
            }
            if (class289.field4995.field52 == null) {
                return;
            }
            class82 var8 = class289.field4995.method23(new URL(class289.field4995.field52.getCodeBase(), "clienterror.ws?c=" + class292.field5050 + "&u=" + class62.field1103 + "&v1=" + class4.field53 + "&v2=" + class4.field67 + "&e=" + var7), (byte) 92);
            while (var8.field1500 == 0) {
                class46.method381(1L, -109);
            }
            if (var8.field1500 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field1499;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V", line = 88)
    public static final void method49(int arg0) {
        for (class32 var1 = (class32) class124.field2196.method1270((byte) -121); var1 != null; var1 = (class32) class124.field2196.method1277(1)) {
            if (var1.field512 > 0) {
                var1.field512--;
            }
            if (var1.field512 != 0) {
                if (var1.field524 > 0) {
                    var1.field524--;
                }
                if (var1.field524 == 0 && var1.field525 >= 1 && var1.field514 >= 1 && var1.field525 <= 102 && var1.field514 <= 102 && (var1.field518 < 0 || class311.method2158(var1.field518, 4, var1.field511))) {
                    class144.method1055(var1.field520, 1, var1.field514, var1.field517, var1.field511, var1.field518, var1.field526, var1.field525);
                    var1.field524 = -1;
                    if (var1.field521 == var1.field518 && var1.field521 == -1) {
                        var1.method1199(21966);
                    } else if (var1.field521 == var1.field518 && var1.field520 == var1.field515 && var1.field513 == var1.field511) {
                        var1.method1199(21966);
                    }
                }
            } else if (var1.field521 < 0 || class311.method2158(var1.field521, 4, var1.field513)) {
                class144.method1055(var1.field515, 1, var1.field514, var1.field517, var1.field513, var1.field521, var1.field526, var1.field525);
                var1.method1199(21966);
            }
        }
        field114++;
        if (arg0 < 58) {
            method51(true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lra;II)Lke;", line = 146)
    public static final class256 method50(class41 arg0, int arg1, int arg2) {
        field106++;
        try {
            class256 var3 = new class256();
            var3.field4384 = arg0.method354((byte) -126);
            if (var3.field4384 > arg2) {
                var3.field4384 = arg2;
            }
            var3.field4380 = new byte[var3.field4384];
            arg0.field738 += class287.field4977.method1700(var3.field4380, (byte) 74, arg0.field738, arg0.field772, arg1, var3.field4384);
            return var3;
        } catch (Exception var5) {
            return class46.field845;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)V", line = 204)
    public static void method51(boolean arg0) {
        field115 = null;
        field111 = null;
        field112 = null;
        if (arg0) {
            return;
        }
        field104 = null;
        field103 = null;
        field105 = null;
        field119 = null;
        field117 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BIZI)Lke;", line = 226)
    public static final class256 method52(byte arg0, int arg1, boolean arg2, int arg3) {
        field108++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = arg3 / arg1;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg1;
        }
        int var6 = var5;
        if (arg3 < 0 || arg2) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        int var8 = 0;
        int var9 = -38 / ((-arg0 - 15) / 39);
        while (var5 > var8) {
            int var10 = arg3 % arg1;
            arg3 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            var8++;
        }
        class256 var11 = new class256();
        var11.field4380 = var7;
        var11.field4384 = var6;
        return var11;
    }
}
