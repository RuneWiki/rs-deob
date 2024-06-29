import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class8 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field134 = 0;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ltd;")
    private static class136 field139 = class145.method1172("wave:", 45);

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Ltd;")
    public static class136 field138 = field139;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Ltd;")
    public static class136 field136 = class145.method1172("k", 45);

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Ltd;")
    public static class136 field135 = field139;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field141 = 0;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field137 = new CRC32();

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lue;")
    public static class143 field144 = new class143(64);

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Ltd;")
    public static class136 field146 = class145.method1172("Der Anmelde)2Server ist offline)3", 45);

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ltd;")
    private static class136 field145 = class145.method1172("RuneScape is loading )2 please wait)3)3)3", 45);

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Ltd;")
    public static class136 field148 = field145;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)[B")
    public abstract byte[] method38(byte arg0);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method39(int arg0) {
        if (arg0 == 0) {
            class2.field26 = new class69();
            field143++;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static void method40(byte arg0) {
        field136 = null;
        field137 = null;
        field146 = null;
        field145 = null;
        field148 = null;
        if (arg0 >= -14) {
            method39(-40);
        }
        field135 = null;
        field138 = null;
        field139 = null;
        field144 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B)V")
    public abstract void method41(int arg0, byte[] arg1);
}
