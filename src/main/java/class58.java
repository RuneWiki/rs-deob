import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class58 extends class142 {

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field873 = 0;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field878 = 127;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Ljava/lang/String;")
    public static String field881 = "flash1:";

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "[I")
    public static int[] field877 = new int[50];

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Z")
    public static boolean field884 = true;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lnm;")
    public static class221 field883;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lnm;")
    public static class221 field885;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lmc;")
    public class58 field874;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lmc;")
    public class58 field876;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILsi;I)I", line = 6)
    public static final int method429(int arg0, class264 arg1, int arg2) {
        field880++;
        if (!client.method898(arg1).method526(arg2, false) && arg1.field4332 == null) {
            return -1;
        } else {
            if (arg0 != -1) {
                method432(19);
            }
            return arg1.field4268 == null || arg2 >= arg1.field4268.length ? -1 : arg1.field4268[arg2];
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLnm;)V", line = 28)
    public static final void method430(boolean arg0, class221 arg1) {
        field886++;
        if (!arg0) {
            class130.field1981 = arg1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V", line = 41)
    public static final void method431(byte arg0, int arg1) {
        field882++;
        class346.method2437((byte) 0);
        class105.method695(arg0 - 10951);
        int var2 = class187.method1290(63, arg1).field1657;
        if (var2 == 0) {
            return;
        }
        int var3 = class170.field2650[arg1];
        if (var2 == 6) {
            class86.field1242 = var3;
        }
        if (var2 == 9) {
            class33.field493 = var3;
        }
        if (arg0 == 44 && var2 == 5) {
            class40.field604 = var3;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 82)
    public static void method432(int arg0) {
        field883 = null;
        field881 = null;
        field885 = null;
        field877 = null;
        if (arg0 != -5784) {
            method432(-48);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 95)
    public final void method433(int arg0) {
        field879++;
        if (this.field876 == null) {
            return;
        }
        this.field876.field874 = this.field874;
        if (arg0 != 5) {
            field884 = true;
        }
        this.field874.field876 = this.field876;
        this.field876 = null;
        this.field874 = null;
    }
}
