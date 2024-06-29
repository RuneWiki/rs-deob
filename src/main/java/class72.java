import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class72 extends class142 {

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    private int field1231 = 3216;

    @OriginalMember(owner = "client!hg", name = "db", descriptor = "[I")
    private int[] field1242 = new int[3];

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    private int field1236 = 4096;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    private int field1235 = 3216;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Lai;")
    public static class10 field1229 = class44.method278(": ", -96);

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "Lai;")
    private static class10 field1230 = class44.method278(" is already on your friend list)3", 98);

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "Lai;")
    public static class10 field1238 = class44.method278("Willkommen auf RuneScape", -67);

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "Lai;")
    public static class10 field1232 = field1230;

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "Lai;")
    public static class10 field1240 = class44.method278(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -29);

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "Lai;")
    private static class10 field1234 = class44.method278("Loaded sprites", 104);

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "Lai;")
    public static class10 field1239 = field1234;

    @OriginalMember(owner = "client!hg", name = "fb", descriptor = "Lai;")
    public static class10 field1244 = class44.method278("(U3", 116);

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!hg", name = "eb", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
    public static void method454(byte arg0) {
        field1230 = null;
        field1244 = null;
        field1234 = null;
        field1239 = null;
        field1232 = null;
        field1240 = null;
        field1229 = null;
        int var1 = 44 % ((arg0 - -64) / 61);
        field1238 = null;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        ++field1233;
        this.method455(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class72() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 >= -34) {
            this.method6(true, 109);
        }
        ++field1243;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1235 = arg0.method762((byte) 104);
                }
            } else {
                this.field1231 = arg0.method762((byte) 93);
            }
        } else {
            this.field1236 = arg0.method762((byte) 119);
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
    private final void method455(int arg0) {
        ++field1237;
        double var2 = Math.cos((double) (this.field1235 / 4096));
        this.field1242[0] = (int) (4096.0D * var2 * Math.sin((double) (this.field1231 / 4096)));
        this.field1242[1] = (int) (Math.cos((double) (this.field1231 / 4096)) * var2 * 4096.0D);
        this.field1242[2] = (int) (4096.0D * Math.sin((double) (this.field1235 / 4096)));
        int var4 = this.field1242[1] * this.field1242[1] >> 12;
        int var5 = this.field1242[2] * this.field1242[2] >> 12;
        int var6 = this.field1242[arg0] * this.field1242[0] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 - -var5 >> 12)));
        if (var7 != 0) {
            this.field1242[1] = (this.field1242[1] << 12) / var7;
            this.field1242[2] = (this.field1242[2] << 12) / var7;
            this.field1242[0] = (this.field1242[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            this.field1236 = -13;
        }
        ++field1241;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, class205.field3986 & arg1 + -1);
            int[] var5 = this.method963((byte) -121, 0, arg1);
            int[] var6 = this.method963((byte) -121, 0, class205.field3986 & arg1 + 1);
            for (int var7 = 0; class133.field2499 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1236;
                int var9 = (var5[class56.field997 & var7 + 1] - var5[var7 + -1 & class56.field997]) * this.field1236;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var12 + var13 + 4096) / 4096)));
                int var15;
                int var16;
                int var17;
                if (var14 == 0) {
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                } else {
                    var15 = 16777216 / var14;
                    var17 = var8 / var14;
                    var16 = var9 / var14;
                }
                int var18 = this.field1242[1] * var17 >> 12;
                int var19 = this.field1242[0] * var16 >> 12;
                int var20 = this.field1242[2] * var15 >> 12;
                var3[var7] = var18 + var19 + var20;
            }
        }
        return var3;
    }
}
