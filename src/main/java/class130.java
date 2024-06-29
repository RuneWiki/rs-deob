import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class130 extends class363 implements class641 {

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    private int field1567 = -1;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    private int field1575 = -1;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "Ljaa;")
    private class576 field1583;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field1573 = 0;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() throws Throwable {
        field1582++;
        this.method841(0);
        super.finalize();
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljaa;III)V", line = 118)
    public class130(class576 arg0, int arg1, int arg2, int arg3) {
        this.field1578 = arg1;
        this.field1580 = arg3;
        this.field1583 = arg0;
        this.field1574 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class128.field1560, 0);
        this.field1579 = class128.field1560[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1579);
        OpenGL.glRenderbufferStorageEXT(36161, this.field1578, this.field1574, this.field1580);
        this.field1570 = this.field1580 * this.field1574 * this.field1583.method3162(this.field1578, (byte) 89);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljaa;IIII)V", line = 133)
    public class130(class576 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1580 = arg3;
        this.field1583 = arg0;
        this.field1578 = arg1;
        this.field1574 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class128.field1560, 0);
        this.field1579 = class128.field1560[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1579);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field1578, this.field1574, this.field1580);
        this.field1570 = this.field1580 * this.field1574 * this.field1583.method3162(this.field1578, (byte) 89);
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 25)
    public final void method841(int arg0) {
        if (this.field1579 > 0) {
            this.field1583.method3139(this.field1579, this.field1570, 2);
            this.field1579 = 0;
        }
        if (arg0 == 0) {
            field1576++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)Ljava/lang/String;", line = 60)
    public static final String method842(byte arg0) {
        if (arg0 != 83) {
            return null;
        }
        field1577++;
        String var1 = "www";
        if (class50.field645 == class257.field3292) {
            var1 = "www-wtrc";
        } else if (class257.field3292 == class16.field152) {
            var1 = "www-wtqa";
        } else if (class295.field3761 == class257.field3292) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class122.field1487 != null) {
            var2 = "/p=" + class122.field1487;
        }
        return "http://" + var1 + "." + class341.field4353.field8727 + ".com/l=" + class71.field912 + "/a=" + class594.field7969 + var2 + "/";
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 90)
    public final void method298(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field1575, this.field1567, 36161, 0);
        field1571++;
        this.field1567 = -1;
        if (arg0 != -99) {
            this.field1570 = -84;
        }
        this.field1575 = -1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 103)
    public final void method843(int arg0, int arg1, int arg2) {
        field1569++;
        if (arg0 != -1) {
            field1568 = 112;
        }
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field1579);
        this.field1567 = arg1;
        this.field1575 = arg2;
    }
}
