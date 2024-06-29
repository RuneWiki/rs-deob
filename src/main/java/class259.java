import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class259 {

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Ler;")
    private class157 field3616 = new class157(16);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lns;")
    private class438 field3612;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
    public static int[] field3609 = new int[1024];

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lgo;")
    public static class331 field3610 = new class331("stellardawn", 1);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "S")
    public static short field3620 = 1;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lpg;")
    public static class492 field3619 = new class492(35, 18);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 3)
    public final void method1674(byte arg0) {
        field3611++;
        class157 var2 = this.field3616;
        synchronized (this.field3616) {
            this.field3616.method1022((byte) -34);
            if (arg0 >= -15) {
                this.field3616 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 19)
    public final void method1675(boolean arg0) {
        field3613++;
        class157 var2 = this.field3616;
        synchronized (this.field3616) {
            if (!arg0) {
                method1677(81, null);
            }
            this.field3616.method1015((byte) 89);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 41)
    public static final String method1676(byte arg0, long arg1) {
        field3608++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg0 <= 85) {
                return null;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class141.field2049[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;)J", line = 93)
    public static final long method1677(int arg0, String arg1) {
        field3614++;
        int var2 = arg1.length();
        if (arg0 != -996737019) {
            field3620 = 5;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + ((long) arg1.charAt(var5)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 118)
    public static void method1678(int arg0) {
        if (arg0 == -5) {
            field3619 = null;
            field3610 = null;
            field3609 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lbo;Lps;Lqa;Z)V", line = 130)
    public static final void method1679(class24 arg0, class5 arg1, class496 arg2, boolean arg3) {
        field3615++;
        class191 var4 = arg0.method193(arg2, -19452);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method220();
        if (var4.method214() > var5) {
            var5 = var4.method214();
        }
        byte var6 = 10;
        int var7 = arg1.field67;
        int var8 = arg1.field72;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field375 != null) {
            var9 = class326.field4997.method35(160, null, class519.field7697, arg0.field375, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class519.field7697[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class40.field623.method1202(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class40.field623.method1203() + class40.field623.method1204() / 2;
        }
        int var15 = var5 / 2 + arg1.field67;
        if (var7 < class135.field1987 + var5) {
            var7 = class135.field1987;
            var15 = var5 / 2 + class135.field1987 - (-(var10 / 2) - 5 + -var6);
        } else if (var7 > (class135.field1971 - var5)) {
            var7 = class135.field1971 - var5;
            var15 = class135.field1971 - var6 - var10 / 2 - (var5 / 2) - 5;
        }
        int var16 = arg1.field72;
        if (var8 < (class135.field1985 + var5)) {
            var16 = var5 / 2 + var6 + class135.field1985;
            var8 = class135.field1985;
        } else if (class135.field1976 - var5 < var8) {
            var8 = class135.field1976 - var5;
            var16 = class135.field1976 - var6 - var11 - (var5 / 2);
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field67), (double) (var8 - arg1.field72)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method1333((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        if (!arg3) {
            field3620 = 59;
        }
        int var21 = -2;
        if (arg0.field375 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = (var16 + (var9 * class40.field623.method1203())) + 3;
            var20 = var10 + var18 + 10;
            if (arg0.field396 != 0) {
                arg2.method2952(var20 - var18, -var16 + var21, var18, arg0.field396, (byte) -53, var16);
            }
            if (arg0.field391 != 0) {
                arg2.method2956(var18, -20293, arg0.field391, var20 - var18, -var16 + var21, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class519.field7697[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class40.field623.method1205(arg2, var23, var15, var16, arg0.field390, true);
                var16 += class40.field623.method1203();
            }
        }
        if (arg0.field381 == -1 && arg0.field375 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class204 var25 = new class204(arg1);
        var25.field2870 = var18;
        var25.field2865 = var8 + var24;
        var25.field2868 = var8 - var24;
        var25.field2872 = var21;
        var25.field2869 = var20;
        var25.field2862 = var7 + var24;
        var25.field2864 = var7 - var24;
        var25.field2863 = var19;
        class178.field2537.method1958(var25, 0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V", line = 278)
    public final void method1680(int arg0, boolean arg1) {
        field3617++;
        class157 var3 = this.field3616;
        synchronized (this.field3616) {
            this.field3616.method1016(arg0, (byte) 121);
        }
        if (!arg1) {
            field3620 = -122;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lhm;", line = 297)
    public final class163 method1681(byte arg0, int arg1) {
        field3618++;
        class157 var3 = this.field3616;
        class163 var4;
        synchronized (this.field3616) {
            var4 = (class163) this.field3616.method1013((long) arg1, (byte) -106);
            int var5 = 67 % ((-arg0 - 58) / 62);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field3612.method2650(arg1, -98, 30);
        class163 var7 = new class163();
        if (var6 != null) {
            var7.method1159(new class91(var6), (byte) -124);
        }
        class157 var8 = this.field3616;
        synchronized (this.field3616) {
            this.field3616.method1012(-127, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lgo;ILns;)V", line = 337)
    public class259(class331 arg0, int arg1, class438 arg2) {
        this.field3612 = arg2;
        this.field3612.method2645(1, 30);
    }
}
