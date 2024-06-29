import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class613 extends class277 {

    @OriginalMember(owner = "client!eq", name = "ob", descriptor = "Lkc;")
    public class199 field8991;

    @OriginalMember(owner = "client!eq", name = "vb", descriptor = "Luw;")
    public static class186 field8998 = new class186();

    @OriginalMember(owner = "client!eq", name = "mb", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!eq", name = "nb", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!eq", name = "pb", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!eq", name = "qb", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!eq", name = "rb", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!eq", name = "sb", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!eq", name = "tb", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!eq", name = "ub", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!eq", name = "wb", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lfea;", line = 3)
    public static final class47 method3567(Canvas arg0, int arg1) {
        ++field8995;
        try {
            if (arg1 != -1) {
                return null;
            } else {
                Class var2 = Class.forName("wn");
                class47 var3 = (class47) var2.newInstance();
                var3.method240(13948, arg0);
                return var3;
            }
        } catch (Throwable var5) {
            class102 var4 = new class102();
            var4.method240(13948, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BII)Z", line = 30)
    public static final boolean method3568(byte arg0, int arg1, int arg2) {
        ++field8992;
        int var3 = -35 % ((89 - arg0) / 32);
        return ~(458752 & arg1) != -1 | class6.method26(arg1, true, arg2) || class517.method3074(false, arg2, arg1);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V", line = 40)
    public final void method910(byte arg0) {
        if (arg0 != -78) {
            field8998 = null;
        }
        ++field8990;
        this.field8991 = new class199((class529) super.field4068);
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)V", line = 57)
    public static void method3569(int arg0) {
        field8998 = null;
        if (arg0 != 1) {
            method3567((Canvas) null, -113);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILwca;Z)V", line = 68)
    public static final void method3570(int arg0, class311 arg1, boolean arg2) {
        ++field8996;
        int var3 = ~arg1.field4606 == -1 ? arg1.field4543 : arg1.field4606;
        int var4 = ~arg1.field4581 == -1 ? arg1.field4620 : arg1.field4581;
        class232.method1512(var3, arg2, class251.field3650[arg1.field4667 >> 16], var4, (byte) 72, arg1.field4667);
        if (arg1.field4652 != null) {
            class232.method1512(var3, arg2, arg1.field4652, var4, (byte) 72, arg1.field4667);
        }
        class184 var5 = (class184) class600.field8865.method1333((long) arg1.field4667, false);
        if (arg0 != -26662) {
            field8993 = -97;
        }
        if (var5 != null) {
            class102.method596(arg2, -1, var3, var4, var5.field2796);
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V", line = 94)
    public static final void method3571(int arg0) {
        for (class548 var1 = (class548) class272.field4014.method2496((byte) -101); var1 != null; var1 = (class548) class272.field4014.method2494(107)) {
            if (class425.method2516(true, var1.field8163)) {
                class377.method2296(1810547632, var1);
            }
        }
        ++field8997;
        if (arg0 <= 67) {
            method3570(-61, (class311) null, false);
        }
        if (class487.field7385 != 1) {
            class598.method3494(class475.field7252, class290.field4257, (byte) -127, class452.field6607, class218.field3232);
            int var2 = class511.field7585.method1053((byte) 123, class88.field1126.method2953(3181, class77.field889));
            for (class548 var3 = (class548) class272.field4014.method2496((byte) -116); var3 != null; var3 = (class548) class272.field4014.method2494(57)) {
                int var4 = class111.method660(var3, -7775);
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            class452.field6607 = var2 + 8;
            class475.field7252 = (!class455.field6636 ? 22 : 26) + class487.field7385 * 16;
        } else {
            class502.method3015(false);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([JZII[I)V", line = 140)
    public static final void method3572(long[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 - -arg3) / 2;
            int var6 = arg2;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var9;
            int var10 = var7 != Long.MAX_VALUE ? 1 : 0;
            for (int var11 = arg2; var11 < arg3; ++var11) {
                if (~((long) (var10 & var11) + var7) < ~arg0[var11]) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var9;
            method3572(arg0, arg1, arg2, var6 + -1, arg4);
            method3572(arg0, false, var6 + 1, arg3, arg4);
        }
        if (arg1) {
            field8993 = -2;
        }
        ++field8989;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lcm;)V", line = 195)
    public class613(class529 arg0) {
        super(arg0);
        this.field8991 = new class199(arg0);
        super.field4091 = new class58(super.field4068);
        super.field4118 = new class58(super.field4068);
        super.field4107 = new class58(super.field4068);
        super.field4078 = new class58(super.field4068);
        super.field4103 = new class58(super.field4068);
        super.field4123 = new class58(super.field4068);
        super.field4122 = new class58(super.field4068);
        super.field4120 = new class58(super.field4068);
        super.field4083 = new class58(super.field4068);
        super.field4082 = new class58(super.field4068);
    }
}
