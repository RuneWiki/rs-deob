import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 extends class13 {

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field2582 = 0;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "Lec;")
    public static class32 field2590 = class73.method594("Bitte wenden Sie sich an den Kundendienst)3", true);

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field2579 = 0;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Lec;")
    public static class32 field2581 = class73.method594("Update)2Liste geladen)3", true);

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "[I")
    public static int[] field2583 = new int[5];

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "Lec;")
    public static class32 field2588 = class73.method594("<br>(X100(U(Y", true);

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "B")
    public byte field2589;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "Lga;")
    public class44 field2591;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method872(Throwable arg0, String arg1, int arg2) {
        field2578++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class68.method572(32, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', (char) arg2);
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class86.field2011.field458 != null) {
                class18 var8 = class86.field2011.method178((byte) 45, new URL(class86.field2011.field458.getCodeBase(), "clienterror.ws?c=" + class117.field2814 + "&u=" + class98.field2261 + "&v1=" + class25.field464 + "&v2=" + class25.field457 + "&e=" + var7));
                while (var8.field355 == 0) {
                    class54.method427(1L, arg2 ^ 0xFFFF95BD);
                }
                if (var8.field355 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field352;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static final void method873(int arg0) {
        class39.field942++;
        class44.field1027.method357(113, -97);
        field2592++;
        if (arg0 != -4) {
            field2579 = -128;
        }
        for (class144 var1 = (class144) class109.field2573.method1205((byte) 91); var1 != null; var1 = (class144) class109.field2573.method1201(45)) {
            if (var1.field3293 == 0 || var1.field3293 == 3) {
                class134.method1023(true, (byte) -21, var1);
            }
        }
        if (class50.field1159 != null) {
            class132.method1010(class50.field1159, (byte) -104);
            class50.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
    public static final void method874(boolean arg0) {
        if (arg0) {
            field2583 = null;
        }
        field2586++;
        class97.field2232 = 0;
        int var1 = (class20.field373.field2749 >> 7) + class72.field1701;
        int var2 = (class20.field373.field2700 >> 7) + class118.field2838;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class97.field2232 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class97.field2232 = 1;
        }
        if (class97.field2232 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class97.field2232 = 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2588 = null;
        field2581 = null;
        if (arg0 < 13) {
            field2587 = -115;
        }
        field2583 = null;
        field2590 = null;
    }
}
