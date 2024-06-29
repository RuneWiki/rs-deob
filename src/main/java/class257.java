import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class257 extends class155 {

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field4225;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field4229 = 50;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static volatile int field4234 = 0;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field4231 = 2301979;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Llc;")
    public static class86 field4233;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Llc;")
    public static class86 field4235;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)V")
    public static final void method1816(boolean arg0) {
        if (arg0) {
            method1816(true);
        }
        field4236++;
        class254.field4191.method1738(-124);
        class225.field3618 = null;
        class145.field2379 = 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
    public static final void method1817(boolean arg0, int arg1) {
        if (!class102.field1502) {
            arg1 = -1;
        }
        field4230++;
        if (class184.field2958 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class273 var2 = class64.method471(arg1, -8);
            class140 var3 = var2.method1889(-17964);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class138.field2241.method44(var3.method63(), class10.field89, new Point(var2.field4379, var2.field4380), var3.field3274, (byte) -26, var3.field3266);
                class184.field2958 = arg1;
            }
        }
        if (arg1 == -1 && class184.field2958 != -1) {
            class138.field2241.method44((int[]) null, class10.field89, new Point(), -1, (byte) -26, -1);
            class184.field2958 = -1;
        }
        if (arg0) {
            field4234 = 32;
        }
    }

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)V")
    public static final void method1818(int arg0) {
        class216.field3426.method1558(-97);
        field4237++;
        if (arg0 != 50) {
            method1818(-85);
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(Z)V")
    public static void method1819(boolean arg0) {
        if (!arg0) {
            method1816(true);
        }
        field4235 = null;
        field4233 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)I")
    public static final int method1820(int arg0, int arg1, byte arg2) {
        int var3 = 61 % ((60 - arg2) / 46);
        class83 var4 = (class83) class67.field991.method1034((long) arg0, (byte) 21);
        field4232++;
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var4.field1197.length) {
            return var4.field1197[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1150(int arg0) {
        field4228++;
        return arg0 == 256 ? this.field4225 : null;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class257(Object arg0) {
        this.field4225 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Z")
    public final boolean method1147(byte arg0) {
        if (arg0 <= 68) {
            field4235 = null;
        }
        field4226++;
        return false;
    }
}
