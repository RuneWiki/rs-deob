import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class191 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field3309 = -1;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ljf;")
    public static class229 field3315 = class212.method1457((byte) 59, "Chargement des interfaces )2 ");

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public int field3307;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I", line = 19)
    public static final int method1308(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -34 / ((14 - arg3) / 56);
        field3316++;
        int var5 = arg0 / arg2;
        int var6 = arg2 - 1 & arg0;
        int var7 = arg1 / arg2;
        int var8 = arg1 & arg2 - 1;
        int var9 = class64.method478(0, var5, var7);
        int var10 = class64.method478(0, var5 + 1, var7);
        int var11 = class64.method478(0, var5, var7 + 1);
        int var12 = class64.method478(0, var5 + 1, var7 + 1);
        int var13 = class273.method1914(-107, arg2, var6, var10, var9);
        int var14 = class273.method1914(-106, arg2, var6, var12, var11);
        return class273.method1914(-123, arg2, var8, var14, var13);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lrm;B)V", line = 51)
    public static final void method1309(class248 arg0, byte arg1) {
        field3308++;
        for (int var2 = 0; var2 < class110.field1943.length; var2++) {
            class110.field1943[var2] = 0;
        }
        if (arg1 != -96) {
            method1312(121, 2, -36, -22, 22, (byte) -41, -109);
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var3);
            class110.field1943[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class294.field5025[var9] = (class110.field1943[var9 - 1] + class110.field1943[var9 + 128] + class110.field1943[var9 + 1] + class110.field1943[var9 + -128]) / 4;
                }
            }
            int[] var10 = class110.field1943;
            class110.field1943 = class294.field5025;
            class294.field5025 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field2299; var12++) {
            for (int var13 = 0; var13 < arg0.field2294; var13++) {
                if (arg0.field4376[var11++] != 0) {
                    int var14 = var13 - (-arg0.field2301 - 16);
                    int var15 = var12 + arg0.field2295 + 16;
                    int var16 = (var15 << 7) + var14;
                    class110.field1943[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 146)
    public static void method1310(int arg0) {
        field3315 = null;
        int var1 = -116 % ((arg0 - 58) / 56);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lkh;Z)V", line = 158)
    public static final void method1311(class14 arg0, boolean arg1) {
        field3313++;
        while (true) {
            while (arg0.field174.length > arg0.field195) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method93(false) == 1) {
                    var3 = arg0.method93(false);
                    var2 = true;
                    var4 = arg0.method93(false);
                }
                int var5 = arg0.method93(false);
                int var6 = arg0.method93(false);
                int var7 = class127.field2269 + class254.field4432 - var6 * 64 - 1;
                int var8 = var5 * 64 - class290.field4953;
                if (var8 >= 0 && var7 - 63 >= 0 && var8 + 63 < class113.field2037 && class254.field4432 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && (var3 * 8 + 8) > var11 && var4 * 8 <= var12 && (var4 * 8 + 8) > var12) {
                                int var13 = arg0.method93(false);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method93(arg1);
                                        if (class91.field1666[var9][var10] == null) {
                                            class91.field1666[var9][var10] = new byte[4096];
                                        }
                                        class91.field1666[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method116(-1);
                                        if (class19.field294[var9][var10] == null) {
                                            class19.field294[var9][var10] = new short[4096];
                                        }
                                        class19.field294[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method93(false) & 0xFF << 16) - (-((arg0.method93(false) & 0xFF) << 8) - (arg0.method93(false) & 0xFF));
                                        if (class270.field4639[var9][var10] == null) {
                                            class270.field4639[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class83 var17 = class271.method1909(1, var16);
                                        if (var17.field1593 != null) {
                                            var17 = var17.method598((byte) 54);
                                            if (var17 == null || var17.field1578 == -1) {
                                                continue;
                                            }
                                        }
                                        class270.field4639[var9][var10][(63 - var12 << 6) + var11] = var17.field1580 + 1;
                                        class152 var18 = new class152();
                                        var18.field2632 = var7;
                                        var18.field2626 = var8;
                                        var18.field2623 = var17.field1578;
                                        class324.field5473.method2079(var18, 88);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method93(false);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field195++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field195 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field195 += 3;
                            }
                        }
                    }
                }
            }
            if (arg1) {
                field3315 = (class229) null;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIBI)I", line = 305)
    public static final int method1312(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg6;
            arg6 = var7;
        }
        int var8 = arg3 & 0x3;
        field3318++;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 1 + 7 - arg0 - arg2;
        } else if (arg5 > -107) {
            return 56;
        } else if (var8 == 2) {
            return 1 - (arg6 - (7 - arg1));
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Z", line = 342)
    public static final boolean method1313(int arg0) {
        if (arg0 > -18) {
            field3315 = (class229) null;
        }
        field3317++;
        try {
            return class90.method638(true);
        } catch (IOException var5) {
            class323.method2179((byte) 109);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class107.field1879 + "," + class4.field35 + "," + class283.field4850 + " - " + class51.field902 + "," + (class301.field5124.field2018[0] + class258.field4503) + "," + (class301.field5124.field2017[0] + class213.field3649) + " - ";
            for (int var4 = 0; var4 < class51.field902 && var4 < 50; var4++) {
                var3 = var3 + class171.field2972.field174[var4] + ",";
            }
            class201.method1407(1, var3, var6);
            class226.method1560((byte) -39);
            return true;
        }
    }
}
