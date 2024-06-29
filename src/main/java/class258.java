import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class258 extends class452 {

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!fga", name = "s", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "Z")
    public static boolean field3268 = false;

    @OriginalMember(owner = "client!fga", name = "u", descriptor = "[Lbba;")
    public static class116[] field3275 = new class116[6];

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "Lvv;")
    public static class328 field3271;

    @OriginalMember(owner = "client!fga", name = "t", descriptor = "[Liea;")
    public static class481[] field3274;

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Leha;Loea;IIIIIIIIII)V")
    public class258(class91 arg0, class599 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3269 = arg11;
        this.field3273 = arg10;
    }

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
    public static void method1564(int arg0) {
        if (arg0 != 6) {
            field3274 = null;
        }
        field3275 = null;
        field3271 = null;
        field3274 = null;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)Lhm;")
    public final class223 method29(int arg0) {
        if (arg0 != -200) {
            method1564(20);
        }
        field3270++;
        return class89.field1240;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/io/File;ZI)[B")
    public static final byte[] method1565(File arg0, boolean arg1, int arg2) {
        field3272++;
        try {
            if (arg1) {
                byte[] var3 = new byte[arg2];
                class231.method1465(arg0, -4052, var3, arg2);
                return var3;
            } else {
                return null;
            }
        } catch (IOException var4) {
            return null;
        }
    }
}
