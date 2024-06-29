import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class56 {

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    private int field1021 = 0;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "[Lph;")
    private class32[] field1004;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lij;")
    public static class50 field994 = class78.method578(124, "<br>");

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Lij;")
    public static class50 field1006 = class78.method578(121, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Lij;")
    public static class50 field1005 = class78.method578(124, "<br>(X");

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Z")
    public static boolean field998 = true;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field999 = -1;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field1007 = -2;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field1000 = 0;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Lij;")
    public static class50 field1017 = class78.method578(121, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Lij;")
    public static class50 field1018 = class78.method578(126, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "J")
    private long field1019;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "Lwi;")
    public static class21 field1014;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lph;")
    private class32 field1002;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "Lph;")
    private class32 field1020;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public final void method437(byte arg0) {
        if (arg0 != 19) {
            method440(76, (class67) null);
        }
        field1010++;
        for (int var2 = 0; var2 < this.field996; var2++) {
            class32 var3 = this.field1004[var2];
            while (true) {
                class32 var4 = var3.field642;
                if (var3 == var4) {
                    break;
                }
                var4.method267(120);
            }
        }
        this.field1002 = null;
        this.field1020 = null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public static final void method438(byte arg0) {
        class5.field62.method763(arg0 ^ 0xFFFFFFBE);
        field1013++;
        if (arg0 != -66) {
            field995 = -72;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
    public static final boolean method439(int arg0, int arg1, int arg2) {
        int var3 = class206.field3416[arg0][arg1][arg2];
        if (-class124.field2168 == var3) {
            return false;
        } else if (class124.field2168 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class20.method149(var4 + 1, class245.field4257[arg0][arg1][arg2], var5 + 1) && class20.method149(var4 + 128 - 1, class245.field4257[arg0][arg1 + 1][arg2], var5 + 1) && class20.method149(var4 + 128 - 1, class245.field4257[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class20.method149(var4 + 1, class245.field4257[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class206.field3416[arg0][arg1][arg2] = class124.field2168;
                return true;
            } else {
                class206.field3416[arg0][arg1][arg2] = -class124.field2168;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILea;)V")
    public static final void method440(int arg0, class67 arg1) {
        field1003++;
        if (arg0 != -16093) {
            field999 = 20;
        }
        short var2 = 256;
        for (int var3 = 0; var3 < class66.field1261.length; var3++) {
            class66.field1261[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class66.field1261[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class188.field3113[var15] = (class66.field1261[var15 + 128] + class66.field1261[var15 + 1] + class66.field1261[var15 + -1] + class66.field1261[var15 + -128]) / 4;
                }
            }
            int[] var13 = class66.field1261;
            class66.field1261 = class188.field3113;
            class188.field3113 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3426; var7++) {
            for (int var8 = 0; var8 < arg1.field3431; var8++) {
                if (arg1.field1273[var6++] != 0) {
                    int var9 = arg1.field3434 + var8 + 16;
                    int var10 = arg1.field3427 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class66.field1261[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method441(int arg0) {
        field994 = null;
        field1018 = null;
        field1017 = null;
        field1005 = null;
        field1014 = null;
        field1006 = null;
        if (arg0 != 1) {
            field1017 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)Lph;")
    public final class32 method442(byte arg0) {
        field997++;
        if (this.field1002 == null) {
            return null;
        }
        class32 var2 = this.field1004[(int) (this.field1019 & (long) (this.field996 - 1))];
        while (this.field1002 != var2) {
            if (this.field1002.field635 == this.field1019) {
                class32 var3 = this.field1002;
                this.field1002 = this.field1002.field642;
                return var3;
            }
            this.field1002 = this.field1002.field642;
        }
        this.field1002 = null;
        if (arg0 >= -99) {
            this.field996 = 97;
        }
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(JB)Lph;")
    public final class32 method443(long arg0, byte arg1) {
        this.field1019 = arg0;
        class32 var4 = this.field1004[(int) ((long) (this.field996 - 1) & arg0)];
        field1009++;
        for (this.field1002 = var4.field642; this.field1002 != var4; this.field1002 = this.field1002.field642) {
            if (this.field1002.field635 == arg0) {
                class32 var6 = this.field1002;
                this.field1002 = this.field1002.field642;
                return var6;
            }
        }
        this.field1002 = null;
        int var5 = 91 / ((12 - arg1) / 44);
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIB)V")
    public static final void method444(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1011++;
        int var5 = arg0;
        int var6 = -1;
        int var7 = -arg0;
        int var8 = 0;
        int var9 = class2.method10(class177.field2953, (byte) 97, arg0 + arg2, class224.field3773);
        int var10 = class2.method10(class177.field2953, (byte) 97, arg2 - arg0, class224.field3773);
        class155.method1090(class177.field2963[arg1], var10, arg3, 160, var9);
        int var11 = -86 % ((-arg4 - 55) / 42);
        while (var8 < var5) {
            var6 += 2;
            var7 += var6;
            if (var7 > 0) {
                var5--;
                int var12 = arg1 + var5;
                int var13 = arg1 - var5;
                if (class100.field1855 <= var12 && class97.field1816 >= var13) {
                    int var14 = class2.method10(class177.field2953, (byte) 97, arg2 + var8, class224.field3773);
                    int var15 = class2.method10(class177.field2953, (byte) 97, arg2 - var8, class224.field3773);
                    if (var12 <= class97.field1816) {
                        class155.method1090(class177.field2963[var12], var15, arg3, 160, var14);
                    }
                    if (var13 >= class100.field1855) {
                        class155.method1090(class177.field2963[var13], var15, arg3, 160, var14);
                    }
                }
                var7 -= var5 << 1;
            }
            var8++;
            int var16 = arg1 - var8;
            int var17 = arg1 + var8;
            if (var17 >= class100.field1855 && var16 <= class97.field1816) {
                int var18 = class2.method10(class177.field2953, (byte) 97, arg2 + var5, class224.field3773);
                int var19 = class2.method10(class177.field2953, (byte) 97, arg2 - var5, class224.field3773);
                if (class97.field1816 >= var17) {
                    class155.method1090(class177.field2963[var17], var19, arg3, 160, var18);
                }
                if (var16 >= class100.field1855) {
                    class155.method1090(class177.field2963[var16], var19, arg3, 160, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IJLph;)V")
    public final void method445(int arg0, long arg1, class32 arg2) {
        field1001++;
        if (arg2.field638 != null) {
            arg2.method267(-11);
        }
        class32 var5 = this.field1004[(int) (arg1 & (long) (this.field996 - 1))];
        if (arg0 <= 63) {
            field1000 = 67;
        }
        arg2.field638 = var5.field638;
        arg2.field642 = var5;
        arg2.field638.field642 = arg2;
        arg2.field635 = arg1;
        arg2.field642.field638 = arg2;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)Lph;")
    public final class32 method446(int arg0) {
        field1008++;
        if (arg0 != 1) {
            this.field1004 = null;
        }
        this.field1021 = 0;
        return this.method448((byte) 62);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLwd;I)Lij;")
    public static final class50 method447(byte arg0, class217 arg1, int arg2) {
        field1015++;
        try {
            class50 var3 = new class50();
            var3.field898 = arg1.method1436(-101);
            if (var3.field898 > arg2) {
                var3.field898 = arg2;
            }
            var3.field909 = new byte[var3.field898];
            arg1.field3581 += class151.field2629.method1246(var3.field909, -2, var3.field898, 0, arg1.field3581, arg1.field3633);
            if (arg0 > -35) {
                field994 = null;
            }
            return var3;
        } catch (Exception var4) {
            return class16.field369;
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)Lph;")
    public final class32 method448(byte arg0) {
        field1012++;
        if (this.field1021 > 0 && this.field1004[this.field1021 - 1] != this.field1020) {
            class32 var2 = this.field1020;
            this.field1020 = var2.field642;
            return var2;
        }
        while (this.field996 > this.field1021) {
            class32 var3 = this.field1004[this.field1021++].field642;
            if (this.field1004[this.field1021 - 1] != var3) {
                this.field1020 = var3.field642;
                return var3;
            }
        }
        return arg0 <= 46 ? null : null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
    public class56(int arg0) {
        this.field1004 = new class32[arg0];
        this.field996 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class32 var3 = this.field1004[var2] = new class32();
            var3.field638 = var3;
            var3.field642 = var3;
        }
    }
}
