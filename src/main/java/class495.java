import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class495 extends class404 {

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "[B")
    public static byte[] field7527 = new byte[16384];

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "(I)V")
    public static void method2982(int arg0) {
        if (arg0 == 14131) {
            field7527 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BILhs;)Luf;")
    public static final class297 method2983(byte arg0, int arg1, class205 arg2) {
        int var3 = 112 % ((arg0 - -60) / 63);
        ++field7525;
        class297 var4;
        if (class105.field1851 == null) {
            var4 = new class297();
        } else {
            var4 = class105.field1851;
            class105.field1851 = class105.field1851.field4500;
            var4.field4500 = null;
            --class199.field3153;
        }
        var4.field4505 = arg2;
        var4.field4506 = arg1;
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field7526;
        if (arg0 >= -47) {
            field7527 = null;
        }
        int[] var3 = super.field5870.method372(arg1, (byte) 42);
        if (super.field5870.field810) {
            int[][] var4 = this.method2400(-11872, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class431.field6348 > var8; ++var8) {
                var3[var8] = (var5[var8] - -var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class495() {
        super(1, true);
    }
}
