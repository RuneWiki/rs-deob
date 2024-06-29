import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class237 extends class512 {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lfk;")
    public class678 field3156;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lofa;")
    public static class347 field3155 = null;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static void method1502(int arg0) {
        field3155 = null;
        if (arg0 != -1) {
            field3155 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lee;II[B)V")
    public class237(class703 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3156 = arg0.method3861(arg1, arg2, false, 12413, arg3, class325.field4613);
        this.field3156.method622(true, false, false);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lee;II[I)V")
    public class237(class703 arg0, int arg1, int arg2, int[] arg3) {
        this.field3156 = arg0.method3856(false, arg2, arg1, arg3, false);
        this.field3156.method622(true, false, false);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)B")
    public static final byte method1503(int arg0, int arg1, int arg2) {
        field3154++;
        int var3 = 87 % ((64 - arg2) / 32);
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
