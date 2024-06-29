import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class17 extends class287 {

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Ltl;")
    public static class59 field215 = class85.method639(")4", 9588);

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
    public static boolean field217 = false;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lte;")
    public static class114 field222 = null;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lme;")
    public static class295 field216;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lme;")
    public static class295 field221;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILs;)V", line = 8)
    public static final void method108(int arg0, class170 arg1) {
        field218++;
        byte[] var2 = new byte[24];
        if (class290.field4970 != null) {
            try {
                class290.field4970.method22((byte) -63, 0L);
                int var3 = 0;
                class290.field4970.method24(var2, -7);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        if (arg0 != -23057) {
            field222 = (class114) null;
        }
        arg1.method1203(0, (byte) -78, 24, var2);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(II)V", line = 75)
    public class17(int arg0, int arg1) {
        this.field219 = arg1;
        this.field220 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V", line = 94)
    public static void method109(boolean arg0) {
        field221 = null;
        field215 = null;
        if (arg0) {
            method108(112, (class170) null);
        }
        field216 = null;
    }
}
