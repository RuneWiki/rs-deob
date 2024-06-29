import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class145 implements class204 {

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Z")
    private boolean field2377 = false;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    private int field2371 = 50;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Ljb;")
    private class11 field2359;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Ljb;")
    private class11 field2374;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "Lak;")
    private class152 field2388;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "[Z")
    private boolean[] field2356;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[Z")
    private boolean[] field2358;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[B")
    private byte[] field2367;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "[B")
    private byte[] field2384;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[Z")
    private boolean[] field2366;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[B")
    private byte[] field2360;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "[B")
    private byte[] field2380;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "[Z")
    private boolean[] field2370;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[S")
    private short[] field2352;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "[Z")
    private boolean[] field2379;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2351 = 0;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "Lsc;")
    public static class181 field2357 = class149.method967(255, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field2362 = 0;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Ld;")
    public static class120 field2354;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Z")
    public static boolean field2372;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Z")
    public static boolean field2376;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "[I")
    public static int[] field2389;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Z")
    public final boolean method932(int arg0, byte arg1) {
        if (arg1 > -12) {
            method938(true);
        }
        field2378++;
        class129 var3 = this.method940(arg0, 0);
        return var3 == null ? false : var3.method833(this.field2374, -107, this);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(IB)Z")
    public final boolean method933(int arg0, byte arg1) {
        field2365++;
        if (arg1 < 34) {
            this.method935(-5, (byte) 30);
        }
        return this.field2377 || this.field2379[arg0];
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method934(int arg0, Component arg1) {
        if (arg0 <= 22) {
            field2351 = 42;
        }
        arg1.removeMouseListener(class46.field726);
        field2383++;
        arg1.removeMouseMotionListener(class46.field726);
        arg1.removeFocusListener(class46.field726);
        class41.field625 = 0;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)Z")
    public final boolean method935(int arg0, byte arg1) {
        field2387++;
        if (arg1 > -114) {
            this.field2371 = -43;
        }
        return this.field2356[arg0];
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)V")
    public final void method936(int arg0, boolean arg1) {
        field2382++;
        if (arg0 != -1) {
            this.method932(-46, (byte) 97);
        }
        this.field2377 = arg1;
        this.method945((byte) 119);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method937(int arg0) {
        field2357 = null;
        if (arg0 != 32232) {
            field2362 = 101;
        }
        field2354 = null;
        field2389 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static final void method938(boolean arg0) {
        field2381++;
        for (int var1 = 0; var1 < 5; var1++) {
            class18.field327[var1] = false;
        }
        if (!arg0) {
            field2372 = false;
        }
        class123.field2017 = -1;
        class110.field1792 = 1;
        class193.field3387 = -1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
    public final boolean method939(int arg0, int arg1) {
        field2386++;
        if (arg0 <= 53) {
            this.method933(-33, (byte) -119);
        }
        return this.field2358[arg1];
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(II)Lck;")
    private final class129 method940(int arg0, int arg1) {
        class129 var3 = (class129) this.field2388.method990((byte) 80, (long) arg0);
        field2368++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2359.method89(arg1, arg0, 97);
        if (var4 == null) {
            return null;
        } else {
            class230 var5 = new class230(var4);
            class129 var6 = new class129(var5);
            this.field2388.method982(var6, (byte) 60, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)V")
    public final void method941(byte arg0, int arg1) {
        for (class129 var3 = (class129) this.field2388.method983((byte) 115); var3 != null; var3 = (class129) this.field2388.method984(-109)) {
            if (var3.field2150) {
                var3.method832(arg1, 0);
                var3.field2150 = false;
            }
        }
        if (arg0 != 16) {
            method937(2);
        }
        field2375++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIF)[I")
    public final int[] method942(byte arg0, int arg1, float arg2) {
        int var4 = 85 / ((-arg0 - 73) / 39);
        field2373++;
        class129 var5 = this.method940(arg1, 0);
        if (var5 == null) {
            return null;
        } else {
            var5.field2150 = true;
            return var5.method834(this.field2377 || this.field2379[arg1], arg2, this.field2374, this, false);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public static final boolean method943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2364++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class256.field4485[var12][var31] = 0;
                class183.field3216[var12][var31] = 99999999;
            }
        }
        if (arg9 <= 13) {
            method934(-72, (Component) null);
        }
        int var13 = arg8;
        class256.field4485[arg8][arg1] = 99;
        byte var14 = 0;
        int var15 = arg1;
        class183.field3216[arg8][arg1] = 0;
        int var16 = 0;
        boolean var17 = false;
        class94.field1510[var14] = arg8;
        int var32 = var14 + 1;
        class26.field456[var14] = arg1;
        int[][] var18 = class109.field1784[class38.field581].field142;
        while (var32 != var16) {
            var13 = class94.field1510[var16];
            var15 = class26.field456[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg10 == var13 && arg3 == var15) {
                var17 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class109.field1784[class38.field581].method70(var13, false, arg2, var15, arg11 - 1, arg10, arg3, 2)) {
                    var17 = true;
                    break;
                }
                if (arg11 < 10 && class109.field1784[class38.field581].method60(arg2, var15, var13, arg3, arg10, 2, 116, arg11 - 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg0 != 0 && class109.field1784[class38.field581].method72(arg10, arg3, arg5, 2, -30832, arg7, arg0, var15, var13)) {
                var17 = true;
                break;
            }
            int var30 = class183.field3216[var13][var15] + 1;
            if (var13 > 0 && class256.field4485[var13 - 1][var15] == 0 && (var18[var13 - 1][var15] & 0x12C010E) == 0 && (var18[var13 - 1][var15 + 1] & 0x12C0138) == 0) {
                class94.field1510[var32] = var13 - 1;
                class26.field456[var32] = var15;
                class256.field4485[var13 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class183.field3216[var13 - 1][var15] = var30;
            }
            if (var13 < 102 && class256.field4485[var13 + 1][var15] == 0 && (var18[var13 + 2][var15] & 0x12C0183) == 0 && (var18[var13 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class94.field1510[var32] = var13 + 1;
                class26.field456[var32] = var15;
                class256.field4485[var13 + 1][var15] = 8;
                class183.field3216[var13 + 1][var15] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && class256.field4485[var13][var15 - 1] == 0 && (var18[var13][var15 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var15 - 1] & 0x12C0183) == 0) {
                class94.field1510[var32] = var13;
                class26.field456[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class256.field4485[var13][var15 - 1] = 1;
                class183.field3216[var13][var15 - 1] = var30;
            }
            if (var15 < 102 && class256.field4485[var13][var15 + 1] == 0 && (var18[var13][var15 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class94.field1510[var32] = var13;
                class26.field456[var32] = var15 + 1;
                class256.field4485[var13][var15 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class183.field3216[var13][var15 + 1] = var30;
            }
            if (var13 > 0 && var15 > 0 && class256.field4485[var13 - 1][var15 - 1] == 0 && (var18[var13 - 1][var15] & 0x12C0138) == 0 && (var18[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[var13][var15 - 1] & 0x12C0183) == 0) {
                class94.field1510[var32] = var13 - 1;
                class26.field456[var32] = var15 - 1;
                class256.field4485[var13 - 1][var15 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class183.field3216[var13 - 1][var15 - 1] = var30;
            }
            if (var13 < 102 && var15 > 0 && class256.field4485[var13 + 1][var15 - 1] == 0 && (var18[var13 + 1][var15 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var15 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var15] & 0x12C01E0) == 0) {
                class94.field1510[var32] = var13 + 1;
                class26.field456[var32] = var15 - 1;
                class256.field4485[var13 + 1][var15 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class183.field3216[var13 + 1][var15 - 1] = var30;
            }
            if (var13 > 0 && var15 < 102 && class256.field4485[var13 - 1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var15 + 2] & 0x12C0138) == 0 && (var18[var13][var15 + 2] & 0x12C01E0) == 0) {
                class94.field1510[var32] = var13 - 1;
                class26.field456[var32] = var15 + 1;
                class256.field4485[var13 - 1][var15 + 1] = 6;
                class183.field3216[var13 - 1][var15 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var15 < 102 && class256.field4485[var13 + 1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var15 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var15 + 1] & 0x12C0183) == 0) {
                class94.field1510[var32] = var13 + 1;
                class26.field456[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class256.field4485[var13 + 1][var15 + 1] = 12;
                class183.field3216[var13 + 1][var15 + 1] = var30;
            }
        }
        class253.field4412 = 0;
        if (!var17) {
            if (!arg6) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg10 - var21; var22 <= (arg10 + var21); var22++) {
                for (int var23 = arg3 - var21; var23 <= (arg3 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class183.field3216[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg10 > var22) {
                            var24 = arg10 - var22;
                        } else if (arg7 + arg10 - 1 < var22) {
                            var24 = 1 - arg10 - (arg7 - var22);
                        }
                        int var25 = 0;
                        if (arg3 > var23) {
                            var25 = arg3 - var23;
                        } else if (var23 > (arg3 - (1 - arg0))) {
                            var25 = var23 + 1 - arg0 - arg3;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && class183.field3216[var22][var23] < var20) {
                            var20 = class183.field3216[var22][var23];
                            var19 = var26;
                            var13 = var22;
                            var15 = var23;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg1 == var15) {
                return false;
            }
            class253.field4412 = 1;
        }
        byte var27 = 0;
        class94.field1510[var27] = var13;
        int var33 = var27 + 1;
        class26.field456[var27] = var15;
        int var28;
        int var29 = var28 = class256.field4485[var13][var15];
        while (arg8 != var13 || arg1 != var15) {
            if (var28 != var29) {
                class94.field1510[var33] = var13;
                class26.field456[var33++] = var15;
                var28 = var29;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var15++;
            } else if ((var29 & 0x4) != 0) {
                var15--;
            }
            var29 = class256.field4485[var13][var15];
        }
        if (var33 > 0) {
            class203.method1360(var33, arg4, 122);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BZLsc;)V")
    public static final void method944(byte arg0, boolean arg1, class181 arg2) {
        if (arg0 > -69) {
            field2351 = -60;
        }
        if (arg1) {
            try {
                class61.field924.getAppletContext().showDocument(arg2.method1210(-18, class61.field924.getCodeBase()), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class61.field924.getAppletContext().showDocument(arg2.method1210(75, class61.field924.getCodeBase()), "_top");
            } catch (Exception var3) {
            }
        }
        field2369++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public final void method945(byte arg0) {
        field2385++;
        this.field2388.method986(-12939);
        if (arg0 <= 56) {
            this.method939(-105, 52);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II)[I")
    public final int[] method946(int arg0, int arg1) {
        field2361++;
        class129 var3 = this.method940(arg1, arg0 + 1);
        if (var3 == null) {
            return null;
        } else if (arg0 == -1) {
            return var3.method829(-81, this, this.field2374, this.field2377 || this.field2379[arg1]);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IZ)V")
    public static final void method947(int arg0, boolean arg1) {
        if (!arg1) {
            method937(78);
        }
        if (arg0 == -1 && !class148.field2479) {
            class21.method191(5495);
        } else if (arg0 != -1 && (class152.field2527 != arg0 || !class141.method905(-7569)) && class94.field1502 != 0 && !class148.field2479) {
            class77.method536(arg0, false, 116, 2, 0, class13.field266, class94.field1502);
        }
        class152.field2527 = arg0;
        field2363++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
    public final int method948(int arg0, int arg1) {
        field2355++;
        if (arg0 != 65535) {
            this.method936(-14, true);
        }
        return this.field2352[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljb;Ljb;Ljb;IZ)V")
    public class145(class11 arg0, class11 arg1, class11 arg2, int arg3, boolean arg4) {
        this.field2359 = arg0;
        this.field2377 = arg4;
        this.field2371 = arg3;
        this.field2374 = arg2;
        this.field2388 = new class152(this.field2371);
        class230 var6 = new class230(arg1.method89(0, 0, 119));
        int var7 = var6.method1535(2);
        this.field2356 = new boolean[var7];
        this.field2358 = new boolean[var7];
        this.field2367 = new byte[var7];
        this.field2384 = new byte[var7];
        this.field2366 = new boolean[var7];
        this.field2360 = new byte[var7];
        this.field2380 = new byte[var7];
        this.field2370 = new boolean[var7];
        this.field2352 = new short[var7];
        this.field2379 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2366[var8] = var6.method1516((byte) 82) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2366[var9]) {
                this.field2358[var9] = var6.method1516((byte) 82) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2366[var10]) {
                this.field2356[var10] = var6.method1516((byte) 82) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2366[var11]) {
                this.field2379[var11] = var6.method1516((byte) 82) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2366[var12]) {
                this.field2370[var12] = var6.method1516((byte) 82) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2366[var13]) {
                this.field2380[var13] = var6.method1563(-255688184);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2366[var14]) {
                this.field2360[var14] = var6.method1563(-255688184);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2366[var15]) {
                this.field2367[var15] = var6.method1563(-255688184);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2366[var16]) {
                this.field2384[var16] = var6.method1563(-255688184);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2366[var17]) {
                this.field2352[var17] = (short) var6.method1535(2);
            }
        }
    }
}
