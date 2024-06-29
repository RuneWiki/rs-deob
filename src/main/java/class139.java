import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class139 extends class306 {

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    private int field2084 = 4096;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "Z")
    public static boolean field2087 = true;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Lvh;")
    public static class62 field2078 = new class62(50);

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Lnk;")
    public static class16 field2079;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "Lnk;")
    public static class16 field2090;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIII)V", line = 7)
    public static final void method952(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2083++;
        class295.field4642 = arg3;
        if (arg2) {
            field2078 = (class62) null;
        }
        class267.field4199 = arg0;
        class211.field3196 = arg4;
        class233.field3525 = arg1;
        class140.field2159 = arg5;
        if (class140.field2159 >= 100) {
            int var6 = class211.field3196 * 128 + 64;
            int var7 = class267.field4199 * 128 + 64;
            int var8 = class14.method80(var7, class219.field3290, var6, (byte) -126) - class295.field4642;
            int var9 = var8 - class119.field1657;
            int var10 = var6 - class10.field96;
            int var11 = var7 - class280.field4415;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class283.field4508 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class257.field4067 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class283.field4508 < 128) {
                class283.field4508 = 128;
            }
            if (class283.field4508 > 383) {
                class283.field4508 = 383;
            }
        }
        class120.field1667 = 2;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 147)
    public class139() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V", line = 61)
    public static final void method953(int arg0) {
        field2085++;
        if (arg0 != 16777216) {
            return;
        }
        for (int var1 = 0; var1 < class296.field4667; var1++) {
            int var2 = class225.field3392[var1];
            class231 var3 = class251.field3974[var2];
            if (var3 != null) {
                class331.method2297(20126, var3, var3.field3503.field2111);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[I", line = 92)
    public final int[] method47(int arg0, int arg1) {
        field2082++;
        if (arg1 != -1546337535) {
            field2079 = (class16) null;
        }
        int[] var3 = this.field4757.method903(arg0, -67);
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0 - 1 & class56.field663, (byte) 115, 0);
            int[] var5 = this.method2161(arg0, (byte) 117, 0);
            int[] var6 = this.method2161(class56.field663 & arg0 + 1, (byte) 115, 0);
            for (int var7 = 0; var7 < class31.field367; var7++) {
                int var8 = (var5[class311.field4878 & var7 + 1] - var5[var7 - 1 & class311.field4878]) * this.field2084;
                int var9 = var8 >> 12;
                int var10 = (var6[var7] - var4[var7]) * this.field2084;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + var12 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILlf;I)V", line = 151)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2084 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            field2090 = (class16) null;
        }
        field2089++;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V", line = 168)
    public static void method954(int arg0) {
        field2090 = null;
        field2079 = null;
        field2078 = null;
        if (arg0 != 1) {
            field2079 = (class16) null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[BII)I", line = 182)
    public static final int method955(byte arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class245.field3848[(var4 ^ arg1[var5]) & 0xFF];
        }
        field2086++;
        if (arg0 != 58) {
            field2079 = (class16) null;
        }
        return ~var4;
    }
}
