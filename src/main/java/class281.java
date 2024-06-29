import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class281 extends class293 {

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    public static int field4853 = 0;

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "I")
    public static int field4855 = 0;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "B")
    public byte field4856;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    public int field4854;

    @OriginalMember(owner = "client!gm", name = "db", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!gm", name = "eb", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!gm", name = "fb", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "Lbg;")
    public class194 field4857;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1960(int arg0, int arg1) {
        field4860++;
        class175.field3091.method1833(arg1, (byte) 94);
        if (arg0 != 0) {
            field4851 = -117;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIII)V", line = 23)
    public static final void method1961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4858++;
        if (class133.method890(false, arg0)) {
            client.method1659(class200.field3508[arg0], arg7, arg6, arg2, arg3, arg1, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)[B", line = 51)
    public final byte[] method1144(int arg0) {
        field4849++;
        if (this.field5018 || this.field4857.field3417.length - this.field4856 > this.field4857.field3380) {
            throw new RuntimeException();
        }
        if (arg0 != 100) {
            field4853 = 120;
        }
        return this.field4857.field3417;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 76)
    public static final void method1962(byte arg0, Component arg1) {
        arg1.removeKeyListener(class210.field3715);
        arg1.removeFocusListener(class210.field3715);
        class189.field3286 = -1;
        field4850++;
        if (arg0 != 48) {
            field4851 = 17;
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)I", line = 95)
    public final int method1146(int arg0) {
        if (arg0 != 0) {
            field4851 = 103;
        }
        field4852++;
        return this.field4857 == null ? 0 : this.field4857.field3380 * 100 / (this.field4857.field3417.length - this.field4856);
    }
}
