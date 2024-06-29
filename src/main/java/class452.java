import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class452 extends class498 {

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field6513;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "Z")
    public static boolean field6507 = false;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "[Lvf;")
    public static class151[] field6509 = new class151[1024];

    @OriginalMember(owner = "client!td", name = "E", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6510 = new Rectangle[100];

    @OriginalMember(owner = "client!td", name = "C", descriptor = "[Luk;")
    public static class260[] field6508 = new class260[4];

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field6516;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field6510[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 19)
    public static final void method2780(byte arg0) {
        field6516++;
        class620 var1 = class529.field7530;
        synchronized (class529.field7530) {
            class529.field7530.method3549(0);
        }
        class620 var2 = class132.field1443;
        synchronized (class132.field1443) {
            class132.field1443.method3549(0);
            if (arg0 > -54) {
                method2782((byte) 56);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 35)
    public class452(Object arg0, int arg1) {
        super(arg1);
        this.field6513 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 43)
    public final Object method1990(byte arg0) {
        field6512++;
        if (arg0 != -102) {
            this.field6513 = null;
        }
        return this.field6513;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILoh;IIZ)V", line = 54)
    public static final void method2781(int arg0, int arg1, int arg2, class404 arg3, int arg4, int arg5, boolean arg6) {
        field6515++;
        if (arg2 <= 62) {
            method2781(14, -28, -40, null, 88, -95, false);
        }
        if (arg4 <= 0) {
            class294.method1748(15251, arg1, arg6, arg3, arg5, arg0);
            return;
        }
        class446.field6457 = 1;
        class34.field372 = arg6;
        class462.field6583 = arg3;
        class30.field344 = arg1;
        class407.field5582 = arg0;
        class344.field4471 = null;
        class163.field1819 = arg5;
        class231.field2696 = class41.field465.method1356(false) / arg4;
        if (class231.field2696 < 1) {
            class231.field2696 = 1;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V", line = 84)
    public static void method2782(byte arg0) {
        field6508 = null;
        if (arg0 == -72) {
            field6509 = null;
            field6510 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z", line = 101)
    public final boolean method1989(int arg0) {
        if (arg0 != 393216) {
            method2783(116, 23, -78);
        }
        field6511++;
        return false;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)Z", line = 113)
    public static final boolean method2783(int arg0, int arg1, int arg2) {
        field6514++;
        if (arg2 <= 55) {
            method2783(-112, 8, 31);
        }
        return (arg1 & 0x800) != 0;
    }
}
