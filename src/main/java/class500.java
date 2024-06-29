import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class500 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[[[I")
    public static int[][][] field7400;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method2970(int arg0, boolean arg1) {
        field7399++;
        if (arg1) {
            if (class256.field3477 != -1) {
                class79.method568(class256.field3477, (byte) 125);
            }
            for (class313 var2 = (class313) class312.field4840.method3061(-16817); var2 != null; var2 = (class313) class312.field4840.method3066((byte) 120)) {
                if (!var2.method875(0)) {
                    var2 = (class313) class312.field4840.method3061(arg0 ^ 0x41B2);
                    if (var2 == null) {
                        break;
                    }
                }
                class43.method336(true, var2, false, false);
            }
            class256.field3477 = -1;
            class312.field4840 = new class517(8);
            class130.method953((byte) 34);
            class256.field3477 = class476.field7026;
            class123.method914(false, true);
            class134.method988(-28945);
            class64.method445(class256.field3477);
        }
        class209.field3010 = false;
        class462.field6730 = "";
        class368.field5603 = "";
        class172.method1183(true);
        class98.field1510 = -1;
        class152.method1096(19716, class52.field675);
        class410.field6198 = new class480();
        class410.field6198.field6065[0] = class50.field640 / 2;
        class410.field6198.field7681 = class50.field640 * 128 / 2;
        class410.field6198.field7671 = class448.field6611 * 128 / 2;
        class393.field5897 = 0;
        class282.field4263 = 0;
        class410.field6198.field6068[0] = class448.field6611 / 2;
        if (~class350.field5388 == arg0) {
            class393.field5897 = class16.field272 << 7;
            class282.field4263 = class94.field1456 << 7;
        } else {
            class104.method782(18326);
        }
        class398.method2388((byte) 25);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([[BLcr;B)V", line = 65)
    public static final void method2971(byte[][] arg0, class367 arg1, byte arg2) {
        field7398++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        int var5 = -97 % ((-arg2 - 52) / 56);
        for (int var6 = 0; var6 < var4; var6++) {
            byte[] var11 = arg0[var6];
            if (var11 != null) {
                class468 var12 = new class468(var11);
                int var13 = class495.field7349[var6] >> 8;
                int var14 = class495.field7349[var6] & 0xFF;
                int var15 = var13 * 64 - class267.field3979;
                int var16 = var14 * 64 - class241.field3358;
                class436.method2565(-98);
                arg1.method2687(var15, class151.field2300, (byte) -116, class241.field3358, class267.field3979, var12, var16);
                arg1.method2193(var15, class407.field6147, var3, true, var16, var12);
                if (!arg1.field6746 && class116.field1743 / 8 == var13 && (class161.field2414 / 8) == var14 && var3[0] != -1) {
                    class89.field1394 = class69.field925.method1803(var3[1], var3[2], var3[0], var3[3], 2174, class119.field1821);
                    class407.field6146 = var3[4];
                }
            }
        }
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = (class495.field7349[var7] >> 8) * 64 - class267.field3979;
            int var9 = (class495.field7349[var7] & 0xFF) * 64 - class241.field3358;
            byte[] var10 = arg0[var7];
            if (var10 == null && class161.field2414 < 800) {
                class436.method2565(-42);
                arg1.method2685(64, var9, -12984, 64, var8);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 142)
    public static void method2972(int arg0) {
        if (arg0 != 0) {
            field7400 = null;
        }
        field7400 = null;
    }
}
