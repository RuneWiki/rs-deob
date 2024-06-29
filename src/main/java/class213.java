import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class213 extends class617 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lmca;")
    public class29 field3535;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lrl;")
    public static class672 field3534 = new class672(20, -1);

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3539 = 0;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3538 = 2;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lil;")
    public static class7 field3537;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1605(boolean arg0) {
        if (!arg0) {
            method1606(93, false, 50, null);
        }
        field3537 = null;
        field3534 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lrr;II[B)V", line = 34)
    public class213(class332 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3535 = arg0.method2241(arg3, -127, false, class203.field3311, arg2, arg1);
        this.field3535.method364(false, false, (byte) 126);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZILjava/lang/String;)I", line = 47)
    public static final int method1606(int arg0, boolean arg1, int arg2, String arg3) {
        field3536++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
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
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (arg0 != 122) {
            return 76;
        } else if (var5) {
            return var6;
        } else {
            throw new NumberFormatException();
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lrr;II[I)V", line = 126)
    public class213(class332 arg0, int arg1, int arg2, int[] arg3) {
        this.field3535 = arg0.method2243(arg3, arg1, false, arg2, (byte) -20);
        this.field3535.method364(false, false, (byte) 121);
    }
}
