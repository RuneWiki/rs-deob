import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class184 extends class644 {

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "Ljava/lang/String;")
    public String field2552;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "Lqk;")
    public class16 field2556;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "Z")
    public static boolean field2557 = false;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lvea;I)Z", line = 4)
    public final boolean method1243(class277 arg0, int arg1) {
        field2554++;
        if (arg1 < 116) {
            this.field2555 = 111;
        }
        boolean var3 = true;
        arg0.method3615(84);
        class277 var4 = (class277) this.field2556.method118(-30553);
        while (var4 != null) {
            if (class454.method2549((byte) -118, var4.field3478, arg0.field3478)) {
                class374.method2150(arg0, -93, var4);
                this.field2555++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class277) this.field2556.method111(22548);
            var3 = false;
        }
        this.field2556.method116(arg0, 1);
        this.field2555++;
        return var3;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(Lvea;I)Z", line = 38)
    public final boolean method1244(class277 arg0, int arg1) {
        field2553++;
        int var3 = this.method1246((byte) 122);
        arg0.method3615(105);
        this.field2555--;
        if (this.field2555 != arg1) {
            return this.method1246((byte) 120) != var3;
        }
        this.method1175(-2);
        this.method3615(28);
        class512.field7203--;
        class263.field3317.method3077((byte) 89, arg0.field3472, this);
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(III)Z", line = 61)
    public static final boolean method1245(int arg0, int arg1, int arg2) {
        field2550++;
        if (arg1 != 0) {
            method1245(54, 26, -94);
        }
        return false;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)I", line = 72)
    public final int method1246(byte arg0) {
        if (arg0 <= 119) {
            return -20;
        } else {
            field2551++;
            return this.field2556.field313.field8921 == this.field2556.field313 ? -1 : ((class277) this.field2556.field313.field8921).field3478;
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 90)
    public class184(String arg0) {
        this.field2552 = arg0;
        this.field2556 = new class16();
    }
}
