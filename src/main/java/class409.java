import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class409 extends class368 {

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "I")
    private int field5768;

    @OriginalMember(owner = "client!cga", name = "z", descriptor = "I")
    private int field5772;

    @OriginalMember(owner = "client!cga", name = "A", descriptor = "I")
    private int field5773;

    @OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
    private int field5777;

    @OriginalMember(owner = "client!cga", name = "D", descriptor = "I")
    public static int field5776 = -1;

    @OriginalMember(owner = "client!cga", name = "F", descriptor = "I")
    public static int field5778 = 0;

    @OriginalMember(owner = "client!cga", name = "s", descriptor = "Lvv;")
    public static class442 field5765 = new class442();

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
    private int field5762;

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!cga", name = "r", descriptor = "I")
    private int field5764;

    @OriginalMember(owner = "client!cga", name = "t", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!cga", name = "w", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!cga", name = "x", descriptor = "I")
    private int field5770;

    @OriginalMember(owner = "client!cga", name = "y", descriptor = "I")
    private int field5771;

    @OriginalMember(owner = "client!cga", name = "B", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!cga", name = "C", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "[B")
    private byte[] field5761;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        field5775++;
        if (arg1 == arg2) {
            this.field5770 = this.field5772 - (arg0 >= 0 ? arg0 : -arg0);
            this.field5762 = 4096;
            this.field5770 = this.field5770 * this.field5770 >> 12;
            this.field5764 = this.field5770;
            return;
        }
        this.field5762 = this.field5770 * this.field5768 >> 12;
        this.field5770 = this.field5772 - (arg0 < 0 ? -arg0 : arg0);
        if (this.field5762 < 0) {
            this.field5762 = 0;
        } else if (this.field5762 > 4096) {
            this.field5762 = 4096;
        }
        this.field5770 = this.field5770 * this.field5770 >> 12;
        this.field5770 = this.field5770 * this.field5762 >> 12;
        this.field5764 += this.field5777 * this.field5770 >> 12;
        this.field5777 = this.field5777 * this.field5773 >> 12;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIB)V")
    public void method2343(int arg0, int arg1, byte arg2) {
        if (arg0 < 43) {
            this.method681(27);
        }
        this.field5761[arg1] = arg2;
        field5767++;
    }

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)V")
    public static void method2422(int arg0) {
        if (arg0 != 4096) {
            method2422(-34);
        }
        field5765 = null;
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class409(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5768 = (int) (arg7 * 4096.0F);
        this.field5772 = (int) (arg6 * 4096.0F);
        this.field5777 = this.field5773 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Ltn;I)V")
    public static final void method2423(class179 arg0, int arg1) {
        field5774++;
        int var2 = arg0.method1158(-32768);
        class138.field1652 = new class673[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class138.field1652[var3] = new class673();
            class138.field1652[var3].field9166 = arg0.method1158(-32768);
            class138.field1652[var3].field9165 = arg0.method1109(112);
        }
        class33.field518 = arg0.method1158(-32768);
        class466.field6725 = arg0.method1158(-32768);
        class642.field8864 = arg0.method1158(-32768);
        class233.field3018 = new class266[class466.field6725 + 1 - class33.field518];
        for (int var4 = 0; var4 < class642.field8864; var4++) {
            int var5 = arg0.method1158(-32768);
            class266 var6 = class233.field3018[var5] = new class266();
            var6.field8462 = arg0.method1094(255);
            var6.field8458 = arg0.method1095((byte) 116);
            var6.field3375 = class33.field518 + var5;
            var6.field3362 = arg0.method1109(105);
            var6.field3367 = arg0.method1109(115);
        }
        if (arg1 >= 73) {
            class457.field6395 = arg0.method1095((byte) 118);
            class280.field3552 = true;
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(III)V")
    public static final void method2424(int arg0, int arg1, int arg2) {
        int var3 = 36 % ((-arg2 - 61) / 53);
        class199.field2547 = arg1;
        field5763++;
        class210.field2691 = arg0;
        if (class709.field9973 == 0) {
            class162.field2073 = class115.field1420 * 2 + class210.field2691;
            class635.field8800 = class687.field9708 * 2 + class199.field2547;
        } else if (class709.field9973 == 1) {
            class680.field9231 = class199.field2547 / class112.field1383 + class286.field3625 + 2;
            class665.field9109 = class210.field2691 / class664.field9087 + (class509.field7192 + 2);
            class635.field8800 = class680.field9231 * class112.field1383;
            class162.field2073 = class665.field9109 * class664.field9087;
            class687.field9708 = class635.field8800 - class199.field2547 >> 1;
            class115.field1420 = class162.field2073 - class210.field2691 >> 1;
            return;
        } else if (class709.field9973 == 2) {
            class162.field2073 = class210.field2691;
            class635.field8800 = class199.field2547;
            return;
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V")
    public final void method681(int arg0) {
        this.field5764 = 0;
        this.field5771 = 0;
        field5766++;
        if (arg0 > -59) {
            this.field5768 = -108;
        }
    }

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "(I)V")
    public final void method683(int arg0) {
        this.field5777 = this.field5773;
        this.field5764 >>= 0x4;
        field5769++;
        if (arg0 != -20419) {
            method2422(111);
        }
        if (this.field5764 < 0) {
            this.field5764 = 0;
        } else if (this.field5764 > 255) {
            this.field5764 = 255;
        }
        this.method2343(57, this.field5771++, (byte) this.field5764);
        this.field5764 = 0;
    }
}
