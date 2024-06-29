import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class80 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
    public boolean field1385 = true;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Lbd;")
    private static class162 field1391 = class17.method142(0, "Discard");

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Lbd;")
    public static class162 field1392 = field1391;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Lqb;")
    public static class209 field1388 = new class209(64);

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "[Z")
    public static boolean[] field1398 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lbd;")
    public static class162 field1399 = class17.method142(0, "um");

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lbd;")
    public static class162 field1401 = class17.method142(0, "<col=ffffff>");

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIB)I", line = 17)
    public static final int method616(int arg0, int arg1, byte arg2) {
        field1393++;
        if (arg2 > -96) {
            return -67;
        }
        int var3 = class209.method1540(arg0 + 45365, (byte) -113, arg1 + 91923, 4) + (class209.method1540(arg0 + 10294, (byte) -113, arg1 + 37821, 2) - 128 >> 1) + (class209.method1540(arg0, (byte) -113, arg1, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 39)
    public static void method617(boolean arg0) {
        field1388 = null;
        if (arg0) {
            field1402 = -127;
        }
        field1401 = null;
        field1398 = null;
        field1392 = null;
        field1399 = null;
        field1391 = null;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIIIZ)V", line = 104)
    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1389 = arg0;
        this.field1386 = arg3;
        this.field1395 = arg4;
        this.field1385 = arg6;
        this.field1394 = arg1;
        this.field1397 = arg2;
        this.field1387 = arg5;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 69)
    public static final void method618(int arg0) {
        field1396++;
        if (arg0 > -64) {
            method618(67);
        }
        int var1 = class237.method1680(true);
        if (var1 == 0) {
            class201.field3421 = (byte[][][]) null;
            class30.method253(-110, 0);
        } else if (var1 == 1) {
            class10.method60((byte) 0, -105);
            class30.method253(-78, 512);
            class119.method974((byte) 41);
        } else {
            class10.method60((byte) (class279.field4702 - 4 & 0xFF), 127);
            class30.method253(-114, 2);
        }
    }
}
