import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class186 extends class37 {

    @OriginalMember(owner = "client!ed", name = "Cb", descriptor = "[S")
    public static short[] field2795 = new short[] { 35, 51, 36, 3, 4, 48, 31, 40 };

    @OriginalMember(owner = "client!ed", name = "Gb", descriptor = "Z")
    public static boolean field2799 = false;

    @OriginalMember(owner = "client!ed", name = "Nb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2806 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ed", name = "Db", descriptor = "I")
    private int field2796;

    @OriginalMember(owner = "client!ed", name = "Eb", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ed", name = "Fb", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ed", name = "Ib", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ed", name = "Jb", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ed", name = "Kb", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ed", name = "Lb", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ed", name = "Mb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ed", name = "Ob", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ed", name = "Pb", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ed", name = "Rb", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ed", name = "Sb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ed", name = "Hb", descriptor = "Lgi;")
    private class157 field2800;

    @OriginalMember(owner = "client!ed", name = "Qb", descriptor = "[Z")
    public static boolean[] field2809;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I[BII)V")
    public final void method1245(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 0;
        if (arg0 < 105) {
            this.method1251(68, (byte) -10);
        }
        while (arg2 > var5) {
            arg1[arg3 + var5] = (byte) (super.field583[super.field588++] + -this.field2800.method1066(0));
            ++var5;
        }
        ++field2802;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIIII)V")
    public static final void method1246(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2797;
        class263.method1788(arg5 - arg3, -18732, arg4, class156.field2379[arg2], arg3 + arg5);
        int var6 = 0;
        int var7 = arg0;
        if (arg1) {
            int var8 = arg3 * arg3;
            int var9 = arg0 * arg0;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg0 << 1;
            int var13 = -((var12 + -1) * var11) + var9;
            int var14 = var8 << 2;
            int var15 = (-var12 + 1) * var8 + var10;
            int var16 = ((var6 << 1) + 3) * var10;
            int var17 = ((arg0 << 1) + -3) * var11;
            int var18 = var9 << 2;
            int var19 = (var6 + 1) * var18;
            int var20 = (arg0 + -1) * var14;
            while (var7 > 0) {
                --var7;
                if (var15 < 0) {
                    while (var15 < 0) {
                        ++var6;
                        var13 += var19;
                        var15 += var16;
                        var16 += var18;
                        var19 += var18;
                    }
                }
                if (~var13 > -1) {
                    ++var6;
                    var15 += var16;
                    var16 += var18;
                    var13 += var19;
                    var19 += var18;
                }
                var13 += -var17;
                var17 -= var14;
                int var21 = -var7 + arg2;
                int var22 = arg2 + var7;
                var15 += -var20;
                int var23 = arg5 + var6;
                int var24 = arg5 - var6;
                class263.method1788(var24, -18732, arg4, class156.field2379[var21], var23);
                var20 -= var14;
                class263.method1788(var24, -18732, arg4, class156.field2379[var22], var23);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(Z)V")
    public static void method1247(boolean arg0) {
        field2809 = null;
        field2806 = null;
        if (arg0) {
            field2795 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "(I)I")
    public final int method1248(int arg0) {
        ++field2804;
        return arg0 > -30 ? 60 : super.field583[super.field588++] + -this.field2800.method1066(0) & 255;
    }

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "(II)I")
    public final int method1249(int arg0, int arg1) {
        int var3 = -84 % ((arg0 - -46) / 48);
        ++field2803;
        return arg1 * 8 + -this.field2796;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLna;)V")
    public static final void method1250(boolean arg0, class32 arg1) {
        ++field2793;
        class144 var2 = (class144) class203.field3164.method1010(110);
        if (arg0) {
            while (var2 != null) {
                if (var2.field2249 == arg1) {
                    if (var2.field2233 != null) {
                        class39.field661.method718(var2.field2233);
                        var2.field2233 = null;
                    }
                    var2.method693(107);
                    return;
                }
                var2 = (class144) class203.field3164.method1008((byte) 88);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V")
    public final void method1251(int arg0, byte arg1) {
        super.field583[super.field588++] = (byte) (arg0 + this.field2800.method1066(0));
        if (arg1 < -13) {
            ++field2807;
        }
    }

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "(B)V")
    public final void method1252(byte arg0) {
        ++field2798;
        int var2 = 47 % ((arg0 - -50) / 52);
        super.field588 = (this.field2796 + 7) / 8;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(BI)I")
    public final int method1253(byte arg0, int arg1) {
        ++field2811;
        int var3 = this.field2796 >> 3;
        int var4 = -(7 & this.field2796) + 8;
        if (arg0 >= -77) {
            return 72;
        } else {
            this.field2796 += arg1;
            int var5 = 0;
            while (~var4 > ~arg1) {
                var5 += (super.field583[var3++] & class212.field3290[var4]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg1 != ~var4) {
                var6 = (super.field583[var3] >> -arg1 + var4 & class212.field3290[arg1]) + var5;
            } else {
                var6 = (super.field583[var3] & class212.field3290[var4]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "(I)Lcg;")
    public static final class168 method1254(int arg0) {
        class168 var1 = new class168(class205.field3187, class174.field2581, class184.field2764[0], class239.field3698[arg0], class270.field4281[0], class107.field1717[0], class289.field4554[0], class35.field560);
        ++field2805;
        class239.method1619(65306);
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLag;)Lag;")
    public static final class188 method1255(byte arg0, class188 arg1) {
        if (arg0 <= 106) {
            return null;
        } else {
            ++field2808;
            class188 var2 = client.method1052(arg1);
            if (var2 == null) {
                var2 = arg1.field2911;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "(I)V")
    public final void method1256(int arg0) {
        ++field2801;
        this.field2796 = super.field588 * arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[I)V")
    public final void method1257(int arg0, int[] arg1) {
        int var3 = -60 / ((arg0 - -29) / 33);
        ++field2810;
        this.field2800 = new class157(arg1);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I)V")
    public class186(int arg0) {
        super(arg0);
    }
}
