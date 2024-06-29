import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class526 implements class167 {

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "Lbt;")
    private class48 field7427;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Lii;")
    private class580 field7429;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Lbt;")
    private class48 field7424;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Llja;")
    public static class744 field7428 = new class744(27, 3);

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Lda;")
    private class67 field7430;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
    public final void method821(int arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field7429.field7909.method860((byte) -62, class243.field2870, this.field7429.field7900) + this.field7429.field7904;
            int var4 = this.field7429.field7907.method102(this.field7429.field7906, (byte) 60, class412.field5381) + this.field7429.field7901;
            this.field7430.method668(0, this.field7429.field7897, false, this.field7429.field7908, 0, var4, this.field7429.field7895, this.field7429.field7898, this.field7429.field7910, this.field7429.field7906, null, null, this.field7429.field7900, null, var3, this.field7429.field7911);
        }
        field7432++;
        int var5 = 100 / ((arg0 - 53) / 52);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public static void method3144(byte arg0) {
        field7428 = null;
        if (arg0 != -58) {
            field7428 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
    public final boolean method685(int arg0) {
        if (arg0 != -18299) {
            this.field7429 = null;
        }
        field7433++;
        boolean var2 = true;
        if (!this.field7424.method433((byte) -74, this.field7429.field7893)) {
            var2 = false;
        }
        if (!this.field7427.method433((byte) -93, this.field7429.field7893)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public final void method684(int arg0) {
        field7426++;
        class307 var2 = class779.method4323(-1, this.field7427, this.field7429.field7893);
        if (arg0 == 30573) {
            this.field7430 = class363.field4526.method579(var2, class600.method3419(this.field7424, this.field7429.field7893), true);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
    public static final void method3145(int arg0, int arg1) {
        field7431++;
        if (arg0 >= -5) {
            field7428 = null;
        }
        for (class379 var2 = class539.field7586.method2119(-73); var2 != null; var2 = class539.field7586.method2111((byte) -123)) {
            if ((var2.field4809 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method2219(13630);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lbt;Lbt;Lii;)V")
    public class526(class48 arg0, class48 arg1, class580 arg2) {
        this.field7427 = arg1;
        this.field7429 = arg2;
        this.field7424 = arg0;
    }
}
