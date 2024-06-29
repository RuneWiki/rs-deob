import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class273 extends class314 {

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "J")
    public long field4858;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Z")
    public static boolean field4857 = false;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lud;")
    public static class279 field4861 = class130.method1024("Hierhin drehen", 255);

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Lud;")
    private static class279 field4864 = class130.method1024("(U1", 255);

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lud;")
    public static class279 field4865 = class130.method1024("Memory after cleanup=", 255);

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "B")
    public static byte field4862;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lgf;", line = 11)
    public static final class8 method1940(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        int var3 = -44 % ((44 - arg1) / 61);
        field4866++;
        int var4 = arg0 & 0xFFFF;
        if (class18.field545[var2] == null || class18.field545[var2][var4] == null) {
            boolean var5 = class283.method2031(20714, var2);
            if (!var5) {
                return null;
            }
        }
        return class18.field545[var2][var4];
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V", line = 53)
    public static void method1941(boolean arg0) {
        if (arg0) {
            method1941(false);
        }
        field4864 = null;
        field4865 = null;
        field4861 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 65)
    public class273() {
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(J)V", line = 72)
    public class273(long arg0) {
        this.field4858 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lud;Lgf;I)Lud;", line = 81)
    public static final class279 method1942(class279 arg0, class8 arg1, int arg2) {
        field4860++;
        if (~arg0.method1989(class50.field1043, (byte) -72) == arg2) {
            return arg0;
        }
        while (true) {
            int var3 = arg0.method1989(field4864, (byte) -72);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg0.method1989(class121.field2177, (byte) -72);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg0.method1989(class285.field5085, (byte) -72);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg0.method1989(class91.field1720, (byte) -72);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg0.method1989(class154.field2791, (byte) -72);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg0.method1989(class13.field414, (byte) -72);
                                                    if (var8 == -1) {
                                                        return arg0;
                                                    }
                                                    class279 var9 = class60.field1265;
                                                    if (class178.field3226 != null) {
                                                        var9 = class220.method1615(class178.field3226.field3658, 255);
                                                        try {
                                                            if (class178.field3226.field3657 != null) {
                                                                byte[] var10 = ((String) class178.field3226.field3657).getBytes("ISO-8859-1");
                                                                var9 = class194.method1457(0, var10.length, var10, false);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg0 = class115.method929(new class279[] { arg0.method2009((byte) -84, 0, var8), var9, arg0.method1988((byte) -104, var8 + 4) }, (byte) 60);
                                                }
                                            }
                                            arg0 = class115.method929(new class279[] { arg0.method2009((byte) -84, 0, var7), class218.method1594(class44.method382(arg1, 4, -2148), 999999999), arg0.method1988((byte) -99, var7 + 2) }, (byte) 60);
                                        }
                                    }
                                    arg0 = class115.method929(new class279[] { arg0.method2009((byte) -84, 0, var6), class218.method1594(class44.method382(arg1, 3, arg2 ^ 0xFFFFF79C), 999999999), arg0.method1988((byte) -66, var6 + 2) }, (byte) 60);
                                }
                            }
                            arg0 = class115.method929(new class279[] { arg0.method2009((byte) -84, 0, var5), class218.method1594(class44.method382(arg1, 2, -2148), arg2 + 999999999), arg0.method1988((byte) -88, var5 + 2) }, (byte) 60);
                        }
                    }
                    arg0 = class115.method929(new class279[] { arg0.method2009((byte) -84, 0, var4), class218.method1594(class44.method382(arg1, 1, -2148), 999999999), arg0.method1988((byte) -126, var4 + 2) }, (byte) 60);
                }
            }
            arg0 = class115.method929(new class279[] { arg0.method2009((byte) -84, 0, var3), class218.method1594(class44.method382(arg1, 0, -2148), 999999999), arg0.method1988((byte) -64, var3 + 2) }, (byte) 60);
        }
    }
}
