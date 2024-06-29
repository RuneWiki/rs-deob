import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class237 extends class76 {

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    private int field4053 = 4096;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
    private int field4056 = 4096;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
    private int field4057 = 4096;

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "Z")
    public static boolean field4052 = true;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "[[B")
    public static byte[][] field4051 = new byte[250][];

    @OriginalMember(owner = "client!fg", name = "fb", descriptor = "Ljava/util/Random;")
    public static Random field4058 = new Random();

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!fg", name = "gb", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!fg", name = "hb", descriptor = "[Llc;")
    public static class90[] field4060;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field4054;
        if (arg1 <= 2) {
            this.method157(-90, (byte) -64);
        }
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[][] var4 = this.method565((byte) -20, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class96.field1807; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field4053 * var12 >> 12;
                    var10[var11] = this.field4056 * var13 >> 12;
                    var9[var11] = this.field4057 * var14 >> 12;
                } else {
                    var8[var11] = this.field4053;
                    var10[var11] = this.field4056;
                    var9[var11] = this.field4057;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "(I)V")
    public static void method1551(int arg0) {
        field4051 = null;
        if (arg0 != -290020116) {
            method1551(16);
        }
        field4060 = null;
        field4058 = null;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class237() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg1 >= -86) {
            this.method158((class152) null, (byte) -35, -106);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field4057 = arg0.method1063(-17162);
                }
            } else {
                this.field4056 = arg0.method1063(-17162);
            }
        } else {
            this.field4053 = arg0.method1063(-17162);
        }
        ++field4055;
    }
}
