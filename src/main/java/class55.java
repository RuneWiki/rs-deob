import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class55 {

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field708 = -2;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "Lmga;")
    public static class665 field707;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[B")
    public byte[] field705;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "[S")
    public short[] field703;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "[S")
    public short[] field706;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "[S")
    public short[] field710;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZZIIBI)V")
    public static final void method397(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6) {
        field709++;
        if (arg3 > arg4) {
            int var7 = (arg3 + arg4) / 2;
            int var8 = arg4;
            class305 var9 = class704.field9858[var7];
            class704.field9858[var7] = class704.field9858[arg3];
            class704.field9858[arg3] = var9;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (class587.method3263(arg0, arg6, arg2, arg1, class704.field9858[var10], var9, (byte) -115) <= 0) {
                    class305 var11 = class704.field9858[var10];
                    class704.field9858[var10] = class704.field9858[var8];
                    class704.field9858[var8++] = var11;
                }
            }
            class704.field9858[arg3] = class704.field9858[var8];
            class704.field9858[var8] = var9;
            method397(arg0, arg1, arg2, var8 - 1, arg4, (byte) -112, arg6);
            method397(arg0, arg1, arg2, arg3, var8 + 1, (byte) -126, arg6);
        }
        if (arg5 > -77) {
            method397(-26, false, true, -75, 68, (byte) -103, 3);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lpba;IIB)J")
    public static final long method398(class310 arg0, int arg1, int arg2, byte arg3) {
        field704++;
        int var4 = -97 % ((29 - arg3) / 41);
        long var5 = 4194304L;
        long var7 = 2147483648L;
        long var9 = Long.MIN_VALUE;
        class687 var11 = class232.field3017.method2358(0, arg0.method131((byte) -97));
        long var12 = (long) (arg2 | 0x800000 << 7 | arg1 | arg0.method138(8470) << 14 | arg0.method139((byte) 126) << 20);
        if (var11.field9382 == 0) {
            var12 |= var9;
        }
        if (var11.field9449 == 1) {
            var12 |= var5;
        }
        if (var11.field9464) {
            var12 |= var7;
        }
        return var12 | (long) arg0.method131((byte) -97) << 32;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method399(int arg0) {
        field707 = null;
        if (arg0 != 1073741824) {
            method398(null, -49, 69, (byte) -104);
        }
    }
}
