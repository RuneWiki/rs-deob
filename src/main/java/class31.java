import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class31 extends class23 {

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    private int field619 = 4096;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    private int field622 = 4096;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    private int field624 = 4096;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "Ldc;")
    public static class37 field616 = class185.method1233((byte) 86, "<img=1>");

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "Ldc;")
    public static class37 field623 = class185.method1233((byte) 86, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Ldc;")
    public static class37 field618 = null;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "[I")
    public static int[] field617 = new int[4096];

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Ldc;")
    public static class37 field627;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "Ldc;")
    private static class37 field629;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Ldc;")
    public static class37 field626;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "D")
    public static double field632;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "Lm;")
    public static class130 field615;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "Lmf;")
    public static class136 field628;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "Z")
    public static boolean field631;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public static void method258(boolean arg0) {
        field615 = null;
        field629 = null;
        field623 = null;
        if (arg0) {
            field627 = null;
            field618 = null;
            field616 = null;
            field617 = null;
            field626 = null;
            field628 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)I")
    public static final int method259(int arg0, int arg1) {
        if (arg0 != -21502) {
            field629 = null;
        }
        ++field620;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field625;
        int[][] var3 = super.field398.method1522(arg1 + -29668, arg0);
        if (super.field398.field4303) {
            int[][] var4 = this.method159(0, (byte) -82, arg0);
            int[] var5 = var3[2];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class199.field3705; ++var11) {
                int var12 = var10[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field622 * var12 >> 12;
                    var9[var11] = this.field619 * var13 >> 12;
                    var5[var11] = this.field624 * var14 >> 12;
                } else {
                    var8[var11] = this.field622;
                    var9[var11] = this.field619;
                    var5[var11] = this.field624;
                }
            }
        }
        return arg1 != 9 ? null : var3;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class31() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field624 = arg0.method230((byte) -98);
                }
            } else {
                this.field619 = arg0.method230((byte) -114);
            }
        } else {
            this.field622 = arg0.method230((byte) -100);
        }
        ++field621;
        if (arg2 != 1000) {
            method259(102, -112);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field617[var0] = class121.method826(var0, true);
        }
        field627 = class185.method1233((byte) 86, "::clientdrop");
        field629 = class185.method1233((byte) 86, "Your ignore list is full)3 Max of 100 users)3");
        field626 = field629;
        field630 = 0;
    }
}
