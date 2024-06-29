import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class214 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lkh;")
    public static class117 field3882 = class224.method1450((byte) -120, " <col=ffffff>");

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lkh;")
    public static class117 field3888 = class224.method1450((byte) 117, "(U1");

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lkh;")
    private static class117 field3887 = class224.method1450((byte) 107, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lkh;")
    public static class117 field3886 = field3887;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Lkh;")
    public static class117 field3893 = class224.method1450((byte) 118, "loc)3dat");

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lff;")
    public static class62 field3890;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[Lr;")
    public static class186[] field3885;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field3882 = null;
        field3890 = null;
        field3885 = null;
        field3887 = null;
        field3886 = null;
        if (arg0 != 18107) {
            field3893 = null;
        }
        field3888 = null;
        field3893 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
    public static final void method1405(int arg0, byte arg1) {
        field3884++;
        int var2 = -17 % ((-arg1 - 22) / 37);
        if (arg0 == 37) {
            class9.field152 = 3.0D;
        } else if (arg0 == 50) {
            class9.field152 = 4.0D;
        } else if (arg0 == 75) {
            class9.field152 = 6.0D;
        } else {
            class9.field152 = 8.0D;
        }
        class211.field3837 = -1;
        class211.field3837 = -1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lbh;")
    public static final class20 method1406(int arg0, int arg1) {
        class20 var2 = (class20) class225.field4052.method506(arg0, (long) arg1);
        field3889++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class222.field4002.method104(-91, class145.method989(arg1, -481997400), class1.method1(arg0 ^ 0xFE, arg1));
        class20 var4 = new class20();
        var4.field562 = arg1;
        if (var3 != null) {
            var4.method176(new class145(var3), 0);
        }
        class225.field4052.method497((long) arg1, var4, -96);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
    public static final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class139.field2530; var5++) {
            if (arg4 < class7.field114[var5] + class1.field7[var5] && arg3 + arg4 > class7.field114[var5] && class36.field843[var5] + class100.field1834[var5] > arg1 && class36.field843[var5] < arg0 + arg1) {
                class173.field3126[var5] = true;
            }
        }
        if (arg2 != 18320) {
            method1407(100, -15, 16, 19, -83);
        }
        field3895++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)Loa;")
    public static final class154 method1408(byte arg0, int arg1) {
        field3892++;
        class154 var2 = (class154) class177.field3192.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class186.field3343.method104(-113, class145.method1031(arg1, 258514920), class1.method4(arg1, arg0 ^ 0x70));
        class154 var4 = new class154();
        var4.field2800 = arg1;
        if (var3 != null) {
            var4.method1100(92, new class145(var3));
        }
        var4.method1094(arg0 ^ 0x1A);
        if (var4.field2822 != -1) {
            var4.method1095(109, method1408((byte) 102, var4.field2818), method1408((byte) 102, var4.field2822));
        }
        if (var4.field2767 != -1) {
            var4.method1090(method1408((byte) 102, var4.field2791), method1408((byte) 102, var4.field2767), (byte) -44);
        }
        if (!class244.field4499 && var4.field2793) {
            var4.field2772 = false;
            var4.field2761 = null;
            var4.field2812 = class207.field3714;
            var4.field2757 = 0;
            var4.field2775 = null;
        }
        if (arg0 == 102) {
            class177.field3192.method497((long) arg1, var4, -122);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lai;Lkh;Lkh;I)Lch;")
    public static final class31 method1409(class10 arg0, class117 arg1, class117 arg2, int arg3) {
        field3894++;
        int var4 = arg0.method84(arg2, 1491);
        int var5 = 75 % ((arg3 + 24) / 49);
        int var6 = arg0.method102(false, arg1, var4);
        return class207.method1362(var6, arg0, var4, (byte) 127);
    }
}
