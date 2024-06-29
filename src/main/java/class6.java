import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class77 {

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Lgh;")
    public class73 field66;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field65 = 1;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Z")
    public static boolean field63 = false;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "[Llh;")
    public static class127[] field68 = new class127[500];

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Lbb;")
    public static class14 field64 = new class14(128);

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field70 = -1;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field69 = -1;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "Ldc;")
    public static class37 field72 = class185.method1233((byte) 86, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "[Lqi;")
    public static class183[] field67;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
    public static final void method45() {
        for (int var0 = 0; var0 < class95.field1674; var0++) {
            for (int var5 = 0; var5 < class238.field4372; var5++) {
                for (int var6 = 0; var6 < client.field682; var6++) {
                    class180.field3354[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class88.field1541; var1++) {
            for (int var4 = 0; var4 < class88.field1544[var1]; var4++) {
                class88.field1540[var1][var4] = null;
            }
            class88.field1544[var1] = 0;
        }
        for (int var2 = 0; var2 < class23.field393; var2++) {
            class243.field4455[var2] = null;
        }
        class23.field393 = 0;
        for (int var3 = 0; var3 < class117.field2093.length; var3++) {
            class117.field2093[var3] = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public static void method46(int arg0) {
        field67 = null;
        field64 = null;
        field72 = null;
        if (arg0 != 128) {
            field68 = null;
        }
        field68 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lgh;)V")
    public class6(class73 arg0) {
        this.field66 = arg0;
    }
}
