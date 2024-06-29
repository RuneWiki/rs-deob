import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class479 extends class525 {

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "B")
    public byte field7034 = 5;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field7038 = 0;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "Lki;")
    public static class498 field7037 = new class498(6, 2);

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field7043 = 0;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "F")
    public static float field7033;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public int field7030;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public int field7031;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public int field7032;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public int field7036;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public int field7039;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public int field7041;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "Lic;")
    public static class491 field7042;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "Z")
    public boolean field7035;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLod;IBIII[B)Lwe;")
    public static final class279 method2853(boolean arg0, class349 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        if (arg3 < 27) {
            method2854(-18);
        }
        field7040++;
        if (!arg1.field5316 && (!class415.method2495(1, arg4) || !class415.method2495(1, arg2))) {
            return arg1.field5358 ? new class279(arg1, 34037, arg5, arg4, arg2, arg0, arg7, arg6) : new class279(arg1, arg5, arg4, arg2, class476.method2841(arg4, true), class476.method2841(arg2, true), arg7, arg6);
        } else {
            return new class279(arg1, 3553, arg5, arg4, arg2, arg0, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
    public static void method2854(int arg0) {
        if (arg0 <= 3) {
            method2853(true, null, 29, (byte) 89, 9, 42, 72, null);
        }
        field7037 = null;
        field7042 = null;
    }
}
