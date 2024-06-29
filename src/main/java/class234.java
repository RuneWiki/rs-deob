import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class234 extends class252 {

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    private int field4043 = 1;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    private int field4042 = 1;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    private int field4052 = 204;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field4046 = 0;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "Ljd;")
    private static class85 field4051 = class221.method1499("Loading)3)3)3", (byte) 114);

    @OriginalMember(owner = "client!o", name = "W", descriptor = "Ljd;")
    public static class85 field4045 = class221.method1499("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) -78);

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "Ljd;")
    public static class85 field4054 = field4051;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Lsb;")
    public static class214 field4044 = new class214(64);

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "Ljd;")
    private static class85 field4056 = class221.method1499("flash3:", (byte) -80);

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "Ljd;")
    public static class85 field4058 = field4056;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "Ljd;")
    public static class85 field4057 = field4056;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "[I")
    public static int[] field4059 = new int[1000];

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field4049;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4052 = arg0.method1694((byte) -100);
                }
            } else {
                this.field4043 = arg0.method1711((byte) -67);
            }
        } else {
            this.field4042 = arg0.method1711((byte) -67);
        }
        if (arg2 != -99) {
            field4057 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    public static void method1565(int arg0) {
        field4044 = null;
        if (arg0 <= 21) {
            method1565(62);
        }
        field4057 = null;
        field4045 = null;
        field4059 = null;
        field4056 = null;
        field4058 = null;
        field4054 = null;
        field4051 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field4048;
        int[] var3 = super.field4356.method868(arg0, (byte) -113);
        if (super.field4356.field2258) {
            for (int var4 = 0; ~class5.field63 < ~var4; ++var4) {
                int var5 = class105.field1838[var4];
                int var6 = class39.field622[arg0];
                int var7 = this.field4042 * var5 >> 12;
                int var8 = var5 % (4096 / this.field4042) * this.field4042;
                int var9 = this.field4043 * var6 >> 12;
                int var10 = var6 % (4096 / this.field4043) * this.field4043;
                if (~var10 > ~this.field4052) {
                    for (var7 -= var9; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var8 > ~this.field4052) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var8 > ~this.field4052) {
                    int var11;
                    for (var11 = var7 - var9; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != -55) {
            this.field4052 = 41;
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([Ljd;III)Ljd;")
    public static final class85 method1566(class85[] arg0, int arg1, int arg2, int arg3) {
        ++field4047;
        int var4 = arg3;
        for (int var5 = 0; arg1 > var5; ++var5) {
            if (arg0[arg2 - -var5] == null) {
                arg0[arg2 + var5] = client.field2559;
            }
            var4 += arg0[arg2 + var5].field1538;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; ~var8 > ~arg1; ++var8) {
            class85 var10 = arg0[arg2 + var8];
            class248.method1724(var10.field1548, 0, var6, var7, var10.field1538);
            var7 += var10.field1538;
        }
        class85 var9 = new class85();
        var9.field1548 = var6;
        var9.field1538 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
    public static final void method1567(int arg0) {
        if (arg0 > -44) {
            field4054 = null;
        }
        for (int var1 = 0; var1 < class241.field4151; ++var1) {
            int var2 = class36.field564[var1];
            class44 var3 = class249.field4291[var2];
            int var4 = class189.field3249.method1711((byte) -67);
            if ((var4 & 2) != 0) {
                var4 += class189.field3249.method1711((byte) -67) << 8;
            }
            class169.method1133(var4, true, var2, var3);
        }
        ++field4055;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class234() {
        super(0, true);
    }
}
