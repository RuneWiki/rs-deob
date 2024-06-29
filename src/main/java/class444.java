import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class444 {

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Lmn;")
    private class368 field6317;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field6312 = new String[100];

    @OriginalMember(owner = "client!os", name = "g", descriptor = "[I")
    public static int[] field6316 = new int[2];

    @OriginalMember(owner = "client!os", name = "a", descriptor = "F")
    public static float field6310;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Lvl;")
    private class13 field6314;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Z")
    public static final boolean method2668(int arg0, int arg1, int arg2) {
        field6315++;
        if (arg2 > -4) {
            field6310 = -0.9273654F;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static void method2669(int arg0) {
        field6312 = null;
        field6316 = null;
        if (arg0 != 30114) {
            field6316 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)Lvl;")
    public final class13 method2670(int arg0) {
        field6313++;
        if (arg0 <= 7) {
            this.method2670(79);
        }
        class13 var2 = this.field6317.field5243.field241;
        if (this.field6317.field5243 == var2) {
            this.field6314 = null;
            return null;
        } else {
            this.field6314 = var2.field241;
            return var2;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(III)Z")
    public static final boolean method2671(int arg0, int arg1, int arg2) {
        if (arg2 > -111) {
            method2669(-81);
        }
        field6318++;
        return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
    public class444() {
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method2672(String arg0, Throwable arg1, int arg2) {
        field6311++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class662.method3721(false, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class526.method3049(var3, -5192);
            String var4 = class236.method1645("%3a", true, ":", var3);
            String var5 = class236.method1645("%40", true, "@", var4);
            String var6 = class236.method1645("%26", true, "&", var5);
            String var7 = class236.method1645("%23", true, "#", var6);
            if (class272.field3830 != null) {
                if (arg2 != 15004) {
                    method2668(-69, 63, 124);
                }
                class622 var8 = class623.field8469.method1211(new URL(class272.field3830.getCodeBase(), "clienterror.ws?c=" + class580.field7948 + "&u=" + (class704.field9522 == null ? String.valueOf(class625.field8600) : class704.field9522) + "&v1=" + class158.field2530 + "&v2=" + class158.field2544 + "&e=" + var7), 8362);
                while (var8.field8462 == 0) {
                    class700.method3916((byte) -123, 1L);
                }
                if (var8.field8462 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field8463;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)Lvl;")
    public final class13 method2673(byte arg0) {
        field6319++;
        if (arg0 < 44) {
            field6312 = null;
        }
        class13 var2 = this.field6314;
        if (this.field6317.field5243 == var2) {
            this.field6314 = null;
            return null;
        } else {
            this.field6314 = var2.field241;
            return var2;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lmn;)V")
    public class444(class368 arg0) {
        this.field6317 = arg0;
    }
}
