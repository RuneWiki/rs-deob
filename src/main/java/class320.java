import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class320 extends class10 {

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Ltq;")
    public class442 field4374;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[B")
    public static byte[] field4375 = new byte[2048];

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "[[Z")
    public static boolean[][] field4379 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field4378;

    static {
        new class466("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field4380 = -1;
        field4381 = 765;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lef;II[B)V", line = 5)
    public class320(class338 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4374 = class55.method468(false, arg2, arg0, arg1, (byte) 38, arg3, 6406, 6406);
        this.field4374.method1579(-6746, false, false);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 16)
    public static void method1859(int arg0) {
        field4375 = null;
        field4379 = null;
        if (arg0 != -25779) {
            method1859(64);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 32)
    public static final void method1860(int arg0) {
        if (arg0 != 6406) {
            return;
        }
        field4377++;
        for (class258 var1 = (class258) class511.field7570.method2818((byte) 121); var1 != null; var1 = (class258) class511.field7570.method2820((byte) -58)) {
            class108 var2 = var1.field3588;
            if (var2.field1624) {
                var1.method1565(arg0 ^ 0x1906);
                var2.method796(false);
            } else if (var2.field1633 <= class441.field6516) {
                var2.method794(class193.field2758, 0);
                if (var2.field1624) {
                    var1.method1565(arg0 ^ 0x1906);
                } else {
                    class51.method449(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 71)
    public static final void method1861(Throwable arg0, byte arg1, String arg2) {
        field4376++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class132.method906((byte) 112, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class368.method2220(65, var3);
            String var4 = class433.method2558("%3a", var3, (byte) -19, ":");
            String var5 = class433.method2558("%40", var4, (byte) -19, "@");
            if (arg1 >= -65) {
                method1860(23);
            }
            String var6 = class433.method2558("%26", var5, (byte) -19, "&");
            String var7 = class433.method2558("%23", var6, (byte) -19, "#");
            if (class515.field7618.field7425 != null) {
                class56 var8 = class515.field7618.method2967((byte) -123, new URL(class515.field7618.field7425.getCodeBase(), "clienterror.ws?c=" + class210.field2936 + "&u=" + class377.field5531 + "&v1=" + class504.field7426 + "&v2=" + class504.field7428 + "&e=" + var7));
                while (var8.field667 == 0) {
                    class157.method1046(-128, 1L);
                }
                if (var8.field667 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field670;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
