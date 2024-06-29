import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class197 {

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[I")
    public int[] field3870 = new int[6];

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[I")
    public int[] field3865 = new int[256];

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[Z")
    public boolean[] field3877 = new boolean[256];

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[[I")
    public int[][] field3876 = new int[6][258];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field3862 = 0;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[Z")
    public boolean[] field3874 = new boolean[16];

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field3886 = 0;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[B")
    public byte[] field3888 = new byte[256];

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[I")
    public int[] field3885 = new int[257];

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[[I")
    public int[][] field3891 = new int[6][258];

    @OriginalMember(owner = "client!w", name = "K", descriptor = "[I")
    public int[] field3898 = new int[16];

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[B")
    public byte[] field3884 = new byte[18002];

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[[B")
    public byte[][] field3880 = new byte[6][258];

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[B")
    public byte[] field3893 = new byte[18002];

    @OriginalMember(owner = "client!w", name = "L", descriptor = "[[I")
    public int[][] field3899 = new int[6][258];

    @OriginalMember(owner = "client!w", name = "I", descriptor = "[B")
    public byte[] field3896 = new byte[4096];

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3883 = 1;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "B")
    public byte field3867;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[B")
    public byte[] field3864;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[B")
    public byte[] field3871;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BIII)I")
    public static final int method1298(byte[] arg0, int arg1, int arg2, int arg3) {
        field3872++;
        int var4 = -1;
        if (arg3 != 448779536) {
            method1298(null, -31, -98, -11);
        }
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = class5.field145[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lef;IIIIIII)V")
    public static final void method1299(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3866++;
        int var8 = -14 / ((-arg2 - 41) / 35);
        if (class51.field1303) {
            class120.field2597 = 32;
        } else {
            class120.field2597 = 0;
        }
        class51.field1303 = false;
        if (class146.field3038 != 0) {
            if (arg1 <= arg5 && arg5 < arg1 + 16 && arg6 <= arg7 && arg7 < arg6 + 16) {
                arg0.field1043 -= 4;
                class172.method1209(arg0, -1);
            } else if (arg5 >= arg1 && arg1 + 16 > arg5 && arg7 >= arg6 + arg3 - 16 && arg6 + arg3 > arg7) {
                arg0.field1043 += 4;
                class172.method1209(arg0, -1);
            } else if (arg1 - class120.field2597 <= arg5 && arg5 < arg1 + class120.field2597 + 16 && arg6 + 16 <= arg7 && arg3 + arg6 - 16 > arg7) {
                int var9 = (arg3 - 32) * arg3 / arg4;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg7 - var9 / 2 - arg6 - 16;
                int var11 = arg3 - var9 - 32;
                arg0.field1043 = (arg4 - arg3) * var10 / var11;
                class172.method1209(arg0, -1);
                class51.field1303 = true;
            }
        }
        if (class102.field2288 == 0) {
            return;
        }
        int var12 = arg0.field1052;
        if (arg5 >= arg1 - var12 && arg6 <= arg7 && arg5 < arg1 + 16 && arg7 <= arg3 + arg6) {
            arg0.field1043 += class102.field2288 * 45;
            class172.method1209(arg0, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)V")
    public static final void method1300(int arg0, int arg1, byte arg2) {
        if (arg2 != 3) {
            return;
        }
        field3897++;
        long var3 = (long) ((arg1 << 16) + arg0);
        class143 var5 = (class143) class198.field3922.method183((byte) 58, var3);
        if (var5 != null) {
            class11.field234.method1228(-1454, var5);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)I")
    public static final int method1301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 65536 - class93.field2110[arg3 * 1024 / arg2] >> 1;
        if (arg1 == 2058356880) {
            field3900++;
            return ((65536 - var5) * arg4 >> 16) + (arg0 * var5 >> 16);
        } else {
            return 82;
        }
    }
}
