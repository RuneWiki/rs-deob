import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class551 {

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public int field7854 = 128;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public int field7858 = 128;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public int field7856;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    public int field7860;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public int field7855;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public int field7861;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "F")
    public static float field7852;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)V")
    public static final void method3214(int arg0, int arg1) {
        class186 var2 = class80.field1136[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class186 var4 = class80.field1136[var3][arg0][arg1] = class80.field1136[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class754 var5 = var4.field2830; var5 != null; var5 = var5.field10537) {
                    class119 var6 = var5.field10542;
                    if (var6.field1628 == arg0 && var6.field1626 == arg1) {
                        var6.field8429--;
                    }
                }
                if (var4.field2844 != null) {
                    var4.field2844.field8429--;
                }
                if (var4.field2834 != null) {
                    var4.field2834.field8429--;
                }
                if (var4.field2841 != null) {
                    var4.field2841.field8429--;
                }
                if (var4.field2835 != null) {
                    var4.field2835.field8429--;
                }
                if (var4.field2832 != null) {
                    var4.field2832.field8429--;
                }
            }
        }
        if (class80.field1136[0][arg0][arg1] == null) {
            class80.field1136[0][arg0][arg1] = new class186(0);
            class80.field1136[0][arg0][arg1].field2831 = 1;
        }
        class80.field1136[0][arg0][arg1].field2842 = var2;
        class80.field1136[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILlba;)V")
    public final void method3215(int arg0, class551 arg1) {
        this.field7854 = arg1.field7854;
        field7859++;
        this.field7860 = arg1.field7860;
        this.field7856 = arg1.field7856;
        this.field7855 = arg1.field7855;
        if (arg0 == 0) {
            this.field7861 = arg1.field7861;
            this.field7858 = arg1.field7858;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)Llba;")
    public final class551 method3216(byte arg0) {
        field7853++;
        int var2 = -8 % ((-arg0 - 31) / 47);
        return new class551(this.field7856, this.field7858, this.field7854, this.field7855, this.field7861, this.field7860);
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V")
    public class551(int arg0) {
        this.field7856 = arg0;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IIIIII)V")
    private class551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7860 = arg5;
        this.field7856 = arg0;
        this.field7855 = arg3;
        this.field7854 = arg2;
        this.field7858 = arg1;
        this.field7861 = arg4;
    }
}
