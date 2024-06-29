import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class493 extends class69 {

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public int field6790;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field6787;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public int field6794;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public int field6793;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Z")
    public boolean field6789;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Z")
    public static boolean field6792 = false;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Laf;")
    public static class39 field6788 = new class39(8);

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Llp;")
    public static class82 field6796;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 7)
    public static void method2908(int arg0) {
        field6788 = null;
        field6796 = null;
        if (arg0 != -24381) {
            field6796 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I", line = 22)
    public static final int method2909(int arg0, int arg1, int arg2) {
        field6791++;
        int var3 = class268.method1746(arg1 + 91923, 4, 904, arg0 + 45365) - (128 - (class268.method1746(arg1 + 37821, 2, 904, arg0 + 10294) - 128 >> 1) - (class268.method1746(arg1, 1, 904, arg0) - 128 >> 2));
        if (arg2 != 60) {
            return -7;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIZ)V", line = 46)
    public class493(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6790 = arg2;
        this.field6787 = arg1;
        this.field6794 = arg4;
        this.field6793 = arg0;
        this.field6795 = arg3;
        this.field6789 = arg5;
    }
}
