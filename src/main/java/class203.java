import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class203 extends class147 {

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "[I")
    private int[] field3659 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "I")
    public int field3663 = -1;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "Z")
    public boolean field3655 = false;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "Z")
    public static boolean field3661 = true;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "Ldf;")
    public static class231 field3656 = new class231(4096);

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!tj", name = "db", descriptor = "Lqj;")
    public static class196 field3669 = class80.method502("headicons_prayer", -48);

    @OriginalMember(owner = "client!tj", name = "cb", descriptor = "[I")
    public static int[] field3668 = new int[200];

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!tj", name = "eb", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "Lh;")
    public static class139 field3666;

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "[I")
    private int[] field3665;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "[S")
    private short[] field3646;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "[S")
    private short[] field3649;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "[S")
    private short[] field3658;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "[S")
    private short[] field3662;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "[[B")
    public static byte[][] field3645;

    @OriginalMember(owner = "client!tj", name = "bb", descriptor = "[[[I")
    public static int[][][] field3667;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lp;IB)V")
    private final void method1376(class56 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3663 = arg0.method367(1);
        } else if (arg1 == 2) {
            int var8 = arg0.method367(1);
            this.field3665 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3665[var9] = arg0.method318(true);
            }
        } else if (arg1 == 3) {
            this.field3655 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method367(1);
            this.field3662 = new short[var6];
            this.field3649 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3662[var7] = (short) arg0.method318(true);
                this.field3649[var7] = (short) arg0.method318(true);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method367(1);
            this.field3646 = new short[var4];
            this.field3658 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3646[var5] = (short) arg0.method318(true);
                this.field3658[var5] = (short) arg0.method318(true);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3659[arg1 - 60] = arg0.method318(true);
        }
        if (arg2 <= 73) {
            method1381(34, null, 53, 13);
        }
        field3657++;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
    public static void method1377(int arg0) {
        int var1 = 15 % ((26 - arg0) / 36);
        field3669 = null;
        field3656 = null;
        field3668 = null;
        field3666 = null;
        field3645 = null;
        field3667 = null;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)Lfk;")
    public final class208 method1378(int arg0) {
        field3652++;
        class208[] var2 = new class208[5];
        int var3 = 0;
        int var4 = 0;
        if (arg0 >= -84) {
            this.method1376(null, -85, (byte) -32);
        }
        while (var4 < 5) {
            if (this.field3659[var4] != -1) {
                var2[var3++] = class208.method1436(class146.field2302, this.field3659[var4], 0);
            }
            var4++;
        }
        class208 var5 = new class208(var2, var3);
        if (this.field3662 != null) {
            for (int var6 = 0; var6 < this.field3662.length; var6++) {
                var5.method1414(this.field3662[var6], this.field3649[var6]);
            }
        }
        if (this.field3646 != null) {
            for (int var7 = 0; var7 < this.field3646.length; var7++) {
                var5.method1413(this.field3646[var7], this.field3658[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lp;I)V")
    public final void method1379(class56 arg0, int arg1) {
        field3651++;
        while (true) {
            int var3 = arg0.method367(1);
            if (var3 == 0) {
                if (arg1 == 2001) {
                    return;
                } else {
                    this.field3662 = null;
                    return;
                }
            }
            this.method1376(arg0, var3, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)Z")
    public final boolean method1380(int arg0) {
        field3647++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3659[var3] != -1 && !class146.field2302.method846(this.field3659[var3], 0, 0)) {
                var2 = false;
            }
        }
        if (arg0 == 23373) {
            return var2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[Lma;II)V")
    public static final void method1381(int arg0, class146[] arg1, int arg2, int arg3) {
        field3654++;
        if (arg3 < arg0) {
            int var4 = arg3 - 1;
            int var5 = arg0 + 1;
            int var6 = (arg0 + arg3) / 2;
            class146 var7 = arg1[var6];
            arg1[var6] = arg1[arg3];
            arg1[arg3] = var7;
            while (var5 > var4) {
                boolean var8 = true;
                do {
                    var5--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class42.field487[var9] == 2) {
                            var11 = arg1[var5].field2306;
                            var10 = var7.field2306;
                        } else if (class42.field487[var9] == 1) {
                            var10 = var7.field2313;
                            var11 = arg1[var5].field2313;
                            if (var10 == -1 && class71.field1001[var9] == 1) {
                                var10 = 2001;
                            }
                            if (var11 == -1 && class71.field1001[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class42.field487[var9] == 3) {
                            var10 = var7.field2299 ? 1 : 0;
                            var11 = arg1[var5].field2299 ? 1 : 0;
                        } else {
                            var10 = var7.field2312;
                            var11 = arg1[var5].field2312;
                        }
                        if (var10 != var11) {
                            if ((class71.field1001[var9] != 1 || var10 >= var11) && (class71.field1001[var9] != 0 || var11 >= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class42.field487[var13] == 2) {
                            var14 = arg1[var4].field2306;
                            var15 = var7.field2306;
                        } else if (class42.field487[var13] == 1) {
                            var14 = arg1[var4].field2313;
                            var15 = var7.field2313;
                            if (var14 == -1 && class71.field1001[var13] == 1) {
                                var14 = 2001;
                            }
                            if (var15 == -1 && class71.field1001[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class42.field487[var13] == 3) {
                            var15 = var7.field2299 ? 1 : 0;
                            var14 = arg1[var4].field2299 ? 1 : 0;
                        } else {
                            var15 = var7.field2312;
                            var14 = arg1[var4].field2312;
                        }
                        if (var14 != var15) {
                            if ((class71.field1001[var13] != 1 || var15 <= var14) && (class71.field1001[var13] != 0 || var14 <= var15)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var4 < var5) {
                    class146 var16 = arg1[var4];
                    arg1[var4] = arg1[var5];
                    arg1[var5] = var16;
                }
            }
            method1381(var5, arg1, -2, arg3);
            method1381(arg0, arg1, -2, var5 + 1);
        }
        if (arg2 != -2) {
            method1377(-75);
        }
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)Lfk;")
    public final class208 method1382(int arg0) {
        field3648++;
        if (this.field3665 == null) {
            return null;
        }
        class208[] var2 = new class208[this.field3665.length];
        if (arg0 != -2) {
            method1381(-47, null, 20, 104);
        }
        for (int var3 = 0; var3 < this.field3665.length; var3++) {
            var2[var3] = class208.method1436(class146.field2302, this.field3665[var3], 0);
        }
        class208 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class208(var2, var2.length);
        }
        if (this.field3662 != null) {
            for (int var5 = 0; var5 < this.field3662.length; var5++) {
                var4.method1414(this.field3662[var5], this.field3649[var5]);
            }
        }
        if (this.field3646 != null) {
            for (int var6 = 0; var6 < this.field3646.length; var6++) {
                var4.method1413(this.field3646[var6], this.field3658[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)Z")
    public final boolean method1383(int arg0) {
        field3660++;
        if (this.field3665 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3665.length; var3++) {
            if (!class146.field2302.method846(this.field3665[var3], 0, 0)) {
                var2 = false;
            }
        }
        return var2;
    }
}
