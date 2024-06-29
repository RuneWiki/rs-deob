import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class85 extends class217 {

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    private final int field1436;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    private final int field1432;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    private final int field1442;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    private final int field1438;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Lbe;")
    public static class283 field1440 = class153.method941(127, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lbe;")
    public static class283 field1435 = class153.method941(21, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lga;")
    public static class18 field1433 = new class18();

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Lbe;")
    public static class283 field1441 = class153.method941(126, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "[[B")
    public static byte[][] field1443;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V", line = 8)
    public final void method68(int arg0, int arg1, int arg2) {
        field1431++;
        int var4 = this.field1436 * arg0 >> 12;
        int var5 = this.field1442 * arg2 >> 12;
        if (arg1 >= -28) {
            field1435 = (class283) null;
        }
        int var6 = this.field1432 * arg2 >> 12;
        int var7 = this.field1438 * arg0 >> 12;
        class166.method1023(var6, var4, 94, this.field3679, this.field3672, var7, this.field3671, var5);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V", line = 28)
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1436 = arg0;
        this.field1432 = arg3;
        this.field1442 = arg1;
        this.field1438 = arg2;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)V", line = 42)
    public final void method67(int arg0, int arg1, int arg2) {
        field1437++;
        if (arg2 != 17113) {
            method550(50);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZII)V", line = 58)
    public final void method66(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1436 * arg2 >> 12;
        field1439++;
        int var5 = this.field1432 * arg1 >> 12;
        int var6 = this.field1442 * arg1 >> 12;
        int var7 = this.field1438 * arg2 >> 12;
        if (!arg0) {
            client.method1603(var6, var5, this.field3679, var7, var4, 130);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(III)I", line = 76)
    public static final int method549(int arg0, int arg1, int arg2) {
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        field1434++;
        int var4 = -49 % ((arg1 + 52) / 63);
        while (arg2 != 0) {
            int var5 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var5;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 109)
    public static void method550(int arg0) {
        if (arg0 != -9968) {
            method550(-10);
        }
        field1435 = null;
        field1443 = (byte[][]) null;
        field1433 = null;
        field1441 = null;
        field1440 = null;
    }
}
