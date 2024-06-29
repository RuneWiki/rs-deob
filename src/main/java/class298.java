import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class298 extends class170 {

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "Lod;")
    public class138 field4088;

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "Lw;")
    public class236 field4092;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "[I")
    public static int[] field4089 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "(I)V", line = 14)
    public final void method1818(int arg0) {
        this.field4091 = this.field4088.field2033;
        this.field4087 = this.field4088.field2032;
        if (arg0 < 104) {
            method1822((byte) 66);
        }
        field4082++;
        this.field4084 = this.field4088.field2028;
        if (this.field4088.field2029 != null) {
            this.field4088.field2029.method1860(this.field4092.field3369, this.field4092.field3352, this.field4092.field3370, class133.field1994);
        }
        this.field4083 = class133.field1994[2];
        this.field4085 = class133.field1994[0];
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 37)
    public static final String method1819(boolean arg0, String arg1) {
        if (arg0) {
            method1820(-12, (byte) -121, -110, -83);
        }
        field4081++;
        String var2 = class444.method2748((byte) -17, class264.method1689(arg1, (byte) 110));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBII)V", line = 55)
    public static final void method1820(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 20) {
            field4089 = null;
        }
        field4090++;
        int var4 = class1.field2 * arg0 >> 8;
        if (var4 != 0 && arg2 != -1) {
            class300.method1827(0, arg2, false, class15.field210, var4, (byte) -74);
            class133.field1993 = true;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLvg;)V", line = 75)
    public static final void method1821(byte arg0, class108 arg1) {
        field4086++;
        if (arg0 <= -57 && class251.field3507 == arg1.field1595) {
            class363.field4998[arg1.field1556] = true;
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)V", line = 92)
    public static void method1822(byte arg0) {
        if (arg0 == -75) {
            field4089 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lod;Lrs;)V", line = 104)
    public class298(class138 arg0, class240 arg1) {
        this.field4088 = arg0;
        this.field4092 = class305.method1845(82, arg0.field2030);
        this.method1818(114);
    }
}
