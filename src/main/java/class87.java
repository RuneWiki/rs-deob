import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public abstract class class87 implements class356 {

    @OriginalMember(owner = "client!iia", name = "e", descriptor = "Z")
    private boolean field1565 = false;

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!iia", name = "s", descriptor = "Z")
    private boolean field1579;

    @OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client!iia", name = "k", descriptor = "Loea;")
    public class594 field1571;

    @OriginalMember(owner = "client!iia", name = "h", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!iia", name = "p", descriptor = "Lcw;")
    public static class179 field1576 = new class179("runescape", 0);

    @OriginalMember(owner = "client!iia", name = "t", descriptor = "[I")
    public static int[] field1580 = new int[32];

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!iia", name = "f", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!iia", name = "i", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!iia", name = "l", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!iia", name = "r", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!iia", name = "u", descriptor = "Ljq;")
    public static class509 field1581;

    @OriginalMember(owner = "client!iia", name = "q", descriptor = "[I")
    public static int[] field1577;

    @OriginalMember(owner = "client!iia", name = "o", descriptor = "[S")
    public static short[] field1575;

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method818(boolean arg0, byte arg1) {
        if (arg0 != this.field1565) {
            this.field1565 = arg0;
            this.method819((byte) 118);
        }
        field1578++;
        if (arg1 != 11) {
            this.method826(true);
        }
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V", line = 20)
    private final void method819(byte arg0) {
        int var2 = -7 / ((61 - arg0) / 48);
        this.field1571.method3425(this, 103);
        field1569++;
        if (this.field1565) {
            OpenGL.glTexParameteri(this.field1567, 10241, this.field1579 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1567, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1567, 10241, this.field1579 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1567, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)Z", line = 42)
    public final boolean method820(int arg0) {
        field1566++;
        if (arg0 != -12650) {
            this.method823(127, false);
        }
        if (!this.field1571.field8624) {
            return false;
        }
        int var2 = this.method824(4);
        this.field1571.method3425(this, -123);
        OpenGL.glGenerateMipmapEXT(this.field1567);
        this.field1579 = true;
        this.method819((byte) 122);
        this.method822(-81, var2);
        return true;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)V", line = 67)
    public final void method821(byte arg0) {
        if (this.field1568 > 0) {
            this.field1571.method3408(this.field1568, this.method824(4), (byte) -15);
            this.field1568 = 0;
        }
        field1573++;
        int var2 = -29 % ((-arg0 - 23) / 60);
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V", line = 88)
    private final void method822(int arg0, int arg1) {
        field1563++;
        this.field1571.field8561 -= arg1;
        if (arg0 <= -75) {
            this.field1571.field8561 += this.method824(4);
        }
    }

    @OriginalMember(owner = "client!iia", name = "finalize", descriptor = "()V", line = 105)
    protected final void finalize() throws Throwable {
        field1561++;
        this.method821((byte) 69);
        super.finalize();
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZ)V", line = 117)
    public final void method823(int arg0, boolean arg1) {
        if (this.field1579 != arg1) {
            int var3 = this.method824(arg0 - 9724);
            this.field1579 = true;
            this.method819((byte) 122);
            this.method822(-95, var3);
        }
        if (arg0 != 9728) {
            this.field1568 = -59;
        }
        field1564++;
    }

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Loea;IIIZ)V", line = 178)
    public class87(class594 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field1562 = arg2;
        this.field1579 = arg4;
        this.field1567 = arg1;
        this.field1574 = arg3;
        this.field1571 = arg0;
        OpenGL.glGenTextures(1, class139.field2159, 0);
        this.field1568 = class139.field2159[0];
        this.method822(-98, 0);
    }

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)I", line = 149)
    private final int method824(int arg0) {
        field1570++;
        if (arg0 == 4) {
            int var2 = this.field1571.method3441(arg0 - 119, this.field1562) * this.field1574;
            return this.field1579 ? var2 * 4 / 3 : var2;
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "(I)V", line = 162)
    public static void method825(int arg0) {
        field1577 = null;
        field1575 = null;
        field1581 = null;
        if (arg0 != -7016) {
            method825(-41);
        }
        field1580 = null;
        field1576 = null;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)I", line = 195)
    public final int method826(boolean arg0) {
        if (!arg0) {
            field1575 = null;
        }
        field1572++;
        return this.field1568;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
    public abstract void method827(int arg0);
}
