import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class254 extends class134 {

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public int field4305 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public int field4306 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public int field4307 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public int field4312 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public int field4313 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public int field4308 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public int field4310 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public int field4311 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "Lnj;")
    public class206 field4309;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "[I")
    public static int[] field4314 = new int[5];

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method1837(byte arg0) {
        field4314 = null;
        int var1 = -57 % ((-arg0 - 53) / 59);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)Z")
    public final boolean method1838(byte arg0, int arg1, int arg2) {
        if (arg0 >= -56) {
            method1837((byte) -49);
        }
        field4304++;
        if (this.field4308 <= arg2 && this.field4313 >= arg2 && arg1 >= this.field4307 && this.field4306 >= arg1) {
            return true;
        } else {
            return arg2 >= this.field4312 && this.field4305 >= arg2 && arg1 >= this.field4311 && arg1 <= this.field4310;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lnj;)V")
    public class254(class206 arg0) {
        this.field4309 = arg0;
    }
}
