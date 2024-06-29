import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class497 extends class496 {

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[[[I")
    public static int[][][] field7475;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 4)
    public static void method2998(int arg0) {
        if (arg0 != 0) {
            method3000(-21);
        }
        field7475 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIBIII)V", line = 22)
    public static final void method2999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field7476++;
        class537 var10 = null;
        for (class537 var11 = (class537) class178.field2698.method2496((byte) -108); var11 != null; var11 = (class537) class178.field2698.method2494(71)) {
            if (var11.field7941 == arg0 && var11.field7940 == arg8 && var11.field7948 == arg7 && var11.field7945 == arg1) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class537();
            var10.field7948 = arg7;
            var10.field7941 = arg0;
            var10.field7940 = arg8;
            var10.field7945 = arg1;
            if (arg8 >= 0 && arg7 >= 0 && class35.field399 > arg8 && class382.field5586 > arg7) {
                class464.method2754(var10, (byte) 57);
            }
            class178.field2698.method2492(var10, (byte) -115);
        }
        var10.field7946 = arg4;
        var10.field7936 = arg9;
        var10.field7938 = arg5;
        var10.field7947 = arg3;
        if (arg6 <= 125) {
            field7475 = null;
        }
        var10.field7939 = arg2;
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V", line = 76)
    public static final void method3000(int arg0) {
        class221.field3268.method2576(true, class3.field15.method3467(-19739));
        field7473++;
        if (arg0 != 0) {
            field7475 = null;
        }
        class221.field3268.method2576(true, class627.field9192.method3467(-19739));
        class221.field3268.method2576(true, class635.field9258.method3467(arg0 ^ 0xFFFFB2E5));
        class221.field3268.method2576(true, class126.field1664.method3467(-19739));
        class221.field3268.method2576(true, class197.field2968.method3467(arg0 ^ 0xFFFFB2E5));
        class221.field3268.method2576(true, class594.field8766.method3467(-19739));
        class221.field3268.method2576(true, class524.field7765.method3467(-19739));
        class221.field3268.method2576(true, class57.field700.method3467(arg0 ^ 0xFFFFB2E5));
        class221.field3268.method2576(true, class371.field5368.method3467(-19739));
        class221.field3268.method2576(true, class280.field4166.method3467(-19739));
        class221.field3268.method2576(true, class493.field7443.method3467(-19739));
        class221.field3268.method2576(true, class11.field103.method3467(-19739));
        class221.field3268.method2576(true, class301.field4409.method3467(-19739));
        class221.field3268.method2576(true, class644.field9347.method3467(arg0 - 19739));
        class221.field3268.method2576(true, class577.field8509.method3467(-19739));
        class221.field3268.method2576(true, class163.field2180.method3467(arg0 - 19739));
        class221.field3268.method2576(true, class637.field9274.method3467(arg0 - 19739));
        class221.field3268.method2576(true, class644.field9340.method3467(arg0 ^ 0xFFFFB2E5));
        class221.field3268.method2576(true, class89.field1139.method3467(-19739));
        class221.field3268.method2576(true, class549.field8190.method3467(arg0 ^ 0xFFFFB2E5));
        class221.field3268.method2576(true, class292.field4288.method3467(arg0 ^ 0xFFFFB2E5));
        class221.field3268.method2576(true, class379.field5557.method3467(-19739));
        class221.field3268.method2576(true, class349.field5065.method3467(-19739));
        class221.field3268.method2576(true, class308.field4493.method3467(-19739));
        class221.field3268.method2576(true, class227.field3339.method3467(-19739));
        class221.field3268.method2576(true, class311.field4639.method3467(-19739));
        class221.field3268.method2576(true, class277.field4069.method3467(arg0 ^ 0xFFFFB2E5));
        class221.field3268.method2576(true, class31.field321.method3467(arg0 - 19739));
        class221.field3268.method2576(true, class130.field1714.method3467(-19739));
        class221.field3268.method2576(true, class312.field4689.method3467(-19739));
        class221.field3268.method2576(true, class20.field182.method3467(arg0 ^ 0xFFFFB2E5));
        class221.field3268.method2576(true, class646.field9378.method3467(-19739));
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V", line = 118)
    public static final void method3001(byte arg0) {
        field7474++;
        int var1 = -49 / ((arg0 + 84) / 36);
        class126[] var2 = class184.field2797;
        synchronized (class184.field2797) {
            for (int var3 = 0; var3 < class184.field2797.length; var3++) {
                class184.field2797[var3] = new class126();
                class435.field6376[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I")
    public abstract int method32(byte arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)I")
    public abstract int method30(boolean arg0);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)J")
    public abstract long method33(int arg0);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)I")
    public abstract int method34(int arg0);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)I")
    public abstract int method31(int arg0);
}
