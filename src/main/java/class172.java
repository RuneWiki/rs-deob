import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class172 extends class242 {

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "S")
    public static short field2986 = 256;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "Ljf;")
    public static class229 field2993 = class212.method1457((byte) 103, "<)4col> x");

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Ljf;")
    public static class229 field2996 = class212.method1457((byte) 95, "");

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field3006 = 0;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "Lkj;")
    public class178 field2994;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Lga;")
    public static class19 field2977;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "Lfh;")
    public class201 field2982;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "Lhi;")
    public class295 field2981;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "Ltg;")
    public class316 field2998;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 11)
    public final void method1166(int arg0) {
        if (arg0 >= -36) {
            return;
        }
        field2997++;
        this.field2998 = null;
        this.field2981 = null;
        this.field2994 = null;
        this.field2982 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V", line = 26)
    public static final void method1167(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class45.field828; var3++) {
            for (int var4 = 0; var4 < class170.field2971; var4++) {
                for (int var5 = 0; var5 < class10.field119; var5++) {
                    class125 var6 = class312.field5246[var3][var4][var5];
                    if (var6 != null) {
                        class167 var7 = var6.field2198;
                        if (var7 != null && var7.field2865.method1183()) {
                            class78.method556(var7.field2865, var3, var4, var5, 1, 1);
                            if (var7.field2874 != null && var7.field2874.method1183()) {
                                class78.method556(var7.field2874, var3, var4, var5, 1, 1);
                                var7.field2865.method1180(var7.field2874, 0, 0, 0, false);
                                var7.field2874 = var7.field2874.method1182(arg0, arg1, arg2);
                            }
                            var7.field2865 = var7.field2865.method1182(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2201; var8++) {
                            class104 var9 = var6.field2204[var8];
                            if (var9 != null && var9.field1806.method1183()) {
                                class78.method556(var9.field1806, var3, var4, var5, var9.field1802 + 1 - var9.field1800, var9.field1812 - var9.field1791 + 1);
                                var9.field1806 = var9.field1806.method1182(arg0, arg1, arg2);
                            }
                        }
                        class143 var10 = var6.field2190;
                        if (var10 != null && var10.field2480.method1183()) {
                            class294.method2037(var10.field2480, var3, var4, var5);
                            var10.field2480 = var10.field2480.method1182(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B[Ljf;)[Ljf;", line = 105)
    public static final class229[] method1168(byte arg0, class229[] arg1) {
        if (arg0 != -93) {
            return (class229[]) null;
        }
        field2975++;
        class229[] var2 = new class229[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class142.method989(new class229[] { class84.method607(78, var3), class73.field1394 }, -40);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class142.method989(new class229[] { var2[var3], arg1[var3] }, -19);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z", line = 144)
    public static final boolean method1169(int arg0, int arg1) {
        if (arg1 == -1443519519) {
            field3005++;
            return (-arg0 & arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V", line = 172)
    public static void method1170(byte arg0) {
        field2977 = null;
        int var1 = 86 / ((-arg0 - 50) / 51);
        field2996 = null;
        field2993 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lbf;ZILih;ILij;II)V", line = 183)
    public static final void method1171(class331 arg0, boolean arg1, int arg2, class33 arg3, int arg4, class83 arg5, int arg6, int arg7) {
        field2991++;
        if (arg1) {
            method1172(true, -117);
        }
        class165 var8 = new class165();
        var8.field2829 = arg7 * 128;
        var8.field2824 = arg4 * 128;
        var8.field2838 = arg6;
        if (arg5 != null) {
            var8.field2833 = arg5;
            var8.field2825 = arg5.field1529;
            var8.field2845 = arg5.field1562;
            var8.field2842 = arg5.field1585;
            var8.field2826 = arg5.field1561 * 128;
            int var9 = arg5.field1528;
            int var10 = arg5.field1572;
            if (arg2 == 1 || arg2 == 3) {
                var9 = arg5.field1572;
                var10 = arg5.field1528;
            }
            var8.field2848 = arg5.field1598;
            var8.field2823 = (arg4 + var10) * 128;
            var8.field2841 = (arg7 + var9) * 128;
            if (arg5.field1593 != null) {
                var8.field2843 = true;
                var8.method1133(0);
            }
            if (var8.field2825 != null) {
                var8.field2847 = (int) ((double) (var8.field2848 - var8.field2842) * Math.random()) + var8.field2842;
            }
            class83.field1589.method2079(var8, 108);
        } else if (arg0 != null) {
            var8.field2830 = arg0;
            class169 var11 = arg0.field5631;
            if (var11.field2950 != null) {
                var8.field2843 = true;
                var11 = var11.method1154((byte) -125);
            }
            if (var11 != null) {
                var8.field2841 = (arg7 + var11.field2952) * 128;
                var8.field2823 = (var11.field2952 + arg4) * 128;
                var8.field2845 = class132.method915(arg0, (byte) -106);
                var8.field2826 = var11.field2941 * 128;
            }
            class125.field2203.method2079(var8, 126);
        } else if (arg3 != null) {
            var8.field2846 = arg3;
            var8.field2841 = (arg3.method299(true) + arg7) * 128;
            var8.field2823 = (arg4 + arg3.method299(true)) * 128;
            var8.field2845 = class331.method2258(arg3, 0);
            var8.field2826 = arg3.field640 * 128;
            class115.field2069.method1885(arg3.field621.method1617(126), var8, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V", line = 272)
    public static final void method1172(boolean arg0, int arg1) {
        field3000++;
        byte var2;
        byte[][] var3;
        if (class108.field1900 && arg0) {
            var2 = 1;
            var3 = class203.field3553;
        } else {
            var2 = 4;
            var3 = class270.field4638;
        }
        int var4 = 0;
        if (arg1 < 27) {
            return;
        }
        while (var4 < var2) {
            class18.method179((byte) 101);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class257.field4478[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFC1F7) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class29.field511.length; var13++) {
                                if (class29.field511[var13] == var12 && var3[var13] != null) {
                                    class125.method883(var3[var13], (byte) -108, (var10 & 0x7) * 8, (var11 & 0x7) * 8, var9, var5 * 8, var6 * 8, var8, class80.field1460, var4, arg0);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }
}
