import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class462 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Leh;")
    public class243 field6606 = null;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Leh;")
    public class243 field6609 = null;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[Lml;")
    public class265[] field6612 = null;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "[Lml;")
    public class265[] field6615 = null;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Leh;")
    public class243 field6608 = null;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Z")
    public boolean field6613;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field6605 = 0;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field6611 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lap;")
    public static class335 field6603 = new class335("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 7)
    public static final String method2722(boolean arg0) {
        field6604++;
        String var1 = "www";
        if (!arg0) {
            field6611 = 37;
        }
        if (class68.field884 == class218.field2784) {
            var1 = "www-wtrc";
        } else if (class218.field2784 == class115.field1545) {
            var1 = "www-wtqa";
        } else if (class45.field533 == class218.field2784) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class301.field3873 != null) {
            var2 = "/p=" + class301.field3873;
        }
        return "http://" + var1 + "." + class530.field7803.field2102 + ".com/l=" + class11.field177 + "/a=" + class18.field276 + var2 + "/";
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lug;)V", line = 109)
    public class462(class395 arg0) {
        this.field6613 = arg0.field5585;
        class49.method498(100, arg0);
        if (this.field6613) {
            byte[] var2 = class406.method2402(false, false, class519.field7503);
            this.field6609 = new class243(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class406.method2402(false, false, class119.field1616);
            this.field6606 = new class243(arg0, 6410, 128, 128, 16, var3, 6410);
            class402 var4 = arg0.field5501;
            if (var4.method2380(false)) {
                byte[] var5 = class406.method2402(false, false, class304.field3895);
                this.field6608 = new class243(arg0, 6408, 128, 128, 16);
                class243 var6 = new class243(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method2379(var6, 16208, this.field6608, 2.0F)) {
                    this.field6608.method859((byte) 49);
                } else {
                    this.field6608.method860((byte) 125);
                    this.field6608 = null;
                }
                var6.method860((byte) 75);
                return;
            }
        } else {
            this.field6612 = new class265[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class40.method381(var7 * 16384 * 2, 32768, class519.field7503, 97);
                this.field6612[var7] = new class265(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field6615 = new class265[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class40.method381(var8 * 32768, 32768, class119.field1616, 108);
                this.field6615[var8] = new class265(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZILfh;)Ljava/lang/String;", line = 44)
    public static final String method2723(boolean arg0, int arg1, class463 arg2) {
        field6607++;
        try {
            int var3 = arg2.method2763(-514944944);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field6631 += class49.field643.method1014(arg2.field6631, var3, arg2.field6618, 0, (byte) -86, var4);
            return arg0 ? class155.method1011(var3, 0, var4, 9716) : null;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 77)
    public static void method2724(int arg0) {
        if (arg0 == 0) {
            field6603 = null;
        }
    }
}
