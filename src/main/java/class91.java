import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class91 {

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Luf;")
    private class380 field1121 = new class380(64);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Luf;")
    public class380 field1122 = new class380(50);

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Luf;")
    public class380 field1123 = new class380(5);

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Z")
    public boolean field1113;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lnq;")
    public class650 field1115;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lga;")
    public class332 field1112;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lga;")
    private class332 field1114;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Ltt;")
    public static class338 field1118 = new class338(25, -1);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method496(int arg0) {
        if (arg0 != -2) {
            method499(null, null, (byte) 84);
        }
        field1118 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public final void method497(int arg0, int arg1) {
        this.field1124 = arg1;
        field1109++;
        int var3 = -88 % ((arg0 - 57) / 53);
        class380 var4 = this.field1122;
        synchronized (this.field1122) {
            this.field1122.method2168((byte) -119);
        }
        class380 var5 = this.field1123;
        synchronized (this.field1123) {
            this.field1123.method2168((byte) -70);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILio;)V")
    public static final void method498(int arg0, class157 arg1) {
        if (arg0 != -25) {
            return;
        }
        field1117++;
        byte[] var2 = new byte[24];
        if (class527.field7301 != null) {
            try {
                class527.field7301.method771(0, 0L);
                class527.field7301.method770(var2, (byte) 103);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method949(var2, 24, 0, (byte) 126);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static final void method499(String arg0, Throwable arg1, byte arg2) {
        field1104++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class27.method162(120, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            int var4 = -30 % ((69 - arg2) / 48);
            class307.method1809(var3, (byte) 66);
            String var5 = class399.method2279("%3a", ":", var3, -1623128409);
            String var6 = class399.method2279("%40", "@", var5, -1623128409);
            String var7 = class399.method2279("%26", "&", var6, -1623128409);
            String var8 = class399.method2279("%23", "#", var7, -1623128409);
            if (class204.field2738 != null) {
                class661 var9 = class520.field7208.method2230(true, new URL(class204.field2738.getCodeBase(), "clienterror.ws?c=" + class613.field8496 + "&u=" + class37.field500 + "&v1=" + class388.field5180 + "&v2=" + class388.field5174 + "&e=" + var8));
                while (var9.field9420 == 0) {
                    class588.method3253(0, 1L);
                }
                if (var9.field9420 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field9421;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V")
    public final void method500(byte arg0, int arg1) {
        field1107++;
        class380 var3 = this.field1121;
        synchronized (this.field1121) {
            if (arg0 < 86) {
                this.field1112 = null;
            }
            this.field1121.method2179(false, arg1);
        }
        class380 var4 = this.field1122;
        synchronized (this.field1122) {
            this.field1122.method2179(false, arg1);
        }
        class380 var5 = this.field1123;
        synchronized (this.field1123) {
            this.field1123.method2179(false, arg1);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public final void method501(int arg0) {
        class380 var2 = this.field1122;
        synchronized (this.field1122) {
            this.field1122.method2168((byte) -96);
        }
        field1116++;
        int var3 = -117 % ((arg0 + 29) / 38);
        class380 var4 = this.field1123;
        synchronized (this.field1123) {
            this.field1123.method2168((byte) -104);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Liv;")
    public final class384 method502(int arg0, int arg1) {
        field1110++;
        class380 var3 = this.field1121;
        class384 var4;
        synchronized (this.field1121) {
            var4 = (class384) this.field1121.method2176(-128, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field1114;
        byte[] var6;
        synchronized (this.field1114) {
            var6 = this.field1114.method1938(class245.method1498(arg0, (byte) -122), class641.method3549((byte) 113, arg0), arg1 + 15687);
        }
        class384 var7 = new class384();
        var7.field5115 = arg0;
        var7.field5102 = this;
        if (var6 != null) {
            var7.method2195(arg1 + 15708, new class157(var6));
        }
        var7.method2196(arg1 ^ 0xFFFFC2B1);
        class380 var8 = this.field1121;
        synchronized (this.field1121) {
            this.field1121.method2174(var7, (long) arg0, (byte) 123);
            if (arg1 != -15704) {
                this.field1113 = false;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
    public final void method503(int arg0) {
        field1105++;
        class380 var2 = this.field1121;
        synchronized (this.field1121) {
            this.field1121.method2168((byte) -110);
        }
        class380 var3 = this.field1122;
        synchronized (this.field1122) {
            this.field1122.method2168((byte) -95);
        }
        class380 var4 = this.field1123;
        synchronized (this.field1123) {
            this.field1123.method2168((byte) -75);
        }
        if (arg0 != 2651) {
            field1119 = 43;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public final void method504(int arg0) {
        field1108++;
        class380 var2 = this.field1121;
        synchronized (this.field1121) {
            this.field1121.method2172(-15112);
        }
        class380 var3 = this.field1122;
        synchronized (this.field1122) {
            if (arg0 != -3226) {
                return;
            }
            this.field1122.method2172(arg0 - 11886);
        }
        class380 var4 = this.field1123;
        synchronized (this.field1123) {
            this.field1123.method2172(arg0 - 11886);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ)V")
    public final void method505(int arg0, boolean arg1) {
        field1106++;
        if (arg0 != 24) {
            this.method500((byte) 84, 79);
        }
        if (this.field1113 != arg1) {
            this.field1113 = arg1;
            this.method503(arg0 + 2627);
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lnq;IZLga;Lga;)V")
    public class91(class650 arg0, int arg1, boolean arg2, class332 arg3, class332 arg4) {
        this.field1113 = arg2;
        this.field1115 = arg0;
        this.field1112 = arg4;
        this.field1114 = arg3;
        if (this.field1114 != null) {
            int var6 = this.field1114.method1933(-110) - 1;
            this.field1114.method1939(0, var6);
        }
    }
}
