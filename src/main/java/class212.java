import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class212 extends RuntimeException {

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3221;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/lang/String;")
    public String field3219;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[J")
    public static long[] field3220 = new long[100];

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Z")
    public static boolean field3227 = true;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "[I")
    public static int[] field3226 = new int[14];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lea;")
    public static class235 field3224;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "[[[B")
    public static byte[][][] field3225;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 5)
    public static final String method1471(int arg0, String arg1) {
        field3222++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = arg0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class236.method1618(var6, (byte) 69);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 66)
    public static void method1472(int arg0) {
        field3225 = (byte[][][]) null;
        field3220 = null;
        field3224 = null;
        field3226 = null;
        if (arg0 != -1) {
            field3227 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)I", line = 86)
    public static final int method1473(String arg0, String arg1, byte arg2, int arg3) {
        field3218++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = 0;
        char var7 = 0;
        char var8 = 0;
        int var9 = 0;
        if (arg2 != 50) {
            method1473((String) null, (String) null, (byte) 80, 73);
        }
        while ((var6 - var7) < var4 || var9 - var8 < var5) {
            if ((var6 - var7) >= var4) {
                return -1;
            }
            if (var9 - var8 >= var5) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg1.charAt(var9++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var7 = class38.method260(var22, 8);
            var8 = class38.method260(var24, 8);
            char var26 = class214.method1481(var22, (byte) 33, arg3);
            char var27 = class214.method1481(var24, (byte) 44, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class323.method2210(arg3, var28, arg2 - 101) - class323.method2210(arg3, var29, -96);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg3 == 2) {
                var12 = var5 - var11 - 1;
                var13 = var4 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg0.charAt(var13);
            char var15 = arg1.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class323.method2210(arg3, var16, arg2 ^ 0xFFFFFFBD) - class323.method2210(arg3, var17, -82);
                }
            }
        }
        int var18 = var4 - var5;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg0.charAt(var19);
            char var21 = arg1.charAt(var19);
            if (var20 != var21) {
                return class323.method2210(arg3, var20, -126) - class323.method2210(arg3, var21, arg2 ^ 0xFFFFFF9C);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 206)
    public class212(Throwable arg0, String arg1) {
        this.field3221 = arg0;
        this.field3219 = arg1;
    }
}
