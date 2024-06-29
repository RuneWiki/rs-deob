import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class55 implements class267 {

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Ldf;")
    private class177 field815 = new class177(256);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lrn;")
    private class18 field809;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lrn;")
    private class18 field818;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[Lek;")
    private class232[] field811;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "J")
    public static volatile long field814 = 0L;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    public static int[] field807 = new int[200];

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lrn;Lrn;IIZ)Lqk;", line = 4)
    public static final class70 method529(class18 arg0, class18 arg1, int arg2, int arg3, boolean arg4) {
        field808++;
        if (class282.method2056(arg2, 0, arg0, arg3)) {
            return arg4 ? (class70) null : class23.method240(-117, arg1.method187(arg3, arg2, -1));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Z", line = 31)
    public final boolean method530(byte arg0, int arg1) {
        field817++;
        int var3 = 75 / ((arg0 - 69) / 57);
        class326 var4 = this.method533(arg1, -11334);
        return var4 != null && var4.method2315(this, -4624, this.field818);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(BI)Lek;", line = 45)
    public final class232 method531(byte arg0, int arg1) {
        if (arg0 != -44) {
            field814 = -1L;
        }
        field812++;
        return this.field811[arg1];
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V", line = 59)
    public static void method532(boolean arg0) {
        field807 = null;
        if (arg0) {
            field814 = 115L;
        }
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(II)Ln;", line = 70)
    public class326 method533(int arg0, int arg1) {
        class320 var3 = this.field815.method1386(-1, (long) arg0);
        field813++;
        if (var3 != null) {
            return (class326) var3;
        }
        byte[] var4 = this.field809.method203(arg0, (byte) 47);
        if (arg1 != -11334) {
            this.field818 = (class18) null;
        }
        if (var4 == null) {
            return null;
        } else {
            class326 var5 = new class326(new class25(var4));
            this.field815.method1385(var5, (byte) -30, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FZIIBI)[I", line = 96)
    public final int[] method534(float arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 == -127) {
            field816++;
            return this.method533(arg3, -11334).method2313(-108, this, this.field818, arg1, arg5, (double) arg0, this.field811[arg3].field3614, arg2);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lrn;Lrn;Lrn;)V", line = 119)
    public class55(class18 arg0, class18 arg1, class18 arg2) {
        this.field809 = arg1;
        this.field818 = arg2;
        class25 var4 = new class25(arg0.method187(0, 0, -1));
        int var5 = var4.method314((byte) 45);
        this.field811 = new class232[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method281(-126) == 1) {
                this.field811[var6] = new class232();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field811[var7] != null) {
                this.field811[var7].field3612 = var4.method281(-128) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field811[var8] != null) {
                this.field811[var8].field3626 = var4.method281(-124) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field811[var9] != null) {
                this.field811[var9].field3617 = var4.method281(58) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field811[var10] != null) {
                this.field811[var10].field3618 = var4.method281(2) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field811[var11] != null) {
                this.field811[var11].field3620 = var4.method286((byte) 105);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field811[var12] != null) {
                this.field811[var12].field3613 = var4.method286((byte) 112);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field811[var13] != null) {
                this.field811[var13].field3625 = var4.method286((byte) 105);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field811[var14] != null) {
                this.field811[var14].field3623 = var4.method286((byte) 88);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field811[var15] != null) {
                this.field811[var15].field3622 = (short) var4.method314((byte) 118);
            }
        }
        if (var4.field397 < var4.field448.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field811[var16] != null) {
                    var4.method286((byte) 113);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field811[var17] != null) {
                    var4.method286((byte) 99);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field811[var18] != null) {
                    var4.method281(-127);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field811[var19] != null) {
                    this.field811[var19].field3614 = var4.method281(-128) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field811[var20] != null) {
                    var4.method286((byte) 87);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field811[var21] != null) {
                    var4.method281(72);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field811[var22] != null) {
                    var4.method281(33);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field811[var23] != null) {
                    var4.method281(3);
                }
            }
        }
    }
}
