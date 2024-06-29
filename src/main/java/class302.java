import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class302 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lff;")
    public static class9 field3986 = new class9(39, -1);

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
    public static int[] field3992 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[B")
    public static byte[] field3991 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lff;")
    public static class9 field3990 = new class9(58, 8);

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lqa;")
    public static class162 field3987;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Loa;")
    public static class489 field3995;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3993;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field3987 = null;
        field3986 = null;
        field3992 = null;
        field3991 = null;
        field3990 = null;
        field3993 = null;
        if (arg0 >= -116) {
            method1760(91, null);
        }
        field3995 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
    public static final int method1758(int arg0, int arg1) {
        field3988++;
        int var2 = 0;
        if (arg0 != 16) {
            return 96;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    public static final void method1759(boolean arg0, int arg1) {
        field3994++;
        class379.field5183 = arg1;
        class236 var2 = class165.field2408;
        synchronized (class165.field2408) {
            if (!arg0) {
                field3991 = null;
            }
            class165.field2408.method1458((byte) -108);
        }
        class236 var3 = class388.field5270;
        synchronized (class388.field5270) {
            class388.field5270.method1458((byte) 67);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILsq;)I")
    public static final int method1760(int arg0, class117 arg1) {
        field3989++;
        class506 var2 = arg1.field1661;
        if (var2.field6971 != null) {
            var2 = var2.method2885(5, class301.field3980);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field6983;
        if (arg0 >= -79) {
            method1758(-7, -88);
        }
        class20 var4 = arg1.method2600(71);
        if (arg1.field6217) {
            var3 = var2.field7014;
        } else if (arg1.field6172 == var4.field337 || arg1.field6172 == var4.field333 || arg1.field6172 == var4.field340 || arg1.field6172 == var4.field370) {
            var3 = var2.field6987;
        } else if (arg1.field6172 == var4.field339 || arg1.field6172 == var4.field373 || arg1.field6172 == var4.field357 || arg1.field6172 == var4.field324) {
            var3 = var2.field6990;
        }
        return var3;
    }
}
