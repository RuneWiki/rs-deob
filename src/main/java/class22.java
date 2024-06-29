import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class22 extends class273 {

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "[I")
    public static int[] field275 = new int[2];

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "[I")
    public static int[] field278 = new int[14];

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "[[I")
    public static int[][] field280 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "Lce;")
    public static class8 field272;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "[I")
    public static int[] field276;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "[S")
    public static short[] field281;

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 3)
    public class22() {
        this(0);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V", line = 6)
    private class22(int arg0) {
        super(0, false);
        this.method168(25765, arg0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BILgn;)V", line = 16)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg0 < 27) {
            field282 = -28;
        }
        field273++;
        if (arg1 == 0) {
            this.method168(25765, arg2.method2059(255));
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)V", line = 45)
    private final void method168(int arg0, int arg1) {
        if (arg0 != 25765) {
            field278 = (int[]) null;
        }
        this.field283 = arg1 >> 4 & 0xFF0;
        this.field279 = arg1 & 0xFF << 4;
        field274++;
        this.field277 = (arg1 & 0xFF0000) >> 12;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V", line = 63)
    public static void method169(int arg0) {
        field275 = null;
        if (arg0 != -6623) {
            return;
        }
        field276 = null;
        field281 = null;
        field278 = null;
        field272 = null;
        field280 = (int[][]) null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[[I", line = 97)
    public final int[][] method170(int arg0, byte arg1) {
        field284++;
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class27.field346; var7++) {
                var4[var7] = this.field277;
                var5[var7] = this.field283;
                var6[var7] = this.field279;
            }
        }
        if (arg1 != 68) {
            field276 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(Z)Z", line = 135)
    public static final boolean method171(boolean arg0) {
        field271++;
        if (!arg0) {
            return true;
        }
        if (class242.field3831) {
            try {
                return !(Boolean) class254.method1715("showingVideoAd", (byte) -88, class89.field1359.field3569);
            } catch (Throwable var2) {
            }
        }
        return true;
    }
}
