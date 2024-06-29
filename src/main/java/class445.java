import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class445 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "S")
    public static short field6322 = 205;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field6326 = 0;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lmu;")
    public static class303 field6320 = new class303(25, 6);

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Lmu;")
    public static class303 field6327 = new class303(99, -1);

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "Ljava/lang/Object;")
    public static volatile Object field6328 = null;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Lcs;")
    public static class342 field6324;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Lat;")
    public static class378 field6321;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 6)
    public static void method2674(int arg0) {
        if (arg0 != -1) {
            field6321 = null;
        }
        field6328 = null;
        field6327 = null;
        field6321 = null;
        field6320 = null;
        field6324 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method2675(int arg0, int arg1, int arg2) {
        field6325++;
        if (arg0 != 393216) {
            field6323 = -106;
        }
        return class421.method2586(arg1, arg2, 102) | (arg1 & 0x60000) != 0 || class397.method2488(arg2, (byte) -99, arg1);
    }
}
