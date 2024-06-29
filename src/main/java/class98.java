import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class98 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1739 = 0;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Z")
    public static boolean field1742 = false;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Ljf;")
    public static class229 field1747 = class212.method1457((byte) 84, " weitere Optionen");

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1744 = 0;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
    public static boolean field1750 = true;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Ljf;")
    public static class229 field1749 = class212.method1457((byte) 115, "leuchten2:");

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Z")
    public static boolean field1746 = false;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljf;")
    public static class229 field1738 = class212.method1457((byte) 118, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Ljf;")
    public static class229 field1752 = class212.method1457((byte) 90, "M");

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[Lnf;")
    public static class67[] field1743;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 6)
    public static final void method668(int arg0) {
        class6.method39(60);
        class235.method1674(44);
        field1741++;
        class90.method639((byte) -45);
        class38.method338(arg0 ^ 0x65);
        class170.method1163(100);
        class157.method1053(arg0 ^ arg0);
        class143.method1001((byte) -117);
        class242.method1752(true);
        class211.method1450((byte) -28);
        class257.method1833(-758);
        class70.method520(arg0 + 2);
        class15.method151(false);
        class3.method16(1);
        class132.method917((byte) 55);
        class122.field2165.method230(true);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 28)
    public static void method669(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1749 = null;
        field1743 = null;
        field1738 = null;
        field1747 = null;
        field1752 = null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V", line = 50)
    public static final void method670(int arg0) {
        field1751++;
        if (arg0 != -29244) {
            method668(-19);
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class281.method1970(true, class312.field5246, var1, var2, arg0 ^ 0x632C, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 84)
    public static final void method671(int arg0) {
        field1745++;
        for (int var1 = 0; var1 < 100; var1++) {
            class244.field4341[var1] = true;
        }
        if (arg0 != 1) {
            method671(-52);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Z", line = 113)
    public static final boolean method672(int arg0, int arg1) {
        if (arg1 != 8459) {
            method672(52, -104);
        }
        field1740++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjf;Z)V", line = 141)
    public static final void method673(int arg0, class229 arg1, boolean arg2) {
        field1748++;
        if (arg0 != 1) {
            method670(-39);
        }
        if (!arg2) {
            try {
                class106.field1841.getAppletContext().showDocument(arg1.method1650((byte) -91, class106.field1841.getCodeBase()), "_top");
            } catch (Exception var6) {
            }
            return;
        }
        if (class108.field1900 && class208.field3608) {
            try {
                class177.method1196(class215.field3689.field3461, new Object[] { arg1.method1650((byte) -100, class106.field1841.getCodeBase()).toString() }, "openjs", 11677);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class106.field1841.getAppletContext().showDocument(arg1.method1650((byte) -112, class106.field1841.getCodeBase()), "_blank");
        } catch (Exception var7) {
        }
    }
}
