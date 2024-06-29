import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 extends class146 {

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Lec;")
    public static class32 field214 = class73.method594("Bitte laden Sie die Seite neu)3", true);

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Laa;")
    public static class2 field217 = new class2();

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field220 = -1;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "Lec;")
    public static class32 field222 = class73.method594("Mem:", true);

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public static int field225 = 0;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lbe;")
    public class13 field212;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Lbe;")
    public class13 field216;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Lea;")
    public static class30 field226;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Z")
    public static boolean field219;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public final void method68(boolean arg0) {
        field211++;
        if (this.field216 == null) {
            return;
        }
        this.field216.field212 = this.field212;
        this.field212.field216 = this.field216;
        this.field212 = null;
        if (arg0) {
            field223 = -118;
        }
        this.field216 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
    public static final boolean method69(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field224 = -107;
        }
        field213++;
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public static void method70(int arg0) {
        field217 = null;
        field226 = null;
        field214 = null;
        field222 = null;
        if (arg0 < 100) {
            field222 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIII)V")
    public static final void method71(boolean arg0, int arg1, int arg2, int arg3) {
        field218++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class32.field652 = arg3;
        if (arg2 != -14222) {
            field225 = 52;
        }
        class56.field1311 = arg0;
        class139.field3213 = arg1;
    }
}
