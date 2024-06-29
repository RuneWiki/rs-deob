import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class18 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lce;")
    public static class126 field242 = class206.method1445(-7923, "Lade Liste der Welten");

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lce;")
    public static class126 field245 = class206.method1445(-7923, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field248 = -1;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Lce;")
    public static class126 field244 = class206.method1445(-7923, ":clan:");

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field249 = 2301979;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lce;")
    public static class126 field250 = class206.method1445(-7923, " autres options");

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lcc;")
    public static class313 field240;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[Lie;")
    public static class2[] field247;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 15)
    public static void method98(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field240 = null;
        field250 = null;
        field242 = null;
        field245 = null;
        field247 = null;
        field244 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 31)
    public static final int method99(KeyEvent arg0, byte arg1) {
        field246++;
        if (arg1 != -71) {
            return -126;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lbb;B)V", line = 60)
    public static final void method100(class134 arg0, byte arg1) {
        field243++;
        byte[] var2 = new byte[24];
        if (class63.field1059 != null) {
            try {
                class63.field1059.method1151(0L, 0);
                int var3 = 0;
                class63.field1059.method1154(var2, -1);
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
        arg0.method924((byte) 112, 0, 24, var2);
        if (arg1 != 68) {
            field240 = (class313) null;
        }
    }
}
