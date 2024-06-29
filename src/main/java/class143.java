import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class143 {

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Z")
    public static boolean field2039 = false;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 5)
    public static final void method981(int arg0, String arg1, int arg2) {
        field2038++;
        class186 var3 = class275.method1789(arg2, (byte) 123, 2);
        var3.method1285(arg0);
        var3.field2825 = arg1;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 16)
    public static final void method982(String arg0, boolean arg1, boolean arg2) {
        class451.field6409.field6378 = 1;
        field2036++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class23.field309.field5781; var6++) {
            class184 var9 = class23.field309.method2364((byte) 118, var6);
            if ((!arg1 || var9.field2783) && var9.field2773 == -1 && var9.field2785 == -1 && var9.field2772 == 0 && var9.field2722.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class27.field352 = -1;
                    class394.field5804 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class394.field5804 = var4;
        class373.field5601 = 0;
        class27.field352 = var5;
        String[] var7 = new String[class27.field352];
        int var8 = 0;
        if (arg2) {
            return;
        }
        while (var8 < class27.field352) {
            var7[var8] = class23.field309.method2364((byte) 118, var4[var8]).field2722;
            var8++;
        }
        class401.method2403(class394.field5804, 0, var7);
        class451.field6409.method2674((byte) -102);
        class451.field6409.field6378 = 2;
    }
}
