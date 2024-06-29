import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class95 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
    public static int[] field1709 = new int[] { 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 5, 0, 0, 7, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 15, 0, 0, 0, 0, 0, 6, 0, 0, 8, -2, 0, 6, -1, 0, 0, 8, 10, 0, 12, 10, 2, -1, 0, 3, 6, 10, -1, 0, 1, 0, 0, 0, 3, 0, 8, 0, 0, 8, -2, 0, 5, 0, 14, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 8, 0, -1, 6, -1, 0, -1, 0, -2, 0, -2, 0, 10, 0, 4, 8, 2, 0, 0, 0, 0, 0, 0, 0, 24, 7, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 4, 0, 0, 0, 0, 5, 3, 1, 12, 0, -1, 0, 0, 0, 2, 2, 0, 5, 0, 4, 4, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 7, 0, 0, 0, 15, 1, 0, 0, 0, 0, -1, 0, 0, 0, 3, 0, -2, 8, 0, -2, 0, 14, 0, -1, 0, -2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -1, -1, 8, 0, -2, 7, 6, 0, -1, 0, 0, 6, 12, -2, 3, -1, -2, 1, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 9, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 5, 6, 0, 0, 20 };

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[[B")
    public static byte[][] field1710 = new byte[250][];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lcf;")
    public static class93 field1716 = class147.method1066("Memory after cleanup=", -48);

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lqc;")
    public class63 field1715;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field1720;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Z")
    public static boolean field1714;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    public int[] field1713;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method698(int arg0) {
        int var1 = 107 % ((-arg0 - 17) / 57);
        field1710 = null;
        field1716 = null;
        field1709 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public static final void method699(byte arg0) {
        field1711++;
        if (arg0 != 75) {
            method699((byte) 72);
        }
        try {
            Method var1 = (field1720 == null ? (field1720 = method700("java.lang.Runtime")) : field1720).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class58.field979 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method700(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
