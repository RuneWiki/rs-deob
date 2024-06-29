import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class152 extends class157 {

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lan;")
    public static class20 field2329 = new class20();

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Lnk;")
    public static class500 field2334 = new class500("WTI", 5);

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public int field2331;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "J")
    public long field2332;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)I")
    public final int method1097(int arg0) {
        field2324++;
        int var2 = -55 % ((-arg0 - 61) / 50);
        return this.field2331;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(Z)V")
    public static void method1098(boolean arg0) {
        field2329 = null;
        field2334 = null;
        if (arg0) {
            method1098(false);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public static final void method1099(int arg0, int arg1) {
        field2326++;
        class511.field7539 = -1;
        class33.field522 = arg1;
        class511.field7539 = arg0;
        class182.method1276((byte) -94);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZ)I")
    public static final int method1100(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return -10;
        }
        field2328++;
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)J")
    public final long method1101(byte arg0) {
        if (arg0 != -48) {
            this.field2332 = 48L;
        }
        field2325++;
        return this.field2332;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
    public final int method1102(boolean arg0) {
        field2330++;
        return arg0 ? this.field2327 : 43;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I")
    public final int method1103(int arg0) {
        field2322++;
        if (arg0 != 5) {
            method1098(true);
        }
        return this.field2333;
    }
}
