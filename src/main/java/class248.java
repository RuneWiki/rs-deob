import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class248 extends InputStream {

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Z")
    public static boolean field3119 = false;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lvt;")
    public static class344 field3115 = new class344(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "F")
    public static float field3121;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!fh", name = "read", descriptor = "()I")
    public final int read() {
        field3117++;
        class353.method2204(30000L, 7806);
        return -1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILqa;I)V")
    public static final void method1519(int arg0, int arg1, class167 arg2, int arg3) {
        class453.field6425 = arg2;
        class257.field3197 = new class266[arg0][arg1];
        field3116++;
        if (class23.field335 != null) {
            class449.field6353 = class155.method839(class23.field335[3], class23.field335[4], class23.field335[5], class23.field335[1], class23.field335[2], class23.field335[0], arg3 ^ 0x291C);
        }
        class597.field8614 = new class266();
        class500.method2794(0);
        if (arg3 != -10564) {
            method1521(null, 126);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method1520(byte arg0) {
        field3115 = null;
        if (arg0 != 18) {
            method1519(-121, -100, null, 48);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lge;I)V")
    public static final void method1521(class551 arg0, int arg1) {
        field3118++;
        int var2 = 0;
        if (arg1 >= -58) {
            method1521(null, -56);
        }
        while (class588.field8519 > var2) {
            int var3 = arg0.method3059(111);
            int var4 = arg0.method3090(-93);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class208.field2706[var3] != null) {
                class208.field2706[var3].field2516 = var4;
            }
            var2++;
        }
    }

    static {
        new class321("", 76);
    }
}
