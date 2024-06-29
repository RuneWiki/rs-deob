import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class116 extends class161 {

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "J")
    public long field2095;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Lp;")
    public static class280 field2099 = class18.method140((byte) -123, "<)4col>");

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lp;")
    public static class280 field2100 = class18.method140((byte) -128, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Lsb;")
    public static class221 field2101 = new class221(30);

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "[I")
    public static int[] field2097;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static void method838(int arg0) {
        field2097 = null;
        field2101 = null;
        field2100 = null;
        field2099 = null;
        if (arg0 <= 9) {
            field2100 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[B)Z")
    public static final boolean method839(int arg0, byte[] arg1) {
        class25 var2 = new class25(arg1);
        if (arg0 < 61) {
            method840(-19, 64);
        }
        int var3 = var2.method189((byte) -103);
        field2096++;
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method189((byte) -103) == 1;
        if (var4) {
            class231.method1556((byte) -99, var2);
        }
        class51.method376(var2, 0);
        return true;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)Lr;")
    public static final class41 method840(int arg0, int arg1) {
        field2094++;
        class41 var2 = (class41) class154.field2674.method1480((byte) 50, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class263.field4645.method1258(33, arg0, (byte) 118);
        if (arg1 != -7793) {
            return null;
        }
        class41 var4 = new class41();
        if (var3 != null) {
            var4.method315(new class25(var3), arg0, (byte) -82);
        }
        class154.field2674.method1483((byte) -108, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class116() {
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(J)V")
    public class116(long arg0) {
        this.field2095 = arg0;
    }
}
