import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class59 {

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "D")
    public static double field934 = -1.0D;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Lsn;", line = 6)
    public static final class450 method540(int arg0, int arg1, int arg2) {
        field935++;
        class450 var3 = (class450) class411.field5748.method614(-108, (long) arg1 | (long) arg0 << 32);
        if (arg2 != 1000) {
            return null;
        }
        if (var3 == null) {
            var3 = new class450(arg0, arg1);
            class411.field5748.method612(var3.field5349, -1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 34)
    public static final void method541(int arg0) {
        class435.field6199 = arg0;
        class334.field4529 = arg0;
        class356.field4844 = arg0;
        class61.field948 = arg0;
        field931++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[B", line = 45)
    public static final synchronized byte[] method542(int arg0, byte arg1) {
        field933++;
        if (arg0 == 100 && class268.field3609 > 0) {
            byte[] var2 = class264.field3553[--class268.field3609];
            class264.field3553[class268.field3609] = null;
            return var2;
        }
        if (arg1 >= -46) {
            field930 = -75;
        }
        if (arg0 == 5000 && class256.field3468 > 0) {
            byte[] var3 = class419.field5868[--class256.field3468];
            class419.field5868[class256.field3468] = null;
            return var3;
        } else if (arg0 == 30000 && class335.field4535 > 0) {
            byte[] var4 = class148.field2280[--class335.field4535];
            class148.field2280[class335.field4535] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
