import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class349 {

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    private int field4755 = 0;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "[Lpn;")
    public class43[] field4751;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "[I")
    public static int[] field4753 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4747 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4760 = null;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field4758 = 0;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "Lcq;")
    public static class72 field4756 = new class72("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field4762 = 2;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "J")
    private long field4745;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "Lwo;")
    public static class285 field4757;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "Lwo;")
    public static class285 field4759;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lpn;")
    private class43 field4741;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "Lpn;")
    private class43 field4754;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "[Lqk;")
    public static class6[] field4761;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Lpn;", line = 3)
    public final class43 method2215(boolean arg0) {
        field4739++;
        if (this.field4755 > 0 && this.field4751[this.field4755 - 1] != this.field4754) {
            class43 var2 = this.field4754;
            this.field4754 = var2.field508;
            return var2;
        }
        if (arg0) {
            this.method2218(-36, 94L);
        }
        while (this.field4755 < this.field4742) {
            class43 var3 = this.field4751[this.field4755++].field508;
            if (this.field4751[this.field4755 - 1] != var3) {
                this.field4754 = var3.field508;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 37)
    public final void method2216(byte arg0) {
        field4737++;
        for (int var2 = 0; var2 < this.field4742; var2++) {
            class43 var4 = this.field4751[var2];
            while (true) {
                class43 var5 = var4.field508;
                if (var4 == var5) {
                    break;
                }
                var5.method263(false);
            }
        }
        this.field4754 = null;
        this.field4741 = null;
        int var3 = 114 / ((-arg0 - 27) / 48);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([Lpn;Z)I", line = 70)
    public final int method2217(class43[] arg0, boolean arg1) {
        field4744++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4742; var4++) {
            class43 var5 = this.field4751[var4];
            for (class43 var6 = var5.field508; var6 != var5; var6 = var6.field508) {
                arg0[var3++] = var6;
            }
        }
        if (arg1) {
            this.field4754 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IJ)Lpn;", line = 101)
    public final class43 method2218(int arg0, long arg1) {
        field4746++;
        this.field4745 = arg1;
        class43 var4 = this.field4751[(int) ((long) (this.field4742 - arg0) & arg1)];
        for (this.field4741 = var4.field508; this.field4741 != var4; this.field4741 = this.field4741.field508) {
            if (this.field4741.field505 == arg1) {
                class43 var5 = this.field4741;
                this.field4741 = this.field4741.field508;
                return var5;
            }
        }
        this.field4741 = null;
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I", line = 127)
    public final int method2219(byte arg0) {
        field4743++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4742; var3++) {
            class43 var4 = this.field4751[var3];
            class43 var5 = var4.field508;
            while (var4 != var5) {
                var5 = var5.field508;
                var2++;
            }
        }
        if (arg0 > -98) {
            return -96;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)I", line = 161)
    public final int method2220(byte arg0) {
        if (arg0 != 73) {
            field4753 = null;
        }
        field4752++;
        return this.field4742;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lpn;", line = 181)
    public final class43 method2221(int arg0) {
        field4740++;
        if (this.field4741 == null) {
            return null;
        }
        class43 var2 = this.field4751[(int) ((long) (this.field4742 - 1) & this.field4745)];
        while (this.field4741 != var2) {
            if (this.field4741.field505 == this.field4745) {
                class43 var4 = this.field4741;
                this.field4741 = this.field4741.field508;
                return var4;
            }
            this.field4741 = this.field4741.field508;
        }
        this.field4741 = null;
        int var3 = 86 % ((-arg0 - 3) / 34);
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Lpn;", line = 213)
    public final class43 method2222(int arg0) {
        field4748++;
        this.field4755 = arg0;
        return this.method2215(false);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLwo;ILwo;I)V", line = 223)
    public static final void method2223(boolean arg0, class285 arg1, int arg2, class285 arg3, int arg4) {
        class244.field3242 = arg1;
        class17.field185 = arg0;
        if (arg2 != 128) {
            field4756 = null;
        }
        field4736++;
        class373.field5055 = arg3;
        class153.field1789 = arg4;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Z", line = 238)
    public static final boolean method2224(int arg0) {
        field4738++;
        int var1 = 30 % ((29 - arg0) / 58);
        try {
            return class246.method1609((byte) -97);
        } catch (IOException var5) {
            class143.method921(14445);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class269.field3478 + "," + class382.field5234 + "," + class106.field1260 + " - " + class134.field1533 + "," + (class278.field3608 + class143.field1684.field2480[0]) + "," + (class143.field1684.field2482[0] + class129.field1432) + " - ";
            for (int var4 = 0; class134.field1533 > var4 && var4 < 50; var4++) {
                var3 = var3 + class215.field2658.field3188[var4] + ",";
            }
            class402.method2510(var3, var6, -29832);
            class335.method2151(98);
            return true;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;", line = 266)
    public static final String[] method2225(int arg0, char arg1, String arg2) {
        field4750++;
        int var3 = class288.method1837(arg2, -1117372769, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -11337) {
            method2228((String) null, true);
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V", line = 302)
    public static void method2226(int arg0) {
        field4757 = null;
        field4760 = null;
        field4747 = null;
        field4759 = null;
        field4753 = null;
        if (arg0 > -108) {
            field4760 = null;
        }
        field4761 = null;
        field4756 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lpn;IJ)V", line = 323)
    public final void method2227(class43 arg0, int arg1, long arg2) {
        field4749++;
        if (arg0.field507 != null) {
            arg0.method263(false);
        }
        class43 var5 = this.field4751[(int) ((long) (this.field4742 - 1) & arg2)];
        arg0.field508 = var5;
        arg0.field507 = var5.field507;
        arg0.field507.field508 = arg0;
        if (arg1 != -8218) {
            this.field4741 = null;
        }
        arg0.field505 = arg2;
        arg0.field508.field507 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(I)V", line = 344)
    public class349(int arg0) {
        this.field4751 = new class43[arg0];
        this.field4742 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class43 var3 = this.field4751[var2] = new class43();
            var3.field507 = var3;
            var3.field508 = var3;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 368)
    public static final byte[] method2228(String arg0, boolean arg1) {
        field4735++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (!arg1) {
            field4757 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }
}
