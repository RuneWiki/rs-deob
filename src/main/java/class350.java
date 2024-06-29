import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class350 {

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "[I")
    public static int[] field4502 = new int[25];

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Lkg;")
    public static class179 field4500 = new class179(22, 3);

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field4503 = 0;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Ldq;")
    public static class493 field4504 = new class493(20, 0);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "[I")
    public static int[] field4499;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIII)Lkc;")
    public static final class87 method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4501++;
        long var7 = (long) arg0 * 986053L ^ (long) arg1 * 97549L ^ (long) arg3 * 67481L ^ (long) arg4 * 475427L ^ (long) arg6 * 32147369L ^ (long) arg2 * 76724863L;
        if (arg5 != -8076) {
            field4502 = null;
        }
        class87 var9 = (class87) class390.field5231.method2647(-109, var7);
        if (var9 == null) {
            class87 var10 = class303.field3890.method292(arg3, arg1, arg4, arg0, arg6, arg2);
            class390.field5231.method2635(var7, -26591, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public static void method2011(int arg0) {
        field4499 = null;
        if (arg0 == 0) {
            field4504 = null;
            field4502 = null;
            field4500 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Lfr;")
    public static final class284 method2012(int arg0) {
        field4498++;
        try {
            return new class150();
        } catch (Throwable var3) {
            int var1 = 30 % ((arg0 + 16) / 54);
            try {
                return (class284) Class.forName("ec").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class58();
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
    public static final void method2013(int arg0) {
        if (class292.method1717(false)) {
            if (class99.field1199 == null) {
                class69.method610((byte) -105);
            }
            class503.field7268 = true;
            class294.field3760 = 0;
            try {
                class116.field1569 = class349.field4492.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        field4497++;
        if (arg0 != 25875) {
            field4504 = null;
        }
    }
}
