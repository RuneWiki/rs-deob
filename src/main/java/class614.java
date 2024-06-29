import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class614 extends class299 {

    @OriginalMember(owner = "client!wfa", name = "t", descriptor = "I")
    private int field8649;

    @OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
    private int field8650;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    private int field8637;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    private int field8638;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "Lhi;")
    public static class65 field8641 = new class65();

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "Lwo;")
    public static class448 field8645 = class296.method1727(71);

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "Lsb;")
    public static class305 field8646 = new class305(59, 2);

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "J")
    public static long field8647 = -1L;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field8644;

    @OriginalMember(owner = "client!wfa", name = "s", descriptor = "[Lf;")
    public static class534[] field8648;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)V", line = 5)
    public static void method3414(byte arg0) {
        field8646 = null;
        if (arg0 != -42) {
            method3415(118);
        }
        field8648 = null;
        field8645 = null;
        field8641 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(IIIIIII)V", line = 18)
    public class614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field8649 = arg0;
        this.field8650 = arg3;
        this.field8637 = arg2;
        this.field8638 = arg1;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BII)V", line = 29)
    public final void method1477(byte arg0, int arg1, int arg2) {
        ++field8644;
        if (arg0 < -118) {
            int var4 = this.field8649 * arg1 >> 12;
            int var5 = this.field8637 * arg1 >> 12;
            int var6 = this.field8638 * arg2 >> 12;
            int var7 = this.field8650 * arg2 >> 12;
            class72.method384(super.field3725, true, var5, super.field3724, super.field3726, var4, var6, var7);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(III)V", line = 49)
    public final void method1480(int arg0, int arg1, int arg2) {
        ++field8639;
        int var4 = this.field8649 * arg1 >> 12;
        if (arg0 != 4096) {
            this.method1480(-45, 109, 15);
        }
        int var5 = this.field8637 * arg1 >> 12;
        int var6 = this.field8638 * arg2 >> 12;
        int var7 = this.field8650 * arg2 >> 12;
        class273.method1603(super.field3726, var4, var5, (byte) -79, var7, var6);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)V", line = 68)
    public final void method1481(int arg0, int arg1, int arg2) {
        ++field8640;
        if (arg0 != 0) {
            method3414((byte) -90);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)Z", line = 80)
    public static final boolean method3415(int arg0) {
        if (arg0 >= -9) {
            field8646 = null;
        }
        ++field8642;
        return class258.field3249 != 0 ? true : class291.field3642.method513((byte) 115);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)V", line = 104)
    public static final void method3416(int arg0, int arg1) {
        class120 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class274 var4 = class385.field5193[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class247.field3058; ++var5) {
                    for (int var6 = 0; var6 < class122.field1369; ++var6) {
                        var2 = var4.method388(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class559.field7984;
                            int var8 = var5 << class559.field7984;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class274 var10 = class385.field5193[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1608(var5, 840, var6) - var10.method1608(var5, 840, var6);
                                    int var12 = var4.method1608(var5, 840, var6 + 1) - var10.method1608(var5, 840, var6 + 1);
                                    int var13 = var4.method1608(var5 + 1, 840, var6 + 1) - var10.method1608(var5 + 1, 840, var6 + 1);
                                    int var14 = var4.method1608(var5 + 1, 840, var6) - var10.method1608(var5 + 1, 840, var6);
                                    var10.method390(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lgda;I)Z", line = 174)
    public static final boolean method3417(class49 arg0, int arg1) {
        ++field8643;
        class638 var2 = class364.field4891.method2134(arg0.method238(6518), true);
        if (~var2.field9039 == 0) {
            return true;
        } else {
            if (arg1 != 24268) {
                method3416(-59, 92);
            }
            class145 var3 = class689.field9695.method1114(-1, var2.field9039);
            return var3.field1608 == -1 ? true : var3.method800(0);
        }
    }
}
