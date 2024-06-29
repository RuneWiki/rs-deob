import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class209 extends class205 {

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    private int field3881 = 0;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    private int field3880 = 1365;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    private int field3879 = 20;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    private int field3890 = 0;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
    public static int field3883 = 0;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "[[B")
    public static byte[][] field3877 = new byte[50][];

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "Z")
    public static boolean field3886 = false;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field3885 = 0;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "[I")
    public static int[] field3891 = new int[500];

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "Lme;")
    public static class133 field3884;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field3892;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field3890 = arg0.method675(2);
                    }
                } else {
                    this.field3881 = arg0.method675(2);
                }
            } else {
                this.field3879 = arg0.method675(2);
            }
        } else {
            this.field3880 = arg0.method675(2);
        }
        int var5 = -105 % ((-47 - arg1) / 34);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static void method1337(boolean arg0) {
        field3884 = null;
        if (arg0) {
            field3891 = null;
            field3877 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            field3884 = null;
        }
        int[] var3 = super.field3810.method557(arg0 + 6978, arg1);
        ++field3889;
        if (super.field3810.field1635) {
            for (int var4 = 0; class118.field2245 > var4; ++var4) {
                int var5 = (class230.field4319[var4] << 12) / this.field3880 + this.field3881;
                int var6 = (class218.field4051[arg1] << 12) / this.field3880 + this.field3890;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = 0;
                int var12 = var6;
                int var13 = var6 * var6 >> 12;
                while (~(var10 + var13) > -16385 && var11 < this.field3879) {
                    var12 = (var9 * var12 >> 12) * 2 - -var8;
                    var9 = var10 - -var7 + -var13;
                    var13 = var12 * var12 >> 12;
                    ++var11;
                    var10 = var9 * var9 >> 12;
                }
                var3[var4] = var11 < this.field3879 - 1 ? (var11 << 12) / this.field3879 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class209() {
        super(0, true);
    }
}
