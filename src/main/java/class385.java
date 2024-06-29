import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class385 extends class83 {

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "F")
    public static float field5486;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 4)
    public static final void method2387(int arg0) {
        class47.field470 = 0;
        class140.field1794 = 0;
        class297.field4046 = arg0;
        ++field5491;
        class368.field5151 = false;
        class396.field5695 = -1;
        class395.field5686 = 0;
        class263.field3595 = 1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZII)I", line = 23)
    public static final int method2388(int arg0, boolean arg1, int arg2, int arg3) {
        ++field5492;
        class367 var4 = (class367) class106.field1305.method308((long) arg2, (byte) 8);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = arg3;
            for (int var6 = 0; ~var4.field5141.length < ~var6; ++var6) {
                if (~var4.field5141[var6] <= -1 && class7.field65 > var4.field5141[var6]) {
                    class123 var7 = class65.method368(var4.field5141[var6], -124);
                    int var8 = var7.method663(class110.method580(arg0, true).field2441, arg0, arg3 ^ 1);
                    if (!arg1) {
                        var5 += var8;
                    } else {
                        var5 += var4.field5137[var6] * var8;
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BJ)V", line = 63)
    public static final void method2389(byte arg0, long arg1) {
        int var3 = -112 % ((62 - arg0) / 34);
        class281.field3857.field3389 = 0;
        ++field5488;
        class281.field3857.method1386(-222840624, 21);
        class281.field3857.method1355(arg1, (byte) -53);
        class428.field6286 = 0;
        class388.field5529 = -3;
        class351.field4913 = 1;
        class309.field4181 = 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I", line = 80)
    public final int[] method37(int arg0, int arg1) {
        ++field5487;
        if (arg0 != 2) {
            return null;
        } else {
            int[] var3 = super.field916.method1813(arg1, (byte) 29);
            if (super.field916.field4174) {
                int[][] var4 = this.method449(0, true, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~var8 > ~class420.field6139; ++var8) {
                    var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)I", line = 119)
    public static final int method2390(int arg0, int arg1, byte arg2) {
        int var3 = (arg0 & 127) * arg1 >> 7;
        ++field5490;
        if (arg2 != -72) {
            method2389((byte) -105, -63L);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (~var3 < -127) {
            var3 = 126;
        }
        return (65408 & arg0) + var3;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 139)
    public class385() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V", line = 143)
    public static final void method2391(int arg0, boolean arg1) {
        ++field5493;
        byte[][] var2;
        byte var3;
        if (!arg1) {
            var2 = class295.field4011;
            var3 = 4;
        } else {
            var3 = 1;
            var2 = class65.field681;
        }
        int var4 = var2.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class138.field1777[var5] >> 8;
            int var14 = class138.field1777[var5] & 255;
            int var15 = var13 * 64 + -class70.field767;
            int var16 = var14 * 64 - class291.field3961;
            if (var12 != null) {
                class449.method2771(-32);
                var11 = class249.method1324(var16, class88.field1003, var3, class291.field3961, var15, var12, arg1, (byte) 1, class70.field767, class36.field352);
            }
            if (!arg1 && class296.field4016 / 8 == var13 && class242.field3289 / 8 == var14) {
                if (var11 != null) {
                    class318.field4233 = class357.method2177(var11[1], var11[0], 4550, var11[2], var11[3]);
                    class138.field1773 = var11[4];
                } else {
                    class318.field4233 = null;
                }
            }
        }
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            int var7 = (class138.field1777[var6] >> 8) * 64 + -class70.field767;
            int var8 = (255 & class138.field1777[var6]) * 64 + -class291.field3961;
            byte[] var9 = var2[var6];
            if (var9 == null && class242.field3289 < 800) {
                class449.method2771(-32);
                for (int var10 = 0; var10 < var3; ++var10) {
                    class179.method940(var8, 64, var7, -106, 64, var10);
                }
            }
        }
        if (arg0 > -13) {
            field5486 = 1.9150574F;
        }
    }
}
