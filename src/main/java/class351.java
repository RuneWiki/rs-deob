import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class351 extends class97 {

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Z")
    public static boolean field5206 = false;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Z")
    public static boolean field5208 = false;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Lkr;")
    public static class234 field5212;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
    public static boolean field5211;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "[I")
    public static int[] field5207;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
    public static final void method2111(int arg0) {
        field5210++;
        int var1 = -14 / ((arg0 + 2) / 51);
        class32 var2 = class136.method854(15, (byte) 79, 0);
        var2.method192(-17451);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method2112(byte arg0) {
        if (arg0 != -52) {
            method2112((byte) 74);
        }
        field5212 = null;
        field5207 = null;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static final void method2113(int arg0) {
        class143.field1913.method1485(-22032);
        if (arg0 == 0) {
            field5209++;
        }
    }
}
