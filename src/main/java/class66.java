import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class66 {

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "J")
    public static long field637 = 0L;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "[I")
    public static int[] field639 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "[Llk;")
    public static class502[] field642 = new class502[14];

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "Lraa;")
    public static class520 field643 = new class520();

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "Lrn;")
    public static class224 field638;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "Ldn;")
    public static class438 field645;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
    public static final void method370(byte arg0) {
        field644++;
        if (arg0 <= -122) {
            class199.field2397 = 0;
            class89.field1096.method1048(-7730);
            class473.field6634 = false;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)Ldda;")
    public static final class319 method371(int arg0) {
        if (arg0 != 5000) {
            method370((byte) -1);
        }
        field640++;
        class319 var1 = (class319) class272.field3537.method1988((byte) -46);
        if (var1 == null) {
            return new class319();
        } else {
            class279.field3678--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
    public static void method372(byte arg0) {
        field645 = null;
        field639 = null;
        field643 = null;
        field638 = null;
        if (arg0 != -128) {
            field645 = null;
        }
        field642 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILmd;)V")
    public static final void method373(int arg0, int arg1, class463 arg2) {
        field641++;
        int var3 = -1;
        int var4 = arg1;
        if (arg2.field6408 > class335.field4358) {
            class135.method754(true, arg2);
        } else if (class335.field4358 > arg2.field6405) {
            class75.method434(arg2, 123, false);
            var4 = class288.field3745;
            var3 = class474.field6644;
        } else {
            class170.method953(arg2, (byte) -114);
        }
        if (arg2.field8661 < 128 || arg2.field8652 < 128 || arg2.field8661 >= (class106.field1289 * 128 - 128) || arg2.field8652 >= ((class422.field5452 - 1) * 128)) {
            arg2.field6397 = -1;
            var3 = -1;
            var4 = 0;
            arg2.field6465 = -1;
            arg2.field6408 = 0;
            arg2.field6400 = -1;
            arg2.field6405 = 0;
            arg2.field8661 = arg2.field6483[0] * 128 + (arg2.method2694(28146) * 64);
            arg2.field8652 = arg2.field6491[0] * 128 + (arg2.method2694(28146) * 64);
            arg2.method2693(0);
        }
        if (class103.field1265 == arg2 && (arg2.field8661 < 1536 || arg2.field8652 < 1536 || arg2.field8661 >= (class106.field1289 * 128 - 1536) || arg2.field8652 >= (class422.field5452 * 128 - 1536))) {
            arg2.field6465 = -1;
            arg2.field6400 = -1;
            var4 = 0;
            arg2.field6397 = -1;
            var3 = -1;
            arg2.field6405 = 0;
            arg2.field6408 = 0;
            arg2.field8661 = arg2.field6483[0] * 128 + arg2.method2694(28146) * 64;
            arg2.field8652 = arg2.field6491[0] * 128 + (arg2.method2694(28146) * 64);
            arg2.method2693(arg1);
        }
        int var5 = class271.method1518(-108, arg2);
        class504.method2908(arg2, var4, true, var3, var5);
        class157.method866(-1, arg2);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lvk;[[BI)V")
    public static final void method374(class308 arg0, byte[][] arg1, int arg2) {
        field646++;
        int var3 = class148.field1777.length;
        for (int var4 = arg2; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class633.field9116[var4] >> 8) * 64 - class632.field9113;
                int var7 = (class633.field9116[var4] & 0xFF) * 64 - class119.field1504;
                class93.method560(true);
                arg0.method1706(class309.field3939, var7, var5, class210.field2560, var6, arg2 ^ 0xFFFFFF87);
            }
        }
    }
}
