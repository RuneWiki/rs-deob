import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Z")
    public static boolean field63 = true;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lhj;")
    public static class69 field62 = class181.method1318("Speicher wird zugewiesen)3", (byte) -118);

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Led;")
    public class177 field64;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[I")
    public static int[] field72;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method41(byte arg0) {
        if (arg0 == 17) {
            field62 = null;
            field72 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[Lhj;)Lhj;")
    public static final class69 method42(int arg0, class69[] arg1) {
        int var2 = 30 % ((arg0 + 14) / 59);
        field69++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class212.method1529(0, false, arg1.length, arg1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZB)V")
    public static final void method43(boolean arg0, byte arg1) {
        field70++;
        class17.method105(-120);
        if (class268.field4760 != 30 && class268.field4760 != 25) {
            return;
        }
        class64.field1245++;
        if (class64.field1245 < 50 && !arg0) {
            return;
        }
        if (arg1 != -127) {
            method41((byte) 67);
        }
        class64.field1245 = 0;
        if (!class104.field1973 && class135.field2532 != null) {
            class48.field692.method301(199, arg1 ^ 0x19);
            try {
                class135.field2532.method1267(class48.field692.field2385, (byte) 6, 0, class48.field692.field2379);
                class48.field692.field2379 = 0;
            } catch (IOException var2) {
                class104.field1973 = true;
            }
            class55.field986++;
        }
        class17.method105(-103);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIBII)V")
    public static final void method44(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var7 = -117 / ((15 - arg4) / 51);
        if (class201.field3629 <= arg6 - arg2 && (arg2 + arg6) <= class35.field485 && (arg1 - arg2) >= class19.field252 && (arg1 + arg2) <= class166.field3075) {
            class223.method1582(arg6, arg2, -119, arg5, arg0, arg3, arg1);
        } else {
            class156.method1182(arg1, 25738, arg2, arg5, arg0, arg6, arg3);
        }
        field67++;
    }
}
