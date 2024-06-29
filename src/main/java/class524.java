import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class524 {

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
    private int field7655;

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7656 = new String[] { method3975(method3974("(3tY\u0005b")), method3975(method3974("$/y\u001b")), method3975(method3974("(3tYz#4|\u0003xb")), method3975(method3974("1t;Y;")), method3975(method3974("(3tY\u0002b")), method3975(method3974("(3tY\u0003b")), method3975(method3974("(3tY\u0004b")), method3975(method3974("(3tY\u0007b")) };

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "Lkia;")
    public static class646 field7652 = new class646(method3975(method3974("\u001d\u000eB>\u0016")), method3975(method3974("%<s\u001e%/")), method3975(method3974("\u0015-|\u0007")), 3);

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public static int field7654 = 503;

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)V", line = 6)
    public static void method3969(boolean arg0) {
        try {
            field7652 = null;
            if (!arg0) {
                field7652 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7656[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)V", line = 16)
    public static final void method3970(int arg0) {
        try {
            class299.method2523();
            field7649++;
            for (int var1 = 0; var1 < 4; var1++) {
                class429.field6298[var1].method2755((byte) -113);
            }
            class233.method1993((byte) -69);
            if (arg0 != -4377) {
                method3970(-54);
            }
            class344.method2848(arg0 ^ 0x938);
            class472.method3586(-71);
            System.gc();
            class610.field8913.method586();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7656[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IC)V", line = 43)
    public final void method3971(int arg0, char arg1) {
        try {
            OpenGL.glCallList(this.field7655 + arg1);
            field7650++;
            if (arg0 != 0) {
                this.field7655 = 29;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7656[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IB)V", line = 58)
    public final void method3972(int arg0, byte arg1) {
        try {
            if (arg1 >= -76) {
                this.method3973(79);
            }
            field7653++;
            OpenGL.glNewList(this.field7655 + arg0, 4864);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7656[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V", line = 74)
    public final void method3973(int arg0) {
        try {
            field7651++;
            int var2 = -25 % ((86 - arg0) / 33);
            OpenGL.glEndList();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7656[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lffa;I)V", line = 83)
    public class524(class197 arg0, int arg1) {
        try {
            this.field7655 = OpenGL.glGenLists(arg1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7656[2] + (arg0 == null ? field7656[1] : field7656[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3974(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3975(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
