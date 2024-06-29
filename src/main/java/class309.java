import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class309 {

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field5480 = 0;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field5485 = 0;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Lud;")
    public static class279 field5486 = class130.method1024(" est d-Bj-9 dans votre liste noire)3", 255);

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "[[Lnc;")
    public static class144[][] field5482 = new class144[13][13];

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field5487 = 20;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "[I")
    public static int[] field5488;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 20)
    public static void method2199(int arg0) {
        field5486 = null;
        if (arg0 <= 66) {
            method2200(-51, 77, -109, -128, (byte) 10, 44, 4);
        }
        field5488 = null;
        field5482 = (class144[][]) null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIBII)I", line = 33)
    public static final int method2200(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5483++;
        if ((arg0 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg1;
            arg1 = var7;
        }
        int var8 = arg5 & 0x3;
        if (arg4 <= 111) {
            method2200(122, 39, 4, 118, (byte) -112, -59, 57);
        }
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg3;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 93)
    public static final void method2201(byte arg0) {
        field5489++;
        try {
            if (arg0 != -80) {
                method2200(-26, 5, 86, 6, (byte) -82, -100, 95);
            }
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class274.field4867 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
    }
}
