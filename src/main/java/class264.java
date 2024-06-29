import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class264 extends class161 {

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "[B")
    public byte[] field4258;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field4260 = 0;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "[[I")
    public static int[][] field4252 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4253 = "flash2:";

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Lvr;")
    public static class70 field4255;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[B)[B", line = 3)
    public static final byte[] method1806(int arg0, byte[] arg1) {
        field4259++;
        int var2 = arg1.length;
        if (arg0 >= -66) {
            field4260 = 0;
        }
        byte[] var3 = new byte[var2];
        class408.method2559(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IJ)V", line = 20)
    public static final void method1807(int arg0, long arg1) {
        class11.field139.field3044 = 0;
        field4257++;
        class11.field139.method1312(21, -23);
        class11.field139.method1318(0, arg1);
        class190.field3103 = -3;
        class367.field5567 = 0;
        class31.field389 = 1;
        class402.field6004 = 0;
        int var3 = -10 / ((11 - arg0) / 36);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V", line = 44)
    public static void method1808(byte arg0) {
        field4255 = null;
        field4253 = null;
        field4252 = null;
        if (arg0 > -22) {
            field4251 = -38;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)I", line = 63)
    public static final int method1809(int arg0, int arg1, int arg2, int arg3) {
        field4254++;
        int var4 = arg2 / arg1;
        int var5 = arg1 - 1 & arg2;
        int var6 = arg3 / arg1;
        int var7 = arg1 - 1 & arg3;
        int var8 = class266.method1815(-1, var4, var6);
        int var9 = class266.method1815(-1, var4 + 1, var6);
        int var10 = class266.method1815(-1, var4, var6 + 1);
        int var11 = class266.method1815(-1, arg0 + var4, var6 - -1);
        int var12 = class245.method1707(var9, arg1, var8, var5, true);
        int var13 = class245.method1707(var11, arg1, var10, var5, true);
        return class245.method1707(var13, arg1, var12, var7, true);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLjava/awt/Canvas;)Lqi;", line = 92)
    public static final class337 method1810(byte arg0, Canvas arg1) {
        field4256++;
        try {
            if (arg0 <= 87) {
                return null;
            } else {
                Class var2 = Class.forName("nc");
                class337 var3 = (class337) var2.getDeclaredConstructor().newInstance();
                var3.method140(arg1, -4160);
                return var3;
            }
        } catch (Throwable var5) {
            class99 var4 = new class99();
            var4.method140(arg1, -4160);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "([B)V", line = 114)
    public class264(byte[] arg0) {
        this.field4258 = arg0;
    }
}
