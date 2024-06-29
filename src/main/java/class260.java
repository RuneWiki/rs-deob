import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class260 {

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    private int field3980 = -1;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    private int field3989 = 0;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lfk;")
    private class317 field3984 = new class317();

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Z")
    public boolean field3995 = false;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    private int field3983;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[[I")
    private int[][] field3987;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "[Li;")
    private class15[] field3990;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
    public static int[] field3985 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[I")
    public static int[] field3982 = new int[25];

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "J")
    public static long field3993 = 0L;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method1907(int arg0, boolean arg1) {
        if (!arg1) {
            field3994++;
            class43.field699.method649((byte) 75, arg0);
            class343.field5453.method649((byte) 75, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)[Lqi;", line = 17)
    public static final class246[] method1908(byte arg0) {
        field3981++;
        class246[] var1 = new class246[class9.field132];
        if (arg0 >= -56) {
            return (class246[]) null;
        }
        for (int var2 = 0; var2 < class9.field132; var2++) {
            if (class240.field3737) {
                var1[var2] = new class289(class280.field4332, class49.field776, class150.field2449[var2], class89.field1262[var2], class358.field5694[var2], class62.field957[var2], class172.field2732[var2], class38.field582);
            } else {
                var1[var2] = new class77(class280.field4332, class49.field776, class150.field2449[var2], class89.field1262[var2], class358.field5694[var2], class62.field957[var2], class172.field2732[var2], class38.field582);
            }
        }
        class29.method330(-1);
        return var1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)[[I", line = 45)
    public final int[][] method1909(byte arg0) {
        field3977++;
        if (this.field3991 != this.field3983) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 <= 83) {
            return (int[][]) ((int[][]) null);
        } else {
            for (int var2 = 0; var2 < this.field3983; var2++) {
                this.field3990[var2] = class337.field5169;
            }
            return this.field3987;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V", line = 70)
    public static final void method1910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3992++;
        if (arg2 != 4685) {
            return;
        }
        if (arg3 == arg7 && arg4 == arg5 && arg1 == arg9 && arg6 == arg8) {
            class268.method1967(arg1, -89, arg3, arg6, arg4, arg0);
            return;
        }
        int var10 = arg4;
        int var11 = arg3;
        int var12 = arg3 * 3;
        int var13 = arg5 * 3;
        int var14 = arg4 * 3;
        int var15 = arg7 * 3;
        int var16 = arg9 * 3;
        int var17 = arg8 * 3;
        int var18 = arg1 + var15 - (var16 + arg3);
        int var19 = var13 + arg6 - var17 - arg4;
        int var20 = var15 - var12;
        int var21 = var16 + var12 - var15 - var15;
        int var22 = var14 + var17 - (var13 - -var13);
        int var23 = var13 - var14;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var21 * var25;
            int var30 = var20 * var24;
            int var31 = var22 * var25;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var30 >> 12) + arg3;
            int var34 = (var28 + var31 + var32 >> 12) + arg4;
            class268.method1967(var33, -98, var11, var34, var10, arg0);
            var10 = var34;
            var11 = var33;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(III)V", line = 340)
    public class260(int arg0, int arg1, int arg2) {
        this.field3983 = arg0;
        this.field3991 = arg1;
        this.field3987 = new int[this.field3983][arg2];
        this.field3990 = new class15[this.field3991];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BS)Z", line = 151)
    public static final boolean method1911(byte arg0, short arg1) {
        field3979++;
        if (arg1 == 21 || arg1 == 47 || arg1 == 12 || arg1 == 15 || arg1 == 51 || arg1 == 16 || arg1 == 26 || arg1 == 19) {
            return true;
        } else if (arg1 == 2 || arg1 == 57 || arg1 == 1009 || arg1 == 1007) {
            return true;
        } else if (arg1 == 43 || arg1 == 3 || arg1 == 24 || arg1 == 9 || arg1 == 7) {
            return true;
        } else if (arg1 == 40 || arg1 == 20 || arg1 == 11 || arg1 == 42 || arg1 == 36 || arg1 == 58) {
            return true;
        } else {
            if (arg0 != 11) {
                field3985 = (int[]) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 179)
    public static final void method1912(int arg0) {
        class356.field5663.method656(0);
        field3988++;
        class327.field5023.method656(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 189)
    public static void method1913(int arg0) {
        int var1 = -75 % ((48 - arg0) / 52);
        field3982 = null;
        field3985 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I", line = 205)
    public final int[] method1914(int arg0, int arg1) {
        field3976++;
        int var3 = 61 % ((arg1) / 53);
        if (this.field3991 == this.field3983) {
            this.field3995 = this.field3990[arg0] == null;
            this.field3990[arg0] = class337.field5169;
            return this.field3987[arg0];
        } else if (this.field3983 == 1) {
            this.field3995 = this.field3980 != arg0;
            this.field3980 = arg0;
            return this.field3987[0];
        } else {
            class15 var4 = this.field3990[arg0];
            if (var4 == null) {
                this.field3995 = true;
                if (this.field3989 >= this.field3983) {
                    class15 var5 = (class15) this.field3984.method2238((byte) 107);
                    var4 = new class15(arg0, var5.field241);
                    this.field3990[var5.field243] = null;
                    var5.method1357(947647010);
                } else {
                    var4 = new class15(arg0, this.field3989);
                    this.field3989++;
                }
                this.field3990[arg0] = var4;
            } else {
                this.field3995 = false;
            }
            this.field3984.method2237(true, var4);
            return this.field3987[var4.field241];
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZFIB)[I", line = 270)
    public static final int[] method1915(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5, int arg6, byte arg7) {
        field3978++;
        class49 var8 = new class49();
        var8.field756 = arg2;
        var8.field761 = (int) (arg5 * 4096.0F);
        var8.field767 = arg4;
        int[] var9 = new int[arg1];
        var8.field772 = arg6;
        var8.field758 = arg0;
        var8.field764 = arg3;
        var8.method476(0);
        if (arg7 < 118) {
            method1915(-47, 124, -117, -75, true, -0.17752065F, -120, (byte) -121);
        }
        class295.method2129(1, arg1, (byte) -125);
        var8.method474(0, -128, var9);
        return var9;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)V", line = 306)
    public final void method1916(byte arg0) {
        field3986++;
        int var2 = -10 / ((58 - arg0) / 60);
        for (int var3 = 0; var3 < this.field3983; var3++) {
            this.field3987[var3] = null;
        }
        this.field3987 = (int[][]) null;
        this.field3990 = null;
        this.field3984.method2233(-103);
        this.field3984 = null;
    }
}
