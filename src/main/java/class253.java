import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class253 extends class165 {

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "J")
    public long field4039;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "[I")
    public static int[] field4036 = new int[1000];

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Lak;")
    public static class172 field4040;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[Lek;")
    public static class220[] field4041;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 4)
    public static final void method1820(String arg0, byte arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg1 <= 88) {
            method1820((String) null, (byte) 124);
        }
        field4042++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V", line = 16)
    public static final void method1821(byte arg0) {
        if (arg0 <= -84) {
            class193.field3141.method707(0);
            field4038++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V", line = 28)
    public static final void method1822(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            field4036 = (int[]) null;
        }
        if (class98.field1410 <= arg2 && arg2 <= class279.field4497) {
            int var5 = class33.method178(class191.field3131, class336.field5249, arg0, 49);
            int var6 = class33.method178(class191.field3131, class336.field5249, arg1, 28);
            class320.method2249((byte) 49, var6, arg3, arg2, var5);
        }
        field4037++;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 47)
    public static void method1823(int arg0) {
        if (arg0 == 22679) {
            field4041 = null;
            field4040 = null;
            field4036 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 65)
    public class253() {
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(J)V", line = 71)
    public class253(long arg0) {
        this.field4039 = arg0;
    }
}
