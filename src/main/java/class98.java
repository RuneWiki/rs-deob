import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class98 extends class71 {

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Ljava/lang/String;")
    public String field1490;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1491 = "Connecting to update server";

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lqg;")
    public static class256 field1493 = new class256();

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1496 = "Loading fonts - ";

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Ltl;")
    public static class222 field1495 = new class222(64);

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field1498 = 0;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Z")
    public static boolean field1499;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)J", line = 6)
    public static final long method694(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3680; var4++) {
            class271 var5 = var3.field3687[var4];
            if ((var5.field4294 >> 29 & 0x3L) == 2L && var5.field4285 == arg1 && var5.field4297 == arg2) {
                return var5.field4294;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 25)
    public class98() {
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 27)
    public class98(String arg0) {
        this.field1490 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 43)
    public static final String method695(String arg0, boolean arg1) {
        byte var2 = 2;
        int var3 = arg0.length();
        char[] var4 = new char[var3];
        field1494++;
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg0.charAt(var5);
            if (var2 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var2 == 2 || Character.isUpperCase(var6)) {
                var6 = class235.method1683(var6, (byte) 50);
            }
            if (Character.isLetter(var6)) {
                var2 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var2 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var4[var5] = var6;
        }
        if (arg1) {
            field1495 = (class222) null;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V", line = 94)
    public static void method696(byte arg0) {
        field1491 = null;
        field1495 = null;
        field1496 = null;
        if (arg0 < 125) {
            method694(46, 25, -79);
        }
        field1493 = null;
    }
}
