import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class471 extends class16 {

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field6885;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Luf;")
    public static class310 field6886 = new class310(76, 7);

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field6889 = 0;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field6890 = 0;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Lfg;")
    public static class83 field6888 = new class83("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Ljm;")
    public static class485 field6891 = new class485(19, -1);

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Luf;")
    public static class310 field6892 = new class310(93, 12);

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 10)
    public final void method2775(int arg0) {
        int var2 = -92 % ((arg0 - 88) / 33);
        this.field6885.method2629();
        field6884++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V", line = 21)
    public static void method2776(boolean arg0) {
        field6892 = null;
        field6891 = null;
        field6888 = null;
        field6886 = null;
        if (!arg0) {
            field6892 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z", line = 41)
    public static final boolean method2777(int arg0, int arg1, int arg2) {
        field6887++;
        if (arg2 != 76) {
            field6886 = null;
        }
        return class9.method66(arg2 - 5671, arg1, arg0) | (arg1 & 0x70000) != 0 || class87.method607((byte) 92, arg1, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V", line = 57)
    public class471(int arg0) {
        this.field6885 = new NativeHeap(arg0);
    }
}
