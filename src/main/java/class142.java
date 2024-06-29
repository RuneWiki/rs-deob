import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class142 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field2053 = -1;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field2060 = -1;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field2061 = 100;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Ljb;")
    public class25 field2054;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
    public int[] field2052;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[Lpg;")
    public static class175[] field2056;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field2058;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZII)V")
    public static final void method941(boolean arg0, int arg1, int arg2) {
        field2059++;
        if (class77.field1178 != arg1) {
            class169.field2444 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class169.field2444[var3] = (var3 << 12) / arg1;
            }
            class207.field2992 = arg1 - 1;
            class279.field4459 = arg1 == 64 ? 2048 : 4096;
            class77.field1178 = arg1;
        }
        if (arg0) {
            method943(87);
        }
        if (class192.field2753 == arg2) {
            return;
        }
        if (class77.field1178 == arg2) {
            class187.field2664 = class169.field2444;
        } else {
            class187.field2664 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class187.field2664[var4] = (var4 << 12) / arg2;
            }
        }
        class5.field136 = arg2 - 1;
        class192.field2753 = arg2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static final void method942(int arg0) {
        field2057++;
        for (int var1 = 0; var1 < class51.field756; var1++) {
            int var2 = class67.field1049[var1];
            class72 var3 = class82.field1268[var2];
            if (var3 != null) {
                class119.method819((byte) -24, var3, var3.field1119.field4283);
            }
        }
        if (arg0 != 3) {
            method945((class114) null, 26, true, 49, 111, 4, 53, false, 29);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method943(int arg0) {
        if (arg0 != 2048) {
            field2061 = -8;
        }
        field2056 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([Lqb;[BIZBI)V")
    public static final void method944(class86[] arg0, byte[] arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        class114 var6 = new class114(arg1);
        int var7 = -1;
        while (true) {
            int var8 = var6.method793((byte) -3);
            if (var8 == 0) {
                int var21 = -113 / ((19 - arg4) / 54);
                field2051++;
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method787((byte) -99);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method760(false);
                int var15 = var14 >> 2;
                int var16 = var12 + arg2;
                int var17 = var11 + arg5;
                int var18 = var14 & 0x3;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    class86 var19 = null;
                    if (!arg3) {
                        int var20 = var13;
                        if ((class189.field2684[1][var16][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class67.method458(var16, var17, var18, var15, arg3, var19, !arg3, 4, var7, var13, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lkl;IZIIIIZI)V")
    public static final void method945(class114 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field2055++;
        if (!arg7) {
            return;
        }
        if (arg4 < 0 || arg4 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var11 = arg0.method760(false);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method760(false);
                    return;
                }
                if (var11 <= 49) {
                    arg0.method760(false);
                }
            }
        }
        if (!arg2) {
            class189.field2684[arg5][arg4][arg1] = 0;
        }
        while (true) {
            int var9 = arg0.method760(!arg7);
            if (var9 == 0) {
                if (!arg2) {
                    if (arg5 == 0) {
                        class107.field1556[0][arg4][arg1] = -class264.method1753(arg1 + arg3 + 556238, arg4 + arg8 + 932731, 11096) * 8;
                        return;
                    }
                    class107.field1556[arg5][arg4][arg1] = class107.field1556[arg5 - 1][arg4][arg1] - 240;
                    return;
                }
                class107.field1556[0][arg4][arg1] = class176.field2502[0][arg4][arg1];
                return;
            }
            if (var9 == 1) {
                int var10 = arg0.method760(!arg7);
                if (arg2) {
                    class107.field1556[0][arg4][arg1] = class176.field2502[0][arg4][arg1] + (var10 * 8);
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg5 != 0) {
                    class107.field1556[arg5][arg4][arg1] = class107.field1556[arg5 - 1][arg4][arg1] - (var10 * 8);
                    return;
                }
                class107.field1556[0][arg4][arg1] = -var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class259.field3920[arg5][arg4][arg1] = arg0.method741(3083);
                class26.field372[arg5][arg4][arg1] = (byte) ((var9 - 2) / 4);
                class175.field2500[arg5][arg4][arg1] = (byte) class184.method1188(arg6 + var9 - 2, 3);
            } else if (var9 > 81) {
                class118.field1729[arg5][arg4][arg1] = (byte) (var9 - 81);
            } else if (!arg2) {
                class189.field2684[arg5][arg4][arg1] = (byte) (var9 - 49);
            }
        }
    }
}
