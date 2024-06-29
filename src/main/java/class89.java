import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class89 extends class336 implements class154 {

    @OriginalMember(owner = "client!oia", name = "u", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "client!oia", name = "n", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!oia", name = "p", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!oia", name = "q", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!oia", name = "r", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!oia", name = "s", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!oia", name = "t", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!oia", name = "v", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(III[B)V", line = 3)
    public final void method678(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method2024(arg0, arg3, 0);
        ++field1090;
        this.field1089 = arg2;
        if (arg1 != 20218) {
            this.method680((byte) -49);
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)J", line = 18)
    public final long method679(int arg0) {
        ++field1085;
        if (arg0 != -4468) {
            this.field1089 = -58;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)V", line = 29)
    public final void method680(byte arg0) {
        ++field1083;
        int var2 = -35 / ((-2 - arg0) / 59);
        super.field4771.method3654((byte) 82, this);
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)Z", line = 43)
    public static final boolean method681(int arg0) {
        ++field1086;
        class195 var1 = (class195) class37.field526.method21(arg0 ^ 2);
        if (var1 == null) {
            return false;
        } else {
            for (int var2 = arg0; var2 < var1.field2941; ++var2) {
                if (var1.field2936[var2] != null && var1.field2936[var2].field2987 == 0) {
                    return false;
                }
                if (var1.field2937[var2] != null && var1.field2937[var2].field2987 == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(B)I", line = 82)
    public final int method682(byte arg0) {
        if (arg0 <= 13) {
            this.method679(-10);
        }
        ++field1082;
        return this.field1089;
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lrda;I[BIZ)V", line = 94)
    public class89(class663 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field1089 = arg1;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Z)I", line = 104)
    public final int method683(boolean arg0) {
        if (arg0) {
            return -1;
        } else {
            ++field1087;
            return super.field4759;
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lvfa;BI)Ljava/lang/String;", line = 115)
    public static final String method684(class672 arg0, byte arg1, int arg2) {
        if (arg1 != 94) {
            return null;
        } else {
            ++field1084;
            if (!client.method1875(arg0).method1348(arg2, 3) && arg0.field9296 == null) {
                return null;
            } else if (arg0.field9330 != null && ~arg2 > ~arg0.field9330.length && arg0.field9330[arg2] != null && arg0.field9330[arg2].trim().length() != 0) {
                return arg0.field9330[arg2];
            } else {
                return class320.field4567 ? "Hidden-" + arg2 : null;
            }
        }
    }
}
