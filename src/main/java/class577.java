import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class577 implements class617 {

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lsaa;")
    public static class507 field7972 = new class507("WTQA", 2);

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Ltk;")
    public static class73 field7974 = new class73();

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V", line = 3)
    public static void method3248(int arg0) {
        field7974 = null;
        int var1 = 101 / ((arg0 + 78) / 47);
        field7972 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Z", line = 13)
    public final boolean method36(byte arg0) {
        int var2 = 113 % ((arg0 - 12) / 32);
        field7968++;
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 23)
    public final void method39(int arg0) {
        if (arg0 < 105) {
            field7972 = null;
        }
        field7967++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)V", line = 39)
    public final void method41(boolean arg0, int arg1) {
        class149.method1009(class644.field9132[class138.field1716], class556.field7597, false, class75.field953, class401.field5694[class138.field1716], class140.field1788[class138.field1716]);
        field7969++;
        if (arg1 != 7571) {
            this.method36((byte) 57);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 51)
    public final void method40(boolean arg0) {
        class544.method3069(-1);
        field7971++;
        if (!arg0) {
            field7974 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Z", line = 62)
    public static final boolean method3249(int arg0, int arg1) {
        if (arg1 != -7) {
            method3249(-85, -65);
        }
        field7970++;
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)I", line = 80)
    public final int method35(int arg0) {
        field7973++;
        return arg0 == 18342 ? 100 : 105;
    }
}
