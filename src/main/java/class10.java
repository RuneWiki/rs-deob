import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "J")
    public long field201;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "Len;")
    private class289 field199;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "Z")
    public static boolean field203 = false;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "Luc;")
    public static class27 field205 = new class27(16, 16);

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
    public static void method46(byte arg0) {
        field205 = null;
        int var1 = -105 / ((arg0 - 38) / 60);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)V")
    public static final void method47(boolean arg0) {
        field202++;
        class153.field2297 = 0;
        int var1 = (class253.field3576.field509 >> 9) + class511.field6989;
        if (!arg0) {
            method51(-96, 30);
        }
        int var2 = (class253.field3576.field514 >> 9) + class124.field1726;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class153.field2297 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class153.field2297 = 1;
        }
        if (class153.field2297 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class153.field2297 = 0;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(Z)V")
    public static final void method48(boolean arg0) {
        field207++;
        class235.field3391 = class432.field6119.field8301 + class432.field6119.field8307 + 2;
        class371.field5278 = new String[500];
        class186.field2742 = class226.field3256.field8307 + class226.field3256.field8301 + 2;
        if (!arg0) {
            for (int var1 = 0; var1 < class371.field5278.length; var1++) {
                class371.field5278[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ltc;I)V")
    public static final void method49(class320 arg0, int arg1) {
        class135.field1905 = arg0;
        field208++;
        int var2 = 66 % ((arg1 + 49) / 37);
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Len;JI)V")
    public class10(class289 arg0, long arg1, int arg2) {
        this.field201 = arg1;
        this.field199 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)Z")
    public static final boolean method50(int arg0, int arg1, int arg2) {
        if (arg2 > -94) {
            field203 = false;
        }
        field206++;
        return false;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
    public static final void method51(int arg0, int arg1) {
        field204++;
        class679 var2 = class669.method3708(arg1, arg0, 1403048928);
        var2.method3749(arg1 ^ 0xFFFFFF90);
    }

    @OriginalMember(owner = "client!hba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field200++;
        this.field199.method1788(this.field201, 115);
        super.finalize();
    }
}
