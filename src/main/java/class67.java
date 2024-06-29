import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class67 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1304 = -1;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lrd;")
    private static class173 field1305 = class133.method843("Loaded update list", -113);

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Lrd;")
    public static class173 field1300 = field1305;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "[I")
    public static int[] field1306 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field1312 = 20;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Lid;")
    public static class84 field1307;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static final void method418(int arg0) {
        if (arg0 != 65535) {
            method419(true, 25);
        }
        field1301++;
        try {
            if (class55.field1097 == 1) {
                int var1 = class21.field467.method107((byte) 127);
                if (var1 > 0 && class21.field467.method74((byte) 96)) {
                    int var2 = var1 - class58.field1145;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class21.field467.method110(false, var2);
                } else {
                    class21.field467.method99((byte) -119);
                    class21.field467.method86((byte) -42);
                    class208.field4053 = null;
                    class5.field122 = null;
                    if (class12.field192 == null) {
                        class55.field1097 = 0;
                    } else {
                        class55.field1097 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class21.field467.method99((byte) -119);
            class208.field4053 = null;
            class55.field1097 = 0;
            class12.field192 = null;
            class5.field122 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method419(boolean arg0, int arg1) {
        if (arg0) {
            field1303++;
            return (arg1 >> 20 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method420(byte arg0) {
        if (arg0 >= -126) {
            field1304 = 68;
        }
        field1307 = null;
        field1300 = null;
        field1305 = null;
        field1306 = null;
    }
}
