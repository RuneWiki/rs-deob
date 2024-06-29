import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class317 {

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "Z")
    public static boolean field4617 = false;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field4618 = 1338;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "[[[B")
    public static byte[][][] field4622;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lgk;B)Lkaa;")
    public static final class624 method1965(class540 arg0, byte arg1) {
        if (arg1 != -43) {
            field4622 = null;
        }
        field4616++;
        return new class624(arg0.method3129(arg1 ^ 0xFFFFFFAF), arg0.method3129(arg1 ^ 0xFFFFFFB9), arg0.method3129(81), arg0.method3129(96), arg0.method3129(79), arg0.method3129(123), arg0.method3129(101), arg0.method3129(arg1 + 124), arg0.method3154((byte) -15), arg0.method3115(29871));
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([BI)V")
    public static final synchronized void method1966(byte[] arg0, int arg1) {
        field4621++;
        if (arg0.length == 100 && class302.field4485 < 1000) {
            class215.field2880[class302.field4485++] = arg0;
        } else if (arg0.length == arg1 && class503.field7121 < 250) {
            class471.field6783[class503.field7121++] = arg0;
        } else if (arg0.length == 30000 && class51.field796 < 50) {
            class155.field2192[class51.field796++] = arg0;
        } else if (class352.field5236 != null) {
            for (int var2 = 0; var2 < class150.field2118.length; var2++) {
                if (class150.field2118[var2] == arg0.length && class436.field6373[var2] < class352.field5236[var2].length) {
                    class352.field5236[var2][class436.field6373[var2]++] = arg0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1967(int arg0, int arg1) {
        field4619++;
        if (arg0 == arg1 && class302.field4485 > 0) {
            byte[] var2 = class215.field2880[--class302.field4485];
            class215.field2880[class302.field4485] = null;
            return var2;
        } else if (arg0 == 5000 && class503.field7121 > 0) {
            byte[] var3 = class471.field6783[--class503.field7121];
            class471.field6783[class503.field7121] = null;
            return var3;
        } else if (arg0 == 30000 && class51.field796 > 0) {
            byte[] var4 = class155.field2192[--class51.field796];
            class155.field2192[class51.field796] = null;
            return var4;
        } else {
            if (class352.field5236 != null) {
                for (int var5 = 0; var5 < class150.field2118.length; var5++) {
                    if (class150.field2118[var5] == arg0 && class436.field6373[var5] > 0) {
                        byte[] var6 = class352.field5236[var5][--class436.field6373[var5]];
                        class352.field5236[var5][class436.field6373[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)[Lmh;")
    public static final class139[] method1968(boolean arg0) {
        field4620++;
        if (!arg0) {
            method1965(null, (byte) -43);
        }
        return new class139[] { class20.field385, class125.field1826, class338.field4916, class639.field9182, class350.field5178, class625.field9042, class498.field7042, class538.field7897, class460.field6627, class285.field3809 };
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public static void method1969(int arg0) {
        field4622 = null;
        if (arg0 >= -60) {
            field4622 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)Z")
    public static final boolean method1970(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field4615++;
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }
}
