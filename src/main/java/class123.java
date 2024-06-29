import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class123 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[Ltk;")
    public static class249[] field1914 = new class249[14];

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Z")
    public static boolean field1913 = false;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field1922 = 99;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lna;")
    public static class26 field1921 = class69.method505("gr-Un:", (byte) -118);

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
    public static float field1915;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lve;")
    public static class266 field1918;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLwa;Lna;)I", line = 17)
    public static final int method843(boolean arg0, class82 arg1, class26 arg2) {
        if (arg0) {
            method846(17);
        }
        int var3 = arg1.field1301;
        field1916++;
        byte[] var4 = arg2.method199(0);
        arg1.method607(-32769, var4.length);
        arg1.field1301 += class245.field4024.method1836(var4.length, -81, arg1.field1280, var4, 0, arg1.field1301);
        return arg1.field1301 - var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lve;BII)[Lok;", line = 34)
    public static final class150[] method844(class266 arg0, byte arg1, int arg2, int arg3) {
        field1919++;
        if (arg1 != -12) {
            field1922 = 37;
        }
        return class196.method1317(arg0, arg2, arg3, -30901) ? class264.method1859(1854847236) : null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 60)
    public static final void method845(int arg0) {
        class219.field3497 = arg0;
        for (int var1 = 0; var1 < class285.field4778; var1++) {
            for (int var2 = 0; var2 < class303.field5221; var2++) {
                if (class36.field585[arg0][var1][var2] == null) {
                    class36.field585[arg0][var1][var2] = new class55(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 87)
    public static void method846(int arg0) {
        field1918 = null;
        if (arg0 != -25247) {
            field1914 = (class249[]) null;
        }
        field1921 = null;
        field1914 = null;
    }
}
