import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class70 {

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Lqf;")
    private static class117 field465 = class72.method514(124, "Enter message to send to ");

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Lqf;")
    public static class117 field471 = field465;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lqf;")
    public static class117 field474 = class72.method514(118, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Leb;")
    public static class31 field463 = new class31(64);

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Lqf;")
    public static class117 field476 = class72.method514(109, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Ldb;")
    public class24 field466;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Ldb;")
    public class24 field470;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public final void method185(int arg0) {
        field469++;
        if (this.field466 == null) {
            return;
        }
        this.field466.field470 = this.field470;
        if (arg0 > -105) {
            this.method185(19);
        }
        this.field470.field466 = this.field466;
        this.field470 = null;
        this.field466 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[BI)Lqf;")
    public static final class117 method186(int arg0, int arg1, byte[] arg2, int arg3) {
        field472++;
        class117 var4 = new class117();
        var4.field2800 = new byte[arg3];
        var4.field2799 = 0;
        if (arg1 != 64) {
            method186(99, 75, null, 51);
        }
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field2800[var4.field2799++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static final void method187(int arg0) {
        field473++;
        class94.field2283.method250((byte) -54);
        if (arg0 >= -48) {
            method188(98);
        }
        class105.field2527.method250((byte) -54);
        class117.field2806.method250((byte) -54);
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    public static void method188(int arg0) {
        if (arg0 != 32331) {
            return;
        }
        field465 = null;
        field471 = null;
        field463 = null;
        field474 = null;
        field476 = null;
    }
}
