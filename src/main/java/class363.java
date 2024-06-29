import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class363 extends class56 {

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "[[B")
    public static byte[][] field5148 = new byte[1000][];

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "[J")
    public static long[] field5145 = new long[32];

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "Z")
    public static boolean field5147 = false;

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "Lnga;")
    public static class513 field5149;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZ)[I", line = 3)
    public final int[] method24(int arg0, boolean arg1) {
        ++field5146;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            this.method6(-125, (class675) null, 64);
        }
        if (super.field673.field8073) {
            int[] var4 = this.method367(4463, 0, arg0);
            for (int var5 = 0; var5 < class328.field4576; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[[I", line = 35)
    public final int[][] method5(int arg0, int arg1) {
        ++field5144;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field668.field7292) {
                int[][] var4 = this.method369(arg0, -79, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class328.field4576 > var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)Z", line = 86)
    public static final boolean method2317(int arg0) {
        ++field5150;
        try {
            return arg0 != -51 ? false : class455.method2705((byte) -114);
        } catch (IOException var4) {
            class467.method2786((byte) 93);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class294.field4138 == null ? -1 : class294.field4138.method719((byte) 127)) + "," + (class496.field7130 != null ? class496.field7130.method719((byte) 123) : -1) + "," + (class187.field2519 == null ? -1 : class187.field2519.method719((byte) 127)) + " - " + class398.field5617 + "," + (class660.field9039.field8009[0] + class228.field3063) + "," + (class660.field9039.field8015[0] + class3.field30) + " - ";
            for (int var3 = 0; var3 < class398.field5617 && ~var3 > -51; ++var3) {
                var2 = var2 + class89.field1072.field9154[var3] + ",";
            }
            class248.method1583((byte) -61, var2, var5);
            class415.method2550(false, arg0 ^ 25643);
            return true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILee;I)V", line = 131)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            method2317(-92);
        }
        ++field5143;
        if (~arg2 == -1) {
            super.field674 = arg1.method3750((byte) 35) == 1;
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V", line = 145)
    public static void method2318(byte arg0) {
        field5145 = null;
        field5148 = null;
        int var1 = 56 % ((arg0 - -14) / 61);
        field5149 = null;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 156)
    public class363() {
        super(1, false);
    }
}
