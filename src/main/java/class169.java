import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class169 extends class59 {

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field2498 = 0;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lbg;")
    public static class327 field2492;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Ljava/lang/String;")
    public String field2501;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 16)
    public static void method1131(boolean arg0) {
        field2492 = null;
        if (arg0) {
            method1133(null, 31);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([FIIIIIIFFIIIF)V", line = 32)
    public static final void method1132(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = arg3 - arg10;
        int var14 = arg4 - arg5;
        int var15 = arg11 - arg9;
        field2496++;
        float var16 = arg0[2] * (float) var14 + arg0[1] * (float) var15 + arg0[0] * (float) var13;
        if (arg2 != 12586) {
            return;
        }
        float var17 = arg0[5] * (float) var14 + arg0[4] * (float) var15 + arg0[3] * (float) var13;
        float var18 = arg0[8] * (float) var14 + arg0[6] * (float) var13 + arg0[7] * (float) var15;
        float var19;
        float var20;
        if (arg1 == 0) {
            var19 = arg8 + 0.5F - var18;
            var20 = arg7 + var16 + 0.5F;
        } else if (arg1 == 1) {
            var19 = arg8 + var18 + 0.5F;
            var20 = arg7 + var16 + 0.5F;
        } else if (arg1 == 2) {
            var19 = arg12 + 0.5F - var17;
            var20 = arg7 + 0.5F - var16;
        } else if (arg1 == 3) {
            var20 = arg7 + var16 + 0.5F;
            var19 = arg12 + 0.5F - var17;
        } else if (arg1 == 4) {
            var20 = arg8 + var18 + 0.5F;
            var19 = arg12 + 0.5F - var17;
        } else {
            var19 = arg12 + 0.5F - var17;
            var20 = arg8 + 0.5F - var18;
        }
        if (arg6 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg6 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg6 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class207.field3397 = var20;
        class36.field415 = var19;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 120)
    public static final String method1133(String arg0, int arg1) {
        field2497++;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = 0;
        if (arg1 < 18) {
            return null;
        }
        while (var4 < var2) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
            var4++;
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }
}
