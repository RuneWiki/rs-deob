import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class380 {

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Lra;")
    public static class259 field5593;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Lr;")
    public class519 field5589;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Lk;")
    public class88 field5591;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Loh;ZII)V")
    public static final void method2304(class549 arg0, boolean arg1, int arg2, int arg3) {
        field5594++;
        if (arg0 == null) {
            return;
        }
        if (arg0.field7626 != null) {
            class526 var4 = new class526();
            var4.field7314 = arg0.field7626;
            var4.field7315 = arg0;
            class30.method277(var4);
        }
        class68.field1296 = arg0.field7703;
        class293.field4224 = arg0.field7734;
        class510.field7076 = arg3;
        class549.field7789 = arg2;
        class335.field4799 = arg0.field7790;
        class185.field2692 = arg0.field7784;
        class90.field1620 = true;
        if (arg1) {
            field5593 = null;
        }
        class388.field5795 = arg0.field7761;
        class412.method2497(arg0, 127);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BII)Laea;")
    public static final class39 method2305(byte arg0, int arg1, int arg2) {
        field5588++;
        class39 var3 = new class39();
        var3.field527 = arg2 + 6;
        if (arg0 < 92) {
            return null;
        }
        var3.field530 = -1;
        var3.field531 = -1;
        var3.field533 = arg1 + 5 + 1;
        var3.field526 = new int[var3.field533][var3.field527];
        var3.method329(100);
        return var3;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IC)Z")
    public static final boolean method2306(int arg0, char arg1) {
        if (arg0 <= 91) {
            return true;
        } else {
            field5590++;
            return arg1 >= '0' && arg1 <= '9';
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public static final void method2307(int arg0) {
        field5592++;
        if (class549.field7791 || arg0 != 1) {
            return;
        }
        class549.field7791 = true;
        if (class202.field2854.field7903) {
            class181.field2622 = ((int) class181.field2622 - 17 & 0xFFFFFFF0);
        } else {
            class367.field5199 += (-12.0F - class367.field5199) / 2.0F;
        }
        class521.field7236 = true;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method2308(int arg0) {
        field5593 = null;
        if (arg0 != 6) {
            method2308(45);
        }
    }
}
