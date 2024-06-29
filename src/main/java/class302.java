import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class302 {

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "Lco;")
    private class210 field4479 = new class210(128);

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Lco;")
    public class210 field4486 = new class210(64);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "Lg;")
    private class470 field4477;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "Lg;")
    public class470 field4485;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "Lec;")
    public static class40 field4484 = new class40("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "Lec;")
    public static class40 field4487;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public final void method1892(byte arg0) {
        field4482++;
        class210 var2 = this.field4479;
        synchronized (this.field4479) {
            this.field4479.method1165((byte) 118);
        }
        if (arg0 == -19) {
            class210 var3 = this.field4486;
            synchronized (this.field4486) {
                this.field4486.method1165((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZI)V")
    public final void method1893(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field4486 = null;
        }
        field4481++;
        this.field4479 = new class210(arg2);
        this.field4486 = new class210(arg0);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V")
    public final void method1894(int arg0, byte arg1) {
        class210 var3 = this.field4479;
        synchronized (this.field4479) {
            this.field4479.method1166(arg0, (byte) -52);
        }
        field4478++;
        class210 var4 = this.field4486;
        synchronized (this.field4486) {
            if (arg1 >= 78) {
                this.field4486.method1166(arg0, (byte) -52);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
    public static void method1895(byte arg0) {
        int var1 = 13 % ((arg0 - 29) / 59);
        field4484 = null;
        field4487 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lda;)V")
    public static final void method1896(class326 arg0) {
        if (class10.field129 >= 65535) {
            return;
        }
        class364.field5236[class10.field129] = arg0;
        class323.field4671[class10.field129] = false;
        class10.field129++;
        int var1 = arg0.field4692;
        if (arg0.field4691) {
            var1 = 0;
        }
        int var2 = arg0.field4692;
        if (arg0.field4694) {
            var2 = class346.field4937 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field2605 + class137.field1663 - arg0.field2601 >> class482.field6812;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field2605 + arg0.field2601 - class137.field1663 >> class482.field6812;
            if (var6 >= class225.field3116) {
                var6 = class225.field3116 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field4702[var4++];
                int var9 = (var8 >>> 8) + (arg0.field2607 + class137.field1663 - arg0.field2601 >> class482.field6812);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class176.field2122) {
                    var10 = class176.field2122 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    long var12 = class382.field5424[var3][var11][var7];
                    if ((var12 & 0xFFFFL) == 0L) {
                        class382.field5424[var3][var11][var7] = var12 | (long) class10.field129;
                    } else if ((var12 & 0xFFFF0000L) == 0L) {
                        class382.field5424[var3][var11][var7] = var12 | (long) class10.field129 << 16;
                    } else if ((var12 & 0xFFFF00000000L) == 0L) {
                        class382.field5424[var3][var11][var7] = var12 | (long) class10.field129 << 32;
                    } else if ((var12 & 0xFFFF000000000000L) == 0L) {
                        class382.field5424[var3][var11][var7] = var12 | (long) class10.field129 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)V")
    public final void method1897(byte arg0) {
        field4483++;
        class210 var2 = this.field4479;
        synchronized (this.field4479) {
            this.field4479.method1169(1076);
        }
        class210 var3 = this.field4486;
        synchronized (this.field4486) {
            if (arg0 <= -103) {
                this.field4486.method1169(1076);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Lso;")
    public final class334 method1898(int arg0, int arg1) {
        field4480++;
        class210 var3 = this.field4479;
        class334 var4;
        synchronized (this.field4479) {
            var4 = (class334) this.field4479.method1163((byte) 120, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4477.method2768(-20472, arg1, arg0);
        class334 var6 = new class334();
        var6.field4800 = arg1;
        var6.field4787 = this;
        if (var5 != null) {
            var6.method2027(new class179(var5), (byte) -116);
        }
        var6.method2020((byte) 104);
        class210 var7 = this.field4479;
        synchronized (this.field4479) {
            this.field4479.method1172((long) arg1, arg0 - 35, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lci;ILg;Lg;)V")
    public class302(class421 arg0, int arg1, class470 arg2, class470 arg3) {
        this.field4477 = arg2;
        this.field4485 = arg3;
        this.field4477.method2755(-82, 36);
    }

    static {
        new class40("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field4487 = new class40("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
    }
}
