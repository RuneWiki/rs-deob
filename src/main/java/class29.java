import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class29 extends class47 implements class218 {

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "Lco;")
    public class201 field379;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "Z")
    private boolean field386;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Lsh;")
    public static class472 field378 = new class472(83, -1);

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "Lsh;")
    public static class472 field393;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "Lct;")
    public static class285 field396;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "Lo;")
    public static class332 field400;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "Lo;")
    public static class332 field402;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Lct;")
    public static class285 field404;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "Lis;")
    public static class1 field401;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Lqm;")
    public static class262 field399;

    static {
        new class332("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field393 = new class472(35, 7);
        field396 = new class285(64, -1);
        field400 = new class332("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");
        field403 = 10;
        field402 = new class332("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
        field404 = new class285(37, 7);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ltq;Lvc;IIIIIZII)V", line = 3)
    public class29(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field4042, arg1.field4006);
        this.field379 = new class201(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field386 = ~arg1.field4053 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)Z", line = 12)
    public static final boolean method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field383;
        int var6 = arg1;
        int var7 = 98 % ((arg4 - -80) / 37);
        while (arg5 >= var6) {
            for (int var8 = arg2; arg0 >= var8; ++var8) {
                if (~class406.field5898[var6][var8] == ~arg3 && class324.field4870[var6][var8] <= 1) {
                    return true;
                }
            }
            ++var6;
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)I", line = 44)
    public final int method244(byte arg0) {
        if (arg0 > -8) {
            this.method244((byte) -15);
        }
        ++field384;
        return this.field379.field3065;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 57)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= -41) {
            this.method245((byte) 114, false, (class63) null, (class352) null, 80, -36, -75);
        }
        ++field388;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ltq;IIIIIIIIILns;)Lns;", line = 69)
    public static final class57 method246(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10) {
        if (arg7 > -24) {
            method248(-60);
        }
        ++field381;
        long var11 = (long) arg5;
        class57 var13 = (class57) class122.field1684.method2393(-127, var11);
        short var14 = 1031;
        if (var13 == null) {
            class246 var15 = class340.method2085((byte) 77, arg5, class231.field3398, 0);
            if (var15 == null) {
                return null;
            }
            var13 = arg0.method555(var15, var14, class48.field693, 64, 768);
            class122.field1684.method2395(0, var13, var11);
        }
        class57 var16 = var13.method437((byte) 2, var14, true);
        if (~arg9 != -1) {
            var16.method444(arg9);
        }
        if (~arg4 != -1) {
            var16.method421(arg4);
        }
        if (arg6 != 0) {
            var16.method419(arg6);
        }
        if (~arg8 != -1) {
            var16.method407(0, arg8, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V", line = 114)
    public final void method247(boolean arg0) {
        if (arg0) {
            field402 = null;
        }
        ++field382;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V", line = 124)
    public static void method248(int arg0) {
        field378 = null;
        if (arg0 != 141456743) {
            field401 = null;
        }
        field401 = null;
        field396 = null;
        field399 = null;
        field404 = null;
        field400 = null;
        field402 = null;
        field393 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 141)
    public final void method249(int arg0) {
        ++field380;
        if (arg0 < 56) {
            field399 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)I", line = 157)
    public final int method250(byte arg0) {
        int var2 = 81 / ((-49 - arg0) / 60);
        ++field397;
        return this.field379.field3064;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[Ljava/lang/Object;[IZI)V", line = 169)
    public static final void method251(int arg0, Object[] arg1, int[] arg2, boolean arg3, int arg4) {
        ++field395;
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg4; ~var9 > ~arg0; ++var9) {
                if (arg2[var9] < (var9 & 1) + var7) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method251(var6 + -1, arg1, arg2, false, arg4);
            method251(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg3) {
            field399 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Ltq;I)Lcj;", line = 224)
    public final class123 method252(class63 arg0, int arg1) {
        ++field391;
        class57 var3 = this.field379.method1369(true, super.field677, arg0, -12, false, super.field680, 1024);
        if (var3 == null) {
            return null;
        } else {
            class315 var4 = arg0.method565();
            var4.method482(super.field680, super.field681, super.field677);
            class123 var5 = null;
            if (this.field386) {
                var5 = class225.method1462(1, -54);
            }
            if (this.field379.field3055 == null) {
                var3.method404(var4, var5 != null ? var5.field1695[0] : null, 0);
            } else {
                class268 var6 = this.field379.field3055.method459();
                arg0.method552(var3, var6, var4, var5 != null ? var5.field1695[0] : null, 0);
            }
            this.field379.method1364(arg0, var3, super.field677 >> 7, super.field680 >> 7, super.field677 >> 7, super.field680 >> 7, true, -16777216);
            if (arg1 != 2) {
                method243(-1, -115, 100, -97, 78, -95);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)Z", line = 265)
    public final boolean method253(int arg0) {
        ++field392;
        if (arg0 >= -9) {
            this.method255((byte) -37, -70, (class63) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Z", line = 285)
    public final boolean method254(boolean arg0) {
        ++field390;
        if (!arg0) {
            this.method250((byte) 9);
        }
        return this.field379.method1370(7);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILtq;)Lns;", line = 297)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        ++field377;
        if (arg0 <= 108) {
            this.method256((byte) -15, (class63) null);
        }
        return this.field379.method1369(false, 0, arg2, -12, false, 0, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLtq;)V", line = 310)
    public final void method256(byte arg0, class63 arg1) {
        ++field394;
        if (arg0 != 82) {
            method251(93, (Object[]) null, (int[]) null, true, -66);
        }
        this.field379.method1368((byte) 94, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(Z)I", line = 321)
    public final int method257(boolean arg0) {
        ++field389;
        return arg0 ? -40 : this.field379.field3063;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ltq;I)V", line = 332)
    public final void method258(class63 arg0, int arg1) {
        this.field379.method1363(-1, arg0);
        ++field398;
        if (arg1 != -22360) {
            field404 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ltq;III)Z", line = 346)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        ++field385;
        class57 var5 = this.field379.method1369(false, super.field677, arg0, -12, false, super.field680, 65536);
        if (var5 == null) {
            return false;
        } else {
            int var6 = -55 % ((-59 - arg2) / 58);
            class315 var7 = arg0.method565();
            var7.method482(super.field680, super.field681, super.field677);
            return var5.method423(arg1, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILtq;)V", line = 365)
    public final void method260(int arg0, class63 arg1) {
        ++field387;
        class57 var3 = this.field379.method1369(true, super.field677, arg1, arg0 ^ -12, true, super.field680, 131072);
        if (arg0 != 0) {
            this.method247(false);
        }
        if (var3 != null) {
            this.field379.method1364(arg1, var3, super.field677 >> 7, super.field680 >> 7, super.field677 >> 7, super.field680 >> 7, false, -16777216);
        }
    }
}
