import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class458 {

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "Z")
    public static boolean field6260 = true;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Lhl;")
    public static class353 field6261 = new class353(6, 1);

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "Lin;")
    public static class380 field6264 = new class380(3, 6);

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field6265 = 0;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Lin;")
    public static class380 field6266 = new class380(70, 17);

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field6267 = 0;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BZI)V")
    public static final void method2678(byte arg0, boolean arg1, int arg2) {
        field6257++;
        class393 var3 = class275.method1745(arg1, (byte) -110, arg2);
        if (var3 != null) {
            var3.method4237(arg0 ^ 0xFFFFFFE4);
            if (arg0 != 27) {
                method2680(4, -123, -110, null);
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public static void method2679(byte arg0) {
        if (arg0 < 41) {
            method2679((byte) -18);
        }
        field6261 = null;
        field6264 = null;
        field6266 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILuf;)V")
    public static final void method2680(int arg0, int arg1, int arg2, class519 arg3) {
        if (arg1 != 27797) {
            field6264 = null;
        }
        if (arg3.field7184 == 0) {
            arg3.field7191 = arg3.field7283;
        } else if (arg3.field7184 == 1) {
            arg3.field7191 = (arg0 - arg3.field7128) / 2 + arg3.field7283;
        } else if (arg3.field7184 == 2) {
            arg3.field7191 = arg0 - arg3.field7128 - arg3.field7283;
        } else if (arg3.field7184 == 3) {
            arg3.field7191 = arg3.field7283 * arg0 >> 14;
        } else if (arg3.field7184 == 4) {
            arg3.field7191 = (arg3.field7283 * arg0 >> 14) + (arg0 - arg3.field7128) / 2;
        } else {
            arg3.field7191 = arg0 - arg3.field7128 - (arg3.field7283 * arg0 >> 14);
        }
        field6262++;
        if (arg3.field7256 == 0) {
            arg3.field7151 = arg3.field7124;
        } else if (arg3.field7256 == 1) {
            arg3.field7151 = (arg2 - arg3.field7255) / 2 + arg3.field7124;
        } else if (arg3.field7256 == 2) {
            arg3.field7151 = arg2 - arg3.field7255 - arg3.field7124;
        } else if (arg3.field7256 == 3) {
            arg3.field7151 = arg3.field7124 * arg2 >> 14;
        } else if (arg3.field7256 == 4) {
            arg3.field7151 = (arg2 - arg3.field7255) / 2 + (arg3.field7124 * arg2 >> 14);
        } else {
            arg3.field7151 = arg2 - (arg3.field7124 * arg2 >> 14) - arg3.field7255;
        }
        if (!class346.field4929) {
            return;
        }
        if (client.method885(arg3).field2564 == 0 && arg3.field7190 != 0) {
            return;
        }
        if (arg3.field7151 < 0) {
            arg3.field7151 = 0;
        } else if (arg2 < (arg3.field7255 + arg3.field7151)) {
            arg3.field7151 = arg2 - arg3.field7255;
        }
        if (arg3.field7191 < 0) {
            arg3.field7191 = 0;
            return;
        }
        if (arg3.field7191 + arg3.field7128 > arg0) {
            arg3.field7191 = arg0 - arg3.field7128;
            return;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static final void method2681(int arg0) {
        class770.field10633 = null;
        class728.field10154 = null;
        class133.field2226 = -1;
        class193.field2894 = null;
        class388.field5420 = arg0;
        class100.field1484 = -1;
        class29.field313 = null;
        class775.field10665 = null;
        class390.field5440 = null;
        class163.field2508 = -1;
        field6259++;
        class276.field3994 = null;
        class576.field8303.method4018((byte) 116);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2682(int arg0, String arg1) {
        if (arg0 != -1) {
            field6267 = 108;
        }
        field6258++;
        if (class247.field3556.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class247.field3556.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class247.field3556.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            return null;
        }
    }
}
