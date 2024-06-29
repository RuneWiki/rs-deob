import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class94 extends class105 {

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    private int field1940 = 20;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    private int field1950 = 0;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
    private int field1951 = 1365;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
    private int field1953 = 0;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "[I")
    public static int[] field1938 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "Leh;")
    private static class47 field1948 = class195.method1282((byte) -4, " is already on your ignore list)3");

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Leh;")
    public static class47 field1936 = field1948;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "Leh;")
    private static class47 field1946 = class195.method1282((byte) -4, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "Leh;")
    public static class47 field1952 = field1946;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1949 = new CRC32();

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
    public static int field1954 = 0;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field1945;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "[Leh;")
    public static class47[] field1937;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field1950 = arg1.method569(26496);
                    }
                } else {
                    this.field1953 = arg1.method569(arg2 ^ -26496);
                }
            } else {
                this.field1940 = arg1.method569(26496);
            }
        } else {
            this.field1951 = arg1.method569(26496);
        }
        if (arg2 != -256) {
            field1949 = null;
        }
        ++field1941;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 <= 78) {
            method752(false);
        }
        ++field1943;
        int[] var3 = super.field2192.method336(-107, arg0);
        if (super.field2192.field770) {
            for (int var4 = 0; ~class149.field2928 < ~var4; ++var4) {
                int var5 = (class167.field3237[var4] << 12) / this.field1951 - -this.field1953;
                int var6 = (class26.field500[arg0] << 12) / this.field1951 - -this.field1950;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                int var13 = var6 * var6 >> 12;
                while (~(var11 + var13) > -16385 && ~var12 > ~this.field1940) {
                    ++var12;
                    var9 = (var9 * var10 >> 12) * 2 - -var8;
                    var10 = var11 - var13 + var7;
                    var13 = var9 * var9 >> 12;
                    var11 = var10 * var10 >> 12;
                }
                var3[var4] = var12 < this.field1940 - 1 ? (var12 << 12) / this.field1940 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JBII)Z")
    public static final boolean method751(long arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -116) {
            return true;
        } else {
            int var5 = (509648 & (int) arg0) >> 14;
            ++field1939;
            int var6 = (3507447 & (int) arg0) >> 20;
            int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
            if (~var5 != -11 && ~var5 != -12 && ~var5 != -23) {
                class204.method1337(var5 - -1, class123.field2489.field3310[0], 0, 0, true, arg2, class123.field2489.field3317[0], 0, 2, arg3, (byte) 67, var6);
            } else {
                class202 var8 = class99.method806(0, var7);
                int var9;
                int var10;
                if (~var6 != -1 && var6 != 2) {
                    var9 = var8.field3949;
                    var10 = var8.field3980;
                } else {
                    var10 = var8.field3949;
                    var9 = var8.field3980;
                }
                int var11 = var8.field3930;
                if (~var6 != -1) {
                    var11 = (15 & var11 << var6) - -(var11 >> -var6 + 4);
                }
                class204.method1337(0, class123.field2489.field3310[0], var9, var10, true, arg2, class123.field2489.field3317[0], var11, 2, arg3, (byte) 121, 0);
            }
            class201.field3907 = 0;
            class90.field1898 = 2;
            class167.field3231 = class3.field29;
            class148.field2907 = class185.field3546;
            return true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
    public static void method752(boolean arg0) {
        field1946 = null;
        field1936 = null;
        field1948 = null;
        field1945 = null;
        field1952 = null;
        if (arg0) {
            method753(16, -82, 101);
        }
        field1949 = null;
        field1937 = null;
        field1938 = null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)I")
    public static final int method753(int arg0, int arg1, int arg2) {
        ++field1944;
        if (arg0 >= -74) {
            return -46;
        } else {
            class120 var3 = (class120) class2.field21.method1342((long) arg2, (byte) -20);
            if (var3 == null) {
                return 0;
            } else {
                return arg1 >= 0 && ~var3.field2429.length < ~arg1 ? var3.field2429[arg1] : 0;
            }
        }
    }
}
