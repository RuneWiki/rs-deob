import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class458 {

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "[I")
    public int[] field6305;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "[I")
    public int[] field6304;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public static int field6302 = 0;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V", line = 16)
    public class458(int arg0) {
        this.field6303 = arg0;
        this.field6305 = new int[this.field6303];
        this.field6304 = new int[this.field6303];
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V", line = 29)
    public static final void method2748(boolean arg0) throws IOException {
        if (class275.field3699 != null && class210.field2985 > 0) {
            int var1 = 0;
            while (true) {
                class120 var2 = (class120) class238.field3313.method3118((byte) 73);
                if (var2 == null) {
                    class321.field4138 += var1;
                    class585.field8425 = 0;
                    break;
                }
                class275.field3699.method2462(0, 1, var2.field1653.field279, var2.field1652);
                var1 += var2.field1652;
                class210.field2985 -= var2.field1652;
                var2.method3065(-17363);
                var2.field1653.method157(arg0);
                var2.method782(16);
            }
        }
        if (arg0) {
            field6301++;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IB)Lg;", line = 65)
    public static final class594 method2749(int arg0, byte arg1) {
        field6300++;
        class594[] var2 = class65.method427((byte) -56);
        if (arg1 != 73) {
            method2749(38, (byte) 29);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class594 var4 = var2[var3];
            if (var4.field8560 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V", line = 92)
    public static final void method2750(int arg0, int arg1, int arg2) {
        field6299++;
        class118 var3 = class126.method814(true, arg0, arg2);
        var3.method771(-30559);
        var3.field1636 = arg1;
    }
}
