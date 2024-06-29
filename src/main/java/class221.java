import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class221 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Li;")
    private static class88 field4170 = class208.method1425(105, "Drop");

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Li;")
    public static class88 field4173 = field4170;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "S")
    public static short field4177 = 256;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[I")
    public static int[] field4171;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
    public static int[] field4175;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    public static int[] field4176;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1490(byte arg0, String arg1, Throwable arg2) {
        field4178++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class175.method1258(-66, arg2);
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
            if (class6.field93.field3599 != null && arg0 == 0) {
                class163 var8 = class6.field93.method1295(false, new URL(class6.field93.field3599.getCodeBase(), "clienterror.ws?c=" + class225.field4228 + "&u=" + class36.field631 + "&v1=" + class181.field3596 + "&v2=" + class181.field3593 + "&e=" + var7));
                while (var8.field3136 == 0) {
                    class21.method98(1L, (byte) 38);
                }
                if (var8.field3136 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3131;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
    public static final boolean method1491(int arg0, int arg1) {
        field4174++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else {
            if (arg0 != 7123) {
                method1492(null, null, (byte) 62, null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Li;Li;BLnb;)Lrc;")
    public static final class188 method1492(class88 arg0, class88 arg1, byte arg2, class144 arg3) {
        int var4 = arg3.method966(arg0, (byte) -3);
        field4179++;
        int var5 = arg3.method968(arg1, var4, 105);
        int var6 = -102 % ((arg2 - 31) / 47);
        return class234.method1560(arg3, false, var4, var5);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1493(int arg0) {
        field4175 = null;
        field4170 = null;
        field4176 = null;
        field4171 = null;
        int var1 = -73 % ((arg0 + 35) / 44);
        field4173 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Li;Z)Li;")
    public static final class88 method1494(class88 arg0, boolean arg1) {
        field4180++;
        class244 var2 = class33.method207((byte) 127, arg0);
        if (arg1) {
            return null;
        } else if (var2 == null) {
            return class59.field1113;
        } else {
            return var2.field4488;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static final void method1495(int arg0) {
        field4172++;
        class88.field1640.method1163(0, 0);
        class105.field1903.method1163(382, 0);
        if (arg0 == 35) {
            class208.field3948.method878(382 - class208.field3948.field2436 / 2, 18);
        }
    }
}
