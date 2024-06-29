import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class297 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Z")
    public static boolean field4040 = true;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4045 = 99;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field4046 = -2;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lam;")
    public static class286 field4041;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[[B")
    public static byte[][] field4042;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lvm;I)V")
    public static final void method1742(class322 arg0, int arg1) {
        int var2 = -26 / ((arg1 - 54) / 40);
        field4043++;
        if (class370.field5166 != class263.field3592 && class176.field2209 != null && class44.method206(-40, class263.field3592, arg0)) {
            class370.field5166 = class263.field3592;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
    public static final int method1743(String arg0, int arg1, boolean arg2, int arg3) {
        field4039++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg1 <= 121) {
            return 87;
        }
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
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
                throw new NumberFormatException();
            }
            if (var11 >= arg3) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method1744(int arg0) {
        if (arg0 >= 110) {
            field4042 = null;
            field4041 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)[B")
    public abstract byte[] method181(int arg0);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
    public static final void method1745(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -97) {
            field4045 = -56;
        }
        if (arg1 < arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class153.field1932[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class153.field1932[var6][arg4] = arg2;
            }
        }
        field4044++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BZ)V")
    public abstract void method180(byte[] arg0, boolean arg1);
}
