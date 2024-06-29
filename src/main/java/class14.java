import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Lqda;")
    public static class87 field118 = new class87();

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "[Lvi;")
    public static class468[] field120 = new class468[4];

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Z", line = 6)
    public static final boolean method81(int arg0, byte arg1) {
        field119++;
        if (arg0 == 12 || arg0 == 59 || arg0 == 51 || arg0 == 11 || arg0 == 30) {
            return true;
        } else {
            if (arg1 != -102) {
                field120 = null;
            }
            return arg0 == 15 || arg0 == 1010;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lfa;IJLqf;IIIII)V", line = 27)
    public static final void method82(class199 arg0, int arg1, long arg2, class593 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field121++;
        int var10 = arg5 * arg5 + arg6 * arg6;
        if (((long) var10) > arg2) {
            return;
        }
        if (arg8 != -60) {
            method81(-46, (byte) 82);
        }
        int var11 = Math.min(arg3.field8570 / 2, arg3.field8518 / 2);
        if (var10 <= var11 * var11) {
            class222.method1440(arg7, arg5, arg6, arg1, arg3, arg0, class233.field3268[arg4], arg8 ^ 0x5F);
            return;
        }
        var11 -= 10;
        int var12;
        if (class236.field3384 == 4) {
            var12 = (int) class388.field5967 & 0x3FFF;
        } else {
            var12 = (int) class388.field5967 + class17.field173 & 0x3FFF;
        }
        int var13 = class605.field8859[var12];
        int var14 = class605.field8858[var12];
        if (class236.field3384 != 4) {
            var13 = var13 * 256 / (class34.field389 + 256);
            var14 = var14 * 256 / (class34.field389 + 256);
        }
        int var15 = arg5 * var13 + (arg6 * var14) >> 14;
        int var16 = arg5 * var14 - (arg6 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class96.field1135[arg4].method2704((float) arg3.field8570 / 2.0F + (float) arg1 + (float) var19, (float) arg3.field8518 / 2.0F + (float) arg7 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 81)
    public static void method83(int arg0) {
        field118 = null;
        if (arg0 == -16) {
            field120 = null;
        }
    }
}
