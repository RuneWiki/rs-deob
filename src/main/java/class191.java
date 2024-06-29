import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class191 {

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Lob;")
    public class498 field2704 = new class498();

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "Z")
    public boolean field2709 = false;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "Lwt;")
    public static class194 field2707 = new class194("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "Lq;")
    public static class281 field2706;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "[[B")
    public static byte[][] field2708;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII)V", line = 10)
    public static final void method1201(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class118.field1533.field6899 * arg1 >> 8;
        field2705++;
        if (arg2 == 29899 && var4 != 0 && arg0 != -1) {
            class13.method99(false, var4, 0, arg2 - 19816, arg0, class158.field2064);
            class286.field4089 = true;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIBZ)I", line = 32)
    public static final int method1202(int arg0, int arg1, byte arg2, boolean arg3) {
        int var4 = 106 / ((38 - arg2) / 52);
        field2714++;
        class220 var5 = class224.method1384(arg3, true, arg0);
        if (var5 == null) {
            return 0;
        } else if (arg1 >= 0 && var5.field3101.length > arg1) {
            return var5.field3101[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lts;B)Ljava/lang/String;", line = 63)
    public static final String method1203(class356 arg0, byte arg1) {
        field2712++;
        if (client.method1188(arg0).method2933(2015625216) == 0) {
            return null;
        } else if (arg0.field5229 == null || arg0.field5229.trim().length() == 0) {
            return class27.field438 ? "Hidden-use" : null;
        } else {
            if (arg1 < 32) {
                method1203(null, (byte) 37);
            }
            return arg0.field5229;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 86)
    public static void method1204(int arg0) {
        if (arg0 > 63) {
            field2708 = null;
            field2706 = null;
            field2707 = null;
        }
    }
}
