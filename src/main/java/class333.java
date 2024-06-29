import java.awt.Color;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class333 {

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Lht;")
    public static class393 field4884 = new class393();

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 4)
    public static final void method2135(Throwable arg0, String arg1, int arg2) {
        field4886++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class429.method2673(arg0, (byte) 87);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class688.method3844(var3, (byte) 125);
            String var4 = class114.method919(var3, 121, ":", "%3a");
            String var5 = class114.method919(var4, -80, "@", "%40");
            String var6 = class114.method919(var5, 123, "&", "%26");
            String var7 = class114.method919(var6, 115, "#", "%23");
            if (arg2 <= -61 && class639.field8969 != null) {
                class162 var8 = class682.field9653.method4059(true, new URL(class639.field8969.getCodeBase(), "clienterror.ws?c=" + class524.field7544 + "&u=" + (class702.field9939 == null ? String.valueOf(class670.field9487) : class702.field9939) + "&v1=" + class731.field10266 + "&v2=" + class731.field10273 + "&e=" + var7));
                while (var8.field2512 == 0) {
                    class484.method2932(true, 1L);
                }
                if (var8.field2512 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2517;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lew;BII)Lsw;", line = 57)
    public static final class603 method2136(class685 arg0, byte arg1, int arg2, int arg3) {
        field4885++;
        int var4 = arg3 << 10 | arg0.field9682;
        class603 var5 = (class603) class719.field10078.method3893(0, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class403.field5986.method2633(true, class403.field5986.method2625((byte) 21, var4));
        if (var6 == null) {
            if (arg1 != -116) {
                field4884 = null;
            }
            int var9 = arg2 + 65536 << 10 | arg0.field9682;
            class603 var10 = (class603) class719.field10078.method3893(0, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class403.field5986.method2633(true, class403.field5986.method2625((byte) 21, var9));
            if (var11 == null) {
                int var14 = arg0.field9682 | 0x3FFFC00;
                class603 var15 = (class603) class719.field10078.method3893(0, (long) var14 << 16);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class403.field5986.method2633(true, class403.field5986.method2625((byte) 21, var14));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class603 var17;
                    try {
                        var17 = class535.method3155(var16, (byte) -28);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field8529 = arg0;
                    class719.field10078.method3894(var17, (long) var14 << 16, 0);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class603 var12;
                try {
                    var12 = class535.method3155(var11, (byte) -28);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field8529 = arg0;
                class719.field10078.method3894(var12, (long) var9 << 16, 0);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class603 var7;
            try {
                var7 = class535.method3155(var6, (byte) -28);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field8529 = arg0;
            class719.field10078.method3894(var7, (long) var4 << 16, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V", line = 150)
    public static void method2137(boolean arg0) {
        if (!arg0) {
            field4884 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V", line = 160)
    public static final void method2138(int arg0) {
        field4883++;
        class543.field7749.method454((byte) -71);
        class651.field9244.method2916(arg0 + 24461);
        if (arg0 != 1) {
            field4884 = null;
        }
        class52.field834.method2726(19375);
        class400.field5941.setBackground(Color.black);
        class696.field9871 = -1;
        class543.field7749 = class478.method2906(class400.field5941, (byte) 60);
        class651.field9244 = class544.method3189(class400.field5941, true, true);
    }
}
