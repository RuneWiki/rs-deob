import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class447 implements class169 {

    @OriginalMember(owner = "client!un", name = "f", descriptor = "Laj;")
    private class333 field6266;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Ljava/lang/String;")
    private String field6261;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "[F")
    public static float[] field6263 = new float[4];

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Lib;")
    public static class164 field6265;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "F")
    public static float field6267;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field6264;

    static {
        new class410("", 76);
        field6265 = new class164("INTBETA", "office", "_intbeta", 6);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V", line = 3)
    public static void method2682(byte arg0) {
        field6263 = null;
        field6265 = null;
        int var1 = -112 % ((44 - arg0) / 44);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Ljq;", line = 19)
    public final class539 method268(int arg0) {
        field6264++;
        if (arg0 != -12696) {
            this.method269((byte) -71);
        }
        return class539.field7332;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I", line = 30)
    public final int method269(byte arg0) {
        int var2 = 45 / ((6 - arg0) / 59);
        field6262++;
        return this.field6266.method2110(true, this.field6261) ? 100 : this.field6266.method2116(-48, this.field6261);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Laj;Ljava/lang/String;)V", line = 55)
    public class447(class333 arg0, String arg1) {
        this.field6266 = arg0;
        this.field6261 = arg1;
    }
}
