import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class18 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Leda;")
    public static class116 field264 = new class116(108, 4);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Liv;")
    public static class565 field268;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBLjava/lang/String;)Lsg;", line = 5)
    public static final class434 method197(int arg0, byte arg1, String arg2) {
        field266++;
        class434 var3;
        try {
            var3 = (class434) Class.forName("aca").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class517();
        }
        var3.field6240 = arg0;
        var3.field6242 = arg2;
        if (arg1 <= 102) {
            method198(116);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 29)
    public static void method198(int arg0) {
        if (arg0 != 108) {
            field268 = null;
        }
        field268 = null;
        field264 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z", line = 42)
    public static final boolean method199(int arg0, int arg1, int arg2) {
        if (arg1 != 27137) {
            field269 = 96;
        }
        field267++;
        return class91.method675(arg0, arg2, false) & class679.method3843(arg2, -1, arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 62)
    public static final void method200(String arg0, Throwable arg1, int arg2) {
        field265++;
        try {
            if (arg2 == 10296) {
                String var3 = "";
                if (arg1 != null) {
                    var3 = class605.method3444(-126, arg1);
                }
                if (arg0 != null) {
                    if (arg1 != null) {
                        var3 = var3 + " | ";
                    }
                    var3 = var3 + arg0;
                }
                class557.method3261(0, var3);
                String var4 = class435.method2553(0, var3, "%3a", ":");
                String var5 = class435.method2553(0, var4, "%40", "@");
                String var6 = class435.method2553(0, var5, "%26", "&");
                String var7 = class435.method2553(0, var6, "%23", "#");
                if (class498.field7410 != null) {
                    class614 var8 = class493.field7074.method3951(255, new URL(class498.field7410.getCodeBase(), "clienterror.ws?c=" + class61.field887 + "&u=" + class654.field9240 + "&v1=" + class705.field9962 + "&v2=" + class705.field9987 + "&e=" + var7));
                    while (var8.field8787 == 0) {
                        class564.method3300((byte) -72, 1L);
                    }
                    if (var8.field8787 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field8785;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }
}
