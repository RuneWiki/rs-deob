import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class110 extends class176 {

    @OriginalMember(owner = "client!hw", name = "I", descriptor = "Lrh;")
    private class223 field1710;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "Luw;")
    private class352 field1688;

    @OriginalMember(owner = "client!hw", name = "G", descriptor = "Lwr;")
    private class388 field1708;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    private int field1692;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    private int field1695;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!hw", name = "J", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!hw", name = "E", descriptor = "[[F")
    private float[][] field1706;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "[[F")
    private float[][] field1693;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "[[F")
    private float[][] field1697;

    @OriginalMember(owner = "client!hw", name = "F", descriptor = "I")
    private int field1707;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "Llu;")
    private class609 field1694;

    @OriginalMember(owner = "client!hw", name = "C", descriptor = "Luj;")
    private class321 field1704;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "Ldea;")
    private class205 field1700;

    @OriginalMember(owner = "client!hw", name = "K", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1712;

    @OriginalMember(owner = "client!hw", name = "L", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1713;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "[[I")
    public static int[][] field1703 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "Ldv;")
    public static class566 field1702 = new class566(80, 8);

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!hw", name = "M", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!hw", name = "D", descriptor = "Lan;")
    public static class21 field1705;

    @OriginalMember(owner = "client!hw", name = "H", descriptor = "Lan;")
    public static class21 field1709;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I[[ZBII)V")
    public final void method771(int arg0, boolean[][] arg1, byte arg2, int arg3, int arg4) {
        field1689++;
        if (this.field1704 == null || this.field1692 > arg3 + arg4 || arg3 - arg4 > this.field1695 || this.field1691 > arg0 + arg4 || this.field1711 < arg0 - arg4) {
            return;
        }
        int var6 = -101 % ((-arg2 - 79) / 46);
        for (int var7 = this.field1691; var7 <= this.field1711; var7++) {
            for (int var8 = this.field1692; var8 <= this.field1695; var8++) {
                int var9 = var8 - arg3;
                int var10 = var7 - arg0;
                if (var9 > -arg4 && arg4 > var9 && var10 > -arg4 && var10 < arg4 && arg1[var9 + arg4][arg4 + var10]) {
                    this.field1708.method2320(-844778712, (byte) ((int) (this.field1710.method1435(0) * 255.0F)));
                    this.field1708.method1609(this.field1708.field5494, 122);
                    this.field1708.method1607(this.field1694, 0, false);
                    this.field1708.method1615(false, this.field1690, this.field1704, 0, this.field1707 / 3, 0, class481.field6784);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Lvw;")
    public static final class254 method772(int arg0, int arg1) {
        field1714++;
        if (arg0 != 1) {
            field1703 = null;
        }
        class555[] var2 = class251.field3485;
        synchronized (class251.field3485) {
            class254 var3;
            if (class251.field3485.length <= arg1 || class251.field3485[arg1].method3146(false)) {
                var3 = new class254();
                var3.field3525 = new class631[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field3525[var4] = new class631();
                }
            } else {
                var3 = (class254) class251.field3485[arg1].method3142(false);
                var3.method939(76);
                int var10002 = class472.field6630[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public static void method773(byte arg0) {
        field1702 = null;
        field1705 = null;
        if (arg0 != 27) {
            method772(-90, 84);
        }
        field1709 = null;
        field1703 = null;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)Lkf;")
    public static final class212 method774(byte arg0) {
        field1699++;
        if (arg0 < 120) {
            return null;
        } else {
            class32.field515 = 0;
            return class405.method2416((byte) -111);
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(B)V")
    public static final void method775(byte arg0) {
        field1696++;
        if (arg0 != 115) {
            field1702 = null;
        }
        for (class438 var1 = (class438) class311.field4187.method456((byte) -115); var1 != null; var1 = (class438) class311.field4187.method460((byte) -108)) {
            if (var1.field6214 == -1) {
                var1.field6209 = 0;
                if (var1.field6220 >= 0 && var1.field6213 >= 0 && var1.field6220 < class32.field513 && var1.field6213 < class611.field8786) {
                    class505.method2920((byte) 1, var1);
                }
            } else {
                var1.method1117(0);
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(SZ)V")
    private final void method776(short arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        if (Stream.method3294()) {
            this.field1713.method3291(arg0);
        } else {
            this.field1713.method3298(arg0);
        }
        field1698++;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZIIII)V")
    private final void method777(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1701++;
        long var8 = -1L;
        int var10 = (arg4 << this.field1688.field2506) + arg1;
        int var11 = arg0 + (arg3 << this.field1688.field2506);
        int var12 = this.field1688.method1105(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class176 var13 = this.field1700.method1242(0, var8);
            if (var13 != null) {
                this.method776(((class486) var13).field6828, false);
                return;
            }
        }
        short var14 = (short) (this.field1690++);
        if (var8 != -1L) {
            this.field1700.method1241(new class486(var14), var8, -109);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg0 == 0) {
            var15 = this.field1693[arg6][arg5];
            var16 = this.field1706[arg6][arg5];
            var17 = this.field1697[arg6][arg5];
        } else if (this.field1688.field2504 == arg1 && arg0 == 0) {
            var15 = this.field1693[arg6 + 1][arg5];
            var16 = this.field1706[arg6 + 1][arg5];
            var17 = this.field1697[arg6 + 1][arg5];
        } else if (this.field1688.field2504 == arg1 && this.field1688.field2504 == arg0) {
            var15 = this.field1693[arg6 + 1][arg5 + 1];
            var16 = this.field1706[arg6 + 1][arg5 + 1];
            var17 = this.field1697[arg6 + 1][arg5 + 1];
        } else if (arg1 == 0 && this.field1688.field2504 == arg0) {
            var15 = this.field1693[arg6][arg5 + 1];
            var17 = this.field1697[arg6][arg5 + 1];
            var16 = this.field1706[arg6][arg5 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field1688.field2504;
            float var19 = (float) arg0 / (float) this.field1688.field2504;
            float var20 = this.field1697[arg6][arg5];
            float var21 = this.field1693[arg6][arg5];
            float var22 = this.field1706[arg6][arg5];
            float var23 = this.field1697[arg6 + 1][arg5];
            float var24 = this.field1693[arg6 + 1][arg5];
            float var25 = (this.field1697[arg6][arg5 + 1] - var20) * var18 + var20;
            float var26 = (this.field1693[arg6][arg5 + 1] - var21) * var18 + var21;
            float var27 = (this.field1706[arg6][arg5 + 1] - var22) * var18 + var22;
            float var28 = (this.field1697[arg6 + 1][arg5 + 1] - var23) * var18 + var23;
            float var29 = this.field1706[arg6 + 1][arg5];
            float var30 = (this.field1693[arg6 + 1][arg5 + 1] - var24) * var18 + var24;
            var15 = (var30 - var26) * var19 + var26;
            float var31 = (this.field1706[arg6 + 1][arg5 + 1] - var29) * var18 + var29;
            var17 = (var28 - var25) * var19 + var25;
            var16 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field1710.method1434(7) - var10);
        float var33 = (float) (this.field1710.method1431(126) - var12);
        float var34 = (float) (this.field1710.method1429(4330) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field1710.method1433(4294);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1710.method1430(!arg2);
        int var45 = (int) ((float) ((var44 & 0xFF7BC6) >> 16) * var43);
        if (arg2) {
            this.method776((short) 60, false);
        }
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3294()) {
            this.field1712.method3289((float) var10);
            this.field1712.method3289((float) var12);
            this.field1712.method3289((float) var11);
        } else {
            this.field1712.method3293((float) var10);
            this.field1712.method3293((float) var12);
            this.field1712.method3293((float) var11);
        }
        if (this.field1708.field5417 == 0) {
            this.field1712.method3297(var47);
            this.field1712.method3297(var46);
            this.field1712.method3297(var45);
        } else {
            this.field1712.method3297(var45);
            this.field1712.method3297(var46);
            this.field1712.method3297(var47);
        }
        this.field1712.method3297(255);
        this.method776(var14, false);
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lwr;Luw;Lrh;[I)V")
    public class110(class388 arg0, class352 arg1, class223 arg2, int[] arg3) {
        this.field1710 = arg2;
        this.field1688 = arg1;
        this.field1708 = arg0;
        int var5 = this.field1710.method1433(4294) - (arg1.field2504 >> 1);
        this.field1692 = this.field1710.method1434(7) - var5 >> arg1.field2506;
        this.field1695 = var5 + this.field1710.method1434(7) >> arg1.field2506;
        this.field1691 = this.field1710.method1429(4330) - var5 >> arg1.field2506;
        this.field1711 = var5 + this.field1710.method1429(4330) >> arg1.field2506;
        int var6 = this.field1695 + 1 - this.field1692;
        int var7 = this.field1711 + 1 - this.field1691;
        this.field1706 = new float[var6 + 1][var7 + 1];
        this.field1693 = new float[var6 + 1][var7 + 1];
        this.field1697 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field1691 + var8;
            if (var25 > 0 && this.field1688.field2503 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field1692 + var26;
                    if (var27 > 0 && (this.field1688.field2505 - 1) > var27) {
                        int var28 = arg1.method1104(var27 + 1, var25) - arg1.method1104(var27 - 1, var25);
                        int var29 = arg1.method1104(var27, var25 + 1) - arg1.method1104(var27, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field1697[var26][var8] = (float) var28 * var30;
                        this.field1693[var26][var8] = var30 * -256.0F;
                        this.field1706[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1691; var10 <= this.field1711; var10++) {
            if (var10 >= 0 && var10 < arg1.field2503) {
                for (int var22 = this.field1692; var22 <= this.field1695; var22++) {
                    if (var22 >= 0 && arg1.field2505 > var22) {
                        int var23 = arg3[var9];
                        int[] var24 = arg1.field4736[var22][var10];
                        if (var24 != null && var23 != 0) {
                            this.field1707 += var23 == 1 ? var24.length : 3;
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1695 - this.field1692;
            }
        }
        if (this.field1707 <= 0) {
            this.field1694 = null;
            this.field1704 = null;
        } else {
            this.field1700 = new class205(class32.method326(this.field1707, false));
            this.field1704 = this.field1708.method1588(false, (byte) -68);
            this.field1704.method1477(-18855, this.field1707);
            NativeHeapBuffer var11 = this.field1708.method2293(this.field1707 * 16, -111, false);
            this.field1712 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field1704.method613(true, -25838);
                } while (var12 == null);
                this.field1713 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field1691; var15 <= this.field1711; var15++) {
                    if (var15 >= 0 && var15 < arg1.field2503) {
                        int var16 = 0;
                        for (int var17 = this.field1692; var17 <= this.field1695; var17++) {
                            if (var17 >= 0 && var17 < arg1.field2505) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field4736[var17][var15];
                                int[] var20 = arg1.field4743[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        for (int var21 = 0; var21 < var19.length; var21++) {
                                            this.method777(var20[var21], var19[var21], false, var15, var17, var13, var16);
                                        }
                                    } else if (var18 == 3) {
                                        this.method777(0, 0, false, var15, var17, var13, var16);
                                        this.method777(0, arg1.field2504, false, var15, var17, var13, var16);
                                        this.method777(arg1.field2504, 0, false, var15, var17, var13, var16);
                                    } else if (var18 == 2) {
                                        this.method777(0, arg1.field2504, false, var15, var17, var13, var16);
                                        this.method777(arg1.field2504, arg1.field2504, false, var15, var17, var13, var16);
                                        this.method777(0, 0, false, var15, var17, var13, var16);
                                    } else if (var18 == 5) {
                                        this.method777(arg1.field2504, arg1.field2504, false, var15, var17, var13, var16);
                                        this.method777(arg1.field2504, 0, false, var15, var17, var13, var16);
                                        this.method777(0, arg1.field2504, false, var15, var17, var13, var16);
                                    } else if (var18 == 4) {
                                        this.method777(arg1.field2504, 0, false, var15, var17, var13, var16);
                                        this.method777(0, 0, false, var15, var17, var13, var16);
                                        this.method777(arg1.field2504, arg1.field2504, false, var15, var17, var13, var16);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field1695 - this.field1692;
                    }
                    var13++;
                }
                this.field1713.method3288();
                if (this.field1704.method616((byte) -68)) {
                    this.field1712.method3288();
                    this.field1694 = this.field1708.method1644((byte) 115, false);
                    this.field1694.method617(101, 16, this.field1690 * 16, var11);
                    break;
                }
                this.field1712.method3299(0);
                this.field1700.method1247(0);
            }
        }
        this.field1697 = this.field1693 = this.field1706 = null;
        this.field1712 = null;
        this.field1713 = null;
        this.field1700 = null;
    }
}
