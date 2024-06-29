import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class20 extends class145 {

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
    private int field201 = 585;

    @OriginalMember(owner = "client!qo", name = "J", descriptor = "I")
    public static int field200 = 0;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "Ltq;")
    public static class545 field197;

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "Ldw;")
    public static class622 field203;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BZ)V")
    public static final void method125(byte arg0, boolean arg1) {
        class308.method2044(class154.field1914, -7434);
        ++field196;
        int var2 = -105 / ((-8 - arg0) / 63);
        ++class356.field5067;
        for (class563 var3 = (class563) class234.field3309.method523(-114); var3 != null; var3 = (class563) class234.field3309.method530(12714)) {
            if (!var3.method2109(11574)) {
                var3 = (class563) class234.field3309.method523(75);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field8021 == 0) {
                class292.method1885(arg1, true, (byte) -72, var3);
            }
        }
        if (class636.field9141 != null) {
            class33.method187(class636.field9141, (byte) 115);
            class636.field9141 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 > -67) {
            field197 = null;
        }
        ++field199;
        if (arg0 == 0) {
            this.field201 = arg2.method1220(125);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method126(byte arg0) {
        field197 = null;
        field203 = null;
        int var1 = 116 / ((-63 - arg0) / 61);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
    public class20() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field198;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = class573.field8270[arg1];
            for (int var5 = 0; var5 < class647.field9368; ++var5) {
                int var6 = class601.field8779[var5];
                if (this.field201 < var6 && -this.field201 + 4096 > var6 && ~(-this.field201 + 2048) > ~var4 && ~(2048 - -this.field201) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field201 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field201 + 2048 && ~var6 > ~(this.field201 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field201;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field201 + 2048);
                } else if (~var4 <= ~this.field201 && var4 <= 4096 - this.field201) {
                    if (~this.field201 >= ~var6 && ~var6 >= ~(-this.field201 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field201 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field201;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field201);
                }
            }
        }
        if (arg0) {
            this.method28(44, 93, (class194) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
    public static final void method127(int arg0, int arg1) {
        int var2 = -28 % ((arg0 - 81) / 38);
        class406.field6127 = arg1;
        ++field202;
        class460.field6862.method1810(false);
    }
}
