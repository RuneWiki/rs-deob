import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class583 extends class150 {

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
    private int field8146;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
    private int field8151;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    private int field8152;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
    private int field8153;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "Z")
    public static boolean field8154 = false;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
    private int field8147;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "I")
    private int field8148;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
    private int field8156;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    private int field8158;

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "Lgea;")
    public static class76 field8162;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "[B")
    private byte[] field8160;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)V")
    public static void method3320(int arg0) {
        int var1 = -125 / ((69 - arg0) / 43);
        field8162 = null;
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
    public final void method1062(int arg0) {
        field8159++;
        this.field8148 = 0;
        if (arg0 != 255) {
            method3321(84);
        }
        this.field8147 = 0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBI)V")
    public void method946(int arg0, byte arg1, int arg2) {
        field8157++;
        if (arg2 != -28541) {
            this.field8148 = 42;
        }
        this.field8160[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)V")
    public static final void method3321(int arg0) {
        class372.field4784.method3065(true);
        field8155++;
        if (arg0 <= 17) {
            method3321(-109);
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class583(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field8146 = (int) (arg7 * 4096.0F);
        this.field8151 = (int) (arg6 * 4096.0F);
        this.field8153 = this.field8152 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public final void method1055(int arg0) {
        this.field8147 >>= 0x4;
        this.field8153 = this.field8152;
        field8150++;
        if (this.field8147 < 0) {
            this.field8147 = 0;
        } else if (this.field8147 > 255) {
            this.field8147 = 255;
        }
        this.method946(this.field8148++, (byte) this.field8147, -28541);
        this.field8147 = 0;
        if (arg0 != -25494) {
            this.field8152 = 15;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
    public final void method1060(int arg0, int arg1, int arg2) {
        if (arg0 != -805372180) {
            return;
        }
        if (arg1 == 0) {
            this.field8156 = this.field8151 - (arg2 < 0 ? -arg2 : arg2);
            this.field8156 = this.field8156 * this.field8156 >> 12;
            this.field8158 = 4096;
            this.field8147 = this.field8156;
        } else {
            this.field8158 = this.field8156 * this.field8146 >> 12;
            if (this.field8158 < 0) {
                this.field8158 = 0;
            } else if (this.field8158 > 4096) {
                this.field8158 = 4096;
            }
            this.field8156 = this.field8151 - (arg2 >= 0 ? arg2 : -arg2);
            this.field8156 = this.field8156 * this.field8156 >> 12;
            this.field8156 = this.field8158 * this.field8156 >> 12;
            this.field8147 += this.field8156 * this.field8153 >> 12;
            this.field8153 = this.field8153 * this.field8152 >> 12;
        }
        field8149++;
    }
}
