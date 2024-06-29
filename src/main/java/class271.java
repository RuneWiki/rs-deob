import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class271 {

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "[B")
    public byte[] field4368 = new byte[18002];

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "[I")
    public int[] field4380 = new int[256];

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[[I")
    public int[][] field4359 = new int[6][258];

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "[[B")
    public byte[][] field4382 = new byte[6][258];

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "[Z")
    public boolean[] field4391 = new boolean[16];

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "[B")
    public byte[] field4377 = new byte[4096];

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public int field4378 = 0;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[B")
    public byte[] field4366 = new byte[18002];

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public int field4389 = 0;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "[I")
    public int[] field4396 = new int[257];

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "[I")
    public int[] field4374 = new int[16];

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[B")
    public byte[] field4367 = new byte[256];

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "[[I")
    public int[][] field4397 = new int[6][258];

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "[[I")
    public int[][] field4384 = new int[6][258];

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "[Z")
    public boolean[] field4398 = new boolean[256];

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "[I")
    public int[] field4390 = new int[6];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Z")
    public static boolean field4356 = true;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[Ldl;")
    public static class49[] field4360 = new class49[50];

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "B")
    public byte field4364;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public int field4362;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "[B")
    public byte[] field4392;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "[B")
    public byte[] field4395;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "[Ltb;")
    public static class199[] field4388;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "[Lsm;")
    public static class283[] field4379;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBIII)V", line = 11)
    public static final void method1913(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= arg0) {
            for (int var5 = arg3; var5 < arg0; var5++) {
                class239.field3829[var5][arg2] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg3; var6++) {
                class239.field3829[var6][arg2] = arg4;
            }
        }
        field4376++;
        if (arg1 >= -112) {
            method1919(-36);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method1914(boolean arg0) {
        field4385++;
        class285.field4642.method844(-4, 216);
        if (arg0) {
            field4383 = 17;
        }
        class285.field4642.method778(class313.field5287, (byte) -4);
        class76.field1137++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Ljl;", line = 62)
    public static final class57 method1915(int arg0, int arg1) {
        field4375++;
        class57 var2 = (class57) class222.field3540.method136((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        class57 var3 = class302.method2076(class312.field5273, false, class10.field137, (byte) 57, arg0);
        if (var3 != null) {
            class222.field3540.method132((long) arg0, var3, -1);
        }
        if (arg1 != 0) {
            field4360 = (class49[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILmh;IZII)V", line = 91)
    public static final void method1916(int arg0, class65 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class298.field4829 = arg2;
        class44.field698 = 10000;
        class60.field888 = arg3;
        class301.field4874 = arg1;
        class77.field1142 = arg4;
        if (arg0 == 16611) {
            class65.field994 = arg5;
            class199.field3199 = 1;
            field4386++;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Z", line = 122)
    public static final boolean method1917(int arg0, int arg1, int arg2) {
        field4400++;
        if (arg0 < 8) {
            return true;
        } else {
            return (arg1 >> arg2 + 1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[B)[B", line = 140)
    public static final byte[] method1918(int arg0, byte[] arg1) {
        field4393++;
        class112 var2 = new class112(arg1);
        int var3 = var2.method792(2);
        if (arg0 != 258) {
            method1917(-75, 59, -69);
        }
        int var4 = var2.method779(arg0 - 27358);
        if (var4 < 0 || class239.field3832 != 0 && class239.field3832 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method807(var4, var5, (byte) 117, 0);
            return var5;
        } else {
            int var6 = var2.method779(-27100);
            if (var6 < 0 || !(class239.field3832 == 0 || var6 <= class239.field3832)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class229.method1641(var7, var6, arg1, var4, 9);
            } else {
                class75.field1109.method1038(var2, -10, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 200)
    public static void method1919(int arg0) {
        field4388 = null;
        field4360 = null;
        if (arg0 == -29322) {
            field4379 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([BI)V", line = 242)
    public static final void method1920(byte[] arg0, int arg1) {
        class112 var2 = new class112(arg0);
        field4399++;
        var2.field1640 = arg0.length - 2;
        class181.field2940 = var2.method759((byte) -42);
        class173.field2812 = new int[class181.field2940];
        class185.field3027 = new byte[class181.field2940][];
        class223.field3562 = new byte[class181.field2940][];
        class95.field1412 = new int[class181.field2940];
        class69.field1040 = new int[class181.field2940];
        class116.field1684 = new boolean[class181.field2940];
        class314.field5288 = new int[class181.field2940];
        var2.field1640 = arg0.length - (class181.field2940 * 8) - 7;
        class204.field3299 = var2.method759((byte) -72);
        class205.field3318 = var2.method759((byte) -98);
        int var3 = (var2.method792(2) & 0xFF) + 1;
        if (arg1 != 4483) {
            field4383 = 36;
        }
        for (int var4 = 0; var4 < class181.field2940; var4++) {
            class95.field1412[var4] = var2.method759((byte) -69);
        }
        for (int var5 = 0; var5 < class181.field2940; var5++) {
            class314.field5288[var5] = var2.method759((byte) -98);
        }
        for (int var6 = 0; var6 < class181.field2940; var6++) {
            class69.field1040[var6] = var2.method759((byte) -106);
        }
        for (int var7 = 0; var7 < class181.field2940; var7++) {
            class173.field2812[var7] = var2.method759((byte) -70);
        }
        var2.field1640 = arg0.length + 3 - (var3 * 3) - (class181.field2940 * 8) - 7;
        class312.field5263 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class312.field5263[var8] = var2.method757(class26.method169(arg1, 16222));
            if (class312.field5263[var8] == 0) {
                class312.field5263[var8] = 1;
            }
        }
        var2.field1640 = 0;
        for (int var9 = 0; var9 < class181.field2940; var9++) {
            int var10 = class69.field1040[var9];
            int var11 = class173.field2812[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class223.field3562[var9] = var13;
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class185.field3027[var9] = var14;
            int var16 = var2.method792(2);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method785((byte) -108);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method785((byte) -124);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label100: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label100;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var14[var10 * var23 + var22] = var2.method785((byte) -128);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var20 + (var10 * var21)] = var2.method785((byte) -90);
                    }
                    var20++;
                }
            }
            class116.field1684[var9] = var15;
        }
    }
}
