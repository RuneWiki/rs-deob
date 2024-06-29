import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class284 implements class316 {

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "Z")
    public boolean field4199;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "Lcf;")
    public class631 field4198;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public int field4190;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public int field4194;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "Lur;")
    public class564 field4191;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIBI)V", line = 21)
    public static final void method1821(int arg0, int arg1, byte arg2, int arg3) {
        field4192++;
        class16 var4 = class94.method753(11, 13175, (long) arg1);
        var4.method119(-72);
        var4.field244 = arg3;
        int var5 = -36 / ((-arg2 - 14) / 57);
        var4.field237 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)V", line = 38)
    public static final void method1822(int arg0, byte arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        field4197++;
        class786.field10820 = arg0;
        if (arg1 >= -62) {
            method1822(124, (byte) 102);
        }
        class483.field6682 = new class663[class581.field7772[class786.field10820] + 1];
        class700.field9826 = 0;
        class503.field6972 = 0;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILur;Lcf;IIIIIIIZ)V", line = 55)
    public class284(int arg0, class564 arg1, class631 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field4204 = arg7;
        this.field4199 = arg10;
        this.field4198 = arg2;
        this.field4190 = arg9;
        this.field4194 = arg3;
        this.field4193 = arg6;
        this.field4203 = arg4;
        this.field4191 = arg1;
        this.field4196 = arg0;
        this.field4201 = arg8;
        this.field4195 = arg5;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)Lhv;", line = 73)
    public final class546 method1557(byte arg0) {
        field4200++;
        if (arg0 > -35) {
            method1822(-82, (byte) 91);
        }
        return class788.field10848;
    }
}
