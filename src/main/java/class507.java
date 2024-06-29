import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class507 extends OutputStream {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field7498 = 2;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lum;")
    public static class370 field7500;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[Lo;")
    public static class24[] field7499;

    @OriginalMember(owner = "client!ed", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field7503++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method3025(int arg0) {
        field7502++;
        if (!class389.field5474) {
            return;
        }
        class273.field4047 = null;
        if (arg0 <= -88) {
            class389.field5474 = false;
            class33.field381 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljp;B)V")
    public static final void method3026(class241 arg0, byte arg1) {
        int var2 = -91 / ((37 - arg1) / 47);
        field7501++;
        for (int var3 = 0; var3 < class8.field131; var3++) {
            int var4 = class326.field4758[var3];
            class22 var5 = class378.field5355[var4];
            int var6 = arg0.method2357((byte) 118);
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method2357((byte) 118) << 8;
            }
            if ((var6 & 0x200) != 0) {
                var6 += arg0.method2357((byte) 111) << 16;
            }
            class58.method477(arg0, var6, var5, 119, var4);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method3027(byte arg0) {
        field7499 = null;
        field7500 = null;
        int var1 = -27 % ((-arg0 - 32) / 62);
    }
}
