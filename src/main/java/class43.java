import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class43 extends class7 {

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    private int field838 = -1;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "Lob;")
    public static class141 field836 = class175.method1195(40, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "Log;")
    public static class146 field830 = new class146(new byte[5000]);

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "[I")
    private int[] field840;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        ++field839;
        int[][] var3 = super.field97.method1396(arg0, (byte) 45);
        int var4 = 72 / ((arg1 - -42) / 41);
        if (super.field97.field4093 && this.method277(-97)) {
            int var5 = this.field837 * (~class60.field1174 == ~this.field833 ? arg0 : this.field833 * arg0 / class60.field1174);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            if (~class117.field2272 != ~this.field837) {
                for (int var9 = 0; ~class117.field2272 < ~var9; ++var9) {
                    int var10 = this.field837 * var9 / class117.field2272;
                    int var11 = this.field840[var5 - -var10];
                    var7[var9] = class15.method94(var11 << 4, 4080);
                    var8[var9] = class15.method94(65280, var11) >> 4;
                    var6[var9] = class15.method94(4080, var11 >> 12);
                }
            } else {
                for (int var12 = 0; var12 < class117.field2272; ++var12) {
                    int var13 = this.field840[var5++];
                    var7[var12] = class15.method94(255, var13) << 4;
                    var8[var12] = class15.method94(var13, 65280) >> 4;
                    var6[var12] = class15.method94(4080, var13 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field832;
        if (arg0 == 0) {
            this.field838 = arg2.method1007(46);
        }
        int var4 = 40 / ((66 - arg1) / 57);
    }

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)Z")
    private final boolean method277(int arg0) {
        int var2 = 24 % ((arg0 - -10) / 55);
        ++field831;
        if (this.field840 != null) {
            return true;
        } else if (~this.field838 <= -1) {
            int var3 = class117.field2272;
            int var4 = class60.field1174;
            int var5 = !class41.field811.method956(this.field838, 18872) ? 128 : 64;
            this.field840 = class41.field811.method960(this.field838, (byte) -115);
            this.field833 = var5;
            this.field837 = var5;
            class45.method301(var3, var4, -99);
            return this.field840 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
    public static void method278(boolean arg0) {
        if (!arg0) {
            method278(false);
        }
        field830 = null;
        field836 = null;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)I")
    public final int method44(int arg0) {
        ++field834;
        return arg0 < 50 ? 37 : this.field838;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)[Lkc;")
    public static final class102[] method279(boolean arg0) {
        if (arg0) {
            method279(true);
        }
        class102[] var1 = new class102[class197.field3766];
        ++field835;
        for (int var2 = 0; var2 < class197.field3766; ++var2) {
            class102 var3 = new class102();
            var3.field1987 = class103.field1989;
            var3.field1982 = class196.field3743;
            var3.field1984 = class30.field581[var2];
            var3.field1986 = class30.field578[var2];
            var3.field1985 = class201.field3801[var2];
            var3.field1981 = class114.field2186[var2];
            int var4 = var3.field1985 * var3.field1981;
            byte[] var5 = class224.field4225[var2];
            var3.field1983 = new int[var4];
            for (int var6 = 0; var4 > var6; ++var6) {
                var3.field1983[var6] = class16.field291[class15.method94(var5[var6], 255)];
            }
            var1[var2] = var3;
        }
        class88.method601(-54);
        return var1;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class43() {
        super(0, false);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public final void method50(boolean arg0) {
        super.method50(arg0);
        ++field829;
        this.field840 = null;
    }
}
