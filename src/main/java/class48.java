import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class48 {

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public static int[] field795 = new int[99];

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[Ljh;")
    public static class269[] field803;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Ljava/lang/String;")
    public static String field804;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lub;")
    public static class21 field800;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V", line = 6)
    public static final void method372(int arg0, byte arg1, int arg2) {
        if (arg1 > -86) {
            method375((byte) 116);
        }
        class118.field1907[arg2] = arg0;
        class60 var3 = (class60) class156.field2485.method833(false, (long) arg2);
        if (var3 == null) {
            class60 var4 = new class60(4611686018427387905L);
            class156.field2485.method845(var4, (byte) -48, (long) arg2);
        } else if (var3.field939 != 4611686018427387905L) {
            var3.field939 = class154.method1172((byte) 100) + 500L | 0x4000000000000000L;
        }
        field796++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZ)I", line = 37)
    public static final int method373(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field804 = (String) null;
        }
        field794++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)I", line = 64)
    public static final int method374(int arg0, int arg1, int arg2, int arg3) {
        field793++;
        if (class29.field475 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        } else if (arg2 <= 85) {
            return 113;
        } else {
            int var6 = arg3;
            if (arg3 < 3 && (class250.field3857[1][var5][var4] & 0x2) == 2) {
                var6 = arg3 + 1;
            }
            int var7 = arg0 & 0x7F;
            int var8 = arg1 & 0x7F;
            int var9 = (128 - var8) * class29.field475[var6][var5][var4 + 1] + class29.field475[var6][var5 + 1][var4 + 1] * var8 >> 7;
            int var10 = (128 - var8) * class29.field475[var6][var5][var4] + class29.field475[var6][var5 + 1][var4] * var8 >> 7;
            return (128 - var7) * var10 + var7 * var9 >> 7;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 99)
    public static void method375(byte arg0) {
        if (arg0 != 123) {
            method375((byte) -87);
        }
        field804 = null;
        field795 = null;
        field803 = null;
        field800 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIILdg;JZ)V", line = 111)
    public static final void method376(int arg0, int arg1, int arg2, int arg3, class320 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class87 var8 = new class87();
        var8.field1325 = arg4;
        var8.field1334 = arg1 * 128 + 64;
        var8.field1336 = arg2 * 128 + 64;
        var8.field1326 = arg3;
        var8.field1338 = arg5;
        var8.field1339 = arg6;
        if (class60.field946[arg0][arg1][arg2] == null) {
            class60.field946[arg0][arg1][arg2] = new class272(arg0, arg1, arg2);
        }
        class60.field946[arg0][arg1][arg2].field4213 = var8;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field795[var1] = var0 / 4;
        }
        field803 = new class269[14];
        field805 = 0;
        field804 = "Please wait - attempting to reestablish.";
    }
}
