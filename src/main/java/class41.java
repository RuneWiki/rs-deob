import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class41 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Ljava/lang/String;")
    public static String field601 = "flash3:";

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
    public static int[] field599 = new int[256];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[[S")
    public static short[][] field598;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 5)
    public static void method265(int arg0) {
        field599 = null;
        field601 = null;
        if (arg0 != -29164) {
            method266((class57) null, -108, 6, (class57) null, -108);
        }
        field598 = (short[][]) null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lth;IILth;I)Ldf;", line = 18)
    public static final class171 method266(class57 arg0, int arg1, int arg2, class57 arg3, int arg4) {
        field600++;
        if (class315.method2233(arg2, (byte) 111, arg3, arg1)) {
            return arg4 == 256 ? class253.method1960(14, arg0.method472(arg2, 84, arg1)) : (class171) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 34)
    public static final void method267(boolean arg0) {
        field597++;
        if (class4.field42 == 5) {
            if (arg0) {
                field599 = (int[]) null;
            }
            class4.field42 = 6;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 50)
    public static final void method268(byte arg0) {
        field596++;
        if (class350.field5551 < 0) {
            class350.field5551 = 0;
            class198.field3162 = -1;
            class2.field7 = -1;
        }
        if (arg0 <= 112) {
            field598 = (short[][]) ((short[][]) null);
        }
        if (class174.field2776 < class350.field5551) {
            class350.field5551 = class174.field2776;
            class198.field3162 = -1;
            class2.field7 = -1;
        }
        if (class208.field3268 < 0) {
            class2.field7 = -1;
            class198.field3162 = -1;
            class208.field3268 = 0;
        }
        if (class208.field3268 > class174.field2780) {
            class208.field3268 = class174.field2780;
            class198.field3162 = -1;
            class2.field7 = -1;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field599[var0] = var1;
        }
    }
}
