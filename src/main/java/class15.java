import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class15 {

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lse;")
    private class139 field227 = new class139();

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Ldj;")
    private class191 field221;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field220 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "[Z")
    public static boolean[] field236 = new boolean[200];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Ltj;")
    public static class108 field216;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field237;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "[Lvj;")
    public static class256[] field235;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZJ)V")
    private final void method89(boolean arg0, long arg1) {
        if (!arg0) {
            this.method102((byte) 57);
        }
        field234++;
        class355 var4 = (class355) this.field221.method1373(arg1, -63);
        if (var4 != null) {
            var4.method2660((byte) 122);
            var4.method2365(true);
            this.field231++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method90(Object arg0, long arg1, int arg2) {
        field230++;
        this.method89(true, arg1);
        if (this.field231 == arg2) {
            class355 var5 = (class355) this.field227.method1054((byte) -68);
            var5.method2660((byte) 117);
            var5.method2365(true);
        } else {
            this.field231--;
        }
        class84 var6 = new class84(arg0);
        this.field221.method1376(var6, arg1, 85);
        this.field227.method1055(var6, 74);
        var6.field5232 = 0L;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
    public final void method91(int arg0, int arg1) {
        field232++;
        if (class68.field914 != null) {
            for (class355 var3 = (class355) this.field227.method1053(arg0 ^ 0x2A); var3 != null; var3 = (class355) this.field227.method1058(120)) {
                if (var3.method494((byte) 110)) {
                    if (var3.method491(127) == null) {
                        var3.method2660((byte) 114);
                        var3.method2365(true);
                        this.field231++;
                    }
                } else if ((long) arg1 < ++var3.field5232) {
                    class355 var4 = class68.field914.method552(var3, (byte) -48);
                    this.field221.method1376(var4, var3.field6070, 96);
                    class377.method2404(var4, 124, var3);
                    var3.method2660((byte) 120);
                    var3.method2365(true);
                }
            }
        }
        if (arg0 != 4) {
            field235 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method92(int arg0) {
        field226++;
        int var2 = arg0;
        for (class355 var3 = (class355) this.field227.method1053(63); var3 != null; var3 = (class355) this.field227.method1058(123)) {
            if (!var3.method494((byte) 121)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method93(int arg0) {
        field228++;
        if (arg0 != -26269) {
            this.method92(54);
        }
        class355 var2 = (class355) this.field221.method1378((byte) 98);
        while (var2 != null) {
            Object var3 = var2.method491(arg0 ^ 0xFFFF991D);
            if (var3 != null) {
                return var3;
            }
            class355 var4 = var2;
            var2 = (class355) this.field221.method1378((byte) 98);
            var4.method2660((byte) 113);
            var4.method2365(true);
            this.field231++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public static void method94(int arg0) {
        field220 = null;
        int var1 = 86 % ((arg0 - 23) / 33);
        field236 = null;
        field216 = null;
        field235 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lbr;B)V")
    public static final void method95(class223 arg0, byte arg1) {
        field215++;
        class223 var2 = class186.method1335(arg1 - 29, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class24.field307;
            var3 = class316.field4643;
        } else {
            var3 = var2.field3282;
            var4 = var2.field3250;
        }
        if (arg1 == 29) {
            class409.method2584(var3, var4, arg1 ^ 0x19, false, arg0);
            class269.method1833((byte) 88, var3, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method96(byte arg0) {
        if (arg0 < 90) {
            this.field221 = null;
        }
        field224++;
        class355 var2 = (class355) this.field221.method1383(-127);
        while (var2 != null) {
            Object var3 = var2.method491(-65);
            if (var3 != null) {
                return var3;
            }
            class355 var4 = var2;
            var2 = (class355) this.field221.method1378((byte) 98);
            var4.method2660((byte) 118);
            var4.method2365(true);
            this.field231++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
    public final int method97(boolean arg0) {
        if (arg0) {
            return -43;
        } else {
            field229++;
            return this.field214;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public final void method98(int arg0) {
        for (class355 var2 = (class355) this.field227.method1053(arg0 + 77); var2 != null; var2 = (class355) this.field227.method1058(117)) {
            if (var2.method494((byte) -80)) {
                var2.method2660((byte) 120);
                var2.method2365(true);
                this.field231++;
            }
        }
        if (arg0 != 0) {
            method94(44);
        }
        field217++;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZJ)Ljava/lang/Object;")
    public final Object method99(boolean arg0, long arg1) {
        if (!arg0) {
            field233 = 29;
        }
        field222++;
        class355 var4 = (class355) this.field221.method1373(arg1, 119);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method491(-70);
        if (var5 == null) {
            var4.method2660((byte) 127);
            var4.method2365(arg0);
            this.field231++;
            return null;
        }
        if (var4.method494((byte) 110)) {
            class84 var6 = new class84(var5);
            this.field221.method1376(var6, var4.field6070, 125);
            this.field227.method1055(var6, 120);
            var6.field5232 = 0L;
            var4.method2660((byte) 125);
            var4.method2365(true);
        } else {
            this.field227.method1055(var4, 83);
            var4.field5232 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
    public final int method100(byte arg0) {
        field218++;
        if (arg0 != 47) {
            field216 = null;
        }
        return this.field231;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static final void method101(byte arg0) {
        if (arg0 != -69) {
            method101((byte) -121);
        }
        class419.field6011.method102((byte) -95);
        field219++;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (arg0 < -71) {
            this.field227.method1056(11281);
            field223++;
            this.field221.method1382((byte) 47);
            this.field231 = this.field214;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILvq;I)Z")
    public static final boolean method103(int arg0, class269 arg1, int arg2) {
        field225++;
        int var3 = (class80.field1034 - 104) / 2;
        int var4 = (class381.field5414 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class173.method1232(var52, var51, var6, 126, arg2)) {
                        int var53 = var52;
                        if (class183.method1317(-28499, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class357.method2329(var6, true, var51, var53);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class332.field4831 = arg1.method876(var7, 0, 512, 512, 512);
        class88.method527(-13100);
        int var9 = (int) (Math.random() * 20.0D) - (-(((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 8) - 10) - 238) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xC1C5FF00) << 16;
        if (arg0 != 4) {
            field220 = null;
        }
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class296.field4277][class296.field4277];
        for (int var13 = var3; var13 < var3 + 104; var13 += class296.field4277) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class296.field4277) {
                arg1.method937(0, 0, class296.field4277 * 4, class296.field4277 * 4);
                arg1.method886(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class296.field4277; var44++) {
                        for (int var50 = 0; var50 < class296.field4277; var50++) {
                            var12[var44][var50] = class173.method1232(var37, var36 + var50, var13 + var44, 114, arg2);
                        }
                    }
                    class126.field1734[var37].method354(0, 0, 1024, var13, var36, var13 + class296.field4277, class296.field4277 + var36, var12);
                    if (!class110.field1416) {
                        for (int var45 = -4; var45 < class296.field4277; var45++) {
                            for (int var46 = -4; var46 < class296.field4277; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var48 >= var4 && class173.method1232(var37, var48, var47, 122, arg2)) {
                                    int var49 = var37;
                                    if (class183.method1317(arg0 ^ 0xFFFF90A9, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class185.method1328((class296.field4277 - var46) * 4 - 4, var10, (byte) 100, arg1, var45 * 4, var48, var47, var9, var49);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class110.field1416) {
                    class41 var38 = class85.field1090[arg2];
                    for (int var39 = 0; var39 < class296.field4277; var39++) {
                        for (int var40 = 0; var40 < class296.field4277; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field572[var41 - var38.field565][var42 - var38.field570];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method1832(var39 * 4, -1713569622, 4, 1, (class296.field4277 - var40) * 4 - 4, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method1841((byte) -20, var39 * 4, -1713569622, 4, (class296.field4277 - var40) * 4 - 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method1839(var39 * 4 + 3, 4, -1713569622, (byte) 96, (class296.field4277 - var40) * 4 - 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method1841((byte) -20, var39 * 4, -1713569622, 4, (class296.field4277 - var40) * 4 + 3 - 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method1839(var39 * 4, 4, -1713569622, (byte) 92, (class296.field4277 - var40) * 4 - 4);
                            }
                        }
                    }
                }
                arg1.method1012(0, 0, class296.field4277 * 4, class296.field4277 * 4, var11, 2);
                class332.field4831.method77((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + -(class296.field4277 * 4) + 464, class296.field4277 * 4, class296.field4277 * 4, 0, 0);
            }
        }
        arg1.method931();
        arg1.method886(-16777215);
        class158.method1152(-114);
        class410.field5888 = 0;
        class438.field6250.method2755(0);
        if (!class110.field1416) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; var21 <= (arg2 + 1) && var21 <= 3; var21++) {
                        if (class173.method1232(var21, var20, var14, 114, arg2)) {
                            class143 var22 = (class143) class353.method2309(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class143) class233.method1613(var21, var14, var20, field237 == null ? (field237 = method104("mb")) : field237);
                            }
                            if (var22 == null) {
                                var22 = (class143) class431.method2683(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class143) class145.method1084(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class282 var23 = class398.method2496(arg0 ^ 0xFFFFFF85, var22.method599(-10450));
                                if (!var23.field4067 || class311.field4503) {
                                    int var24 = var23.field4075;
                                    if (var23.field4115 != null) {
                                        for (int var25 = 0; var25 < var23.field4115.length; var25++) {
                                            if (var23.field4115[var25] != -1) {
                                                class282 var26 = class398.method2496(-120, var23.field4115[var25]);
                                                if (var26.field4075 >= 0) {
                                                    var24 = var26.field4075;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class297 var28 = class379.method2417(3144, var24);
                                            if (var28 != null && var28.field4315) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class85.field1090[var21].field572;
                                            int var32 = class85.field1090[var21].field565;
                                            int var33 = class85.field1090[var21].field570;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 103 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class411.field5894[class410.field5888] = var23.field4094;
                                        class21.field271[class410.field5888] = var29;
                                        class451.field6465[class410.field5888] = var30;
                                        class410.field5888++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class24.field297 != null) {
                class365.field5227.field1405 = 1;
                class235.method1617(1024, 64, 10578);
                for (int var15 = 0; var15 < class24.field297.field369; var15++) {
                    int var16 = class24.field297.field366[var15];
                    if ((var16 >> 28) == class158.field2302) {
                        int var17 = ((var16 & 0xFFFE564) >> 14) - class306.field4459;
                        int var18 = (var16 & 0x3FFF) - class342.field4959;
                        if (var17 >= 0 && var17 < class80.field1034 && var18 >= 0 && class381.field5414 > var18) {
                            class438.field6250.method2756(63, new class24(var15));
                        } else {
                            class297 var19 = class379.method2417(3144, class24.field297.field370[var15]);
                            if (var19.field4313 != null && (var17 + var19.field4303) >= 0 && class80.field1034 > var19.field4308 + var17 && var19.field4328 + var18 >= 0 && (var18 + var19.field4318) < class381.field5414) {
                                class438.field6250.method2756(100, new class24(var15));
                            }
                        }
                    }
                }
                class235.method1617(128, 64, 10578);
                class365.field5227.field1405 = 2;
                class365.field5227.method658(true);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
    public class15(int arg0) {
        this.field214 = arg0;
        this.field231 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field221 = new class191(var2);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method104(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
