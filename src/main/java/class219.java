import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class219 extends class152 {

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "[B")
    public byte[] field3977;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field3981 = 0;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Loj;")
    public static class17 field3978 = new class17(5);

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Lhh;")
    private static class163 field3982 = class137.method1065("Players", 17);

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field3987 = 0;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "Lhh;")
    public static class163 field3988 = field3982;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "F")
    public static float field3985;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "Lv;")
    public static class22 field3986;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "[[B")
    public static byte[][] field3984;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([B)V")
    public class219(byte[] arg0) {
        this.field3977 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static final void method1551(boolean arg0) {
        field3980++;
        for (int var1 = 0; var1 < class28.field427; var1++) {
            class75 var2 = class64.method449(var1, (byte) 85);
            if (var2 != null && var2.field1417 == 0) {
                class213.field3881[var1] = 0;
                class119.field2252[var1] = 0;
            }
        }
        if (!arg0) {
            field3978 = null;
        }
        class169.field3093 = new class258(16);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public static void method1552(int arg0) {
        field3984 = null;
        if (arg0 != -26946) {
            method1553(-41, 5, -79);
        }
        field3982 = null;
        field3986 = null;
        field3978 = null;
        field3988 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)J")
    public static final long method1553(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        return var3 == null || var3.field2736 == null ? 0L : var3.field2736.field3817;
    }
}
