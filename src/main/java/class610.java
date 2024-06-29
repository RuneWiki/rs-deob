import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public abstract class class610 {

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Ljka;")
    public static class159 field7708 = new class159(0, 0);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 3)
    public static void method3266(int arg0) {
        int var1 = -70 / (arg0 / 63);
        field7708 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZLjava/lang/String;)Z", line = 17)
    public static final boolean method3267(int arg0, int arg1, boolean arg2, String arg3) {
        field7712++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        if (arg1 != -32683) {
            method3268(1, 102);
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
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)Z", line = 97)
    public static final boolean method3268(int arg0, int arg1) {
        if (arg0 != -91) {
            method3266(24);
        }
        field7709++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V", line = 111)
    public static final void method3269(int arg0) throws IOException {
        if (class252.field3437 != null && class261.field3496 > 0) {
            class419.field5520.field3133 = 0;
            while (true) {
                class13 var1 = (class13) class483.field6238.method3591(0);
                if (var1 == null || var1.field131 > (class419.field5520.field3193.length - class419.field5520.field3133)) {
                    class252.field3437.method1816(class419.field5520.field3193, 76, class419.field5520.field3133, 0);
                    class498.field6386 += class419.field5520.field3133;
                    class341.field4177 = 0;
                    break;
                }
                class419.field5520.method1530(0, var1.field131, var1.field130.field3193, 122);
                class261.field3496 -= var1.field131;
                var1.method1946(-10364);
                var1.field130.method1528(8);
                var1.method55(34);
            }
        }
        int var2 = -85 % ((-arg0 - 39) / 41);
        field7707++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLmc;)Lqd;", line = 147)
    public static final class601 method3270(byte arg0, class234 arg1) {
        field7711++;
        if (arg0 > -49) {
            field7708 = null;
        }
        arg1.method1509(true);
        int var2 = arg1.method1509(true);
        class601 var3 = class321.method1867(var2, 20683);
        var3.field7649 = arg1.method1509(true);
        int var4 = arg1.method1509(true);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1509(true);
            var3.method259(arg1, var6, -116);
        }
        var3.method292((byte) 123);
        return var3;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(JI)I", line = 184)
    public final int method3271(long arg0, int arg1) {
        field7706++;
        if (arg1 != 0) {
            method3266(93);
        }
        long var4 = this.method841((byte) 112);
        if (var4 > 0L) {
            class591.method3181(var4, 0);
        }
        return this.method842(arg1 ^ 0xFFFFFFA9, arg0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IJ)I")
    public abstract int method842(int arg0, long arg1);

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)J")
    public abstract long method839(int arg0);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public abstract void method840(byte arg0);

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)J")
    public abstract long method841(byte arg0);
}
