import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class703 {

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field9871;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "Lue;")
    private class213 field9883;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field9882;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "Lhca;")
    private class457 field9880;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "Lft;")
    private class4 field9884;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "[I")
    public static int[] field9872 = new int[4];

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "Loda;")
    public static class103 field9876 = new class103();

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "Lqfa;")
    public static class85 field9888 = new class85(69, 4);

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "[Lrc;")
    public static class501[] field9890 = new class501[14];

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "F")
    public static float field9875;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "Lqh;")
    private class61 field9885;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "Lf;")
    public static class702 field9887;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "[Luaa;")
    private class102[] field9886;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILog;)V")
    public static final void method3923(int arg0, class602 arg1) {
        int var2 = 57 % ((arg0 - 6) / 49);
        field9881++;
        class509 var3 = (class509) class518.field7304.method2596((long) arg1.field8728, 127);
        if (var3 == null) {
            class461.method2759(arg1.field9814, (byte) -44, arg1, arg1.field8787[0], 0, null, null, arg1.field8785[0]);
        } else {
            var3.method3015(103);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZLfj;ILfj;B)Luaa;")
    private final class102 method3924(boolean arg0, class610 arg1, int arg2, class610 arg3, byte arg4) {
        field9869++;
        if (this.field9885 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || arg2 >= this.field9886.length) {
            throw new RuntimeException();
        } else if (this.field9886[arg2] == null) {
            this.field9885.field1393 = arg2 * 72 + 6;
            int var6 = this.field9885.method730(-79);
            if (arg4 < 15) {
                field9876 = null;
            }
            int var7 = this.field9885.method730(-126);
            byte[] var8 = new byte[64];
            this.field9885.method704(0, 64, var8, 0);
            class102 var9 = new class102(arg2, arg3, arg1, this.field9883, this.field9880, var6, var8, var7, arg0);
            this.field9886[arg2] = var9;
            return var9;
        } else {
            return this.field9886[arg2];
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
    public static final void method3925(int arg0) {
        if (arg0 <= 78) {
            field9887 = null;
        }
        field9868++;
        class19 var1 = class373.method2355(96, 0, 15);
        var1.method438(806);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9873++;
        int var8 = class107.method968(client.field4115, 113, class309.field4556, arg6);
        int var9 = class107.method968(client.field4115, 110, class309.field4556, arg1);
        int var10 = class107.method968(class379.field5612, 110, class704.field9911, arg0);
        int var11 = class107.method968(class379.field5612, 116, class704.field9911, arg5);
        int var12 = class107.method968(client.field4115, 124, class309.field4556, arg4 + arg6);
        int var13 = class107.method968(client.field4115, 123, class309.field4556, arg1 - arg4);
        for (int var14 = var8; var14 < var12; var14++) {
            class705.method3938(var11, arg7, arg2 + 36816, var10, class582.field8429[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class705.method3938(var11, arg7, 30336, var10, class582.field8429[var15]);
        }
        int var16 = class107.method968(class379.field5612, arg2 ^ 0xFFFFE6DC, class704.field9911, arg0 + arg4);
        int var17 = class107.method968(class379.field5612, 122, class704.field9911, arg5 - arg4);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class582.field8429[var18];
            class705.method3938(var16, arg7, arg2 + 36816, var10, var19);
            class705.method3938(var17, arg3, 30336, var16, var19);
            class705.method3938(var11, arg7, 30336, var17, var19);
        }
        if (arg2 != -6480) {
            field9887 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILmq;I)V")
    public static final void method3927(int arg0, class472 arg1, int arg2) {
        field9878++;
        if (arg0 != -30924) {
            return;
        }
        if (class192.field3032) {
            class192.field3032 = false;
            arg2 = 0;
        }
        if (class433.field6274 != null && class433.field6274.method2833(false, arg1)) {
            return;
        }
        class433.field6274 = arg1;
        class59.field1336 = class525.method3074((byte) -101);
        class157.field2688 = arg2;
        class95.field1707 = arg2;
        if (class95.field1707 != 0) {
            class4.field458 = class161.field2718;
            class637.field9184 = class691.field9759;
            class645.field9297 = class507.field7189;
            class616.field8945 = class310.field4625;
            class144.field2514 = class592.field8515;
            class36.field1035 = class234.field3494;
            class634.field9111 = class680.field9648;
            class374.field5578 = class42.field1084;
            class436.field6301 = class433.field6271;
            class426.field6144 = class527.field7431;
            return;
        }
        class574.method3297(7477);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILfj;ZLfj;)Luaa;")
    public final class102 method3928(int arg0, class610 arg1, boolean arg2, class610 arg3) {
        field9867++;
        return arg2 ? this.method3924(true, arg3, arg0, arg1, (byte) 25) : null;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
    public static void method3929(int arg0) {
        field9872 = null;
        field9890 = null;
        field9876 = null;
        field9888 = null;
        if (arg0 != 5) {
            method3929(-102);
        }
        field9887 = null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Z")
    public static final boolean method3930(int arg0, int arg1) {
        field9874++;
        if (arg1 != -1) {
            field9872 = null;
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)Z")
    public final boolean method3931(byte arg0) {
        field9870++;
        if (this.field9885 != null) {
            return true;
        }
        if (this.field9884 == null) {
            if (this.field9883.method1484(-122)) {
                return false;
            }
            this.field9884 = this.field9883.method1479((byte) 0, (byte) -16, 255, true, 255);
        }
        if (this.field9884.field9179) {
            return false;
        }
        class61 var2 = new class61(this.field9884.method235((byte) -114));
        var2.field1393 = 5;
        int var3 = var2.method732(-559537960);
        var2.field1393 += var3 * 72;
        byte[] var4 = new byte[var2.field1397.length - var2.field1393];
        var2.method704(0, var4.length, var4, 0);
        byte[] var7;
        if (this.field9882 == null || this.field9871 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field9882, this.field9871);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class654.method3726(var2.field1397, 64, 5, var2.field1393 - var4.length - 5);
        int var9 = 0;
        int var10 = -76 % ((-arg0 - 14) / 62);
        while (var9 < 64) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
            var9++;
        }
        this.field9886 = new class102[var3];
        this.field9885 = var2;
        return true;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method3932(String arg0, int arg1, String arg2, int arg3) {
        field9879++;
        int var4 = arg2.length();
        if (arg3 != 10565) {
            field9890 = null;
        }
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class141.method1147(4, var22);
            var9 = class141.method1147(4, var24);
            char var26 = class485.method2926(-221, arg1, var22);
            char var27 = class485.method2926(-221, arg1, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class320.method2058(-20651, var28, arg1) - class320.method2058(arg3 - 31216, var29, arg1);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class320.method2058(arg3 ^ 0xFFFF8610, var20, arg1) - class320.method2058(arg3 ^ 0xFFFF8610, var21, arg1);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class320.method2058(-20651, var14, arg1) - class320.method2058(-20651, var15, arg1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)V")
    public final void method3933(int arg0) {
        field9877++;
        if (this.field9886 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field9886.length; var2++) {
            if (this.field9886[var2] != null) {
                this.field9886[var2].method947((byte) -106);
            }
        }
        for (int var3 = 0; var3 < this.field9886.length; var3++) {
            if (this.field9886[var3] != null) {
                this.field9886[var3].method942(-123);
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lue;Lhca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class703(class213 arg0, class457 arg1, BigInteger arg2, BigInteger arg3) {
        this.field9871 = arg3;
        this.field9883 = arg0;
        this.field9882 = arg2;
        this.field9880 = arg1;
        if (!this.field9883.method1484(106)) {
            this.field9884 = this.field9883.method1479((byte) 0, (byte) -16, 255, true, 255);
        }
    }
}
