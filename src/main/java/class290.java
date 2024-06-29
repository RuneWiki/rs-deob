import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class290 {

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "[Lkj;")
    private class47[] field4119;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    private int field4109;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "Lap;")
    public static class310 field4114 = new class310(65, -1);

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4118;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "J")
    private long field4113;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Lkj;")
    private class47 field4111;

    static {
        new class151("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4117 = -1;
        field4118 = new String[100];
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZIZ)V", line = 5)
    public static final void method1903(boolean arg0, int arg1, boolean arg2) {
        if (!arg0) {
            return;
        }
        field4115++;
        class48 var3 = class317.method2019((byte) -109, arg1, arg2);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field723.length; var4++) {
                var3.field723[var4] = -1;
                var3.field725[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(JI)Lkj;", line = 40)
    public final class47 method1904(long arg0, int arg1) {
        field4112++;
        this.field4113 = arg0;
        class47 var4 = this.field4119[(int) (arg0 & (long) (this.field4109 - arg1))];
        for (this.field4111 = var4.field717; this.field4111 != var4; this.field4111 = this.field4111.field717) {
            if (this.field4111.field713 == arg0) {
                class47 var5 = this.field4111;
                this.field4111 = this.field4111.field717;
                return var5;
            }
        }
        this.field4111 = null;
        return null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(JBLkj;)V", line = 68)
    public final void method1905(long arg0, byte arg1, class47 arg2) {
        if (arg1 <= 56) {
            return;
        }
        field4110++;
        if (arg2.field718 != null) {
            arg2.method479((byte) -8);
        }
        class47 var5 = this.field4119[(int) (arg0 & (long) (this.field4109 - 1))];
        arg2.field717 = var5;
        arg2.field718 = var5.field718;
        arg2.field718.field717 = arg2;
        arg2.field713 = arg0;
        arg2.field717.field718 = arg2;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Lkj;", line = 96)
    public final class47 method1906(int arg0) {
        field4116++;
        if (this.field4111 == null) {
            return null;
        }
        class47 var2 = this.field4119[(int) ((long) (this.field4109 + arg0) & this.field4113)];
        while (this.field4111 != var2) {
            if (this.field4111.field713 == this.field4113) {
                class47 var3 = this.field4111;
                this.field4111 = this.field4111.field717;
                return var3;
            }
            this.field4111 = this.field4111.field717;
        }
        this.field4111 = null;
        return null;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V", line = 128)
    public static void method1907(int arg0) {
        if (arg0 != -16019) {
            field4114 = null;
        }
        field4114 = null;
        field4118 = null;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(I)V", line = 150)
    public class290(int arg0) {
        this.field4119 = new class47[arg0];
        this.field4109 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class47 var3 = this.field4119[var2] = new class47();
            var3.field718 = var3;
            var3.field717 = var3;
        }
    }
}
