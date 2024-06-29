import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class31 extends class135 {

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field389 = 0;

    @OriginalMember(owner = "client!re", name = "W", descriptor = "Lqj;")
    public static class196 field390 = class80.method502("m-Ochte mit Ihnen handeln)3", -48);

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Lqj;")
    private static class196 field394 = class80.method502("Players", -48);

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "I")
    public static int field395 = -1;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "Lqj;")
    public static class196 field398 = field394;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "Lqj;")
    public static class196 field396 = class80.method502("Mem:", -48);

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "[I")
    public static int[] field392;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public static void method166(int arg0) {
        field396 = null;
        field390 = null;
        field392 = null;
        if (arg0 < 124) {
            method166(-10);
        }
        field394 = null;
        field398 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -108 / ((arg2 - -7) / 44);
        if (~arg0 < ~arg1) {
            for (int var6 = arg1; arg0 > var6; ++var6) {
                class95.field1380[var6][arg3] = arg4;
            }
        } else {
            for (int var7 = arg0; var7 < arg1; ++var7) {
                class95.field1380[var7][arg3] = arg4;
            }
        }
        ++field393;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)I")
    public static final int method168(int arg0, byte arg1) {
        if (arg1 != 26) {
            return -50;
        } else {
            ++field399;
            return arg0 == 16711935 ? -1 : class71.method456(arg0, false);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field397;
        int[] var3 = super.field1954.method110(arg0, -123);
        if (arg1) {
            field394 = null;
        }
        if (super.field1954.field244) {
            class37.method186(var3, 0, class131.field1862, class123.field1756[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(III)V")
    public static final void method169(int arg0, int arg1, int arg2) {
        class161.field2587 = true;
        class246.field4383 = arg0;
        class165.field2696 = arg1;
        class176.field2970 = arg2;
        class183.field3220 = -1;
        class19.field227 = -1;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class31() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([II)[I")
    public static final int[] method170(int[] arg0, int arg1) {
        ++field391;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class37.method188(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }
}
