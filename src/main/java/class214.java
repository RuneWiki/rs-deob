import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class214 extends class272 {

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    private int field3903 = 0;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    private int field3907 = 0;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    private int field3915 = 1365;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    private int field3909 = 20;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "Ljava/util/Random;")
    public static Random field3901 = new Random();

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "[Lli;")
    public static class185[] field3911 = new class185[5];

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "Lli;")
    public static class185 field3913 = class245.method1649(")4a=", 124);

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field3910 = 0;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "Lli;")
    public static class185 field3912 = class245.method1649("::pcachesize", -30);

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lhi;BLhi;)V")
    public static final void method1493(class250 arg0, byte arg1, class250 arg2) {
        if (arg1 == 85) {
            class199.field3650 = arg0;
            ++field3904;
            class42.field648 = arg2;
            class104.field1889 = class42.field648.method1693(3, 0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BIII)I")
    public static final int method1494(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = -1;
        ++field3902;
        if (arg3 != 1) {
            field3911 = null;
        }
        for (int var5 = arg1; var5 < arg2; ++var5) {
            var4 = var4 >>> 8 ^ class215.field3946[(arg0[var5] ^ var4) & 255];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public static void method1495(int arg0) {
        field3912 = null;
        field3901 = null;
        if (arg0 != 0) {
            method1493((class250) null, (byte) 0, (class250) null);
        }
        field3911 = null;
        field3913 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class214() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field3903 = arg0.method827(255);
                    }
                } else {
                    this.field3907 = arg0.method827(255);
                }
            } else {
                this.field3909 = arg0.method827(255);
            }
        } else {
            this.field3915 = arg0.method827(255);
        }
        int var5 = -2 / ((arg1 - -21) / 55);
        ++field3914;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3905;
        int[] var3 = super.field4819.method1632(arg1 ^ arg1, arg0);
        if (super.field4819.field4294) {
            for (int var4 = 0; ~var4 > ~class246.field4385; ++var4) {
                int var5 = (class38.field598[var4] << 12) / this.field3915 + this.field3907;
                int var6 = (class232.field4177[arg0] << 12) / this.field3915 + this.field3903;
                int var7 = var5;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = 0;
                for (int var13 = var5 * var5 >> 12; ~(var11 + var13) > -16385 && this.field3909 > var12; var13 = var8 * var8 >> 12) {
                    var9 = (var8 * var9 >> 12) * 2 - -var10;
                    var8 = -var11 + var13 + var7;
                    var11 = var9 * var9 >> 12;
                    ++var12;
                }
                var3[var4] = ~(this.field3909 + -1) < ~var12 ? (var12 << 12) / this.field3909 : 0;
            }
        }
        return var3;
    }
}
