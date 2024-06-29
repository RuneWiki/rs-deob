import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class544 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "F")
    public static float field7589;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public static final void method3152(int arg0, int arg1) {
        if (arg0 == 2923) {
            field7586++;
            class592 var2 = class682.method3825(-652872096, 5, arg1);
            var2.method3350(0);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)Z")
    public static final boolean method3153(boolean arg0) {
        field7588++;
        if (arg0) {
            method3153(true);
        }
        class33.field429 = true;
        class270.field3865++;
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method3154(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 240) {
            method3153(true);
        }
        field7587++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        int var6 = arg1;
        int var7 = arg0 + arg1;
        while (var6 < var7) {
            int var8 = arg3[var6++] & 0xFF;
            int var9;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (var8 >= 224) {
                    if (var8 < 240) {
                        if (var6 + 1 < var7 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128) {
                            var9 = arg3[var6++] & 0x3F << 6 | (var8 & 0xF) << 12 | arg3[var6++] & 0x3F;
                            if (var9 < 2048) {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else if (var8 >= 248) {
                        var9 = 65533;
                    } else if (var6 + 2 < var7 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128 && (arg3[var6 + 2] & 0xC0) == 128) {
                        int var10 = (var8 & 0x7) << 18 | arg3[var6++] & 0x3F << 12 | arg3[var6++] & 0x3F << 6 | arg3[var6++] & 0x3F;
                        if (var10 >= 65536 && var10 <= 1114111) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > var6 && (arg3[var6] & 0xC0) == 128) {
                    var9 = arg3[var6++] & 0x3F | var8 & 0x1F << 6;
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 == 0) {
                var9 = 65533;
            } else {
                var9 = var8;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
    public static final void method3155(int arg0, int arg1) {
        field7590++;
        class549.field7670 = 2;
        class343.field4791 = arg1;
        long var2 = 0L;
        if (class448.field6360 == null) {
            class496.method2962(35, false);
            return;
        }
        class675 var4 = new class675(class362.method2314(class458.method2724(class448.field6360, false), -71));
        long var5 = var4.method3714(8919);
        class290.field4097 = var4.method3714(8919);
        class579.method3301(class456.method2711(var5, -2787), true, 0, "");
        if (arg0 <= 125) {
            method3153(true);
        }
    }
}
