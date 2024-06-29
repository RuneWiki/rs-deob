import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class146 extends class17 {

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    private int field2625 = 1365;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    private int field2627 = 20;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    private int field2626 = 0;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "I")
    private int field2635 = 0;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "Lsf;")
    public static class108 field2628 = class140.method973(255, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 70)
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)V", line = 8)
    public static void method1016(int arg0) {
        field2628 = null;
        if (arg0 != -325171796) {
            method1018(-100, 18, -103, -89, -34, (class290) null, -45, 62L, true);
        }
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V", line = 19)
    public static final void method1017(int arg0) {
        if (arg0 <= 28) {
            field2628 = (class108) null;
        }
        class98.field1620 = new class242(32);
        field2631++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIILma;IJZ)Z", line = 32)
    public static final boolean method1018(int arg0, int arg1, int arg2, int arg3, int arg4, class290 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class121.method850(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLrm;I)V", line = 80)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            this.method114((byte) 93, (class249) null, 21);
        }
        if (arg2 == 0) {
            this.field2625 = arg1.method1712(-1);
        } else if (arg2 == 1) {
            this.field2627 = arg1.method1712(-1);
        } else if (arg2 == 2) {
            this.field2635 = arg1.method1712(-1);
        } else if (arg2 == 3) {
            this.field2626 = arg1.method1712(-1);
        }
        field2634++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lrm;I)Lsf;", line = 132)
    public static final class108 method1019(class249 arg0, int arg1) {
        if (arg1 != -15789) {
            method1020((byte) -56, (class98) null, true);
        }
        field2630++;
        return class52.method368(32767, arg0, true);
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(II)[I", line = 147)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            return (int[]) null;
        }
        field2633++;
        int[] var3 = this.field217.method1698(-127, arg1);
        if (this.field217.field4295) {
            for (int var4 = 0; var4 < class116.field2008; var4++) {
                int var5 = (class36.field504[arg1] << 12) / this.field2625 + this.field2626;
                int var6 = (class61.field979[var4] << 12) / this.field2625 + this.field2635;
                int var7 = var6;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5;
                int var11 = 0;
                int var12 = var5 * var5 >> 12;
                for (int var13 = var6 * var6 >> 12; (var13 + var12) < 16384 && this.field2627 > var11; var13 = var8 * var8 >> 12) {
                    var11++;
                    var10 = (var8 * var10 >> 12) * 2 + var9;
                    var8 = var13 + var7 - var12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field2627 - 1 > var11 ? (var11 << 12) / this.field2627 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLca;Z)V", line = 203)
    public static final void method1020(byte arg0, class98 arg1, boolean arg2) {
        field2629++;
        int var3 = arg1.field1703 == 0 ? arg1.field1688 : arg1.field1703;
        int var4 = arg1.field1691 == 0 ? arg1.field1673 : arg1.field1691;
        if (arg0 != -120) {
            method1017(104);
        }
        class270.method1950(var4, arg1.field1649, class320.field5485[arg1.field1649 >> 16], (byte) -92, var3, arg2);
        if (arg1.field1636 != null) {
            class270.method1950(var4, arg1.field1649, arg1.field1636, (byte) 28, var3, arg2);
        }
        class158 var5 = (class158) class191.field3456.method1676((long) arg1.field1649, (byte) -115);
        if (var5 != null) {
            class289.method2064(var5.field2845, arg2, (byte) -96, var3, var4);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lik;ILik;II)Lf;", line = 230)
    public static final class250 method1021(class262 arg0, int arg1, class262 arg2, int arg3, int arg4) {
        if (arg4 != 522598380) {
            method1018(-18, -107, -84, -23, 37, (class290) null, -9, 106L, false);
        }
        field2632++;
        return class167.method1166(arg2, arg1, (byte) -120, arg3) ? class271.method1954(arg4 ^ 0x1F2637EC, arg0.method1868(12236, arg1, arg3)) : null;
    }
}
