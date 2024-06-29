import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class502 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lvv;")
    public static class313 field7329 = new class313(75, 7);

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[I")
    public static int[] field7335 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lrr;")
    public static class280 field7336 = new class280(15, 0, 1, 0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field7330;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field7331;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field7332;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field7333;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[Lo;")
    public static class138[] field7337;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
    public static final void method2966(boolean arg0, int arg1) {
        field7328++;
        if (arg1 == 37) {
            class210.field3339 = 3.0F;
        } else if (arg1 == 50) {
            class210.field3339 = 4.0F;
        } else if (arg1 == 75) {
            class210.field3339 = 6.0F;
        } else if (arg1 == 100) {
            class210.field3339 = 8.0F;
        } else if (arg1 == 200) {
            class210.field3339 = 16.0F;
        }
        if (arg0) {
            class129.field2226 = -1;
            class129.field2226 = -1;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method2967(int arg0) {
        field7335 = null;
        field7337 = null;
        if (arg0 == 15) {
            field7336 = null;
            field7329 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
    public static final void method2968(String arg0, byte arg1, Throwable arg2) {
        field7327++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class428.method2610(arg2, -43);
            }
            if (arg1 >= -80) {
                field7335 = null;
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class173.method1171(var3, (byte) 122);
            String var4 = class437.method2646(":", "%3a", 45, var3);
            String var5 = class437.method2646("@", "%40", 41, var4);
            String var6 = class437.method2646("&", "%26", 113, var5);
            String var7 = class437.method2646("#", "%23", 52, var6);
            if (class445.field6657.field7203 != null) {
                class169 var8 = class445.field6657.method2877(0, new URL(class445.field6657.field7203.getCodeBase(), "clienterror.ws?c=" + class296.field4764 + "&u=" + class257.field4334 + "&v1=" + class493.field7193 + "&v2=" + class493.field7199 + "&e=" + var7));
                while (var8.field2692 == 0) {
                    class444.method2667(-28210, 1L);
                }
                if (var8.field2692 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2695;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
