import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class173 extends class324 {

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "S")
    public short field2118;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Lea;")
    public static class474 field2121 = new class474("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "Lkm;")
    public static class299 field2123 = new class299();

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "Lea;")
    public static class474 field2124 = new class474("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "Lea;")
    public static class474 field2127 = new class474("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "Lsu;")
    public static class179 field2125;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 5)
    public static void method992(int arg0) {
        if (arg0 > -12) {
            field2121 = null;
        }
        field2127 = null;
        field2125 = null;
        field2121 = null;
        field2123 = null;
        field2124 = null;
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)V", line = 21)
    public static final void method993(int arg0) {
        if (arg0 != -1) {
            field2125 = null;
        }
        field2122++;
        class343.field4891.method1810(false);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 37)
    public class173() {
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIZII)V", line = 40)
    public static final void method994(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2120++;
        if (arg2 == -9368 && (arg3 ? class595.field8694.field6529 : class595.field8694.field6532) != 0 && arg5 != 0 && class220.field3015 < 50 && arg1 != -1) {
            class526.field7632[class220.field3015++] = new class85((byte) (arg3 ? 3 : 2), arg1, arg5, arg4, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(S)V", line = 63)
    public class173(short arg0) {
        this.field2118 = arg0;
    }
}
