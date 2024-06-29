import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class3 {

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "[I")
    public static int[] field41 = new int[1000];

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "B")
    public byte field30;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "B")
    public byte field33;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "B")
    public byte field40;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "B")
    public byte field42;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "B")
    public byte field43;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "B")
    public byte field45;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "B")
    public byte field47;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field46;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field49;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "S")
    public short field37;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Z")
    public boolean field26;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Z")
    public boolean field27;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Z")
    public boolean field31;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Z")
    public boolean field34;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Z")
    public boolean field35;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
    public boolean field38;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Z")
    public boolean field39;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Z")
    public boolean field44;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Z")
    public boolean field48;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method13(int arg0) {
        class51 var1 = class38.field565;
        synchronized (class38.field565) {
            if (arg0 != 1000) {
                return;
            }
            class38.field565.method366(-125);
        }
        field29++;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method14(int arg0) {
        if (arg0 == 7795) {
            field41 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([[II)V")
    public static final void method15(int[][] arg0, int arg1) {
        if (arg1 < -94) {
            class444.field6416 = arg0;
            field46++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILrj;ILtj;II)Ll;")
    public static final class315 method16(int arg0, int arg1, int arg2, class436 arg3, int arg4, class298 arg5, int arg6, int arg7) {
        class106.field1404.field5599 = arg5.field4492;
        class106.field1404.field5602 = arg7;
        class106.field1404.field5595 = arg0;
        class106.field1404.field5600 = arg1;
        if (arg2 >= -49) {
            return null;
        }
        field28++;
        class106.field1404.field5598 = arg6;
        class106.field1404.field5597 = arg3 != null;
        class106.field1404.field5592 = arg4;
        return (class315) class444.field6413.method1416(class106.field1404, 0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
    public static final int method17(int arg0, int arg1, int arg2) {
        field32++;
        if (arg0 <= 106) {
            field41 = null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static final void method18(boolean arg0) {
        field36++;
        if (!arg0) {
            return;
        }
        try {
            Method var1 = (field49 == null ? (field49 = method19("java.lang.Runtime")) : field49).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class393.field5727 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method19(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
