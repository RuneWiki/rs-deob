import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class627 {

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public int field8490;

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lsha;")
    private class757 field8495;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "Lnq;")
    public static class485 field8497;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "Lnq;")
    public static class485 field8492 = field8497 = new class485(false);

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "Luq;")
    public static class172 field8494;

    @OriginalMember(owner = "client!kfa", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field8496++;
        this.field8495.method4147(0, this.field8490);
        super.finalize();
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V", line = 17)
    public static final void method3465(int arg0) {
        field8491++;
        if (arg0 == -256) {
            class517.field7193.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lfq;Lmu;II)V", line = 35)
    public static final void method3466(class214 arg0, class317 arg1, int arg2, int arg3) {
        field8489++;
        if (class10.field118 >= 50 || arg1 == null || arg1.field4463 == null || arg1.field4463.length <= arg3 || arg1.field4463[arg3] == null) {
            return;
        }
        int var4 = arg1.field4463[arg3][0];
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        if (arg1.field4463[arg3].length > 1) {
            int var7 = (int) ((double) arg1.field4463[arg3].length * Math.random());
            if (var7 > 0) {
                var5 = arg1.field4463[arg3][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg1.field4483 != null && arg1.field4491 != null) {
            var9 = arg1.field4483[arg3] + (int) ((double) (arg1.field4491[arg3] - arg1.field4483[arg3]) * Math.random());
        }
        int var10 = arg1.field4480 == null ? 255 : arg1.field4480[arg3];
        if (var8 == 0) {
            if (class625.field8475 == arg0) {
                if (!arg1.field4479) {
                    class449.method2673(var5, 0, var10, var9, 2003865932, var6);
                    return;
                }
                class416.method2509(var9, var6, var5, var10, false, 0, true);
            }
        } else if (class125.field1721.field5169.method1871(43) != 0) {
            int var11 = arg0.field2802 - 256 >> 9;
            int var12 = arg0.field2810 - 256 >> 9;
            int var13 = class625.field8475 == arg0 ? 0 : (var12 << 8) + (arg0.field2813 << 24) + (var11 << 16) + var8;
            class642.field8649[class10.field118++] = new class183((byte) (arg1.field4479 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg0);
            if (arg2 != -29701) {
                field8494 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V", line = 107)
    public static void method3467(int arg0) {
        field8497 = null;
        field8492 = null;
        if (arg0 != 0) {
            method3467(79);
        }
        field8494 = null;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([IIII[I)V", line = 119)
    public static final void method3468(int[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field8493++;
        int var5 = 84 / ((13 - arg1) / 58);
        if (arg2 >= arg3) {
            return;
        }
        int var6 = (arg2 + arg3) / 2;
        int var7 = arg2;
        int var8 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var8;
        int var9 = arg0[var6];
        arg0[var6] = arg0[arg3];
        arg0[arg3] = var9;
        int var10 = ~var8 == Integer.MIN_VALUE ? 0 : 1;
        for (int var11 = arg2; var11 < arg3; var11++) {
            if ((var11 & var10) + var8 > arg4[var11]) {
                int var12 = arg4[var11];
                arg4[var11] = arg4[var7];
                arg4[var7] = var12;
                int var13 = arg0[var11];
                arg0[var11] = arg0[var7];
                arg0[var7++] = var13;
            }
        }
        arg4[arg3] = arg4[var7];
        arg4[var7] = var8;
        arg0[arg3] = arg0[var7];
        arg0[var7] = var9;
        method3468(arg0, 92, arg2, var7 - 1, arg4);
        method3468(arg0, 76, var7 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lsha;II)V", line = 177)
    public class627(class757 arg0, int arg1, int arg2) {
        this.field8490 = arg2;
        this.field8495 = arg0;
    }
}
