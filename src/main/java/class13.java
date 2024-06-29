import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class13 extends class64 {

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Lsd;")
    public static class165 field292 = new class165();

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field295 = 1;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field296 = 1;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field297 = 128;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "[[B")
    public static byte[][] field299 = new byte[50][];

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field294;
        if (arg1 != -9421) {
            field292 = null;
        }
        int[] var3 = super.field1513.method1033(-122, arg0);
        if (super.field1513.field3368) {
            int[] var4 = this.method479(-1, arg0, 0);
            for (int var5 = 0; class168.field3367 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    public static void method71(int arg0) {
        field292 = null;
        if (arg0 == 7607) {
            field299 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 44 / ((arg0 - 7) / 43);
        ++field290;
        if (~arg1 == -1) {
            super.field1510 = ~arg2.method1202(106) == -2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class13() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field289;
            int[][] var3 = super.field1508.method846(7287, arg0);
            if (super.field1508.field2757) {
                int[][] var4 = this.method482(0, arg0, (byte) -123);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class168.field3367 < ~var11; ++var11) {
                    var8[var11] = -var6[var11] + 4096;
                    var9[var11] = 4096 - var5[var11];
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)Lm;")
    public static final class107 method72(int arg0) {
        ++field291;
        try {
            if (arg0 != 11110) {
                field298 = 106;
            }
            return (class107) Class.forName("w").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
