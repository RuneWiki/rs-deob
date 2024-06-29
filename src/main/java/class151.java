import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class151 extends class134 {

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lpk;")
    public class197 field1661;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Z")
    public static boolean field1663 = false;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "F")
    public static float field1665;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Ld;")
    public static class150 field1662;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "[Ljj;")
    public static class118[] field1667;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 4)
    public static void method934(int arg0) {
        if (arg0 != 10096) {
            field1667 = null;
        }
        field1662 = null;
        field1667 = null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lpk;)V", line = 16)
    public class151(class197 arg0) {
        this.field1661 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Z", line = 25)
    public static final boolean method935(int arg0) {
        field1666++;
        if (class646.field9232 == null) {
            return false;
        }
        if (class646.field9232.field9270 >= 2000) {
            class646.field9232.field9270 -= 2000;
        }
        int var1 = -40 / ((arg0 - 56) / 41);
        return class646.field9232.field9270 == 1002;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 52)
    public static final void method936(String arg0, Throwable arg1, int arg2) {
        field1668++;
        if (arg2 <= 52) {
            field1664 = -55;
        }
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class707.method3962(120, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class624.method3573(2, var3);
            String var4 = class317.method1906(":", "%3a", var3, 0);
            String var5 = class317.method1906("@", "%40", var4, 0);
            String var6 = class317.method1906("&", "%26", var5, 0);
            String var7 = class317.method1906("#", "%23", var6, 0);
            if (class208.field2452 != null) {
                class290 var8 = class239.field2847.method3204(new URL(class208.field2452.getCodeBase(), "clienterror.ws?c=" + class631.field9067 + "&u=" + (class720.field10105 == null ? String.valueOf(class399.field5464) : class720.field10105) + "&v1=" + class546.field7837 + "&v2=" + class546.field7856 + "&e=" + var7), -18528);
                while (var8.field3573 == 0) {
                    class524.method3076(1, 1L);
                }
                if (var8.field3573 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3577;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
