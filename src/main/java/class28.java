import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class28 {

    @OriginalMember(owner = "client!go", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field358 = new String[] { method320(method319("\u0018qFK5")), method320(method319("\u00040F `")), method320(method319("\u0018qFH5")), method320(method319("\u0011k\u0004b")) };

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lff;")
    public static class733 field357 = new class733();

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Ljava/lang/Thread;")
    public static Thread field356;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLvo;)V", line = 9)
    public static final void method315(byte arg0, class782 arg1) {
        try {
            field355++;
            class782 var2 = class737.method5350((byte) 80, arg1);
            int var3 = -55 / ((arg0 + 14) / 37);
            int var4;
            int var5;
            if (var2 == null) {
                var4 = class711.field9998;
                var5 = class391.field5700;
            } else {
                var4 = var2.field11244;
                var5 = var2.field11295;
            }
            class237.method1964(true, arg1, false, var5, var4);
            class349.method2788(var4, -20537, var5, arg1);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field358[2] + arg0 + ',' + (arg1 == null ? field358[3] : field358[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 41)
    public static void method317(int arg0) {
        try {
            field356 = null;
            if (arg0 == -16457) {
                field357 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field358[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([BIII)V")
    public abstract void method312(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III[B)I")
    public abstract int method313(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    public abstract void method314(int arg0);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Z")
    public abstract boolean method316(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public abstract void method318(byte arg0);

    @OriginalMember(owner = "client!go", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method319(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!go", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method320(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
