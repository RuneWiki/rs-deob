import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class595 {

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    private int field7984;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    private int field7974;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    private int field7980;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    private int field7971;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    private int field7975;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    private int field7978;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    private int field7973;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    private int field7977;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    private int field7972;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    private int field7970;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "Ldr;")
    public static class675 field7976 = new class675(36, 4);

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "Lsba;")
    public static class205 field7983 = class156.method958(2158);

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "Lub;")
    public static class20 field7985;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "[I")
    public static int[] field7986;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 8)
    public static void method3288(int arg0) {
        field7983 = null;
        field7986 = null;
        field7976 = null;
        field7985 = null;
        if (arg0 != 36) {
            field7985 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I", line = 24)
    public static final int method3289(int arg0) {
        if (arg0 == -24064) {
            field7982++;
            return class477.field5949;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIII)Z", line = 42)
    public final boolean method3290(int arg0, int arg1, int arg2, int arg3) {
        field7981++;
        if (arg2 < this.field7977 || this.field7978 < arg2) {
            return false;
        } else if (this.field7975 > arg0 || this.field7970 < arg0) {
            return false;
        } else if (arg3 >= this.field7972 && this.field7973 >= arg3) {
            if (arg1 != 5695) {
                this.method3290(44, 45, 3, -114);
            }
            int var5 = arg2 - this.field7974;
            int var6 = arg3 - this.field7971;
            return this.field7984 > var5 * var5 + var6 * var6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIBIIIIIII)V", line = 67)
    public final void method3291(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field7984 = arg8 * arg8;
        field7979++;
        this.field7974 = arg5;
        this.field7971 = arg4;
        this.field7980 = arg1;
        this.field7975 = this.field7980 + arg7;
        this.field7978 = this.field7974 + arg2;
        this.field7977 = this.field7974 + arg10;
        if (arg3 <= -1) {
            this.field7972 = this.field7971 + arg9;
            this.field7970 = this.field7980 + arg0;
            this.field7973 = this.field7971 + arg6;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 94)
    public class595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field7984 = arg3 * arg3;
        this.field7974 = arg0;
        this.field7980 = arg1;
        this.field7971 = arg2;
        this.field7975 = this.field7980 + arg6;
        this.field7978 = this.field7974 + arg5;
        this.field7973 = this.field7971 + arg9;
        this.field7977 = this.field7974 + arg4;
        this.field7972 = this.field7971 + arg8;
        this.field7970 = this.field7980 + arg7;
    }
}
