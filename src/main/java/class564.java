import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class564 {

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Lgia;")
    public static class285 field7559 = new class285("game3", "Game 3", 2);

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "Lmga;")
    public static class739 field7560 = new class739(24, -1);

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field7562 = 0;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Lsi;")
    public static class586 field7557;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILaj;IB)Leia;")
    public static final class255 method3157(int arg0, class333 arg1, int arg2, byte arg3) {
        field7558++;
        byte[] var4 = arg1.method2095(arg0, arg2, arg3 - 43);
        if (var4 == null) {
            return null;
        } else if (arg3 == 44) {
            return new class255(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7554++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIZIILha;ILjava/lang/String;)V")
    public static final void method3158(int arg0, int arg1, boolean arg2, int arg3, int arg4, class65 arg5, int arg6, String arg7) {
        if (arg2) {
            return;
        }
        field7556++;
        if (class391.field5714 == null || class648.field9000 == null) {
            if (class643.field8927.method2104(91, class303.field4366) && class643.field8927.method2104(28, class64.field908)) {
                class391.field5714 = arg5.method477(class508.method2950(class643.field8927, class303.field4366, 0), true);
                class508 var8 = class508.method2950(class643.field8927, class64.field908, 0);
                class648.field9000 = arg5.method477(var8, true);
                var8.method2942();
                class162.field2208 = arg5.method477(var8, true);
            } else {
                arg5.method563(arg4, arg0, arg1, arg6, class108.field1485 | 255 - class775.field10667 << 24, 1);
            }
        }
        if (class391.field5714 != null && class648.field9000 != null) {
            int var9 = (arg1 - (class648.field9000.method1107() * 2)) / class391.field5714.method1107();
            for (int var10 = 0; var10 < var9; var10++) {
                class391.field5714.method1102(arg4 + (class648.field9000.method1107() + (class391.field5714.method1107() * var10)), arg0);
            }
            class648.field9000.method1102(arg4, arg0);
            class162.field2208.method1102(arg4 + arg1 - class162.field2208.method1107(), arg0);
        }
        class251.field3716.method583((byte) 56, arg0 + 14, -1, arg7, class434.field6145 | 0xFF000000, arg4 + 3);
        arg5.method563(arg4, arg0 + arg6, arg1, arg3 - arg6, -class775.field10667 + 255 << 24 | class108.field1485, 1);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static void method3159(int arg0) {
        field7559 = null;
        field7557 = null;
        field7560 = null;
        if (arg0 != 255) {
            field7561 = 93;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIB)I")
    public final int method3160(int arg0, int arg1, byte arg2) {
        field7555++;
        int var4 = class593.field8019 > arg1 ? class593.field8019 : arg1;
        if (class541.field7351 == this) {
            return 0;
        } else if (class523.field7175 == this) {
            return var4 - arg0;
        } else {
            if (arg2 != -91) {
                field7562 = 36;
            }
            return class729.field10123 == this ? (var4 - arg0) / 2 : 0;
        }
    }
}
