import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 extends class116 {

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public int field511;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[[I")
    public int[][] field508;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[I")
    public int[] field518;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "Lic;")
    public static class59 field516 = class59.method433(0, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Lic;")
    private static class59 field513 = class59.method433(0, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Lic;")
    public static class59 field510 = field513;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Lic;")
    public static class59 field514 = class59.method433(0, "<br>");

    @OriginalMember(owner = "client!d", name = "G", descriptor = "[I")
    public static int[] field522 = new int[50];

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Laf;")
    public static class7 field512 = new class7(32);

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Z")
    public static boolean field523 = false;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "Lic;")
    private static class59 field524 = class59.method433(0, "Bad session id)3");

    @OriginalMember(owner = "client!d", name = "L", descriptor = "Lic;")
    private static class59 field527 = class59.method433(0, "Password: ");

    @OriginalMember(owner = "client!d", name = "N", descriptor = "[Lic;")
    public static class59[] field529 = new class59[8];

    @OriginalMember(owner = "client!d", name = "O", descriptor = "Lic;")
    public static class59 field530 = field524;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "Lic;")
    private static class59 field526 = class59.method433(0, " is already on your ignore list)3");

    @OriginalMember(owner = "client!d", name = "M", descriptor = "Lic;")
    public static class59 field528 = field527;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Lic;")
    public static class59 field531 = field526;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "Lm;")
    public static class83 field525 = new class83();

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Ldd;")
    public static class26 field532;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method137(int arg0) {
        field517++;
        if (class67.field1667.toLowerCase().indexOf("microsoft") == -1) {
            class137.field3064[47] = 73;
            class137.field3064[45] = 26;
            class137.field3064[59] = 57;
            class137.field3064[91] = 42;
            class137.field3064[44] = 71;
            if (class67.field1664 == null) {
                class137.field3064[192] = 58;
                class137.field3064[222] = 59;
            } else {
                class137.field3064[192] = 28;
                class137.field3064[520] = 59;
                class137.field3064[222] = 58;
            }
            class137.field3064[92] = 74;
            class137.field3064[93] = 43;
            class137.field3064[61] = 27;
            class137.field3064[46] = 72;
        } else {
            class137.field3064[222] = 59;
            class137.field3064[188] = 71;
            class137.field3064[189] = 26;
            class137.field3064[192] = 58;
            class137.field3064[223] = 28;
            class137.field3064[221] = 43;
            class137.field3064[220] = 74;
            class137.field3064[191] = 73;
            class137.field3064[186] = 57;
            class137.field3064[187] = 27;
            class137.field3064[190] = 72;
            class137.field3064[219] = 42;
        }
        if (arg0 != 191) {
            field510 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    public static void method138(byte arg0) {
        field528 = null;
        field526 = null;
        if (arg0 != -118) {
            return;
        }
        field530 = null;
        field531 = null;
        field524 = null;
        field514 = null;
        field512 = null;
        field529 = null;
        field516 = null;
        field527 = null;
        field510 = null;
        field513 = null;
        field532 = null;
        field525 = null;
        field522 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)[B")
    public static final byte[] method139(byte[] arg0, byte arg1) {
        field509++;
        class157 var2 = new class157(arg0);
        int var3 = var2.method1194(false);
        if (arg1 != -119) {
            return null;
        }
        int var4 = var2.method1175((byte) -99);
        if (var4 < 0 || class56.field1369 != 0 && var4 > class56.field1369) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1168(var4, 0, var5, -1257469104);
            return var5;
        } else {
            int var6 = var2.method1175((byte) -108);
            if (var6 < 0 || class56.field1369 != 0 && class56.field1369 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class97.method797(var7, var6, arg0, var4, 9);
            } else {
                class149.field3255.method1084(var7, arg1 ^ 0xFFFFF424, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I[B)V")
    public class22(int arg0, byte[] arg1) {
        this.field511 = arg0;
        class157 var3 = new class157(arg1);
        this.field520 = var3.method1194(false);
        this.field508 = new int[this.field520][];
        this.field518 = new int[this.field520];
        for (int var4 = 0; var4 < this.field520; var4++) {
            this.field518[var4] = var3.method1194(false);
        }
        for (int var5 = 0; var5 < this.field520; var5++) {
            this.field508[var5] = new int[var3.method1194(false)];
        }
        for (int var6 = 0; var6 < this.field520; var6++) {
            for (int var7 = 0; var7 < this.field508[var6].length; var7++) {
                this.field508[var6][var7] = var3.method1194(false);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
    public static final boolean method140(int arg0, int arg1) {
        field515++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg0 != 0) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
