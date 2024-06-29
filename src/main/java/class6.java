import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class6 extends class167 {

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "S")
    public short field63;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Z")
    public static boolean field55 = false;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lvb;")
    public static class208 field57 = new class208();

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "Luaa;")
    public static class127 field65;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "(I)V")
    public static void method39(int arg0) {
        field57 = null;
        int var1 = -6 / ((-43 - arg0) / 59);
        field65 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method40(String arg0, int arg1) throws ClassNotFoundException {
        ++field62;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg1 != 23244) {
                field55 = false;
            }
            if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(ILha;)Z")
    public final boolean method41(int arg0, class65 arg1) {
        ++field61;
        return arg0 != 101 ? false : class267.method1744(super.field2257 >> class26.field388, super.field2259 >> class26.field388, super.field2244, 19322);
    }

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "(I)V")
    public static final void method42(int arg0) {
        ++field60;
        if (class273.field4059 != null) {
            class534[] var1 = class273.field4059;
            for (int var2 = 0; var1.length > var2; ++var2) {
                class534 var3 = var1[var2];
                var3.method76(true);
            }
        }
        if (arg0 != 0) {
            field65 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B[Luca;)I")
    public final int method43(byte arg0, class540[] arg1) {
        ++field59;
        if (arg0 >= -20) {
            this.method45(-19);
        }
        return this.method1200(super.field2259 >> class26.field388, arg1, super.field2257 >> class26.field388, (byte) 36);
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)I")
    public static final int method44(byte arg0) {
        if (arg0 > -119) {
            return 19;
        } else {
            ++field58;
            int var1 = class292.field4270.method167(-10247);
            if (class127.field1916.length + -1 > var1) {
                class292.field4270 = class127.field1916[var1 - -1];
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        ++field64;
        if (arg0 < 103) {
            field57 = null;
        }
        return class79.field1122[(super.field2257 >> class26.field388) + -class331.field4776 + class174.field2337][(super.field2259 >> class26.field388) - class76.field1102 + class174.field2337];
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII)V")
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field2244 = (byte) arg4;
        super.field2257 = arg0;
        super.field2250 = (byte) arg3;
        this.field63 = (short) arg5;
        super.field2259 = arg2;
        super.field2246 = arg1;
    }
}
