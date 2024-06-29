import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class260 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field4151 = 0;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4153 = "flash3:";

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4152 = "red:";

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field4162 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field4154;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public int field4163;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 17)
    public static final void method1857(String arg0, int arg1) {
        field4160++;
        int var2 = class58.method370((byte) -128, arg0);
        if (var2 == -1) {
            return;
        }
        if (arg1 <= 111) {
            method1858(false);
        }
        int[] var3 = class225.field3604.method2086(class20.field289.field3269[var2] >> 14 & 0x3FFF, (byte) 73, (class20.field289.field3269[var2] & 0x31A5488C) >> 28, class20.field289.field3269[var2] & 0x3FFF);
        class141.method1045(var3[2], -25697, var3[1]);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 37)
    public static void method1858(boolean arg0) {
        field4153 = null;
        if (!arg0) {
            method1857((String) null, 82);
        }
        field4152 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
    public abstract void method1856(int arg0, int arg1);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
    public abstract void method1859(int arg0, int arg1, int arg2);
}
