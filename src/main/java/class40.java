import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class40 extends class43 {

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lcq;")
    public static class72 field469 = new class72("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "Lcq;")
    public static class72 field479 = new class72("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field480 = 0;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "Z")
    public static boolean field482 = true;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "J")
    public static volatile long field483 = 0L;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "Laq;")
    public static class453 field485 = null;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "[I")
    public int[] field473;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[I")
    public int[] field474;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[I")
    public int[] field478;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "[Lph;")
    public class315[] field470;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[Lph;")
    public class315[] field475;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "[[[B")
    public byte[][][] field476;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 8)
    public static void method253(int arg0) {
        field479 = null;
        field469 = null;
        if (arg0 < 41) {
            method253(61);
        }
        field485 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Z", line = 23)
    public static final boolean method254(int arg0, int arg1, int arg2, int arg3) {
        if (!class361.method2272(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class304.field4096[arg0].method1050(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class437.field5999) {
                    if (!class423.method2593(var4, var6, var5)) {
                        return false;
                    }
                    if (!class423.method2593(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class423.method2593(var4, var7, var5)) {
                        return false;
                    }
                    if (!class423.method2593(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class423.method2593(var4, var8, var5)) {
                    return false;
                }
                if (!class423.method2593(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class278.field3599) {
                    if (!class423.method2593(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class423.method2593(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class423.method2593(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class423.method2593(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class423.method2593(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class423.method2593(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class437.field5999) {
                    if (!class423.method2593(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class423.method2593(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class423.method2593(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class423.method2593(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class423.method2593(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class423.method2593(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class278.field3599) {
                    if (!class423.method2593(var4, var6, var5)) {
                        return false;
                    }
                    if (!class423.method2593(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class423.method2593(var4, var7, var5)) {
                        return false;
                    }
                    if (!class423.method2593(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class423.method2593(var4, var8, var5)) {
                    return false;
                }
                if (!class423.method2593(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class423.method2593(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class423.method2593(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class423.method2593(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class423.method2593(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class423.method2593(var4, var8, var5);
        } else {
            return true;
        }
    }
}
