import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class67 extends class194 implements Runnable {

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public int field912 = -1;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Z")
    private boolean field922 = true;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Lul;")
    private class403 field914;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Lri;")
    public static class74 field919 = new class74(0, 15);

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "J")
    public static long field920 = 0L;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "Lclient;")
    public static client field921;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 3)
    public static final void method570(int arg0) {
        field911++;
        if (arg0 != -30266) {
            field920 = -16L;
        }
        if (class118.field1759 != null) {
            class118.field1759.method2606(arg0 ^ 0xFFFFD519);
        }
        if (class102.field1544 != null) {
            class102.field1544.method2606(23775);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 21)
    public final void method571(int arg0) {
        field918++;
        if (arg0 == 0) {
            this.field922 = false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "run", descriptor = "()V", line = 32)
    public final void run() {
        field917++;
        while (this.field922) {
            this.field914.method2432(this, -14774);
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V", line = 44)
    public final void method572(int arg0) {
        if (arg0 != -66) {
            field921 = null;
        }
        (new Thread(this, "a")).start();
        field910++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 64)
    public static final String method573(byte[] arg0, int arg1, int arg2, int arg3) {
        field916++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg1 != 23231) {
            field921 = null;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg0[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class112.field1678[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BC)Z", line = 105)
    public static final boolean method574(byte arg0, char arg1) {
        field913++;
        int var2 = 18 / ((arg0 + 50) / 50);
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lul;)V", line = 143)
    public class67(class403 arg0) {
        this.field914 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V", line = 121)
    public static void method575(byte arg0) {
        field921 = null;
        field919 = null;
        if (arg0 <= 17) {
            field919 = null;
        }
    }
}
