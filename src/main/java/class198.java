import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class198 extends class62 {

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "[[B")
    public byte[][] field3731 = new byte[256][];

    @OriginalMember(owner = "client!vh", name = "nb", descriptor = "I")
    public int field3754 = 0;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "[I")
    private int[] field3723;

    @OriginalMember(owner = "client!vh", name = "ib", descriptor = "[I")
    private int[] field3749;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "[I")
    private int[] field3738;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "[I")
    private int[] field3729;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    private int field3728;

    @OriginalMember(owner = "client!vh", name = "fb", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    private static int field3725 = -1;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    private static int field3734 = 0;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "Lai;")
    private static class10 field3736 = class44.method278("u=", 125);

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
    private static int field3740 = -1;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "Lai;")
    private static class10 field3735 = class44.method278("img=", -82);

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    private static int field3737 = 0;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "Lai;")
    private static class10 field3727 = class44.method278("col=", 109);

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "Lai;")
    private static class10 field3741 = class44.method278("u", 94);

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "Lai;")
    private static class10 field3726 = class44.method278("br", 121);

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    private static int field3724 = 0;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "Lai;")
    private static class10 field3733 = class44.method278("str=", -18);

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "Lai;")
    private static class10 field3744 = class44.method278(")4u", 109);

    @OriginalMember(owner = "client!vh", name = "hb", descriptor = "Lai;")
    private static class10 field3748 = class44.method278(")4str", 117);

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
    private static int field3739 = 256;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "Lai;")
    private static class10 field3721 = class44.method278("shad", -72);

    @OriginalMember(owner = "client!vh", name = "jb", descriptor = "Lai;")
    private static class10 field3750 = class44.method278("gt", 97);

    @OriginalMember(owner = "client!vh", name = "lb", descriptor = "Lai;")
    private static class10 field3752 = class44.method278(")4shad", -102);

    @OriginalMember(owner = "client!vh", name = "mb", descriptor = "I")
    private static int field3753 = 0;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "Lai;")
    private static class10 field3742 = class44.method278(")4col", -13);

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "[Lai;")
    private static class10[] field3745 = new class10[100];

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    private static int field3730 = -1;

    @OriginalMember(owner = "client!vh", name = "kb", descriptor = "I")
    private static int field3751 = -1;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "Lai;")
    private static class10 field3732 = class44.method278("shad=", 105);

    @OriginalMember(owner = "client!vh", name = "pb", descriptor = "Lai;")
    private static class10 field3756 = class44.method278("str", 98);

    @OriginalMember(owner = "client!vh", name = "ob", descriptor = "Lai;")
    private static class10 field3755 = class44.method278("lt", 93);

    @OriginalMember(owner = "client!vh", name = "qb", descriptor = "I")
    private static int field3757 = 256;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "[B")
    private byte[] field3722;

    @OriginalMember(owner = "client!vh", name = "gb", descriptor = "[I")
    private int[] field3747;

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "[Lta;")
    public static class173[] field3743;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;IIIILjava/util/Random;I)I")
    public final int method1257(class10 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method1271(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field118];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field118; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method1280(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method1258(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;I)I")
    public final int method1259(class10 arg0, int arg1) {
        return this.method1260(arg0, new int[] { arg1 }, field3745);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;[I[Lai;)I")
    private final int method1260(class10 arg0, int[] arg1, class10[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class10 var6 = class7.method24(true, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method40((byte) -49);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method61(var14, -1);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class10 var16 = arg0.method44(var14, var10 + 1, (byte) -57);
                    var10 = -1;
                    var6.method56(60, -1);
                    var6.method50((byte) 115, var16);
                    var6.method56(62, -1);
                    if (var16.method64(93, field3726)) {
                        arg2[var12++] = var6.method44(var6.method40((byte) -3), var5, (byte) -18);
                        var5 = var6.method40((byte) 123);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method64(-76, field3755)) {
                        var4 += this.method1267(60);
                        if (this.field3722 != null && var11 != -1) {
                            var4 += this.field3722[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method64(-99, field3750)) {
                        var4 += this.method1267(62);
                        if (this.field3722 != null && var11 != -1) {
                            var4 += this.field3722[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method36((byte) 69, field3735)) {
                        try {
                            int var17 = var16.method52((byte) -118, 4).method55((byte) -88);
                            var4 += field3743[var17].field3339;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method56(var15, -1);
                        var4 += this.method1267(var15);
                        if (this.field3722 != null && var11 != -1) {
                            var4 += this.field3722[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method40((byte) 87);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method44(var7 - var9, var5, (byte) 60);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method40((byte) 96);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method40((byte) 119) > var5) {
            arg2[var12++] = var6.method44(var6.method40((byte) -116), var5, (byte) 119);
        }
        return var12;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
    private final void method1261(int arg0, int arg1) {
        field3730 = -1;
        field3740 = -1;
        field3725 = arg1;
        field3751 = arg1;
        field3753 = arg0;
        field3737 = arg0;
        field3757 = 256;
        field3739 = 256;
        field3734 = 0;
        field3724 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(IIIIII)V")
    public abstract void method1150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;IIII)V")
    public final void method1262(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1261(arg3, arg4);
            this.method1272(arg0, arg1 - this.method1270(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "()V")
    public static void method1263() {
        field3755 = null;
        field3750 = null;
        field3735 = null;
        field3726 = null;
        field3727 = null;
        field3742 = null;
        field3736 = null;
        field3741 = null;
        field3744 = null;
        field3732 = null;
        field3721 = null;
        field3752 = null;
        field3733 = null;
        field3756 = null;
        field3748 = null;
        field3743 = null;
        field3745 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;)Lai;")
    public static final class10 method1264(class10 arg0) {
        int var1 = arg0.method40((byte) -11);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field160[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class10 var4 = new class10();
        var4.field118 = var1 + var2;
        var4.field160 = new byte[var4.field118];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field160[var6];
            if (var7 == 60) {
                var4.field160[var5++] = 60;
                var4.field160[var5++] = 108;
                var4.field160[var5++] = 116;
                var4.field160[var5++] = 62;
            } else if (var7 == 62) {
                var4.field160[var5++] = 60;
                var4.field160[var5++] = 103;
                var4.field160[var5++] = 116;
                var4.field160[var5++] = 62;
            } else {
                var4.field160[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lai;IIII)V")
    public final void method1265(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1261(arg3, arg4);
            this.method1272(arg0, arg1 - this.method1270(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(Lai;IIII)V")
    public final void method1266(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method1261(arg3, arg4);
            this.method1272(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)I")
    private final int method1267(int arg0) {
        return this.field3747[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([B)V")
    private final void method1268(byte[] arg0) {
        this.field3747 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3747.length; var2++) {
                this.field3747[var2] = arg0[var2] & 0xFF;
            }
            this.field3754 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3747[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field3722 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field3722[(var13 << 8) + var14] = (byte) method1279(var9, var11, var6, this.field3747, var5, var13, var14);
                    }
                }
            }
        }
        this.field3754 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lai;)V")
    private final void method1269(class10 arg0) {
        try {
            if (arg0.method36((byte) 69, field3727)) {
                field3737 = arg0.method52((byte) -118, 4).method66(55, 16);
                return;
            }
            if (arg0.method64(-62, field3742)) {
                field3737 = field3753;
                return;
            }
            if (arg0.method36((byte) 69, field3733)) {
                field3730 = arg0.method52((byte) -118, 4).method66(55, 16);
                return;
            }
            if (arg0.method64(-83, field3756)) {
                field3730 = 8388608;
                return;
            }
            if (arg0.method64(73, field3748)) {
                field3730 = -1;
                return;
            }
            if (arg0.method36((byte) 69, field3736)) {
                field3740 = arg0.method52((byte) -118, 2).method66(55, 16);
                return;
            }
            if (arg0.method64(-84, field3741)) {
                field3740 = 0;
                return;
            }
            if (arg0.method64(-128, field3744)) {
                field3740 = -1;
                return;
            }
            if (arg0.method36((byte) 69, field3732)) {
                field3751 = arg0.method52((byte) -118, 5).method66(55, 16);
                return;
            }
            if (arg0.method64(-78, field3721)) {
                field3751 = 0;
                return;
            }
            if (arg0.method64(69, field3752)) {
                field3751 = field3725;
                return;
            }
            if (arg0.method64(-86, field3726)) {
                this.method1271(field3753, field3725, field3757);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(Lai;)I")
    public final int method1270(class10 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field118; var5++) {
            int var6 = arg0.field160[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class10 var7 = arg0.method44(var5, var2 + 1, (byte) 84);
                    var2 = -1;
                    if (var7.method64(98, field3755)) {
                        var6 = 60;
                    } else {
                        if (!var7.method64(102, field3750)) {
                            if (var7.method36((byte) 69, field3735)) {
                                try {
                                    int var8 = var7.method52((byte) -118, 4).method55((byte) -107);
                                    var4 += field3743[var8].field3339;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field3747[var6];
                    if (this.field3722 != null && var3 != -1) {
                        var4 += this.field3722[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    private final void method1271(int arg0, int arg1, int arg2) {
        field3730 = -1;
        field3740 = -1;
        field3725 = arg1;
        field3751 = arg1;
        field3753 = arg0;
        field3737 = arg0;
        field3757 = arg2;
        field3739 = arg2;
        field3734 = 0;
        field3724 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;II)V")
    private final void method1272(class10 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3754;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field118; var7++) {
            int var8 = arg0.field160[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class10 var9 = arg0.method44(var7, var5 + 1, (byte) -73);
                    var5 = -1;
                    if (var9.method64(89, field3755)) {
                        var8 = 60;
                    } else {
                        if (!var9.method64(107, field3750)) {
                            if (var9.method36((byte) 69, field3735)) {
                                try {
                                    int var10 = var9.method52((byte) -118, 4).method55((byte) -84);
                                    class173 var11 = field3743[var10];
                                    if (field3739 == 256) {
                                        var11.method1134(arg1, this.field3754 + var4 - var11.field3337);
                                    } else {
                                        var11.method1137(arg1, this.field3754 + var4 - var11.field3337, field3739);
                                    }
                                    arg1 += var11.field3339;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method1269(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field3722 != null && var6 != -1) {
                        arg1 += this.field3722[(var6 << 8) + var8];
                    }
                    int var12 = this.field3738[var8];
                    int var13 = this.field3729[var8];
                    if (var8 == 32) {
                        if (field3734 > 0) {
                            field3724 += field3734;
                            arg1 += field3724 >> 8;
                            field3724 &= 0xFF;
                        }
                    } else if (field3739 == 256) {
                        if (field3751 != -1) {
                            this.method1277(var8, this.field3723[var8] + arg1 + 1, this.field3749[var8] + var4 + 1, var12, var13, field3751);
                        }
                        this.method1150(var8, this.field3723[var8] + arg1, this.field3749[var8] + var4, var12, var13, field3737);
                    } else {
                        if (field3751 != -1) {
                            this.method1284(var8, this.field3723[var8] + arg1 + 1, this.field3749[var8] + var4 + 1, var12, var13, field3751, field3739);
                        }
                        this.method1151(var8, this.field3723[var8] + arg1, this.field3749[var8] + var4, var12, var13, field3737, field3739);
                    }
                    int var14 = this.field3747[var8];
                    if (field3730 != -1) {
                        class62.method415(arg1, (int) ((double) this.field3754 * 0.7D) + var4, var14, field3730);
                    }
                    if (field3740 != -1) {
                        class62.method415(arg1, this.field3754 + var4 + 1, var14, field3740);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;IIIIIIIIII)I")
    private final int method1273(class10 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method1271(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field3754;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field3746 + this.field3728 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method1260(arg0, var12, field3745);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field3728 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field3728 - this.field3746 - (var13 - 1) * arg10) / 2 + this.field3728 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field3746 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field3728 - this.field3746 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field3728 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method1272(field3745[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method1272(field3745[var16], arg1 + (arg3 - this.method1270(field3745[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method1272(field3745[var16], arg1 + arg3 - this.method1270(field3745[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method1272(field3745[var16], arg1, var14);
            } else {
                this.method1274(field3745[var16], arg3);
                this.method1272(field3745[var16], arg1, var14);
                field3734 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lai;I)V")
    private final void method1274(class10 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method40((byte) -94); var5++) {
            int var6 = arg0.method61(var5, -1);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field3734 = (arg1 - this.method1270(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;IIIIIIIII)I")
    public final int method1275(class10 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method1273(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(Lai;I)I")
    public final int method1276(class10 arg0, int arg1) {
        int var3 = this.method1260(arg0, new int[] { arg1 }, field3745);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method1270(field3745[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(IIIIII)V")
    private final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class62.field1050 * arg2 + arg1;
        int var8 = class62.field1050 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class62.field1049) {
            int var11 = class62.field1049 - arg2;
            arg4 -= var11;
            arg2 = class62.field1049;
            var10 += arg3 * var11;
            var7 += class62.field1050 * var11;
        }
        if (arg2 + arg4 > class62.field1048) {
            arg4 -= arg2 + arg4 - class62.field1048;
        }
        if (arg1 < class62.field1051) {
            int var12 = class62.field1051 - arg1;
            arg3 -= var12;
            arg1 = class62.field1051;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class62.field1047) {
            int var13 = arg1 + arg3 - class62.field1047;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1282(class62.field1052, this.field3731[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;IIIIII)V")
    public final void method1278(class10 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method1261(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field118];
        for (int var11 = 0; var11 < arg0.field118; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method1280(arg0, arg1 - this.method1270(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method1279(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;II[I[I)V")
    private final void method1280(class10 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3754;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field118; var10++) {
            int var11 = arg0.field160[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class10 var12 = arg0.method44(var10, var7 + 1, (byte) 67);
                    var7 = -1;
                    if (var12.method64(-90, field3755)) {
                        var11 = 60;
                    } else {
                        if (!var12.method64(-86, field3750)) {
                            if (var12.method36((byte) 69, field3735)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method52((byte) -118, 4).method55((byte) -71);
                                    class173 var16 = field3743[var15];
                                    if (field3739 == 256) {
                                        var16.method1134(arg1 + var13, this.field3754 + var6 - var16.field3337 + var14);
                                    } else {
                                        var16.method1137(arg1 + var13, this.field3754 + var6 - var16.field3337 + var14, field3739);
                                    }
                                    arg1 += var16.field3339;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method1269(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field3722 != null && var8 != -1) {
                        arg1 += this.field3722[(var8 << 8) + var11];
                    }
                    int var17 = this.field3738[var11];
                    int var18 = this.field3729[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field3734 > 0) {
                            field3724 += field3734;
                            arg1 += field3724 >> 8;
                            field3724 &= 0xFF;
                        }
                    } else if (field3739 == 256) {
                        if (field3751 != -1) {
                            this.method1277(var11, this.field3723[var11] + arg1 + var19 + 1, this.field3749[var11] + var6 + 1 + var20, var17, var18, field3751);
                        }
                        this.method1150(var11, this.field3723[var11] + arg1 + var19, this.field3749[var11] + var6 + var20, var17, var18, field3737);
                    } else {
                        if (field3751 != -1) {
                            this.method1284(var11, this.field3723[var11] + arg1 + var19 + 1, this.field3749[var11] + var6 + 1 + var20, var17, var18, field3751, field3739);
                        }
                        this.method1151(var11, this.field3723[var11] + arg1 + var19, this.field3749[var11] + var6 + var20, var17, var18, field3737, field3739);
                    }
                    int var21 = this.field3747[var11];
                    if (field3730 != -1) {
                        class62.method415(arg1, (int) ((double) this.field3754 * 0.7D) + var6, var21, field3730);
                    }
                    if (field3740 != -1) {
                        class62.method415(arg1, this.field3754 + var6, var21, field3740);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lai;IIIII)V")
    public final void method1281(class10 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1261(arg3, arg4);
        int[] var7 = new int[arg0.field118];
        int[] var8 = new int[arg0.field118];
        for (int var9 = 0; var9 < arg0.field118; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method1280(arg0, arg1 - this.method1270(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method1282(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class198(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3723 = arg1;
        this.field3749 = arg2;
        this.field3738 = arg3;
        this.field3729 = arg4;
        this.method1268(arg0);
        this.field3731 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3749[var10] < var8 && this.field3729[var10] != 0) {
                var8 = this.field3749[var10];
            }
            if (this.field3749[var10] + this.field3729[var10] > var9) {
                var9 = this.field3749[var10] + this.field3729[var10];
            }
        }
        this.field3728 = this.field3754 - var8;
        this.field3746 = var9 - this.field3754;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lai;IIIII)V")
    public final void method1283(class10 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method1261(arg3, arg4);
        int[] var7 = new int[arg0.field118];
        for (int var8 = 0; var8 < arg0.field118; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method1280(arg0, arg1 - this.method1270(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIIIIII)V")
    private final void method1284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class62.field1050 * arg2 + arg1;
        int var9 = class62.field1050 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class62.field1049) {
            int var12 = class62.field1049 - arg2;
            arg4 -= var12;
            arg2 = class62.field1049;
            var11 += arg3 * var12;
            var8 += class62.field1050 * var12;
        }
        if (arg2 + arg4 > class62.field1048) {
            arg4 -= arg2 + arg4 - class62.field1048;
        }
        if (arg1 < class62.field1051) {
            int var13 = class62.field1051 - arg1;
            arg3 -= var13;
            arg1 = class62.field1051;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class62.field1047) {
            int var14 = arg1 + arg3 - class62.field1047;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method1258(class62.field1052, this.field3731[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B)V")
    public class198(byte[] arg0) {
        this.method1268(arg0);
    }
}
