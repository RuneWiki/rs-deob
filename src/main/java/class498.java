import jaggl.memory.NativeStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class498 extends class463 {

    @OriginalMember(owner = "client!dd", name = "Fb", descriptor = "Lek;")
    public static class352 field7214 = new class352(16);

    @OriginalMember(owner = "client!dd", name = "Jb", descriptor = "Ljk;")
    public static class449 field7218 = new class449(64);

    @OriginalMember(owner = "client!dd", name = "Ob", descriptor = "I")
    public static int field7223 = 0;

    @OriginalMember(owner = "client!dd", name = "Gb", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!dd", name = "Ib", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!dd", name = "Kb", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!dd", name = "Lb", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!dd", name = "Mb", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!dd", name = "Nb", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!dd", name = "Pb", descriptor = "Lrp;")
    public static class302 field7224;

    @OriginalMember(owner = "client!dd", name = "Hb", descriptor = "Z")
    public static boolean field7216;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "(I)V")
    public static final void method3002(int arg0) {
        ++field7220;
        class282.method1669(class83.field1050, false);
        ++class304.field3893;
        class40.field511.method2729(class191.method1184(false), false);
        class40.field511.method2759((byte) -114, class174.field2262);
        class40.field511.method2759((byte) -40, class390.field5236);
        class40.field511.method2729(class407.field5817.field3621, false);
        if (arg0 != 0) {
            field7218 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(FI)V")
    public final void method3003(float arg0, int arg1) {
        if (arg1 != -51) {
            field7216 = false;
        }
        ++field7221;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field6618[super.field6631++] = (byte) var3;
        super.field6618[super.field6631++] = (byte) (var3 >> 8);
        super.field6618[super.field6631++] = (byte) (var3 >> 16);
        super.field6618[super.field6631++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IF)V")
    public final void method3004(int arg0, float arg1) {
        ++field7217;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field6618[super.field6631++] = (byte) (var3 >> 24);
        if (arg0 == 255) {
            super.field6618[super.field6631++] = (byte) (var3 >> 16);
            super.field6618[super.field6631++] = (byte) (var3 >> 8);
            super.field6618[super.field6631++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "(I)V")
    public static void method3005(int arg0) {
        field7214 = null;
        field7224 = null;
        field7218 = null;
        if (arg0 != -11581) {
            method3005(-24);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
    public class498(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "(B)V")
    public static final void method3006(byte arg0) {
        ++field7222;
        class210 var1 = null;
        try {
            class121 var2 = class219.field2794.method2882("3", false, (byte) -49);
            while (var2.field1628 == 0) {
                class199.method1251(1L, (byte) -38);
            }
            if (~var2.field1628 == -3) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class210) var2.field1627;
            byte[] var3 = new byte[(int) var1.method1306(0)];
            if (~var3.length == -1) {
                class139.field1796 = "";
                class24.field345 = "";
            } else {
                int var5;
                for (int var4 = 0; ~var4 > ~var3.length; var4 += var5) {
                    var5 = var1.method1305(0, var4, var3, var3.length + -var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class463 var6 = new class463(var3);
                int var7 = var6.method2737(false);
                if (~var7 < -51) {
                    throw new RuntimeException("Bad length");
                }
                var6.field6631 = var7 + 1;
                if (!var6.method2784(4)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field6631 = 1;
                int var8 = var6.method2737(false);
                if (~var8 != -1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class139.field1796 = var6.method2749(-1);
                class24.field345 = var6.method2749(-1);
            }
            if (arg0 < 51) {
                field7219 = 61;
            }
        } catch (Exception var10) {
            class139.field1796 = "";
            class24.field345 = "";
        }
        try {
            if (var1 != null) {
                var1.method1303((byte) -66);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([[BI[B[I[III[[B)I")
    public static final int method3007(byte[][] arg0, int arg1, byte[] arg2, int[] arg3, int[] arg4, int arg5, int arg6, byte[][] arg7) {
        ++field7215;
        int var8 = arg4[arg5];
        int var9 = arg3[arg5] + var8;
        int var10 = arg4[arg1];
        int var11 = var10 - -arg3[arg1];
        int var12 = var8;
        if (~var10 < ~var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg2[arg5] & 255;
        if (~var14 < ~(arg2[arg1] & arg6)) {
            var14 = arg2[arg1] & 255;
        }
        byte[] var15 = arg0[arg5];
        byte[] var16 = arg7[arg1];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; ++var19) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }
}
