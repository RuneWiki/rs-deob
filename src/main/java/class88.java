import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class88 extends class128 {

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field1397 = 0;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "F")
    public static float field1388;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "Ljava/lang/String;")
    public String field1387;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
    public int[] field1385;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "[I")
    public static int[] field1386;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[I")
    public int[] field1391;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "[Ltm;")
    public class79[] field1392;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field1390;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLwe;)V", line = 11)
    public static final void method774(boolean arg0, class59 arg1) {
        if (!arg0) {
            field1388 = 0.55211824F;
        }
        class23 var2 = null;
        field1384++;
        try {
            class45 var3 = arg1.method535("runescape", (byte) -118);
            while (var3.field709 == 0) {
                class142.method1149(1L, (byte) 124);
            }
            if (var3.field709 == 1) {
                var2 = (class23) var3.field712;
                class336 var4 = class66.method637(28639);
                var2.method224(var4.field5353, 0, var4.field5342, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method229(34);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V", line = 59)
    public static final void method775(Throwable arg0, String arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field1395++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class28.method254((byte) -52, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class67.method650(-20684, var3);
            String var4 = class33.method307(var3, ":", -1, "%3a");
            String var5 = class33.method307(var4, "@", -1, "%40");
            String var6 = class33.method307(var5, "&", -1, "%26");
            String var7 = class33.method307(var6, "#", -1, "%23");
            if (class180.field3042.field910 == null) {
                return;
            }
            class45 var8 = class180.field3042.method539((byte) 11, new URL(class180.field3042.field910.getCodeBase(), "clienterror.ws?c=" + class328.field5223 + "&u=" + class38.field550 + "&v1=" + class59.field919 + "&v2=" + class59.field904 + "&e=" + var7));
            while (var8.field709 == 0) {
                class142.method1149(1L, (byte) 126);
            }
            if (var8.field709 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field712;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V", line = 121)
    public static void method776(int arg0) {
        field1386 = null;
        if (arg0 != 27133) {
            method775((Throwable) null, (String) null, false);
        }
    }
}
