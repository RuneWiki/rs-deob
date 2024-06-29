import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class89 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Ldd;")
    private class259 field1344 = new class259();

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Lee;")
    private class195 field1354 = new class195();

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Ldb;")
    private class39 field1356;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Z")
    public static volatile boolean field1343 = true;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "F")
    public static float field1349 = 0.0F;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
    public static int[] field1357 = new int[5];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[Lji;")
    public static class256[] field1347;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method670(byte arg0) {
        this.field1354.method1320(false);
        field1342++;
        if (arg0 > -46) {
            this.method670((byte) 5);
        }
        this.field1356.method305((byte) -67);
        this.field1344 = new class259();
        this.field1359 = this.field1353;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IB[I[ILgk;)V")
    public static final void method671(int[] arg0, byte arg1, int[] arg2, int[] arg3, class224 arg4) {
        field1351++;
        int var5 = 0;
        if (arg1 != -1) {
            return;
        }
        while (arg2.length > var5) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var8 != 0 && arg4.field485.length > var9; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field485[var9] = null;
                    } else {
                        class220 var10 = class108.method781(var6, -1);
                        int var11 = var10.field3406;
                        class85 var12 = arg4.field485[var9];
                        if (var12 != null) {
                            if (var12.field1309 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field485[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1308 = 0;
                                    var12.field1298 = 0;
                                    var12.field1307 = 1;
                                    var12.field1310 = 0;
                                    var12.field1304 = var7;
                                    class244.method1664(arg4.field455, class185.field2687 == arg4, 0, arg4.field425, arg1 + 8891, var10);
                                } else if (var11 == 2) {
                                    var12.field1310 = 0;
                                }
                            } else if (var10.field3427 >= class108.method781(var12.field1309, -1).field3427) {
                                var12 = arg4.field485[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class85 var13 = arg4.field485[var9] = new class85();
                            var13.field1304 = var7;
                            var13.field1310 = 0;
                            var13.field1309 = var6;
                            var13.field1307 = 1;
                            var13.field1298 = 0;
                            var13.field1308 = 0;
                            class244.method1664(arg4.field455, class185.field2687 == arg4, 0, arg4.field425, arg1 ^ 0xFFFFDD45, var10);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lug;")
    public final class181 method672(int arg0) {
        field1341++;
        if (arg0 != 0) {
            field1343 = true;
        }
        return this.field1356.method315((byte) -48);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Lug;")
    public final class181 method673(int arg0) {
        if (arg0 == 23971) {
            field1350++;
            return this.field1356.method310(-99);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public static void method674(byte arg0) {
        field1347 = null;
        if (arg0 != 104) {
            field1343 = true;
        }
        field1357 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)Ldd;")
    public final class259 method675(int arg0, long arg1) {
        field1346++;
        class259 var4 = (class259) this.field1356.method306(arg1, 16216);
        if (arg0 != 31558) {
            this.field1344 = null;
        }
        if (var4 != null) {
            this.field1354.method1315((byte) -48, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)[Lji;")
    public static final class256[] method676(int arg0) {
        field1352++;
        class256[] var1 = new class256[class246.field3823];
        int var2 = 0;
        if (arg0 != 19748) {
            method676(-89);
        }
        while (class246.field3823 > var2) {
            byte[] var3 = class209.field3125[var2];
            int var4 = class27.field525[var2] * class173.field2530[var2];
            if (class210.field3134[var2]) {
                int[] var5 = new int[var4];
                byte[] var6 = class82.field1270[var2];
                for (int var7 = 0; var7 < var4; var7++) {
                    var5[var7] = class186.method1215(class131.method904(var6[var7] << 24, -16777216), class15.field221[class131.method904(255, var3[var7])]);
                }
                var1[var2] = new class187(client.field729, class126.field1857, class135.field1973[var2], class5.field69[var2], class27.field525[var2], class173.field2530[var2], var5);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class15.field221[class131.method904(255, var3[var9])];
                }
                var1[var2] = new class289(client.field729, class126.field1857, class135.field1973[var2], class5.field69[var2], class27.field525[var2], class173.field2530[var2], var8);
            }
            var2++;
        }
        class293.method1936(arg0 ^ 0xFFFFB2D7);
        return var1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BJLdd;)V")
    public final void method677(byte arg0, long arg1, class259 arg2) {
        int var5 = -53 / ((arg0 - 46) / 58);
        if (this.field1359 == 0) {
            class259 var6 = this.field1354.method1312((byte) -101);
            var6.method1193(109);
            var6.method1746(11);
            if (this.field1344 == var6) {
                class259 var7 = this.field1354.method1312((byte) -80);
                var7.method1193(116);
                var7.method1746(-72);
            }
        } else {
            this.field1359--;
        }
        this.field1356.method309((byte) -8, arg2, arg1);
        this.field1354.method1315((byte) -48, arg2);
        field1345++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ICZ)I")
    public static final int method678(int arg0, char arg1, boolean arg2) {
        field1358++;
        int var3 = arg1 << 4;
        if (arg2) {
            field1347 = null;
        }
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLpk;Lpk;II)Lwi;")
    public static final class192 method679(boolean arg0, class237 arg1, class237 arg2, int arg3, int arg4) {
        field1355++;
        if (class223.method1526(arg3, arg4, (byte) 112, arg1)) {
            if (arg0) {
                field1347 = null;
            }
            return class47.method371(arg2.method1605(-125, arg4, arg3), (byte) -117);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
    public class89(int arg0) {
        this.field1353 = arg0;
        this.field1359 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1356 = new class39(var2);
    }
}
