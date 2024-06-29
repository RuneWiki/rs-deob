import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class518 {

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Lpea;")
    public class641 field7145;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[I")
    public static int[] field7146 = new int[25];

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field7147 = 0;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[[I")
    public static int[][] field7144 = new int[6][];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field7142;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7140;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2946(int arg0, int arg1, int arg2) {
        field7139++;
        class252 var3 = class578.field7980.method1746(arg0, (byte) 65);
        if (~arg1 == arg2) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method1572(arg1, (byte) 76);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 24)
    public static final void method2947(int arg0) {
        class403.field5708.method3142(false);
        if (arg0 != 2324) {
            method2949(42);
        }
        field7143++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V", line = 36)
    public static final void method2948(byte arg0, int arg1) {
        int var2 = -7 / (-arg0 / 59);
        field7138++;
        class224.field2919 = arg1;
        class560 var3 = class31.field301;
        synchronized (class31.field301) {
            class31.field301.method3142(false);
        }
        class560 var4 = class445.field6125;
        synchronized (class445.field6125) {
            class445.field6125.method3142(false);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lpea;)V", line = 60)
    public class518(class641 arg0) {
        this.field7145 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V", line = 71)
    public static void method2949(int arg0) {
        int var1 = -128 / ((8 - arg0) / 39);
        field7146 = null;
        field7140 = null;
        field7142 = null;
        field7144 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public abstract void method1137(int arg0);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZI)V")
    public abstract void method1134(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1131(boolean arg0);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
    public abstract void method1133(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLwq;I)V")
    public abstract void method1138(byte arg0, class254 arg1, int arg2);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
    public abstract void method1139(boolean arg0, byte arg1);
}
