import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class432 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field5995 = 765;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field5994;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field5996;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ldga;B)V", line = 6)
    public final void method2486(class138 arg0, byte arg1) {
        field5998++;
        while (true) {
            int var3 = arg0.method957((byte) -65);
            if (var3 == 0) {
                if (arg1 == 111) {
                    return;
                } else {
                    field5995 = 41;
                    return;
                }
            }
            this.method2488((byte) 115, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V", line = 27)
    public static final void method2487(int arg0, int arg1, int arg2, int arg3) {
        field5997++;
        class19 var4 = class364.method2236(1248116640, arg1, 9);
        var4.method110(12142);
        var4.field171 = arg2;
        if (arg3 < -111) {
            var4.field173 = arg0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILdga;)V", line = 47)
    private final void method2488(byte arg0, int arg1, class138 arg2) {
        if (arg1 == 1) {
            this.field5996 = arg2.method922((byte) -118);
            this.field5994 = arg2.method957((byte) -81);
            this.field5999 = arg2.method957((byte) -121);
        }
        if (arg0 <= 87) {
            this.method2488((byte) -124, -60, null);
        }
        field5992++;
    }
}
