import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class128 extends class321 {

    @OriginalMember(owner = "client!ofa", name = "A", descriptor = "I")
    private int field1852;

    @OriginalMember(owner = "client!ofa", name = "t", descriptor = "Z")
    public static volatile boolean field1845 = false;

    @OriginalMember(owner = "client!ofa", name = "v", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ofa", name = "w", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ofa", name = "x", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ofa", name = "B", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "Lcv;")
    public static class22 field1846;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "[Leq;")
    public class333[] field1851;

    @OriginalMember(owner = "client!ofa", name = "y", descriptor = "[[B")
    private byte[][] field1850;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)Z", line = 9)
    public final boolean method913(int arg0, int arg1) {
        field1853++;
        if (arg0 <= 73) {
            method915(-39);
        }
        return this.field1851[arg1].field4843;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BI)Z", line = 25)
    public final boolean method914(byte arg0, int arg1) {
        if (arg0 >= -124) {
            this.field1852 = 77;
        }
        field1847++;
        return this.field1851[arg1].field4839;
    }

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "(I)V", line = 36)
    public static void method915(int arg0) {
        field1846 = null;
        if (arg0 != -8921) {
            method915(-114);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IB)Z", line = 48)
    public final boolean method916(int arg0, byte arg1) {
        field1848++;
        if (arg1 != -103) {
            method915(-66);
        }
        return this.field1851[arg0].field4847;
    }

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "(I)Z", line = 59)
    public final boolean method917(int arg0) {
        field1849++;
        if (this.field1851 != null) {
            return true;
        }
        if (this.field1850 == null) {
            class295 var2 = class571.field8301;
            synchronized (class571.field8301) {
                if (!class571.field8301.method1848(arg0, this.field1852)) {
                    return false;
                }
                int[] var4 = class571.field8301.method1846(this.field1852, -15120);
                this.field1850 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field1850[var5] = class571.field8301.method1844(this.field1852, 31330, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = arg0; var7 < this.field1850.length; var7++) {
            byte[] var8 = this.field1850[var7];
            class540 var9 = new class540(var8);
            var9.field7956 = 1;
            int var10 = var9.method3169(arg0 ^ 0x6778);
            class295 var11 = class310.field4568;
            synchronized (class310.field4568) {
                var6 &= class310.field4568.method1818(var10, arg0 + 4);
            }
        }
        if (!var6) {
            return false;
        }
        class302 var12 = new class302();
        class295 var13 = class571.field8301;
        int[] var15;
        synchronized (class571.field8301) {
            int var14 = class571.field8301.method1845(this.field1852, true);
            this.field1851 = new class333[var14];
            var15 = class571.field8301.method1846(this.field1852, arg0 - 15120);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field1850[var16];
            class540 var18 = new class540(var17);
            var18.field7956 = 1;
            int var19 = var18.method3169(26488);
            class639 var20 = null;
            for (class639 var21 = (class639) var12.method1904(false); var21 != null; var21 = (class639) var12.method1901(106)) {
                if (var21.field9180 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class295 var22 = class310.field4568;
                synchronized (class310.field4568) {
                    var20 = new class639(var19, class310.field4568.method1830(false, var19));
                }
                var12.method1909(var20, (byte) -81);
            }
            this.field1851[var15[var16]] = new class333(var17, var20);
        }
        this.field1850 = null;
        return true;
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(I)V", line = 164)
    public class128(int arg0) {
        this.field1852 = arg0;
    }
}
