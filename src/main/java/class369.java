import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class369 extends class498 {

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field5257 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field5256 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field5259 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public int field5255 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public int field5262 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public int field5261 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public int field5266 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public int field5263 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Lfp;")
    public class216 field5260;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lkn;")
    public static class530 field5258 = new class530("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field5268 = 0;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "Lnh;")
    public static class536 field5267 = new class536("WTWIP", 3);

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field5270 = 0;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "[I")
    public static int[] field5272 = new int[14];

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "F")
    public static float field5273;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lha;")
    public static class43 field5264;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 7)
    public static void method2174(byte arg0) {
        field5267 = null;
        field5264 = null;
        field5258 = null;
        if (arg0 == -98) {
            field5272 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lfp;)V", line = 95)
    public class369(class216 arg0) {
        this.field5260 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z", line = 29)
    public final boolean method2175(int arg0, int arg1, int arg2) {
        if (arg2 != Integer.MAX_VALUE) {
            this.method2175(-116, 40, 52);
        }
        field5265++;
        if (arg1 >= this.field5257 && this.field5259 >= arg1 && arg0 >= this.field5255 && arg0 <= this.field5266) {
            return true;
        } else {
            return arg1 >= this.field5256 && this.field5262 >= arg1 && arg0 >= this.field5261 && arg0 <= this.field5263;
        }
    }
}
