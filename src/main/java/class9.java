import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class670 {

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field133 = -1;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Lqfa;")
    public static class98 field131 = new class98(31, 6);

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field137 = 0;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lwm;")
    public class564 field129;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method56(int arg0) {
        field131 = null;
        if (arg0 >= -12) {
            field137 = 26;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lql;I[[B)V")
    public static final void method57(class735 arg0, int arg1, byte[][] arg2) {
        if (arg1 != -1754610264) {
            return;
        }
        field135++;
        int var3 = class499.field7164.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class207.field2720[var4] >> 8) * 64 - class228.field3063;
                int var7 = (class207.field2720[var4] & 0xFF) * 64 - class3.field30;
                class485.method2904((byte) 34);
                arg0.method4116(class268.field3831, var6, class147.field2114, var7, arg1 ^ 0x976AC5AB, var5);
            }
        }
    }
}
