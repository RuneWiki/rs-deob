import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class38 {

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[Lut;")
    private class80[] field518;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field520 = 1;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "J")
    private long field519;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lut;")
    private class80 field512;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field513;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(JBLut;)V")
    public final void method245(long arg0, byte arg1, class80 arg2) {
        if (arg2.field1142 != null) {
            arg2.method581(4);
        }
        field516++;
        class80 var5 = this.field518[(int) (arg0 & (long) (this.field511 - 1))];
        arg2.field1135 = var5;
        arg2.field1142 = var5.field1142;
        arg2.field1142.field1135 = arg2;
        arg2.field1135.field1142 = arg2;
        if (arg1 == -22) {
            arg2.field1140 = arg0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Lut;")
    public final class80 method246(int arg0) {
        if (arg0 > -121) {
            this.method245(68L, (byte) -14, null);
        }
        field515++;
        if (this.field512 == null) {
            return null;
        }
        class80 var2 = this.field518[(int) (this.field519 & (long) (this.field511 - 1))];
        while (this.field512 != var2) {
            if (this.field512.field1140 == this.field519) {
                class80 var3 = this.field512;
                this.field512 = this.field512.field1135;
                return var3;
            }
            this.field512 = this.field512.field1135;
        }
        this.field512 = null;
        return null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static final void method247(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class223.field3131[var1] = false;
        }
        field517++;
        class128.field1742 = 5;
        class410.field5844 = class208.field2951;
        class374.field5279 = class393.field5484;
        class210.field2983 = -1;
        class330.field4501 = 0;
        class128.field1745 = -1;
        int var2 = -92 / ((arg0 - 9) / 57);
        class124.field1700 = class476.field6958;
        class485.field7106 = 0;
        class347.field4761 = class526.field7729;
        class300.field4119 = class310.field4240;
        class1.field8 = class132.field1901;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(JI)Lut;")
    public final class80 method248(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field512 = null;
        }
        this.field519 = arg0;
        field514++;
        class80 var4 = this.field518[(int) ((long) (this.field511 - 1) & arg0)];
        for (this.field512 = var4.field1135; this.field512 != var4; this.field512 = this.field512.field1135) {
            if (this.field512.field1140 == arg0) {
                class80 var5 = this.field512;
                this.field512 = this.field512.field1135;
                return var5;
            }
        }
        this.field512 = null;
        return null;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static void method249(int arg0) {
        if (arg0 != 0) {
            field520 = 61;
        }
        field513 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
    public class38(int arg0) {
        this.field518 = new class80[arg0];
        this.field511 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class80 var3 = this.field518[var2] = new class80();
            var3.field1135 = var3;
            var3.field1142 = var3;
        }
    }
}
