import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class405 extends class54 {

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Z")
    public boolean field5706 = false;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Z")
    public boolean field5707 = false;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field5704;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public int field5705;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field5703;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field5699 = -1;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Lus;")
    public static class1 field5700 = new class1(11, 28);

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Ls;")
    public static class169 field5702;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)V")
    public static final void method2406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5698++;
        class489 var5 = class116.method731(-625541408, arg1, arg4);
        var5.method2863(arg1 + 247);
        var5.field6890 = arg2;
        var5.field6892 = arg0;
        var5.field6895 = arg3;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V")
    public static void method2407(int arg0) {
        if (arg0 < 63) {
            method2406(40, -8, -11, -14, 1);
        }
        field5700 = null;
        field5702 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIZZ)V")
    public class405(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5704 = arg2;
        this.field5707 = arg3;
        this.field5705 = arg0;
        this.field5706 = arg4;
        this.field5703 = arg1;
    }
}
