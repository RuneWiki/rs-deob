import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class285 {

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public int field3764 = 443;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Z")
    private boolean field3770 = false;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Z")
    private boolean field3766 = false;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public int field3773 = 43594;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "[I")
    public static int[] field3763 = new int[13];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lga;")
    public static class332 field3762;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Ljava/lang/String;")
    public String field3772;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILgba;)Lba;")
    public final class661 method1689(int arg0, class388 arg1) {
        field3768++;
        if (arg0 != -10520) {
            this.method1694(126);
        }
        return arg1.method2235(this.field3770, false, this.field3766 ? this.field3764 : this.field3773, this.field3772);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
    public static final void method1690(int arg0, int arg1) {
        field3761++;
        if (arg1 > 91) {
            class256 var2 = class592.method3279((byte) -121, 5, arg0);
            var2.method1546((byte) 125);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[IIII)V")
    public static final void method1691(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3765++;
        arg3--;
        int var6 = arg0 - 1;
        int var5 = arg2 + var6;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg3 = var13 + 1;
            arg1[arg3] = arg4;
        }
        while (var6 > arg3) {
            arg3++;
            arg1[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljm;I)Z")
    public final boolean method1692(class285 arg0, int arg1) {
        if (arg1 != -30935) {
            method1693(-36);
        }
        field3771++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field3769 == arg0.field3769 && this.field3772.equals(arg0.field3772);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method1693(int arg0) {
        if (arg0 <= 82) {
            field3763 = null;
        }
        field3763 = null;
        field3762 = null;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public final void method1694(int arg0) {
        field3767++;
        if (arg0 != 5) {
            method1693(-71);
        }
        if (!this.field3766) {
            this.field3766 = true;
            this.field3770 = true;
        } else if (this.field3770) {
            this.field3770 = false;
        } else {
            this.field3766 = false;
        }
    }
}
