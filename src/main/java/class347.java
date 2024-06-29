import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class347 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field5020 = 1;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Ltn;")
    public static class60 field5019 = new class60(45, 3);

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field5023 = -1;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "J")
    public static long field5022;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILwm;)V")
    public static final void method2056(int arg0, class403 arg1) {
        field5018++;
        byte[] var2 = new byte[24];
        if (class454.field6372 != null) {
            try {
                class454.field6372.method44(0L, -30985);
                class454.field6372.method43(var2, arg0 ^ 0x75);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2363(arg0, var2, arg0 - 1, 24);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method2057(int arg0) {
        if (arg0 >= -117) {
            field5023 = -103;
        }
        field5019 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)I")
    public static final int method2058(byte arg0, int arg1, int arg2) {
        if (arg0 == 53) {
            field5021++;
            return arg2 == 4 || arg2 == 5 ? class231.field3396[arg1 & 0x3] : 256;
        } else {
            return 20;
        }
    }
}
