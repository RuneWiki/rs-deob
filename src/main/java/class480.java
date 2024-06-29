import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class480 extends class287 {

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Ljava/lang/String;")
    public String field6518;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "Ldm;")
    public class98 field6519;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field6522 = 0;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "Lqk;")
    public static class148 field6523 = new class148(105, 10);

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
    public int field6524;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "Lfd;")
    public static class297 field6528;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "Lcj;")
    public static class443 field6526;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljm;I)Z", line = 3)
    public final boolean method2832(class6 arg0, int arg1) {
        field6525++;
        boolean var3 = true;
        arg0.method1706((byte) 79);
        class6 var4 = (class6) this.field6519.method667(true);
        while (var4 != null) {
            if (class46.method310(var4.field60, arg0.field60, arg1 ^ 0xFFFFFFE7)) {
                class245.method1558(arg0, 84, var4);
                this.field6524++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class6) this.field6519.method662((byte) 126);
            var3 = false;
        }
        this.field6519.method666(8192, arg0);
        if (arg1 == 0) {
            this.field6524++;
            return var3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V", line = 35)
    public static void method2833(byte arg0) {
        if (arg0 < 48) {
            field6528 = null;
        }
        field6526 = null;
        field6523 = null;
        field6528 = null;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(B)I", line = 47)
    public final int method2834(byte arg0) {
        field6520++;
        if (this.field6519.field1417.field3781 == this.field6519.field1417) {
            if (arg0 <= 64) {
                this.method2832(null, 89);
            }
            return -1;
        } else {
            return ((class6) this.field6519.field1417.field3781).field60;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjm;)Z", line = 70)
    public final boolean method2835(byte arg0, class6 arg1) {
        field6521++;
        int var3 = this.method2834((byte) 112);
        arg1.method1706((byte) 79);
        this.field6524--;
        if (arg0 > -36) {
            field6523 = null;
        }
        if (this.field6524 != 0) {
            return this.method2834((byte) 104) != var3;
        }
        this.method3065(-17363);
        this.method1706((byte) 79);
        class367.field4714--;
        class105.field1528.method3199((byte) 78, this, arg1.field48);
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 103)
    public class480(String arg0) {
        this.field6518 = arg0;
        this.field6519 = new class98();
    }
}
