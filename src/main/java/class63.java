import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class63 {

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "Loi;")
    public static class73 field913 = new class73("", 14);

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "Loi;")
    public static class73 field915 = new class73("", 15);

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "Lfa;")
    public static class235 field917 = new class235(14, 0, 4, 1);

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "Lhb;")
    public static class728 field916;

    @OriginalMember(owner = "client!mia", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field912++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)V")
    public static final void method563(int arg0) {
        if (arg0 != -11) {
            field915 = null;
        }
        if (class87.field1246 == 3) {
            class49.method363(4, 100);
        } else if (class87.field1246 == 7) {
            class49.method363(8, -115);
        } else if (class87.field1246 == 10) {
            class49.method363(11, arg0 + 137);
        }
        field911++;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V")
    public static void method564(byte arg0) {
        field915 = null;
        if (arg0 == 61) {
            field916 = null;
            field917 = null;
            field913 = null;
        }
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(B)I")
    public final int method565(byte arg0) {
        if (arg0 >= -61) {
            field916 = null;
        }
        field909++;
        return this.field910;
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(II)V")
    public class63(int arg0, int arg1) {
        this.field910 = arg0;
        this.field914 = arg1;
    }
}
