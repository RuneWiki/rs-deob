import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class383 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public int field5054 = 64;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "Z")
    public boolean field5058 = false;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public int field5055 = 64;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public int field5061 = 2;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public int field5060 = -1;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "Z")
    public boolean field5065 = false;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public int field5063 = 1;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field5059 = -1;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "[I")
    public static int[] field5062 = new int[3];

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "Lnp;")
    public static class112 field5057;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public static void method2192(int arg0) {
        field5057 = null;
        if (arg0 == -7) {
            field5062 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILio;I)V")
    public final void method2193(int arg0, class157 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method930(255);
            if (var4 == 0) {
                field5056++;
                if (arg2 != -1) {
                    this.field5055 = 109;
                    return;
                }
                return;
            }
            this.method2194((byte) 125, arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BIILio;)V")
    private final void method2194(byte arg0, int arg1, int arg2, class157 arg3) {
        int var5 = 19 / ((70 - arg0) / 44);
        field5064++;
        if (arg2 == 1) {
            this.field5060 = arg3.method963(-119);
            if (this.field5060 == 65535) {
                this.field5060 = -1;
            }
        } else if (arg2 == 2) {
            this.field5055 = arg3.method963(-122) + 1;
            this.field5054 = arg3.method963(-126) + 1;
        } else if (arg2 == 3) {
            arg3.method969(3);
        } else if (arg2 == 4) {
            this.field5061 = arg3.method930(255);
        } else if (arg2 == 5) {
            this.field5063 = arg3.method930(255);
        } else if (arg2 == 6) {
            this.field5058 = true;
        } else if (arg2 == 7) {
            this.field5065 = true;
            return;
        }
    }
}
