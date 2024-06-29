import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class481 {

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "Lwr;")
    private class388 field6777;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "Luw;")
    private class352 field6781;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public int field6770;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    private int field6785;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    private int field6769;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "[B")
    public byte[] field6772;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    private int field6783;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    private int field6780;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "Lio;")
    public static class370 field6784 = new class370();

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "[I")
    public static int[] field6788 = new int[1000];

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "[I")
    public static int[] field6789 = new int[14];

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "J")
    public static long field6787;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "Lkr;")
    public static class636 field6786;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "[[Lag;")
    private class586[][] field6768;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILk;I)V")
    public final void method2794(int arg0, int arg1, class485 arg2, int arg3) {
        if (arg3 != 18391) {
            this.method2801(38, 36, null, 28, -90, true);
        }
        field6776++;
        class452 var5 = (class452) arg2;
        int var6 = var5.field6388 + arg0 + 1;
        int var7 = var5.field6384 + arg1 + 1;
        int var8 = this.field6770 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6390;
        int var11 = var5.field6381;
        int var12 = this.field6770 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var9 += var11 * var14;
            var7 = 1;
            var8 += this.field6770 * var14;
        }
        if (this.field6785 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field6785;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
            var13 += var16;
        }
        if ((var6 + var11) >= this.field6770) {
            int var17 = var6 + var11 + 1 - this.field6770;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class104.method737(var9, var13, var10, var5.field6383, this.field6772, var8, var12, true, var11);
            this.method2795(var6, var7, var11, arg3 ^ 0x70741B70, var10);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIII)V")
    private final void method2795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 1886674087) {
            method2800((byte) -21);
        }
        field6775++;
        if (this.field6768 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg2 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class586[] var11 = this.field6768[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field8380 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIILk;)V")
    public final void method2796(int arg0, int arg1, int arg2, class485 arg3) {
        field6773++;
        class452 var5 = (class452) arg3;
        int var6 = var5.field6384 + arg1 + 1;
        int var7 = var5.field6388 + arg0 + arg2;
        int var8 = var7 + (this.field6770 * var6);
        int var9 = 0;
        int var10 = var5.field6390;
        int var11 = var5.field6381;
        int var12 = this.field6770 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field6770 * var14;
            var9 += var11 * var14;
            var10 -= var14;
            var6 = 1;
        }
        if (this.field6785 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field6785;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var7 = 1;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var13 += var16;
        }
        if (var7 + var11 >= this.field6770) {
            int var17 = var7 + var11 + 1 - this.field6770;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class552.method3132(var13, var9, var8, var11, var5.field6383, var12, this.field6772, var10, -1);
            this.method2795(var7, var6, var11, 1886674087, var10);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(IIILk;)Z")
    public final boolean method2797(int arg0, int arg1, int arg2, class485 arg3) {
        field6779++;
        class452 var5 = (class452) arg3;
        int var6 = var5.field6384 + arg1 + 1;
        int var7 = var5.field6388 + arg0 + 1;
        int var8 = this.field6770 * var6 + var7;
        int var9 = var5.field6390;
        int var10 = var5.field6381;
        int var11 = this.field6770 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var6 = 1;
            var8 += this.field6770 * var12;
        }
        if (var6 + var9 >= this.field6785) {
            int var13 = var6 + var9 + 1 - this.field6785;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var11 += var14;
            var7 = 1;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field6770) {
            int var15 = var10 + var7 - (this.field6770 - 1);
            var10 -= var15;
            var11 += var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return false;
        }
        byte var16 = 8;
        if (arg2 >= -40) {
            this.field6780 = -20;
        }
        int var17 = (var16 - 1) * this.field6770 + var11;
        return class261.method1707(var17, var8, this.field6772, var16, var9, false, var10);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2798(int arg0, int arg1, byte arg2) {
        if (arg2 <= 115) {
            field6787 = 121L;
        }
        field6782++;
        return (arg1 & 0x70000) != 0 | class274.method1771(arg1, 0, arg0) || class6.method39(-50, arg1, arg0);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public final void method2799(byte arg0) {
        if (arg0 >= -87) {
            return;
        }
        field6774++;
        this.field6768 = new class586[this.field6783][this.field6780];
        for (int var2 = 0; var2 < this.field6780; var2++) {
            for (int var3 = 0; var3 < this.field6783; var3++) {
                this.field6768[var3][var2] = new class586(this.field6777, this, this.field6781, var3, var2, this.field6769, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
    public static void method2800(byte arg0) {
        field6789 = null;
        if (arg0 == -91) {
            field6786 = null;
            field6788 = null;
            field6784 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II[[ZIIZ)V")
    public final void method2801(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, boolean arg5) {
        field6778++;
        this.field6777.method2276(false, -8);
        this.field6777.method2275(-32491, false);
        this.field6777.method2317(1, 9);
        this.field6777.method2334(1, (byte) -128);
        this.field6777.method2344((byte) 124, -2, false, false);
        if (arg1 >= -51) {
            field6786 = null;
        }
        float var7 = 1.0F / (float) (this.field6777.field5418 * 128);
        if (arg5) {
            for (int var26 = 0; var26 < this.field6780; var26++) {
                int var27 = var26 << this.field6769;
                int var28 = var26 + 1 << this.field6769;
                label90: for (int var29 = 0; var29 < this.field6783; var29++) {
                    int var30 = var29 << this.field6769;
                    int var31 = var29 + 1 << this.field6769;
                    for (int var32 = var30; var32 < var31; var32++) {
                        if (var32 - arg4 >= -arg3 && arg3 >= var32 - arg4) {
                            for (int var33 = var27; var33 < var28; var33++) {
                                if (-arg3 <= var33 - arg0 && arg3 >= (var33 - arg0) && arg2[var32 + arg3 - arg4][arg3 + var33 - arg0]) {
                                    class557 var34 = this.field6777.method2289(-72);
                                    var34.method3174(1.0F, (byte) 59, var7, var7);
                                    var34.method1051(-var29, -var26, 0);
                                    this.field6777.method2299(109, class510.field7141);
                                    this.field6768[var29][var26].method3439(-2);
                                    continue label90;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field6780; var8++) {
                int var9 = var8 << this.field6769;
                int var10 = var8 + 1 << this.field6769;
                for (int var11 = 0; var11 < this.field6783; var11++) {
                    class586 var12 = this.field6768[var11][var8];
                    class321 var13 = this.field6777.method2288(var12.field8379 * 3, false);
                    Buffer var14 = var13.method613(true, -25838);
                    if (var14 != null) {
                        Stream var15 = this.field6777.method2269(101, var14);
                        int var16 = 0;
                        int var17 = var11 << this.field6769;
                        int var18 = var11 + 1 << this.field6769;
                        for (int var19 = var9; var19 < var10; var19++) {
                            if ((var19 - arg0) >= (-arg3) && var19 - arg0 <= arg3) {
                                int var21 = this.field6781.field2505 * var19 + var17;
                                for (int var22 = var17; var22 < var18; var22++) {
                                    if ((var22 - arg4) >= (-arg3) && arg3 >= var22 - arg4 && arg2[var22 + arg3 - arg4][var19 + arg3 - arg0]) {
                                        short[] var23 = this.field6781.field4721[var21];
                                        if (var23 != null) {
                                            if (Stream.method3294()) {
                                                for (int var24 = 0; var24 < var23.length; var24++) {
                                                    var15.method3291(var23[var24] & 0xFFFF);
                                                    var16++;
                                                }
                                            } else {
                                                for (int var25 = 0; var25 < var23.length; var25++) {
                                                    var16++;
                                                    var15.method3298(var23[var25] & 0xFFFF);
                                                }
                                            }
                                        }
                                    }
                                    var21++;
                                }
                            }
                        }
                        var15.method3288();
                        if (var13.method616((byte) -72) && var16 > 0) {
                            class557 var20 = this.field6777.method2289(-11);
                            var20.method3174(1.0F, (byte) 59, var7, var7);
                            var20.method1051(-var11, -var8, 0);
                            this.field6777.method2299(43, class510.field7141);
                            var12.method3436(var13, Integer.MAX_VALUE, var16 / 3);
                        }
                    }
                }
            }
        }
        this.field6777.method2325(1);
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(IIIII)V")
    public static final void method2802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class628.field9187; var5++) {
            Rectangle var6 = class564.field7815[var5];
            if (arg2 < var6.x + var6.width && arg2 + arg4 > var6.x && arg1 < var6.y + var6.height && (arg1 + arg3) > var6.y) {
                class48.field940[var5] = true;
            }
        }
        field6771++;
        if (arg0 >= -112) {
            method2800((byte) -28);
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lwr;Luw;)V")
    public class481(class388 arg0, class352 arg1) {
        this.field6777 = arg0;
        this.field6781 = arg1;
        this.field6770 = (this.field6781.field2505 * this.field6781.field2504 >> this.field6777.field5394) + 2;
        this.field6785 = (this.field6781.field2504 * this.field6781.field2503 >> this.field6777.field5394) + 2;
        this.field6769 = this.field6777.field5394 + 7 - this.field6781.field2506;
        this.field6772 = new byte[this.field6785 * this.field6770];
        this.field6783 = this.field6781.field2505 >> this.field6769;
        this.field6780 = this.field6781.field2503 >> this.field6769;
    }
}
