import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public abstract class class457 {

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field6397 = 0;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "Lkha;")
    public static class687 field6396;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2675(byte arg0) {
        class368.method2262(-91);
        field6392++;
        if (arg0 >= -1) {
            field6397 = -108;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Lpda;", line = 16)
    public static final class149 method2676(int arg0, int arg1, int arg2) {
        class73 var3 = class495.field7002[arg0][arg1][arg2];
        return var3 == null ? null : var3.field964;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZB)I", line = 26)
    public static final int method2677(boolean arg0, byte arg1) {
        field6393++;
        int var2 = 62 / ((arg1 - 6) / 61);
        int var3 = class709.field9973;
        if (var3 == 0) {
            return arg0 ? 0 : class314.field4027;
        } else if (var3 == 1) {
            return class314.field4027;
        } else if (var3 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V", line = 70)
    public static void method2678(int arg0) {
        if (arg0 != 0) {
            field6396 = null;
        }
        field6396 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(CI)Z", line = 83)
    public static final boolean method2679(char arg0, int arg1) {
        field6391++;
        if (arg1 <= 32) {
            return false;
        } else {
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(BJ)I", line = 94)
    public final int method2680(byte arg0, long arg1) {
        if (arg0 != -98) {
            this.method1217(-64);
        }
        field6394++;
        long var4 = this.method1218(-3152);
        if (var4 > 0L) {
            class517.method2965(var4, arg0 ^ 0x4);
        }
        return this.method1215((byte) -39, arg1);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)J")
    public abstract long method1219(int arg0);

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BJ)I")
    public abstract int method1215(byte arg0, long arg1);

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V")
    public abstract void method1217(int arg0);

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)J")
    public abstract long method1218(int arg0);
}
