import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class39 extends class248 {

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Lg;")
    public class59 field726;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "[Lij;")
    public static class50[] field720 = new class50[100];

    @OriginalMember(owner = "client!af", name = "u", descriptor = "[I")
    public static int[] field721 = new int[1000];

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Lij;")
    public static class50 field724 = class78.method578(122, "::qa_op_test");

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "Lij;")
    public static class50 field725;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLij;)Z")
    public static final boolean method304(byte arg0, class50 arg1) {
        field722++;
        try {
            int var2 = arg1.method377(44, false);
            if (arg0 != 93) {
                return true;
            } else if (var2 == -1) {
                return false;
            } else {
                class50 var3 = arg1.method363(0, var2, 0);
                class50 var4 = arg1.method397(64, var2 + 1);
                MessageDigest var5 = MessageDigest.getInstance("SHA");
                var5.reset();
                var5.update(var3.method404(8202));
                byte[] var6 = var5.digest();
                byte[] var7 = var4.method376(-67);
                class217 var8 = new class217(5000);
                var8.method1491(0, var7, var7.length, (byte) 124);
                var8.field3581 = 0;
                var8.method1474(class62.field1167, (byte) -48, class115.field2014);
                if (var8.field3633[0] != 1) {
                    return false;
                }
                for (int var9 = 0; var9 < 20; var9++) {
                    if (var8.field3633[var9 + 1] != var6[var9]) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
    public static void method305(int arg0) {
        field725 = null;
        field720 = null;
        field724 = null;
        if (arg0 == 1) {
            field721 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lg;)V")
    public class39(class59 arg0) {
        this.field726 = arg0;
    }
}
