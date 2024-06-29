import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class66 extends class435 {

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "I")
    public int field954 = -1;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "Z")
    public boolean field947 = false;

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "Lhp;")
    public static class329 field955 = new class329();

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "[I")
    public static int[] field957 = new int[64];

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "[I")
    public static int[] field950;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static final void method542(byte arg0) {
        field948++;
        if (arg0 != -59) {
            return;
        }
        if (class525.field7713.method3471(class76.field1182, false) || class416.field5926 == class132.field2149) {
            class149.method1133(arg0 - 17207, class637.field9048);
            if (class84.field1271 != class416.field5926) {
                class247.method1588(-110);
            }
        } else {
            class613.method3465(false, 11, false, class316.field4372, class443.field6420);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public static void method543(int arg0) {
        field957 = null;
        if (arg0 < 95) {
            field957 = null;
        }
        field955 = null;
        field950 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 32 / ((arg2 + 14) / 39);
        field956++;
        if (class525.field7713.field5973 != 0 && arg4 != 0 && class222.field3314 < 50 && arg5 != -1) {
            class428.field6114[class222.field3314++] = new class105((byte) 1, arg5, arg4, arg3, arg6, arg1, arg0, null);
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(I)V")
    public class66(int arg0) {
        this.field954 = arg0;
    }
}
