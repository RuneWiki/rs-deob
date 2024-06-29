import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class84 extends class192 {

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Loh;")
    private static class258 field1413 = class153.method1046("flash1:", 87);

    @OriginalMember(owner = "client!b", name = "F", descriptor = "Loh;")
    public static class258 field1417 = field1413;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "Loh;")
    public static class258 field1422 = field1413;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "J")
    public static long field1425 = 0L;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "Loh;")
    public class258 field1421;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "[Ljh;")
    public static class226[] field1428;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "[[B")
    public static byte[][] field1427;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lva;I)V", line = 17)
    public final void method605(class235 arg0, int arg1) {
        field1416++;
        int var3 = -112 % ((arg1 - 74) / 34);
        while (true) {
            int var4 = arg0.method1589(82);
            if (var4 == 0) {
                return;
            }
            this.method606(var4, arg0, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILva;B)V", line = 38)
    private final void method606(int arg0, class235 arg1, byte arg2) {
        field1426++;
        if (arg0 == 1) {
            this.field1419 = arg1.method1589(65);
        } else if (arg0 == 2) {
            this.field1429 = arg1.method1611(28);
        } else if (arg0 == 5) {
            this.field1421 = arg1.method1620(98);
        }
        if (arg2 < 12) {
            method608(-34, -120, -121, 127, true);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Z", line = 72)
    public final boolean method607(int arg0) {
        field1418++;
        int var2 = 36 / ((-arg0 - 48) / 46);
        return this.field1419 == 115;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIZ)I", line = 90)
    public static final int method608(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1423++;
        int var5 = arg3 & 0xF;
        if (arg4) {
            return -33;
        } else {
            int var6 = var5 < 8 ? arg1 : arg0;
            int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg1 : arg2);
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V", line = 123)
    public static final void method609(int arg0, byte arg1) {
        field1424++;
        if (class92.method685(-1, arg0)) {
            if (arg1 < 75) {
                field1414 = 127;
            }
            class209.method1377((byte) -116, -1, class23.field290[arg0]);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 145)
    public static void method610(int arg0) {
        field1428 = null;
        field1413 = null;
        field1417 = null;
        field1427 = (byte[][]) null;
        if (arg0 != 15) {
            method608(75, 22, -46, 10, false);
        }
        field1422 = null;
    }
}
