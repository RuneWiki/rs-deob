import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class14 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field302 = 2301979;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lrd;")
    public static class114 field306 = class84.method656("::qa_op_test", (byte) 127);

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field310 = 500;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lrd;")
    private static class114 field309 = class84.method656("as it was used to break our rules)3", (byte) 119);

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Z")
    public static boolean field308 = false;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field307 = 0;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lrd;")
    public static class114 field305 = field309;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field313 = -1;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[Lnd;")
    public static class90[] field311;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lrd;")
    public static final class114 method113(int arg0, int arg1) {
        if (arg1 != -31766) {
            method114((byte) -124);
        }
        field314++;
        return class130.method1046(false, arg0, 10, (byte) -124);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method114(byte arg0) {
        if (arg0 > 50) {
            field305 = null;
            field311 = null;
            field309 = null;
            field306 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Lnd;")
    public static final class90 method115(int arg0, int arg1) {
        int var2 = arg1 >> 16;
        field303++;
        int var3 = arg1 & arg0;
        if (class78.field1772[var2] == null || class78.field1772[var2][var3] == null) {
            boolean var4 = class1.method1(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class78.field1772[var2][var3];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[B)V")
    public abstract void method116(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)[B")
    public abstract byte[] method117(byte arg0);
}
