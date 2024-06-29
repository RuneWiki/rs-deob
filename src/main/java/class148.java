import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class148 extends class150 {

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "Lda;")
    public class23 field3696 = new class23();

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "Lvc;")
    public class144 field3708 = new class144();

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "Lv;")
    private class141 field3691;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "Lu;")
    private static class135 field3677 = class87.method676((byte) -128, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "Lu;")
    private static class135 field3688 = class87.method676((byte) -122, "World");

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lu;")
    public static class135 field3689 = class87.method676((byte) -112, "mapfunction");

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "Lu;")
    public static class135 field3697 = field3688;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Lu;")
    public static class135 field3680 = class87.method676((byte) -68, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "[Lu;")
    public static class135[] field3699 = new class135[100];

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "Lu;")
    public static class135 field3685 = field3677;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    public static int field3705 = 0;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Lu;")
    private static class135 field3681 = class87.method676((byte) -84, "Close");

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "I")
    public static volatile int field3701 = 0;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "Lu;")
    public static class135 field3676 = field3688;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Lu;")
    public static class135 field3683 = field3681;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "[I")
    public static int[] field3706 = new int[1000];

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "Lpe;")
    public static class109 field3679;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Lae;")
    public static class6 field3686;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lce;II)V")
    private final void method1208(class20 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field3691 = null;
        }
        field3673++;
        if ((this.field3691.field3426[arg0.field483] & 0x4) != 0 && arg0.field457 < 0) {
            int var4 = this.field3691.field3431[arg0.field483] / class138.field3361;
            int var5 = (var4 + 1048575 - arg0.field453) / var4;
            arg0.field453 = arg2 * var4 + arg0.field453 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field3691.field3461[arg0.field483] == 0) {
                    arg0.field448 = class92.method736(arg0.field462, arg0.field448.method730(), arg0.field448.method733(), arg0.field448.method742());
                } else {
                    arg0.field448 = class92.method736(arg0.field462, arg0.field448.method730(), 0, arg0.field448.method742());
                    this.field3691.method1146(arg0.field484.field1922[arg0.field467] < 0, arg0, arg1 + 66);
                }
                if (arg0.field484.field1922[arg0.field467] < 0) {
                    arg0.field448.method723(-1);
                }
                arg2 = arg0.field453 / var4;
            }
        }
        arg0.field448.method748(arg2);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "()I")
    public final int method721() {
        field3700++;
        return 0;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "()Lwc;")
    public final class150 method732() {
        class20 var1 = (class20) this.field3696.method182((byte) 50);
        field3675++;
        if (var1 == null) {
            return null;
        } else if (var1.field448 == null) {
            return this.method720();
        } else {
            return var1.field448;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()Lwc;")
    public final class150 method720() {
        field3695++;
        class20 var1;
        do {
            var1 = (class20) this.field3696.method181((byte) 124);
            if (var1 == null) {
                return null;
            }
        } while (var1.field448 == null);
        return var1.field448;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILae;)V")
    public static final void method1209(int arg0, class6 arg1) {
        field3678++;
        if (arg0 != -30847) {
            field3685 = null;
        }
        for (int var2 = 0; var2 < class5.field130.length; var2++) {
            class5.field130[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class5.field130[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class49.field1173[var15] = (class5.field130[var15 + 1] + class5.field130[var15 - 128] + class5.field130[var15 + 128] + class5.field130[var15 + -1]) / 4;
                }
            }
            int[] var13 = class5.field130;
            class5.field130 = class49.field1173;
            class49.field1173 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field134; var7++) {
            for (int var8 = 0; var8 < arg1.field132; var8++) {
                if (arg1.field137[var6++] != 0) {
                    int var9 = arg1.field138 + var8 + 16;
                    int var10 = var7 + arg1.field135 + 16;
                    int var11 = var9 + (var10 << 7);
                    class5.field130[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public static final void method1210(int arg0) {
        class138.field3342.method234(arg0 ^ 0x588F);
        if (arg0 == -7) {
            field3682++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)V")
    public static final void method1211(int arg0, int arg1, int arg2, int arg3) {
        field3690++;
        if (arg0 != -19934) {
            return;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class68.field1682[arg2][arg3 + var4][arg1 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class68.field1682[arg2][arg3][arg1 + var5] = class68.field1682[arg2][arg3 - 1][arg1 + var5];
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class68.field1682[arg2][arg3 + var6][arg1] = class68.field1682[arg2][arg3 + var6][arg1 - 1];
            }
        }
        if (arg3 > 0 && class68.field1682[arg2][arg3 - 1][arg1] != 0) {
            class68.field1682[arg2][arg3][arg1] = class68.field1682[arg2][arg3 - 1][arg1];
        } else if (arg1 > 0 && class68.field1682[arg2][arg3][arg1 - 1] != 0) {
            class68.field1682[arg2][arg3][arg1] = class68.field1682[arg2][arg3][arg1 - 1];
        } else if (arg3 > 0 && arg1 > 0 && class68.field1682[arg2][arg3 - 1][arg1 - 1] != 0) {
            class68.field1682[arg2][arg3][arg1] = class68.field1682[arg2][arg3 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([ILce;IIII)V")
    private final void method1212(int[] arg0, class20 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 > -17) {
            return;
        }
        if ((this.field3691.field3426[arg1.field483] & 0x4) != 0 && arg1.field457 < 0) {
            int var7 = this.field3691.field3431[arg1.field483] / class138.field3361;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field453) / var7;
                if (arg3 < var8) {
                    arg1.field453 += arg3 * var7;
                    break;
                }
                arg1.field448.method709(arg0, arg5, var8);
                arg5 += var8;
                arg1.field453 += var7 * var8 - 1048576;
                int var9 = class138.field3361 / 100;
                arg3 -= var8;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class92 var11 = arg1.field448;
                if (this.field3691.field3461[arg1.field483] == 0) {
                    arg1.field448 = class92.method736(arg1.field462, var11.method730(), var11.method733(), var11.method742());
                } else {
                    arg1.field448 = class92.method736(arg1.field462, var11.method730(), 0, var11.method742());
                    this.field3691.method1146(arg1.field484.field1922[arg1.field467] < 0, arg1, 79);
                    arg1.field448.method745(var9, var11.method733());
                }
                if (arg1.field484.field1922[arg1.field467] < 0) {
                    arg1.field448.method723(-1);
                }
                var11.method735(var9);
                var11.method709(arg0, arg5, arg2 - arg5);
                if (var11.method734()) {
                    this.field3708.method1179(var11);
                }
            }
        }
        arg1.field448.method709(arg0, arg5, arg3);
        field3674++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
    public static final void method1213(int arg0, byte arg1) {
        field3704++;
        if (arg1 > -42) {
            method1209(20, null);
        }
        class42.method315(false, arg0);
        class143.method1175(arg0, 115);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([III)V")
    public final void method709(int[] arg0, int arg1, int arg2) {
        this.field3708.method709(arg0, arg1, arg2);
        field3684++;
        for (class20 var4 = (class20) this.field3696.method182((byte) 50); var4 != null; var4 = (class20) this.field3696.method181((byte) 66)) {
            if (!this.field3691.method1163((byte) 122, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field480 >= var5) {
                        this.method1212(arg0, var4, var5 + var6, var5, -96, var6);
                        var4.field480 -= var5;
                        break;
                    }
                    this.method1212(arg0, var4, var6 + var5, var4.field480, -69, var6);
                    var5 -= var4.field480;
                    var6 += var4.field480;
                } while (!this.field3691.method1162(-11651, var5, var6, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public final void method748(int arg0) {
        field3687++;
        this.field3708.method748(arg0);
        for (class20 var2 = (class20) this.field3696.method182((byte) 50); var2 != null; var2 = (class20) this.field3696.method181((byte) 23)) {
            if (!this.field3691.method1163((byte) 82, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field480) {
                        this.method1208(var2, -1, var3);
                        var2.field480 -= var3;
                        break;
                    }
                    this.method1208(var2, -1, var2.field480);
                    var3 -= var2.field480;
                } while (!this.field3691.method1162(-11651, var3, 0, var2, null));
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
    public static void method1214(int arg0) {
        field3676 = null;
        field3680 = null;
        field3677 = null;
        field3683 = null;
        field3679 = null;
        field3686 = null;
        field3681 = null;
        field3706 = null;
        field3688 = null;
        field3699 = null;
        field3685 = null;
        if (arg0 < 3) {
            field3686 = null;
        }
        field3689 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    public static final void method1215(int arg0) {
        field3703++;
        if (class107.field2570 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class107.field2570 > 768) {
                    class29.field707[var1] = class12.method92(class56.field1357[var1], true, client.field534[var1], 1024 - class107.field2570);
                } else if (class107.field2570 <= 256) {
                    class29.field707[var1] = class12.method92(client.field534[var1], true, class56.field1357[var1], 256 - class107.field2570);
                } else {
                    class29.field707[var1] = client.field534[var1];
                }
            }
        } else if (class117.field2802 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class29.field707[var2] = class56.field1357[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class117.field2802 > 768) {
                    class29.field707[var3] = class12.method92(class56.field1357[var3], true, class152.field3742[var3], 1024 - class117.field2802);
                } else if (class117.field2802 <= 256) {
                    class29.field707[var3] = class12.method92(class152.field3742[var3], true, class56.field1357[var3], 256 - class117.field2802);
                } else {
                    class29.field707[var3] = class152.field3742[var3];
                }
            }
        }
        short var4 = 256;
        class70.method573(0, 9, 128, var4 + 7);
        int var5 = 6885;
        int var6 = 0;
        class128.field3090.method70(0, 0);
        class70.method561();
        for (int var7 = 1; var7 < var4 - 1; var7++) {
            int var20 = (var4 - var7) * class123.field2944[var7] / var4;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class38.field879[var6++];
                if (var23 == 0) {
                    var5++;
                } else {
                    int var24 = class113.field2739.field2921[var5];
                    int var25 = 256 - var23;
                    int var27 = class29.field707[var23];
                    class113.field2739.field2921[var5++] = class4.method19(var25 * class4.method19(65280, var24) + var23 * class4.method19(var27, 65280), 16711680) + class4.method19(-16711936, class4.method19(var27, 16711935) * var23 + var25 * class4.method19(var24, 16711935)) >> 8;
                }
            }
            var5 += var21 + 765 - 128;
        }
        class70.method573(637, 9, 765, var4 + 7);
        int var8 = 7546;
        class76.field1790.method70(382, 0);
        class70.method561();
        int var9 = 0;
        int var10 = 1;
        if (arg0 != -128) {
            method1216(80, 70, -95, -12, 86, -92, null, -32);
        }
        while (var10 < var4 - 1) {
            int var11 = (var4 - var10) * class123.field2944[var10] / var4;
            int var12 = 103 - var11;
            int var13 = var8 + var11;
            for (int var14 = 0; var14 < var12; var14++) {
                int var15 = class38.field879[var9++];
                if (var15 == 0) {
                    var13++;
                } else {
                    int var17 = 256 - var15;
                    int var18 = class29.field707[var15];
                    int var19 = class113.field2739.field2921[var13];
                    class113.field2739.field2921[var13++] = class4.method19(-16711936, class4.method19(var19, 16711935) * var17 + var15 * class4.method19(var18, 16711935)) + class4.method19(var17 * class4.method19(65280, var19) + var15 * class4.method19(var18, 65280), 16711680) >> 8;
                }
            }
            var8 = var13 + 765 - var12 - var11;
            var9 += 128 - var12;
            var10++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIILic;I)V")
    public static final void method1216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class59 arg6, int arg7) {
        if (arg7 >= 0 && arg7 < 104 && arg2 >= 0 && arg2 < 104) {
            client.field525[arg5][arg7][arg2] = 0;
            while (true) {
                int var8 = arg6.method480(0);
                if (var8 == 0) {
                    if (arg5 == 0) {
                        class68.field1682[0][arg7][arg2] = -class131.method1052(arg7 + arg0 + 932731, arg4 + 556238 + arg2, arg1 + 73) * 8;
                    } else {
                        class68.field1682[arg5][arg7][arg2] = class68.field1682[arg5 - 1][arg7][arg2] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg6.method480(0);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg5 == 0) {
                        class68.field1682[0][arg7][arg2] = -var9 * 8;
                    } else {
                        class68.field1682[arg5][arg7][arg2] = class68.field1682[arg5 - 1][arg7][arg2] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class132.field3197[arg5][arg7][arg2] = arg6.method475(class34.method268(arg1, 49102));
                    class107.field2576[arg5][arg7][arg2] = (byte) ((var8 - 2) / 4);
                    class97.field2354[arg5][arg7][arg2] = (byte) class4.method19(3, var8 + arg3 - 2);
                } else if (var8 <= 81) {
                    client.field525[arg5][arg7][arg2] = (byte) (var8 - 49);
                } else {
                    class44.field1055[arg5][arg7][arg2] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg6.method480(0);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg6.method480(0);
                    break;
                }
                if (var10 <= 49) {
                    arg6.method480(0);
                }
            }
        }
        if (arg1 != -50) {
            field3683 = null;
        }
        field3702++;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lv;)V")
    public class148(class141 arg0) {
        this.field3691 = arg0;
    }
}
