import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class1 extends RuntimeException {

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Ljava/lang/Throwable;")
    public Throwable field14;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ljava/lang/String;")
    public String field3;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lda;")
    public static class275 field8 = class255.method1672(111, " <col=ffffff>");

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static volatile int field1 = 0;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lda;")
    public static class275 field9 = class255.method1672(95, "<br>");

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Lda;")
    public static class275 field10 = class255.method1672(119, "hint_mapmarkers");

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "[Lmc;")
    public static class151[] field7;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[[[I")
    public static int[][][] field4;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V")
    public static final void method1(Throwable arg0, String arg1, boolean arg2) {
        field5++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class232.method1512(-25930, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            if (arg2) {
                field4 = null;
            }
            String var7 = var6.replace('#', '_');
            if (class46.field762.field970 != null) {
                class266 var8 = class46.field762.method370(new URL(class46.field762.field970.getCodeBase(), "clienterror.ws?c=" + class250.field4422 + "&u=" + class46.field769 + "&v1=" + class58.field983 + "&v2=" + class58.field967 + "&e=" + var7), (byte) -106);
                while (var8.field4623 == 0) {
                    class250.method1640(1L, -50);
                }
                if (var8.field4623 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4625;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)I")
    public static final int method2(boolean arg0, int arg1) {
        if (arg0) {
            field1 = 31;
        }
        field6++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method3(byte arg0) {
        field9 = null;
        field7 = null;
        field4 = null;
        field10 = null;
        field8 = null;
        if (arg0 <= 9) {
            field11 = -21;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLia;ILma;Lma;)V")
    public static final void method4(boolean arg0, class260 arg1, int arg2, class105 arg3, class105 arg4) {
        class51.field841 = arg4;
        class4.field59 = arg0;
        field2++;
        if (arg2 != -17780) {
            method3((byte) 76);
        }
        class125.field2245 = arg3;
        int var5 = class51.field841.method773(true) - 1;
        class11.field159 = class51.field841.method779((byte) -48, var5) + var5 * 256;
        class181.field3121 = arg1;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class1(Throwable arg0, String arg1) {
        this.field14 = arg0;
        this.field3 = arg1;
    }
}
