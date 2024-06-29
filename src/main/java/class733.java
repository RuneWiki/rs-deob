import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class733 implements class103 {

    @OriginalMember(owner = "client!dka", name = "g", descriptor = "Lbw;")
    private class29 field10191 = new class29(256);

    @OriginalMember(owner = "client!dka", name = "e", descriptor = "Lgga;")
    private class513 field10189;

    @OriginalMember(owner = "client!dka", name = "j", descriptor = "Lgga;")
    private class513 field10194;

    @OriginalMember(owner = "client!dka", name = "f", descriptor = "I")
    private int field10190;

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "[Lhba;")
    private class719[] field10187;

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "Lvb;")
    public static class396 field10186 = new class396(9, 3);

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!dka", name = "d", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!dka", name = "h", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!dka", name = "i", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!dka", name = "k", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!dka", name = "l", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!dka", name = "m", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!dka", name = "n", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!dka", name = "o", descriptor = "I")
    public static int field10199;

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)I", line = 5)
    public final int method849(int arg0) {
        field10192++;
        if (arg0 != 12276) {
            this.method849(11);
        }
        return this.field10190;
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(IZ)Z", line = 16)
    public final boolean method846(int arg0, boolean arg1) {
        if (arg1) {
            field10193++;
            class709 var3 = this.method4059(arg0, false);
            return var3 != null && var3.method3956(this.field10194, (byte) 113, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(FIZBII)[I", line = 29)
    public final int[] method845(float arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 52) {
            this.method849(15);
        }
        field10197++;
        return this.method4059(arg1, false).method3953(arg4, true, (double) arg0, this, this.field10194, arg5, this.field10187[arg1].field10045);
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)V", line = 43)
    public static void method4058(int arg0) {
        field10186 = null;
        if (arg0 != 16589) {
            field10186 = null;
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(II)Lhba;", line = 59)
    public final class719 method847(int arg0, int arg1) {
        if (arg1 >= -90) {
            this.method849(-24);
        }
        field10196++;
        return this.field10187[arg0];
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(ZBFIII)[I", line = 72)
    public final int[] method844(boolean arg0, byte arg1, float arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= 104) {
            this.method4059(111, false);
        }
        field10195++;
        return this.method4059(arg4, false).method3955(this.field10194, this.field10187[arg4].field10045, this, arg3, arg0, (double) arg2, arg5, 0);
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lgga;Lgga;Lgga;)V", line = 121)
    public class733(class513 arg0, class513 arg1, class513 arg2) {
        this.field10189 = arg1;
        this.field10194 = arg2;
        class431 var4 = new class431(arg0.method3019(0, 0, 109));
        this.field10190 = var4.method2565((byte) -85);
        this.field10187 = new class719[this.field10190];
        for (int var5 = 0; var5 < this.field10190; var5++) {
            if (var4.method2557(14929) == 1) {
                this.field10187[var5] = new class719();
            }
        }
        for (int var6 = 0; var6 < this.field10190; var6++) {
            if (this.field10187[var6] != null) {
                this.field10187[var6].field10029 = var4.method2557(14929) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field10190; var7++) {
            if (this.field10187[var7] != null) {
                this.field10187[var7].field10044 = var4.method2557(14929) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field10190; var8++) {
            if (this.field10187[var8] != null) {
                this.field10187[var8].field10033 = var4.method2557(14929) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field10190; var9++) {
            if (this.field10187[var9] != null) {
                this.field10187[var9].field10043 = var4.method2529(50);
            }
        }
        for (int var10 = 0; var10 < this.field10190; var10++) {
            if (this.field10187[var10] != null) {
                this.field10187[var10].field10046 = var4.method2529(119);
            }
        }
        for (int var11 = 0; var11 < this.field10190; var11++) {
            if (this.field10187[var11] != null) {
                this.field10187[var11].field10031 = var4.method2529(112);
            }
        }
        for (int var12 = 0; var12 < this.field10190; var12++) {
            if (this.field10187[var12] != null) {
                this.field10187[var12].field10036 = var4.method2529(74);
            }
        }
        for (int var13 = 0; var13 < this.field10190; var13++) {
            if (this.field10187[var13] != null) {
                this.field10187[var13].field10035 = (short) var4.method2565((byte) -96);
            }
        }
        for (int var14 = 0; var14 < this.field10190; var14++) {
            if (this.field10187[var14] != null) {
                this.field10187[var14].field10028 = var4.method2529(123);
            }
        }
        for (int var15 = 0; var15 < this.field10190; var15++) {
            if (this.field10187[var15] != null) {
                this.field10187[var15].field10038 = var4.method2529(61);
            }
        }
        for (int var16 = 0; var16 < this.field10190; var16++) {
            if (this.field10187[var16] != null) {
                this.field10187[var16].field10030 = var4.method2557(14929) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field10190; var17++) {
            if (this.field10187[var17] != null) {
                this.field10187[var17].field10045 = var4.method2557(14929) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field10190; var18++) {
            if (this.field10187[var18] != null) {
                this.field10187[var18].field10034 = var4.method2529(84);
            }
        }
        for (int var19 = 0; var19 < this.field10190; var19++) {
            if (this.field10187[var19] != null) {
                this.field10187[var19].field10032 = var4.method2557(14929) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field10190; var20++) {
            if (this.field10187[var20] != null) {
                this.field10187[var20].field10048 = var4.method2557(14929) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field10190; var21++) {
            if (this.field10187[var21] != null) {
                this.field10187[var21].field10049 = var4.method2557(14929) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field10190; var22++) {
            if (this.field10187[var22] != null) {
                this.field10187[var22].field10039 = var4.method2557(14929);
            }
        }
        for (int var23 = 0; var23 < this.field10190; var23++) {
            if (this.field10187[var23] != null) {
                this.field10187[var23].field10040 = var4.method2526(17);
            }
        }
        for (int var24 = 0; var24 < this.field10190; var24++) {
            if (this.field10187[var24] != null) {
                this.field10187[var24].field10042 = var4.method2557(14929);
            }
        }
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(IZ)Lnl;", line = 87)
    private final class709 method4059(int arg0, boolean arg1) {
        field10185++;
        class454 var3 = this.field10191.method245(4768, (long) arg0);
        if (var3 != null) {
            return (class709) var3;
        }
        byte[] var4 = this.field10189.method2988(arg0, 0);
        if (var4 == null) {
            return null;
        }
        class709 var5 = new class709(new class431(var4));
        if (arg1) {
            return null;
        } else {
            this.field10191.method243((byte) -4, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(IBZIFI)[F", line = 111)
    public final float[] method848(int arg0, byte arg1, boolean arg2, int arg3, float arg4, int arg5) {
        int var7 = 106 / ((-arg1 - 1) / 56);
        field10188++;
        return this.method4059(arg5, false).method3954(this.field10194, (byte) -97, this.field10187[arg5].field10045, arg0, arg3, this);
    }
}
