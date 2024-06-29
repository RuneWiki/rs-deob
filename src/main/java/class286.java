import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class286 {

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Ltt;")
    public static class338 field3778 = new class338(62, 8);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I[BII)[B", line = 3)
    public static final byte[] method1695(int arg0, byte[] arg1, int arg2, int arg3) {
        field3776++;
        if (arg3 < 99) {
            field3778 = null;
        }
        byte[] var4;
        if (arg2 <= 0) {
            var4 = arg1;
        } else {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg1[arg2 + var5];
            }
        }
        class355 var6 = new class355();
        var6.method2095((byte) 89);
        var6.method2094(var4, (long) (arg0 * 8), 255);
        byte[] var7 = new byte[64];
        var6.method2091((byte) 127, var7, 0);
        return var7;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B[Ljava/lang/String;[S)V", line = 44)
    public static final void method1696(byte arg0, String[] arg1, short[] arg2) {
        field3774++;
        class502.method2855(arg2, arg1, -1, arg1.length - 1, 0);
        if (arg0 > -124) {
            field3778 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "toString", descriptor = "()Ljava/lang/String;", line = 55)
    public final String toString() {
        field3775++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)I", line = 67)
    public final int method1697(int arg0, int arg1, int arg2) {
        field3777++;
        int var4 = 2 / ((arg0 - 15) / 50);
        int var5 = arg2 >= class60.field750 ? arg2 : class60.field750;
        if (class461.field6037 == this) {
            return 0;
        } else if (class668.field9492 == this) {
            return var5 - arg1;
        } else if (class409.field5371 == this) {
            return (var5 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 89)
    public static void method1698(int arg0) {
        if (arg0 != 0) {
            method1696((byte) 60, null, null);
        }
        field3778 = null;
    }
}
