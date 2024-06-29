import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class116 {

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[B")
    private byte[] field1810 = new byte[4];

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Lhj;")
    private class112 field1802;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "J")
    private long field1804;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Luf;")
    public static class168 field1805 = class148.method1019(-1720, ")3");

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[I")
    public static int[] field1814 = new int[32768];

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field1803 = 0;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    private int field1800;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Lfj;")
    public static class283 field1813;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1808;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[B")
    private byte[] field1799;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "[I")
    public static int[] field1812;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lle;", line = 11)
    public static final class187 method842(int arg0, int arg1) {
        if (arg0 != -1153) {
            method844(-65, 58, (class152) null, -41, -93, (byte) -118, 73, 112, -18, false, 46, (class190) null, 96, -7);
        }
        field1806++;
        class187 var2 = (class187) class217.field3537.method185(arg0 ^ 0x480, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field1899.method1647(class105.method787(8648, arg1), (byte) 121, class70.method394(arg1, (byte) -72));
        class187 var4 = new class187();
        if (var3 != null) {
            var4.method1320(false, new class153(var3));
        }
        class217.field3537.method187(var4, (long) arg1, (byte) 10);
        return var4;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 47)
    public static void method843(byte arg0) {
        field1805 = null;
        field1813 = null;
        field1814 = null;
        if (arg0 >= -87) {
            method844(90, -37, (class152) null, -92, 5, (byte) 101, 14, -4, 118, false, -50, (class190) null, 74, 21);
        }
        field1812 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILfc;IIBIIIZILug;II)Lfc;", line = 60)
    public static final class152 method844(int arg0, int arg1, class152 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, class190 arg11, int arg12, int arg13) {
        field1815++;
        long var14 = (long) ((arg0 << 16) + (arg1 << 24) + arg3) - (-((long) arg8 << 48) - ((long) arg10 << 32));
        class152 var16 = (class152) class221.field3591.method1424(var14, (byte) 119);
        if (var16 == null) {
            byte var17;
            if (arg3 == 1) {
                var17 = 9;
            } else if (arg3 == 2) {
                var17 = 12;
            } else if (arg3 == 3) {
                var17 = 15;
            } else if (arg3 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class208 var20 = new class208(var17 * var19 + 1, var17 * var19 * 2 + -var17, 0);
            int var21 = var20.method1451(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class173.field2818[var27] * var25 + arg4 >> 16;
                    int var29 = class173.field2812[var27] * var24 + arg12 >> 16;
                    var22[var23][var26] = var20.method1451(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg0 * var32 + arg1 * var31 >> 8);
                short var34 = (short) (((arg8 & 0x380) * var31 + (arg10 & 0x380) * var32 & 0x38000) + ((arg8 & 0x7F) * var31 + (arg10 & 0x7F) * var32 & 0x7F00) + ((arg8 & 0xFC00) * var31 + (arg10 & 0xFC00) * var32 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1454(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1454(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method1454(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method1446(64, 768, -50, -10, -50);
            class221.field3591.method1430(var16, var14, 13487);
        }
        int var36 = arg3 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        if (arg5 < 36) {
            method842(-107, 74);
        }
        int var39 = var36;
        int var40 = var36;
        int var41 = arg2.method687();
        if (arg9) {
            if (arg13 > 1152 && arg13 < 1920) {
                var40 = var36 + 128;
            }
            if (arg13 > 1664 || arg13 < 384) {
                var38 -= 128;
            }
            if (arg13 > 640 && arg13 < 1408) {
                var39 = var36 + 128;
            }
            if (arg13 > 128 && arg13 < 896) {
                var37 -= 128;
            }
        }
        if (var37 > var41) {
            var41 = var37;
        }
        class102 var42 = null;
        int var43 = arg2.method659();
        if (var43 > var40) {
            var43 = var40;
        }
        int var44 = arg2.method690();
        if (var38 > var44) {
            var44 = var38;
        }
        int var45 = arg2.method708();
        if (var39 < var45) {
            var45 = var39;
        }
        if (arg11 != null) {
            int var46 = arg11.field3063[arg6];
            var42 = class15.method59(10294, var46 >> 16);
            arg6 = var46 & 0xFFFF;
        }
        class152 var47;
        if (var42 == null) {
            var47 = var16.method671(true, true);
            var47.method688((var43 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method710((var41 + var43) / 2, 0, (var44 + var45) / 2);
        } else {
            var47 = var16.method671(!var42.method766(arg6, 186), true);
            var47.method688((var43 - var41) / 2, 128, (var45 - var44) / 2);
            var47.method710((var41 + var43) / 2, 0, (var44 + var45) / 2);
            var47.method678(var42, arg6);
        }
        if (arg13 != 0) {
            var47.method684(arg13);
        }
        class93 var48 = (class93) var47;
        if (arg7 != class62.method349(128, class79.field1127, arg4 + var44, arg12 + var41) || class62.method349(128, class79.field1127, arg4 + var45, arg12 + var43) != arg7) {
            for (int var49 = 0; var49 < var48.field1456; var49++) {
                var48.field1429[var49] += class62.method349(128, class79.field1127, var48.field1426[var49] + arg4, var48.field1439[var49] + arg12) - arg7;
            }
            var48.field1449.field2499 = false;
            var48.field1453.field2038 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lcj;Ljava/net/URL;)V", line = 364)
    public class116(class75 arg0, URL arg1) {
        this.field1802 = arg0.method426(arg1, false);
        this.field1807 = 0;
        this.field1804 = class194.method1368((byte) -111) + 30000L;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)[B", line = 295)
    public final byte[] method845(byte arg0) throws IOException {
        field1811++;
        if (this.field1804 < class194.method1368((byte) 53)) {
            throw new IOException("fdt");
        }
        if (this.field1807 == 0) {
            if (this.field1802.field1746 == 2) {
                throw new IOException("fds");
            }
            if (this.field1802.field1746 == 1) {
                this.field1808 = (DataInputStream) this.field1802.field1742;
                this.field1807 = 1;
            }
        }
        if (arg0 != 4) {
            method842(14, -25);
        }
        if (this.field1807 == 1) {
            int var2 = this.field1808.available();
            if (var2 > 0) {
                if (var2 + this.field1801 > 4) {
                    var2 = 4 - this.field1801;
                }
                this.field1801 += this.field1808.read(this.field1810, this.field1801, var2);
                if (this.field1801 == 4) {
                    int var3 = (new class153(this.field1810)).method1089((byte) -14);
                    this.field1807 = 2;
                    this.field1799 = new byte[var3];
                }
            }
        }
        if (this.field1807 == 2) {
            int var4 = this.field1808.available();
            if (var4 > 0) {
                if ((var4 + this.field1800) > this.field1799.length) {
                    var4 = this.field1799.length - this.field1800;
                }
                this.field1800 += this.field1808.read(this.field1799, this.field1800, var4);
                if (this.field1799.length == this.field1800) {
                    return this.field1799;
                }
            }
        }
        return null;
    }
}
