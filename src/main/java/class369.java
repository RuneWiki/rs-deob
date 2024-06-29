import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class369 extends class504 {

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "F")
    public static float field5354;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public int field5351;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public int field5361;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public int field5364;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "J")
    public long field5352;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lu;")
    public static class80 field5359;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "[Lpc;")
    public static class700[] field5356;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)V", line = 4)
    public static void method2296(int arg0) {
        field5359 = null;
        if (arg0 == -17981) {
            field5356 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I", line = 17)
    public final int method1035(int arg0) {
        int var2 = 36 % ((arg0 + 50) / 36);
        field5353++;
        return this.field5360;
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)J", line = 33)
    public final long method1039(int arg0) {
        field5357++;
        return arg0 == -4 ? this.field5352 : -47L;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z", line = 45)
    public static final boolean method2297(String arg0, int arg1, int arg2, boolean arg3) {
        field5366++;
        if (arg1 != -91) {
            return false;
        } else if (arg2 >= 2 && arg2 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg3) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg2) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if (var10 / arg2 != var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIBIII)V", line = 118)
    public static final void method2298(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class502.field6949 = arg0;
        class432.field6128 = arg5;
        class276.field4091 = arg2;
        class307.field4444 = arg4;
        class670.field9430 = arg1;
        class273.field4061 = arg6;
        field5365++;
        if (arg3 != 110) {
            method2298(-78, -100, -106, (byte) -117, 108, -19, 127);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I", line = 135)
    public final int method1038(int arg0) {
        field5355++;
        if (arg0 != 8) {
            this.method1038(54);
        }
        return this.field5361;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)I", line = 147)
    public final int method1036(int arg0) {
        field5362++;
        return arg0 == 5 ? this.field5364 : -41;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z", line = 159)
    public static final boolean method2299(int arg0, int arg1) {
        field5363++;
        int var2 = 12 % ((arg0 - 44) / 40);
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)I", line = 171)
    public final int method1037(int arg0) {
        field5358++;
        if (arg0 != -5) {
            this.method1038(-17);
        }
        return this.field5351;
    }
}
