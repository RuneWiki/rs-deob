import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class326 {

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public int field4196 = 2048;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public int field4197 = 0;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
    public int field4201 = 2048;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public int field4200 = 0;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "[[S")
    public static short[][] field4198;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILvj;B)V", line = 4)
    private final void method1906(int arg0, class26 arg1, byte arg2) {
        field4199++;
        if (arg2 > -81) {
            method1909(74, 30);
        }
        if (arg0 == 1) {
            this.field4197 = arg1.method194((byte) 119);
        } else if (arg0 == 2) {
            this.field4201 = arg1.method193(2);
        } else if (arg0 == 3) {
            this.field4196 = arg1.method193(2);
        } else if (arg0 == 4) {
            this.field4200 = arg1.method173(-3);
            return;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILvj;)V", line = 33)
    public final void method1907(int arg0, class26 arg1) {
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                field4195++;
                if (arg0 != 11589) {
                    method1909(-67, 18);
                    return;
                }
                return;
            }
            this.method1906(var3, arg1, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V", line = 53)
    public static void method1908(int arg0) {
        field4198 = null;
        if (arg0 != 0) {
            field4198 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)I", line = 70)
    public static final int method1909(int arg0, int arg1) {
        field4194++;
        if (arg1 != 2) {
            method1908(88);
        }
        return arg0 >>> 7;
    }
}
