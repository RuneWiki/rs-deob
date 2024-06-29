import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class385 extends class73 {

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "S")
    public static short field5147 = 32767;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "Lf;")
    private class532 field5143;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method404(boolean arg0) {
        ++field5141;
        return !super.method404(arg0) ? false : super.field872.method1931(1, ((class420) super.field873).field5515);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BZII)V", line = 16)
    public final void method401(byte arg0, boolean arg1, int arg2, int arg3) {
        ++field5146;
        int var5 = this.method400(2) * super.field873.field9733 / 10000;
        int[] var6 = new int[4];
        class146.field1963.method1057(var6);
        class146.field1963.method1042(arg3, arg2 + 2, arg3 - -var5, super.field873.field9743 + arg2);
        this.field5143.method2992(arg3, arg2 + 2, super.field873.field9733, super.field873.field9743);
        if (arg0 <= 14) {
            this.field5143 = null;
        }
        class146.field1963.method1042(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lga;Lga;Lmc;)V", line = 36)
    public class385(class332 arg0, class332 arg1, class420 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)I", line = 39)
    public static final int method2206(int arg0, int arg1) {
        if (arg0 != 0) {
            method2208(true);
        }
        int var7 = arg1 - 1;
        ++field5144;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)V", line = 60)
    public static final void method2207(boolean arg0) {
        ++field5142;
        class28.method182(11, 29697);
        class601.method3343(-1);
        System.gc();
        if (arg0) {
            method2206(74, 20);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIBI)V", line = 73)
    public final void method403(boolean arg0, int arg1, byte arg2, int arg3) {
        class146.field1963.method1121(arg1 + -2, arg3, super.field873.field9733 + 4, super.field873.field9743 + 2, ((class420) super.field873).field5519, 0);
        ++field5145;
        if (arg2 < 93) {
            method2207(false);
        }
        class146.field1963.method1121(arg1 + -1, arg3 + 1, super.field873.field9733 + 2, super.field873.field9743, 0, 0);
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(Z)V", line = 85)
    public static final void method2208(boolean arg0) {
        if (arg0) {
            class153.field2168 = class631.field8736;
            class246.field3214 = class446.field5914;
        } else {
            class153.field2168 = class543.field7437;
            class246.field3214 = class454.field5981;
        }
        class171.field2428 = class153.field2168.length;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 99)
    public final void method402(int arg0) {
        if (arg0 >= 119) {
            super.method402(120);
            ++field5140;
            this.field5143 = class567.method3141(127, super.field872, ((class420) super.field873).field5515);
        }
    }
}
