import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class120 extends class194 {

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "[B")
    public static byte[] field2084;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lqk;")
    public static class207 field2085;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lqk;")
    public static class207 field2086;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Z")
    public static boolean field2087;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Lqk;")
    public static class207 field2089;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "F")
    public static float field2088;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "Lpk;")
    public static class99 field2090;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method854(byte arg0, String arg1, String arg2, String arg3) {
        field2069++;
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, arg2.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(arg1.length() + var4);
        }
        return arg0 < 110 ? null : arg3;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static final void method855(int arg0) {
        field2076++;
        if (class149.field2625 == 5) {
            class149.field2625 = 6;
            if (arg0 != 10) {
                method855(122);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public static final void method856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2081++;
        class90 var5 = class221.method1575(10, arg2, 1651481952);
        var5.method648((byte) -44);
        var5.field1613 = arg3;
        var5.field1612 = arg1;
        if (arg4 >= -123) {
            field2089 = null;
        }
        var5.field1621 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
    public static void method857(boolean arg0) {
        field2084 = null;
        field2086 = null;
        if (!arg0) {
            method855(-62);
        }
        field2085 = null;
        field2090 = null;
        field2089 = null;
    }

    static {
        int var0 = 0;
        field2084 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2084[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field2085 = class24.method212(255, "(U1");
        field2086 = class24.method212(255, "Okay");
        field2087 = true;
        field2089 = class24.method212(255, "Fichiers config charg-Bs");
    }
}
