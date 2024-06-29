import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class83 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[B")
    public byte[] field1185;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[B")
    public byte[] field1189;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)I")
    public static final int method703(byte arg0, int arg1, int arg2) {
        field1192++;
        if (arg0 >= -115) {
            return 55;
        } else if (arg1 == 1 || arg1 == 3) {
            return class57.field840[arg2 & 0x3];
        } else {
            return class263.field3784[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method704(byte arg0, Throwable arg1, String arg2) {
        field1196++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class13.method74((byte) -124, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class135.method1001((byte) -59, var3);
            String var4 = class466.method2776(var3, "%3a", 0, ":");
            String var5 = class466.method2776(var4, "%40", 0, "@");
            String var6 = class466.method2776(var5, "%26", 0, "&");
            String var7 = class466.method2776(var6, "%23", 0, "#");
            if (class15.field148.field960 != null) {
                if (arg0 <= 91) {
                    method704((byte) -92, (Throwable) null, (String) null);
                }
                class275 var8 = class15.field148.method608(new URL(class15.field148.field960.getCodeBase(), "clienterror.ws?c=" + class53.field774 + "&u=" + class393.field5435 + "&v1=" + class65.field958 + "&v2=" + class65.field954 + "&e=" + var7), (byte) 58);
                while (var8.field3979 == 0) {
                    class89.method752(0, 1L);
                }
                if (var8.field3979 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3984;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lae;Lae;I)V")
    public static final void method705(class172 arg0, class172 arg1, int arg2) {
        class200.field2965++;
        class336.method2111(class266.field3831, 99);
        field1194++;
        class311.field4403.method1177(arg1.field2543, arg2 - 68);
        class311.field4403.method1194(-13965, arg0.field2543);
        if (arg2 == 1) {
            class311.field4403.method1150(-126, arg1.field2483);
            class311.field4403.method1150(42, arg0.field2527);
            class311.field4403.method1173(arg1.field2527, (byte) 122);
            class311.field4403.method1173(arg0.field2483, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/lang/String;B)I")
    public static final int method706(int arg0, String arg1, byte arg2) {
        field1186++;
        return arg2 == -7 ? class427.method2552(arg1, arg0, true, (byte) -124) : 40;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method707(boolean arg0, int arg1, int arg2, int arg3) {
        field1195++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var9 = arg3;
                arg3 /= arg1;
                int var10 = var9 - arg1 * arg3;
                if (var10 < 10) {
                    var6[var7] = (char) (var10 + 48);
                } else {
                    var6[var7] = (char) (var10 + 87);
                }
            }
            int var8 = -9 / ((arg2 - 24) / 49);
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }
}
