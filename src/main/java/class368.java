import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class class368 {

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Lnea;")
    public static class664 field5264 = new class664(20, -2);

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Ldg;")
    public static class376 field5266 = new class376(13, 11);

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field5270 = 0;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "[I")
    public static int[] field5269 = new int[6];

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Ldg;")
    public static class376 field5268 = new class376(60, 3);

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Ldg;")
    public static class376 field5272 = new class376(34, 6);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Lgf;")
    public static class248 field5271;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lft;")
    public static class4 field5267;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method2230(int arg0) {
        field5271 = null;
        field5269 = null;
        field5272 = null;
        field5268 = null;
        field5264 = null;
        field5267 = null;
        if (arg0 != -17574) {
            field5268 = null;
        }
        field5266 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[BI)I")
    public abstract int method2231(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
    public abstract void method2232(boolean arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Z")
    public abstract boolean method2233(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Z)V")
    public abstract void method2234(boolean arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z[BII)V")
    public abstract void method2235(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException;
}
