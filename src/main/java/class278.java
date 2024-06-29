import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class278 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4293 = "cyan:";

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
    public static boolean field4292;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V", line = 8)
    public static final void method2034(int arg0, int arg1, int arg2) {
        if (arg0 != 19500) {
            method2037(0, (class91) null);
        }
        field4294++;
        class160.field2538[arg1] = arg2;
        class315 var3 = (class315) class68.field1045.method370((byte) -120, (long) arg1);
        if (var3 == null) {
            class315 var4 = new class315(class156.method1273((byte) -113) + 500L);
            class68.field1045.method375(var4, (long) arg1, arg0 ^ 0x4C12);
        } else {
            var3.field4868 = class156.method1273((byte) -83) + 500L;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 31)
    public static void method2035(int arg0) {
        if (arg0 != 7796) {
            method2035(2);
        }
        field4293 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)I", line = 49)
    public static final int method2036(String arg0, int arg1, String arg2, byte arg3) {
        field4295++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = 7 / ((26 - arg3) / 38);
        int var7 = 0;
        int var8 = 0;
        char var9 = 0;
        char var10 = 0;
        while (var4 > (var7 - var9) || var5 > var8 - var10) {
            if (var4 <= var7 - var9) {
                return -1;
            }
            if (var5 <= (var8 - var10)) {
                return 1;
            }
            char var23;
            if (var9 == '\u0000') {
                var23 = arg2.charAt(var7++);
            } else {
                var23 = var9;
                boolean var24 = false;
            }
            char var25;
            if (var10 == '\u0000') {
                var25 = arg0.charAt(var8++);
            } else {
                var25 = var10;
                boolean var26 = false;
            }
            var9 = class143.method1186(var23, (byte) 82);
            var10 = class143.method1186(var25, (byte) 91);
            char var27 = class121.method1051((byte) -37, var23, arg1);
            char var28 = class121.method1051((byte) -37, var25, arg1);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class221.method1661(-1, arg1, var29) - class221.method1661(-1, arg1, var30);
                }
            }
        }
        int var11 = Math.min(var4, var5);
        for (int var12 = 0; var12 < var11; var12++) {
            int var13;
            int var14;
            if (arg1 == 2) {
                var13 = var5 - var12 - 1;
                var14 = var4 - var12 - 1;
            } else {
                var13 = var12;
                var14 = var12;
            }
            char var15 = arg2.charAt(var14);
            char var16 = arg0.charAt(var13);
            if (var15 != var16 && Character.toUpperCase(var15) != Character.toUpperCase(var16)) {
                char var17 = Character.toLowerCase(var15);
                char var18 = Character.toLowerCase(var16);
                if (var17 != var18) {
                    return class221.method1661(-1, arg1, var17) - class221.method1661(-1, arg1, var18);
                }
            }
        }
        int var19 = var4 - var5;
        if (var19 != 0) {
            return var19;
        }
        for (int var20 = 0; var20 < var11; var20++) {
            char var21 = arg2.charAt(var20);
            char var22 = arg0.charAt(var20);
            if (var21 != var22) {
                return class221.method1661(-1, arg1, var21) - class221.method1661(-1, arg1, var22);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILud;)V", line = 176)
    public static final void method2037(int arg0, class91 arg1) {
        field4296++;
        if (arg0 != -9880) {
            method2034(-23, -98, 120);
        }
        int var2 = arg1.field1384 - class360.field5718;
        int var3 = arg1.field1317 * 128 + arg1.method808(87) * 64;
        int var4 = arg1.field1282 * 128 + arg1.method808(arg0 ^ 0x269C) * 64;
        if (arg1.field1356 == 0) {
            arg1.field1289 = 1024;
        }
        arg1.field1359 += (var3 - arg1.field1359) / var2;
        arg1.field1286 += (var4 - arg1.field1286) / var2;
        arg1.field1341 = 0;
        if (arg1.field1356 == 1) {
            arg1.field1289 = 1536;
        }
        if (arg1.field1356 == 2) {
            arg1.field1289 = 0;
        }
        if (arg1.field1356 == 3) {
            arg1.field1289 = 512;
        }
    }
}
