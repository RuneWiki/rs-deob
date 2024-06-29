import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class255 extends class59 {

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    private int field4259 = 4096;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "Lud;")
    public static class58 field4250 = new class58();

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "Z")
    public static boolean field4257 = false;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "Lsm;")
    public static class297 field4260 = null;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "Lph;")
    public static class229 field4258 = class266.method1858("3D)2Softwarebibliothek gestartet)3", 0);

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "[I")
    public static int[] field4263 = new int[500];

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "Z")
    public static boolean field4265 = false;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "Lph;")
    public static class229 field4262 = class266.method1858(")1", 0);

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "Z")
    public static boolean field4267;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)V", line = 7)
    public static void method1776(int arg0) {
        field4260 = null;
        field4262 = null;
        field4258 = null;
        if (arg0 == 65280) {
            field4250 = null;
            field4263 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BILhb;)V", line = 21)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg0 != 115) {
            method1776(-115);
        }
        if (arg1 == 0) {
            this.field4259 = arg2.method1161(true);
        }
        field4261++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lph;II)V", line = 35)
    public static final void method1777(class229 arg0, int arg1, int arg2) {
        class168.field2752++;
        class121.field2033.method37(17, 96);
        class121.field2033.method1208((byte) -6, arg0.method1634(false));
        if (arg1 >= 25) {
            field4253++;
            class121.field2033.method1206(arg2, -1920212572);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZLsi;Lsi;I)Lmb;", line = 57)
    public static final class145 method1778(int arg0, boolean arg1, class66 arg2, class66 arg3, int arg4) {
        field4252++;
        boolean var5 = true;
        int[] var6 = arg2.method524(arg4, -56);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method507(var6[var7], arg4, false);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method507(var9, 0, false);
                } else {
                    var10 = arg3.method507(0, var9, false);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else if (arg0 == -15138) {
            try {
                return new class145(arg2, arg3, arg4, arg1);
            } catch (Exception var12) {
                return null;
            }
        } else {
            return (class145) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)I", line = 124)
    public static final int method1779(int arg0) {
        field4254++;
        if (class88.field1499) {
            return 0;
        } else if (class61.method415((byte) 68)) {
            if (arg0 != 14838) {
                field4260 = (class297) null;
            }
            return class175.field2877 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)[I", line = 143)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        field4256++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[] var4 = this.method394(class33.field544 & arg1 - 1, 0, (byte) 106);
            int[] var5 = this.method394(arg1, 0, (byte) 103);
            int[] var6 = this.method394(arg1 + 1 & class33.field544, 0, (byte) 103);
            for (int var7 = 0; var7 < class293.field4789; var7++) {
                int var8 = (var5[var7 + 1 & class4.field51] - var5[var7 - 1 & class4.field51]) * this.field4259;
                int var9 = var8 >> 12;
                int var10 = (var6[var7] - var4[var7]) * this.field4259;
                int var11 = var10 >> 12;
                int var12 = var9 * var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 207)
    public class255() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLjava/lang/String;)Lph;", line = 219)
    public static final class229 method1780(boolean arg0, String arg1) {
        field4251++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class229 var4 = new class229();
        var4.field3785 = 0;
        var4.field3772 = var2;
        if (arg0) {
            field4264 = -89;
        }
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field3785++] = var2[var5];
            }
        }
        return var4;
    }
}
