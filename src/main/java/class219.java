import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class219 {

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    private int field3737 = 0;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    private int field3732 = -1;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "Lmc;")
    private class170 field3748 = new class170();

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "Z")
    public boolean field3749 = false;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[[I")
    private int[][] field3729;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[Lsi;")
    private class300[] field3739;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "[Z")
    public static boolean[] field3743 = new boolean[100];

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Lwa;")
    public static class75 field3746 = class66.method560("not yet implemented", false);

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Lwa;")
    private static class75 field3745 = class66.method560(" more options", false);

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "[Lbj;")
    public static class51[] field3747 = new class51[4];

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Lwa;")
    public static class75 field3741 = field3745;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Lwa;")
    public static class75 field3738 = class66.method560("runes", false);

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3735 = 50;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Lwa;")
    public static class75 field3750 = class66.method560("cookiehost", false);

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Lwa;")
    public static class75 field3751 = class66.method560(")3", false);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIZI)Lbh;", line = 16)
    public static final class258 method1598(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3733++;
        if (arg0 < 14) {
            field3747 = (class51[]) null;
        }
        int var6 = (arg3 << 19) + (arg4 ? 65536 : 0) + arg2 + (arg5 << 17);
        long var8 = (long) var6 * 3849834839L + (long) arg1 * 3147483667L;
        class258 var10 = (class258) class12.field157.method1193(var8, -97);
        if (var10 != null) {
            return var10;
        }
        class21.field292 = false;
        class258 var11 = class212.method1563(false, true, arg1, arg5, arg4, arg3, false, arg2);
        if (var11 != null && !class21.field292) {
            class12.field157.method1194(var11, var8, false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 47)
    public final void method1599(int arg0) {
        for (int var2 = 0; var2 < this.field3740; var2++) {
            this.field3729[var2] = null;
        }
        field3742++;
        this.field3729 = (int[][]) null;
        this.field3739 = null;
        this.field3748.method1261(2);
        int var3 = -90 / ((arg0 - 52) / 45);
        this.field3748 = null;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(III)V", line = 340)
    public class219(int arg0, int arg1, int arg2) {
        this.field3740 = arg0;
        this.field3734 = arg1;
        this.field3729 = new int[this.field3740][arg2];
        this.field3739 = new class300[this.field3734];
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBIIIIIIIII)V", line = 81)
    public static final void method1600(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3744++;
        boolean var11;
        if (class137.field2342 > 0 && (class137.field2342 % 10) < 5) {
            var11 = true;
        } else {
            var11 = false;
        }
        if (arg1 != 82) {
            return;
        }
        int var12 = arg2 - arg7;
        int var13 = arg8 - arg4;
        int var14 = 983040 / arg10;
        int var15 = 983040 / arg5;
        for (int var16 = -var15; var16 < var13 + var15; var16++) {
            int var17 = arg0 + ((var16 + 1) * arg5) >> 16;
            int var18 = arg0 + (arg5 * var16) >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                int var10000 = arg6 + var17;
                int var21 = arg6 + var18;
                int var22 = arg4 + var16 >> 6;
                if (var22 >= 0 && class281.field4851.length - 1 >= var22) {
                    int[][] var23 = class281.field4851[var22];
                    for (int var24 = -var14; var24 < var12 + var14; var24++) {
                        int var25 = arg10 * var24 + arg9 >> 16;
                        int var26 = (var24 + 1) * arg10 + arg9 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            var10000 = arg3 + var26;
                            int var29 = arg3 + var25;
                            int var30 = arg7 + var24 >> 6;
                            if (var30 >= 0 && var30 <= (var23.length - 1) && var23[var30] != null) {
                                int var31 = ((arg7 + var24 & 0x3F) << 6) + (arg4 + var16 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class108 var33 = class3.method14((byte) 83, var32 - 1);
                                    if (var11 && class25.field325 == var33.field1855) {
                                        class153 var34 = new class153();
                                        var34.field2628 = var33.field1855;
                                        var34.field2629 = var21;
                                        var34.field2624 = var29;
                                        class67.field1173.method1251(var34, -123);
                                    }
                                    class177.field2979[var33.field1855].method157(var21 - 7, var29 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class153 var35 = (class153) class67.field1173.method1250(true); var35 != null; var35 = (class153) class67.field1173.method1256((byte) -125)) {
            class177.field2979[var35.field2628].method157(var35.field2629 - 7, var35.field2624 + -7);
            class44.method299(var35.field2629, var35.field2624, 15, 16776960, 128);
            class44.method299(var35.field2629, var35.field2624, 7, 16777215, 256);
        }
        class67.field1173.method1261(2);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 197)
    public static void method1601(byte arg0) {
        field3738 = null;
        field3751 = null;
        field3750 = null;
        field3746 = null;
        int var1 = -5 / ((arg0 + 24) / 34);
        field3741 = null;
        field3743 = null;
        field3745 = null;
        field3747 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)[[I", line = 213)
    public final int[][] method1602(byte arg0) {
        field3730++;
        if (this.field3740 != this.field3734) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = -96 % ((arg0 - 62) / 38);
        while (this.field3740 > var2) {
            this.field3739[var2] = class290.field4973;
            var2++;
        }
        return this.field3729;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[I", line = 245)
    public final int[] method1603(int arg0, byte arg1) {
        field3731++;
        if (arg1 <= 106) {
            field3751 = (class75) null;
        }
        if (this.field3740 == this.field3734) {
            this.field3749 = this.field3739[arg0] == null;
            this.field3739[arg0] = class290.field4973;
            return this.field3729[arg0];
        } else if (this.field3740 == 1) {
            this.field3749 = this.field3732 != arg0;
            this.field3732 = arg0;
            return this.field3729[0];
        } else {
            class300 var3 = this.field3739[arg0];
            if (var3 == null) {
                this.field3749 = true;
                if (this.field3737 >= this.field3740) {
                    class300 var4 = (class300) this.field3748.method1254(16);
                    var3 = new class300(arg0, var4.field5134);
                    this.field3739[var4.field5138] = null;
                    var4.method1527(63);
                } else {
                    var3 = new class300(arg0, this.field3737);
                    this.field3737++;
                }
                this.field3739[arg0] = var3;
            } else {
                this.field3749 = false;
            }
            this.field3748.method1260(var3, false);
            return this.field3729[var3.field5134];
        }
    }
}
