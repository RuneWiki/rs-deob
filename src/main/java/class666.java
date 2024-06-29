import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class666 extends class349 {

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    private int field9468 = 4096;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "Lcb;")
    public static class318 field9470 = new class318(31, 2);

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "Lcb;")
    public static class318 field9472 = new class318(112, -1);

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field9469;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V")
    public static final void method3697(int arg0, boolean arg1) {
        if (arg1) {
            if (~class316.field4599 != 0) {
                class313.method2025(106, class316.field4599);
            }
            for (class524 var2 = (class524) class54.field742.method2499(-25); var2 != null; var2 = (class524) class54.field742.method2503(0)) {
                if (!var2.method174(64)) {
                    var2 = (class524) class54.field742.method2499(arg0 + 16265);
                    if (var2 == null) {
                        break;
                    }
                }
                class63.method389(true, false, var2, -81);
            }
            class316.field4599 = -1;
            class54.field742 = new class436(8);
            class327.method2095(-22991);
            class316.field4599 = class627.field8528;
            class255.method1599(false, true);
            class578.method3251((byte) 71);
            class317.method2041(class316.field4599);
        }
        ++field9471;
        class67.field885 = "";
        class82.field1022 = "";
        class168.field2096 = false;
        class350.method2189(0);
        class664.field9413 = -1;
        if (arg0 == -16294) {
            class87.method489(-81, class141.field1802);
            class596.field8164 = new class519();
            class596.field8164.field526[0] = class588.field8082 / 2;
            class596.field8164.field3929 = class588.field8082 * 512 / 2;
            class596.field8164.field3917 = class12.field113 * 512 / 2;
            class471.field6379 = 0;
            class132.field1679 = 0;
            class596.field8164.field516[0] = class12.field113 / 2;
            if (class42.field546 == 2) {
                class471.field6379 = class329.field4827 << 9;
                class132.field1679 = class321.field4715 << 9;
            } else {
                class284.method1705(2);
            }
            class399.method2358((byte) 65);
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public static void method3698(int arg0) {
        field9472 = null;
        field9470 = null;
        if (arg0 != -1) {
            field9472 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BII[B)[B")
    public static final byte[] method3699(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 0) {
            method3699((byte) 99, -113, 122, (byte[]) null);
        }
        ++field9473;
        byte[] var4;
        if (~arg2 < -1) {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; ++var5) {
                var4[var5] = arg3[arg2 + var5];
            }
        } else {
            var4 = arg3;
        }
        class462 var6 = new class462();
        var6.method2613((byte) -9);
        var6.method2614(255, (long) (arg1 * 8), var4);
        byte[] var7 = new byte[64];
        var6.method2616(4, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        int var3 = -93 / ((arg0 - 56) / 41);
        ++field9474;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[] var5 = this.method2181(0, -1090477337, class4.field38 & arg1 + -1);
            int[] var6 = this.method2181(0, -1090477337, arg1);
            int[] var7 = this.method2181(0, -1090477337, arg1 - -1 & class4.field38);
            for (int var8 = 0; ~class39.field497 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field9468;
                int var10 = (var6[class144.field1839 & var8 - -1] + -var6[class144.field1839 & var8 + -1]) * this.field9468;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + var14 - -4096) / 4096.0F)));
                int var16 = var15 != 0 ? 16777216 / var15 : 0;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class666() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field9469;
        if (arg0 == 4095) {
            if (~arg1 == -1) {
                this.field9468 = arg2.method922((byte) -122);
            }
        }
    }
}
