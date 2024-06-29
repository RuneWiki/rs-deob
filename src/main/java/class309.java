import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class309 {

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    private int field4066;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    private int field4059;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "[[I")
    private int[][] field4057;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4061 = -1;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Lvj;")
    public static class304 field4062 = new class304("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "Lff;")
    public static class9 field4068 = new class9(70, 8);

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field4069 = 0;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4070 = new String[100];

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)I")
    public final int method1791(int arg0, int arg1) {
        field4063++;
        int var3 = 116 / ((arg0 - 78) / 34);
        if (this.field4057 != null) {
            arg1 = (int) ((long) this.field4059 * (long) arg1 / (long) this.field4066);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public static void method1792(boolean arg0) {
        if (arg0) {
            method1794(-84, true);
        }
        field4062 = null;
        field4070 = null;
        field4068 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIBI)Lit;")
    public static final class455 method1793(int arg0, int arg1, byte arg2, int arg3) {
        field4067++;
        class409 var4 = class497.field6886[arg0][arg1][arg3];
        if (var4 == null) {
            return null;
        }
        int var5 = 12 % ((34 - arg2) / 41);
        class455 var6 = null;
        int var7 = -1;
        for (class165 var8 = var4.field5630; var8 != null; var8 = var8.field2400) {
            class37 var9 = var8.field2402;
            if (var9 instanceof class455) {
                class455 var10 = (class455) var9;
                int var11 = var10.method2590(0) * 64 - 4;
                int var12 = var10.field584 - var11 >> 7;
                int var13 = var10.field574 - var11 >> 7;
                int var14 = var10.field584 + var11 >> 7;
                int var15 = var10.field574 + var11 >> 7;
                if (var12 <= arg1 && arg3 >= var13 && var14 >= arg1 && var15 >= arg3) {
                    int var16 = (var15 + 1 - arg3) * (var14 + 1 - arg1);
                    if (var7 < var16) {
                        var6 = var10;
                        var7 = var16;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1794(int arg0, boolean arg1) {
        field4065++;
        class457.field6301 = arg1;
        class47.field710 = arg0 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)I")
    public final int method1795(int arg0, int arg1) {
        if (this.field4057 != null) {
            arg1 = (int) ((long) this.field4059 * (long) arg1 / (long) this.field4066) + 6;
        }
        if (arg0 != 6) {
            this.method1796((byte) 81, null);
        }
        field4064++;
        return arg1;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1796(byte arg0, byte[] arg1) {
        field4060++;
        if (this.field4057 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4059 / (long) this.field4066) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4057[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4059 + var6;
                int var14 = var13 / this.field4066;
                var5 += var14;
                var6 = var13 - this.field4066 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        int var15 = 55 % ((37 - arg0) / 45);
        return arg1;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(II)V")
    public class309(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class258.method1559(arg1, arg0, (byte) -82);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field4066 = var5;
            this.field4059 = var4;
            this.field4057 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4057[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
