import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class677 extends class120 {

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public int field9590;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "Lpr;")
    public static class407 field9591 = new class407(114, 14);

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "Lpr;")
    public static class407 field9593 = new class407(73, 0);

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I", line = 3)
    public static final int method3781(int arg0, int arg1) {
        field9589++;
        if (arg0 != 5953) {
            return 37;
        }
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(ILida;Lce;III)V", line = 19)
    public class677(int arg0, class215 arg1, class278 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9590 = arg5;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Lqv;", line = 30)
    public final class406 method484(int arg0) {
        if (arg0 == 16236) {
            field9592++;
            return class186.field2266;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 43)
    public static void method3782(byte arg0) {
        if (arg0 > -13) {
            field9591 = null;
        }
        field9591 = null;
        field9593 = null;
    }
}
