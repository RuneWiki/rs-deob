import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public abstract class class371 extends class507 {

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "I")
    public int field5042;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "Lsd;")
    public static class63 field5040 = new class63(13, 0, 1, 0);

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "[I")
    public static int[] field5043 = new int[2];

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "Lao;")
    public static class191 field5041 = new class191(2, 6);

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 6)
    public static void method2197(byte arg0) {
        field5041 = null;
        field5043 = null;
        if (arg0 != -20) {
            method2198(29, -84, -71);
        }
        field5040 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method2198(int arg0, int arg1, int arg2) {
        field5044++;
        if (class242.method1511(arg0, arg1, 3)) {
            return class216.method1375(arg0, 2, arg1) | (arg0 & arg2) != 0 | class481.method2938(arg2 ^ 0xFFFF45B1, arg1, arg0) ? true : (arg1 & 0x37) == 0 & (class151.method905(arg1, arg0, arg2 - 12846) | class389.method2357(false, arg0, arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(I)V", line = 38)
    public class371(int arg0) {
        this.field5042 = arg0;
    }

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method188(int arg0);

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "(I)Z")
    public abstract boolean method187(int arg0);
}
