import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class318 extends class210 {

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    private int field4663 = 20;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    private int field4667 = 0;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    private int field4668 = 1365;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    private int field4676 = 0;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "Lbt;")
    public static class363 field4665 = new class363(64);

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4670 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "[Lpl;")
    public static class459[] field4675 = new class459[29];

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field4672 = -1;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Lct;")
    public static class104 field4666;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "Lct;")
    public static class104 field4674;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field4667 = arg2.method1767(arg1 ^ -1930481709);
                    }
                } else {
                    this.field4676 = arg2.method1767(1930493576);
                }
            } else {
                this.field4663 = arg2.method1767(1930493576);
            }
        } else {
            this.field4668 = arg2.method1767(1930493576);
        }
        if (arg1 != -11941) {
            method2095(-95);
        }
        ++field4664;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
    public static final void method2094(int arg0, int arg1) {
        class100.field1285 = arg1;
        ++field4673;
        class363 var2 = class83.field1019;
        synchronized (class83.field1019) {
            class83.field1019.method2313(98);
        }
        class363 var3 = class18.field293;
        synchronized (class18.field293) {
            class18.field293.method2313(127);
        }
        int var4 = -23 / ((-28 - arg0) / 57);
        class363 var5 = class329.field4898;
        synchronized (class329.field4898) {
            class329.field4898.method2313(118);
        }
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static void method2095(int arg0) {
        field4670 = null;
        field4666 = null;
        field4675 = null;
        field4665 = null;
        field4674 = null;
        if (arg0 != 255) {
            field4670 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)I")
    public static final int method2096(byte arg0, int arg1) {
        int var2 = -63 / ((arg0 - 5) / 34);
        ++field4669;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field4671;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            for (int var4 = 0; ~class202.field2852 < ~var4; ++var4) {
                int var5 = (class430.field6250[var4] << 12) / this.field4668 + this.field4676;
                int var6 = (class331.field4911[arg0] << 12) / this.field4668 + this.field4667;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field4663 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 >= this.field4663 - 1 ? 0 : (var13 << 12) / this.field4663;
            }
        }
        return arg1 != -38 ? null : var3;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class318() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(DB)V")
    public static final void method2097(double arg0, byte arg1) {
        if (arg1 != -3) {
            field4674 = null;
        }
        ++field4662;
        if (class404.field5851 != arg0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class90.field1112[var3] = ~var4 >= -256 ? var4 : 255;
            }
            class404.field5851 = arg0;
        }
    }
}
