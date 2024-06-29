import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class444 extends class324 {

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
    private int field6181;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
    private int field6174;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    private int field6179;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    private int field6168;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "Lpu;")
    public static class176 field6167 = new class176(0, 0);

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "Lhb;")
    public static class250 field6175 = new class250(37, 8);

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    private int field6171;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
    private int field6176;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    private int field6177;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    private int field6180;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "[B")
    private byte[] field6170;

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIIIIFFF)V", line = 5)
    public class444(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6181 = (int) (arg7 * 4096.0F);
        this.field6174 = (int) (arg6 * 4096.0F);
        this.field6168 = this.field6179 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V", line = 19)
    public final void method1928(int arg0, int arg1, int arg2) {
        int var4 = -69 / ((-arg1 - 20) / 44);
        if (arg0 == 0) {
            this.field6176 = this.field6174 - (arg2 >= 0 ? arg2 : -arg2);
            this.field6177 = 4096;
            this.field6176 = this.field6176 * this.field6176 >> 12;
            this.field6171 = this.field6176;
        } else {
            this.field6177 = this.field6181 * this.field6176 >> 12;
            if (this.field6177 < 0) {
                this.field6177 = 0;
            } else if (this.field6177 > 4096) {
                this.field6177 = 4096;
            }
            this.field6176 = this.field6174 - (arg2 >= 0 ? arg2 : -arg2);
            this.field6176 = this.field6176 * this.field6176 >> 12;
            this.field6176 = this.field6177 * this.field6176 >> 12;
            this.field6171 += this.field6176 * this.field6168 >> 12;
            this.field6168 = this.field6179 * this.field6168 >> 12;
        }
        field6172++;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 54)
    public final void method1924(int arg0) {
        this.field6180 = arg0;
        this.field6171 = 0;
        field6173++;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V", line = 66)
    public final void method1930(int arg0) {
        if (arg0 != -666423860) {
            this.method1928(48, -96, -17);
        }
        this.field6171 >>= 0x4;
        field6169++;
        this.field6168 = this.field6179;
        if (this.field6171 < 0) {
            this.field6171 = 0;
        } else if (this.field6171 > 255) {
            this.field6171 = 255;
        }
        this.method997((byte) this.field6171, this.field6180++, 102);
        this.field6171 = 0;
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V", line = 89)
    public static void method2636(int arg0) {
        field6167 = null;
        field6175 = null;
        if (arg0 <= 62) {
            method2636(-26);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BII)V", line = 111)
    public void method997(byte arg0, int arg1, int arg2) {
        if (arg2 <= 99) {
            field6167 = null;
        }
        this.field6170[arg1] = arg0;
        field6178++;
    }
}
