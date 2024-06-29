import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class202 extends class27 {

    @OriginalMember(owner = "client!im", name = "X", descriptor = "I")
    private int field2970 = -1;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2958 = "cyan:";

    @OriginalMember(owner = "client!im", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2964 = "flash1:";

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "Z")
    public static boolean field2971 = false;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    private int field2965;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!im", name = "ab", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!im", name = "bb", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "Laj;")
    public static class210 field2961;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "[I")
    private int[] field2960;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 13)
    public final void method171(byte arg0) {
        field2962++;
        super.method171(arg0);
        this.field2960 = null;
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(B)V", line = 24)
    public static void method1465(byte arg0) {
        field2961 = null;
        if (arg0 == -84) {
            field2958 = null;
            field2964 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(II)V", line = 40)
    public static final void method1466(int arg0, int arg1) {
        class315.field4680.method464(3398, arg0);
        field2966++;
        if (arg1 != 4080) {
            field2961 = (class210) null;
        }
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)I", line = 54)
    public final int method169(int arg0) {
        field2963++;
        if (arg0 != 100) {
            this.field2965 = 51;
        }
        return this.field2970;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(II)Lvf;", line = 66)
    public static final class42 method1467(int arg0, int arg1) {
        field2959++;
        class42 var2 = (class42) class67.field972.method461((byte) 120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field1090.method2520(arg0, 0, (byte) -25);
        class42 var4 = new class42(var3);
        var4.method188(class239.field3563, (int[]) null);
        class67.field972.method460(var4, -26089, (long) arg0);
        if (arg1 != 0) {
            method1469(true, (byte) -81);
        }
        return var4;
    }

    @OriginalMember(owner = "client!im", name = "g", descriptor = "(I)Z", line = 87)
    private final boolean method1468(int arg0) {
        if (arg0 != -28465) {
            field2964 = (String) null;
        }
        field2957++;
        if (this.field2960 != null) {
            return true;
        } else if (this.field2970 < 0) {
            return false;
        } else {
            int var2 = class209.field3053;
            int var3 = class184.field2642;
            int var4 = class41.field607.method37(-104, this.field2970).field2664 ? 64 : 128;
            this.field2960 = class41.field607.method39(false, 1.0F, this.field2970, var4, var4, false);
            this.field2965 = var4;
            this.field2967 = var4;
            class252.method1849(var2, var3, true);
            return this.field2960 != null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZB)V", line = 122)
    public static final void method1469(boolean arg0, byte arg1) {
        if (arg1 == -58) {
            field2974++;
            class249.method1831((byte) 62, arg0, class257.field3850, class286.field4312, class19.field301);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 215)
    public class202() {
        super(0, false);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILsb;I)V", line = 137)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2970 = arg1.method1317((byte) 118);
        }
        if (arg0 != -5836) {
            field2964 = (String) null;
        }
        field2973++;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[[I", line = 151)
    public final int[][] method19(int arg0, int arg1) {
        field2969++;
        int[][] var3 = this.field379.method668(arg1, arg0 ^ arg0);
        if (this.field379.field1171 && this.method1468(arg0 ^ 0x1E3C)) {
            int[] var4 = var3[0];
            int var5 = (class184.field2642 == this.field2965 ? arg1 : this.field2965 * arg1 / class184.field2642) * this.field2967;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class209.field3053 == this.field2967) {
                for (int var8 = 0; var8 < class209.field3053; var8++) {
                    int var9 = this.field2960[var5++];
                    var7[var8] = class287.method2076(var9, 255) << 4;
                    var6[var8] = class287.method2076(65280, var9) >> 4;
                    var4[var8] = class287.method2076(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class209.field3053; var10++) {
                    int var11 = this.field2967 * var10 / class209.field3053;
                    int var12 = this.field2960[var5 + var11];
                    var7[var10] = class287.method2076(255, var12) << 4;
                    var6[var10] = class287.method2076(var12 >> 4, 4080);
                    var4[var10] = class287.method2076(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }
}
