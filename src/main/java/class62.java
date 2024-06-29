import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class62 extends OutputStream {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Z")
    public static boolean field907 = true;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lrm;")
    public static class184 field909 = new class184(50);

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Z")
    public static boolean field914 = false;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lrm;")
    public static class184 field913 = new class184(64);

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "F")
    public static float field912;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "F")
    public static float field916;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lcd;")
    public static class136 field917;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lug;")
    public static class253 field915;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method507(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field911++;
        if (arg1 != -30344) {
            method509(-25);
        }
        class111 var5 = (class111) class267.field4161.method2168((long) arg0, (byte) -127);
        if (var5 == null) {
            var5 = new class111();
            class267.field4161.method2161(var5, (long) arg0, -1);
        }
        if (var5.field1547.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field1547.length; var8++) {
                var6[var8] = var5.field1547[var8];
                var7[var8] = var5.field1552[var8];
            }
            for (int var9 = var5.field1547.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1552 = var7;
            var5.field1547 = var6;
        }
        var5.field1547[arg2] = arg4;
        var5.field1552[arg2] = arg3;
    }

    @OriginalMember(owner = "client!pj", name = "write", descriptor = "(I)V", line = 56)
    public final void write(int arg0) throws IOException {
        field906++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILug;)Z", line = 64)
    public static final boolean method508(int arg0, class253 arg1) {
        field910++;
        if (arg1.method1837(110, class172.field2839)) {
            return true;
        } else {
            int var2 = 63 / ((arg0 + 56) / 42);
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 89)
    public static void method509(int arg0) {
        field913 = null;
        if (arg0 == 3030) {
            field909 = null;
            field915 = null;
            field917 = null;
        }
    }
}
