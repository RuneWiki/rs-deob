import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class418 extends class30 {

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    private int field5898 = -1;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "[I")
    public static int[] field5904 = new int[8];

    @OriginalMember(owner = "client!td", name = "L", descriptor = "[I")
    public static int[] field5908 = new int[3];

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Llh;")
    public static class487 field5899 = new class487(23, 7);

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Llh;")
    public static class487 field5909 = new class487(25, -1);

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5910 = new BigInteger("a5b4a2fe12d1de650c3f5c5f2227ac9add847b112b975471687db1b06fe76c1833090445cdd1416f164cf89754f71beea0afbb7c2f10196902921e7c16b82f73", 16);

    @OriginalMember(owner = "client!td", name = "O", descriptor = "Lem;")
    public static class206 field5911 = new class206(24, 0);

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public int field5905;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public int field5906;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "[I")
    public int[] field5900;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 3)
    public class418() {
        super(0, false);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)[[I", line = 6)
    public int[][] method30(int arg0, byte arg1) {
        ++field5896;
        int[][] var3 = super.field377.method3683(arg0, (byte) -85);
        if (arg1 != 7) {
            method2430((byte) 70);
        }
        if (super.field377.field9085 && this.method2428(32167)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field5905 * (~class148.field2197 != ~this.field5906 ? this.field5906 * arg0 / class148.field2197 : arg0);
            if (class31.field399 == this.field5905) {
                for (int var8 = 0; ~class31.field399 < ~var8; ++var8) {
                    int var9 = this.field5900[var7++];
                    var6[var8] = class136.method950(var9, 255) << 4;
                    var5[var8] = class136.method950(4080, var9 >> 4);
                    var4[var8] = class136.method950(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class31.field399 > var10; ++var10) {
                    int var11 = this.field5905 * var10 / class31.field399;
                    int var12 = this.field5900[var7 + var11];
                    var6[var10] = class136.method950(255, var12) << 4;
                    var5[var10] = class136.method950(var12 >> 4, 4080);
                    var4[var10] = class136.method950(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)Z", line = 75)
    public final boolean method2428(int arg0) {
        ++field5907;
        if (arg0 != 32167) {
            return true;
        } else if (this.field5900 != null) {
            return true;
        } else if (this.field5898 >= 0) {
            class168 var2 = ~class220.field3080 <= -1 ? class168.method1193(class463.field6382, class220.field3080, this.field5898) : class168.method1188(class463.field6382, this.field5898);
            var2.method1184();
            this.field5900 = var2.method1182();
            this.field5905 = var2.field2445;
            this.field5906 = var2.field2449;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 104)
    public static final void method2429(byte arg0) {
        if (arg0 != 2) {
            method2429((byte) -62);
        }
        ++field5901;
        class118.field1592.method1444(-27547);
        class412.field5847 = 0;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V", line = 121)
    public static void method2430(byte arg0) {
        field5904 = null;
        field5908 = null;
        field5911 = null;
        field5910 = null;
        if (arg0 == 14) {
            field5899 = null;
            field5909 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BILac;)V", line = 137)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field5902;
        if (arg0 < 100) {
            this.method290(-47);
        }
        if (~arg1 == -1) {
            this.field5898 = arg2.method2845(-1);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 150)
    public final void method290(int arg0) {
        super.method290(28);
        ++field5897;
        this.field5900 = null;
        if (arg0 < 19) {
            method2430((byte) 38);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I", line = 170)
    public final int method288(byte arg0) {
        ++field5903;
        return arg0 > -82 ? 87 : this.field5898;
    }
}
