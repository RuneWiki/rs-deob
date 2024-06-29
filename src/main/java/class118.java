import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class118 extends class147 {

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Lmb;")
    public static class383 field1765 = new class383();

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "J")
    public long field1762;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1761;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)J", line = 3)
    public final long method477(byte arg0) {
        if (arg0 != 55) {
            field1765 = null;
        }
        field1760++;
        return this.field1762;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)I", line = 14)
    public final int method478(int arg0) {
        field1758++;
        return arg0 == 0 ? this.field1759 : -94;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I", line = 27)
    public final int method475(int arg0) {
        field1755++;
        if (arg0 != -2) {
            this.method478(101);
        }
        return this.field1763;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 38)
    public static final void method869(Throwable arg0, byte arg1, String arg2) {
        field1766++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class139.method983(-1, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class3.method11(7, var3);
            String var4 = class696.method3915((byte) -55, var3, ":", "%3a");
            String var5 = class696.method3915((byte) -55, var4, "@", "%40");
            String var6 = class696.method3915((byte) -55, var5, "&", "%26");
            String var7 = class696.method3915((byte) -55, var6, "#", "%23");
            if (class478.field6848 == null) {
                return;
            }
            class254 var8 = class454.field6550.method1411(-29, new URL(class478.field6848.getCodeBase(), "clienterror.ws?c=" + class72.field1148 + "&u=" + class149.field2108 + "&v1=" + class226.field3006 + "&v2=" + class226.field2986 + "&e=" + var7));
            while (var8.field3311 == 0) {
                class687.method3846(1L, -82);
            }
            if (var8.field3311 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3307;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        if (arg1 >= -127) {
            method869(null, (byte) -56, null);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)I", line = 97)
    public final int method479(byte arg0) {
        field1756++;
        if (arg0 != 41) {
            method870(-92);
        }
        return this.field1767;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)I", line = 111)
    public final int method476(boolean arg0) {
        if (arg0) {
            return -75;
        } else {
            field1764++;
            return this.field1757;
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V", line = 129)
    public static void method870(int arg0) {
        int var1 = -90 % ((arg0 - 29) / 62);
        field1765 = null;
        field1761 = null;
    }
}
