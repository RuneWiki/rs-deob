import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class182 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field2961 = -1;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1336(int arg0) {
        field2957++;
        class171.field2811.method1359(97);
        if (arg0 == -24206) {
            ;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lrd;", line = 31)
    public static final class146 method1337(int arg0, byte arg1) {
        class146 var2 = (class146) class198.field3165.method1351((long) arg0, 63);
        field2959++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class32.field473.method1813(arg0, 1, true);
        if (arg1 <= 71) {
            return (class146) null;
        }
        class146 var4 = new class146();
        if (var3 != null) {
            var4.method1076(true, arg0, new class6(var3));
        }
        class198.field3165.method1347(var4, (long) arg0, (byte) -123);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BIZ)Ljava/lang/Object;", line = 62)
    public static final Object method1338(byte[] arg0, int arg1, boolean arg2) {
        field2955++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == 9117) {
            if (arg0.length > 136 && !class21.field317) {
                try {
                    class340 var3 = (class340) Class.forName("qa").getDeclaredConstructor().newInstance();
                    var3.method721(true, arg0);
                    return var3;
                } catch (Throwable var5) {
                    class21.field317 = true;
                }
            }
            return arg2 ? class279.method1961(arg0, (byte) 117) : arg0;
        } else {
            return (Object) null;
        }
    }
}
