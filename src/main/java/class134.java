import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class134 {

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
    public static int[] field2153 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "[I")
    public static int[] field2156 = new int[5];

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
    public static int[] field2158 = new int[8];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Lak;")
    public static class219 field2159;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public static void method1105(boolean arg0) {
        field2159 = null;
        field2156 = null;
        field2158 = null;
        if (arg0) {
            method1106(-59L, 76);
        }
        field2153 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(JI)V")
    public static final void method1106(long arg0, int arg1) {
        field2154++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % (long) arg1 == 0L) {
            class85.method647((byte) 28, arg0 - 1L);
            class85.method647((byte) 28, 1L);
        } else {
            class85.method647((byte) 28, arg0);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)Lul;")
    public static final class305 method1107(int arg0, byte arg1) {
        field2152++;
        if (arg1 != -121) {
            return null;
        }
        class305 var2 = (class305) class447.field6511.method103(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class158.field2422.method1355(arg0, -12607, 35);
        class305 var4 = new class305();
        if (var3 != null) {
            var4.method2087(new class37(var3), (byte) 125);
        }
        var4.method2086(true);
        class447.field6511.method113(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V")
    public static final void method1108(boolean arg0) {
        field2151++;
        try {
            if (class439.field6387 == 1) {
                int var1 = class416.field6028.method1602(-82);
                if (var1 > 0 && class416.field6028.method1613(120)) {
                    int var2 = var1 - class198.field2891;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class416.field6028.method1591(53, var2);
                    return;
                }
                class416.field6028.method1614((byte) -111);
                class416.field6028.method1610((byte) -128);
                class452.field6566 = null;
                class44.field660 = null;
                if (class242.field3527 == null) {
                    class439.field6387 = 0;
                } else {
                    class439.field6387 = 2;
                }
            }
            if (!arg0) {
                field2159 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class416.field6028.method1614((byte) -111);
            class439.field6387 = 0;
            class242.field3527 = null;
            class452.field6566 = null;
            class44.field660 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)B")
    public static final byte method1109(int arg0, int arg1, int arg2) {
        field2155++;
        if (~arg1 == arg2) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
