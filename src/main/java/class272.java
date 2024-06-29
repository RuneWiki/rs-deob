import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class272 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "J")
    public long field4393 = 0L;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lpi;")
    public static class201 field4399 = new class201(64);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public int field4398;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Lff;")
    public class4 field4401;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Lff;")
    public class4 field4402;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Ld;")
    public static class59 field4400;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static final void method1897(int arg0) {
        if (class39.field515 == null || class256.field3870 == null) {
            class256.field3870 = new int[256];
            class39.field515 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class39.field515[var1] = (int) (Math.sin(var2) * 4096.0D);
                class256.field3870[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 < 35) {
            field4399 = null;
        }
        field4395++;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static final void method1898(int arg0) {
        class134.field2195 = new class263[class53.field805.method1880(-3333)][];
        field4408++;
        if (arg0 != -27077) {
            field4399 = null;
        }
        class44.field578 = new boolean[class53.field805.method1880(-3333)];
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLdk;II)V")
    public static final void method1899(boolean arg0, class207 arg1, int arg2, int arg3) {
        field4394++;
        if (!arg0) {
            field4399 = null;
        }
        if (arg1.field3741 == arg3 && arg3 != -1) {
            class76 var4 = class232.method1609((byte) -32, arg3);
            int var5 = var4.field1202;
            if (var5 == 1) {
                arg1.field3692 = 1;
                arg1.field3747 = 0;
                arg1.field3713 = 0;
                arg1.field3677 = arg2;
                arg1.field3740 = 0;
                class32.method208(arg1.field3660, arg1.field3747, arg0, class213.field3139 == arg1, arg1.field3753, var4);
            }
            if (var5 == 2) {
                arg1.field3713 = 0;
                return;
            }
        } else if (arg3 == -1 || arg1.field3741 == -1 || class232.method1609((byte) -32, arg3).field1214 >= class232.method1609((byte) -32, arg1.field3741).field1214) {
            arg1.field3695 = arg1.field3710;
            arg1.field3713 = 0;
            arg1.field3677 = arg2;
            arg1.field3741 = arg3;
            arg1.field3747 = 0;
            arg1.field3692 = 1;
            arg1.field3740 = 0;
            if (arg1.field3741 == -1) {
                return;
            }
            class32.method208(arg1.field3660, arg1.field3747, true, class213.field3139 == arg1, arg1.field3753, class232.method1609((byte) -32, arg1.field3741));
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public static void method1900(int arg0) {
        field4400 = null;
        field4399 = null;
        if (arg0 != 256) {
            field4404 = 61;
        }
    }
}
