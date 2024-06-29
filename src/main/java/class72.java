import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class72 {

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "Lgf;")
    public static class180 field1203 = new class180("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1206 = -2;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Lnc;")
    public static class21 field1204 = new class21(0);

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Z")
    public static boolean field1209;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "[Ldn;")
    public static class357[] field1210;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "F")
    public static float field1208;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method604(byte arg0) {
        if (arg0 > -79) {
            field1209 = false;
        }
        field1203 = null;
        field1204 = null;
        field1210 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIZILhh;)V")
    public static final void method605(int arg0, int arg1, int arg2, boolean arg3, int arg4, class84 arg5) {
        class156.field2378 = arg0;
        class459.field6777 = arg1;
        field1205++;
        class480.field7037 = arg2;
        class43.field655 = 1;
        class251.field3626 = arg5;
        class264.field3815 = 10000;
        if (arg4 != 0) {
            method604((byte) -84);
        }
        class494.field7205 = arg3;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method606(int arg0, int arg1, byte arg2) {
        field1202++;
        if ((class364.field5475[1][arg0][arg1] & 0x2) == 0) {
            return arg2 > -36;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static final void method607(int arg0) {
        class272.field3938 = arg0;
        for (int var1 = 0; var1 < class246.field3560; var1++) {
            for (int var2 = 0; var2 < class254.field3675; var2++) {
                if (class36.field545[arg0][var1][var2] == null) {
                    class36.field545[arg0][var1][var2] = new class165(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    public static final void method608(int arg0) {
        field1207++;
        class106.field1669 = arg0;
        class246.field3563.method2264(104);
        class314.field4487 = false;
    }

    static {
        new class180(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field1209 = false;
        field1210 = new class357[14];
    }
}
