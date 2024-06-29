import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class342 implements class666 {

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "Lgga;")
    private class513 field4862;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4863 = new Rectangle[100];

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)V")
    public static void method2100(int arg0) {
        int var1 = 14 % ((arg0 + 4) / 50);
        field4863 = null;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)I")
    public static final int method2101(int arg0, int arg1, int arg2) {
        field4867++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg0 <= 12) {
                method2100(60);
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)I")
    public final int method843(int arg0) {
        if (arg0 != 25894) {
            this.field4862 = null;
        }
        field4865++;
        return this.field4862.method3004((byte) -128) ? 100 : this.field4862.method2998(0);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2102(int arg0, String arg1) {
        field4866++;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0 >= -5) {
            return -48L;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)Lpw;")
    public final class104 method842(byte arg0) {
        if (arg0 != -49) {
            this.field4862 = null;
        }
        field4864++;
        return class104.field1510;
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lgga;)V")
    public class342(class513 arg0) {
        this.field4862 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4863[var0] = new Rectangle();
        }
    }
}
