import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class638 {

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "B")
    public byte field8709;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public int field8708;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public int field8715;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public int field8707;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "S")
    public short field8711;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field8714;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "S")
    public short field8705;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "Z")
    public boolean field8712;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "S")
    public short field8710;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public int field8713;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "Lrh;")
    public static class59 field8704 = new class59();

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILdga;)Lwu;", line = 4)
    public static final class404 method3474(int arg0, class138 arg1) {
        field8706++;
        String var2 = arg1.method907(false);
        class380 var3 = class248.method1550(arg0 ^ 0xFFFFC97F)[arg1.method957((byte) -124)];
        class97 var4 = class296.method1767(false)[arg1.method957((byte) -100)];
        if (arg0 != 14049) {
            method3474(-70, null);
        }
        int var5 = arg1.method924(arg0 - 14047);
        int var6 = arg1.method924(2);
        int var7 = arg1.method943(-78);
        int var8 = arg1.method943(-126);
        return new class404(var2, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 45)
    public static void method3475(int arg0) {
        int var1 = 14 % ((arg0 + 13) / 42);
        field8704 = null;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 56)
    public class638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8709 = (byte) arg8;
        this.field8708 = arg11;
        this.field8715 = arg2;
        this.field8707 = arg1;
        this.field8711 = (short) arg6;
        this.field8714 = arg3;
        this.field8705 = (short) arg5;
        this.field8712 = arg10;
        this.field8710 = (short) arg4;
        this.field8713 = arg0;
    }
}
