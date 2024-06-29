import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class339 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Lpi;")
    public static class340 field4331 = new class340(66, -2);

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Lek;")
    public static class426 field4332 = new class426();

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Loi;")
    public static class169 field4333 = new class169("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "Loi;")
    public static class169 field4334 = new class169("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)I")
    public static final int method1997(int arg0, int arg1, int arg2) {
        if (arg0 != 1716918951) {
            return 96;
        }
        field4328++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)S")
    public static final short method1998(int arg0, byte arg1) {
        field4329++;
        int var2 = (arg0 & 0xFEBD) >> 10;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        if (arg1 != 30) {
            method2000(93);
        }
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIB[BI)Z")
    public static final boolean method1999(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        if (arg3 != 0) {
            method2000(-111);
        }
        field4330++;
        boolean var6 = true;
        class88 var7 = new class88(arg4);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method601((byte) -125);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class402 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method604(-9338);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method617(arg3 + 2);
                                    }
                                    int var12 = var7.method604(-9338);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method617(2) >> 2;
                                    var16 = arg2 + var14;
                                    var17 = arg1 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (arg5 - 1 <= var16);
                    } while (var17 >= (arg0 - 1));
                    var18 = class52.field715.method1164(var8, 0);
                } while (var15 == 22 && !class421.field5647.field7694 && var18.field5347 == 0 && var18.field5400 != 1 && !var18.field5412);
                var11 = true;
                if (!var18.method2387(false)) {
                    class207.field2691++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static void method2000(int arg0) {
        int var1 = 80 / ((-arg0 - 73) / 35);
        field4331 = null;
        field4334 = null;
        field4333 = null;
        field4332 = null;
    }
}
