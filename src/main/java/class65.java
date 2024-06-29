import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class65 {

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lw;")
    private class36 field861 = new class36();

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "S")
    public static short field850 = 256;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field852 = -1;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "F")
    public static float field860;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Lw;")
    private class36 field864;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 13)
    public static final byte[] method440(String arg0, int arg1) {
        int var2 = arg0.length();
        field862++;
        byte[] var3 = new byte[var2];
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
        if (arg1 <= 21) {
            method440((String) null, -24);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(CI)B", line = 156)
    public static final byte method441(char arg0, int arg1) {
        field857++;
        byte var2;
        if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return arg1 == -32024 ? var2 : -33;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Lw;", line = 283)
    public final class36 method442(int arg0) {
        field854++;
        if (arg0 > -60) {
            this.method443(true, (class36) null);
        }
        class36 var2 = this.field861.field413;
        if (this.field861 == var2) {
            this.field864 = null;
            return null;
        } else {
            this.field864 = var2.field413;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLw;)V", line = 307)
    public final void method443(boolean arg0, class36 arg1) {
        if (arg1.field415 != null) {
            arg1.method206(-1);
        }
        arg1.field415 = this.field861.field415;
        arg1.field413 = this.field861;
        arg1.field415.field413 = arg1;
        arg1.field413.field415 = arg1;
        if (!arg0) {
            this.field861 = (class36) null;
        }
        field859++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lw;", line = 326)
    public final class36 method444(byte arg0) {
        field855++;
        int var2 = -5 / ((-arg0 - 36) / 45);
        class36 var3 = this.field864;
        if (this.field861 == var3) {
            this.field864 = null;
            return null;
        } else {
            this.field864 = var3.field413;
            return var3;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)Lw;", line = 364)
    public final class36 method445(byte arg0) {
        field858++;
        class36 var2 = this.field861.field413;
        if (arg0 != 120) {
            return (class36) null;
        } else if (this.field861 == var2) {
            return null;
        } else {
            var2.method206(-1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 382)
    public final void method446(int arg0) {
        if (arg0 <= 16) {
            field852 = -90;
        }
        while (true) {
            class36 var2 = this.field861.field413;
            if (this.field861 == var2) {
                field856++;
                this.field864 = null;
                return;
            }
            var2.method206(-1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)I", line = 406)
    public final int method447(byte arg0) {
        int var2 = 0;
        field851++;
        class36 var3 = this.field861.field413;
        if (arg0 != 11) {
            field860 = -1.0931104F;
        }
        while (this.field861 != var3) {
            var3 = var3.field413;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 428)
    public class65() {
        this.field861.field413 = this.field861;
        this.field861.field415 = this.field861;
    }
}
