import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class58 {

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lgba;")
    private class358 field770 = new class358();

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lba;")
    private class607 field775;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "[I")
    public static int[] field779 = new int[256];

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "[I")
    public static int[] field783;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "[Lnv;")
    public static class61[] field785;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Lov;")
    public static class346 field784;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[BI)[B")
    public static final byte[] method311(int arg0, int arg1, byte[] arg2, int arg3) {
        field767++;
        byte[] var4 = new byte[arg0];
        class205.method1311(arg2, arg1, var4, arg3, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
    public final int method312(int arg0) {
        if (arg0 == 0) {
            field762++;
            return this.field771;
        } else {
            return 10;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method313(int arg0) {
        field766++;
        class101 var2 = (class101) this.field775.method3473(-27089);
        while (var2 != null) {
            Object var3 = var2.method246(-24);
            if (var3 != null) {
                return var3;
            }
            class101 var4 = var2;
            var2 = (class101) this.field775.method3478((byte) 5);
            var4.method589(-8880);
            var4.method3149(-18724);
            this.field778 += var2.field1338;
        }
        if (arg0 >= -63) {
            this.method313(36);
        }
        return null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JLjava/lang/Object;II)V")
    private final void method314(long arg0, Object arg1, int arg2, int arg3) {
        field765++;
        if (arg3 != 20348) {
            return;
        }
        if (this.field771 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method326(arg0, -103);
        this.field778 -= arg2;
        while (this.field778 < 0) {
            class101 var7 = (class101) this.field770.method2226(0);
            this.method322(var7, arg3 ^ 0x477C);
        }
        class343 var6 = new class343(arg1, arg2);
        this.field775.method3475(-88, var6, arg0);
        this.field770.method2228((byte) 93, var6);
        var6.field7830 = 0L;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public final void method315(int arg0) {
        if (arg0 != 1) {
            this.method320(28, -110);
        }
        field764++;
        this.field770.method2227(arg0 + 16382);
        this.field775.method3472((byte) -128);
        this.field778 = this.field771;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JBLjava/lang/Object;)V")
    public final void method316(long arg0, byte arg1, Object arg2) {
        if (arg1 >= -108) {
            this.field778 = 53;
        }
        field769++;
        this.method314(arg0, arg2, 1, 20348);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public final void method317(byte arg0) {
        class101 var2 = (class101) this.field770.method2222((byte) -123);
        if (arg0 != 21) {
            return;
        }
        while (var2 != null) {
            if (var2.method247(arg0 - 20)) {
                var2.method589(arg0 ^ 0xFFFFDD45);
                var2.method3149(arg0 ^ 0xFFFFB6C9);
                this.field778 += var2.field1338;
            }
            var2 = (class101) this.field770.method2225(116);
        }
        field773++;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)I")
    public final int method318(int arg0) {
        if (arg0 < 53) {
            field779 = null;
        }
        field777++;
        return this.field778;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)I")
    public final int method319(int arg0) {
        field780++;
        int var2 = 0;
        if (arg0 > -52) {
            this.method323(-110L, 8);
        }
        for (class101 var3 = (class101) this.field770.method2222((byte) -98); var3 != null; var3 = (class101) this.field770.method2225(35)) {
            if (!var3.method247(1)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
    public final void method320(int arg0, int arg1) {
        field768++;
        if (class222.field2846 != null) {
            for (class101 var3 = (class101) this.field770.method2222((byte) -109); var3 != null; var3 = (class101) this.field770.method2225(41)) {
                if (var3.method247(arg1 + 306674913)) {
                    if (var3.method246(-24) == null) {
                        var3.method589(arg1 ^ 0x12475E70);
                        var3.method3149(arg1 + 306656188);
                        this.field778++;
                    }
                } else if ((++var3.field7830) > ((long) arg0)) {
                    class101 var4 = class222.field2846.method613(var3, 8);
                    this.field775.method3475(-115, var4, var3.field1401);
                    class148.method806(var3, var4, (byte) -112);
                    var3.method589(-8880);
                    var3.method3149(-18724);
                }
            }
        }
        if (arg1 != -306674912) {
            this.method312(-93);
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method321(int arg0) {
        field774++;
        if (arg0 < 38) {
            this.method323(-87L, 97);
        }
        class101 var2 = (class101) this.field775.method3478((byte) 5);
        while (var2 != null) {
            Object var3 = var2.method246(-54);
            if (var3 != null) {
                return var3;
            }
            class101 var4 = var2;
            var2 = (class101) this.field775.method3478((byte) 5);
            var4.method589(-8880);
            var4.method3149(-18724);
            this.field778 += var2.field1338;
        }
        return null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lpk;I)V")
    private final void method322(class101 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method589(-8880);
            arg0.method3149(-18724);
            this.field778 += arg0.field1338;
        }
        if (arg1 == 2048) {
            field782++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method323(long arg0, int arg1) {
        field776++;
        class101 var4 = (class101) this.field775.method3476(arg0, (byte) 28);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method246(-94);
        if (arg1 != -19814) {
            return null;
        } else if (var5 == null) {
            var4.method589(-8880);
            var4.method3149(-18724);
            this.field778 += var4.field1338;
            return null;
        } else {
            if (var4.method247(1)) {
                class343 var6 = new class343(var5, var4.field1338);
                this.field775.method3475(arg1 + 19692, var6, var4.field1401);
                this.field770.method2228((byte) 38, var6);
                var6.field7830 = 0L;
                var4.method589(arg1 + 10934);
                var4.method3149(-18724);
            } else {
                this.field770.method2228((byte) 54, var4);
                var4.field7830 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
    public static void method324(int arg0) {
        field779 = null;
        field784 = null;
        field783 = null;
        if (arg0 != -257) {
            field786 = -54;
        }
        field785 = null;
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)Lraa;")
    public static final class625 method325(int arg0) {
        field772++;
        if (class614.field8834 == null || class31.field483 == null) {
            return null;
        }
        class31.field483.method1668(class614.field8834, 20502);
        class625 var1 = (class625) class31.field483.method1669(-25264);
        if (var1 == null) {
            return null;
        }
        class297 var2 = class614.field8823.method1544(36, var1.field9044);
        if (arg0 == 2048) {
            return var2 != null && var2.field3897 && var2.method1822((byte) 46, class614.field8828) ? var1 : class199.method1272((byte) -106);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
    public class58(int arg0) {
        this.field771 = arg0;
        this.field778 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field775 = new class607(var2);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(JI)V")
    private final void method326(long arg0, int arg1) {
        field763++;
        if (arg1 < -4) {
            class101 var4 = (class101) this.field775.method3476(arg0, (byte) 28);
            this.method322(var4, 2048);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field779[var0] = var1;
        }
        field783 = new int[14];
        field785 = new class61[2048];
        new class344("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field787 = 0;
    }
}
