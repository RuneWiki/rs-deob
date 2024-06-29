import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class class686 extends class204 {

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "S")
    public short field9737;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
    public static int field9738;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILek;)Lvu;", line = 3)
    public static final class199 method3871(int arg0, class465 arg1) {
        ++field9742;
        class567 var2 = class105.method883(1, arg1);
        int var3 = arg1.method2755((byte) -50);
        int var4 = arg1.method2755((byte) -92);
        int var5 = arg1.method2755((byte) -69);
        int var6 = arg1.method2755((byte) -101);
        int var7 = arg1.method2755((byte) -51);
        if (arg0 != -23878) {
            return null;
        } else {
            int var8 = arg1.method2755((byte) -57);
            return new class199(var2.field8302, var2.field8299, var2.field8301, var2.field8295, var2.field8300, var2.field8291, var2.field8293, var2.field8294, var2.field8297, var3, var4, var5, var6, var7, var8);
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(IIIIII)V", line = 28)
    public class686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field3158 = (byte) arg3;
        this.field9737 = (short) arg5;
        super.field3160 = arg1;
        super.field3154 = arg2;
        super.field3155 = arg0;
        super.field3163 = (byte) arg4;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[Lam;)I", line = 42)
    public final int method591(int arg0, class289[] arg1) {
        ++field9738;
        return arg0 != -1 ? -109 : this.method1413(super.field3154 >> class49.field637, arg0 ^ 6812, super.field3155 >> class49.field637, arg1);
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)Z", line = 55)
    public final boolean method588(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field9743;
            return class118.method952(super.field3163, super.field3155 >> class49.field637, true, super.field3154 >> class49.field637);
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)Z", line = 71)
    public final boolean method587(byte arg0) {
        if (arg0 >= -22) {
            this.field9737 = 69;
        }
        ++field9740;
        return class678.field9661[(super.field3155 >> class49.field637) + -class371.field5135 + class668.field9389][(super.field3154 >> class49.field637) - class22.field303 + class668.field9389];
    }
}
