import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class402 extends class263 {

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field5156 = 0;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public int field5157;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public int field5158;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public int field5159;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Lrr;")
    public class337 field5152;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Lrr;")
    public class337 field5154;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "Ljava/lang/String;")
    public String field5160;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "Z")
    public boolean field5164;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "[Ljava/lang/Object;")
    public Object[] field5153;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILpfa;Lpfa;Lhe;Lpfa;)Z")
    public static final boolean method2263(int arg0, class275 arg1, class275 arg2, class345 arg3, class275 arg4) {
        field5163++;
        class563.field7034 = arg2;
        class367.field4751 = arg3;
        if (arg0 <= 60) {
            field5156 = 119;
        }
        class146.field1751 = arg4;
        class653.field8903 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public static final void method2264(int arg0) {
        class599.field8034.method3839((byte) -127);
        if (arg0 != -4366) {
            field5156 = -74;
        }
        field5161++;
        class512.field6430.method3839((byte) -100);
    }
}
