import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class218 {

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "[I")
    public int[] field3705;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "[I")
    public int[] field3706;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Lss;")
    public static class213 field3704 = new class213("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "Lcg;")
    public static class10 field3707 = new class10(11, 0, 1, 2);

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "Lbi;")
    public static class104 field3708 = new class104(25, 8);

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lot;IIIII)V")
    public static final void method1601(class506 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7561 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class311.field4882[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class169 var13 = class60.field950[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field7561; var14++) {
                            if (arg0.field7563[var14] == var13.field2461) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field7563[arg0.field7561++] = var13.field2461;
                        if (arg0.field7561 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field7561; var15 < 4; var15++) {
            arg0.field7563[var15] = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public static void method1602(int arg0) {
        if (arg0 != 16) {
            method1602(-14);
        }
        field3707 = null;
        field3708 = null;
        field3704 = null;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(I)V")
    public class218(int arg0) {
        this.field3702 = arg0;
        this.field3705 = new int[this.field3702];
        this.field3706 = new int[this.field3702];
    }
}
