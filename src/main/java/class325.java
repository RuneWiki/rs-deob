import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class325 extends class435 {

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public int field4322 = 0;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "Lbv;")
    public static class202 field4323 = new class202(0, 0);

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field4330 = 0;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "Ljc;")
    public static class305 field4331 = new class305("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "Ljc;")
    public static class305 field4332 = new class305("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "Z")
    public static boolean field4333 = false;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "Lao;")
    public static class191 field4334 = new class191(36, 2);

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public int field4309;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public int field4311;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public int field4313;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "Lrd;")
    public class224 field4314;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Lrd;")
    public class224 field4324;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lir;")
    public class22 field4312;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "Llr;")
    public class531 field4326;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "Ler;")
    public class70 field4316;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "Z")
    public boolean field4325;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "[I")
    public int[] field4329;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 18)
    public final void method1915(int arg0) {
        field4315++;
        if (arg0 != -40751577) {
            this.field4324 = null;
        }
        int var2 = this.field4320;
        if (this.field4316 != null) {
            class70 var5 = this.field4316.method403(-1, class52.field606);
            if (var5 == null) {
                this.field4311 = 0;
                this.field4310 = 0;
                this.field4318 = 0;
                this.field4328 = 0;
                this.field4329 = null;
                this.field4320 = -1;
            } else {
                this.field4329 = var5.field881;
                this.field4320 = var5.field855;
                this.field4311 = var5.field845;
                this.field4310 = var5.field859 << 7;
                this.field4328 = var5.field861;
                this.field4318 = var5.field846;
            }
        } else if (this.field4312 != null) {
            int var3 = class294.method1769(this.field4312, true);
            if (var2 != var3) {
                this.field4320 = var3;
                class212 var4 = this.field4312.field220;
                if (var4.field2903 != null) {
                    var4 = var4.method1350(class52.field606, -1);
                }
                if (var4 == null) {
                    this.field4311 = this.field4310 = 0;
                } else {
                    this.field4311 = var4.field2907;
                    this.field4310 = var4.field2900 << 7;
                }
            }
        } else if (this.field4326 != null) {
            this.field4320 = class98.method566(46, this.field4326);
            this.field4311 = this.field4326.field7790;
            this.field4310 = this.field4326.field7801 << 7;
        }
        if (this.field4320 != var2 && this.field4314 != null) {
            class465.field6928.method1114(this.field4314);
            this.field4314 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V", line = 99)
    public static void method1916(boolean arg0) {
        field4332 = null;
        field4331 = null;
        field4323 = null;
        field4334 = null;
        if (arg0) {
            field4331 = null;
        }
    }
}
