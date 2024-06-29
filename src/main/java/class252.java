import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class252 extends class215 {

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "[J")
    public static long[] field4111 = new long[256];

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4112 = "Loading textures - ";

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field4110 = 0;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "Z")
    public static boolean field4116 = false;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V")
    public static void method1734(byte arg0) {
        if (arg0 != -9) {
            method1734((byte) 103);
        }
        field4112 = null;
        field4111 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class252() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field4115;
        int[] var3 = super.field3445.method1755(arg0, (byte) 119);
        if (arg1 != 255) {
            field4112 = null;
        }
        if (super.field3445.field4163) {
            int[][] var4 = this.method1504(arg1 + -351, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class244.field4015 > var8; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(1L & var1) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                }
            }
            field4111[var0] = var1;
        }
    }
}
