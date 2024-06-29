import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class380 {

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field5358 = -1;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Z")
    private boolean field5365 = true;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    private int field5357;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    private int field5355;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    private int field5352;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[Lvs;")
    private class417[] field5366;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    private int field5361;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[Lvs;")
    private class417[] field5362;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lvs;")
    private class417 field5353;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field5368 = -1;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lff;")
    public static class9 field5354 = new class9(32);

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field5371 = -1;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    private int field5359;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    private int field5367;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lrs;")
    public static class462 field5363;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lf;")
    private class529 field5369;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Z")
    public static boolean field5370;

    static {
        new class83("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIILqa;III)V", line = 11)
    public final void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class162 arg6, int arg7, int arg8, int arg9) {
        field5356++;
        int var11 = arg0 + arg9 & 0x3FFF;
        if (~this.field5352 == arg4) {
            arg6.method459(arg8, arg1, arg7, arg3, arg2, 0);
        } else {
            class501 var12 = class54.field755.method830(this.field5352, (byte) 71);
            if (this.field5369 == null && class54.field755.method831(this.field5352, -61)) {
                int[] var13 = var12.field7381 ? class54.field755.method833(false, this.field5359, 0.7F, -12422, this.field5359, this.field5352) : class54.field755.method834(false, 0.7F, this.field5352, this.field5359, -80, this.field5359);
                this.field5369 = arg6.method476(var13, 0, this.field5359, this.field5359, this.field5359);
            }
            if (!var12.field7381) {
                arg6.method459(arg8, arg1, arg7, arg3, arg2, 0);
            }
            if (this.field5369 != null) {
                int var14 = var12.field7381 ? 0 : 1;
                int var15 = arg3 * arg5 / -4096;
                int var16;
                for (var16 = arg3 * var11 / 4096 + (arg7 - arg3) / 2; var16 > arg3; var16 -= arg3) {
                }
                while (arg3 < var15) {
                    var15 -= arg3;
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg7; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field5369.method119(arg8 + var17, arg1 + var18, arg3, arg3, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field5367 - 1; var19 >= 0; var19--) {
            this.field5362[var19].method2500(arg6, arg8, arg1, arg7, arg3, arg5, var11);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 89)
    public final void method2188(byte arg0) {
        if (this.field5366 != null) {
            for (int var2 = 0; var2 < this.field5366.length; var2++) {
                this.field5366[var2].method2497();
            }
        }
        if (arg0 != 50) {
            method2189(false);
        }
        field5364++;
        this.field5369 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 114)
    public static void method2189(boolean arg0) {
        if (arg0) {
            field5363 = null;
            field5354 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lqa;IB)Z", line = 125)
    public final boolean method2190(class162 arg0, int arg1, byte arg2) {
        if (this.field5358 != arg1) {
            this.field5358 = arg1;
            int var4 = class420.method2513(arg1, 0);
            if (arg1 < var4) {
                var4 = class305.method1730(arg1, arg2 ^ 0xCD8);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field5359 != var4) {
                this.field5359 = var4;
                this.field5369 = null;
            }
            if (this.field5366 != null) {
                this.field5367 = 0;
                int[] var5 = new int[this.field5366.length];
                for (int var6 = 0; var6 < this.field5366.length; var6++) {
                    class417 var7 = this.field5366[var6];
                    if (var7.method2494(this.field5357, this.field5355, this.field5361, this.field5358)) {
                        var5[this.field5367] = var7.field6094;
                        this.field5362[this.field5367++] = var7;
                    }
                }
                class254.method1492(var5, this.field5362, 0, 62, this.field5367 - 1);
            }
            this.field5365 = true;
        }
        field5360++;
        if (arg2 != 59) {
            method2189(false);
        }
        boolean var8 = false;
        if (this.field5365) {
            this.field5365 = false;
            for (int var9 = this.field5367 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5362[var9].method2499(arg0, this.field5353);
                this.field5365 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[Lvs;IIII)V", line = 223)
    public class380(int arg0, class417[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5357 = arg3;
        this.field5355 = arg4;
        this.field5352 = arg0;
        this.field5366 = arg1;
        this.field5361 = arg5;
        if (arg1 == null) {
            this.field5362 = null;
            this.field5353 = null;
        } else {
            this.field5362 = new class417[arg1.length];
            this.field5353 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
