import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 {

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "[I")
    private int[] field539;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "[F")
    public static float[] field544 = new float[4];

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "[S")
    public static short[] field546 = new short[] { 25, 46, 13, 12, 50, 52, 6, 23 };

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field542 = -1;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "[I")
    public static int[] field543 = new int[1000];

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "Lhj;")
    public static class596 field540 = new class596(112, -2);

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lbt;")
    public static class48 field541;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
    public static void method320(int arg0) {
        field540 = null;
        field543 = null;
        field546 = null;
        field544 = null;
        field541 = null;
        if (arg0 != -32406) {
            method320(-102);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lar;Z)Z")
    public static final boolean method321(class712 arg0, boolean arg1) {
        boolean var2 = class704.field9910 == class621.field8523;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method671((byte) 126);
        if (arg0.field9994 < 0 || arg0.field9997 < 0 || arg0.field9991 >= class307.field3799 || arg0.field9990 >= class250.field2938) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field9994; var7 <= arg0.field9991; var7++) {
            for (int var11 = arg0.field9997; var11 <= arg0.field9990; var11++) {
                class727 var12 = class267.method1583(arg0.field808, var7, var11);
                if (var12 != null) {
                    class10 var13 = class711.method4031((byte) 21, arg0);
                    class10 var14 = var12.field10174;
                    if (var14 == null) {
                        var12.field10174 = var13;
                    } else {
                        while (var14.field186 != null) {
                            var14 = var14.field186;
                        }
                        var14.field186 = var13;
                    }
                    if (var2 && (class68.field940[var7][var11] & 0xFF000000) != 0) {
                        var3 = class68.field940[var7][var11];
                        var4 = class316.field3876[var7][var11];
                        var5 = class406.field5335[var7][var11];
                    }
                    if (!arg1 && var12.field10177 != null && var12.field10177.field4055 > var6) {
                        var6 = var12.field10177.field4055;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field9994; var8 <= arg0.field9991; var8++) {
                for (int var9 = arg0.field9997; var9 <= arg0.field9990; var9++) {
                    if ((class68.field940[var8][var9] & 0xFF000000) == 0) {
                        class68.field940[var8][var9] = var3;
                        class316.field3876[var8][var9] = var4;
                        class406.field5335[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class620.field8391[class521.field7397++] = arg0;
        } else {
            int var10 = class704.field9910 == class621.field8523 ? 1 : 0;
            if (!arg0.method503(false)) {
                arg0.field822 = class454.field6399[var10];
                class454.field6399[var10] = arg0;
            } else if (arg0.method504((byte) -24)) {
                arg0.field822 = class119.field1509[var10];
                class119.field1509[var10] = arg0;
            } else {
                arg0.field822 = class653.field9015[var10];
                class653.field9015[var10] = arg0;
                class257.field3034 = true;
            }
        }
        if (arg1) {
            arg0.field809 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)I")
    public final int method322(int arg0, int arg1) {
        if (arg1 <= 46) {
            method320(113);
        }
        field545++;
        int var3 = (this.field539.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field539[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field539[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "([I)V")
    public class36(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field539 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field539[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field539[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field539[var5 + var5] = arg0[var4];
            this.field539[var5 + var5 + 1] = var4++;
        }
    }
}
