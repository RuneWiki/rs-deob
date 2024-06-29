import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class173 extends class337 {

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "J")
    public long field2278;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Lkh;")
    public class173 field2279;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lkh;")
    public class173 field2282;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public final void method1084(byte arg0) {
        field2280++;
        if (this.field2282 == null) {
            return;
        }
        this.field2282.field2279 = this.field2279;
        this.field2279.field2282 = this.field2282;
        int var2 = -122 % ((-arg0 - 49) / 48);
        this.field2279 = null;
        this.field2282 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
    public static final boolean method1085(int arg0, int arg1, int arg2) {
        field2281++;
        return arg0 == -25808 ? class381.method2180(arg2, arg1, -1) & class143.method822(arg1, arg2, (byte) -107) : true;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)Z")
    public final boolean method1086(byte arg0) {
        field2277++;
        if (this.field2282 == null) {
            return false;
        } else {
            if (arg0 >= -113) {
                this.method1086((byte) -4);
            }
            return true;
        }
    }
}
