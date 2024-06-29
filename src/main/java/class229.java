import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class229 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lht;")
    public class410 field3194;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ltk;")
    public static class228 field3195 = new class228(4, 1, 1, 1);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I", line = 6)
    public static final int method1341(int arg0, int arg1, int arg2) {
        field3196++;
        int var3 = arg1 + (arg0 * 57);
        if (arg2 == -6418) {
            int var4 = var3 << 13 ^ var3;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return var5 >> 19 & 0xFF;
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 22)
    public static void method1342(byte arg0) {
        field3195 = null;
        if (arg0 != -46) {
            method1341(8, 86, -87);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)Z", line = 33)
    public static final boolean method1343(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method1342((byte) 106);
        }
        field3193++;
        return class329.method1832(1000, arg0, arg1) | (arg0 & 0x40000) != 0 || class213.method1280(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lht;)V", line = 48)
    public class229(class410 arg0) {
        this.field3194 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)V")
    public abstract void method17(boolean arg0, int arg1);

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V")
    public abstract void method12(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public abstract void method19(int arg0);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Z")
    public abstract boolean method13(byte arg0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILao;)V")
    public abstract void method22(int arg0, int arg1, class188 arg2);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZ)V")
    public abstract void method20(boolean arg0, boolean arg1);
}
