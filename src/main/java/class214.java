import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class214 extends class68 {

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    private int field3225 = -1;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field3228 = "green:";

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!qk", name = "db", descriptor = "Lbi;")
    public static class94 field3229;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "[I")
    public int[] field3220;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
    public static void method1395(int arg0) {
        field3228 = null;
        if (arg0 != 0) {
            field3229 = null;
        }
        field3229 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
    public static final void method1396(int arg0, int arg1) {
        class280 var2 = class181.method1180(arg0, 0, 3);
        var2.method1871((byte) 26);
        ++field3221;
        if (arg1 <= 90) {
            method1396(21, -11);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[[I")
    public int[][] method91(int arg0, byte arg1) {
        int var3 = 78 / ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        ++field3216;
        if (super.field920.field374 && this.method1397((byte) 57)) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int var8 = (class62.field861 == this.field3222 ? arg0 : this.field3222 * arg0 / class62.field861) * this.field3215;
            if (class89.field1248 == this.field3215) {
                for (int var9 = 0; ~var9 > ~class89.field1248; ++var9) {
                    int var10 = this.field3220[var8++];
                    var6[var9] = class235.method1572(255, var10) << 4;
                    var7[var9] = class235.method1572(var10, 65280) >> 4;
                    var5[var9] = class235.method1572(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class89.field1248 > var11; ++var11) {
                    int var12 = this.field3215 * var11 / class89.field1248;
                    int var13 = this.field3220[var8 + var12];
                    var6[var11] = class235.method1572(var13, 255) << 4;
                    var7[var11] = class235.method1572(65280, var13) >> 4;
                    var5[var11] = class235.method1572(var13 >> 12, 4080);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class214() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(B)Z")
    public final boolean method1397(byte arg0) {
        ++field3213;
        if (this.field3220 != null) {
            return true;
        } else {
            if (arg0 != 57) {
                field3228 = null;
            }
            if (this.field3225 >= 0) {
                class128 var2 = ~class6.field54 <= -1 ? class2.method7(class6.field54, class43.field650, this.field3225, 9104) : class287.method1933(this.field3225, -7, class43.field650);
                var2.method878();
                this.field3215 = var2.field1539;
                this.field3220 = var2.field1820;
                this.field3222 = var2.field1538;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)V")
    public final void method159(byte arg0) {
        super.method159(arg0);
        this.field3220 = null;
        ++field3224;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)I")
    public final int method425(byte arg0) {
        ++field3227;
        if (arg0 != 28) {
            this.method159((byte) -102);
        }
        return this.field3225;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field3217;
            if (arg1 == 0) {
                this.field3225 = arg0.method1445(false);
            }
        }
    }
}
