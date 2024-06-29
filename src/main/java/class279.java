import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class279 extends class430 {

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public int field3898 = 0;

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
    public int field3909 = -1;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3905 = new CRC32();

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "Lsm;")
    public static class387 field3913 = new class387("", 14);

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
    public static int field3914 = 0;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    public int field3902;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZ)V")
    public static final void method1792(int arg0, boolean arg1) {
        field3912++;
        class503 var2 = class512.method3112(6, arg0, 0);
        if (!arg1) {
            method1792(-94, true);
        }
        var2.method3074(-111);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static void method1793(int arg0) {
        field3913 = null;
        if (arg0 == 14) {
            field3905 = null;
        }
    }
}
