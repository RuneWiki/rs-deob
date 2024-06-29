import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class43 {

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field555 = 2;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field557 = 0;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "F")
    public static float field554;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "[B")
    public byte[] field552;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "[S")
    public short[] field553;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[S")
    public short[] field556;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "[S")
    public short[] field560;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIILpq;)Lil;", line = 18)
    public static final class598 method256(int arg0, int arg1, int arg2, class159 arg3) {
        if (arg2 != -29213) {
            method256(-57, -68, 77, null);
        }
        field558++;
        byte[] var4 = arg3.method1087(arg0, arg1, 1);
        return var4 == null ? null : new class598(var4);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([I[Ljava/lang/Object;B)V", line = 34)
    public static final void method257(int[] arg0, Object[] arg1, byte arg2) {
        class219.method1353(arg1, arg0, 113, arg0.length - 1, 0);
        field559++;
        if (arg2 > -49) {
            field554 = 0.80586404F;
        }
    }
}
