import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class245 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lck;")
    public static class119 field3966 = class298.method1987((byte) 57, "Generic VGA Controller");

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lck;")
    private static class119 field3967 = class298.method1987((byte) 35, "Loaded update list");

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lck;")
    public static class119 field3969 = class298.method1987((byte) 30, "intel");

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lck;")
    private static class119 field3971 = class298.method1987((byte) 88, "flash1:");

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field3972 = 0;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lck;")
    public static class119 field3973 = field3967;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field3975 = 0;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lck;")
    public static class119 field3968 = field3971;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lck;")
    public static class119 field3965 = field3971;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Lob;")
    public static class294 field3974;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 11)
    public static void method1596(int arg0) {
        if (arg0 != 0) {
            field3967 = (class119) null;
        }
        field3969 = null;
        field3965 = null;
        field3974 = null;
        field3973 = null;
        field3971 = null;
        field3968 = null;
        field3966 = null;
        field3967 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)J", line = 67)
    public static final long method1597(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1596; var4++) {
            class196 var5 = var3.field1610[var4];
            if ((var5.field3130 >> 29 & 0x3L) == 2L && var5.field3131 == arg1 && var5.field3146 == arg2) {
                return var5.field3130;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
    public abstract void method1179(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1178(int arg0);
}
