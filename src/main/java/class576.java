import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class576 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public int field8305 = 128;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public int field8311 = 128;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public int field8302;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public int field8306;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public int field8313;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public int field8301;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Llja;")
    public static class724 field8303 = new class724(true);

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field8307 = 0;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field8297;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public int field8298;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field8300;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public int field8304;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field8308;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lgga;")
    public static class513 field8310;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public static final void method3392(int arg0, int arg1) {
        field8312++;
        class371 var2 = class490.method2867((byte) -118, arg0, (long) arg1);
        var2.method2215(4);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lqd;B)V")
    public final void method3393(class576 arg0, byte arg1) {
        this.field8311 = arg0.field8311;
        this.field8305 = arg0.field8305;
        this.field8302 = arg0.field8302;
        this.field8313 = arg0.field8313;
        if (arg1 == 36) {
            this.field8301 = arg0.field8301;
            this.field8306 = arg0.field8306;
            field8299++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Lqd;")
    public final class576 method3394(boolean arg0) {
        if (!arg0) {
            this.method3394(true);
        }
        field8309++;
        return new class576(this.field8302, this.field8311, this.field8305, this.field8306, this.field8301, this.field8313);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method3395(int arg0) {
        field8310 = null;
        field8303 = null;
        if (arg0 != 265) {
            field8310 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
    public class576(int arg0) {
        this.field8302 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIII)V")
    private class576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8311 = arg1;
        this.field8306 = arg3;
        this.field8302 = arg0;
        this.field8313 = arg5;
        this.field8301 = arg4;
        this.field8305 = arg2;
    }
}
