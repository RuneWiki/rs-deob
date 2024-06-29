import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class426 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lada;")
    public static class144 field5740 = new class144(82, -2);

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "F")
    public static float field5743;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 5)
    public static void method2501(byte arg0) {
        field5740 = null;
        if (arg0 != 13) {
            field5740 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IC)Z", line = 19)
    public static final boolean method2502(int arg0, char arg1) {
        field5742++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class433.method2530(-94, arg1)) {
            return true;
        } else {
            char[] var2 = class515.field7352;
            for (int var3 = arg0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class232.field3383;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V", line = 65)
    public static final void method2503(int arg0, int arg1) {
        class205 var2 = class420.field5697[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class205 var4 = class420.field5697[var3][arg0][arg1] = class420.field5697[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3042--;
                for (class636 var5 = var4.field3029; var5 != null; var5 = var5.field9302) {
                    class577 var6 = var5.field9299;
                    if (var6.field8504 == arg0 && var6.field8509 == arg1) {
                        var6.field8501--;
                    }
                }
            }
        }
        if (class420.field5697[0][arg0][arg1] == null) {
            class420.field5697[0][arg0][arg1] = new class205(0, arg0, arg1);
            class420.field5697[0][arg0][arg1].field3036 = 1;
        }
        class420.field5697[0][arg0][arg1].field3025 = var2;
        class420.field5697[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public abstract void method1832(byte arg0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method1831(boolean arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public abstract void method1830(int arg0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB[BI)I")
    public abstract int method1833(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[B)V")
    public abstract void method1829(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;
}
