import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class44 extends class82 {

    @OriginalMember(owner = "client!hb", name = "lb", descriptor = "La;")
    public static class1 field1168 = class113.method934(-11538, "(U5");

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "Z")
    public static boolean field1161 = false;

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "La;")
    public static class1 field1162 = class113.method934(-11538, ")1");

    @OriginalMember(owner = "client!hb", name = "ob", descriptor = "La;")
    public static class1 field1171 = class113.method934(-11538, "redstone1");

    @OriginalMember(owner = "client!hb", name = "qb", descriptor = "La;")
    public static class1 field1173 = class113.method934(-11538, "Fallen lassen");

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!hb", name = "jb", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hb", name = "kb", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hb", name = "nb", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hb", name = "pb", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!hb", name = "rb", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!hb", name = "mb", descriptor = "Lwc;")
    public static class134 field1169;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "Lhb;")
    public class44 field1160;

    @OriginalMember(owner = "client!hb", name = "ib", descriptor = "Lhb;")
    public class44 field1165;

    @OriginalMember(owner = "client!hb", name = "hb", descriptor = "[I")
    public static int[] field1164;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Le;", line = 8)
    public static final class25 method469(int arg0) {
        field1166++;
        class25 var1 = new class25();
        var1.field747 = class115.field2880;
        var1.field748 = class64.field1631;
        var1.field752 = class112.field2774[0];
        var1.field751 = class80.field1988[0];
        var1.field745 = class31.field838[0];
        var1.field750 = class130.field3197[0];
        var1.field746 = class8.field293;
        var1.field749 = class113.field2797[arg0];
        class42.method450(true);
        return var1;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 52)
    public final void method470(int arg0) {
        if (arg0 != 0) {
            method469(16);
        }
        field1170++;
        if (this.field1165 != null) {
            this.field1165.field1160 = this.field1160;
            this.field1160.field1165 = this.field1165;
            this.field1165 = null;
            this.field1160 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 77)
    public static final void method471(int arg0) {
        field1172++;
        if (arg0 != 23721) {
            field1173 = null;
        }
        class107.field2697 = new class92();
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V", line = 95)
    public static void method472(int arg0) {
        field1168 = null;
        field1173 = null;
        field1162 = null;
        field1171 = null;
        if (arg0 < 35) {
            method472(109);
        }
        field1169 = null;
        field1164 = null;
    }
}
