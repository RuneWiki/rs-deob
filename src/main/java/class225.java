import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class225 extends class7 {

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "[B")
    public byte[] field3738;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3741 = " more options";

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "[I")
    public static int[] field3739 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "[I")
    public static int[] field3744 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V", line = 10)
    public static void method1610(int arg0) {
        field3741 = null;
        field3744 = null;
        if (arg0 != -1) {
            method1613(107, false);
        }
        field3739 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljd;I)V", line = 22)
    public static final void method1611(class124 arg0, int arg1) {
        field3745++;
        if (arg1 < 18) {
            method1610(32);
        }
        if ((arg0 instanceof class50)) {
            class50 var2 = (class50) arg0;
            if (var2.field615 != null) {
                class183.method1252(var2, 0);
            }
        } else if (arg0 instanceof class219) {
            class181.method1244((class219) arg0, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)Z", line = 47)
    public static final boolean method1612(int arg0) {
        if (arg0 != -1) {
            method1610(33);
        }
        field3742++;
        return class144.field2267 > 0;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([B)V", line = 57)
    public class225(byte[] arg0) {
        this.field3738 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V", line = 71)
    public static final void method1613(int arg0, boolean arg1) {
        field3740++;
        if (class190.field3107 != arg1) {
            class190.field3107 = arg1;
            class341.method2241(arg0);
        }
    }
}
