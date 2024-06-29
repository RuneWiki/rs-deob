import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class171 extends class93 implements class142 {

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    private int field2491;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 7)
    public static final void method1141(int arg0) {
        ++field2496;
        if (!class74.field1112) {
            if (!class154.field2244.field7738) {
                class48.field754 += (12.0F - class48.field754) / 2.0F;
            } else {
                class426.field5820 = (float) ((int) class426.field5820 - -47 & -16);
            }
            class74.field1112 = true;
            class104.field1531 = true;
            if (arg0 == -10450) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lbo;I[BIZ)V", line = 31)
    public class171(class511 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2491 = arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V", line = 41)
    public static final void method1142(int arg0, int arg1, int arg2, int arg3) {
        ++field2499;
        if (arg1 == 1) {
            class253 var4 = class332.method1911(arg3, (byte) -118, 9);
            var4.method1522(0);
            var4.field3355 = arg0;
            var4.field3356 = arg2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)J", line = 56)
    public final long method997(int arg0) {
        ++field2497;
        if (arg0 != -19471) {
            this.field2491 = 115;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V", line = 67)
    public static final void method1143(byte arg0) {
        class21.field377.method473(-3512);
        ++field2493;
        for (int var1 = 0; var1 < 32; ++var1) {
            class461.field6366[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class180.field2598[var2] = 0L;
        }
        class71.field1064 = 0;
        if (arg0 >= 101) {
            ;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V", line = 93)
    public final void method670(byte arg0) {
        if (arg0 <= -46) {
            super.field1402.method3009((byte) 111, this);
            ++field2492;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIII)V", line = 106)
    public final void method996(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method671(arg1 ^ -61580, arg0, arg2);
        if (arg1 != -30832) {
            this.field2491 = 110;
        }
        ++field2494;
        this.field2491 = arg3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILqa;ILus;I)V", line = 120)
    public static final void method1144(int arg0, int arg1, class162 arg2, int arg3, class1 arg4, int arg5) {
        ++field2490;
        int var6 = 22 / ((-66 - arg1) / 44);
        class355 var7 = class466.field6434.method372(83, arg4.field45);
        if (~var7.field4791 != 0) {
            int var8;
            if (!arg4.field12) {
                var8 = 0;
            } else {
                int var9 = arg4.field9 + arg5;
                var8 = var9 & 3;
            }
            class529 var10 = var7.method2076(arg4.field56, 0, arg2, var8);
            if (var10 != null) {
                int var11 = arg4.field82;
                int var12 = arg4.field16;
                if (~(var8 & 1) == -2) {
                    var11 = arg4.field16;
                    var12 = arg4.field82;
                }
                int var13 = var10.method151();
                int var14 = var10.method149();
                if (var7.field4795) {
                    var14 = var12 * 4;
                    var13 = var11 * 4;
                }
                if (~var7.field4797 != -1) {
                    var10.method155(arg3, -((var12 + -1) * 4) + arg0, var13, var14, 0, var7.field4797 | -16777216, 1);
                } else {
                    var10.method3114(arg3, -((var12 - 1) * 4) + arg0, var13, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I", line = 176)
    public final int method995(byte arg0) {
        ++field2498;
        if (arg0 != -40) {
            method1141(-112);
        }
        return super.field1406;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I", line = 188)
    public final int method998(int arg0) {
        if (arg0 != -20737) {
            return -4;
        } else {
            ++field2495;
            return this.field2491;
        }
    }
}
