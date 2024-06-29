import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class339 extends class519 {

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "Lek;")
    public static class352 field4254 = new class352(32);

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field4257 = new String[8];

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Lap;")
    public static class335 field4256 = new class335("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public int field4258;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "Lht;")
    public class412 field4249;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Ldc;")
    public static class5 field4259;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "[B")
    public byte[] field4250;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public static void method1949(byte arg0) {
        int var1 = -102 / ((-73 - arg0) / 47);
        field4257 = null;
        field4256 = null;
        field4254 = null;
        field4259 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    public static final void method1950(int arg0, int arg1) {
        class290.field3702.method2648(false, arg0);
        if (arg1 != -11420) {
            field4254 = null;
        }
        ++field4251;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)[B")
    public final byte[] method1951(int arg0) {
        if (arg0 != 8) {
            this.method1951(-87);
        }
        ++field4253;
        if (super.field7502) {
            throw new RuntimeException();
        } else {
            return this.field4250;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I")
    public final int method1952(byte arg0) {
        ++field4252;
        if (arg0 > -60) {
            return -8;
        } else {
            return super.field7502 ? 0 : 100;
        }
    }
}
