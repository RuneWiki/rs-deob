import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class345 {

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
    public int field4856 = 8;

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
    public int field4857 = 16777215;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "F")
    public static float field4853;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public int field4855;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public int field4859;

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "Z")
    public boolean field4860;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IBLee;)V")
    private final void method2234(int arg0, byte arg1, class675 arg2) {
        if (arg1 != -73) {
            return;
        }
        field4854++;
        if (arg0 == 1) {
            this.field4856 = arg2.method3757((byte) -65);
        } else if (arg0 == 2) {
            this.field4860 = true;
        } else if (arg0 == 3) {
            this.field4859 = arg2.method3706((byte) -113);
            this.field4861 = arg2.method3706((byte) -91);
            this.field4852 = arg2.method3706((byte) -116);
        } else if (arg0 == 4) {
            this.field4863 = arg2.method3750((byte) 35);
        } else if (arg0 == 5) {
            this.field4855 = arg2.method3757((byte) -65);
        } else if (arg0 == 6) {
            this.field4857 = arg2.method3756(false);
            return;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZLee;)V")
    public final void method2235(boolean arg0, class675 arg1) {
        if (arg0) {
            return;
        }
        field4862++;
        while (true) {
            int var3 = arg1.method3750((byte) 35);
            if (var3 == 0) {
                return;
            }
            this.method2234(var3, (byte) -73, arg1);
        }
    }
}
