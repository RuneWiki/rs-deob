import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class166 extends class43 {

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "[I")
    public static int[] field3022 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "Lmb;")
    public static class132 field3023 = method1092("Benutzen Sie bitte eine andere Welt)3", 125);

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field3029 = 0;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lga;")
    public static class68 field3027;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lii;")
    public static class96 field3026;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "[[S")
    public static short[][] field3025;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;I)Lmb;")
    public static final class132 method1092(String arg0, int arg1) {
        ++field3030;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class132 var4 = new class132();
        var4.field2446 = new byte[var3];
        int var5 = 0;
        while (~var5 > ~var3) {
            int var6 = var2[var5++] & 255;
            if (var6 <= 45 && var6 >= 40) {
                if (~var5 <= ~var3) {
                    break;
                }
                int var7 = var2[var5++] & 255;
                var4.field2446[var4.field2479++] = (byte) (var6 * 43 + -1720 + var7 + -48);
            } else if (var6 != 0) {
                var4.field2446[var4.field2479++] = (byte) var6;
            }
        }
        if (arg1 < 110) {
            field3023 = null;
        }
        var4.method876(78);
        return var4.method884(-108);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (~arg0 == -1) {
            super.field746 = arg2.method716(-1308) == 1;
        }
        ++field3028;
        if (arg1 != -73) {
            this.method203(-94, 55);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field3031;
        int[] var3 = super.field768.method1123(arg1 ^ arg1, arg0);
        if (super.field768.field3219) {
            int[] var4 = this.method300(-64, 0, arg0);
            for (int var5 = 0; class131.field2427 > var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            return null;
        } else {
            ++field3024;
            int[][] var3 = super.field764.method1350((byte) 125, arg1);
            if (super.field764.field3960) {
                int[][] var4 = this.method301(arg1, (byte) 125, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[1];
                int[] var9 = var3[0];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class131.field2427; ++var11) {
                    var9[var11] = -var5[var11] + 4096;
                    var8[var11] = 4096 - var7[var11];
                    var10[var11] = 4096 - var6[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public static void method1093(byte arg0) {
        field3023 = null;
        field3027 = null;
        field3026 = null;
        field3025 = null;
        if (arg0 <= -8) {
            field3022 = null;
        }
    }
}
