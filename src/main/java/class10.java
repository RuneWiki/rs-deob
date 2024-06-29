import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends OutputStream {

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "Lwaa;")
    public static class705 field130 = new class705("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "Z")
    public static volatile boolean field134 = true;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!hba", name = "write", descriptor = "(I)V", line = 3)
    public final void write(int arg0) throws IOException {
        field132++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lsl;I)V", line = 12)
    public static final void method64(class461 arg0, int arg1) {
        field133++;
        if ((arg0.field6180.length - arg0.field6193) < 1) {
            return;
        }
        int var2 = arg0.method2600((byte) -127);
        if (arg1 > var2 || var2 > 1 || (arg0.field6180.length - arg0.field6193) < 2) {
            return;
        }
        int var3 = arg0.method2566(-2);
        if ((arg0.field6180.length - arg0.field6193) < (var3 * 6)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2566(arg1 - 2);
            int var6 = arg0.method2622(-539564808);
            if (var5 < class564.field7931.length && class133.field1924[var5] && (class646.field8935.method4137(var5, false).field7118 != '1' || var6 >= -1 && var6 <= 1)) {
                class564.field7931[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 59)
    public static void method65(int arg0) {
        field130 = null;
        int var1 = -102 / ((-arg0 - 1) / 62);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lnd;B)V", line = 81)
    public static final void method66(class547 arg0, byte arg1) {
        int var2 = 107 % ((arg1 - 19) / 63);
        field131++;
        class353.field4541 = arg0;
    }
}
