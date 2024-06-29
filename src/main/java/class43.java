import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class43 {

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Luf;")
    public static class168 field525 = class148.method1019(-1720, " loggt sich ein)3");

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field522 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Luf;")
    public static class168 field530 = class148.method1019(-1720, "::");

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field527 = 0;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Luf;")
    public static class168 field531 = class148.method1019(-1720, "");

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lg;")
    public static class242 field533 = null;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "[Lae;")
    public static class15[] field534 = new class15[4];

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 13)
    public static final void method234(Throwable arg0, int arg1, String arg2) {
        field529++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class63.method362(arg0, (byte) 18);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            if (arg1 != -15954) {
                field531 = (class168) null;
            }
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class140.field2156.field1000 == null) {
                return;
            }
            class112 var8 = class140.field2156.method426(new URL(class140.field2156.field1000.getCodeBase(), "clienterror.ws?c=" + class136.field2119 + "&u=" + class198.field3271 + "&v1=" + class75.field989 + "&v2=" + class75.field1002 + "&e=" + var7), false);
            while (var8.field1746 == 0) {
                class300.method2054(10, 1L);
            }
            if (var8.field1746 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field1742;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ldk;II)Lha;", line = 67)
    public static final class49 method235(class241 arg0, int arg1, int arg2) {
        if (arg1 >= -46) {
            method237((byte) 112);
        }
        field532++;
        return class254.method1748(arg0, 1, arg2) ? class19.method91((byte) 81) : null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLdk;)V", line = 91)
    public static final void method236(byte arg0, class241 arg1) {
        field526++;
        if (arg0 != 113) {
            field527 = 94;
        }
        arg1.method1646(-27248, class229.field3694);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 104)
    public static void method237(byte arg0) {
        field525 = null;
        field534 = null;
        field531 = null;
        field530 = null;
        int var1 = 38 / ((arg0 - 15) / 35);
        field533 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()V", line = 132)
    public static final void method238() {
        for (int var0 = 0; var0 < class300.field5087; var0++) {
            for (int var1 = 0; var1 < class117.field1821; var1++) {
                for (int var2 = 0; var2 < class244.field4160; var2++) {
                    class92.field1424[var0][var1][var2] = null;
                }
            }
        }
        for (int var3 = 0; var3 < class288.field4856; var3++) {
            class240.field3900[var3] = null;
        }
        class288.field4856 = 0;
        for (int var4 = 0; var4 < class280.field4715; var4++) {
            class92.field1419[var4] = null;
        }
        class280.field4715 = 0;
        for (int var5 = 0; var5 < class216.field3524.length; var5++) {
            class216.field3524[var5] = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIILf;Lf;IIIIJ)V", line = 188)
    public static final void method239(int arg0, int arg1, int arg2, int arg3, class231 arg4, class231 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class40 var12 = new class40();
        var12.field497 = arg10;
        var12.field508 = arg1 * 128 + 64;
        var12.field509 = arg2 * 128 + 64;
        var12.field498 = arg3;
        var12.field494 = arg4;
        var12.field499 = arg5;
        var12.field507 = arg6;
        var12.field502 = arg7;
        var12.field496 = arg8;
        var12.field505 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class92.field1424[var13][arg1][arg2] == null) {
                class92.field1424[var13][arg1][arg2] = new class127(var13, arg1, arg2);
            }
        }
        class92.field1424[arg0][arg1][arg2].field1979 = var12;
    }
}
