import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class645 extends class194 {

    @OriginalMember(owner = "client!kr", name = "Lb", descriptor = "Lsd;")
    public static class80 field9296 = new class80(8);

    @OriginalMember(owner = "client!kr", name = "T", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!kr", name = "Gb", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!kr", name = "Hb", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!kr", name = "Ib", descriptor = "I")
    private int field9293;

    @OriginalMember(owner = "client!kr", name = "Jb", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!kr", name = "Kb", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!kr", name = "Mb", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!kr", name = "Nb", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!kr", name = "Ob", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!kr", name = "Pb", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!kr", name = "Qb", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!kr", name = "Rb", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!kr", name = "Sb", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!kr", name = "Ub", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!kr", name = "Tb", descriptor = "Lqca;")
    private class98 field9304;

    static {
        new class474("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "(I)V", line = 3)
    public final void method3668(int arg0) {
        this.field9293 = super.field2610 * 8;
        ++field9295;
        int var2 = -111 % ((arg0 - 20) / 63);
    }

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "(I)Z", line = 17)
    public final boolean method3669(int arg0) {
        ++field9299;
        int var2 = super.field2622[super.field2610] - this.field9304.method613((byte) -7) & arg0;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "(I)V", line = 35)
    public final void method3670(int arg0) {
        ++field9298;
        super.field2610 = (this.field9293 + 7) / arg0;
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(IB)I", line = 45)
    public final int method3671(int arg0, byte arg1) {
        ++field9302;
        int var3 = this.field9293 >> 3;
        int var4 = -(this.field9293 & 7) + 8;
        int var5 = 0;
        this.field9293 += arg0;
        while (arg0 > var4) {
            var5 += (class367.field5542[var4] & super.field2622[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field2622[var3] >> -arg0 + var4 & class367.field5542[arg0]) + var5;
        } else {
            var6 = (class367.field5542[var4] & super.field2622[var3]) + var5;
        }
        if (arg1 != 17) {
            this.field9293 = -77;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "(I)Z", line = 78)
    public static final boolean method3672(int arg0) {
        ++field9303;
        if (arg0 != -1645761693) {
            method3676(-40, -128, (byte) 41, -5, (class327) null);
        }
        return class290.field4016;
    }

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "(Z)V", line = 89)
    public static void method3673(boolean arg0) {
        field9296 = null;
        if (!arg0) {
            field9296 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)V", line = 99)
    public static final void method3674(int arg0, int arg1, int arg2) {
        ++field9292;
        class467 var3 = class541.method3144(arg0, (byte) -99, 13);
        var3.method2851(true);
        var3.field6926 = arg1;
        if (arg2 <= 71) {
            method3674(101, 71, 63);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[IIII)V", line = 116)
    public static final void method3675(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        --arg3;
        ++field9305;
        int var8 = arg4 - 1;
        int var5 = -7 + var8;
        while (~var5 < ~arg3) {
            int var6 = arg3 + 1;
            arg1[var6] = arg2;
            int var7 = var6 + 1;
            arg1[var7] = arg2;
            int var9 = var7 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg3 = var13 + 1;
            arg1[arg3] = arg2;
        }
        if (arg0 >= 87) {
            while (var8 > arg3) {
                ++arg3;
                arg1[arg3] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIBILba;)Lew;", line = 145)
    public static final class425 method3676(int arg0, int arg1, byte arg2, int arg3, class327 arg4) {
        ++field9301;
        if (arg2 >= -6) {
            return null;
        } else {
            return arg4 == null ? null : new class425(arg3, arg1, arg0, arg4.method1360(), arg4.method1349(), arg4.method1402(), arg4.method1379(), arg4.method1352(), arg4.method1383(), arg4.method1374());
        }
    }

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "(II)V", line = 163)
    public final void method3677(int arg0, int arg1) {
        if (arg0 <= -23) {
            super.field2622[super.field2610++] = (byte) (arg1 + this.field9304.method609(256));
            ++field9290;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[I)V", line = 175)
    public final void method3678(int arg0, int[] arg1) {
        if (arg0 == 4165) {
            this.field9304 = new class98(arg1);
            ++field9291;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI[BI)V", line = 187)
    public final void method3679(byte arg0, int arg1, byte[] arg2, int arg3) {
        ++field9300;
        for (int var5 = 0; arg1 > var5; ++var5) {
            arg2[arg3 + var5] = (byte) (super.field2622[super.field2610++] + -this.field9304.method609(arg0 + 133));
        }
        if (arg0 != 123) {
            method3676(79, 33, (byte) 125, -44, (class327) null);
        }
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "(Z)I", line = 204)
    public final int method3680(boolean arg0) {
        ++field9297;
        int var2 = 255 & super.field2622[super.field2610++] + -this.field9304.method609(256);
        if (!arg0) {
            this.field9304 = null;
        }
        return ~var2 > -129 ? var2 : (255 & super.field2622[super.field2610++] - this.field9304.method609(256)) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V", line = 223)
    public class645(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "(II)I", line = 226)
    public final int method3681(int arg0, int arg1) {
        int var3 = 12 % ((arg0 - -28) / 35);
        ++field9294;
        return arg1 * 8 + -this.field9293;
    }
}
