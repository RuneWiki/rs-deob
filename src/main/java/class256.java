import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class256 {

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field3797 = 0;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Ltl;")
    public static class400 field3794 = new class400(4);

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "Z")
    public static boolean field3798 = false;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Lpo;")
    public static class365 field3796;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Ljava/lang/String;")
    public String field3795;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;)I", line = 4)
    public static final int method1688(int arg0, String arg1) {
        field3790++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != -29818) {
            field3797 = 22;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg1.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(DB)V", line = 31)
    public static final void method1689(double arg0, byte arg1) {
        if (arg1 < 82) {
            return;
        }
        field3792++;
        if (class225.field3264 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class146.field2067[var3] = var4 > 255 ? 255 : var4;
        }
        class225.field3264 = arg0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lre;I)Lod;", line = 58)
    public static final class436 method1690(class446 arg0, int arg1) {
        field3791++;
        class436 var2 = new class436();
        int var3 = 35 % ((41 - arg1) / 54);
        var2.field6171 = arg0.method2631(2530);
        var2.field6172 = class305.method1903(var2.field6171, true);
        return var2;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 74)
    public static void method1691(int arg0) {
        field3794 = null;
        if (arg0 >= -64) {
            method1689(1.2225691183394067D, (byte) -95);
        }
        field3796 = null;
    }
}
