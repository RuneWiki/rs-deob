import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class567 {

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lkb;")
    private class601 field8146 = new class601();

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lea;")
    public static class474 field8143 = new class474(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lkca;")
    public static class73 field8145 = new class73(36, 4);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Lkb;")
    private class601 field8150;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
    public final int method3288(byte arg0) {
        field8140++;
        int var2 = 87 / ((19 - arg0) / 60);
        int var3 = 0;
        class601 var4 = this.field8146.field8771;
        while (this.field8146 != var4) {
            var4 = var4.field8771;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([[BI[[B[II[II[B)I")
    public static final int method3289(byte[][] arg0, int arg1, byte[][] arg2, int[] arg3, int arg4, int[] arg5, int arg6, byte[] arg7) {
        field8144++;
        int var8 = 89 % ((-arg4 - 26) / 63);
        int var9 = arg5[arg6];
        int var10 = arg3[arg6] + var9;
        int var11 = arg5[arg1];
        int var12 = arg3[arg1] + var11;
        int var13 = var9;
        if (var9 < var11) {
            var13 = var11;
        }
        int var14 = var10;
        if (var12 < var10) {
            var14 = var12;
        }
        int var15 = arg7[arg6] & 0xFF;
        if ((arg7[arg1] & 0xFF) < var15) {
            var15 = arg7[arg1] & 0xFF;
        }
        byte[] var16 = arg0[arg6];
        byte[] var17 = arg2[arg1];
        int var18 = var13 - var9;
        int var19 = var13 - var11;
        for (int var20 = var13; var20 < var14; var20++) {
            int var21 = var17[var19++] + var16[var18++];
            if (var21 < var15) {
                var15 = var21;
            }
        }
        return -var15;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Lkb;")
    public final class601 method3290(int arg0) {
        field8139++;
        class601 var2 = this.field8146.field8771;
        if (this.field8146 == var2) {
            return null;
        } else {
            var2.method3488(false);
            return arg0 == 255 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Z")
    public final boolean method3291(int arg0) {
        field8138++;
        int var2 = 112 % ((-arg0 - 24) / 57);
        return this.field8146.field8771 == this.field8146;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static void method3292(int arg0) {
        field8143 = null;
        if (arg0 <= -14) {
            field8145 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lkb;B)V")
    public final void method3293(class601 arg0, byte arg1) {
        field8149++;
        if (arg0.field8777 != null) {
            arg0.method3488(false);
        }
        arg0.field8777 = this.field8146.field8777;
        if (arg1 < 61) {
            this.method3297((byte) -73);
        }
        arg0.field8771 = this.field8146;
        arg0.field8777.field8771 = arg0;
        arg0.field8771.field8777 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Lkb;")
    public final class601 method3294(boolean arg0) {
        field8141++;
        class601 var2 = this.field8146.field8777;
        if (arg0) {
            field8143 = null;
        }
        if (this.field8146 == var2) {
            this.field8150 = null;
            return null;
        } else {
            this.field8150 = var2.field8777;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public final void method3295(byte arg0) {
        field8148++;
        while (true) {
            class601 var2 = this.field8146.field8771;
            if (this.field8146 == var2) {
                this.field8150 = null;
                if (arg0 >= -14) {
                    this.method3297((byte) -62);
                    return;
                } else {
                    return;
                }
            }
            var2.method3488(false);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)Lkb;")
    public final class601 method3296(byte arg0) {
        if (arg0 >= -103) {
            return null;
        }
        field8142++;
        class601 var2 = this.field8150;
        if (this.field8146 == var2) {
            this.field8150 = null;
            return null;
        } else {
            this.field8150 = var2.field8771;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Lkb;")
    public final class601 method3297(byte arg0) {
        if (arg0 <= 82) {
            this.field8146 = null;
        }
        field8147++;
        class601 var2 = this.field8146.field8771;
        if (this.field8146 == var2) {
            this.field8150 = null;
            return null;
        } else {
            this.field8150 = var2.field8771;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class567() {
        this.field8146.field8771 = this.field8146;
        this.field8146.field8777 = this.field8146;
    }
}
