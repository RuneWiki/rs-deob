import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class237 {

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    private int field2958;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "[Lpp;")
    private class508[] field2956;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "Lwp;")
    public static class453 field2964 = new class453(97, -1);

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "Lfh;")
    public static class266 field2966 = new class266(10, 3);

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "Lwp;")
    public static class453 field2967 = new class453(30, -1);

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "[I")
    public static int[] field2968 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "J")
    private long field2962;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "Lpp;")
    private class508 field2957;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IJ)Lpp;", line = 21)
    public final class508 method1421(int arg0, long arg1) {
        this.field2962 = arg1;
        field2960++;
        class508 var4 = this.field2956[(int) (arg1 & (long) (this.field2958 + arg0))];
        for (this.field2957 = var4.field6876; this.field2957 != var4; this.field2957 = this.field2957.field6876) {
            if (this.field2957.field6874 == arg1) {
                class508 var5 = this.field2957;
                this.field2957 = this.field2957.field6876;
                return var5;
            }
        }
        this.field2957 = null;
        return null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(JILpp;)V", line = 47)
    public final void method1422(long arg0, int arg1, class508 arg2) {
        field2963++;
        if (arg2.field6877 != null) {
            arg2.method2744((byte) -101);
        }
        class508 var5 = this.field2956[(int) (arg0 & (long) (this.field2958 - 1))];
        arg2.field6876 = var5;
        arg2.field6877 = var5.field6877;
        arg2.field6877.field6876 = arg2;
        arg2.field6874 = arg0;
        int var6 = 39 / ((27 - arg1) / 51);
        arg2.field6876.field6877 = arg2;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(I)V", line = 65)
    public class237(int arg0) {
        this.field2958 = arg0;
        this.field2956 = new class508[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class508 var3 = this.field2956[var2] = new class508();
            var3.field6877 = var3;
            var3.field6876 = var3;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II[Lkp;IZI)V", line = 89)
    public static final void method1423(int arg0, int arg1, class507[] arg2, int arg3, boolean arg4, int arg5) {
        field2961++;
        if (arg5 > -29) {
            return;
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class507 var7 = arg2[var6];
            if (var7 != null && var7.field6719 == arg3) {
                class370.method2023(arg0, var7, 23054, arg4, arg1);
                class691.method3887(arg0, arg1, (byte) -127, var7);
                if (var7.field6785 > (var7.field6816 - var7.field6793)) {
                    var7.field6785 = var7.field6816 - var7.field6793;
                }
                if (var7.field6785 < 0) {
                    var7.field6785 = 0;
                }
                if (var7.field6852 - var7.field6700 < var7.field6769) {
                    var7.field6769 = var7.field6852 - var7.field6700;
                }
                if (var7.field6769 < 0) {
                    var7.field6769 = 0;
                }
                if (var7.field6735 == 0) {
                    class285.method1605(var7, false, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 135)
    public static void method1424(int arg0) {
        field2964 = null;
        field2967 = null;
        int var1 = 29 / ((arg0 + 43) / 63);
        field2968 = null;
        field2966 = null;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)Lpp;", line = 153)
    public final class508 method1425(int arg0) {
        field2959++;
        if (this.field2957 == null) {
            return null;
        } else if (arg0 == 23986) {
            class508 var2 = this.field2956[(int) (this.field2962 & (long) (this.field2958 - 1))];
            while (this.field2957 != var2) {
                if (this.field2957.field6874 == this.field2962) {
                    class508 var3 = this.field2957;
                    this.field2957 = this.field2957.field6876;
                    return var3;
                }
                this.field2957 = this.field2957.field6876;
            }
            this.field2957 = null;
            return null;
        } else {
            return null;
        }
    }
}
