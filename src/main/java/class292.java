import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class292 extends RuntimeException {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4633;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Ljava/lang/String;")
    public String field4632;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field4639 = 0;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class292(Throwable arg0, String arg1) {
        this.field4633 = arg0;
        this.field4632 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)[B")
    public static final byte[] method1962(byte arg0, int arg1) {
        field4638++;
        int var2 = 66 / ((64 - arg0) / 59);
        class129 var3 = (class129) class179.field2843.method1469(8288, (long) arg1);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class40.method222(var8, -125, var5);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class129(var4);
            class179.field2843.method1467((byte) -119, var3, (long) arg1);
        }
        return var3.field2067;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1963(int arg0, String arg1, int arg2) {
        if (arg2 >= -94) {
            method1964(57, (byte) 61, -9);
        }
        class233 var3 = class114.method746(arg0, 1228126432, 3);
        var3.method1651((byte) 121);
        var3.field3863 = arg1;
        field4643++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)V")
    public static final void method1964(int arg0, byte arg1, int arg2) {
        if (arg1 != -27) {
            return;
        }
        if (class25.field349 > 0) {
            class77.method431(class25.field349, arg1 ^ 0xFFFFAE2A);
            class25.field349 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        field4635++;
        int var5 = 0;
        int var6 = class217.field3481 * arg2;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class279.field4433[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class52.field681[var4++];
                int var12 = class217.field3483[arg0 + (var6++)];
                if (var11 == 0) {
                    class286.field4569.field3640[var5++] = var12;
                } else {
                    int var13 = 256 - var11 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = var11 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class186.field2973[var11];
                    class286.field4569.field3640[var5++] = class173.method1186(var14 * class173.method1186(16711935, var15) + class173.method1186(16711935, var12) * var13, -16711936) + class173.method1186(var14 * class173.method1186(var15, 65280) + (class173.method1186(65280, var12) * var13), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class286.field4569.field3640[var5++] = class217.field3483[arg0 + (var6++)];
            }
            var6 += class217.field3481 - 128;
        }
        class286.field4569.method322(arg0, arg2);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[Loj;[BZIIIIBI)V")
    public static final void method1965(int arg0, int arg1, class144[] arg2, byte[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        field4636++;
        int var11 = -1;
        class96 var12 = new class96(arg3);
        while (true) {
            int var13 = var12.method592(38);
            if (var13 == 0) {
                int var27 = 14 / ((-arg9 - 50) / 34);
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method539(-401085592);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFC4) >> 6;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method584(255);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg1 == var18 && var16 >= arg5 && var16 < arg5 + 8 && arg8 <= var17 && var17 < (arg8 + 8)) {
                    class228 var22 = class256.method1749(var11, 0);
                    int var23 = arg0 + class94.method527(arg7, var21, var17 & 0x7, var22.field3714, var22.field3655, 1, var16 & 0x7);
                    int var24 = arg10 + class295.method1980(-113, var22.field3655, var21, arg7, var22.field3714, var16 & 0x7, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class144 var25 = null;
                        if (!arg4) {
                            int var26 = arg6;
                            if ((class117.field1664[1][var23][var24] & 0x2) == 2) {
                                var26 = arg6 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg2[var26];
                            }
                        }
                        class234.method1659(var25, var20, var11, !arg4, var23, var21 + arg7 & 0x3, arg6, var24, arg6, arg4, 28777);
                    }
                }
            }
        }
    }
}
