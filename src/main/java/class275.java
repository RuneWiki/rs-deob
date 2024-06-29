import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class275 extends class115 {

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    private int field4413 = 3216;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "[I")
    private int[] field4414 = new int[3];

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    private int field4411 = 3216;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    private int field4419 = 4096;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "Z")
    public static boolean field4406 = false;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "[Lkl;")
    public static class114[] field4412 = new class114[2048];

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field4416 = -1;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "[Llk;")
    public static class244[] field4405;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "[Lha;")
    public static class267[] field4409;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V")
    private final void method1851(int arg0) {
        double var2 = Math.cos((double) ((float) this.field4411 / 4096.0F));
        if (arg0 < 5) {
            method1854(17);
        }
        ++field4415;
        this.field4414[0] = (int) (Math.sin((double) ((float) this.field4413 / 4096.0F)) * var2 * 4096.0D);
        this.field4414[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field4413 / 4096.0F)));
        this.field4414[2] = (int) (4096.0D * Math.sin((double) ((float) this.field4411 / 4096.0F)));
        int var4 = this.field4414[2] * this.field4414[2] >> 12;
        int var5 = this.field4414[1] * this.field4414[1] >> 12;
        int var6 = this.field4414[0] * this.field4414[0] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var6 - (-var4 + -var5) >> 12)));
        if (var7 != 0) {
            this.field4414[1] = (this.field4414[1] << 12) / var7;
            this.field4414[0] = (this.field4414[0] << 12) / var7;
            this.field4414[2] = (this.field4414[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(III)I")
    public static final int method1852(int arg0, int arg1, int arg2) {
        ++field4410;
        if (~arg1 == 0) {
            return 12345678;
        } else {
            int var3 = (127 & arg1) * arg0 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg2 < 7) {
                method1854(64);
            }
            return (arg1 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBIII)V")
    public static final void method1853(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field4417;
        if (arg1 < 15) {
            method1853(110, (byte) -52, -57, -102, 33);
        }
        for (int var5 = 0; var5 < class220.field3252; ++var5) {
            if (~arg4 > ~(class99.field1480[var5] + class263.field3964[var5]) && arg0 + arg4 > class99.field1480[var5] && arg2 < class109.field1579[var5] + class1.field4[var5] && ~class1.field4[var5] > ~(arg2 + arg3)) {
                class119.field1753[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field4407;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int var4 = class279.field4459 * this.field4419 >> 12;
            int[] var5 = this.method797(0, class5.field136 & arg1 + -1, 102);
            int[] var6 = this.method797(0, arg1, arg0 + -242152857);
            int[] var7 = this.method797(0, class5.field136 & arg1 + 1, 125);
            for (int var8 = 0; ~var8 > ~class77.field1178; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class207.field2992 & var8 - 1] + -var6[var8 - -1 & class207.field2992]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class59.field900[var12 - -((var11 + 1) * var11 >> 1)] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field4414[2] * var15 >> 12;
                int var17 = this.field4414[0] * var14 >> 12;
                int var18 = var9 * var13 >> 8;
                int var19 = this.field4414[1] * var18 >> 12;
                var3[var8] = var17 - -var19 - -var16;
            }
        }
        if (arg0 != 242152972) {
            this.method1851(-30);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
    public static void method1854(int arg0) {
        if (arg0 != -14206) {
            field4405 = null;
        }
        field4412 = null;
        field4405 = null;
        field4409 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class275() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4411 = arg1.method756(-29901);
                }
            } else {
                this.field4413 = arg1.method756(-29901);
            }
        } else {
            this.field4419 = arg1.method756(-29901);
        }
        if (arg0 != -1) {
            this.field4419 = 1;
        }
        ++field4408;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        this.method1851(20);
        int var2 = 21 / ((arg0 - 78) / 42);
        ++field4418;
    }
}
