import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DKQKXOQO")
public class class15 extends class42 {

    @OriginalMember(owner = "client!DKQKXOQO", name = "i", descriptor = "Z")
    private boolean field733 = true;

    @OriginalMember(owner = "client!DKQKXOQO", name = "k", descriptor = "I")
    public int field735 = 1000;

    @OriginalMember(owner = "client!DKQKXOQO", name = "l", descriptor = "Z")
    public static boolean field736;

    @OriginalMember(owner = "client!DKQKXOQO", name = "j", descriptor = "[LWTVUTTQF;")
    public class60[] field734;

    @OriginalMember(owner = "client!DKQKXOQO", name = "a", descriptor = "(IIIIIIIII)V")
    public void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class19 var10 = this.method187(0);
        if (var10 != null) {
            this.field735 = var10.field735;
            var10.method189(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!DKQKXOQO", name = "a", descriptor = "(I)LFCIDIKVY;")
    public class19 method187(int arg0) {
        if (arg0 != 0) {
            this.field733 = !this.field733;
        }
        return null;
    }
}
