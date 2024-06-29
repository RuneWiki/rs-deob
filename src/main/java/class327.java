import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class327 {

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Z")
    public static boolean field4338 = false;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
    public static int[] field4341 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field4349 = 1;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Z")
    public static boolean field4346 = false;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "[Z")
    public static boolean[] field4362 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Ldg;")
    public class222 field4363;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Lnr;")
    public static class437 field4354;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[I")
    public int[] field4337;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[I")
    public int[] field4343;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[I")
    public static int[] field4345;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "[I")
    public int[] field4352;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "[I")
    public static int[] field4353;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "[I")
    public int[] field4357;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "[I")
    public int[] field4359;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "[I")
    public int[] field4360;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[Ldg;")
    public class222[] field4339;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[[I")
    public int[][] field4347;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "[[I")
    public int[][] field4358;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 4)
    public static final void method1873(boolean arg0, String arg1) {
        field4356++;
        if (arg1 == null) {
            return;
        }
        if (!(class88.field993 < 100 || class244.field3326) || class88.field993 >= 200) {
            class371.method2240(class88.field1000, -62);
            return;
        }
        String var2 = class88.method482((byte) 103, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class88.field993; var3++) {
            String var7 = class88.method482((byte) 99, class198.field2647[var3]);
            if (var7 != null && var7.equals(var2)) {
                class371.method2240(arg1 + class172.field2160, 115);
                return;
            }
            if (class182.field2309[var3] != null) {
                String var8 = class88.method482((byte) 56, class182.field2309[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class371.method2240(arg1 + class172.field2160, -98);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class452.field6573; var4++) {
            String var5 = class88.method482((byte) 47, class333.field4427[var4]);
            if (var5 != null && var5.equals(var2)) {
                class371.method2240(class236.field3256 + arg1 + class366.field5128, 112);
                return;
            }
            if (class139.field1782[var4] != null) {
                String var6 = class88.method482((byte) 100, class139.field1782[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class371.method2240(class236.field3256 + arg1 + class366.field5128, 124);
                    return;
                }
            }
        }
        if (arg0) {
            method1874(93, -87);
        }
        if (class88.method482((byte) 99, class427.field6264.field2034).equals(var2)) {
            class371.method2240(class32.field313, -79);
        } else {
            class97.field1149++;
            class281.field3857.method295(20579, 34);
            class281.field3857.method1386(-222840624, class75.method426(28555, arg1));
            class281.field3857.method1343(arg1, 22608);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V", line = 101)
    public static final void method1874(int arg0, int arg1) {
        class151.field1919.method614(-121, arg1);
        if (arg0 != -4005) {
            method1876(-110, (class322) null, 48);
        }
        field4340++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 126)
    public static void method1875(int arg0) {
        if (arg0 != 16165) {
            method1876(-94, (class322) null, -115);
        }
        field4341 = null;
        field4362 = null;
        field4354 = null;
        field4345 = null;
        field4353 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILvm;I)V", line = 140)
    public static final void method1876(int arg0, class322 arg1, int arg2) {
        if (arg2 != 25418) {
            return;
        }
        field4361++;
        class40.method192(arg1);
        if (arg0 > 1) {
            for (int var3 = 0; var3 < class315.field4214; var3++) {
                for (int var4 = 0; var4 < class340.field4549; var4++) {
                    if ((class282.field3872[1][var3][var4] & 0x2) == 2) {
                        class27.method134(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            for (int var6 = 0; var6 <= class340.field4549; var6++) {
                for (int var7 = 0; var7 <= class315.field4214; var7++) {
                    if ((class398.field5751[var5][var7][var6] & 0x1) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && (class398.field5751[var5][var7][var8 - 1] & 0x1) != 0) {
                            var8--;
                        }
                        int var11 = var5;
                        while (var9 < class340.field4549 && (class398.field5751[var5][var7][var9 + 1] & 0x1) != 0) {
                            var9++;
                        }
                        label170: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; var12++) {
                                if ((class398.field5751[var10 - 1][var7][var12] & 0x1) == 0) {
                                    break label170;
                                }
                            }
                            var10--;
                        }
                        label159: while (var11 < 3) {
                            for (int var13 = var8; var13 <= var9; var13++) {
                                if ((class398.field5751[var11 + 1][var7][var13] & 0x1) == 0) {
                                    break label159;
                                }
                            }
                            var11++;
                        }
                        int var14 = (var11 + 1 - var10) * (var9 + 1 - var8);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = class432.field6340[var11][var7][var8] - var15;
                            int var17 = class432.field6340[var10][var7][var8];
                            class140.method763(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                            for (int var18 = var10; var18 <= var11; var18++) {
                                for (int var19 = var8; var19 <= var9; var19++) {
                                    class398.field5751[var18][var7][var19] = (byte) class262.method1461(class398.field5751[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((class398.field5751[var5][var7][var6] & 0x2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (var20 > 0 && (class398.field5751[var5][var20 - 1][var6] & 0x2) != 0) {
                            var20--;
                        }
                        while (var21 < class315.field4214 && (class398.field5751[var5][var21 + 1][var6] & 0x2) != 0) {
                            var21++;
                        }
                        label224: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; var24++) {
                                if ((class398.field5751[var22 - 1][var24][var6] & 0x2) == 0) {
                                    break label224;
                                }
                            }
                            var22--;
                        }
                        label213: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; var25++) {
                                if ((class398.field5751[var23 + 1][var25][var6] & 0x2) == 0) {
                                    break label213;
                                }
                            }
                            var23++;
                        }
                        int var26 = (var21 + 1 - var20) * (var23 + 1 - var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = class432.field6340[var23][var20][var6] - var27;
                            int var29 = class432.field6340[var22][var20][var6];
                            class140.method763(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                            for (int var30 = var22; var30 <= var23; var30++) {
                                for (int var31 = var20; var31 <= var21; var31++) {
                                    class398.field5751[var30][var31][var6] = (byte) class262.method1461(class398.field5751[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((class398.field5751[var5][var7][var6] & 0x4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && (class398.field5751[var5][var7][var34 - 1] & 0x4) != 0; var34--) {
                        }
                        int var35;
                        for (var35 = var6; var35 < class340.field4549 && (class398.field5751[var5][var7][var35 + 1] & 0x4) != 0; var35++) {
                        }
                        label277: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; var36++) {
                                if ((class398.field5751[var5][var32 - 1][var36] & 0x4) == 0) {
                                    break label277;
                                }
                            }
                            var32--;
                        }
                        label266: while (var33 < class315.field4214) {
                            for (int var37 = var34; var37 <= var35; var37++) {
                                if ((class398.field5751[var5][var33 + 1][var37] & 0x4) == 0) {
                                    break label266;
                                }
                            }
                            var33++;
                        }
                        if ((var33 + 1 - var32) * (var35 + 1 - var34) >= 4) {
                            int var38 = class432.field6340[var5][var32][var34];
                            class140.method763(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; var39++) {
                                for (int var40 = var34; var40 <= var35; var40++) {
                                    class398.field5751[var5][var39][var40] = (byte) class262.method1461(class398.field5751[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([BI)V", line = 444)
    private final void method1877(byte[] arg0, int arg1) {
        field4350++;
        class250 var3 = new class250(class189.method1016((byte) 101, arg0));
        int var4 = var3.method1350(31351);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4342 = var3.method1359(255);
        } else {
            this.field4342 = 0;
        }
        int var5 = var3.method1350(31351);
        this.field4344 = var3.method1374(arg1 - 2);
        int var6 = 0;
        this.field4359 = new int[this.field4344];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field4344; var8++) {
            this.field4359[var8] = var6 += var3.method1374(arg1 - 2);
            if (var7 < this.field4359[var8]) {
                var7 = this.field4359[var8];
            }
        }
        this.field4355 = var7 + 1;
        this.field4337 = new int[this.field4355];
        this.field4352 = new int[this.field4355];
        this.field4347 = new int[this.field4355][];
        this.field4343 = new int[this.field4355];
        this.field4357 = new int[this.field4355];
        if (var5 != 0) {
            this.field4360 = new int[this.field4355];
            for (int var9 = 0; var9 < this.field4355; var9++) {
                this.field4360[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4344; var10++) {
                this.field4360[this.field4359[var10]] = var3.method1359(255);
            }
            this.field4363 = new class222(this.field4360);
        }
        for (int var11 = 0; var11 < this.field4344; var11++) {
            this.field4343[this.field4359[var11]] = var3.method1359(255);
        }
        for (int var12 = 0; var12 < this.field4344; var12++) {
            this.field4357[this.field4359[var12]] = var3.method1359(255);
        }
        for (int var13 = arg1; var13 < this.field4344; var13++) {
            this.field4352[this.field4359[var13]] = var3.method1374(-2);
        }
        for (int var14 = 0; var14 < this.field4344; var14++) {
            int var21 = this.field4359[var14];
            int var22 = 0;
            int var23 = this.field4352[var21];
            int var24 = -1;
            this.field4347[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field4347[var21][var25] = var22 += var3.method1374(-2);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field4337[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field4347[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4358 = new int[var7 + 1][];
        this.field4339 = new class222[var7 + 1];
        for (int var15 = 0; var15 < this.field4344; var15++) {
            int var16 = this.field4359[var15];
            int var17 = this.field4352[var16];
            this.field4358[var16] = new int[this.field4337[var16]];
            for (int var18 = 0; var18 < this.field4337[var16]; var18++) {
                this.field4358[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4347[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4347[var16][var19];
                }
                this.field4358[var16][var20] = var3.method1359(arg1 + 255);
            }
            this.field4339[var16] = new class222(this.field4358[var16]);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([BI)V", line = 632)
    public class327(byte[] arg0, int arg1) {
        this.field4351 = class305.method1794(arg0, arg0.length, 0);
        if (this.field4351 != arg1) {
            throw new RuntimeException();
        }
        this.method1877(arg0, 0);
    }
}
