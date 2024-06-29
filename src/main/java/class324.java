import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class class324 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[S")
    public static short[] field5658 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lud;")
    public static class279 field5661 = class130.method1024("b12_full", 255);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lud;")
    public static class279 field5664 = class130.method1024(" <col=ffffff>", 255);

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lud;")
    private static class279 field5663 = class130.method1024("Prepared sound engine", 255);

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
    public static boolean field5666 = false;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lud;")
    public static class279 field5659 = field5663;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field5668 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Z")
    public static boolean field5662;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
    public static int[] field5665;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 13)
    public static void method2279(int arg0) {
        field5664 = null;
        field5661 = null;
        field5658 = null;
        field5659 = null;
        if (arg0 == 0) {
            field5665 = null;
            field5663 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Laj;I)V", line = 75)
    public static final void method2280(class1 arg0, int arg1) {
        field5669++;
        int var2 = arg0.field65 - class8.field279;
        int var3 = arg0.field50 * 128 + (arg0.method3((byte) -110) * 64);
        int var4 = arg0.field22 * 128 + arg0.method3((byte) -94) * 64;
        arg0.field86 += (var3 - arg0.field86) / var2;
        arg0.field79 += (var4 - arg0.field79) / var2;
        if (arg0.field53 == 0) {
            arg0.field28 = 1024;
        }
        if (arg0.field53 == 1) {
            arg0.field28 = 1536;
        }
        arg0.field103 = 0;
        if (arg0.field53 == 2) {
            arg0.field28 = 0;
        }
        if (arg1 != -24376) {
            method2280((class1) null, -110);
        }
        if (arg0.field53 == 3) {
            arg0.field28 = 512;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([BB)V")
    public abstract void method1201(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1202(int arg0);
}
