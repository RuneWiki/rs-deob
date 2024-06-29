import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class206 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[S")
    public static short[] field3030 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3033 = "slide:";

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3036 = new String[8];

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lgg;")
    public static final class66 method1458(int arg0, int arg1) {
        field3035++;
        class66 var2 = (class66) class269.field4330.method1418((long) arg0, 0);
        if (arg1 != 22464) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class301.field4867.method1868(arg0, 36, arg1 ^ 0x57C1);
            class66 var4 = new class66();
            var4.field1009 = arg0;
            if (var3 != null) {
                var4.method498(new class53(var3), arg1 ^ 0x57C2);
            }
            class269.field4330.method1421((long) arg0, var4, (byte) 102);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Ljg;")
    public static final class135 method1459(byte arg0) {
        field3034++;
        if (arg0 > -49) {
            method1459((byte) -83);
        }
        try {
            return new class18();
        } catch (Throwable var2) {
            try {
                return (class135) Class.forName("ee").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class42();
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static void method1460(boolean arg0) {
        field3036 = null;
        if (!arg0) {
            field3036 = null;
        }
        field3030 = null;
        field3033 = null;
    }
}
