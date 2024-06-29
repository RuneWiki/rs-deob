import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class196 extends class37 {

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    private int field3903 = -1;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field3898 = 0;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field3897 = 127;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "[I")
    public static int[] field3904 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "[Lnf;")
    public static class131[] field3908 = new class131[100];

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "Ldd;")
    private static class35 field3899 = class180.method1196((byte) -48, "scroll:");

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "Ldd;")
    public static class35 field3902 = field3899;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "Ldd;")
    public static class35 field3901 = field3899;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "[I")
    public int[] field3900;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V")
    public static void method1283(byte arg0) {
        field3904 = null;
        field3902 = null;
        field3908 = null;
        field3901 = null;
        if (arg0 <= 62) {
            method1283((byte) 43);
        }
        field3899 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            this.field3903 = arg2.method256((byte) -78);
        }
        ++field3906;
        if (arg1 != 1) {
            field3898 = -8;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[[I")
    public int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field832.method653(-30711, arg0);
        ++field3907;
        if (arg1 <= 5) {
            field3898 = 78;
        }
        if (super.field832.field1978 && this.method1284(-13)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field3894 * (class35.field782 != this.field3896 ? this.field3896 * arg0 / class35.field782 : arg0);
            if (class72.field1719 == this.field3894) {
                for (int var8 = 0; class72.field1719 > var8; ++var8) {
                    int var9 = this.field3900[var7++];
                    var6[var8] = class208.method1372(4080, var9 << 4);
                    var5[var8] = class208.method1372(4080, var9 >> 4);
                    var4[var8] = class208.method1372(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class72.field1719 > var10; ++var10) {
                    int var11 = this.field3894 * var10 / class72.field1719;
                    int var12 = this.field3900[var7 + var11];
                    var6[var10] = class208.method1372(255, var12) << 4;
                    var5[var10] = class208.method1372(var12, 65280) >> 4;
                    var4[var10] = class208.method1372(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)I")
    public final int method367(byte arg0) {
        int var2 = -21 % ((4 - arg0) / 49);
        ++field3905;
        return this.field3903;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)Z")
    public final boolean method1284(int arg0) {
        ++field3895;
        int var2 = 80 / ((arg0 - 56) / 46);
        if (this.field3900 != null) {
            return true;
        } else if (~this.field3903 <= -1) {
            class12 var3 = class204.method1352(-9250, class135.field2909, this.field3903);
            var3.method111();
            this.field3896 = var3.field221;
            this.field3894 = var3.field223;
            this.field3900 = var3.field222;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class196() {
        super(0, false);
    }
}
