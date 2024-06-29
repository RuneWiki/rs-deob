import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class306 {

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "Lbu;")
    public static class19 field4198 = new class19();

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "Lada;")
    public static class144 field4201 = new class144(81, -2);

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
    public static int field4205 = 0;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public int field4200;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "[B")
    public byte[] field4194;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "[B")
    public byte[] field4199;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(III)Z")
    public static final boolean method1869(int arg0, int arg1, int arg2) {
        if (arg2 <= 121) {
            method1869(-95, 54, 98);
        }
        field4202++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public static void method1870(boolean arg0) {
        if (arg0) {
            method1869(-7, -48, 66);
        }
        field4198 = null;
        field4201 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILvp;II)V")
    public static final void method1871(int arg0, class162 arg1, int arg2, int arg3) {
        field4197++;
        class311 var4 = arg1.method1170(class99.field1445, (byte) -124);
        if (var4 == null) {
            return;
        }
        class99.field1445.method510(arg2, arg0, arg1.field2527 + arg2, arg0 - -arg1.field2459);
        if (arg3 < ~class588.field8727) {
            class574.field8450.method313((float) arg1.field2527 / 2.0F + (float) arg2, (float) arg1.field2459 / 2.0F + (float) arg0, 4096, ((int) (-class539.field8023) & 0x3FFF) << 2, var4, arg2, arg0);
        } else {
            class99.field1445.method462(-16777216, var4, arg2, arg0);
        }
    }
}
