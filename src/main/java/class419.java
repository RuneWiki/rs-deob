import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class419 extends class393 {

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "Z")
    public boolean field6222 = false;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public int field6231 = -1;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "[[B")
    public static byte[][] field6224 = new byte[1000][];

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    public static int field6225 = 0;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public int field6223;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "I")
    public int field6232;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    public int field6233;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
    public int field6235;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "Lqj;")
    public static class238 field6221;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "Lqj;")
    public static class238 field6228;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "Lqa;")
    public static class243 field6227;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILqj;BIZII)V", line = 3)
    public static final void method2696(int arg0, class238 arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class35.field576 = arg0;
        if (arg2 <= 55) {
            field6236 = -9;
        }
        class347.field5148 = arg1;
        class269.field3931 = arg4;
        field6229++;
        class128.field1699 = arg6;
        field6236 = arg3;
        class158.field2073 = arg5;
        class24.field428 = 1;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILnr;ILro;)V", line = 24)
    public static final void method2697(int arg0, int arg1, class437 arg2, int arg3, class249 arg4) {
        if (arg4.field3637 == 2) {
            for (int var6 = arg1; var6 <= arg0; var6++) {
                int var7 = arg4.field3567[var6] - 1;
                if (var7 != -1) {
                    if (class394.field5921 == 1 && class91.field1248 == var6 && class73.field990 == arg4.field3622) {
                        boolean var8 = class439.method2778(arg2, 1483, var7, 0, (class103) null, arg4.field3585[var6], arg4.field3641, 2) == null;
                        if (var8) {
                            class284.field4148.method2660((byte) -121, new class84(var7, arg4.field3585[var6], 2, 0, arg4.field3641, false));
                        }
                    } else {
                        boolean var9 = class439.method2778(arg2, 1483, var7, -13623264, (class103) null, arg4.field3585[var6], arg4.field3641, 1) == null;
                        if (var9) {
                            class284.field4148.method2660((byte) -121, new class84(var7, arg4.field3585[var6], 1, -13623264, arg4.field3641, false));
                        }
                    }
                }
            }
        } else if (arg4.field3637 == 5) {
            boolean var5 = class439.method2778(arg2, 1483, arg4.field3588, arg4.field3492 | 0xFF000000, arg4.field3560 ? class100.field1350.field2778 : null, arg4.field3472, arg4.field3641, arg4.field3600) == null;
            if (var5) {
                class284.field4148.method2660((byte) -127, new class84(arg4.field3588, arg4.field3472, arg4.field3600, arg4.field3492 | 0xFF000000, arg4.field3641, arg4.field3560));
            }
        }
        if (arg3 <= 118) {
            method2698(10);
        }
        field6226++;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V", line = 80)
    public static void method2698(int arg0) {
        field6227 = null;
        field6228 = null;
        if (arg0 == -11532) {
            field6221 = null;
            field6224 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)I", line = 98)
    public static final int method2699(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAB) >>> 1);
        field6237++;
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        if (arg0 != 28135) {
            method2696(-38, (class238) null, (byte) -125, -53, false, 52, 46);
        }
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V", line = 137)
    public class419(int arg0) {
        this.field6231 = arg0;
    }
}
