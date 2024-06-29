import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class244 extends class118 {

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Z")
    public static boolean field3651 = true;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lpf;")
    public static class425 field3659 = new class425(29, 3);

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    private int field3655;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    private int field3656;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "[I")
    public static int[] field3663;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
    private final void method1497(byte arg0, int arg1) {
        this.field3654 = 4080 & arg1 >> 4;
        this.field3655 = (255 & arg1) << 4;
        ++field3660;
        this.field3656 = arg1 >> 12 & 4080;
        if (arg0 < 89) {
            field3651 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field3657;
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (super.field1549.field4903) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class440.field6474; ++var7) {
                var4[var7] = this.field3656;
                var5[var7] = this.field3654;
                var6[var7] = this.field3655;
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class244() {
        this(0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjk;)V")
    public static final void method1498(int arg0, class119 arg1) {
        arg1.method710(255);
        ++field3652;
        int var2 = class386.field5703;
        class169 var3 = class113.field1500 = class140.field1883[var2] = new class169();
        var3.field1929 = var2;
        int var4 = arg1.method717(30, false);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (268430689 & var4) >> 14;
        var3.field2019[0] = -class17.field250 + var6;
        int var7 = var4 & 16383;
        var3.field1900 = (var3.field2019[0] << 7) - -(var3.method911(0) << 6);
        var3.field2018[0] = -class112.field1487 + var7;
        var3.field1892 = (var3.field2018[0] << 7) + (var3.method911(0) << 6);
        class143.field1911 = var3.field1902 = var5;
        if (arg0 > 16) {
            if (class359.field5309[var2] != null) {
                var3.method1029((byte) -55, class359.field5309[var2]);
            }
            class307.field4634 = 0;
            class201.field3038[class307.field4634++] = var2;
            class335.field4987[var2] = 0;
            class402.field6004 = 0;
            for (int var8 = 1; var8 < 2048; ++var8) {
                if (~var2 != ~var8) {
                    int var9 = arg1.method717(18, false);
                    int var10 = var9 >> 16;
                    int var11 = 255 & var9 >> 8;
                    int var12 = var9 & 255;
                    class281.field4300[var8] = (var10 << 28) + (var11 << 14) + var12;
                    class302.field4567[var8] = 0;
                    class241.field3625[var8] = -1;
                    class411.field6115[class402.field6004++] = var8;
                    class335.field4987[var8] = 0;
                }
            }
            arg1.method709(-17701);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
    private class244(int arg0) {
        super(0, false);
        this.method1497((byte) 127, arg0);
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public static void method1499(int arg0) {
        if (arg0 != 23273) {
            method1498(-95, (class119) null);
        }
        field3663 = null;
        field3659 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (~arg0 == -1) {
            this.method1497((byte) 97, arg2.method2382((byte) -107));
        }
        ++field3658;
        if (arg1 != 1) {
            this.method1497((byte) 68, -3);
        }
    }
}
