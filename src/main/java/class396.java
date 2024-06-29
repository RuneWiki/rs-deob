import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class396 {

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    private int field5915 = -1;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Z")
    private boolean field5924 = true;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    private int field5918;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    private int field5914;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "[Lil;")
    private class48[] field5920;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    private int field5926;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    private int field5927;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "[Lil;")
    private class48[] field5922;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Lil;")
    private class48 field5913;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[I")
    public static int[] field5917 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    private int field5923;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "Ll;")
    private class127 field5928;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public final void method2378(int arg0) {
        field5921++;
        if (this.field5920 != null) {
            for (int var2 = 0; var2 < this.field5920.length; var2++) {
                this.field5920[var2].method360();
            }
        }
        if (arg0 < 30) {
            field5917 = null;
        }
        this.field5928 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lya;IZ)Z")
    public final boolean method2379(class11 arg0, int arg1, boolean arg2) {
        if (this.field5915 != arg1) {
            this.field5915 = arg1;
            int var4 = class143.method1039(8, arg1);
            if (arg1 < var4) {
                var4 = class45.method352((byte) -114, arg1);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field5923 != var4) {
                this.field5923 = var4;
                this.field5928 = null;
            }
            if (this.field5920 != null) {
                this.field5916 = 0;
                int[] var5 = new int[this.field5920.length];
                for (int var6 = 0; var6 < this.field5920.length; var6++) {
                    class48 var7 = this.field5920[var6];
                    if (var7.method362(this.field5918, this.field5926, this.field5927, this.field5915)) {
                        var5[this.field5916] = var7.field617;
                        this.field5922[this.field5916++] = var7;
                    }
                }
                class96.method754(this.field5916 - 1, var5, this.field5922, 0, (byte) 118);
            }
            this.field5924 = true;
        }
        field5925++;
        if (!arg2) {
            return false;
        }
        boolean var8 = false;
        if (this.field5924) {
            this.field5924 = false;
            for (int var9 = this.field5916 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5922[var9].method365(arg0, this.field5913);
                var8 |= var10;
                this.field5924 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public static void method2380(byte arg0) {
        field5917 = null;
        if (arg0 != 74) {
            field5917 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIIIIIIILya;)V")
    public final void method2381(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class11 arg9) {
        int var11 = arg2 + arg3 & 0x3FFF;
        field5919++;
        if (this.field5914 == -1) {
            arg9.method162(arg6, arg7, arg1, arg5, arg4, 0);
        } else {
            class161 var12 = class483.field7131.method1480(this.field5914, 14270);
            if (this.field5928 == null && class483.field7131.method1482((byte) 126, this.field5914)) {
                int[] var13 = var12.field2407 ? class483.field7131.method1484(110, false, this.field5923, 0.7F, this.field5914, this.field5923) : class483.field7131.method1481(false, 0.7F, 28907, this.field5914, this.field5923, this.field5923);
                this.field5928 = arg9.method103(var13, 0, this.field5923, this.field5923, this.field5923);
            }
            if (!var12.field2407) {
                arg9.method162(arg6, arg7, arg1, arg5, arg4, 0);
            }
            if (this.field5928 != null) {
                int var14 = var12.field2407 ? 0 : 1;
                int var15 = arg5 * arg8 / -4096;
                int var16;
                for (var16 = arg5 * var11 / 4096 + (arg1 - arg5) / 2; var16 > arg5; var16 -= arg5) {
                }
                while (var15 > arg5) {
                    var15 -= arg5;
                }
                while (var16 < 0) {
                    var16 += arg5;
                }
                while (var15 < 0) {
                    var15 += arg5;
                }
                for (int var17 = var16 - arg5; var17 < arg1; var17 += arg5) {
                    for (int var18 = var15 - arg5; var18 < arg5; var18 += arg5) {
                        this.field5928.method293(var17 + arg6, arg7 + var18, arg5, arg5, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field5916 - 1; var19 >= 0; var19--) {
            this.field5922[var19].method363(arg9, arg6, arg7, arg1, arg5, arg8, var11);
        }
        if (arg0 != 73) {
            this.field5926 = 109;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I[Lil;IIII)V")
    public class396(int arg0, class48[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5918 = arg3;
        this.field5914 = arg0;
        this.field5920 = arg1;
        this.field5926 = arg4;
        this.field5927 = arg5;
        if (arg1 == null) {
            this.field5922 = null;
            this.field5913 = null;
        } else {
            this.field5922 = new class48[arg1.length];
            this.field5913 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    static {
        new class347("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }
}
