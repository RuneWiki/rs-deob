import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class21 extends class266 {

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    private int field348 = 0;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    private int field359 = -1;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "Z")
    public boolean field368 = false;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "Lie;")
    private class2 field370;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Z")
    private boolean field356;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "Z")
    private boolean field360;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Z")
    private boolean field367;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "Z")
    private boolean field369;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Lma;")
    public static class5 field354 = class12.method119("Eingabeprozedur geladen)3", (byte) 106);

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "F")
    private float field349;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "[I")
    private int[] field372;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lni;IFLti;Z)[I", line = 14)
    public final int[] method166(class202 arg0, int arg1, float arg2, class173 arg3, boolean arg4) {
        field365++;
        if (this.field372 == null || this.field349 != arg2) {
            if (!this.field370.method11((byte) -60, arg0, arg3)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field372 = this.field370.method8(arg3, var6, true, (double) arg2, arg0, (byte) 101, var6, this.field360);
            this.field349 = arg2;
            if (this.field356) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12;
                int var13 = var12 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var15; var19 >= 0; var19--) {
                        var12--;
                        int var20 = this.field372[var12];
                        var8[var19] += class204.method1354(255, var20 >> 16);
                        var7[var19] += class204.method1354(255, var20 >> 8);
                        var9[var19] += class204.method1354(255, var20);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 0;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 1;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var27--;
                        var24 += var7[var27];
                        var25 += var9[var27];
                        var26 += var8[var27];
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var29 = var15; var29 >= 0; var29--) {
                        var27--;
                        int var30 = var25 / 9;
                        int var31 = var26 / 9;
                        var23--;
                        int var32 = var24 / 9;
                        var21--;
                        var10[var21] = class264.method1820(var30, class264.method1820(var32 << 8, var31 << 16));
                        var24 += var7[var27] - var7[var23];
                        var26 += var8[var27] - var8[var23];
                        var25 += var9[var27] - var9[var23];
                        if (var23 == 0) {
                            var23 = var11;
                        }
                        if (var27 == 0) {
                            var27 = var11;
                        }
                    }
                    for (int var33 = var15; var33 >= 0; var33--) {
                        var12--;
                        int var34 = this.field372[var12];
                        var13--;
                        int var35 = this.field372[var13];
                        var8[var33] += -(class204.method1354(16765783, var35) >> 16) + (class204.method1354(var34, 16742914) >> 16);
                        var7[var33] += -class204.method1354(var35 >> 8, 255) + class204.method1354(var34 >> 8, 255);
                        var9[var33] += -class204.method1354(255, var35) + class204.method1354(255, var34);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field372 = var10;
            }
        }
        int var36 = 42 % ((74 - arg1) / 49);
        return this.field372;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lii;)V", line = 756)
    public class21(class221 arg0) {
        this.field370 = new class2(arg0);
        this.field356 = arg0.method1509(true) == 1;
        this.field360 = arg0.method1509(true) == 1;
        this.field367 = arg0.method1509(true) == 1;
        this.field369 = arg0.method1509(true) == 1;
        int var2 = arg0.method1509(true) & 0x3;
        this.field357 = arg0.method1543(false);
        this.field351 = arg0.method1543(false);
        int var3 = arg0.method1509(true);
        arg0.method1509(true);
        if (var2 == 1) {
            this.field371 = 2;
        } else if (var2 == 2) {
            this.field371 = 3;
        } else if (var2 == 3) {
            this.field371 = 4;
        } else {
            this.field371 = 0;
        }
        this.field353 = var3 >> 4 & 0xF;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)Lii;", line = 209)
    public static final class221 method167(int arg0) {
        class221 var1 = new class221(24);
        var1.method1542(-127, 3);
        field358++;
        var1.method1542(-113, class66.field1037);
        var1.method1542(-105, class29.field474 ? 1 : 0);
        var1.method1542(-67, class264.field4522 ? 1 : 0);
        var1.method1542(-87, class112.field1663 ? 1 : 0);
        var1.method1542(-67, class181.field2765 ? 1 : 0);
        if (arg0 != 0) {
            method168((class221) null, -75, 75);
        }
        var1.method1542(-68, class234.field3870 ? 1 : 0);
        var1.method1542(-128, class117.field1781 ? 1 : 0);
        var1.method1542(-72, class190.field2973 ? 1 : 0);
        var1.method1542(-73, class77.field1208 ? 1 : 0);
        var1.method1542(-100, class236.field3895);
        var1.method1542(-86, class8.field114 ? 1 : 0);
        var1.method1542(-104, class265.field4531 ? 1 : 0);
        var1.method1542(-116, class275.field4685 ? 1 : 0);
        var1.method1542(-84, class86.field1300);
        var1.method1542(arg0 ^ 0xFFFFFFAF, class80.field1239 ? 1 : 0);
        var1.method1542(-82, class264.field4492);
        var1.method1542(-92, class247.field4092);
        var1.method1542(arg0 ^ 0xFFFFFFB0, class130.field1955);
        var1.method1539(class73.field1151, false);
        var1.method1539(field346, false);
        var1.method1542(-90, class116.field1731 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lii;II)Lma;", line = 251)
    public static final class5 method168(class221 arg0, int arg1, int arg2) {
        field374++;
        try {
            class5 var3 = new class5();
            var3.field72 = arg0.method1507(-50);
            int var4 = -77 / ((arg2 - 35) / 59);
            if (var3.field72 > arg1) {
                var3.field72 = arg1;
            }
            var3.field57 = new byte[var3.field72];
            arg0.field3610 += class284.field4806.method1111(var3.field57, var3.field72, 0, arg0.field3610, 70, arg0.field3617);
            return var3;
        } catch (Exception var6) {
            return class237.field3919;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLni;)I", line = 277)
    public static final int method169(byte arg0, class202 arg1) {
        field355++;
        int var2 = 0;
        if (arg1.method1341(-8, class239.field3976)) {
            var2++;
        }
        if (arg1.method1341(115, class137.field2029)) {
            var2++;
        }
        if (arg1.method1341(-4, class210.field3341)) {
            var2++;
        }
        if (arg1.method1341(-15, class208.field3302)) {
            var2++;
        }
        if (arg1.method1341(-38, class24.field423)) {
            var2++;
        }
        if (arg0 < 55) {
            method168((class221) null, -67, 53);
        }
        if (arg1.method1341(-91, class50.field780)) {
            var2++;
        }
        if (arg1.method1341(-22, class228.field3780)) {
            var2++;
        }
        if (arg1.method1341(101, class5.field50)) {
            var2++;
        }
        if (arg1.method1341(110, class37.field592)) {
            var2++;
        }
        if (arg1.method1341(-76, class244.field4054)) {
            var2++;
        }
        if (arg1.method1341(-89, class284.field4807)) {
            var2++;
        }
        if (arg1.method1341(65, class126.field1888)) {
            var2++;
        }
        if (arg1.method1341(-45, class247.field4093)) {
            var2++;
        }
        if (arg1.method1341(108, class231.field3839)) {
            var2++;
        }
        if (arg1.method1341(96, class251.field4158)) {
            var2++;
        }
        if (arg1.method1341(101, class259.field4419)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lmc;[BIIZIB)V", line = 348)
    public static final void method170(int arg0, class50[] arg1, byte[] arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7) {
        field361++;
        if (!arg5) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg3 + var9) > 0 && arg3 + var9 < 103 && arg6 + var10 > 0 && (arg6 + var10) < 103) {
                            arg1[var8].field793[arg3 + var9][arg6 + var10] = class204.method1354(arg1[var8].field793[arg3 + var9][arg6 + var10], -16777217);
                        }
                    }
                }
            }
        }
        if (arg7 != -100) {
            return;
        }
        byte var11;
        if (arg5) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class221 var12 = new class221(arg2);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class204.method1353(arg4, arg6 + var15, arg0, arg5, arg3 + var14, var12, 0, true, var13);
                }
            }
        }
        if (arg5) {
            return;
        }
        class135 var16 = null;
        label121: while (true) {
            int var18;
            label114: do {
                while (var12.field3610 < var12.field3617.length) {
                    int var17 = var12.method1509(true);
                    if (var17 != 0) {
                        if (var17 != 1) {
                            throw new IllegalStateException();
                        }
                        var18 = var12.method1509(true);
                        continue label114;
                    }
                    var16 = new class135(var12);
                }
                if (var16 == null) {
                    var16 = new class135();
                }
                for (int var23 = 0; var23 < 8; var23++) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        int var25 = (arg6 >> 3) + var24;
                        int var26 = (arg3 >> 3) + var23;
                        if (var26 >= 0 && var26 < 13 && var25 >= 0 && var25 < 13) {
                            class204.field3262[var26][var25] = var16;
                        }
                    }
                }
                break label121;
            } while (var18 <= 0);
            for (int var19 = 0; var19 < var18; var19++) {
                class239 var20 = new class239(var12);
                var20.field3944 += arg3 << 7;
                var20.field3958 += arg6 << 7;
                int var21 = var20.field3958 >> 7;
                int var22 = var20.field3944 >> 7;
                if (var22 >= 0 && var21 >= 0 && var22 < 104 && var21 < 104) {
                    var20.field3966 = class208.field3304[var20.field3961][var22][var21] - var20.field3966;
                    class53.method408(var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lni;Lti;ZI)[I", line = 512)
    public final int[] method171(class202 arg0, class173 arg1, boolean arg2, int arg3) {
        field350++;
        if (arg3 != -9) {
            return (int[]) null;
        } else if (this.field370.method11((byte) -60, arg0, arg1)) {
            int var5 = arg2 ? 64 : 128;
            return this.field370.method8(arg1, var5, false, 1.0D, arg0, (byte) -106, var5, this.field360);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V", line = 528)
    public static void method172(boolean arg0) {
        if (!arg0) {
            field364 = 78;
        }
        field354 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZBLti;Lni;)Z", line = 543)
    public final boolean method173(boolean arg0, byte arg1, class173 arg2, class202 arg3) {
        field363++;
        if (!this.field370.method11((byte) -60, arg3, arg2)) {
            return false;
        }
        int var5 = arg0 ? 64 : 128;
        GL var6 = class45.field688;
        int var7 = class90.method591((byte) -14);
        if (arg1 != -107) {
            this.field360 = true;
        }
        if ((var7 & 0x1) == 0) {
            if (this.field359 == -1) {
                int[] var8 = new int[1];
                var6.glGenTextures(1, var8, 0);
                this.field373 = class36.field576;
                this.field359 = var8[0];
                class45.method321(this.field359);
                ByteBuffer var9 = ByteBuffer.wrap(this.field370.method9(arg2, arg3, true, var5, var5, 0.7D, this.field360));
                if (this.field353 == 2) {
                    GLU var10 = new GLU();
                    var10.gluBuild2DMipmaps(3553, 6408, var5, var5, 6408, 5121, var9);
                    var6.glTexParameteri(3553, 10241, 9987);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class36.field574 += var9.limit() * 4 / 3 - this.field348;
                    this.field348 = var9.limit() * 4 / 3;
                } else if (this.field353 == 1) {
                    int var11 = 0;
                    while (true) {
                        var6.glTexImage2D(3553, var11++, 6408, var5, var5, 0, 6408, 5121, var9);
                        var5 >>= 0x1;
                        if (var5 == 0) {
                            var6.glTexParameteri(3553, 10241, 9987);
                            var6.glTexParameteri(3553, 10240, 9729);
                            class36.field574 += var9.limit() * 4 / 3 - this.field348;
                            this.field348 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field370.method9(arg2, arg3, true, var5, var5, 0.7D, this.field360));
                    }
                } else {
                    var6.glTexImage2D(3553, 0, 6408, var5, var5, 0, 6408, 5121, var9);
                    var6.glTexParameteri(3553, 10241, 9729);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class36.field574 += var9.limit() - this.field348;
                    this.field348 = var9.limit();
                }
                var6.glTexParameteri(3553, 10242, this.field367 ? 10497 : 33071);
                var6.glTexParameteri(3553, 10243, this.field369 ? 10497 : 33071);
            } else {
                class45.method321(this.field359);
            }
        }
        if ((var7 & 0x2) == 0) {
            class45.method330(this.field371);
        }
        if ((var7 & 0x4) == 0) {
            class45.method305(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field351 == 0 && this.field357 == 0) {
                class45.method326();
            } else {
                float var12 = (float) (class45.field660 * this.field351) / (float) var5;
                float var13 = (float) (class45.field660 * this.field357) / (float) var5;
                class45.method316(var13, var12, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V", line = 657)
    protected final void finalize() throws Throwable {
        field352++;
        if (this.field359 != -1) {
            class36.method262(this.field359, this.field348, this.field373);
            this.field348 = 0;
            this.field359 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lni;Lti;Z)Z", line = 678)
    public final boolean method174(class202 arg0, class173 arg1, boolean arg2) {
        field362++;
        if (arg2) {
            this.field370 = (class2) null;
        }
        return this.field370.method11((byte) -60, arg0, arg1);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V", line = 689)
    public static final void method175() {
        class225.field3700 = (class198[][][]) null;
        class150.field2162 = (int[][]) null;
        class181.field2769 = (int[][][]) null;
        class234.field3864 = (class56[][]) null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V", line = 699)
    public final void method176(int arg0, int arg1) {
        field347++;
        int var3 = -112 / ((arg0 + 67) / 48);
        if (this.field372 == null || this.field351 == 0 && this.field357 == 0) {
            return;
        }
        if (class181.field2751 == null || this.field372.length > class181.field2751.length) {
            class181.field2751 = new int[this.field372.length];
        }
        int var4 = this.field372.length == 4096 ? 64 : 128;
        int var5 = this.field372.length;
        int var6 = this.field357 * arg1;
        int var7 = var4 - 1;
        int var8 = arg1 * var4 * this.field351;
        int var9 = var5 - 1;
        for (int var10 = 0; var10 < var5; var10 += var4) {
            int var11 = var8 + var10 & var9;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var10 + var12;
                int var14 = var11 + (var6 + var12 & var7);
                class181.field2751[var13] = this.field372[var14];
            }
        }
        int[] var15 = this.field372;
        this.field372 = class181.field2751;
        class181.field2751 = var15;
    }
}
