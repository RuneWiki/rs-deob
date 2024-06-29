import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class104 extends class123 {

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "I")
    private int field1902 = 4096;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Leb;")
    public static class230 field1893 = class68.method589(0, "_labels");

    @OriginalMember(owner = "client!c", name = "db", descriptor = "[I")
    public static int[] field1898 = new int[99];

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "Leb;")
    public static class230 field1901 = class68.method589(0, "www");

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field1903 = 1;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "Lsf;")
    public static class93 field1904;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lfk;Z)V")
    public static final void method873(class14 arg0, boolean arg1) {
        for (int var2 = 0; class68.field1269 > var2; ++var2) {
            int var3 = arg0.method202(33);
            int var4 = arg0.method161(4);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class139.field2484[var3] != null) {
                class139.field2484[var3].field2127 = var4;
            }
        }
        if (arg1) {
            method874(-127L, 117);
        }
        ++field1896;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field1900;
        if (arg2 != 1876195788) {
            method876(-123, 39, (byte) 97);
        }
        if (arg0 == 0) {
            this.field1902 = arg1.method161(4);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JI)V")
    public static final void method874(long arg0, int arg1) {
        ++field1899;
        class153.field2747.field318 = 0;
        class153.field2747.method170((byte) 112, 228);
        class153.field2747.method148(arg0, (byte) 124);
        if (arg1 != -14163) {
            method874(86L, -12);
        }
        class146.field2639 = -3;
        class210.field3668 = 0;
        class159.field2852 = 0;
        class214.field3716 = 1;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class104() {
        super(1, true);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(IIB)I")
    public static final int method875(int arg0, int arg1, byte arg2) {
        ++field1892;
        class212 var3 = (class212) class75.field1366.method394((long) arg1, -21083);
        if (var3 == null) {
            return 0;
        } else {
            if (arg2 <= 93) {
                field1898 = null;
            }
            return ~arg0 <= -1 && var3.field3679.length > arg0 ? var3.field3679[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field1895;
        int var3 = -113 % ((-24 - arg1) / 57);
        int[] var4 = super.field2160.method1323((byte) -108, arg0);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(0, class79.field1431 & arg0 + -1, (byte) 27);
            int[] var6 = this.method965(0, arg0, (byte) 105);
            int[] var7 = this.method965(0, arg0 + 1 & class79.field1431, (byte) 64);
            for (int var8 = 0; ~class140.field2505 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field1902;
                int var10 = (var6[class217.field3743 & var8 - -1] + -var6[class217.field3743 & var8 + -1]) * this.field1902;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var14) / 4096.0F)));
                int var16 = ~var15 != -1 ? 16777216 / var15 : 0;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(IIB)I")
    public static final int method876(int arg0, int arg1, byte arg2) {
        ++field1897;
        if (arg2 < 102) {
            return -25;
        } else {
            if (arg1 < arg0) {
                int var3 = arg1;
                arg1 = arg0;
                arg0 = var3;
            }
            while (~arg0 != -1) {
                int var4 = arg1 % arg0;
                arg1 = arg0;
                arg0 = var4;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
    public static void method877(byte arg0) {
        field1901 = null;
        field1904 = null;
        field1898 = null;
        field1893 = null;
        if (arg0 >= -61) {
            field1894 = -126;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1898[var1] = var0 / 4;
        }
    }
}
