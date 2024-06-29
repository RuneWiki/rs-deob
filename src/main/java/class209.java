import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class209 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Lqe;")
    public static class168 field3624 = class66.method448("Verbindung abgebrochen)3", -110);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lqe;")
    private static class168 field3622 = class66.method448(" from your friend list first)3", -127);

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    public static int[] field3629 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field3630 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lqe;")
    public static class168 field3623 = field3622;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lqe;")
    public static class168 field3632 = class66.method448("W-=hlen Sie eine Option", 121);

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Z")
    public static boolean field3635 = false;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lwc;")
    public static class232 field3625 = new class232(16);

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Lqe;")
    public static class168 field3637 = class66.method448("Benutzeroberfl-=che geladen)3", -121);

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[S")
    public static short[] field3634;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
    public static final int method1353(int arg0, int arg1) {
        field3628++;
        if (arg0 != 1557) {
            field3623 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[B)I")
    public static final int method1354(int arg0, int arg1, byte[] arg2) {
        field3631++;
        if (arg1 != 1) {
            method1357(24);
        }
        return class36.method221(arg2, true, arg0, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method1355(int arg0) {
        if (arg0 != 2) {
            method1354(52, -113, null);
        }
        field3625 = null;
        field3634 = null;
        field3623 = null;
        field3637 = null;
        field3632 = null;
        field3622 = null;
        field3624 = null;
        field3629 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BI)V")
    public static final void method1356(byte[] arg0, int arg1) {
        field3636++;
        int var2 = 0;
        if (arg1 >= -125) {
            method1355(-101);
        }
        while (true) {
            while (arg0.length > var2) {
                int var3 = arg0[var2++] * 64 - class232.field3935;
                int var4 = arg0[var2++] * 64 - class162.field2781;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class79.field1189 && class42.field552 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class42.field552 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if ((var9 & 0x1) == 1) {
                                    byte var10 = arg0[var2++];
                                    if (class94.field1482[var5][var6] == null) {
                                        class94.field1482[var5][var6] = new byte[4096];
                                    }
                                    class94.field1482[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) var10;
                                }
                                if ((var9 & 0x2) == 2) {
                                    byte var11 = arg0[var2++];
                                    if (class233.field3964[var5][var6] == null) {
                                        class233.field3964[var5][var6] = new byte[4096];
                                    }
                                    class233.field3964[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) (var11 - 28);
                                }
                                if ((var9 & 0x4) == 4) {
                                    var2 += 3;
                                    int var12 = ((arg0[var2 - 3] & 0xFF) << 16) - (-((arg0[var2 - 2] & 0xFF) << 8) - (arg0[var2 - 1] & 0xFF));
                                    if (class74.field1123[var5][var6] == null) {
                                        class74.field1123[var5][var6] = new int[4096];
                                    }
                                    var12--;
                                    class70 var13 = class190.method1232(var12, 13090);
                                    if (var13.field1069 != null) {
                                        var13 = var13.method471(true);
                                        if (var13 == null || var13.field1056 == -1) {
                                            continue;
                                        }
                                    }
                                    class74.field1123[var5][var6][(-(var8 + 1) << 6) + var7] = var13.field1073 + 1;
                                    class21 var14 = new class21();
                                    var14.field245 = var13.field1056;
                                    var14.field255 = class42.field552 - var4;
                                    var14.field253 = var3;
                                    class71.field1079.method311((byte) 16, var14);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; var15++) {
                        for (int var16 = -64; var16 < 0; var16++) {
                            byte var17 = arg0[var2++];
                            if (var17 != 0) {
                                if ((var17 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var17 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var17 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static final void method1357(int arg0) {
        class116.field1902 = arg0;
        for (int var1 = 0; var1 < class90.field1406; var1++) {
            for (int var2 = 0; var2 < class32.field386; var2++) {
                if (class254.field4395[arg0][var1][var2] == null) {
                    class254.field4395[arg0][var1][var2] = new class177(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZJ)V")
    public static final void method1358(boolean arg0, long arg1) {
        field3627++;
        if (arg1 == 0L) {
            return;
        }
        class87.field1348.method672(235, 238);
        if (arg0) {
            class87.field1348.method739(arg1, -23147);
            class105.field1686++;
        }
    }
}
