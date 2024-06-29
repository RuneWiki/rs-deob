import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class102 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1544 = 100;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static final void method776(int arg0) {
        field1543++;
        if (class62.field837) {
            return;
        }
        class62.field837 = true;
        if (class454.field6661.field969) {
            class311.field4836 = ((int) class311.field4836 + 191 & 0xFFFFFF80);
        } else {
            class78.field1085 += (24.0F - class78.field1085) / 2.0F;
        }
        class116.field1745 = true;
        if (arg0 != -10714) {
            field1544 = -23;
        }
    }
}
