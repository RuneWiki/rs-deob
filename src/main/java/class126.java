import java.awt.Font;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class126 implements Runnable {

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[Loc;")
    public volatile class60[] field2187 = new class60[2];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Z")
    public volatile boolean field2190 = false;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    public volatile boolean field2182 = false;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lqk;")
    public static class207 field2184 = class24.method212(255, ")1");

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lej;")
    public static class49 field2192 = new class49();

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lwc;")
    public class229 field2188;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field2186;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field2189;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)I")
    public static final int method885(int arg0, int arg1, int arg2, int arg3) {
        field2191++;
        if ((class271.field4791[arg2][arg0][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class271.field4791[1][arg0][arg1] & 0x2) == 0) {
            int var4 = -12 / ((arg3 - 33) / 50);
            return arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "run", descriptor = "()V")
    public final void run() {
        this.field2182 = true;
        try {
            while (!this.field2190) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field2187[var1];
                    if (var2 != null) {
                        var2.method436(16138);
                    }
                }
                class153.method1098((byte) 76, 10L);
                class74.method536(this.field2188, true, (Object) null);
            }
        } catch (Exception var9) {
            class202.method1402((String) null, 32701, var9);
        } finally {
            Object var6 = null;
            this.field2182 = false;
        }
        field2181++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method886(byte arg0) {
        field2192 = null;
        field2186 = null;
        field2184 = null;
        if (arg0 <= 8) {
            method886((byte) -88);
        }
        field2189 = null;
    }
}
