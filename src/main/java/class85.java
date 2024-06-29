import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class85 extends class296 {

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    private int field1754;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    private int field1750;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field1753 = -1;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Z")
    public static boolean field1747 = false;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Los;")
    public static class309 field1746 = new class309("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    private int field1748;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    private int field1751;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    private int field1762;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "[B")
    private byte[] field1749;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 4)
    public final void method789(byte arg0) {
        this.field1750 = this.field1761;
        this.field1748 >>= 0x4;
        field1759++;
        if (this.field1748 < 0) {
            this.field1748 = 0;
        } else if (this.field1748 > 255) {
            this.field1748 = 255;
        }
        this.method795(false, this.field1758++, (byte) this.field1748);
        this.field1748 = 0;
        if (arg0 >= -95) {
            this.method795(false, 19, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V", line = 29)
    public final void method790(int arg0, int arg1, int arg2) {
        field1752++;
        if (arg1 == arg2) {
            this.field1751 = this.field1756 - (arg0 < 0 ? -arg0 : arg0);
            this.field1762 = 4096;
            this.field1751 = this.field1751 * this.field1751 >> 12;
            this.field1748 = this.field1751;
            return;
        }
        this.field1762 = this.field1754 * this.field1751 >> 12;
        if (this.field1762 < 0) {
            this.field1762 = 0;
        } else if (this.field1762 > 4096) {
            this.field1762 = 4096;
        }
        this.field1751 = this.field1756 - (arg0 < 0 ? -arg0 : arg0);
        this.field1751 = this.field1751 * this.field1751 >> 12;
        this.field1751 = this.field1762 * this.field1751 >> 12;
        this.field1748 += this.field1751 * this.field1750 >> 12;
        this.field1750 = this.field1761 * this.field1750 >> 12;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 75)
    public final void method791(int arg0) {
        field1764++;
        if (arg0 < 72) {
            this.method795(false, 35, (byte) 103);
        }
        this.field1758 = 0;
        this.field1748 = 0;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V", line = 87)
    public static void method792(byte arg0) {
        field1746 = null;
        if (arg0 >= -47) {
            field1747 = true;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V", line = 97)
    public static final void method793(boolean arg0) {
        class441.field6558 = null;
        field1763++;
        class106.method909(0, -1, 0, 0, class71.field1415, 0, class155.field2523, class65.field1330, arg0);
        if (class441.field6558 != null) {
            class352.method2181(class303.field4544, class44.field779.field5780, 0, class224.field3510, class441.field6558, class65.field1330, -1412584499, 0, -96, class71.field1415);
            class441.field6558 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIIIFFF)V", line = 112)
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1756 = (int) (arg6 * 4096.0F);
        this.field1754 = (int) (arg7 * 4096.0F);
        this.field1750 = this.field1761 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V", line = 124)
    public static final void method794(byte arg0, int arg1) {
        field1757++;
        int var2 = 114 / ((arg0 + 31) / 44);
        class18 var3 = class140.method1047(9, arg1, false);
        var3.method123(20983);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIB)V", line = 138)
    public void method795(boolean arg0, int arg1, byte arg2) {
        field1760++;
        this.field1749[arg1] = arg2;
        if (arg0) {
            field1747 = false;
        }
    }
}
