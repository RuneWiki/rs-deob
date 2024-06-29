import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class486 extends class141 {

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lnj;")
    public static class487 field7372 = new class487("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lnj;")
    public static class487 field7375 = new class487("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lhaa;IIIII)V")
    public static final void method2948(class77 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field895 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class22.field199[arg1][var6][var7];
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
                        class323 var13 = class29.field260[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field895; var14++) {
                            if (arg0.field890[var14] == var13.field4799) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field890[arg0.field895++] = var13.field4799;
                        if (arg0.field895 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field895; var15 < 4; var15++) {
            arg0.field890[var15] = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static void method2949(byte arg0) {
        if (arg0 != 73) {
            method2948(null, 43, -128, -4, 4, -41);
        }
        field7372 = null;
        field7375 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
    public static final void method2950(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class94.field1158.field276 != arg1 && arg0 != 0 && class68.field779 < 50 && arg4 != -1) {
            class10.field94[class68.field779++] = new class585((byte) 1, arg4, arg0, arg3, arg2, 0);
        }
        field7373++;
    }
}
