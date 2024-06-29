import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class58 extends class117 {

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field784;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "Luf;")
    public static class310 field783 = new class310(23, 4);

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "Ltk;")
    public static class228 field787 = new class228(12, 0, 1, 0);

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "[I")
    public static int[] field790 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "[I")
    public static int[] field791 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "(I)Z")
    public final boolean method213(int arg0) {
        field786++;
        return arg0 == 10535 ? false : false;
    }

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "(I)V")
    public static void method375(int arg0) {
        field790 = null;
        field783 = null;
        field787 = null;
        field791 = null;
        if (arg0 != -339) {
            method376((byte) 81, null);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method376(byte arg0, String arg1) {
        if (class306.field4199 == null) {
            class12.method104(1);
        }
        int var2 = 102 % ((-arg0 - 59) / 34);
        field788++;
        String[] var3 = class96.method654(arg1, '\n', false);
        for (int var4 = 0; var4 < var3.length; var4++) {
            for (int var5 = class307.field4213; var5 > 0; var5--) {
                class306.field4199[var5] = class306.field4199[var5 - 1];
            }
            class306.field4199[0] = var3[var4];
            if (class306.field4199.length - 1 > class307.field4213) {
                if (class233.field3231 > 0) {
                    class233.field3231++;
                }
                class307.field4213++;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class58(Object arg0, int arg1) {
        super(arg1);
        this.field784 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method212(boolean arg0) {
        if (arg0) {
            this.method212(true);
        }
        field785++;
        return this.field784;
    }
}
