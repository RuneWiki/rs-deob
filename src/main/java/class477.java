import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class477 {

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Lea;")
    public static class474 field7035 = new class474("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Lkca;")
    public static class73 field7036 = new class73(53, -1);

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public static int field7040 = -50;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "Lea;")
    public static class474 field7041 = new class474("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    public static int field7042 = 0;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 6)
    public static void method2916(int arg0) {
        int var1 = 115 % ((11 - arg0) / 33);
        field7035 = null;
        field7041 = null;
        field7036 = null;
    }

    @OriginalMember(owner = "client!lba", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field7034++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lqf;BLqf;)V", line = 32)
    public static final void method2917(class593 arg0, byte arg1, class593 arg2) {
        class308.method2044(class277.field3861, -7434);
        if (arg1 != 60) {
            method2916(73);
        }
        field7038++;
        class262.field3718++;
        class468.field6960.method1223(true, arg2.field8579);
        class468.field6960.method1235(arg0.field8601, (byte) 11);
        class468.field6960.method1175(-28, arg0.field8579);
        class468.field6960.method1216(arg0.field8593, -13119);
        class468.field6960.method1235(arg2.field8601, (byte) 11);
        class468.field6960.method1196((byte) 54, arg2.field8593);
    }
}
