import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class59 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Z")
    public static boolean field811 = false;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field812 = -1;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[S")
    public static short[] field815;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method406(byte arg0) {
        field815 = null;
        if (arg0 != 108) {
            method406((byte) 37);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)J")
    public static final synchronized long method407(int arg0) {
        field813++;
        long var1 = System.currentTimeMillis();
        if (arg0 > -34) {
            return -95L;
        }
        if (class2.field18 > var1) {
            class80.field1209 += class2.field18 - var1;
        }
        class2.field18 = var1;
        return var1 + class80.field1209;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
    public static final void method408(int arg0, byte arg1) {
        field810++;
        class170 var2 = (class170) class119.field1941.method1527((long) arg0, (byte) -122);
        if (arg1 != 125) {
            field809 = 82;
        }
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field2964.length; var3++) {
                var2.field2964[var3] = -1;
                var2.field2960[var3] = 0;
            }
        }
    }
}
