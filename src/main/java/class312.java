import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class312 extends class57 {

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    private final int field5311;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    private final int field5316;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    private final int field5325;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    private final int field5327;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Lok;")
    public static class146 field5309 = class235.method1724(-12908, "(U1");

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Z")
    public static boolean field5315 = true;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "[I")
    public static int[] field5313 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Lok;")
    public static class146 field5321 = null;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Lok;")
    public static class146 field5314 = class235.method1724(-12908, "scape main");

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "Lok;")
    private static class146 field5322 = class235.method1724(-12908, "wave2:");

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "Lok;")
    public static class146 field5318 = field5322;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "Lok;")
    public static class146 field5324 = field5322;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Z")
    public static volatile boolean field5308 = false;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "[I")
    public static int[] field5326;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Loh;BLoh;Lvh;)V", line = 7)
    public static final void method2188(class15 arg0, byte arg1, class15 arg2, class49 arg3) {
        if (arg1 < 39) {
            method2188((class15) null, (byte) 100, (class15) null, (class49) null);
        }
        field5310++;
        class117.field1873 = arg3;
        class75.field1226 = arg2;
        class218.field3602 = arg0;
        if (class75.field1226 != null) {
            class86.field1361 = class75.field1226.method95(64, 1);
        }
        if (class218.field3602 != null) {
            class292.field4968 = class218.field3602.method95(64, 1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Lu;", line = 32)
    public static final class249 method2189(byte arg0) {
        field5307++;
        try {
            if (arg0 != -18) {
                method2189((byte) 32);
            }
            return (class249) Class.forName("bk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IIIIIII)V", line = 54)
    public class312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5311 = arg0;
        this.field5316 = arg3;
        this.field5325 = arg1;
        this.field5327 = arg2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 67)
    public static void method2190(int arg0) {
        field5326 = null;
        field5322 = null;
        field5313 = null;
        field5324 = null;
        field5318 = null;
        field5314 = null;
        if (arg0 != 128) {
            method2192(-121, -103, 115, 52L, -64, (class146) null, 49);
        }
        field5321 = null;
        field5309 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BII)V", line = 90)
    public final void method258(byte arg0, int arg1, int arg2) {
        field5320++;
        if (arg0 != -27) {
            return;
        }
        int var4 = this.field5327 * arg2 >> 12;
        int var5 = this.field5311 * arg2 >> 12;
        int var6 = this.field5316 * arg1 >> 12;
        int var7 = this.field5325 * arg1 >> 12;
        class191.method1470(-86, var6, var7, var4, var5, this.field1001);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)V", line = 111)
    public final void method260(int arg0, int arg1, byte arg2) {
        field5317++;
        int var4 = this.field5311 * arg1 >> 12;
        int var5 = this.field5327 * arg1 >> 12;
        if (arg2 < 53) {
            this.method258((byte) 37, -69, -112);
        }
        int var6 = this.field5316 * arg0 >> 12;
        int var7 = this.field5325 * arg0 >> 12;
        class122.method849(90, this.field1003, this.field1002, this.field1001, var7, var4, var6, var5);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 132)
    public final void method259(int arg0, int arg1, int arg2) {
        field5319++;
        int var4 = this.field5311 * arg1 >> 12;
        if (arg0 != -27128) {
            field5321 = (class146) null;
        }
        int var5 = this.field5316 * arg2 >> 12;
        int var6 = this.field5325 * arg2 >> 12;
        int var7 = this.field5327 * arg1 >> 12;
        class55.method443(this.field1003, var4, var7, -2, this.field1002, var6, var5);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(BII)I", line = 154)
    public static final int method2191(byte arg0, int arg1, int arg2) {
        field5323++;
        int var3 = class91.method629(arg1 + 91923, 4, 3460, arg2 + 45365) - (-(class91.method629(arg1 + 37821, 2, 3460, arg2 + 10294) + -128 >> 1) - (class91.method629(arg1, 1, 3460, arg2) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        int var5 = 120 / ((-arg0 - 9) / 63);
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIJILok;I)V", line = 180)
    public static final void method2192(int arg0, int arg1, int arg2, long arg3, int arg4, class146 arg5, int arg6) {
        field5312++;
        class47 var8 = new class47(128);
        var8.method332(10, arg0 ^ 0x60);
        var8.method361((int) (Math.random() * 99999.0D), 1635554120);
        var8.method361(528, 1635554120);
        var8.method359(arg3, arg0 + 127);
        var8.method387((int) (Math.random() * 9.9999999E7D), 75);
        var8.method339(-128, arg5);
        var8.method387((int) (Math.random() * 9.9999999E7D), 122);
        var8.method361(class92.field1468, 1635554120);
        var8.method332(arg2, arg0 ^ 0x69);
        var8.method332(arg4, 127);
        var8.method387((int) (Math.random() * 9.9999999E7D), 108);
        var8.method361(arg6, 1635554120);
        var8.method361(arg1, 1635554120);
        var8.method387((int) (Math.random() * 9.9999999E7D), 102);
        var8.method358(class318.field5373, (byte) 96, class118.field1895);
        class47.field820.field857 = 0;
        class47.field820.method332(123, 83);
        class47.field820.method332(var8.field857, 112);
        class47.field820.method372(var8.field857, var8.field860, (byte) 62, 0);
        class70.field1154 = 0;
        class187.field3116 = -3;
        class144.field2390 = arg0;
        class60.field1030 = 0;
    }
}
