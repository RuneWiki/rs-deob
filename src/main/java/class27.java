import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class27 extends class396 {

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field343 = new String[] { method191(method190("\u007fye\u0015^1")), method191(method190("\u007fye\u0015\\1")), method191(method190("\u007fye\u0015X1")) };

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "Lbl;")
    public static class675 field328 = new class675(14, 0);

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "Lbl;")
    public static class675 field329 = new class675(15, 4);

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "Lbl;")
    public static class675 field330 = new class675(16, -2);

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "Lbl;")
    public static class675 field331 = new class675(17, 0);

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "Lbl;")
    public static class675 field332 = new class675(19, -2);

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "Lbl;")
    public static class675 field333 = new class675(22, -2);

    @OriginalMember(owner = "client!fba", name = "v", descriptor = "Lbl;")
    public static class675 field334 = new class675(23, 4);

    @OriginalMember(owner = "client!fba", name = "u", descriptor = "Lbl;")
    public static class675 field335 = new class675(24, -1);

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "Lbl;")
    public static class675 field336 = new class675(26, 0);

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "Lbl;")
    public static class675 field337 = new class675(27, 0);

    @OriginalMember(owner = "client!fba", name = "w", descriptor = "Lbl;")
    public static class675 field338 = new class675(28, -2);

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "Lbl;")
    public static class675 field339 = new class675(29, -2);

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "Lbl;")
    public static class675 field340 = new class675(30, -2);

    @OriginalMember(owner = "client!fba", name = "t", descriptor = "[Lbl;")
    private static class675[] field341 = new class675[32];

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "[[Z")
    public static boolean[][] field342;

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lla;Lla;Lega;)V")
    public class27(class476 arg0, class476 arg1, class738 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIZI)V")
    public final void method187(boolean arg0, int arg1, boolean arg2, int arg3) {
        try {
            if (arg0) {
                ++field327;
                int var5 = this.method3130(-1) * super.field5922.field5809 / 10000;
                class610.field8913.method556(arg1, arg3 + 2, var5, super.field5922.field5810 + -2, ((class738) super.field5922).field10734, 0);
                class610.field8913.method556(arg1 + var5, arg3 + 2, -var5 + super.field5922.field5809, super.field5922.field5810 + -2, 0, 0);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field343[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIBI)V")
    public final void method188(boolean arg0, int arg1, byte arg2, int arg3) {
        try {
            int var5 = -49 / ((arg2 - -64) / 40);
            ++field326;
            class610.field8913.method527(arg1 + -2, arg3, super.field5922.field5809 + 4, super.field5922.field5810 + 2, ((class738) super.field5922).field10733, 0);
            class610.field8913.method527(arg1 + -1, arg3 + 1, super.field5922.field5809 - -2, super.field5922.field5810, 0, 0);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field343[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(B)V")
    public static void method189(byte arg0) {
        try {
            field335 = null;
            field331 = null;
            field333 = null;
            if (arg0 < 71) {
                method189((byte) -9);
            }
            field330 = null;
            field337 = null;
            field341 = null;
            field342 = null;
            field339 = null;
            field340 = null;
            field338 = null;
            field328 = null;
            field336 = null;
            field334 = null;
            field332 = null;
            field329 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field343[2] + arg0 + ')');
        }
    }

    static {
        class675[] var0 = class43.method292(0);
        for (int var1 = 0; var1 < var0.length; ++var1) {
            field341[var0[var1].field9786] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method190(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method191(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 25;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
