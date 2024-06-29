import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class531 extends class540 {

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lkv;")
    public class280 field7522;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "Z")
    public boolean field7526;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZILho;Lho;)V")
    public abstract void method967(boolean arg0, int arg1, class158 arg2, class158 arg3);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I")
    public int method964(byte arg0) {
        if (arg0 < 112) {
            this.method959(-32, (byte) -20);
        }
        field7525++;
        return 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
    public static final int method3082(int arg0) {
        field7520++;
        return arg0 == 0 ? class211.field3063 : 23;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)Z")
    public abstract boolean method965(boolean arg0);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V")
    public abstract void method959(int arg0, byte arg1);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public abstract void method958(byte arg0);

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)Z")
    public final boolean method3083(byte arg0) {
        field7523++;
        if (arg0 != 18) {
            this.method965(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)Z")
    public abstract boolean method961(byte arg0);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
    public final int method3084(int arg0) {
        field7519++;
        if (arg0 > -61) {
            this.field7522 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Z")
    public final boolean method3085(int arg0) {
        field7521++;
        if (arg0 != 1) {
            this.field7526 = false;
        }
        return this.field7526;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)V")
    public abstract void method963(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V")
    public static final void method3086(int arg0) {
        field7524++;
        if (class515.field7364 == null) {
            return;
        }
        class203.field2976 = new class87();
        class203.field2976.method625(class11.field241, class515.field7364, class515.field7364.field7029.method3825((byte) -10, class526.field7494), true, class515.field7364.field7037);
        if (arg0 <= 34) {
            method3082(74);
        }
        class421.field5944 = new Thread(class203.field2976, "");
        class421.field5944.start();
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lkv;)V")
    public class531(class280 arg0) {
        this.field7522 = arg0;
    }
}
