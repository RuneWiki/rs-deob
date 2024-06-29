import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class216 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Leo;")
    public static class321 field3059 = new class321(true);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lwu;")
    public static class557 field3065;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field3067;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3066;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lwu;BI)Loq;", line = 7)
    public static final class742 method1415(class557 arg0, byte arg1, int arg2) {
        field3061++;
        if (arg1 <= 67) {
            method1418((byte) 8, null);
        }
        byte[] var3 = arg0.method3318(8941, arg2);
        return var3 == null ? null : new class742(var3);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 23)
    public static void method1416(int arg0) {
        field3059 = null;
        int var1 = 46 % ((arg0 - 16) / 51);
        field3066 = null;
        field3065 = null;
        field3067 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 39)
    public static final void method1417(String arg0, byte arg1, int arg2) {
        field3058++;
        class441.method2638("", 0, (byte) 17, "", arg0, "", arg2);
        int var3 = 95 / ((71 - arg1) / 43);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLmr;)[Lln;", line = 53)
    public static final class473[] method1418(byte arg0, class613 arg1) {
        field3064++;
        if (!arg1.method3578(false)) {
            return new class473[0];
        }
        class436 var2 = arg1.method3593(-80);
        while (var2.field5975 == 0) {
            class740.method4124(10L, 60);
        }
        if (var2.field5975 == 2) {
            return new class473[0];
        }
        int[] var3 = (int[]) var2.field5973;
        class473[] var4 = new class473[var3.length >> 2];
        int var5 = 0;
        int var6 = -27 % ((-arg0 - 3) / 63);
        while (var4.length > var5) {
            class473 var7 = new class473();
            var4[var5] = var7;
            var7.field6481 = var3[var5 << 2];
            var7.field6477 = var3[(var5 << 2) + 1];
            var7.field6480 = var3[(var5 << 2) + 2];
            var7.field6482 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(III)V", line = 99)
    public class216(int arg0, int arg1, int arg2) {
        this.field3060 = arg2;
        this.field3062 = arg1;
        this.field3063 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
    public abstract void method327(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public abstract void method330(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
    public abstract void method328(boolean arg0, int arg1, int arg2);
}
