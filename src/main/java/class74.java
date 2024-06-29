import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class74 extends OutputStream {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
    public static boolean field1201 = false;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lbc;")
    public static class175 field1203;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
    public static int[] field1202;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method522(byte arg0, String arg1) {
        field1205++;
        long var2 = 0L;
        if (arg0 >= -57) {
            method524(78);
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
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

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lgj;")
    public static final class235 method523(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class235 var4 = var3.field2149;
            var3.field2149 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method524(int arg0) {
        field1203 = null;
        if (arg0 <= -46) {
            field1202 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1200++;
        throw new IOException();
    }
}
