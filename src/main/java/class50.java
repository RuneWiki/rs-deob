import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class50 extends class208 {

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "B")
    public byte field753 = 0;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public int field760 = 0;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public int field764 = 0;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "Z")
    private boolean field789 = false;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "[I")
    public int[] field766;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "[I")
    public int[] field779;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "[I")
    public int[] field790;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "[I")
    private int[] field783;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "[I")
    public int[] field768;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "[I")
    public int[] field751;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "[I")
    public int[] field761;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "[B")
    public byte[] field781;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "[B")
    public byte[] field767;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "[B")
    public byte[] field749;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "[S")
    public short[] field770;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "[S")
    public short[] field782;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "[B")
    public byte[] field785;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "[I")
    private int[] field756;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "[B")
    public byte[] field775;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "[S")
    public short[] field762;

    @OriginalMember(owner = "client!ai", name = "pb", descriptor = "[S")
    public short[] field797;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "[S")
    public short[] field765;

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "[S")
    private short[] field788;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "[S")
    private short[] field757;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "[S")
    private short[] field787;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "[B")
    private byte[] field769;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "[B")
    private byte[] field780;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "[B")
    private byte[] field793;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "[B")
    private byte[] field778;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "[B")
    private byte[] field752;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "[[I")
    public int[][] field754;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "[[I")
    public int[][] field776;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "[Lsb;")
    public class137[] field786;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "[Lfd;")
    public class123[] field763;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "[Lsb;")
    public class137[] field777;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "S")
    public short field771;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "S")
    public short field772;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "[I")
    private static int[] field750 = new int[10000];

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "[I")
    private static int[] field773 = class72.field1150;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    private static int field774 = 0;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "[I")
    private static int[] field755 = class72.field1145;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "[I")
    private static int[] field791 = new int[10000];

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "S")
    private short field759;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "S")
    private short field784;

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "S")
    private short field792;

    @OriginalMember(owner = "client!ai", name = "mb", descriptor = "S")
    private short field794;

    @OriginalMember(owner = "client!ai", name = "nb", descriptor = "S")
    private short field795;

    @OriginalMember(owner = "client!ai", name = "ob", descriptor = "S")
    private short field796;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()Lai;")
    public final class50 method345() {
        class50 var1 = new class50();
        if (this.field781 != null) {
            var1.field781 = new byte[this.field760];
            for (int var2 = 0; var2 < this.field760; var2++) {
                var1.field781[var2] = this.field781[var2];
            }
        }
        var1.field764 = this.field764;
        var1.field760 = this.field760;
        var1.field758 = this.field758;
        var1.field766 = this.field766;
        var1.field779 = this.field779;
        var1.field790 = this.field790;
        var1.field768 = this.field768;
        var1.field751 = this.field751;
        var1.field761 = this.field761;
        var1.field767 = this.field767;
        var1.field749 = this.field749;
        var1.field785 = this.field785;
        var1.field770 = this.field770;
        var1.field782 = this.field782;
        var1.field753 = this.field753;
        var1.field775 = this.field775;
        var1.field762 = this.field762;
        var1.field797 = this.field797;
        var1.field765 = this.field765;
        var1.field788 = this.field788;
        var1.field757 = this.field757;
        var1.field787 = this.field787;
        var1.field769 = this.field769;
        var1.field780 = this.field780;
        var1.field793 = this.field793;
        var1.field778 = this.field778;
        var1.field752 = this.field752;
        var1.field783 = this.field783;
        var1.field756 = this.field756;
        var1.field754 = this.field754;
        var1.field776 = this.field776;
        var1.field786 = this.field786;
        var1.field763 = this.field763;
        var1.field771 = this.field771;
        var1.field772 = this.field772;
        return var1;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "()V")
    public final void method346() {
        if (this.field786 != null) {
            return;
        }
        this.field786 = new class137[this.field764];
        for (int var1 = 0; var1 < this.field764; var1++) {
            this.field786[var1] = new class137();
        }
        for (int var2 = 0; var2 < this.field760; var2++) {
            int var3 = this.field768[var2];
            int var4 = this.field751[var2];
            int var5 = this.field761[var2];
            int var6 = this.field766[var4] - this.field766[var3];
            int var7 = this.field779[var4] - this.field779[var3];
            int var8 = this.field790[var4] - this.field790[var3];
            int var9 = this.field766[var5] - this.field766[var3];
            int var10 = this.field779[var5] - this.field779[var3];
            int var11 = this.field790[var5] - this.field790[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field781 == null) {
                var19 = 0;
            } else {
                var19 = this.field781[var2];
            }
            if (var19 == 0) {
                class137 var20 = this.field786[var3];
                var20.field2240 += var16;
                var20.field2246 += var17;
                var20.field2242 += var18;
                var20.field2238++;
                class137 var21 = this.field786[var4];
                var21.field2240 += var16;
                var21.field2246 += var17;
                var21.field2242 += var18;
                var21.field2238++;
                class137 var22 = this.field786[var5];
                var22.field2240 += var16;
                var22.field2246 += var17;
                var22.field2242 += var18;
                var22.field2238++;
            } else if (var19 == 1) {
                if (this.field763 == null) {
                    this.field763 = new class123[this.field760];
                }
                class123 var23 = this.field763[var2] = new class123();
                var23.field2010 = var16;
                var23.field2009 = var17;
                var23.field2013 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([[III)I")
    private static final int method347(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(SS)V")
    public final void method348(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field760; var3++) {
            if (this.field770[var3] == arg0) {
                this.field770[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "()V")
    public final void method349() {
        this.field783 = null;
        this.field756 = null;
        this.field754 = null;
        this.field776 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
    public final void method350(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field764; var4++) {
            this.field766[var4] = this.field766[var4] * arg0 / 128;
            this.field779[var4] = this.field779[var4] * arg1 / 128;
            this.field790[var4] = this.field790[var4] * arg2 / 128;
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(IIIII)Lnb;")
    public final class249 method351(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class231(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "()V")
    public final void method352() {
        int var10002;
        if (this.field783 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field764; var3++) {
                int var7 = this.field783[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field754 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field754[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field764) {
                int var6 = this.field783[var5];
                this.field754[var6][var1[var6]++] = var5++;
            }
            this.field783 = null;
        }
        if (this.field756 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field760; var10++) {
            int var14 = this.field756[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field776 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field776[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field760) {
            int var13 = this.field756[var12];
            this.field776[var13][var8[var13]++] = var12++;
        }
        this.field756 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    private final void method353(int arg0) {
        int var2 = field773[arg0];
        int var3 = field755[arg0];
        for (int var4 = 0; var4 < this.field764; var4++) {
            int var5 = this.field779[var4] * var2 + this.field766[var4] * var3 >> 16;
            this.field779[var4] = this.field779[var4] * var3 - this.field766[var4] * var2 >> 16;
            this.field766[var4] = var5;
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljb;II)Lai;")
    public static final class50 method354(class11 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method89(arg2, arg1, 95);
        return var3 == null ? null : new class50(var3);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Laf;IIIZ)V")
    public final void method355(class208 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class50 var6 = (class50) arg0;
        var6.method361();
        var6.method346();
        field774++;
        int var7 = 0;
        int[] var8 = var6.field766;
        int var9 = var6.field764;
        for (int var10 = 0; var10 < this.field764; var10++) {
            class137 var13 = this.field786[var10];
            if (var13.field2238 != 0) {
                int var14 = this.field779[var10] - arg2;
                if (var14 >= var6.field796 && var14 <= var6.field792) {
                    int var15 = this.field766[var10] - arg1;
                    if (var15 >= var6.field784 && var15 <= var6.field794) {
                        int var16 = this.field790[var10] - arg3;
                        if (var16 >= var6.field795 && var16 <= var6.field759) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class137 var18 = var6.field786[var17];
                                if (var8[var17] == var15 && var6.field790[var17] == var16 && var6.field779[var17] == var14 && var18.field2238 != 0) {
                                    if (this.field777 == null) {
                                        this.field777 = new class137[this.field764];
                                    }
                                    if (var6.field777 == null) {
                                        var6.field777 = new class137[var9];
                                    }
                                    class137 var19 = this.field777[var10];
                                    if (var19 == null) {
                                        var19 = this.field777[var10] = new class137(var13);
                                    }
                                    class137 var20 = var6.field777[var17];
                                    if (var20 == null) {
                                        var20 = var6.field777[var17] = new class137(var18);
                                    }
                                    var19.field2240 += var18.field2240;
                                    var19.field2246 += var18.field2246;
                                    var19.field2242 += var18.field2242;
                                    var19.field2238 += var18.field2238;
                                    var20.field2240 += var13.field2240;
                                    var20.field2246 += var13.field2246;
                                    var20.field2242 += var13.field2242;
                                    var20.field2238 += var13.field2238;
                                    var7++;
                                    field750[var10] = field774;
                                    field791[var17] = field774;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field760; var11++) {
            if (field750[this.field768[var11]] == field774 && field750[this.field751[var11]] == field774 && field750[this.field761[var11]] == field774) {
                if (this.field781 == null) {
                    this.field781 = new byte[this.field760];
                }
                this.field781[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field760; var12++) {
            if (field791[var6.field768[var12]] == field774 && field791[var6.field751[var12]] == field774 && field791[var6.field761[var12]] == field774) {
                if (var6.field781 == null) {
                    var6.field781 = new byte[var6.field760];
                }
                var6.field781[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(SS)V")
    public final void method356(short arg0, short arg1) {
        if (this.field782 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field760; var3++) {
            if (this.field782[var3] == arg0) {
                this.field782[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([[IIIIII)V")
    private final void method357(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method347(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method347(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method347(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method347(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method359(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method353(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method363(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)I")
    public final int method358(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field764; var4++) {
            if (this.field766[var4] == arg0 && this.field779[var4] == arg1 && this.field790[var4] == arg2) {
                return var4;
            }
        }
        this.field766[this.field764] = arg0;
        this.field779[this.field764] = arg1;
        this.field790[this.field764] = arg2;
        return this.field764++;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    private final void method359(int arg0) {
        int var2 = field773[arg0];
        int var3 = field755[arg0];
        for (int var4 = 0; var4 < this.field764; var4++) {
            int var5 = this.field779[var4] * var3 - this.field790[var4] * var2 >> 16;
            this.field790[var4] = this.field790[var4] * var3 + this.field779[var4] * var2 >> 16;
            this.field779[var4] = var5;
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([B)V")
    private final void method360(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class230 var4 = new class230(arg0);
        class230 var5 = new class230(arg0);
        class230 var6 = new class230(arg0);
        class230 var7 = new class230(arg0);
        class230 var8 = new class230(arg0);
        var4.field3933 = arg0.length - 18;
        int var9 = var4.method1535(2);
        int var10 = var4.method1535(2);
        int var11 = var4.method1516((byte) 82);
        int var12 = var4.method1516((byte) 82);
        int var13 = var4.method1516((byte) 82);
        int var14 = var4.method1516((byte) 82);
        int var15 = var4.method1516((byte) 82);
        int var16 = var4.method1516((byte) 82);
        int var17 = var4.method1535(2);
        int var18 = var4.method1535(2);
        int var19 = var4.method1535(2);
        int var20 = var4.method1535(2);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field764 = var9;
        this.field760 = var10;
        this.field758 = var11;
        this.field766 = new int[var9];
        this.field779 = new int[var9];
        this.field790 = new int[var9];
        this.field768 = new int[var10];
        this.field751 = new int[var10];
        this.field761 = new int[var10];
        if (var11 > 0) {
            this.field775 = new byte[var11];
            this.field762 = new short[var11];
            this.field797 = new short[var11];
            this.field765 = new short[var11];
        }
        if (var16 == 1) {
            this.field783 = new int[var9];
        }
        if (var12 == 1) {
            this.field781 = new byte[var10];
            this.field785 = new byte[var10];
            this.field782 = new short[var10];
        }
        if (var13 == 255) {
            this.field767 = new byte[var10];
        } else {
            this.field753 = (byte) var13;
        }
        if (var14 == 1) {
            this.field749 = new byte[var10];
        }
        if (var15 == 1) {
            this.field756 = new int[var10];
        }
        this.field770 = new short[var10];
        var4.field3933 = var21;
        var5.field3933 = var36;
        var6.field3933 = var38;
        var7.field3933 = var40;
        var8.field3933 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1516((byte) 82);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1536((byte) 6);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1536((byte) 6);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1536((byte) 6);
            }
            this.field766[var46] = var43 + var63;
            this.field779[var46] = var44 + var64;
            this.field790[var46] = var45 + var65;
            var43 = this.field766[var46];
            var44 = this.field779[var46];
            var45 = this.field790[var46];
            if (var16 == 1) {
                this.field783[var46] = var8.method1516((byte) 82);
            }
        }
        var4.field3933 = var32;
        var5.field3933 = var28;
        var6.field3933 = var26;
        var7.field3933 = var30;
        var8.field3933 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field770[var47] = (short) var4.method1535(2);
            if (var12 == 1) {
                int var61 = var5.method1516((byte) 82);
                if ((var61 & 0x1) == 1) {
                    this.field781[var47] = 1;
                    var2 = true;
                } else {
                    this.field781[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field785[var47] = (byte) (var61 >> 2);
                    this.field782[var47] = this.field770[var47];
                    this.field770[var47] = 127;
                    if (this.field782[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field785[var47] = -1;
                    this.field782[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field767[var47] = var6.method1563(-255688184);
            }
            if (var14 == 1) {
                this.field749[var47] = var7.method1563(-255688184);
            }
            if (var15 == 1) {
                this.field756[var47] = var8.method1516((byte) 82);
            }
        }
        var4.field3933 = var25;
        var5.field3933 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1516((byte) 82);
            if (var57 == 1) {
                var48 = var4.method1536((byte) 6) + var51;
                var49 = var4.method1536((byte) 6) + var48;
                var50 = var4.method1536((byte) 6) + var49;
                var51 = var50;
                this.field768[var52] = var48;
                this.field751[var52] = var49;
                this.field761[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1536((byte) 6) + var51;
                var51 = var50;
                this.field768[var52] = var48;
                this.field751[var52] = var49;
                this.field761[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1536((byte) 6) + var51;
                var51 = var50;
                this.field768[var52] = var48;
                this.field751[var52] = var49;
                this.field761[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1536((byte) 6) + var51;
                var51 = var50;
                this.field768[var52] = var48;
                this.field751[var52] = var60;
                this.field761[var52] = var50;
            }
        }
        var4.field3933 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field775[var53] = 0;
            this.field762[var53] = (short) var4.method1535(2);
            this.field797[var53] = (short) var4.method1535(2);
            this.field765[var53] = (short) var4.method1535(2);
        }
        if (this.field785 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field785[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field762[var56] & 0xFFFF) == this.field768[var55] && (this.field797[var56] & 0xFFFF) == this.field751[var55] && (this.field765[var56] & 0xFFFF) == this.field761[var55]) {
                        this.field785[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field785 = null;
            }
        }
        if (!var3) {
            this.field782 = null;
        }
        if (!var2) {
            this.field781 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "()V")
    private final void method361() {
        if (this.field789) {
            return;
        }
        this.field789 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field764; var7++) {
            int var8 = this.field766[var7];
            int var9 = this.field779[var7];
            int var10 = this.field790[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field784 = (short) var1;
        this.field794 = (short) var4;
        this.field796 = (short) var2;
        this.field792 = (short) var5;
        this.field795 = (short) var3;
        this.field759 = (short) var6;
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "()V")
    public final void method362() {
        for (int var1 = 0; var1 < this.field764; var1++) {
            this.field790[var1] = -this.field790[var1];
        }
        for (int var2 = 0; var2 < this.field760; var2++) {
            int var3 = this.field768[var2];
            this.field768[var2] = this.field761[var2];
            this.field761[var2] = var3;
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(III)V")
    public final void method363(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field764; var4++) {
            this.field766[var4] += arg0;
            this.field779[var4] += arg1;
            this.field790[var4] += arg2;
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[[I[[IIIIZZ)Lai;")
    public final class50 method364(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method361();
        int var10 = this.field784 + arg4;
        int var11 = this.field794 + arg4;
        int var12 = this.field795 + arg6;
        int var13 = this.field759 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class50 var18;
        if (arg7) {
            var18 = new class50();
            var18.field764 = this.field764;
            var18.field760 = this.field760;
            var18.field758 = this.field758;
            var18.field768 = this.field768;
            var18.field751 = this.field751;
            var18.field761 = this.field761;
            var18.field781 = this.field781;
            var18.field767 = this.field767;
            var18.field749 = this.field749;
            var18.field785 = this.field785;
            var18.field770 = this.field770;
            var18.field782 = this.field782;
            var18.field753 = this.field753;
            var18.field775 = this.field775;
            var18.field762 = this.field762;
            var18.field797 = this.field797;
            var18.field765 = this.field765;
            var18.field788 = this.field788;
            var18.field757 = this.field757;
            var18.field787 = this.field787;
            var18.field769 = this.field769;
            var18.field780 = this.field780;
            var18.field793 = this.field793;
            var18.field778 = this.field778;
            var18.field752 = this.field752;
            var18.field783 = this.field783;
            var18.field756 = this.field756;
            var18.field754 = this.field754;
            var18.field776 = this.field776;
            var18.field771 = this.field771;
            var18.field772 = this.field772;
            var18.field786 = this.field786;
            var18.field763 = this.field763;
            var18.field777 = this.field777;
            if (arg0 == 3) {
                var18.field766 = class236.method1618(-27, this.field766);
                var18.field779 = class236.method1618(-62, this.field779);
                var18.field790 = class236.method1618(-88, this.field790);
            } else {
                var18.field766 = this.field766;
                var18.field779 = new int[var18.field764];
                var18.field790 = this.field790;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field764; var19++) {
                int var20 = this.field766[var19] + arg4;
                int var21 = this.field790[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field779[var19] = this.field779[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field764; var29++) {
                int var30 = (this.field779[var29] << 16) / this.field796;
                if (var30 < arg1) {
                    int var31 = this.field766[var29] + arg4;
                    int var32 = this.field790[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field779[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field779[var29];
                } else {
                    var18.field779[var29] = this.field779[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method357(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field792 - this.field796;
            for (int var43 = 0; var43 < this.field764; var43++) {
                int var44 = this.field766[var43] + arg4;
                int var45 = this.field790[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field779[var43] = var52 + this.field779[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field792 - this.field796;
            for (int var54 = 0; var54 < this.field764; var54++) {
                int var55 = this.field766[var54] + arg4;
                int var56 = this.field790[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field779[var54] = ((this.field779[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method373();
        } else {
            this.field789 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()Z")
    public final boolean method365() {
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public final void method366(int arg0) {
        int var2 = field773[arg0];
        int var3 = field755[arg0];
        for (int var4 = 0; var4 < this.field764; var4++) {
            int var5 = this.field790[var4] * var2 + this.field766[var4] * var3 >> 16;
            this.field790[var4] = this.field790[var4] * var3 - this.field766[var4] * var2 >> 16;
            this.field766[var4] = var5;
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "()V")
    public final void method367() {
        for (int var1 = 0; var1 < this.field764; var1++) {
            this.field766[var1] = -this.field766[var1];
            this.field790[var1] = -this.field790[var1];
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBSB)I")
    public final int method368(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field768[this.field760] = arg0;
        this.field751[this.field760] = arg1;
        this.field761[this.field760] = arg2;
        this.field781[this.field760] = arg3;
        this.field785[this.field760] = -1;
        this.field770[this.field760] = arg4;
        this.field782[this.field760] = -1;
        this.field749[this.field760] = arg5;
        return this.field760++;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "([B)V")
    private final void method369(byte[] arg0) {
        class230 var2 = new class230(arg0);
        class230 var3 = new class230(arg0);
        class230 var4 = new class230(arg0);
        class230 var5 = new class230(arg0);
        class230 var6 = new class230(arg0);
        class230 var7 = new class230(arg0);
        class230 var8 = new class230(arg0);
        var2.field3933 = arg0.length - 23;
        int var9 = var2.method1535(2);
        int var10 = var2.method1535(2);
        int var11 = var2.method1516((byte) 82);
        int var12 = var2.method1516((byte) 82);
        int var13 = var2.method1516((byte) 82);
        int var14 = var2.method1516((byte) 82);
        int var15 = var2.method1516((byte) 82);
        int var16 = var2.method1516((byte) 82);
        int var17 = var2.method1516((byte) 82);
        int var18 = var2.method1535(2);
        int var19 = var2.method1535(2);
        int var20 = var2.method1535(2);
        int var21 = var2.method1535(2);
        int var22 = var2.method1535(2);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field775 = new byte[var11];
            var2.field3933 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field775[var26] = var2.method1563(-255688184);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field764 = var9;
        this.field760 = var10;
        this.field758 = var11;
        this.field766 = new int[var9];
        this.field779 = new int[var9];
        this.field790 = new int[var9];
        this.field768 = new int[var10];
        this.field751 = new int[var10];
        this.field761 = new int[var10];
        if (var17 == 1) {
            this.field783 = new int[var9];
        }
        if (var12 == 1) {
            this.field781 = new byte[var10];
        }
        if (var13 == 255) {
            this.field767 = new byte[var10];
        } else {
            this.field753 = (byte) var13;
        }
        if (var14 == 1) {
            this.field749 = new byte[var10];
        }
        if (var15 == 1) {
            this.field756 = new int[var10];
        }
        if (var16 == 1) {
            this.field782 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field785 = new byte[var10];
        }
        this.field770 = new short[var10];
        if (var11 > 0) {
            this.field762 = new short[var11];
            this.field797 = new short[var11];
            this.field765 = new short[var11];
            if (var24 > 0) {
                this.field788 = new short[var24];
                this.field757 = new short[var24];
                this.field787 = new short[var24];
                this.field769 = new byte[var24];
                this.field780 = new byte[var24];
                this.field793 = new byte[var24];
            }
            if (var25 > 0) {
                this.field778 = new byte[var25];
                this.field752 = new byte[var25];
            }
        }
        var2.field3933 = var11;
        var3.field3933 = var44;
        var4.field3933 = var46;
        var5.field3933 = var48;
        var6.field3933 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1516((byte) 82);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1536((byte) 6);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1536((byte) 6);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1536((byte) 6);
            }
            this.field766[var66] = var63 + var80;
            this.field779[var66] = var64 + var81;
            this.field790[var66] = var65 + var82;
            var63 = this.field766[var66];
            var64 = this.field779[var66];
            var65 = this.field790[var66];
            if (var17 == 1) {
                this.field783[var66] = var6.method1516((byte) 82);
            }
        }
        var2.field3933 = var42;
        var3.field3933 = var31;
        var4.field3933 = var34;
        var5.field3933 = var37;
        var6.field3933 = var35;
        var7.field3933 = var40;
        var8.field3933 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field770[var67] = (short) var2.method1535(2);
            if (var12 == 1) {
                this.field781[var67] = var3.method1563(-255688184);
            }
            if (var13 == 255) {
                this.field767[var67] = var4.method1563(-255688184);
            }
            if (var14 == 1) {
                this.field749[var67] = var5.method1563(-255688184);
            }
            if (var15 == 1) {
                this.field756[var67] = var6.method1516((byte) 82);
            }
            if (var16 == 1) {
                this.field782[var67] = (short) (var7.method1535(2) - 1);
            }
            if (this.field785 != null) {
                if (this.field782[var67] == -1) {
                    this.field785[var67] = -1;
                } else {
                    this.field785[var67] = (byte) (var8.method1516((byte) 82) - 1);
                }
            }
        }
        var2.field3933 = var33;
        var3.field3933 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1516((byte) 82);
            if (var75 == 1) {
                var68 = var2.method1536((byte) 6) + var71;
                var69 = var2.method1536((byte) 6) + var68;
                var70 = var2.method1536((byte) 6) + var69;
                var71 = var70;
                this.field768[var72] = var68;
                this.field751[var72] = var69;
                this.field761[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1536((byte) 6) + var71;
                var71 = var70;
                this.field768[var72] = var68;
                this.field751[var72] = var69;
                this.field761[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1536((byte) 6) + var71;
                var71 = var70;
                this.field768[var72] = var68;
                this.field751[var72] = var69;
                this.field761[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1536((byte) 6) + var71;
                var71 = var70;
                this.field768[var72] = var68;
                this.field751[var72] = var78;
                this.field761[var72] = var70;
            }
        }
        var2.field3933 = var50;
        var3.field3933 = var52;
        var4.field3933 = var54;
        var5.field3933 = var56;
        var6.field3933 = var58;
        var7.field3933 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field775[var73] & 0xFF;
            if (var74 == 0) {
                this.field762[var73] = (short) var2.method1535(2);
                this.field797[var73] = (short) var2.method1535(2);
                this.field765[var73] = (short) var2.method1535(2);
            }
            if (var74 == 1) {
                this.field762[var73] = (short) var3.method1535(2);
                this.field797[var73] = (short) var3.method1535(2);
                this.field765[var73] = (short) var3.method1535(2);
                this.field788[var73] = (short) var4.method1535(2);
                this.field757[var73] = (short) var4.method1535(2);
                this.field787[var73] = (short) var4.method1535(2);
                this.field769[var73] = var5.method1563(-255688184);
                this.field780[var73] = var6.method1563(-255688184);
                this.field793[var73] = var7.method1563(-255688184);
            }
            if (var74 == 2) {
                this.field762[var73] = (short) var3.method1535(2);
                this.field797[var73] = (short) var3.method1535(2);
                this.field765[var73] = (short) var3.method1535(2);
                this.field788[var73] = (short) var4.method1535(2);
                this.field757[var73] = (short) var4.method1535(2);
                this.field787[var73] = (short) var4.method1535(2);
                this.field769[var73] = var5.method1563(-255688184);
                this.field780[var73] = var6.method1563(-255688184);
                this.field793[var73] = var7.method1563(-255688184);
                this.field778[var73] = var7.method1563(-255688184);
                this.field752[var73] = var7.method1563(-255688184);
            }
            if (var74 == 3) {
                this.field762[var73] = (short) var3.method1535(2);
                this.field797[var73] = (short) var3.method1535(2);
                this.field765[var73] = (short) var3.method1535(2);
                this.field788[var73] = (short) var4.method1535(2);
                this.field757[var73] = (short) var4.method1535(2);
                this.field787[var73] = (short) var4.method1535(2);
                this.field769[var73] = var5.method1563(-255688184);
                this.field780[var73] = var6.method1563(-255688184);
                this.field793[var73] = var7.method1563(-255688184);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(IIIII)Lce;")
    public final class231 method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class231(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Laf;")
    public final class208 method371(int arg0, int arg1, int arg2) {
        return this.method351(this.field771, this.field772, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(III)V")
    public final void method372(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field773[arg2];
            int var5 = field755[arg2];
            for (int var6 = 0; var6 < this.field764; var6++) {
                int var7 = this.field779[var6] * var4 + this.field766[var6] * var5 >> 16;
                this.field779[var6] = this.field779[var6] * var5 - this.field766[var6] * var4 >> 16;
                this.field766[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field773[arg0];
            int var9 = field755[arg0];
            for (int var10 = 0; var10 < this.field764; var10++) {
                int var11 = this.field779[var10] * var9 - this.field790[var10] * var8 >> 16;
                this.field790[var10] = this.field790[var10] * var9 + this.field779[var10] * var8 >> 16;
                this.field779[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field773[arg1];
        int var13 = field755[arg1];
        for (int var14 = 0; var14 < this.field764; var14++) {
            int var15 = this.field790[var14] * var12 + this.field766[var14] * var13 >> 16;
            this.field790[var14] = this.field790[var14] * var13 - this.field766[var14] * var12 >> 16;
            this.field766[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()I")
    public final int method190() {
        if (!this.field789) {
            this.method361();
        }
        return this.field796;
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "()V")
    private final void method373() {
        this.field786 = null;
        this.field777 = null;
        this.field763 = null;
        this.field789 = false;
    }

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "()V")
    public final void method374() {
        for (int var1 = 0; var1 < this.field764; var1++) {
            int var2 = this.field766[var1];
            this.field766[var1] = this.field790[var1];
            this.field790[var1] = -var2;
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "()V")
    public static void method375() {
        field750 = null;
        field791 = null;
        field773 = null;
        field755 = null;
    }

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "()V")
    public final void method376() {
        for (int var1 = 0; var1 < this.field764; var1++) {
            int var2 = this.field790[var1];
            this.field790[var1] = this.field766[var1];
            this.field766[var1] = -var2;
        }
        this.method373();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lai;I)I")
    private final int method377(class50 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field766[arg1];
        int var5 = arg0.field779[arg1];
        int var6 = arg0.field790[arg1];
        for (int var7 = 0; var7 < this.field764; var7++) {
            if (this.field766[var7] == var4 && this.field779[var7] == var5 && this.field790[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field766[this.field764] = var4;
            this.field779[this.field764] = var5;
            this.field790[this.field764] = var6;
            if (arg0.field783 != null) {
                this.field783[this.field764] = arg0.field783[arg1];
            }
            var3 = this.field764++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    private class50() {
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([B)V")
    private class50(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method369(arg0);
        } else {
            this.method360(arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(III)V")
    public class50(int arg0, int arg1, int arg2) {
        this.field766 = new int[arg0];
        this.field779 = new int[arg0];
        this.field790 = new int[arg0];
        this.field783 = new int[arg0];
        this.field768 = new int[arg1];
        this.field751 = new int[arg1];
        this.field761 = new int[arg1];
        this.field781 = new byte[arg1];
        this.field767 = new byte[arg1];
        this.field749 = new byte[arg1];
        this.field770 = new short[arg1];
        this.field782 = new short[arg1];
        this.field785 = new byte[arg1];
        this.field756 = new int[arg1];
        if (arg2 > 0) {
            this.field775 = new byte[arg2];
            this.field762 = new short[arg2];
            this.field797 = new short[arg2];
            this.field765 = new short[arg2];
            this.field788 = new short[arg2];
            this.field757 = new short[arg2];
            this.field787 = new short[arg2];
            this.field769 = new byte[arg2];
            this.field780 = new byte[arg2];
            this.field793 = new byte[arg2];
            this.field778 = new byte[arg2];
            this.field752 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([Lai;I)V")
    public class50(class50[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field764 = 0;
        this.field760 = 0;
        this.field758 = 0;
        this.field753 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class50 var15 = arg0[var9];
            if (var15 != null) {
                this.field764 += var15.field764;
                this.field760 += var15.field760;
                this.field758 += var15.field758;
                if (var15.field767 == null) {
                    if (this.field753 == -1) {
                        this.field753 = var15.field753;
                    }
                    if (this.field753 != var15.field753) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field781 != null;
                var5 |= var15.field749 != null;
                var6 |= var15.field756 != null;
                var7 |= var15.field782 != null;
                var8 |= var15.field785 != null;
            }
        }
        this.field766 = new int[this.field764];
        this.field779 = new int[this.field764];
        this.field790 = new int[this.field764];
        this.field783 = new int[this.field764];
        this.field768 = new int[this.field760];
        this.field751 = new int[this.field760];
        this.field761 = new int[this.field760];
        if (var3) {
            this.field781 = new byte[this.field760];
        }
        if (var4) {
            this.field767 = new byte[this.field760];
        }
        if (var5) {
            this.field749 = new byte[this.field760];
        }
        if (var6) {
            this.field756 = new int[this.field760];
        }
        if (var7) {
            this.field782 = new short[this.field760];
        }
        if (var8) {
            this.field785 = new byte[this.field760];
        }
        this.field770 = new short[this.field760];
        if (this.field758 > 0) {
            this.field775 = new byte[this.field758];
            this.field762 = new short[this.field758];
            this.field797 = new short[this.field758];
            this.field765 = new short[this.field758];
            this.field788 = new short[this.field758];
            this.field757 = new short[this.field758];
            this.field787 = new short[this.field758];
            this.field769 = new byte[this.field758];
            this.field780 = new byte[this.field758];
            this.field793 = new byte[this.field758];
            this.field778 = new byte[this.field758];
            this.field752 = new byte[this.field758];
        }
        this.field764 = 0;
        this.field760 = 0;
        this.field758 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class50 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field760; var12++) {
                    if (var3 && var11.field781 != null) {
                        this.field781[this.field760] = var11.field781[var12];
                    }
                    if (var4) {
                        if (var11.field767 == null) {
                            this.field767[this.field760] = var11.field753;
                        } else {
                            this.field767[this.field760] = var11.field767[var12];
                        }
                    }
                    if (var5 && var11.field749 != null) {
                        this.field749[this.field760] = var11.field749[var12];
                    }
                    if (var6 && var11.field756 != null) {
                        this.field756[this.field760] = var11.field756[var12];
                    }
                    if (var7) {
                        if (var11.field782 == null) {
                            this.field782[this.field760] = -1;
                        } else {
                            this.field782[this.field760] = var11.field782[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field785 == null || var11.field785[var12] == -1) {
                            this.field785[this.field760] = -1;
                        } else {
                            this.field785[this.field760] = (byte) (var11.field785[var12] + this.field758);
                        }
                    }
                    this.field770[this.field760] = var11.field770[var12];
                    this.field768[this.field760] = this.method377(var11, var11.field768[var12]);
                    this.field751[this.field760] = this.method377(var11, var11.field751[var12]);
                    this.field761[this.field760] = this.method377(var11, var11.field761[var12]);
                    this.field760++;
                }
                for (int var13 = 0; var13 < var11.field758; var13++) {
                    byte var14 = this.field775[this.field758] = var11.field775[var13];
                    if (var14 == 0) {
                        this.field762[this.field758] = (short) this.method377(var11, var11.field762[var13]);
                        this.field797[this.field758] = (short) this.method377(var11, var11.field797[var13]);
                        this.field765[this.field758] = (short) this.method377(var11, var11.field765[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field762[this.field758] = var11.field762[var13];
                        this.field797[this.field758] = var11.field797[var13];
                        this.field765[this.field758] = var11.field765[var13];
                        this.field788[this.field758] = var11.field788[var13];
                        this.field757[this.field758] = var11.field757[var13];
                        this.field787[this.field758] = var11.field787[var13];
                        this.field769[this.field758] = var11.field769[var13];
                        this.field780[this.field758] = var11.field780[var13];
                        this.field793[this.field758] = var11.field793[var13];
                    }
                    if (var14 == 2) {
                        this.field778[this.field758] = var11.field778[var13];
                        this.field752[this.field758] = var11.field752[var13];
                    }
                    this.field758++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lai;ZZZZ)V")
    public class50(class50 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field764 = arg0.field764;
        this.field760 = arg0.field760;
        this.field758 = arg0.field758;
        if (arg1) {
            this.field766 = arg0.field766;
            this.field779 = arg0.field779;
            this.field790 = arg0.field790;
        } else {
            this.field766 = new int[this.field764];
            this.field779 = new int[this.field764];
            this.field790 = new int[this.field764];
            for (int var6 = 0; var6 < this.field764; var6++) {
                this.field766[var6] = arg0.field766[var6];
                this.field779[var6] = arg0.field779[var6];
                this.field790[var6] = arg0.field790[var6];
            }
        }
        if (arg2) {
            this.field770 = arg0.field770;
        } else {
            this.field770 = new short[this.field760];
            for (int var7 = 0; var7 < this.field760; var7++) {
                this.field770[var7] = arg0.field770[var7];
            }
        }
        if (arg3 || arg0.field782 == null) {
            this.field782 = arg0.field782;
        } else {
            this.field782 = new short[this.field760];
            for (int var8 = 0; var8 < this.field760; var8++) {
                this.field782[var8] = arg0.field782[var8];
            }
        }
        if (arg4) {
            this.field749 = arg0.field749;
        } else {
            this.field749 = new byte[this.field760];
            if (arg0.field749 == null) {
                for (int var9 = 0; var9 < this.field760; var9++) {
                    this.field749[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field760; var10++) {
                    this.field749[var10] = arg0.field749[var10];
                }
            }
        }
        this.field768 = arg0.field768;
        this.field751 = arg0.field751;
        this.field761 = arg0.field761;
        this.field781 = arg0.field781;
        this.field767 = arg0.field767;
        this.field785 = arg0.field785;
        this.field753 = arg0.field753;
        this.field775 = arg0.field775;
        this.field762 = arg0.field762;
        this.field797 = arg0.field797;
        this.field765 = arg0.field765;
        this.field788 = arg0.field788;
        this.field757 = arg0.field757;
        this.field787 = arg0.field787;
        this.field769 = arg0.field769;
        this.field780 = arg0.field780;
        this.field793 = arg0.field793;
        this.field778 = arg0.field778;
        this.field752 = arg0.field752;
        this.field783 = arg0.field783;
        this.field756 = arg0.field756;
        this.field754 = arg0.field754;
        this.field776 = arg0.field776;
        this.field786 = arg0.field786;
        this.field763 = arg0.field763;
        this.field777 = arg0.field777;
        this.field771 = arg0.field771;
        this.field772 = arg0.field772;
    }
}
