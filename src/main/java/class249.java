import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class249 extends class103 {

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public int field4389 = 0;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Lne;")
    public static class137 field4378 = new class137(64);

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "Lda;")
    public static class275 field4400 = class255.method1672(117, "http:)4)4");

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Lda;")
    public static class275 field4399 = class255.method1672(115, "_labels");

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Lda;")
    public static class275 field4403 = class255.method1672(123, "cookiehost");

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "Z")
    public static boolean field4406 = false;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public int field4374;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public int field4386;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public int field4392;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "Lfb;")
    public class109 field4395;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Lob;")
    public static class117 field4405;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lgd;")
    public class165 field4384;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lgi;")
    public class34 field4376;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lng;")
    public class62 field4380;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Lng;")
    public class62 field4396;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Z")
    public boolean field4398;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "[I")
    public int[] field4397;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "[I")
    public static int[] field4401;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lda;I)I")
    public static final int method1629(class275 arg0, int arg1) {
        field4383++;
        if (class215.field3655 == null || arg0.method1838(3) == 0) {
            return -1;
        }
        for (int var2 = arg1; var2 < class215.field3655.field1059; var2++) {
            if (class215.field3655.field1061[var2].method1821(class124.field2213, -107, class118.field2093).method1823(arg0, 87)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public static void method1630(int arg0) {
        if (arg0 != -23806) {
            return;
        }
        field4401 = null;
        field4405 = null;
        field4399 = null;
        field4378 = null;
        field4400 = null;
        field4403 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lda;B)I")
    public static final int method1631(class275 arg0, byte arg1) {
        if (arg1 != -3) {
            method1634(-66, (class109) null);
        }
        field4404++;
        for (int var2 = 0; var2 < class168.field2931.length; var2++) {
            if (class168.field2931[var2].method1844(90, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public final void method1632(byte arg0) {
        field4382++;
        int var2 = this.field4392;
        if (this.field4376 != null) {
            class34 var5 = this.field4376.method203(-125);
            if (var5 == null) {
                this.field4397 = null;
                this.field4394 = 0;
                this.field4392 = -1;
                this.field4387 = 0;
                this.field4386 = 0;
            } else {
                this.field4387 = var5.field518 * 128;
                this.field4394 = var5.field498;
                this.field4397 = var5.field519;
                this.field4392 = var5.field513;
                this.field4386 = var5.field515;
            }
        } else if (this.field4384 != null) {
            int var3 = class133.method977(this.field4384, -1);
            if (var2 != var3) {
                class23 var4 = this.field4384.field2873;
                this.field4392 = var3;
                if (var4.field406 != null) {
                    var4 = var4.method140(1);
                }
                if (var4 == null) {
                    this.field4387 = 0;
                } else {
                    this.field4387 = var4.field378 * 128;
                }
            }
        } else if (this.field4395 != null) {
            this.field4392 = class256.method1676((byte) -57, this.field4395);
            this.field4387 = this.field4395.field1896 * 128;
        }
        if (this.field4392 != var2 && this.field4380 != null) {
            class258.field4522.method1426(this.field4380);
            this.field4380 = null;
        }
        if (arg0 != -113) {
            method1631((class275) null, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIBI)V")
    public static final void method1633(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class246.field4355 <= (arg2 - arg4) && (arg2 + arg4) <= class96.field1632 && arg1 - arg4 >= class149.field2603 && (arg1 + arg4) <= class141.field2493) {
            class125.method902(arg1, arg0, -121, arg4, arg2);
        } else {
            class46.method272(0, arg4, arg0, arg2, arg1);
        }
        field4375++;
        if (arg3 != 77) {
            field4402 = -37;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILfb;)V")
    public static final void method1634(int arg0, class109 arg1) {
        field4379++;
        class249 var2 = (class249) class35.field566.method1871(0, arg1.field1910.method1833(0));
        if (arg0 != -1) {
            field4400 = null;
        }
        if (var2 == null) {
            return;
        }
        if (var2.field4380 != null) {
            class258.field4522.method1426(var2.field4380);
            var2.field4380 = null;
        }
        var2.method741(3);
    }
}
