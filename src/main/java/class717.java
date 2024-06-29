import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class717 implements class187 {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lie;")
    private class6 field10047;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "[Lrea;")
    private class209[] field10055;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[I")
    public static int[] field10051 = new int[3];

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field10045;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lha;")
    private class60 field10048;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Z")
    private boolean field10052;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I")
    public final int method1051(int arg0) {
        if (arg0 == -24591) {
            field10054++;
            return this.field10047.field44;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
    public final void method1053(int arg0) {
        if (class21.field142 != this.field10048) {
            this.field10052 = true;
            this.field10048 = class21.field142;
        }
        field10046++;
        this.field10048.method402(0);
        class209[] var2 = this.field10055;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class209 var4 = var2[var3];
            if (var4 != null) {
                var4.method184((byte) -43);
            }
        }
        if (arg0 != -31295) {
            this.method1050(75);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V")
    public final void method1049(int arg0, boolean arg1) {
        boolean var3 = true;
        field10053++;
        class209[] var4 = this.field10055;
        int var5 = 0;
        if (arg0 != 32210) {
            this.field10048 = null;
        }
        while (var5 < var4.length) {
            class209 var6 = var4[var5];
            if (var6 != null) {
                var6.method182(var3 || this.field10052, (byte) -124);
            }
            var5++;
        }
        this.field10052 = false;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IJ)Z")
    public final boolean method1054(int arg0, long arg1) {
        field10050++;
        int var4 = -16 / ((-arg0 - 13) / 50);
        return class538.method2963(-47) >= ((long) this.field10047.field42 + arg1);
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)I")
    public final int method1052(int arg0) {
        field10049++;
        int var2 = 0;
        class209[] var3 = this.field10055;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class209 var5 = var3[var4];
            if (var5 == null || var5.method183(14017)) {
                var2++;
            }
        }
        if (arg0 != -794) {
            this.field10055 = null;
        }
        return var2 * 100 / this.field10055.length;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public final void method1050(int arg0) {
        if (arg0 != -26363) {
            this.method1049(-118, false);
        }
        field10045++;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lie;Lvu;)V")
    public class717(class6 arg0, class341 arg1) {
        this.field10047 = arg0;
        this.field10055 = new class209[this.field10047.field43.length];
        for (int var3 = 0; var3 < this.field10055.length; var3++) {
            this.field10055[var3] = arg1.method2012((byte) 62, this.field10047.field43[var3]);
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
    public static void method4040(int arg0) {
        field10051 = null;
        if (arg0 != 3) {
            method4040(-119);
        }
    }
}
