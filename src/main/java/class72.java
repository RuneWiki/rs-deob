import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class72 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Z")
    public static boolean field965 = false;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Luf;")
    private static class168 field964 = class148.method1019(-1720, " has logged in)3");

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Luf;")
    public static class168 field967 = field964;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field963 = 0;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field968 = 127;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Ldk;")
    public static class241 field961;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lg;")
    public static class242 field962;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLj;)V", line = 26)
    public static final void method405(boolean arg0, class153 arg1) {
        byte[] var2 = new byte[24];
        field966++;
        if (arg0) {
            method406(-71);
        }
        if (class38.field477 != null) {
            try {
                class38.field477.method358(0L, -99);
                class38.field477.method357(0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
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
        arg1.method1062(var2, 32767, 0, 24);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 74)
    public static void method406(int arg0) {
        if (arg0 > -30) {
            method405(true, (class153) null);
        }
        field961 = null;
        field964 = null;
        field967 = null;
        field962 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
    public abstract int method331(int arg0);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method332(Component arg0, int arg1);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method333(Component arg0, boolean arg1);
}
