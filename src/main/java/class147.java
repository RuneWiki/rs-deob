import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class147 extends class176 {

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "Lob;")
    public static class141 field2868 = class175.method1195(40, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field2875 = 0;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2881 = new CRC32();

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "Lob;")
    public class141 field2867;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "[I")
    public int[] field2869;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "[I")
    public int[] field2874;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "[Lmd;")
    public class123[] field2870;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "[Lob;")
    public class141[] field2873;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BZI)Lob;")
    public static final class141 method1017(byte arg0, boolean arg1, int arg2) {
        field2880++;
        int var3 = -34 / ((4 - arg0) / 53);
        return class107.method709((byte) 104, arg2, 10, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field2881 = null;
        if (arg0 == -1) {
            field2868 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILud;)V")
    public static final void method1019(int arg0, class203 arg1) {
        field2876++;
        if (arg1.field3839 == 0) {
            return;
        }
        if (arg1.field3877 != -1 && arg1.field3877 < 32768) {
            class131 var2 = class10.field172[arg1.field3877];
            if (var2 != null) {
                int var3 = arg1.field3889 - var2.field3889;
                int var4 = arg1.field3854 - var2.field3854;
                if (var3 != 0 || var4 != 0) {
                    arg1.field3833 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        int var5 = -78 % ((-arg0 - 73) / 39);
        if (arg1.field3877 >= 32768) {
            int var6 = arg1.field3877 - 32768;
            if (class97.field1916 == var6) {
                var6 = 2047;
            }
            class38 var7 = class116.field2231[var6];
            if (var7 != null) {
                int var8 = arg1.field3889 - var7.field3889;
                int var9 = arg1.field3854 - var7.field3854;
                if (var8 != 0 || var9 != 0) {
                    arg1.field3833 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3879 != 0 || arg1.field3850 != 0) && (arg1.field3832 == 0 || arg1.field3856 > 0)) {
            int var10 = arg1.field3889 - (arg1.field3879 - class83.field1649 - class83.field1649) * 64;
            int var11 = arg1.field3854 - (arg1.field3850 - class83.field1644 - class83.field1644) * 64;
            if (var10 != 0 || var11 != 0) {
                arg1.field3833 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field3879 = 0;
            arg1.field3850 = 0;
        }
        int var12 = arg1.field3833 - arg1.field3845 & 0x7FF;
        if (var12 == 0) {
            arg1.field3857 = 0;
            return;
        }
        arg1.field3857++;
        if (var12 > 1024) {
            arg1.field3845 -= arg1.field3839;
            boolean var13 = true;
            if (var12 < arg1.field3839 || var12 > 2048 - arg1.field3839) {
                arg1.field3845 = arg1.field3833;
                var13 = false;
            }
            if (arg1.field3874 == arg1.field3828 && (arg1.field3857 > 25 || var13)) {
                if (arg1.field3882 == -1) {
                    arg1.field3828 = arg1.field3837;
                } else {
                    arg1.field3828 = arg1.field3882;
                }
            }
        } else {
            arg1.field3845 += arg1.field3839;
            boolean var14 = true;
            if (arg1.field3839 > var12 || var12 > 2048 - arg1.field3839) {
                var14 = false;
                arg1.field3845 = arg1.field3833;
            }
            if (arg1.field3874 == arg1.field3828 && (arg1.field3857 > 25 || var14)) {
                if (arg1.field3830 == -1) {
                    arg1.field3828 = arg1.field3837;
                } else {
                    arg1.field3828 = arg1.field3830;
                }
            }
        }
        arg1.field3845 &= 0x7FF;
    }
}
