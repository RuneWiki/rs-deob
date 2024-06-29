import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public abstract class class393 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field4945 = -1;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field4951 = 0;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "Lrga;")
    public static class280 field4947 = new class280(59, 8);

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;IILqj;)Lbj;", line = 10)
    public static final class483 method2108(String arg0, int arg1, int arg2, class548 arg3) {
        if (arg1 != -65536) {
            return null;
        }
        field4948++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class507.field6755, 0);
        if (class507.field6755[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class483(arg3, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I", line = 36)
    public static final int method2109(int arg0) {
        field4946++;
        class566 var1 = class32.field452;
        boolean var2 = false;
        if (class651.field9191 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class566.method3111(0, 0, null, var3, null, -19464);
            var2 = true;
        }
        long var4 = class571.method3150(94);
        if (arg0 >= -106) {
            return 39;
        }
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1044(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class571.method3150(95) - var4);
        var1.method3118(-16777216, 0, 0, 1, 100, 100);
        if (var2) {
            var1.method3119(1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;ZIB)I", line = 78)
    public static final int method2110(String arg0, boolean arg1, int arg2, byte arg3) {
        field4950++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var10 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg1) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg2 * var6 + var12;
            if ((var11 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var11;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        int var9 = -120 % ((arg3 + 5) / 56);
        return var6;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V", line = 160)
    public static final void method2111(int arg0, boolean arg1) {
        if (!arg1) {
            field4947 = null;
        }
        field4949++;
        class641.method3583(arg0, (byte) -126, class83.field1120.method476((byte) 74, class250.field3068));
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V", line = 178)
    public static void method2112(byte arg0) {
        if (arg0 <= 126) {
            method2109(-48);
        }
        field4947 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
    public abstract void method1745(int arg0, int arg1);

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[B")
    public abstract byte[] method1747(int arg0, int arg1);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Lds;")
    public abstract class375 method1743(byte arg0);

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)I")
    public abstract int method1748(int arg0, int arg1);
}
