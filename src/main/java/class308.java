import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class308 {

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[[B")
    public byte[][] field4516 = new byte[6][258];

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    public int[] field4511 = new int[257];

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "[Z")
    public boolean[] field4515 = new boolean[256];

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[B")
    public byte[] field4510 = new byte[4096];

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
    public int[] field4518 = new int[6];

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "[[I")
    public int[][] field4527 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "[I")
    public int[] field4509 = new int[16];

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "[I")
    public int[] field4535 = new int[256];

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public int field4531 = 0;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[Z")
    public boolean[] field4513 = new boolean[16];

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "[B")
    public byte[] field4537 = new byte[256];

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "[[I")
    public int[][] field4533 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[B")
    public byte[] field4507 = new byte[18002];

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "[[I")
    public int[][] field4534 = new int[6][258];

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "[B")
    public byte[] field4538 = new byte[18002];

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public int field4542 = 0;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4539 = "shake:";

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Ldj;")
    public static class143 field4524 = new class143(64);

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "B")
    public byte field4532;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public int field4514;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public int field4529;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[B")
    public byte[] field4505;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "[B")
    public byte[] field4526;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIZ[[F[[FLih;B[[IIIBIZI[[FII[Z[[II[IZ)V", line = 15)
    public static final void method2148(boolean arg0, int arg1, boolean arg2, float[][] arg3, float[][] arg4, class70 arg5, byte arg6, int[][] arg7, int arg8, int arg9, byte arg10, int arg11, boolean arg12, int arg13, float[][] arg14, int arg15, int arg16, boolean[] arg17, int[][] arg18, int arg19, int[] arg20, boolean arg21) {
        int var22 = (arg19 << 8) + (arg21 ? 255 : 0);
        int var23 = (arg15 << 8) + (arg2 ? 255 : 0);
        int var24 = (arg12 ? 255 : 0) + (arg9 << 8);
        field4540++;
        int var25 = (arg8 << 8) + (arg0 ? 255 : 0);
        int[] var26 = new int[arg20.length / 2];
        if (arg6 != -39) {
            return;
        }
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg20[var27 + var27];
            int var29 = arg20[var27 + var27 + 1];
            int[][] var30 = arg18 == null || arg17 == null || !arg17[var27] ? arg7 : arg18;
            var26[var27] = class310.method2158(arg14, var29, arg1, var30, arg3, arg18, arg5, var23, arg16, false, (float) arg13, arg4, arg10, var28, arg6 + 84, var25, var24, var22);
        }
        arg5.method518(arg11, arg16, arg1, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILfe;)V", line = 58)
    public static final void method2149(int arg0, class153 arg1) {
        field4512++;
        for (int var2 = 0; var2 < class42.field524.length; var2++) {
            class42.field524[var2] = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = 103 % ((arg0 - 48) / 55);
        while (var4 < 5000) {
            int var6 = (int) (Math.random() * 128.0D * (double) var3);
            class42.field524[var6] = (int) (Math.random() * 284.0D);
            var4++;
        }
        for (int var7 = 0; var7 < 20; var7++) {
            for (int var8 = 1; var8 < (var3 - 1); var8++) {
                for (int var9 = 1; var9 < 127; var9++) {
                    int var10 = (var8 << 7) + var9;
                    class312.field4582[var10] = (class42.field524[var10 - 1] + class42.field524[var10 - 128] + class42.field524[var10 + 1] + class42.field524[var10 + 128]) / 4;
                }
            }
            int[] var11 = class42.field524;
            class42.field524 = class312.field4582;
            class312.field4582 = var11;
        }
        if (arg1 == null) {
            return;
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg1.field2029; var13++) {
            for (int var14 = 0; var14 < arg1.field2024; var14++) {
                if (arg1.field2140[var12++] != 0) {
                    int var15 = var14 - (-arg1.field2018 - 16);
                    int var16 = arg1.field2019 + var13 + 16;
                    int var17 = (var16 << 7) + var15;
                    class42.field524[var17] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I", line = 156)
    public static final int method2150(int arg0) {
        field4520++;
        try {
            if (class280.field3982 == 0) {
                if (class6.method37(10828) - 5000L < class238.field3444) {
                    return 0;
                }
                class236.field3406 = class157.field2216.method505(19, class167.field2331, class253.field3695);
                class286.field4099 = class6.method37(10828);
                class280.field3982 = 1;
            }
            if (class6.method37(10828) > (class286.field4099 + 30000L)) {
                return class247.method1732((byte) 9, 1000);
            }
            if (class280.field3982 == 1) {
                if (class236.field3406.field2608 == 2) {
                    return class247.method1732((byte) 9, 1001);
                }
                if (class236.field3406.field2608 != 1) {
                    return -1;
                }
                class265.field3848 = new class71((Socket) class236.field3406.field2606, class157.field2216);
                class236.field3406 = null;
                int var1 = 0;
                if (class17.field209) {
                    var1 = field4523;
                }
                class251.field3681.field4351 = 0;
                class251.field3681.method2048(23, 125);
                class251.field3681.method2084(true, var1);
                class265.field3848.method530(0, class251.field3681.field4350, class251.field3681.field4351, 30000);
                if (class335.field5234 != null) {
                    class335.field5234.method2458(2);
                }
                if (class328.field4801 != null) {
                    class328.field4801.method2458(2);
                }
                int var2 = class265.field3848.method528(true);
                if (class335.field5234 != null) {
                    class335.field5234.method2458(2);
                }
                if (class328.field4801 != null) {
                    class328.field4801.method2458(2);
                }
                if (var2 != 0) {
                    return class247.method1732((byte) 9, var2);
                }
                class280.field3982 = 2;
            }
            if (class280.field3982 == 2) {
                if (class265.field3848.method524((byte) 93) < 2) {
                    return -1;
                }
                class74.field977 = class265.field3848.method528(true);
                class74.field977 <<= 0x8;
                class74.field977 += class265.field3848.method528(true);
                class279.field3980 = new byte[class74.field977];
                class292.field4258 = 0;
                class280.field3982 = 3;
            }
            int var3 = 58 / ((arg0 + 3) / 38);
            if (class280.field3982 != 3) {
                return -1;
            }
            int var4 = class265.field3848.method524((byte) 82);
            if (var4 < 1) {
                return -1;
            }
            if (var4 > class74.field977 - class292.field4258) {
                var4 = class74.field977 - class292.field4258;
            }
            class265.field3848.method522(class292.field4258, class279.field3980, var4, (byte) 71);
            class292.field4258 += var4;
            if (class292.field4258 < class74.field977) {
                return -1;
            } else if (class221.method1605((byte) -33, class279.field3980)) {
                int var5 = 0;
                class217.field3063 = new class196[class44.field546];
                for (int var6 = class74.field974; var6 <= class249.field3621; var6++) {
                    class196 var7 = class357.method2478((byte) -24, var6);
                    if (var7 != null) {
                        class217.field3063[var5++] = var7;
                    }
                }
                class265.field3848.method526(-19055);
                class279.field3980 = null;
                class280.field3982 = 0;
                class74.field979 = 0;
                class265.field3848 = null;
                class238.field3444 = class6.method37(10828);
                return 0;
            } else {
                return class247.method1732((byte) 9, 1002);
            }
        } catch (IOException var9) {
            return class247.method1732((byte) 9, 1003);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)I", line = 364)
    public static final int method2151(byte arg0, int arg1, int arg2) {
        field4528++;
        if (arg1 == -2) {
            return 12345678;
        }
        if (arg0 != -77) {
            field4544 = 121;
        }
        if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 417)
    public static void method2152(int arg0) {
        field4539 = null;
        field4524 = null;
        if (arg0 != 12345678) {
            method2148(true, -78, false, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (class70) null, (byte) 53, (int[][]) ((int[][]) null), 73, 58, (byte) 44, 17, true, 46, (float[][]) ((float[][]) null), -105, -18, (boolean[]) null, (int[][]) ((int[][]) null), -57, (int[]) null, true);
        }
    }
}
