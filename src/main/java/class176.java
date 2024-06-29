import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class176 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[[I")
    public static int[][] field3173 = new int[104][104];

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Loh;")
    public static class263 field3174 = class253.method1681(-121, " loggt sich ein)3");

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Loh;")
    public static class263 field3171 = class253.method1681(-126, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Loh;")
    public static class263 field3172 = class239.method1600(110, 160);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Z")
    public static boolean field3176 = false;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Loh;")
    public static class263 field3177 = class253.method1681(-127, "blinken2:");

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lji;")
    public static class40 field3178 = new class40();

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Loh;")
    public static class263 field3181 = class253.method1681(-118, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Loh;")
    private static class263 field3183 = class253.method1681(-125, "yellow:");

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Loh;")
    public static class263 field3179 = field3183;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Loh;")
    public static class263 field3184 = field3183;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "[Lw;")
    public static class141[] field3180;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lsi;B)Lld;")
    public static final class77 method1156(class194 arg0, byte arg1) {
        if (arg1 != 17) {
            method1157(-32);
        }
        field3170++;
        return new class77(arg0.method1298((byte) -87), arg0.method1298((byte) -84), arg0.method1298((byte) -97), arg0.method1298((byte) -99), arg0.method1277((byte) -113), arg0.method1277((byte) -108), arg0.method1301(arg1 ^ 0xFFFFDF92));
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1157(int arg0) {
        if (class106.field2016 > class201.field3627) {
            class201.field3627 = (float) ((double) class201.field3627 / 30.0D + (double) class201.field3627);
            if (class106.field2016 < class201.field3627) {
                class201.field3627 = class106.field2016;
            }
            class1.method4((byte) 111);
        } else if (class201.field3627 > class106.field2016) {
            class201.field3627 = (float) ((double) class201.field3627 - (double) class201.field3627 / 30.0D);
            if (class106.field2016 > class201.field3627) {
                class201.field3627 = class106.field2016;
            }
            class1.method4((byte) 118);
        }
        field3175++;
        if (class75.field1554 == arg0 || class182.field3299 == -1) {
            return;
        }
        int var1 = class75.field1554 - class207.field3755;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class207.field3755 += var1;
        int var2 = class182.field3299 - class113.field2115;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class182.field3299 = -1;
            class75.field1554 = -1;
        }
        class113.field2115 -= -var2;
        class1.method4((byte) 115);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1158(boolean arg0) {
        field3172 = null;
        field3173 = null;
        if (arg0) {
            method1156((class194) null, (byte) -57);
        }
        field3171 = null;
        field3183 = null;
        field3177 = null;
        field3174 = null;
        field3181 = null;
        field3184 = null;
        field3180 = null;
        field3179 = null;
        field3178 = null;
    }
}
