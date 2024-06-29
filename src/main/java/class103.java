import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class103 extends class469 {

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1369 = new String[] { method995(method994("W \u007fH\\")), method995(method994("W \u007fB\\")), method995(method994("W \u007f5\u001dN:%7\\")), method995(method994("[}\u007f'\t")), method995(method994("N&=e")), method995(method994("W \u007fC\\")) };

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Ldfa;")
    public static class477 field1364 = new class477(8);

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "J")
    public static volatile long field1368 = 0L;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lml;II[BI)V")
    public class103(class194 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        try {
            this.field1365 = arg2;
            super.field6859.method1618((byte) 20, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage1Dub(super.field6861, 0, super.field6870, this.field1365, 0, arg4, 5121, arg3, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method3600(105, true);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1369[2] + (arg0 != null ? field1369[3] : field1369[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1369[3] : field1369[4]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)V")
    public static void method991(int arg0) {
        try {
            field1364 = null;
            if (arg0 != 3317) {
                field1368 = -111L;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1369[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public final void method992(int arg0) {
        try {
            ++field1367;
            if (arg0 != -1) {
                this.method993((byte) 36, true);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1369[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BZ)V")
    public final void method993(byte arg0, boolean arg1) {
        try {
            ++field1366;
            super.field6859.method1618((byte) -127, this);
            int var3 = 57 / ((-23 - arg0) / 56);
            OpenGL.glTexParameteri(super.field6861, 10242, arg1 ? 10497 : 33071);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1369[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method994(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 116);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method995(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 9;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
