import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class260 extends class53 {

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "Z")
    public static boolean field4356 = false;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field4354 = 0;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 4)
    public class260() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(JZ)Lwa;", line = 14)
    public static final class75 method1855(long arg0, boolean arg1) {
        field4358++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            if (arg1) {
                return (class75) null;
            }
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class108.field1807[(int) (var7 - (arg0 * 37L))];
            }
            class75 var9 = new class75();
            var9.field1296 = var6;
            var9.field1280 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIILpj;JZ)V", line = 60)
    public static final void method1856(int arg0, int arg1, int arg2, int arg3, class171 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class217 var8 = new class217();
        var8.field3707 = arg4;
        var8.field3709 = arg1 * 128 + 64;
        var8.field3711 = arg2 * 128 + 64;
        var8.field3705 = arg3;
        var8.field3704 = arg5;
        var8.field3714 = arg6;
        if (class271.field4681[arg0][arg1][arg2] == null) {
            class271.field4681[arg0][arg1][arg2] = new class242(arg0, arg1, arg2);
        }
        class271.field4681[arg0][arg1][arg2].field4092 = var8;
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V", line = 89)
    public static final void method1857(int arg0) {
        field4361++;
        if (class207.field3498 == 5) {
            if (arg0 != 0) {
                field4355 = -123;
            }
            class207.field3498 = 6;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I", line = 112)
    public final int[] method59(int arg0, int arg1) {
        field4357++;
        int[] var3 = this.field878.method1603(arg1, (byte) 123);
        if (this.field878.field3749) {
            int[][] var4 = this.method388(arg0 + 15322, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class269.field4644; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return arg0 == -15196 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIILpj;Lpj;IIIIJ)V", line = 146)
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, class171 arg4, class171 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class235 var12 = new class235();
        var12.field3967 = arg10;
        var12.field3964 = arg1 * 128 + 64;
        var12.field3965 = arg2 * 128 + 64;
        var12.field3970 = arg3;
        var12.field3977 = arg4;
        var12.field3963 = arg5;
        var12.field3972 = arg6;
        var12.field3979 = arg7;
        var12.field3960 = arg8;
        var12.field3975 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class271.field4681[var13][arg1][arg2] == null) {
                class271.field4681[var13][arg1][arg2] = new class242(var13, arg1, arg2);
            }
        }
        class271.field4681[arg0][arg1][arg2].field4096 = var12;
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V", line = 187)
    public static final void method1859(int arg0) {
        if (arg0 != -17628) {
            method1855(-93L, true);
        }
        for (class290 var1 = (class290) class54.field890.method1250(true); var1 != null; var1 = (class290) class54.field890.method1256((byte) -126)) {
            if (var1.field4963) {
                var1.method2025(arg0 ^ 0xFFFFF24C);
            }
        }
        for (class290 var2 = (class290) class166.field2794.method1250(true); var2 != null; var2 = (class290) class166.field2794.method1256((byte) -124)) {
            if (var2.field4963) {
                var2.method2025(18792);
            }
        }
        field4353++;
    }
}
