import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class651 extends class314 {

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "[[F")
    public static float[][] field9121 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "Ljo;")
    public static class307 field9122 = new class307("", 12);

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "(I)V")
    public static void method3755(int arg0) {
        if (arg0 <= -96) {
            field9121 = null;
            field9122 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3756(String arg0, int arg1) {
        ++field9123;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = -var3 + (var3 << 5) + class132.method1149(arg1 + -256, arg0.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field9124;
        int[] var3 = super.field4928.method534((byte) -74, arg0);
        if (super.field4928.field618) {
            int[][] var4 = this.method2143(0, arg0, (byte) -4);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class81.field1009; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        if (arg1 < 109) {
            this.method6(86, 124);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
    public class651() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V")
    public static final void method3757(boolean arg0) {
        ++field9120;
        class441 var1 = null;
        try {
            var1 = class525.method3181((byte) -114, "2");
            class6 var2 = new class6(3 - -(class123.field2046 * 6));
            var2.method65(1, -77);
            var2.method25(arg0, class123.field2046);
            for (int var3 = 0; ~var3 > ~class52.field702.length; ++var3) {
                if (class691.field9687[var3]) {
                    var2.method25(true, var3);
                    var2.method82(false, class52.field702[var3]);
                }
            }
            var1.method2783(var2.field96, 0, var2.field57, 121);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2785(-1856);
            }
        } catch (Exception var4) {
        }
        class488.field7153 = class112.method1033(-11752);
        class40.field565 = false;
    }
}
