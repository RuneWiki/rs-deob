import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class579 {

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "Lnp;")
    public class154 field7895 = new class154();

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public static int field7896 = 0;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "F")
    public static float field7892;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "Lnp;")
    private class154 field7897;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Lnp;")
    public final class154 method3179(boolean arg0) {
        field7889++;
        if (!arg0) {
            field7896 = 69;
        }
        class154 var2 = this.field7895.field1956;
        if (this.field7895 == var2) {
            this.field7897 = null;
            return null;
        } else {
            this.field7897 = var2.field1956;
            return var2;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)I")
    public static final int method3180(int arg0, int arg1) {
        return class612.field8277 == null ? 0 : class612.field8277[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lnp;")
    public final class154 method3181(int arg0) {
        field7890++;
        if (arg0 != 0) {
            field7896 = 14;
        }
        class154 var2 = this.field7897;
        if (this.field7895 == var2) {
            this.field7897 = null;
            return null;
        } else {
            this.field7897 = var2.field1956;
            return var2;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lnp;I)V")
    public final void method3182(class154 arg0, int arg1) {
        field7888++;
        if (arg0.field1950 != null) {
            arg0.method1111(-34);
        }
        arg0.field1950 = this.field7895.field1950;
        if (arg1 == 0) {
            arg0.field1956 = this.field7895;
            arg0.field1950.field1956 = arg0;
            arg0.field1956.field1950 = arg0;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)I")
    public final int method3183(byte arg0) {
        field7891++;
        int var2 = 0;
        class154 var3 = this.field7895.field1956;
        int var4 = 25 / ((arg0 - 46) / 60);
        while (this.field7895 != var3) {
            var3 = var3.field1956;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
    public final void method3184(int arg0) {
        while (true) {
            class154 var2 = this.field7895.field1956;
            if (this.field7895 == var2) {
                if (arg0 >= -27) {
                    method3180(102, -34);
                }
                field7894++;
                this.field7897 = null;
                return;
            }
            var2.method1111(-124);
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "()V")
    public class579() {
        this.field7895.field1950 = this.field7895;
        this.field7895.field1956 = this.field7895;
    }
}
