import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class58 extends class273 {

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1005 = "white:";

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1003 = "";

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static volatile int field1010 = 0;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "[B")
    public static byte[] field1007 = new byte[32896];

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "B")
    public static byte field1006;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (arg0 <= 122) {
            return null;
        } else {
            ++field1009;
            if (super.field4357.field4631) {
                int[][] var4 = this.method1853(0, arg1, (byte) 8);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class26.field458; ++var11) {
                    var8[var11] = -var6[var11] + 4096;
                    var9[var11] = -var5[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field1011;
        if (arg0) {
            field1003 = null;
        }
        int[] var3 = super.field4359.method387((byte) 108, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(arg1, 0, (byte) -123);
            for (int var5 = 0; ~class26.field458 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class58() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field1004;
        if (~arg1 == -1) {
            super.field4358 = ~arg0.method1012(4) == -2;
        }
        if (arg2 != 5) {
            field1007 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public static void method456(int arg0) {
        if (arg0 != 0) {
            field1005 = null;
        }
        field1005 = null;
        field1007 = null;
        field1003 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field1007[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
