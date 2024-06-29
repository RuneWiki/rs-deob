import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class90 extends class320 {

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "[B")
    public byte[] field1420;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "[S")
    public short[] field1430;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "[Ldm;")
    public class311[] field1427;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "[I")
    private int[] field1426;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "[Lri;")
    public class76[] field1421;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "[B")
    public byte[] field1419;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "[B")
    public byte[] field1417;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "[[S")
    public static short[][] field1418 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "[[I")
    public static int[][] field1435 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field1436 = 2301979;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "Z")
    public static boolean field1429;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "[[[B")
    public static byte[][][] field1425;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 4)
    public static void method787(int arg0) {
        if (arg0 != 1) {
            method787(29);
        }
        field1435 = (int[][]) null;
        field1418 = (short[][]) null;
        field1425 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([BLcd;I[I)Z", line = 34)
    public final boolean method788(byte[] arg0, class77 arg1, int arg2, int[] arg3) {
        if (arg2 < 7) {
            field1418 = (short[][]) ((short[][]) null);
        }
        int var5 = 0;
        field1431++;
        boolean var6 = true;
        class76 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field1426[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method702(-10321, var9 >> 2, arg3);
                        } else {
                            var7 = arg1.method705(arg3, 15853, var9 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1421[var8] = var7;
                        this.field1426[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 90)
    public static final boolean method789(String arg0, byte arg1) {
        field1433++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        int var3 = 92 / ((arg1 - 58) / 47);
        while (var2 < class352.field5570) {
            if (arg0.equalsIgnoreCase(class98.field1601[var2])) {
                return true;
            }
            var2++;
        }
        if (arg0.equalsIgnoreCase(class218.field3632.field3491)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lta;I)V", line = 118)
    public static final void method790(class217 arg0, int arg1) {
        field1434++;
        if (arg1 > -108) {
            method789((String) null, (byte) -44);
        }
        short var2 = 256;
        for (int var3 = 0; var3 < class116.field2033.length; var3++) {
            class116.field2033[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class116.field2033[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class293.field4696[var9] = (class116.field2033[var9 + 128] + class116.field2033[var9 - 128] + class116.field2033[var9 + -1] + class116.field2033[var9 + 1]) / 4;
                }
            }
            int[] var10 = class116.field2033;
            class116.field2033 = class293.field4696;
            class293.field4696 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field4048; var12++) {
            for (int var13 = 0; var13 < arg0.field4054; var13++) {
                if (arg0.field3623[var11++] != 0) {
                    int var14 = var13 + arg0.field4051 + 16;
                    int var15 = var12 + arg0.field4052 + 16;
                    int var16 = (var15 << 7) + var14;
                    class116.field2033[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 225)
    public final void method791(int arg0) {
        this.field1426 = null;
        field1422++;
        if (arg0 != 128) {
            this.field1421 = (class76[]) null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 237)
    public class90() {
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "([B)V", line = 246)
    public class90(byte[] arg0) {
        this.field1420 = new byte[128];
        this.field1430 = new short[128];
        this.field1427 = new class311[128];
        this.field1426 = new int[128];
        int var2 = 0;
        this.field1421 = new class76[128];
        this.field1419 = new byte[128];
        this.field1417 = new byte[128];
        class336 var3 = new class336(arg0);
        while (var3.field5342[var3.field5353 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method2323(111);
        }
        var2++;
        var3.field5353++;
        int var6 = var3.field5353;
        int var7 = 0;
        var3.field5353 += var2;
        while (var3.field5342[var3.field5353 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2323(109);
        }
        var3.field5353++;
        int var10 = var3.field5353;
        var7++;
        int var11 = 0;
        var3.field5353 += var7;
        while (var3.field5342[var3.field5353 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method2323(-3);
        }
        var3.field5353++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            int var15 = 1;
            var16 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method2364(-9069);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class311[] var19 = new class311[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class311 var21 = var19[var20] = new class311();
            int var22 = var3.method2364(-9069);
            if (var22 > 0) {
                var21.field4930 = new byte[var22 * 2];
            }
            int var23 = var3.method2364(-9069);
            if (var23 > 0) {
                var21.field4932 = new byte[var23 * 2 + 2];
                var21.field4932[1] = 64;
            }
        }
        int var24 = var3.method2364(-9069);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = 0;
        int var27 = var3.method2364(-9069);
        while (var3.field5342[var3.field5353 + var26] != 0) {
            var26++;
        }
        byte[] var28 = new byte[var26];
        for (int var29 = 0; var29 < var26; var29++) {
            var28[var29] = var3.method2323(108);
        }
        byte[] var30 = var27 <= 0 ? null : new byte[var27 * 2];
        var26++;
        var3.field5353++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method2364(-9069);
            this.field1430[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method2364(-9069);
            this.field1430[var34] = (short) (this.field1430[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var28.length > var36) {
                    var35 = var28[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var3.method2331(288808016);
            }
            this.field1430[var38] = (short) (this.field1430[var38] + class36.method319(32768, var37 - 1 << 14));
            var35--;
            this.field1426[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1426[var42] != 0) {
                if (var40 == 0) {
                    if (var4.length > var41) {
                        var40 = var4[var41++];
                    } else {
                        var40 = -1;
                    }
                    var39 = var3.field5342[var6++] - 1;
                }
                var40--;
                this.field1419[var42] = (byte) var39;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1426[var46] != 0) {
                if (var44 == 0) {
                    if (var43 < var8.length) {
                        var44 = var8[var43++];
                    } else {
                        var44 = -1;
                    }
                    var45 = var3.field5342[var10++] + 16 << 2;
                }
                this.field1417[var46] = (byte) var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class311 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1426[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length <= var47) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                this.field1427[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var28.length > var52) {
                    var51 = var28[var52++];
                } else {
                    var51 = -1;
                }
                if (this.field1426[var54] > 0) {
                    var53 = var3.method2364(-9069) + 1;
                }
            }
            var51--;
            this.field1420[var54] = (byte) var53;
        }
        this.field1424 = var3.method2364(-9069) + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class311 var56 = var19[var55];
            if (var56.field4930 != null) {
                for (int var57 = 1; var57 < var56.field4930.length; var57 += 2) {
                    var56.field4930[var57] = var3.method2323(4);
                }
            }
            if (var56.field4932 != null) {
                for (int var58 = 3; var58 < var56.field4932.length - 2; var58 += 2) {
                    var56.field4932[var58] = var3.method2323(116);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method2323(-90);
            }
        }
        if (var30 != null) {
            for (int var60 = 1; var60 < var30.length; var60 += 2) {
                var30[var60] = var3.method2323(-125);
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class311 var62 = var19[var61];
            if (var62.field4932 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field4932.length; var64 += 2) {
                    var63 = var63 + var3.method2364(-9069) + 1;
                    var62.field4932[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class311 var66 = var19[var65];
            if (var66.field4930 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field4930.length; var68 += 2) {
                    var67 = var3.method2364(-9069) + var67 + 1;
                    var66.field4930[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method2364(-9069);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method2364(-9069) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field1420[var73] = (byte) (this.field1420[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class210.method1562(var77, -41, var75 - var71);
                    var77 += var76 - var72;
                    this.field1420[var78] = (byte) (this.field1420[var78] * var79 + 32 >> 6);
                }
                var72 = var76;
                var71 = var75;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field1420[var80] = (byte) (this.field1420[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var30 != null) {
            int var82 = var3.method2364(-9069);
            var30[0] = (byte) var82;
            for (int var83 = 2; var83 < var30.length; var83 += 2) {
                var82 = var82 + var3.method2364(-9069) + 1;
                var30[var83] = (byte) var82;
            }
            byte var84 = var30[0];
            int var85 = var30[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1417[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1417[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var30.length > var88) {
                int var89 = var30[var88 + 1] << 1;
                byte var90 = var30[var88];
                var88 += 2;
                int var91 = (var90 - var84) * var85 + ((var90 - var84) / 2);
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class210.method1562(var91, -106, var90 - var84);
                    var91 += var89 - var85;
                    int var94 = (this.field1417[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1417[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field1417[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field1417[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field4931 = var3.method2364(-9069);
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class311 var100 = var19[var99];
            if (var100.field4930 != null) {
                var100.field4921 = var3.method2364(-9069);
            }
            if (var100.field4932 != null) {
                var100.field4923 = var3.method2364(-9069);
            }
            if (var100.field4931 > 0) {
                var100.field4927 = var3.method2364(-9069);
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field4928 = var3.method2364(-9069);
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class311 var103 = var19[var102];
            if (var103.field4928 > 0) {
                var103.field4919 = var3.method2364(-9069);
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class311 var105 = var19[var104];
            if (var105.field4919 > 0) {
                var105.field4929 = var3.method2364(-9069);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lno;II)V", line = 892)
    public static final void method792(class5 arg0, int arg1, int arg2) {
        field1432++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            class291 var3 = (class291) class110.field1865.method2297(14204);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4658; var5++) {
                if (var3.field4660[var5] != null) {
                    if (var3.field4660[var5].field709 == 2) {
                        var3.field4656[var5] = -5;
                    }
                    if (var3.field4660[var5].field709 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4662[var5] != null) {
                    if (var3.field4662[var5].field709 == 2) {
                        var3.field4656[var5] = -6;
                    }
                    if (var3.field4662[var5].field709 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method26(arg2, 7);
            arg0.method2370(0, (byte) -20);
            int var6 = arg0.field5353;
            arg0.method2320(-6128, var3.field4665);
            for (int var7 = 0; var7 < var3.field4658; var7++) {
                if (var3.field4656[var7] == 0) {
                    try {
                        int var8 = var3.field4661[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4660[var7].field712;
                            int var13 = var12.getInt((Object) null);
                            arg0.method2370(0, (byte) -20);
                            arg0.method2320(arg1 - 6128, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field4660[var7].field712;
                            var9.setInt((Object) null, var3.field4654[var7]);
                            arg0.method2370(0, (byte) -20);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field4660[var7].field712;
                            int var11 = var10.getModifiers();
                            arg0.method2370(0, (byte) -20);
                            arg0.method2320(arg1 - 6128, var11);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field4662[var7].field712;
                            byte[][] var15 = var3.field4663[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method2370(0, (byte) -20);
                            } else if ((var19 instanceof Number)) {
                                arg0.method2370(1, (byte) -20);
                                arg0.method2333(((Number) var19).longValue(), 56);
                            } else if ((var19 instanceof String)) {
                                arg0.method2370(2, (byte) -20);
                                arg0.method2349(true, (String) var19);
                            } else {
                                arg0.method2370(4, (byte) -20);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4662[var7].field712;
                            int var21 = var20.getModifiers();
                            arg0.method2370(0, (byte) -20);
                            arg0.method2320(arg1 ^ 0xFFFFE810, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method2370(-10, (byte) -20);
                    } catch (InvalidClassException var35) {
                        arg0.method2370(-11, (byte) -20);
                    } catch (StreamCorruptedException var36) {
                        arg0.method2370(-12, (byte) -20);
                    } catch (OptionalDataException var37) {
                        arg0.method2370(-13, (byte) -20);
                    } catch (IllegalAccessException var38) {
                        arg0.method2370(-14, (byte) -20);
                    } catch (IllegalArgumentException var39) {
                        arg0.method2370(-15, (byte) -20);
                    } catch (InvocationTargetException var40) {
                        arg0.method2370(-16, (byte) -20);
                    } catch (SecurityException var41) {
                        arg0.method2370(-17, (byte) -20);
                    } catch (IOException var42) {
                        arg0.method2370(-18, (byte) -20);
                    } catch (NullPointerException var43) {
                        arg0.method2370(-19, (byte) -20);
                    } catch (Exception var44) {
                        arg0.method2370(-20, (byte) -20);
                    } catch (Throwable var45) {
                        arg0.method2370(-21, (byte) -20);
                    }
                } else {
                    arg0.method2370(var3.field4656[var7], (byte) -20);
                }
            }
            arg0.method2332(var6, (byte) -122);
            arg0.method2344(arg0.field5353 - var6, (byte) -124);
            var3.method2195(arg1 - 1);
        }
    }
}
