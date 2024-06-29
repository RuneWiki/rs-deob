import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class139 {

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Z")
    public static boolean field1951 = false;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public int field1947;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public int field1953;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Le;")
    public static class489 field1950;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method979(boolean arg0) {
        field1945++;
        if (arg0) {
            method985((byte) -118, null, null);
        }
        return (this.field1952 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z", line = 17)
    public final boolean method980(byte arg0) {
        if (arg0 >= -39) {
            this.field1952 = -121;
        }
        field1949++;
        return (this.field1952 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 33)
    public static void method981(int arg0) {
        if (arg0 != 21493) {
            method981(-119);
        }
        field1950 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Z", line = 43)
    public final boolean method982(int arg0) {
        if (arg0 == 0) {
            field1943++;
            return (this.field1952 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 60)
    public static final void method983(int arg0) {
        class134.field1897 = false;
        class348.field5016 = null;
        if (arg0 < 96) {
            field1951 = true;
        }
        class389.field5464 = null;
        field1942++;
        class506.field6923 = null;
        class691.field9704 = null;
        class491.field6784 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z", line = 88)
    public final boolean method984(int arg0) {
        field1954++;
        if (arg0 != -19373) {
            this.method982(-77);
        }
        return (this.field1952 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 100)
    public static final void method985(byte arg0, String arg1, Throwable arg2) {
        field1944++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class226.method1448(arg2, true);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class239.method1503((byte) -11, var3);
            String var4 = class602.method3337(":", "%3a", var3, -74);
            String var5 = class602.method3337("@", "%40", var4, -107);
            String var6 = class602.method3337("&", "%26", var5, 92);
            if (arg0 >= -50) {
                method985((byte) -13, null, null);
            }
            String var7 = class602.method3337("#", "%23", var6, 96);
            if (class120.field1595 != null) {
                class260 var8 = class694.field9752.method629(0, new URL(class120.field1595.getCodeBase(), "clienterror.ws?c=" + class18.field266 + "&u=" + class459.field6494 + "&v1=" + class79.field1093 + "&v2=" + class79.field1096 + "&e=" + var7));
                while (var8.field3702 == 0) {
                    class419.method2390(56, 1L);
                }
                if (var8.field3702 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3706;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
