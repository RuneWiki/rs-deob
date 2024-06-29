import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class603 {

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public int field8520;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field8511;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "B")
    public byte field8517;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public int field8515;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public int field8524;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public int field8527;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Ldg;")
    public static class376 field8523 = new class376(54, 3);

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Ldg;")
    public static class376 field8526 = new class376(0, 4);

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lrt;")
    public static class205 field8514;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lmm;")
    public class250 field8516;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lwj;")
    public class359 field8512;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Lek;")
    public class468 field8522;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lre;")
    public class557 field8519;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Z")
    public static final boolean method3398(int arg0, int arg1) {
        field8518++;
        if (arg0 != 2) {
            method3399(null, -63, 15, true, 102, 91, -118);
        }
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lrk;IIZIII)V")
    public static final void method3399(class30 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field8513++;
        if (class8.field83 >= 50 || arg0 == null || arg0.field471 == null || arg2 >= arg0.field471.length || arg0.field471[arg2] == null) {
            return;
        }
        int var7 = arg0.field471[arg2][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF7) >> 5;
        if (arg0.field471[arg2].length > 1) {
            int var10 = (int) ((double) arg0.field471[arg2].length * Math.random());
            if (var10 > 0) {
                var8 = arg0.field471[arg2][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg3) {
                if (!arg0.field454) {
                    class50.method569(var8, var9, 0, (byte) -34, 255);
                    return;
                }
                class89.method767(-35, 0, false, 255, var9, var8);
            }
        } else if (class287.field4270.field3687 != 0) {
            int var12 = arg1 - 256 >> 9;
            int var13 = arg5 - 256 >> 9;
            class106.field1642[class8.field83++] = new class603((byte) (arg0.field454 ? 2 : 1), var8, var9, 0, 255, (arg6 << 24) + (var12 << 16) + (var13 << 8) + var11);
            if (arg4 >= -56) {
                method3398(-17, -35);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Z")
    public final boolean method3400(int arg0) {
        field8525++;
        if (arg0 == 985960808) {
            return this.field8517 == 2 || this.field8517 == 3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method3401(int arg0) {
        field8526 = null;
        if (arg0 == 25656) {
            field8523 = null;
            field8514 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method3402(byte arg0) {
        class340.field5002 = 0;
        field8521++;
        class663.field9367.method475(6);
        int var1 = -94 % ((arg0 - 57) / 62);
        class623.field8731 = false;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(BIIIII)V")
    public class603(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8520 = arg3;
        this.field8511 = arg2;
        this.field8517 = arg0;
        this.field8515 = arg5;
        this.field8524 = arg1;
        this.field8527 = arg4;
    }
}
