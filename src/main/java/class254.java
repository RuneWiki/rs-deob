import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class254 {

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lra;")
    private class40 field4459 = new class40();

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    private int field4454;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lbc;")
    private class201 field4451;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4449 = new CRC32();

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field4456 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lub;")
    public static class227 field4458 = class257.method1749("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 17263);

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Z")
    public static boolean field4463 = true;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field4462 = 0;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lrb;")
    public static class254 field4457 = new class254(64);

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4471 = 0;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lub;")
    public static class227 field4470 = class257.method1749("cookieprefix", 17263);

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field4473 = -1;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "Lrb;")
    public static class254 field4472 = new class254(5);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method1723(int arg0) {
        field4468++;
        this.field4459.method216((byte) -28);
        this.field4451.method1292(25028);
        this.field4454 = this.field4448;
        if (arg0 != -4173) {
            this.method1731(-93L, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILub;ILub;Lub;)V")
    public static final void method1724(int arg0, class227 arg1, int arg2, class227 arg3, class227 arg4) {
        field4464++;
        class181.method1160(arg1, arg2 ^ arg2, -1, arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class257.field4506[arg0][var8][var14] == -class38.field627) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class98.field1717[arg0][arg1][arg3] + arg5;
            if (!class204.method1304(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class204.method1304(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class204.method1304(var9, var11, var13)) {
                return false;
            } else if (class204.method1304(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class235.method1569(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class204.method1304(var6 + 1, class98.field1717[arg0][arg1][arg3] + arg5, var7 + 1) && class204.method1304(var6 + 128 - 1, class98.field1717[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class204.method1304(var6 + 128 - 1, class98.field1717[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class204.method1304(var6 + 1, class98.field1717[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BZIIIIIILnj;)V")
    public static final void method1726(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class226 arg8) {
        if (arg0 <= 41) {
            return;
        }
        field4450++;
        if (arg4 < 0 || arg4 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var11 = arg8.method1471(255);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg8.method1471(255);
                    return;
                }
                if (var11 <= 49) {
                    arg8.method1471(255);
                }
            }
        }
        if (!arg1) {
            class40.field654[arg6][arg4][arg7] = 0;
        }
        while (true) {
            int var9 = arg8.method1471(255);
            if (var9 == 0) {
                if (arg1) {
                    class98.field1717[0][arg4][arg7] = class235.field4080[0][arg4][arg7];
                    return;
                } else if (arg6 == 0) {
                    class98.field1717[0][arg4][arg7] = -class43.method232(arg7 + arg3 + 556238, (byte) -48, arg4 + arg2 + 932731) * 8;
                    return;
                } else {
                    class98.field1717[arg6][arg4][arg7] = class98.field1717[arg6 - 1][arg4][arg7] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg8.method1471(255);
                if (arg1) {
                    class98.field1717[0][arg4][arg7] = var10 * 8 + class235.field4080[0][arg4][arg7];
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg6 == 0) {
                    class98.field1717[0][arg4][arg7] = -var10 * 8;
                    return;
                }
                class98.field1717[arg6][arg4][arg7] = class98.field1717[arg6 - 1][arg4][arg7] - (var10 * 8);
                return;
            }
            if (var9 <= 49) {
                class245.field4276[arg6][arg4][arg7] = arg8.method1428(false);
                class132.field2302[arg6][arg4][arg7] = (byte) ((var9 - 2) / 4);
                class147.field2535[arg6][arg4][arg7] = (byte) class76.method446(3, arg5 + var9 - 2);
            } else if (var9 > 81) {
                class123.field2215[arg6][arg4][arg7] = (byte) (var9 - 81);
            } else if (!arg1) {
                class40.field654[arg6][arg4][arg7] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V")
    public final void method1727(boolean arg0, int arg1) {
        field4455++;
        if (!arg0) {
            this.method1727(true, 21);
        }
        if (class181.field3098 == null) {
            return;
        }
        for (class248 var3 = (class248) this.field4459.method209(16711680); var3 != null; var3 = (class248) this.field4459.method221((byte) -122)) {
            if (var3.method668(false)) {
                if (var3.method667((byte) 85) == null) {
                    var3.method369(125);
                    var3.method727((byte) 2);
                    this.field4454++;
                }
            } else if ((long) arg1 < ++var3.field2112) {
                class248 var4 = class181.field3098.method806(var3, 7034);
                this.field4451.method1300(var4, var3.field1113, -2875);
                this.field4459.method220(18601, var4, var3);
                var3.method369(124);
                var3.method727((byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public final void method1728(boolean arg0) {
        field4447++;
        if (!arg0) {
            return;
        }
        for (class248 var2 = (class248) this.field4459.method209(16711680); var2 != null; var2 = (class248) this.field4459.method221((byte) -126)) {
            if (var2.method668(!arg0)) {
                var2.method369(-32);
                var2.method727((byte) 2);
                this.field4454++;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1729(byte arg0) {
        field4449 = null;
        field4458 = null;
        field4470 = null;
        field4457 = null;
        field4472 = null;
        if (arg0 < 9) {
            field4456 = 68;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
    public final void method1730(Object arg0, long arg1, byte arg2) {
        field4467++;
        this.method1731(arg1, (byte) -39);
        if (this.field4454 == 0) {
            class248 var5 = (class248) this.field4459.method219(21786);
            var5.method369(-124);
            var5.method727((byte) 2);
        } else {
            this.field4454--;
        }
        class193 var6 = new class193(arg0);
        int var7 = -119 / ((-arg2 - 21) / 55);
        this.field4451.method1300(var6, arg1, -2875);
        this.field4459.method217(29, var6);
        var6.field2112 = 0L;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JB)V")
    public final void method1731(long arg0, byte arg1) {
        if (arg1 > -38) {
            return;
        }
        field4465++;
        class248 var4 = (class248) this.field4451.method1298(-125, arg0);
        if (var4 != null) {
            var4.method369(-110);
            var4.method727((byte) 2);
            this.field4454++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg2 - arg3;
        int var10 = arg1 - arg5;
        field4460++;
        int var11 = (arg4 - arg8 << 16) / var9;
        int var12 = (arg6 - arg7 << 16) / var10;
        boolean var13;
        if (class182.field3107 > 0 && (class182.field3107 % 10) < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 0;
        int var15 = -117 % ((-arg0 - 49) / 50);
        while (var9 > var14) {
            int var32 = var11 * var14 >> 16;
            int var33 = (var14 + 1) * var11 >> 16;
            int var34 = var33 - var32;
            if (var34 > 0) {
                int var35 = arg8 + var32;
                int var10000 = arg8 + var33;
                int[][] var37 = class240.field4182[var14 + arg3 >> 6];
                for (int var38 = 0; var38 < var10; var38++) {
                    int var39 = (var38 + 1) * var12 >> 16;
                    int var40 = var12 * var38 >> 16;
                    int var41 = var39 - var40;
                    if (var41 > 0) {
                        int var42 = arg7 + var40;
                        var10000 = arg7 + var39;
                        int var44 = arg5 + var38 >> 6;
                        if (var37[var44] != null) {
                            int var45 = ((arg5 + var38 & 0x3F) << 6) + (arg3 + var14 & 0x3F);
                            int var46 = var37[var44][var45];
                            if (var46 != 0) {
                                class45 var47 = class220.method1389(var46 - 1, (byte) -88);
                                if (var13 && class218.field3651 == var47.field746) {
                                    class210 var48 = new class210();
                                    var48.field3565 = var42;
                                    var48.field3558 = var47.field746;
                                    var48.field3563 = var35;
                                    class67.field1207.method1272(5664, var48);
                                }
                                class118.field2159[var47.field746].method787(var35 - 7, var42 - 7);
                            }
                        }
                    }
                }
            }
            var14++;
        }
        if (class51.field904 == class4.field58) {
            for (class194 var16 = (class194) class30.field482.method1277(120); var16 != null; var16 = (class194) class30.field482.method1271(250)) {
                int var17 = var16.field3301;
                int var18 = var16.field3303;
                int var19 = class257.field4499 + class45.field753 - var17;
                int var20 = (var19 - arg5) * (arg6 - arg7) / (arg1 - arg5) + arg7;
                int var21 = var18 - class86.field1492;
                int var22 = var16.field3300;
                int var23 = (var21 - arg3) * (arg4 - arg8) / (arg2 - arg3) + arg8;
                int var24 = 16777215;
                class135 var25 = null;
                if (var22 == 0) {
                    if (class4.field58 == 3.0D) {
                        var25 = class201.field3445;
                    }
                    if (class4.field58 == 4.0D) {
                        var25 = class89.field1543;
                    }
                    if (class4.field58 == 6.0D) {
                        var25 = class114.field2095;
                    }
                    if (class4.field58 == 8.0D) {
                        var25 = class81.field1411;
                    }
                }
                if (var22 == 1) {
                    if (class4.field58 == 3.0D) {
                        var25 = class114.field2095;
                    }
                    if (class4.field58 == 4.0D) {
                        var25 = class81.field1411;
                    }
                    if (class4.field58 == 6.0D) {
                        var25 = class235.field4069;
                    }
                    if (class4.field58 == 8.0D) {
                        var25 = class75.field1307;
                    }
                }
                if (var22 == 2) {
                    if (class4.field58 == 3.0D) {
                        var25 = class235.field4069;
                    }
                    var24 = 16755200;
                    if (class4.field58 == 4.0D) {
                        var25 = class75.field1307;
                    }
                    if (class4.field58 == 6.0D) {
                        var25 = class75.field1315;
                    }
                    if (class4.field58 == 8.0D) {
                        var25 = class80.field1393;
                    }
                }
                if (var25 != null) {
                    class227[] var26 = var16.field3309;
                    int var27 = var26.length;
                    int var28 = var20 - var25.method846() * (var27 - 1) / 2;
                    int var29 = var28 + var25.method845() / 2;
                    for (int var30 = 0; var30 < var27; var30++) {
                        var25.method842(var26[var30], var23, var29, var24, true);
                        var29 += var25.method846();
                    }
                }
            }
        }
        for (class210 var31 = (class210) class67.field1207.method1277(84); var31 != null; var31 = (class210) class67.field1207.method1271(250)) {
            class118.field2159[var31.field3558].method787(var31.field3563 - 7, var31.field3565 + -7);
            class111.method691(var31.field3563, var31.field3565, 15, 16776960, 128);
            class111.method691(var31.field3563, var31.field3565, 7, 16777215, 256);
        }
        class67.field1207.method1274((byte) 109);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Z")
    public static final boolean method1733(byte arg0, int arg1) {
        field4452++;
        if (arg0 <= 46) {
            return true;
        } else {
            return ((arg1 & 0x1F4DC931) >> 28) != 0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method1734(int arg0, int arg1) {
        if (arg0 != 8) {
            method1733((byte) -19, 21);
        }
        class5.field115.method1727(true, arg1);
        field4453++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method1735(long arg0, byte arg1) {
        field4466++;
        class248 var4 = (class248) this.field4451.method1298(-128, arg0);
        if (var4 == null) {
            return null;
        }
        if (arg1 != -69) {
            field4462 = -15;
        }
        Object var5 = var4.method667((byte) 85);
        if (var5 == null) {
            var4.method369(-128);
            var4.method727((byte) 2);
            this.field4454++;
            return null;
        }
        if (var4.method668(false)) {
            class193 var6 = new class193(var5);
            this.field4451.method1300(var6, var4.field1113, -2875);
            this.field4459.method217(29, var6);
            var6.field2112 = 0L;
            var4.method369(-98);
            var4.method727((byte) 2);
        } else {
            this.field4459.method217(29, var4);
            var4.field2112 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    public class254(int arg0) {
        this.field4454 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field4448 = arg0;
        this.field4451 = new class201(var2);
    }
}
