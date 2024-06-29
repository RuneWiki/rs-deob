import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class10 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "F")
    public static float field143 = 0.0F;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Z")
    public static boolean field147 = true;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[B")
    public static byte[] field148 = new byte[520];

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field145 = 500;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field146;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field149;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method67(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 12)
    public static final void method64(int arg0) {
        field146++;
        try {
            Method var1 = (field149 == null ? (field149 = method67("java.lang.Runtime")) : field149).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class181.field2530 = var3;
                } catch (Throwable var5) {
                }
            }
            int var4 = 24 % ((-arg0 - 43) / 38);
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V", line = 41)
    public static void method65(int arg0) {
        field148 = null;
        if (arg0 != 20602) {
            field143 = -0.49822134F;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BJ)V", line = 53)
    public static final void method66(byte arg0, long arg1) {
        field144++;
        int var3 = class164.field2311;
        int var4 = class120.field1714;
        if (class290.field4007 != var3) {
            int var5 = var3 - class290.field4007;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class290.field4007 += var6;
        }
        if (!class188.field2609) {
            class140.field2007 += (float) arg1 * field143 / 40.0F * 8.0F;
            class6.field98 += (float) arg1 * class220.field2891 / 40.0F * 8.0F;
        }
        if (class123.field1729 != var4) {
            int var7 = var4 - class123.field1729;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class123.field1729 += var8;
        }
        class311.method1968((byte) 30);
        if (arg0 <= 41) {
            field147 = true;
        }
    }
}
