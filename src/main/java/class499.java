import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class499 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lwda;")
    public class591 field7068 = new class591();

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "[I")
    public static int[] field7074 = new int[5];

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field7078 = 0;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "F")
    public static float field7077;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
    public static int[] field7073;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[Li;")
    public static class37[] field7071;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Llv;")
    public static final class408 method2884(byte arg0) {
        int var1 = -46 / ((-arg0 - 7) / 41);
        field7069++;
        class408 var2 = (class408) class521.field7339.method2415(-128);
        if (var2 == null) {
            return new class408();
        } else {
            class550.field7761--;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    public static void method2885(byte arg0) {
        field7073 = null;
        field7074 = null;
        if (arg0 != 54) {
            field7074 = null;
        }
        field7071 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static final void method2886(int arg0) {
        field7079++;
        for (int var1 = arg0; var1 < class217.field3042; var1++) {
            int var2 = class85.field1396[var1];
            class16 var3 = (class16) class189.field2723.method1405((long) var2, (byte) -29);
            if (var3 != null) {
                class577 var4 = var3.field174;
                class377.method2268(var4, true, var4.field8121.field8345);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Z")
    public static final boolean method2887(int arg0, int arg1, int arg2) {
        if (arg0 != 458752) {
            field7071 = null;
        }
        field7072++;
        return (arg2 & 0x70000) != 0 | class683.method3779(arg1, 111, arg2) || class309.method1966(arg2, -8614, arg1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Z")
    public static final boolean method2888(int arg0, int arg1) {
        int var2 = -126 / ((arg1 - 12) / 53);
        field7070++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)Z")
    public static final boolean method2889(byte arg0, int arg1, int arg2) {
        if (arg0 <= 42) {
            field7077 = 0.24378115F;
        }
        field7075++;
        return (arg2 & 0x180) != 0;
    }
}
