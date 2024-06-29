import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class492 {

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public int field6664;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public int field6662;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public int field6660;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public int field6663;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Lkp;", line = 6)
    public final class492 method2786(int arg0, int arg1) {
        if (arg1 >= -84) {
            this.field6660 = -63;
        }
        field6666++;
        return new class492(this.field6663, arg0, this.field6664, this.field6662);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 17)
    public static final void method2787(byte arg0) {
        for (class236 var1 = (class236) class592.field7703.method4051(896); var1 != null; var1 = (class236) class592.field7703.method4049(true)) {
            if (var1.field3323 > 1) {
                var1.field3323 = 0;
                class525.field6962.method556((byte) 0, ((class433) var1.field3322.field10032.field5748).field5958, var1);
                var1.field3322.method4055((byte) -74);
            }
        }
        field6661++;
        class181.field2730 = 0;
        class172.field2634 = 0;
        class446.field6126.method23(10);
        class76.field925.method2138(-1);
        class592.field7703.method4055((byte) -74);
        if (arg0 <= -115) {
            class403.field5625 = false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIIII)V", line = 49)
    public static final void method2788(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field6665++;
        class380.field5289 = arg1;
        class431.field5944 = arg4;
        if (!arg0) {
            class209.field3090 = arg3;
            class261.field3632 = arg2;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIII)V", line = 67)
    public class492(int arg0, int arg1, int arg2, int arg3) {
        this.field6664 = arg2;
        this.field6662 = arg3;
        this.field6660 = arg1;
        this.field6663 = arg0;
    }
}
