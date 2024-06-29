import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class269 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[Lki;")
    public static class509[] field3922 = new class509[16];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Z")
    public static boolean field3918 = false;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Leh;")
    public static class246 field3919 = new class246(50, 12);

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lvo;")
    public static class32 field3923 = new class32("", 17);

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field3925 = 0;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIII[B)V", line = 4)
    public static final void method1692(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field3920++;
        if (arg3 > 0 && !class51.method407(arg3, 1024)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class51.method407(arg1, 1024)) {
            int var7 = class338.method2016(arg0, 1);
            int var8 = 0;
            int var9 = arg1 > arg3 ? arg3 : arg1;
            int var10 = arg3 >> 1;
            int var11 = arg1 >> 1;
            int var12 = -128 / ((arg2 + 4) / 48);
            byte[] var13 = arg6;
            byte[] var14 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg4, arg3, arg1, 0, arg0, 5121, var13, 0);
                if (var9 <= 1) {
                    return;
                }
                int var15 = arg3 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var18 = var16;
                    int var19 = var16;
                    int var20 = var15 + var16;
                    for (int var21 = 0; var21 < var11; var21++) {
                        for (int var22 = 0; var22 < var10; var22++) {
                            byte var23 = var13[var19];
                            int var24 = var7 + var19;
                            int var25 = var13[var24] + var23;
                            int var26 = var13[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            int var28 = var13[var27] + var26;
                            var20 = var7 + var27;
                            var14[var18] = (byte) (var28 >> 2);
                            var18 += var7;
                        }
                        var20 += var15;
                        var19 += var15;
                    }
                }
                byte[] var17 = var14;
                var14 = var13;
                arg3 = var10;
                var13 = var17;
                arg1 = var11;
                var10 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 101)
    public static final String method1693(byte arg0, long arg1) {
        field3921++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            int var7 = 97 % ((arg0 + 47) / 57);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var6.append(class467.field6520[(int) (var8 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V", line = 152)
    public static final void method1694(int arg0, int arg1, int arg2) {
        field3924++;
        class45 var3 = class354.method2094(arg2, (byte) -33, 14);
        var3.method260(9188);
        if (arg0 < 41) {
            field3922 = null;
        }
        var3.field504 = arg1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 166)
    public static void method1695(byte arg0) {
        field3922 = null;
        field3919 = null;
        field3923 = null;
        if (arg0 >= -22) {
            field3918 = false;
        }
    }
}
