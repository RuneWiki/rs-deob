import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class110 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lgb;")
    public static class213 field1935;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[Lfb;")
    public static class219[] field1932;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 4)
    public static void method804(boolean arg0) {
        field1935 = null;
        if (!arg0) {
            field1932 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lgb;ILgb;Lgb;Lgb;)V", line = 31)
    public static final void method805(class213 arg0, int arg1, class213 arg2, class213 arg3, class213 arg4) {
        class289.field4987 = arg0;
        class108.field1922 = arg2;
        class1.field6 = arg4;
        if (arg1 != 0) {
            method807(-96);
        }
        class240.field4177 = arg3;
        class23.field290 = new class171[class289.field4987.method1444(true)][];
        class48.field720 = new boolean[class289.field4987.method1444(true)];
        field1931++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lme;B)[Lti;", line = 51)
    public static final class220[] method806(class295 arg0, byte arg1) {
        field1934++;
        if (!arg0.method2081((byte) -121)) {
            return new class220[0];
        }
        class116 var2 = arg0.method2078(false);
        if (arg1 != -98) {
            method806((class295) null, (byte) 119);
        }
        while (var2.field2067 == 0) {
            class237.method1628((byte) -88, 10L);
        }
        if (var2.field2067 == 2) {
            return new class220[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field2063);
        class220[] var4 = new class220[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class220 var6 = new class220();
            var4[var5] = var6;
            var6.field3808 = var3[var5 << 2];
            var6.field3809 = var3[(var5 << 2) + 1];
            var6.field3815 = var3[(var5 << 2) + 2];
            var6.field3816 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Z", line = 96)
    public static final boolean method807(int arg0) {
        if (arg0 != 720049666) {
            field1933 = 35;
        }
        field1936++;
        return class257.field4390 ? true : class108.field1918;
    }
}
