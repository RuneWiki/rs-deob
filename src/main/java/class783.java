import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class783 {

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "Lpa;")
    private class387 field10773 = new class387(256);

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Ld;")
    private class159 field10772;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lwk;")
    private class151 field10768;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "Ljo;")
    public static class351 field10771 = new class351(20, 7);

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "Lke;")
    public static class622 field10774 = new class622(20, -1);

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Lks;")
    public static class460 field10775 = new class460("", 18);

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "F")
    public static float field10777;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field10766;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field10767;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field10769;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field10770;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "Lpc;")
    public static class697 field10778;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "[I")
    public static int[] field10776;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V", line = 3)
    public final void method4288(byte arg0) {
        if (arg0 == -102) {
            this.field10773.method2364(arg0 ^ 0xFFFFFF9B);
            field10766++;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 21)
    public static final void method4289(int arg0) {
        field10767++;
        if (arg0 > -82) {
            field10775 = null;
        }
        if (class543.field7609 != class256.field3599) {
            try {
                class150.method1035(-19253, "tbrefresh", class364.field5270);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V", line = 43)
    public static void method4290(int arg0) {
        field10771 = null;
        if (arg0 > -111) {
            method4290(-78);
        }
        field10774 = null;
        field10775 = null;
        field10776 = null;
        field10778 = null;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V", line = 57)
    public final void method4291(byte arg0) {
        int var2 = -7 / ((1 - arg0) / 57);
        this.field10773.method2366(5, 115);
        field10770++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)Lkt;", line = 69)
    public final class166 method4292(int arg0, byte arg1) {
        field10769++;
        Object var3 = this.field10773.method2373((long) arg0, 103);
        if (var3 != null) {
            return (class166) var3;
        } else if (this.field10772.method1262(arg0, (byte) 50)) {
            class181 var4 = this.field10772.method1263(arg0, (byte) 120);
            if (arg1 >= -57) {
                this.field10772 = null;
            }
            int var5 = var4.field2742 ? 64 : this.field10768.field2137;
            class166 var7;
            if (var4.field2750 && this.field10768.method448()) {
                float[] var6 = this.field10772.method1260(arg0, 0.7F, var5, false, (byte) -25, var5);
                var7 = this.field10768.method1159(var6, var5, var5, class12.field247, -91, var4.field2758 != 0);
            } else {
                int[] var8;
                if (var4.field2751 != 2 && class176.method1325((byte) 81, var4.field2745)) {
                    var8 = this.field10772.method1261(arg0, var5, -13756, true, 0.7F, var5);
                } else {
                    var8 = this.field10772.method1259(arg0, var5, 30767, 0.7F, false, var5);
                }
                var7 = this.field10768.method1058(var4.field2758 != 0, var8, var5, (byte) -24, var5);
            }
            var7.method42(var4.field2755, (byte) -117, var4.field2752);
            this.field10773.method2362(var7, 0, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lwk;Ld;)V", line = 123)
    public class783(class151 arg0, class159 arg1) {
        this.field10772 = arg1;
        this.field10768 = arg0;
    }
}
