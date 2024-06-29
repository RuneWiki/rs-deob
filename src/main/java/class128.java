import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class128 extends class401 {

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "[B")
    public byte[] field1830;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1828 = new CRC32();

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1835 = 328;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Z")
    public static boolean field1833 = false;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI[BLlj;IBII)Lnea;")
    public static final class665 method910(boolean arg0, int arg1, byte[] arg2, class565 arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 <= 112) {
            method911(-78, -126, null);
        }
        field1836++;
        if (!arg3.field7870 && (!class588.method3342(-104, arg1) || !class588.method3342(-112, arg6))) {
            return arg3.field7973 ? new class665(arg3, 34037, arg4, arg1, arg6, arg0, arg2, arg7) : new class665(arg3, arg4, arg1, arg6, class206.method1334(-1, arg1), class206.method1334(-1, arg6), arg2, arg7);
        } else {
            return new class665(arg3, 3553, arg4, arg1, arg6, arg0, arg2, arg7);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II[B)I")
    public static final int method911(int arg0, int arg1, byte[] arg2) {
        if (arg0 > -67) {
            field1828 = null;
        }
        field1834++;
        return class89.method651(0, 93, arg1, arg2);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public static void method912(int arg0) {
        field1828 = null;
        if (arg0 != 0) {
            method911(43, 63, null);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLac;)Lsu;")
    public static final class193 method913(boolean arg0, class501 arg1) {
        field1829++;
        if (arg0) {
            field1833 = false;
        }
        return new class193(arg1.method2875(false), arg1.method2875(false), arg1.method2875(false), arg1.method2875(false), arg1.method2875(arg0), arg1.method2875(false), arg1.method2875(arg0), arg1.method2875(arg0), arg1.method2819((byte) 72), arg1.method2874((byte) -75));
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILin;II)V")
    public static final void method914(int arg0, class78 arg1, int arg2, int arg3) {
        field1832++;
        if (arg1 == null) {
            return;
        }
        if (arg1.field1062 != null) {
            class368 var4 = new class368();
            var4.field4962 = arg1.field1062;
            var4.field4957 = arg1;
            class97.method708(var4);
        }
        class112.field1563 = arg1.field1067;
        class698.field9905 = arg0;
        class544.field7389 = arg1.field1034;
        class426.field5971 = true;
        class340.field4555 = arg1.field1129;
        class89.field1283 = arg2;
        class301.field4099 = arg1.field1145;
        class547.field7417 = arg1.field1157;
        class26.method255(arg1, -20229);
        int var5 = 45 / ((arg3 + 39) / 47);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "([B)V")
    public class128(byte[] arg0) {
        this.field1830 = arg0;
    }
}
