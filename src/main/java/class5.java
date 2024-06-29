import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class97 {

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "[I")
    public static int[] field145 = new int[256];

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lea;")
    public static class38 field140 = class9.method46((byte) 125, "mapback");

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lea;")
    private static class38 field144 = class9.method46((byte) 110, "Drop");

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lea;")
    public static class38 field138 = field144;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lea;")
    public static class38 field146 = class9.method46((byte) 108, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "[Lud;")
    public static class183[] field149;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lea;")
    public class38 field139;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "[Lk;")
    public static class89[] field151;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Z")
    public static final boolean method25(int arg0, byte arg1) {
        if (arg1 != -10) {
            field145 = null;
        }
        field143++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public static final void method26(int arg0) {
        field147++;
        class193.field3809.method928(5);
        if (arg0 != -7242) {
            field140 = null;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class23.field496[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class4.field124[var2] = 0L;
        }
        class124.field2669 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ldd;I)V")
    public static final void method27(class32 arg0, int arg1) {
        int var2 = -96 / ((27 - arg1) / 44);
        class67.field1698 = arg0;
        field141++;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)V")
    public static void method28(boolean arg0) {
        field144 = null;
        field151 = null;
        field146 = null;
        if (!arg0) {
            method26(83);
        }
        field138 = null;
        field145 = null;
        field149 = null;
        field140 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field145[var0] = var1;
        }
        field148 = 500;
        field149 = new class183[50];
        field150 = 0;
    }
}
