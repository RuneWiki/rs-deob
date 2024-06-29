import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class648 implements class441 {

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Loia;")
    private class97 field9379;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[Lfu;")
    private class410[] field9383;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9391 = new String[] { method4767(method4766("\u0002%PF")), method4767(method4766("\u0017~\u0012\u0004\u0007")), method4767(method4766("\u001f;\u0012\u0016\u0013\u00029H\u0014R")), method4767(method4766("\u001f;\u0012lR")), method4767(method4766("\u001f;\u0012`R")), method4767(method4766("\u001f;\u0012dR")), method4767(method4766("\u001f;\u0012hR")), method4767(method4766("\u001f;\u0012gR")), method4767(method4766("\u001f;\u0012kR")), method4767(method4766("\u001f;\u0012aR")) };

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field9378 = 104;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field9382 = 0;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lha;")
    private class66 field9389;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "Z")
    private boolean field9390;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public final void method3387(byte arg0) {
        try {
            field9381++;
            if (arg0 != -96) {
                this.method3389(10, true);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9391[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)V")
    public final void method3389(int arg0, boolean arg1) {
        try {
            boolean var8 = true;
            field9380++;
            if (arg0 > -76) {
                this.method3386(89);
            }
            class410[] var3 = this.field9383;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class410 var5 = var3[var4];
                if (var5 != null) {
                    var5.method368(var8 || this.field9390, (byte) -102);
                }
            }
            this.field9390 = false;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9391[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZJ)Z")
    public final boolean method3390(boolean arg0, long arg1) {
        try {
            if (arg0) {
                return false;
            } else {
                field9385++;
                return class430.method3299(74) >= ((long) this.field9379.field1095 + arg1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9391[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
    public final int method3386(int arg0) {
        try {
            field9387++;
            int var2 = 0;
            class410[] var3 = this.field9383;
            if (arg0 != 19607) {
                return 72;
            }
            for (int var4 = 0; var4 < var3.length; var4++) {
                class410 var5 = var3[var4];
                if (var5 == null || var5.method369(arg0 ^ 0xFFFFF55F)) {
                    var2++;
                }
            }
            return var2 * 100 / this.field9383.length;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9391[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public final void method3385(byte arg0) {
        try {
            if (arg0 == -17) {
                if (class610.field8913 != this.field9389) {
                    this.field9390 = true;
                    this.field9389 = class610.field8913;
                }
                field9388++;
                this.field9389.method483(0);
                class410[] var2 = this.field9383;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    class410 var4 = var2[var3];
                    if (var4 != null) {
                        var4.method370((byte) -116);
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9391[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)I")
    public final int method3388(int arg0) {
        try {
            if (arg0 != -31112) {
                this.method3387((byte) -6);
            }
            field9384++;
            return this.field9379.field1094;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9391[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Z")
    public static final boolean method4765(int arg0, int arg1, int arg2) {
        try {
            field9386++;
            if (arg2 != 25416) {
                field9382 = 29;
            }
            if ((class487.method3700(arg1, (byte) 62, arg0) | (arg0 & 0x10000) != 0) || class559.method4183(8192, arg1, arg0)) {
                return true;
            } else {
                return (arg1 & 0x37) == 0 && class547.method4125(arg0, arg1, (byte) 122);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9391[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Loia;Loja;)V")
    public class648(class97 arg0, class477 arg1) {
        try {
            this.field9379 = arg0;
            this.field9383 = new class410[this.field9379.field1096.length];
            for (int var3 = 0; var3 < this.field9383.length; var3++) {
                this.field9383[var3] = arg1.method3652(4, this.field9379.field1096[var3]);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9391[2] + (arg0 == null ? field9391[0] : field9391[1]) + ',' + (arg1 == null ? field9391[0] : field9391[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4766(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4767(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
