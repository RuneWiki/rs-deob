import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class429 {

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "F")
    public static float field97;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(IBI)V", line = 3)
    public final void method54(int arg0, byte arg1, int arg2) {
        ++field96;
        int var4 = this.field99 * arg0 >> 12;
        if (arg1 < 62) {
            method56(-112, 39);
        }
        int var5 = this.field104 * arg0 >> 12;
        int var6 = this.field103 * arg2 >> 12;
        int var7 = this.field105 * arg2 >> 12;
        class255.method1462(var7, super.field5686, var4, var6, var5, -87);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIB)V", line = 27)
    public final void method55(int arg0, int arg1, byte arg2) {
        if (arg2 < 108) {
            field98 = 62;
        }
        ++field101;
        int var4 = this.field99 * arg0 >> 12;
        int var5 = this.field104 * arg0 >> 12;
        int var6 = this.field103 * arg1 >> 12;
        int var7 = this.field105 * arg1 >> 12;
        class7.method30(var6, var5, var7, -83, super.field5685, super.field5688, var4);
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIIIII)V", line = 46)
    public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field99 = arg0;
        this.field104 = arg2;
        this.field103 = arg1;
        this.field105 = arg3;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)Z", line = 57)
    public static final boolean method56(int arg0, int arg1) {
        ++field100;
        for (class208 var2 = (class208) class530.field7597.method3174((byte) 49); var2 != null; var2 = (class208) class530.field7597.method3168(false)) {
            if (class662.method3721((byte) 98, var2.field2527) && (long) arg0 == var2.field2524) {
                return true;
            }
        }
        if (arg1 != 16777215) {
            method56(-125, -25);
        }
        return false;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IBI)V", line = 80)
    public final void method57(int arg0, byte arg1, int arg2) {
        ++field102;
        int var4 = this.field99 * arg0 >> 12;
        if (arg1 != -122) {
            this.field103 = 99;
        }
        int var5 = this.field104 * arg0 >> 12;
        int var6 = this.field103 * arg2 >> 12;
        int var7 = this.field105 * arg2 >> 12;
        class7.method31(-32, super.field5686, super.field5688, var6, var5, var7, super.field5685, var4);
    }
}
