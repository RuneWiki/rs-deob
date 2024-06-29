import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class217 extends class508 {

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "[B")
    public byte[] field2778;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "Lpi;")
    public static class340 field2779 = new class340(45, 12);

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "Loi;")
    public static class169 field2781 = new class169("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "Ldn;")
    public static class201 field2780;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
    public static void method1390(boolean arg0) {
        field2779 = null;
        if (arg0) {
            method1390(false);
        }
        field2780 = null;
        field2781 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1391(int arg0, int arg1, byte arg2) {
        field2777++;
        if (arg2 <= 96) {
            field2779 = null;
        }
        return (arg1 & 0x800) != 0 | class78.method449(arg1, 115, arg0) || class386.method2304(arg0, arg1, -1);
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "([B)V")
    public class217(byte[] arg0) {
        this.field2778 = arg0;
    }
}
