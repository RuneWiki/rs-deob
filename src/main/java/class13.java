import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class13 {

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "[I")
    private int[] field146;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lsf;")
    public static class108 field144 = class140.method973(255, "Wordpack geladen)3");

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Lsf;")
    public static class108 field149 = class140.method973(255, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lsf;")
    private static class108 field152 = class140.method973(255, "Please remove ");

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lsf;")
    public static class108 field148 = field152;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lsf;")
    public static class108 field151 = field152;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Lsf;")
    public static class108 field154 = class140.method973(255, "Fermer");

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lhe;")
    public static class94 field145 = new class94(64);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lik;")
    public static class262 field150;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field158;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[I")
    public static int[] field142;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Lt;", line = 12)
    public static final class257 method84(byte arg0) {
        field153++;
        class257 var1 = new class257(class95.field1519, class197.field3560, class154.field2775[0], class88.field1383[0], class155.field2780[0], class273.field4795[0], class94.field1512[0], class321.field5494);
        if (arg0 < 123) {
            method85(66);
        }
        class15.method100(1);
        return var1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 28)
    public static void method85(int arg0) {
        field154 = null;
        field149 = null;
        field144 = null;
        field150 = null;
        field151 = null;
        field142 = null;
        field158 = null;
        field148 = null;
        field145 = null;
        if (arg0 < 34) {
            method85(79);
        }
        field152 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lma;IIIII)V", line = 56)
    public static final void method86(class290 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class60.field893 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class320.field5489) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class325.field5535 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class74 var14 = class99.field1759[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class278.field4883[var11][var12 + 1][var13] + class278.field4883[var11][var12][var13] + class278.field4883[var11][var12][var13 + 1] + class278.field4883[var11][var12 + 1][var13 + 1]) / 4 - (class278.field4883[arg1][arg2 + 1][arg3] + class278.field4883[arg1][arg2][arg3] + class278.field4883[arg1][arg2][arg3 + 1] + class278.field4883[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class174 var16 = var14.field1117;
                                    if (var16 != null) {
                                        if (var16.field3183.method1029()) {
                                            arg0.method1035(var16.field3183, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3173 != null && var16.field3173.method1029()) {
                                            arg0.method1035(var16.field3173, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1119; var17++) {
                                        class326 var18 = var14.field1118[var17];
                                        if (var18 != null && var18.field5570.method1029() && (var18.field5575 == var12 || var7 == var12) && (var18.field5576 == var13 || var9 == var13)) {
                                            int var19 = var18.field5568 + 1 - var18.field5575;
                                            int var20 = var18.field5561 + 1 - var18.field5576;
                                            arg0.method1035(var18.field5570, (var18.field5575 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field5576 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V", line = 154)
    public static final void method87(int arg0, boolean arg1) {
        class12 var2;
        if (class231.field4051 || class294.field5136 == null) {
            var2 = new class12(512, 512);
        } else {
            var2 = (class12) class294.field5136;
        }
        field143++;
        int[] var3 = var2.field141;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 4 * 512 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class166.field2980[arg0][var8][var6] & 0x18) == 0) {
                    class181.method1310(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class166.field2980[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class181.method1310(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method65();
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (-((int) (Math.random() * 20.0D)) - 228));
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class166.field2980[arg0][var12][var11] & 0x18) == 0) {
                    class200.method1418((byte) -15, var10, var9, arg0, var11, var12);
                }
                if (arg0 < 3 && (class166.field2980[arg0 + 1][var12][var11] & 0x8) != 0) {
                    class200.method1418((byte) -15, var10, var9, arg0 + 1, var11, var12);
                }
            }
        }
        if (arg1) {
            field145 = (class94) null;
        }
        class229.field3994 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class45.method325(class295.field5159, var13, var14);
                if (var15 != 0L) {
                    class60 var17 = class201.method1424((int) (var15 >>> 32) & Integer.MAX_VALUE, (byte) 121);
                    int var18 = var17.field933;
                    if (var17.field912 != null) {
                        for (int var19 = 0; var19 < var17.field912.length; var19++) {
                            if (var17.field912[var19] != -1) {
                                class60 var20 = class201.method1424(var17.field912[var19], (byte) 114);
                                if (var20.field933 >= 0) {
                                    var18 = var20.field933;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class330.field5644[class295.field5159].field5605;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var13 - 3 < var21 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var21 < (var13 + 3) && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var22 > var14 - 3 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && (var14 + 3) > var22 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class63.field1011[class229.field3994] = var17.field902;
                        class285.field4988[class229.field3994] = var21;
                        class325.field5543[class229.field3994] = var22;
                        class229.field3994++;
                    }
                }
            }
        }
        if (class231.field4051) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class294.field5136 = new class49(var2);
        } else {
            class294.field5136 = var2;
        }
        if (class231.field4051) {
            class28.field427 = null;
        } else {
            class216.field3833.method1978((byte) -105);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "([I)V", line = 359)
    public class13(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field146 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field146[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field146[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field146[var5 + var5] = arg0[var4];
            this.field146[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I", line = 398)
    public final int method88(int arg0, int arg1) {
        int var3 = 92 / ((arg1 - 4) / 48);
        field147++;
        int var4 = (this.field146.length >> 1) - 1;
        int var5 = var4 & arg0;
        while (true) {
            int var6 = this.field146[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field146[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }
}
