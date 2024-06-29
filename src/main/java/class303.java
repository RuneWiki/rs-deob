import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class303 extends class134 {

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4936 = "Loaded interfaces";

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field4932 = 0;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
    public static int[] field4934 = new int[500];

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public int field4928;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lhg;")
    public class207 field4931;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Lhg;")
    public class207 field4937;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Li;")
    public static class74 field4941;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Ljava/lang/String;")
    public String field4933;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Z")
    public boolean field4930;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field4935;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V")
    public static final void method2061(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            class16.field327++;
            class236.field3980.method640((byte) 97, 139);
        }
        if (arg3 >= -124) {
            return;
        }
        if (arg2 == 1) {
            class236.field3980.method640((byte) 97, 128);
            class239.field4028++;
        }
        class236.field3980.method1813(-1694, ++class240.field4059);
        class236.field3980.method1778(class26.field462 + arg1, -13989);
        class236.field3980.method1813(-1694, class157.field2581[82] ? 1 : 0);
        class236.field3980.method1790(arg0 + class78.field1313, -124);
        field4945++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZCLjava/lang/String;)I")
    public static final int method2062(boolean arg0, char arg1, String arg2) {
        field4942++;
        int var3 = arg2.length();
        int var4 = 0;
        if (!arg0) {
            return -78;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static final int method2063(int arg0, int arg1) {
        field4939++;
        if (class159.field2609 != null) {
            class159.field2609.method1070(-117);
            class159.field2609 = null;
        }
        class256.field4320++;
        if (class256.field4320 > 4) {
            class306.field4958 = 0;
            class256.field4320 = 0;
            return arg1;
        }
        class306.field4958 = 0;
        if (class205.field3286 == class142.field2346) {
            class205.field3286 = class132.field2179;
        } else {
            class205.field3286 = class142.field2346;
        }
        if (arg0 > -14) {
            method2061(-116, 65, -72, 118);
        }
        return -1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method2064(byte arg0) {
        field4941 = null;
        if (arg0 != -86) {
            method2063(22, 122);
        }
        field4934 = null;
        field4936 = null;
    }
}
