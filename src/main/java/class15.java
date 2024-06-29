import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class15 extends class264 {

    @OriginalMember(owner = "client!rk", name = "ob", descriptor = "I")
    public static int field280 = 0;

    @OriginalMember(owner = "client!rk", name = "mb", descriptor = "I")
    public static int field278 = 1;

    @OriginalMember(owner = "client!rk", name = "pb", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!rk", name = "fb", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!rk", name = "gb", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!rk", name = "hb", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!rk", name = "ib", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!rk", name = "jb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!rk", name = "kb", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!rk", name = "lb", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!rk", name = "nb", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)Z", line = 15)
    public static final boolean method135(int arg0, byte arg1) {
        field275++;
        if (arg1 != 42) {
            field272 = 16;
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 27)
    public class15() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BZ)V", line = 35)
    public static final void method136(byte arg0, boolean arg1) {
        if (arg0 != 110) {
            field278 = 99;
        }
        field276++;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var2 = class105.field1562;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class111.field1657;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            int var7 = (class294.field4958[var5] >> 8) * 64 - class193.field3017;
            int var8 = (class294.field4958[var5] & 0xFF) * 64 - class74.field1158;
            if (var6 != null) {
                class177.method1155((byte) 96);
                class21.method170(class280.field4741 * 8 - 48, class242.field4031, var6, var7, (class137.field2031 - 6) * 8, arg1, var8, (byte) -100);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class294.field4958[var9] >> 8) * 64 - class193.field3017;
            byte[] var11 = var2[var9];
            int var12 = (class294.field4958[var9] & 0xFF) * 64 - class74.field1158;
            if (var11 == null && class137.field2031 < 800) {
                class177.method1155((byte) 96);
                for (int var13 = 0; var13 < var3; var13++) {
                    class145.method920(var10, true, 64, var12, 64, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILni;I)Lrj;", line = 112)
    public static final class237 method137(int arg0, int arg1, class202 arg2, int arg3) {
        field277++;
        if (arg0 >= -98) {
            return (class237) null;
        } else if (class180.method1171(arg3, arg1, arg2, (byte) -128)) {
            return class230.method1641(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)[I", line = 128)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 >= -58) {
            method137(42, -99, (class202) null, 17);
        }
        int[] var3 = this.field4501.method1176(arg1, 122);
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, arg1, -103);
            for (int var5 = 0; var5 < class226.field3716; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        field279++;
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(BI)[[I", line = 168)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = 24 / ((arg0 + 43) / 55);
        field271++;
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[][] var5 = this.method1817(-87, 0, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var5[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class226.field3716; var12++) {
                var9[var12] = 4096 - var6[var12];
                var8[var12] = 4096 - var10[var12];
                var11[var12] = 4096 - var7[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILii;)V", line = 208)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            this.field4496 = arg2.method1509(true) == 1;
        }
        field273++;
        if (arg1 > -27) {
            method135(-120, (byte) -81);
        }
    }
}
