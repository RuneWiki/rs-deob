import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class197 extends OutputStream {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3038 = 104;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lrc;")
    public static class121 field3037;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lmn;")
    public static class162 field3039;

    @OriginalMember(owner = "client!sh", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3042++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public static void method1357(boolean arg0) {
        field3037 = null;
        field3039 = null;
        if (arg0) {
            field3039 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(CI)Z")
    public static final boolean method1358(char arg0, int arg1) {
        field3040++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class524.method3130(arg0, 7434)) {
            return true;
        } else {
            char[] var2 = class63.field1002;
            for (int var3 = arg1; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class335.field5242;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }
}
