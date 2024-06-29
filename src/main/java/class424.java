import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class424 {

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "Z")
    public static boolean field5502 = false;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field5505 = -1;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field5503 = 0;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "J")
    public long field5499;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "Lfaa;")
    public class424 field5497;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "Lfaa;")
    public class424 field5500;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V", line = 8)
    public final void method2438(byte arg0) {
        field5506++;
        if (this.field5497 == null) {
            return;
        }
        this.field5497.field5500 = this.field5500;
        int var2 = 63 % ((60 - arg0) / 47);
        this.field5500.field5497 = this.field5497;
        this.field5497 = null;
        this.field5500 = null;
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)V", line = 27)
    public static final void method2439(int arg0) {
        if (class266.field3566 != null) {
            class266.field3566.method1796((byte) 77);
        }
        field5504++;
        if (class445.field5731 != null) {
            class445.field5731.method1796((byte) 77);
        }
        if (arg0 != 26) {
            method2439(31);
        }
    }

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)Z", line = 44)
    public final boolean method2440(int arg0) {
        field5507++;
        if (this.field5497 == null) {
            return false;
        } else {
            if (arg0 <= 11) {
                this.field5499 = 99L;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(FFIFFIIIFLjr;I)[B", line = 63)
    public static final byte[] method2441(float arg0, float arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7, float arg8, class288 arg9, int arg10) {
        field5498++;
        if (arg2 != 8) {
            field5505 = 81;
        }
        byte[] var11 = new byte[arg6 * arg10 * arg7];
        class344.method1983(arg6, arg4, arg1, arg5, arg7, arg2 - 36, 0, arg9, arg3, var11, arg10, arg0, arg8);
        return var11;
    }

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "(I)V", line = 77)
    public static final void method2442(int arg0) {
        field5508++;
        if (arg0 != 22050) {
            field5503 = 61;
        }
        class491.field6509.method41(arg0 ^ 0x561C);
        class357.field4620.method896(13);
        class457.field5988.method896(13);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(BII)V", line = 91)
    public static final void method2443(byte arg0, int arg1, int arg2) {
        field5501++;
        int var3 = class411.field5305.method2900(true, class604.field8148.method3280((byte) 86, class144.field1890));
        for (class57 var4 = (class57) class658.field9176.method2090(true); var4 != null; var4 = (class57) class658.field9176.method2088(-152)) {
            int var8 = class484.method2668(82, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        if (arg0 != 102) {
            method2443((byte) -13, -1, -122);
        }
        var3 += 8;
        int var5 = class291.field3758 * 16 + 21;
        int var6 = arg2 - (var3 / 2);
        if (class519.field6796 < var3 + var6) {
            var6 = class519.field6796 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > class461.field6047) {
            var7 = class461.field6047 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class399.field5100 = var6;
        class630.field8791 = var7;
        class594.field8025 = true;
        class539.field7003 = class291.field3758 * 16 + (class288.field3723 ? 26 : 22);
        class238.field3206 = var3;
    }

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "(I)V", line = 147)
    public static final void method2444(int arg0) {
        int var1 = -79 % ((arg0 + 10) / 57);
        field5496++;
        class452.method2552(class260.field3509.field1294, 22050, (byte) 125, 2);
        class2.field13 = new class552();
        class2.field13.method2961((byte) -90, 128, 9);
        class266.field3566 = class553.method2966(class524.field6827, class688.field9413, 22050, 0, -21435);
        class266.field3566.method1783((byte) 6, class2.field13);
        class379.method2166(class363.field4688, class680.field9375, true, class2.field13, class63.field864);
        class445.field5731 = class553.method2966(class524.field6827, class688.field9413, 2048, 1, -21435);
        class690.field9426 = new class393();
        class445.field5731.method1783((byte) 6, class690.field9426);
        class648.field9026 = new class569(22050, class66.field901);
        class413.field5317 = class6.field53.method3359("scape main", (byte) -125);
    }
}
