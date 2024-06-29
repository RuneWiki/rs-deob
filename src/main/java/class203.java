import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class203 extends class30 {

    @OriginalMember(owner = "client!we", name = "jc", descriptor = "Z")
    private boolean field4038 = false;

    @OriginalMember(owner = "client!we", name = "Gb", descriptor = "I")
    private int field4009 = 0;

    @OriginalMember(owner = "client!we", name = "Xb", descriptor = "I")
    private int field4026 = 0;

    @OriginalMember(owner = "client!we", name = "Ub", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!we", name = "tc", descriptor = "I")
    private int field4048;

    @OriginalMember(owner = "client!we", name = "Fb", descriptor = "I")
    private int field4008;

    @OriginalMember(owner = "client!we", name = "Hb", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!we", name = "uc", descriptor = "I")
    private int field4049;

    @OriginalMember(owner = "client!we", name = "qc", descriptor = "I")
    private int field4045;

    @OriginalMember(owner = "client!we", name = "Vb", descriptor = "I")
    private int field4024;

    @OriginalMember(owner = "client!we", name = "Rb", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!we", name = "lc", descriptor = "I")
    public int field4040;

    @OriginalMember(owner = "client!we", name = "oc", descriptor = "I")
    public int field4043;

    @OriginalMember(owner = "client!we", name = "cc", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!we", name = "pc", descriptor = "Lah;")
    private class9 field4044;

    @OriginalMember(owner = "client!we", name = "Kb", descriptor = "Lgg;")
    private static class63 field4013 = class116.method911(43, "Ok");

    @OriginalMember(owner = "client!we", name = "ec", descriptor = "[I")
    public static int[] field4033 = new int[32];

    @OriginalMember(owner = "client!we", name = "Ib", descriptor = "Lgg;")
    public static class63 field4011 = class116.method911(43, ":trade:");

    @OriginalMember(owner = "client!we", name = "gc", descriptor = "I")
    public static int field4035 = 0;

    @OriginalMember(owner = "client!we", name = "nc", descriptor = "Lgg;")
    private static class63 field4042 = class116.method911(43, " ");

    @OriginalMember(owner = "client!we", name = "ac", descriptor = "Lgg;")
    public static class63 field4029 = field4042;

    @OriginalMember(owner = "client!we", name = "ic", descriptor = "I")
    public static int field4037 = 0;

    @OriginalMember(owner = "client!we", name = "Pb", descriptor = "Lgg;")
    public static class63 field4018 = field4013;

    @OriginalMember(owner = "client!we", name = "Eb", descriptor = "D")
    private double field4007;

    @OriginalMember(owner = "client!we", name = "Lb", descriptor = "D")
    private double field4014;

    @OriginalMember(owner = "client!we", name = "Mb", descriptor = "D")
    public double field4015;

    @OriginalMember(owner = "client!we", name = "Nb", descriptor = "D")
    public double field4016;

    @OriginalMember(owner = "client!we", name = "Sb", descriptor = "D")
    private double field4021;

    @OriginalMember(owner = "client!we", name = "dc", descriptor = "D")
    private double field4032;

    @OriginalMember(owner = "client!we", name = "fc", descriptor = "D")
    private double field4034;

    @OriginalMember(owner = "client!we", name = "mc", descriptor = "D")
    public double field4041;

    @OriginalMember(owner = "client!we", name = "Jb", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!we", name = "Ob", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!we", name = "Qb", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!we", name = "Tb", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!we", name = "Wb", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!we", name = "Yb", descriptor = "I")
    private int field4027;

    @OriginalMember(owner = "client!we", name = "Zb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!we", name = "hc", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!we", name = "kc", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!we", name = "rc", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!we", name = "bc", descriptor = "Ljc;")
    public static class85 field4030;

    @OriginalMember(owner = "client!we", name = "sc", descriptor = "Ljc;")
    public static class85 field4047;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILeh;)V")
    public static final void method1339(int arg0, class47 arg1) {
        field4036++;
        arg1.field1148 = 0;
        if (arg0 < 23) {
            method1339(106, null);
        }
        if (arg1.field1166 == 0) {
            arg1.field1129 = 1024;
        }
        int var2 = arg1.field1153 * 128 + arg1.field1123 * 64;
        int var3 = arg1.field1126 - class173.field3571;
        int var4 = arg1.field1098 * 128 + arg1.field1123 * 64;
        arg1.field1144 += (var4 - arg1.field1144) / var3;
        arg1.field1141 += (var2 - arg1.field1141) / var3;
        if (arg1.field1166 == 1) {
            arg1.field1129 = 1536;
        }
        if (arg1.field1166 == 2) {
            arg1.field1129 = 0;
        }
        if (arg1.field1166 == 3) {
            arg1.field1129 = 512;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
    public static final void method1340() {
        int var0 = class165.field3390[class48.field1180];
        class121[] var1 = class165.field3394[class48.field1180];
        class151.field3169 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class121 var3 = var1[var2];
            if (var3.field2663 == 1) {
                int var4 = var3.field2674 + class98.field2329 - client.field704;
                if (var4 >= 0 && var4 <= class98.field2329 + class98.field2329) {
                    int var5 = var3.field2659 + class98.field2329 - class74.field1830;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field2664 + class98.field2329 - class74.field1830;
                    if (var6 > class98.field2329 + class98.field2329) {
                        var6 = class98.field2329 + class98.field2329;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class13.field316[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class138.field2971 - var3.field2680;
                        if (var8 > 32) {
                            var3.field2684 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field2684 = 2;
                            var8 = -var8;
                        }
                        var3.field2671 = (var3.field2658 - class14.field344 << 8) / var8;
                        var3.field2677 = (var3.field2657 - class14.field344 << 8) / var8;
                        var3.field2678 = (var3.field2672 - class103.field2373 << 8) / var8;
                        var3.field2686 = (var3.field2676 - class103.field2373 << 8) / var8;
                        class117.field2626[class151.field3169++] = var3;
                    }
                }
            } else if (var3.field2663 == 2) {
                int var9 = var3.field2659 + class98.field2329 - class74.field1830;
                if (var9 >= 0 && var9 <= class98.field2329 + class98.field2329) {
                    int var10 = var3.field2674 + class98.field2329 - client.field704;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field2688 + class98.field2329 - client.field704;
                    if (var11 > class98.field2329 + class98.field2329) {
                        var11 = class98.field2329 + class98.field2329;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class13.field316[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class14.field344 - var3.field2658;
                        if (var13 > 32) {
                            var3.field2684 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field2684 = 4;
                            var13 = -var13;
                        }
                        var3.field2679 = (var3.field2680 - class138.field2971 << 8) / var13;
                        var3.field2683 = (var3.field2669 - class138.field2971 << 8) / var13;
                        var3.field2678 = (var3.field2672 - class103.field2373 << 8) / var13;
                        var3.field2686 = (var3.field2676 - class103.field2373 << 8) / var13;
                        class117.field2626[class151.field3169++] = var3;
                    }
                }
            } else if (var3.field2663 == 4) {
                int var14 = var3.field2672 - class103.field2373;
                if (var14 > 128) {
                    int var15 = var3.field2659 + class98.field2329 - class74.field1830;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field2664 + class98.field2329 - class74.field1830;
                    if (var16 > class98.field2329 + class98.field2329) {
                        var16 = class98.field2329 + class98.field2329;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field2674 + class98.field2329 - client.field704;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field2688 + class98.field2329 - client.field704;
                        if (var18 > class98.field2329 + class98.field2329) {
                            var18 = class98.field2329 + class98.field2329;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class13.field316[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field2684 = 5;
                            var3.field2679 = (var3.field2680 - class138.field2971 << 8) / var14;
                            var3.field2683 = (var3.field2669 - class138.field2971 << 8) / var14;
                            var3.field2671 = (var3.field2658 - class14.field344 << 8) / var14;
                            var3.field2677 = (var3.field2657 - class14.field344 << 8) / var14;
                            class117.field2626[class151.field3169++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lde;")
    public static final class35 method1341(Throwable arg0, String arg1) {
        class35 var2;
        if (arg0 instanceof class35) {
            var2 = (class35) arg0;
            var2.field827 = var2.field827 + ' ' + arg1;
        } else {
            var2 = new class35(arg0, arg1);
        }
        field4039++;
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public static final void method1342(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field2272; var4++) {
            class98 var5 = var3.field2284[var4];
            if ((var5.field2319 >> 29 & 0x3L) == 2L && var5.field2330 == arg1 && var5.field2325 == arg2) {
                class42.method380(var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public final void method1343(int arg0, int arg1) {
        this.field4016 += (double) arg1 * this.field4014;
        field4022++;
        this.field4015 += this.field4032 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field4034;
        this.field4041 += (double) arg1 * this.field4021;
        this.field4034 += (double) arg1 * this.field4032;
        this.field4038 = true;
        this.field4019 = (int) (Math.atan2(this.field4021, this.field4014) * 325.949D) + 1024 & 0x7FF;
        if (arg0 != -1) {
            method1341(null, null);
        }
        this.field4027 = (int) (Math.atan2(this.field4034, this.field4007) * 325.949D) & 0x7FF;
        if (this.field4044 == null) {
            return;
        }
        this.field4026 += arg1;
        while (true) {
            do {
                do {
                    if (this.field4044.field201[this.field4009] >= this.field4026) {
                        return;
                    }
                    this.field4026 -= this.field4044.field201[this.field4009];
                    this.field4009++;
                } while (this.field4009 < this.field4044.field219.length);
                this.field4009 -= this.field4044.field215;
            } while (this.field4009 >= 0 && this.field4044.field219.length > this.field4009);
            this.field4009 = 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method1344(byte arg0) {
        field4047 = null;
        field4042 = null;
        field4033 = null;
        field4030 = null;
        field4018 = null;
        field4013 = null;
        field4029 = null;
        if (arg0 != 9) {
            method1344((byte) 69);
        }
        field4011 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1345(int arg0, Component arg1) {
        Method var2 = class149.field3136;
        field4017++;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class45.field1066);
        arg1.addFocusListener(class45.field1066);
        if (arg0 > -88) {
            field4033 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)Ldf;")
    public final class36 method220(int arg0) {
        field4025++;
        if (arg0 != 0) {
            this.method220(22);
        }
        class46 var2 = class19.method198(25, this.field4048);
        class36 var3 = var2.method464(arg0 ^ 0xFFFFFF7F, this.field4009);
        if (var3 == null) {
            return null;
        } else {
            var3.method329(this.field4027);
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBI)V")
    public final void method1346(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4012++;
        if (!this.field4038) {
            double var6 = (double) (arg2 - this.field4010);
            double var8 = (double) (arg1 - this.field4045);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4016 = (double) this.field4008 * var8 / var10 + (double) this.field4045;
            this.field4041 = (double) this.field4008 * var6 / var10 + (double) this.field4010;
            this.field4015 = this.field4049;
        }
        double var12 = (double) (this.field4043 + 1 - arg4);
        if (arg3 != -127) {
            return;
        }
        this.field4014 = ((double) arg1 - this.field4016) / var12;
        this.field4021 = ((double) arg2 - this.field4041) / var12;
        this.field4007 = Math.sqrt(this.field4021 * this.field4021 + this.field4014 * this.field4014);
        if (!this.field4038) {
            this.field4034 = -this.field4007 * Math.tan((double) this.field4024 * 0.02454369D);
        }
        this.field4032 = ((double) arg0 - this.field4015 - this.field4034 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjc;Ljc;Ljc;Lec;)Z")
    public static final boolean method1347(int arg0, class85 arg1, class85 arg2, class85 arg3, class42 arg4) {
        class143.field3073 = arg3;
        class182.field3698 = arg4;
        if (arg0 != 0) {
            field4047 = null;
        }
        field4028++;
        class190.field3872 = arg1;
        class94.field2248 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4038 = false;
        this.field4023 = arg10;
        this.field4048 = arg0;
        this.field4008 = arg8;
        this.field4010 = arg2;
        this.field4049 = arg4;
        this.field4045 = arg3;
        this.field4024 = arg7;
        this.field4020 = arg5;
        this.field4040 = arg9;
        this.field4043 = arg6;
        this.field4031 = arg1;
        int var12 = class19.method198(79, this.field4048).field1076;
        if (var12 == -1) {
            this.field4044 = null;
        } else {
            this.field4044 = class49.method480(1000, var12);
        }
    }
}
