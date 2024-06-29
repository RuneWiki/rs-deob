import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class191 extends class134 {

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field2252 = -1;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Z")
    public boolean field2255 = false;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILka;III)Llca;", line = 6)
    public static final class642 method1161(int arg0, class470 arg1, int arg2, int arg3, int arg4) {
        field2257++;
        if (arg1 == null) {
            return null;
        } else {
            class642 var5 = new class642(arg2, arg3, arg0, arg1.method203(), arg1.method221(), arg1.method222(), arg1.method190(), arg1.method193(), arg1.method238(), arg1.method234());
            return arg4 == 4371 ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V", line = 57)
    public class191(int arg0) {
        this.field2252 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBIZ)V", line = 30)
    public static final void method1162(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        class161.method998(false);
        if (arg2 < 123) {
            return;
        }
        field2249++;
        class491.field6991 = 0L;
        int var5 = class735.method4098(false);
        if (arg3 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class275.field3370.method326()) {
            arg4 = true;
        }
        class252.method1504(arg1, arg4, arg3, var5, arg0, 315);
    }
}
