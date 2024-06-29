import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class377 extends class271 {

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Lri;")
    public static class73 field5757 = new class73(105, -1);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "[J")
    public static long[] field5759 = new long[32];

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "Lwu;")
    public static class250 field5753;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "[Lsq;")
    public static class117[] field5758;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method2313(int arg0) {
        field5757 = null;
        field5758 = null;
        field5759 = null;
        field5753 = null;
        if (arg0 != 3) {
            field5758 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BI)[B")
    public static final byte[] method2314(byte[] arg0, int arg1) {
        if (arg1 != -234615161) {
            method2316(112, false, -51, 120);
        }
        field5752++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class520.method3071(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static final void method2315(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            return;
        }
        while (var1 < 100) {
            class315.field4503[var1] = true;
            var1++;
        }
        field5754++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZII)I")
    public static final int method2316(int arg0, boolean arg1, int arg2, int arg3) {
        field5756++;
        if (class86.field1324 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || (class30.field323 - 1) < var4 || (class182.field2661 - 1) < var5) {
            return 0;
        }
        if (arg1) {
            method2314(null, 51);
        }
        int var6 = arg3;
        if (arg3 < 3 && (class183.field2684[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class86.field1324[var6].method202(arg2, arg0);
    }
}
