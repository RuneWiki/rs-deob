import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class654 extends class17 {

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    private int field9235;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    private int field9232;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "I")
    private int field9241;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
    private int field9239;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    public static int field9236 = -1;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "Lvh;")
    public static class125 field9234 = new class125(5, 2);

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "J")
    public static long field9240;

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(IIIIIII)V")
    public class654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9235 = arg0;
        this.field9232 = arg1;
        this.field9241 = arg2;
        this.field9239 = arg3;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(III)V")
    public final void method66(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            ++field9231;
            int var4 = this.field9235 * arg1 >> 12;
            int var5 = this.field9241 * arg1 >> 12;
            int var6 = this.field9232 * arg2 >> 12;
            int var7 = this.field9239 * arg2 >> 12;
            class307.method1863(var5, super.field262, (byte) -93, var6, var7, var4);
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V")
    public static void method3688(byte arg0) {
        field9234 = null;
        if (arg0 != -9) {
            method3688((byte) 13);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIZ)V")
    public final void method64(int arg0, int arg1, boolean arg2) {
        ++field9233;
        int var4 = this.field9235 * arg0 >> 12;
        int var5 = this.field9241 * arg0 >> 12;
        if (!arg2) {
            this.field9241 = 11;
        }
        int var6 = this.field9232 * arg1 >> 12;
        int var7 = this.field9239 * arg1 >> 12;
        class82.method628(var7, super.field260, -25039, super.field259, var5, var4, var6);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)V")
    public final void method65(int arg0, int arg1, int arg2) {
        ++field9238;
        int var4 = this.field9235 * arg2 >> 12;
        int var5 = this.field9241 * arg2 >> 12;
        int var6 = this.field9232 * arg0 >> 12;
        int var7 = this.field9239 * arg0 >> 12;
        if (arg1 == -1) {
            class112.method905(super.field259, var7, var4, var5, super.field260, super.field262, var6, arg1 + 95);
        }
    }
}
