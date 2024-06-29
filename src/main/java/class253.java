import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class253 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lve;")
    public static class309 field3512;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[Lwn;")
    public static class77[] field3517;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Z")
    public static final boolean method1621(int arg0, int arg1) {
        field3513++;
        if (arg1 == 0) {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method1622(byte arg0) {
        field3517 = null;
        if (arg0 != -85) {
            field3512 = null;
        }
        field3512 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1319(int arg0);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public static final void method1623(boolean arg0) {
        if (arg0) {
            class30.field419.method843(-1);
            field3514++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BZ)V")
    public static final void method1624(byte arg0, boolean arg1) {
        field3511++;
        int var2 = -17 / ((arg0 - 6) / 46);
        byte[][] var3;
        byte var4;
        if (arg1) {
            var3 = class134.field2008;
            var4 = 1;
        } else {
            var3 = class115.field1750;
            var4 = 4;
        }
        int var5 = var3.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int[] var12 = null;
            byte[] var13 = var3[var6];
            int var14 = class171.field2413[var6] >> 8;
            int var15 = class171.field2413[var6] & 0xFF;
            int var16 = var14 * 64 - class6.field65;
            int var17 = var15 * 64 - class371.field5148;
            if (var13 != null) {
                class140.method1025(255);
                var12 = class446.method2759(127, class403.field5567, arg1, var4, var17, class6.field65, class371.field5148, var16, class354.field4765, var13);
            }
            if (!arg1 && class26.field335 / 8 == var14 && (class133.field1988 / 8) == var15) {
                if (var12 == null) {
                    class399.field5537 = null;
                } else {
                    class399.field5537 = class248.method1609(var12[1], (byte) 36, var12[2], var12[0], var12[3]);
                    field3516 = var12[4];
                }
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class171.field2413[var7] >> 8) * 64 - class6.field65;
            int var9 = (class171.field2413[var7] & 0xFF) * 64 - class371.field5148;
            byte[] var10 = var3[var7];
            if (var10 == null && class133.field1988 < 800) {
                class140.method1025(255);
                for (int var11 = 0; var11 < var4; var11++) {
                    class14.method80(var9, var11, -1, var8, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIILje;)V")
    public static final void method1625(int arg0, int arg1, int arg2, class301 arg3) {
        if (class341.field4617[arg0][arg1][arg2] == null) {
            class72.method567(arg0, arg1, arg2);
        }
        class341.field4617[arg0][arg1][arg2].field854 = arg3;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)Z")
    public static final boolean method1626(boolean arg0) {
        for (int var1 = class214.field3003; var1 < class409.field5706; var1++) {
            class63[][] var2 = class341.field4617[var1];
            for (int var3 = -class244.field3440; var3 <= 0; var3++) {
                int var4 = class58.field750 + var3;
                int var5 = class58.field750 - var3;
                if (var4 >= class92.field1293 || var5 < class186.field2698) {
                    for (int var6 = -class244.field3440; var6 <= 0; var6++) {
                        int var7 = class446.field6253 + var6;
                        int var8 = class446.field6253 - var6;
                        if (var4 >= class92.field1293) {
                            if (var7 >= class371.field5146) {
                                class63 var9 = var2[var4][var7];
                                if (var9 != null && var9.field855) {
                                    class18.field237 = arg0;
                                    class316.field4283.method1568(var9, (byte) -127);
                                    class316.field4283.method1578(-111);
                                }
                            }
                            if (var8 < class218.field3063) {
                                class63 var10 = var2[var4][var8];
                                if (var10 != null && var10.field855) {
                                    class18.field237 = arg0;
                                    class316.field4283.method1568(var10, (byte) -126);
                                    class316.field4283.method1578(-115);
                                }
                            }
                        }
                        if (var5 < class186.field2698) {
                            if (var7 >= class371.field5146) {
                                class63 var11 = var2[var5][var7];
                                if (var11 != null && var11.field855) {
                                    class18.field237 = arg0;
                                    class316.field4283.method1568(var11, (byte) -124);
                                    class316.field4283.method1578(-106);
                                }
                            }
                            if (var8 < class218.field3063) {
                                class63 var12 = var2[var5][var8];
                                if (var12 != null && var12.field855) {
                                    class18.field237 = arg0;
                                    class316.field4283.method1568(var12, (byte) -124);
                                    class316.field4283.method1578(-112);
                                }
                            }
                        }
                        if (class336.field4536 == 0) {
                            if (class346.field4681) {
                                class316.field4283.method1574((byte) 90, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V")
    public abstract void method1318(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static final void method1627(int arg0) {
        if (arg0 <= -24) {
            field3510++;
            class260.field3592.method2530((byte) -124);
        }
    }

    static {
        new class368("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }
}
