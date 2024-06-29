import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class169 extends class116 {

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "Ldg;")
    public class156 field2943;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Z")
    public static boolean field2936 = false;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public static int field2938 = 0;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "Lda;")
    public static class275 field2945 = class255.method1672(93, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "Lrg;")
    public static class84 field2942 = new class84();

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field2947 = 0;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2941++;
        int var6 = (arg3 - 32) * arg3 / arg2;
        class195.field3340[0].method62(arg1, arg0);
        if (var6 < 8) {
            var6 = 8;
        }
        class195.field3340[1].method62(arg1, arg0 - (16 - arg3));
        int var7 = (arg3 - var6 - 32) * arg4 / (arg2 - arg3);
        class47.method299(arg1, arg0 + 16, 16, arg3 - 32, class158.field2770);
        class47.method299(arg1, arg0 + var7 + 16, 16, var6, class107.field1867);
        class47.method304(arg1, arg0 + var7 + 16, var6, class147.field2563);
        class47.method304(arg1 + 1, arg0 + 16 - -var7, var6, class147.field2563);
        class47.method294(arg1, arg0 + var7 + 16, 16, class147.field2563);
        class47.method294(arg1, arg0 + var7 + 17, 16, class147.field2563);
        class47.method304(arg1 + 15, arg0 + arg5 + var7, var6, class270.field4693);
        class47.method304(arg1 + 14, arg0 + 17 - -var7, var6 - 1, class270.field4693);
        class47.method294(arg1, arg0 + var6 + var7 + 15, 16, class270.field4693);
        class47.method294(arg1 + 1, arg0 + 14 + var6 + var7, 15, class270.field4693);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public static void method1158(byte arg0) {
        field2942 = null;
        if (arg0 == 114) {
            field2945 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lma;IZLma;Z)Ldd;")
    public static final class79 method1159(class105 arg0, int arg1, boolean arg2, class105 arg3, boolean arg4) {
        field2939++;
        boolean var5 = true;
        int[] var6 = arg0.method761(arg2, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method780((byte) -125, arg1, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg4) {
                    var10 = arg3.method780((byte) -126, 0, var9);
                } else {
                    var10 = arg3.method780((byte) -35, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class79(arg0, arg3, arg1, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Lda;")
    public static final class275 method1160(int arg0, int arg1) {
        if (arg1 <= 52) {
            field2938 = 33;
        }
        class275 var2 = new class275();
        var2.field4749 = new byte[arg0];
        var2.field4752 = 0;
        field2944++;
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ldg;)V")
    public class169(class156 arg0) {
        this.field2943 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1161(byte arg0, byte[] arg1) {
        field2940++;
        class85 var2 = new class85(arg1);
        if (arg0 != -75) {
            method1159((class105) null, -3, true, (class105) null, false);
        }
        int var3 = var2.method564((byte) 118);
        int var4 = var2.method568(19845);
        if (var4 < 0 || class3.field28 != 0 && class3.field28 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method597(0, false, var4, var7);
            return var7;
        } else {
            int var5 = var2.method568(arg0 + 19920);
            if (var5 < 0 || !(class3.field28 == 0 || var5 <= class3.field28)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class272.method1792(var6, var5, arg1, var4, 9);
            } else {
                class91.field1549.method541(var2, (byte) -116, var6);
            }
            return var6;
        }
    }
}
