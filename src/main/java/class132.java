import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 extends class31 {

    @OriginalMember(owner = "client!t", name = "db", descriptor = "I")
    private int field3001 = 0;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "[I")
    public static int[] field2997 = new int[99];

    @OriginalMember(owner = "client!t", name = "ib", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!t", name = "jb", descriptor = "Lqd;")
    public static class115 field3007;

    @OriginalMember(owner = "client!t", name = "kb", descriptor = "Lid;")
    public static class60 field3008;

    @OriginalMember(owner = "client!t", name = "mb", descriptor = "Lid;")
    public static class60 field3010;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!t", name = "eb", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!t", name = "fb", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!t", name = "hb", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "[I")
    public static int[] field2995;

    @OriginalMember(owner = "client!t", name = "lb", descriptor = "[Z")
    public static boolean[] field3009;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V")
    private final void method1039(int arg0, byte arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        field3005++;
        double var7 = var3;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        double var11 = var3;
        double var13 = 0.0D;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var9 > var11) {
            var11 = var9;
        }
        double var15 = 0.0D;
        if (var3 > var5) {
            var7 = var5;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        double var17 = (var7 + var11) / 2.0D;
        this.field3003 = (int) (var17 * 256.0D);
        if (this.field3003 < 0) {
            this.field3003 = 0;
        } else if (this.field3003 > 255) {
            this.field3003 = 255;
        }
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
            if (var3 == var11) {
                var15 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var15 = (var9 - var3) / (-var7 + var11) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
        }
        this.field3002 = (int) (var13 * 256.0D);
        if (var17 > 0.5D) {
            this.field2990 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field2990 = (int) (var13 * var17 * 512.0D);
        }
        double var19 = var15 / 6.0D;
        if (arg1 >= -97) {
            return;
        }
        if (this.field3002 < 0) {
            this.field3002 = 0;
        } else if (this.field3002 > 255) {
            this.field3002 = 255;
        }
        if (this.field2990 < 1) {
            this.field2990 = 1;
        }
        this.field3004 = (int) ((double) this.field2990 * var19);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static void method1040(int arg0) {
        int var1 = -98 % ((-arg0 - 33) / 48);
        field3010 = null;
        field3007 = null;
        field2997 = null;
        field3009 = null;
        field3008 = null;
        field2995 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)Lfd;")
    public static final class40 method1041(boolean arg0, int arg1) {
        field2999++;
        if (!arg0) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class45.field1177[var2] == null || class45.field1177[var2][var3] == null) {
            boolean var4 = class28.method209(var2, -1);
            if (!var4) {
                return null;
            }
        }
        return class45.field1177[var2][var3];
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lof;II)V")
    public final void method1042(class103 arg0, int arg1, int arg2) {
        if (arg2 > -28) {
            return;
        }
        field2994++;
        while (true) {
            int var4 = arg0.method829((byte) -121);
            if (var4 == 0) {
                return;
            }
            this.method1048(-87, arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2989++;
        class23 var5 = (class23) class16.field404.method716((byte) 25, (long) arg1);
        if (var5 == null) {
            var5 = new class23();
            class16.field404.method712((long) arg1, var5, (byte) 102);
        }
        if (var5.field574.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field574.length; var8++) {
                var6[var8] = var5.field574[var8];
                var7[var8] = var5.field566[var8];
            }
            for (int var9 = var5.field574.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field566 = var7;
            var5.field574 = var6;
        }
        var5.field574[arg0] = arg2;
        var5.field566[arg0] = arg4;
        if (arg3 != -438) {
            method1043(-50, -90, 38, 79, -126);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[BZI)I")
    public static final int method1044(int arg0, byte[] arg1, boolean arg2, int arg3) {
        int var4 = -1;
        field2992++;
        if (!arg2) {
            field3006 = -101;
        }
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = class133.field3036[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lfd;B)Lfd;")
    public static final class40 method1045(class40 arg0, byte arg1) {
        class40 var2 = class90.method736((byte) -125, arg0);
        if (arg1 != -43) {
            method1040(-33);
        }
        field2996++;
        if (var2 == null) {
            var2 = arg0.field1020;
        }
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILie;IZ)Le;")
    public static final class29 method1046(int arg0, class61 arg1, int arg2, boolean arg3) {
        field2993++;
        if (class77.method628(arg2, arg0, arg1, -125)) {
            if (!arg3) {
                field3008 = null;
            }
            return class103.method828((byte) -7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public final void method1047(boolean arg0) {
        this.method1039(this.field3001, (byte) -113);
        if (!arg0) {
            field2991++;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILof;II)V")
    private final void method1048(int arg0, class103 arg1, int arg2, int arg3) {
        field2998++;
        if (arg2 == 1) {
            this.field3001 = arg1.method805(3);
        }
        if (arg0 >= -31) {
            this.field3001 = -17;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2997[var1] = var0 / 4;
        }
        field3006 = 0;
        field3007 = new class115(200);
        field3008 = class11.method72("Diese Welt ist voll)3", (byte) 103);
        field3010 = class11.method72("Benutzeroberfl-=che geladen)3", (byte) -27);
    }
}
