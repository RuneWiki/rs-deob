import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class527 {

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "F")
    public static float field7529;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public int field7532;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iu", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field7533;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "[Lmc;")
    public class121[] field7527;

    // $FF: synthetic method
    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3001(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)Z", line = 4)
    public static final boolean method2997(byte arg0) {
        if (arg0 > -23) {
            field7529 = 0.53398484F;
        }
        field7528++;
        return class145.field1625 > 0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 22)
    public static final boolean method2998(String arg0, byte arg1) {
        if (arg1 != 14) {
            method2997((byte) 57);
        }
        field7531++;
        return class6.method27(field7533 == null ? (field7533 = method3001("hw")) : field7533, arg0, (byte) 97);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Liaa;BLqv;)Lmc;", line = 33)
    private final class121 method2999(class452 arg0, byte arg1, class406 arg2) {
        field7530++;
        if (class288.field3700 == arg2) {
            return class403.method2194((byte) -106, arg0);
        } else if (arg1 != 5) {
            return null;
        } else if (class212.field2567 == arg2) {
            return class504.method2897(-1, arg0);
        } else if (class469.field6548 == arg2) {
            return class260.method1479(arg0, (byte) 36);
        } else if (class186.field2266 == arg2) {
            return class526.method2995(arg0, -17330);
        } else if (class577.field8238 == arg2) {
            return class294.method1674(arg0, 98);
        } else if (class516.field7386 == arg2) {
            return class211.method1269(arg0, arg1 ^ 0xFFFFFFEE);
        } else if (class628.field8907 == arg2) {
            return class151.method830((byte) -106, arg0);
        } else if (class595.field8451 == arg2) {
            return class460.method2622(-23645, arg0);
        } else if (class383.field5128 == arg2) {
            return class658.method3710(arg0, -110);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Liaa;I)V", line = 77)
    public final void method3000(class452 arg0, int arg1) {
        this.field7532 = arg0.method2541(111);
        if (arg1 >= -55) {
            return;
        }
        field7526++;
        this.field7527 = new class121[arg0.method2541(127)];
        class406[] var3 = class374.method2056(-43);
        for (int var4 = 0; var4 < this.field7527.length; var4++) {
            this.field7527[var4] = this.method2999(arg0, (byte) 5, var3[arg0.method2541(112)]);
        }
    }
}
