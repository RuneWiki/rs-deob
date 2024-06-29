import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public abstract class class213 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lke;")
    private static class256 field3804 = class316.method2202("Connected to update server", 27626);

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field3810 = -1;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lke;")
    public static class256 field3813 = class316.method2202(")1", 27626);

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "[Lra;")
    public static class41[] field3812 = new class41[2048];

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lke;")
    public static class256 field3806 = field3804;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "F")
    public static float field3816;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lng;")
    public static class138 field3809;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "[I")
    public static int[] field3805;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1494(byte arg0) {
        field3815++;
        class48 var1 = class233.field3981;
        synchronized (class233.field3981) {
            class277.field4768++;
            class98.field1757 = class30.field472;
            if (class287.field4972 >= 0) {
                while (class287.field4972 != class129.field2255) {
                    int var2 = class254.field4358[class129.field2255];
                    class129.field2255 = class129.field2255 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class140.field2468[var2] = true;
                    } else {
                        class140.field2468[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class140.field2468[var3] = false;
                }
                class287.field4972 = class129.field2255;
            }
            if (arg0 > -18) {
                field3813 = (class256) null;
            }
            class30.field472 = class8.field127;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B", line = 66)
    public static final byte[] method1495(Object arg0, boolean arg1, byte arg2) {
        field3814++;
        if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class79.method593(var4, true) : var4;
        } else if ((arg0 instanceof class160)) {
            class160 var3 = (class160) arg0;
            return var3.method1186((byte) 6);
        } else {
            if (arg2 < 24) {
                field3812 = (class41[]) null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 103)
    public static void method1496(int arg0) {
        field3809 = null;
        field3806 = null;
        field3813 = null;
        field3804 = null;
        if (arg0 >= -37) {
            field3813 = (class256) null;
        }
        field3805 = null;
        field3812 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lna;I)Lna;")
    public abstract class22 method766(class22 arg0, int arg1);
}
