import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class65 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field884 = "yellow:";

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
    public static boolean field885 = false;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[Lke;")
    public static class110[] field882;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method411(byte arg0) {
        field884 = null;
        int var1 = 66 % ((arg0 - 58) / 36);
        field882 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static final void method412(boolean arg0) {
        if (arg0) {
            field888 = 117;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class42.field640[var1] = true;
        }
        field886++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZ)V")
    public static final void method413(int arg0, int arg1, boolean arg2) {
        field883++;
        class216 var3 = class71.method442(8, arg1);
        int var4 = var3.field3254;
        int var5 = var3.field3262;
        int var6 = var3.field3253;
        int var7 = class75.field1052[var6 - var4];
        if (!arg2) {
            field884 = null;
        }
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class142.method953(~var8 & class119.field1677[var5] | arg0 << var4 & var8, var5, (byte) 89);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Llh;")
    public static final class295 method414(int arg0, int arg1) {
        field887++;
        if (arg0 != 0) {
            method411((byte) 64);
        }
        class295 var2 = (class295) class208.field2953.method540((byte) -124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class154.field2137.method1576(-49, 30, arg1);
        class295 var4 = new class295();
        if (var3 != null) {
            var4.method1977(-83, arg1, new class224(var3));
        }
        class208.field2953.method543(var4, (long) arg1, 858993459);
        return var4;
    }
}
