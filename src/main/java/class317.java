import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class317 {

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "[B")
    public byte[] field4717;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "[S")
    public short[] field4715;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "[S")
    public short[] field4716;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "[S")
    public short[] field4719;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2075(int arg0) {
        field4714++;
        if (arg0 <= 28) {
            method2076((byte) -106, (char) 65520);
        }
        int var1 = class147.field1873;
        int[] var2 = class568.field8045;
        for (int var3 = 0; var3 < var1; var3++) {
            class559 var4 = class581.field8250[var2[var3]];
            if (var4 != null) {
                class437.method2639(var4, (byte) -121, var4.method2692((byte) -125));
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BC)Z", line = 36)
    public static final boolean method2076(byte arg0, char arg1) {
        field4718++;
        if (arg0 != 70) {
            method2075(-60);
        }
        return arg1 >= '0' && arg1 <= '9';
    }
}
