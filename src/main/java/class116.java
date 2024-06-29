import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class116 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1672 = 0;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "[J")
    public static long[] field1680 = new long[100];

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[S")
    public static short[] field1678 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ldh;")
    public static class9 field1675 = new class9();

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "J")
    public long field1671;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lpe;")
    public class258 field1681;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
    public static boolean field1683;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lm;")
    public static final class149 method704(int arg0, int arg1) {
        field1674++;
        class149 var2 = (class149) class21.field251.method1537((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1103.method842(class118.method718(arg0, 127), (byte) 112, class58.method376(arg0, arg1 + 10431));
        class149 var4 = new class149();
        if (arg1 != -10304) {
            return null;
        }
        if (var3 != null) {
            var4.method941(65535, new class56(var3));
        }
        var4.method939((byte) 100);
        class21.field251.method1532(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method705(int arg0) {
        if (arg0 > -33) {
            field1680 = null;
        }
        field1680 = null;
        field1678 = null;
        field1675 = null;
    }
}
