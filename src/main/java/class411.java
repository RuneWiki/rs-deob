import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class411 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6116 = null;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field6120 = 0;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[I")
    public static int[] field6115 = new int[2048];

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Z")
    public static boolean field6119 = false;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[C")
    public static char[] field6124 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field6118;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field6122;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field6123;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field6125;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[S")
    public static short[] field6117;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lfq;")
    public static final class85 method2575(int arg0, int arg1) {
        field6121++;
        class241 var2 = class17.field231;
        class85 var3;
        synchronized (class17.field231) {
            var3 = (class85) class17.field231.method1491((long) arg1, arg0 ^ arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class74.field982.method823(class435.method2675(arg1, -1446204248), -20334, class15.method88((byte) -27, arg1));
        class85 var5 = new class85();
        var5.field1156 = arg1;
        if (var4 != null) {
            var5.method545(new class385(var4), true);
        }
        var5.method546(24565);
        if (var5.field1143) {
            var5.field1191 = false;
            var5.field1147 = 0;
        }
        if (!class97.field1340 && var5.field1138) {
            var5.field1177 = null;
            var5.field1166 = null;
        }
        class241 var6 = class17.field231;
        synchronized (class17.field231) {
            class17.field231.method1488(arg0 ^ 0x80, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method2576(byte arg0) {
        field6117 = null;
        field6124 = null;
        if (arg0 >= -66) {
            method2576((byte) 97);
        }
        field6115 = null;
        field6116 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)Lqf;")
    public static final class130 method2577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6126++;
        if (arg4 != 0) {
            return null;
        }
        class317[] var5 = null;
        class94 var6 = class229.method1393(arg1, (byte) 36);
        if (var6.field1316 != null) {
            var5 = new class317[var6.field1316.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class284 var8 = class8.method65(-1, var6.field1316[var7]);
                var5[var7] = new class317(var8.field4333, var8.field4318, var8.field4323, var8.field4329, var8.field4331, var8.field4322, var8.field4321, var8.field4317);
            }
        }
        return new class130(var6.field1315, var5, var6.field1308, arg0, arg2, arg3);
    }
}
