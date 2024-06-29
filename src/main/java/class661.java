import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class661 extends class440 {

    @OriginalMember(owner = "client!ega", name = "C", descriptor = "I")
    private int field9342 = 0;

    @OriginalMember(owner = "client!ega", name = "D", descriptor = "I")
    private int field9343 = 1;

    @OriginalMember(owner = "client!ega", name = "K", descriptor = "I")
    private int field9349 = 0;

    @OriginalMember(owner = "client!ega", name = "F", descriptor = "Lnea;")
    public static class664 field9345 = new class664(46, 28);

    @OriginalMember(owner = "client!ega", name = "I", descriptor = "I")
    public static int field9347 = 0;

    @OriginalMember(owner = "client!ega", name = "E", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!ega", name = "H", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!ega", name = "J", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!ega", name = "L", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(B)V")
    public static final void method3662(byte arg0) {
        if (arg0 <= -28) {
            for (class408 var1 = (class408) class590.field8270.method2415(-128); var1 != null; var1 = (class408) class590.field8270.method2415(-128)) {
                class12.method65(-104, var1);
            }
            ++field9346;
            int var2;
            int var3;
            if (class287.field4270.method2747(68, class328.field4859)) {
                var2 = 3;
                var3 = 0;
            } else {
                var2 = class97.field1532;
                var3 = class97.field1532;
            }
            client.method1768();
            for (int var4 = var3; ~var4 >= ~var2; ++var4) {
                client.method1780();
                client.method1772(var4);
                client.method1785(var4);
            }
            client.method1783();
            client.method1776();
        }
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "()V")
    public class661() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "(B)V")
    public static void method3663(byte arg0) {
        field9345 = null;
        if (arg0 > -36) {
            method3663((byte) 56);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    public final void method230(int arg0) {
        if (arg0 != -9) {
            field9345 = null;
        }
        class31.method354((byte) 38);
        ++field9348;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field9344;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field9343 = arg1.method3826(false);
                }
            } else {
                this.field9349 = arg1.method3826(false);
            }
        } else {
            this.field9342 = arg1.method3826(false);
        }
        if (arg0 != 5) {
            field9347 = 73;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field9350;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = 52 % ((arg0 - -56) / 41);
        if (super.field6412.field8047) {
            int var5 = class418.field6099[arg1];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; ~var7 > ~class549.field7715; ++var7) {
                int var8 = class499.field7073[var7];
                int var9 = var8 - 2048 >> 1;
                int var10;
                if (~this.field9342 == -1) {
                    var10 = (-var5 + var8) * this.field9343;
                } else {
                    int var11 = var9 * var9 - -(var6 * var6) >> 12;
                    int var12 = (int) (Math.sqrt((double) ((float) var11 / 4096.0F)) * 4096.0D);
                    var10 = (int) ((double) (this.field9343 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (-4096 & var10);
                if (this.field9349 != 0) {
                    if (~this.field9349 == -3) {
                        var13 -= 2048;
                        if (~var13 > -1) {
                            var13 = -var13;
                        }
                        var13 = -var13 + 2048 << 1;
                    }
                } else {
                    var13 = class493.field7016[255 & var13 >> 4] - -4096 >> 1;
                }
                var3[var7] = var13;
            }
        }
        return var3;
    }
}
