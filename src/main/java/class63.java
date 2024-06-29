import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class63 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "B")
    private byte field1056;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lha;")
    public static class46 field1057 = class271.method1828(" <col=ffff00>", -46);

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field1062 = 0;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lha;")
    public static class46 field1060 = class271.method1828(")4a=", -46);

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lha;")
    public static class46 field1065 = class271.method1828("b12_full", -46);

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field1070 = 0;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Lha;")
    public static class46 field1069 = class271.method1828("<br>(X100(U(Y", -46);

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lha;")
    private static class46 field1067 = class271.method1828("level: ", -46);

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "Lha;")
    public static class46 field1074 = field1067;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Lfa;")
    public static class211 field1071;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Lhh;")
    public static class263 field1075;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
    public static int[] field1058;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method440(int arg0) {
        field1074 = null;
        field1067 = null;
        field1069 = null;
        field1071 = null;
        field1065 = null;
        field1075 = null;
        field1060 = null;
        field1057 = null;
        field1058 = null;
        if (arg0 != -8) {
            method440(-23);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)I")
    public final int method441(boolean arg0) {
        field1066++;
        if (!arg0) {
            this.field1068 = 23;
        }
        return (this.field1056 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)I")
    public final int method442(int arg0) {
        if (arg0 == 7) {
            field1059++;
            return this.field1056 & 0x7;
        } else {
            return 47;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static final void method443(byte arg0) {
        class86.method673();
        field1072++;
        for (int var1 = 0; var1 < 4; var1++) {
            class183.field3282[var1].method1119(true);
        }
        if (arg0 < -124) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class63() {
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lwe;)V")
    public class63(class75 arg0) {
        this.field1056 = arg0.method569((byte) -110);
        this.field1055 = arg0.method545((byte) 91);
        this.field1073 = arg0.method562((byte) -71);
        this.field1068 = arg0.method562((byte) -71);
        this.field1054 = arg0.method562((byte) -71);
        this.field1064 = arg0.method562((byte) -71);
    }
}
