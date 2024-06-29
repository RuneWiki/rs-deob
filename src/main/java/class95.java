import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class95 extends class330 implements Runnable {

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Z")
    private boolean field1275 = true;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public int field1277 = -1;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Luu;")
    private class179 field1269;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lul;")
    public static class386 field1272 = new class386(16);

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field1281 = 500;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Lhr;")
    public static class348 field1282;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 4)
    public final void method579(byte arg0) {
        if (arg0 != 57) {
            field1272 = null;
        }
        (new Thread(this, "a")).start();
        field1279++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)V", line = 15)
    public static final void method580(int arg0, int arg1, int arg2, int arg3) {
        class79.field1108.method969(19869, arg1);
        int var4 = -104 / ((-arg2 - 22) / 42);
        field1274++;
        class79.field1108.method961(arg3, 1608339368);
        class79.field1108.method961(arg0, 1608339368);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 27)
    public static void method581(int arg0) {
        field1282 = null;
        field1272 = null;
        if (arg0 != 16) {
            method580(-15, -18, -51, -39);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;ZII)Z", line = 41)
    public static final boolean method582(String arg0, boolean arg1, int arg2, int arg3) {
        field1271++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
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
        if (arg3 < 101) {
            method584(true, 86, null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V", line = 114)
    public final void method583(byte arg0) {
        this.field1275 = false;
        field1276++;
        if (arg0 != 3) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!wh", name = "run", descriptor = "()V", line = 131)
    public final void run() {
        while (this.field1275) {
            this.field1269.method1138(this, (byte) 3);
        }
        field1270++;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Luu;)V", line = 168)
    public class95(class179 arg0) {
        this.field1269 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 154)
    public static final void method584(boolean arg0, int arg1, String arg2) {
        field1280++;
        if (arg0) {
            field1272 = null;
        }
        class338 var3 = class380.method2294((byte) 110, arg1, 2);
        var3.method2052((byte) -45);
        var3.field4923 = arg2;
    }
}
