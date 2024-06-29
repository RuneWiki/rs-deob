import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class361 extends class179 {

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field5334;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lsk;")
    public static class423 field5336 = new class423("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "J")
    public static long field5337 = 0L;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V", line = 8)
    public static void method2195(int arg0) {
        if (arg0 != 458752) {
            method2195(-40);
        }
        field5336 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)I", line = 22)
    public static final int method2196(int arg0, byte arg1) {
        field5335++;
        int var2 = -17 / ((-arg1 - 33) / 37);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 31)
    public class361() {
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method2197(int arg0, int arg1, int arg2) {
        field5338++;
        if (arg1 != -1) {
            field5336 = null;
        }
        return (arg0 & 0x70000) != 0 | class247.method1494(arg2, -108, arg0) || class178.method1118((byte) -114, arg0, arg2);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V", line = 45)
    public class361(int arg0) {
        this.field5334 = arg0;
    }
}
