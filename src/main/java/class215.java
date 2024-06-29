import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class215 extends class585 {

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    private int field3318 = 2048;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    private int field3322 = 10;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    private int field3320 = 0;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public static int field3323 = -1;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "[I")
    private int[] field3314;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "[I")
    private int[] field3315;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lso;II)V", line = 6)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3320 = arg0.method2964((byte) 69);
                }
            } else {
                this.field3318 = arg0.method2998(true);
            }
        } else {
            this.field3322 = arg0.method2964((byte) 45);
        }
        if (arg1 != 1) {
            this.field3315 = null;
        }
        ++field3317;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Ljava/lang/String;", line = 51)
    public static final String method1476(int arg0, int arg1) {
        if (arg0 != 569) {
            method1476(-13, 75);
        }
        ++field3325;
        return (255 & arg1 >> 24) + "." + (arg1 >> 16 & 255) + "." + ((65304 & arg1) >> 8) + "." + (255 & arg1);
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V", line = 62)
    private final void method1477(byte arg0) {
        ++field3319;
        int var2 = 0;
        this.field3315 = new int[this.field3322 + 1];
        this.field3314 = new int[this.field3322 - -1];
        int var3 = 4096 / this.field3322;
        int var4 = this.field3318 * var3 >> 12;
        for (int var5 = 0; this.field3322 > var5; ++var5) {
            this.field3314[var5] = var2;
            this.field3315[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field3314[this.field3322] = 4096;
        if (arg0 <= 90) {
            field3323 = 123;
        }
        this.field3315[this.field3322] = this.field3315[0] + 4096;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 119)
    public class215() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 100)
    public final void method52(int arg0) {
        this.method1477((byte) 112);
        if (arg0 != -4096) {
            this.method52(50);
        }
        ++field3324;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[I", line = 122)
    public final int[] method55(int arg0, int arg1) {
        ++field3316;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 <= 123) {
            this.field3314 = null;
        }
        if (super.field8255.field3677) {
            int var4 = class633.field8892[arg0];
            if (~this.field3320 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3322; ++var6) {
                    if (~var4 <= ~this.field3314[var6] && ~var4 > ~this.field3314[var6 + 1]) {
                        if (this.field3315[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class595.method3470(var3, 0, class293.field4278, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class293.field4278; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class581.field8200[var7];
                    int var11 = this.field3320;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = 2048 - -(var10 - var4 >> 1);
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field3322; ++var12) {
                        if (~var8 <= ~this.field3314[var12] && this.field3314[var12 + 1] > var8) {
                            if (~var8 > ~this.field3315[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }
}
