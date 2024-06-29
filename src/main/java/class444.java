import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class444 extends class428 {

    @OriginalMember(owner = "client!ke", name = "Fb", descriptor = "I")
    public static int field6481 = 0;

    @OriginalMember(owner = "client!ke", name = "zb", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!ke", name = "Ab", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ke", name = "Bb", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!ke", name = "Cb", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!ke", name = "Db", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!ke", name = "Eb", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!ke", name = "Gb", descriptor = "Lsaa;")
    public static class18 field6482;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIBI)V", line = 3)
    public static final void method2696(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field6478;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        if (arg4 >= -66) {
            field6481 = -22;
        }
        int var13 = (1 - var12) * var8 - -var10;
        int var14 = -((var12 - 1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 + -1) * var15;
        class69.method418(arg1, class47.field558[arg2], arg3 + arg5, (byte) 117, -arg3 + arg5);
        while (~var7 < -1) {
            if (~var13 > -1) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            --var7;
            int var21 = arg2 - var7;
            int var22 = arg2 + var7;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class69.method418(arg1, class47.field558[var21], var23, (byte) 117, var24);
            class69.method418(arg1, class47.field558[var22], var23, (byte) 117, var24);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IF)V", line = 87)
    public final void method2697(int arg0, float arg1) {
        if (arg0 != -11) {
            method2701((byte) 38, true);
        }
        ++field6475;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field6162[super.field6221++] = (byte) (var3 >> 24);
        super.field6162[super.field6221++] = (byte) (var3 >> 16);
        super.field6162[super.field6221++] = (byte) (var3 >> 8);
        super.field6162[super.field6221++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "(II)Z", line = 103)
    public static final boolean method2698(int arg0, int arg1) {
        ++field6477;
        if (arg0 != 7) {
            method2701((byte) -11, false);
        }
        return ~arg1 == -4 || arg1 == 7 || ~arg1 == -11;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V", line = 114)
    public class444(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBIZI)V", line = 117)
    public static final void method2699(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        ++field6476;
        if (class239.field3499 != 0) {
            class155.field1986 = class239.field3499;
            class447.method2712(10, 0);
        } else {
            class186.method1221(-1, false);
        }
        class404.field5808 = arg3;
        if (arg1 > -121) {
            method2699(105, (byte) 105, 11, true, -53);
        }
        class15.field133 = arg2;
        class536.field7932 = arg0;
        class113.method684(arg4);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(FI)V", line = 144)
    public final void method2700(float arg0, int arg1) {
        if (arg1 == -353481768) {
            ++field6480;
            int var3 = Stream.floatToRawIntBits(arg0);
            super.field6162[super.field6221++] = (byte) var3;
            super.field6162[super.field6221++] = (byte) (var3 >> 8);
            super.field6162[super.field6221++] = (byte) (var3 >> 16);
            super.field6162[super.field6221++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BZ)V", line = 163)
    public static final void method2701(byte arg0, boolean arg1) {
        if (arg1) {
            if (class540.field8007 != -1) {
                class59.method378(class540.field8007, (byte) 111);
            }
            for (class184 var2 = (class184) class600.field8865.method1331(-1925); var2 != null; var2 = (class184) class600.field8865.method1340((byte) 108)) {
                if (!var2.method2994(102)) {
                    var2 = (class184) class600.field8865.method1331(-1925);
                    if (var2 == null) {
                        break;
                    }
                }
                class587.method3424(544, true, var2, false);
            }
            class540.field8007 = -1;
            class600.field8865 = new class205(8);
            class239.method1535(-127);
            class540.field8007 = class53.field635;
            class558.method3267(false, (byte) 119);
            class539.method3164(-113);
            class330.method2074(class540.field8007);
        }
        ++field6479;
        if (arg0 < 52) {
            field6482 = null;
        }
        class601.field8873 = true;
    }

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "(I)V", line = 206)
    public static void method2702(int arg0) {
        if (arg0 != 7) {
            field6482 = null;
        }
        field6482 = null;
    }
}
