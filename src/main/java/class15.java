import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class15 extends class172 {

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field240 = 0;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "Ljava/lang/String;")
    public static String field249 = "Members object";

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 13)
    public static void method161(byte arg0) {
        int var1 = 86 % ((59 - arg0) / 59);
        field249 = null;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V", line = 23)
    public static final void method162(int arg0) {
        field239++;
        if (arg0 == 0 && class290.field4509 == 5) {
            class290.field4509 = 6;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(II)V", line = 38)
    public class15(int arg0, int arg1) {
        this.field241 = arg1;
        this.field243 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)[Lho;", line = 50)
    public static final class215[] method163(boolean arg0) {
        class215[] var1 = new class215[class9.field132];
        for (int var2 = 0; var2 < class9.field132; var2++) {
            int var3 = class62.field957[var2] * class358.field5694[var2];
            byte[] var4 = class172.field2732[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class38.field582[class301.method2169(255, var4[var6])];
            }
            if (class240.field3737) {
                var1[var2] = new class2(class280.field4332, class49.field776, class150.field2449[var2], class89.field1262[var2], class358.field5694[var2], class62.field957[var2], var5);
            } else {
                var1[var2] = new class361(class280.field4332, class49.field776, class150.field2449[var2], class89.field1262[var2], class358.field5694[var2], class62.field957[var2], var5);
            }
        }
        field245++;
        class29.method330(-1);
        if (!arg0) {
            field249 = (String) null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/lang/String;)I", line = 102)
    public static final int method164(byte arg0, String arg1) {
        if (arg0 != 86) {
            return 82;
        }
        int var2 = arg1.length();
        field246++;
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 124)
    public static final String[] method165(String[] arg0, int arg1) {
        field244++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        if (arg1 == 15000) {
            return var2;
        } else {
            return (String[]) null;
        }
    }
}
