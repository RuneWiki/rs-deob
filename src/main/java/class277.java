import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class277 {

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "Z")
    public static boolean field3528 = false;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "Ldr;")
    public static class675 field3529 = new class675(78, 8);

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "Ldr;")
    public static class675 field3531 = new class675(12, -2);

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)[Lvf;")
    public static final class141[] method1674(int arg0) {
        if (arg0 <= 26) {
            method1675((byte) 121);
        }
        field3530++;
        return new class141[] { class485.field6029, class226.field2915, class642.field8710, class133.field1623, class612.field8320, class636.field8616, class178.field2077, class477.field5938, class398.field5049, class65.field789, class640.field8674, class128.field1558, class170.field1998, class22.field252 };
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        field3529 = null;
        if (arg0 <= -22) {
            field3531 = null;
        }
    }
}
