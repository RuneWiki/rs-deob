import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class59 {

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Lsd;")
    private static class166 field168 = class135.method935("To play on this world move to a free area first)3", 0);

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "Lsd;")
    public static class166 field169 = field168;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "Lsd;")
    public static class166 field174 = class135.method935("nicht hergestellt werden)3", 0);

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "Lsd;")
    private static class166 field173 = class135.method935("Your account is already logged in)3", 0);

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "Lsd;")
    public static class166 field180 = class135.method935(")4lang)4de", 0);

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "Lsd;")
    private static class166 field181 = class135.method935("Error loading your profile)3", 0);

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "Lsd;")
    public static class166 field171 = field181;

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "Lsd;")
    public static class166 field182 = field173;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ah", name = "ib", descriptor = "Lvd;")
    public static class193 field184;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "[I")
    public static int[] field176;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "[Lph;")
    public static class143[] field179;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 >= -124) {
            field177 = -97;
        }
        int[] var3 = super.field1219.method721(arg0, -128);
        ++field183;
        if (super.field1219.field1816) {
            class71.method568(var3, 0, class98.field1879, this.field178);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V")
    private class9(int arg0) {
        super(0, true);
        this.field178 = 4096;
        this.field178 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class9() {
        this(4096);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 <= 18) {
            this.method36(114, (byte) 50);
        }
        if (~arg2 == -1) {
            this.field178 = (arg0.method400(255) << 12) / 255;
        }
        ++field172;
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V")
    public static void method56(int arg0) {
        if (arg0 != -14878) {
            method56(25);
        }
        field184 = null;
        field174 = null;
        field180 = null;
        field171 = null;
        field179 = null;
        field168 = null;
        field181 = null;
        field182 = null;
        field169 = null;
        field176 = null;
        field173 = null;
    }
}
