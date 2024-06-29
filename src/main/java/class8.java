import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Lor;")
    public static class599 field80;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;)V", line = 6)
    public static final void method28(int arg0, String arg1) {
        if (class350.field4526 == null) {
            class72.method569((byte) 114);
        }
        field82++;
        String[] var2 = class112.method774('\n', 1, arg1);
        if (arg0 != -1) {
            field80 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class209.field2475; var4 > 0; var4--) {
                class350.field4526[var4] = class350.field4526[var4 - 1];
            }
            class350.field4526[0] = var2[var3];
            if ((class350.field4526.length - 1) > class209.field2475) {
                class209.field2475++;
                if (class15.field148 > 0) {
                    class15.field148++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z", line = 49)
    public static final boolean method29(int arg0, int arg1, int arg2) {
        if (arg1 == 101) {
            field81++;
            return class290.method1739(arg0, arg2, (byte) -14) | (arg2 & 0x40000) != 0 || class587.method3261(arg0, arg2, -1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(CI)C", line = 63)
    public static final char method30(char arg0, int arg1) {
        field83++;
        if (arg0 == 'Æ') {
            return 'E';
        }
        if (arg1 > -88) {
            field80 = null;
        }
        if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V", line = 93)
    public static void method31(boolean arg0) {
        if (arg0) {
            method29(31, -103, 74);
        }
        field80 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILuo;Luo;)V", line = 105)
    public static final void method32(int arg0, int arg1, int arg2, class539 arg3, class539 arg4) {
        class565 var5 = class417.method2319(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7082 = arg3;
            var5.field7073 = arg4;
        }
    }
}
