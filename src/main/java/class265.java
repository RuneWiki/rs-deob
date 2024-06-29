import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class265 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    private int field4589 = 4;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[S")
    private short[] field4587 = new short[512];

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    private int field4594 = 4;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public int field4592 = 4;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    private int field4593 = 0;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    private int field4600 = 4;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[S")
    public static short[] field4599 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Ljava/util/Random;")
    public static Random field4602 = new Random();

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lem;")
    public static class10 field4597;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[S")
    private short[] field4595;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 20)
    public static void method1853(int arg0) {
        field4599 = null;
        if (arg0 >= 38) {
            field4602 = null;
            field4597 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 43)
    public static final void method1854(int arg0) {
        field4601++;
        class268.field4648.method733((byte) -111);
        if (arg0 <= 30) {
            field4602 = (Random) null;
        }
        class308.field5235.method1054((byte) -48);
        class6.field117.method1054((byte) -95);
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V", line = 56)
    public static final void method1855(int arg0) {
        field4591++;
        class110.field1861.method343((byte) -68);
        int var1 = 0;
        if (arg0 != 32) {
            method1854(82);
        }
        while (var1 < 32) {
            class241.field4116[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class139.field2372[var2] = 0L;
        }
        class259.field4460 = 0;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIIII)V", line = 474)
    public class265(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4594 = arg2;
        this.field4600 = arg3;
        this.field4592 = arg1;
        this.field4589 = arg4;
        this.field4593 = arg0;
        this.method1859(2);
        this.method1858(0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIII)V", line = 87)
    public final void method1856(byte arg0, int arg1, int arg2, int arg3) {
        field4588++;
        if (arg0 <= 59) {
            this.field4593 = 78;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        for (int var8 = 0; var8 < arg3; var8++) {
            var6[var8] = (var8 << 12) / arg3;
        }
        int[] var9 = new int[arg1];
        for (int var10 = 0; var10 < arg1; var10++) {
            var9[var10] = (var10 << 12) / arg1;
        }
        this.method1500(-1007506868);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field4592; var14++) {
                        int var15 = this.field4595[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var9[var11] * var15 >> 12;
                        int var18 = this.field4600 * var15 >> 12;
                        int var19 = this.field4594 * var15 >> 12;
                        int var20 = this.field4594 * var16;
                        int var21 = var20 >> 12;
                        int var22 = this.field4589 * var15 >> 12;
                        int var23 = var20 & 0xFFF;
                        int var24 = var21 + 1;
                        int var25 = var21 & 0xFF;
                        int var26 = var6[var12] * var15 >> 12;
                        int var27;
                        if (var19 > var24) {
                            var27 = var24 & 0xFF;
                        } else {
                            var27 = 0;
                        }
                        int var28 = class263.field4565[var23];
                        int var29 = this.field4589 * var17;
                        int var30 = var23 - 4096;
                        int var31 = var29 >> 12;
                        int var32 = var29 & 0xFFF;
                        int var33 = var31 + 1;
                        int var34;
                        if (var33 >= var22) {
                            var34 = 0;
                        } else {
                            var34 = var33 & 0xFF;
                        }
                        int var35 = class263.field4565[var32];
                        int var36 = var31 & 0xFF;
                        int var37 = this.field4600 * var26;
                        int var38 = var37 >> 12;
                        int var39 = var38 + 1;
                        int var40 = var37 & 0xFFF;
                        int var41;
                        if (var39 >= var18) {
                            var41 = 0;
                        } else {
                            var41 = var39 & 0xFF;
                        }
                        int var42 = var40 - 4096;
                        int var43 = class263.field4565[var40];
                        short var44 = this.field4587[var36];
                        int var45 = var32 - 4096;
                        short var46 = this.field4587[var34];
                        int var47 = var38 & 0xFF;
                        short var48 = this.field4587[var47 + var46];
                        short var49 = this.field4587[var41 + var44];
                        short var50 = this.field4587[var41 + var46];
                        short var51 = this.field4587[var47 + var44];
                        int var52 = class245.method1666(var40, 0, var23, var32, this.field4587[var25 + var51]);
                        int var53 = class245.method1666(var40, 0, var30, var32, this.field4587[var27 + var51]);
                        int var54 = ((var53 - var52) * var28 >> 12) + var52;
                        int var55 = class245.method1666(var42, 0, var23, var32, this.field4587[var25 + var49]);
                        int var56 = class245.method1666(var42, 0, var30, var32, this.field4587[var27 + var49]);
                        int var57 = var55 + ((var56 - var55) * var28 >> 12);
                        int var58 = ((var57 - var54) * var43 >> 12) + var54;
                        int var59 = class245.method1666(var40, 0, var23, var45, this.field4587[var25 + var48]);
                        int var60 = class245.method1666(var40, 0, var30, var45, this.field4587[var27 + var48]);
                        int var61 = var59 + ((var60 - var59) * var28 >> 12);
                        int var62 = class245.method1666(var42, 0, var23, var45, this.field4587[var25 + var50]);
                        int var63 = class245.method1666(var42, 0, var30, var45, this.field4587[var27 + var50]);
                        int var64 = ((var63 - var62) * var28 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var43 >> 12);
                        this.method1499(var14, var58 + ((var65 - var58) * var35 >> 12), 0);
                    }
                    this.method1497(-3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V", line = 253)
    public static final void method1857(int arg0) {
        class7.method48(class165.field2839, 0);
        field4596++;
        class250.field4327++;
        if (class15.field411 && class256.field4405) {
            int var1 = class275.field4760;
            int var2 = class77.field1411;
            int var3 = var2 - class4.field81;
            int var4 = var1 - class188.field3264;
            if (class155.field2668 > var4) {
                var4 = class155.field2668;
            }
            if (class155.field2668 + class4.field73.field260 < var4 - -class165.field2839.field260) {
                var4 = class4.field73.field260 + class155.field2668 - class165.field2839.field260;
            }
            if (var3 < class30.field681) {
                var3 = class30.field681;
            }
            if ((var3 + class165.field2839.field226) > (class30.field681 + class4.field73.field226)) {
                var3 = class30.field681 + class4.field73.field226 - class165.field2839.field226;
            }
            int var5 = var3 - class183.field3210;
            int var6 = class165.field2839.field322;
            int var7 = var4 - class98.field1710;
            if (class250.field4327 > class165.field2839.field330 && (var7 > var6 || var7 < -var6 || var6 < var5 || -var6 > var5)) {
                class51.field1009 = true;
            }
            int var8 = var3 + class4.field73.field241 - class30.field681;
            int var9 = var4 + class4.field73.field281 - class155.field2668;
            if (class165.field2839.field310 != null && class51.field1009) {
                class102 var10 = new class102();
                var10.field1748 = var8;
                var10.field1752 = var9;
                var10.field1738 = class165.field2839;
                var10.field1743 = class165.field2839.field310;
                class249.method1739(var10, -71);
            }
            if (~class239.field4081 == arg0) {
                if (class51.field1009) {
                    if (class165.field2839.field369 != null) {
                        class102 var11 = new class102();
                        var11.field1738 = class165.field2839;
                        var11.field1748 = var8;
                        var11.field1743 = class165.field2839.field369;
                        var11.field1752 = var9;
                        var11.field1739 = class222.field3906;
                        class249.method1739(var11, -71);
                    }
                    if (class222.field3906 != null && client.method1650(class165.field2839) != null) {
                        class181.field3171++;
                        class71.field1320.method570(30, arg0 ^ 0x0);
                        class71.field1320.method1310(arg0 + 256, class165.field2839.field259);
                        class71.field1320.method1310(255, class222.field3906.field259);
                        class71.field1320.method1337(-100, class165.field2839.field230);
                        class71.field1320.method1337(-41, class222.field3906.field230);
                    }
                } else if ((class191.field3315 == 1 || class20.method145(class275.field4769 - 1, (byte) -63)) && class275.field4769 > 2) {
                    class118.method709(arg0 ^ 0xFFFF9BF7);
                } else if (class275.field4769 > 0) {
                    class315.method2178(arg0 ^ 0xE0A);
                }
                class165.field2839 = null;
            }
        } else if (class250.field4327 > 1) {
            class165.field2839 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V", line = 378)
    private final void method1858(int arg0) {
        field4590++;
        Random var2 = new Random((long) this.field4593);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4587[var3] = (short) var3;
        }
        for (int var4 = arg0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class103.method638((byte) 15, var5, var2);
            short var7 = this.field4587[var6];
            this.field4587[var6] = this.field4587[var5];
            this.field4587[var5] = this.field4587[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V", line = 416)
    private final void method1859(int arg0) {
        field4598++;
        this.field4595 = new short[this.field4592];
        if (arg0 != 2) {
            method1857(-36);
        }
        for (int var2 = 0; var2 < this.field4592; var2++) {
            this.field4595[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public abstract void method1500(int arg0);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public abstract void method1497(int arg0);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public abstract void method1499(int arg0, int arg1, int arg2);
}
