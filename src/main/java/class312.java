import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class312 extends class425 {

    @OriginalMember(owner = "client!de", name = "r", descriptor = "J")
    public long field4612;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Z")
    public static boolean field4611 = false;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Z")
    public static boolean field4609 = true;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Lpm;")
    public static class349 field4613 = new class349("M", "M", "M", "M");

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field4617 = 0;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lsn;")
    public static class377 field4615;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
    public static final void method2097(int arg0, int arg1, int arg2) {
        field4616++;
        if (arg2 != 0) {
            field4617 = 118;
        }
        class150.field2254[arg1] = arg0;
        class312 var3 = (class312) class419.field6014.method1373((long) arg1, arg2 ^ 0xFFFFFFB6);
        if (var3 == null) {
            class312 var4 = new class312(class18.method107(arg2 ^ 0xFFFFC0EF) + 500L);
            class419.field6014.method1376(var4, (long) arg1, 68);
        } else {
            var3.field4612 = class18.method107(arg2 ^ 0xFFFFC0EF) + 500L;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class312() {
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(J)V")
    public class312(long arg0) {
        this.field4612 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method2098(int arg0, int arg1, int arg2, byte[] arg3) {
        field4610++;
        char[] var4 = new char[arg2];
        int var5 = arg1;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg3[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class408.field5785[var7 - 128];
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

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLtj;)I")
    public static final int method2099(byte arg0, class108 arg1) {
        field4614++;
        if (arg0 <= 5) {
            return 70;
        }
        int var2 = 0;
        if (arg1.method660(class409.field5873, (byte) -86)) {
            var2++;
        }
        if (arg1.method660(class186.field2659, (byte) -89)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method2100(int arg0) {
        if (arg0 > 51) {
            field4615 = null;
            field4613 = null;
        }
    }
}
