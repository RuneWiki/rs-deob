import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class247 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lnh;")
    private class115 field4381 = new class115();

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lo;")
    private class204 field4401 = new class204();

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    private int field4400;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    private int field4402;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lcd;")
    private class69 field4403;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lgf;")
    public static class8 field4388 = null;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lud;")
    public static class279 field4387 = class130.method1024("Chargement en cours)3 Veuillez patienter)3", 255);

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lud;")
    public static class279 field4384 = class130.method1024("", 255);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
    public static int[] field4383 = new int[200];

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lg;")
    public static class158 field4389 = null;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lud;")
    public static class279 field4399 = class130.method1024("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 255);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[[[B")
    public static byte[][][] field4397;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIILaj;I)V", line = 9)
    public static final void method1765(int arg0, int arg1, int arg2, int arg3, int arg4, class1 arg5, int arg6) {
        field4390++;
        class260.method1864(arg5.field79, true, arg2, arg0, arg5.field86, arg4, arg6, arg1);
        if (arg3 != 30593) {
            method1768(115, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lsi;", line = 28)
    public final class314 method1766(int arg0) {
        if (arg0 > -44) {
            return (class314) null;
        } else {
            field4393++;
            return this.field4403.method604(2);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)Lnh;", line = 40)
    public final class115 method1767(byte arg0, long arg1) {
        class115 var4 = (class115) this.field4403.method610(arg1, -1);
        if (var4 != null) {
            this.field4401.method1513(var4, arg0 + 293);
        }
        field4394++;
        return arg0 == -37 ? var4 : (class115) null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Ltl;", line = 64)
    public static final class205 method1768(int arg0, byte arg1) {
        if (arg1 <= 35) {
            method1768(-57, (byte) 19);
        }
        field4396++;
        class205 var2 = (class205) class217.field3843.method1767((byte) -37, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class310.field5499.method1192(0, 11, arg0);
        class205 var4 = new class205();
        if (var3 != null) {
            var4.method1519(false, new class53(var3));
        }
        class217.field3843.method1771(-115, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILgf;IZ)V", line = 97)
    public static final void method1769(int arg0, class8 arg1, int arg2, boolean arg3) {
        if (arg3) {
            method1769(-23, (class8) null, 74, true);
        }
        field4395++;
        if (class194.field3488 < 2 && class98.field1839 == 0 && !class38.field848) {
            return;
        }
        class279 var4 = class274.method1945((byte) -125);
        if (arg1 == null) {
            int var5 = class292.field5210.method402(var4, arg2 + 4, arg0 + 15, 16777215, 0, class306.field5433, class216.field3804);
            class35.method311(15, var5 + class292.field5210.method411(var4), arg2 - -4, arg0, 32);
            return;
        }
        class49 var6 = arg1.method58(class198.field3540, 73);
        if (var6 == null) {
            var6 = class292.field5210;
        }
        var6.method399(var4, arg2, arg0, arg1.field220, arg1.field297, arg1.field248, arg1.field235, arg1.field275, arg1.field186, class306.field5433, class216.field3804, class64.field1319);
        class35.method311(class64.field1319[3], class64.field1319[2], class64.field1319[0], class64.field1319[1], 32);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 139)
    public final void method1770(int arg0) {
        this.field4401.method1516(arg0 ^ 0xFFFF890D);
        if (arg0 != -30351) {
            field4399 = (class279) null;
        }
        field4382++;
        this.field4403.method603((byte) 124);
        this.field4381 = new class115();
        this.field4402 = this.field4400;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJLnh;)V", line = 162)
    public final void method1771(int arg0, long arg1, class115 arg2) {
        if (this.field4402 == 0) {
            class115 var5 = this.field4401.method1517(false);
            var5.method2221(true);
            var5.method926((byte) -8);
            if (this.field4381 == var5) {
                class115 var6 = this.field4401.method1517(false);
                var6.method2221(true);
                var6.method926((byte) -8);
            }
        } else {
            this.field4402--;
        }
        this.field4403.method612(false, arg2, arg1);
        this.field4401.method1513(arg2, 256);
        int var7 = 32 / ((-arg0 - 51) / 43);
        field4392++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lsi;", line = 190)
    public final class314 method1772(byte arg0) {
        field4391++;
        return arg0 == -2 ? this.field4403.method609(-26368) : (class314) null;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 207)
    public static void method1773(int arg0) {
        field4387 = null;
        field4388 = null;
        field4384 = null;
        if (arg0 < -113) {
            field4383 = null;
            field4389 = null;
            field4399 = null;
            field4397 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lud;", line = 230)
    public static final class279 method1774(int arg0, int arg1) {
        field4385++;
        if (arg1 != 4) {
            method1768(-60, (byte) 48);
        }
        class279 var2 = new class279();
        var2.field4935 = new byte[arg0];
        var2.field4967 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V", line = 263)
    public class247(int arg0) {
        this.field4400 = arg0;
        this.field4402 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4403 = new class69(var2);
    }
}
