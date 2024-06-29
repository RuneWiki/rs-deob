import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class254 extends class87 {

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    private int field3831 = 4096;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3832 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "[I")
    public static int[] field3838;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "[Lwh;")
    public static class57[] field3829;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(III)I")
    public static final int method1747(int arg0, int arg1, int arg2) {
        ++field3836;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = arg2 & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return (var5 & 133806074) >> 19;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lii;I[BIIZ)V")
    public static final void method1748(class228[] arg0, int arg1, byte[] arg2, int arg3, int arg4, boolean arg5) {
        ++field3834;
        class53 var6 = new class53(arg2);
        int var7 = arg3;
        while (true) {
            int var8 = var6.method334(2053946859);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method368(-129);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = 63 & var9;
                int var12 = var9 >> 6 & 63;
                int var13 = var6.method366(-16505);
                int var14 = var9 >> 12;
                int var15 = var13 >> 2;
                int var16 = var13 & 3;
                int var17 = arg1 + var12;
                int var18 = arg4 + var11;
                if (var17 > 0 && var18 > 0 && ~var17 > -104 && ~var18 > -104) {
                    class228 var19 = null;
                    if (!arg5) {
                        int var20 = var14;
                        if ((class253.field3806[1][var17][var18] & 2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class221.method1540(var15, arg5, var14, var19, !arg5, var17, var14, var7, var18, arg3 ^ -5024, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3831 = arg0.method331(arg2 ^ -25726);
        }
        ++field3837;
        if (arg2 != 25645) {
            method1749((byte) -110);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field3839;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (arg1) {
            method1747(54, -23, -122);
        }
        if (super.field1378.field733) {
            int[] var4 = this.method642(0, arg0 - 1 & class32.field406, true);
            int[] var5 = this.method642(0, arg0, true);
            int[] var6 = this.method642(0, class32.field406 & arg0 + 1, !arg1);
            for (int var7 = 0; ~class206.field3032 < ~var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field3831;
                int var9 = (var5[class181.field2722 & var7 + 1] + -var5[var7 + -1 & class181.field2722]) * this.field3831;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var11 - -var13 + 4096) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class254() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public static void method1749(byte arg0) {
        field3832 = null;
        field3829 = null;
        field3838 = null;
        if (arg0 != -107) {
            method1747(-122, -105, 19);
        }
    }
}
