import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class68 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
    public static boolean field874 = true;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static final void method455(byte arg0) {
        class69.field894.method1702(class166.field2234, class181.field2400, class167.field2261);
        if (arg0 > -89) {
            method455((byte) -58);
        }
        field877++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIZI)Lhs;")
    public static final class420 method456(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field876++;
        if (arg5) {
            method455((byte) -89);
        }
        long var7 = (long) arg1 * 32147369L ^ (long) arg0 * 986053L ^ (long) arg6 * 475427L ^ (long) arg2 * 97549L ^ (long) arg3 * 67481L ^ (long) arg4 * 76724863L;
        class420 var9 = (class420) class390.field5615.method1137(var7, 2108653711);
        if (var9 == null) {
            class420 var10 = class69.field894.method1774(arg3, arg2, arg6, arg0, arg1, arg4);
            class390.field5615.method1144(var7, var10, -3480);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lja;")
    public static final class90 method457(int arg0, int arg1) {
        field878++;
        class90 var2 = (class90) class174.field2324.method1137((long) arg0, 2108653711);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class142.field1924.method2261(arg0, 1, 127);
        class90 var4 = new class90();
        var4.field1268 = arg0;
        if (arg1 != 0) {
            return null;
        }
        if (var3 != null) {
            var4.method631(new class228(var3), arg1 ^ 0x78);
        }
        var4.method633((byte) 86);
        if (var4.field1260 == 2 && class3.field38.method384((long) arg0, true) == null) {
            class3.field38.method381(true, new class279(class263.field3818), (long) arg0);
            class307.field4525[class263.field3818++] = var4;
        }
        class174.field2324.method1144((long) arg0, var4, -3480);
        return var4;
    }
}
