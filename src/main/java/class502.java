import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class502 {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field6863 = 0;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
    public static int[] field6862 = new int[13];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lae;")
    public static class283 field6860;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2936(boolean arg0) {
        field6864++;
        if (class550.field7652 == null) {
            class206 var1 = new class206();
            byte[] var2 = var1.method1318((byte) -81, 128, 128, 16);
            class550.field7652 = class485.method2881(-137, var2, false);
        }
        if (arg0) {
            method2936(true);
        }
        if (class35.field338 == null) {
            class405 var3 = new class405();
            byte[] var4 = var3.method2484(16, 128, 0, 128);
            class35.field338 = class485.method2881(-137, var4, false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 37)
    public static final void method2937(Throwable arg0, byte arg1, String arg2) {
        field6861++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class640.method3679(arg0, 20217);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class673.method3837((byte) -57, var3);
            String var4 = class615.method3548((byte) 22, var3, ":", "%3a");
            int var5 = -59 / ((-arg1 - 25) / 59);
            String var6 = class615.method3548((byte) 22, var4, "@", "%40");
            String var7 = class615.method3548((byte) 22, var6, "&", "%26");
            String var8 = class615.method3548((byte) 22, var7, "#", "%23");
            if (class288.field4238 != null) {
                class344 var9 = class122.field1621.method4232(4, new URL(class288.field4238.getCodeBase(), "clienterror.ws?c=" + class607.field8509 + "&u=" + (class231.field3479 == null ? String.valueOf(class82.field956) : class231.field3479) + "&v1=" + class768.field10568 + "&v2=" + class768.field10573 + "&e=" + var8));
                while (var9.field4970 == 0) {
                    class730.method4066((byte) -45, 1L);
                }
                if (var9.field4970 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field4975;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLgga;I)V", line = 88)
    private final void method2938(byte arg0, class511 arg1, int arg2) {
        if (arg2 == 5) {
            this.field6863 = arg1.method3002(-1);
        }
        field6859++;
        int var4 = -61 % ((11 - arg0) / 33);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)V", line = 108)
    public static void method2939(boolean arg0) {
        if (arg0) {
            field6862 = null;
        }
        field6860 = null;
        field6862 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lgga;B)V", line = 126)
    public final void method2940(class511 arg0, byte arg1) {
        if (arg1 < 113) {
            return;
        }
        while (true) {
            int var3 = arg0.method3013(-96);
            if (var3 == 0) {
                field6858++;
                return;
            }
            this.method2938((byte) -94, arg0, var3);
        }
    }
}
