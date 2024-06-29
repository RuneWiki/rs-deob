import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class285 extends class81 {

    @OriginalMember(owner = "client!np", name = "o", descriptor = "Z")
    public static boolean field4003 = false;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "[I")
    public static int[] field4002 = new int[32];

    @OriginalMember(owner = "client!np", name = "q", descriptor = "Llg;")
    public static class237 field4005 = new class237(30);

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "[I")
    public static int[] field4008;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ldg;I)Ls;")
    public static final class153 method1864(class236 arg0, int arg1) {
        field4006++;
        class153 var2 = new class153();
        if (arg1 != 4096) {
            field4004 = 117;
        }
        var2.field1894 = arg0.method1617((byte) 48);
        var2.field1892 = class193.method1308(-28, var2.field1894);
        return var2;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Lro;")
    public static final class1 method1865(int arg0, int arg1) {
        field4007++;
        class1 var2 = (class1) class281.field3978.method856((long) arg0, (byte) 123);
        if (arg1 != -31016) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class450.field6445.method2431((byte) 76, 5, arg0);
            class1 var4 = new class1();
            if (var3 != null) {
                var4.method1(30500, new class236(var3));
            }
            class281.field3978.method849((byte) 63, var4, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public static void method1866(byte arg0) {
        field4008 = null;
        field4005 = null;
        field4002 = null;
        if (arg0 != 112) {
            field4002 = null;
        }
    }
}
