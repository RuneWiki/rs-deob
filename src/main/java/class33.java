import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 extends class381 {

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "[I")
    public int[] field512;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "[I")
    public int[] field517;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "Lao;")
    public static class188 field516 = new class188(25, -2);

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "Lao;")
    public static class188 field518 = new class188(104, -1);

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "[I")
    public static int[] field520 = new int[1];

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "Lgf;")
    public static class180 field519 = new class180("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "Lje;")
    public static class275 field521;

    static {
        new class180("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V", line = 3)
    public static void method262(byte arg0) {
        field519 = null;
        field518 = null;
        field521 = null;
        if (arg0 != 107) {
            field518 = null;
        }
        field516 = null;
        field520 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)Z", line = 17)
    public static final boolean method263(int arg0, byte arg1) {
        field513++;
        if (arg1 != -16) {
            field518 = null;
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Lvb;", line = 29)
    public static final class130 method264(int arg0, int arg1) {
        field515++;
        if (arg1 > -92) {
            field520 = null;
        }
        if (arg0 == 0) {
            if ((double) class2.field29 == 3.0D) {
                return class503.field7374;
            }
            if ((double) class2.field29 == 4.0D) {
                return class121.field1896;
            }
            if ((double) class2.field29 == 6.0D) {
                return class246.field3569;
            }
            if ((double) class2.field29 >= 8.0D) {
                return class518.field7613;
            }
        } else if (arg0 == 1) {
            if ((double) class2.field29 == 3.0D) {
                return class246.field3569;
            }
            if ((double) class2.field29 == 4.0D) {
                return class518.field7613;
            }
            if ((double) class2.field29 == 6.0D) {
                return class335.field5138;
            }
            if ((double) class2.field29 >= 8.0D) {
                return class389.field5756;
            }
        } else if (arg0 == 2) {
            if ((double) class2.field29 == 3.0D) {
                return class335.field5138;
            }
            if ((double) class2.field29 == 4.0D) {
                return class389.field5756;
            }
            if ((double) class2.field29 == 6.0D) {
                return class242.field3511;
            }
            if ((double) class2.field29 >= 8.0D) {
                return class360.field5440;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V", line = 103)
    public static final void method265(byte arg0) {
        field514++;
        class231.method1508();
        if (arg0 != -67) {
            method262((byte) 91);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class255.field3679[var1].method982(arg0 ^ 0x30);
        }
        class74.method620(arg0 ^ 0x42);
        class24.method204((byte) -102);
        System.gc();
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(II[I[I)V", line = 126)
    public class33(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field512 = arg2;
        this.field517 = arg3;
    }
}
