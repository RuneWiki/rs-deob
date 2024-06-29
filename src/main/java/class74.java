import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class74 extends RuntimeException {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1017;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Ljava/lang/String;")
    public String field1026;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1019 = "Connected to update server";

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "[Lcg;")
    public static class316[] field1023 = new class316[2048];

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1025 = "flash2:";

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Lin;")
    public static class344 field1021;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    public static int[] field1020;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method549(boolean arg0) {
        field1018++;
        Container var1;
        if (class329.field4964 != null) {
            var1 = class329.field4964;
        } else if (class138.field1898 == null) {
            var1 = class165.field2258.field1157;
        } else {
            var1 = class138.field1898;
        }
        class226.field3237 = var1.getSize().width;
        class223.field3203 = var1.getSize().height;
        if (class138.field1898 == var1) {
            Insets var2 = class138.field1898.getInsets();
            class223.field3203 -= var2.top + var2.bottom;
            class226.field3237 -= var2.right + var2.left;
        }
        if (class323.method2270(-113) < 2) {
            class187.field2592 = 765;
            class64.field836 = 503;
            class113.field1550 = (class226.field3237 - 765) / 2;
            class169.field2294 = 0;
        } else {
            class169.field2294 = 0;
            class113.field1550 = 0;
            class187.field2592 = class226.field3237;
            class64.field836 = class223.field3203;
        }
        if (class67.field908) {
            class67.method493(class187.field2592, class64.field836);
        }
        class150.field2079.setSize(class187.field2592, class64.field836);
        if (class138.field1898 == var1) {
            Insets var3 = class138.field1898.getInsets();
            class150.field2079.setLocation(class113.field1550 + var3.left, var3.top - -class169.field2294);
        } else {
            class150.field2079.setLocation(class113.field1550, class169.field2294);
        }
        if (arg0) {
            field1020 = (int[]) null;
        }
        if (class183.field2521 != -1) {
            class134.method977(true, 128);
        }
        class172.method1206((byte) 95);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfa;Lfa;IBZ)I", line = 81)
    public static final int method550(class259 arg0, class259 arg1, int arg2, byte arg3, boolean arg4) {
        field1022++;
        if (arg2 == 1) {
            int var5 = arg1.field2084;
            int var6 = arg0.field2084;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class82.method645(arg0.method1784(100).field2242, arg1.method1784(100).field2242, 5660, class202.field2874);
        } else if (arg2 == 3) {
            if (arg1.field3815.equals("-")) {
                if (arg0.field3815.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field3815.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class82.method645(arg0.field3815, arg1.field3815, 5660, class202.field2874);
            }
        } else if (arg2 == 4) {
            return arg1.method1085(false) ? (arg0.method1085(false) ? 0 : 1) : (arg0.method1085(false) ? -1 : 0);
        } else if (arg2 == 5) {
            return arg1.method1082(-1) ? (arg0.method1082(-1) ? 0 : 1) : (arg0.method1082(arg3 - 111) ? -1 : 0);
        } else if (arg2 == 6) {
            return arg1.method1090(89) ? (arg0.method1090(93) ? 0 : 1) : (arg0.method1090(105) ? -1 : 0);
        } else if (arg2 == 7) {
            return arg1.method1087((byte) 97) ? (arg0.method1087((byte) 97) ? 0 : 1) : (arg0.method1087((byte) 97) ? -1 : 0);
        } else {
            if (arg3 != 110) {
                field1024 = -19;
            }
            return arg1.field3814 - arg0.field3814;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 161)
    public class74(Throwable arg0, String arg1) {
        this.field1017 = arg0;
        this.field1026 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 171)
    public static void method551(byte arg0) {
        field1020 = null;
        field1019 = null;
        if (arg0 < 118) {
            field1021 = (class344) null;
        }
        field1021 = null;
        field1025 = null;
        field1023 = null;
    }
}
