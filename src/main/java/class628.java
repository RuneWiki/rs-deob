import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class628 extends class3 {

    @OriginalMember(owner = "client!kaa", name = "L", descriptor = "Lmv;")
    public static class297 field8772 = new class297(9, 0, 4, 1);

    @OriginalMember(owner = "client!kaa", name = "N", descriptor = "[B")
    public static byte[] field8774 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!kaa", name = "O", descriptor = "Z")
    public static boolean field8775 = false;

    @OriginalMember(owner = "client!kaa", name = "M", descriptor = "I")
    public static int field8773 = 52;

    @OriginalMember(owner = "client!kaa", name = "E", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!kaa", name = "G", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!kaa", name = "H", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!kaa", name = "I", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!kaa", name = "J", descriptor = "I")
    public int field8770;

    @OriginalMember(owner = "client!kaa", name = "P", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!kaa", name = "F", descriptor = "Lsd;")
    public class264 field8766;

    @OriginalMember(owner = "client!kaa", name = "K", descriptor = "[B")
    public byte[] field8771;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZB)V")
    public static final void method3486(boolean arg0, byte arg1) {
        if (arg1 == 58) {
            for (class118 var2 = (class118) class434.field5598.method2090(true); var2 != null; var2 = (class118) class434.field5598.method2088(-152)) {
                if (var2.field1530 != null) {
                    class690.field9426.method2236(var2.field1530);
                    var2.field1530 = null;
                }
                if (var2.field1514 != null) {
                    class690.field9426.method2236(var2.field1514);
                    var2.field1514 = null;
                }
                var2.method2438((byte) -105);
            }
            ++field8765;
            if (arg0) {
                for (class118 var3 = (class118) class253.field3444.method2090(true); var3 != null; var3 = (class118) class253.field3444.method2088(arg1 ^ -174)) {
                    if (var3.field1530 != null) {
                        class690.field9426.method2236(var3.field1530);
                        var3.field1530 = null;
                    }
                    var3.method2438((byte) 109);
                }
                for (class118 var4 = (class118) class145.field1891.method42((byte) 115); var4 != null; var4 = (class118) class145.field1891.method40(false)) {
                    if (var4.field1530 != null) {
                        class690.field9426.method2236(var4.field1530);
                        var4.field1530 = null;
                    }
                    var4.method2438((byte) -37);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)I")
    public final int method11(int arg0) {
        ++field8769;
        if (arg0 >= -113) {
            return 86;
        } else {
            return super.field20 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)[B")
    public final byte[] method8(byte arg0) {
        ++field8767;
        if (arg0 != 2) {
            this.method11(-29);
        }
        if (super.field20) {
            throw new RuntimeException();
        } else {
            return this.field8771;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "(I)V")
    public static final void method3487(int arg0) {
        ++field8768;
        try {
            if (arg0 >= -19) {
                field8776 = 31;
            }
            if (~class426.field5523 == -2) {
                int var1 = class359.field4658.method2947((byte) 104);
                if (~var1 < -1 && class359.field4658.method2943(0)) {
                    int var2 = var1 - class27.field403;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class359.field4658.method2930(var2, -113);
                } else {
                    class359.field4658.method2934((byte) -108);
                    class359.field4658.method2954(false);
                    class526.field6855 = null;
                    if (class414.field5327 == null) {
                        class426.field5523 = 0;
                    } else {
                        class426.field5523 = 2;
                    }
                    class697.field9585 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class359.field4658.method2934((byte) -59);
            class526.field6855 = null;
            class697.field9585 = null;
            class426.field5523 = 0;
            class414.field5327 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "(B)V")
    public static void method3488(byte arg0) {
        field8772 = null;
        if (arg0 != -26) {
            field8775 = true;
        }
        field8774 = null;
    }
}
