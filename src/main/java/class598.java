import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class598 {

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public int field8576;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
    public static boolean field8573 = false;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Leb;")
    public static class580 field8575;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Ljava/lang/String;")
    public static String field8577;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[Lf;")
    public static class702[] field8574;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method3402(int arg0) {
        field8572++;
        class263 var1 = null;
        try {
            class456 var2 = class604.field8775.method402("3", false, (byte) -128);
            while (var2.field6502 == 0) {
                class185.method1354(1L, 10);
            }
            if (var2.field6502 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class263) var2.field6499;
            byte[] var3 = new byte[(int) var1.method1721(0)];
            if (var3.length == 0) {
                class118.field2098 = "";
                class110.field1925 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1728(var3, var4, (byte) -65, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class61 var6 = new class61(var3);
                int var7 = var6.method732(arg0 ^ 0x2159DF27);
                if (var7 > 120) {
                    throw new RuntimeException("Bad length");
                }
                var6.field1393 = var7 + 1;
                if (!var6.method694(false)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field1393 = 1;
                int var8 = var6.method732(arg0 - 559537959);
                if (var8 > 3) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class118.field2098 = var6.method720((byte) 124);
                class110.field1925 = var6.method720((byte) 122);
                if (var8 < 1) {
                    class592.field8517 = class292.field4385;
                } else {
                    class592.field8517 = var6.method723((byte) -25);
                }
                if (var8 < 2) {
                    class219.field3326 = class77.field1564;
                } else {
                    class219.field3326 = var6.method742(arg0 ^ 0xFFFFA4A5);
                }
                if (var8 < 3) {
                    class270.field4021 = class635.field9133;
                } else if (var6.method732(arg0 ^ 0x2159DF27) == 1) {
                    class270.field4021 = var6.method720((byte) 122);
                } else {
                    class270.field4021 = null;
                }
            }
        } catch (Exception var10) {
            class118.field2098 = "";
            class110.field1925 = "";
        }
        try {
            if (var1 != null) {
                var1.method1726((byte) -128);
            }
        } catch (Exception var9) {
        }
        if (arg0 != -1) {
            method3402(126);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method3403(byte arg0) {
        if (arg0 != 103) {
            field8574 = null;
        }
        field8575 = null;
        field8574 = null;
        field8577 = null;
    }

    @OriginalMember(owner = "client!ph", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8571++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(II)V")
    public class598(int arg0, int arg1) {
        this.field8576 = arg1;
    }
}
