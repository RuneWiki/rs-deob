import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class175 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[I")
    public static int[] field2400 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2402;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 6)
    public static void method1286(byte arg0) {
        field2402 = null;
        field2400 = null;
        if (arg0 != 126) {
            method1287((class146) null, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lra;B)V", line = 18)
    public static final void method1287(class146 arg0, byte arg1) {
        field2401++;
        int var2 = -1;
        int var3 = 0;
        long var4 = 0L;
        if (arg0.field2035 == 0) {
            var4 = class9.method62(arg0.field2036, arg0.field2045, arg0.field2039);
        }
        if (arg1 >= -83) {
            return;
        }
        if (arg0.field2035 == 1) {
            var4 = class333.method2335(arg0.field2036, arg0.field2045, arg0.field2039);
        }
        int var6 = 0;
        if (arg0.field2035 == 2) {
            var4 = class106.method748(arg0.field2036, arg0.field2045, arg0.field2039);
        }
        if (arg0.field2035 == 3) {
            var4 = class340.method2366(arg0.field2036, arg0.field2045, arg0.field2039);
        }
        if (var4 != 0L) {
            var3 = ((int) var4 & 0x7FC95) >> 14;
            var6 = (int) var4 >> 20 & 0x3;
            var2 = Integer.MAX_VALUE & (int) (var4 >>> 32);
        }
        arg0.field2043 = var6;
        arg0.field2042 = var3;
        arg0.field2037 = var2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BB)Lke;", line = 71)
    public static final class230 method1291(byte[] arg0, byte arg1) {
        field2403++;
        if (arg0 == null) {
            return null;
        } else if (arg1 > -59) {
            return (class230) null;
        } else {
            class230 var2 = new class230(arg0, class348.field5418, class119.field1578, class251.field3673, class184.field2508, class338.field5276);
            class236.method1685(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
    public abstract int method1288(int arg0, int arg1);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
    public abstract void method1289(int arg0, int arg1);

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[B")
    public abstract byte[] method1290(int arg0, int arg1);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Lfo;")
    public abstract class229 method1292(int arg0);
}
