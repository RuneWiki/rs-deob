import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class498 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Leba;")
    public static class550 field6845 = new class550(19, 0);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field6847 = -50;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field6849 = 0;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Ljb;")
    public static class498 field6848 = new class498();

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 3)
    public static void method2827(int arg0) {
        if (arg0 == 255) {
            field6845 = null;
            field6848 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field6846++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([[BILsca;)V", line = 27)
    public static final void method2828(byte[][] arg0, int arg1, class235 arg2) {
        field6844++;
        if (arg1 != 12579) {
            method2828(null, 66, null);
        }
        int var3 = class361.field4785.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class126.field1760[var4] >> 8) * 64 - class125.field1745;
                int var7 = (class126.field1760[var4] & 0xFF) * 64 - class4.field23;
                class276.method1656(arg1 - 896472763);
                arg2.method1461(class146.field1963, var6, var5, class322.field4302, -9592, var7);
            }
        }
    }
}
