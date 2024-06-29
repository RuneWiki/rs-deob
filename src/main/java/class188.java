import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class188 extends class107 {

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    private int field3278 = -1;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "Lpj;")
    public static class237 field3285 = class33.method353("welle2:", 30);

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "[Lpj;")
    public static class237[] field3287 = new class237[1000];

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    private int field3275;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "Z")
    public static boolean field3277;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "[I")
    private int[] field3284;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field3278 = arg0.method339(-16777216);
        }
        ++field3280;
        if (arg2 != -32513) {
            field3277 = false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int[][] var3 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551 && this.method1277(true)) {
            int[] var4 = var3[0];
            int var5 = this.field3275 * (class193.field3342 == this.field3274 ? arg1 : this.field3274 * arg1 / class193.field3342);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (~class106.field1862 != ~this.field3275) {
                for (int var8 = 0; ~class106.field1862 < ~var8; ++var8) {
                    int var9 = this.field3275 * var8 / class106.field1862;
                    int var10 = this.field3284[var5 + var9];
                    var6[var8] = class272.method1817(4080, var10 << 4);
                    var7[var8] = class272.method1817(var10 >> 4, 4080);
                    var4[var8] = class272.method1817(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class106.field1862 > var11; ++var11) {
                    int var12 = this.field3284[var5++];
                    var6[var11] = class272.method1817(var12 << 4, 4080);
                    var7[var11] = class272.method1817(var12, 65280) >> 4;
                    var4[var11] = class272.method1817(16711680, var12) >> 12;
                }
            }
        }
        int var13 = 70 / ((26 - arg0) / 45);
        ++field3273;
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)Z")
    private final boolean method1277(boolean arg0) {
        ++field3279;
        if (this.field3284 != null) {
            return true;
        } else {
            if (!arg0) {
                field3277 = false;
            }
            if (~this.field3278 <= -1) {
                int var2 = class106.field1862;
                int var3 = class193.field3342;
                int var4 = class71.field1401.method86((byte) -124, this.field3278) ? 64 : 128;
                this.field3284 = class71.field1401.method84(this.field3278, (byte) 77);
                this.field3274 = var4;
                this.field3275 = var4;
                class55.method486((byte) -44, var2, var3);
                return this.field3284 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public final void method793(byte arg0) {
        if (arg0 > -21) {
            this.method240((byte) 51, -8);
        }
        super.method793((byte) -28);
        ++field3283;
        this.field3284 = null;
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)I")
    public final int method800(int arg0) {
        ++field3276;
        if (arg0 != 6249) {
            this.field3274 = 108;
        }
        return this.field3278;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class188() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method1278(int arg0, int arg1) {
        if (arg0 < 52) {
            method1279(true);
        }
        ++field3286;
        class199.field3448.method939(arg1, 1);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)V")
    public static void method1279(boolean arg0) {
        if (!arg0) {
            field3285 = null;
        }
        field3285 = null;
        field3287 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BI)Lug;")
    public static final class194 method1280(byte[] arg0, int arg1) {
        ++field3281;
        if (arg0 == null) {
            return null;
        } else {
            if (arg1 != -1326723476) {
                method1279(false);
            }
            class136 var2 = new class136(arg0, class252.field4341, class226.field3868, class174.field3060, class175.field3063, class127.field2221);
            class190.method1291((byte) 103);
            return var2;
        }
    }
}
