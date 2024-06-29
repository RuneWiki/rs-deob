import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class113 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
    public static int[] field1823 = new int[14];

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1828 = 0;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lgd;")
    public static class325 field1822 = new class325(100);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[Lwf;")
    public static class64[] field1829 = new class64[14];

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1831 = "wishes to trade with you.";

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
    public static int[] field1830 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[I")
    public static int[] field1832 = new int[128];

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 27)
    public static final void method876(int arg0) {
        field1827++;
        if (class243.field3645 != null) {
            class274 var1 = class243.field3645;
            synchronized (class243.field3645) {
                class243.field3645 = null;
            }
        }
        if (arg0 != 0) {
            method878(-48, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 52)
    public static void method877(int arg0) {
        field1829 = null;
        field1832 = null;
        field1830 = null;
        field1823 = null;
        field1822 = null;
        field1831 = null;
        if (arg0 > -98) {
            field1822 = (class325) null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Lfb;", line = 110)
    public static final class65 method878(int arg0, byte arg1) {
        class65 var2 = (class65) class313.field4923.method2288((long) arg0, (byte) 109);
        field1826++;
        if (arg1 > -41) {
            method878(20, (byte) 38);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field593.method967(34, arg0, 65280);
        class65 var4 = new class65();
        if (var3 != null) {
            var4.method517(new class1(var3), arg0, 97);
        }
        class313.field4923.method2281(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(DB)V", line = 136)
    public static final void method879(double arg0, byte arg1) {
        field1824++;
        if (class313.field4928 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class34.field522[var3] = var4 <= 255 ? var4 : 255;
            }
            class313.field4928 = arg0;
        }
        if (arg1 < 54) {
            method877(19);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lpk;I)V", line = 208)
    public static final void method880(class120 arg0, int arg1) {
        field1825++;
        class83.field1294 = arg0;
        if (arg1 != 34) {
            method879(0.2601129415038596D, (byte) 68);
        }
    }
}
