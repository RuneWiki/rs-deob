import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class532 {

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "[I")
    public int[] field7325 = new int[4];

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "[I")
    public int[] field7322 = new int[4];

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "B")
    public byte field7319;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "B")
    public byte field7333;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "[I")
    public int[] field7318;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "S")
    public short field7332;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "S")
    public short field7329;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "S")
    public short field7324;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "[S")
    public short[] field7321;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "[S")
    public short[] field7320;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "S")
    public short field7327;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "[S")
    public short[] field7326;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Ljn;")
    public static class134 field7328 = new class134(94, 0);

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "Lwj;")
    public static class631 field7331;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 7)
    public static void method3153(int arg0) {
        field7328 = null;
        if (arg0 > -30) {
            field7331 = null;
        }
        field7331 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZI)V", line = 28)
    public static final void method3154(int arg0, boolean arg1, int arg2) {
        if (arg2 != 1) {
            field7331 = null;
        }
        field7330++;
        class577.method3380(10, arg0, class712.field9865.method3999(class553.field7667, (byte) -62), arg1);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 46)
    public static final void method3155(int arg0) {
        field7323++;
        class350 var1 = (class350) class601.field8412.method1041(1048832);
        if (arg0 != 3) {
            method3154(16, true, -68);
        }
        while (var1 != null) {
            class629 var2 = var1.field5088;
            if (var2.field8817) {
                var1.method527(-11229);
                var2.method3615(true);
            } else if (class533.field7336 >= var2.field8806) {
                var2.method3613(-12, class510.field6925);
                if (var2.field8817) {
                    var1.method527(-11229);
                } else {
                    class497.method2922(var2, true);
                }
            }
            var1 = (class350) class601.field8412.method1033(-1);
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 85)
    public class532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field7319 = (byte) arg0;
        this.field7333 = (byte) arg1;
        this.field7318 = new int[4];
        this.field7325[3] = arg5;
        this.field7325[0] = arg2;
        this.field7325[2] = arg4;
        this.field7325[1] = arg3;
        this.field7322[0] = arg6;
        this.field7322[1] = arg7;
        this.field7322[2] = arg8;
        this.field7322[3] = arg9;
        this.field7318[2] = arg12;
        this.field7332 = (short) (arg2 >> class732.field10110);
        this.field7318[0] = arg10;
        this.field7318[3] = arg13;
        this.field7318[1] = arg11;
        this.field7329 = (short) (arg4 >> class732.field10110);
        this.field7324 = (short) (arg10 >> class732.field10110);
        this.field7321 = new short[4];
        this.field7320 = new short[4];
        this.field7327 = (short) (arg12 >> class732.field10110);
        this.field7326 = new short[4];
    }
}
