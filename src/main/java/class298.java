import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class298 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field4551 = 0;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "J")
    public static volatile long field4556 = 0L;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4559 = "Loading title screen - ";

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lee;")
    public static class297 field4554 = new class297(0, 0);

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I", line = 5)
    public static final int method2074(int arg0, int arg1) {
        if (arg0 > -38) {
            return 85;
        } else {
            field4553++;
            return (arg1 & 0x3F9BC) >> 11;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)I", line = 17)
    public static final int method2075(int arg0, int arg1) {
        if (arg1 != 3614) {
            method2074(-28, 71);
        }
        field4557++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 29)
    public static final void method2076(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class115.field1761 == 2) {
            if (class317.field4783 == class136.field2066 && class121.field1897 == class103.field1642) {
                class115.field1761 = 0;
                if (class96.field1446 && class120.field1879[81] && class190.field2829 > 2) {
                    class248.method1675(0, class190.field2829 - 2);
                } else {
                    class248.method1675(0, class190.field2829 - 1);
                }
            }
        } else if (class317.field4783 == class207.field3140 && class28.field387 == class121.field1897) {
            class115.field1761 = 0;
            if (class96.field1446 && class120.field1879[81] && class190.field2829 > 2) {
                class248.method1675(0, class190.field2829 - 2);
            } else {
                class248.method1675(0, class190.field2829 - 1);
            }
        } else {
            class103.field1642 = class28.field387;
            class115.field1761 = 2;
            class136.field2066 = class207.field3140;
        }
        field4555++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 94)
    public static void method2077(int arg0) {
        if (arg0 > 63) {
            field4559 = null;
            field4554 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLf;)Z", line = 111)
    public static final boolean method2078(boolean arg0, class329 arg1) {
        field4558++;
        if (!arg0) {
            return true;
        } else if (arg1.field4943 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg1.field4943.length; var2++) {
                int var3 = class56.method371(arg1, var2, (byte) 113);
                int var4 = arg1.field5078[var2];
                if (arg1.field4943[var2] == 2) {
                    if (var3 >= var4) {
                        return false;
                    }
                } else if (arg1.field4943[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field4943[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILlm;)Lbk;", line = 177)
    public static final class157 method2079(int arg0, int arg1, class210 arg2) {
        if (arg0 != 0) {
            field4559 = (String) null;
        }
        field4552++;
        return class329.method2245(arg1, arg2, 63) ? class141.method1016((byte) -122) : null;
    }
}
