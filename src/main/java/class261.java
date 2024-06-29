import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class261 {

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "[Lsg;")
    public class262[] field3959 = null;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Lga;")
    public class266 field3958 = null;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "[Lsg;")
    public class262[] field3957 = null;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "Lga;")
    public class266 field3961 = null;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "Lga;")
    public class266 field3962 = null;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Z")
    public boolean field3952;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "[I")
    public static int[] field3956 = new int[1];

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field3960 = 0;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "B")
    public static byte field3964;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field3954;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
    public static final void method1585(boolean arg0) {
        field3965++;
        class333 var1 = null;
        try {
            class180 var2 = class7.field86.method1568((byte) 72, "2");
            while (var2.field2802 == 0) {
                class414.method2437(1L, (byte) -122);
            }
            if (var2.field2802 == 1) {
                var1 = (class333) var2.field2803;
                byte[] var3 = new byte[(int) var1.method2069((byte) -100)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2065(var3, var4, var3.length - var4, -1);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class458.method2719(new class40(var3), (byte) 75);
            }
            if (!arg0) {
                method1587(-37);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2066(0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)V")
    public static final void method1586(boolean arg0) {
        class418.field6026.method1749((byte) 123);
        field3953++;
        class336.field5043.method1749((byte) -19);
        class189.field3019.method1749((byte) -28);
        class501.field7588.method1749((byte) -108);
        class201.field3189.method1749((byte) 126);
        if (!arg0) {
            field3960 = 30;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field3954 = null;
        field3956 = null;
        if (arg0 < 97) {
            method1587(49);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BIII)I")
    public static final int method1588(byte arg0, int arg1, int arg2, int arg3) {
        field3955++;
        int var4 = 102 / ((-arg0 - 50) / 47);
        int var5 = arg2 & 0x3;
        if (var5 == 0) {
            return arg3;
        } else if (var5 == 1) {
            return arg1;
        } else if (var5 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lbl;)V")
    public class261(class442 arg0) {
        this.field3952 = arg0.field6809;
        class168.method1057(29490, arg0);
        if (this.field3952) {
            byte[] var6 = class316.method1883(false, field3954, (byte) -82);
            this.field3962 = new class266(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class316.method1883(false, class16.field229, (byte) -82);
            this.field3958 = new class266(arg0, 6410, 128, 128, 16, var7, 6410);
            class153 var8 = arg0.field6687;
            if (var8.method984(5888)) {
                byte[] var9 = class316.method1883(false, class329.field4934, (byte) -82);
                this.field3961 = new class266(arg0, 6408, 128, 128, 16);
                class266 var10 = new class266(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method981(this.field3961, (byte) -108, var10, 2.0F)) {
                    this.field3961.method1205((byte) 80);
                } else {
                    this.field3961.method1214(-64);
                    this.field3961 = null;
                }
                var10.method1214(85);
            }
        } else {
            this.field3957 = new class262[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class38.method209(-69, var2 * 128 * 2 * 128, 32768, field3954);
                this.field3957[var2] = new class262(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field3959 = new class262[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class38.method209(5, var3 * 128 * 128 * 2, 32768, class16.field229);
                this.field3959[var3] = new class262(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
