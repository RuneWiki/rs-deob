import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class68 {

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "Lni;")
    public static class363 field884 = new class363("WTRC", 1);

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "[I")
    public static int[] field887 = new int[4096];

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "Ljt;")
    public class68 field878;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Ljt;")
    public class68 field880;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)Lud;", line = 4)
    public static final class27 method602(int arg0, byte arg1) {
        if (arg1 > -41) {
            field887 = null;
        }
        field883++;
        class27[] var2 = class49.method509(-49);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field389 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V", line = 38)
    public final void method603(int arg0) {
        field885++;
        if (this.field878 == null) {
            return;
        }
        if (arg0 != 0) {
            method604(-83);
        }
        this.field878.field880 = this.field880;
        this.field880.field878 = this.field878;
        this.field878 = null;
        this.field880 = null;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V", line = 58)
    public static final void method604(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class229.field2928[var1] = true;
        }
        if (arg0 != -9192) {
            method604(36);
        }
        field882++;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V", line = 76)
    public static final void method605(boolean arg0) {
        field879++;
        int var1 = class436.field6234;
        int[] var2 = class12.field218;
        for (int var3 = 0; var3 < var1; var3++) {
            class223 var7 = class387.field5107[var2[var3]];
            if (var7 != null && var7.field4932 > 0) {
                var7.field4932--;
                if (var7.field4932 == 0) {
                    var7.field4869 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class489.field7114; var4++) {
            int var5 = class403.field5735[var4];
            class295 var6 = class187.field2446[var5];
            if (var6 != null && var6.field4932 > 0) {
                var6.field4932--;
                if (var6.field4932 == 0) {
                    var6.field4869 = null;
                }
            }
        }
        if (!arg0) {
            field884 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V", line = 129)
    public static void method606(int arg0) {
        field884 = null;
        if (arg0 != -1) {
            field884 = null;
        }
        field887 = null;
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V", line = 141)
    public static final void method607(int arg0) {
        field881++;
        if (class243.field3148) {
            class5.field50 = null;
            class367.field4755 = null;
            int var1 = 87 % ((arg0 - 29) / 61);
            class243.field3148 = false;
        }
    }
}
