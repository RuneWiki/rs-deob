import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class110 extends class75 {

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "La;")
    public class1 field2749 = new class1();

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "Lpe;")
    public class106 field2764 = new class106();

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Ltc;")
    private class128 field2742;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2752 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "Lrd;")
    private static class117 field2758 = class95.method812("Public chat", (byte) 8);

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lrd;")
    public static class117 field2755 = class95.method812("@yel@*V", (byte) 8);

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "Lrd;")
    public static class117 field2753 = class95.method812("Der Server wird gerade aktualisiert)3", (byte) 8);

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "Lrd;")
    public static class117 field2759 = field2758;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lrd;")
    private static class117 field2756 = class95.method812("Moderator option: Mute player for 48 hours: <OFF>", (byte) 8);

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "Z")
    public static boolean field2760 = false;

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
    public static int field2762 = 0;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "Lrd;")
    public static class117 field2763 = field2756;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "Z")
    public static boolean field2761 = false;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
    public static void method905(int arg0) {
        field2752 = null;
        field2763 = null;
        field2753 = null;
        if (arg0 == 11) {
            field2755 = null;
            field2758 = null;
            field2756 = null;
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()Lkf;")
    public final class75 method436() {
        field2747++;
        class102 var1;
        do {
            var1 = (class102) this.field2749.method14(127);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2565 == null);
        return var1.field2565;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "([III)V")
    public final void method404(int[] arg0, int arg1, int arg2) {
        this.field2764.method404(arg0, arg1, arg2);
        field2743++;
        int var4 = arg1 + arg2;
        for (class102 var5 = (class102) this.field2749.method3(false); var5 != null; var5 = (class102) this.field2749.method14(127)) {
            if (!this.field2742.method1036(var5, (byte) -83)) {
                int var6 = arg1;
                int var7 = arg2;
                do {
                    if (var7 <= var5.field2569) {
                        this.method906(var4, arg0, var5, var6, (byte) 43, var7);
                        var5.field2569 -= var7;
                        break;
                    }
                    this.method906(var4, arg0, var5, var6, (byte) 43, var5.field2569);
                    var7 -= var5.field2569;
                    var6 += var5.field2569;
                } while (!this.field2742.method1027(var5, (byte) 32));
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()Lkf;")
    public final class75 method402() {
        field2746++;
        class102 var1 = (class102) this.field2749.method3(false);
        if (var1 == null) {
            return null;
        } else if (var1.field2565 == null) {
            return this.method436();
        } else {
            return var1.field2565;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public final void method418(int arg0) {
        for (class102 var2 = (class102) this.field2749.method3(false); var2 != null; var2 = (class102) this.field2749.method14(127)) {
            if (!this.field2742.method1036(var2, (byte) -48)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2569) {
                        this.method907(78, var2, var3);
                        var2.field2569 -= var3;
                        break;
                    }
                    this.method907(87, var2, var2.field2569);
                    var3 -= var2.field2569;
                } while (!this.field2742.method1027(var2, (byte) 32));
            }
        }
        field2754++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[ILpa;IBI)V")
    private final void method906(int arg0, int[] arg1, class102 arg2, int arg3, byte arg4, int arg5) {
        field2750++;
        if ((this.field2742.field3086[arg2.field2550] & 0x4) != 0 && arg2.field2558 < 0) {
            int var7 = this.field2742.field3074[arg2.field2550] / class85.field2224;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2568) / var7;
                if (var8 > arg5) {
                    arg2.field2568 += arg5 * var7;
                    break;
                }
                arg2.field2565.method404(arg1, arg3, var8);
                arg3 += var8;
                int var9 = 262144 / var7;
                arg2.field2568 += var7 * var8 - 1048576;
                int var10 = class85.field2224 / 100;
                arg5 -= var8;
                class34 var11 = arg2.field2565;
                if (var9 < var10) {
                    var10 = var9;
                }
                if (this.field2742.field3097[arg2.field2550] == 0) {
                    arg2.field2565 = class34.method432(arg2.field2567, var11.method428(), var11.method419(), var11.method414());
                } else {
                    arg2.field2565 = class34.method432(arg2.field2567, var11.method428(), 0, var11.method414());
                    this.field2742.method1038((byte) 111, arg2, arg2.field2573.field1914[arg2.field2547] < 0);
                    arg2.field2565.method392(var10, var11.method419());
                }
                if (arg2.field2573.field1914[arg2.field2547] < 0) {
                    arg2.field2565.method423(-1);
                }
                var11.method430(var10);
                var11.method404(arg1, arg3, arg0 - arg3);
                if (var11.method424()) {
                    this.field2764.method877(var11);
                }
            }
        }
        arg2.field2565.method404(arg1, arg3, arg5);
        if (arg4 != 43) {
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()I")
    public final int method394() {
        field2745++;
        return 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILpa;I)V")
    private final void method907(int arg0, class102 arg1, int arg2) {
        field2751++;
        if ((this.field2742.field3086[arg1.field2550] & 0x4) != 0 && arg1.field2558 < 0) {
            int var4 = this.field2742.field3074[arg1.field2550] / class85.field2224;
            int var5 = (var4 + 1048575 - arg1.field2568) / var4;
            arg1.field2568 = arg2 * var4 + arg1.field2568 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2742.field3097[arg1.field2550] == 0) {
                    arg1.field2565 = class34.method432(arg1.field2567, arg1.field2565.method428(), arg1.field2565.method419(), arg1.field2565.method414());
                } else {
                    arg1.field2565 = class34.method432(arg1.field2567, arg1.field2565.method428(), 0, arg1.field2565.method414());
                    this.field2742.method1038((byte) -45, arg1, arg1.field2573.field1914[arg1.field2547] < 0);
                }
                if (arg1.field2573.field1914[arg1.field2547] < 0) {
                    arg1.field2565.method423(-1);
                }
                arg2 = arg1.field2568 / var4;
            }
        }
        arg1.field2565.method418(arg2);
        if (arg0 <= 51) {
            method910(true, null, 65, null);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lge;BI)Ljf;")
    public static final class68 method908(class47 arg0, byte arg1, int arg2) {
        field2744++;
        if (arg1 <= 51) {
            field2760 = true;
        }
        byte[] var3 = arg0.method533(arg2, (byte) 25);
        return var3 == null ? null : new class68(var3);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIB)I")
    public static final int method909(int arg0, int arg1, byte arg2) {
        int var3 = class105.method869(arg0 - 1, -90, arg1 + -1) + class105.method869(arg0 + 1, -95, arg1 - 1) + class105.method869(arg0 - 1, -114, arg1 + 1) + class105.method869(arg0 + 1, -122, arg1 + 1);
        int var4 = class105.method869(arg0 - 1, -91, arg1) + class105.method869(arg0 + 1, -127, arg1) + class105.method869(arg0, -110, arg1 + -1) + class105.method869(arg0, -91, arg1 + 1);
        int var5 = class105.method869(arg0, -88, arg1);
        field2748++;
        if (arg2 > -104) {
            method911(72, -7, 85, -101, -62, 20);
        }
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLrd;ILrd;)V")
    public static final void method910(boolean arg0, class117 arg1, int arg2, class117 arg3) {
        short var4 = 151;
        if (class109.field2727) {
            class49.method544((byte) 109);
            class109.field2727 = false;
            class143.method1137(357);
            class147.method1185(false);
            class84.method759((byte) -122);
            class47.method512(1);
            class147.method1183(class77.field2095, class42.field1202, 28, class18.field462, class54.field1533);
            class71.method684((byte) 54, class134.field3210, -1, class27.field805 == -1, class101.field2518);
            class39.field1135 = true;
            class58.field1617 = true;
            class59.field1653 = true;
        }
        field2757++;
        class68.method668((byte) -100);
        int var7 = var4 - 3;
        class54.field1533.method216(arg3, 257, var7, 0);
        class54.field1533.method216(arg3, 256, var7 - 1, 16777215);
        int var5 = 125 / ((72 - arg2) / 49);
        if (arg1 != null) {
            var7 += 15;
            if (arg0) {
                int var6 = class54.field1533.method209(arg1) + 4;
                class145.method1165(257 - var6 / 2, var7 + -11, var6, 11, 0);
            }
            class54.field1533.method216(arg1, 257, var7, 0);
            class54.field1533.method216(arg1, 256, var7 - 1, 16777215);
        }
        class46.method499((byte) 91);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
    public static final void method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2741++;
        if (class2.field68 == arg5 && class5.field113 == arg1 && (class53.field1483 == arg3 || !class68.field1925)) {
            return;
        }
        class2.field68 = arg5;
        class5.field113 = arg1;
        class53.field1483 = arg3;
        if (!class68.field1925) {
            class53.field1483 = 0;
        }
        class85.method769(0, 25);
        method910(false, null, 126, class133.field3194);
        int var6 = class95.field2371;
        class95.field2371 = arg5 * 8 - 48;
        int var7 = class95.field2371 - var6;
        int var8 = class95.field2371;
        int var9 = class108.field2678;
        class108.field2678 = (arg1 - 6) * 8;
        int var10 = class108.field2678 - var9;
        int var11 = class108.field2678;
        for (int var12 = 0; var12 < 32768; var12++) {
            class36 var28 = class93.field2334[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field739[var29] -= var7;
                    var28.field708[var29] -= var10;
                }
                var28.field717 -= var7 * 128;
                var28.field751 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class101 var26 = class93.field2340[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field739[var27] -= var7;
                    var26.field708[var27] -= var10;
                }
                var26.field751 -= var10 * 128;
                var26.field717 -= var7 * 128;
            }
        }
        class120.field2940 = arg3;
        byte var14 = 0;
        byte var15 = 1;
        class144.field3516.method267(arg0, arg4, -127, false);
        byte var16 = 0;
        byte var17 = 104;
        byte var18 = 104;
        byte var19 = 1;
        if (var7 < 0) {
            var17 = -1;
            var15 = -1;
            var14 = 103;
        }
        if (var10 < 0) {
            var18 = -1;
            var19 = -1;
            var16 = 103;
        }
        for (int var20 = var14; var20 != var17; var20 += var15) {
            for (int var22 = var16; var22 != var18; var22 += var19) {
                int var23 = var7 + var20;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class105.field2631[var25][var20][var22] = class105.field2631[var25][var23][var24];
                    } else {
                        class105.field2631[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class132 var21 = (class132) class43.field1227.method3(false); var21 != null; var21 = (class132) class43.field1227.method14(127)) {
            var21.field3155 -= var7;
            var21.field3153 -= var10;
            if (var21.field3155 < 0 || var21.field3153 < 0 || var21.field3155 >= 104 || var21.field3153 >= 104) {
                var21.method691(0);
            }
        }
        class27.field803 = 0;
        class20.field492 = false;
        if (class40.field1164 != 0) {
            class40.field1164 -= var7;
            class59.field1674 -= var10;
        }
        class102.field2581 = -1;
        class22.field634.method17((byte) 44);
        if (arg2 != -21713) {
            field2752 = null;
        }
        class104.field2609.method17((byte) 44);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ltc;)V")
    public class110(class128 arg0) {
        this.field2742 = arg0;
    }
}
