import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class123 extends class585 {

    @OriginalMember(owner = "client!bba", name = "Q", descriptor = "I")
    private int field1916 = -1;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "Lbu;")
    public static class21 field1904 = new class21(22, 3);

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "Lwv;")
    public static class37 field1910 = new class37(1, 2);

    @OriginalMember(owner = "client!bba", name = "N", descriptor = "I")
    public static int field1913 = 500;

    @OriginalMember(owner = "client!bba", name = "T", descriptor = "Lfba;")
    public static class27 field1919 = new class27(14, 7);

    @OriginalMember(owner = "client!bba", name = "V", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1921 = new Hashtable();

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!bba", name = "L", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!bba", name = "M", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!bba", name = "O", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!bba", name = "P", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!bba", name = "S", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!bba", name = "U", descriptor = "Ljava/lang/Object;")
    public static Object field1920;

    @OriginalMember(owner = "client!bba", name = "R", descriptor = "[I")
    public int[] field1917;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "(B)V", line = 4)
    public static final void method931(byte arg0) {
        ++field1908;
        int var1 = 88 % ((63 - arg0) / 51);
        for (class506 var2 = (class506) class240.field3597.method1731((byte) -120); var2 != null; var2 = (class506) class240.field3597.method1724(0)) {
            class290.method1861(33, var2, false);
        }
        for (class506 var3 = (class506) class779.field10697.method1731((byte) -126); var3 != null; var3 = (class506) class779.field10697.method1724(0)) {
            class290.method1861(119, var3, true);
        }
    }

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)Z", line = 28)
    public final boolean method932(byte arg0) {
        ++field1915;
        if (arg0 != 123) {
            field1904 = null;
        }
        if (this.field1917 != null) {
            return true;
        } else if (this.field1916 >= 0) {
            class1 var2 = ~class600.field8419 > -1 ? class1.method8(class378.field5212, this.field1916) : class1.method5(class378.field5212, class600.field8419, this.field1916);
            var2.method7();
            this.field1917 = var2.method1();
            this.field1918 = var2.field4;
            this.field1909 = var2.field7;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I[[BLrr;)V", line = 56)
    public static final void method933(int arg0, byte[][] arg1, class381 arg2) {
        ++field1906;
        if (arg0 != 31308) {
            method934(false);
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class494 var11 = new class494(var10);
                int var12 = class551.field7919[var5] >> 8;
                int var13 = 255 & class551.field7919[var5];
                int var14 = var12 * 64 + -class124.field1922;
                int var15 = var13 * 64 + -class88.field999;
                class265.method1722(16033);
                arg2.method3256(class88.field999, var11, true, class346.field4838, var15, var14, class124.field1922);
                arg2.method2367(var3, var15, class37.field491, arg0 + -31434, var11, var14);
                if (!arg2.field7823 && ~(class432.field5849 / 8) == ~var12 && ~(class436.field5884 / 8) == ~var13 && ~var3[0] != 0) {
                    class416.field5698 = class107.field1602.method1937(var3[2], arg0 ^ 31287, var3[1], var3[3], var3[0], class316.field4491);
                    class212.field3296 = var3[4];
                }
            }
        }
        for (int var6 = 0; ~var6 > ~var4; ++var6) {
            int var7 = (class551.field7919[var6] >> 8) * 64 + -class124.field1922;
            int var8 = (255 & class551.field7919[var6]) * 64 + -class88.field999;
            byte[] var9 = arg1[var6];
            if (var9 == null && class436.field5884 < 800) {
                class265.method1722(arg0 ^ 17645);
                arg2.method3255(64, var7, var8, 64, 2);
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(Z)V", line = 133)
    public static void method934(boolean arg0) {
        field1921 = null;
        if (arg0) {
            field1904 = null;
            field1910 = null;
            field1920 = null;
            field1919 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(B)V", line = 147)
    public final void method935(byte arg0) {
        super.method935(arg0);
        ++field1911;
        this.field1917 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZI)[[I", line = 157)
    public int[][] method58(boolean arg0, int arg1) {
        ++field1912;
        int[][] var3 = super.field8265.method1576((byte) -49, arg1);
        if (arg0) {
            this.method935((byte) 78);
        }
        if (super.field8265.field3546 && this.method932((byte) 123)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field1918 * (class270.field3923 != this.field1909 ? this.field1909 * arg1 / class270.field3923 : arg1);
            if (~class293.field4278 != ~this.field1918) {
                for (int var8 = 0; ~class293.field4278 < ~var8; ++var8) {
                    int var9 = this.field1918 * var8 / class293.field4278;
                    int var10 = this.field1917[var7 + var9];
                    var6[var8] = class702.method3977(255, var10) << 4;
                    var5[var8] = class702.method3977(65280, var10) >> 4;
                    var4[var8] = class702.method3977(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class293.field4278; ++var11) {
                    int var12 = this.field1917[var7++];
                    var6[var11] = class702.method3977(4080, var12 << 4);
                    var5[var11] = class702.method3977(4080, var12 >> 4);
                    var4[var11] = class702.method3977(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lso;II)V", line = 232)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field1904 = null;
        }
        if (~arg2 == -1) {
            this.field1916 = arg0.method2998(true);
        }
        ++field1905;
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I", line = 255)
    public final int method936(int arg0) {
        if (arg0 <= 34) {
            this.method54((class494) null, -14, -67);
        }
        ++field1907;
        return this.field1916;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V", line = 272)
    public class123() {
        super(0, false);
    }
}
