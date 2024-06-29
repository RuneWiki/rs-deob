import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class483 {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Z")
    public boolean field6992 = true;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Z")
    public static boolean field7002 = false;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "C")
    private char field6993;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "F")
    public static float field6991;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public int field7000;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Ljava/lang/String;")
    public String field6997;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lae;I)V", line = 4)
    public final void method2811(class156 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method941((byte) 127);
            if (var3 == 0) {
                field6998++;
                if (arg1 != 23982) {
                    method2813(-93, null, null, -54);
                    return;
                }
                return;
            }
            this.method2815(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLjava/lang/String;Lae;)I", line = 27)
    public static final int method2812(byte arg0, String arg1, class156 arg2) {
        field6994++;
        int var3 = -97 % ((14 - arg0) / 38);
        int var4 = arg2.field2018;
        byte[] var5 = class364.method2226((byte) -93, arg1);
        arg2.method998(var5.length, -1);
        arg2.field2018 += class408.field5988.method3036(0, var5.length, arg2.field2041, 19790, var5, arg2.field2018);
        return arg2.field2018 - var4;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 51)
    public static final int method2813(int arg0, String arg1, String arg2, int arg3) {
        field6990++;
        int var4 = arg1.length();
        int var5 = -23 % ((arg0 + 24) / 48);
        int var6 = arg2.length();
        int var7 = 0;
        int var8 = 0;
        char var9 = 0;
        char var10 = 0;
        while (var4 > var7 - var9 || var6 > (var8 - var10)) {
            if (var4 <= var7 - var9) {
                return -1;
            }
            if (var6 <= var8 - var10) {
                return 1;
            }
            char var23;
            if (var9 == '\u0000') {
                var23 = arg1.charAt(var7++);
            } else {
                var23 = var9;
                boolean var24 = false;
            }
            char var25;
            if (var10 == '\u0000') {
                var25 = arg2.charAt(var8++);
            } else {
                var25 = var10;
                boolean var26 = false;
            }
            var9 = class290.method1751(3, var23);
            var10 = class290.method1751(3, var25);
            char var27 = class246.method1535((byte) 121, arg3, var23);
            char var28 = class246.method1535((byte) 121, arg3, var25);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class135.method841(arg3, true, var29) - class135.method841(arg3, true, var30);
                }
            }
        }
        int var11 = Math.min(var4, var6);
        for (int var12 = 0; var12 < var11; var12++) {
            int var17;
            int var18;
            if (arg3 == 2) {
                var18 = var4 - var12 - 1;
                var17 = var6 - var12 - 1;
            } else {
                var17 = var12;
                var18 = var12;
            }
            char var19 = arg1.charAt(var18);
            char var20 = arg2.charAt(var17);
            if (var19 != var20 && Character.toUpperCase(var19) != Character.toUpperCase(var20)) {
                char var21 = Character.toLowerCase(var19);
                char var22 = Character.toLowerCase(var20);
                if (var21 != var22) {
                    return class135.method841(arg3, true, var21) - class135.method841(arg3, true, var22);
                }
            }
        }
        int var13 = var4 - var6;
        if (var13 != 0) {
            return var13;
        }
        for (int var14 = 0; var14 < var11; var14++) {
            char var15 = arg1.charAt(var14);
            char var16 = arg2.charAt(var14);
            if (var15 != var16) {
                return class135.method841(arg3, true, var15) - class135.method841(arg3, true, var16);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 173)
    public static final void method2814(int arg0, int arg1) {
        field6995++;
        class338 var2 = class380.method2294((byte) 62, arg0, 7);
        var2.method2048(-83);
        if (arg1 <= 1) {
            method2814(-56, 29);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZLae;)V", line = 186)
    private final void method2815(int arg0, boolean arg1, class156 arg2) {
        if (arg0 == 1) {
            this.field6993 = class207.method1279(1, arg2.method946(66));
        } else if (arg0 == 2) {
            this.field7000 = arg2.method950(186);
        } else if (arg0 == 4) {
            this.field6992 = false;
        } else if (arg0 == 5) {
            this.field6997 = arg2.method981(false);
        }
        if (arg1) {
            method2816(-117);
        }
        field6996++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)[Lsi;", line = 219)
    public static final class375[] method2816(int arg0) {
        field7001++;
        if (arg0 != 0) {
            field7002 = false;
        }
        return new class375[] { class58.field888, class58.field890, class58.field892, class58.field893, class58.field894, class58.field895, class58.field896, class58.field897, class58.field898, class58.field899 };
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Z", line = 230)
    public final boolean method2817(int arg0) {
        if (arg0 != -1381) {
            this.field6993 = '*';
        }
        field7003++;
        return this.field6993 == 's';
    }
}
