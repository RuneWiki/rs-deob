import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 extends OutputStream {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[F")
    public static float[] field145 = new float[4];

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lup;")
    public static class249 field146 = new class249();

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BII)V")
    public static final void method69(byte arg0, int arg1, int arg2) {
        field147++;
        class530 var3 = class242.method1402(-41, 7, arg1);
        var3.method3025((byte) -69);
        if (arg0 >= -45) {
            method71(-86, (char) 65498);
        }
        var3.field7593 = arg2;
    }

    @OriginalMember(owner = "client!n", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field144++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method70(int arg0) {
        field145 = null;
        field146 = null;
        if (arg0 != 9382) {
            field146 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IC)Z")
    public static final boolean method71(int arg0, char arg1) {
        field148++;
        if (arg0 > -5) {
            return false;
        } else if ((arg1 <= '\u0000' || arg1 >= '\u0080') && (arg1 < ' ' || arg1 > 'ÿ')) {
            if (arg1 != '\u0000') {
                char[] var2 = class689.field9726;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }
}
