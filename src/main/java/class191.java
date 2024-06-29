import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class191 extends class34 {

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    private int field2893 = 3216;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "[I")
    private int[] field2896 = new int[3];

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    private int field2900 = 4096;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    private int field2897 = 3216;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2894 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "[I")
    public static int[] field2899;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILpk;)V")
    public static final void method1274(int arg0, class237 arg1) {
        class136.field1983 = arg1.method1621("titlebg", arg0);
        class171.field2511 = arg1.method1621("logo", arg0);
        ++field2891;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V")
    public static void method1275(byte arg0) {
        field2899 = null;
        if (arg0 != -102) {
            method1277(107);
        }
        field2894 = null;
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)[Lwh;")
    public static final class289[] method1276(int arg0) {
        if (arg0 != 31608) {
            method1274(-117, (class237) null);
        }
        ++field2890;
        class289[] var1 = new class289[class246.field3823];
        for (int var2 = 0; class246.field3823 > var2; ++var2) {
            int var3 = class27.field525[var2] * class173.field2530[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class209.field3125[var2];
            for (int var6 = 0; var3 > var6; ++var6) {
                var4[var6] = class15.field221[class131.method904(255, var5[var6])];
            }
            var1[var2] = new class289(client.field729, class126.field1857, class135.field1973[var2], class5.field69[var2], class27.field525[var2], class173.field2530[var2], var4);
        }
        class293.method1936(arg0 + -31659);
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field2895;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int var4 = class23.field379 * this.field2900 >> 12;
            int[] var5 = this.method230(class201.field3014 & arg1 + -1, -15337, 0);
            int[] var6 = this.method230(arg1, -15337, 0);
            int[] var7 = this.method230(arg1 + 1 & class201.field3014, -15337, 0);
            for (int var8 = 0; ~class226.field3527 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class167.field2457] + -var6[var8 - -1 & class167.field2457]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class181.field2639[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field2896[1] * var16 >> 12;
                int var18 = this.field2896[0] * var14 >> 12;
                int var19 = this.field2896[2] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        if (arg0 < 75) {
            this.method1279(90);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)Z")
    public static final boolean method1277(int arg0) {
        if (arg0 > -55) {
            method1274(-36, (class237) null);
        }
        ++field2889;
        try {
            return class54.method416((byte) -69);
        } catch (IOException var4) {
            class210.method1383(7928);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class199.field3000 + "," + class283.field4330 + "," + class163.field2377 + " - " + class45.field784 + "," + (class185.field2687.field449[0] + class90.field1367) + "," + (class188.field2774 - -class185.field2687.field493[0]) + " - ";
            for (int var3 = 0; class45.field784 > var3 && var3 < 50; ++var3) {
                var2 = var2 + class173.field2543.field848[var3] + ",";
            }
            class121.method860((byte) 52, var2, var5);
            class208.method1372(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field2888;
        if (arg0 == 6) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field2893 = arg2.method423(-103);
                    }
                } else {
                    this.field2897 = arg2.method423(96);
                }
            } else {
                this.field2900 = arg2.method423(-117);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        int var2 = 11 / ((arg0 - -2) / 43);
        ++field2901;
        this.method1279(106);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JZ)V")
    public static final void method1278(long arg0, boolean arg1) {
        ++field2892;
        if (~arg0 != -1L) {
            int var3 = 0;
            if (arg1) {
                method1276(82);
            }
            while (class3.field36 > var3) {
                if (class131.field1926[var3] == arg0) {
                    --class3.field36;
                    for (int var4 = var3; ~class3.field36 < ~var4; ++var4) {
                        class22.field368[var4] = class22.field368[var4 + 1];
                        class117.field1762[var4] = class117.field1762[var4 + 1];
                        class209.field3130[var4] = class209.field3130[var4 + 1];
                        class131.field1926[var4] = class131.field1926[var4 + 1];
                        class140.field2028[var4] = class140.field2028[var4 - -1];
                        class180.field2622[var4] = class180.field2622[var4 + 1];
                    }
                    ++class153.field2249;
                    class226.field3533 = class169.field2494;
                    class59.field964.method1540(129, (byte) -2);
                    class59.field964.method440(arg0, -99);
                    return;
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
    private final void method1279(int arg0) {
        double var2 = Math.cos((double) ((float) this.field2893 / 4096.0F));
        this.field2896[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2897 / 4096.0F)));
        this.field2896[1] = (int) (var2 * Math.cos((double) ((float) this.field2897 / 4096.0F)) * 4096.0D);
        this.field2896[2] = (int) (Math.sin((double) ((float) this.field2893 / 4096.0F)) * 4096.0D);
        int var4 = this.field2896[0] * this.field2896[0] >> 12;
        int var5 = this.field2896[2] * this.field2896[2] >> 12;
        ++field2898;
        int var6 = this.field2896[1] * this.field2896[1] >> 12;
        if (arg0 < 59) {
            field2894 = null;
        }
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field2896[2] = (this.field2896[2] << 12) / var7;
            this.field2896[1] = (this.field2896[1] << 12) / var7;
            this.field2896[0] = (this.field2896[0] << 12) / var7;
        }
    }
}
