import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class168 {

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "[I")
    public static int[] field2331 = new int[1];

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!dfa", name = "i", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "J")
    public long field2333;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "Ldfa;")
    public class168 field2332;

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "Ldfa;")
    public class168 field2336;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "Lnd;")
    public static class547 field2329;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)I", line = 4)
    public static final int method1172(int arg0, int arg1, int arg2) {
        field2334++;
        if (arg2 == 1 || arg2 == 3) {
            return class147.field2047[arg0 & 0x3];
        } else {
            if (arg1 != -5386) {
                method1173((byte) 28);
            }
            return class548.field7669[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(B)V", line = 19)
    public static void method1173(byte arg0) {
        field2331 = null;
        int var1 = -78 % ((arg0 + 74) / 44);
        field2329 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lsl;Z)Lcf;", line = 29)
    public static final class605 method1174(class461 arg0, boolean arg1) {
        if (arg1) {
            method1173((byte) -35);
        }
        field2337++;
        return new class605(arg0.method2577(2), arg0.method2577(2), arg0.method2577(2), arg0.method2577(2), arg0.method2576((byte) 105), arg0.method2600((byte) -128));
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)V", line = 42)
    public final void method1175(int arg0) {
        field2335++;
        if (this.field2332 == null) {
            return;
        }
        if (arg0 != -2) {
            method1173((byte) -9);
        }
        this.field2332.field2336 = this.field2336;
        this.field2336.field2332 = this.field2332;
        this.field2336 = null;
        this.field2332 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(B)Z", line = 71)
    public final boolean method1176(byte arg0) {
        field2330++;
        if (arg0 == 68) {
            return this.field2332 != null;
        } else {
            return false;
        }
    }
}
