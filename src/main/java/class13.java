import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class13 {

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    private int field252 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "[[I")
    public int[][] field258;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Z")
    public static boolean field238 = true;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIB)V")
    private final void method119(int arg0, int arg1, int arg2, byte arg3) {
        this.field258[arg1][arg0] = class182.method1314(this.field258[arg1][arg0], arg2);
        field247++;
        int var5 = 74 / ((42 - arg3) / 51);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public final void method120(int arg0) {
        field260++;
        if (arg0 < 75) {
            this.field252 = -102;
        }
        for (int var2 = 0; var2 < this.field236; var2++) {
            for (int var3 = 0; var3 < this.field254; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field236 - 5) || (this.field254 - 5) <= var3) {
                    this.field258[var2][var3] = 16777215;
                } else {
                    this.field258[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method121(int arg0) {
        class69.field1525.method1650(52);
        if (arg0 > -50) {
            field238 = true;
        }
        field257++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIIII)V")
    public final void method122(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field252;
        int var8 = arg2 - this.field244;
        if (arg5 < 74) {
            this.method134(-102, -21, -75);
        }
        field255++;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method119(var8, var7, 128, (byte) 95);
                this.method119(var8, var7 - 1, 8, (byte) -36);
            }
            if (arg3 == 1) {
                this.method119(var8, var7, 2, (byte) 96);
                this.method119(var8 + 1, var7, 32, (byte) -39);
            }
            if (arg3 == 2) {
                this.method119(var8, var7, 8, (byte) 96);
                this.method119(var8, var7 + 1, 128, (byte) -106);
            }
            if (arg3 == 3) {
                this.method119(var8, var7, 32, (byte) -126);
                this.method119(var8 - 1, var7, 2, (byte) 95);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method119(var8, var7, 1, (byte) 115);
                this.method119(var8 + 1, var7 - 1, 16, (byte) -29);
            }
            if (arg3 == 1) {
                this.method119(var8, var7, 4, (byte) -26);
                this.method119(var8 + 1, var7 + 1, 64, (byte) 93);
            }
            if (arg3 == 2) {
                this.method119(var8, var7, 16, (byte) -80);
                this.method119(var8 - 1, var7 - -1, 1, (byte) -74);
            }
            if (arg3 == 3) {
                this.method119(var8, var7, 64, (byte) -94);
                this.method119(var8 - 1, var7 - 1, 4, (byte) -71);
            }
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method119(var8, var7, 130, (byte) -60);
                this.method119(var8, var7 - 1, 8, (byte) -41);
                this.method119(var8 + 1, var7, 32, (byte) 94);
            }
            if (arg3 == 1) {
                this.method119(var8, var7, 10, (byte) -112);
                this.method119(var8 + 1, var7, 32, (byte) -52);
                this.method119(var8, var7 + 1, 128, (byte) 126);
            }
            if (arg3 == 2) {
                this.method119(var8, var7, 40, (byte) 122);
                this.method119(var8, var7 + 1, 128, (byte) -62);
                this.method119(var8 - 1, var7, 2, (byte) 127);
            }
            if (arg3 == 3) {
                this.method119(var8, var7, 160, (byte) -40);
                this.method119(var8 - 1, var7, 2, (byte) -23);
                this.method119(var8, var7 - 1, 8, (byte) -66);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method119(var8, var7, 65536, (byte) 117);
                this.method119(var8, var7 - 1, 4096, (byte) -62);
            }
            if (arg3 == 1) {
                this.method119(var8, var7, 1024, (byte) -81);
                this.method119(var8 + 1, var7, 16384, (byte) 105);
            }
            if (arg3 == 2) {
                this.method119(var8, var7, 4096, (byte) -98);
                this.method119(var8, var7 + 1, 65536, (byte) 111);
            }
            if (arg3 == 3) {
                this.method119(var8, var7, 16384, (byte) -73);
                this.method119(var8 - 1, var7, 1024, (byte) -104);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method119(var8, var7, 512, (byte) 105);
                this.method119(var8 + 1, var7 + -1, 8192, (byte) 125);
            }
            if (arg3 == 1) {
                this.method119(var8, var7, 2048, (byte) 118);
                this.method119(var8 + 1, var7 - -1, 32768, (byte) -83);
            }
            if (arg3 == 2) {
                this.method119(var8, var7, 8192, (byte) 110);
                this.method119(var8 - 1, var7 + 1, 512, (byte) 93);
            }
            if (arg3 == 3) {
                this.method119(var8, var7, 32768, (byte) 117);
                this.method119(var8 - 1, var7 + -1, 2048, (byte) 126);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method119(var8, var7, 66560, (byte) 117);
            this.method119(var8, var7 - 1, 4096, (byte) 100);
            this.method119(var8 + 1, var7, 16384, (byte) -23);
        }
        if (arg3 == 1) {
            this.method119(var8, var7, 5120, (byte) -77);
            this.method119(var8 + 1, var7, 16384, (byte) -115);
            this.method119(var8, var7 + 1, 65536, (byte) 104);
        }
        if (arg3 == 2) {
            this.method119(var8, var7, 20480, (byte) -64);
            this.method119(var8, var7 + 1, 65536, (byte) 122);
            this.method119(var8 - 1, var7, 1024, (byte) -106);
        }
        if (arg3 == 3) {
            this.method119(var8, var7, 81920, (byte) -33);
            this.method119(var8 - 1, var7, 1024, (byte) 118);
            this.method119(var8, var7 - 1, 4096, (byte) -25);
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIII)V")
    public final void method123(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field252;
        int var8 = arg1 - this.field244;
        field235++;
        if (arg3 != 1) {
            field238 = true;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method127(128, var7, (byte) 107, var8);
                this.method127(8, var7 - 1, (byte) 107, var8);
            }
            if (arg4 == 1) {
                this.method127(2, var7, (byte) 107, var8);
                this.method127(32, var7, (byte) 107, var8 + 1);
            }
            if (arg4 == 2) {
                this.method127(8, var7, (byte) 107, var8);
                this.method127(128, var7 + 1, (byte) 107, var8);
            }
            if (arg4 == 3) {
                this.method127(32, var7, (byte) 107, var8);
                this.method127(2, var7, (byte) 107, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method127(1, var7, (byte) 107, var8);
                this.method127(16, var7 - 1, (byte) 107, var8 + 1);
            }
            if (arg4 == 1) {
                this.method127(4, var7, (byte) 107, var8);
                this.method127(64, var7 + 1, (byte) 107, var8 + 1);
            }
            if (arg4 == 2) {
                this.method127(16, var7, (byte) 107, var8);
                this.method127(1, var7 + 1, (byte) 107, var8 - 1);
            }
            if (arg4 == 3) {
                this.method127(64, var7, (byte) 107, var8);
                this.method127(4, var7 - 1, (byte) 107, var8 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method127(130, var7, (byte) 107, var8);
                this.method127(8, var7 - 1, (byte) 107, var8);
                this.method127(32, var7, (byte) 107, var8 + 1);
            }
            if (arg4 == 1) {
                this.method127(10, var7, (byte) 107, var8);
                this.method127(32, var7, (byte) 107, var8 + 1);
                this.method127(128, var7 + 1, (byte) 107, var8);
            }
            if (arg4 == 2) {
                this.method127(40, var7, (byte) 107, var8);
                this.method127(128, var7 + 1, (byte) 107, var8);
                this.method127(2, var7, (byte) 107, var8 - 1);
            }
            if (arg4 == 3) {
                this.method127(160, var7, (byte) 107, var8);
                this.method127(2, var7, (byte) 107, var8 - 1);
                this.method127(8, var7 - 1, (byte) 107, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method127(65536, var7, (byte) 107, var8);
                this.method127(4096, var7 - 1, (byte) 107, var8);
            }
            if (arg4 == 1) {
                this.method127(1024, var7, (byte) 107, var8);
                this.method127(16384, var7, (byte) 107, var8 + 1);
            }
            if (arg4 == 2) {
                this.method127(4096, var7, (byte) 107, var8);
                this.method127(65536, var7 + 1, (byte) 107, var8);
            }
            if (arg4 == 3) {
                this.method127(16384, var7, (byte) 107, var8);
                this.method127(1024, var7, (byte) 107, var8 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method127(512, var7, (byte) 107, var8);
                this.method127(8192, var7 - 1, (byte) 107, var8 + 1);
            }
            if (arg4 == 1) {
                this.method127(2048, var7, (byte) 107, var8);
                this.method127(32768, var7 + 1, (byte) 107, var8 + 1);
            }
            if (arg4 == 2) {
                this.method127(8192, var7, (byte) 107, var8);
                this.method127(512, var7 + 1, (byte) 107, var8 - 1);
            }
            if (arg4 == 3) {
                this.method127(32768, var7, (byte) 107, var8);
                this.method127(2048, var7 - 1, (byte) 107, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method127(66560, var7, (byte) 107, var8);
            this.method127(4096, var7 - 1, (byte) 107, var8);
            this.method127(16384, var7, (byte) 107, var8 + 1);
        }
        if (arg4 == 1) {
            this.method127(5120, var7, (byte) 107, var8);
            this.method127(16384, var7, (byte) 107, var8 + 1);
            this.method127(65536, var7 + 1, (byte) 107, var8);
        }
        if (arg4 == 2) {
            this.method127(20480, var7, (byte) 107, var8);
            this.method127(65536, var7 + 1, (byte) 107, var8);
            this.method127(1024, var7, (byte) 107, var8 - 1);
        }
        if (arg4 == 3) {
            this.method127(81920, var7, (byte) 107, var8);
            this.method127(1024, var7, (byte) 107, var8 - 1);
            this.method127(4096, var7 - 1, (byte) 107, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIZIIBI)Z")
    public static final boolean method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, byte arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class87.field1782[var12][var31] = 0;
                class121.field2391[var12][var31] = 99999999;
            }
        }
        class87.field1782[arg5][arg9] = 99;
        field237++;
        class121.field2391[arg5][arg9] = 0;
        int var13 = arg5;
        boolean var14 = false;
        int var15 = 0;
        byte var16 = 0;
        class195.field3509[var16] = arg5;
        int var17 = arg9;
        int var32 = var16 + 1;
        class132.field2594[var16] = arg9;
        int[][] var18 = class100.field2032[class159.field2998].field258;
        while (var15 != var32) {
            var13 = class195.field3509[var15];
            var17 = class132.field2594[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg1 == var13 && arg6 == var17) {
                var14 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class100.field2032[class159.field2998].method136(arg1, arg0, arg11 - 1, var17, var13, arg6, 2, (byte) 70)) {
                    var14 = true;
                    break;
                }
                if (arg11 < 10 && class100.field2032[class159.field2998].method129(arg1, 2, var17, arg6, 85, arg0, arg11 - 1, var13)) {
                    var14 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg8 != 0 && class100.field2032[class159.field2998].method125(var17, 16168, arg8, var13, arg2, arg1, 2, arg6, arg4)) {
                var14 = true;
                break;
            }
            int var30 = class121.field2391[var13][var17] + 1;
            if (var13 > 0 && class87.field1782[var13 - 1][var17] == 0 && (var18[var13 - 1][var17] & 0x12C010E) == 0 && (var18[var13 - 1][var17 + 1] & 0x12C0138) == 0) {
                class195.field3509[var32] = var13 - 1;
                class132.field2594[var32] = var17;
                var32 = var32 + 1 & 0xFFF;
                class87.field1782[var13 - 1][var17] = 2;
                class121.field2391[var13 - 1][var17] = var30;
            }
            if (var13 < 102 && class87.field1782[var13 + 1][var17] == 0 && (var18[var13 + 2][var17] & 0x12C0183) == 0 && (var18[var13 + 2][var17 + 1] & 0x12C01E0) == 0) {
                class195.field3509[var32] = var13 + 1;
                class132.field2594[var32] = var17;
                var32 = var32 + 1 & 0xFFF;
                class87.field1782[var13 + 1][var17] = 8;
                class121.field2391[var13 + 1][var17] = var30;
            }
            if (var17 > 0 && class87.field1782[var13][var17 - 1] == 0 && (var18[var13][var17 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var17 - 1] & 0x12C0183) == 0) {
                class195.field3509[var32] = var13;
                class132.field2594[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class87.field1782[var13][var17 - 1] = 1;
                class121.field2391[var13][var17 - 1] = var30;
            }
            if (var17 < 102 && class87.field1782[var13][var17 + 1] == 0 && (var18[var13][var17 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var17 + 2] & 0x12C01E0) == 0) {
                class195.field3509[var32] = var13;
                class132.field2594[var32] = var17 + 1;
                class87.field1782[var13][var17 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class121.field2391[var13][var17 + 1] = var30;
            }
            if (var13 > 0 && var17 > 0 && class87.field1782[var13 - 1][var17 - 1] == 0 && (var18[var13 - 1][var17] & 0x12C0138) == 0 && (var18[var13 - 1][var17 - 1] & 0x12C010E) == 0 && (var18[var13][var17 - 1] & 0x12C0183) == 0) {
                class195.field3509[var32] = var13 - 1;
                class132.field2594[var32] = var17 - 1;
                class87.field1782[var13 - 1][var17 - 1] = 3;
                class121.field2391[var13 - 1][var17 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var17 > 0 && class87.field1782[var13 + 1][var17 - 1] == 0 && (var18[var13 + 1][var17 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var17 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var17] & 0x12C01E0) == 0) {
                class195.field3509[var32] = var13 + 1;
                class132.field2594[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class87.field1782[var13 + 1][var17 - 1] = 9;
                class121.field2391[var13 + 1][var17 - 1] = var30;
            }
            if (var13 > 0 && var17 < 102 && class87.field1782[var13 - 1][var17 + 1] == 0 && (var18[var13 - 1][var17 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var17 + 2] & 0x12C0138) == 0 && (var18[var13][var17 + 2] & 0x12C01E0) == 0) {
                class195.field3509[var32] = var13 - 1;
                class132.field2594[var32] = var17 + 1;
                class87.field1782[var13 - 1][var17 + 1] = 6;
                class121.field2391[var13 - 1][var17 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var17 < 102 && class87.field1782[var13 + 1][var17 + 1] == 0 && (var18[var13 + 1][var17 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var17 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var17 + 1] & 0x12C0183) == 0) {
                class195.field3509[var32] = var13 + 1;
                class132.field2594[var32] = var17 + 1;
                class87.field1782[var13 + 1][var17 + 1] = 12;
                class121.field2391[var13 + 1][var17 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class1.field14 = 0;
        if (!var14) {
            if (!arg7) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg1 - var21; var22 <= arg1 + var21; var22++) {
                for (int var23 = arg6 - var21; var23 <= (arg6 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class121.field2391[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg6 > var23) {
                            var25 = arg6 - var23;
                        } else if (var23 > (arg6 + arg8 - 1)) {
                            var25 = var23 + 1 - arg6 - arg8;
                        }
                        if (var22 < arg1) {
                            var24 = arg1 - var22;
                        } else if ((arg1 + arg2 - 1) < var22) {
                            var24 = var22 + 1 - (arg1 - -arg2);
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var19 > var26 || var19 == var26 && class121.field2391[var22][var23] < var20) {
                            var17 = var23;
                            var13 = var22;
                            var19 = var26;
                            var20 = class121.field2391[var22][var23];
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg5 == var13 && arg9 == var17) {
                return false;
            }
            class1.field14 = 1;
        }
        byte var27 = 0;
        class195.field3509[var27] = var13;
        int var33 = var27 + 1;
        class132.field2594[var27] = var17;
        int var28;
        int var29 = var28 = class87.field1782[var13][var17];
        while (arg5 != var13 || arg9 != var17) {
            if (var28 != var29) {
                var28 = var29;
                class195.field3509[var33] = var13;
                class132.field2594[var33++] = var17;
            }
            if ((var29 & 0x1) != 0) {
                var17++;
            } else if ((var29 & 0x4) != 0) {
                var17--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class87.field1782[var13][var17];
        }
        if (var33 > 0) {
            class137.method1031((byte) -128, arg3, var33);
            return true;
        }
        if (arg10 != -12) {
            method128(-35);
        }
        if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field240++;
        if (arg6 > 1) {
            return this.method126(arg0, arg3, true, arg5, arg7, arg2, arg4, arg6, arg6) ? true : this.method137(arg0, arg6, 65536, arg7, arg5, arg3, arg6, arg8, arg2, arg4);
        }
        int var10 = arg7 + arg2 - 1;
        int var11 = arg5 + arg4 - 1;
        if (arg5 <= arg3 && var11 >= arg3 && arg0 >= arg7 && arg0 <= var10) {
            return true;
        } else if (arg5 - 1 == arg3 && arg7 <= arg0 && arg0 <= var10 && (this.field258[arg3 - this.field252][arg0 - this.field244] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg3 && arg7 <= arg0 && arg0 <= var10 && (this.field258[arg3 - this.field252][arg0 - this.field244] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg1 != 16168) {
            return false;
        } else if ((arg7 - 1) == arg0 && arg3 >= arg5 && var11 >= arg3 && (this.field258[arg3 - this.field252][arg0 - this.field244] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg3 >= arg5 && arg3 <= var11 && (this.field258[arg3 - this.field252][arg0 - this.field244] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIIIIII)Z")
    private final boolean method126(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg2) {
            method124(-70, 110, -58, -67, -69, -127, -118, false, 90, 106, (byte) 106, 17);
        }
        field259++;
        if (arg3 + arg6 > arg1 && (arg1 + arg8) > arg3) {
            return (arg4 + arg5) > arg0 && arg4 < (arg0 + arg7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBI)V")
    private final void method127(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 107) {
            this.method125(-12, 51, -10, 35, 85, 121, -94, 47, -67);
        }
        field243++;
        this.field258[arg1][arg3] = class68.method612(this.field258[arg1][arg3], ~arg0);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
    public static final int method128(int arg0) {
        field250++;
        if (arg0 != 16) {
            field238 = false;
        }
        return 16;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field245++;
        if (arg1 == 1) {
            if (arg0 == arg7 && arg2 == arg3) {
                return true;
            }
        } else if (arg0 >= arg7 && arg7 + arg1 - 1 >= arg0 && arg3 <= arg3 && arg1 + arg3 - 1 >= arg3) {
            return true;
        }
        int var9 = 56 / ((-arg4 - 11) / 38);
        int var10 = arg7 - this.field252;
        int var11 = arg0 - this.field252;
        int var12 = arg3 - this.field244;
        int var13 = arg2 - this.field244;
        if (arg1 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var11 + 1) == var10 && var12 == var13 && (this.field258[var10][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field258[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - 1 == var10 && var12 == var13 && (this.field258[var10][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var13 && (this.field258[var10][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var11 - 1) == var10 && var12 == var13 && (this.field258[var10][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var13 && (this.field258[var10][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var11 + 1) == var10 && var12 == var13 && (this.field258[var10][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var13 && (this.field258[var10][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 == var11 && var12 + 1 == var13 && (this.field258[var10][var13] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var13 && (this.field258[var10][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var12 == var13 && (this.field258[var10][var13] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var12 == var13 && (this.field258[var10][var13] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg1 + var10 - 1;
            int var15 = arg1 + var13 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var11 + 1) == var10 && var13 <= var12 && var15 >= var12 && (this.field258[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && (var12 - arg1) == var13 && (this.field258[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var11 - arg1 == var10 && var13 <= var12 && var12 <= var15 && (this.field258[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && (var12 - arg1) == var13 && (this.field258[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var11 - arg1 == var10 && var13 <= var12 && var12 <= var15 && (this.field258[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && (var12 + 1) == var13 && (this.field258[var11][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var11 + 1 == var10 && var13 <= var12 && var15 >= var12 && (this.field258[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && (var12 + 1) == var13 && (this.field258[var11][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 <= var11 && var11 <= var14 && var12 + 1 == var13 && (this.field258[var11][var13] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var11 && var14 >= var11 && (var12 - arg1) == var13 && (this.field258[var11][var15] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg1 == var10 && var13 <= var12 && var12 <= var15 && (this.field258[var14][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var13 <= var12 && var15 >= var12 && (this.field258[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZIII)V")
    public final void method130(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field244;
        field253++;
        int var9 = 256;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg1;
            arg1 = arg4;
            arg4 = var10;
        }
        if (arg3) {
            var9 += 131072;
        }
        int var11 = arg0 - this.field252;
        int var12 = var11;
        if (arg6 > -117) {
            this.method126(-114, 33, false, -121, -16, 86, -123, -79, 57);
        }
        while (var12 < arg1 + var11) {
            if (var12 >= 0 && this.field236 > var12) {
                for (int var13 = var8; var13 < (arg4 + var8); var13++) {
                    if (var13 >= 0 && var13 < this.field254) {
                        this.method127(var9, var12, (byte) 107, var13);
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static final void method131(int arg0) {
        if (arg0 != 130) {
            field238 = false;
        }
        field249++;
        class14.field303.method1650(80);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII)V")
    public final void method132(byte arg0, int arg1, int arg2) {
        if (arg0 != -28) {
            this.method132((byte) -69, 49, -31);
        }
        int var4 = arg1 - this.field252;
        int var5 = arg2 - this.field244;
        field251++;
        this.field258[var4][var5] = class182.method1314(this.field258[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZII)V")
    public final void method133(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field252;
        field246++;
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field244;
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && var10 < this.field236) {
                for (int var11 = var9; var11 < var9 + arg5; var11++) {
                    if (var11 >= 0 && var11 < this.field254) {
                        this.method119(var11, var10, var8, (byte) -65);
                    }
                }
            }
        }
        if (arg0 >= -94) {
            this.method123(0, 118, false, 7, -27, 5);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public final void method134(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field244;
        int var5 = arg1 - this.field252;
        field248++;
        this.field258[var5][var4] = class182.method1314(this.field258[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)V")
    public final void method135(int arg0, byte arg1, int arg2) {
        int var4 = 33 % ((arg1 + 36) / 58);
        int var5 = arg2 - this.field244;
        int var6 = arg0 - this.field252;
        this.field258[var6][var5] = class68.method612(this.field258[var6][var5], -262145);
        field242++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field256++;
        if (arg6 == 1) {
            if (arg0 == arg4 && arg3 == arg5) {
                return true;
            }
        } else if (arg4 <= arg0 && arg0 <= arg4 - (1 - arg6) && arg5 <= arg5 && arg5 <= arg5 + arg6 - 1) {
            return true;
        }
        int var9 = arg3 - this.field244;
        if (arg7 != 70) {
            this.method129(-30, -18, 57, -112, 101, 88, -89, 48);
        }
        int var10 = arg0 - this.field252;
        int var11 = arg5 - this.field244;
        int var12 = arg4 - this.field252;
        if (arg6 == 1) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field258[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field258[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 == var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field258[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field258[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9 && (this.field258[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var9 && (this.field258[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var9 && (this.field258[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var9 && (this.field258[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var12 && var11 + 1 == var9 && (this.field258[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var11 - 1 == var9 && (this.field258[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field258[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field258[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var9 - 1;
            int var14 = arg6 + var12 - 1;
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if ((var10 - arg6) == var12 && var11 >= var9 && var13 >= var11) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && (var11 + 1) == var9 && (this.field258[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var14 && (var11 - arg6) == var9 && (this.field258[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 >= var12 && var10 <= var14 && (var11 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - arg6) == var12 && var11 >= var9 && var11 <= var13 && (this.field258[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var13 && (this.field258[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var12 && var9 <= var11 && var11 <= var13) {
                        return true;
                    }
                    if (var12 <= var10 && var14 >= var10 && (var11 + 1) == var9 && (this.field258[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var14 && var11 - arg6 == var9 && (this.field258[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 >= var12 && var14 >= var10 && var11 - arg6 == var9) {
                        return true;
                    }
                    if ((var10 - arg6) == var12 && var11 >= var9 && var13 >= var11 && (this.field258[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var13 >= var11 && (this.field258[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if ((var10 - arg6) == var12 && var9 <= var11 && var13 >= var11) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var13 >= var11 && (this.field258[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var14 >= var10 && (var11 - arg6) == var9 && (this.field258[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 - arg6 == var12 && var9 <= var11 && var13 >= var11 && (this.field258[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 <= var11 && var11 <= var13) {
                        return true;
                    }
                    if (var10 >= var12 && var14 >= var10 && var11 - arg6 == var9 && (this.field258[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - arg6 == var12 && var9 <= var11 && var13 >= var11 && (this.field258[var14][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var14 && (var11 + 1) == var9 && (this.field258[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 >= var9 && var11 <= var13) {
                        return true;
                    }
                    if (var12 <= var10 && var14 >= var10 && var11 - arg6 == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - arg6) == var12 && var11 >= var9 && var11 <= var13) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var14 && var11 + 1 == var9 && (this.field258[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 >= var9 && var13 >= var11 && (this.field258[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var14 && var11 - arg6 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var12 <= var10 && var14 >= var10 && var11 + 1 == var9 && (this.field258[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var14 >= var10 && (var11 - arg6) == var9 && (this.field258[var10][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var10 - arg6) == var12 && var11 >= var9 && var11 <= var13 && (this.field258[var14][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 >= var9 && var13 >= var11 && (this.field258[var12][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg1 + arg5;
        field239++;
        int var12 = arg0 + arg6;
        if (arg2 != 65536) {
            this.method126(-26, -29, true, 81, 62, 108, 93, 127, -45);
        }
        int var13 = arg4 + arg9;
        int var14 = arg3 + arg8;
        if (arg4 <= arg5 && arg5 < var13) {
            if (arg3 == var12 && (arg7 & 0x4) == 0) {
                int var15 = var13 >= var11 ? var11 : var13;
                for (int var16 = arg5; var16 < var15; var16++) {
                    if ((this.field258[var16 - this.field252][var12 - (this.field244 + 1)] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg7 & 0x1) == 0) {
                int var17 = arg5;
                int var18 = var13 < var11 ? var13 : var11;
                while (var18 > var17) {
                    if ((this.field258[var17 - this.field252][arg0 - this.field244] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg4 < var11 && var13 >= var11) {
            if (arg3 == var12 && (arg7 & 0x4) == 0) {
                for (int var19 = arg4; var19 < var11; var19++) {
                    if ((this.field258[var19 - this.field252][var12 - this.field244 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var14 && (arg7 & 0x1) == 0) {
                for (int var20 = arg4; var20 < var11; var20++) {
                    if ((this.field258[var20 - this.field252][arg0 - this.field244] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg3 <= arg0 && arg0 < var14) {
            if (arg4 == var11 && (arg7 & 0x8) == 0) {
                int var21 = arg0;
                int var22 = var14 >= var12 ? var12 : var14;
                while (var21 < var22) {
                    if ((this.field258[var11 - this.field252 - 1][var21 - this.field244] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg5 == var13 && (arg7 & 0x2) == 0) {
                int var23 = var12 > var14 ? var14 : var12;
                for (int var24 = arg0; var24 < var23; var24++) {
                    if ((this.field258[arg5 - this.field252][var24 - this.field244] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var12 > arg3 && var12 <= var14) {
            if (arg4 == var11 && (arg7 & 0x8) == 0) {
                for (int var25 = arg3; var25 < var12; var25++) {
                    if ((this.field258[var11 - this.field252 - 1][var25 - this.field244] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var13 && (arg7 & 0x2) == 0) {
                for (int var26 = arg3; var26 < var12; var26++) {
                    if ((this.field258[arg5 - this.field252][var26 - this.field244] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V")
    public class13(int arg0, int arg1) {
        this.field236 = arg0;
        this.field244 = 0;
        this.field254 = arg1;
        this.field258 = new int[this.field236][this.field254];
        this.method120(80);
    }
}
