import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 {

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    private int field3001 = 0;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    private int field2993;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "[Lvc;")
    private class145[] field2982;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2990 = 128;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lfc;")
    public static class39 field2997 = class90.method774("0(U", -127);

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field2998 = -1;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lfc;")
    public static class39 field2995 = class90.method774("::clientdrop", -107);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "[Z")
    public static boolean[] field2988 = new boolean[112];

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lfc;")
    public static class39 field2977 = class90.method774("Wordpack geladen)3", -94);

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lfc;")
    private static class39 field2983 = class90.method774("Please check your message)2centre for details)3", -85);

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lfc;")
    public static class39 field2989 = field2983;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lp;")
    public static class104 field2984 = new class104(30);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "J")
    private long field2981;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Loc;")
    public static class100 field2999;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lvc;")
    private class145 field2994;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lvc;")
    private class145 field3000;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lob;")
    public static class99 field2991;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method990(byte arg0, int arg1) {
        field2975++;
        if (class56.field1409 == arg1) {
            return;
        }
        if (class56.field1409 == 0) {
            class140.method1147((byte) -64);
        }
        if (arg1 == 20 || arg1 == 40) {
            class38.field1025 = 0;
            class143.field3601 = 0;
            class92.field2152 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class103.field2603 != null) {
            class103.field2603.method1145(5073);
            class103.field2603 = null;
        }
        if (class56.field1409 == 25 || class56.field1409 == 40) {
            class35.method403(0);
            class152.method1217();
        }
        if (class56.field1409 == 25) {
            class38.field1031 = 0;
            class120.field3126 = 0;
            class38.field1036 = 1;
            class3.field78 = 0;
            class96.field2235 = 1;
        }
        if (arg1 == 0 || arg1 == 35) {
            class1.method2(-105);
            class104.method936((byte) 9);
            if (class17.field492 == null) {
                class17.field492 = class3.method23(503, 0, 765, class140.field3523);
            }
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class17.field492 = null;
            class1.method2(-57);
            class121.method1034(class1.field10, class140.field3523, class128.field3272, (byte) 109);
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class17.field492 = null;
            class104.method936((byte) 9);
            class67.method638(class140.field3523, class128.field3272, 28448);
        }
        if (arg0 >= -95) {
            field2998 = 3;
        }
        class70.field1655 = true;
        class56.field1409 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 99)
    public static final void method991(byte arg0) {
        field2978++;
        int var1 = class75.field1718 + class94.field2197.field2916;
        if (field2988[98]) {
            class151.field3739 += (12 - class151.field3739) / 2;
        } else if (field2988[99]) {
            class151.field3739 += (-class151.field3739 - 12) / 2;
        } else {
            class151.field3739 /= 2;
        }
        field2990 += class151.field3739 / 2;
        if (field2988[96]) {
            class74.field1712 += (-class74.field1712 - 24) / 2;
        } else if (field2988[97]) {
            class74.field1712 += (24 - class74.field1712) / 2;
        } else {
            class74.field1712 /= 2;
        }
        if (arg0 != -82) {
            field2997 = null;
        }
        class62.field1532 = class62.field1532 + class74.field1712 / 2 & 0x7FF;
        if (field2990 < 128) {
            field2990 = 128;
        }
        if (field2990 > 383) {
            field2990 = 383;
        }
        int var2 = class94.field2197.field2909 + class126.field3202;
        if (class124.field3186 - var1 < -500 || class124.field3186 - var1 > 500 || class139.field3520 - var2 < -500 || class139.field3520 - var2 > 500) {
            class139.field3520 = var2;
            class124.field3186 = var1;
        }
        if (class139.field3520 != var2) {
            class139.field3520 += (var2 - class139.field3520) / 16;
        }
        if (class124.field3186 != var1) {
            class124.field3186 += (var1 - class124.field3186) / 16;
        }
        int var3 = class139.field3520 >> 7;
        int var4 = 0;
        int var5 = class124.field3186 >> 7;
        int var6 = class153.method1225(128, class139.field3520, class24.field661, class124.field3186);
        if (var5 > 3 && var3 > 3 && var5 < 100 && var3 < 100) {
            for (int var7 = var5 - 4; var7 <= var5 + 4; var7++) {
                for (int var8 = var3 - 4; var8 <= var3 + 4; var8++) {
                    int var9 = class24.field661;
                    if (var9 < 3 && (class137.field3424[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class7.field219[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class115.field3012) {
            class115.field3012 += (var11 - class115.field3012) / 24;
        } else if (var11 < class115.field3012) {
            class115.field3012 += (var11 - class115.field3012) / 80;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Lvc;", line = 215)
    public final class145 method992(boolean arg0) {
        field2979++;
        if (arg0) {
            this.field3001 = 0;
            return this.method993(-20300);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lvc;", line = 228)
    public final class145 method993(int arg0) {
        if (arg0 != -20300) {
            this.method992(true);
        }
        field2996++;
        if (this.field3001 > 0 && this.field2982[this.field3001 - 1] != this.field3000) {
            class145 var2 = this.field3000;
            this.field3000 = var2.field3631;
            return var2;
        }
        while (this.field3001 < this.field2993) {
            class145 var3 = this.field2982[this.field3001++].field3631;
            if (this.field2982[this.field3001 - 1] != var3) {
                this.field3000 = var3.field3631;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 272)
    public static final void method994(int arg0) {
        class1.field27 = null;
        class72.field1686 = null;
        class115.field3026 = null;
        class15.field395 = null;
        class131.field3287 = null;
        field2985++;
        int var1 = -31 % ((72 - arg0) / 37);
        class101.field2515 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZJ)Lvc;", line = 295)
    public final class145 method995(boolean arg0, long arg1) {
        field2986++;
        this.field2981 = arg1;
        class145 var4 = this.field2982[(int) ((long) (this.field2993 - 1) & arg1)];
        for (this.field2994 = var4.field3631; this.field2994 != var4; this.field2994 = this.field2994.field3631) {
            if (this.field2994.field3619 == arg1) {
                class145 var5 = this.field2994;
                this.field2994 = this.field2994.field3631;
                return var5;
            }
        }
        if (arg0) {
            this.method995(false, -98L);
        }
        this.field2994 = null;
        return null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lh;B)V", line = 325)
    public static final void method996(class49 arg0, byte arg1) {
        arg0.field1248 = false;
        if (arg1 < 48) {
            field2988 = null;
        }
        if (arg0.field1247 != null) {
            arg0.field1247.field3177 = 0;
        }
        for (class49 var2 = arg0.method159(); var2 != null; var2 = arg0.method171()) {
            method996(var2, (byte) 62);
        }
        field2976++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ldc;I)Lfc;", line = 359)
    public static final class39 method997(class25 arg0, int arg1) {
        field2992++;
        if (arg1 > -24) {
            method997(null, -33);
        }
        return class101.method865(false, arg0, 32767);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 372)
    public class114(int arg0) {
        this.field2993 = arg0;
        this.field2982 = new class145[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class145 var3 = this.field2982[var2] = new class145();
            var3.field3624 = var3;
            var3.field3631 = var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lvc;JB)V", line = 394)
    public final void method998(class145 arg0, long arg1, byte arg2) {
        if (arg0.field3624 != null) {
            arg0.method1170(122);
        }
        class145 var5 = this.field2982[(int) ((long) (this.field2993 - 1) & arg1)];
        arg0.field3631 = var5;
        arg0.field3624 = var5.field3624;
        arg0.field3619 = arg1;
        field2980++;
        arg0.field3624.field3631 = arg0;
        arg0.field3631.field3624 = arg0;
        if (arg2 != -118) {
            field2998 = 126;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V", line = 429)
    public static void method999(int arg0) {
        field2977 = null;
        field2984 = null;
        if (arg0 >= -104) {
            method990((byte) 24, -8);
        }
        field2995 = null;
        field2983 = null;
        field2989 = null;
        field2988 = null;
        field2999 = null;
        field2997 = null;
        field2991 = null;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Lvc;", line = 447)
    public final class145 method1000(int arg0) {
        if (arg0 > -21) {
            return null;
        }
        field2987++;
        if (this.field2994 == null) {
            return null;
        }
        class145 var2 = this.field2982[(int) ((long) (this.field2993 - 1) & this.field2981)];
        while (this.field2994 != var2) {
            if (this.field2994.field3619 == this.field2981) {
                class145 var3 = this.field2994;
                this.field2994 = this.field2994.field3631;
                return var3;
            }
            this.field2994 = this.field2994.field3631;
        }
        this.field2994 = null;
        return null;
    }
}
