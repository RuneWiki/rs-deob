import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class55 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field867 = 2;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
    public static boolean field874 = false;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "[[I")
    public static int[][] field872;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lnh;")
    public class55 method461(int arg0, int arg1, int arg2) {
        field869++;
        return this;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lnh;IIIZ)V")
    public void method462(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field873++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()I")
    public abstract int method82();

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lme;")
    public static final class238 method463(int arg0, int arg1) {
        class238 var2 = (class238) class252.field4022.method1361((byte) -95, (long) arg1);
        field871++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class98.field1574.method721((byte) -117, 11, arg1);
        class238 var4 = new class238();
        if (var3 != null) {
            var4.method1628(new class31(var3), (byte) 44);
        }
        if (arg0 != 0) {
            method463(59, 11);
        }
        class252.field4022.method1365((long) arg1, (byte) 13, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
    public abstract void method91(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public abstract void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method464(boolean arg0, byte arg1, String arg2) {
        short[] var3 = new short[16];
        String var4 = arg2.toLowerCase();
        field875++;
        int var5 = -70 % ((arg1 + 32) / 41);
        int var6 = 0;
        int var7 = arg0 ? 32768 : 0;
        int var8 = (arg0 ? class63.field996 : class221.field3377) + var7;
        for (int var9 = var7; var9 < var8; var9++) {
            class147 var12 = class261.method1749(92, var9);
            if (var12.field2175 && var12.method1064((byte) -91).toLowerCase().indexOf(var4) != -1) {
                if (var6 >= 50) {
                    class162.field2443 = null;
                    class121.field1819 = -1;
                    return;
                }
                if (var3.length <= var6) {
                    short[] var13 = new short[var3.length * 2];
                    for (int var14 = 0; var14 < var6; var14++) {
                        var13[var14] = var3[var14];
                    }
                    var3 = var13;
                }
                var3[var6++] = (short) var9;
            }
        }
        class204.field3150 = 0;
        class162.field2443 = var3;
        class121.field1819 = var6;
        String[] var10 = new String[class121.field1819];
        for (int var11 = 0; var11 < class121.field1819; var11++) {
            var10[var11] = class261.method1749(-120, var3[var11]).method1064((byte) -91);
        }
        class121.method917(class162.field2443, var10, -57);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()Z")
    public boolean method465() {
        field865++;
        return false;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method466(boolean arg0) {
        field872 = null;
        if (!arg0) {
            field867 = 38;
        }
    }
}
