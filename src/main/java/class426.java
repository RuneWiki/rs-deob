import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class426 extends class436 {

    @OriginalMember(owner = "client!dr", name = "T", descriptor = "I")
    private int field6118 = -1;

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6110 = new Rectangle[100];

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "J")
    public static long field6107 = 0L;

    @OriginalMember(owner = "client!dr", name = "S", descriptor = "I")
    public static volatile int field6117 = 0;

    @OriginalMember(owner = "client!dr", name = "R", descriptor = "Lbr;")
    public static class223 field6116 = new class223(16);

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    private int field6106;

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "I")
    private int field6108;

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!dr", name = "M", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!dr", name = "N", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!dr", name = "O", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!dr", name = "P", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!dr", name = "U", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!dr", name = "V", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!dr", name = "W", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!dr", name = "Q", descriptor = "Lge;")
    public static class423 field6115;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "[I")
    private int[] field6105;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILeb;)V", line = 5)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg1 == 0) {
            this.field6118 = arg2.method2403((byte) 73);
        }
        if (arg0 != 34) {
            this.method85(65, -76);
        }
        ++field6113;
    }

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "(I)V", line = 19)
    public static void method2681(int arg0) {
        if (arg0 == -5420) {
            field6110 = null;
            field6115 = null;
            field6116 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)I", line = 33)
    public final int method2682(byte arg0) {
        if (arg0 != 98) {
            return 83;
        } else {
            ++field6119;
            return this.field6118;
        }
    }

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)V", line = 47)
    public static final void method2683(int arg0) {
        class15.field188 = null;
        ++field6111;
        if (arg0 != 31945) {
            method2681(59);
        }
        class333.field4510 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)V", line = 60)
    public final void method2684(int arg0, byte arg1, int arg2) {
        super.method2684(arg0, (byte) -115, arg2);
        ++field6121;
        if (arg1 < -21) {
            if (this.field6118 >= 0 && class123.field1725 != null) {
                int var4 = class123.field1725.method607(false, this.field6118).field2301 ? 64 : 128;
                this.field6105 = class123.field1725.method613(1.0F, this.field6118, var4, (byte) 80, false, var4);
                this.field6108 = var4;
                this.field6106 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V", line = 89)
    public class426() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)[[I", line = 102)
    public final int[][] method85(int arg0, int arg1) {
        ++field6109;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (arg0 != -13348) {
            this.method2682((byte) -101);
        }
        if (super.field6259.field3950) {
            int var4 = (class123.field1728 == this.field6106 ? arg1 : this.field6106 * arg1 / class123.field1728) * this.field6108;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class43.field653 != ~this.field6108) {
                for (int var8 = 0; var8 < class43.field653; ++var8) {
                    int var9 = this.field6108 * var8 / class43.field653;
                    int var10 = this.field6105[var4 - -var9];
                    var7[var8] = class318.method2028(255, var10) << 4;
                    var6[var8] = class318.method2028(65280, var10) >> 4;
                    var5[var8] = class318.method2028(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class43.field653; ++var11) {
                    int var12 = this.field6105[var4++];
                    var7[var11] = class318.method2028(var12 << 4, 4080);
                    var6[var11] = class318.method2028(4080, var12 >> 4);
                    var5[var11] = class318.method2028(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(II)Lgn;", line = 171)
    public static final class417 method2685(int arg0, int arg1) {
        ++field6120;
        class417 var2 = (class417) class446.field6433.method1246((byte) -27, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 != -4871) {
                method2683(68);
            }
            byte[] var3 = class321.field4395.method1920(arg1, false, 35);
            class417 var4 = new class417();
            if (var3 != null) {
                var4.method2659((byte) 51, new class371(var3));
            }
            var4.method2658(false);
            class446.field6433.method1247((long) arg1, (byte) 98, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V", line = 204)
    public final void method1668(int arg0) {
        super.method1668(arg0);
        if (arg0 == 14) {
            ++field6114;
            this.field6105 = null;
        }
    }
}
